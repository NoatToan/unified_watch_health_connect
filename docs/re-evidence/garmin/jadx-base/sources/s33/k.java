package s33;

/* JADX INFO: loaded from: classes3.dex */
public enum k implements z33.h.a {
    DECLARATION(0, 0),
    FAKE_OVERRIDE(1, 1),
    DELEGATION(2, 2),
    SYNTHESIZED(3, 3);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f156728a;

    static {
        new z33.h.b<k>() { // from class: s33.k.a
            @Override // z33.h.b
            public final z33.h.a findValueByNumber(int i14) {
                if (i14 == 0) {
                    return k.DECLARATION;
                }
                if (i14 == 1) {
                    return k.FAKE_OVERRIDE;
                }
                if (i14 == 2) {
                    return k.DELEGATION;
                }
                if (i14 == 3) {
                    return k.SYNTHESIZED;
                }
                k kVar = k.DECLARATION;
                return null;
            }
        };
    }

    k(int i14, int i15) {
        this.f156728a = i15;
    }

    @Override // z33.h.a
    public final int getNumber() {
        return this.f156728a;
    }
}
