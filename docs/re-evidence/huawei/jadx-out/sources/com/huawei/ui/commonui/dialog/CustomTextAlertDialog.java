package com.huawei.ui.commonui.dialog;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.view.GravityCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes3.dex */
public class CustomTextAlertDialog extends BaseDialog {
    private CustomTextAlertDialog(Context context, int i) {
        super(context, i);
    }

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private CustomTextAlertDialog f23422a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Context f23424c;
        private String e;
        private LinearLayout g;
        private boolean h;
        private RelativeLayout i;
        private LinearLayout j;
        private String k;
        private HealthButton l;
        private HealthButton m;
        private View.OnClickListener n;
        private Integer o;
        private View.OnClickListener p;
        private SpannableString q;
        private Context r;
        private String s;
        private Integer t;
        private HealthButton u;
        private String w;
        private boolean d = false;
        private boolean f = false;
        private int v = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f23423b = 0;

        public Builder(Context context) {
            this.f23424c = context;
        }

        public Builder e(Context context) {
            if (context == null) {
                context = this.f23424c;
            }
            this.r = context;
            return this;
        }

        public Builder b(boolean z) {
            this.h = z;
            return this;
        }

        private String e(int i) {
            if (this.f23424c == null) {
                this.f23424c = BaseApplication.b();
            }
            try {
                return (String) this.f23424c.getText(i);
            } catch (Resources.NotFoundException unused) {
                LogUtil.e("CustomTextAlertDialog", "Resources NotFound");
                return "";
            }
        }

        public Builder b(Integer num) {
            this.t = num;
            return this;
        }

        public Builder d(Integer num) {
            this.o = num;
            return this;
        }

        public Builder a(int i) {
            LogUtil.d("CustomTextAlertDialog", "setTitle: ", Integer.valueOf(i));
            this.w = e(i);
            return this;
        }

        public Builder e(String str) {
            LogUtil.d("CustomTextAlertDialog", "setTitle: ", str);
            this.w = str;
            return this;
        }

        public Builder b(Boolean bool) {
            this.d = bool.booleanValue();
            return this;
        }

        public Builder e(Boolean bool) {
            this.f = bool.booleanValue();
            return this;
        }

        public Builder b(int i) {
            this.e = e(i);
            return this;
        }

        public Builder a(String str) {
            this.e = str;
            return this;
        }

        public Builder d(SpannableString spannableString) {
            this.q = spannableString;
            return this;
        }

        public Builder a(int i, View.OnClickListener onClickListener) {
            this.s = e(i);
            this.p = onClickListener;
            return this;
        }

        public Builder b(String str, View.OnClickListener onClickListener) {
            if (!TextUtils.isEmpty(str)) {
                this.s = str;
            }
            this.p = onClickListener;
            return this;
        }

        public Builder e(int i, int i2, View.OnClickListener onClickListener) {
            a(i, onClickListener);
            HealthButton healthButton = this.l;
            if (healthButton != null) {
                try {
                    healthButton.setTextColor(qre.e(this.r, i2));
                    return this;
                } catch (Resources.NotFoundException unused) {
                    LogUtil.e("CustomTextAlertDialog", "color not found");
                }
            }
            return this;
        }

        public Builder e(int i, View.OnClickListener onClickListener) {
            this.k = e(i);
            this.n = onClickListener;
            return this;
        }

        public Builder a(String str, View.OnClickListener onClickListener) {
            if (!TextUtils.isEmpty(str)) {
                this.k = str;
            }
            this.n = onClickListener;
            return this;
        }

