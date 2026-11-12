package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.c;
import androidx.transition.Transition;

/* JADX INFO: loaded from: classes.dex */
public class lbm extends u0r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f24872b = 3.0f;
    public int c = 80;

    @Override // defpackage.a0q
    public long c(ViewGroup viewGroup, Transition transition, d0q d0qVar, d0q d0qVar2) {
        int i;
        int iCenterX;
        int iCenterY;
        d0q d0qVar3 = d0qVar;
        if (d0qVar3 == null && d0qVar2 == null) {
            return 0L;
        }
        Rect rectT = transition.t();
        if (d0qVar2 == null || e(d0qVar3) == 0) {
            i = -1;
        } else {
            d0qVar3 = d0qVar2;
            i = 1;
        }
        int iF = f(d0qVar3);
        int iG = g(d0qVar3);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int iRound = iArr[0] + Math.round(viewGroup.getTranslationX());
        int iRound2 = iArr[1] + Math.round(viewGroup.getTranslationY());
        int width = iRound + viewGroup.getWidth();
        int height = iRound2 + viewGroup.getHeight();
        if (rectT != null) {
            iCenterX = rectT.centerX();
            iCenterY = rectT.centerY();
        } else {
            iCenterX = (iRound + width) / 2;
            iCenterY = (iRound2 + height) / 2;
        }
        float fH = h(viewGroup, iF, iG, iCenterX, iCenterY, iRound, iRound2, width, height) / i(viewGroup);
        long jS = transition.s();
        if (jS < 0) {
            jS = 300;
        }
        return Math.round(((jS * ((long) i)) / this.f24872b) * fH);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0010  */
    /* JADX WARN: Code duplicated, block: B:7:0x0012  */
    public final int h(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.c;
        if (i9 == 8388611) {
            if (c.A(view) == 1) {
                i9 = 5;
            } else {
                i9 = 3;
            }
        } else if (i9 == 8388613) {
            if (c.A(view) == 1) {
                i9 = 3;
            } else {
                i9 = 5;
            }
        }
        if (i9 == 3) {
            return Math.abs(i4 - i2) + (i7 - i);
        }
        if (i9 == 5) {
            return Math.abs(i4 - i2) + (i - i5);
        }
        if (i9 == 48) {
            return Math.abs(i3 - i) + (i8 - i2);
        }
        if (i9 != 80) {
            return 0;
        }
        return Math.abs(i3 - i) + (i2 - i6);
    }

    public final int i(ViewGroup viewGroup) {
        int i = this.c;
        return (i == 3 || i == 5 || i == 8388611 || i == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight();
    }

    public void j(int i) {
        this.c = i;
    }
}
