package g80;

import com.garmin.android.apps.connectmobile.developer.HelpRegistryActivity;
import com.google.android.exoplayer2.C;
import e23.p;
import et1.v;
import i3.kb;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HelpRegistryActivity f76246b;

    public /* synthetic */ d(HelpRegistryActivity helpRegistryActivity, int i14) {
        this.f76245a = i14;
        this.f76246b = helpRegistryActivity;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f76245a;
        HelpRegistryActivity helpRegistryActivity = this.f76246b;
        int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i16 = HelpRegistryActivity.f33616a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-438641038, new d(helpRegistryActivity, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i17 = HelpRegistryActivity.f33616a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    kb.a(null, null, null, null, null, 0, 0L, 0L, null, z3.f.c(1794601411, new v(helpRegistryActivity, 14), mVar2), mVar2, C.ENCODING_PCM_32BIT, 511);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
