package c40;

import android.content.Context;
import c2.t2;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import e23.q;
import gl1.y;
import l72.x0;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f24316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e50.i f24317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f24318d;

    public /* synthetic */ d(Context context, e50.i iVar, String str, int i14) {
        this.f24315a = i14;
        this.f24316b = context;
        this.f24317c = iVar;
        this.f24318d = str;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String string;
        String string2;
        int i14 = this.f24315a;
        Context context = this.f24316b;
        e50.i iVar = this.f24317c;
        switch (i14) {
            case 0:
                t2 t2Var = (t2) obj;
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(t2Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = n.f135158a;
                    x0.f111346a.a((iIntValue & 14) | (x0.f111348c << 24), 116, null, t2Var, null, null, g.b(context, Double.valueOf(iVar.f63039f), iVar.f63043j), y.Q(mVar, R.string.lbl_total_ascent), this.f24318d, null, mVar);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                t2 t2Var2 = (t2) obj;
                m mVar2 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                t2Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(t2Var2) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = n.f135158a;
                    x0.f111346a.a((iIntValue2 & 14) | (x0.f111348c << 24), 116, null, t2Var2, null, null, g.b(context, Double.valueOf(iVar.f63040g), iVar.f63043j), y.Q(mVar2, R.string.lbl_total_descent), this.f24318d, null, mVar2);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                t2 t2Var3 = (t2) obj;
                m mVar3 = (m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                t2Var3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar3.B(t2Var3) ? 4 : 2;
                }
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var3 = n.f135158a;
                    x0.f111346a.a((x0.f111348c << 24) | (iIntValue3 & 14), 116, null, t2Var3, null, null, g.b(context, Double.valueOf(iVar.f63041h), iVar.f63043j), y.Q(mVar3, R.string.lbl_minimum), this.f24318d, null, mVar3);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                t2 t2Var4 = (t2) obj;
                m mVar4 = (m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                t2Var4.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar4.B(t2Var4) ? 4 : 2;
                }
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x1 x1Var4 = n.f135158a;
                    x0.f111346a.a((iIntValue4 & 14) | (x0.f111348c << 24), 116, null, t2Var4, null, null, g.b(context, Double.valueOf(iVar.f63042i), iVar.f63043j), y.Q(mVar4, R.string.lbl_maximum), this.f24318d, null, mVar4);
                } else {
                    mVar4.e();
                }
                break;
            case 4:
                t2 t2Var5 = (t2) obj;
                m mVar5 = (m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                t2Var5.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= mVar5.B(t2Var5) ? 4 : 2;
                }
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    x1 x1Var5 = n.f135158a;
                    x0 x0Var = x0.f111346a;
                    double d14 = iVar.f63041h;
                    Double dValueOf = Double.valueOf(d14);
                    boolean z14 = iVar.f63043j;
                    boolean zD = zf.b.D(dValueOf);
                    Context context2 = this.f24316b;
                    if (zD) {
                        l3.f23124b.getClass();
                        string = l3.a.c0(context2, d14, z14, false, false);
                    } else {
                        string = context2.getString(R.string.no_value);
                        string.getClass();
                    }
                    x0Var.a((x0.f111348c << 24) | (iIntValue5 & 14), 116, null, t2Var5, null, null, string, y.Q(mVar5, R.string.lbl_minimum), this.f24318d, null, mVar5);
                } else {
                    mVar5.e();
                }
                break;
            default:
                t2 t2Var6 = (t2) obj;
                m mVar6 = (m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                t2Var6.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= mVar6.B(t2Var6) ? 4 : 2;
                }
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    x1 x1Var6 = n.f135158a;
                    x0 x0Var2 = x0.f111346a;
                    double d15 = iVar.f63042i;
                    Double dValueOf2 = Double.valueOf(d15);
                    boolean z15 = iVar.f63043j;
                    boolean zD2 = zf.b.D(dValueOf2);
                    Context context3 = this.f24316b;
                    if (zD2) {
                        l3.f23124b.getClass();
                        string2 = l3.a.c0(context3, d15, z15, false, false);
                    } else {
                        string2 = context3.getString(R.string.no_value);
                        string2.getClass();
                    }
                    x0Var2.a((iIntValue6 & 14) | (x0.f111348c << 24), 116, null, t2Var6, null, null, string2, y.Q(mVar6, R.string.lbl_maximum), this.f24318d, null, mVar6);
                } else {
                    mVar6.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
