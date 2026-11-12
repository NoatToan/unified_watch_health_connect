package s33;

/* JADX INFO: loaded from: classes3.dex */
public enum z implements z33.h.a {
    INTERNAL(0, 0),
    PRIVATE(1, 1),
    PROTECTED(2, 2),
    PUBLIC(3, 3),
    PRIVATE_TO_THIS(4, 4),
    LOCAL(5, 5);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f157038a;

    static {
        new z33.h.b<z>() { // from class: s33.z.a
            @Override // z33.h.b
            public final z33.h.a findValueByNumber(int i14) {
                if (i14 == 0) {
                    return z.INTERNAL;
                }
                if (i14 == 1) {
                    return z.PRIVATE;
                }
                if (i14 == 2) {
                    return z.PROTECTED;
                }
                if (i14 == 3) {
                    return z.PUBLIC;
                }
                if (i14 == 4) {
                    return z.PRIVATE_TO_THIS;
                }
                if (i14 == 5) {
                    return z.LOCAL;
                }
                z zVar = z.INTERNAL;
                return null;
            }
        };
    }

    z(int i14, int i15) {
        this.f157038a = i15;
    }

    @Override // z33.h.a
    public final int getNumber() {
        return this.f157038a;
    }
}
