package cw1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class z0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f56261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f56262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f56263d;

    public /* synthetic */ z0(e23.l lVar, e23.l lVar2, p3.p1 p1Var, int i14) {
        this.f56260a = i14;
        this.f56261b = lVar;
        this.f56262c = lVar2;
        this.f56263d = p1Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        x5.l0 l0Var;
        int i14 = this.f56260a;
        p3.p1 p1Var = this.f56263d;
        e23.l lVar = this.f56262c;
        e23.l lVar2 = this.f56261b;
        switch (i14) {
            case 0:
                double dIntValue = ((Integer) obj).intValue();
                lVar2.invoke(Double.valueOf(dIntValue));
                lVar.invoke(new jv1.i(dIntValue, gg0.i.SECOND));
                p1Var.setValue(Boolean.FALSE);
                break;
            case 1:
                x5.l0 l0Var2 = (x5.l0) obj;
                l0Var2.getClass();
                if (l0Var2.f188878a.f157138b.length() <= 64 && (l0Var = (x5.l0) lVar2.invoke(l0Var2)) != null) {
                    lVar.invoke(l0Var.f188878a.f157138b);
                    p1Var.setValue(l0Var);
                }
                break;
            default:
                x5.l0 l0Var3 = (x5.l0) obj;
                o62.x xVar = o62.x.f129810a;
                l0Var3.getClass();
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                a2Var.getClass();
                gt2.c.b(a2Var.f28756a).trace("onValueChange(" + l0Var3 + ")");
                s5.c cVar = l0Var3.f188878a;
                Boolean bool = (Boolean) lVar2.invoke(cVar.f157138b);
                boolean zBooleanValue = bool.booleanValue();
                String str = cVar.f157138b;
                a2Var.getClass();
                gt2.c.b(a2Var.f28756a).trace("isValidText(" + str + ") = " + zBooleanValue);
                if (bool.booleanValue()) {
                    p1Var.setValue(l0Var3);
                    lVar.invoke(str);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