        public CustomTextAlertDialog b() {
            Drawable drawableD;
            int dimensionPixelSize;
            int dimensionPixelSize2;
            LayoutInflater layoutInflater = (LayoutInflater) this.f23424c.getSystemService("layout_inflater");
            this.f23422a = new CustomTextAlertDialog(this.f23424c, R.style.CustomDialog);
            View viewInflate = layoutInflater.inflate(R.layout.commonui_custom_text_alert_dialog, (ViewGroup) null);
            TypedValue typedValue = new TypedValue();
            this.f23424c.getTheme().resolveAttribute(R.attr.customDialogStyleRefer, typedValue, true);
            if (typedValue.resourceId != 0) {
                TypedArray typedArrayObtainStyledAttributes = this.f23424c.getTheme().obtainStyledAttributes(typedValue.resourceId, R.styleable.customDialogDefinition);
                drawableD = typedArrayObtainStyledAttributes.getDrawable(R.styleable.customDialogDefinition_dialogBackground);
                TypedValue typedValue2 = new TypedValue();
                TypedValue typedValue3 = new TypedValue();
                typedArrayObtainStyledAttributes.getValue(R.styleable.customDialogDefinition_titleTextSize, typedValue2);
                typedArrayObtainStyledAttributes.getValue(R.styleable.customDialogDefinition_contentTextSize, typedValue3);
                dimensionPixelSize = qrs.d(this.f23424c, (int) TypedValue.complexToFloat(typedValue2.data));
                dimensionPixelSize2 = qrs.d(this.f23424c, (int) TypedValue.complexToFloat(typedValue3.data));
                typedArrayObtainStyledAttributes.recycle();
            } else {
                drawableD = qre.d(this.r, R.drawable.activity_dialog_bg);
                dimensionPixelSize = this.f23424c.getResources().getDimensionPixelSize(R.dimen.custom_normal_titlebar_title_textsize);
                dimensionPixelSize2 = this.f23424c.getResources().getDimensionPixelSize(R.dimen.textSizeBody1);
            }
            if (this.h) {
                drawableD = qre.d(this.r, R.drawable.activity_dialog_bg);
            }
            viewInflate.setBackground(drawableD);
            c(viewInflate, dimensionPixelSize, dimensionPixelSize2);
            a(viewInflate);
            this.f23422a.setContentView(viewInflate);
            return this.f23422a;
        }

