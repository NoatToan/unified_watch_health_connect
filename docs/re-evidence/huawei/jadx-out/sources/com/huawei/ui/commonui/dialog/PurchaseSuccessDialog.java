package com.huawei.ui.commonui.dialog;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import defpackage.qqf;
import defpackage.qrs;
import defpackage.qsp;

/* JADX INFO: loaded from: classes.dex */
public class PurchaseSuccessDialog extends BaseDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthCheckBox f23461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f23462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f23463c;
    private UiCallback<Boolean> d;
    private HealthTextView e;
    private HealthCardView f;
    private HealthTextView g;
    private HealthTextView h;
    private HealthImageView i;
    private HealthTextView j;
    private View l;

    private PurchaseSuccessDialog(Context context, Builder builder) {
        super(context, R.style.CustomDialog);
        if (builder == null) {
            return;
        }
        a(context, builder);
    }

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private CompoundButton.OnCheckedChangeListener f23466a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f23467b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private UiCallback<Boolean> f23468c;
        private String d;
        private final Context e;
        private String g;
        private View.OnClickListener i;
        private int j;

        public Builder(Context context) {
            this.e = context;
        }

        public Builder d(int i) {
            this.j = i;
            return this;
        }

        public Builder d(String str) {
            this.g = str;
            return this;
        }

        public Builder e(String str) {
            this.f23467b = str;
            return this;
        }

        public Builder a(String str) {
            this.d = str;
            return this;
        }

        public Builder c(View.OnClickListener onClickListener) {
            this.i = onClickListener;
            return this;
        }

        public Builder b(UiCallback<Boolean> uiCallback) {
            this.f23468c = uiCallback;
            return this;
        }

        public Builder b(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
            this.f23466a = onCheckedChangeListener;
            return this;
        }

        public PurchaseSuccessDialog c() {
            return new PurchaseSuccessDialog(this.e, this);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseDialog, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        UiCallback<Boolean> uiCallback;
        HealthCheckBox healthCheckBox = this.f23461a;
        if (healthCheckBox != null && (uiCallback = this.d) != null) {
            uiCallback.onSuccess(Boolean.valueOf(healthCheckBox.isChecked()));
        }
        super.dismiss();
    }

    private void a(Context context, Builder builder) {
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.common_ui_course_purchase_success_dialog, (ViewGroup) null);
        this.l = viewInflate;
        this.g = (HealthTextView) viewInflate.findViewById(R.id.dialog_subtitle);
        this.e = (HealthTextView) this.l.findViewById(R.id.course_title);
        this.f = (HealthCardView) this.l.findViewById(R.id.dialog_cover_img_card);
        this.i = (HealthImageView) this.l.findViewById(R.id.dialog_cover_img);
        this.h = (HealthTextView) this.l.findViewById(R.id.purchase_icon);
        a();
        this.f23463c = (HealthTextView) this.l.findViewById(R.id.course_progress);
        this.f23461a = (HealthCheckBox) this.l.findViewById(R.id.collect_checkbox);
        this.j = (HealthTextView) this.l.findViewById(R.id.go_check_button);
        this.f23462b = (HealthTextView) this.l.findViewById(R.id.cancel_button);
        setContentView(this.l);
        e(builder);
    }

    private void a() {
        HealthTextView healthTextView = this.h;
        if (healthTextView == null) {
            return;
        }
        healthTextView.setTextColor(BaseApplication.getContext().getResources().getColor(R.color.purchase_icon));
        this.h.setBackground(BaseApplication.getContext().getResources().getDrawable(R.drawable.course_purchase_icon_background));
        int iD = qrs.d(BaseApplication.getContext(), 4.0f);
        int iD2 = qrs.d(BaseApplication.getContext(), 1.0f);
        this.h.setPadding(iD, iD2, iD, iD2);
    }

    private void e(Builder builder) {
        d(builder);
        a(builder);
        c(builder);
    }

    private void d(Builder builder) {
        qsp.e((TextView) this.g, builder.j);
        qsp.a(this.e, builder.f23467b, true);
        qsp.a(this.f23463c, builder.d, true);
    }

    private void a(Builder builder) {
        if (TextUtils.isEmpty(builder.g)) {
            this.i.setVisibility(8);
        } else {
            qqf.b(builder.g, this.i, (int) BaseApplication.getContext().getResources().getDimension(R.dimen.defaultCornerRadiusS));
        }
    }

    private void c(final Builder builder) {
        if (builder.i != null) {
            qsp.b(this.j, new View.OnClickListener() { // from class: com.huawei.ui.commonui.dialog.PurchaseSuccessDialog.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    builder.i.onClick(view);
                    PurchaseSuccessDialog.this.dismiss();
                }
            });
        }
        qsp.b(this.f23462b, new View.OnClickListener() { // from class: com.huawei.ui.commonui.dialog.PurchaseSuccessDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PurchaseSuccessDialog.this.dismiss();
            }
        });
        this.f23461a.setOnCheckedChangeListener(builder.f23466a);
        this.d = builder.f23468c;
    }
}
