package com.huawei.ui.commonui.dialog;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.qrs;

/* JADX INFO: loaded from: classes43.dex */
public class MemberServicesDialog extends BaseDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f23450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f23451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f23452c;
    private Context d;
    private HealthTextView e;
    private ImageView g;

    public MemberServicesDialog(Context context) {
        super(context, R.style.CustomDialog);
        this.d = context;
        d();
    }

    private boolean a() {
        Context context = this.d;
        return context == null || ((Activity) context).isFinishing();
    }

    public void d() {
        Context context = this.d;
        if (context == null) {
            LogUtil.e("MemberServicesDialog", " mDialogContext is null");
            return;
        }
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.common_ui_member_services, (ViewGroup) null);
        this.f23452c = viewInflate;
        this.f23450a = (HealthTextView) viewInflate.findViewById(R.id.user_type);
        this.f23451b = (HealthTextView) this.f23452c.findViewById(R.id.user_content);
        this.e = (HealthTextView) this.f23452c.findViewById(R.id.member_Activate);
        this.g = (ImageView) this.f23452c.findViewById(R.id.member_cancel_dialog);
        LinearLayout linearLayout = (LinearLayout) this.f23452c.findViewById(R.id.dialog_parent);
        if (qrs.y() && !qrs.u()) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams.setMargins(0, this.d.getResources().getDimensionPixelSize(R.dimen.health_common_90dp), 0, 0);
            linearLayout.setLayoutParams(layoutParams);
        }
        if (qrs.u()) {
            this.f23450a.setTextSize(1, 23.0f);
            this.f23451b.setTextSize(1, 18.0f);
            this.e.setTextSize(1, 16.0f);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams2.setMargins(0, this.d.getResources().getDimensionPixelSize(R.dimen.health_common_90dp), 0, 0);
            linearLayout.setLayoutParams(layoutParams2);
        }
        this.f23450a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.ui.commonui.dialog.MemberServicesDialog.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                int lineCount = MemberServicesDialog.this.f23450a.getLayout().getLineCount();
                LogUtil.a("OnGlobalLayoutListener,", Integer.valueOf(lineCount));
                if (lineCount > 1) {
                    MemberServicesDialog.this.f23450a.setTextSize(1, 16.0f);
                }
                MemberServicesDialog.this.f23450a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
        setContentView(this.f23452c);
    }

    @Override // com.huawei.ui.commonui.base.BaseDialog, android.app.Dialog
    public void show() {
        if (a() || isShowing()) {
            return;
        }
        super.show();
        LogUtil.a("EquityDialog", "dialog.setBackground: dialog showed");
    }
}
