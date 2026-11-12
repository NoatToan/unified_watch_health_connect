package com.huawei.watchface;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huawei.uikit.hwbutton.widget.HwButton;
import com.huawei.uikit.phone.hwtextview.widget.HwTextView;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;

/* JADX INFO: loaded from: classes20.dex */
public class z2 extends u {
    public z2(Context context, int i) {
        super(context, i);
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public z2 f30692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RelativeLayout f30693b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public LinearLayout f30694c;
        public HwButton d;
        public HwButton e;
        public HwButton f;
        public int g;
        public Context h;
        public String i;
        public SpannableString j;
        public String l;
        public String m;
        public View.OnClickListener q;
        public View.OnClickListener r;
        public boolean k = false;
        public int n = 0;
        public int o = 0;
        public boolean p = false;

        /* JADX INFO: renamed from: com.huawei.watchface.z2$a$a, reason: collision with other inner class name */
        public class ViewOnClickListenerC0300a implements View.OnClickListener {
            public ViewOnClickListenerC0300a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                z2 z2Var = a.this.f30692a;
                if (z2Var != null) {
                    z2Var.dismiss();
                }
                View.OnClickListener onClickListener = a.this.r;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                } else {
                    HwLog.d("NoTitleCustomAlertDialog", "negativeButtonClickListener is null");
                }
            }
        }

        public class b implements View.OnClickListener {
            public b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                z2 z2Var = a.this.f30692a;
                if (z2Var != null) {
                    z2Var.dismiss();
                }
                View.OnClickListener onClickListener = a.this.q;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                } else {
                    HwLog.d("NoTitleCustomAlertDialog", "positiveButtonClickListener is null");
                }
            }
        }

        public a(Context context) {
            this.h = context;
        }

        public a a(int i) {
            try {
                this.i = (String) this.h.getText(i);
                return this;
            } catch (Resources.NotFoundException unused) {
                HwLog.e("NoTitleCustomAlertDialog", "Resources NotFound");
                this.i = "";
                return this;
            }
        }

        public a b(int i, View.OnClickListener onClickListener) {
            try {
                this.l = (String) this.h.getText(i);
            } catch (Resources.NotFoundException unused) {
                HwLog.e("NoTitleCustomAlertDialog", "Resources NotFound");
                this.l = "";
            }
            this.q = onClickListener;
            return this;
        }

        public final void c() {
            this.f30693b.setVisibility(8);
            this.f30694c.setVisibility(0);
            this.f.setText(this.m);
            CommonUtils.a(this.f);
            if (this.o != 0) {
                this.d.setTextColor(this.h.getResources().getColor(this.o));
            } else {
                int i = this.g;
                if (i != 0) {
                    this.d.setTextColor(i);
                } else {
                    HwLog.d("NoTitleCustomAlertDialog", "negativeButton setTextColor default.");
                }
            }
            if (this.r != null) {
                this.f.setOnClickListener(new ViewOnClickListenerC0300a());
            }
        }

        public final void d() {
            this.f30693b.setVisibility(8);
            this.f30694c.setVisibility(0);
            this.f.setText(this.l);
            CommonUtils.a(this.f);
            if (this.n != 0) {
                this.e.setTextColor(this.h.getResources().getColor(this.n));
            } else {
                int i = this.g;
                if (i != 0) {
                    this.e.setTextColor(i);
                } else {
                    HwLog.d("NoTitleCustomAlertDialog", "positiveButtonClickListener is null");
                }
            }
            if (this.q != null) {
                this.f.setOnClickListener(new b());
            }
        }

        public a a(String str) {
            this.i = str;
            return this;
        }

        public a a(int i, View.OnClickListener onClickListener) {
            try {
                this.m = (String) this.h.getText(i);
            } catch (Resources.NotFoundException unused) {
                HwLog.e("NoTitleCustomAlertDialog", "Resources NotFound");
                this.m = "";
            }
            this.r = onClickListener;
            return this;
        }

        public a b(String str, View.OnClickListener onClickListener) {
            this.l = str;
            this.q = onClickListener;
            return this;
        }

        public final void b() {
            this.f30693b.setVisibility(0);
            this.f30694c.setVisibility(8);
            this.e.setText(this.l);
            if (this.n != 0) {
                this.e.setTextColor(this.h.getResources().getColor(this.n));
            } else {
                int i = this.g;
                if (i != 0) {
                    this.e.setTextColor(i);
                } else {
                    HwLog.d("NoTitleCustomAlertDialog", "positiveButton setTextColor default.");
                }
            }
            if (this.q != null) {
                this.e.setOnClickListener(new b());
            } else {
                HwLog.d("NoTitleCustomAlertDialog", "positiveButtonClickListener is null");
            }
            this.d.setText(this.m);
            CommonUtils.a(this.d, this.e);
            if (this.o != 0) {
                this.d.setTextColor(this.h.getResources().getColor(this.o));
            } else {
                int i2 = this.g;
                if (i2 != 0) {
                    this.d.setTextColor(i2);
                } else {
                    HwLog.d("NoTitleCustomAlertDialog", "negativeButton setTextColor default.");
                }
            }
            if (this.r != null) {
                this.d.setOnClickListener(new ViewOnClickListenerC0300a());
            }
        }

        public a a(String str, View.OnClickListener onClickListener) {
            this.m = str;
            this.r = onClickListener;
            return this;
        }

        public z2 a() {
            Drawable drawable;
            int dimensionPixelSize;
            LayoutInflater layoutInflater = (LayoutInflater) this.h.getSystemService("layout_inflater");
            this.f30692a = new z2(this.h, R.style.watch_face_customDialog);
            View viewInflate = layoutInflater.inflate(R.layout.watchface_dialog_no_title_custom, (ViewGroup) null);
            this.f30692a.setContentView(viewInflate);
            TypedValue typedValue = new TypedValue();
            this.h.getTheme().resolveAttribute(R.attr.customDialogStyleRefer, typedValue, true);
            if (typedValue.resourceId != 0) {
                TypedArray typedArrayObtainStyledAttributes = this.h.getTheme().obtainStyledAttributes(typedValue.resourceId, R.styleable.customDialogDefinition);
                drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.customDialogDefinition_dialogBackground);
                TypedValue typedValue2 = new TypedValue();
                typedArrayObtainStyledAttributes.getValue(R.styleable.customDialogDefinition_contentTextSize, typedValue2);
                this.g = typedArrayObtainStyledAttributes.getColor(R.styleable.customDialogDefinition_buttonTextColor, R.color.button_color);
                dimensionPixelSize = CommonUtils.a(this.h, (int) TypedValue.complexToFloat(typedValue2.data));
                typedArrayObtainStyledAttributes.recycle();
            } else {
                drawable = ContextCompat.getDrawable(this.h, R.drawable.watchface_shape_dialog_bg);
                this.g = ContextCompat.getColor(this.h, R.color.button_color);
                dimensionPixelSize = this.h.getResources().getDimensionPixelSize(R.dimen.dp_15);
            }
            viewInflate.setBackground(drawable);
            HwTextView hwTextView = (HwTextView) viewInflate.findViewById(R.id.dialog_no_title_tv_message);
            TextView textView = (TextView) viewInflate.findViewById(R.id.dialog_no_title_auto_tv_message);
            LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.dialog_no_title_llyt_message);
            if (this.k) {
                linearLayout.setGravity(17);
            }
            if (dimensionPixelSize != -1) {
                hwTextView.setTextSize(0, dimensionPixelSize);
            }
            if (this.p) {
                hwTextView.setVisibility(8);
                textView.setVisibility(0);
            } else {
                hwTextView.setVisibility(0);
                textView.setVisibility(8);
            }
            a(hwTextView, textView);
            a(viewInflate);
            this.f30692a.setContentView(viewInflate);
            return this.f30692a;
        }

        public final void a(TextView textView, TextView textView2) {
            SpannableString spannableString = this.j;
            if (spannableString != null) {
                textView.setText(spannableString);
                textView2.setText(this.j);
            } else {
                textView.setText(this.i);
                textView2.setText(this.i);
            }
        }

        public final void a(View view) {
            this.f30693b = (RelativeLayout) view.findViewById(R.id.rl_dialog_alert);
            this.f30694c = (LinearLayout) view.findViewById(R.id.dialog_linearlayout2);
            this.d = (HwButton) this.f30693b.findViewById(R.id.dialog_btn_negative);
            this.e = (HwButton) this.f30693b.findViewById(R.id.dialog_btn_positive);
            this.f = (HwButton) this.f30694c.findViewById(R.id.dialog_one_btn);
            HwLog.d("NoTitleCustomAlertDialog", "negativeButtonText = " + this.m);
            String str = this.l;
            if (str != null && this.m != null) {
                b();
                return;
            }
            if (str == null && this.m != null) {
                c();
            } else if (str != null && this.m == null) {
                d();
            } else {
                this.f30693b.setVisibility(8);
                this.f30694c.setVisibility(8);
            }
        }
    }
}
