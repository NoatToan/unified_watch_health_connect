package com.huawei.ui.commonui.dialog;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
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

/* JADX INFO: loaded from: classes43.dex */
public class HarmonyAlertDialog extends BaseDialog {
    private HarmonyAlertDialog(Context context, int i) {
        super(context, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(HarmonyAlertDialog harmonyAlertDialog, View.OnClickListener onClickListener, View view) {
        if (harmonyAlertDialog != null) {
            harmonyAlertDialog.dismiss();
        }
        if (onClickListener != null) {
            onClickListener.onClick(view);
        } else {
            LogUtil.c("HarmonyAlertDialog", "onClickListener is null");
        }
    }

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f23430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f23431b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f23432c;
        private Drawable d;
        private Typeface e;
        private HarmonyAlertDialog f;
        private Drawable g;
        private boolean h;
        private View.OnClickListener i;
        private boolean j;
        private int k;
        private View.OnClickListener l;
        private String m;
        private int n;
        private String o;
        private String p;
        private SpannableString t;

        public Builder(Context context) {
            this.f23430a = context;
        }

        public Builder e(String str) {
            this.p = str;
            return this;
        }

        public Builder a(String str) {
            this.f23432c = str;
            return this;
        }

        public Builder a(int i, View.OnClickListener onClickListener) {
            try {
                Context context = this.f23430a;
                if (context != null) {
                    this.o = (String) context.getText(i);
                }
            } catch (Resources.NotFoundException unused) {
                LogUtil.d("HarmonyAlertDialog", "setNegativeButton resources not found：", Integer.valueOf(i));
                this.o = "";
            }
            this.i = onClickListener;
            return this;
        }

        public HarmonyAlertDialog c() {
            View viewInflate = ((LayoutInflater) this.f23430a.getSystemService("layout_inflater")).inflate(R.layout.commonui_harmony_dialog, (ViewGroup) null);
            HarmonyAlertDialog harmonyAlertDialog = new HarmonyAlertDialog(this.f23430a, R.style.CustomDialog);
            this.f = harmonyAlertDialog;
            harmonyAlertDialog.setWindowGravityParams(17);
            this.f.setContentView(viewInflate);
            if (this.d == null) {
                this.d = qre.d(this.f23430a, R.drawable.dialog_bg_harmony);
            }
            viewInflate.setBackground(this.d);
            b(viewInflate);
            a(viewInflate);
            RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(R.id.dialog_linearlayout1);
            LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.dialog_linearlayout2);
            HealthButton healthButton = (HealthButton) relativeLayout.findViewById(R.id.dialog_btn_negative);
            HealthButton healthButton2 = (HealthButton) relativeLayout.findViewById(R.id.dialog_btn_positive);
            HealthButton healthButton3 = (HealthButton) linearLayout.findViewById(R.id.dialog_one_btn);
            if (this.g == null) {
                this.g = qre.d(this.f23430a, R.drawable.dialog_button_background_harmony);
            }
            healthButton.setBackground(this.g);
            healthButton2.setBackground(this.g);
            healthButton3.setBackground(this.g);
            relativeLayout.setVisibility(8);
            linearLayout.setVisibility(8);
            if (!TextUtils.isEmpty(this.m) && !TextUtils.isEmpty(this.o)) {
                relativeLayout.setVisibility(0);
                d(healthButton, this.n, this.o, new c());
                d(healthButton2, this.k, this.m, new d());
            } else if (!TextUtils.isEmpty(this.o)) {
                linearLayout.setVisibility(0);
                d(healthButton3, this.n, this.o, new c());
            } else if (!TextUtils.isEmpty(this.m)) {
                linearLayout.setVisibility(0);
                d(healthButton3, this.k, this.m, new d());
            }
            return this.f;
        }

        private void b(View view) {
            HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.dialog_tv_title);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.dialog_rlyt_title);
            if (!TextUtils.isEmpty(this.p)) {
                linearLayout.setVisibility(0);
                healthTextView.setVisibility(0);
            }
            if (healthTextView != null) {
                healthTextView.setText(this.p);
            }
        }

        private void a(View view) {
            HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.dialog_no_title_tv_message);
            HealthTextView healthTextView2 = (HealthTextView) view.findViewById(R.id.dialog_no_title_auto_tv_message);
            if (this.h) {
                ((LinearLayout) view.findViewById(R.id.dialog_no_title_llyt_message)).setGravity(17);
            }
            if (this.e == null) {
                this.e = qrr.e();
            }
            healthTextView.setTypeface(this.e);
            if (this.f23431b == 0) {
                this.f23431b = qre.b(R.dimen.default_text_font_size_large);
            }
            if (qrs.v()) {
                healthTextView.setTextSize(1, 32.0f);
            } else {
                healthTextView.setTextSize(0, this.f23431b);
            }
            if (this.j) {
                healthTextView.setVisibility(8);
                healthTextView2.setVisibility(0);
            } else {
                healthTextView.setVisibility(0);
                healthTextView2.setVisibility(8);
            }
            if (this.t != null) {
                if (healthTextView.getVisibility() == 0) {
                    healthTextView.setText(this.t);
                    healthTextView.setMovementMethod(LinkMovementMethod.getInstance());
                }
                if (healthTextView2.getVisibility() == 0) {
                    healthTextView2.setText(this.t);
                    healthTextView2.setMovementMethod(LinkMovementMethod.getInstance());
                    return;
                }
                return;
            }
            int iE = qre.e(this.f23430a, R.color.textColorPrimary);
            if (healthTextView.getVisibility() == 0) {
                healthTextView.setText(this.f23432c);
                healthTextView.setTextColor(iE);
            }
            if (healthTextView2.getVisibility() == 0) {
                healthTextView2.setText(this.f23432c);
                healthTextView2.setTextColor(iE);
            }
        }

        private void d(HealthButton healthButton, int i, String str, View.OnClickListener onClickListener) {
            if (i != 0) {
                try {
                    healthButton.setTextColor(qre.e(this.f23430a, i));
                } catch (Resources.NotFoundException unused) {
                    healthButton.setTextColor(qre.e(this.f23430a, R.color.common_colorAccent));
                }
            } else {
                healthButton.setTextColor(qre.e(this.f23430a, R.color.common_colorAccent));
            }
            healthButton.setText(str);
            healthButton.setOnClickListener(onClickListener);
            c(healthButton);
        }

        private void c(HealthButton healthButton) {
            qrs.a(healthButton, 9, 16, 1, 2);
        }

        class d implements View.OnClickListener {
            d() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HarmonyAlertDialog.e(Builder.this.f, Builder.this.l, view);
            }
        }

        class c implements View.OnClickListener {
            c() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HarmonyAlertDialog.e(Builder.this.f, Builder.this.i, view);
            }
        }
    }
}
