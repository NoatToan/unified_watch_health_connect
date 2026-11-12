package com.huawei.ui.homehealth.search.dataprovider;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.marketing.request.GlobalSearchContent;
import com.huawei.health.marketing.request.GlobalSearchResult;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.Workout;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.search.GlobalSearchActivity;
import com.huawei.ui.homehealth.search.dataprovider.CourseSearchProvider;
import defpackage.btq;
import defpackage.btx;
import defpackage.ewx;
import defpackage.fyb;
import defpackage.gvi;
import defpackage.gzx;
import defpackage.iec;
import defpackage.ien;
import defpackage.ifp;
import defpackage.lsy;
import defpackage.njy;
import defpackage.pea;
import defpackage.ped;
import defpackage.tal;
import health.compact.a.LogUtil;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class CourseSearchProvider extends BaseKnitDataProvider<List<GlobalSearchContent>> {
    public static /* synthetic */ void d(int i, Object obj) {
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return true;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public /* synthetic */ void parseParams(Context context, HashMap map, Object obj) {
        d(context, (HashMap<String, Object>) map, (List<GlobalSearchContent>) obj);
    }

    public void d(Context context, HashMap<String, Object> map, List<GlobalSearchContent> list) {
        c(context, map, list);
    }

    private void c(Context context, HashMap<String, Object> map, List<GlobalSearchContent> list) {
        map.clear();
        boolean zD = tal.d(this);
        map.put("TITLE", BaseApplication.getContext().getResources().getString(R.string.IDS_configured_page_attribute_course));
        if (zD) {
            map.put("SHOWMORE", context.getString(R.string.IDS_device_show_more_heartrate_device));
            tal.d(context, "SHOW_MORE_CLICK_EVENT", map, 201);
            map.put("ITEM_LIMIT", 3);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        HashSet hashSet = new HashSet();
        float fC = ien.c();
        for (GlobalSearchContent globalSearchContent : list) {
            if (globalSearchContent != null) {
                LogUtil.b("CourseSearchProvider", "content: ", HiJsonUtil.d(globalSearchContent));
                arrayList4.add(b(globalSearchContent, fC));
                arrayList.add(globalSearchContent.getId());
                arrayList9.add(globalSearchContent.getPicUrl());
                arrayList3.add(globalSearchContent.getCommodityFlag() == 2 ? context.getString(R.string.IDS_vip) : "");
                arrayList7.add(tal.b(globalSearchContent, true));
                d(globalSearchContent, arrayList2, arrayList5);
                tal.c(globalSearchContent, (HashSet<String>) hashSet);
                tal.b(globalSearchContent, arrayList8, arrayList6, hashSet);
            }
            zD = zD;
        }
        boolean z = zD;
        map.put("ITEM_BI_EVENT_MAP", tal.b(201, z ? 200 : 201, GlobalSearchActivity.b(), arrayList, arrayList2));
        map.put("BI_OBSERVER_LABEL", gvi.b(z ? 200 : 201));
        map.put("ITEM_IMAGE", arrayList9);
        map.put("ITEM_TITLE", arrayList2);
        map.put("ITEM_SUBTITLE", arrayList4);
        map.put("ITEM_TAG", arrayList3);
        map.put("HIGHLIGHTED_TEXT", tal.a(hashSet));
        map.put("ITEM_PARENT_TITLE", arrayList5);
        map.put("ITEM_DESCRIPTION", arrayList6);
        map.put("ITEM_PAGE_ATTRIBUTE", arrayList8);
        map.put("ITEM_JOIN_NUMBER", arrayList7);
        d(context, map, list, z);
    }

    private void d(GlobalSearchContent globalSearchContent, List<String> list, List<String> list2) {
        if (globalSearchContent.getInfoType() == 0) {
            list.add(globalSearchContent.getLessonName());
            list2.add("");
            return;
        }
        if (globalSearchContent.getInfoType() == 1 && globalSearchContent.isSubCourse()) {
            list.add(globalSearchContent.getLessonName());
            list2.add(globalSearchContent.getSeriesCourseName());
            return;
        }
        String seriesCourseName = globalSearchContent.getSeriesCourseName();
        if (globalSearchContent.getTotalChapters() > 0) {
            seriesCourseName = seriesCourseName + "·" + gzx.d(R.plurals.IDS_total_chapters, globalSearchContent.getTotalChapters(), Integer.valueOf(globalSearchContent.getTotalChapters()));
        }
        list.add(seriesCourseName);
        list2.add("");
    }

    private String b(GlobalSearchContent globalSearchContent, float f) {
        if (globalSearchContent.getLessonType() == 1) {
            return d(globalSearchContent, f);
        }
        return e(globalSearchContent);
    }

    private String e(GlobalSearchContent globalSearchContent) {
        LogUtil.b("CourseSearchProvider", "getHealthContentSubtitle ", globalSearchContent.getLabels(), " duration: ", Integer.valueOf(globalSearchContent.getDuration()));
        StringBuilder sb = new StringBuilder();
        if (globalSearchContent.getDuration() / 60 > 0) {
            sb.append(gzx.c(btx.c(), R.string.sug_fitness_min, (globalSearchContent.getDuration() / 60) + ""));
        }
        return sb.toString();
    }

    private String d(GlobalSearchContent globalSearchContent, float f) {
        String str;
        if (globalSearchContent.getDifficulty() == 0 && globalSearchContent.getDuration() == 0 && globalSearchContent.getCalorie() == 0) {
            LogUtil.e("CourseSearchProvider", "getCourseSubtitle all info is zero");
            return globalSearchContent.getDescription();
        }
        LogUtil.b("CourseSearchProvider", "getCourseSubtitle difficulty: ", Integer.valueOf(globalSearchContent.getDifficulty()), " duration: ", Integer.valueOf(globalSearchContent.getDuration()), " calorie: ", Integer.valueOf(globalSearchContent.getCalorie()));
        if (globalSearchContent.getInfoType() == 1 && !globalSearchContent.isSubCourse()) {
            str = "";
        } else {
            str = iec.c(globalSearchContent.getDifficulty()) + "  ";
        }
        String strC = gzx.c(btx.c(), com.huawei.health.basefitnessadvice.R.string.sug_fitness_min, ped.m(globalSearchContent.getDuration()));
        StringBuilder sb = new StringBuilder(str);
        if (((int) Math.round(((double) globalSearchContent.getDuration()) / 60.0d)) > 0) {
            sb.append(strC);
        }
        if (((int) ifp.b(globalSearchContent.getCalorie() * f)) > 0) {
            String strD = ifp.d(BaseApplication.getContext(), com.huawei.health.basefitnessadvice.R.string.sug_chart_kcal, ifp.a(ifp.b(globalSearchContent.getCalorie() * f)));
            sb.append("  ");
            sb.append(strD);
        }
        return sb.toString();
    }

    private void d(final Context context, Map<String, Object> map, final List<GlobalSearchContent> list, final boolean z) {
        map.put("CLICK_EVENT_LISTENER", new OnClickSectionListener() { // from class: com.huawei.ui.homehealth.search.dataprovider.CourseSearchProvider.2
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
                GlobalSearchContent globalSearchContent;
                if (njy.e(list, i) || (globalSearchContent = (GlobalSearchContent) list.get(i)) == null) {
                    return;
                }
                String deepLink = globalSearchContent.getDeepLink();
                if (!TextUtils.isEmpty(deepLink)) {
                    CourseSearchProvider.this.d(context, globalSearchContent, z, deepLink);
                } else {
                    CourseSearchProvider.this.d(context, globalSearchContent, z);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Context context, GlobalSearchContent globalSearchContent, boolean z) {
        if (TextUtils.isEmpty(globalSearchContent.getId())) {
            LogUtil.d("CourseSearchProvider", "jumpToDetail fail: course id is null");
            return;
        }
        if (LoginInit.getInstance(context).isBrowseMode()) {
            LogUtil.e("CourseSearchProvider", "jumpToDetail fail: isBrowseMode");
            LoginInit.getInstance(context).browsingToLogin(new IBaseResponseCallback() { // from class: szy
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    CourseSearchProvider.d(i, obj);
                }
            }, "");
            return;
        }
        int lessonType = globalSearchContent.getLessonType();
        if (lessonType == 1) {
            if (globalSearchContent.getInfoType() == 1) {
                if (globalSearchContent.isSubCourse()) {
                    b(globalSearchContent.getId(), context, globalSearchContent, z);
                    return;
                } else {
                    b(context, globalSearchContent, z);
                    return;
                }
            }
            b(globalSearchContent.getId(), context, globalSearchContent, z);
            return;
        }
        if (lessonType != 2) {
            if (lessonType == 3) {
                d(context, globalSearchContent, z, "huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.breath-training?h5pro=true&urlType=4&pName=com.huawei.health&statusBarTextBlack&isImmerse&path=trainPage&pullfrom=globalsearch&trainModeId=" + globalSearchContent.getId());
                return;
            }
            LogUtil.d("CourseSearchProvider", "jumpToDetail lessonType error");
            return;
        }
        if (globalSearchContent.getInfoType() == 0) {
            d(context, globalSearchContent, z, "huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.sleeping-music?h5pro=true&urlType=4&pName=com.huawei.health&path=audioDetail&type=sleepAudio&statusBarTextBlack&isImmerse&pullfrom=globalsearch&id=" + globalSearchContent.getId());
        } else if (globalSearchContent.getInfoType() == 1) {
            a(context, globalSearchContent, z);
        } else {
            LogUtil.d("CourseSearchProvider", "jumpToDetail gotoSleepCourseDetail error");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Context context, GlobalSearchContent globalSearchContent, boolean z, String str) {
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
        if (marketRouterApi == null) {
            LogUtil.d("CourseSearchProvider", "jumpToH5Detail marketRouterApi == null");
            return;
        }
        gvi.d(context, GlobalSearchActivity.b(), 201, globalSearchContent.getId(), globalSearchContent.getLessonName(), z);
        marketRouterApi.router(str);
        LogUtil.b("CourseSearchProvider", "jumpToH5Detail url: ", str);
        btq.e().e("COLLECTION_ADD");
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void b(final Context context, final SectionBean sectionBean) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            lsy.a(new Runnable() { // from class: com.huawei.ui.homehealth.search.dataprovider.CourseSearchProvider.4
                @Override // java.lang.Runnable
                public void run() {
                    CourseSearchProvider.this.b(context, sectionBean);
                }
            });
        } else if (tal.d(this)) {
            tal.e(context, sectionBean, 201);
        } else {
            fyb.c(GlobalSearchActivity.b(), "newlesson", new UiCallback<List<GlobalSearchResult>>() { // from class: com.huawei.ui.homehealth.search.dataprovider.CourseSearchProvider.3
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.b("CourseSearchProvider", "request failed, errorCode: ", Integer.valueOf(i), " errorInfo: ", str);
                    tal.e(context, sectionBean, 201);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<GlobalSearchResult> list) {
                    tal.c(list, sectionBean, context, "newlesson", 201);
                }
            });
        }
    }

    private void b(String str, final Context context, final GlobalSearchContent globalSearchContent, final boolean z) {
        ((CourseApi) Services.d("CoursePlanService", CourseApi.class)).getCourseById(str, null, null, new UiCallback<Workout>() { // from class: com.huawei.ui.homehealth.search.dataprovider.CourseSearchProvider.5
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str2) {
                LogUtil.e("CourseSearchProvider", "getCourseById fail,", str2);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Workout workout) {
                FitWorkout fitWorkoutD = pea.d(workout);
                if (fitWorkoutD == null) {
                    LogUtil.e("CourseSearchProvider", "fitWorkout is null");
                } else {
                    gvi.d(context, GlobalSearchActivity.b(), 201, globalSearchContent.getId(), globalSearchContent.getLessonName(), z);
                    ewx.a(context, fitWorkoutD, "9");
                }
            }
        });
    }

    private void b(Context context, GlobalSearchContent globalSearchContent, boolean z) {
        String seriesCourseId = globalSearchContent.isSubCourse() ? globalSearchContent.getSeriesCourseId() : globalSearchContent.getId();
        if (TextUtils.isEmpty(seriesCourseId)) {
            LogUtil.e("CourseSearchProvider", "jumpToSeriesCourseH5 id is null");
            return;
        }
        String str = "huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.course?h5pro=true&urlType=4&pName=com.huawei.health&statusBarTextBlack&isImmerse&pullfrom=globalsearch&id=" + seriesCourseId;
        if (b(globalSearchContent)) {
            str = "huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.sleeping-music?h5pro=true&urlType=4&pName=com.huawei.health&statusBarTextBlack&showStatusBar&isImmerse&path=seriesCourse&pullfrom=globalsearch&id=" + seriesCourseId + "&type=1";
        }
        if (globalSearchContent.isSubCourse() && !TextUtils.isEmpty(globalSearchContent.getSeriesCourseId())) {
            str = str + "&workoutId=" + globalSearchContent.getId();
        }
        d(context, globalSearchContent, z, str);
    }

    private void a(Context context, GlobalSearchContent globalSearchContent, boolean z) {
        String seriesCourseId = globalSearchContent.isSubCourse() ? globalSearchContent.getSeriesCourseId() : globalSearchContent.getId();
        if (TextUtils.isEmpty(seriesCourseId)) {
            LogUtil.e("CourseSearchProvider", "gotoSleepCourseDetail id is null");
            return;
        }
        if (b(globalSearchContent)) {
            String str = "huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.sleeping-music?h5pro=true&urlType=4&pName=com.huawei.health&statusBarTextBlack&showStatusBar&isImmerse&path=seriesCourse&pullfrom=globalsearch&id=" + seriesCourseId + "&type=2";
            if (globalSearchContent.isSubCourse() && !TextUtils.isEmpty(globalSearchContent.getSeriesCourseId())) {
                str = str + "&workoutId=" + globalSearchContent.getId();
            }
            d(context, globalSearchContent, z, str);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("id", seriesCourseId);
        AppRouter.c("/Main/SeriesCourseListActivity").d(bundle).b(context);
        gvi.d(context, GlobalSearchActivity.b(), 201, globalSearchContent.getId(), globalSearchContent.getLessonName(), z);
    }

    private boolean b(GlobalSearchContent globalSearchContent) {
        return globalSearchContent.getInfoType() == 1 && globalSearchContent.getEnableNewUrl() == 1;
    }
}
