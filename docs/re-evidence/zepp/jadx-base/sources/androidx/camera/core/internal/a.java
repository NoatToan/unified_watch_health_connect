package androidx.camera.core.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a {
    @NonNull
    public static Executor a(IoConfig _this) {
        return (Executor) _this.retrieveOption(IoConfig.OPTION_IO_EXECUTOR);
    }

    @Nullable
    public static Executor b(@Nullable IoConfig _this, Executor executor) {
        return (Executor) _this.retrieveOption(IoConfig.OPTION_IO_EXECUTOR, executor);
    }
}
