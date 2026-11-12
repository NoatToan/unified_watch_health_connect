package defpackage;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.p;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface zhd extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Config.a<Executor> f41274a = Config.a.a("camerax.core.io.ioExecutor", Executor.class);
}
