package com.huawei.ui.commonui.dialog;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.hihealth.ResultUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes16.dex */
@Deprecated
public class CustomViewDialog extends BaseDialog {
    private CustomViewDialog(Context context, int i) {
        super(context, i);
    }

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private CustomViewDialog f23425a;
        private HealthButton ad;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f23426b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Context f23427c;
        private View e;
        private HealthButtonBarLayout g;
        private boolean h;
        private RelativeLayout i;
        private boolean j;
        private View.OnClickListener k;
        private String l;
        private HealthButton o;
        private HealthProgressBar p;
        private String q;
        private Context r;
        private HealthButton s;
        private View.OnClickListener t;
        private String u;
        private View.OnClickListener v;
        private HealthButton w;
        private int x;
        private HealthTextView y;
        private int m = 24;
        private int n = 24;
        private boolean f = true;
        private boolean d = true;

        public Builder(Context context) {
            this.f23427c = context;
        }

        public Builder c(Context context) {
            if (context == null) {
                context = this.f23427c;
            }
            this.r = context;
            return this;
        }

        public Builder e(boolean z) {
            this.h = z;
            return this;
        }

        public void c(boolean z) {
            this.d = z;
        }

        public Builder b(int i) {
            try {
                this.u = (String) ResultUtils.c((String) this.f23427c.getText(i));
                return this;
            } catch (Resources.NotFoundException unused) {
                LogUtil.e("CustomViewDialog", "Resources NotFound");
                this.u = "";
                return this;
            }
        }

        public Builder d(boolean z) {
            this.f23426b = z;
            return this;
        }

        public Builder a(String str) {
            this.u = str;
            return this;
        }

        public Builder b(boolean z) {
            this.f = z;
            return this;
        }

        public Builder d(View view) {
            this.e = view;
            return this;
        }

        public Builder b(View view, int i, int i2) {
            this.e = view;
            if (LanguageUtil.ba(this.f23427c)) {
                this.m = i2;
                this.n = i;
                return this;
            }
            this.m = i;
            this.n = i2;
            return this;
        }

        public Builder d(int i, View.OnClickListener onClickListener) {
            try {
                this.q = (String) this.f23427c.getText(i);
            } catch (Resources.NotFoundException unused) {
                LogUtil.e("CustomViewDialog", "Resources NotFound");
                this.q = "";
            }
            this.t = onClickListener;
            return this;
        }

        public Builder a(String str, View.OnClickListener onClickListener) {
            LogUtil.d("CustomViewDialog", "setPositiveButton called ", str);
            this.q = str;
            this.t = onClickListener;
            return this;
        }

        public Builder c(int i, View.OnClickListener onClickListener) {
            LogUtil.d("CustomViewDialog", "setNegativeButton called ", Integer.valueOf(i));
            try {
                this.l = (String) this.f23427c.getText(i);
            } catch (Resources.NotFoundException unused) {
                LogUtil.e("CustomViewDialog", "Resources NotFound");
                this.l = "";
            }
            this.k = onClickListener;
            return this;
        }

        public Builder c(String str, View.OnClickListener onClickListener) {
            LogUtil.d("CustomViewDialog", "setNegativeButton called ", str);
            this.l = str;
            this.k = onClickListener;
            return this;
        }

        public HealthButton b() {
            return this.s;
        }

        public HealthButton c() {
            return this.o;
        }

        public HealthTextView a() {
            return this.y;
        }

