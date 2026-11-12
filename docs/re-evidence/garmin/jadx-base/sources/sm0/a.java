package sm0;

import com.garmin.android.apps.connectmobile.R;
import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import v62.t5;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f160064b;

    public /* synthetic */ a(c cVar, int i14) {
        this.f160063a = i14;
        this.f160064b = cVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f160063a;
        c cVar = this.f160064b;
        int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i16 = c.T;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(627475431, new a(cVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i17 = c.T;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA = t5.a(t62.b.f162798a);
                    String string = cVar.getString(R.string.social_group_empty_feed_title);
                    String string2 = cVar.getString(R.string.social_group_empty_feed_message);
                    string2.getClass();
                    b82.n.c(dVarA, string, string2, null, null, mVar2, 0, 24);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
