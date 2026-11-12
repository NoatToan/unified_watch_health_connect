package defpackage;

import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.transition.Transition;

/* JADX INFO: loaded from: classes.dex */
public class ww3 extends u0r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f38417b = 3.0f;

    public static float h(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        return (float) Math.sqrt((f5 * f5) + (f6 * f6));
    }

    @Override // defpackage.a0q
    public long c(ViewGroup viewGroup, Transition transition, d0q d0qVar, d0q d0qVar2) {
        int i;
        int iRound;
        int iCenterX;
        if (d0qVar == null && d0qVar2 == null) {
            return 0L;
        }
        if (d0qVar2 == null || e(d0qVar) == 0) {
            i = -1;
        } else {
            d0qVar = d0qVar2;
            i = 1;
        }
        int iF = f(d0qVar);
        int iG = g(d0qVar);
        Rect rectT = transition.t();
        if (rectT != null) {
            iCenterX = rectT.centerX();
            iRound = rectT.centerY();
        } else {
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            int iRound2 = Math.round(iArr[0] + (viewGroup.getWidth() / 2) + viewGroup.getTranslationX());
            iRound = Math.round(iArr[1] + (viewGroup.getHeight() / 2) + viewGroup.getTranslationY());
            iCenterX = iRound2;
        }
        float fH = h(iF, iG, iCenterX, iRound) / h(0.0f, 0.0f, viewGroup.getWidth(), viewGroup.getHeight());
        long jS = transition.s();
        if (jS < 0) {
            jS = 300;
        }
        return Math.round(((jS * ((long) i)) / this.f38417b) * fH);
    }
}
