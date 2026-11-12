package p5;

import android.graphics.Rect;
import android.graphics.Region;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp5/o;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Region f136050a = new Region();

    public final boolean a(g6.l lVar) {
        return this.f136050a.op(lVar.f76008a, lVar.f76009b, lVar.f76010c, lVar.f76011d, Region.Op.DIFFERENCE);
    }

    public final g6.l b() {
        Rect bounds = this.f136050a.getBounds();
        return new g6.l(bounds.left, bounds.top, bounds.right, bounds.bottom);
    }

    public final boolean c(o oVar) {
        return this.f136050a.op(oVar.f136050a, Region.Op.INTERSECT);
    }

    public final void d(g6.l lVar) {
        this.f136050a.set(lVar.f76008a, lVar.f76009b, lVar.f76010c, lVar.f76011d);
    }
}
