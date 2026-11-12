package com.huawei.health.device.ui.privacy;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.ImageView;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.columnlayout.HealthColumnLinearLayout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.webview.WebViewActivity;
import defpackage.dwq;
import defpackage.ecu;
import defpackage.edn;
import defpackage.elo;
import defpackage.lon;
import defpackage.qri;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class HonorDeviceShowPrivacyActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthButton f6419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AnimationDrawable f6420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f6421c;
    private String e;
    private String f;
    private ImageView g;
    private HealthButton h;
    private HealthColumnLinearLayout i;
    private ImageView k;
    private String m;
    private String n;
    private HealthTextView o;
    private boolean d = false;
    private int j = 0;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws Throwable {
        LogUtil.a("HonorDeviceShowPrivacyActivity", "Enter onCreate():");
        overridePendingTransition(R.anim.fade_in, 0);
        super.onCreate(bundle);
        this.f6421c = BaseApplication.getContext();
        a();
        this.e = GRSManager.c(this.f6421c).getCommonCountryCode();
    }

    private void a() throws Throwable {
        setContentView(R.layout.activity_honor_device_pairing_guide_black);
        this.m = this.f6421c.getResources().getString(R.string.IDS_honor_about_privacy);
        this.f = this.f6421c.getResources().getString(R.string.IDS_honor_license_agreement);
        this.o = (HealthTextView) qsp.a(this, R.id.honor_device_privacy_content_01);
        this.h = (HealthButton) qsp.a(this, R.id.honor_devicepermission_ok_bt);
        this.f6419a = (HealthButton) qsp.a(this, R.id.honor_devicepermission_ok_cancel);
        this.i = (HealthColumnLinearLayout) qsp.a(this, R.id.honor_ll_device);
        this.k = (ImageView) qsp.a(this, R.id.honor_device_pair_guide_progress_anim);
        this.g = (ImageView) qsp.a(this, R.id.honor_pair_result_device_img);
        Intent intent = getIntent();
        if (intent != null) {
            this.j = intent.getIntExtra("honor_device_type_key", 0);
            this.d = intent.getBooleanExtra("is_support_special_midware", false);
            this.n = intent.getStringExtra("image_path");
        }
        LogUtil.a("HonorDeviceShowPrivacyActivity", "mDeviceType:", Integer.valueOf(this.j));
        if (this.k.getDrawable() instanceof AnimationDrawable) {
            this.f6420b = (AnimationDrawable) this.k.getDrawable();
        }
        this.f6420b.start();
        int i = this.j;
        if (i != 0) {
            b(i, this.g);
        } else {
            LogUtil.a("HonorDeviceShowPrivacyActivity", "imagePath not null , path is ", Integer.valueOf(i));
            if (!TextUtils.isEmpty(this.n)) {
                LogUtil.a("HonorDeviceShowPrivacyActivity", "imagePath not null , path is ", Integer.valueOf(this.j));
                this.g.setImageBitmap(elo.c(this.n));
            }
        }
        this.i.setVisibility(0);
        this.k.setVisibility(0);
        this.h.setOnClickListener(this);
        this.f6419a.setOnClickListener(this);
        b();
    }

    private void b(int i, ImageView imageView) {
        if (imageView == null) {
            LogUtil.a("HonorDeviceShowPrivacyActivity", "pairResultDeviceImage is null");
            return;
        }
        if (i == 18) {
            imageView.setImageResource(R.drawable.icon_hand_pair);
            return;
        }
        if (i == 35) {
            imageView.setImageResource(R.drawable.icon_watch_pair);
            return;
        }
        if (i == 60) {
            imageView.setImageResource(R.drawable.icon_hand_pair);
            return;
        }
        if (i == 64) {
            imageView.setImageResource(R.drawable.icon_hand_pair);
        } else if (i == 65) {
            imageView.setImageResource(R.drawable.icon_watch_pair);
        } else {
            a(i, imageView);
        }
    }

    private void a(int i, ImageView imageView) {
        edn deviceInfoUx = ecu.d().getDeviceInfoUx(i, "HonorDeviceShowPrivacyActivity");
        if (deviceInfoUx == null) {
            LogUtil.j("HonorDeviceShowPrivacyActivity", "DeviceInfoUx is null.");
            return;
        }
        int iF = deviceInfoUx.f();
        if (iF != -1) {
            if (iF == 1) {
                imageView.setImageResource(R.drawable.icon_hand_pair);
                return;
            }
            if (iF == 2) {
                imageView.setImageResource(R.drawable.icon_watch_pair);
            } else if (iF == 3) {
                imageView.setImageResource(R.drawable.icon_hand_pair);
            } else {
                LogUtil.j("HonorDeviceShowPrivacyActivity", "setImageResourceByType default.");
            }
        }
    }

    private void b() {
        String string = this.f6421c.getResources().getString(R.string.IDS_honor_services_content_double, this.f, this.m);
        if (qrs.ah(BaseApplication.getContext())) {
            string = this.f6421c.getResources().getString(R.string.IDS_honor_services_content_pad, this.f, this.m);
        }
        int[] iArr = new int[2];
        if (string.lastIndexOf(this.f) != -1) {
            iArr[0] = string.lastIndexOf(this.f);
        }
        if (string.lastIndexOf(this.m) != -1) {
            iArr[1] = string.lastIndexOf(this.m);
        }
        SpannableString spannableString = new SpannableString(string);
        b(spannableString, iArr[0], this.f.length(), 2);
        b(spannableString, iArr[1], this.m.length(), 1);
        this.o.setText(spannableString);
        this.o.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void b(SpannableString spannableString, int i, int i2, final int i3) {
        qri.d(spannableString, i, i2 + i, new ClickableSpan() { // from class: com.huawei.health.device.ui.privacy.HonorDeviceShowPrivacyActivity.4
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                LogUtil.a("HonorDeviceShowPrivacyActivity", "jump to HonorDevicePrivacyWebViewActivity");
                Intent intent = new Intent(HonorDeviceShowPrivacyActivity.this.f6421c, (Class<?>) WebViewActivity.class);
                intent.putExtra("WebViewActivity.REQUEST_URL_KEY", HonorDeviceShowPrivacyActivity.this.a(i3));
                intent.putExtra(Constants.JUMP_MODE_KEY, 10);
                if (i3 == 1) {
                    intent.putExtra("WebViewActivity.TITLE", HonorDeviceShowPrivacyActivity.this.m);
                } else {
                    intent.putExtra("WebViewActivity.TITLE", HonorDeviceShowPrivacyActivity.this.f);
                }
                HonorDeviceShowPrivacyActivity.this.startActivity(intent);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setColor(HonorDeviceShowPrivacyActivity.this.f6421c.getResources().getColor(com.huawei.ui.commonui.R.color.common_colorAccent));
                textPaint.setUnderlineText(false);
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.honor_devicepermission_ok_bt) {
            LogUtil.a("HonorDeviceShowPrivacyActivity", "click ok");
            dwq.c(true);
            b(1);
        } else if (id == R.id.honor_devicepermission_ok_cancel) {
            b(0);
            LogUtil.a("HonorDeviceShowPrivacyActivity", "click cancel");
        } else {
            LogUtil.j("HonorDeviceShowPrivacyActivity", "click nothing");
        }
    }

    private void b(int i) {
        LogUtil.a("HonorDeviceShowPrivacyActivity", "setResult data:", Integer.valueOf(i));
        this.i.setVisibility(4);
        this.k.setVisibility(4);
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putInt("honor_show_privacy_key", i);
        intent.putExtras(bundle);
        intent.putExtra("is_support_special_midware", this.d);
        setResult(3, intent);
        finish();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(int i) {
        String str;
        String strA = LanguageUtil.a(Locale.getDefault());
        String script = Locale.getDefault().getScript();
        if (TextUtils.isEmpty(this.e)) {
            String strE = SharedPreferenceManager.e(this.f6421c, Integer.toString(PrebakedEffectId.RT_SNIPER_RIFLE), "select_country");
            this.e = strE;
            if (TextUtils.isEmpty(strE)) {
                this.e = "GB";
            }
        }
        String country = Locale.getDefault().getCountry();
        if (TextUtils.isEmpty(script)) {
            str = strA + "_" + country;
        } else {
            str = strA + "_" + script + "_" + country;
        }
        String strD = lon.c().d("domain_honor");
        if (i == 1) {
            return strD + "/minisite/cloudservice/Health/privacy-statement.htm?country=" + this.e + com.huawei.openalliance.ad.constant.Constants.LANGUAGE + str;
        }
        if (i == 2) {
            return strD + "/minisite/cloudservice/Health/terms.htm?country=" + this.e + com.huawei.openalliance.ad.constant.Constants.LANGUAGE + str;
        }
        LogUtil.j("HonorDeviceShowPrivacyActivity", "getUrl error type");
        return "";
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
