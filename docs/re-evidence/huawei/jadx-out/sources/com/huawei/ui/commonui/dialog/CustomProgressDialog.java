package com.huawei.ui.commonui.dialog;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes16.dex */
public class CustomProgressDialog extends BaseDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HealthProgressBar f23411a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f23412c = new byte[1];
    private static boolean e;

    public CustomProgressDialog(Context context, int i) {
        super(context, i);
    }

    public CustomProgressDialog(Context context) {
        super(context, R.style.CustomDialog);
    }

    private void b(boolean z) {
        e = z;
    }

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ImageView f23413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private View.OnClickListener f23414b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthButton f23415c;
        private Context d;
        private View.OnClickListener e;
        private String f;
        private HealthTextView g;
        private HealthTextView h;
        private CustomProgressDialog i;
        private HealthProgressBar j;

        public Builder(Context context) {
            this.d = context;
        }

        public Builder e(String str) {
            this.f = str;
            HealthTextView healthTextView = this.g;
            if (healthTextView != null && str != null) {
                healthTextView.setText(str);
            }
            return this;
        }

        public Builder d() {
            if (LanguageUtil.au(this.d) || LanguageUtil.ao(this.d)) {
                HealthTextView healthTextView = this.g;
                if (healthTextView != null) {
                    healthTextView.setTextSize(0, qrs.d(this.d, 12.0f));
                }
                HealthTextView healthTextView2 = this.h;
                if (healthTextView2 != null) {
                    healthTextView2.setTextSize(0, qrs.d(this.d, 12.0f));
                }
            }
            return this;
        }

        public Builder b(int i) {
            this.j.setProgress(i);
            return this;
        }

        public Builder d(int i) {
            this.h.setText(UnitUtil.e(i, 2, 0));
            return this;
        }

        public Builder b(String str) {
            if (str != null) {
                this.h.setText(str);
            }
            return this;
        }

        public Builder e(View.OnClickListener onClickListener) {
            this.e = onClickListener;
            return this;
        }

        public Builder b(View.OnClickListener onClickListener) {
            this.f23414b = onClickListener;
            return this;
        }

        public Builder d(String str) {
            HealthButton healthButton = this.f23415c;
            if (healthButton != null && str != null) {
                healthButton.setText(str);
            }
            return this;
        }

        public CustomProgressDialog c() {
            View viewInflate;
            LayoutInflater layoutInflater = (LayoutInflater) this.d.getSystemService("layout_inflater");
            this.d.getTheme().resolveAttribute(R.attr.customDialogStyleRefer, new TypedValue(), true);
            Drawable drawable = ContextCompat.getDrawable(this.d, R.drawable.activity_dialog_bg);
            if (CustomProgressDialog.e) {
                this.i = new CustomProgressDialog(this.d, R.style.health_data_insert_dialog);
                viewInflate = layoutInflater.inflate(R.layout.commonui_custom_loading_dialog, (ViewGroup) null);
                HealthProgressBar unused = CustomProgressDialog.f23411a = (HealthProgressBar) viewInflate.findViewById(R.id.health_data_inserting_progressbar);
            } else {
                this.i = new CustomProgressDialog(this.d, R.style.CustomDialog);
                viewInflate = layoutInflater.inflate(R.layout.commonui_custom_progress_dialog, (ViewGroup) null);
                this.h = (HealthTextView) viewInflate.findViewById(R.id.custom_progress_dialog_percent);
                this.j = (HealthProgressBar) viewInflate.findViewById(R.id.custom_progress_dialog_progressbar);
                ImageView imageView = (ImageView) viewInflate.findViewById(R.id.custom_progress_dialog_cancel);
                this.f23413a = imageView;
                if (this.e != null) {
                    imageView.setOnClickListener(new b());
                    this.f23413a.setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                }
                HealthButton healthButton = (HealthButton) viewInflate.findViewById(R.id.custom_progress_dialog_button_cancel);
                this.f23415c = healthButton;
                if (this.f23414b != null) {
                    healthButton.setOnClickListener(new b());
                    this.f23415c.setVisibility(0);
                } else {
                    healthButton.setVisibility(8);
                }
                HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.custom_progress_dialog_desc);
                this.g = healthTextView;
                healthTextView.setText(this.f);
                LogUtil.a("CustomProgressDialog", "mProgressDesc :", this.f);
                this.j.setMax(100);
            }
            viewInflate.setBackground(drawable);
            this.i.setContentView(viewInflate);
            return this.i;
        }

        class b implements View.OnClickListener {
            b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Builder.this.i != null) {
                    LogUtil.a("CustomProgressDialog", "mCustomProgressDialog.dismiss");
                    Builder.this.i.dismiss();
                }
                if (Builder.this.e != null) {
                    Builder.this.e.onClick(view);
                }
                if (Builder.this.f23414b != null) {
                    Builder.this.f23414b.onClick(view);
                }
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseDialog, android.app.Dialog
    public void show() {
        super.show();
        HealthProgressBar healthProgressBar = f23411a;
        if (healthProgressBar != null) {
            healthProgressBar.setVisibility(0);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseDialog, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        synchronized (f23412c) {
            b(false);
            HealthProgressBar healthProgressBar = f23411a;
            if (healthProgressBar != null && healthProgressBar.getVisibility() == 0) {
                f23411a.setVisibility(4);
                f23411a = null;
            }
        }
    }
}
