package com.huawei.pluginachievement.report.datahlr;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.GsonBuilder;
import com.huawei.hmf.tasks.OnCompleteListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.report.bean.AnnualReport;
import com.huawei.pluginachievement.report.bean.AnnualReportCycle;
import com.huawei.pluginachievement.report.bean.AnnualReportFitness;
import com.huawei.pluginachievement.report.bean.AnnualReportInital;
import com.huawei.pluginachievement.report.bean.AnnualReportMarathon;
import com.huawei.pluginachievement.report.bean.AnnualReportReward;
import com.huawei.pluginachievement.report.bean.AnnualReportRun;
import com.huawei.pluginachievement.report.bean.AnnualReportSleep;
import com.huawei.pluginachievement.report.bean.AnnualReportStep;
import com.huawei.pluginachievement.report.bean.AnnualReportSumary;
import com.huawei.pluginachievement.report.bean.AnnualReportWeight;
import com.huawei.pluginachievement.report.bean.AnnualReportYear;
import defpackage.otl;
import defpackage.ows;
import defpackage.oww;
import defpackage.oxi;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class AchieveAnnualDataHlr {
    private static final String TAG = "PLGACHIEVE_AchieveAnnualDataHlr";
    private static volatile AchieveAnnualDataHlr achieveAnnualDataHlr;
    private int currentYear;
    private Context mContext;
    private otl mService = null;
    private IBaseResponseCallback responseCallback = null;
    private boolean mIsFetchingAnnualData = false;

    private AchieveAnnualDataHlr(Context context) {
        if (context == null) {
            return;
        }
        this.mContext = context.getApplicationContext();
    }

    public static AchieveAnnualDataHlr getInstance(Context context) {
        if (achieveAnnualDataHlr == null) {
            synchronized (AchieveAnnualDataHlr.class) {
                if (achieveAnnualDataHlr == null) {
                    achieveAnnualDataHlr = new AchieveAnnualDataHlr(context);
                }
            }
        }
        return achieveAnnualDataHlr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getAnnualReport(int i) {
        LogUtil.a(TAG, "enter getAnnualReport");
        if (this.mService == null) {
            this.mService = otl.b(this.mContext);
        }
        AnnualReportReward annualReportRewardG = oww.g(this.mService, i);
        AnnualReportSumary annualReportSumaryH = oww.h(this.mService, i);
        AnnualReportRun annualReportRunJ = oww.j(this.mService, i);
        AnnualReportCycle annualReportCycleA = oww.a(this.mService, i);
        AnnualReportStep annualReportStepF = oww.f(this.mService, i);
        AnnualReportInital annualReportInitalE = oww.e(this.mService, i);
        AnnualReportFitness annualReportFitnessD = oww.d(this.mService, i);
        AnnualReportSleep annualReportSleepI = oww.i(this.mService, i);
        AnnualReportWeight annualReportWeightL = oww.l(this.mService, i);
        AnnualReportMarathon annualReportMarathonB = oww.b(this.mService, i);
        AnnualReport annualReport = new AnnualReport();
        annualReport.setReportCycle(annualReportCycleA);
        annualReport.setReportRun(annualReportRunJ);
        annualReport.setReportStep(annualReportStepF);
        annualReport.setReportFitness(annualReportFitnessD);
        annualReport.setReportInital(annualReportInitalE);
        annualReport.setReportReward(annualReportRewardG);
        annualReport.setReportSumary(annualReportSumaryH);
        annualReport.setReportSleep(annualReportSleepI);
        annualReport.setReportWeight(annualReportWeightL);
        annualReport.setReportMarathon(annualReportMarathonB);
        AnnualReportYear annualReportYear = new AnnualReportYear();
        if (i == 2018) {
            annualReportYear.setReport2018(annualReport);
        } else {
            annualReportYear.setReport(annualReport);
        }
        annualReportYear.setResultCode(oww.b(oxi.a(i, false), annualReportStepF, annualReportInitalE));
        String json = new GsonBuilder().excludeFieldsWithModifiers(4).create().toJson(annualReportYear);
        IBaseResponseCallback iBaseResponseCallback = this.responseCallback;
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(0, json);
        }
        this.responseCallback = null;
    }

    public void getAnnualReportJson(int i, IBaseResponseCallback iBaseResponseCallback) {
        if (this.mIsFetchingAnnualData) {
            if (iBaseResponseCallback != null) {
                this.responseCallback = iBaseResponseCallback;
            }
            LogUtil.a(TAG, "getAnnualReportJson has executing, return");
            return;
        }
        if (this.mService == null) {
            this.mService = otl.b(this.mContext);
        }
        LogUtil.a(TAG, "getAnnualReportJson year ", Integer.valueOf(i));
        this.mIsFetchingAnnualData = true;
        Task<Void> taskCalculateAnnualData = new ows().e(i).calculateAnnualData(i);
        this.responseCallback = iBaseResponseCallback;
        this.currentYear = i;
        taskCalculateAnnualData.addOnCompleteListener(new OnCompleteListener<Void>() { // from class: com.huawei.pluginachievement.report.datahlr.AchieveAnnualDataHlr.2
            @Override // com.huawei.hmf.tasks.OnCompleteListener
            public void onComplete(Task<Void> task) {
                if (AchieveAnnualDataHlr.this.currentYear <= 2019) {
                    AchieveAnnualDataHlr achieveAnnualDataHlr2 = AchieveAnnualDataHlr.this;
                    achieveAnnualDataHlr2.getAnnualReport(achieveAnnualDataHlr2.currentYear);
                } else {
                    AchieveAnnualDataHlr achieveAnnualDataHlr3 = AchieveAnnualDataHlr.this;
                    achieveAnnualDataHlr3.generateAnnualReport(achieveAnnualDataHlr3.currentYear);
                }
                AchieveAnnualDataHlr.this.mIsFetchingAnnualData = false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void generateAnnualReport(int i) {
        if (this.responseCallback == null) {
            return;
        }
        JSONObject jSONObjectC = oww.c(this.mService, i);
        if (!TextUtils.isEmpty(jSONObjectC.toString())) {
            this.responseCallback.a(0, jSONObjectC.toString());
            LogUtil.a(TAG, "generateAnnualReport onResponse SUCCESS.");
        } else {
            this.responseCallback.a(-1, "");
            LogUtil.j(TAG, "generateAnnualReport onResponse ERROR.");
        }
        this.responseCallback = null;
    }
}
