package com.huawei.ui.homehealth.runcard.trackfragments;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.healthcloud.plugintrack.golf.bean.GolfCourseData;
import com.huawei.healthcloud.plugintrack.golf.device.GolfDataCallback;
import com.huawei.healthcloud.plugintrack.golf.device.GolfDeviceProxy;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.interactors.GolfUpdateMapInteractor;
import com.huawei.ui.homehealth.runcard.trackfragments.GolfUpdateReminderProvider;
import defpackage.dex;
import defpackage.lmf;
import defpackage.qrs;
import health.compact.a.CommonUtils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class GolfUpdateReminderProvider extends BaseKnitDataProvider<Integer> {
    private SectionBean d;
    private int e;

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        ReleaseLogUtil.d("Track_Provider_GolfUpdateProvider", "loadDefaultData");
        if (GolfDeviceProxy.getInstance().isDeviceConnected() && GolfDeviceProxy.getInstance().isSupportGolf()) {
            this.e = CommonUtils.e(dex.b("count"), 0);
        } else {
            this.e = 0;
        }
        this.d = sectionBean;
        sectionBean.c(Integer.valueOf(this.e));
        setIsActive(this.e > 0);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void b(Context context, SectionBean sectionBean) {
        if (GolfDeviceProxy.getInstance().isDeviceConnected() && GolfDeviceProxy.getInstance().isSupportGolf()) {
            GolfDeviceProxy.getInstance().getDeviceDownloadedCoursesForNative(new e(this, null));
            LogUtil.a("Track_Provider_GolfUpdateProvider", "loadData(): request course data by device.");
        } else if (this.e != 0) {
            this.e = 0;
            setIsActive(false);
            dex.a("count", String.valueOf(this.e));
            this.d.c(Integer.valueOf(this.e));
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDataLite(Context context) {
        if (GolfDeviceProxy.getInstance().isDeviceConnected() && GolfDeviceProxy.getInstance().isSupportGolf()) {
            GolfDeviceProxy.getInstance().getDeviceDownloadedCoursesForNative(new e(this, null));
            LogUtil.a("Track_Provider_GolfUpdateProvider", "loadDataLite(): request course data by device.");
        } else {
            this.e = 0;
        }
        setIsActive(this.e > 0);
        this.d.c(Integer.valueOf(this.e));
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, Integer num) {
        if (map == null || num == null) {
            LogUtil.j("Track_Provider_GolfUpdateProvider", "setData viewMap or data is null");
            return;
        }
        Resources resources = BaseApplication.getContext().getResources();
        int i = R.plurals.IDS_golf_update_map_reminder;
        int i2 = this.e;
        map.put("LEFT_TEXT", resources.getQuantityString(i, i2, Integer.valueOf(i2)));
        map.put("RIGHT_BUTTON", resources.getString(R.string.IDS_golf_update_all_map));
        a(context, map);
    }

    /* JADX INFO: renamed from: com.huawei.ui.homehealth.runcard.trackfragments.GolfUpdateReminderProvider$2, reason: invalid class name */
    public class AnonymousClass2 implements OnClickSectionListener {
        final /* synthetic */ Context d;

        public static /* synthetic */ void a(int i, Object obj) {
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

        AnonymousClass2(Context context) {
            this.d = context;
        }

        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(String str) {
            if (qrs.c(500)) {
                LogUtil.a("Track_Provider_GolfUpdateProvider", "onClick isFastClick");
                return;
            }
            if (LoginInit.getInstance(this.d).isBrowseMode()) {
                LoginInit.getInstance(this.d).browsingToLogin(new IBaseResponseCallback() { // from class: sxw
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i, Object obj) {
                        GolfUpdateReminderProvider.AnonymousClass2.a(i, obj);
                    }
                }, "");
                return;
            }
            if ("CLICK_VIEW".equals(str)) {
                LogUtil.a("Track_Provider_GolfUpdateProvider", "jump to H5 golf courseMap");
                GolfUpdateMapInteractor.e(this.d, "0");
            } else if ("ITEM_BUTTON_TEXT".equals(str)) {
                LogUtil.a("Track_Provider_GolfUpdateProvider", "jump to H5 golf courseMap, and update all");
                GolfUpdateMapInteractor.e(this.d, "1");
                HashMap map = new HashMap();
                map.put("click", 1);
                map.put("updateMessage", Integer.valueOf(GolfUpdateReminderProvider.this.e));
                map.put("type", 1);
                lmf.d().c(BaseApplication.getContext(), AnalyticsValue.GOLF_COURSE_MAP_CLICK_EVENT.value(), map, 0);
            }
        }
    }

    private void a(Context context, HashMap<String, Object> map) {
        map.put("CLICK_EVENT_LISTENER", new AnonymousClass2(context));
    }

    public class e implements GolfDataCallback {
        private e() {
        }

        /* synthetic */ e(GolfUpdateReminderProvider golfUpdateReminderProvider, AnonymousClass2 anonymousClass2) {
            this();
        }

        @Override // com.huawei.healthcloud.plugintrack.golf.device.GolfDataCallback
        public void onReceived(final List<GolfCourseData> list) {
            LogUtil.a("Track_Provider_GolfUpdateProvider", "CourseDataUpdateListener: onReceived(), course data list size is ", Integer.valueOf(list.size()));
            new Thread(new Runnable() { // from class: sxu
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.d(list);
                }
            }).start();
        }

        public /* synthetic */ void d(List list) {
            GolfUpdateReminderProvider.this.e = GolfUpdateMapInteractor.b(list, GolfUpdateMapInteractor.e((List<GolfCourseData>) list)).size();
            if (CommonUtils.e(dex.b("count"), 0) != GolfUpdateReminderProvider.this.e) {
                dex.a("count", String.valueOf(GolfUpdateReminderProvider.this.e));
                LogUtil.a("Track_Provider_GolfUpdateProvider", "CourseDataUpdateListener: mUpdateCount = ", Integer.valueOf(GolfUpdateReminderProvider.this.e));
                GolfUpdateReminderProvider golfUpdateReminderProvider = GolfUpdateReminderProvider.this;
                golfUpdateReminderProvider.setIsActive(golfUpdateReminderProvider.e > 0);
                GolfUpdateReminderProvider.this.d.c(Integer.valueOf(GolfUpdateReminderProvider.this.e));
                return;
            }
            ReleaseLogUtil.d("Track_Provider_GolfUpdateProvider", "same data");
        }
    }
}
