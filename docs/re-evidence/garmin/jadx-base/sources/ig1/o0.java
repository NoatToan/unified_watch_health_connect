package ig1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import java.text.NumberFormat;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lig1/o0;", "Landroid/view/View$OnClickListener;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f93383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.devices.model.f f93384b;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ig1/o0$a", "Lcom/garmin/android/apps/connectmobile/settings/activityoptions/b$a;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements com.garmin.android.apps.connectmobile.settings.activityoptions.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m0 f93385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.devices.model.f f93386b;

        public a(m0 m0Var, com.garmin.android.apps.connectmobile.devices.model.f fVar) {
            this.f93385a = m0Var;
            this.f93386b = fVar;
        }

        @Override // com.garmin.android.apps.connectmobile.settings.activityoptions.b.a
        public final void e(double d14) {
            m0 m0Var = this.f93385a;
            GCMComplexOneLineButton gCMComplexOneLineButton = m0Var.f93324g;
            int i14 = m0.f93361m;
            int i15 = (int) d14;
            gCMComplexOneLineButton.setButtonRightLabel(m0Var.f70343a.getString(R.string.devices_lbl_bpm_with_format, NumberFormat.getInstance().format(i15)));
            com.garmin.android.apps.connectmobile.devices.model.f fVar = this.f93386b;
            fVar.getClass();
            if (i15 < 30 || i15 > 250) {
                i15 = 120;
            }
            fVar.y1("heartRateAlertCustomLow", Integer.valueOf(i15));
            m0Var.p();
        }
    }

    public o0(m0 m0Var, com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        this.f93383a = m0Var;
        this.f93384b = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        view2.getClass();
        int i14 = m0.f93361m;
        m0 m0Var = this.f93383a;
        Context context = m0Var.f70343a;
        com.garmin.android.apps.connectmobile.devices.model.f fVar = this.f93384b;
        new com.garmin.android.apps.connectmobile.settings.activityoptions.b(context, new a(m0Var, fVar), String.valueOf(fVar.g0()), m0Var.f70343a.getString(R.string.txt_activity_level_low_label), 2, m0Var.f70343a.getString(R.string.devices_lbl_bpm), "0123456789", null, -1, fVar.f0());
    }
}
