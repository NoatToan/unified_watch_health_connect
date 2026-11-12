package i;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public final class o extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f86643a = 0;

    public static class a {
        private a() {
        }

        public static int a() {
            return 512;
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }
}
