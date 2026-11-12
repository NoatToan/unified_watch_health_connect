package com.huawei.ui.main.stories.fitness.activity.coresleep;

import android.content.Context;
import androidx.core.util.Consumer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.knit.data.MinorProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.knit.section.view.CustomH5ProWebview;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.main.R;
import defpackage.ddv;
import defpackage.ftt;
import defpackage.gxq;
import defpackage.lsl;
import defpackage.pjo;
import health.compact.a.Utils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes43.dex */
public class SleepWebviewProvider extends MinorProvider<gxq> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private gxq f26863a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f26864c = false;
    private SectionBean d;
    private CustomH5ProWebview e;

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        LogUtil.a("SleepWebviewProvider", "provider: " + this);
        if (Utils.k() || this.f26863a == null) {
            LogUtil.a("SleepWebviewProvider", "set SleepWebviewProvider invisible");
            return false;
        }
        LogUtil.a("SleepWebviewProvider", "isActive: " + this.f26863a.g().n());
        return this.f26863a.g().n();
    }

    @Override // com.huawei.health.knit.data.MinorProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(Context context, SectionBean sectionBean) {
        LogUtil.a("SleepWebviewProvider", "loadData");
        this.d = sectionBean;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.health.knit.data.MinorProvider
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onSetSectionBeanData(SectionBean sectionBean, gxq gxqVar) {
        this.f26863a = gxqVar;
        sectionBean.d(this, gxqVar);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, gxq gxqVar) {
        LogUtil.a("SleepWebviewProvider", "parseParams");
        this.f26863a = gxqVar;
        if (map == null || context == null) {
            return;
        }
        map.put("TITLE", context.getResources().getString(R.string.IDS_sleep_featured_sleep_talk_snoring));
        gxq gxqVar2 = this.f26863a;
        if (gxqVar2 != null) {
            long jA = lsl.a(lsl.d(gxqVar2.f(), -1), 20, 0);
            ftt.b(jA);
            map.put("SLEEP_START_TIME", Long.valueOf(jA));
            long jA2 = lsl.a(this.f26863a.f(), 20, 0);
            ftt.e(jA2);
            map.put("SLEEP_END_TIME", Long.valueOf(jA2));
        }
        map.put("LEFT_TEXT", context.getString(R.string.IDS_clear_sleep_data_cache));
        map.put("RIGHT_TEXT", context.getString(R.string.IDS_rq_no_record));
        map.put("CALL_BACK", new Consumer<CustomH5ProWebview>() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.SleepWebviewProvider.2
            @Override // androidx.core.util.Consumer
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void accept(CustomH5ProWebview customH5ProWebview) {
                ddv.b().initH5Pro();
                LogUtil.a("SleepWebviewProvider", "start to load, JsModule: " + pjo.b().getJsModule());
                SleepWebviewProvider.this.e = customH5ProWebview;
                SleepWebviewProvider.this.a(customH5ProWebview);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CustomH5ProWebview customH5ProWebview) {
        LogUtil.a("SleepWebviewProvider", "loadH5proMiniProgram: ", customH5ProWebview, ", instance: ", customH5ProWebview != null ? customH5ProWebview.getInstance() : Constants.NULL);
        if (this.f26864c) {
            return;
        }
        H5ProClient.startH5MiniProgram("com.huawei.health.h5.sleepdetection", customH5ProWebview, new H5ProLaunchOption.Builder().addPath("#/featured").setForceDarkMode(1).addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).addCustomizeJsModule("sectionApi", ftt.class).addCustomizeJsModule("SleepDetection", pjo.b().getJsModule()).build());
        this.f26864c = true;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider
    public String getLogTag() {
        return "SleepWebviewProvider";
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        LogUtil.a("SleepWebviewProvider", "SleepWebviewProvider clear");
        CustomH5ProWebview customH5ProWebview = this.e;
        if (customH5ProWebview != null) {
            customH5ProWebview.c();
        }
        ObserverManagerUtil.a("CHART_START_END_TIME");
        ObserverManagerUtil.a("REFRESH_H5_HEIGHT");
    }
}
