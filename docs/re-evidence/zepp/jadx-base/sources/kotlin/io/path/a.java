package kotlin.io.path;

import java.nio.file.Path;
import java.nio.file.Paths;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
final class a {

    @NotNull
    public static final a a = new a();
    private static final Path b = Paths.get("", new String[0]);
    private static final Path c = Paths.get("..", new String[0]);

    private a() {
    }

    @NotNull
    public final Path a(@NotNull Path path, @NotNull Path path2) {
        Path pathNormalize = path2.normalize();
        Path pathNormalize2 = path.normalize();
        Path pathRelativize = pathNormalize.relativize(pathNormalize2);
        int iMin = Math.min(pathNormalize.getNameCount(), pathNormalize2.getNameCount());
        int i = 0;
        while (i < iMin) {
            int i2 = i + 1;
            Path name = pathNormalize.getName(i);
            Path path3 = c;
            if (!Intrinsics.areEqual(name, path3)) {
                break;
            }
            if (!Intrinsics.areEqual(pathNormalize2.getName(i), path3)) {
                throw new IllegalArgumentException("Unable to compute relative path");
            }
            i = i2;
        }
        if (!Intrinsics.areEqual(pathNormalize2, pathNormalize) && Intrinsics.areEqual(pathNormalize, b)) {
            return pathNormalize2;
        }
        String string = pathRelativize.toString();
        return m.endsWith$default(string, pathRelativize.getFileSystem().getSeparator(), false, 2, null) ? pathRelativize.getFileSystem().getPath(StringsKt___StringsKt.dropLast(string, pathRelativize.getFileSystem().getSeparator().length()), new String[0]) : pathRelativize;
    }
}
