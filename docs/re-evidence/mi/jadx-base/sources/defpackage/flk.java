package defpackage;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public interface flk {
    void captureReplay(@Nullable Boolean bool);

    @NotNull
    elk getBreadcrumbConverter();

    void pause();

    void resume();

    void start();

    void stop();
}
