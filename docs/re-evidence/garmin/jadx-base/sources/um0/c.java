package um0;

import com.garmin.android.apps.connectmobile.R;
import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import v62.t5;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f171997b;

    public /* synthetic */ c(d dVar, int i14) {
        this.f171996a = i14;
        this.f171997b = dVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f171996a;
        d dVar = this.f171997b;
        int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i16 = d.T;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1435629344, new c(dVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i17 = d.T;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA = t5.a(t62.b.f162798a);
                    String string = dVar.getString(R.string.social_group_no_posts_yet);
                    String string2 = dVar.getString(R.string.social_group_empty_post_message);
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
