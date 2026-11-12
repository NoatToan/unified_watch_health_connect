package p53;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import o13.q;
import o53.j;
import o53.k;
import o53.s0;
import u13.f;
import u53.o;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f136190a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object bVar;
        try {
            int i14 = q.f128596b;
            bVar = new b(b(Looper.getMainLooper()), null, 2, null);
        } catch (Throwable th3) {
            int i15 = q.f128596b;
            bVar = new q.b(th3);
        }
    }

    public static final void a(j jVar) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            choreographer2.getClass();
            choreographer = choreographer2;
        }
        choreographer2.postFrameCallback(new com.mapbox.maps.renderer.b(jVar, 2));
    }

    public static final Handler b(Looper looper) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        objInvoke.getClass();
        return (Handler) objInvoke;
    }

    public static final Object c(t13.d<? super Long> dVar) throws Throwable {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 != null) {
            k kVar = new k(f.b(dVar), 1);
            kVar.q();
            choreographer2.postFrameCallback(new com.mapbox.maps.renderer.b(kVar, 2));
            Object objP = kVar.p();
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            return objP;
        }
        k kVar2 = new k(f.b(dVar), 1);
        kVar2.q();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            a(kVar2);
        } else {
            x53.c cVar = s0.f129406a;
            o.f168762a.dispatch(kVar2.f129362e, new d(kVar2));
        }
        Object objP2 = kVar2.p();
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        return objP2;
    }
}
