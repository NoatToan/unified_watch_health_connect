package a8;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class b {
    private b() {
    }

    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