        public CustomViewDialog d() {
            Drawable drawableD;
            int dimensionPixelSize;
            LayoutInflater layoutInflater = (LayoutInflater) this.f23427c.getSystemService("layout_inflater");
            this.f23425a = new CustomViewDialog(this.f23427c, R.style.CustomDialog);
            View viewInflate = layoutInflater.inflate(R.layout.commonui_custom_view_dialog, (ViewGroup) null);
            LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.custom_view_dialog_title_layout);
            d(linearLayout);
            View viewFindViewById = viewInflate.findViewById(R.id.dailog_no_title);
            TypedValue typedValue = new TypedValue();
            this.f23427c.getTheme().resolveAttribute(R.attr.customDialogStyleRefer, typedValue, true);
            if (typedValue.resourceId != 0) {
                TypedArray typedArrayObtainStyledAttributes = this.f23427c.getTheme().obtainStyledAttributes(typedValue.resourceId, R.styleable.customDialogDefinition);
                drawableD = typedArrayObtainStyledAttributes.getDrawable(R.styleable.customDialogDefinition_dialogBackground);
                TypedValue typedValue2 = new TypedValue();
                typedArrayObtainStyledAttributes.getValue(R.styleable.customDialogDefinition_titleTextSize, typedValue2);
                dimensionPixelSize = qrs.d(this.f23427c, (int) TypedValue.complexToFloat(typedValue2.data));
                typedArrayObtainStyledAttributes.recycle();
            } else {
                drawableD = qre.d(this.r, R.drawable.activity_dialog_bg);
                dimensionPixelSize = this.f23427c.getResources().getDimensionPixelSize(R.dimen.custom_normal_titlebar_title_textsize);
            }
            if (this.h) {
                drawableD = qre.d(this.r, R.drawable.activity_dialog_bg);
            }
            viewInflate.setBackground(drawableD);
            a(linearLayout, viewFindViewById, viewInflate, dimensionPixelSize);
            RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(R.id.dialog_rlyt_content);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(qrs.d(this.f23427c, this.m), 0, qrs.d(this.f23427c, this.n), 0);
            if (qrs.v()) {
                layoutParams.height = qrs.m() / 2;
                if (qrs.ac()) {
                    layoutParams.height = (int) (((double) qrs.m()) / 2.5d);
                }
            }
            relativeLayout.setLayoutParams(layoutParams);
            if (this.e != null) {
                relativeLayout.removeAllViews();
                relativeLayout.addView(this.e);
            }
            b(viewInflate);
            this.f23425a.setContentView(viewInflate);
            return this.f23425a;
        }

        public void b(HealthTextView healthTextView, int i) {
            healthTextView.setMaxLines(i);
        }

        private void d(LinearLayout linearLayout) {
            HealthProgressBar healthProgressBar = (HealthProgressBar) linearLayout.findViewById(R.id.dialog_listview_loading);
            this.p = healthProgressBar;
            if (this.f23426b) {
                healthProgressBar.setVisibility(0);
            } else {
                healthProgressBar.setVisibility(8);
            }
            HealthButton healthButton = (HealthButton) linearLayout.findViewById(R.id.dialog_right_top_Button);
            this.w = healthButton;
            healthButton.setBackgroundResource(this.x);
            this.w.setClickable(true);
            if (this.j) {
                this.w.setVisibility(0);
            } else {
                this.w.setVisibility(8);
            }
            this.w.setOnClickListener(new c());
        }

        private void b(View view) {
            this.i = (RelativeLayout) view.findViewById(R.id.dialog_linearlayout1);
            this.g = (HealthButtonBarLayout) view.findViewById(R.id.dialog_linearlayout2);
            this.o = (HealthButton) this.i.findViewById(R.id.dialog_btn_negative);
            this.s = (HealthButton) this.i.findViewById(R.id.dialog_btn_positive);
            this.ad = (HealthButton) this.g.findViewById(R.id.dialog_one_btn);
            Drawable drawableD = qre.d(this.r, R.drawable.dialog_button_background);
            this.o.setBackground(drawableD);
            this.s.setBackground(drawableD);
            this.ad.setBackground(drawableD);
            String str = this.q;
            if (str != null && this.l != null) {
                e();
                return;
            }
            if (str == null && this.l != null) {
                g();
            } else if (str != null && this.l == null) {
                j();
            } else {
                this.i.setVisibility(8);
                this.g.setVisibility(8);
            }
        }

        public void a(boolean z) {
            int i;
            HealthButton healthButton = this.s;
            if (healthButton != null) {
                healthButton.setEnabled(z);
                if (!z) {
                    i = R.color.common_colorAccent_disabled;
                } else {
                    i = R.color.common_colorAccent;
                }
                this.s.setTextColor(qre.e(this.r, i));
            }
        }

        public void d(HealthButton healthButton, int i) {
            if (healthButton.getText() != null || i != 0) {
                healthButton.setTextColor(qre.e(this.r, i));
            } else {
                LogUtil.j("CustomViewDialog", "The text is empty or has no color.");
            }
        }

        private void a(LinearLayout linearLayout, View view, View view2, int i) {
            if (this.u == null) {
                linearLayout.setVisibility(8);
                if (this.f) {
                    view.setVisibility(0);
                    return;
                } else {
                    view.setVisibility(8);
                    return;
                }
            }
            HealthTextView healthTextView = (HealthTextView) view2.findViewById(R.id.custom_dailog_title);
            this.y = healthTextView;
            healthTextView.setTextColor(qre.e(this.r, R.color.textColorPrimary));
            this.y.setTextSize(0, i);
            this.y.setText(this.u);
        }

        private void e() {
            this.i.setVisibility(0);
            this.g.setVisibility(8);
            this.s.setText(this.q);
            if (this.t != null) {
                this.s.setOnClickListener(new e());
            } else {
                LogUtil.d("CustomViewDialog", "mPositiveButtonClickListener is null");
            }
            this.o.setText(this.l);
            qrs.d(this.o, this.s);
            if (this.k != null) {
                this.o.setOnClickListener(new b());
            } else {
                LogUtil.d("CustomViewDialog", "mNegativeButtonClickListener is null");
            }
        }

        private void j() {
            this.i.setVisibility(8);
            this.g.setVisibility(0);
            this.ad.setText(this.q);
            qrs.c(this.ad);
            if (this.t != null) {
                this.ad.setOnClickListener(new e());
            } else {
                LogUtil.d("CustomViewDialog", "mPositiveButtonClickListener is null");
            }
        }

        private void g() {
            this.i.setVisibility(8);
            this.g.setVisibility(0);
            this.ad.setText(this.l);
            qrs.c(this.ad);
            if (this.k != null) {
                this.ad.setOnClickListener(new b());
            } else {
                LogUtil.d("CustomViewDialog", "mNegativeButtonClickListener is null");
            }
        }

        class e implements View.OnClickListener {
            e() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!Builder.this.d) {
                    if (Builder.this.t != null) {
                        Builder.this.t.onClick(view);
                    } else {
                        LogUtil.e("CustomViewDialog", "mPositiveButtonClickListener is null in CustomViewDialog");
                    }
                    if (Builder.this.f23425a == null || !Builder.this.d) {
                        return;
                    }
                    Builder.this.f23425a.dismiss();
                    return;
                }
                if (Builder.this.f23425a != null) {
                    Builder.this.f23425a.dismiss();
                }
                if (Builder.this.t != null) {
                    Builder.this.t.onClick(view);
                } else {
                    LogUtil.e("CustomViewDialog", "mPositiveButtonClickListener is null in CustomViewDialog");
                }
            }
        }

        class b implements View.OnClickListener {
            b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Builder.this.f23425a != null) {
                    Builder.this.f23425a.dismiss();
                }
                if (Builder.this.k != null) {
                    Builder.this.k.onClick(view);
                }
            }
        }

        class c implements View.OnClickListener {
            c() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Builder.this.v != null) {
                    Builder.this.v.onClick(view);
                }
            }
        }
    }
}
