package defpackage;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.p;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface mcp extends p {
    public static final Config.a<Executor> d = Config.a.a("camerax.core.thread.backgroundExecutor", Executor.class);

    default Executor y(Executor executor) {
        return (Executor) d(d, executor);
    }
}
