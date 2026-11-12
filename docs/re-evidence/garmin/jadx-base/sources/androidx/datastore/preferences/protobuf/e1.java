package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class e1 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f6698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f6700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6701d;

    public e1(q0 q0Var, String str, Object[] objArr) {
        this.f6698a = q0Var;
        this.f6699b = str;
        this.f6700c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f6701d = cCharAt;
            return;
        }
        int i14 = cCharAt & 8191;
        int i15 = 13;
        int i16 = 1;
        while (true) {
            int i17 = i16 + 1;
            char cCharAt2 = str.charAt(i16);
            if (cCharAt2 < 55296) {
                this.f6701d = i14 | (cCharAt2 << i15);
                return;
            } else {
                i14 |= (cCharAt2 & 8191) << i15;
                i15 += 13;
                i16 = i17;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final q0 getDefaultInstance() {
        return this.f6698a;
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final b1 getSyntax() {
        int i14 = this.f6701d;
        if ((i14 & 1) != 0) {
            return b1.PROTO2;
        }
        return (i14 & 4) == 4 ? b1.EDITIONS : b1.PROTO3;
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final boolean isMessageSetWireFormat() {
        return (this.f6701d & 2) == 2;
    }
}
