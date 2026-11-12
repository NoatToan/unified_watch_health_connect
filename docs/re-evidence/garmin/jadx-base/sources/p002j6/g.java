package p002j6;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import h4.r;
import h5.k;
import m4.u;
import n4.d;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final boolean a(View view2, View view3) {
        for (ViewParent parent = view3.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view2.getParent()) {
                return true;
            }
        }
        return false;
    }

    public static final Rect b(u uVar, View view2, View view3) {
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view3.getLocationOnScreen(iArr2);
        d dVarW = uVar.w();
        if (dVarW == null) {
            return null;
        }
        int i14 = (int) dVarW.f123547a;
        int i15 = iArr[0];
        int i16 = iArr2[0];
        int i17 = (int) dVarW.f123548b;
        int i18 = iArr[1];
        int i19 = iArr2[1];
        return new Rect((i14 + i15) - i16, (i17 + i18) - i19, (((int) dVarW.f123549c) + i15) - i16, (((int) dVarW.f123550d) + i18) - i19);
    }

    public static final View c(r.c cVar) {
        a aVar = k.g(cVar.getNode()).f81775o;
        View view2 = aVar != null ? aVar.getView() : null;
        if (view2 != null) {
            return view2;
        }
        h.z("Could not fetch interop view");
        return null;
    }
}
