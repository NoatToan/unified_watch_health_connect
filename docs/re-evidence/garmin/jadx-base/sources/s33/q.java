package s33;

/* JADX INFO: loaded from: classes3.dex */
public enum q implements z33.h.a {
    UNSPECIFIED(0, 0),
    MUST_USE(1, 1),
    EXPLICITLY_IGNORABLE(2, 2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f156841a;

    static {
        new z33.h.b<q>() { // from class: s33.q.a
            @Override // z33.h.b
            public final z33.h.a findValueByNumber(int i14) {
                if (i14 == 0) {
                    return q.UNSPECIFIED;
                }
                if (i14 == 1) {
                    return q.MUST_USE;
                }
                if (i14 == 2) {
                    return q.EXPLICITLY_IGNORABLE;
                }
                q qVar = q.UNSPECIFIED;
                return null;
            }
        };
    }

    q(int i14, int i15) {
        this.f156841a = i15;
    }

    @Override // z33.h.a
    public final int getNumber() {
        return this.f156841a;
    }
}
