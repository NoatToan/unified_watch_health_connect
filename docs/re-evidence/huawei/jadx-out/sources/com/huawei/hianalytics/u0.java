package com.huawei.hianalytics;

import com.huawei.hianalytics.core.common.EnvUtils;
import com.huawei.hianalytics.framework.policy.IStoragePolicy;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class u0 implements IStoragePolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public File f11610b;

    public u0(String str) {
        this.f11609a = str;
    }

    @Override // com.huawei.hianalytics.framework.policy.IStoragePolicy
    public final boolean decide(String str, String str2) {
        str.getClass();
        if (str.equals(IStoragePolicy.PolicyType.NETWORK)) {
            return t.b(EnvUtils.getAppContext());
        }
        if (!str.equals(IStoragePolicy.PolicyType.STORAGE_LENGTH)) {
            return true;
        }
        if (this.f11610b == null) {
            this.f11610b = new File(EnvUtils.getAppContext().getDatabasePath("haformal_event.db").getPath());
        }
        return this.f11610b.length() > k.b().a().h;
    }

    @Override // com.huawei.hianalytics.framework.policy.IStoragePolicy
    public final int getDecryptBatchSize(String str) {
        x xVarA = g1.a(this.f11609a, str);
        if (xVarA == null) {
            return 500;
        }
        return xVarA.u;
    }

    @Override // com.huawei.hianalytics.framework.policy.IStoragePolicy
    public final int getDecryptBatchSleepTime(String str) {
        x xVarA = g1.a(this.f11609a, str);
        if (xVarA == null) {
            return 0;
        }
        return xVarA.v;
    }

    @Override // com.huawei.hianalytics.framework.policy.IStoragePolicy
    public final int getDecryptMaxBatchSize(String str) {
        x xVarA = g1.a(this.f11609a, str);
        if (xVarA == null) {
            return 500;
        }
        return xVarA.t;
    }

    @Override // com.huawei.hianalytics.framework.policy.IStoragePolicy
    public final boolean decide(String str, String str2, long j) {
        str.getClass();
        if (str.equals(IStoragePolicy.PolicyType.STORAGE_SIZE)) {
            x xVarA = g1.a(this.f11609a, str2);
            return j >= ((long) (xVarA != null ? xVarA.i : 30));
        }
        if (!str.equals(IStoragePolicy.PolicyType.STORAGE_CYCLE)) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        x xVarA2 = g1.a(this.f11609a, str2);
        return jCurrentTimeMillis - j > ((long) (xVarA2 != null ? xVarA2.j : 7)) * 86400000;
    }
}
