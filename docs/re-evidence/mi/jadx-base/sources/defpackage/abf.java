package defpackage;

import android.util.Pair;
import android.view.View;
import com.rd.animation.type.AnimationType;
import com.rd.draw.data.Orientation;

/* JADX INFO: loaded from: classes6.dex */
public class abf {
    public Pair<Integer, Integer> a(s7d s7dVar, int i, int i2) {
        int i3;
        int i4;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int iC = s7dVar.c();
        int iL = s7dVar.l();
        int iR = s7dVar.r();
        int iG = s7dVar.g();
        int i5 = s7dVar.i();
        int iK = s7dVar.k();
        int iJ = s7dVar.j();
        int iH = s7dVar.h();
        int i6 = iL * 2;
        Orientation orientationF = s7dVar.f();
        if (iC != 0) {
            i4 = (i6 * iC) + (iR * 2 * iC) + (iG * (iC - 1));
            i3 = i6 + iR;
            if (orientationF != Orientation.HORIZONTAL) {
                i4 = i3;
                i3 = i4;
            }
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (s7dVar.b() == AnimationType.DROP) {
            if (orientationF == Orientation.HORIZONTAL) {
                i3 *= 2;
            } else {
                i4 *= 2;
            }
        }
        Orientation orientation = Orientation.HORIZONTAL;
        int i7 = i4 + i5 + iJ;
        int i8 = i3 + iK + iH;
        if (mode != 1073741824) {
            size = mode == Integer.MIN_VALUE ? Math.min(i7, size) : i7;
        }
        if (mode2 != 1073741824) {
            size2 = mode2 == Integer.MIN_VALUE ? Math.min(i8, size2) : i8;
        }
        if (size < 0) {
            size = 0;
        }
        int i9 = size2 >= 0 ? size2 : 0;
        s7dVar.Y(size);
        s7dVar.E(i9);
        return new Pair<>(Integer.valueOf(size), Integer.valueOf(i9));
    }
}
