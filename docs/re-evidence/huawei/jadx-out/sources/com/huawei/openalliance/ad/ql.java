package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.db.bean.AnalysisEventRecord;
import com.huawei.openalliance.ad.db.bean.EventRecord;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
class ql extends qm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Executor f20130a = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.huawei.openalliance.ad.utils.p("Analysis-Event"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f20131b;

    @Override // com.huawei.openalliance.ad.qm
    protected long d() {
        long j;
        synchronized (ql.class) {
            j = f20131b;
        }
        return j;
    }

    @Override // com.huawei.openalliance.ad.qm
    protected String c() {
        return "AnalysisEventReporter";
    }

    @Override // com.huawei.openalliance.ad.qm
    protected Executor b() {
        return f20130a;
    }

    @Override // com.huawei.openalliance.ad.qm
    protected void a(long j) {
        synchronized (ql.class) {
            f20131b = j;
        }
    }

    @Override // com.huawei.openalliance.ad.qm
    protected Class<? extends EventRecord> a() {
        return AnalysisEventRecord.class;
    }

    ql(Context context, tf tfVar) {
        super(context, tfVar);
    }
}
