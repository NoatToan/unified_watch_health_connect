package com.huawei.ui.homehealth.runcard.trackfragments;

import android.content.Context;
import android.view.View;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.healthcloud.plugintrack.golf.device.GolfDeviceProxy;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginfitnessadvice.h5pro.SeriesCourseH5Repository;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.runcard.trackfragments.GolfClubsEnterProvider;
import defpackage.ddq;
import defpackage.ddv;
import defpackage.qpx;
import defpackage.qrs;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes43.dex */
public class GolfClubsEnterProvider extends BaseKnitDataProvider<Integer> {
    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return true;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        sectionBean.c((Object) 0);
    }

    /* JADX INFO: renamed from: com.huawei.ui.homehealth.runcard.trackfragments.GolfClubsEnterProvider$4, reason: invalid class name */
    public class AnonymousClass4 implements OnClickSectionListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f25861c;

        public static /* synthetic */ void d(int i, Object obj) {
        }

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

        AnonymousClass4(Context context) {
            this.f25861c = context;
        }

        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(String str) {
            if (qrs.c(500)) {
                LogUtil.a("Track_Provider_Track_GolfClubsEnterProvider", "onClick isFastClick");
                return;
            }
            if (LoginInit.getInstance(this.f25861c).isBrowseMode()) {
                LoginInit.getInstance(this.f25861c).browsingToLogin(new IBaseResponseCallback() { // from class: sxv
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i, Object obj) {
                        GolfClubsEnterProvider.AnonymousClass4.d(i, obj);
                    }
                }, "");
                return;
            }
            if ("TITLE_SHOW_MORE_CLICK_EVENT".equals(str)) {
                if (GolfDeviceProxy.getInstance().isSupportGolfClub()) {
                    GolfClubsEnterProvider.this.d(this.f25861c);
                } else if (GolfDeviceProxy.getInstance().isDeviceConnected()) {
                    qpx.b(this.f25861c, R.string.IDS_track_golf_not_suggest);
                } else {
                    qpx.b(this.f25861c, R.string.IDS_watchface_wearable_need_connect_to_use);
                }
            }
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, Integer num) {
        super.parseParams(context, map, num);
        map.put("CLICK_EVENT_LISTENER", new AnonymousClass4(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Context context) {
        ddv.b().initH5Pro();
        ddv ddvVarB = ddv.b();
        H5ProLaunchOption.Builder builderShowStatusBar = new H5ProLaunchOption.Builder().addPath("#/clubData").setImmerse().showStatusBar();
        builderShowStatusBar.addCustomizeJsModule(RemoteMessageConst.NOTIFICATION, ddv.b().getCommonJsModule(RemoteMessageConst.NOTIFICATION));
        builderShowStatusBar.addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi"));
        builderShowStatusBar.addCustomizeJsModule("achievement", ddq.d().getCommonJsModule("achievement"));
        SeriesCourseH5Repository.registerService();
        ddvVarB.loadH5ProApp(context, "com.huawei.health.h5.golf", builderShowStatusBar);
        ReleaseLogUtil.d(getLogTag(), "gotoGolfClubInfoH5View success");
    }
}