        private void c(View view, int i, int i2) {
            int i3;
            int i4 = this.v;
            if (i4 <= 0 || (i3 = this.f23423b) <= 0) {
                i4 = i;
                i3 = i2;
            }
            HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.custom_dailog_title);
            healthTextView.setTextColor(qre.e(this.r, R.color.textColorPrimary));
            if (this.f) {
                healthTextView.setTextAlignment(4);
            }
            healthTextView.setTextSize(0, i4);
            healthTextView.setText(this.w);
            HealthTextView healthTextView2 = (HealthTextView) view.findViewById(R.id.custom_text_alert_dialog_title_simple);
            healthTextView2.setTextColor(qre.e(this.r, R.color.textColorPrimary));
            healthTextView2.setTextSize(0, i);
            healthTextView2.setText(this.w);
            LogUtil.d("CustomTextAlertDialog", "mContent = ", this.e, " contentTextSize = ", Integer.valueOf(i2));
            HealthTextView healthTextView3 = (HealthTextView) view.findViewById(R.id.dialog_text_alert_message);
            healthTextView3.setTextColor(qre.e(this.r, R.color.textColorPrimary));
            if (qrs.v()) {
                healthTextView3.setTextSize(1, 28.0f);
            } else {
                healthTextView3.setTextSize(0, i3);
            }
            SpannableString spannableString = this.q;
            if (spannableString != null) {
                healthTextView3.setText(spannableString);
                healthTextView3.setMovementMethod(LinkMovementMethod.getInstance());
            } else {
                healthTextView3.setText(this.e);
                if (TextUtils.isEmpty(this.e)) {
                    healthTextView3.setVisibility(8);
                    healthTextView.setVisibility(8);
                    healthTextView2.setVisibility(0);
                }
            }
            if (LanguageUtil.bo(this.f23424c)) {
                healthTextView3.setPadding(healthTextView3.getPaddingLeft(), healthTextView3.getPaddingTop(), healthTextView3.getPaddingRight(), (int) this.f23424c.getResources().getDimension(R.dimen.health_common_1_5dp));
            }
        }

        private void a(View view) {
            this.i = (RelativeLayout) view.findViewById(R.id.dialog_linearlayout1);
            this.j = (LinearLayout) view.findViewById(R.id.dialog_linearlayout2);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.dialog_text_alert_message_layout);
            this.g = linearLayout;
            if (this.d) {
                linearLayout.setGravity(GravityCompat.START);
            }
            this.m = (HealthButton) this.i.findViewById(R.id.dialog_btn_negative);
            this.l = (HealthButton) this.i.findViewById(R.id.dialog_btn_positive);
            this.u = (HealthButton) this.j.findViewById(R.id.dialog_one_btn);
            Drawable drawableD = qre.d(this.r, R.drawable.dialog_button_background);
            this.m.setBackground(drawableD);
            this.l.setBackground(drawableD);
            this.u.setBackground(drawableD);
            try {
                Integer num = this.t;
                if (num != null) {
                    this.l.setTextColor(qre.e(this.r, num.intValue()));
                }
                Integer num2 = this.o;
                if (num2 != null) {
                    this.m.setTextColor(qre.e(this.r, num2.intValue()));
                }
            } catch (Resources.NotFoundException unused) {
                LogUtil.e("CustomTextAlertDialog", "color not found");
            }
            String str = this.s;
            if (str != null && this.k != null) {
                e();
                return;
            }
            if (str == null && this.k != null) {
                d();
            } else if (str != null && this.k == null) {
                g();
            } else {
                this.i.setVisibility(8);
                this.j.setVisibility(8);
            }
        }

        private void e() {
            this.i.setVisibility(0);
            this.j.setVisibility(8);
            int length = this.s.length() - this.k.length();
            StringBuilder sb = new StringBuilder();
            LogUtil.d("CustomTextAlertDialog", "number=", Integer.valueOf(length));
            if (length > 1) {
                this.k = d(length, sb, new StringBuilder(this.k));
            }
            if (length < -1) {
                this.s = d(length, sb, new StringBuilder(this.s));
            }
            this.l.setText(this.s);
            this.l.setAllCaps(true);
            if (this.p != null) {
                this.l.setOnClickListener(new c());
            }
            this.m.setText(this.k);
            this.m.setAllCaps(true);
            qrs.d(this.m, this.l);
            if (this.n != null) {
                this.m.setOnClickListener(new d());
            }
        }

        private void g() {
            this.i.setVisibility(8);
            this.j.setVisibility(0);
            this.u.setText(this.s);
            qrs.c(this.u);
            if (this.p != null) {
                this.u.setOnClickListener(new c());
            }
        }

        private void d() {
            this.i.setVisibility(8);
            this.j.setVisibility(0);
            this.u.setText(this.k);
            qrs.c(this.u);
            if (this.n != null) {
                this.u.setOnClickListener(new d());
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        class c implements View.OnClickListener {
            c() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CustomTextAlertDialog.b(Builder.this.f23422a, Builder.this.p, view);
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        class d implements View.OnClickListener {
            d() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CustomTextAlertDialog.b(Builder.this.f23422a, Builder.this.n, view);
            }
        }

        public void a(int i, int i2) {
            this.v = i;
            this.f23423b = i2;
        }

        public HealthButton c() {
            return this.l;
        }

        public HealthButton a() {
            return this.m;
        }

        private String d(int i, StringBuilder sb, StringBuilder sb2) {
            int iAbs = Math.abs(i);
            if (iAbs % 2 == 0) {
                return b(iAbs, sb, sb2);
            }
            return b(iAbs - 1, sb, sb2);
        }

        private String b(int i, StringBuilder sb, StringBuilder sb2) {
            for (int i2 = 0; i2 < i / 2; i2++) {
                sb.append("  ");
            }
            sb2.insert(0, "  ");
            sb2.insert(0, (CharSequence) sb);
            sb2.append((CharSequence) sb);
            sb2.append("  ");
            return sb2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(CustomTextAlertDialog customTextAlertDialog, View.OnClickListener onClickListener, View view) {
        if (customTextAlertDialog != null) {
            customTextAlertDialog.dismiss();
        }
        if (onClickListener != null) {
            onClickListener.onClick(view);
        } else {
            LogUtil.d("CustomTextAlertDialog", "buttonClickListener is null");
        }
    }
}
