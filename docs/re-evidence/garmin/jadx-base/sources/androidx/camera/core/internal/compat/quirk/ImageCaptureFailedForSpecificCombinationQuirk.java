package androidx.camera.core.internal.compat.quirk;

import androidx.camera.core.impl.b3;
import androidx.camera.core.impl.c3;
import androidx.camera.core.impl.e2;
import b0.i1;
import b0.l0;
import b0.w0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class ImageCaptureFailedForSpecificCombinationQuirk implements e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f5918a = new HashSet(Arrays.asList("pixel 4a", "pixel 4a (5g)", "pixel 5", "pixel 5a"));

    public static boolean f(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.size() == 3) {
            Iterator it = linkedHashSet.iterator();
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = false;
            while (it.hasNext()) {
                i1 i1Var = (i1) it.next();
                if (i1Var instanceof w0) {
                    z14 = true;
                } else if (i1Var instanceof l0) {
                    z16 = true;
                } else if (i1Var.f13969h.b(b3.E)) {
                    z15 = i1Var.f13969h.y() == c3.b.VIDEO_CAPTURE;
                }
            }
            if (z14 && z15 && z16) {
                return true;
            }
        }
        return false;
    }
}
