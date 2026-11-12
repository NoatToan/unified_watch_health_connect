package com.huawei.health.monitor.proc.prompt;

import android.content.Context;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.StepCounterSupport;

/* JADX INFO: loaded from: classes2.dex */
public class PromptRecord {
    private Context d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f8501a = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f8503c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f8502b = false;

    public PromptRecord(Context context) {
        this.d = null;
        if (context == null) {
            LogUtil.j("Step_PromptRecord", "PromptRecord context is null.");
            this.d = BaseApplication.getContext();
        }
        this.d = context;
    }

    public void c() {
        LogUtil.a("Step_PromptRecord", "handleBootCompleteMessage");
        this.f8503c = true;
    }

    public void e() {
        LogUtil.a("Step_PromptRecord", "handleShutDownMessage");
        this.f8502b = true;
    }

    public void c(boolean z) {
        this.f8501a = z;
        LogUtil.a("Step_PromptRecord", "makePromptSense:", Boolean.valueOf(z));
    }

    public void d() {
        if (!this.f8501a) {
            LogUtil.j("Step_PromptRecord", "makePromptNoSense invoke,but find itself has no sense,warnning!!!");
        } else {
            this.f8501a = false;
            LogUtil.a("Step_PromptRecord", "makePromptNoSense,success");
        }
    }

    public boolean a() {
        if (!StepCounterSupport.i(this.d)) {
            LogUtil.j("Step_PromptRecord", "not support step counter,isPromptHasSense return false");
            return false;
        }
        if (this.f8503c) {
            LogUtil.a("Step_PromptRecord", "Has Received BootComplete,isPromptHasSense return false,Avoid misJudgment");
            return false;
        }
        if (this.f8502b) {
            LogUtil.a("Step_PromptRecord", "Has Received ShutDown,isPromptHasSense return false,Avoid misJudgment!!!");
            return false;
        }
        return this.f8501a;
    }
}
