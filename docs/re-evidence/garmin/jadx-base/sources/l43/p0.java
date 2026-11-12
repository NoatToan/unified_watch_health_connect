package l43;

import p43.g2;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p0 f110094a = new p0();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f110095a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f110096b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f110097c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f110098d;

        static {
            int[] iArr = new int[s33.l.values().length];
            try {
                iArr[s33.l.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s33.l.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s33.l.ABSTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s33.l.SEALED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f110095a = iArr;
            int[] iArr2 = new int[t23.a0.values().length];
            try {
                iArr2[t23.a0.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[t23.a0.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[t23.a0.ABSTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[t23.a0.SEALED.ordinal()] = 4;
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
            int[] iArr4 = new int[b43.z.values().length];
            try {
                iArr4[b43.z.MustUse.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[b43.z.ExplicitlyIgnorable.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[b43.z.Unspecified.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            int[] iArr5 = new int[s33.q.values().length];
            try {
                iArr5[s33.q.MUST_USE.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr5[s33.q.EXPLICITLY_IGNORABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr5[s33.q.UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            int[] iArr6 = new int[s33.c.EnumC2957c.values().length];
            try {
                iArr6[s33.c.EnumC2957c.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr6[s33.c.EnumC2957c.INTERFACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr6[s33.c.EnumC2957c.ENUM_CLASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr6[s33.c.EnumC2957c.ENUM_ENTRY.ordinal()] = 4;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr6[s33.c.EnumC2957c.ANNOTATION_CLASS.ordinal()] = 5;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr6[s33.c.EnumC2957c.OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr6[s33.c.EnumC2957c.COMPANION_OBJECT.ordinal()] = 7;
            } catch (NoSuchFieldError unused27) {
            }
            f110096b = iArr6;
            int[] iArr7 = new int[t23.f.values().length];
            try {
                iArr7[t23.f.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr7[t23.f.INTERFACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr7[t23.f.ENUM_CLASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr7[t23.f.ENUM_ENTRY.ordinal()] = 4;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr7[t23.f.ANNOTATION_CLASS.ordinal()] = 5;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr7[t23.f.OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused33) {
            }
            int[] iArr8 = new int[s33.u.c.values().length];
            try {
                iArr8[s33.u.c.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr8[s33.u.c.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr8[s33.u.c.INV.ordinal()] = 3;
            } catch (NoSuchFieldError unused36) {
            }
            f110097c = iArr8;
            int[] iArr9 = new int[s33.s.b.c.values().length];
            try {
                iArr9[s33.s.b.c.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr9[s33.s.b.c.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr9[s33.s.b.c.INV.ordinal()] = 3;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr9[s33.s.b.c.STAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused40) {
            }
            f110098d = iArr9;
            int[] iArr10 = new int[g2.values().length];
            try {
                iArr10[g2.IN_VARIANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr10[g2.OUT_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr10[g2.INVARIANT.ordinal()] = 3;
            } catch (NoSuchFieldError unused43) {
            }
        }
    }

    private p0() {
    }

    public static t23.a0 a(s33.l lVar) {
        int i14 = lVar == null ? -1 : a.f110095a[lVar.ordinal()];
        if (i14 == 1) {
            return t23.a0.FINAL;
        }
        if (i14 == 2) {
            return t23.a0.OPEN;
        }
        if (i14 != 3) {
            return i14 != 4 ? t23.a0.FINAL : t23.a0.SEALED;
        }
        return t23.a0.ABSTRACT;
    }
}
