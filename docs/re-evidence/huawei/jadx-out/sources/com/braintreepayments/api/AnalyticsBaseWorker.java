package com.braintreepayments.api;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.huawei.openalliance.ad.constant.ParamConstants;
import defpackage.zcp;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/braintreepayments/api/AnalyticsBaseWorker;", "Landroidx/work/Worker;", ParamConstants.Param.CONTEXT, "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class AnalyticsBaseWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsBaseWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        zcp.c(context, "");
        zcp.c(workerParameters, "");
    }
}
