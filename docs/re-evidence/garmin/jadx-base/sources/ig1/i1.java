package ig1;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.HashMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lig1/i1;", "Lfb2/a;", "Lcom/garmin/android/apps/connectmobile/devices/model/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i1 extends fb2.a<com.garmin.android.apps.connectmobile.devices.model.f> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f93345i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(Context context) {
        super(context);
        context.getClass();
        this.f93345i = View.generateViewId();
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar = (com.garmin.android.apps.connectmobile.devices.model.f) obj;
        fVar.getClass();
        return fVar.f34132b.containsKey("musicEnabled");
    }

    @Override // fb2.a
    public final boolean q(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        Object obj;
        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = fVar;
        fVar2.getClass();
        HashMap<String, Object> map = fVar2.f34132b;
        return map.containsKey("musicEnabled") && (obj = map.get("musicEnabled")) != null && ((Boolean) obj).booleanValue();
    }

    @Override // fb2.a
    /* JADX INFO: renamed from: s, reason: from getter */
    public final int getF93345i() {
        return this.f93345i;
    }

    @Override // fb2.a
    public final String t() {
        String string = this.f70343a.getString(R.string.device_screen_music);
        string.getClass();
        return string;
    }

    @Override // fb2.a
    public final void y(Object obj, boolean z14) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar = (com.garmin.android.apps.connectmobile.devices.model.f) obj;
        fVar.getClass();
        fVar.y1("musicEnabled", Boolean.valueOf(z14));
    }
}
