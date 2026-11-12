package com.huawei.ui.main.stories.health.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.columnlayout.HealthColumnLinearLayout;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.main.R;
import defpackage.qrs;

/* JADX INFO: loaded from: classes43.dex */
public class WeightViewDialog extends BaseDialog {
    private WeightViewDialog(Context context, int i) {
        super(context, i);
    }

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthColumnLinearLayout f28193a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Context f28195c;
        private View d;
        private WeightViewDialog e;
        private String f;
        private HealthButton g;
        private View.OnClickListener i;
        private HealthButton j;
        private String k;
        private HealthButton l;
        private View.OnClickListener m;
        private View.OnClickListener n;
        private String o;
        private LinearLayout p;
        private boolean h = false;
        private int t = 3;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f28194b = true;

        public Builder(Context context) {
            this.f28195c = context;
        }

        public Builder a(int i) {
            this.t = i;
            return this;
        }

        public Builder a(boolean z) {
            this.h = z;
            return this;
        }

        public Builder a(View view) {
            this.d = view;
            return this;
        }

        public Builder b(String str, View.OnClickListener onClickListener) {
            LogUtil.a("WeightViewDialog", "setPositiveButton called ", str);
            this.k = str;
            this.n = onClickListener;
            return this;
        }

        public Builder d(String str, View.OnClickListener onClickListener) {
            LogUtil.a("WeightViewDialog", "setNegativeButton called ", str);
            this.f = str;
            this.i = onClickListener;
            return this;
        }

        public Builder a(String str, View.OnClickListener onClickListener) {
            LogUtil.a("WeightViewDialog", "setNegativeCancelButton called ", str);
            this.o = str;
            this.m = onClickListener;
            return this;
        }

        public WeightViewDialog e() {
            Drawable drawable;
            HealthScrollView healthScrollView;
            this.e = new WeightViewDialog(this.f28195c, R.style.CustomDialog);
            Object systemService = this.f28195c.getSystemService("layout_inflater");
            if (!(systemService instanceof LayoutInflater)) {
                LogUtil.j("WeightViewDialog", "systemService is not instanceof LayoutInflater");
                return this.e;
            }
            View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.weight_view_dialog, (ViewGroup) null);
            if (!qrs.aa(this.f28195c) && (healthScrollView = (HealthScrollView) viewInflate.findViewById(R.id.dialog_scroll_view)) != null) {
                healthScrollView.setIsScrollEnable(true);
            }
            TypedValue typedValue = new TypedValue();
            this.f28195c.getTheme().resolveAttribute(R.attr.customDialogStyleRefer, typedValue, true);
            if (typedValue.resourceId != 0) {
                TypedArray typedArrayObtainStyledAttributes = this.f28195c.getTheme().obtainStyledAttributes(typedValue.resourceId, R.styleable.customDialogDefinition);
                drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.customDialogDefinition_dialogBackground);
                typedArrayObtainStyledAttributes.recycle();
            } else {
                drawable = ContextCompat.getDrawable(this.f28195c, R.drawable.activity_dialog_bg);
            }
            viewInflate.setBackground(drawable);
            RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(R.id.dialog_rlyt_content);
            relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            if (this.d != null) {
                relativeLayout.removeAllViews();
                relativeLayout.addView(this.d);
            }
            e(viewInflate);
            if (qrs.aa(this.f28195c)) {
                int i = qrs.i(this.f28195c);
                int iG = qrs.g(this.f28195c);
                if (i > 0 && iG > 0) {
                    Window window = this.e.getWindow();
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    attributes.width = qrs.i(this.f28195c);
                    attributes.height = qrs.g(this.f28195c);
                    window.setAttributes(attributes);
                }
            }
            this.e.setContentView(viewInflate);
            return this.e;
        }

        private void e(View view) {
            this.f28193a = (HealthColumnLinearLayout) view.findViewById(R.id.button_layout_horizontal);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.button_layout_vertical);
            this.p = linearLayout;
            if (this.h) {
                this.j = (HealthButton) linearLayout.findViewById(R.id.vertical_dialog_btn_negative);
                this.l = (HealthButton) this.p.findViewById(R.id.vertical_dialog_btn_positive);
                this.g = (HealthButton) this.p.findViewById(R.id.vertical_dialog_btn_cancel);
                a();
                this.f28193a.setVisibility(8);
                this.p.setVisibility(0);
            } else {
                this.j = (HealthButton) this.f28193a.findViewById(R.id.horizontal_dialog_btn_negative);
                this.l = (HealthButton) this.f28193a.findViewById(R.id.horizontal_dialog_btn_positive);
                this.f28193a.setVisibility(0);
                this.p.setVisibility(8);
            }
            String str = this.k;
            if (str != null && this.f != null) {
                c();
            } else if (str != null) {
                b();
            } else {
                this.f28193a.setVisibility(8);
                this.p.setVisibility(8);
            }
        }

        private void a() {
            if (this.t == 2) {
                this.g.setVisibility(8);
            }
            if (this.t == 1) {
                this.g.setVisibility(8);
                this.j.setVisibility(8);
            }
        }

        private void b() {
            this.l.setText(this.k);
            if (this.n != null) {
                this.l.setOnClickListener(new b());
            } else {
                LogUtil.j("WeightViewDialog", "mPositiveButtonClickListener is null");
            }
        }

        private void c() {
            this.l.setText(this.k);
            if (this.n != null) {
                this.l.setOnClickListener(new b());
            } else {
                LogUtil.j("WeightViewDialog", "mPositiveButtonClickListener is null");
            }
            this.j.setText(this.f);
            qrs.d(this.j, this.l);
            if (this.i != null) {
                this.j.setOnClickListener(new c());
            } else {
                LogUtil.j("WeightViewDialog", "mNegativeButtonClickListener is null");
            }
            if (this.h && this.t == 3) {
                d();
            }
        }

        private void d() {
            this.g.setText(this.o);
            if (this.m != null) {
                this.g.setOnClickListener(new e());
            } else {
                LogUtil.j("WeightViewDialog", "mPositiveButtonClickListener is null");
            }
        }

        class b implements View.OnClickListener {
            b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!Builder.this.f28194b) {
                    if (Builder.this.n != null) {
                        Builder.this.n.onClick(view);
                    } else {
                        LogUtil.j("WeightViewDialog", "mPositiveButtonClickListener is null in WeightViewDialog");
                    }
                    if (Builder.this.e == null || !Builder.this.f28194b) {
                        return;
                    }
                    Builder.this.e.dismiss();
                    return;
                }
                if (Builder.this.e != null) {
                    Builder.this.e.dismiss();
                }
                if (Builder.this.n != null) {
                    Builder.this.n.onClick(view);
                } else {
                    LogUtil.j("WeightViewDialog", "mPositiveButtonClickListener is null in WeightViewDialog");
                }
            }
        }

        class c implements View.OnClickListener {
            c() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Builder.this.e != null) {
                    Builder.this.e.dismiss();
                }
                if (Builder.this.i != null) {
                    Builder.this.i.onClick(view);
                }
            }
        }

        class e implements View.OnClickListener {
            e() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Builder.this.e != null) {
                    Builder.this.e.dismiss();
                }
                if (Builder.this.m != null) {
                    Builder.this.m.onClick(view);
                }
            }
        }
    }
}
