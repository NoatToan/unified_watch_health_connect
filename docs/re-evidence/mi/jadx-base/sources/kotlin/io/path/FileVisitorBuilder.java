package kotlin.io.path;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin(version = "2.1")
@WasExperimental(markerClass = {ExperimentalPathApi.class})
public interface FileVisitorBuilder {
    void onPostVisitDirectory(@NotNull Function2<? super Path, ? super IOException, ? extends FileVisitResult> function2);

    void onPreVisitDirectory(@NotNull Function2<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> function2);

    void onVisitFile(@NotNull Function2<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> function2);

    void onVisitFileFailed(@NotNull Function2<? super Path, ? super IOException, ? extends FileVisitResult> function2);
}
