package ig1;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import ch1.a5;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lig1/b;", "Lch1/a5;", "Lcom/garmin/android/apps/connectmobile/settings/model/UserSettingsDTO;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "alwaysShow", "<init>", "(Landroid/content/Context;Z)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends a5<UserSettingsDTO, Integer> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f93283f = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f93284e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, boolean z14) {
        super(context);
        context.getClass();
        this.f93284e = z14;
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        UserSettingsDTO userSettingsDTO = (UserSettingsDTO) obj;
        userSettingsDTO.getClass();
        if (this.f93284e) {
            return true;
        }
        wi1.j jVar = userSettingsDTO.f43524b;
        return (jVar != null ? jVar.f185545h : 0) >= 0;
    }

    @Override // ch1.a5
    public final Integer s(UserSettingsDTO userSettingsDTO) {
        UserSettingsDTO userSettingsDTO2 = userSettingsDTO;
        userSettingsDTO2.getClass();
        wi1.j jVar = userSettingsDTO2.f43524b;
        return Integer.valueOf(jVar != null ? jVar.f185545h : 0);
    }

    @Override // ch1.a5
    /* JADX INFO: renamed from: t */
    public final int getF27326f() {
        return View.generateViewId();
    }

    @Override // ch1.a5
    public final String u() {
        String strB = b(R.string.lbl_activity_class);
        strB.getClass();
        return strB;
    }

    @Override // ch1.a5
    public final xg1.c<Integer> v(UserSettingsDTO userSettingsDTO) {
        UserSettingsDTO userSettingsDTO2 = userSettingsDTO;
        userSettingsDTO2.getClass();
        return new hc0.c(2, this, userSettingsDTO2);
    }

    @Override // ch1.a5
    public final xg1.r<Integer> w() {
        return new a();
    }

    @Override // ch1.a5
    public final void x(Integer num, UserSettingsDTO userSettingsDTO) {
        Integer num2 = num;
        UserSettingsDTO userSettingsDTO2 = userSettingsDTO;
        userSettingsDTO2.getClass();
        if (num2 != null) {
            userSettingsDTO2.J0(num2.intValue());
            f12.l.f68084a.getClass();
            f12.l.a.a().X(num2.intValue());
        }
    }

    public /* synthetic */ b(Context context, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, (i14 & 2) != 0 ? false : z14);
    }
}
