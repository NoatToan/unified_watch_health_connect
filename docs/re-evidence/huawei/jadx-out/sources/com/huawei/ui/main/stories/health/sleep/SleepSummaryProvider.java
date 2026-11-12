package com.huawei.ui.main.stories.health.sleep;

import android.content.Context;
import androidx.core.util.Consumer;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.h5pro.core.H5ProWebView;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hihealth.HiHealthData;
import defpackage.ddv;
import defpackage.qdm;
import health.compact.a.CommonUtil;
import health.compact.a.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class SleepSummaryProvider extends BaseKnitDataProvider<HiHealthData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private H5ProWebView f28079a;
    private final d d = new d(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<H5ProWebView> f28080c = new ArrayList();

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider
    public String getLogTag() {
        return "R_SleepSummaryProvider_" + getGroupId();
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return qdm.q() && CommonUtil.ab((Context) null);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        super.loadDefaultData(sectionBean);
        sectionBean.c(new HiHealthData());
        ReleaseLogUtil.c(getLogTag(), "loadDefaultData");
        ObserverManagerUtil.d(this.d, "SLEEP_SUMMARY_SYNC_STATUS");
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, HiHealthData hiHealthData) {
        super.parseParams(context, map, hiHealthData);
        if (map == null) {
            ReleaseLogUtil.d(getLogTag(), "parseParams outParams is null");
            return;
        }
        ReleaseLogUtil.c(getLogTag(), "parseParams");
        map.put("PAGE_TYPE", 1073);
        map.put("PAGE_ID", "Sleep_0001");
        map.put("CALL_BACK", new a(this));
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        super.onDestroy();
        ReleaseLogUtil.c(getLogTag(), "onDestroy");
        ObserverManagerUtil.c(this.d);
        qdm.c(getLogTag(), this.f28079a, this.f28080c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(H5ProWebView h5ProWebView) {
        if (h5ProWebView == null) {
            ReleaseLogUtil.d(getLogTag(), "loadEmbeddedH5 h5ProWebView is null");
            return;
        }
        ddv.b().loadEmbeddedH5(h5ProWebView, "com.huawei.health.h5.health-trend", new H5ProLaunchOption.Builder().addPath("#/highLightCardView?domain=sleep"));
        ReleaseLogUtil.c(getLogTag(), "loadEmbeddedH5");
        this.f28080c.add(h5ProWebView);
        this.f28079a = h5ProWebView;
    }

    static class a implements Consumer<H5ProWebView> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<SleepSummaryProvider> f28081a;

        a(SleepSummaryProvider sleepSummaryProvider) {
            this.f28081a = new WeakReference<>(sleepSummaryProvider);
        }

        @Override // androidx.core.util.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(H5ProWebView h5ProWebView) {
            SleepSummaryProvider sleepSummaryProvider = this.f28081a.get();
            if (sleepSummaryProvider != null) {
                sleepSummaryProvider.e(h5ProWebView);
            } else {
                ReleaseLogUtil.d("R_SleepSummaryProvider", "InnerConsumer accept provider is null");
            }
        }
    }

    static class d implements Observer {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<SleepSummaryProvider> f28082c;

        d(SleepSummaryProvider sleepSummaryProvider) {
            this.f28082c = new WeakReference<>(sleepSummaryProvider);
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            SleepSummaryProvider sleepSummaryProvider = this.f28082c.get();
            if (sleepSummaryProvider == null || objArr == null) {
                ReleaseLogUtil.d("R_SleepSummaryProvider", "InnerObserver notify provider ", sleepSummaryProvider, " objects ", objArr, " label ", str);
                return;
            }
            if (objArr.length == 0) {
                ReleaseLogUtil.d(sleepSummaryProvider.getLogTag(), "InnerObserver notify length is 0");
                return;
            }
            Object obj = objArr[0];
            if (!(obj instanceof Boolean)) {
                ReleaseLogUtil.d(sleepSummaryProvider.getLogTag(), "InnerObserver notify object ", obj);
                return;
            }
            Boolean bool = (Boolean) obj;
            boolean zBooleanValue = bool.booleanValue();
            ReleaseLogUtil.c(sleepSummaryProvider.getLogTag(), "InnerObserver notify isSyncSuccess ", bool);
            if (zBooleanValue) {
                qdm.d(sleepSummaryProvider.getLogTag(), sleepSummaryProvider.f28079a);
            }
        }
    }
}
