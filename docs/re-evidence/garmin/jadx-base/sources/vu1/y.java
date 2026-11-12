package vu1;

import android.net.Uri;
import com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTTrainingGuidancePlayerActivity;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class y implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FBTTrainingGuidancePlayerActivity f180393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f180394c;

    public /* synthetic */ y(FBTTrainingGuidancePlayerActivity fBTTrainingGuidancePlayerActivity, String str, int i14) {
        this.f180392a = i14;
        this.f180393b = fBTTrainingGuidancePlayerActivity;
        this.f180394c = str;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f180392a;
        String str = this.f180394c;
        FBTTrainingGuidancePlayerActivity fBTTrainingGuidancePlayerActivity = this.f180393b;
        int i15 = 2;
        int i16 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                FBTTrainingGuidancePlayerActivity.a aVar = FBTTrainingGuidancePlayerActivity.f45483c;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1635385066, new y(fBTTrainingGuidancePlayerActivity, str, i16), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                FBTTrainingGuidancePlayerActivity.a aVar2 = FBTTrainingGuidancePlayerActivity.f45483c;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    a.f180257a.getClass();
                    z02.d.a(false, a.f180258b, null, null, null, z3.f.c(1557088627, new y(fBTTrainingGuidancePlayerActivity, str, i15), mVar2), mVar2, 196656, 29);
                } else {
                    mVar2.e();
                }
                break;
            default:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                FBTTrainingGuidancePlayerActivity.a aVar3 = FBTTrainingGuidancePlayerActivity.f45483c;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    Uri uri = Uri.parse(str);
                    uri.getClass();
                    fBTTrainingGuidancePlayerActivity.ba(uri, mVar3, 0);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
