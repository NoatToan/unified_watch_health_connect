package defpackage;

import android.util.TypedValue;
import android.view.View;
import miuix.appcompat.app.d;

/* JADX INFO: loaded from: classes3.dex */
public class vjh implements rvc {
    @Override // defpackage.rvc
    public TypedValue a(boolean z, boolean z2, int i, d.f fVar) {
        if (fVar == null) {
            return null;
        }
        if (z) {
            return fVar.a();
        }
        if (!z2 && i < 500) {
            return fVar.b();
        }
        return fVar.c();
    }

    @Override // defpackage.rvc
    public int b(int i, int i2, int i3, int i4, boolean z) {
        if (View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return i;
        }
        if (i2 > 0) {
            return View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
        if (z) {
            i3 = i4;
        }
        int iMin = Math.min(i3, i4);
        return iMin > 0 ? View.MeasureSpec.makeMeasureSpec(Math.min(iMin, View.MeasureSpec.getSize(i)), Integer.MIN_VALUE) : i;
    }

    @Override // defpackage.rvc
    public int c(int i, int i2, int i3) {
        if (View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return i;
        }
        if (i2 > 0) {
            return View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
        return i3 > 0 ? View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i)), Integer.MIN_VALUE) : i;
    }
}
