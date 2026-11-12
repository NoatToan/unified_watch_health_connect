package com.huawei.hms.network.embedded;

import android.os.SystemClock;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.LimitQueue;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.NetworkUtil;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes34.dex */
public class t4 extends r4<c5, String> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f15391b = "NetworkInfoCache";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile t4 f15392c = new t4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LimitQueue<c5> f15393a = new LimitQueue<>(8);

    @Override // com.huawei.hms.network.embedded.r4
    public int obtainNetworkQuality(long j, long j2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (int i = 0; i < this.f15393a.size(); i++) {
            c5 c5Var = this.f15393a.get(i);
            if (c5Var != null && j <= c5Var.b() && c5Var.b() <= j2) {
                linkedHashSet.add(Integer.valueOf(c5Var.c()));
                linkedHashSet2.add(c5Var.a());
            }
        }
        if (linkedHashSet.isEmpty()) {
            return !linkedHashSet2.isEmpty() ? 2 : 0;
        }
        return 1;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huawei.hms.network.embedded.r4
    public c5 getPeekLastInfo() {
        c5 c5VarPeekLast = this.f15393a.peekLast();
        if (c5VarPeekLast != null) {
            return c5VarPeekLast;
        }
        Logger.v(f15391b, "the networkInfoMetrics is null,and return new object");
        return new b5();
    }

    @Override // com.huawei.hms.network.embedded.r4
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void updateCacheInfo(String str) {
        b5 b5VarA = a(SystemClock.elapsedRealtime());
        c5 c5VarPeekLast = this.f15393a.peekLast();
        if (c5VarPeekLast != null && c5VarPeekLast.c() == b5VarA.c() && c5VarPeekLast.a() == b5VarA.a()) {
            Logger.v(f15391b, "the network change don't meet interval!");
        } else {
            this.f15393a.add(b5VarA);
        }
    }

    public b5 a(long j) {
        b5 b5Var = new b5();
        b5Var.a(NetworkUtil.getCurrentNetworkType());
        b5Var.a(NetworkUtil.getNetworkStatus(ContextHolder.getResourceContext()));
        b5Var.a(j);
        return b5Var;
    }

    public static t4 getInstance() {
        return f15392c;
    }
}
