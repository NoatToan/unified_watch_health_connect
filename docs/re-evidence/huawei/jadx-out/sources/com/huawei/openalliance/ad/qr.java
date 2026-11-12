package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.db.bean.EventRecord;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
class qr extends qm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Executor f20150a = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.huawei.openalliance.ad.utils.p("Normal-Event"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f20151b;

    @Override // com.huawei.openalliance.ad.qm
    protected long d() {
        long j;
        synchronized (qr.class) {
            j = f20151b;
        }
        return j;
    }

    @Override // com.huawei.openalliance.ad.qm
    protected String c() {
        return "NormalEventReporter";
    }

    @Override // com.huawei.openalliance.ad.qm
    protected Executor b() {
        return f20150a;
    }

    @Override // com.huawei.openalliance.ad.qm
    protected void a(long j) {
        synchronized (qr.class) {
            f20151b = j;
        }
    }

    @Override // com.huawei.openalliance.ad.qm
    protected Class<? extends EventRecord> a() {
        return EventRecord.class;
    }

    qr(Context context, tf tfVar) {
        super(context, tfVar);
    }
}
