package ig1;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lig1/q0;", "Lfb2/z;", "Lcom/garmin/android/apps/connectmobile/devices/model/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q0 extends fb2.z<com.garmin.android.apps.connectmobile.devices.model.f> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f93393e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(Context context) {
        super(context);
        context.getClass();
        this.f93393e = View.generateViewId();
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar = (com.garmin.android.apps.connectmobile.devices.model.f) obj;
        fVar.getClass();
        return fVar.f34132b.containsKey("heartRateAlertEnabled");
    }

    @Override // fb2.z
    public final String q(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = fVar;
        fVar2.getClass();
        String string = this.f70343a.getString(fVar2.h1().booleanValue() ? R.string.lbl_on : R.string.lbl_off);
        string.getClass();
        return string;
    }

    @Override // fb2.z
    /* JADX INFO: renamed from: s, reason: from getter */
    public final int getF93393e() {
        return this.f93393e;
    }

    @Override // fb2.z
    public final String t() {
        String string = this.f70343a.getString(R.string.hr_alerts_setting_title);
        string.getClass();
        return string;
    }
}
