package ig1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;

/* JADX INFO: loaded from: classes10.dex */
public class s extends fb2.e<UserSettingsDTO> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f93399e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GCMComplexTwoLineButton f93400d;

    public s(Context context) {
        super(context);
        this.f93400d = null;
    }

    @Override // fb2.e
    public final View a() {
        if (this.f93400d == null) {
            this.f93400d = fb2.g.d(this.f70343a, R.id.user_settings_birth_date, b(R.string.lbl_birthdate), null);
        }
        this.f93400d.setOnClickListener(new go1.g0(this, 20));
        return this.f93400d;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO] */
    @Override // fb2.e
    public final boolean g(i.c cVar, UserSettingsDTO userSettingsDTO) {
        UserSettingsDTO userSettingsDTO2 = userSettingsDTO;
        GCMComplexTwoLineButton gCMComplexTwoLineButton = (GCMComplexTwoLineButton) cVar.findViewById(R.id.user_settings_birth_date);
        if (gCMComplexTwoLineButton != null) {
            this.f93400d = gCMComplexTwoLineButton;
        } else {
            this.f93400d = (GCMComplexTwoLineButton) a();
        }
        this.f70344b = userSettingsDTO2;
        this.f93400d.setButtonBottomLeftLabel(new r(this).a(userSettingsDTO2.F()));
        return false;
    }

    @Override // fb2.e
    public final /* bridge */ /* synthetic */ boolean h(UserSettingsDTO userSettingsDTO) {
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO] */
    @Override // fb2.e
    public final boolean k(UserSettingsDTO userSettingsDTO) {
        UserSettingsDTO userSettingsDTO2 = userSettingsDTO;
        this.f70344b = userSettingsDTO2;
        this.f93400d.setButtonBottomLeftLabel(new r(this).a(userSettingsDTO2.F()));
        return false;
    }
}
