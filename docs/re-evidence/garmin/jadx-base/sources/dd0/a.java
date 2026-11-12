package dd0;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import zb0.u0;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.devices.model.l f59152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public cd0.g f59153b;

    public void ca(u0 u0Var) {
        String str = u0Var.f203855b;
        if (TextUtils.isEmpty(str)) {
            da();
        }
        try {
            this.f59153b = (cd0.g) Class.forName(str).newInstance();
            ea();
            i2.a(a2.DEVICES, "AbstractWizardActivity", this.f59153b.getClass().getSimpleName().concat(" device setup strategy initialized"));
        } catch (ClassCastException e4) {
            i2.e(a2.DEVICES, "AbstractWizardActivity", e4);
            da();
        } catch (ClassNotFoundException e14) {
            i2.e(a2.DEVICES, "AbstractWizardActivity", e14);
            da();
        } catch (IllegalAccessException e15) {
            i2.e(a2.DEVICES, "AbstractWizardActivity", e15);
            da();
        } catch (InstantiationException e16) {
            i2.e(a2.DEVICES, "AbstractWizardActivity", e16);
            da();
        }
    }

    public final void da() {
        Toast.makeText(this, R.string.txt_error_occurred, 0).show();
        finish();
    }

    public void ea() {
        cd0.g gVar = this.f59153b;
        com.garmin.android.apps.connectmobile.devices.model.l lVar = this.f59152a;
        gVar.f26813a = this;
        gVar.f26814b = lVar;
        gVar.f26816d = null;
        gVar.f26796g = null;
    }

    public void fa(Bundle bundle) {
        if (bundle != null) {
            this.f59152a = (com.garmin.android.apps.connectmobile.devices.model.l) bundle.getParcelable("GCM_deviceDTO");
        }
        if (this.f59152a == null) {
            da();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm_device_setup_wizard_3_0);
        fa(getIntent().getExtras());
        initActionBar(true, this.f59152a.getF143516f());
        if (this.f59152a == null) {
            da();
        }
        u0 u0Var = (u0) u0.f203782n6.get(this.f59152a.getF143517g());
        if (u0Var == null) {
            da();
        }
        ca(u0Var);
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        i.f59167a.getClass();
        i.a();
    }
}
