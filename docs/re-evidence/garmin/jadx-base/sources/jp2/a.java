package jp2;

import android.content.DialogInterface;
import androidx.lifecycle.i0;
import com.garmin.feature.garminpay.providers.gpay.ui.cardverification.FitPayCardVerificationActivity;
import e23.p;
import o53.f0;
import o53.s0;
import p005kotlin.Unit;
import u53.o;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f99914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FitPayCardVerificationActivity f99915b;

    public /* synthetic */ a(FitPayCardVerificationActivity fitPayCardVerificationActivity, int i14) {
        this.f99914a = i14;
        this.f99915b = fitPayCardVerificationActivity;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f99914a;
        FitPayCardVerificationActivity fitPayCardVerificationActivity = this.f99915b;
        DialogInterface dialogInterface = (DialogInterface) obj;
        ((Integer) obj2).getClass();
        FitPayCardVerificationActivity.b bVar = FitPayCardVerificationActivity.f51449m;
        switch (i14) {
            case 0:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                i0 i0VarW = f0.w(fitPayCardVerificationActivity);
                x53.c cVar = s0.f129406a;
                ge1.b.T(i0VarW, o.f168762a, null, new d(fitPayCardVerificationActivity, null), 2);
                fitPayCardVerificationActivity.ea(com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.CANCELLED);
                break;
            case 1:
                dialogInterface.getClass();
                fitPayCardVerificationActivity.ea(com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.ERROR);
                if (fitPayCardVerificationActivity.getSupportFragmentManager().M() > 0) {
                    fitPayCardVerificationActivity.getSupportFragmentManager().Z();
                }
                break;
            case 2:
                dialogInterface.getClass();
                fitPayCardVerificationActivity.ea(com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.ERROR);
                fitPayCardVerificationActivity.da();
                break;
            case 3:
                dialogInterface.getClass();
                fitPayCardVerificationActivity.ea(com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.ERROR);
                if (fitPayCardVerificationActivity.getSupportFragmentManager().M() > 0) {
                    fitPayCardVerificationActivity.getSupportFragmentManager().Z();
                }
                break;
            case 4:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                fitPayCardVerificationActivity.ea(com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.ERROR);
                break;
            case 5:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                fitPayCardVerificationActivity.da();
                break;
            case 6:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                fitPayCardVerificationActivity.ea(com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.ERROR);
                fitPayCardVerificationActivity.da();
                break;
            default:
                dialogInterface.getClass();
                fitPayCardVerificationActivity.ea(com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.ERROR);
                fitPayCardVerificationActivity.da();
                break;
        }
        return Unit.INSTANCE;
    }
}
