package vn2;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.felica.ui.FelicaUpdateUserInfoActivity;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class o0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FelicaUpdateUserInfoActivity f178920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pn2.t f178921c;

    public /* synthetic */ o0(FelicaUpdateUserInfoActivity felicaUpdateUserInfoActivity, pn2.t tVar, int i14) {
        this.f178919a = i14;
        this.f178920b = felicaUpdateUserInfoActivity;
        this.f178921c = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i14 = this.f178919a;
        pn2.t tVar = this.f178921c;
        FelicaUpdateUserInfoActivity felicaUpdateUserInfoActivity = this.f178920b;
        switch (i14) {
            case 0:
                FelicaUpdateUserInfoActivity.a aVar = FelicaUpdateUserInfoActivity.f50988j;
                androidx.fragment.app.v supportFragmentManager = felicaUpdateUserInfoActivity.getSupportFragmentManager();
                supportFragmentManager.getClass();
                androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
                aVar2.d("PAY#FN#FelicaEditUserInfoFragment");
                xn2.e.a aVar3 = xn2.e.f191693i;
                xn2.h.f191707l.getClass();
                xn2.h hVar = new xn2.h();
                aVar3.getClass();
                tVar.getClass();
                Bundle arguments = hVar.getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                    hVar.setArguments(arguments);
                }
                arguments.putParcelable("extra.initial_user_info", tVar);
                aVar2.j(R.id.content_frame, hVar, "PAY#FN#FelicaEditUserInfoFragment", 1);
                aVar2.e();
                break;
            default:
                FelicaUpdateUserInfoActivity.a aVar4 = FelicaUpdateUserInfoActivity.f50988j;
                felicaUpdateUserInfoActivity.getSupportFragmentManager().a0(1, "PAY#FN#FelicaReadOnlyUserInfoFragment");
                androidx.fragment.app.v supportFragmentManager2 = felicaUpdateUserInfoActivity.getSupportFragmentManager();
                supportFragmentManager2.getClass();
                androidx.fragment.app.a aVar5 = new androidx.fragment.app.a(supportFragmentManager2);
                aVar5.d("PAY#FN#FelicaReadOnlyUserInfoFragment");
                xn2.t.f191733c.getClass();
                tVar.getClass();
                xn2.t tVar2 = new xn2.t();
                Bundle bundle = new Bundle();
                bundle.putParcelable("extra.initial_user_info", tVar);
                tVar2.setArguments(bundle);
                aVar5.j(R.id.content_frame, tVar2, "PAY#FN#FelicaReadOnlyUserInfoFragment", 1);
                aVar5.e();
                break;
        }
    }
}
