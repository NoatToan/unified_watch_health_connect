package org.apache.commons.io.file;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class CountingPathVisitor extends SimplePathVisitor {
    static final String[] EMPTY_STRING_ARRAY = new String[0];
    private final Counters.PathCounters pathCounters;

    public CountingPathVisitor(Counters.PathCounters pathCounters) {
        Objects.requireNonNull(pathCounters, "pathCounter");
        this.pathCounters = pathCounters;
    }

    public static CountingPathVisitor withBigIntegerCounters() {
        return new CountingPathVisitor(Counters.bigIntegerPathCounters());
    }

    public static CountingPathVisitor withLongCounters() {
        return new CountingPathVisitor(Counters.longPathCounters());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CountingPathVisitor) {
            return Objects.equals(this.pathCounters, ((CountingPathVisitor) obj).pathCounters);
        }
        return false;
    }

    public Counters.PathCounters getPathCounters() {
        return this.pathCounters;
    }

    public int hashCode() {
        return Objects.hash(this.pathCounters);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public FileVisitResult postVisitDirectory(Path path, IOException iOException) {
        this.pathCounters.getDirectoryCounter().increment();
        return FileVisitResult.CONTINUE;
    }

    public String toString() {
        return this.pathCounters.toString();
    }

    public void updateFileCounters(Path path, BasicFileAttributes basicFileAttributes) {
        this.pathCounters.getFileCounter().increment();
        this.pathCounters.getByteCounter().add(basicFileAttributes.size());
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) {
        if (Files.exists(path, new LinkOption[0])) {
            updateFileCounters(path, basicFileAttributes);
        }
        return FileVisitResult.CONTINUE;
    }
}
