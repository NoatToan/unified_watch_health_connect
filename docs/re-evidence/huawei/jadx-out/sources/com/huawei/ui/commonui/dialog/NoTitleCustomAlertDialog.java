package com.huawei.ui.commonui.dialog;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.qre;
import defpackage.qrs;

/* JADX INFO: loaded from: classes.dex */
public class NoTitleCustomAlertDialog extends BaseDialog {
    private NoTitleCustomAlertDialog(Context context, int i) {
        super(context, i);
    }

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f23453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f23454b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Context f23455c;
        private NoTitleCustomAlertDialog e;
        private RelativeLayout f;
        private LinearLayout g;
        private boolean h;
        private HealthButton i;
        private View.OnClickListener k;
        private View.OnClickListener l;
        private HealthButton n;
        private String o;
        private SpannableString p;
        private String r;
        private HealthButton s;
        private Context t;
        private boolean d = false;
        private int q = 0;
        private int m = 0;
        private boolean j = false;

        public Builder c(String str) {
            return this;
        }

        public Builder(Context context) {
            this.f23455c = context;
        }

        public Builder b(Context context) {
            if (context == null) {
                context = this.f23455c;
            }
            this.t = context;
            return this;
        }

        public Builder a(boolean z) {
            this.h = z;
            return this;
        }

        public Builder b(boolean z) {
            this.d = z;
            return this;
        }

        public Builder c(boolean z) {
            this.j = z;
            return this;
        }

        public Builder b(int i) {
            try {
                Context context = this.f23455c;
                if (context != null) {
                    this.f23453a = (String) context.getText(i);
                    return this;
                }
            } catch (Resources.NotFoundException unused) {
                LogUtil.e("NoTitleCustomAlertDialog", "Resources NotFound");
                this.f23453a = "";
            }
            return this;
        }

        public Builder a(String str) {
            this.f23453a = str;
            return this;
        }

        public Builder b(SpannableString spannableString) {
            this.p = spannableString;
            return this;
        }

        public Builder c(int i, View.OnClickListener onClickListener) {
            try {
                Context context = this.f23455c;
                if (context != null) {
                    this.r = (String) context.getText(i);
                }
            } catch (Resources.NotFoundException unused) {
                LogUtil.e("NoTitleCustomAlertDialog", "Resources NotFound");
                this.r = "";
            }
            this.k = onClickListener;
            return this;
        }

        public Builder a(String str, View.OnClickListener onClickListener) {
            this.r = str;
            this.k = onClickListener;
            return this;
        }

        public Builder d(int i, int i2, View.OnClickListener onClickListener) {
            try {
                this.r = (String) this.f23455c.getText(i);
            } catch (Resources.NotFoundException unused) {
                LogUtil.e("NoTitleCustomAlertDialog", "Resources NotFound");
                this.r = "";
            }
            this.q = i2;
            this.k = onClickListener;
            return this;
        }

        public Builder a(String str, int i, View.OnClickListener onClickListener) {
            this.r = str;
            this.q = i;
            this.k = onClickListener;
            return this;
        }

        public Builder a(int i, View.OnClickListener onClickListener) {
            try {
                Context context = this.f23455c;
                if (context != null) {
                    this.o = (String) context.getText(i);
                }
            } catch (Resources.NotFoundException unused) {
                LogUtil.e("NoTitleCustomAlertDialog", "Resources NotFound");
                this.o = "";
            }
            this.l = onClickListener;
            return this;
        }

        public Builder d(String str, View.OnClickListener onClickListener) {
            this.o = str;
            this.l = onClickListener;
            return this;
        }

        public Builder e(int i, int i2, View.OnClickListener onClickListener) {
            try {
                this.o = (String) this.f23455c.getText(i);
            } catch (Resources.NotFoundException unused) {
                LogUtil.e("NoTitleCustomAlertDialog", "Resources NotFound");
                this.o = "";
            }
            this.m = i2;
            this.l = onClickListener;
            return this;
        }

