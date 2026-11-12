package com.huawei.watchface.mvp.ui.dialog;

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
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huawei.uikit.hwbutton.widget.HwButton;
import com.huawei.uikit.hwprogressbar.widget.HwProgressBar;
import com.huawei.watchface.R;
import com.huawei.watchface.u;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;

/* JADX INFO: loaded from: classes20.dex */
public class CustomViewDialog extends u {
    public CustomViewDialog(Context context, int i) {
        super(context, i);
    }

    /* JADX INFO: loaded from: classes45.dex */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CustomViewDialog f30406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RelativeLayout f30407b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public LinearLayout f30408c;
        public HwButton d;
        public HwButton e;
        public HwButton f;
        public Context g;
        public String h;
        public View i;
        public String j;
        public String k;
        public View.OnClickListener l;
        public View.OnClickListener m;
        public int n = 24;
        public int o = 24;
        public boolean p = true;
        public boolean q = true;
        public HwProgressBar r;
        public boolean s;

        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CustomViewDialog customViewDialog = Builder.this.f30406a;
                if (customViewDialog != null) {
                    customViewDialog.dismiss();
                }
                View.OnClickListener onClickListener = Builder.this.m;
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
                Builder builder = Builder.this;
                if (builder.q) {
                    CustomViewDialog customViewDialog = builder.f30406a;
                    if (customViewDialog != null) {
                        customViewDialog.dismiss();
                    }
                    View.OnClickListener onClickListener = Builder.this.l;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        return;
                    } else {
                        HwLog.e("CustomViewDialog", "mPositiveButtonClickListener is null in CustomViewDialog");
                        return;
                    }
                }
                View.OnClickListener onClickListener2 = builder.l;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(view);
                } else {
                    HwLog.e("CustomViewDialog", "mPositiveButtonClickListener is null in CustomViewDialog");
                }
                Builder builder2 = Builder.this;
                CustomViewDialog customViewDialog2 = builder2.f30406a;
                if (customViewDialog2 == null || !builder2.q) {
                    return;
                }
                customViewDialog2.dismiss();
            }
        }

        public Builder(Context context) {
            this.g = context;
        }

        public final void a(LinearLayout linearLayout) {
            HwProgressBar hwProgressBar = (HwProgressBar) linearLayout.findViewById(R.id.pb_dialog_title_loading);
            this.r = hwProgressBar;
            if (this.s) {
                hwProgressBar.setVisibility(0);
            } else {
                hwProgressBar.setVisibility(8);
            }
        }

        public final void b() {
            this.f30407b.setVisibility(8);
            this.f30408c.setVisibility(0);
            this.f.setText(this.k);
            CommonUtils.a(this.f);
            if (this.m != null) {
                this.f.setOnClickListener(new a());
            } else {
                HwLog.d("CustomViewDialog", "mNegativeButtonClickListener is null");
            }
        }

        public final void c() {
            this.f30407b.setVisibility(8);
            this.f30408c.setVisibility(0);
            this.f.setText(this.j);
            CommonUtils.a(this.f);
            if (this.l != null) {
                this.f.setOnClickListener(new b());
            } else {
                HwLog.d("CustomViewDialog", "mPositiveButtonClickListener is null");
            }
        }

        public CustomViewDialog create() {
            Drawable drawable;
            int dimensionPixelSize;
            LayoutInflater layoutInflater = (LayoutInflater) this.g.getSystemService("layout_inflater");
            this.f30406a = new CustomViewDialog(this.g, R.style.watch_face_customDialog);
            View viewInflate = layoutInflater.inflate(R.layout.watchface_dialog_custom_view, (ViewGroup) null);
            LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.custom_view_dialog_title_layout);
            a(linearLayout);
            View viewFindViewById = viewInflate.findViewById(R.id.dailog_no_title);
            TypedValue typedValue = new TypedValue();
            this.g.getTheme().resolveAttribute(R.attr.customDialogStyleRefer, typedValue, true);
            if (typedValue.resourceId != 0) {
                TypedArray typedArrayObtainStyledAttributes = this.g.getTheme().obtainStyledAttributes(typedValue.resourceId, R.styleable.customDialogDefinition);
                drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.customDialogDefinition_dialogBackground);
                TypedValue typedValue2 = new TypedValue();
                typedArrayObtainStyledAttributes.getValue(R.styleable.customDialogDefinition_titleTextSize, typedValue2);
                dimensionPixelSize = CommonUtils.a(this.g, (int) TypedValue.complexToFloat(typedValue2.data));
                typedArrayObtainStyledAttributes.recycle();
            } else {
                drawable = ContextCompat.getDrawable(this.g, R.drawable.watchface_shape_dialog_bg);
                dimensionPixelSize = this.g.getResources().getDimensionPixelSize(R.dimen.sp_18);
            }
            viewInflate.setBackground(drawable);
            if (this.h == null) {
                linearLayout.setVisibility(8);
                if (this.p) {
                    viewFindViewById.setVisibility(0);
                } else {
                    viewFindViewById.setVisibility(8);
                }
            } else {
                TextView textView = (TextView) viewInflate.findViewById(R.id.custom_dialog_title);
                textView.setTextSize(0, dimensionPixelSize);
                textView.setText(this.h);
            }
            RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(R.id.dialog_rlyt_content);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(CommonUtils.a(this.g, this.n), 0, CommonUtils.a(this.g, this.o), 0);
            relativeLayout.setLayoutParams(layoutParams);
            if (this.i != null) {
                relativeLayout.removeAllViews();
                relativeLayout.addView(this.i);
            }
            a(viewInflate);
            this.f30406a.setContentView(viewInflate);
            return this.f30406a;
        }

        public Builder setNegativeButton(int i, View.OnClickListener onClickListener) {
            HwLog.d("CustomViewDialog", "setNegativeButton called " + i);
            try {
                this.k = (String) this.g.getText(i);
            } catch (Resources.NotFoundException unused) {
                HwLog.e("CustomViewDialog", "Resources NotFound");
                this.k = "";
            }
            this.m = onClickListener;
            return this;
        }

        public Builder setTitle(String str) {
            this.h = str;
            return this;
        }

        public Builder setView(View view) {
            this.i = view;
            return this;
        }

        public final void a(View view) {
            this.f30407b = (RelativeLayout) view.findViewById(R.id.rl_dialog_alert);
            this.f30408c = (LinearLayout) view.findViewById(R.id.dialog_linearlayout2);
            this.d = (HwButton) this.f30407b.findViewById(R.id.dialog_btn_negative);
            this.e = (HwButton) this.f30407b.findViewById(R.id.dialog_btn_positive);
            this.f = (HwButton) this.f30408c.findViewById(R.id.dialog_one_btn);
            String str = this.j;
            if (str != null && this.k != null) {
                a();
                return;
            }
            if (str == null && this.k != null) {
                b();
            } else if (str != null && this.k == null) {
                c();
            } else {
                this.f30407b.setVisibility(8);
                this.f30408c.setVisibility(8);
            }
        }

        public final void a() {
            this.f30407b.setVisibility(0);
            this.f30408c.setVisibility(8);
            this.e.setText(this.j);
            if (this.l != null) {
                this.e.setOnClickListener(new b());
            } else {
                HwLog.d("CustomViewDialog", "mPositiveButtonClickListener is null");
            }
            this.d.setText(this.k);
            CommonUtils.a(this.d, this.e);
            if (this.m != null) {
                this.d.setOnClickListener(new a());
            } else {
                HwLog.d("CustomViewDialog", "mNegativeButtonClickListener is null");
            }
        }
    }
}
