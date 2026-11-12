package com.huawei.ui.homehealth.runcard.trackfragments;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import com.google.gson.JsonSyntaxException;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.healthcloud.plugintrack.golf.Utils;
import com.huawei.healthcloud.plugintrack.golf.cloud.CloudManager;
import com.huawei.healthcloud.plugintrack.golf.cloud.requests.GolfCourseBriefInfosReq;
import com.huawei.healthcloud.plugintrack.golf.cloud.response.CourseBriefInfo;
import com.huawei.healthcloud.plugintrack.golf.cloud.response.GolfCourseBrieInfosRsp;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.homehealth.R;
import defpackage.ddq;
import defpackage.ddv;
import defpackage.dex;
import defpackage.lmf;
import defpackage.njy;
import defpackage.peh;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class GolfMyTrainingCourseProvider extends BaseKnitDataProvider<List<HiHealthData>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SectionBean f25863b;
    private List<HiHealthData> e = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f25864c = false;
    private b d = new b(this);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f25862a = new a(this);

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return this.f25864c;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        List<HiHealthData> listC = peh.c(dex.b("Track_Provider_Track_GolfMyTrainingProvider"), HiHealthData[].class);
        this.e = listC;
        LogUtil.a("Track_Provider_Track_GolfMyTrainingProvider", "loadDefaultData() cachedGolfTrainingSize ", Integer.valueOf(listC.size()));
        if (njy.b(this.e)) {
            this.f25864c = true;
        }
        sectionBean.c(this.e);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void b(Context context, SectionBean sectionBean) {
        if (!CommonUtil.ab(context)) {
            this.f25864c = false;
            ReleaseLogUtil.a("Track_Provider_Track_GolfMyTrainingProvider", "Network is not connected");
            return;
        }
        this.f25863b = sectionBean;
        LogUtil.a("Track_Provider_Track_GolfMyTrainingProvider", "requestTrackMyTraining Record");
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(0L, System.currentTimeMillis());
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setType(new int[]{286});
        HiHealthManager.d(context).fetchSequenceDataBySportType(hiDataReadOption, this.d);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, List<HiHealthData> list) {
        LogUtil.a("Track_Provider_Track_GolfMyTrainingProvider", "parseParams");
        e(map, list);
    }

    private void e(HashMap<String, Object> map, List<HiHealthData> list) {
        if (njy.e(list)) {
            LogUtil.a("Track_Provider_Track_GolfMyTrainingProvider", "dataList is empty");
            this.f25864c = false;
            return;
        }
        List listC = peh.c(dex.b("Track_Provider_Track_GolfMyTrainingProvidername"), String[].class);
        if (njy.e(listC)) {
            LogUtil.a("Track_Provider_Track_GolfMyTrainingProvider", "courseNameList is empty");
            this.f25864c = false;
            return;
        }
        map.put("NO_MORE_DATA", true);
        map.put("IS_LOAD_DEFAULT_VIEW", false);
        map.put("TITLE", BaseApplication.getContext().getResources().getString(R.string.IDS_golf_my_training_course));
        map.put("NAME", listC);
        map.put("INTERVALS", peh.c(dex.b("Track_Provider_Track_GolfMyTrainingProvidertime"), String[].class));
        ArrayList arrayList = new ArrayList();
        arrayList.add(56);
        arrayList.add(100);
        map.put("IMAGE_SIZE", arrayList);
        c(map, peh.c(dex.b("Track_Provider_Track_GolfMyTrainingProvider"), HiTrackMetaData[].class));
    }

    private void d(List<HiHealthData> list, List<String> list2, List<String> list3, List<HiTrackMetaData> list4) {
        LogUtil.a("Track_Provider_Track_GolfMyTrainingProvider", "setCourseData");
        ArrayList arrayList = new ArrayList();
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData == null) {
                LogUtil.a("Track_Provider_Track_GolfMyTrainingProvider", "hiHealthData is null");
            } else {
                try {
                    HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(hiHealthData.getMetaData(), HiTrackMetaData.class);
                    LogUtil.a("Track_Provider_Track_GolfMyTrainingProvider", ": trackMetaData=" + hiTrackMetaData);
                    if (hiTrackMetaData == null) {
                        LogUtil.j("Track_Provider_Track_GolfMyTrainingProvider", ": trackMetaData is null");
                        return;
                    }
                    String str = hiTrackMetaData.getExtendTrackMap().get("courseId");
                    if (arrayList.contains(str)) {
                        continue;
                    } else {
                        String strC = c(str);
                        if (TextUtils.isEmpty(strC)) {
                            continue;
                        } else {
                            arrayList.add(str);
                            list2.add(strC);
                            e(hiHealthData, list3);
                            list4.add(hiTrackMetaData);
                            if (arrayList.size() == 2) {
                                LogUtil.a("Track_Provider_Track_GolfMyTrainingProvider", "trainedCourse size=" + arrayList.size());
                                return;
                            }
                        }
                    }
                } catch (JsonSyntaxException unused) {
                    LogUtil.j("Track_Provider_Track_GolfMyTrainingProvider", "trackMetaData is jsonSyntaxException");
                }
            }
        }
    }

    private void c(Map<String, Object> map, final List<HiTrackMetaData> list) {
        map.put("CLICK_EVENT_LISTENER", new OnClickSectionListener() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.GolfMyTrainingCourseProvider.1
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
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i) {
                if (njy.e(list)) {
                    LogUtil.e("Track_Provider_Track_GolfMyTrainingProvider", "list is empty");
                    return;
                }
                if (njy.e(list, i)) {
                    LogUtil.j("Track_Provider_Track_GolfMyTrainingProvider", "position isOutOfBounds", Integer.valueOf(i));
                    return;
                }
                HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) list.get(i);
                if (hiTrackMetaData == null) {
                    LogUtil.j("Track_Provider_Track_GolfMyTrainingProvider", "trackMetaData is null");
                    return;
                }
                GolfMyTrainingCourseProvider.this.e(BaseApplication.getContext(), hiTrackMetaData.getExtendTrackMap().get("courseId"));
                HashMap map2 = new HashMap();
                map2.put("click", 1);
                lmf.d().c(BaseApplication.getContext(), AnalyticsValue.GOLF_TRAINED_COURSE_CLICK_EVENT.value(), map2, 0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context, String str) {
        if (context == null) {
            LogUtil.j("Track_Provider_Track_GolfMyTrainingProvider", "jumpToGolfTrainingCourse(): context is null");
            return;
        }
        LogUtil.a("Track_Provider_Track_GolfMyTrainingProvider", "jumpToGolfTrainingCourse(): courseId is ", str);
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addCustomizeJsModule(RemoteMessageConst.NOTIFICATION, ddv.b().getCommonJsModule(RemoteMessageConst.NOTIFICATION));
        builder.addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi"));
        builder.addCustomizeJsModule("achievement", ddq.d().getCommonJsModule("achievement"));
        builder.addPath("#/details?courseId=" + str + "&downLoad=2");
        builder.setImmerse();
        builder.showStatusBar();
        ddv.b().loadH5ProApp(context, "com.huawei.health.h5.golf", builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<HiHealthData> list) {
        if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            this.e = new ArrayList();
        } else if (list != null) {
            this.e = list;
        }
        SectionBean sectionBean = this.f25863b;
        if (sectionBean != null) {
            sectionBean.c(this.e);
        }
    }

    static class a implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<GolfMyTrainingCourseProvider> f25867a;

        a(GolfMyTrainingCourseProvider golfMyTrainingCourseProvider) {
            this.f25867a = new WeakReference<>(golfMyTrainingCourseProvider);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            GolfMyTrainingCourseProvider golfMyTrainingCourseProvider = this.f25867a.get();
            if (golfMyTrainingCourseProvider == null) {
                LogUtil.a("Track_Provider_Track_GolfMyTrainingProvider", "provider is null, onResponse is ", obj);
                return;
            }
            List arrayList = new ArrayList();
            if (!njy.b(obj, HiHealthData.class)) {
                LogUtil.j("Track_Provider_Track_GolfMyTrainingProvider", "class type is wrong");
            } else {
                List list = (List) obj;
                if (list.size() > 0) {
                    LogUtil.a("Track_Provider_Track_GolfMyTrainingProvider", "data size is ", Integer.valueOf(list.size()));
                    golfMyTrainingCourseProvider.f25864c = true;
                    arrayList = list;
                } else {
                    LogUtil.j("Track_Provider_Track_GolfMyTrainingProvider", "data size =", Integer.valueOf(list.size()));
                }
            }
            if (golfMyTrainingCourseProvider.c((List<HiHealthData>) arrayList)) {
                golfMyTrainingCourseProvider.e(arrayList);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(List<HiHealthData> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        d(list, arrayList, arrayList2, arrayList3);
        if (d("Track_Provider_Track_GolfMyTrainingProvidername", peh.c(arrayList)) && d("Track_Provider_Track_GolfMyTrainingProvidertime", peh.c(arrayList2)) && d("Track_Provider_Track_GolfMyTrainingProvider", peh.c(arrayList3))) {
            LogUtil.j("Track_Provider_Track_GolfMyTrainingProvider", "same data");
            return false;
        }
        LogUtil.a("Track_Provider_Track_GolfMyTrainingProvider", "refresh cache and ui");
        dex.a("Track_Provider_Track_GolfMyTrainingProvider", peh.c(arrayList3));
        dex.a("Track_Provider_Track_GolfMyTrainingProvidertime", peh.c(arrayList));
        dex.a("Track_Provider_Track_GolfMyTrainingProvidername", peh.c(arrayList2));
        return true;
    }

    private boolean d(String str, String str2) {
        return dex.b(str).equals(str2);
    }

    private String c(String str) {
        GolfCourseBriefInfosReq.Builder builder = new GolfCourseBriefInfosReq.Builder();
        builder.addCourseId(Long.valueOf(str)).language(Utils.getLanguage());
        GolfCourseBrieInfosRsp golfCourseBrieInfos = CloudManager.getInstance().getGolfCourseBrieInfos(builder.build());
        if (golfCourseBrieInfos == null) {
            LogUtil.j("Track_Provider_Track_GolfMyTrainingProvider", "setCourseName response == null");
            return null;
        }
        List<CourseBriefInfo> courseBriefInfo = golfCourseBrieInfos.getCourseBriefInfo();
        if (courseBriefInfo == null) {
            LogUtil.j("Track_Provider_Track_GolfMyTrainingProvider", "setCourseName infos == null");
            return null;
        }
        LogUtil.a("Track_Provider_Track_GolfMyTrainingProvider", "setCourseImageAndName: courseId=", str, "golfCourseDetail response=", courseBriefInfo);
        if (!courseBriefInfo.isEmpty()) {
            return courseBriefInfo.get(0).getName();
        }
        return "";
    }

    private static void e(HiHealthData hiHealthData, List<String> list) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(hiHealthData.getStartTime());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(System.currentTimeMillis());
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        long timeInMillis = (calendar2.getTimeInMillis() - calendar.getTimeInMillis()) / 86400000;
        Resources resources = BaseApplication.getContext().getResources();
        if (timeInMillis == 0) {
            list.add(resources.getString(R.string.IDS_golf_training_today));
        } else {
            list.add(resources.getQuantityString(R.plurals.IDS_golf_training_interval, (int) timeInMillis, Long.valueOf(timeInMillis)));
        }
    }

    static class b implements HiDataReadResultListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<GolfMyTrainingCourseProvider> f25868c;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        b(GolfMyTrainingCourseProvider golfMyTrainingCourseProvider) {
            this.f25868c = new WeakReference<>(golfMyTrainingCourseProvider);
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            GolfMyTrainingCourseProvider golfMyTrainingCourseProvider = this.f25868c.get();
            if (golfMyTrainingCourseProvider != null) {
                a aVar = golfMyTrainingCourseProvider.f25862a;
                if (!(obj instanceof SparseArray)) {
                    LogUtil.j("Track_Provider_Track_GolfMyTrainingProvider", "fetchSequenceDataBySportType return data is error.");
                    aVar.a(i, null);
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray.size() <= 0) {
                    LogUtil.j("Track_Provider_Track_GolfMyTrainingProvider", "fetchSequenceDataBySportType return map is empty.");
                    aVar.a(i, null);
                    return;
                } else {
                    Object obj2 = sparseArray.get(i);
                    LogUtil.a("Track_Provider_Track_GolfMyTrainingProvider", "obj size is ", obj2.toString());
                    aVar.a(0, obj2);
                    return;
                }
            }
            LogUtil.j("Track_Provider_Track_GolfMyTrainingProvider", "onResult: provider is null");
        }
    }
}