        public NoTitleCustomAlertDialog c() {
            Drawable drawableD;
            int dimensionPixelSize;
            LayoutInflater layoutInflater = (LayoutInflater) this.f23455c.getSystemService("layout_inflater");
            this.e = new NoTitleCustomAlertDialog(this.f23455c, R.style.CustomDialog);
            View viewInflate = layoutInflater.inflate(R.layout.commonui_no_title_custom_dialog, (ViewGroup) null);
            this.e.setContentView(viewInflate);
            TypedValue typedValue = new TypedValue();
            this.f23455c.getApplicationContext().getTheme().resolveAttribute(R.attr.customDialogStyleRefer, typedValue, true);
            if (typedValue.resourceId != 0) {
                TypedArray typedArrayObtainStyledAttributes = this.f23455c.getTheme().obtainStyledAttributes(typedValue.resourceId, R.styleable.customDialogDefinition);
                drawableD = typedArrayObtainStyledAttributes.getDrawable(R.styleable.customDialogDefinition_dialogBackground);
                TypedValue typedValue2 = new TypedValue();
                typedArrayObtainStyledAttributes.getValue(R.styleable.customDialogDefinition_contentTextSize, typedValue2);
                this.f23454b = typedArrayObtainStyledAttributes.getColor(R.styleable.customDialogDefinition_buttonTextColor, R.color.common_colorAccent);
                dimensionPixelSize = TypedValue.complexToDimensionPixelSize(typedValue2.data, this.f23455c.getResources().getDisplayMetrics());
                typedArrayObtainStyledAttributes.recycle();
            } else {
                drawableD = qre.d(this.t, R.drawable.activity_dialog_bg);
                this.f23454b = qre.e(this.t, R.color.common_colorAccent);
                dimensionPixelSize = this.f23455c.getApplicationContext().getResources().getDimensionPixelSize(R.dimen.default_text_font_size_large2);
                int dimensionPixelSize2 = this.f23455c.getResources().getDimensionPixelSize(R.dimen.default_text_font_size_large2);
                if (dimensionPixelSize <= dimensionPixelSize2) {
                    dimensionPixelSize = dimensionPixelSize2;
                }
            }
            if (this.h) {
                drawableD = qre.d(this.t, R.drawable.activity_dialog_bg);
            }
            viewInflate.setBackground(drawableD);
            HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.dialog_no_title_tv_message);
            HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(R.id.dialog_no_title_auto_tv_message);
            LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.dialog_no_title_llyt_message);
            if (this.d) {
                linearLayout.setGravity(17);
            }
            if (dimensionPixelSize != -1) {
                healthTextView.setTextSize(0, dimensionPixelSize);
            }
            if (qrs.v()) {
                healthTextView.setTextSize(1, 32.0f);
            }
            if (this.j) {
                healthTextView.setVisibility(8);
                healthTextView2.setVisibility(0);
            } else {
                healthTextView.setVisibility(0);
                healthTextView2.setVisibility(8);
            }
            c(healthTextView, healthTextView2);
            e(viewInflate);
            this.e.setContentView(viewInflate);
            return this.e;
        }

        private void c(HealthTextView healthTextView, HealthTextView healthTextView2) {
            SpannableString spannableString = this.p;
            if (spannableString != null) {
                healthTextView.setText(spannableString);
                healthTextView2.setText(this.p);
                healthTextView.setMovementMethod(LinkMovementMethod.getInstance());
                healthTextView2.setMovementMethod(LinkMovementMethod.getInstance());
                return;
            }
            healthTextView.setText(this.f23453a);
            healthTextView2.setText(this.f23453a);
            int iE = qre.e(this.t, R.color.textColorPrimary);
            healthTextView.setTextColor(iE);
            healthTextView2.setTextColor(iE);
        }

        private void e(View view) {
            this.f = (RelativeLayout) view.findViewById(R.id.dialog_linearlayout1);
            this.g = (LinearLayout) view.findViewById(R.id.dialog_linearlayout2);
            this.i = (HealthButton) this.f.findViewById(R.id.dialog_btn_negative);
            this.n = (HealthButton) this.f.findViewById(R.id.dialog_btn_positive);
            this.s = (HealthButton) this.g.findViewById(R.id.dialog_one_btn);
            Drawable drawableD = qre.d(this.t, R.drawable.dialog_button_background);
            this.i.setBackground(drawableD);
            this.n.setBackground(drawableD);
            this.s.setBackground(drawableD);
            LogUtil.d("NoTitleCustomAlertDialog", "negativeButtonText = ", this.o);
            String str = this.r;
            if (str != null && this.o != null) {
                d();
                return;
            }
            if (str == null && this.o != null) {
                e();
            } else if (str != null && this.o == null) {
                a();
            } else {
                this.f.setVisibility(8);
                this.g.setVisibility(8);
            }
        }

        private void d() {
            this.f.setVisibility(0);
            this.g.setVisibility(8);
            int length = this.r.length() - this.o.length();
            StringBuilder sb = new StringBuilder();
            LogUtil.d("NoTitleCustomAlertDialog", "number=", Integer.valueOf(length));
            if (length > 1) {
                this.o = b(length, sb, new StringBuilder(this.o));
            }
            if (length < -1) {
                this.r = b(length, sb, new StringBuilder(this.r));
            }
            this.n.setText(this.r);
            if (this.q != 0) {
                this.n.setTextColor(this.f23455c.getResources().getColor(this.q));
            } else {
                int i = this.f23454b;
                if (i != 0) {
                    this.n.setTextColor(i);
                } else {
                    LogUtil.d("NoTitleCustomAlertDialog", "positiveButton setTextColor default.");
                }
            }
            if (this.k != null) {
                this.n.setOnClickListener(new b());
            } else {
                LogUtil.d("NoTitleCustomAlertDialog", "positiveButtonClickListener is null");
            }
            this.i.setText(this.o);
            qrs.d(this.i, this.n);
            if (this.m != 0) {
                this.i.setTextColor(this.f23455c.getResources().getColor(this.m));
            } else {
                int i2 = this.f23454b;
                if (i2 != 0) {
                    this.i.setTextColor(i2);
                } else {
                    LogUtil.d("NoTitleCustomAlertDialog", "negativeButton setTextColor default.");
                }
            }
            if (this.l != null) {
                this.i.setOnClickListener(new e());
            }
        }

        private void a() {
            b(this.r, this.q, this.n, this.k, new b());
        }

        private void e() {
            b(this.o, this.m, this.i, this.l, new e());
        }

        /* JADX INFO: loaded from: classes16.dex */
        class b implements View.OnClickListener {
            b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                NoTitleCustomAlertDialog.b(Builder.this.e, Builder.this.k, view);
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        class e implements View.OnClickListener {
            e() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                NoTitleCustomAlertDialog.b(Builder.this.e, Builder.this.l, view);
            }
        }

        private String b(int i, StringBuilder sb, StringBuilder sb2) {
            return qrs.a(i, sb, sb2, false);
        }

        private void b(String str, int i, HealthButton healthButton, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
            this.f.setVisibility(8);
            this.g.setVisibility(0);
            this.s.setText(str);
            qrs.c(this.s);
            if (i != 0) {
                healthButton.setTextColor(this.f23455c.getResources().getColor(i));
            } else {
                int i2 = this.f23454b;
                if (i2 != 0) {
                    healthButton.setTextColor(i2);
                } else {
                    LogUtil.d("NoTitleCustomAlertDialog", "setTextColor default.");
                }
            }
            if (onClickListener != null) {
                this.s.setOnClickListener(onClickListener2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(NoTitleCustomAlertDialog noTitleCustomAlertDialog, View.OnClickListener onClickListener, View view) {
        if (noTitleCustomAlertDialog != null) {
            noTitleCustomAlertDialog.dismiss();
        }
        if (onClickListener != null) {
            onClickListener.onClick(view);
        } else {
            LogUtil.d("NoTitleCustomAlertDialog", "buttonClickListener is null");
        }
    }
}
