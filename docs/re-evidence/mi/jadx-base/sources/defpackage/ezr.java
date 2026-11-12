package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import com.xiaomi.yrn.env.trace.YRNTraceEvent;

/* JADX INFO: loaded from: classes2.dex */
public class ezr {
    public static final czr d = new kxr();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HandlerThread f17237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f17238b;
    public czr c;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ezr f17239a = new ezr();
    }

    public static ezr c() {
        return b.f17239a;
    }

    public final YRNTraceEvent b(YRNTraceEvent yRNTraceEvent) {
        if (yRNTraceEvent != null) {
            int errorCode = yRNTraceEvent.getErrorCode();
            if (errorCode == 91) {
                return YRNTraceEvent.newEvent(yRNTraceEvent.getAppName(), 20, "更新bundle", yRNTraceEvent.getCom(), yRNTraceEvent.getBiz());
            }
            if (errorCode == 900) {
                return YRNTraceEvent.newEvent(yRNTraceEvent.getAppName(), 200, "更新bundle成功", yRNTraceEvent.getCom(), yRNTraceEvent.getBiz());
            }
            if (errorCode == 911 || errorCode == 921 || errorCode == 931 || errorCode == 901) {
                return YRNTraceEvent.newEvent(yRNTraceEvent.getAppName(), 201, "更新bundle失败", yRNTraceEvent.getCom(), yRNTraceEvent.getBiz());
            }
        }
        return null;
    }

    public final /* synthetic */ void d(YRNTraceEvent yRNTraceEvent) {
        d.a(yRNTraceEvent);
        czr czrVar = this.c;
        if (czrVar != null) {
            czrVar.a(yRNTraceEvent);
        }
    }

    public void e(czr czrVar) {
        this.c = czrVar;
    }

    public void f(YRNTraceEvent yRNTraceEvent) {
        YRNTraceEvent yRNTraceEventB = b(yRNTraceEvent);
        if (yRNTraceEventB != null) {
            f(yRNTraceEventB);
        }
        g(yRNTraceEvent);
    }

    public final void g(final YRNTraceEvent yRNTraceEvent) {
        this.f17238b.post(new Runnable() { // from class: dzr
            @Override // java.lang.Runnable
            public final void run() {
                this.f16099a.d(yRNTraceEvent);
            }
        });
    }

    public ezr() {
        HandlerThread handlerThread = new HandlerThread("yrn_trace_thread");
        this.f17237a = handlerThread;
        handlerThread.start();
        this.f17238b = new Handler(handlerThread.getLooper());
    }
}
