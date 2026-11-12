package com.huawei.pluginachievement.manager.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.impl.AchieveObserver;
import com.huawei.pluginachievement.impl.PersonalDataCallback;
import com.huawei.pluginachievement.manager.model.AchieveInfo;
import com.huawei.pluginachievement.manager.model.AchieveUserLevelInfo;
import com.huawei.pluginachievement.manager.model.PersonalData;
import com.huawei.pluginachievement.manager.model.RecentWeekRecord;
import com.huawei.pluginachievement.manager.model.ResultCode;
import com.huawei.pluginachievement.manager.model.SingleDayRecord;
import com.huawei.pluginachievement.manager.model.TotalRecord;
import com.huawei.pluginachievement.manager.model.UserAchieveWrapper;
import defpackage.osa;
import defpackage.osf;
import defpackage.oth;
import defpackage.otl;
import defpackage.paq;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class AchievePersonalDataObserver implements AchieveObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PersonalDataCallback f22029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PersonalData f22030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<Integer, String> f22031c = new HashMap(8);
    private Context d;
    private otl e;

    public AchievePersonalDataObserver(Context context) {
        this.d = context;
        e();
        d(this.f22031c, context);
    }

    public void c(PersonalDataCallback personalDataCallback) {
        this.f22029a = personalDataCallback;
    }

    private boolean e(String str) {
        return !"0".equals(str);
    }

    @Override // com.huawei.pluginachievement.impl.AchieveObserver
    public void onDataChanged(int i, UserAchieveWrapper userAchieveWrapper) {
        LogUtil.a("PLGACHIEVE_AchievePersonalDataObserver", "AchievePersonalDataObserver|onDataChanged  error= ", Integer.valueOf(i));
        if (i == -1) {
            e(this);
            return;
        }
        if (userAchieveWrapper == null) {
            return;
        }
        int contentType = userAchieveWrapper.getContentType();
        LogUtil.a("PLGACHIEVE_AchievePersonalDataObserver", "AchievePersonalDataObserver|onDataChanged contentType = ", Integer.valueOf(contentType));
        if (contentType == 0) {
            d(userAchieveWrapper);
        }
    }

    private void d(UserAchieveWrapper userAchieveWrapper) {
        LogUtil.a("PLGACHIEVE_AchievePersonalDataObserver", "processPersonalInfo enter");
        if (userAchieveWrapper == null) {
            e(this);
            return;
        }
        if (e(userAchieveWrapper.getResultCode())) {
            if (ResultCode.CODE_NEVER_SYNC.equals(userAchieveWrapper.getResultCode())) {
                osa.b(this.d, "NEWBIE", "done");
            }
            PersonalData personalDataC = c();
            this.f22030b = personalDataC;
            PersonalDataCallback personalDataCallback = this.f22029a;
            if (personalDataCallback != null) {
                personalDataCallback.onPersonalDataChange(personalDataC);
                this.f22029a = null;
            }
            e(this);
            return;
        }
        SingleDayRecord singleDayRecordAcquireSingleDayRecord = userAchieveWrapper.acquireSingleDayRecord();
        TotalRecord totalRecordAcquireTotalRecord = userAchieveWrapper.acquireTotalRecord();
        if (TextUtils.isEmpty(osa.e(this.d, "NEWBIE")) && totalRecordAcquireTotalRecord != null) {
            if (totalRecordAcquireTotalRecord.getDays() <= 10) {
                LogUtil.d("AchievePersonalDataObserver", " set the new user");
                osa.b(this.d, "NEWBIE", "done");
            } else {
                LogUtil.d("AchievePersonalDataObserver", " set the old user");
                osa.b(this.d, "NEWBIE", "doing");
            }
        }
        PersonalData personalDataD = d(singleDayRecordAcquireSingleDayRecord, totalRecordAcquireTotalRecord, userAchieveWrapper.getAchieveInfo());
        this.f22030b = personalDataD;
        PersonalDataCallback personalDataCallback2 = this.f22029a;
        if (personalDataCallback2 != null) {
            personalDataCallback2.onPersonalDataChange(personalDataD);
            this.f22029a = null;
        }
        e(this);
    }

    private PersonalData c() {
        HashMap map = new HashMap(2);
        osf osfVarB = this.e.b(14, map);
        int iE = 1;
        osf osfVarB2 = this.e.b(1, map);
        osf osfVarB3 = this.e.b(5, map);
        SingleDayRecord singleDayRecord = (SingleDayRecord) this.e.b(2, map);
        boolean z = osfVarB3 instanceof AchieveInfo;
        String strAcquireMedals = z ? ((AchieveInfo) osfVarB3).acquireMedals() : "";
        if (osfVarB instanceof AchieveUserLevelInfo) {
            iE = ((AchieveUserLevelInfo) osfVarB).acquireUserLevel();
        } else if (z) {
            iE = paq.e(((AchieveInfo) osfVarB3).getUserReachStandardDays());
        }
        int userPoint = z ? ((AchieveInfo) osfVarB3).getUserPoint() : 0;
        boolean z2 = osfVarB2 instanceof TotalRecord;
        int days = z2 ? ((TotalRecord) osfVarB2).getDays() : 0;
        return PersonalData.builder().withMedals(strAcquireMedals).withPersonalLevel(iE).withPersonalLevelDesc(this.f22031c.get(Integer.valueOf(iE))).withSumKakaNum(userPoint).withSumDays(days).withSumSteps(z2 ? ((TotalRecord) osfVarB2).getSteps() : 0.0d).withBestDaySteps(singleDayRecord != null ? singleDayRecord.getSteps() : 0).build();
    }

    private PersonalData d(SingleDayRecord singleDayRecord, TotalRecord totalRecord, AchieveInfo achieveInfo) {
        int iAcquireUserLevel;
        String str;
        HashMap map = new HashMap(2);
        osf osfVarB = this.e.b(14, map);
        int iE = 1;
        osf osfVarB2 = this.e.b(1, map);
        osf osfVarB3 = this.e.b(5, map);
        osf osfVarB4 = this.e.b(2, map);
        HashMap map2 = new HashMap(2);
        map2.put("reportNo", osa.c(this.d, "_weekReportNo", "0"));
        osf osfVarB5 = this.e.b(3, map2);
        String strAcquireMedals = achieveInfo == null ? "" : achieveInfo.acquireMedals();
        boolean z = osfVarB3 instanceof AchieveInfo;
        String strAcquireMedals2 = z ? ((AchieveInfo) osfVarB3).acquireMedals() : "";
        if (osfVarB instanceof AchieveUserLevelInfo) {
            iAcquireUserLevel = ((AchieveUserLevelInfo) osfVarB).acquireUserLevel();
        } else {
            if (z) {
                iE = paq.e(achieveInfo != null ? achieveInfo.getUserReachStandardDays() : 0.0d);
            }
            iAcquireUserLevel = iE;
        }
        int userPoint = z ? ((AchieveInfo) osfVarB3).getUserPoint() : 0;
        boolean z2 = osfVarB2 instanceof TotalRecord;
        int days = z2 ? ((TotalRecord) osfVarB2).getDays() : 0;
        double steps = z2 ? ((TotalRecord) osfVarB2).getSteps() : 0.0d;
        int steps2 = osfVarB4 instanceof SingleDayRecord ? ((SingleDayRecord) osfVarB4).getSteps() : 0;
        String strE = osa.e(this.d, "_uploadMedal");
        PersonalData.Builder builder = PersonalData.builder();
        if (achieveInfo == null || !TextUtils.isEmpty(strE)) {
            strAcquireMedals = strAcquireMedals2;
        }
        PersonalData.Builder builderWithStepRanking = builder.withMedals(strAcquireMedals).withPersonalLevel(iAcquireUserLevel).withStepRanking(osfVarB5 instanceof RecentWeekRecord ? ((RecentWeekRecord) osfVarB5).acquireStepsRanking() : 0.0d);
        if (achieveInfo != null) {
            str = this.f22031c.get(Integer.valueOf(achieveInfo.getUserLevel()));
        } else {
            str = this.f22031c.get(Integer.valueOf(iAcquireUserLevel));
        }
        PersonalData.Builder builderWithPersonalLevelDesc = builderWithStepRanking.withPersonalLevelDesc(str);
        if (achieveInfo != null) {
            userPoint = achieveInfo.getUserPoint();
        }
        PersonalData.Builder builderWithSumKakaNum = builderWithPersonalLevelDesc.withSumKakaNum(userPoint);
        if (totalRecord != null) {
            days = totalRecord.getDays();
        }
        PersonalData.Builder builderWithSumDays = builderWithSumKakaNum.withSumDays(days);
        if (totalRecord != null) {
            steps = totalRecord.getSteps();
        }
        PersonalData.Builder builderWithSumSteps = builderWithSumDays.withSumSteps(steps);
        if (singleDayRecord != null) {
            steps2 = singleDayRecord.getSteps();
        }
        return builderWithSumSteps.withBestDaySteps(steps2).build();
    }

    public void e(AchievePersonalDataObserver achievePersonalDataObserver) {
        if (achievePersonalDataObserver == null) {
            LogUtil.a("PLGACHIEVE_AchievePersonalDataObserver", "unregisterPersonalDataObserver object maybe not create.");
        } else {
            oth.b(this.d).d(achievePersonalDataObserver);
        }
    }

    private void e() {
        if (this.e == null) {
            this.e = otl.b(BaseApplication.getContext());
        }
    }

    private void d(Map<Integer, String> map, Context context) {
        if (map == null) {
            return;
        }
        map.put(1, context.getResources().getString(R.string.IDS_plugin_achievement_level_1_title_textview));
        map.put(2, context.getResources().getString(R.string.IDS_plugin_achievement_level_2_title_textview));
        map.put(3, context.getResources().getString(R.string.IDS_plugin_achievement_level_3_title_textview));
        map.put(4, context.getResources().getString(R.string.IDS_plugin_achievement_level_4_title_textview));
        map.put(5, context.getResources().getString(R.string.IDS_plugin_achievement_level_5_title_textview));
    }

    public static void e(Context context, String str, String str2) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("nps_config", 0).edit();
        LogUtil.a("AchievePersonalDataObserver", "setUserType: ", str2);
        editorEdit.putString(str, str2).apply();
    }

    public static void d(int i) {
        LogUtil.a("PLGACHIEVE_AchievePersonalDataObserver", "setOldAndNewUserStatus: days -> " + i);
        Context context = BaseApplication.getContext();
        if (context == null) {
            LogUtil.j("PLGACHIEVE_AchievePersonalDataObserver", " setOldAndNewUserStatus: context is null");
            return;
        }
        String accountInfo = LoginInit.getInstance(context).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            LogUtil.j("PLGACHIEVE_AchievePersonalDataObserver", " setOldAndNewUserStatus: userId is empty");
            return;
        }
        if (i <= 10) {
            LogUtil.a("PLGACHIEVE_AchievePersonalDataObserver", " setOldAndNewUserStatus: set the new user");
            e(context, "NEWBIE" + accountInfo, "done");
            return;
        }
        LogUtil.a("PLGACHIEVE_AchievePersonalDataObserver", " setOldAndNewUserStatus: set the old user");
        e(context, "NEWBIE" + accountInfo, "doing");
    }
}
