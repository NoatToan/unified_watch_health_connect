package w63;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw63/v;", "Lw63/u;", "<init>", "()V", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class v extends u {
    public static Long x(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long lValueOf = Long.valueOf(millis);
        if (millis != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // w63.u, w63.l
    public final void c(y yVar, y yVar2) throws IOException {
        yVar.getClass();
        yVar2.getClass();
        try {
            Path path = Paths.get(yVar.f183410a.s(), new String[0]);
            path.getClass();
            Path path2 = Paths.get(yVar2.f183410a.s(), new String[0]);
            path2.getClass();
            Files.move(path, path2, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            vb.h.C("atomic move not supported");
        } catch (NoSuchFileException e4) {
            throw new FileNotFoundException(e4.getMessage());
        }
    }

    @Override // w63.u, w63.l
    public final k p(y yVar) {
        y yVarA;
        yVar.getClass();
        Path path = Paths.get(yVar.f183410a.s(), new String[0]);
        path.getClass();
        try {
            BasicFileAttributes attributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(path) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            if (symbolicLink != null) {
                y.f183408b.getClass();
                yVarA = y.a.a(symbolicLink.toString());
            } else {
                yVarA = null;
            }
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lX = fileTimeCreationTime != null ? x(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lX2 = fileTimeLastModifiedTime != null ? x(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new k(zIsRegularFile, zIsDirectory, yVarA, lValueOf, lX, lX2, fileTimeLastAccessTime != null ? x(fileTimeLastAccessTime) : null, null, 128, null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // w63.u
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
