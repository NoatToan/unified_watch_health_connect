package com.braintreepayments.api;

import android.content.Context;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.alipay.sdk.m.s.e;
import com.huawei.openalliance.ad.constant.ParamConstants;
import defpackage.rp;
import defpackage.zcp;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/braintreepayments/api/AnalyticsWriteToDbWorker;", "Lcom/braintreepayments/api/AnalyticsBaseWorker;", ParamConstants.Param.CONTEXT, "Landroid/content/Context;", e.n, "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class AnalyticsWriteToDbWorker extends AnalyticsBaseWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsWriteToDbWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        zcp.c(context, "");
        zcp.c(workerParameters, "");
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        Context applicationContext = getApplicationContext();
        zcp.b((Object) applicationContext, "");
        rp rpVar = new rp(applicationContext, null, null, null, null, 30, null);
        Data inputData = getInputData();
        zcp.b((Object) inputData, "");
        return rpVar.a(inputData);
    }
}
