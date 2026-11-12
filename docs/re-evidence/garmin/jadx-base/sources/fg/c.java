package fg;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f71203a = new ConcurrentHashMap();

    public interface a {
        void a();
    }

    public c(Activity activity) {
        new Handler(Looper.getMainLooper());
        lh.b bVarB = lh.b.b();
        bVarB.getClass();
        ah.b.c();
        bVarB.f112390a = activity.getApplicationContext();
    }
}
