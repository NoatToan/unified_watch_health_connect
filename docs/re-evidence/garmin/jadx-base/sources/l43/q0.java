package l43;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f110100a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f110101b;

        static {
            int[] iArr = new int[s33.k.values().length];
            try {
                iArr[s33.k.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s33.k.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s33.k.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s33.k.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f110100a = iArr;
            int[] iArr2 = new int[t23.b.a.values().length];
            try {
                iArr2[t23.b.a.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[t23.b.a.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[t23.b.a.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[t23.b.a.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[s33.z.values().length];
            try {
                iArr3[s33.z.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[s33.z.PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[s33.z.PRIVATE_TO_THIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[s33.z.PROTECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[s33.z.PUBLIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[s33.z.LOCAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            f110101b = iArr3;
        }
    }

    public static final t23.p a(p0 p0Var, s33.z zVar) {
        p0Var.getClass();
        switch (zVar == null ? -1 : a.f110101b[zVar.ordinal()]) {
            case 1:
                t23.q.g gVar = t23.q.f162049d;
                gVar.getClass();
                return gVar;
            case 2:
                t23.q.d dVar = t23.q.f162046a;
                dVar.getClass();
                return dVar;
            case 3:
                t23.q.e eVar = t23.q.f162047b;
                eVar.getClass();
                return eVar;
            case 4:
                t23.q.f fVar = t23.q.f162048c;
                fVar.getClass();
                return fVar;
            case 5:
                t23.q.h hVar = t23.q.f162050e;
                hVar.getClass();
                return hVar;
            case 6:
                t23.q.i iVar = t23.q.f162051f;
                iVar.getClass();
                return iVar;
            default:
                t23.q.d dVar2 = t23.q.f162046a;
                dVar2.getClass();
                return dVar2;
        }
    }

    public static final t23.b.a b(p0 p0Var, s33.k kVar) {
        p0Var.getClass();
        int i14 = kVar == null ? -1 : a.f110100a[kVar.ordinal()];
        if (i14 == 1) {
            return t23.b.a.DECLARATION;
        }
        if (i14 == 2) {
            return t23.b.a.FAKE_OVERRIDE;
        }
        if (i14 != 3) {
            return i14 != 4 ? t23.b.a.DECLARATION : t23.b.a.SYNTHESIZED;
        }
        return t23.b.a.DELEGATION;
    }
}
