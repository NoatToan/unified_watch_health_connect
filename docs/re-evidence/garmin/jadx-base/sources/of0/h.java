package of0;

import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.steps.FirstTimeUseFragment;
import p005kotlin.Unit;
import r22.o0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirstTimeUseFragment f131681b;

    public /* synthetic */ h(FirstTimeUseFragment firstTimeUseFragment, int i14) {
        this.f131680a = i14;
        this.f131681b = firstTimeUseFragment;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f131680a;
        FirstTimeUseFragment firstTimeUseFragment = this.f131681b;
        switch (i14) {
            case 0:
                int i15 = FirstTimeUseFragment.f34793m;
                firstTimeUseFragment.getChildFragmentManager().D();
                if (!firstTimeUseFragment.K6() && !firstTimeUseFragment.J6()) {
                    o0.a aVar = o0.f149771c;
                    String string = firstTimeUseFragment.getString(R.string.lbl_unable_to_launch_ecg_app);
                    String string2 = firstTimeUseFragment.getString(R.string.msg_device_busy_during_setup);
                    e eVar = new e(firstTimeUseFragment, 9);
                    e eVar2 = new e(firstTimeUseFragment, 10);
                    aVar.getClass();
                    o0.a.a(string, string2, R.string.lbl_retry, eVar, R.string.lbl_exit_setup_capitalized, eVar2).show(firstTimeUseFragment.getChildFragmentManager(), "DeviceNotConnectedDialog");
                }
                break;
            case 1:
                int i16 = FirstTimeUseFragment.f34793m;
                firstTimeUseFragment.getChildFragmentManager().D();
                if (!firstTimeUseFragment.K6() && !firstTimeUseFragment.J6()) {
                    o0.a.b(o0.f149771c, firstTimeUseFragment.getString(R.string.lbl_device_battery_low), firstTimeUseFragment.getString(R.string.msg_ecg_device_battery_low, "10"), R.string.lbl_ok, null, 0, null, 48).show(firstTimeUseFragment.getChildFragmentManager(), "DeviceNotConnectedDialog");
                }
                break;
            case 2:
                int i17 = FirstTimeUseFragment.f34793m;
                firstTimeUseFragment.getChildFragmentManager().D();
                if (!firstTimeUseFragment.K6() && !firstTimeUseFragment.J6()) {
                    o0.a aVar2 = o0.f149771c;
                    String string3 = firstTimeUseFragment.getString(R.string.connect_iq_device_not_connected_title);
                    String string4 = firstTimeUseFragment.getString(R.string.msg_device_not_connected_during_setup);
                    e eVar3 = new e(firstTimeUseFragment, 5);
                    e eVar4 = new e(firstTimeUseFragment, 6);
                    aVar2.getClass();
                    o0.a.a(string3, string4, R.string.lbl_retry, eVar3, R.string.lbl_exit_setup_capitalized, eVar4).show(firstTimeUseFragment.getChildFragmentManager(), "DeviceNotConnectedDialog");
                }
                break;
            default:
                int i18 = FirstTimeUseFragment.f34793m;
                Fragment fragmentG = firstTimeUseFragment.getChildFragmentManager().G("DeviceNotConnectedDialog");
                if (fragmentG instanceof o0) {
                    ((o0) fragmentG).dismiss();
                }
                firstTimeUseFragment.getChildFragmentManager().D();
                o0.a aVar3 = o0.f149771c;
                String string5 = firstTimeUseFragment.getString(R.string.lbl_ecg_app_activation_failed);
                String string6 = firstTimeUseFragment.getString(R.string.msg_ecg_app_activation_failed);
                e eVar5 = new e(firstTimeUseFragment, 3);
                e eVar6 = new e(firstTimeUseFragment, 4);
                aVar3.getClass();
                o0.a.a(string5, string6, R.string.lbl_retry, eVar5, R.string.lbl_exit_setup_capitalized, eVar6).show(firstTimeUseFragment.getChildFragmentManager(), (String) null);
                break;
        }
        return Unit.INSTANCE;
    }
}
