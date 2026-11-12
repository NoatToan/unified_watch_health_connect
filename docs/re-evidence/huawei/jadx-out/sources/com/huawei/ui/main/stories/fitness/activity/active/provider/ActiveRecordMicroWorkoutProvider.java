package com.huawei.ui.main.stories.fitness.activity.active.provider;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.knit.data.MinorProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.R;
import com.huawei.ui.main.stories.fitness.activity.active.provider.ActiveRecordMicroWorkoutProvider;
import defpackage.coq;
import defpackage.fsj;
import defpackage.lsl;
import defpackage.npt;
import defpackage.qre;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class ActiveRecordMicroWorkoutProvider extends MinorProvider<fsj> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SectionBean f26541c;
    private boolean e = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f26539a = false;
    private boolean d = false;
    private int j = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String[] f26540b = {"headAndNeckPartTimes", "shoulderPartTimes", "backPartTimes", "chestPartTimes", "armPartTimes", "waistPartTimes", "abdomenPartTimes", "glutePartTimes", "legPartTimes", "fullBodyTimes"};

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return !this.d && this.f26539a;
    }

    @Override // com.huawei.health.knit.data.MinorProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        LogUtil.a("SCUI_ActiveRecordMicroWorkoutProvider", "enter loadDefaultData");
        super.loadDefaultData(sectionBean);
        boolean zIsMinorAccount = LoginInit.getInstance(BaseApplication.b()).isMinorAccount();
        this.d = zIsMinorAccount;
        if (zIsMinorAccount) {
            return;
        }
        HiHealthNativeApi.a(BaseApplication.b()).aggregateHiHealthData(c(1, 0L, System.currentTimeMillis()), new HiAggregateListener() { // from class: com.huawei.ui.main.stories.fitness.activity.active.provider.ActiveRecordMicroWorkoutProvider.3
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i, int i2) {
                ActiveRecordMicroWorkoutProvider.this.f26539a = !coq.d(list);
                LogUtil.a("SCUI_ActiveRecordMicroWorkoutProvider", "history microWorkout is empty: ", Boolean.valueOf(ActiveRecordMicroWorkoutProvider.this.f26539a));
            }
        });
    }

    private HiAggregateOption c(int i, long j, long j2) {
        int[] iArr = {DicDataTypeUtil.DataType.MICRO_WORKOUT_TOTAL_HEAD_AND_NECK_PART_TIMES.value(), DicDataTypeUtil.DataType.MICRO_WORKOUT_TOTAL_SHOULDER_PART_TIMES.value(), DicDataTypeUtil.DataType.MICRO_WORKOUT_TOTAL_BACK_PART_TIMES.value(), DicDataTypeUtil.DataType.MICRO_WORKOUT_TOTAL_CHEST_PART_TIMES.value(), DicDataTypeUtil.DataType.MICRO_WORKOUT_TOTAL_ARM_PART_TIMES.value(), DicDataTypeUtil.DataType.MICRO_WORKOUT_TOTAL_WAIST_PART_TIMES.value(), DicDataTypeUtil.DataType.MICRO_WORKOUT_TOTAL_ABDOMEN_PART_TIMES.value(), DicDataTypeUtil.DataType.MICRO_WORKOUT_TOTAL_GLUTE_PART_TIMES.value(), DicDataTypeUtil.DataType.MICRO_WORKOUT_TOTAL_LEG_PART_TIMES.value(), DicDataTypeUtil.DataType.MICRO_WORKOUT_TOTAL_FULL_BODY_TIMES.value()};
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setTimeRange(j, j2);
        hiAggregateOption.setType(iArr);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setCount(i);
        hiAggregateOption.setConstantsKey(this.f26540b);
        return hiAggregateOption;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.health.knit.data.MinorProvider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onSetSectionBeanData(SectionBean sectionBean, fsj fsjVar) {
        LogUtil.a("SCUI_ActiveRecordMicroWorkoutProvider", "onSetSectionBeanData");
        this.f26541c = sectionBean;
        this.e = b(fsjVar);
        LogUtil.a("SCUI_ActiveRecordMicroWorkoutProvider", "MICRO_EXERCISE hasHistory:", Boolean.valueOf(this.f26539a));
        if (this.f26539a) {
            HiHealthNativeApi.a(BaseApplication.b()).aggregateHiHealthData(c(0, lsl.r(fsjVar.f()), lsl.c(fsjVar.f())), new HiAggregateListener() { // from class: com.huawei.ui.main.stories.fitness.activity.active.provider.ActiveRecordMicroWorkoutProvider.1
                @Override // com.huawei.hihealth.data.listener.HiAggregateListener
                public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
                }

                @Override // com.huawei.hihealth.data.listener.HiAggregateListener
                public void onResult(List<HiHealthData> list, int i, int i2) {
                    if (list == null) {
                        ActiveRecordMicroWorkoutProvider.this.j = 0;
                        LogUtil.a("SCUI_ActiveRecordMicroWorkoutProvider", "select day microWorkoutTimes result is empty");
                    } else {
                        LogUtil.a("SCUI_ActiveRecordMicroWorkoutProvider", "MICRO_EXERCISE result:", Integer.valueOf(list.size()));
                        for (HiHealthData hiHealthData : list) {
                            if (hiHealthData != null) {
                                int i3 = 0;
                                for (String str : ActiveRecordMicroWorkoutProvider.this.f26540b) {
                                    i3 += hiHealthData.getInt(str);
                                }
                                ActiveRecordMicroWorkoutProvider.this.j = i3;
                            } else {
                                health.compact.a.LogUtil.b("SCUI_ActiveRecordMicroWorkoutProvider", "data is null");
                            }
                        }
                    }
                    ActiveRecordMicroWorkoutProvider.this.f26541c.c(ActiveRecordMicroWorkoutProvider.this.mData);
                }
            });
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void parseParams(final Context context, HashMap map, final fsj fsjVar) {
        int i;
        String strE;
        LogUtil.a("SCUI_ActiveRecordMicroWorkoutProvider", "parseParams");
        if (this.e) {
            i = R.string.IDS_micro_workout_today;
        } else {
            i = R.string.IDS_micro_workout_record;
        }
        map.put("TITLE", qre.f(i));
        if (this.j == 0) {
            strE = "";
        } else {
            int i2 = R.plurals.IDS_micro_workout_times;
            int i3 = this.j;
            strE = qre.e(i2, i3, Integer.valueOf(i3));
        }
        map.put("MICRO_WORKOUT_TIMES", strE);
        map.put("CLICK_EVENT_LISTENER", new View.OnClickListener() { // from class: tud
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActiveRecordMicroWorkoutProvider.e(fsjVar, context, view);
            }
        });
    }

    public static /* synthetic */ void e(fsj fsjVar, Context context, View view) {
        ReleaseLogUtil.d("R_SCUI_ActiveRecordMicroWorkoutProvider", npt.d("startMicroWorkoutDetail date timeMillis:", Long.valueOf(fsjVar.f())));
        AppRouter.e(Uri.parse("huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.sports-record?h5pro=true&isImmerse&urlType=4&path=microSports&timeStamp=" + fsjVar.f())).e(268435456).b(context);
    }

    private boolean b(fsj fsjVar) {
        if (fsjVar == null) {
            LogUtil.j("SCUI_ActiveRecordMicroWorkoutProvider", "ActiveRecordData is null");
            return false;
        }
        return lsl.aa(fsjVar.f());
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        LogUtil.a("SCUI_ActiveRecordMicroWorkoutProvider", "enter onDestroy");
        super.onDestroy();
    }
}
