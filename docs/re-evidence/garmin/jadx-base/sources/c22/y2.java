package c22;

import android.content.SharedPreferences;
import com.garmin.android.apps.connectmobile.domain.watchers.PrimaryDevicePromoWatcher;
import com.garmin.android.apps.connectmobile.domain.watchers.UserFocusPromoWatcher;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class y2 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23759b;

    public /* synthetic */ y2(Object obj, int i14) {
        this.f23758a = i14;
        this.f23759b = obj;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        switch (this.f23758a) {
            case 0:
                z2 z2Var = (z2) this.f23759b;
                if (p005kotlin.jvm.internal.s.g(str, z2Var.f23764m)) {
                    z2Var.m(z2Var.n(z2Var.f23765n, str));
                }
                break;
            case 1:
                ((q53.t) this.f23759b).i(Unit.INSTANCE);
                break;
            case 2:
                PrimaryDevicePromoWatcher.listener$lambda$0((PrimaryDevicePromoWatcher) this.f23759b, sharedPreferences, str);
                break;
            case 3:
                UserFocusPromoWatcher.listener$lambda$0((UserFocusPromoWatcher) this.f23759b, sharedPreferences, str);
                break;
            default:
                t92.a aVar = (t92.a) this.f23759b;
                if (str != null) {
                    if (d53.w.z(str, "_consent_user_option", false)) {
                        aVar.n(str, "_consent_user_option");
                    } else if (d53.w.z(str, "_consent_source_type", false)) {
                        aVar.n(str, "_consent_source_type");
                    } else if (d53.w.z(str, "_consent_enforcement_state", false)) {
                        aVar.n(str, "_consent_enforcement_state");
                    } else if (d53.w.z(str, "_consent_delete_status", false)) {
                        aVar.n(str, "_consent_delete_status");
                    } else if (d53.w.z(str, "_consent_user_metadata", false)) {
                        aVar.n(str, "_consent_user_metadata");
                    }
                    break;
                }
                break;
        }
    }
}
