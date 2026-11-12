package vn2;

import androidx.fragment.app.Fragment;
import com.garmin.feature.garminpay.providers.felica.ui.FelicaAddCardActivity;
import com.garmin.feature.garminpay.providers.felica.ui.FelicaUpdateUserInfoActivity;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f178876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f178877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f178878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hn2.c f178879e;

    public /* synthetic */ g(hn2.c cVar, int i14, String str, boolean z14, int i15) {
        this.f178875a = i15;
        this.f178879e = cVar;
        this.f178876b = i14;
        this.f178877c = str;
        this.f178878d = z14;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xn2.e eVar;
        int i14 = this.f178875a;
        boolean z14 = this.f178878d;
        String str = this.f178877c;
        int i15 = this.f178876b;
        hn2.c cVar = this.f178879e;
        switch (i14) {
            case 0:
                FelicaAddCardActivity.a aVar = FelicaAddCardActivity.f50949l;
                Fragment fragmentG = ((FelicaAddCardActivity) cVar).getSupportFragmentManager().G("PAY#FN#ProvisionInfoFrag");
                eVar = fragmentG instanceof xn2.u ? (xn2.u) fragmentG : null;
                if (eVar != null) {
                    eVar.q3(i15, str, z14);
                }
                break;
            default:
                FelicaUpdateUserInfoActivity.a aVar2 = FelicaUpdateUserInfoActivity.f50988j;
                Fragment fragmentG2 = ((FelicaUpdateUserInfoActivity) cVar).getSupportFragmentManager().G("PAY#FN#FelicaEditUserInfoFragment");
                eVar = fragmentG2 instanceof xn2.h ? (xn2.h) fragmentG2 : null;
                if (eVar != null) {
                    eVar.q3(i15, str, z14);
                }
                break;
        }
    }
}
