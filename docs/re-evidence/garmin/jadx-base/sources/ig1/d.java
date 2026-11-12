package ig1;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lig1/d;", "Lfb2/m;", "Lcom/garmin/android/apps/connectmobile/devices/model/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends fb2.m<com.garmin.android.apps.connectmobile.devices.model.f> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f93293f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context);
        context.getClass();
        this.f93293f = View.generateViewId();
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        ((com.garmin.android.apps.connectmobile.devices.model.f) obj).getClass();
        return true;
    }

    @Override // fb2.m
    /* JADX INFO: renamed from: t, reason: from getter */
    public final int getF93293f() {
        return this.f93293f;
    }

    @Override // fb2.m
    public final String u() {
        String string = this.f70343a.getString(R.string.device_settings_audio_prompts);
        string.getClass();
        return string;
    }
}
