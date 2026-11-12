package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.db.bean.EventRecord;
import com.huawei.openalliance.ad.db.bean.ImpEventRecord;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
class qq extends qm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Executor f20148a = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.huawei.openalliance.ad.utils.p("Imp-Event"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f20149b;

    @Override // com.huawei.openalliance.ad.qm
    protected long d() {
        long j;
        synchronized (qq.class) {
            j = this.f20149b;
        }
        return j;
    }

    @Override // com.huawei.openalliance.ad.qm
    protected String c() {
        return "ImpEventReporter";
    }

    @Override // com.huawei.openalliance.ad.qm
    protected Executor b() {
        return f20148a;
    }

    @Override // com.huawei.openalliance.ad.qm
    protected void a(long j) {
        synchronized (qq.class) {
            this.f20149b = j;
        }
    }

    @Override // com.huawei.openalliance.ad.qm
    protected Class<? extends EventRecord> a() {
        return ImpEventRecord.class;
    }

    qq(Context context, tf tfVar) {
        super(context, tfVar);
    }
}
