package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.viewpager.HealthPagerAdapter;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.main.R;
import health.compact.a.CommonUtil;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class wmu extends BaseDialog {
    private wmu(Context context, int i) {
        super(context, i);
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private wmi f52210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Activity f52211b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private wmu f52212c = null;
        private Context d;
        private HealthViewPager e;

        public b(Context context, Activity activity) {
            this.d = context;
            this.f52211b = activity;
            this.f52210a = new wmi(context, activity, null);
        }

        public wmu d() {
            Drawable drawable;
            this.f52212c = new wmu(this.d, R.style.CustomDialog);
            View viewInflate = ((LayoutInflater) this.d.getSystemService("layout_inflater")).inflate(R.layout.ove_privacy_dialog_layout, (ViewGroup) null);
            TypedValue typedValue = new TypedValue();
            this.d.getTheme().resolveAttribute(R.attr.customDialogStyleRefer, typedValue, true);
            TypedArray typedArrayObtainStyledAttributes = this.d.getTheme().obtainStyledAttributes(typedValue.resourceId, R.styleable.customDialogDefinition);
            if (typedValue.resourceId != 0) {
                drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.customDialogDefinition_dialogBackground);
            } else {
                drawable = ContextCompat.getDrawable(this.d, R.drawable.activity_dialog_bg);
            }
            viewInflate.setBackground(drawable);
            a(this.f52212c, viewInflate, this.d);
            HealthViewPager healthViewPager = (HealthViewPager) viewInflate.findViewById(R.id.viewpager);
            this.e = healthViewPager;
            healthViewPager.setIsScroll(false);
            if (wmu.a() || wmu.d()) {
                this.e.setAdapter(c());
            } else {
                this.e.setAdapter(b());
            }
            this.f52212c.setCancelable(false);
            typedArrayObtainStyledAttributes.recycle();
            this.f52212c.b(this.d);
            return this.f52212c;
        }

        private HealthPagerAdapter b() {
            View viewInflate = LayoutInflater.from(this.d).inflate(R.layout.ove_privacy_dialog_page_one, (ViewGroup) null);
            View viewInflate2 = LayoutInflater.from(this.d).inflate(R.layout.ove_privacy_dialog_page_two, (ViewGroup) null);
            b(viewInflate, viewInflate2);
            a(viewInflate, viewInflate2);
            HealthButton healthButton = (HealthButton) viewInflate2.findViewById(R.id.hw_health_agreement_dialog_disagree);
            healthButton.setText(this.d.getString(R.string.IDS_hw_show_cancel).toUpperCase(Locale.getDefault()));
            HealthButton healthButton2 = (HealthButton) viewInflate2.findViewById(R.id.hw_health_agreement_dialog_agree);
            healthButton2.setText(this.d.getString(R.string.IDS_hwh_privacy_revoke_auth).toUpperCase(Locale.getDefault()));
            healthButton.setOnClickListener(new View.OnClickListener() { // from class: wmu.b.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    b.this.f52212c.dismiss();
                }
            });
            d(healthButton2);
            healthButton2.setOnClickListener(new View.OnClickListener() { // from class: wmu.b.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (b.this.f52212c != null) {
                        b.this.f52212c.dismiss();
                    }
                    b.this.f52210a.j();
                }
            });
            HealthButton healthButton3 = (HealthButton) viewInflate.findViewById(R.id.hw_health_privacy_dialog_cancel);
            healthButton3.setText(this.d.getString(R.string.IDS_settings_button_cancal).toUpperCase(Locale.getDefault()));
            healthButton3.setOnClickListener(new View.OnClickListener() { // from class: wmu.b.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (b.this.f52212c != null) {
                        b.this.f52212c.dismiss();
                    }
                }
            });
            HealthButton healthButton4 = (HealthButton) viewInflate.findViewById(R.id.hw_health_privacy_dialog_next);
            healthButton4.setText(this.d.getString(R.string.IDS_startup_next).toUpperCase(Locale.getDefault()));
            healthButton4.setOnClickListener(new View.OnClickListener() { // from class: wmu.b.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    b.this.e.setCurrentItem(1);
                }
            });
            d(healthButton4);
            ArrayList arrayList = new ArrayList(16);
            arrayList.add(viewInflate);
            arrayList.add(viewInflate2);
            return new wmd(arrayList);
        }

        private void d(HealthButton healthButton) {
            if (Utils.h()) {
                healthButton.setBackgroundResource(com.huawei.health.servicesui.R.drawable.hwbutton_default_emui);
                healthButton.setTextColor(this.d.getColor(com.huawei.health.servicesui.R.color.common_colorAccent));
            }
        }

        private void a(View view, View view2) {
            if (qrs.v()) {
                ((HealthTextView) view.findViewById(R.id.hw_health_service_item_all)).setTextSize(1, 26.0f);
                ((HealthTextView) view.findViewById(R.id.text_one)).setTextSize(1, 26.0f);
                ((HealthTextView) view.findViewById(R.id.text_two)).setTextSize(1, 26.0f);
                ((HealthTextView) view.findViewById(R.id.text_three)).setTextSize(1, 26.0f);
                ((HealthTextView) view.findViewById(R.id.text_four)).setTextSize(1, 26.0f);
                ((HealthTextView) view.findViewById(R.id.hw_health_privacy_eu_text_one)).setTextSize(1, 26.0f);
                ((HealthTextView) view.findViewById(R.id.hw_health_privacy_eu_text_two)).setTextSize(1, 26.0f);
                ((HealthTextView) view.findViewById(R.id.save_data_local)).setTextSize(1, 26.0f);
                ((HealthTextView) view.findViewById(R.id.device_data_upload_cloud)).setTextSize(1, 26.0f);
                ((HealthTextView) view.findViewById(R.id.map_location_info)).setTextSize(1, 26.0f);
                ((HealthTextView) view.findViewById(R.id.weather_location_info)).setTextSize(1, 26.0f);
                ((HealthTextView) view.findViewById(R.id.exit_connect_net)).setTextSize(1, 26.0f);
                ((HealthButton) view.findViewById(R.id.hw_health_privacy_dialog_cancel)).setTextSize(1, 26.0f);
                ((HealthButton) view.findViewById(R.id.hw_health_privacy_dialog_next)).setTextSize(1, 26.0f);
                ((HealthTextView) view2.findViewById(R.id.use_permission_declare)).setTextSize(1, 26.0f);
                ((HealthTextView) view2.findViewById(R.id.net_permission)).setTextSize(1, 26.0f);
                ((HealthTextView) view2.findViewById(R.id.service_permission)).setTextSize(1, 26.0f);
                ((HealthTextView) view2.findViewById(R.id.minors_use_description)).setTextSize(1, 26.0f);
                ((HealthTextView) view2.findViewById(R.id.hw_health_ove_agreement_agree_text)).setTextSize(1, 26.0f);
                ((HealthButton) view2.findViewById(R.id.hw_health_agreement_dialog_disagree)).setTextSize(1, 26.0f);
                ((HealthButton) view2.findViewById(R.id.hw_health_agreement_dialog_agree)).setTextSize(1, 26.0f);
            }
        }

        private HealthPagerAdapter c() {
            View viewInflate = View.inflate(this.d, R.layout.ove_privacy_dialog_page_hong_kong, null);
            HealthButton healthButton = (HealthButton) viewInflate.findViewById(R.id.hw_health_agreement_dialog_disagree);
            healthButton.setText(this.d.getString(R.string.IDS_hw_show_cancel).toUpperCase(Locale.getDefault()));
            HealthButton healthButton2 = (HealthButton) viewInflate.findViewById(R.id.hw_health_agreement_dialog_agree);
            healthButton2.setText(this.d.getString(R.string.IDS_hwh_privacy_revoke_auth).toUpperCase(Locale.getDefault()));
            healthButton.setOnClickListener(new View.OnClickListener() { // from class: wmu.b.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    b.this.f52212c.dismiss();
                }
            });
            healthButton2.setOnClickListener(new View.OnClickListener() { // from class: wmu.b.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (b.this.f52212c != null) {
                        b.this.f52212c.dismiss();
                    }
                    b.this.f52210a.j();
                }
            });
            d(healthButton2);
            a(viewInflate);
            d(viewInflate);
            wvi.c((HealthTextView) viewInflate.findViewById(R.id.declare_agreement_view));
            ArrayList arrayList = new ArrayList(16);
            arrayList.add(viewInflate);
            return new wmd(arrayList);
        }

        private void d(View view) {
            if (qrs.v()) {
                ((HealthTextView) view.findViewById(R.id.hw_health_service_item_one)).setTextSize(1, 26.0f);
                ((HealthTextView) view.findViewById(R.id.hw_health_service_item_two)).setTextSize(1, 26.0f);
                ((HealthTextView) view.findViewById(R.id.hw_health_service_item_six)).setTextSize(1, 26.0f);
                ((HealthTextView) view.findViewById(R.id.hw_health_service_item_seven)).setTextSize(1, 26.0f);
                ((HealthTextView) view.findViewById(R.id.minors_use_description)).setTextSize(1, 26.0f);
                ((HealthTextView) view.findViewById(R.id.declare_agreement_view)).setTextSize(1, 26.0f);
                ((HealthButton) view.findViewById(R.id.hw_health_agreement_dialog_disagree)).setTextSize(1, 26.0f);
                ((HealthButton) view.findViewById(R.id.hw_health_agreement_dialog_agree)).setTextSize(1, 26.0f);
            }
        }

        private void a(View view) {
            ((HealthTextView) view.findViewById(R.id.hw_health_service_item_one)).setText(this.d.getString(R.string.IDS_hwh_privacy_permission_total, this.d.getResources().getString(R.string.IDS_hwh_privacy_permission_read)));
            ((HealthTextView) view.findViewById(R.id.hw_health_service_item_two)).setText(wvi.e());
            ((HealthTextView) view.findViewById(R.id.hw_health_service_item_six)).setText(iox.c(this.d, CommonUtil.j(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1009))));
        }

        public void e() {
            HashMap map = new HashMap(16);
            map.put("click", "1");
            lmf.d().c(this.d, AnalyticsValue.HEALTH_CANCEL_AUTH_2040061.value(), map, 0);
            lmf.d().b(this.d);
            final wme wmeVar = new wme(this.f52211b);
            LoginInit loginInit = LoginInit.getInstance(this.d);
            if (Utils.k() || !loginInit.getIsLogined()) {
                LogUtil.a("OverseasCancelAuthDialog", "stopHealth isOverseaNoCloudVersion = true or logout");
                wmeVar.d(this.d);
                wmeVar.g(this.d);
                wmeVar.h(this.d);
                wmeVar.a(this.d);
                return;
            }
            LogUtil.a("OverseasCancelAuthDialog", "stopHealth obtainToken");
            if (!CommonUtil.ab(this.d)) {
                qpx.e(this.d, R.string.IDS_device_hygride_current_network_unavailable);
            } else {
                ThreadPoolManager.c().execute(new Runnable() { // from class: wmr
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f52203b.c(wmeVar);
                    }
                });
            }
        }

        /* synthetic */ void c(wme wmeVar) {
            wmeVar.b(this.d);
        }

        private void b(View view, View view2) {
            HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.hw_health_service_item_all);
            HealthTextView healthTextView2 = (HealthTextView) view.findViewById(R.id.hw_health_privacy_eu_text_two);
            healthTextView.setText(this.d.getString(R.string.IDS_hwh_privacy_permission_total, this.d.getResources().getString(R.string.IDS_hwh_privacy_ove_one)));
            healthTextView2.setMovementMethod(LinkMovementMethod.getInstance());
            healthTextView2.setHighlightColor(this.d.getResources().getColor(android.R.color.transparent));
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.hw_health_privacy_eu_cloud);
            HealthTextView healthTextView3 = (HealthTextView) view.findViewById(R.id.hw_health_privacy_eu_text_one);
            LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.hw_health_privacy_eu_no_cloud);
            if (Utils.h()) {
                linearLayout2.setVisibility(8);
                healthTextView3.setText(this.d.getString(R.string.IDS_hwh_agreement_save_area_two, this.d.getResources().getString(R.string.IDS_hwh_agreement_eu)));
            } else {
                linearLayout.setVisibility(8);
            }
            String string = this.d.getString(R.string.IDS_hwh_privacy_eu_three);
            SpannableString spannableString = new SpannableString(this.d.getString(R.string.IDS_hwh_privacy_eu_two, string));
            int iIndexOf = spannableString.toString().indexOf(string);
            if (iIndexOf != -1) {
                spannableString.setSpan(new wmt(this.d, "HealthPrivacy"), iIndexOf, string.length() + iIndexOf, 17);
            }
            healthTextView2.setText(spannableString);
            SpannableString spannableString2 = new SpannableString(this.d.getString(R.string.IDS_hw_show_setting_about_service_item));
            spannableString2.setSpan(new wmt(this.d, "HealthUserAgreement"), 0, spannableString2.toString().length(), 17);
            HealthTextView healthTextView4 = (HealthTextView) view2.findViewById(R.id.hw_health_ove_agreement_agree_text);
            healthTextView4.setMovementMethod(LinkMovementMethod.getInstance());
            healthTextView4.setHighlightColor(this.d.getResources().getColor(android.R.color.transparent));
            healthTextView4.setText(spannableString2);
        }

        private void a(Dialog dialog, View view, Context context) {
            dialog.setContentView(view);
            Window window = dialog.getWindow();
            Display defaultDisplay = ((WindowManager) context.getApplicationContext().getSystemService(Constants.NATIVE_WINDOW_SUB_DIR)).getDefaultDisplay();
            WindowManager.LayoutParams attributes = window.getAttributes();
            int dimensionPixelSize = this.d.getResources().getDimensionPixelSize(R.dimen.dialogMarginStart);
            int dimensionPixelSize2 = this.d.getResources().getDimensionPixelSize(R.dimen.dialogMarginEnd);
            int dimensionPixelSize3 = this.d.getResources().getDimensionPixelSize(R.dimen.dialogMarginBottom);
            Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
            attributes.width = (((defaultDisplay.getWidth() - dimensionPixelSize) - dimensionPixelSize2) - ((Integer) safeRegionWidth.first).intValue()) - ((Integer) safeRegionWidth.second).intValue();
            attributes.height = (int) (defaultDisplay.getHeight() * 0.8f);
            attributes.y = dimensionPixelSize3;
            window.setGravity(80);
            window.setAttributes(attributes);
            window.setWindowAnimations(R.style.track_dialog_anim);
        }
    }

    public void b(Context context) {
        qrs.d(context, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d() {
        if (Utils.k()) {
            return false;
        }
        LoginInit loginInit = LoginInit.getInstance(BaseApplication.getContext());
        return loginInit.getIsLogined() && CommonUtil.j(loginInit.getAccountInfo(1009)) == 5;
    }

    public static boolean a() {
        if (Utils.k()) {
            return false;
        }
        LoginInit loginInit = LoginInit.getInstance(BaseApplication.getContext());
        return loginInit.getIsLogined() && CommonUtil.j(loginInit.getAccountInfo(1009)) == 8;
    }
}
