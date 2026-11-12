package androidx.dynamicanimation.animation;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import p1.k1;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ThreadLocal<a> f6978f = new ThreadLocal<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f6982d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1<b, Long> f6979a = new k1<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<b> f6980b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0095a f6981c = new C0095a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6983e = false;

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.a$a, reason: collision with other inner class name */
    public class C0095a {
        public C0095a() {
        }
    }

    public interface b {
        boolean a(long j8);
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C0095a f6985a;

        public c(C0095a c0095a) {
            this.f6985a = c0095a;
        }
    }

    public static class d extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Choreographer f6986b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ChoreographerFrameCallbackC0096a f6987c;

        /* JADX INFO: renamed from: androidx.dynamicanimation.animation.a$d$a, reason: collision with other inner class name */
        public class ChoreographerFrameCallbackC0096a implements Choreographer.FrameCallback {
            public ChoreographerFrameCallbackC0096a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j8) {
                a aVar = a.this;
                long jUptimeMillis = SystemClock.uptimeMillis();
                aVar.getClass();
                ArrayList<b> arrayList = aVar.f6980b;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    b bVar = arrayList.get(i14);
                    if (bVar != null) {
                        k1<b, Long> k1Var = aVar.f6979a;
                        Long l14 = k1Var.get(bVar);
                        if (l14 == null) {
                            bVar.a(jUptimeMillis);
                        } else if (l14.longValue() < jUptimeMillis2) {
                            k1Var.remove(bVar);
                            bVar.a(jUptimeMillis);
                        }
                    }
                }
                if (aVar.f6983e) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    aVar.f6983e = false;
                }
                if (arrayList.size() > 0) {
                    if (aVar.f6982d == null) {
                        aVar.f6982d = new d(aVar.f6981c);
                    }
                    aVar.f6982d.a();
                }
            }
        }

        public d(C0095a c0095a) {
            super(c0095a);
            this.f6986b = Choreographer.getInstance();
            this.f6987c = new ChoreographerFrameCallbackC0096a();
        }

        public final void a() {
            this.f6986b.postFrameCallback(this.f6987c);
        }
    }
}
