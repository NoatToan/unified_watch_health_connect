package com.huawei.hwdevice.phoneprocess.util;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import defpackage.lwq;
import defpackage.lwv;
import defpackage.mjh;
import defpackage.nfa;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class LogUploadWorker extends Worker {
    public LogUploadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        String str = "Dfx_LogUploadWorker";
        try {
            if (!NetworkUtil.k()) {
                ReleaseLogUtil.a("Dfx_LogUploadWorker", "doWork failure no network");
                return ListenableWorker.Result.failure();
            }
            String string = getInputData().getString(FaqConstants.FAQ_SHASN);
            String string2 = getInputData().getString("appId");
            String string3 = getInputData().getString("deviceId");
            int i = getInputData().getInt("iversion", 1);
            int i2 = getInputData().getInt("siteId", 1);
            int i3 = getInputData().getInt("source", 2);
            int i4 = getInputData().getInt("tokenType", ThirdLoginDataStorageUtil.getTokenTypeValue());
            long j = getInputData().getLong("ts", 0L);
            String string4 = getInputData().getString("x-huid");
            String string5 = getInputData().getString("x-version");
            String string6 = getInputData().getString("filePath");
            String string7 = getInputData().getString("countryCode");
            String string8 = getInputData().getString(FaqConstants.FAQ_EMUIVERSION);
            try {
                String string9 = getInputData().getString("model");
                String string10 = getInputData().getString("osVersion");
                String string11 = getInputData().getString("romVersion");
                if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string6)) {
                    lwv lwvVar = new lwv();
                    lwvVar.e(string2);
                    lwvVar.a(string3);
                    lwvVar.e(i);
                    lwvVar.a(i2);
                    lwvVar.b(i3);
                    lwvVar.b(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1008));
                    lwvVar.c(i4);
                    lwvVar.a(j);
                    lwq lwqVar = new lwq();
                    lwqVar.b(string4);
                    lwqVar.m(string5);
                    lwqVar.f(string6);
                    lwqVar.a(lwvVar);
                    lwqVar.c(string7);
                    lwqVar.e(string8);
                    lwqVar.j(string9);
                    lwqVar.h(string10);
                    lwqVar.g(string11);
                    lwqVar.i(string);
                    ThreadPoolManager.c().a("LogUploadWorker", new nfa(lwqVar));
                    ReleaseLogUtil.d("Dfx_LogUploadWorker", "doWork success");
                    return ListenableWorker.Result.success();
                }
                ReleaseLogUtil.a("Dfx_LogUploadWorker", "doWork failure: required parameters are null");
                return ListenableWorker.Result.failure();
            } catch (Exception e) {
                e = e;
                str = "Dfx_LogUploadWorker";
                ReleaseLogUtil.a(str, "doWork failure ", ExceptionUtils.c(e));
                mjh.n(", setFeedBackReleaseEvent setEventIntentData Exception: " + ExceptionUtils.c(e));
                return ListenableWorker.Result.failure();
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
