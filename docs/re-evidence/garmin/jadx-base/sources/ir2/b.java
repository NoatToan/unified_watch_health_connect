package ir2;

import android.content.DialogInterface;
import com.garmin.feature.garminpay.ui.dev.devices.WalletMessageConsoleActivity;
import o53.f0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WalletMessageConsoleActivity f94812b;

    public /* synthetic */ b(WalletMessageConsoleActivity walletMessageConsoleActivity, int i14) {
        this.f94811a = i14;
        this.f94812b = walletMessageConsoleActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        int i15 = this.f94811a;
        WalletMessageConsoleActivity walletMessageConsoleActivity = this.f94812b;
        switch (i15) {
            case 0:
                WalletMessageConsoleActivity.a aVar = WalletMessageConsoleActivity.f51900i;
                ge1.b.T(f0.w(walletMessageConsoleActivity), null, null, new c(walletMessageConsoleActivity, null), 3);
                break;
            case 1:
                walletMessageConsoleActivity.finish();
                break;
            default:
                walletMessageConsoleActivity.finish();
                break;
        }
    }
}
