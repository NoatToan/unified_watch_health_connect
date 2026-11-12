package com.huawei.health.interactor;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.huawei.health.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import defpackage.iov;
import defpackage.qrs;
import defpackage.wss;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;

/* JADX INFO: loaded from: classes7.dex */
public class WeiXinInteractor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f7207b;
    private CustomViewDialog d = null;
    private final wss e;

    public boolean d() {
        return false;
    }

    public WeiXinInteractor(Context context) {
        this.f7207b = context;
        this.e = wss.d(context);
    }

    public void c() {
        g();
        LogUtil.a("Login_WeiXinInteractor", "showWechatDialog() enter");
        if (this.f7207b instanceof Activity) {
            CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.f7207b);
            View viewInflate = LayoutInflater.from(this.f7207b).inflate(R.layout.hw_health_wechat_tips_view, (ViewGroup) null);
            HealthCheckBox healthCheckBox = (HealthCheckBox) viewInflate.findViewById(R.id.cb_wechat_tips_not_remind);
            LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.cb_wechat_not_remind_layout);
            healthCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.health.interactor.WeiXinInteractor$$ExternalSyntheticLambda0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    WeiXinInteractor.d(compoundButton, z);
                }
            });
            builder.d(viewInflate);
            builder.a(this.f7207b.getString(R.string.IDS_hw_healt_wechat_dialog_button_content), new View.OnClickListener() { // from class: fob
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.c(view);
                }
            });
            if (b()) {
                linearLayout.setVisibility(0);
                builder.c(this.f7207b.getString(R.string.IDS_settings_button_cancal), new View.OnClickListener() { // from class: fny
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f34301c.e(view);
                    }
                });
            } else {
                linearLayout.setVisibility(8);
            }
            this.d = builder.d();
            if (iov.d((Activity) this.f7207b)) {
                this.d.show();
            }
        }
    }

    static /* synthetic */ void d(CompoundButton compoundButton, boolean z) {
        StorageParams storageParams = new StorageParams();
        if (z) {
            SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10018), "health_is_allowed_wechat_tips", "false", storageParams);
        } else {
            SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10018), "health_is_allowed_wechat_tips", "true", storageParams);
        }
    }

    public /* synthetic */ void c(View view) {
        this.e.a(this.f7207b);
    }

    public /* synthetic */ void e(View view) {
        CustomViewDialog customViewDialog = this.d;
        if (customViewDialog == null || !customViewDialog.isShowing()) {
            return;
        }
        a();
    }

    private void a() {
        if (((Activity) this.f7207b).isDestroyed() || ((Activity) this.f7207b).isFinishing()) {
            return;
        }
        this.d.dismiss();
        this.d = null;
    }

    public void e() {
        CustomViewDialog customViewDialog = this.d;
        if (customViewDialog != null) {
            customViewDialog.dismiss();
        }
        this.d = null;
    }

    private boolean b() {
        String strE = SharedPreferenceManager.e(this.f7207b, Integer.toString(10018), "health_binded_times");
        LogUtil.a("Login_WeiXinInteractor", "isShowNotRemindBox bindTimes=", strE);
        boolean z = qrs.a(strE) >= 4;
        LogUtil.a("Login_WeiXinInteractor", "isShowNotRemindBox isShow=", Boolean.valueOf(z));
        return z;
    }

    private void g() {
        StorageParams storageParams = new StorageParams();
        String strE = SharedPreferenceManager.e(this.f7207b, Integer.toString(10018), "health_binded_times");
        LogUtil.a("Login_WeiXinInteractor", "bindTimes =", strE);
        if ("".equals(strE)) {
            SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10018), "health_binded_times", "1", storageParams);
        } else if ("1".equals(strE)) {
            SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10018), "health_binded_times", "2", storageParams);
        } else if ("2".equals(strE)) {
            SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10018), "health_binded_times", "3", storageParams);
        } else if ("3".equals(strE)) {
            SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10018), "health_binded_times", "4", storageParams);
        } else {
            LogUtil.j("Login_WeiXinInteractor", "saveWechatSp is other condition");
        }
        SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10019), "health_last_binded_time", String.valueOf(System.currentTimeMillis()), storageParams);
    }
}
