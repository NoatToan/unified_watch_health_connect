package com.huawei.hms.network.file.core;

import com.huawei.hms.network.file.core.util.FLogger;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f15727b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<Long, Integer> f15728a = new HashMap<>();

    public void c(long j) {
        synchronized (this) {
            FLogger.v("ConcurrentStatisticsMan", "updateRecord : " + j);
            if (this.f15728a.size() > 1000) {
                FLogger.w("ConcurrentStatisticsMan", "record size attach threshold", new Object[0]);
                return;
            }
            if (!this.f15728a.containsKey(Long.valueOf(j))) {
                b();
                this.f15728a.put(Long.valueOf(j), Integer.valueOf(this.f15728a.size() + 1));
            } else {
                FLogger.v("ConcurrentStatisticsMan", "requestId exist : " + j);
            }
        }
    }

    public int b(long j) {
        int iIntValue;
        synchronized (this) {
            iIntValue = this.f15728a.containsKey(Long.valueOf(j)) ? this.f15728a.get(Long.valueOf(j)).intValue() : -1;
            FLogger.v("ConcurrentStatisticsMan", "getConcurrentNum : " + j + " num is " + iIntValue);
        }
        return iIntValue;
    }

    public void a(long j) {
        synchronized (this) {
            FLogger.v("ConcurrentStatisticsMan", "eraseRecord : " + j);
            this.f15728a.remove(Long.valueOf(j));
        }
    }

    private void b() {
        for (Map.Entry<Long, Integer> entry : this.f15728a.entrySet()) {
            entry.setValue(Integer.valueOf(entry.getValue().intValue() + 1));
        }
    }

    public static a a() {
        return f15727b;
    }
}
