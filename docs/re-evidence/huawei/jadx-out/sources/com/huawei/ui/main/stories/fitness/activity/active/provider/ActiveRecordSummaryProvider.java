package com.huawei.ui.main.stories.fitness.activity.active.provider;

import android.content.Context;
import android.os.Bundle;
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
import health.compact.a.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class ActiveRecordSummaryProvider extends BaseKnitDataProvider<HiHealthData> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f26549b;
    private H5ProWebView e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f26548a = new d(this);
    private final List<H5ProWebView> d = new ArrayList();

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider
    public String getLogTag() {
        return "R_ActiveRecordSummaryProvider_" + getGroupId();
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return qdm.q();
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        super.loadDefaultData(sectionBean);
        Bundle extra = getExtra();
        if (extra == null) {
            ReleaseLogUtil.c(getLogTag(), "loadDefaultData extra is null");
        } else {
            this.f26549b = extra.getInt("card_id");
        }
        sectionBean.c(new HiHealthData());
        ObserverManagerUtil.d(this.f26548a, "ACTIVE_RECORD_SUMMARY_SYNC_STATUS");
        ReleaseLogUtil.c(getLogTag(), "loadDefaultData mCardId ", Integer.valueOf(this.f26549b));
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, HiHealthData hiHealthData) {
        super.parseParams(context, map, hiHealthData);
        if (map == null) {
            ReleaseLogUtil.d(getLogTag(), "parseParams outParams is null");
            return;
        }
        ReleaseLogUtil.c(getLogTag(), "parseParams");
        map.put("PAGE_TYPE", 1075);
        map.put("PAGE_ID", "Rings_0001");
        map.put("CALL_BACK", new a(this));
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        super.onDestroy();
        ReleaseLogUtil.c(getLogTag(), "onDestroy");
        ObserverManagerUtil.c(this.f26548a);
        qdm.c(getLogTag(), this.e, this.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(H5ProWebView h5ProWebView) {
        String str;
        if (h5ProWebView == null) {
            ReleaseLogUtil.d(getLogTag(), "loadEmbeddedH5 h5ProWebView is null");
            return;
        }
        if (this.f26549b <= 0) {
            str = "#/highLightCardView?domain=activityRings&bgColor=grayBlack";
        } else {
            str = "#/highLightCardView?domain=activityRings&bgColor=grayBlack&cardId=" + this.f26549b;
        }
        ddv.b().loadEmbeddedH5(h5ProWebView, "com.huawei.health.h5.health-trend", new H5ProLaunchOption.Builder().addPath(str));
        ReleaseLogUtil.c(getLogTag(), "loadEmbeddedH5 mCardId ", Integer.valueOf(this.f26549b));
        this.d.add(h5ProWebView);
        this.e = h5ProWebView;
    }

    static class a implements Consumer<H5ProWebView> {
        private final WeakReference<ActiveRecordSummaryProvider> e;

        a(ActiveRecordSummaryProvider activeRecordSummaryProvider) {
            this.e = new WeakReference<>(activeRecordSummaryProvider);
        }

        @Override // androidx.core.util.Consumer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void accept(H5ProWebView h5ProWebView) {
            ActiveRecordSummaryProvider activeRecordSummaryProvider = this.e.get();
            if (activeRecordSummaryProvider != null) {
                activeRecordSummaryProvider.e(h5ProWebView);
            } else {
                ReleaseLogUtil.d("R_ActiveRecordSummaryProvider", "InnerConsumer accept provider is null");
            }
        }
    }

    static class d implements Observer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<ActiveRecordSummaryProvider> f26550a;

        d(ActiveRecordSummaryProvider activeRecordSummaryProvider) {
            this.f26550a = new WeakReference<>(activeRecordSummaryProvider);
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            ActiveRecordSummaryProvider activeRecordSummaryProvider = this.f26550a.get();
            if (activeRecordSummaryProvider == null || objArr == null) {
                ReleaseLogUtil.d("R_ActiveRecordSummaryProvider", "InnerObserver notify provider ", activeRecordSummaryProvider, " objects ", objArr, " label ", str);
                return;
            }
            if (objArr.length == 0) {
                ReleaseLogUtil.d(activeRecordSummaryProvider.getLogTag(), "InnerObserver notify length is 0");
                return;
            }
            Object obj = objArr[0];
            if (!(obj instanceof Boolean)) {
                ReleaseLogUtil.d(activeRecordSummaryProvider.getLogTag(), "InnerObserver notify object ", obj);
                return;
            }
            Boolean bool = (Boolean) obj;
            boolean zBooleanValue = bool.booleanValue();
            ReleaseLogUtil.c(activeRecordSummaryProvider.getLogTag(), "InnerObserver notify isSyncSuccess ", bool);
            if (zBooleanValue) {
                qdm.d(activeRecordSummaryProvider.getLogTag(), activeRecordSummaryProvider.e);
            }
        }
    }
}
