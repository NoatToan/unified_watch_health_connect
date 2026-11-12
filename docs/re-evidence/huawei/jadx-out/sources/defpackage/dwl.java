package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.health.device.ui.DeviceMainActivity;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;

/* JADX INFO: loaded from: classes7.dex */
public class dwl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Dialog f32459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f32460c;
    private Handler d = new Handler();
    private Activity e;

    public dwl(Activity activity) {
        this.e = activity;
        this.f32459b = new Dialog(this.e, R.style.dialog_toast_style);
        View viewInflate = LayoutInflater.from(activity).inflate(R.layout.dialog_toast_layout, (ViewGroup) null);
        this.f32459b.setContentView(viewInflate);
        this.f32460c = (HealthTextView) qsp.a(viewInflate, R.id.hw_dialog_toast_message);
    }

    public void d(CharSequence charSequence, int i) {
        this.f32458a = i;
        this.f32460c.setText(charSequence);
        LogUtil.a("DialogToToast", "dialog toast message:", charSequence, ",duration:", Integer.valueOf(i));
    }

    public void c(Activity activity, int i, int i2) {
        String string;
        if (activity == null) {
            LogUtil.j("DialogToToast", "makeText context is null");
            return;
        }
        try {
            string = activity.getString(i);
        } catch (Resources.NotFoundException unused) {
            LogUtil.e("DialogToToast", "makeText Exception : content is null");
            string = "";
        }
        d(string, i2);
    }

    public void d() {
        LogUtil.a("DialogToToast", "dialog toast show");
        Activity activity = this.e;
        if (activity == null) {
            LogUtil.j("DialogToToast", "show mContext is null");
            return;
        }
        if (!(activity instanceof DeviceMainActivity)) {
            LogUtil.j("DialogToToast", "mMainActivity not instanceof DeviceMainActivity");
            return;
        }
        if (activity.isDestroyed() || this.e.isFinishing()) {
            LogUtil.j("DialogToToast", "show Activity is destroyed or finishing");
            return;
        }
        if (this.f32459b.isShowing()) {
            this.f32459b.dismiss();
        }
        this.f32459b.show();
        this.d.postDelayed(new Runnable() { // from class: dwl.4
            @Override // java.lang.Runnable
            public void run() {
                dwl.this.f32459b.dismiss();
            }
        }, this.f32458a);
    }
}
