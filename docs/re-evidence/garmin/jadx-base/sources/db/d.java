package db;

import fa.r;

/* JADX INFO: loaded from: classes.dex */
public final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f58937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f58938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f58939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f58940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f58941e;

    private d(int i14, int i15, int i16, int i17, int i18, int i19) {
        this.f58937a = i14;
        this.f58938b = i16;
        this.f58939c = i17;
        this.f58940d = i18;
        this.f58941e = i19;
    }

    public static d a(r rVar) {
        int i14 = rVar.i();
        rVar.H(12);
        int i15 = rVar.i();
        int i16 = rVar.i();
        int i17 = rVar.i();
        rVar.H(4);
        int i18 = rVar.i();
        int i19 = rVar.i();
        rVar.H(8);
        return new d(i14, i15, i16, i17, i18, i19);
    }

    @Override // db.a
    public final int getType() {
        return 1752331379;
    }
}
