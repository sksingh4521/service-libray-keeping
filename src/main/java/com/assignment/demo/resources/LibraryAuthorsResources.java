package com.assignment.demo.resources;

import com.assignment.demo.model.entity.Author;
import com.assignment.demo.service.LibraryAuthorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.assignment.demo.resources.UrlConstants.URI;

@RestController
@RequestMapping(URI)
public class LibraryAuthorsResources {

    private LibraryAuthorService libraryAuthorService;


    public LibraryAuthorsResources(LibraryAuthorService libraryAuthorService) {
        this.libraryAuthorService = libraryAuthorService;
    }

    @PostMapping()
    public ResponseEntity<Author> createAuthor(@RequestBody Author author) {
        return ResponseEntity.ok(libraryAuthorService.create(author));


    }

    @PutMapping()
    public ResponseEntity<Author> update(@RequestBody Author author) {
        return ResponseEntity.ok(libraryAuthorService.update(author));

    }


    @GetMapping()
    public ResponseEntity<List<Author>> list() {
        return ResponseEntity.ok(libraryAuthorService.list());


    }

    @DeleteMapping()
    public ResponseEntity<String> deleteEmployee(@PathVariable String authorName) {
        return ResponseEntity.ok("Deleted Successfully");
    }

}

