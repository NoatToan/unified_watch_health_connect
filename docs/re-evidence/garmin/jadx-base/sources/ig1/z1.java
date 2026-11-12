package ig1;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lig1/z1;", "Lfb2/m;", "Lcom/garmin/android/apps/connectmobile/devices/model/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z1 extends fb2.m<com.garmin.android.apps.connectmobile.devices.model.f> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(Context context) {
        super(context);
        context.getClass();
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        ((com.garmin.android.apps.connectmobile.devices.model.f) obj).getClass();
        return true;
    }

    @Override // fb2.m
    public final String s() {
        String strB = b(R.string.msg_stroke_rate_alerts_footer);
        strB.getClass();
        return strB;
    }

    @Override // fb2.m
    /* JADX INFO: renamed from: t */
    public final int getF93293f() {
        return View.generateViewId();
    }

    @Override // fb2.m
    public final String u() {
        String strB = b(R.string.lbl_stroke_rate_alerts);
        strB.getClass();
        return strB;
    }
}
