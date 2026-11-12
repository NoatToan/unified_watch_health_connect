package defpackage;

import android.content.Intent;
import android.os.SystemClock;
import android.view.View;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.browse.BrowsingBiEvent;
import com.huawei.browse.BrowsingClickListener;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes4.dex */
public class cha implements BrowsingClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f1591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Long f1592c;
    private String d;
    private View.OnClickListener e;

    public cha(View.OnClickListener onClickListener, boolean z, String str) {
        this.e = onClickListener;
        this.f1590a = z;
        this.d = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        BrowsingBiEvent browsingBiEvent = LoginInit.getBrowsingBiEvent();
        if (SharedPreferenceManager.b(Integer.toString(PrebakedEffectId.RT_FLY), "is_base_service_model", false)) {
            ReleaseLogUtil.e("R_PLGLOGIN_BrowsingClickListenerImpl", "onClick showFullServiceDialog");
            browsingBiEvent.showFullServiceDialog(BaseApplication.b());
            return;
        }
        if (!isBrowsingMode() || !this.f1590a) {
            this.e.onClick(view);
            return;
        }
        ReleaseLogUtil.e("R_PLGLOGIN_BrowsingClickListenerImpl", "onClick isBrowsingMode: ", Boolean.valueOf(isBrowsingMode()), "  mIsNeedLoginUrl: ", Boolean.valueOf(this.f1590a));
        this.f1591b = view;
        this.f1592c = Long.valueOf(SystemClock.elapsedRealtime());
        Intent intent = new Intent();
        intent.setAction("com.huawei.plugin.trigger.checklogin");
        LocalBroadcastManager.getInstance().sendBroadcast(intent);
        if (browsingBiEvent != null) {
            browsingBiEvent.loginBeforeBiEvent(this.d);
        }
    }

    @Override // com.huawei.browse.BrowsingClickListener
    public void onNext() {
        if (this.f1591b != null) {
            LogUtil.d("PLGLOGIN_BrowsingClickListenerImpl", "OnClickListener onNext.");
            this.e.onClick(this.f1591b);
            this.f1591b = null;
        }
    }

    @Override // com.huawei.browse.BrowsingClickListener
    public boolean isBrowsingMode() {
        return LoginInit.getInstance(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).isBrowseMode();
    }

    public boolean b(cha chaVar) {
        return d().longValue() > chaVar.d().longValue();
    }

    public Long d() {
        return this.f1592c;
    }

    public View b() {
        return this.f1591b;
    }

    public void e() {
        this.f1591b = null;
    }
}
