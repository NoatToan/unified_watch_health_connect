package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public abstract class gm5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gm5 f19125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final gm5 f19126b;
    public static final gm5 c;
    public static final gm5 d;
    public static final gm5 e;
    public static final gm5 f;
    public static final gm5 g;
    public static final gm5 h;
    public static final /* synthetic */ gm5[] i;

    public static enum a extends gm5 {
        public a(String str, int i) {
            super(str, i, null);
        }

        @Override // defpackage.gm5
        public boolean a(int i, int i2) {
            return ((i + i2) & 1) == 0;
        }
    }

    static {
        a aVar = new a("DATA_MASK_000", 0);
        f19125a = aVar;
        gm5 gm5Var = new gm5("DATA_MASK_001", 1) { // from class: gm5.b
            {
                a aVar2 = null;
            }

            @Override // defpackage.gm5
            public boolean a(int i2, int i3) {
                return (i2 & 1) == 0;
            }
        };
        f19126b = gm5Var;
        gm5 gm5Var2 = new gm5("DATA_MASK_010", 2) { // from class: gm5.c
            {
                a aVar2 = null;
            }

            @Override // defpackage.gm5
            public boolean a(int i2, int i3) {
                return i3 % 3 == 0;
            }
        };
        c = gm5Var2;
        gm5 gm5Var3 = new gm5("DATA_MASK_011", 3) { // from class: gm5.d
            {
                a aVar2 = null;
            }

            @Override // defpackage.gm5
            public boolean a(int i2, int i3) {
                return (i2 + i3) % 3 == 0;
            }
        };
        d = gm5Var3;
        gm5 gm5Var4 = new gm5("DATA_MASK_100", 4) { // from class: gm5.e
            {
                a aVar2 = null;
            }

            @Override // defpackage.gm5
            public boolean a(int i2, int i3) {
                return (((i2 / 2) + (i3 / 3)) & 1) == 0;
            }
        };
        e = gm5Var4;
        gm5 gm5Var5 = new gm5("DATA_MASK_101", 5) { // from class: gm5.f
            {
                a aVar2 = null;
            }

            @Override // defpackage.gm5
            public boolean a(int i2, int i3) {
                return (i2 * i3) % 6 == 0;
            }
        };
        f = gm5Var5;
        gm5 gm5Var6 = new gm5("DATA_MASK_110", 6) { // from class: gm5.g
            {
                a aVar2 = null;
            }

            @Override // defpackage.gm5
            public boolean a(int i2, int i3) {
                return (i2 * i3) % 6 < 3;
            }
        };
        g = gm5Var6;
        gm5 gm5Var7 = new gm5("DATA_MASK_111", 7) { // from class: gm5.h
            {
                a aVar2 = null;
            }

            @Override // defpackage.gm5
            public boolean a(int i2, int i3) {
                return (((i2 + i3) + ((i2 * i3) % 3)) & 1) == 0;
            }
        };
        h = gm5Var7;
        i = new gm5[]{aVar, gm5Var, gm5Var2, gm5Var3, gm5Var4, gm5Var5, gm5Var6, gm5Var7};
    }

    public gm5(String str, int i2) {
        super(str, i2);
    }

    public static gm5 valueOf(String str) {
        return (gm5) Enum.valueOf(gm5.class, str);
    }

    public static gm5[] values() {
        return (gm5[]) i.clone();
    }

    public abstract boolean a(int i2, int i3);

    public final void b(cp2 cp2Var, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                if (a(i3, i4)) {
                    cp2Var.d(i4, i3);
                }
            }
        }
    }

    public /* synthetic */ gm5(String str, int i2, a aVar) {
        this(str, i2);
    }
}
