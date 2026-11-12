package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import miuix.appcompat.app.d;

/* JADX INFO: loaded from: classes3.dex */
public class cv6 implements rrc {
    @Override // defpackage.rrc
    public int a(d.e eVar, d.b bVar) {
        int i;
        boolean zD = d(eVar.e);
        if (eVar.f26325a) {
            i = bVar.f26319b;
        } else if (zD) {
            i = bVar.f26318a;
        } else if (eVar.f26326b) {
            i = eVar.d ? bVar.e : eVar.f;
        } else {
            i = -1;
        }
        if (i != -1 && eVar.c) {
            i = (int) (i * 0.8f);
        }
        if (eVar.g) {
            StringBuilder sb = new StringBuilder();
            sb.append("calcDesignedPanelWidth: panelWidthSpec = ");
            sb.append(eVar);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("calcDesignedPanelWidth: shouldLimitPanelLimit = ");
            sb2.append(zD);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("calcDesignedPanelWidth: panelWidth = ");
            sb3.append(i);
        }
        return i;
    }

    @Override // defpackage.rrc
    public boolean b(d.c cVar) {
        if (cVar.f26321a) {
            return true;
        }
        if (cVar.f26322b) {
            return f(cVar.c, cVar.d);
        }
        if (cVar.d != 2) {
            return false;
        }
        if (cVar.e || cVar.f) {
            Point point = cVar.h;
            return point.x > point.y;
        }
        Point point2 = cVar.g;
        int i = point2.x;
        return i >= 394 && i > point2.y;
    }

    @Override // defpackage.rrc
    public int c(d.b bVar, int i) {
        if (i < 360) {
            return bVar.f;
        }
        if (i <= 394) {
            return bVar.g;
        }
        return 0;
    }

    @Override // defpackage.rrc
    public boolean d(int i) {
        return i >= 394;
    }

    @Override // defpackage.rrc
    public int e(d.C1022d c1022d, d.b bVar, Rect rect) {
        int i;
        int i2;
        Rect rect2 = rect == null ? new Rect() : rect;
        int iMax = Math.max(c1022d.g, c1022d.c);
        boolean z = c1022d.f26323a + c1022d.f26324b > 0;
        int i3 = c1022d.d;
        int iC = c(bVar, c1022d.e);
        if (i3 == -1) {
            i3 = c1022d.f - (iC * 2);
        }
        int i4 = c1022d.h ? bVar.f : bVar.d;
        int iMax2 = Math.max(c1022d.j.top, i4);
        Rect rect3 = c1022d.j;
        int i5 = rect3.left;
        int i6 = rect3.right;
        int i7 = (i5 + i6) / 2;
        int i8 = (iMax - i3) / 2;
        boolean z2 = i8 < i5 || i8 < i6;
        if (c1022d.i) {
            StringBuilder sb = new StringBuilder();
            sb.append("calcPanelPosition: panelPosSpec = ");
            sb.append(c1022d);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("calcPanelPosition: avoidMoved = ");
            sb2.append(i7);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("calcPanelPosition: horizontalMargin = ");
            sb3.append(iC);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("calcPanelPosition: centerBlankSpace = ");
            sb4.append(i8);
            StringBuilder sb5 = new StringBuilder();
            sb5.append("calcPanelPosition: widthSmallMargin = ");
            sb5.append(bVar.f);
        }
        if (i7 == 0 || !z2 || z) {
            i = iC;
            i2 = i;
        } else {
            Rect rect4 = c1022d.j;
            int i9 = rect4.left;
            int i10 = rect4.right;
            if (i9 > i10) {
                i = i7 + iC;
                i2 = iC;
            } else if (i9 < i10) {
                i2 = i7 + iC;
                i = iC;
            } else {
                i = iC;
                i2 = i;
            }
            if (c1022d.i) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append("calcPanelPosition: leftMargin = ");
                sb6.append(i);
                StringBuilder sb7 = new StringBuilder();
                sb7.append("calcPanelPosition: rightMargin = ");
                sb7.append(i2);
                StringBuilder sb8 = new StringBuilder();
                sb8.append("calcPanelPosition: realRootViewWidth = ");
                sb8.append(iMax);
            }
        }
        boolean z3 = i8 < i7;
        if (z3) {
            i3 = c1022d.f - (iC * 2);
        }
        if (c1022d.i) {
            StringBuilder sb9 = new StringBuilder();
            sb9.append("calcPanelPosition: isOverflow = ");
            sb9.append(z3);
            StringBuilder sb10 = new StringBuilder();
            sb10.append("calcPanelPosition: panelWidth = ");
            sb10.append(i3);
        }
        rect2.left = i;
        rect2.top = iMax2;
        rect2.right = i2;
        rect2.bottom = i4;
        return i3;
    }

    public final boolean f(Point point, int i) {
        int i2 = point.x;
        int i3 = point.y;
        if (i2 > i3) {
            return true;
        }
        return i2 >= i3 && i == 2;
    }
}
