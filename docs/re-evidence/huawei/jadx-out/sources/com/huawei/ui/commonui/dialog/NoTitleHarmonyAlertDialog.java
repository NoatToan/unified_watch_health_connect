package com.huawei.ui.commonui.dialog;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.qre;
import defpackage.qrr;
import defpackage.qrs;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes16.dex */
public class NoTitleHarmonyAlertDialog extends BaseDialog {
    private NoTitleHarmonyAlertDialog(Context context, int i) {
        super(context, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(NoTitleHarmonyAlertDialog noTitleHarmonyAlertDialog, View.OnClickListener onClickListener, View view) {
        if (noTitleHarmonyAlertDialog != null) {
            noTitleHarmonyAlertDialog.dismiss();
        }
        if (onClickListener != null) {
            onClickListener.onClick(view);
        } else {
            LogUtil.c("NoTitleHarmonyAlertDialog", "onClickListener is null");
        }
    }

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Drawable f23457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Context f23458b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Typeface f23459c;
        private String d;
        private int e;
        private boolean f;
        private Drawable g;
        private boolean h;
        private View.OnClickListener i;
        private NoTitleHarmonyAlertDialog j;
        private String k;
        private View.OnClickListener l;
        private int m;
        private int n;
        private String o;
        private SpannableString s;

        public Builder(Context context) {
            this.f23458b = context;
        }

        public Builder e(String str) {
            this.d = str;
            return this;
        }

        public Builder b(String str, View.OnClickListener onClickListener) {
            this.k = str;
            this.l = onClickListener;
            return this;
        }

        public Builder c(String str, View.OnClickListener onClickListener) {
            this.o = str;
            this.i = onClickListener;
            return this;
        }

        public NoTitleHarmonyAlertDialog d() {
            View viewInflate = ((LayoutInflater) this.f23458b.getSystemService("layout_inflater")).inflate(R.layout.commonui_no_title_harmony_dialog, (ViewGroup) null);
            NoTitleHarmonyAlertDialog noTitleHarmonyAlertDialog = new NoTitleHarmonyAlertDialog(this.f23458b, R.style.CustomDialog);
            this.j = noTitleHarmonyAlertDialog;
            noTitleHarmonyAlertDialog.setWindowGravityParams(17);
            this.j.setContentView(viewInflate);
            if (this.f23457a == null) {
                this.f23457a = qre.d(this.f23458b, R.drawable.activity_dialog_bg_harmony);
            }
            viewInflate.setBackground(this.f23457a);
            e(viewInflate);
            RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(R.id.dialog_linearlayout1);
            LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.dialog_linearlayout2);
            HealthButton healthButton = (HealthButton) relativeLayout.findViewById(R.id.dialog_btn_negative);
            HealthButton healthButton2 = (HealthButton) relativeLayout.findViewById(R.id.dialog_btn_positive);
            HealthButton healthButton3 = (HealthButton) linearLayout.findViewById(R.id.dialog_one_btn);
            if (this.g == null) {
                this.g = qre.d(this.f23458b, R.drawable.dialog_button_background_harmony);
            }
            healthButton.setBackground(this.g);
            healthButton2.setBackground(this.g);
            healthButton3.setBackground(this.g);
            relativeLayout.setVisibility(8);
            linearLayout.setVisibility(8);
            String str = this.k;
            if (str != null && this.o != null) {
                relativeLayout.setVisibility(0);
                d(healthButton, this.n, this.o, new a());
                d(healthButton2, this.m, this.k, new c());
            } else if (this.o != null) {
                linearLayout.setVisibility(0);
                d(healthButton3, this.n, this.o, new a());
            } else if (str != null) {
                linearLayout.setVisibility(0);
                d(healthButton3, this.m, this.k, new c());
            }
            return this.j;
        }

        private void e(View view) {
            HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.dialog_no_title_tv_message);
            HealthTextView healthTextView2 = (HealthTextView) view.findViewById(R.id.dialog_no_title_auto_tv_message);
            if (this.h) {
                ((LinearLayout) view.findViewById(R.id.dialog_no_title_llyt_message)).setGravity(17);
            }
            if (this.f23459c == null) {
                this.f23459c = qrr.e();
            }
            healthTextView.setTypeface(this.f23459c);
            if (this.e == 0) {
                this.e = qre.b(R.dimen.default_text_font_size_large);
            }
            if (qrs.v()) {
                healthTextView.setTextSize(1, 32.0f);
            } else {
                healthTextView.setTextSize(0, this.e);
            }
            if (this.f) {
                healthTextView.setVisibility(8);
                healthTextView2.setVisibility(0);
            } else {
                healthTextView.setVisibility(0);
                healthTextView2.setVisibility(8);
            }
            SpannableString spannableString = this.s;
            if (spannableString != null) {
                healthTextView.setText(spannableString);
                healthTextView.setMovementMethod(LinkMovementMethod.getInstance());
                healthTextView2.setText(this.s);
                healthTextView2.setMovementMethod(LinkMovementMethod.getInstance());
                return;
            }
            int iE = qre.e(this.f23458b, R.color.textColorPrimary);
            healthTextView.setText(this.d);
            healthTextView.setTextColor(iE);
            healthTextView2.setText(this.d);
            healthTextView2.setTextColor(iE);
        }

        private void d(HealthButton healthButton, int i, String str, View.OnClickListener onClickListener) {
            if (i != 0) {
                healthButton.setTextColor(qre.e(i));
            } else {
                healthButton.setTextColor(qre.e(this.f23458b, R.color.common_colorAccent));
            }
            healthButton.setText(str);
            healthButton.setOnClickListener(onClickListener);
            d(healthButton);
        }

        private void d(HealthButton healthButton) {
            qrs.a(healthButton, 9, 16, 1, 2);
        }

        class c implements View.OnClickListener {
            c() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                NoTitleHarmonyAlertDialog.b(Builder.this.j, Builder.this.l, view);
            }
        }

        class a implements View.OnClickListener {
            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                NoTitleHarmonyAlertDialog.b(Builder.this.j, Builder.this.i, view);
            }
        }
    }
}
