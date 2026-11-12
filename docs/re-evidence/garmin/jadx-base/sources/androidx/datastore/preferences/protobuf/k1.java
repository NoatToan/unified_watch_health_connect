package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class k1 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1 f6777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f6779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s[] f6780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q0 f6781e;

    public k1(b1 b1Var, boolean z14, int[] iArr, s[] sVarArr, Object obj) {
        this.f6777a = b1Var;
        this.f6778b = z14;
        this.f6779c = iArr;
        this.f6780d = sVarArr;
        z.a(obj, "defaultInstance");
        this.f6781e = (q0) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final q0 getDefaultInstance() {
        return this.f6781e;
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final b1 getSyntax() {
        return this.f6777a;
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final boolean isMessageSetWireFormat() {
        return this.f6778b;
    }
}
