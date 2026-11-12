package com.huawei.ui.commonui.dialog;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hihealth.model.SampleEvent;
import com.huawei.hms.mlsdk.asr.MLAsrConstants;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.webview.WebViewActivity;
import com.huawei.ui.main.stories.nps.component.NpsConstantValue;
import defpackage.lmf;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public class SecurityManagerSettingSwitchDialog extends BaseDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f23474a = "SecurityManagerSettingSwitchDialog";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f23475c;
    private static long d;

    public SecurityManagerSettingSwitchDialog(Context context, int i) {
        super(context, i);
    }

    public static class Builder {
        private static SecurityManagerSettingSwitchDialog d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthButton f23476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthButton f23477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Context f23478c;
        private String h;
        private HealthTextView i;
        private HealthTextView j;
        private RelativeLayout g = null;
        private LinearLayout e = null;

        public Builder(Context context) {
            this.f23478c = context;
        }

        public void a(String str) {
            this.h = "<a href=\"" + str + "/help/mobilephone/zh-CN/index.html\">$</a>";
        }

        public SecurityManagerSettingSwitchDialog a() {
            long unused = SecurityManagerSettingSwitchDialog.f23475c = System.currentTimeMillis();
            a(this.f23478c);
            View viewInflate = ((LayoutInflater) this.f23478c.getSystemService("layout_inflater")).inflate(R.layout.custom_securitymanagersetting_alert_dialog, (ViewGroup) null);
            View viewFindViewById = viewInflate.findViewById(R.id.custom_text_alert_dailog_title);
            if (viewFindViewById instanceof HealthTextView) {
                this.i = (HealthTextView) viewFindViewById;
            }
            View viewFindViewById2 = viewInflate.findViewById(R.id.dialog_text_alert_message);
            if (viewFindViewById2 instanceof HealthTextView) {
                this.j = (HealthTextView) viewFindViewById2;
            }
            b(viewInflate);
            h();
            TypedValue typedValue = new TypedValue();
            this.f23478c.getTheme().resolveAttribute(R.attr.customDialogStyleRefer, typedValue, true);
            TypedArray typedArrayObtainStyledAttributes = this.f23478c.getTheme().obtainStyledAttributes(typedValue.resourceId, R.styleable.customDialogDefinition);
            TypedValue typedValue2 = new TypedValue();
            TypedValue typedValue3 = new TypedValue();
            typedArrayObtainStyledAttributes.getValue(R.styleable.customDialogDefinition_titleTextSize, typedValue2);
            typedArrayObtainStyledAttributes.getValue(R.styleable.customDialogDefinition_contentTextSize, typedValue3);
            this.i.setTextSize(1, (int) TypedValue.complexToFloat(typedValue2.data));
            this.i.setText(R.string.IDS_service_area_notice_title);
            int iComplexToFloat = (int) TypedValue.complexToFloat(typedValue3.data);
            if (qrs.v()) {
                this.j.setTextSize(1, 28.0f);
            } else {
                this.j.setTextSize(1, iComplexToFloat);
            }
            n();
            k();
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.customDialogDefinition_dialogBackground);
            typedArrayObtainStyledAttributes.recycle();
            viewInflate.setBackground(drawable);
            d.setContentView(viewInflate);
            d.setCancelable(false);
            j();
            return d;
        }

        private void j() {
            Window window = d.getWindow();
            window.setGravity(80);
            Display defaultDisplay = ((WindowManager) this.f23478c.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR)).getDefaultDisplay();
            WindowManager.LayoutParams attributes = window.getAttributes();
            int dimensionPixelSize = this.f23478c.getResources().getDimensionPixelSize(R.dimen.dialogMarginBottom);
            int dimensionPixelSize2 = this.f23478c.getResources().getDimensionPixelSize(R.dimen.dialogMarginStart);
            int dimensionPixelSize3 = this.f23478c.getResources().getDimensionPixelSize(R.dimen.dialogMarginEnd);
            Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
            attributes.width = (((defaultDisplay.getWidth() - dimensionPixelSize2) - dimensionPixelSize3) - ((Integer) safeRegionWidth.first).intValue()) - ((Integer) safeRegionWidth.second).intValue();
            attributes.y = dimensionPixelSize;
            window.setAttributes(attributes);
            window.setWindowAnimations(R.style.track_dialog_anim);
        }

        private void b(View view) {
            View viewFindViewById = view.findViewById(R.id.dialog_linearlayout1);
            if (viewFindViewById instanceof RelativeLayout) {
                this.g = (RelativeLayout) viewFindViewById;
            }
            View viewFindViewById2 = view.findViewById(R.id.dialog_linearlayout2);
            if (viewFindViewById2 instanceof LinearLayout) {
                this.e = (LinearLayout) viewFindViewById2;
            }
            this.e.setVisibility(8);
        }

        private void h() {
            this.h = this.h.replace(SampleEvent.SEPARATOR, this.f23478c.getResources().getString(R.string.IDS_unusual_stopped_message_more_new_health));
            Locale locale = Locale.getDefault();
            String language = locale.getLanguage();
            String country = locale.getCountry();
            LogUtil.a(SecurityManagerSettingSwitchDialog.f23474a, "the language code is ", language);
            LogUtil.a(SecurityManagerSettingSwitchDialog.f23474a, "the country code is ", country);
            if (MLAsrConstants.LAN_ZH.equals(language) && "CN".equals(country)) {
                this.h = this.h.replace("zh-CN", "en-US");
            }
            String str = this.f23478c.getResources().getString(R.string.IDS_unusual_stopped_message_new_health) + " " + this.h;
            if (LanguageUtil.t(this.f23478c)) {
                str = str + ".";
            }
            LogUtil.a(SecurityManagerSettingSwitchDialog.f23474a, "the mUrl is ", str);
            this.j.setText(b(this.f23478c, str, d));
            this.j.setMovementMethod(LinkMovementMethod.getInstance());
        }

        private void n() {
            View viewFindViewById = this.g.findViewById(R.id.dialog_text_alert_btn_positive);
            if (viewFindViewById instanceof HealthButton) {
                this.f23477b = (HealthButton) viewFindViewById;
            }
            HealthButton healthButton = this.f23477b;
            if (healthButton != null) {
                healthButton.setText(R.string.IDS_main_btn_state_settings);
                this.f23477b.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.commonui.dialog.SecurityManagerSettingSwitchDialog.Builder.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        Builder.d.dismiss();
                        long unused = SecurityManagerSettingSwitchDialog.d = System.currentTimeMillis();
                        SecurityManagerSettingSwitchDialog.b(Builder.this.f23478c, 2);
                        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "KEY_ISCREAETDIAOG_KEY_ISCREAETDIAOG_TO_HOME", NpsConstantValue.QUERY_SYSTEM_BUSY, null);
                        LogUtil.a(SecurityManagerSettingSwitchDialog.f23474a, "setPositiveButton Dialog status: ", SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "KEY_ISCREAETDIAOG_KEY_ISCREAETDIAOG_TO_HOME"));
                        try {
                            Builder.this.i();
                        } catch (SecurityException unused2) {
                            LogUtil.a(SecurityManagerSettingSwitchDialog.f23474a, "SecurityException when opening security manager");
                            Builder.this.f();
                        } catch (Exception e) {
                            LogUtil.e(SecurityManagerSettingSwitchDialog.f23474a, "Unknown exception occurred when opening security manager ", ExceptionUtils.c(e));
                        }
                    }
                });
            }
        }

        private void k() {
            View viewFindViewById = this.g.findViewById(R.id.dialog_text_alert_btn_negative);
            if (viewFindViewById instanceof HealthButton) {
                this.f23476a = (HealthButton) viewFindViewById;
            }
            HealthButton healthButton = this.f23476a;
            if (healthButton != null) {
                healthButton.setText(R.string.IDS_settings_button_cancal);
                this.f23476a.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.commonui.dialog.SecurityManagerSettingSwitchDialog.Builder.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        Builder.d.dismiss();
                        long unused = SecurityManagerSettingSwitchDialog.d = System.currentTimeMillis();
                        SecurityManagerSettingSwitchDialog.b(Builder.this.f23478c, 1);
                        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "KEY_ISCREAETDIAOG_KEY_ISCREAETDIAOG_TO_HOME", NpsConstantValue.QUERY_SYSTEM_BUSY, null);
                        LogUtil.a(SecurityManagerSettingSwitchDialog.f23474a, "setNegativeButton Dialog status: ", SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "KEY_ISCREAETDIAOG_KEY_ISCREAETDIAOG_TO_HOME"));
                    }
                });
            }
        }

        private static void a(Context context) {
            d = new SecurityManagerSettingSwitchDialog(context, R.style.CustomDialog);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i() {
            try {
                ComponentName componentName = new ComponentName("com.miui.securitycenter", "com.miui.permcenter.autostart.AutoStartManagementActivity");
                Intent intent = new Intent();
                intent.setComponent(componentName);
                this.f23478c.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                LogUtil.a(SecurityManagerSettingSwitchDialog.f23474a, "not XIAOMI, start meizu process");
                b();
            }
        }

        private void b() {
            try {
                Context context = this.f23478c;
                context.startActivity(context.getPackageManager().getLaunchIntentForPackage("com.meizu.safe"));
            } catch (ActivityNotFoundException unused) {
                LogUtil.a(SecurityManagerSettingSwitchDialog.f23474a, "not MEIZU, start oppo process");
                c();
            } catch (Exception unused2) {
                c();
            }
        }

        private void c() {
            try {
                ComponentName componentName = new ComponentName("com.coloros.safecenter", "com.coloros.privacypermissionsentry.PermissionTopActivity");
                Intent intent = new Intent();
                intent.setComponent(componentName);
                this.f23478c.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                LogUtil.a(SecurityManagerSettingSwitchDialog.f23474a, "not oppo, start system setting process");
                g();
            }
        }

        private void g() {
            try {
                Context context = this.f23478c;
                context.startActivity(context.getPackageManager().getLaunchIntentForPackage("com.iqoo.secure"));
            } catch (ActivityNotFoundException unused) {
                LogUtil.a(SecurityManagerSettingSwitchDialog.f23474a, "not vivo, start system setting process");
                e();
            } catch (Exception unused2) {
                e();
            }
        }

        private void e() {
            try {
                ComponentName componentName = new ComponentName("com.letv.android.letvsafe", "com.letv.android.letvsafe.BackgroundAppManageActivity");
                Intent intent = new Intent();
                intent.setComponent(componentName);
                this.f23478c.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                f();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f() {
            try {
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setClassName(this.f23478c, "com.letv.android.letvsafe.BackgroundAppManageActivity");
                intent.setData(Uri.parse("package:com.huawei.bone"));
                this.f23478c.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                LogUtil.e(SecurityManagerSettingSwitchDialog.f23474a, "can't open system setting page. ingnored!!");
            }
        }

        public static SpannableStringBuilder b(Context context, String str, Dialog dialog) {
            if (!TextUtils.isEmpty(str)) {
                Spanned spannedFromHtml = Html.fromHtml(str);
                if (spannedFromHtml instanceof SpannableStringBuilder) {
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) spannedFromHtml;
                    Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    if (spans != null && spans.length != 0) {
                        e(context, dialog, spannableStringBuilder, spans);
                    }
                    return spannableStringBuilder;
                }
            }
            return new SpannableStringBuilder(str);
        }

        private static void e(final Context context, final Dialog dialog, SpannableStringBuilder spannableStringBuilder, Object[] objArr) {
            for (Object obj : objArr) {
                int spanStart = spannableStringBuilder.getSpanStart(obj);
                int spanEnd = spannableStringBuilder.getSpanEnd(obj);
                if (obj instanceof URLSpan) {
                    final String url = ((URLSpan) obj).getURL();
                    spannableStringBuilder.removeSpan(obj);
                    spannableStringBuilder.setSpan(new ClickableSpan() { // from class: com.huawei.ui.commonui.dialog.SecurityManagerSettingSwitchDialog.Builder.3
                        @Override // android.text.style.ClickableSpan
                        public void onClick(View view) {
                            dialog.dismiss();
                            long unused = SecurityManagerSettingSwitchDialog.d = System.currentTimeMillis();
                            SecurityManagerSettingSwitchDialog.b(context, 0);
                            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "KEY_ISCREAETDIAOG_KEY_ISCREAETDIAOG_TO_HOME", NpsConstantValue.QUERY_SYSTEM_BUSY, null);
                            LogUtil.a(SecurityManagerSettingSwitchDialog.f23474a, "setTextLinkOpenByWebView Dialog status: ", SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "KEY_ISCREAETDIAOG_KEY_ISCREAETDIAOG_TO_HOME"));
                            SecurityManagerSettingSwitchDialog.b(context, url, 0);
                        }

                        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                        public void updateDrawState(TextPaint textPaint) {
                            super.updateDrawState(textPaint);
                            textPaint.setColor(Color.parseColor("#fb6522"));
                            textPaint.setUnderlineText(false);
                        }
                    }, spanStart, spanEnd, 17);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, String str, int i) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) WebViewActivity.class);
        intent.putExtra("WebViewActivity.REQUEST_URL_KEY", str);
        intent.putExtra(com.huawei.operation.utils.Constants.JUMP_MODE_KEY, i);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.e(f23474a, "ActivityNotFoundException", e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, int i) {
        long j = d;
        long j2 = f23475c;
        HashMap map = new HashMap(3);
        map.put("click", 1);
        map.put("type", Integer.valueOf(i));
        map.put("duration", Long.valueOf(j - j2));
        lmf.d().c(context, AnalyticsValue.HEALTH_HOME_SHOW__ADD_PROTECTED_APPLICATION_2010077.value(), map, 0);
    }
}
