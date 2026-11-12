package com.huawei.watchface;

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
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import com.huawei.uikit.hwbutton.widget.HwButton;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;

/* JADX INFO: loaded from: classes20.dex */
public class j0 extends u {
    public static final String f = "j0";

    public j0(Context context, int i) {
        super(context, i);
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public j0 f30236a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RelativeLayout f30237b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public LinearLayout f30238c;
        public LinearLayout d;
        public HwButton e;
        public HwButton f;
        public HwButton g;
        public Context h;
        public String i;
        public String j;
        public SpannableString k;
        public String l;
        public String m;
        public View.OnClickListener n;
        public View.OnClickListener o;
        public boolean p = false;
        public int q = 0;
        public int r = 0;

        /* JADX INFO: renamed from: com.huawei.watchface.j0$a$a, reason: collision with other inner class name */
        public class ViewOnClickListenerC0298a implements View.OnClickListener {
            public ViewOnClickListenerC0298a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                j0 j0Var = a.this.f30236a;
                if (j0Var != null) {
                    j0Var.dismiss();
                }
                View.OnClickListener onClickListener = a.this.o;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
            }
        }

        public class b implements View.OnClickListener {
            public b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                j0 j0Var = a.this.f30236a;
                if (j0Var != null) {
                    j0Var.dismiss();
                }
                View.OnClickListener onClickListener = a.this.n;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                } else {
                    HwLog.d(j0.f, "positiveButtonClickListener is null");
                }
            }
        }

        public a(Context context) {
            this.h = context;
        }

        public a b(int i) {
            HwLog.d(j0.f, "setTitle: " + i);
            this.i = a(i);
            return this;
        }

        public final void c() {
            this.f30237b.setVisibility(8);
            this.f30238c.setVisibility(0);
            this.g.setText(this.m);
            CommonUtils.a(this.g);
            if (this.o != null) {
                this.g.setOnClickListener(new ViewOnClickListenerC0298a());
            }
        }

        public final void d() {
            this.f30237b.setVisibility(8);
            this.f30238c.setVisibility(0);
            this.g.setText(this.l);
            CommonUtils.a(this.g);
            if (this.n != null) {
                this.g.setOnClickListener(new b());
            }
        }

        public final String a(int i) {
            try {
                return (String) this.h.getText(i);
            } catch (Resources.NotFoundException unused) {
                HwLog.e(j0.f, "Resources NotFound");
                return "";
            }
        }

        public a b(String str) {
            HwLog.d(j0.f, "setTitle: " + str);
            this.i = str;
            return this;
        }

        public a b(int i, View.OnClickListener onClickListener) {
            this.l = a(i);
            this.n = onClickListener;
            return this;
        }

        public a a(String str) {
            this.j = str;
            return this;
        }

        public a a(String str, View.OnClickListener onClickListener) {
            if (!TextUtils.isEmpty(str)) {
                this.l = str;
            }
            this.n = onClickListener;
            return this;
        }

        public final void b() {
            this.f30237b.setVisibility(0);
            this.f30238c.setVisibility(8);
            this.f.setText(this.l);
            this.f.setAllCaps(true);
            if (this.n != null) {
                this.f.setOnClickListener(new b());
            }
            this.e.setText(this.m);
            this.e.setAllCaps(true);
            CommonUtils.a(this.e, this.f);
            if (this.o != null) {
                this.e.setOnClickListener(new ViewOnClickListenerC0298a());
            }
        }

        public a a(int i, View.OnClickListener onClickListener) {
            this.m = a(i);
            this.o = onClickListener;
            return this;
        }

        public j0 a() {
            Drawable drawable;
            int dimensionPixelSize;
            int dimensionPixelSize2;
            LayoutInflater layoutInflater = (LayoutInflater) this.h.getSystemService("layout_inflater");
            this.f30236a = new j0(this.h, R.style.watch_face_customDialog);
            View viewInflate = layoutInflater.inflate(R.layout.watchface_dialog_custom_text_alert, (ViewGroup) null);
            TypedValue typedValue = new TypedValue();
            this.h.getTheme().resolveAttribute(R.attr.customDialogStyleRefer, typedValue, true);
            if (typedValue.resourceId != 0) {
                TypedArray typedArrayObtainStyledAttributes = this.h.getTheme().obtainStyledAttributes(typedValue.resourceId, R.styleable.customDialogDefinition);
                drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.customDialogDefinition_dialogBackground);
                TypedValue typedValue2 = new TypedValue();
                TypedValue typedValue3 = new TypedValue();
                typedArrayObtainStyledAttributes.getValue(R.styleable.customDialogDefinition_titleTextSize, typedValue2);
                typedArrayObtainStyledAttributes.getValue(R.styleable.customDialogDefinition_contentTextSize, typedValue3);
                dimensionPixelSize = CommonUtils.a(this.h, (int) TypedValue.complexToFloat(typedValue2.data));
                dimensionPixelSize2 = CommonUtils.a(this.h, (int) TypedValue.complexToFloat(typedValue3.data));
                typedArrayObtainStyledAttributes.recycle();
            } else {
                drawable = ContextCompat.getDrawable(this.h, R.drawable.watchface_shape_dialog_bg);
                dimensionPixelSize = this.h.getResources().getDimensionPixelSize(R.dimen.sp_18);
                dimensionPixelSize2 = this.h.getResources().getDimensionPixelSize(R.dimen.sp_15);
            }
            viewInflate.setBackground(drawable);
            a(viewInflate, dimensionPixelSize, dimensionPixelSize2);
            a(viewInflate);
            this.f30236a.setContentView(viewInflate);
            return this.f30236a;
        }

        public final void a(View view, int i, int i2) {
            int i3;
            int i4 = this.q;
            if (i4 <= 0 || (i3 = this.r) <= 0) {
                i4 = i;
                i3 = i2;
            }
            TextView textView = (TextView) view.findViewById(R.id.tv_dailog_title);
            textView.setTextSize(0, i4);
            textView.setText(this.i);
            TextView textView2 = (TextView) view.findViewById(R.id.tv_text_alert_title);
            textView2.setTextSize(0, i);
            textView2.setText(this.i);
            HwLog.d(j0.f, "mContent = " + this.j + " contentTextSize = " + i2);
            TextView textView3 = (TextView) view.findViewById(R.id.tv_text_alert_message);
            textView3.setTextSize(0, (float) i3);
            SpannableString spannableString = this.k;
            if (spannableString != null) {
                textView3.setText(spannableString);
                textView3.setMovementMethod(LinkMovementMethod.getInstance());
                return;
            }
            textView3.setText(this.j);
            if (TextUtils.isEmpty(this.i)) {
                textView.setVisibility(8);
            }
            if (TextUtils.isEmpty(this.j)) {
                textView3.setVisibility(8);
                textView.setVisibility(8);
                textView2.setVisibility(0);
            }
        }

        public final void a(View view) {
            this.f30237b = (RelativeLayout) view.findViewById(R.id.rl_dialog_alert);
            this.f30238c = (LinearLayout) view.findViewById(R.id.dialog_linearlayout2);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.ll_text_alert_message_layout);
            this.d = linearLayout;
            if (this.p) {
                linearLayout.setGravity(GravityCompat.START);
            }
            this.e = (HwButton) this.f30237b.findViewById(R.id.dialog_btn_negative);
            this.f = (HwButton) this.f30237b.findViewById(R.id.dialog_btn_positive);
            this.g = (HwButton) this.f30238c.findViewById(R.id.dialog_one_btn);
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
                this.f30237b.setVisibility(8);
                this.f30238c.setVisibility(8);
            }
        }
    }
}
