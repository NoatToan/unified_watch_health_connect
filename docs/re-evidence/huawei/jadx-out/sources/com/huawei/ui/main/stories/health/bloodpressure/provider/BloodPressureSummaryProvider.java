package com.huawei.ui.main.stories.health.bloodpressure.provider;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.core.util.Consumer;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.h5pro.core.H5ProWebView;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import defpackage.ddv;
import defpackage.qdm;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.ReleaseLogUtil;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class BloodPressureSummaryProvider extends BaseKnitDataProvider<HiHealthData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private H5ProWebView f27855a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BroadcastReceiver f27857c;
    private final List<H5ProWebView> d = new ArrayList();
    private DataInfos e = DataInfos.NoDataPlaceHolder;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f27856b = true;

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider
    public String getLogTag() {
        return "R_BloodPressureSummaryProvider_" + getGroupId();
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return qdm.q();
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        super.loadDefaultData(sectionBean);
        Bundle extra = getExtra();
        Serializable serializable = extra != null ? extra.getSerializable("key_bundle_health_line_chart_data_infos") : null;
        this.e = serializable instanceof DataInfos ? (DataInfos) serializable : DataInfos.NoDataPlaceHolder;
        sectionBean.c(new HiHealthData());
        ReleaseLogUtil.c(getLogTag(), "loadDefaultData");
        qdm.p();
        a(qdm.d());
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, HiHealthData hiHealthData) {
        super.parseParams(context, map, hiHealthData);
        if (map == null) {
            ReleaseLogUtil.d(getLogTag(), "parseParams outParams is null");
            return;
        }
        ReleaseLogUtil.c(getLogTag(), "parseParams");
        map.put("PAGE_TYPE", 1077);
        map.put("PAGE_ID", "BloodPressure_0001");
        map.put("CALL_BACK", new d(this));
        if ((context instanceof Activity) && this.e == DataInfos.BloodPressureDayDetail && this.f27856b) {
            this.f27856b = false;
            boolean booleanExtra = ((Activity) context).getIntent().getBooleanExtra("is_scroll_to_summary", false);
            LogUtil.a("R_BloodPressureSummaryProvider", "isCardShowSummary = ", Boolean.valueOf(booleanExtra));
            map.put("is_scroll_to_summary", Boolean.valueOf(booleanExtra));
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        super.onDestroy();
        ReleaseLogUtil.c(getLogTag(), "onDestroy");
        if (this.f27857c != null) {
            BroadcastManagerUtil.d(BaseApplication.getContext(), this.f27857c);
            this.f27857c = null;
        }
        qdm.c(getLogTag(), this.f27855a, this.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(H5ProWebView h5ProWebView) {
        if (h5ProWebView == null) {
            ReleaseLogUtil.d(getLogTag(), "loadEmbeddedH5 h5ProWebView is null");
            return;
        }
        ddv.b().loadEmbeddedH5(h5ProWebView, "com.huawei.health.h5.health-trend", new H5ProLaunchOption.Builder().addPath("#/highLightCardView?domain=bloodPressure"));
        ReleaseLogUtil.c(getLogTag(), "loadEmbeddedH5");
        this.d.add(h5ProWebView);
        this.f27855a = h5ProWebView;
    }

    private void a(final List<Integer> list) {
        if (this.f27857c == null) {
            this.f27857c = new BroadcastReceiver() { // from class: com.huawei.ui.main.stories.health.bloodpressure.provider.BloodPressureSummaryProvider.2
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    if (intent == null) {
                        ReleaseLogUtil.d("R_BloodPressureSummaryProvider", "registerSyncStatusBroadcastReceiver onReceive intent is null");
                        return;
                    }
                    String action = intent.getAction();
                    if (!"com.huawei.hihealth.action_sync_data_result".equals(action)) {
                        ReleaseLogUtil.d("R_BloodPressureSummaryProvider", "registerSyncStatusBroadcastReceiver onReceive action ", action);
                        return;
                    }
                    boolean booleanExtra = intent.getBooleanExtra("sync_data_result_success", true);
                    String stringExtra = intent.getStringExtra("sync_data_result_type");
                    boolean zC = qdm.c((List<Integer>) list, stringExtra);
                    ReleaseLogUtil.c("R_BloodPressureSummaryProvider", "registerSyncStatusBroadcastReceiver onReceive isSyncBloodPressureSummaryType ", Boolean.valueOf(zC), " syncDataResultType ", stringExtra, "syncDataTypeList ", list, " isSyncSuccess ", Boolean.valueOf(booleanExtra));
                    if (zC) {
                        qdm.d(BloodPressureSummaryProvider.this.getLogTag(), BloodPressureSummaryProvider.this.f27855a);
                    }
                }
            };
            BroadcastManagerUtil.d(BaseApplication.getContext(), this.f27857c, new IntentFilter("com.huawei.hihealth.action_sync_data_result"));
        }
    }

    static class d implements Consumer<H5ProWebView> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<BloodPressureSummaryProvider> f27858c;

        d(BloodPressureSummaryProvider bloodPressureSummaryProvider) {
            this.f27858c = new WeakReference<>(bloodPressureSummaryProvider);
        }

        @Override // androidx.core.util.Consumer
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void accept(H5ProWebView h5ProWebView) {
            BloodPressureSummaryProvider bloodPressureSummaryProvider = this.f27858c.get();
            if (bloodPressureSummaryProvider != null) {
                bloodPressureSummaryProvider.c(h5ProWebView);
            } else {
                ReleaseLogUtil.d("R_BloodPressureSummaryProvider", "InnerConsumer accept provider is null");
            }
        }
    }
}
