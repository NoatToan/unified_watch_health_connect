package com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.courseplanservice.api.RecordApi;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceContentBase;
import com.huawei.health.marketing.datatype.SingleDailyMomentContent;
import com.huawei.health.marketing.request.ActivityIdInfo;
import com.huawei.health.marketing.request.ColumnRequestUtils;
import com.huawei.health.marketing.request.InformationInfo;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.model.fitness.FitnessAchieveInfoUseCase;
import com.huawei.health.suggestion.ui.fitness.activity.SportAllCourseActivity;
import com.huawei.health.suggestion.ui.fitness.viewholder.FitnessSessionManager;
import com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessAchieveProvider;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginfitnessadvice.Workout;
import defpackage.dex;
import defpackage.fst;
import defpackage.ibp;
import defpackage.ibq;
import defpackage.iet;
import defpackage.lls;
import defpackage.lmf;
import defpackage.njy;
import defpackage.ntx;
import defpackage.pea;
import defpackage.qli;
import defpackage.qqt;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes31.dex */
public abstract class FitnessAchieveProvider extends FitnessEntranceProvider<ibp> {
    private static final long LOAD_TIME_OUT = 1700;
    private static final String SPACE = " ";
    private static final String TAG = "FitnessAchieveProvider";
    protected ibp mAchieveBean = new ibp();

