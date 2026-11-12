package com.huawei.ui.homehealth.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.columnlayout.HealthColumnLinearLayout;
import com.huawei.ui.homehealth.R;
import defpackage.qrs;

/* JADX INFO: loaded from: classes17.dex */
public class NoTitleCustomViewDialog extends BaseDialog {
    private NoTitleCustomViewDialog(Context context, int i) {
        super(context, i);
    }

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private NoTitleCustomViewDialog f26175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Context f26176b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthColumnLinearLayout f26177c;
        private View e;
        private String g;
        private View.OnClickListener i;
        private HealthButton j;
        private View.OnClickListener k;
        private String m;
        private HealthColumnLinearLayout n;
        private HealthButton o;
        private boolean h = true;
        private boolean f = false;
        private boolean d = true;

        public Builder(Context context) {
            this.f26176b = context;
        }

        public Builder b(boolean z) {
            this.d = z;
            return this;
        }

        public Builder c(boolean z) {
            this.f = z;
            return this;
        }

        public Builder a(View view) {
            this.e = view;
            return this;
        }

        public Builder b(String str, View.OnClickListener onClickListener) {
            LogUtil.a("NoTitleCustomViewDialog", "setPositiveButton called ", str);
            this.m = str;
            this.k = onClickListener;
            return this;
        }

        public Builder c(String str, View.OnClickListener onClickListener) {
            LogUtil.a("NoTitleCustomViewDialog", "setNegativeButton called ", str);
            this.g = str;
            this.i = onClickListener;
            return this;
        }

        public HealthButton a() {
            return this.o;
        }

        public NoTitleCustomViewDialog d() {
            Drawable drawable;
            this.f26175a = new NoTitleCustomViewDialog(this.f26176b, R.style.CustomDialog);
            Object systemService = this.f26176b.getSystemService("layout_inflater");
            if (!(systemService instanceof LayoutInflater)) {
                LogUtil.j("NoTitleCustomViewDialog", "systemService is not instanceof LayoutInflater");
                return this.f26175a;
            }
            View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.no_title_custom_view_dialog, (ViewGroup) null);
            TypedValue typedValue = new TypedValue();
            this.f26176b.getTheme().resolveAttribute(R.attr.customDialogStyleRefer, typedValue, true);
            if (typedValue.resourceId != 0) {
                TypedArray typedArrayObtainStyledAttributes = this.f26176b.getTheme().obtainStyledAttributes(typedValue.resourceId, R.styleable.customDialogDefinition);
                drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.customDialogDefinition_dialogBackground);
                typedArrayObtainStyledAttributes.recycle();
            } else {
                drawable = ContextCompat.getDrawable(this.f26176b, R.drawable.activity_dialog_bg);
            }
            viewInflate.setBackground(drawable);
            RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(R.id.dialog_rlyt_content);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            if (this.f) {
                if (!this.d) {
                    layoutParams.height = (int) (qrs.m() * 0.33f);
                }
            } else {
                d(layoutParams);
            }
            relativeLayout.setLayoutParams(layoutParams);
            if (this.e != null) {
                relativeLayout.removeAllViews();
                relativeLayout.addView(this.e);
            }
            c(viewInflate);
            this.f26175a.setContentView(viewInflate);
            return this.f26175a;
        }

        private void d(LinearLayout.LayoutParams layoutParams) {
            if (!qrs.aa(this.f26176b) || this.d) {
                return;
            }
            int iM = qrs.m();
            int iQ = qrs.q();
            if (iM > iQ) {
                layoutParams.height = (int) (iM * 0.33f);
            } else {
                layoutParams.height = (int) (iQ * 0.33f);
            }
        }

        private void c(View view) {
            this.f26177c = (HealthColumnLinearLayout) view.findViewById(R.id.button_layout_horizontal);
            HealthColumnLinearLayout healthColumnLinearLayout = (HealthColumnLinearLayout) view.findViewById(R.id.button_layout_vertical);
            this.n = healthColumnLinearLayout;
            if (this.f) {
                this.j = (HealthButton) healthColumnLinearLayout.findViewById(R.id.vertical_dialog_btn_negative);
                this.o = (HealthButton) this.n.findViewById(R.id.vertical_dialog_btn_positive);
                this.f26177c.setVisibility(8);
                this.n.setVisibility(0);
            } else {
                this.j = (HealthButton) this.f26177c.findViewById(R.id.horizontal_dialog_btn_negative);
                this.o = (HealthButton) this.f26177c.findViewById(R.id.horizontal_dialog_btn_positive);
                this.f26177c.setVisibility(0);
                this.n.setVisibility(8);
            }
            if (this.m != null && this.g != null) {
                c();
            } else {
                this.f26177c.setVisibility(8);
                this.n.setVisibility(8);
            }
        }

        private void c() {
            this.o.setText(this.m);
            if (this.k != null) {
                this.o.setOnClickListener(new b());
            } else {
                LogUtil.j("NoTitleCustomViewDialog", "mPositiveButtonClickListener is null");
            }
            this.j.setText(this.g);
            qrs.d(this.j, this.o);
            if (this.i != null) {
                this.j.setOnClickListener(new d());
            } else {
                LogUtil.j("NoTitleCustomViewDialog", "mNegativeButtonClickListener is null");
            }
        }

        class b implements View.OnClickListener {
            b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!Builder.this.h) {
                    if (Builder.this.k != null) {
                        Builder.this.k.onClick(view);
                    } else {
                        LogUtil.j("NoTitleCustomViewDialog", "mPositiveButtonClickListener is null in NoTitleCustomViewDialog");
                    }
                    if (Builder.this.f26175a == null || !Builder.this.h) {
                        return;
                    }
                    Builder.this.f26175a.dismiss();
                    return;
                }
                if (Builder.this.f26175a != null) {
                    Builder.this.f26175a.dismiss();
                }
                if (Builder.this.k != null) {
                    Builder.this.k.onClick(view);
                } else {
                    LogUtil.j("NoTitleCustomViewDialog", "mPositiveButtonClickListener is null in NoTitleCustomViewDialog");
                }
            }
        }

        class d implements View.OnClickListener {
            d() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Builder.this.f26175a != null) {
                    Builder.this.f26175a.dismiss();
                }
                if (Builder.this.i != null) {
                    Builder.this.i.onClick(view);
                }
            }
        }
    }
}
