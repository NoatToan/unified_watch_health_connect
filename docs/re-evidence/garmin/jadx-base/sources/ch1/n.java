package ch1;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lch1/n;", "Lfb2/z;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "deviceUnitId", "", "hasDescription", "<init>", "(Landroid/content/Context;JZ)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends fb2.z<Object> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f27417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f27418f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f27419g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, long j8, boolean z14) {
        super(context);
        context.getClass();
        this.f27417e = j8;
        this.f27418f = z14;
        this.f27419g = View.generateViewId();
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        obj.getClass();
        return km2.a.d(this.f27417e, km2.a.b());
    }

    @Override // fb2.z
    public final String q(Object obj) {
        obj.getClass();
        boolean zN = ((zb0.d0) KoinJavaComponent.get$default(zb0.d0.class, null, null, 6, null)).n(this.f27417e);
        Context context = this.f70343a;
        if (zN) {
            String string = context.getString(R.string.lbl_on);
            string.getClass();
            return string;
        }
        String string2 = context.getString(R.string.lbl_off);
        string2.getClass();
        return string2;
    }

    @Override // fb2.z
    public final String r() {
        if (this.f27418f) {
            return this.f70343a.getString(R.string.device_settings_audio_prompts_footer);
        }
        return null;
    }

    @Override // fb2.z
    /* JADX INFO: renamed from: s, reason: from getter */
    public final int getF27419g() {
        return this.f27419g;
    }

    @Override // fb2.z
    public final String t() {
        String string = this.f70343a.getString(R.string.device_settings_audio_prompts);
        string.getClass();
        return string;
    }
}
