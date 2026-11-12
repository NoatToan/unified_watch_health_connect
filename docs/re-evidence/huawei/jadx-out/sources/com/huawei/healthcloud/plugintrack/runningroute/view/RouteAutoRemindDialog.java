package com.huawei.healthcloud.plugintrack.runningroute.view;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import com.huawei.haf.application.BaseApplication;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import defpackage.jdi;
import defpackage.qqf;
import health.compact.a.ReleaseLogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class RouteAutoRemindDialog extends BaseDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthImageView f10615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f10616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthButton f10617c;
    private boolean d;
    private HealthTextView e;
    private HealthTextView f;
    private HealthTextView g;

    public RouteAutoRemindDialog(Context context) {
        super(context, R.style.CustomDialog);
        this.d = true;
        this.f10616b = context;
        e();
    }

    private void e() {
        View viewInflate = View.inflate(this.f10616b, R.layout.dialog_route_auto_remind, null);
        this.e = (HealthTextView) viewInflate.findViewById(R.id.route_dialog_content);
        this.f = (HealthTextView) viewInflate.findViewById(R.id.route_dialog_route_name);
        this.f10615a = (HealthImageView) viewInflate.findViewById(R.id.route_dialog_image);
        this.g = (HealthTextView) viewInflate.findViewById(R.id.route_dialog_route_times);
        ((HealthCheckBox) viewInflate.findViewById(R.id.collect_checkbox)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.healthcloud.plugintrack.runningroute.view.RouteAutoRemindDialog$$ExternalSyntheticLambda0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f10618b.c(compoundButton, z);
            }
        });
        this.f10617c = (HealthButton) viewInflate.findViewById(R.id.ok_button);
        setContentView(viewInflate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(CompoundButton compoundButton, boolean z) {
        this.d = z;
    }

    public void a(String str) {
        this.e.setText(this.f10616b.getString(R.string.IDS_hw_routes_auto_punch_success, str));
        this.f.setText(str);
    }

    public void a(long j) {
        this.g.setText(this.f10616b.getResources().getQuantityString(R.plurals.IDS_track_show_detail_run_route_times, (int) j, Long.valueOf(j)));
    }

    public void b(String str) {
        qqf.e(this.f10615a, str, qqf.e, 0, R.drawable.auto_punch_dialog_bg);
    }

    public void b(View.OnClickListener onClickListener) {
        this.f10615a.setOnClickListener(onClickListener);
    }

    public void c(View.OnClickListener onClickListener) {
        this.f10617c.setOnClickListener(onClickListener);
    }

    public boolean d() {
        return this.d;
    }

    @Override // com.huawei.ui.commonui.base.BaseDialog, android.app.Dialog
    public void show() {
        if (!(this.f10616b instanceof Activity) || BaseApplication.j() == null) {
            ReleaseLogUtil.b("Track_RouteAutoRemindDialog", "context not activity or top activity is null");
            return;
        }
        if (((Activity) this.f10616b).getClass().getSimpleName().equals(BaseApplication.j().getClass().getSimpleName())) {
            super.show();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseDialog, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        jdi.e(this.d);
    }
}
