package do1;

import com.garmin.android.apps.connectmobile.social.TagDemoActivity;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class t implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TagDemoActivity f60623b;

    public /* synthetic */ t(TagDemoActivity tagDemoActivity, int i14) {
        this.f60622a = i14;
        this.f60623b = tagDemoActivity;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f60622a;
        TagDemoActivity tagDemoActivity = this.f60623b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i16 = TagDemoActivity.f44489d;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(448745494, new t(tagDemoActivity, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i17 = TagDemoActivity.f44489d;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    com.garmin.android.apps.connectmobile.tag.b bVar = (com.garmin.android.apps.connectmobile.tag.b) tagDemoActivity.f44490a.getValue();
                    boolean zR = mVar2.r(tagDemoActivity);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.l(tagDemoActivity, 26);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.l(tagDemoActivity, 26);
                            mVar2.K(objQ);
                        }
                    }
                    io1.e.a(bVar, (e23.l) objQ, mVar2, com.garmin.android.apps.connectmobile.tag.b.f45059f);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
