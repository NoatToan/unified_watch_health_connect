package v;

import android.hardware.camera2.CameraCharacteristics;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.camera.camera2.internal.compat.h f173831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w.d f173832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f173833c;

    public static final class a {
        private a() {
        }

        public static b0.b0 a(androidx.camera.camera2.internal.compat.h hVar) {
            Long l14 = (Long) hVar.a(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
            if (l14 != null) {
                return (b0.b0) w.c.f180961a.get(l14);
            }
            return null;
        }
    }

    public h1(androidx.camera.camera2.internal.compat.h hVar) {
        this.f173831a = hVar;
        this.f173832b = w.d.a(hVar);
        int[] iArr = (int[]) hVar.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z14 = false;
        if (iArr != null) {
            for (int i14 : iArr) {
                if (i14 == 18) {
                    z14 = true;
                    break;
                }
            }
        }
        this.f173833c = z14;
    }

    public static boolean a(b0.b0 b0Var, b0.b0 b0Var2) {
        boolean zB = b0Var2.b();
        int i14 = b0Var2.f13860a;
        k7.h.f(zB, "Fully specified range is not actually fully specified.");
        int i15 = b0Var.f13860a;
        if (i15 == 2 && i14 == 1) {
            return false;
        }
        if (i15 != 2 && i15 != 0 && i15 != i14) {
            return false;
        }
        int i16 = b0Var.f13861b;
        return i16 == 0 || i16 == b0Var2.f13861b;
    }

    public static boolean b(b0.b0 b0Var, b0.b0 b0Var2, HashSet hashSet) {
        if (hashSet.contains(b0Var2)) {
            return a(b0Var, b0Var2);
        }
        b0Var.toString();
        Objects.toString(b0Var2);
        return false;
    }

    public static b0.b0 c(b0.b0 b0Var, LinkedHashSet linkedHashSet, HashSet hashSet) {
        if (b0Var.f13860a == 1) {
            return null;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            b0.b0 b0Var2 = (b0.b0) it.next();
            k7.h.e(b0Var2, "Fully specified DynamicRange cannot be null.");
            int i14 = b0Var2.f13860a;
            k7.h.f(b0Var2.b(), "Fully specified DynamicRange must have fully defined encoding.");
            if (i14 != 1 && b(b0Var, b0Var2, hashSet)) {
                return b0Var2;
            }
        }
        return null;
    }

    public static void d(HashSet hashSet, b0.b0 b0Var, w.d dVar) {
        k7.h.f(!hashSet.isEmpty(), "Cannot update already-empty constraints.");
        Set<b0.b0> setB = dVar.f180963a.b(b0Var);
        if (setB.isEmpty()) {
            return;
        }
        HashSet hashSet2 = new HashSet(hashSet);
        hashSet.retainAll(setB);
        if (hashSet.isEmpty()) {
            throw new IllegalArgumentException("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  " + b0Var + "\nConstraints:\n  " + TextUtils.join("\n  ", setB) + "\nExisting constraints:\n  " + TextUtils.join("\n  ", hashSet2));
        }
    }
}
