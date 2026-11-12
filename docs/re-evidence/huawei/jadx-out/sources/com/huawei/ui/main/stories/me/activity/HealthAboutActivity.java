package com.huawei.ui.main.stories.me.activity;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.TypefaceSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcloudmodel.https.HttpResCallBack;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.pluginachievement.manager.model.KakaConstants;
import com.huawei.profile.profile.ProfileExtendConstants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.me.activity.HealthAboutActivity;
import defpackage.lua;
import defpackage.pee;
import defpackage.qre;
import defpackage.qri;
import defpackage.qrs;
import defpackage.wjs;
import defpackage.wmt;
import defpackage.wvi;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.IoUtils;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class HealthAboutActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f28420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f28421c;
    private HealthTextView e;
    private HealthTextView f;
    private CustomTitleBar g;
    private HealthTextView i;
    private String j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f28419a = 0;
    private long d = 0;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws Throwable {
        super.onCreate(bundle);
        setContentView(R.layout.health_show_settings_about);
        d();
    }

    public void a() {
        this.f28420b.setVisibility(0);
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            this.f28421c.setImageResource(R.mipmap.ic_arrow_previous);
        } else {
            this.f28421c.setImageResource(R.mipmap.ic_health_list_arrow_gray);
        }
        String[] strArr = {"GB", "CZ", "NL", "ES", "FI", "FR", "DE", "GR", "HU", "IT", "NO", "PL", "PT", "RO", "SK"};
        String[] strArr2 = {"0800 088 6700", "00420-239-018-465", "0800-9188", "0034-900 483 303", "00358-923138998", "0033-800 972 285", "0049-800 7788 6633", "0030-2111988000", "0036-80482934", "0039-800 191 435", "0047-21629090", "0048-800811110", "0800 100 066", "0040-800400896", "00421-268-622-626"};
        String[] strArr3 = {"en", "cs", "nl", "es", "fi", "fr", "de", "el", "hu", "it", "nb", "pl", "pt", "ro", "sk"};
        int[] iArr = {R.string.IDS_hw_city_name_GB, R.string.IDS_hw_city_name_CS, R.string.IDS_hw_city_name_NL, R.string.IDS_hw_city_name_ES, R.string.IDS_hw_city_name_FI, R.string.IDS_hw_city_name_FR, R.string.IDS_hw_city_name_DE, R.string.IDS_hw_city_name_GR, R.string.IDS_hw_city_name_HU, R.string.IDS_hw_city_name_IT, R.string.IDS_hw_city_name_NO, R.string.IDS_hw_city_name_PL, R.string.IDS_hw_city_name_PT, R.string.IDS_hw_city_name_RO, R.string.IDS_hw_city_name_SK};
        HashMap map = new HashMap();
        for (int i = 0; i < 15; i++) {
            map.put(strArr[i], strArr2[i]);
        }
        HashMap map2 = new HashMap();
        for (int i2 = 0; i2 < 15; i2++) {
            map2.put(strArr[i2], Integer.valueOf(iArr[i2]));
        }
        HashMap map3 = new HashMap();
        for (int i3 = 0; i3 < 15; i3++) {
            map3.put(strArr[i3], strArr3[i3]);
        }
        a(map3, map, map2);
    }

    private void a(Map<String, String> map, Map<String, String> map2, Map<String, Integer> map3) {
        String country = Locale.getDefault().getCountry();
        LogUtil.a("HealthAboutActivity", "setHotNumber localCountry = ", country);
        String strU = CommonUtil.u();
        LogUtil.a("HealthAboutActivity", "setHotNumber current language : ", strU);
        if (!strU.equals(map.get(country))) {
            this.f28420b.setVisibility(8);
        }
        if (map2.get(country) != null) {
            String str = map2.get(country);
            this.j = str;
            this.i.setText(str);
        } else {
            this.f28420b.setVisibility(8);
        }
        if (map3.get(country) != null) {
            this.e.setText(map3.get(country).intValue());
        } else {
            this.f28420b.setVisibility(8);
        }
        if (CommonUtil.cs()) {
            this.f28420b.setVisibility(8);
        }
    }

    public void d() throws Throwable {
        this.f28421c = (ImageView) findViewById(R.id.hw_show_about_app_center_img);
        this.f28420b = (LinearLayout) findViewById(R.id.hw_show_about_app_center);
        this.i = (HealthTextView) findViewById(R.id.hw_show_about_app_center_phone);
        this.e = (HealthTextView) findViewById(R.id.hw_show_about_app_center_city);
        this.f = (HealthTextView) findViewById(R.id.hw_show_about_app_version_number);
        this.g = (CustomTitleBar) findViewById(R.id.me_about_title_layout);
        b((ImageView) findViewById(R.id.hw_show_about_app_pic));
        if (Utils.o()) {
            a();
        } else {
            this.f28420b.setVisibility(8);
        }
        this.f.setOnClickListener(this);
        this.f28420b.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.me.activity.HealthAboutActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (TextUtils.isEmpty(HealthAboutActivity.this.j)) {
                    return;
                }
                try {
                    Intent intent = new Intent("android.intent.action.DIAL", Uri.parse(KakaConstants.SCHEME_TEL + HealthAboutActivity.this.j));
                    intent.setFlags(268435456);
                    HealthAboutActivity.this.startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    LogUtil.e("HealthAboutActivity", "initView onClick ActivityNotFoundException e = ", e.getMessage());
                }
            }
        });
        c();
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.hw_copyrights);
        healthTextView.setText(wvi.b());
        if (qrs.v()) {
            ((HealthTextView) findViewById(R.id.hw_show_about_app_name)).setTextSize(1, 30.0f);
            healthTextView.setTextSize(1, 26.0f);
            ((HealthTextView) findViewById(R.id.hw_show_about_app_center_hot_linear)).setTextSize(1, 26.0f);
            this.i.setTextSize(1, 26.0f);
            this.e.setTextSize(1, 26.0f);
        }
        e();
    }

    private void e() {
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.hw_show_about_record_number);
        if (Utils.o()) {
            healthTextView.setVisibility(8);
        } else {
            healthTextView.setVisibility(0);
            healthTextView.setOnClickListener(new View.OnClickListener() { // from class: vtr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f51586c.d(view);
                }
            });
        }
    }

    public /* synthetic */ void d(View view) {
        if (qrs.r()) {
            LogUtil.j("HealthAboutActivity", "click too fast");
        } else {
            GRSManager.c(BaseApplication.getContext()).d("recordNumberQueryUrl", new AnonymousClass5());
        }
    }

    /* JADX INFO: renamed from: com.huawei.ui.main.stories.me.activity.HealthAboutActivity$5, reason: invalid class name */
    public class AnonymousClass5 implements GrsQueryCallback {
        AnonymousClass5() {
        }

        @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
        public void onCallBackSuccess(final String str) {
            LogUtil.a("HealthAboutActivity", "record number query host: ", str);
            HandlerExecutor.b(new Runnable() { // from class: vtv
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.a(str);
                }
            });
        }

        public /* synthetic */ void a(String str) {
            HealthAboutActivity.this.e(str);
        }

        @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
        public void onCallBackFail(int i) {
            LogUtil.j("HealthAboutActivity", "onCallBackFail: ", Integer.valueOf(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str));
        ComponentName componentNameResolveActivity = intent.resolveActivity(getPackageManager());
        if (componentNameResolveActivity != null) {
            LogUtil.a("HealthAboutActivity", "startWebView browser.");
            qrs.c(intent, componentNameResolveActivity.getPackageName(), this, qre.f(com.huawei.ui.commonui.R.string.IDS_browser_app_name));
        }
    }

    private void b(ImageView imageView) throws Throwable {
        if (CommonUtil.ap()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (CommonUtil.d() > jCurrentTimeMillis || jCurrentTimeMillis > CommonUtil.b()) {
                return;
            }
            imageView.setImageResource(getResources().getIdentifier("healthlogo_hw_app_beta", "mipmap", BaseApplication.getAppPackage()));
            return;
        }
        if (CommonUtil.ca()) {
            Bitmap bitmapB = b("healthbasic", "healthlogo_ic_about_app_icon_demo.webp");
            if (bitmapB == null) {
                imageView.setImageResource(R.drawable.healthlogo_icon_app);
                return;
            } else {
                imageView.setImageBitmap(bitmapB);
                return;
            }
        }
        LogUtil.j("HealthAboutActivity", "isShowBetaLogo is other version");
    }

    private void c() {
        SpannableString spannableString;
        String strA;
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.hw_show_about_app_version_number);
        healthTextView.setText(String.format(Locale.ENGLISH, getString(R.string.IDS_hw_show_version_name), CommonUtil.a(getApplicationContext())));
        HealthTextView healthTextView2 = (HealthTextView) findViewById(R.id.hw_show_about_service_and_policy);
        if (Utils.h()) {
            String strF = qre.f(R.string.IDS_hw_show_setting_about_service_item);
            String string = getString(R.string.IDS_hwh_about_privacy_notice);
            boolean zIsKoreaCountry = LoginInit.getInstance(BaseApplication.getContext()).isKoreaCountry();
            if (zIsKoreaCountry) {
                strA = qre.a(R.string.IDS_hwh_me_about_privacy_agreement_korea, strF, string, qre.f(R.string.IDS_hwh_location_service_terms), qre.f(R.string.IDS_hwh_location_info_terms));
            } else {
                strA = qre.a(R.string.IDS_two_parts_and, strF, string);
            }
            spannableString = new SpannableString(strA);
            a(spannableString, strF, "HealthUserAgreement", this);
            a(spannableString, string, "HealthPrivacy", this);
            if (zIsKoreaCountry) {
                a(spannableString, qre.f(R.string.IDS_hwh_location_service_terms), "LocationServiceTerms", this);
                a(spannableString, qre.f(R.string.IDS_hwh_location_info_terms), "LocationInfoTerms", this);
            }
        } else {
            spannableString = new SpannableString(getResources().getString(R.string.IDS_hw_show_setting_about_service_item));
            int length = getString(R.string.IDS_hw_show_setting_about_service_item).length();
            spannableString.setSpan(new wmt(this, "HealthUserAgreement"), 0, length, 17);
            spannableString.setSpan(new TypefaceSpan(Constants.FONT), 0, length, 33);
        }
        healthTextView2.setMovementMethod(LinkMovementMethod.getInstance());
        healthTextView2.setHighlightColor(getResources().getColor(android.R.color.transparent));
        healthTextView2.setText(spannableString);
        if (qrs.v()) {
            healthTextView.setTextSize(1, 26.0f);
            healthTextView2.setTextSize(1, 26.0f);
        }
    }

    private void a(SpannableString spannableString, String str, final String str2, Context context) {
        int iIndexOf = spannableString.toString().indexOf(str);
        if (iIndexOf == -1) {
            ReleaseLogUtil.d("HealthAboutActivity", "setSpan index ", Integer.valueOf(iIndexOf), " spannableString ", spannableString, " text ", str, " type ", str2);
        } else {
            qri.a(spannableString, str, new TypefaceSpan(Constants.FONT));
            qri.a(spannableString, str, new wmt(context, str2, true, new BaseResponseCallback() { // from class: vtx
                @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
                public final void onResponse(int i, Object obj) {
                    this.f51589b.a(str2, i, obj);
                }
            }));
        }
    }

    public /* synthetic */ void a(String str, int i, Object obj) {
        if (i != 0) {
            return;
        }
        if (!"HealthPrivacy".equals(str) || !lua.a(Integer.toString(10000), "agr_query_rpt", false)) {
            LogUtil.j("HealthAboutActivity", "setSpan is privacy ", Boolean.valueOf("HealthPrivacy".equals(str)));
        } else {
            wjs.a(BaseApplication.getContext(), new a(this));
        }
    }

    public static class a implements HttpResCallBack {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<HealthAboutActivity> f28423c;

        public a(HealthAboutActivity healthAboutActivity) {
            this.f28423c = new WeakReference<>(healthAboutActivity);
        }

        @Override // com.huawei.hwcloudmodel.https.HttpResCallBack
        public void onFinished(int i, String str) {
            ReleaseLogUtil.c("HealthAboutActivity", "agrSign First sign resultCode = ", Integer.valueOf(i), " result = ", str);
            if (i != 200 || !wvi.c(str)) {
                ReleaseLogUtil.d("HealthAboutActivity", "agrSign privacy sign failed");
                return;
            }
            final HealthAboutActivity healthAboutActivity = this.f28423c.get();
            if (healthAboutActivity == null) {
                ReleaseLogUtil.d("HealthAboutActivity", "agrSign First sign handler is null");
            } else {
                lua.d(Integer.toString(10000), "agr_query_rpt", false);
                healthAboutActivity.g.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: vtw
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        HealthAboutActivity.a.a(healthAboutActivity, view);
                    }
                });
            }
        }

        public static /* synthetic */ void a(HealthAboutActivity healthAboutActivity, View view) {
            healthAboutActivity.finish();
            healthAboutActivity.setResult(2);
        }
    }

    private Bitmap b(String str, String str2) throws Throwable {
        InputStream inputStreamE;
        InputStream inputStream = null;
        try {
            inputStreamE = pee.e(str, str2);
            try {
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamE);
                    IoUtils.c(inputStreamE);
                    return bitmapDecodeStream;
                } catch (Exception unused) {
                    LogUtil.e("HealthAboutActivity", "getBitmap catch Exception");
                    IoUtils.c(inputStreamE);
                    return null;
                }
            } catch (Throwable th) {
                inputStream = inputStreamE;
                th = th;
                IoUtils.c(inputStream);
                throw th;
            }
        } catch (Exception unused2) {
            inputStreamE = null;
        } catch (Throwable th2) {
            th = th2;
            IoUtils.c(inputStream);
            throw th;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f) {
            if (this.f28419a == 0) {
                this.d = System.currentTimeMillis();
            }
            int i = this.f28419a;
            if (i < 6) {
                this.f28419a = i + 1;
                this.d = System.currentTimeMillis();
                return;
            }
            this.f28419a = 0;
            StorageParams storageParams = new StorageParams();
            if (System.currentTimeMillis() - this.d <= ProfileExtendConstants.TIME_OUT) {
                SharedPreferenceManager.e(getApplicationContext(), "developeroptions", "developerswitch", "1", storageParams);
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
