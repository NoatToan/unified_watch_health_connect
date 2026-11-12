package ci2;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.androiddynamicsettings.app.presentationlayer.SettingsActivity;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isSuccess", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class k extends w implements e23.l<Boolean, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f27706a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar) {
        super(1);
        this.f27706a = lVar;
    }

    @Override // e23.l
    public final Unit invoke(Boolean bool) {
        Unit unit;
        boolean zBooleanValue = bool.booleanValue();
        l lVar = this.f27706a;
        hi2.d dVar = lVar.f27710d;
        SettingsActivity settingsActivity = lVar.f27707a;
        dVar.getClass();
        if (zBooleanValue) {
            String str = lVar.f27709c;
            if (str != null) {
                nh2.d dVar2 = lVar.f27712f;
                dVar2.f(settingsActivity, dVar2.f126167g, str);
                l.a(lVar);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                l.a(lVar);
            }
        } else {
            androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(settingsActivity).setTitle(settingsActivity.getString(R.string.common_network_reachability_error)).setMessage(settingsActivity.getString(R.string.settings_internet_lost_reconnect)).setPositiveButton(settingsActivity.getString(R.string.lbl_ok), new h(lVar, 2)).setCancelable(false).create();
            eVarCreate.getClass();
            settingsActivity.f50693e.a(eVarCreate);
        }
        return Unit.INSTANCE;
    }
}
