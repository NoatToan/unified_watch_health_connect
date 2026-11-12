package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.LimitQueue;
import com.huawei.hms.framework.common.Logger;

/* JADX INFO: loaded from: classes34.dex */
public class s4 extends r4<w4, w4> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f15329b = "DetectInfoCache";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static s4 f15330c = new s4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LimitQueue<w4> f15331a = new LimitQueue<>(5, false);

    @Override // com.huawei.hms.network.embedded.r4
    public int obtainNetworkQuality(long j, long j2) {
        w4 peekLastInfo = getPeekLastInfo();
        if (peekLastInfo.b(1).c() == 204) {
            return 4;
        }
        return peekLastInfo.b(0).c() == 204 ? 5 : 0;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huawei.hms.network.embedded.r4
    public w4 getPeekLastInfo() {
        w4 w4VarPeekLast = this.f15331a.peekLast();
        if (w4VarPeekLast == null) {
            return new v4();
        }
        return Math.abs(System.currentTimeMillis() - w4VarPeekLast.b()) < 300000 ? w4VarPeekLast : new v4();
    }

    @Override // com.huawei.hms.network.embedded.r4
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void updateCacheInfo(w4 w4Var) {
        Logger.v(f15329b, "DetectCache update :" + w4Var.toString());
        this.f15331a.remove(w4Var);
        this.f15331a.add(w4Var);
    }

    public static s4 getInstance() {
        return f15330c;
    }
}
