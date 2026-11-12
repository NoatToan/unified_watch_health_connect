package com.huawei.health.suggestion.ui.healthcourse.helper;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.huawei.health.suggestion.ui.healthcourse.activity.ShortVideoActivity;
import com.huawei.health.suggestion.ui.healthcourse.fragment.BaseVideoFragment;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes31.dex */
public class ShortVideoWifiBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<ShortVideoActivity> f9581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f9582c = false;
    private boolean e = false;

    public ShortVideoWifiBroadcastReceiver(ShortVideoActivity shortVideoActivity) {
        if (shortVideoActivity != null) {
            this.f9581b = new WeakReference<>(shortVideoActivity);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || intent.getAction() == null) {
            LogUtil.j("ShortVideoWifiBroadcastReceiver", "onReceive intent or action is null");
            return;
        }
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LogUtil.a("ShortVideoWifiBroadcastReceiver", "android.net.conn.CONNECTIVITY_CHANGE");
            ShortVideoActivity shortVideoActivity = this.f9581b.get();
            if (shortVideoActivity == null) {
                LogUtil.j("ShortVideoWifiBroadcastReceiver", "onReceive mActivity is null");
                return;
            }
            if (!CommonUtil.ab(context)) {
                this.e = true;
                LogUtil.j("ShortVideoWifiBroadcastReceiver", "onReceive net is not connect");
                return;
            }
            c(shortVideoActivity);
            this.e = false;
            if (this.f9582c) {
                LogUtil.a("ShortVideoWifiBroadcastReceiver", "isHasRemindMobileConnected true");
                return;
            }
            if (CommonUtil.ah(context)) {
                LogUtil.a("ShortVideoWifiBroadcastReceiver", "isTypeMobile");
                if (shortVideoActivity.e(false)) {
                    LogUtil.a("ShortVideoWifiBroadcastReceiver", "checkShowMobileDialog");
                    this.f9582c = true;
                } else if (shortVideoActivity.c()) {
                    this.f9582c = true;
                }
            }
        }
    }

    private void c(ShortVideoActivity shortVideoActivity) {
        if (this.e) {
            BaseVideoFragment baseVideoFragmentD = shortVideoActivity.d();
            LogUtil.a("ShortVideoWifiBroadcastReceiver", "connect fragment == null", Boolean.valueOf(baseVideoFragmentD == null));
            if (baseVideoFragmentD != null) {
                baseVideoFragmentD.b();
            }
        }
    }

    public void e(boolean z) {
        this.f9582c = z;
    }
}
