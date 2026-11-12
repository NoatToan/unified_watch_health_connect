package com.huawei.ui.homehealth.runcard.trackfragments;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.View;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.health.healthcloudconfig.listener.DownloadCallback;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.homehealth.R;
import defpackage.jae;
import defpackage.jem;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class SmartCoachProvider extends BaseKnitDataProvider<Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private jae f25897c;
    private Context d;
    private SectionBean e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DownloadCallback f25896b = new DownloadCallback() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SmartCoachProvider.3
        @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
        public void onProgress(long j, long j2, boolean z, String str) {
        }

        @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
        public void onFinish(Object obj) {
            LogUtil.a("Track_Provider_SmartCoachProvider", "mDownloadIndexFileListener onFinish, data = ", obj.toString());
            if (SmartCoachProvider.this.f25897c != null) {
                if (SmartCoachProvider.this.f25897c.i()) {
                    if (SmartCoachProvider.this.f25897c.g()) {
                        LogUtil.a("Track_Provider_SmartCoachProvider", "showUpdateDialog");
                        SmartCoachProvider.this.d();
                        SmartCoachProvider.this.d(true);
                        return;
                    }
                    return;
                }
                LogUtil.j("Track_Provider_SmartCoachProvider", "mDownloadIndexFileListener moveIndexFile failed.");
                return;
            }
            LogUtil.j("Track_Provider_SmartCoachProvider", "mDownloadIndexFileListener mSmartCoachDownloadUtils is null.");
        }

        @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
        public void onFail(int i, Throwable th) {
            LogUtil.j("Track_Provider_SmartCoachProvider", "mDownloadIndexFileListener downloadIndexFile failed.");
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BroadcastReceiver f25895a = new BroadcastReceiver() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SmartCoachProvider.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LogUtil.a("Track_Provider_SmartCoachProvider", "mGetFragmentDataNotify enter");
            if (context == null || intent == null) {
                LogUtil.j("Track_Provider_SmartCoachProvider", "context or intent is null.");
                return;
            }
            if (intent.getAction() != null && "com.huawei.health.action_receive_data_notify".equals(intent.getAction())) {
                LogUtil.a("Track_Provider_SmartCoachProvider", "mGetFragmentDataNotify ACTION_RECEIVE_FRAGMENT_DATA_NOTIFY");
                SmartCoachProvider.this.d(false);
            }
            SmartCoachProvider.this.a();
        }
    };

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return true;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        this.e = sectionBean;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(Context context, SectionBean sectionBean) {
        LogUtil.e("Track_Provider_SmartCoachProvider", "loadData");
        this.d = context;
        e();
    }

    private void e() {
        if (CommonUtil.j(SharedPreferenceManager.e(this.d, Integer.toString(20002), "smart_coach_update_layout_count")) >= 3) {
            this.e.c((Object) null);
            return;
        }
        LogUtil.d("Track_Provider_SmartCoachProvider", "enter start check");
        boolean zO = Utils.o();
        boolean zL = LanguageUtil.l(this.d);
        if (!zO && zL && jem.i()) {
            if (this.f25897c == null) {
                this.f25897c = new jae();
            }
            this.f25897c.d(BaseApplication.getActivity(), this.f25896b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        LogUtil.a("Track_Provider_SmartCoachProvider", "Enter registerFragmentDataNotify()");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.health.action_receive_data_notify");
        LocalBroadcastManager.getInstance().registerReceiver(this.f25895a, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        LogUtil.a("Track_Provider_SmartCoachProvider", "Enter unregisterPushTokenChange");
        try {
            LocalBroadcastManager.getInstance().unregisterReceiver(this.f25895a);
        } catch (IllegalArgumentException e) {
            LogUtil.e("Track_Provider_SmartCoachProvider", "unregisterFragmentDataNotify illegalArgumentException ", LogAnonymous.b(e));
        } catch (RuntimeException e2) {
            LogUtil.e("Track_Provider_SmartCoachProvider", "unregisterFragmentDataNotify runtimeException", LogAnonymous.b(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        if (z) {
            SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(20002), "smart_coach_update_layout_count", String.valueOf(CommonUtil.j(SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(20002), "smart_coach_update_layout_count")) + 1), null);
            this.e.c(new Object());
            return;
        }
        this.e.c((Object) null);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void parseParams(Context context, HashMap<String, Object> map, Object obj) {
        map.put("BANNER_CARD_CONTENT", BaseApplication.getContext().getString(R.string.IDS_motiontrack_discover_new_functions_of_intelligent_coach));
        map.put("BANNER_CARD_CANCEL", BaseApplication.getContext().getString(R.string.IDS_settings_button_cancal));
        map.put("BANNER_CARD_SUBMIT", BaseApplication.getContext().getString(R.string.IDS_device_manager_update_health));
        b(map);
    }

    private void b(Map<String, Object> map) {
        map.put("CLICK_EVENT_LISTENER", new OnClickSectionListener() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SmartCoachProvider.4
            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, int i2) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, String str) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(String str) {
                if ("BANNER_CARD_CANCEL_CLICK_EVENT".equals(str)) {
                    Intent intent = new Intent();
                    intent.setPackage(BaseApplication.getContext().getPackageName());
                    intent.setAction("com.huawei.health.action_receive_data_notify");
                    LocalBroadcastManager.getInstance().sendBroadcast(intent);
                    if (SmartCoachProvider.this.f25897c != null) {
                        SmartCoachProvider.this.f25897c.f();
                        return;
                    }
                    return;
                }
                if ("BANNER_CARD_SUBMIT_CLICK_EVENT".equals(str)) {
                    Intent intent2 = new Intent();
                    intent2.setPackage(BaseApplication.getContext().getPackageName());
                    intent2.setAction("com.huawei.health.action_receive_data_notify");
                    LocalBroadcastManager.getInstance().sendBroadcast(intent2);
                    if (SmartCoachProvider.this.f25897c != null) {
                        SmartCoachProvider.this.f25897c.d((IBaseResponseCallback) null);
                    }
                }
            }
        });
    }
}
