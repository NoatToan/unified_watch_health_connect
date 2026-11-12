package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;

/* JADX INFO: loaded from: classes2.dex */
public class cyr implements NativeModuleCallExceptionHandler {
    public static final String f = "cyr";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gur f14876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Runnable f14877b = null;
    public int c = 0;
    public final Handler d = new Handler(Looper.getMainLooper());
    public final dwr e;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Exception f14878a;

        public a(Exception exc) {
            this.f14878a = exc;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = cyr.f;
            zxr.c(str, "YRNModuleCallExceptionHandler.handleException:handleException", this.f14878a);
            Exception exc = this.f14878a;
            if (exc == null) {
                return;
            }
            if ((exc instanceof RuntimeException) && exc.getMessage() != null && this.f14878a.getMessage().contains("RCTDeviceEventEmitter.emit")) {
                zxr.b(str, "YRNModuleCallExceptionHandler.handleException: " + this.f14878a.getMessage().toString());
                return;
            }
            if (cyr.this.f14876a != null) {
                if (cyr.this.f14876a.k() != null) {
                    cyr.this.f14876a.k().handleRNException(this.f14878a);
                }
                if (cyr.this.e != null) {
                    cyr.d(cyr.this);
                    if (cyr.this.c > 3) {
                        return;
                    }
                    cyr.this.e.T(this.f14878a);
                }
            }
        }
    }

    public cyr(dwr dwrVar) {
        sk1.c(dwrVar);
        sk1.c(dwrVar.C());
        this.e = dwrVar;
        this.f14876a = dwrVar.C();
    }

    public static /* synthetic */ int d(cyr cyrVar) {
        int i = cyrVar.c;
        cyrVar.c = i + 1;
        return i;
    }

    @Override // com.facebook.react.bridge.NativeModuleCallExceptionHandler
    public void handleException(Exception exc) {
        if (this.f14877b == null) {
            this.f14877b = new a(exc);
        }
        this.d.removeCallbacks(this.f14877b);
        this.d.postDelayed(this.f14877b, 100L);
    }
}