    protected abstract String getEntranceTitle();

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public /* bridge */ /* synthetic */ void parseParams(Context context, HashMap map, Object obj) {
        parseParams(context, (HashMap<String, Object>) map, (ibp) obj);
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        ibp ibpVar = (ibp) qqt.b(dex.b(String.valueOf(getType())), ibp.class);
        if (ibpVar != null) {
            LogUtil.a(getLogTag(), "use cache ", qqt.e(ibpVar));
            this.mAchieveBean = ibpVar;
        }
        sectionBean.c(this.mAchieveBean);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryToSetDataAgain(SectionBean sectionBean, ibp ibpVar, boolean z) {
        if (z) {
            LogUtil.e(getLogTag(), "data is missing, set data again!");
            sectionBean.c(ibpVar);
        }
    }

    protected List<ibq> getBeans(SectionBean sectionBean) {
        ResourceBriefInfo resourceBriefInfoN = sectionBean.n();
        if (resourceBriefInfoN == null) {
            LogUtil.e(getLogTag(), "loadData failed cause rbi is null!");
            return null;
        }
        ResourceContentBase content = resourceBriefInfoN.getContent();
        if (content == null) {
            LogUtil.e(getLogTag(), "loadData failed cause contentBase is null!");
            return null;
        }
        String content2 = content.getContent();
        if (TextUtils.isEmpty(content2)) {
            LogUtil.e(getLogTag(), "loadData failed cause content is empty!");
            return null;
        }
        ibp ibpVar = (ibp) lls.b(content2, new TypeToken<ibp>() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessAchieveProvider.1
        });
        this.mAchieveBean = ibpVar;
        if (ibpVar == null) {
            LogUtil.j(getLogTag(), "achieveBean is null");
            return null;
        }
        return ibpVar.b();
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(final Context context, final SectionBean sectionBean) {
        final List<ibq> beans = getBeans(sectionBean);
        if (beans == null) {
            return;
        }
        final int size = njy.b(beans) ? beans.size() : 0;
        final boolean[] zArr = {false};
        ThreadPoolManager.c().execute(new Runnable() { // from class: ics
            @Override // java.lang.Runnable
            public final void run() {
                this.d.m1237xf93390d5(size, sectionBean, zArr, beans, context);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$loadData$1$com-huawei-health-suggestion-ui-tabfragments-provider-abstractproviders-FitnessAchieveProvider, reason: not valid java name */
    public /* synthetic */ void m1237xf93390d5(int i, final SectionBean sectionBean, final boolean[] zArr, List list, final Context context) {
        LogUtil.a(getLogTag(), "begin to query banners");
        final CountDownLatch countDownLatch = new CountDownLatch(i + 1);
        RecordApi recordApi = (RecordApi) Services.d("CoursePlanService", RecordApi.class);
        if (recordApi != null) {
            recordApi.acquireDetailFitnessRecords(new ntx.d().b(0L).d(System.currentTimeMillis()).e(getCourseCategory()).a(), new IBaseResponseCallback() { // from class: idb
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i2, Object obj) {
                    this.f37503b.m1236x18b1c8f6(sectionBean, zArr, countDownLatch, i2, obj);
                }
            });
        }
        int iO = sectionBean.o();
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi != null) {
            LogUtil.a(getLogTag(), "get course, size is ", Integer.valueOf(list.size()));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final ibq ibqVar = (ibq) it.next();
                ibqVar.d(iO);
                ibqVar.g();
                String strA = ibqVar.a();
                final String strE = ibqVar.e();
                if (TextUtils.isEmpty(strE)) {
                    countDownLatch.countDown();
                } else {
                    LogUtil.a(getLogTag(), "prepare course");
                    if (TextUtils.equals(strA, SingleDailyMomentContent.COURSE_TYPE)) {
                        courseApi.getCourseById(strE, null, null, new UiCallback<Workout>() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessAchieveProvider.3
                            @Override // com.huawei.basefitnessadvice.callback.UiCallback
                            public void onFailure(int i2, String str) {
                                LogUtil.e(FitnessAchieveProvider.this.getLogTag(), "get banner course failed, errorCode = ", Integer.valueOf(i2), ", errorInfo = ", str);
                                FitnessAchieveProvider fitnessAchieveProvider = FitnessAchieveProvider.this;
                                fitnessAchieveProvider.tryToSetDataAgain(sectionBean, fitnessAchieveProvider.mAchieveBean, zArr[0]);
                                countDownLatch.countDown();
                            }

                            @Override // com.huawei.basefitnessadvice.callback.UiCallback
                            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                            public void onSuccess(Workout workout) {
                                LogUtil.a(FitnessAchieveProvider.this.getLogTag(), "get banner course success");
                                ibqVar.e(pea.d(workout));
                                FitnessAchieveProvider fitnessAchieveProvider = FitnessAchieveProvider.this;
                                fitnessAchieveProvider.tryToSetDataAgain(sectionBean, fitnessAchieveProvider.mAchieveBean, zArr[0]);
                                countDownLatch.countDown();
                            }
                        });
                    } else {
                        if (TextUtils.equals(strA, SingleDailyMomentContent.INFORMATION_TYPE)) {
                            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessAchieveProvider.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    LogUtil.a(FitnessAchieveProvider.this.getLogTag(), "start requestInformationInfo");
                                    List<InformationInfo> listRequestInformationInfo = ColumnRequestUtils.requestInformationInfo(strE);
                                    LogUtil.a(FitnessAchieveProvider.this.getLogTag(), "requestInformationInfo = ", strE);
                                    if (njy.b(listRequestInformationInfo)) {
                                        ibqVar.a(listRequestInformationInfo.get(0));
                                    }
                                    FitnessAchieveProvider fitnessAchieveProvider = FitnessAchieveProvider.this;
                                    fitnessAchieveProvider.tryToSetDataAgain(sectionBean, fitnessAchieveProvider.mAchieveBean, zArr[0]);
                                    LogUtil.a(FitnessAchieveProvider.this.getLogTag(), "end requestInformationInfo");
                                    countDownLatch.countDown();
                                }
                            });
                        } else if (TextUtils.equals(strA, SingleDailyMomentContent.ACTIVITY_TYPE)) {
                            final int i2 = iO;
                            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessAchieveProvider.4
                                @Override // java.lang.Runnable
                                public void run() {
                                    LogUtil.a(FitnessAchieveProvider.this.getLogTag(), "start requestActivityInfo");
                                    List<ActivityIdInfo> listRequestActivityInfo = ColumnRequestUtils.requestActivityInfo(context, i2, Collections.singletonList(strE));
                                    LogUtil.a(FitnessAchieveProvider.this.getLogTag(), "requestActivityInfo = ", strE);
                                    if (njy.b(listRequestActivityInfo)) {
                                        ibqVar.d(listRequestActivityInfo.get(0));
                                    }
                                    FitnessAchieveProvider fitnessAchieveProvider = FitnessAchieveProvider.this;
                                    fitnessAchieveProvider.tryToSetDataAgain(sectionBean, fitnessAchieveProvider.mAchieveBean, zArr[0]);
                                    LogUtil.a(FitnessAchieveProvider.this.getLogTag(), "end requestActivityInfo");
                                    countDownLatch.countDown();
                                }
                            });
                        } else {
                            countDownLatch.countDown();
                        }
                        iO = iO;
                    }
                    iO = iO;
                }
            }
        }
        try {
            if (!countDownLatch.await(LOAD_TIME_OUT, TimeUnit.MILLISECONDS)) {
                LogUtil.e(getLogTag(), "load data time out!");
            }
        } catch (InterruptedException unused) {
            LogUtil.e(getLogTag(), "wait load data interrupted!");
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((ibq) it2.next()).b(context, getEntranceTitle());
        }
        sectionBean.c(this.mAchieveBean);
        zArr[0] = true;
    }

    /* JADX INFO: renamed from: lambda$loadData$0$com-huawei-health-suggestion-ui-tabfragments-provider-abstractproviders-FitnessAchieveProvider, reason: not valid java name */
    public /* synthetic */ void m1236x18b1c8f6(SectionBean sectionBean, boolean[] zArr, CountDownLatch countDownLatch, int i, Object obj) {
        LogUtil.a(getLogTag(), "acquireSummaryFitnessRecordByCategory errorCode:", Integer.valueOf(i));
        if (njy.b(obj, WorkoutRecord.class)) {
            FitnessAchieveInfoUseCase fitnessAchieveInfoUseCaseD = iet.d((List<WorkoutRecord>) obj);
            if (fitnessAchieveInfoUseCaseD == null) {
                fitnessAchieveInfoUseCaseD = new FitnessAchieveInfoUseCase();
            }
            this.mAchieveBean.d(fitnessAchieveInfoUseCaseD);
            tryToSetDataAgain(sectionBean, this.mAchieveBean, zArr[0]);
            countDownLatch.countDown();
        }
    }

    public void parseParams(Context context, HashMap<String, Object> map, ibp ibpVar) {
        map.put("BACKGROUND", ibpVar.d());
        FitnessAchieveInfoUseCase fitnessAchieveInfoUseCaseE = ibpVar.e();
        if (fitnessAchieveInfoUseCaseE != null) {
            map.put("LEFT_TOP_VALUE", Long.valueOf(fitnessAchieveInfoUseCaseE.getSumExerciseTime()));
            Resources resources = context.getResources();
            map.put("LEFT_BOTTOM_TEXT", resources.getString(R.string.sug_total_duration) + Constants.LEFT_BRACKET_ONLY + resources.getString(R.string.IDS_min) + Constants.RIGHT_BRACKET_ONLY);
            map.put("RIGHT_TOP_BUTTON", resources.getString(R.string.IDS_FitnessAdvice_all_courses));
            map.put("RIGHT_COMBINE_TEXT", createCombineText(fitnessAchieveInfoUseCaseE, resources));
            map.put("SECTION16_9CARD_01_BANNER_DATA", createBannerItems(ibpVar));
            setClickListener(context, map);
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessAchieveProvider$5, reason: invalid class name */
    public class AnonymousClass5 extends BaseKnitDataProvider.c {
        final /* synthetic */ Context e;

        public static /* synthetic */ void a(int i, Object obj) {
        }

        AnonymousClass5(Context context) {
            this.e = context;
        }

        @Override // com.huawei.health.knit.data.BaseKnitDataProvider.c, com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(String str) {
            if ("ACCUMULATED_DURATION_CLICK_VIEW".equals(str)) {
                if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
                    LoginInit.getInstance(BaseApplication.getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: icy
                        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                        /* JADX INFO: renamed from: onResponse */
                        public final void a(int i, Object obj) {
                            FitnessAchieveProvider.AnonymousClass5.a(i, obj);
                        }
                    }, "");
                    return;
                }
                FitnessSessionManager.SessionActivityAction sessionActivityActionD = FitnessSessionManager.b().d();
                if (sessionActivityActionD == null) {
                    LogUtil.j(FitnessAchieveProvider.this.getLogTag(), "FitnessSessionManager getSessionForActivityAction null");
                    return;
                } else {
                    sessionActivityActionD.startSportHistoryActivity(this.e, 10001, FitnessAchieveProvider.this.getCourseCategory());
                    return;
                }
            }
            if ("ITEM_BUTTON_TEXT".equals(str)) {
                Intent intent = new Intent(this.e, (Class<?>) SportAllCourseActivity.class);
                intent.putExtra("COURSE_CATEGORY_KEY", FitnessAchieveProvider.this.getCourseCategory());
                intent.putExtra("SKIP_ALL_COURSE_KEY", "FITNESS_COURSE");
                HashMap map = new HashMap(10);
                map.put("click", 1);
                map.put(BleConstants.SPORT_TYPE, Integer.valueOf(FitnessAchieveProvider.this.getType()));
                lmf.d().c(BaseApplication.getContext(), AnalyticsValue.EVENT_CLICK_FITNESS_COURSE_MORE.value(), map, 0);
                intent.addFlags(268435456);
                try {
                    this.e.startActivity(intent);
                    return;
                } catch (ActivityNotFoundException e) {
                    LogUtil.e(FitnessAchieveProvider.this.getLogTag(), "ActivityNotFoundException", e.getMessage());
                    return;
                }
            }
            LogUtil.j(FitnessAchieveProvider.this.getLogTag(), "onClick subView is invalid");
        }
    }

    private void setClickListener(Context context, Map<String, Object> map) {
        map.put("CLICK_EVENT_LISTENER", new AnonymousClass5(context));
    }

    private List<fst> createBannerItems(ibp ibpVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList<ibq> arrayListB = ibpVar.b();
        if (njy.e(arrayListB)) {
            LogUtil.e(getLogTag(), "createBannerItems failed cause bannerBeanList is empty");
            return arrayList;
        }
        for (ibq ibqVar : arrayListB) {
            arrayList.add(new fst(ibqVar.f(), ibqVar.c(), ibqVar.d(), ibqVar.b(), ibqVar.i(), ibqVar.j()));
        }
        return arrayList;
    }

    private SpannableString createCombineText(FitnessAchieveInfoUseCase fitnessAchieveInfoUseCase, Resources resources) {
        int todayTime = fitnessAchieveInfoUseCase.getTodayTime();
        StringBuilder sb = new StringBuilder();
        sb.append(resources.getString(R.string.IDS_hwh_home_group_today));
        sb.append(" ");
        int length = sb.length();
        sb.append(UnitUtil.e(todayTime, 1, 0));
        int length2 = sb.length();
        sb.append(resources.getQuantityString(R.plurals.IDS_hwh_motiontrack_start_track_sport_min, todayTime));
        sb.append(" ");
        sb.append(" ");
        sb.append(" ");
        sb.append(" ");
        sb.append(resources.getString(R.string.IDS_user_profile_achieve_sum));
        sb.append(" ");
        int sumDays = fitnessAchieveInfoUseCase.getSumDays();
        int length3 = sb.length();
        sb.append(UnitUtil.e(sumDays, 1, 0));
        int length4 = sb.length();
        sb.append(resources.getQuantityString(R.plurals.IDS_user_profile_achieve_day, sumDays));
        sb.append(" ");
        int exerciseCount = fitnessAchieveInfoUseCase.getExerciseCount();
        int[] iArr = {length, length3, sb.length()};
        sb.append(UnitUtil.e(exerciseCount, 1, 0));
        int[] iArr2 = {length2, length4, sb.length()};
        sb.append(resources.getQuantityString(R.plurals.IDS_hwh_motiontrack_sport_data_time, exerciseCount));
        SpannableString spannableString = new SpannableString(sb.toString());
        for (int i = 0; i < 3; i++) {
            spannableString.setSpan(new qli(Typeface.DEFAULT_BOLD), iArr[i], iArr2[i], 17);
        }
        return spannableString;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void setGroupId(int i) {
        super.setGroupId(i);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public int getGroupId() {
        return super.getGroupId();
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void setExtra(Bundle bundle) {
        super.setExtra(bundle);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public Bundle getExtra() {
        return super.getExtra();
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider
    public String getLogTag() {
        return TAG;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    protected String getSubViewTitle() {
        return "";
    }
}
