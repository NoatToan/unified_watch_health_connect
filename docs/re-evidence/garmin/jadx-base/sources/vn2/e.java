package vn2;

import androidx.fragment.app.Fragment;
import com.garmin.feature.garminpay.providers.felica.ui.FelicaAddCardActivity;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FelicaAddCardActivity f178871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f178872c;

    public /* synthetic */ e(FelicaAddCardActivity felicaAddCardActivity, int i14, int i15) {
        this.f178870a = i15;
        this.f178871b = felicaAddCardActivity;
        this.f178872c = i14;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i14 = this.f178870a;
        int i15 = this.f178872c;
        FelicaAddCardActivity felicaAddCardActivity = this.f178871b;
        switch (i14) {
            case 0:
                FelicaAddCardActivity.a aVar = FelicaAddCardActivity.f50949l;
                Fragment fragmentG = felicaAddCardActivity.getSupportFragmentManager().G("PAY#DownloadCardFrag");
                br2.i iVar = fragmentG instanceof br2.i ? (br2.i) fragmentG : null;
                if (iVar != null) {
                    iVar.v6(i15);
                }
                break;
            default:
                FelicaAddCardActivity.a aVar2 = FelicaAddCardActivity.f50949l;
                Fragment fragmentG2 = felicaAddCardActivity.getSupportFragmentManager().G("PAY#FN#ProvisionFrag");
                xn2.p pVar = fragmentG2 instanceof xn2.p ? (xn2.p) fragmentG2 : null;
                if (pVar != null) {
                    pVar.E3(i15);
                }
                break;
        }
    }
}
