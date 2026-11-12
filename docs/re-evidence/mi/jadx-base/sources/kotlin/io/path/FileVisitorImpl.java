package kotlin.io.path;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class FileVisitorImpl extends SimpleFileVisitor<Path> {

    @Nullable
    private final Function2<Path, IOException, FileVisitResult> onPostVisitDirectory;

    @Nullable
    private final Function2<Path, BasicFileAttributes, FileVisitResult> onPreVisitDirectory;

    @Nullable
    private final Function2<Path, BasicFileAttributes, FileVisitResult> onVisitFile;

    @Nullable
    private final Function2<Path, IOException, FileVisitResult> onVisitFileFailed;

    /* JADX WARN: Multi-variable type inference failed */
    public FileVisitorImpl(@Nullable Function2<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> function2, @Nullable Function2<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> function3, @Nullable Function2<? super Path, ? super IOException, ? extends FileVisitResult> function4, @Nullable Function2<? super Path, ? super IOException, ? extends FileVisitResult> function5) {
        this.onPreVisitDirectory = function2;
        this.onVisitFile = function3;
        this.onVisitFileFailed = function4;
        this.onPostVisitDirectory = function5;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @NotNull
    public FileVisitResult postVisitDirectory(@NotNull Path dir, @Nullable IOException iOException) throws IOException {
        FileVisitResult fileVisitResultInvoke;
        Intrinsics.checkNotNullParameter(dir, "dir");
        Function2<Path, IOException, FileVisitResult> function2 = this.onPostVisitDirectory;
        if (function2 != null && (fileVisitResultInvoke = function2.invoke(dir, iOException)) != null) {
            return fileVisitResultInvoke;
        }
        FileVisitResult fileVisitResultPostVisitDirectory = super.postVisitDirectory(dir, iOException);
        Intrinsics.checkNotNullExpressionValue(fileVisitResultPostVisitDirectory, "postVisitDirectory(...)");
        return fileVisitResultPostVisitDirectory;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @NotNull
    public FileVisitResult preVisitDirectory(@NotNull Path dir, @NotNull BasicFileAttributes attrs) throws IOException {
        FileVisitResult fileVisitResultInvoke;
        Intrinsics.checkNotNullParameter(dir, "dir");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Function2<Path, BasicFileAttributes, FileVisitResult> function2 = this.onPreVisitDirectory;
        if (function2 != null && (fileVisitResultInvoke = function2.invoke(dir, attrs)) != null) {
            return fileVisitResultInvoke;
        }
        FileVisitResult fileVisitResultPreVisitDirectory = super.preVisitDirectory(dir, attrs);
        Intrinsics.checkNotNullExpressionValue(fileVisitResultPreVisitDirectory, "preVisitDirectory(...)");
        return fileVisitResultPreVisitDirectory;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @NotNull
    public FileVisitResult visitFile(@NotNull Path file, @NotNull BasicFileAttributes attrs) throws IOException {
        FileVisitResult fileVisitResultInvoke;
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Function2<Path, BasicFileAttributes, FileVisitResult> function2 = this.onVisitFile;
        if (function2 != null && (fileVisitResultInvoke = function2.invoke(file, attrs)) != null) {
            return fileVisitResultInvoke;
        }
        FileVisitResult fileVisitResultVisitFile = super.visitFile(file, attrs);
        Intrinsics.checkNotNullExpressionValue(fileVisitResultVisitFile, "visitFile(...)");
        return fileVisitResultVisitFile;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @NotNull
    public FileVisitResult visitFileFailed(@NotNull Path file, @NotNull IOException exc) throws IOException {
        FileVisitResult fileVisitResultInvoke;
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(exc, "exc");
        Function2<Path, IOException, FileVisitResult> function2 = this.onVisitFileFailed;
        if (function2 != null && (fileVisitResultInvoke = function2.invoke(file, exc)) != null) {
            return fileVisitResultInvoke;
        }
        FileVisitResult fileVisitResultVisitFileFailed = super.visitFileFailed(file, exc);
        Intrinsics.checkNotNullExpressionValue(fileVisitResultVisitFileFailed, "visitFileFailed(...)");
        return fileVisitResultVisitFileFailed;
    }
}
