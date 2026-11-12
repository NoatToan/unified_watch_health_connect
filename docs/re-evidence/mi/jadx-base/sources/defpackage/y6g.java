package defpackage;

import android.graphics.Point;

/* JADX INFO: loaded from: classes4.dex */
public class y6g extends cbe {
    @Override // defpackage.pej, defpackage.oej
    public void addChildAt(pej pejVar, int i) {
        super.addChildAt(pejVar, i);
        Point pointA = x6g.a(getThemedContext());
        pejVar.setStyleWidth(pointA.x);
        pejVar.setStyleHeight(pointA.y);
    }
}
