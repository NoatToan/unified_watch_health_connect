package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.e2;
import androidx.camera.core.impl.s2;
import androidx.camera.core.impl.t2;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import v.e0;

/* JADX INFO: loaded from: classes.dex */
public class ExtraSupportedSurfaceCombinationsQuirk implements e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s2 f5381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s2 f5382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashSet f5383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashSet f5384d;

    static {
        s2 s2Var = new s2();
        t2.d dVar = t2.d.YUV;
        t2.b bVar = t2.b.f5767c;
        s2Var.a(t2.a(dVar, bVar));
        t2.d dVar2 = t2.d.PRIV;
        t2.b bVar2 = t2.b.f5770f;
        s2Var.a(t2.a(dVar2, bVar2));
        t2.b bVar3 = t2.b.f5777m;
        s2Var.a(t2.a(dVar, bVar3));
        f5381a = s2Var;
        s2 s2Var2 = new s2();
        e0.m(dVar2, bVar2, s2Var2, dVar2, bVar);
        s2Var2.a(t2.a(dVar, bVar3));
        f5382b = s2Var2;
        f5383c = new HashSet(Arrays.asList("PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO", "PIXEL 9", "PIXEL 9 PRO", "PIXEL 9 PRO XL", "PIXEL 9 PRO FOLD"));
        f5384d = new HashSet(Arrays.asList("SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26", "SM-S931", "SM-S936", "SM-S937", "SM-S938", "SCG31", "SCG32", "SC-51F", "SC-52F"));
    }

    public static boolean f() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String upperCase = Build.MODEL.toUpperCase(Locale.US);
        Iterator it = f5384d.iterator();
        while (it.hasNext()) {
            if (upperCase.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
