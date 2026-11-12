package com.huawei.health.suggestion.ui.tabfragments.provider;

import android.content.Context;
import android.view.View;
import com.google.gson.reflect.TypeToken;
import com.huawei.android.airsharing.api.PlayInfo;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider;
import com.huawei.health.suggestion.util.ClickEventUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.Workout;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.btx;
import defpackage.dkf;
import defpackage.fsz;
import defpackage.gzx;
import defpackage.hjs;
import defpackage.ibn;
import defpackage.ibu;
import defpackage.iec;
import defpackage.iet;
import defpackage.njy;
import defpackage.pea;
import defpackage.ped;
import defpackage.qrs;
import health.compact.a.CommonUtils;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public class RunMyCourseProvider extends FitnessEntranceProvider<List<ibu>> {
    private int e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f10116b = true;

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getCourseCategory() {
        return 3;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getPageType() {
        return 4;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getType() {
        return 0;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public boolean isCustomActive(Context context) {
        return this.f10116b;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        boolean z = false;
        this.e = 0;
        super.loadDefaultData(sectionBean);
        if (this.mData != 0 && ((List) this.mData).size() != 0) {
            z = true;
        }
        this.f10116b = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public List<ibu> getDefaultData() {
        List<ibu> cacheData = getCacheData(new TypeToken<List<ibu>>() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.RunMyCourseProvider.1
        }.getType());
        if (njy.e(cacheData)) {
            ReleaseLogUtil.d("Track_Provider_Track_RunMyCourseProvider", " getDefaultData is empty.");
            return cacheData;
        }
        ReleaseLogUtil.c("Track_Provider_Track_RunMyCourseProvider", " getDefaultData size is:", Integer.valueOf(cacheData.size()));
        return cacheData;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(Context context, SectionBean sectionBean) {
        a(1);
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, List<ibu> list) {
        b(map, list);
    }

    private void b(HashMap<String, Object> map, List<ibu> list) {
        map.put("TITLE", getSubViewTitle());
        int iMin = Math.min(list.size(), 6);
        List<ibu> listSubList = list.subList(0, iMin);
        if (list.size() > 0) {
            e(listSubList, map, iMin);
        }
        a(map, listSubList);
    }

    private void a(Map<String, Object> map, final List<ibu> list) {
        map.put("CLICK_EVENT_LISTENER", new OnClickSectionListener() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.RunMyCourseProvider.4
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
                if ("MORE_CLICK_EVENT".equals(str)) {
                    if (qrs.r()) {
                        LogUtil.a("Track_Provider_Track_RunMyCourseProvider", "mChooseButton onClick, isFastClick");
                        return;
                    }
                    HashMap map2 = new HashMap();
                    map2.put("myCourseType", Integer.valueOf(RunMyCourseProvider.this.e));
                    ClickEventUtils.c(RunMyCourseProvider.this.d(), map2);
                }
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i) {
                if (njy.e(list, i)) {
                    LogUtil.e("Track_Provider_Track_RunMyCourseProvider", "list is empty");
                    return;
                }
                ibu ibuVar = (ibu) list.get(i);
                if (ibuVar == null) {
                    LogUtil.e("Track_Provider_Track_RunMyCourseProvider", "fitWorkout is null");
                } else {
                    ClickEventUtils.c(ClickEventUtils.ClickEventType.RUN_COURSE, dkf.d(4, RunMyCourseProvider.this.a(), RunMyCourseProvider.this.getCourseCategory(), ibuVar.c()));
                }
            }
        });
    }

    private void e(List<ibu> list, Map<String, Object> map, int i) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        int i2 = 0;
        for (ibu ibuVar : list) {
            if (i2 >= i) {
                break;
            }
            if (ibuVar.e() == 1) {
                arrayList.add(Integer.valueOf(c(ibuVar)));
                arrayList2.add(ibuVar.i());
                arrayList3.add(hjs.a(ibuVar.g()));
                arrayList4.add("");
                arrayList5.add(iet.b(ibuVar.h()));
                arrayList6.add(new fsz());
            } else {
                arrayList.add(ibuVar.f());
                arrayList2.add(ibuVar.i());
                arrayList3.add(iec.c(ibuVar.b()));
                arrayList4.add(gzx.c(btx.c(), R.string.sug_fitness_min, ped.m(ibuVar.a())));
                arrayList5.add(iet.b(ibuVar.h()));
                arrayList6.add(getTagData(ibuVar.d()));
            }
            i2++;
        }
        map.put("IMAGE", arrayList);
        map.put("NAME", arrayList2);
        map.put(PlayInfo.KEY_DURATION, arrayList4);
        map.put("DIFFICULTY", arrayList3);
        map.put("INTERVALS", arrayList5);
        map.put("ITEM_TAG", arrayList6);
    }

    private int c(ibu ibuVar) {
        long jI = CommonUtils.i(ibuVar.j()) % 3;
        if (jI == 0) {
            return R.drawable.pic_custom_yellow_small;
        }
        if (jI == 1) {
            return R.drawable.pic_custom_red_small;
        }
        return R.drawable.pic_custom_blue_small;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider
    public String getLogTag() {
        return "Track_Provider_Track_RunMyCourseProvider";
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public String getSubViewTitle() {
        return BaseApplication.getContext().getResources().getString(R.string.IDS_fitness_advice_run_my_running_course);
    }

    protected ClickEventUtils.ClickEventType d() {
        return ClickEventUtils.ClickEventType.MY_ALL_RUN_COURSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i) {
        String str;
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.e("Track_Provider_Track_RunMyCourseProvider", "getCourseData courseApi is null.");
            return;
        }
        if (i == 2) {
            this.e = 1;
        } else {
            this.e = 0;
        }
        if (getCourseCategory() != 257) {
            str = "RUNNING_COURSE";
        } else {
            str = "WALKING_COURSE";
        }
        String str2 = str;
        LogUtil.a("Track_Provider_Track_RunMyCourseProvider", "getCourseCategory:", Integer.valueOf(getCourseCategory()), " ", str2);
        courseApi.getUserCourseList(0, 6, i, str2, new UiCallback<List<Workout>>() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.RunMyCourseProvider.3
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i2, String str3) {
                LogUtil.j("Track_Provider_Track_RunMyCourseProvider", "opType = ", Integer.valueOf(i), ", errorCode = ", Integer.valueOf(i2), ", errorInfo = ", str3);
                if (i != 2) {
                    RunMyCourseProvider.this.a(2);
                }
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(List<Workout> list) {
                if (RunMyCourseProvider.this.d(i, list)) {
                    LogUtil.e("Track_Provider_Track_RunMyCourseProvider", Integer.valueOf(i), ", workouts is empty.");
                    return;
                }
                List<FitWorkout> listB = pea.b(list);
                if (!RunMyCourseProvider.this.d(i, listB)) {
                    List listC = RunMyCourseProvider.this.c(i, listB);
                    if (RunMyCourseProvider.this.d(i, listC)) {
                        LogUtil.e("Track_Provider_Track_RunMyCourseProvider", Integer.valueOf(i), ", workoutList is empty.");
                        return;
                    }
                    ArrayList arrayList = new ArrayList(listC.size());
                    Iterator it = listC.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new ibu.c().c((FitWorkout) it.next()).b());
                    }
                    RunMyCourseProvider.this.f10116b = arrayList.size() != 0;
                    RunMyCourseProvider.this.checkAndUpdateUi(arrayList);
                    return;
                }
                LogUtil.e("Track_Provider_Track_RunMyCourseProvider", Integer.valueOf(i), ", workouts is empty.");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(int i, Collection<?> collection) {
        if (!njy.e(collection)) {
            return false;
        }
        if (i == 1) {
            a(2);
        } else {
            checkAndUpdateUi(null);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<FitWorkout> c(int i, List<FitWorkout> list) {
        ArrayList arrayList = new ArrayList();
        if (njy.e(list)) {
            LogUtil.e("Track_Provider_Track_RunMyCourseProvider", "dealWithWorkouts opType = ", Integer.valueOf(i), "workouts is null.");
            return arrayList;
        }
        return ibn.c(new ArrayList(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a() {
        if (this.e == 0) {
            return "2";
        }
        return "1";
    }
}
