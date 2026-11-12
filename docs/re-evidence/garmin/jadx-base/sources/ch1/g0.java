package ch1;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lch1/g0;", "Lfb2/m;", "Lcom/garmin/android/apps/connectmobile/settings/model/UserSettingsDTO;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g0 extends fb2.m<UserSettingsDTO> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f27349g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s60.a f27350f;

    static {
        new a(null);
        f27349g = View.generateViewId();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(Context context) {
        super(context, true);
        context.getClass();
        this.f27350f = new s60.a(context);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        UserSettingsDTO userSettingsDTO = (UserSettingsDTO) obj;
        userSettingsDTO.getClass();
        return userSettingsDTO.f43529g;
    }

    @Override // fb2.m
    public final String q(UserSettingsDTO userSettingsDTO) {
        UserSettingsDTO userSettingsDTO2 = userSettingsDTO;
        userSettingsDTO2.getClass();
        return this.f27350f.a(Double.valueOf(userSettingsDTO2.f43530h), s60.b.ABBREVIATED);
    }

    @Override // fb2.m
    public final String r(UserSettingsDTO userSettingsDTO) {
        UserSettingsDTO userSettingsDTO2 = userSettingsDTO;
        userSettingsDTO2.getClass();
        return this.f27350f.b(userSettingsDTO2.f43530h);
    }

    @Override // fb2.m
    /* JADX INFO: renamed from: t */
    public final int getF27322f() {
        return f27349g;
    }

    @Override // fb2.m
    public final String u() {
        String string = this.f70343a.getString(R.string.lbl_css_abbreviated);
        string.getClass();
        return string;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lch1/g0$a;", "", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
