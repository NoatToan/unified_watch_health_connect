package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.TypefaceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.common.util.VersionIsCloud;
import com.huawei.haf.common.dfx.process.ProcessMonitor;
import com.huawei.haf.dynamic.DynamicResourcesLoader;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.health.MainActivityHandlerMsg;
import com.huawei.health.R;
import com.huawei.health.interactor.MainInteractors;
import com.huawei.health.utils.MainInteractorsUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.login.ui.login.util.SharedPreferenceUtil;
import com.huawei.openalliance.ad.constant.Action;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import com.huawei.ui.commonui.viewpager.HealthPagerAdapter;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import health.compact.a.AuthorizationUtils;
import health.compact.a.CloudImpl;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.LanguageUtil;
import health.compact.a.ProcessUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class fns {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f34277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f34278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f34279c;
    private View f;
    private View g;
    private View h;
    private View i;
    private View j;
    private View o;
    private MainInteractorsUtils l = new MainInteractorsUtils();
    private boolean e = true;
    private boolean d = true;

    public fns(Context context, Handler handler) {
        if (context == null) {
            this.f34278b = BaseApplication.getContext();
        } else {
            this.f34278b = context;
        }
        this.f34279c = handler;
        this.l.j(this.f34278b);
        String strE = SharedPreferenceManager.e(this.f34278b, Integer.toString(10000), "hw_health_show_update_terms");
        if (!TextUtils.isEmpty(strE)) {
            SharedPreferenceManager.e(this.f34278b, Integer.toString(10000), "hw_health_show_update_terms", "", null);
            SharedPreferenceManager.e(this.f34278b, Integer.toString(10005), "hw_health_terms_authorize_china", strE, null);
            SharedPreferenceManager.e(this.f34278b, Integer.toString(10005), "key_has_agreement_authorization_msg", "true", null);
        }
        r();
        b(this.f34278b);
    }

    public void i() {
        this.f34278b = null;
        this.f34279c = null;
    }

    private void r() {
        String strE = SharedPreferenceManager.e(this.f34278b, Integer.toString(10000), "hw_health_show_update_ove_terms");
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        SharedPreferenceManager.e(this.f34278b, Integer.toString(10000), "hw_health_show_update_ove_terms", "", null);
        if (Utils.k()) {
            SharedPreferenceManager.e(this.f34278b, Integer.toString(10005), "hw_health_terms_authorize_no_cloud", strE, null);
        } else if (CommonUtil.j(LoginInit.getInstance(this.f34278b).getAccountInfo(1009)) == 7) {
            SharedPreferenceManager.e(this.f34278b, Integer.toString(10005), "hw_health_terms_authorize_europe", strE, null);
        } else if (CommonUtil.j(LoginInit.getInstance(this.f34278b).getAccountInfo(1009)) == 5) {
            SharedPreferenceManager.e(this.f34278b, Integer.toString(10005), "hw_health_terms_authorize_hong_kong", strE, null);
        } else {
            if (CloudImpl.e(this.f34278b).getSiteIdByCountry(SharedPreferenceManager.e(this.f34278b, Integer.toString(PrebakedEffectId.RT_SNIPER_RIFLE), "select_country")) == 5) {
                SharedPreferenceManager.e(this.f34278b, Integer.toString(10005), "hw_health_terms_authorize_hong_kong", strE, null);
            } else {
                SharedPreferenceManager.e(this.f34278b, Integer.toString(10005), "hw_health_terms_authorize_europe", strE, null);
            }
        }
        SharedPreferenceManager.e(this.f34278b, Integer.toString(10005), "key_has_agreement_authorization_msg", "true", null);
    }

    private void b(Context context) {
        if (context == null) {
            return;
        }
        if (!"true".equals(SharedPreferenceManager.e(context, Integer.toString(10005), "key_has_agreement_authorization_msg")) && !wsp.g()) {
            VersionIsCloud.getIfAllowLoginByMcc(context);
            return;
        }
        if (TextUtils.isEmpty(SharedPreferenceManager.e(context, Integer.toString(PrebakedEffectId.RT_SNIPER_RIFLE), "select_country"))) {
            String accountInfo = LoginInit.getInstance(context).getAccountInfo(1010);
            if (TextUtils.isEmpty(accountInfo)) {
                VersionIsCloud.getIfAllowLoginByMcc(context);
            } else {
                SharedPreferenceManager.e(context, Integer.toString(PrebakedEffectId.RT_SNIPER_RIFLE), "select_country", accountInfo, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        if (this.f34279c != null) {
            ReleaseLogUtil.d("R_PrivacyInteractors", "setStartPageVisible");
            Message messageObtain = Message.obtain(this.f34279c);
            messageObtain.what = MainActivityHandlerMsg.REFRESH_START_PAGE;
            messageObtain.arg1 = 0;
            messageObtain.sendToTarget();
        }
    }

    private void b(boolean z, MainInteractors mainInteractors, ViewStub viewStub) throws Throwable {
        View view = this.g;
        if (view != null) {
            view.setVisibility(0);
            return;
        }
        if (viewStub == null) {
            LogUtil.j("PrivacyInteractors", "setPrivacyStartPageVisibility ViewStub is loaded fail.");
            return;
        }
        View viewInflate = viewStub.inflate();
        this.g = viewInflate;
        viewInflate.setVisibility(0);
        LogUtil.a("PrivacyInteractors", "init start page ok.");
        this.g.setPadding(0, qrs.s(this.f34278b), 0, 0);
        if (qrs.v()) {
            HealthTextView healthTextView = (HealthTextView) this.g.findViewById(R.id.text2);
            HealthTextView healthTextView2 = (HealthTextView) this.g.findViewById(R.id.text3);
            healthTextView.setTextSize(1, 60.0f);
            healthTextView2.setTextSize(1, 28.0f);
        }
        c(this.g);
        ImageView imageView = (ImageView) this.g.findViewById(R.id.icon1);
        if (CommonUtil.ap() && CommonUtil.v(this.f34278b)) {
            imageView.setImageResource(R.mipmap.healthlogo_hw_app_beta);
            LogUtil.a("PrivacyInteractors", "init start page icon ok.");
        } else if (!CommonUtil.ca()) {
            LogUtil.a("PrivacyInteractors", "No need to change start page icon");
        } else {
            Bitmap bitmapB = b("healthbasic", "healthlogo_ic_about_app_icon_demo.webp");
            if (bitmapB == null) {
                imageView.setImageResource(R.mipmap.healthlogo_hw_show_app);
            } else {
                imageView.setImageBitmap(bitmapB);
            }
        }
        d(this.g, z, mainInteractors);
    }

    private void e(boolean z, MainInteractors mainInteractors, ViewStub viewStub) throws Throwable {
        View view = this.j;
        if (view != null) {
            view.setVisibility(0);
            return;
        }
        if (viewStub == null) {
            LogUtil.j("PrivacyInteractors", "setPrivacyStartPageVisibility ViewStub is loaded fail.");
            return;
        }
        View viewInflate = viewStub.inflate();
        this.j = viewInflate;
        viewInflate.setVisibility(0);
        LogUtil.a("PrivacyInteractors", "init start page ok.");
        this.j.setPadding(0, qrs.s(this.f34278b), 0, 0);
        if (qrs.v()) {
            HealthTextView healthTextView = (HealthTextView) this.j.findViewById(R.id.text2);
            HealthTextView healthTextView2 = (HealthTextView) this.j.findViewById(R.id.text3);
            healthTextView.setTextSize(1, 60.0f);
            healthTextView2.setTextSize(1, 28.0f);
        }
        c(this.j);
        ImageView imageView = (ImageView) this.j.findViewById(R.id.icon1);
        if (CommonUtil.ap() && CommonUtil.v(this.f34278b)) {
            imageView.setImageResource(R.mipmap.healthlogo_hw_app_beta);
            LogUtil.a("PrivacyInteractors", "init start page icon ok.");
        } else if (!CommonUtil.ca()) {
            LogUtil.a("PrivacyInteractors", "No need to change start page icon");
        } else {
            Bitmap bitmapB = b("healthbasic", "healthlogo_ic_about_app_icon_demo.webp");
            if (bitmapB == null) {
                imageView.setImageResource(R.mipmap.healthlogo_hw_show_app);
            } else {
                imageView.setImageBitmap(bitmapB);
            }
        }
        d(this.j, z, mainInteractors);
    }

    public void b(Context context, boolean z, ViewStub viewStub) {
        View view;
        View view2 = this.g;
        if (view2 != null && this.j != null) {
            view2.setVisibility(z ? 8 : 0);
            this.j.setVisibility(z ? 0 : 8);
            return;
        }
        if (z && view2 != null) {
            view2.setVisibility(8);
        } else if (!z && (view = this.j) != null) {
            view.setVisibility(8);
        } else {
            LogUtil.j("PrivacyInteractors", "setPrivacyBetaUserAgreementVisibility do not need change");
        }
        if (!z) {
            b(context, z, viewStub, this.g);
        } else {
            b(context, z, viewStub, this.j);
        }
    }

    public void b(Context context, boolean z, ViewStub viewStub, View view) {
        if (view != null) {
            view.setVisibility(0);
            return;
        }
        if (viewStub == null) {
            LogUtil.j("PrivacyInteractors", "setPrivacyStartPageVisibility ViewStub is loaded fail.");
            return;
        }
        View viewInflate = viewStub.inflate();
        viewInflate.setVisibility(0);
        viewInflate.setPadding(0, qrs.s(this.f34278b), 0, 0);
        boolean zD = wsp.d();
        d(viewInflate, zD);
        if (!zD) {
            b(context, viewInflate, z);
        }
        c(context, viewInflate, zD);
    }

    private void b(Context context, View view, boolean z) {
        TextView textView = (TextView) view.findViewById(R.id.beta_user_agreement_title);
        textView.setText(R.string.IDS_privacy_beta_eu_title);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        view.findViewById(R.id.textView_content).setVisibility(0);
        view.findViewById(R.id.textView_content2).setVisibility(0);
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010);
        int iD = qrs.d(context, 8.0f);
        if (CommonUtil.b(R.array.eu_country_code, accountInfo)) {
            layoutParams.setMargins(0, iD, 0, iD / 2);
            b((HealthButton) view.findViewById(R.id.button2));
        } else {
            view.findViewById(R.id.textView_content1).setVisibility(0);
            layoutParams.setMargins(0, iD * 2, 0, iD / 2);
        }
        textView.setLayoutParams(layoutParams);
        if (z) {
            return;
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.icon1);
        if (imageView.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams2.setMargins(0, qrs.d(context, wsp.d() ? 112.0f : 80.0f), 0, 0);
            imageView.setLayoutParams(layoutParams2);
        }
    }

    private void c(Context context, final View view, boolean z) {
        HealthButton healthButton = (HealthButton) view.findViewById(R.id.button1);
        if (!z) {
            healthButton.setText(R.string.IDS_common_disagree);
        }
        HealthButton healthButton2 = (HealthButton) view.findViewById(R.id.button2);
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: fnw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                fns.b(view2);
            }
        });
        healthButton2.setOnClickListener(new View.OnClickListener() { // from class: fnx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.d.e(view, view2);
            }
        });
        e(view, 0);
    }

    static /* synthetic */ void b(View view) {
        LogUtil.a("PrivacyInteractors", "initBetaUserAgreementButton cancel");
        Intent intent = new Intent();
        intent.setAction("com.huawei.commonui.CLEAN_ACTIVITY");
        LocalBroadcastManager.getInstance().sendBroadcast(intent);
    }

    /* synthetic */ void e(View view, View view2) {
        if (qrs.c(500)) {
            LogUtil.a("PrivacyInteractors", "onClick isFastClick true");
            return;
        }
        StorageParams storageParams = new StorageParams();
        if (wsp.f()) {
            SharedPreferenceManager.e(this.f34278b, Integer.toString(10000), "health_oversea_beta_user_agree", "1", storageParams);
        } else {
            SharedPreferenceManager.e(this.f34278b, Integer.toString(10000), "health_beta_user_agree", "1", storageParams);
        }
        e(view, 8);
        this.g = null;
        this.j = null;
        this.f34279c.sendEmptyMessageDelayed(MainActivityHandlerMsg.AFTER_LAUNCH_CHECK, 500L);
    }

    private void d(View view, boolean z) {
        String string;
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.textView);
        healthTextView.setMovementMethod(LinkMovementMethod.getInstance());
        healthTextView.setHighlightColor(0);
        String string2 = this.f34278b.getString(z ? R.string.IDS_privacy_beta_user_agreement_title : R.string.IDS_hw_watchface_secret_privacy_statement);
        String string3 = this.f34278b.getString(R.string.IDS_privacy_beta_notice_content1);
        if (z) {
            string = this.f34278b.getString(R.string.IDS_privacy_beta_terms, string2);
        } else {
            string = this.f34278b.getString(R.string.IDS_privacy_beta_notice2, string3, string2);
        }
        SpannableString spannableString = new SpannableString(string);
        if (!z) {
            wvi.a(spannableString, string3);
            HealthTextView healthTextView2 = (HealthTextView) view.findViewById(R.id.textView_content2);
            SpannableString spannableString2 = new SpannableString(this.f34278b.getString(R.string.IDS_privacy_beta_notice_content2));
            wvi.a(spannableString2, this.f34278b.getString(R.string.IDS_privacy_beta_notice_content2));
            healthTextView2.setText(spannableString2);
        }
        if (qrs.v()) {
            healthTextView.setTextSize(1, 26.0f);
        }
        a(spannableString, string2, z ? "BetaUserAgreement" : "HealthPrivacy");
        healthTextView.setText(spannableString);
    }

    public void c(boolean z, MainInteractors mainInteractors, ViewStub viewStub, boolean z2) throws Throwable {
        View view;
        ReleaseLogUtil.d("R_PrivacyInteractors", "show privacy dialog in China");
        View view2 = this.g;
        if (view2 != null && this.j != null) {
            view2.setVisibility(z2 ? 8 : 0);
            this.j.setVisibility(z2 ? 0 : 8);
            return;
        }
        if (z2 && view2 != null) {
            view2.setVisibility(8);
        } else if (!z2 && (view = this.j) != null) {
            view.setVisibility(8);
        } else {
            LogUtil.j("PrivacyInteractors", "do not need change");
        }
        if (!z2) {
            b(z, mainInteractors, viewStub);
        } else {
            e(z, mainInteractors, viewStub);
        }
    }

    public void d(ViewStub viewStub, MainInteractors mainInteractors, boolean z) {
        View view;
        ReleaseLogUtil.d("R_PrivacyInteractors", "show privacy dialog in HongKong or Russia");
        View view2 = this.f;
        if (view2 != null && this.i != null) {
            view2.setVisibility(z ? 8 : 0);
            this.i.setVisibility(z ? 0 : 8);
            return;
        }
        if (z && view2 != null) {
            view2.setVisibility(8);
        } else if (!z && (view = this.i) != null) {
            view.setVisibility(8);
        } else {
            LogUtil.j("PrivacyInteractors", "do not need change");
        }
        if (!z) {
            e(viewStub, mainInteractors);
        } else {
            a(viewStub, mainInteractors);
        }
    }

    private void e(ViewStub viewStub, MainInteractors mainInteractors) {
        View view = this.f;
        if (view != null) {
            view.setVisibility(0);
        } else {
            if (viewStub == null) {
                LogUtil.j("PrivacyInteractors", "showHongKongPrivacyUi ViewStub is null");
                return;
            }
            LogUtil.a("PrivacyInteractors", "init start page ok.");
            View viewInflate = viewStub.inflate();
            this.f = viewInflate;
            viewInflate.setVisibility(0);
            this.f.setPadding(0, qrs.s(this.f34278b), 0, 0);
            d(this.f);
            d(this.f, false, mainInteractors);
        }
        if (CommonUtil.cd()) {
            LogUtil.a("PrivacyInteractors", "showHongKongPrivacyUi isSupportPrivacyCenter = true");
            return;
        }
        HealthTextView healthTextView = (HealthTextView) this.f.findViewById(R.id.hw_health_service_item_six);
        healthTextView.setText(iox.c(this.f34278b, f34277a));
        if (qrs.v()) {
            healthTextView.setTextSize(1, 26.0f);
        }
    }

    private void a(ViewStub viewStub, MainInteractors mainInteractors) {
        View view = this.i;
        if (view != null) {
            view.setVisibility(0);
        } else {
            if (viewStub == null) {
                LogUtil.j("PrivacyInteractors", "showHongKongPrivacyUi ViewStub is null");
                return;
            }
            LogUtil.a("PrivacyInteractors", "init start page ok.");
            View viewInflate = viewStub.inflate();
            this.i = viewInflate;
            viewInflate.setVisibility(0);
            this.i.setPadding(0, qrs.s(this.f34278b), 0, 0);
            d(this.i);
            d(this.i, false, mainInteractors);
        }
        if (CommonUtil.cd()) {
            LogUtil.a("PrivacyInteractors", "showHongKongPrivacyUi isSupportPrivacyCenter = true");
            return;
        }
        HealthTextView healthTextView = (HealthTextView) this.i.findViewById(R.id.hw_health_service_item_six);
        healthTextView.setText(iox.c(this.f34278b, f34277a));
        if (qrs.v()) {
            healthTextView.setTextSize(1, 26.0f);
        }
    }

    public void a(ViewStub viewStub, MainInteractors mainInteractors, boolean z) {
        View view;
        ReleaseLogUtil.d("R_PrivacyInteractors", "show privacy dialog in Europe or no Cloud");
        View view2 = this.h;
        if (view2 != null && this.o != null) {
            view2.setVisibility(z ? 8 : 0);
            this.o.setVisibility(z ? 0 : 8);
            return;
        }
        if (z && view2 != null) {
            view2.setVisibility(8);
        } else if (!z && (view = this.o) != null) {
            view.setVisibility(8);
        } else {
            LogUtil.j("PrivacyInteractors", "do not need change");
        }
        if (!z) {
            c(viewStub, mainInteractors);
        } else {
            d(viewStub, mainInteractors);
        }
    }

    private void c(ViewStub viewStub, MainInteractors mainInteractors) {
        View view = this.h;
        if (view != null) {
            view.setVisibility(0);
        } else {
            if (viewStub == null) {
                LogUtil.j("PrivacyInteractors", "setPrivacyStartPageOverSeaVisibility ViewStub is loaded fail.");
                return;
            }
            View viewInflate = viewStub.inflate();
            this.h = viewInflate;
            viewInflate.setVisibility(0);
            this.h.setPadding(0, qrs.s(this.f34278b), 0, 0);
        }
        if (qrs.v()) {
            ((HealthTextView) this.h.findViewById(R.id.text2)).setTextSize(1, 60.0f);
        }
        HealthViewPager healthViewPager = (HealthViewPager) this.h.findViewById(R.id.viewpager);
        healthViewPager.setAdapter(a(mainInteractors, healthViewPager, this.h));
    }

    private void d(ViewStub viewStub, MainInteractors mainInteractors) {
        View view = this.o;
        if (view != null) {
            view.setVisibility(0);
        } else {
            if (viewStub == null) {
                LogUtil.j("PrivacyInteractors", "setPrivacyStartPageOverSeaVisibility ViewStub is loaded fail.");
                return;
            }
            View viewInflate = viewStub.inflate();
            this.o = viewInflate;
            viewInflate.setVisibility(0);
            this.o.setPadding(0, qrs.s(this.f34278b), 0, 0);
        }
        HealthViewPager healthViewPager = (HealthViewPager) this.o.findViewById(R.id.viewpager);
        healthViewPager.setAdapter(d(mainInteractors, healthViewPager, this.o));
    }

    private void d(final View view, final boolean z, final MainInteractors mainInteractors) {
        HealthButton healthButton = (HealthButton) view.findViewById(R.id.button1);
        healthButton.setText(this.f34278b.getString(R.string.IDS_hw_show_cancel).toUpperCase(Locale.ENGLISH));
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: fns.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                SharedPreferenceManager.e(fns.this.f34278b, Integer.toString(10000), "agr_if_privacy_authorize", "0", new StorageParams());
                iox.e("0");
                if (!fns.d()) {
                    fns.this.h();
                } else {
                    fns.this.a(z, view, mainInteractors);
                }
            }
        });
        HealthButton healthButton2 = (HealthButton) view.findViewById(R.id.button2);
        healthButton2.setText(this.f34278b.getString(R.string.IDS_hw_show_agree).toUpperCase(Locale.ENGLISH));
        healthButton2.setOnClickListener(new View.OnClickListener() { // from class: fns.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (!qrs.c(500)) {
                    SharedPreferenceManager.e(fns.this.f34278b, Integer.toString(10000), "agr_if_privacy_authorize", "1", new StorageParams());
                    Message messageObtainMessage = fns.this.f34279c.obtainMessage();
                    messageObtainMessage.what = 6300;
                    messageObtainMessage.obj = true;
                    fns.this.f34279c.sendMessageDelayed(messageObtainMessage, 5000L);
                    if (gtg.d().e()) {
                        gtg.d().e(fns.this.f34278b);
                    }
                    fns.this.v();
                    List<String> listC = llg.c();
                    if (listC.contains(ProcessUtil.c())) {
                        ProcessMonitor.c(listC, new llg());
                    }
                    fns.this.b(z, view, mainInteractors);
                    fns.this.s();
                    LoginInit.getInstance(BaseApplication.getContext()).setLastCountryCode();
                    return;
                }
                LogUtil.a("PrivacyInteractors", "onClick isFastClick true");
            }
        });
        a(healthButton);
        a(healthButton2);
    }

    private void e(final View view, final int i) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(i == 0 ? 0.0f : 1.0f, i != 0 ? 0.0f : 1.0f);
        alphaAnimation.setDuration(500L);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: fns.4
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                view.setVisibility(i);
            }
        });
        if (view != null) {
            view.startAnimation(alphaAnimation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        LogUtil.a("PrivacyInteractors", "enter sendAgreementMessage");
        Handler handler = this.f34279c;
        if (handler != null) {
            Message messageObtain = Message.obtain(handler);
            messageObtain.what = MainActivityHandlerMsg.ON_AGREEMENT_GRANTED;
            messageObtain.sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final boolean z, final View view, final MainInteractors mainInteractors) {
        CustomTextAlertDialog.Builder builderE = new CustomTextAlertDialog.Builder(this.f34278b).e(this.f34278b.getString(R.string.IDS_hw_health_base_service)).d(l()).a(com.huawei.ui.main.R.string.IDS_device_release_user_profile_agree_and_continue, new View.OnClickListener() { // from class: fns.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                SharedPreferenceManager.a(Integer.toString(PrebakedEffectId.RT_FLY), "is_base_service_model", true);
                KeyValDbManager.d(fns.this.f34278b).b("key_wether_to_auth", String.valueOf(true));
                SharedPreferenceManager.a(fns.this.f34278b, true);
                AuthorizationUtils.b();
                SharedPreferenceManager.e(fns.this.f34278b, Integer.toString(10000), "key_wether_to_auth", String.valueOf(true), null);
                fns.this.k();
                fns.this.q();
                LoginInit.getInstance(fns.this.f34278b).setAccountInfo(1009, Integer.toString(CloudImpl.e(fns.this.f34278b).getSiteIdByCountry(SharedPreferenceManager.e(fns.this.f34278b, Integer.toString(PrebakedEffectId.RT_SNIPER_RIFLE), "select_country"))), null);
                fns.this.b(z, view, mainInteractors);
            }
        }).e(com.huawei.ui.main.R.string.IDS_hw_health_base_quit_app, new View.OnClickListener() { // from class: fns.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                fns.this.h();
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builderE.b();
        builderE.c().setBackground(this.f34278b.getDrawable(com.huawei.ui.main.R.drawable.button_background_emphasize));
        builderE.c().setTextColor(this.f34278b.getColor(com.huawei.ui.main.R.color.white));
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    private SpannableString l() {
        String string = this.f34278b.getResources().getString(R.string.IDS_sentences_network);
        String string2 = this.f34278b.getResources().getString(R.string.IDS_hw_show_setting_about_service_item);
        String string3 = this.f34278b.getResources().getString(R.string.IDS_hwh_about_privacy_notice);
        String string4 = this.f34278b.getString(R.string.IDS_hw_health_base_service_content2, string, string2, string3);
        SpannableString spannableString = new SpannableString(string4);
        wvi.a(spannableString, string);
        int iIndexOf = string4.indexOf(string2);
        int length = string2.length() + iIndexOf;
        spannableString.setSpan(new wmt(this.f34278b, "HealthUserAgreement", false), iIndexOf, length, 33);
        spannableString.setSpan(new TypefaceSpan(Constants.FONT), iIndexOf, length, 33);
        int iIndexOf2 = string4.indexOf(string3);
        int length2 = string3.length() + iIndexOf2;
        spannableString.setSpan(new wmt(this.f34278b, "HealthPrivacy", false), iIndexOf2, length2, 33);
        spannableString.setSpan(new TypefaceSpan(Constants.FONT), iIndexOf2, length2, 33);
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        Intent intent = new Intent(this.f34278b, (Class<?>) iqd.class);
        intent.setAction(Action.ACTION_HW_ACCOUNT_LOGOUT);
        intent.putExtra(JsbMapKeyNames.H5_USER_ID, LoginInit.getInstance(this.f34278b).getAccountInfo(1011));
        iqd.b().e(this.f34278b, intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z, final View view, final MainInteractors mainInteractors) {
        if (z) {
            LogUtil.a("PrivacyInteractors", "isJustShowUi true");
            view.setVisibility(8);
            return;
        }
        if ((view == this.g || view == this.j) && n()) {
            LogUtil.a("PrivacyInteractors", "isNeedShowPermissionLayout true");
            view.findViewById(R.id.layout_privacy_notice).setVisibility(8);
            view.findViewById(R.id.checkbox).setVisibility(8);
            final View viewFindViewById = view.findViewById(R.id.layout_third_part_permission);
            viewFindViewById.setVisibility(0);
            viewFindViewById.findViewById(R.id.ok_button).setOnClickListener(new View.OnClickListener() { // from class: fns.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    LogUtil.a("PrivacyInteractors", "thirdPartPermission onClick");
                    viewFindViewById.setVisibility(8);
                    view.setVisibility(8);
                    view.findViewById(R.id.layout_privacy_notice).setVisibility(0);
                    view.findViewById(R.id.checkbox).setVisibility(0);
                    fns.this.t();
                    mainInteractors.i();
                }
            });
            a(mainInteractors);
            mainInteractors.c(false);
            return;
        }
        LogUtil.a("PrivacyInteractors", "isNeedShowPermissionLayout false");
        view.setVisibility(8);
        t();
        a(mainInteractors);
        mainInteractors.c(true);
    }

    private boolean n() {
        if (d() && !CommonUtil.av()) {
            return (CommonUtil.ax() && CommonUtil.cf()) ? false : true;
        }
        return false;
    }

    private void a(MainInteractors mainInteractors) {
        this.l.h(this.f34278b);
        this.l.w();
    }

    private HealthPagerAdapter a(MainInteractors mainInteractors, HealthViewPager healthViewPager, View view) {
        View viewInflate = LayoutInflater.from(this.f34278b).inflate(R.layout.privacy_statement_europe_page_one, (ViewGroup) null);
        View viewInflate2 = LayoutInflater.from(this.f34278b).inflate(R.layout.privacy_statement_europe_page_two, (ViewGroup) null);
        if (qrs.v()) {
            HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.text_one);
            HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(R.id.text_two);
            HealthTextView healthTextView3 = (HealthTextView) viewInflate.findViewById(R.id.text_three);
            HealthTextView healthTextView4 = (HealthTextView) viewInflate.findViewById(R.id.text_four);
            healthTextView.setTextSize(1, 26.0f);
            healthTextView2.setTextSize(1, 26.0f);
            healthTextView3.setTextSize(1, 26.0f);
            healthTextView4.setTextSize(1, 26.0f);
            ((HealthTextView) viewInflate.findViewById(R.id.loading_text)).setTextSize(1, 26.0f);
            HealthTextView healthTextView5 = (HealthTextView) viewInflate.findViewById(R.id.map_text);
            HealthTextView healthTextView6 = (HealthTextView) viewInflate.findViewById(R.id.weather_text);
            HealthTextView healthTextView7 = (HealthTextView) viewInflate.findViewById(R.id.cloud_text);
            HealthTextView healthTextView8 = (HealthTextView) viewInflate.findViewById(R.id.exit_text);
            healthTextView5.setTextSize(1, 26.0f);
            healthTextView6.setTextSize(1, 26.0f);
            healthTextView7.setTextSize(1, 26.0f);
            healthTextView8.setTextSize(1, 26.0f);
        }
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.icon_privacy_center);
        if (!CommonUtil.cd()) {
            imageView.setVisibility(8);
        }
        e(healthViewPager, viewInflate);
        c(mainInteractors, view, viewInflate2);
        a(viewInflate, viewInflate2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(viewInflate);
        arrayList.add(viewInflate2);
        return new wmd(arrayList);
    }

    private HealthPagerAdapter d(MainInteractors mainInteractors, HealthViewPager healthViewPager, View view) {
        View viewInflate = LayoutInflater.from(this.f34278b).inflate(R.layout.privacy_statement_europe_page_one_half_screen, (ViewGroup) null);
        View viewInflate2 = LayoutInflater.from(this.f34278b).inflate(R.layout.privacy_statement_europe_page_two_half_screen, (ViewGroup) null);
        if (qrs.v()) {
            ((HealthTextView) viewInflate.findViewById(R.id.text2)).setTextSize(1, 60.0f);
            ((HealthTextView) viewInflate2.findViewById(R.id.text2)).setTextSize(1, 60.0f);
            HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.text_one);
            HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(R.id.text_two);
            HealthTextView healthTextView3 = (HealthTextView) viewInflate.findViewById(R.id.text_three);
            HealthTextView healthTextView4 = (HealthTextView) viewInflate.findViewById(R.id.text_four);
            healthTextView.setTextSize(1, 26.0f);
            healthTextView2.setTextSize(1, 26.0f);
            healthTextView3.setTextSize(1, 26.0f);
            healthTextView4.setTextSize(1, 26.0f);
            ((HealthTextView) viewInflate.findViewById(R.id.loading_text)).setTextSize(1, 26.0f);
            HealthTextView healthTextView5 = (HealthTextView) viewInflate.findViewById(R.id.map_text);
            HealthTextView healthTextView6 = (HealthTextView) viewInflate.findViewById(R.id.weather_text);
            HealthTextView healthTextView7 = (HealthTextView) viewInflate.findViewById(R.id.cloud_text);
            HealthTextView healthTextView8 = (HealthTextView) viewInflate.findViewById(R.id.exit_text);
            healthTextView5.setTextSize(1, 26.0f);
            healthTextView6.setTextSize(1, 26.0f);
            healthTextView7.setTextSize(1, 26.0f);
            healthTextView8.setTextSize(1, 26.0f);
        }
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.icon_privacy_center);
        if (!CommonUtil.cd()) {
            imageView.setVisibility(8);
        }
        e(healthViewPager, viewInflate);
        c(mainInteractors, view, viewInflate2);
        a(viewInflate, viewInflate2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(viewInflate);
        arrayList.add(viewInflate2);
        return new wmd(arrayList);
    }

    private void e(final HealthViewPager healthViewPager, View view) {
        HealthButton healthButton = (HealthButton) view.findViewById(R.id.hw_health_privacy_dialog_cancel);
        healthButton.setText(this.f34278b.getString(R.string.IDS_settings_button_cancal).toUpperCase(Locale.getDefault()));
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: fns.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                iox.e("0");
                fns.this.h();
            }
        });
        HealthButton healthButton2 = (HealthButton) view.findViewById(R.id.hw_health_privacy_dialog_next);
        healthButton2.setText(this.f34278b.getString(R.string.IDS_startup_next).toUpperCase(Locale.getDefault()));
        healthButton2.setOnClickListener(new View.OnClickListener() { // from class: fns.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                healthViewPager.setCurrentItem(1);
            }
        });
        b(healthButton2);
        a(healthButton);
        a(healthButton2);
    }

    private void c(final MainInteractors mainInteractors, final View view, View view2) {
        HealthButton healthButton = (HealthButton) view2.findViewById(R.id.hw_health_agreement_dialog_disagree);
        healthButton.setText(this.f34278b.getString(R.string.IDS_common_disagree).toUpperCase(Locale.getDefault()));
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: fns.15
            @Override // android.view.View.OnClickListener
            public void onClick(View view3) {
                iox.e("0");
                fns.this.h();
            }
        });
        HealthButton healthButton2 = (HealthButton) view2.findViewById(R.id.hw_health_agreement_dialog_agree);
        healthButton2.setText(this.f34278b.getString(R.string.IDS_hw_show_agree).toUpperCase(Locale.getDefault()));
        healthButton2.setOnClickListener(new View.OnClickListener() { // from class: fns.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view3) {
                view.setVisibility(8);
                fns.this.t();
                fns.this.v();
                fns.this.l.h(fns.this.f34278b);
                fns.this.l.w();
                mainInteractors.c(true);
            }
        });
        b(healthButton2);
        a(healthButton);
        a(healthButton2);
    }

    private void b(HealthButton healthButton) {
        if (Utils.h()) {
            healthButton.setBackgroundResource(R.drawable.hwbutton_default_emui);
            healthButton.setTextColor(this.f34278b.getColor(R.color.common_colorAccent));
        }
    }

    private void a(HealthButton healthButton) {
        if (healthButton == null) {
            LogUtil.j("PrivacyInteractors", "setAutoText healthButton is null");
        } else {
            healthButton.setSingleLine();
            healthButton.setAutoTextInfo(10, 1, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.f34278b == null) {
            return;
        }
        ReleaseLogUtil.d("R_PrivacyInteractors", "cancelTermsAuth, key_wether_to_auth is false");
        KeyValDbManager.d(this.f34278b).b("key_wether_to_auth", String.valueOf(false));
        SharedPreferenceManager.a(this.f34278b, false);
        SharedPreferenceManager.e(this.f34278b, Integer.toString(10000), "key_wether_to_auth", String.valueOf(false), null);
        AuthorizationUtils.b();
        SharedPreferenceManager.a(Integer.toString(10000), "is_agr_change_user", false);
        if (!Utils.o()) {
            niz.c(false);
        }
        MainInteractors.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        if (this.f34278b == null) {
            return;
        }
        ReleaseLogUtil.d("R_PrivacyInteractors", "updateTermsAuthVersion, key_wether_to_auth is true");
        SharedPreferenceManager.e(this.f34278b, Integer.toString(10005), "key_has_agreement_authorization_msg", "true", null);
        KeyValDbManager.d(this.f34278b).b("key_wether_to_auth", String.valueOf(true));
        SharedPreferenceManager.a(this.f34278b, true);
        SharedPreferenceManager.e(this.f34278b, Integer.toString(10000), "key_wether_to_auth", String.valueOf(true), null);
        iox.e("1");
        k();
        SharedPreferenceManager.e(this.f34278b, Integer.toString(10000), "agree_app_version_name", CommonUtil.a(this.f34278b), null);
        SharedPreferenceManager.e(this.f34278b, Integer.toString(10000), "agree_date", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()), null);
        SharedPreferenceManager.a(Integer.toString(10000), "is_agr_change_user", false);
        AuthorizationUtils.b();
        if (!Utils.o()) {
            niz.c(true);
        }
        if (Utils.k()) {
            e(0);
            return;
        }
        e(f34277a);
        wjs.d(true);
        if (f34277a == 1) {
            LogUtil.a("PrivacyInteractors", "privacy recommend is ", Boolean.valueOf(this.e), " ad recommend is ", Boolean.valueOf(this.d));
            SharedPreferenceManager.a(Integer.toString(10000), "privacy_personalized_recommend", this.e);
            SharedPreferenceManager.a(Integer.toString(10000), "privacy_personalized_ad_recommend", this.d);
            SharedPreferenceManager.a(Integer.toString(10000), "privacy_first_login", true);
        }
    }

    private void e(int i) {
        Context context = this.f34278b;
        if (context == null) {
            return;
        }
        if (i == 1) {
            SharedPreferenceManager.e(context, Integer.toString(10005), "hw_health_terms_authorize_china", "5", null);
        } else if (i == 8) {
            SharedPreferenceManager.e(context, Integer.toString(10005), "hw_health_terms_authorize_russia", "1", null);
        } else if (i == 5) {
            SharedPreferenceManager.e(context, Integer.toString(10005), "hw_health_terms_authorize_hong_kong", "1", null);
        } else if (i == 7) {
            SharedPreferenceManager.e(context, Integer.toString(10005), "hw_health_terms_authorize_europe", "1", null);
        } else {
            SharedPreferenceManager.e(context, Integer.toString(10005), "hw_health_terms_authorize_no_cloud", "1", null);
        }
        LoginInit.getInstance(this.f34278b).setAccountInfo(1009, Integer.toString(i), null);
        d(i);
    }

    private void d(int i) {
        if (i == 0 || !"0".equals(LoginInit.getInstance(this.f34278b).getAccountInfo(1011))) {
            return;
        }
        LoginInit.getInstance(this.f34278b).setIsLogined(false);
        LoginInit.getInstance(this.f34278b).setAccountInfo(1011, "", null);
        SharedPreferenceUtil.getInstance(BaseApplication.getContext()).setCountryCode(SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(PrebakedEffectId.RT_SNIPER_RIFLE), "select_country"));
        lua.b();
    }

    private void a(View view, View view2) {
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.hw_health_service_item_all);
        HealthTextView healthTextView2 = (HealthTextView) view.findViewById(R.id.hw_health_privacy_eu_text_two);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.hw_health_privacy_eu_cloud);
        HealthTextView healthTextView3 = (HealthTextView) view.findViewById(R.id.hw_health_privacy_eu_text_one);
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.hw_health_privacy_eu_no_cloud);
        HealthTextView healthTextView4 = (HealthTextView) view2.findViewById(R.id.hw_health_ove_agreement_agree_text);
        if (qrs.v()) {
            healthTextView3.setTextSize(1, 26.0f);
            healthTextView.setTextSize(1, 26.0f);
            healthTextView2.setTextSize(1, 26.0f);
            e(view);
            f(view2);
            healthTextView4.setTextSize(1, 26.0f);
            e(linearLayout);
            c(linearLayout2);
        }
        healthTextView.setText(this.f34278b.getString(R.string.IDS_hwh_privacy_permission_total, this.f34278b.getResources().getString(R.string.IDS_hwh_privacy_ove_one)));
        healthTextView2.setMovementMethod(LinkMovementMethod.getInstance());
        healthTextView2.setHighlightColor(this.f34278b.getResources().getColor(android.R.color.transparent));
        HealthTextView healthTextView5 = (HealthTextView) view2.findViewById(R.id.hw_health_ove_agreement_agree_text);
        healthTextView5.setMovementMethod(LinkMovementMethod.getInstance());
        healthTextView5.setHighlightColor(this.f34278b.getResources().getColor(android.R.color.transparent));
        b(linearLayout, healthTextView3, linearLayout2);
        String string = this.f34278b.getString(R.string.IDS_hw_show_setting_about_service_item);
        String string2 = this.f34278b.getString(R.string.IDS_hwh_privacy_eu_three);
        SpannableString spannableString = new SpannableString(this.f34278b.getString(R.string.IDS_hwh_agreement_ove_ele, string));
        SpannableString spannableString2 = new SpannableString(this.f34278b.getString(R.string.IDS_hwh_privacy_eu_two, string2));
        int iIndexOf = spannableString.toString().indexOf(string);
        if (iIndexOf != -1) {
            wmt wmtVar = new wmt(this.f34278b, "HealthUserAgreement", false);
            spannableString.setSpan(new TypefaceSpan(Constants.FONT), iIndexOf, string.length() + iIndexOf, 33);
            spannableString.setSpan(wmtVar, iIndexOf, string.length() + iIndexOf, 17);
        }
        healthTextView5.setText(spannableString);
        int iIndexOf2 = spannableString2.toString().indexOf(string2);
        if (iIndexOf2 != -1) {
            wmt wmtVar2 = new wmt(this.f34278b, "HealthPrivacy", false);
            spannableString2.setSpan(new TypefaceSpan(Constants.FONT), iIndexOf2, string2.length() + iIndexOf2, 33);
            spannableString2.setSpan(wmtVar2, iIndexOf2, string2.length() + iIndexOf2, 17);
        }
        healthTextView2.setText(spannableString2);
    }

    private void b(LinearLayout linearLayout, HealthTextView healthTextView, LinearLayout linearLayout2) {
        if (Utils.h()) {
            linearLayout2.setVisibility(8);
            healthTextView.setText(this.f34278b.getString(R.string.IDS_hwh_agreement_save_area_two, this.f34278b.getResources().getString(R.string.IDS_hwh_agreement_eu)));
            return;
        }
        linearLayout.setVisibility(8);
    }

    private void e(View view) {
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.text_one);
        HealthTextView healthTextView2 = (HealthTextView) view.findViewById(R.id.text_two);
        HealthTextView healthTextView3 = (HealthTextView) view.findViewById(R.id.text_three);
        HealthTextView healthTextView4 = (HealthTextView) view.findViewById(R.id.text_four);
        healthTextView.setTextSize(1, 26.0f);
        healthTextView2.setTextSize(1, 26.0f);
        healthTextView3.setTextSize(1, 26.0f);
        healthTextView4.setTextSize(1, 26.0f);
    }

    private void f(View view) {
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.child_text);
        HealthTextView healthTextView2 = (HealthTextView) view.findViewById(R.id.page_two_online_text);
        HealthTextView healthTextView3 = (HealthTextView) view.findViewById(R.id.page_two_text_one);
        HealthTextView healthTextView4 = (HealthTextView) view.findViewById(R.id.page_two_text_two);
        healthTextView3.setTextSize(1, 26.0f);
        healthTextView4.setTextSize(1, 26.0f);
        healthTextView2.setTextSize(1, 20.0f);
        healthTextView.setTextSize(1, 26.0f);
    }

    private void e(LinearLayout linearLayout) {
        HealthTextView healthTextView = (HealthTextView) linearLayout.findViewById(R.id.hw_health_privacy_eu_text_one);
        HealthTextView healthTextView2 = (HealthTextView) linearLayout.findViewById(R.id.hw_health_privacy_eu_text_two);
        c(healthTextView, 26);
        c(healthTextView2, 26);
    }

    private void c(LinearLayout linearLayout) {
        HealthTextView healthTextView = (HealthTextView) linearLayout.findViewById(R.id.loading_text);
        HealthTextView healthTextView2 = (HealthTextView) linearLayout.findViewById(R.id.cloud_text);
        c(healthTextView, 26);
        c(healthTextView2, 26);
        HealthTextView healthTextView3 = (HealthTextView) linearLayout.findViewById(R.id.map_text);
        HealthTextView healthTextView4 = (HealthTextView) linearLayout.findViewById(R.id.weather_text);
        HealthTextView healthTextView5 = (HealthTextView) linearLayout.findViewById(R.id.exit_text);
        c(healthTextView3, 26);
        c(healthTextView4, 26);
        c(healthTextView5, 26);
    }

    private void c(View view) {
        String strTrim;
        SpannableString spannableString;
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.textView);
        healthTextView.setMovementMethod(LinkMovementMethod.getInstance());
        healthTextView.setHighlightColor(0);
        String string = this.f34278b.getResources().getString(R.string.IDS_sentences_network);
        String string2 = this.f34278b.getString(R.string.IDS_privacy_notice_2023_2, string);
        String string3 = this.f34278b.getString(R.string.IDS_hw_show_setting_about_service_item);
        if (LanguageUtil.bo(this.f34278b)) {
            strTrim = this.f34278b.getString(R.string.IDS_hwh_about_privacy_notice_bo).trim();
        } else {
            strTrim = this.f34278b.getString(R.string.IDS_hwh_about_privacy_notice).trim();
        }
        String string4 = this.f34278b.getString(R.string.IDS_hwh_value_added_services);
        view.findViewById(R.id.scrollview_privacy).setVisibility(8);
        if (!VersionControlUtil.isSupportOperationAccount()) {
            spannableString = new SpannableString(this.f34278b.getString(R.string.IDS_privacy_agree_2024_11, string2, string3, strTrim));
        } else {
            spannableString = new SpannableString(this.f34278b.getString(R.string.IDS_privacy_agree_2022_2, string2, string3, string4, strTrim));
        }
        if (qrs.v()) {
            healthTextView.setTextSize(1, 26.0f);
        }
        d(spannableString, string4);
        wvi.a(spannableString, string);
        a(spannableString, string3, "HealthUserAgreement");
        a(spannableString, strTrim, "HealthPrivacy");
        healthTextView.setText(spannableString);
    }

    private void d(View view) {
        SpannableString spannableString;
        String string;
        String string2;
        boolean zIsKoreaCountry = LoginInit.getInstance(BaseApplication.getContext()).isKoreaCountry();
        if (CommonUtil.cd()) {
            view.findViewById(R.id.scrollview_privacy).setVisibility(8);
            HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.hw_health_service_item_one);
            String string3 = this.f34278b.getResources().getString(R.string.IDS_sentences_network);
            SpannableString spannableString2 = new SpannableString(this.f34278b.getString(R.string.IDS_privacy_notice_new_1, string3, this.f34278b.getResources().getString(zIsKoreaCountry ? R.string.IDS_hwh_device_oversea_korea : R.string.IDS_hwh_device_oversea)));
            wvi.a(spannableString2, string3);
            healthTextView.setText(spannableString2);
            if (qrs.v()) {
                c(healthTextView, 26);
            }
        } else {
            view.findViewById(R.id.icon_privacy_center).setVisibility(8);
            HealthTextView healthTextView2 = (HealthTextView) view.findViewById(R.id.hw_health_service_item_one);
            healthTextView2.setText(new SpannableString(this.f34278b.getString(R.string.IDS_hwh_privacy_permission_total, this.f34278b.getResources().getString(R.string.IDS_hwh_privacy_permission_read))));
            HealthTextView healthTextView3 = (HealthTextView) view.findViewById(R.id.hw_health_service_item_two);
            healthTextView3.setText(wvi.b(this.f34278b));
            if (qrs.v()) {
                c(healthTextView2, 26);
                c(healthTextView3, 26);
            }
        }
        String string4 = this.f34278b.getString(R.string.IDS_hw_show_setting_about_service_item);
        String strTrim = this.f34278b.getString(R.string.IDS_hwh_about_privacy_notice).trim();
        if (zIsKoreaCountry) {
            string = this.f34278b.getString(R.string.IDS_hwh_location_service_terms);
            string2 = this.f34278b.getString(R.string.IDS_hwh_location_info_terms);
            spannableString = new SpannableString(this.f34278b.getString(R.string.IDS_hwh_user_agreement_public_korea, string4, strTrim, string, string2));
        } else {
            spannableString = new SpannableString(this.f34278b.getString(R.string.IDS_hwh_user_agreement_public_china_two, string4, strTrim));
            string = "";
            string2 = "";
        }
        a(spannableString, string4, "HealthUserAgreement");
        a(spannableString, strTrim, "HealthPrivacy");
        if (zIsKoreaCountry) {
            a(spannableString, string, "LocationServiceTerms");
            a(spannableString, string2, "LocationInfoTerms");
        }
        HealthTextView healthTextView4 = (HealthTextView) view.findViewById(R.id.textView);
        healthTextView4.setMovementMethod(LinkMovementMethod.getInstance());
        healthTextView4.setHighlightColor(0);
        healthTextView4.setText(spannableString);
        if (qrs.v()) {
            a(view);
        }
    }

    private void a(View view) {
        if (view == null) {
            LogUtil.j("PrivacyInteractors", "setLargeFont, layout is null");
            return;
        }
        c((HealthTextView) view.findViewById(R.id.text2), 60);
        c((HealthTextView) view.findViewById(R.id.text3), 28);
        c((HealthTextView) view.findViewById(R.id.hw_health_service_item_one), 26);
        c((HealthTextView) view.findViewById(R.id.hw_health_service_item_two), 26);
        c((HealthTextView) view.findViewById(R.id.hw_health_service_item_six), 26);
        c((HealthTextView) view.findViewById(R.id.hw_health_service_item_seven), 26);
        c((HealthTextView) view.findViewById(R.id.agreement_text), 26);
        c((HealthTextView) view.findViewById(R.id.textView), 26);
    }

    private void a(SpannableString spannableString, String str, String str2) {
        int iIndexOf = spannableString.toString().indexOf(str);
        if (iIndexOf != -1) {
            wmt wmtVar = new wmt(this.f34278b, str2, false);
            int length = str.length() + iIndexOf;
            spannableString.setSpan(new TypefaceSpan(Constants.FONT), iIndexOf, length, 33);
            spannableString.setSpan(wmtVar, iIndexOf, length, 17);
        }
    }

    private void d(SpannableString spannableString, String str) {
        int iIndexOf = spannableString.toString().indexOf(str);
        if (iIndexOf != -1) {
            int length = str.length() + iIndexOf;
            spannableString.setSpan(new TypefaceSpan(Constants.FONT), iIndexOf, length, 33);
            spannableString.setSpan(new AnonymousClass1(this.f34278b, ""), iIndexOf, length, 33);
        }
    }

    /* JADX INFO: renamed from: fns$1, reason: invalid class name */
    class AnonymousClass1 extends wmt {
        AnonymousClass1(Context context, String str) {
            super(context, str);
        }

        @Override // defpackage.wmt, android.text.style.ClickableSpan
        public void onClick(View view) {
            CustomAlertDialog customAlertDialogB = new CustomAlertDialog.Builder(fns.this.f34278b).a(fns.this.o()).e(fns.this.f34278b.getString(R.string.IDS_hw_hms_install_alert_ok), new DialogInterface.OnClickListener() { // from class: fnz
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    LogUtil.a("PrivacyInteractors", "setPermissionDescription ok");
                }
            }).b();
            customAlertDialogB.setCancelable(false);
            customAlertDialogB.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View o() {
        View viewInflate = View.inflate(this.f34278b, R.layout.dialog_privacy_value_added_services, null);
        final HealthCheckBox healthCheckBox = (HealthCheckBox) viewInflate.findViewById(R.id.privacy_recommend_box);
        final HealthCheckBox healthCheckBox2 = (HealthCheckBox) viewInflate.findViewById(R.id.privacy_ad_recommend_box);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.privacy_ad_recommend_layout);
        if (LoginInit.getInstance(BaseApplication.getContext()).isMinorAccount()) {
            LogUtil.a("PrivacyInteractors", "getLayoutByContent isMinorAccount true, hide ad recommend");
            linearLayout.setVisibility(8);
            this.d = false;
        } else {
            healthCheckBox2.setChecked(this.d);
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: fnu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f34299c.d(healthCheckBox2, view);
                }
            });
            healthCheckBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.health.interactor.PrivacyInteractors$$ExternalSyntheticLambda4
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    this.f7205b.a(compoundButton, z);
                }
            });
        }
        healthCheckBox.setChecked(this.e);
        viewInflate.findViewById(R.id.privacy_recommend_layout).setOnClickListener(new View.OnClickListener() { // from class: fnt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f34298b.c(healthCheckBox, view);
            }
        });
        healthCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.health.interactor.PrivacyInteractors$$ExternalSyntheticLambda6
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f7206c.b(compoundButton, z);
            }
        });
        return viewInflate;
    }

    /* synthetic */ void d(HealthCheckBox healthCheckBox, View view) {
        boolean z = !healthCheckBox.isChecked();
        healthCheckBox.setChecked(z);
        this.d = z;
    }

    public /* synthetic */ void a(CompoundButton compoundButton, boolean z) {
        this.d = z;
    }

    /* synthetic */ void c(HealthCheckBox healthCheckBox, View view) {
        boolean z = !healthCheckBox.isChecked();
        healthCheckBox.setChecked(z);
        this.e = z;
    }

    public /* synthetic */ void b(CompoundButton compoundButton, boolean z) {
        this.e = z;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v8 */
    public Bitmap b(String str, String str2) throws Throwable {
        InputStream inputStreamE;
        ?? r2 = 0;
        bitmapDecodeStream = null;
        bitmapDecodeStream = null;
        Bitmap bitmapDecodeStream = null;
        try {
            try {
                inputStreamE = pee.e(str, str2);
                try {
                    bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamE);
                    str = inputStreamE;
                    if (inputStreamE != null) {
                        try {
                            inputStreamE.close();
                            str = inputStreamE;
                        } catch (IOException unused) {
                            Object[] objArr = {"getBitmap finally catch IOException"};
                            LogUtil.e("PrivacyInteractors", objArr);
                            str = objArr;
                        }
                    }
                } catch (Exception unused2) {
                    LogUtil.e("PrivacyInteractors", "getBitmap Exception");
                    str = inputStreamE;
                    if (inputStreamE != null) {
                        try {
                            inputStreamE.close();
                            str = inputStreamE;
                        } catch (IOException unused3) {
                            Object[] objArr2 = {"getBitmap finally catch IOException"};
                            LogUtil.e("PrivacyInteractors", objArr2);
                            str = objArr2;
                        }
                    }
                }
            } catch (Throwable th) {
                r2 = str;
                th = th;
                if (r2 != 0) {
                    try {
                        r2.close();
                    } catch (IOException unused4) {
                        LogUtil.e("PrivacyInteractors", "getBitmap finally catch IOException");
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
            inputStreamE = null;
        } catch (Throwable th2) {
            th = th2;
            if (r2 != 0) {
                r2.close();
            }
            throw th;
        }
        return bitmapDecodeStream;
    }

    public static boolean d() {
        return f34277a == 1;
    }

    public static boolean g() {
        int i = f34277a;
        return i == 8 || i == 5 || LoginInit.getInstance(com.huawei.haf.application.BaseApplication.b()).isKoreaCountry();
    }

    public static boolean b() {
        boolean zC;
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (!TextUtils.isEmpty(accountInfo) && !"0".equals(accountInfo)) {
            zC = e();
        } else {
            zC = c();
        }
        return !zC;
    }

    public static boolean c() {
        if (a()) {
            return false;
        }
        Context context = BaseApplication.getContext();
        SharedPreferenceManager.e(context, Integer.toString(PrebakedEffectId.RT_SNIPER_RIFLE), "key_privacy_notice_state", "privacy_notice_state_before_login", null);
        if (!Utils.o()) {
            LogUtil.a("PrivacyInteractors", "isNeedShowBeforeLogin isOversea false");
            return e(1, false);
        }
        String strE = SharedPreferenceManager.e(context, Integer.toString(PrebakedEffectId.RT_SNIPER_RIFLE), "select_country");
        LogUtil.a("PrivacyInteractors", "isNeedShowBeforeLogin countryCode=", strE);
        if ("cn".equalsIgnoreCase(strE)) {
            return e(1, false);
        }
        int siteIdByCountry = CloudImpl.e(context).getSiteIdByCountry(strE);
        if (siteIdByCountry != 0 && Utils.k()) {
            String accountInfo = LoginInit.getInstance(context).getAccountInfo(1010);
            LogUtil.a("PrivacyInteractors", "isNeedShowBeforeLogin loginCountry = ", accountInfo);
            if (!TextUtils.isEmpty(accountInfo)) {
                SharedPreferenceManager.e(context, Integer.toString(PrebakedEffectId.RT_SNIPER_RIFLE), "key_privacy_notice_state", "", null);
            }
            return e(0, false);
        }
        LogUtil.a("PrivacyInteractors", "isNeedShowBeforeLogin siteId ", Integer.valueOf(siteIdByCountry));
        return e(siteIdByCountry, false);
    }

    public static boolean e() {
        if (a()) {
            return false;
        }
        Context context = BaseApplication.getContext();
        SharedPreferenceManager.e(context, Integer.toString(PrebakedEffectId.RT_SNIPER_RIFLE), "key_privacy_notice_state", "", null);
        if (Utils.k()) {
            LogUtil.a("PrivacyInteractors", "isNeedShowAfterLogin isOverseaNoCloudVersion");
            return e(0, true);
        }
        LoginInit loginInit = LoginInit.getInstance(context);
        if (!loginInit.getIsLogined()) {
            return false;
        }
        LogUtil.a("PrivacyInteractors", "isNeedShowAfterLogin");
        return e(CommonUtil.j(loginInit.getAccountInfo(1009)), true);
    }

    private static boolean e(int i, boolean z) {
        f34277a = i;
        return a(i, z);
    }

    public static boolean a(int i, boolean z) {
        boolean zEquals;
        ReleaseLogUtil.d("R_PrivacyInteractors", "isNeedShowPrivacyUi siteId ", Integer.valueOf(i), " isAfterLogin ", Boolean.valueOf(z));
        Context context = BaseApplication.getContext();
        if (z && !AuthorizationUtils.c(context)) {
            LogUtil.a("PrivacyInteractors", "isNeedShowPrivacyUi key_wether_to_auth is false");
            return true;
        }
        if (i == 1) {
            zEquals = "5".equals(SharedPreferenceManager.e(context, Integer.toString(10005), "hw_health_terms_authorize_china"));
        } else if (i == 8) {
            zEquals = "1".equals(SharedPreferenceManager.e(context, Integer.toString(10005), "hw_health_terms_authorize_russia"));
        } else if (i == 5) {
            if (m()) {
                return true;
            }
            zEquals = "1".equals(SharedPreferenceManager.e(context, Integer.toString(10005), "hw_health_terms_authorize_hong_kong"));
        } else if (i == 7) {
            zEquals = "1".equals(SharedPreferenceManager.e(context, Integer.toString(10005), "hw_health_terms_authorize_europe"));
        } else {
            String strE = SharedPreferenceManager.e(context, Integer.toString(10005), "hw_health_terms_authorize_no_cloud");
            LogUtil.a("PrivacyInteractors", "isNeedShowPrivacyUi termsVersion = ", strE);
            zEquals = "1".equals(strE);
        }
        return !zEquals;
    }

    private static boolean m() {
        Context contextB = com.huawei.haf.application.BaseApplication.b();
        String accountInfo = LoginInit.getInstance(contextB).getAccountInfo(1010);
        String lastCountryCode = LoginInit.getInstance(contextB).getLastCountryCode();
        ReleaseLogUtil.d("R_PrivacyInteractors", "isKoreaChange countryCode ", accountInfo, " lastCountryCode ", lastCountryCode);
        if (TextUtils.isEmpty(accountInfo)) {
            return false;
        }
        return (LoginInit.KOREA.equals(accountInfo) || LoginInit.KOREA.equals(lastCountryCode)) && !Objects.equals(accountInfo, lastCountryCode);
    }

    public static boolean d(Context context) {
        if (!Utils.k() || context == null) {
            return false;
        }
        String strE = SharedPreferenceManager.e(context, Integer.toString(10005), "hw_health_terms_authorize_no_cloud");
        if (TextUtils.isEmpty(strE)) {
            return false;
        }
        return !"1".equals(strE);
    }

    public static void f() {
        Context context = BaseApplication.getContext();
        LoginInit loginInit = LoginInit.getInstance(BaseApplication.getContext());
        if (Utils.o()) {
            String strE = SharedPreferenceManager.e(context, Integer.toString(10000), "personalized_recommend");
            if (!TextUtils.isEmpty(strE)) {
                wmq.a(context).a(12, "1".equals(strE));
                return;
            }
            String strA = iox.a("content-recommendation-001");
            if (TextUtils.isEmpty(strA) || loginInit.isMinorAccount()) {
                return;
            }
            boolean zEquals = "1".equals(strA);
            LogUtil.a("PrivacyInteractors", "updateRecommendation couldSwitch：", Boolean.valueOf(zEquals));
            wmq.a(context).a(12, zEquals);
            return;
        }
        int iJ = CommonUtil.j(loginInit.getAccountInfo(1009));
        boolean zB = SharedPreferenceManager.b(Integer.toString(10000), "privacy_first_login", false);
        if (iJ != 1 || !zB) {
            LogUtil.a("PrivacyInteractors", "updateRecommendation is not support");
        } else {
            p();
            w();
        }
    }

    private static void w() {
        Context context = BaseApplication.getContext();
        if (!SharedPreferenceManager.e(Integer.toString(10000), "privacy_personalized_recommend")) {
            LogUtil.a("PrivacyInteractors", "updateRecommendation not contain key");
            return;
        }
        boolean zB = SharedPreferenceManager.b(Integer.toString(10000), "privacy_personalized_recommend", true);
        LogUtil.a("PrivacyInteractors", "set recommendation is ", Boolean.valueOf(zB));
        SharedPreferenceManager.a(Integer.toString(10000), "privacy_first_login", false);
        if (VersionControlUtil.isSupportOperationAccount()) {
            wmq.a(context).a(12, zB);
        } else if (!zB) {
            wmq.a(context).a(12, false);
        } else {
            LogUtil.a("PrivacyInteractors", "set recommendation do not update");
        }
        c(context, zB);
    }

    private static void c(Context context, boolean z) {
        if (Utils.o()) {
            LogUtil.j("PrivacyInteractors", "updateWatchFaceRecommendation is not support");
        } else {
            wmq.a(context).a(17, z);
        }
    }

    private static void p() {
        if (!SharedPreferenceManager.e(Integer.toString(10000), "privacy_personalized_ad_recommend")) {
            LogUtil.a("PrivacyInteractors", "updateAdRecommendation not contain key");
            return;
        }
        Context context = BaseApplication.getContext();
        boolean z = SharedPreferenceManager.b(Integer.toString(10000), "privacy_personalized_ad_recommend", true) && !LoginInit.getInstance(BaseApplication.getContext()).isMinorAccount();
        LogUtil.a("PrivacyInteractors", "set ad recommendation is ", Boolean.valueOf(z));
        SharedPreferenceManager.a(Integer.toString(10000), "privacy_first_login", false);
        wmq.a(context).a(13, z);
        wmq.a(context).a(14, z);
        wmq.a(context).a(15, z);
    }

    private static void c(HealthTextView healthTextView, int i) {
        if (healthTextView != null) {
            healthTextView.setTextSize(1, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        HandlerExecutor.b(new Runnable() { // from class: fnv
            @Override // java.lang.Runnable
            public final void run() {
                DynamicResourcesLoader.b(BaseApplication.getContext());
            }
        });
    }

    public static boolean a() {
        return SharedPreferenceManager.b(Integer.toString(PrebakedEffectId.RT_FLY), "is_base_service_model", false);
    }
}
