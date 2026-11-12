package ch1;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lch1/p3;", "Lfb2/m;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p3 extends fb2.m<String> {
    public p3(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        ((String) obj).getClass();
        return true;
    }

    @Override // fb2.m
    public final int t() {
        return View.generateViewId();
    }

    @Override // fb2.m
    public final String u() {
        String string = this.f70343a.getString(R.string.device_settings_respond_to_messages);
        string.getClass();
        return string;
    }
}
