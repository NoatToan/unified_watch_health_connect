package com.huawei.opendevice.open;

import android.app.ActionBar;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.analysis.i;
import com.huawei.openalliance.ad.beans.metadata.OaidRecord;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.gk;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.ab;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.utils.dq;
import com.huawei.openalliance.ad.utils.o;
import com.huawei.openalliance.ad.vw;
import com.huawei.pluginhealthzone.interactors.HealthZonePushReceiver;
import defpackage.ohh;
import java.util.Locale;

/* JADX INFO: loaded from: classes41.dex */
public class OAIDSettingActivity extends BaseSettingActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private vw f21504a;
    private TextView e;
    private gk i;
    private Switch d = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f21505b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f21506c = null;
    private boolean g = false;
    private boolean h = false;

    public static boolean d() {
        return true;
    }

    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onResume() {
        super.onResume();
        vw vwVar = this.f21504a;
        if (vwVar != null) {
            vwVar.a(false);
        }
        o.a(new Runnable() { // from class: com.huawei.opendevice.open.OAIDSettingActivity.5
            @Override // java.lang.Runnable
            public void run() {
                final boolean zEquals = "1".equals(OAIDSettingActivity.this.i.bZ());
                dq.a(new Runnable() { // from class: com.huawei.opendevice.open.OAIDSettingActivity.5.5
                    @Override // java.lang.Runnable
                    public void run() {
                        OAIDSettingActivity.this.d.setChecked(zEquals);
                        OAIDSettingActivity.this.f21504a.a(true);
                    }
                });
            }
        });
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        super.onBackPressed();
        return true;
    }

    @Override // com.huawei.opendevice.open.BaseSettingActivity, com.huawei.openalliance.ad.activity.e, com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        StringBuilder sb;
        super.onCreate(bundle);
        this.h = cc.a(this).a();
        boolean zB = cc.b(this);
        this.g = zB;
        hw.b("OAIDSettingActivity", "onCreate, isInnerDevice: %s, isChina: %s", Boolean.valueOf(zB), Boolean.valueOf(this.h));
        if (this.g && as.j(this)) {
            as.b(this, Constants.OAID_SETTING_URL);
        } else {
            if (this.h) {
                try {
                    dk.b(this, 1);
                    this.i = fp.b(this);
                    b();
                    return;
                } catch (RuntimeException e) {
                    e = e;
                    sb = new StringBuilder("onCreate ");
                    sb.append(e.getClass().getSimpleName());
                    hw.c("OAIDSettingActivity", sb.toString());
                    return;
                } catch (Throwable th) {
                    e = th;
                    sb = new StringBuilder("onCreate ex: ");
                    sb.append(e.getClass().getSimpleName());
                    hw.c("OAIDSettingActivity", sb.toString());
                    return;
                }
            }
            as.k(this);
        }
        finish();
    }

    @Override // com.huawei.opendevice.open.BaseSettingActivity, com.huawei.openalliance.ad.activity.f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.huawei.opendevice.open.BaseSettingActivity, com.huawei.openalliance.ad.activity.e
    public void a() {
        setContentView(R.layout.opendevice_oaid_setting);
        this.p = (ViewGroup) findViewById(R.id.ll_content_root);
    }

    private void b() {
        ActionBar actionBar = getActionBar();
        boolean zC = ab.c();
        if (actionBar != null) {
            if (d()) {
                actionBar.setDisplayHomeAsUpEnabled(true);
            }
            actionBar.setTitle((zC || !this.g) ? R.string.opendevice_hw_ad_service_new : R.string.opendevice_title_oaid);
        }
        setTitle((zC || !this.g) ? R.string.opendevice_hw_ad_service_new : R.string.opendevice_title_oaid);
        this.e = (TextView) findViewById(R.id.opendevice_all_advertisers_tv);
        String string = getString(R.string.opendevice_all_advertisers);
        if (!TextUtils.isEmpty(string)) {
            this.e.setText(string.toUpperCase(Locale.getDefault()));
        }
        Switch r0 = (Switch) findViewById(R.id.opendevice_limit_tracking_switch);
        this.d = r0;
        if (!this.g) {
            r0.setTrackDrawable(getResources().getDrawable(R.drawable.hiad_switch_selector));
        }
        vw vwVar = new vw(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.opendevice.open.OAIDSettingActivity.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                OAIDSettingActivity.this.d(z);
            }
        });
        this.f21504a = vwVar;
        this.d.setOnCheckedChangeListener(vwVar);
        this.f21505b = (TextView) findViewById(R.id.opendevice_limit_tracking_tv);
        this.f21506c = (TextView) findViewById(R.id.opendevice_limit_tracking_desc_tv);
        this.f21505b.setText(R.string.opendevice_limit_ad_tracking);
        this.f21506c.setText(getString(R.string.opendevice_item_reset_ad_des_new));
        TextView textView = (TextView) findViewById(R.id.opendevice_oaid_privacy_tv);
        textView.setVisibility(0);
        try {
            int iIndexOf = getString(R.string.opendevice_privacy_desc).indexOf("%1$s");
            int color = getResources().getColor(R.color.hiad_dark_mode_tag_color);
            String string2 = getString(R.string.opendevice_ad_privacy_statement);
            SpannableString spannableString = new SpannableString(getString(R.string.opendevice_privacy_desc, new Object[]{string2}));
            if (iIndexOf >= 0) {
                b bVar = new b(this);
                bVar.a(PrivacyActivity.class);
                spannableString.setSpan(new TypefaceSpan(Constants.FONT), iIndexOf, string2.length() + iIndexOf, 33);
                spannableString.setSpan(bVar, iIndexOf, string2.length() + iIndexOf, 33);
                spannableString.setSpan(new ForegroundColorSpan(color), iIndexOf, string2.length() + iIndexOf, 33);
            }
            textView.setText(spannableString);
            textView.setMovementMethod(new ohh(color, color));
        } catch (Resources.NotFoundException unused) {
            hw.d("OAIDSettingActivity", "getResources NotFoundException");
        }
        b(HealthZonePushReceiver.COMMENT_FAILED_NOTIFY, OaidRecord.OPEN_OAID_SETTING_KEY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        hw.b("OAIDSettingActivity", "handleAnonymousIdStatusChange, isChecked: %s", Boolean.valueOf(z));
        if (this.i == null) {
            this.i = fp.b(this);
        }
        this.i.e(z);
        b(z ? "51" : HealthZonePushReceiver.DATA_POST_COMMENTS_NOTIFY, z ? OaidRecord.LIMIT_OAID_OPEN_KEY : OaidRecord.LIMIT_OAID_CLOSE_KEY);
    }

    private void b(String str, String str2) {
        e(this, str, str2);
    }

    public static void e(Context context, String str, String str2) {
        new i(context).a(str, str2);
    }
}
