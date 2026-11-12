package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public final class t1 implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f7785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f7787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7788d;

    public t1(c1 c1Var, String str, Object[] objArr) {
        this.f7785a = c1Var;
        this.f7786b = str;
        this.f7787c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f7788d = cCharAt;
            return;
        }
        int i14 = cCharAt & 8191;
        int i15 = 13;
        int i16 = 1;
        while (true) {
            int i17 = i16 + 1;
            char cCharAt2 = str.charAt(i16);
            if (cCharAt2 < 55296) {
                this.f7788d = i14 | (cCharAt2 << i15);
                return;
            } else {
                i14 |= (cCharAt2 & 8191) << i15;
                i15 += 13;
                i16 = i17;
            }
        }
    }

    @Override // androidx.health.platform.client.proto.a1
    public final c1 getDefaultInstance() {
        return this.f7785a;
    }

    @Override // androidx.health.platform.client.proto.a1
    public final q1 getSyntax() {
        int i14 = this.f7788d;
        if ((i14 & 1) != 0) {
            return q1.PROTO2;
        }
        return (i14 & 4) == 4 ? q1.EDITIONS : q1.PROTO3;
    }

    @Override // androidx.health.platform.client.proto.a1
    public final boolean isMessageSetWireFormat() {
        return (this.f7788d & 2) == 2;
    }
}
