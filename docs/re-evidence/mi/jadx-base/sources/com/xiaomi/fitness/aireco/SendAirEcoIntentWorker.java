package com.xiaomi.fitness.aireco;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.a;
import com.xiaomi.fitness.data.HealthPrefer;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/aireco/SendAirEcoIntentWorker;", "Landroidx/work/Worker;", "Landroidx/work/a$a;", "doWork", "()Landroidx/work/a$a;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SendAirEcoIntentWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendAirEcoIntentWorker(@NotNull Context context, @NotNull WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
    }

    @Override // androidx.work.Worker
    @NotNull
    public a.AbstractC0080a doWork() {
        a.AbstractC0080a abstractC0080aA;
        String str;
        boolean zDoSendAirEcoIntention = HealthPageExtKt.getInstance(IHealthPage.INSTANCE).doSendAirEcoIntention(new int[]{3, 4}, "SendAirEcoIntentWorker");
        HealthPrefer.INSTANCE.setNOT_FINISHED_SENT_LAST_TIMESTAMP_MILLS(System.currentTimeMillis());
        if (zDoSendAirEcoIntention) {
            abstractC0080aA = a.AbstractC0080a.c();
            str = "success(...)";
        } else {
            abstractC0080aA = a.AbstractC0080a.a();
            str = "failure(...)";
        }
        Intrinsics.checkNotNullExpressionValue(abstractC0080aA, str);
        return abstractC0080aA;
    }
}
