package defpackage;

import android.os.Handler;
import androidx.annotation.RequiresApi;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public abstract class ai3 {
    public static ai3 a(Executor executor, Handler handler) {
        return new vs1(executor, handler);
    }

    public abstract Executor b();

    public abstract Handler c();
}
