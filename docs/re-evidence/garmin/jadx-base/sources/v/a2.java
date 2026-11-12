package v;

import android.os.Build;
import androidx.camera.core.impl.b3;
import androidx.camera.core.impl.c3;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv/a2;", "", "<init>", "()V", "camera-camera2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a2 f173668a = new a2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final androidx.camera.core.impl.h f173669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q13.c f173670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q13.c f173671d;

    static {
        Class cls = Long.TYPE;
        cls.getClass();
        f173669b = androidx.camera.core.impl.x0.a.a(cls, "camera2.streamSpec.streamUseCase");
        q13.c cVar = new q13.c();
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33) {
            c3.b bVar = c3.b.PREVIEW;
            c3.b bVar2 = c3.b.METERING_REPEATING;
            c3.b bVar3 = c3.b.IMAGE_ANALYSIS;
            cVar.put(4L, p13.u.m0(new c3.b[]{bVar, bVar2, bVar3}));
            cVar.put(1L, p13.u.m0(new c3.b[]{bVar, bVar2, bVar3}));
            cVar.put(2L, p13.a1.b(c3.b.IMAGE_CAPTURE));
            cVar.put(3L, p13.a1.b(c3.b.VIDEO_CAPTURE));
        }
        f173670c = cVar.b();
        q13.c cVar2 = new q13.c();
        if (i14 >= 33) {
            c3.b bVar4 = c3.b.PREVIEW;
            c3.b bVar5 = c3.b.IMAGE_CAPTURE;
            c3.b bVar6 = c3.b.VIDEO_CAPTURE;
            cVar2.put(4L, p13.u.m0(new c3.b[]{bVar4, bVar5, bVar6}));
            cVar2.put(3L, p13.u.m0(new c3.b[]{bVar4, bVar6}));
        }
        f173671d = cVar2.b();
    }

    private a2() {
    }

    public static u.a a(androidx.camera.core.impl.x0 x0Var, Long l14) {
        androidx.camera.core.impl.h hVar = f173669b;
        if (x0Var.b(hVar) && p005kotlin.jvm.internal.s.g(x0Var.e(hVar), l14)) {
            return null;
        }
        androidx.camera.core.impl.w1 w1VarV = androidx.camera.core.impl.w1.V(x0Var);
        w1VarV.X(hVar, l14);
        return new u.a(w1VarV);
    }

    public static boolean b(c3.b bVar, long j8, List list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (bVar != c3.b.STREAM_SHARING) {
            Long lValueOf = Long.valueOf(j8);
            q13.c cVar = f173670c;
            if (!cVar.containsKey(lValueOf)) {
                return false;
            }
            Object obj = cVar.get(Long.valueOf(j8));
            obj.getClass();
            return ((Set) obj).contains(bVar);
        }
        Long lValueOf2 = Long.valueOf(j8);
        q13.c cVar2 = f173671d;
        if (!cVar2.containsKey(lValueOf2)) {
            return false;
        }
        Object obj2 = cVar2.get(Long.valueOf(j8));
        obj2.getClass();
        Set set = (Set) obj2;
        if (list.size() != set.size()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains((c3.b) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(androidx.camera.core.impl.x0 x0Var, c3.b bVar) {
        Object objF = x0Var.f(b3.C, Boolean.FALSE);
        objF.getClass();
        if (((Boolean) objF).booleanValue()) {
            return false;
        }
        androidx.camera.core.impl.h hVar = androidx.camera.core.impl.l1.O;
        if (!x0Var.b(hVar)) {
            return false;
        }
        Object objE = x0Var.e(hVar);
        objE.getClass();
        return i2.a(bVar, ((Number) objE).intValue()) == 5;
    }
}
