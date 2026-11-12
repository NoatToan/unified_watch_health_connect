package s33;

/* JADX INFO: loaded from: classes3.dex */
public enum l implements z33.h.a {
    FINAL(0, 0),
    OPEN(1, 1),
    ABSTRACT(2, 2),
    SEALED(3, 3);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f156734a;

    static {
        new z33.h.b<l>() { // from class: s33.l.a
            @Override // z33.h.b
            public final z33.h.a findValueByNumber(int i14) {
                if (i14 == 0) {
                    return l.FINAL;
                }
                if (i14 == 1) {
                    return l.OPEN;
                }
                if (i14 == 2) {
                    return l.ABSTRACT;
                }
                if (i14 == 3) {
                    return l.SEALED;
                }
                l lVar = l.FINAL;
                return null;
            }
        };
    }

    l(int i14, int i15) {
        this.f156734a = i15;
    }

    @Override // z33.h.a
    public final int getNumber() {
        return this.f156734a;
    }
}
