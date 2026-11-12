package com.huawei.ui.homehealth.achievementcard;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import com.huawei.ui.device.interactors.NotificationPushInteractor;
import com.huawei.ui.homehealth.refreshcard.CardViewHolder;
import defpackage.lmf;
import defpackage.tfn;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes17.dex */
public class AchievementCardViewHolder extends CardViewHolder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f25169b;
    private boolean d;

    public AchievementCardViewHolder(View view, Context context, boolean z) {
        super(view, context, z);
        this.d = false;
        this.f25169b = new e(this);
        LogUtil.a("AchievementCardViewHolder", "AchievementCardViewHolder");
    }

    static class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<AchievementCardViewHolder> f25170b;

        b(AchievementCardViewHolder achievementCardViewHolder) {
            this.f25170b = new WeakReference<>(achievementCardViewHolder);
        }

        @Override // java.lang.Runnable
        public void run() {
            AchievementCardViewHolder achievementCardViewHolder = this.f25170b.get();
            if (achievementCardViewHolder == null) {
                return;
            }
            LogUtil.a("AchievementCardViewHolder", "check notification is enable");
            if (CommonUtil.ag(BaseApplication.b())) {
                achievementCardViewHolder.d(1);
                return;
            }
            LogUtil.j("AchievementCardViewHolder", "check notification is disabled");
            achievementCardViewHolder.d(0);
            CommonUtil.ak(BaseApplication.b());
            Handler handler = achievementCardViewHolder.f25169b;
            if (handler != null) {
                handler.removeMessages(7);
                handler.sendEmptyMessageDelayed(7, 20000L);
            }
        }
    }

    static class e extends BaseHandler<AchievementCardViewHolder> {
        e(AchievementCardViewHolder achievementCardViewHolder) {
            super(achievementCardViewHolder);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(AchievementCardViewHolder achievementCardViewHolder, Message message) {
            int i = message.what;
            if (i == 5) {
                achievementCardViewHolder.c();
            } else if (i == 7) {
                achievementCardViewHolder.b();
            } else {
                LogUtil.j("AchievementCardViewHolder", "handleMessage else");
            }
        }
    }

    public void d() {
        LogUtil.a("AchievementCardViewHolder", "restartNotifyService");
        Handler handler = this.f25169b;
        if (handler != null) {
            Message messageObtainMessage = handler.obtainMessage();
            messageObtainMessage.what = 5;
            this.f25169b.sendMessageDelayed(messageObtainMessage, 10000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        LogUtil.a("AchievementCardViewHolder", "enter checkIsNotifyEnable");
        this.d = false;
        if (CommonUtil.ag(getContext())) {
            LogUtil.a("AchievementCardViewHolder", "Notify service is running");
            b(1);
            return;
        }
        LogUtil.j("AchievementCardViewHolder", "Notify service is disabled,send broadcast");
        b(0);
        if (CommonUtil.bg()) {
            LogUtil.j("AchievementCardViewHolder", "checkIsNotifyEnable isHuaweiSystem");
            return;
        }
        if (CommonUtil.p(getContext()) == 30) {
            LogUtil.j("AchievementCardViewHolder", "checkIsNotifyEnable getRunningServicesSize is 30");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.huawei.health.action.NPL_SERVICE_NOT_AVALIABLE");
        intent.setPackage(getContext().getPackageName());
        getContext().sendBroadcast(intent, LocalBroadcast.f36595c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (!this.d) {
            if (tfn.a() == null) {
                LogUtil.j("AchievementCardViewHolder", "checkNotifyService DeviceStateInteractors instance is null");
                return;
            }
            DeviceInfo deviceInfoJ = tfn.a().j();
            if (deviceInfoJ != null && deviceInfoJ.getDeviceConnectState() == 2) {
                DeviceCapability deviceCapabilityD = DeviceSettingsInteractors.e(getContext()).d();
                NotificationPushInteractor notificationPushInteractor = new NotificationPushInteractor(getContext());
                if (deviceCapabilityD != null && deviceCapabilityD.isMessageAlert() && notificationPushInteractor.b()) {
                    ThreadPoolManager.c().b("AchievementCardViewHolder", new b(this));
                    this.d = true;
                    return;
                }
                return;
            }
            LogUtil.j("AchievementCardViewHolder", "onResume is checking notification not connected");
            return;
        }
        LogUtil.j("AchievementCardViewHolder", "onResume is checking notification");
    }

    public void a() {
        Handler handler = this.f25169b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f25169b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        String str = Build.BRAND;
        HashMap map = new HashMap(8);
        map.put("brand", str);
        map.put("code", Integer.valueOf(i));
        lmf.d().c(getContext(), AnalyticsValue.NOTIFY_SERVICE_ENABLE_1090027.value(), map, 0);
    }

    private void b(int i) {
        String str = Build.BRAND;
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(8);
        linkedHashMap.put("brand", str);
        linkedHashMap.put("code", String.valueOf(i));
        OpAnalyticsUtil.getInstance().setEvent2nd(AnalyticsValue.NOTIFY_SERVICE_ENABLE_1090028.value(), linkedHashMap);
    }
}
