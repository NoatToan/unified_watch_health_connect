package en0;

import android.content.DialogInterface;
import com.garmin.feature.garminpay.ui.dev.devices.WalletMessageConsoleActivity;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class m implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f64710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f64711b;

    public /* synthetic */ m(Object obj, int i14) {
        this.f64710a = i14;
        this.f64711b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f64710a) {
            case 0:
                DialogInterface.OnClickListener onClickListener = (DialogInterface.OnClickListener) this.f64711b;
                if (onClickListener != null) {
                    onClickListener.onClick(dialogInterface, -3);
                }
                break;
            case 1:
                ((WalletMessageConsoleActivity) this.f64711b).finish();
                break;
            case 2:
                ((com.garmin.android.library.mobileauth.ui.c.a.InterfaceC1004a) this.f64711b).g();
                break;
            default:
                yb1.b bVar = (yb1.b) this.f64711b;
                bVar.f195684a.debug("handleBackButtonPressed: ");
                bVar.w6(kf2.a.DISMISSED_BACK);
                ff2.c cVarV6 = bVar.v6();
                cVarV6.f71143b.d(bVar.u6().getCampaignId());
                bVar.dismiss();
                break;
        }
    }
}
