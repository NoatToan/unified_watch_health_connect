package db;

import fa.r;

/* JADX INFO: loaded from: classes.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f58934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f58935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f58936c;

    private c(int i14, int i15, int i16, int i17) {
        this.f58934a = i14;
        this.f58935b = i15;
        this.f58936c = i16;
    }

    public static c a(r rVar) {
        int i14 = rVar.i();
        rVar.H(8);
        int i15 = rVar.i();
        int i16 = rVar.i();
        rVar.H(4);
        int i17 = rVar.i();
        rVar.H(12);
        return new c(i14, i15, i16, i17);
    }

    @Override // db.a
    public final int getType() {
        return 1751742049;
    }
}
