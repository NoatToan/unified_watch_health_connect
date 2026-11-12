package com.huawei.hihealthservice;

import android.content.Context;
import com.huawei.haf.common.dfx.block.ThreadMonitorTask;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hihealthservice.runnable.SingleRunnable;
import defpackage.ktj;
import defpackage.ktl;

/* JADX INFO: loaded from: classes10.dex */
public abstract class HiDataOperation implements Runnable {
    public static final int DATA_TYPE_GENERAL = 1;
    public static final int DATA_TYPE_REALTIME = 0;
    public static final int DATA_TYPE_SECE = 2;
    private static final String LOG_TAG = "HiH_HiDataOp";
    protected final Context mContext;
    protected final long mStartTime = System.currentTimeMillis();

    public abstract void execute(ktj ktjVar);

    public int getDataType() {
        return 1;
    }

    public boolean isMonitorThread() {
        return false;
    }

    public HiDataOperation(Context context) {
        this.mContext = context.getApplicationContext();
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!isMonitorThread()) {
            ktl.d().d(this);
            return;
        }
        ThreadMonitorTask threadMonitorTask = new ThreadMonitorTask(Thread.currentThread(), new SingleRunnable.a(SingleRunnable.TASK_TAG, SingleRunnable.FORMAT_FILE_NAME));
        try {
            threadMonitorTask.b("");
            ktl.d().d(this);
            threadMonitorTask.a(null, System.currentTimeMillis());
        } catch (Throwable th) {
            try {
                ReleaseLogUtil.e(LOG_TAG, "Failed to monitorThread, cause: ", ExceptionUtils.c(th));
                threadMonitorTask.a(th, System.currentTimeMillis());
            } catch (Throwable th2) {
                threadMonitorTask.a(null, System.currentTimeMillis());
                throw th2;
            }
        }
    }
}
