package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.db.bean.ClickEventRecord;
import com.huawei.openalliance.ad.db.bean.EventRecord;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
class qn extends qm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Executor f20146a = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.huawei.openalliance.ad.utils.p("Click-Event"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f20147b;

    @Override // com.huawei.openalliance.ad.qm
    protected long d() {
        long j;
        synchronized (qn.class) {
            j = this.f20147b;
        }
        return j;
    }

    @Override // com.huawei.openalliance.ad.qm
    protected String c() {
        return "ClickEventReporter";
    }

    @Override // com.huawei.openalliance.ad.qm
    protected Executor b() {
        return f20146a;
    }

    @Override // com.huawei.openalliance.ad.qm
    protected void a(long j) {
        synchronized (qn.class) {
            this.f20147b = j;
        }
    }

    @Override // com.huawei.openalliance.ad.qm
    protected Class<? extends EventRecord> a() {
        return ClickEventRecord.class;
    }

    qn(Context context, tf tfVar) {
        super(context, tfVar);
    }
}
