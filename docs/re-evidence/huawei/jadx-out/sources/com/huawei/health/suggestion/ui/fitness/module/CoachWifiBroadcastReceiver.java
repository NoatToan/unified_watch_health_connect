package com.huawei.health.suggestion.ui.fitness.module;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.huawei.health.suggestion.ui.fitness.activity.LongCoachActivity;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes9.dex */
public class CoachWifiBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference<LongCoachActivity> f9375c;

    public CoachWifiBroadcastReceiver(LongCoachActivity longCoachActivity) {
        if (longCoachActivity != null) {
            this.f9375c = new WeakReference<>(longCoachActivity);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || intent.getAction() == null) {
            LogUtil.j("CoachWifiBroadcastReceiver", "onReceive intent or action is null");
            return;
        }
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LongCoachActivity longCoachActivity = this.f9375c.get();
            if (longCoachActivity == null) {
                LogUtil.j("CoachWifiBroadcastReceiver", "onReceive mActivity is null");
                return;
            }
            if (!CommonUtil.ab(context)) {
                LogUtil.j("CoachWifiBroadcastReceiver", "onReceive net is not connect");
                return;
            }
            LongCoachView coachView = longCoachActivity.getCoachView();
            if (coachView != null && coachView.ad()) {
                LogUtil.a("CoachWifiBroadcastReceiver", "isHasRemindMobileConnected true");
                return;
            }
            if (CommonUtil.ah(context)) {
                if (longCoachActivity.b() != null) {
                    longCoachActivity.b().e();
                }
                if (longCoachActivity.getCoachView() != null) {
                    longCoachActivity.getCoachView().ax();
                    longCoachActivity.getCoachView().ba();
                    return;
                }
                return;
            }
            if (longCoachActivity.getCoachView() != null) {
                longCoachActivity.getCoachView().y();
            }
        }
    }
}
