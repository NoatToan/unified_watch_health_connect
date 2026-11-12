package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public class v8q extends mkb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static v8q f36627b;

    public v8q() {
        super(new Handler(Looper.getMainLooper()));
    }

    public static v8q g() {
        if (f36627b == null) {
            f36627b = new v8q();
        }
        return f36627b;
    }

    @Override // defpackage.mkb, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (a()) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }
}
