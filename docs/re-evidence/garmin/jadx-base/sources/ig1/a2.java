package ig1;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lig1/a2;", "Lfb2/a;", "Lcom/garmin/android/apps/connectmobile/devices/model/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a2 extends fb2.a<com.garmin.android.apps.connectmobile.devices.model.f> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(Context context) {
        super(context);
        context.getClass();
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar = (com.garmin.android.apps.connectmobile.devices.model.f) obj;
        fVar.getClass();
        return fVar.f34132b.containsKey("strokeTypeDetectionEnabled");
    }

    @Override // fb2.a
    public final boolean q(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar2 = fVar;
        fVar2.getClass();
        Object obj = fVar2.f34132b.get("strokeTypeDetectionEnabled");
        obj.getClass();
        return ((Boolean) obj).booleanValue();
    }

    @Override // fb2.a
    public final String r() {
        String strB = b(R.string.msg_stroke_type_detection_footer);
        strB.getClass();
        return strB;
    }

    @Override // fb2.a
    /* JADX INFO: renamed from: s */
    public final int getF71600i() {
        return View.generateViewId();
    }

    @Override // fb2.a
    public final String t() {
        String strB = b(R.string.lbl_stroke_type_detection);
        strB.getClass();
        return strB;
    }

    @Override // fb2.a
    public final void y(Object obj, boolean z14) {
        com.garmin.android.apps.connectmobile.devices.model.f fVar = (com.garmin.android.apps.connectmobile.devices.model.f) obj;
        fVar.getClass();
        fVar.y1("strokeTypeDetectionEnabled", Boolean.valueOf(z14));
    }
}
