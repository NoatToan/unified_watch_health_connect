package ho2;

import android.content.DialogInterface;
import androidx.lifecycle.i0;
import c22.n1;
import com.garmin.feature.garminpay.providers.gpay.pushprovisioning.PushProvMainActivity;
import o53.f0;
import o53.s0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PushProvMainActivity f84834b;

    public /* synthetic */ b(PushProvMainActivity pushProvMainActivity, int i14) {
        this.f84833a = i14;
        this.f84834b = pushProvMainActivity;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f84833a;
        int i15 = 0;
        PushProvMainActivity pushProvMainActivity = this.f84834b;
        DialogInterface dialogInterface = (DialogInterface) obj;
        ((Integer) obj2).getClass();
        PushProvMainActivity.a aVar = PushProvMainActivity.f51161t;
        switch (i14) {
            case 0:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a aVar2 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.ERROR;
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
                e eVar = new e(pushProvMainActivity, aVar2, i15);
                cVar.getClass();
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.b(pushProvMainActivity, false, eVar);
                break;
            case 1:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a aVar3 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.DECLINED;
                i0 i0VarW = f0.w(pushProvMainActivity);
                x53.c cVar2 = s0.f129406a;
                ge1.b.T(i0VarW, u53.o.f168762a, null, new com.garmin.feature.garminpay.providers.gpay.pushprovisioning.a(pushProvMainActivity, false, aVar3, null), 2);
                break;
            case 2:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                pushProvMainActivity.fa();
                break;
            case 3:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                pushProvMainActivity.fa();
                break;
            case 4:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                pushProvMainActivity.fa();
                break;
            case 5:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                pushProvMainActivity.ea();
                break;
            case 6:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                pushProvMainActivity.ea();
                break;
            case 7:
                dialogInterface.getClass();
                pushProvMainActivity.fa();
                break;
            case 8:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                new n1(pushProvMainActivity, hb2.g.a.GARMIN_CONNECT_MOBILE).a();
                break;
            case 9:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                pushProvMainActivity.fa();
                break;
            case 10:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                pushProvMainActivity.fa();
                break;
            case 11:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                pushProvMainActivity.fa();
                break;
            case 12:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                pushProvMainActivity.ea();
                break;
            case 13:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                pushProvMainActivity.ea();
                break;
            case 14:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                pushProvMainActivity.ea();
                break;
            default:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a aVar4 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.DUPLICATE_REQUEST;
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar3 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
                e eVar2 = new e(pushProvMainActivity, aVar4, i15);
                cVar3.getClass();
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.b(pushProvMainActivity, false, eVar2);
                break;
        }
        return Unit.INSTANCE;
    }
}
