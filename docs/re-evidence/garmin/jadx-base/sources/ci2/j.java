package ci2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import ch.qos.logback.classic.Logger;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.androiddynamicsettings.app.baseviews.views.StyledTextView;
import com.garmin.androiddynamicsettings.app.presentationlayer.SettingsActivity;
import java.util.HashMap;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lci2/j;", "Lni2/a;", "", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j implements ni2.a<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f27701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ni2.c f27702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f27703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f27704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ HashMap<String, Object> f27705e;

    public j(l lVar, ni2.c cVar, String str, String str2, HashMap<String, Object> map) {
        this.f27701a = lVar;
        this.f27702b = cVar;
        this.f27703c = str;
        this.f27704d = str2;
        this.f27705e = map;
    }

    @Override // ni2.a
    public final void a() {
        l lVar = this.f27701a;
        lVar.f27710d.getClass();
        lVar.e(false, null);
    }

    @Override // ni2.a
    public final void b(String str, Throwable th3) {
        th3.getClass();
        l lVar = this.f27701a;
        lVar.f27707a.hideProgressOverlay();
        hi2.d dVar = lVar.f27710d;
        th3.toString();
        Logger logger = hi2.d.f83889c;
        dVar.getClass();
        SettingsActivity settingsActivity = lVar.f27707a;
        if (settingsActivity.f50678o > 2) {
            androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(settingsActivity).setMessage(settingsActivity.getString(R.string.settings_try_again_later)).setPositiveButton(settingsActivity.getString(R.string.lbl_ok), new h(lVar, 1)).create();
            eVarCreate.getClass();
            settingsActivity.f50693e.a(eVarCreate);
            return;
        }
        androidx.appcompat.app.e eVarCreate2 = new androidx.appcompat.app.e.a(settingsActivity).setTitle(settingsActivity.getString(R.string.lbl_what_i_do_alert_title)).setMessage(settingsActivity.getString(R.string.txt_something_went_wrong_try_again)).setPositiveButton(settingsActivity.getString(R.string.common_retry), new g(lVar, this.f27703c, this.f27704d, this.f27705e, 1)).setNegativeButton(settingsActivity.getString(R.string.lbl_cancel), new ag0.e(29)).create();
        eVarCreate2.getClass();
        settingsActivity.f50693e.a(eVarCreate2);
    }

    @Override // ni2.a
    public final void onSuccess(Unit unit) {
        unit.getClass();
        zh2.e.f204807a.getClass();
        boolean z14 = zh2.e.f204812f.f204819f;
        l lVar = this.f27701a;
        if (z14) {
            kh2.g.a aVar = kh2.g.f104792a;
            SettingsActivity settingsActivity = lVar.f27707a;
            String string = settingsActivity.getString(R.string.settings_changes_saved);
            string.getClass();
            aVar.getClass();
            LayoutInflater layoutInflater = settingsActivity.getLayoutInflater();
            layoutInflater.getClass();
            View viewInflate = layoutInflater.inflate(R.layout.dsl_toast_with_snackbar_theme, (ViewGroup) settingsActivity.findViewById(R.id.custom_toast_layout_id));
            ((StyledTextView) viewInflate.findViewById(R.id.toast_text)).setText(string);
            Toast toast = new Toast(settingsActivity);
            toast.setDuration(0);
            toast.setView(viewInflate);
            toast.show();
        }
        lVar.f27710d.getClass();
        lVar.e(true, this.f27702b);
    }
}
