package kotlin.io.path;

import java.nio.file.Path;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin(version = "1.8")
@ExperimentalPathApi
public interface CopyActionContext {
    @NotNull
    CopyActionResult copyToIgnoringExistingDirectory(@NotNull Path path, @NotNull Path path2, boolean z);
}
