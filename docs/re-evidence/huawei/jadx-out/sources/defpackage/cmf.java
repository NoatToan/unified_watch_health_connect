package defpackage;

import com.huawei.devicesdk.strategy.SendStrategy;

/* JADX INFO: loaded from: classes4.dex */
public class cmf {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SendStrategy f1765c;
    private long d;
    private cmg e;

    public cmf(long j, cmg cmgVar, SendStrategy sendStrategy) {
        this.d = j;
        this.e = cmgVar;
        this.f1765c = sendStrategy;
    }

    public cmg e() {
        return this.e;
    }

    public SendStrategy a() {
        return this.f1765c;
    }

    public long c() {
        return this.d;
    }
}
