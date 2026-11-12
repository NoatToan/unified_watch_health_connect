package oe;

import android.app.Activity;
import android.content.Context;
import androidx.window.layout.adapter.sidecar.SidecarCompat;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;
import o13.t;
import o72.v3;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes7.dex */
public interface g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f131220a = a.f131221a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Loe/g$a;", "", "<init>", "()V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f131221a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final t f131222b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f131223c;

        static {
            s0.f105811a.b(g.class).D();
            f131222b = o13.m.b(new v3(29));
            f131223c = b.f131197a;
        }

        private a() {
        }

        public static k a(Context context) {
            SidecarCompat sidecarCompat;
            context.getClass();
            pe.a aVar = (pe.a) f131222b.getValue();
            if (aVar == null) {
                androidx.window.layout.adapter.sidecar.b.f11412c.getClass();
                if (androidx.window.layout.adapter.sidecar.b.f11413d == null) {
                    ReentrantLock reentrantLock = androidx.window.layout.adapter.sidecar.b.f11414e;
                    reentrantLock.lock();
                    try {
                        if (androidx.window.layout.adapter.sidecar.b.f11413d == null) {
                            try {
                                SidecarCompat.f11400f.getClass();
                                me.l lVarC = SidecarCompat.a.c();
                                if (lVarC != null) {
                                    me.l.f117978f.getClass();
                                    me.l lVar = me.l.f117979g;
                                    lVar.getClass();
                                    Object value = lVarC.f117984e.getValue();
                                    value.getClass();
                                    Object value2 = lVar.f117984e.getValue();
                                    value2.getClass();
                                    if (((BigInteger) value).compareTo((BigInteger) value2) >= 0) {
                                        sidecarCompat = new SidecarCompat(context);
                                        if (!sidecarCompat.f()) {
                                        }
                                    }
                                    androidx.window.layout.adapter.sidecar.b.f11413d = new androidx.window.layout.adapter.sidecar.b(sidecarCompat);
                                }
                            } catch (Throwable unused) {
                            }
                            sidecarCompat = null;
                            androidx.window.layout.adapter.sidecar.b.f11413d = new androidx.window.layout.adapter.sidecar.b(sidecarCompat);
                        }
                        Unit unit = Unit.INSTANCE;
                        reentrantLock.unlock();
                    } catch (Throwable th3) {
                        reentrantLock.unlock();
                        throw th3;
                    }
                }
                aVar = androidx.window.layout.adapter.sidecar.b.f11413d;
                aVar.getClass();
            }
            o oVar = new o(null, 1, null);
            le.d.f112033a.getClass();
            le.a aVar2 = le.d.f112034b;
            le.c cVar = new le.c();
            aVar2.getClass();
            k kVar = new k(oVar, aVar, cVar);
            f131223c.getClass();
            return kVar;
        }
    }

    r53.i<l> a(Activity activity);
}
