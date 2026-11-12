package com.miui.tsmclient.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.miui.tsmclient.util.EnvironmentConfig;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class TSMDataStatInterface {
    private static volatile TSMDataStatInterface sInstance;
    private ThreadPoolExecutor executor;
    private Context mContext;
    private boolean isRecord = true;
    private TSMDataStatManager mDataStatManger = new TSMDataStatManager();

    private TSMDataStatInterface() {
    }

    private String generateEventString(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            if (TextUtils.isEmpty(str)) {
                sb.append(str);
                sb.append(",");
            } else {
                sb.append(str.replace(",", RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR));
                sb.append(",");
            }
        }
        if (sb.toString().endsWith(",")) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static TSMDataStatInterface getInstance() {
        if (sInstance == null) {
            synchronized (TSMDataStatInterface.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new TSMDataStatInterface();
                        sInstance.init(EnvironmentConfig.getContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    private void init(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context can not be null");
        }
        this.mContext = context.getApplicationContext();
        this.executor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadPoolExecutor.DiscardPolicy());
    }

    public boolean isRecord() {
        return this.isRecord;
    }

    public void recordCountEvent(final int i) {
        if (this.mContext == null) {
            throw new IllegalArgumentException("context can not be null");
        }
        if (this.isRecord) {
            this.executor.execute(new Runnable() { // from class: com.miui.tsmclient.analytics.TSMDataStatInterface.1
                @Override // java.lang.Runnable
                public void run() {
                    TSMDataStatInterface.this.mDataStatManger.recordCountEvent(TSMDataStatInterface.this.mContext, i);
                }
            });
        }
    }

    public void recordListEvent(int i, List<String> list) {
        if (list == null || list.isEmpty()) {
            recordCountEvent(i);
            return;
        }
        if (this.isRecord) {
            String strGenerateEventString = generateEventString(list);
            if (TextUtils.isEmpty(strGenerateEventString)) {
                recordCountEvent(i);
            } else {
                recordStringEvent(i, strGenerateEventString);
            }
        }
    }

    public void recordStringEvent(final int i, final String str) {
        if (this.mContext == null) {
            throw new IllegalArgumentException("context can not be null");
        }
        if (this.isRecord) {
            this.executor.execute(new Runnable() { // from class: com.miui.tsmclient.analytics.TSMDataStatInterface.2
                @Override // java.lang.Runnable
                public void run() {
                    TSMDataStatInterface.this.mDataStatManger.recordStringEvent(TSMDataStatInterface.this.mContext, i, str);
                }
            });
        }
    }

    public void setRecord(boolean z) {
        this.isRecord = z;
    }
}
