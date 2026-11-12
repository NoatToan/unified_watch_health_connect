package androidx.health.platform.client.proto;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g0 f7629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g0 f7630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g0 f7631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g0 f7632f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g0 f7633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g0 f7634h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g0 f7635i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final g0[] f7636j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ g0[] f7637k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f7639b;

    /* JADX INFO: Fake field, exist only in values array */
    g0 EF0;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f7641b;

        static {
            int[] iArr = new int[m0.values().length];
            f7641b = iArr;
            try {
                iArr[m0.f7719i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7641b[m0.f7721k.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7641b[m0.f7718h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f7640a = iArr2;
            try {
                iArr2[b.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7640a[b.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7640a[b.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f7647a;

        b(boolean z14) {
            this.f7647a = z14;
        }
    }

    static {
        b bVar = b.SCALAR;
        m0 m0Var = m0.f7716f;
        g0 g0Var = new g0("DOUBLE", 0, 0, bVar, m0Var);
        m0 m0Var2 = m0.f7715e;
        g0 g0Var2 = new g0("FLOAT", 1, 1, bVar, m0Var2);
        m0 m0Var3 = m0.f7714d;
        g0 g0Var3 = new g0("INT64", 2, 2, bVar, m0Var3);
        g0 g0Var4 = new g0("UINT64", 3, 3, bVar, m0Var3);
        m0 m0Var4 = m0.f7713c;
        g0 g0Var5 = new g0("INT32", 4, 4, bVar, m0Var4);
        g0 g0Var6 = new g0("FIXED64", 5, 5, bVar, m0Var3);
        g0 g0Var7 = new g0("FIXED32", 6, 6, bVar, m0Var4);
        m0 m0Var5 = m0.f7717g;
        g0 g0Var8 = new g0("BOOL", 7, 7, bVar, m0Var5);
        m0 m0Var6 = m0.f7718h;
        g0 g0Var9 = new g0("STRING", 8, 8, bVar, m0Var6);
        m0 m0Var7 = m0.f7721k;
        g0 g0Var10 = new g0("MESSAGE", 9, 9, bVar, m0Var7);
        f7629c = g0Var10;
        m0 m0Var8 = m0.f7719i;
        g0 g0Var11 = new g0("BYTES", 10, 10, bVar, m0Var8);
        g0 g0Var12 = new g0("UINT32", 11, 11, bVar, m0Var4);
        m0 m0Var9 = m0.f7720j;
        g0 g0Var13 = new g0("ENUM", 12, 12, bVar, m0Var9);
        g0 g0Var14 = new g0("SFIXED32", 13, 13, bVar, m0Var4);
        g0 g0Var15 = new g0("SFIXED64", 14, 14, bVar, m0Var3);
        g0 g0Var16 = new g0("SINT32", 15, 15, bVar, m0Var4);
        g0 g0Var17 = new g0("SINT64", 16, 16, bVar, m0Var3);
        g0 g0Var18 = new g0("GROUP", 17, 17, bVar, m0Var7);
        f7630d = g0Var18;
        b bVar2 = b.VECTOR;
        g0 g0Var19 = new g0("DOUBLE_LIST", 18, 18, bVar2, m0Var);
        g0 g0Var20 = new g0("FLOAT_LIST", 19, 19, bVar2, m0Var2);
        g0 g0Var21 = new g0("INT64_LIST", 20, 20, bVar2, m0Var3);
        g0 g0Var22 = new g0("UINT64_LIST", 21, 21, bVar2, m0Var3);
        g0 g0Var23 = new g0("INT32_LIST", 22, 22, bVar2, m0Var4);
        g0 g0Var24 = new g0("FIXED64_LIST", 23, 23, bVar2, m0Var3);
        g0 g0Var25 = new g0("FIXED32_LIST", 24, 24, bVar2, m0Var4);
        g0 g0Var26 = new g0("BOOL_LIST", 25, 25, bVar2, m0Var5);
        g0 g0Var27 = new g0("STRING_LIST", 26, 26, bVar2, m0Var6);
        g0 g0Var28 = new g0("MESSAGE_LIST", 27, 27, bVar2, m0Var7);
        f7631e = g0Var28;
        g0 g0Var29 = new g0("BYTES_LIST", 28, 28, bVar2, m0Var8);
        g0 g0Var30 = new g0("UINT32_LIST", 29, 29, bVar2, m0Var4);
        g0 g0Var31 = new g0("ENUM_LIST", 30, 30, bVar2, m0Var9);
        g0 g0Var32 = new g0("SFIXED32_LIST", 31, 31, bVar2, m0Var4);
        g0 g0Var33 = new g0("SFIXED64_LIST", 32, 32, bVar2, m0Var3);
        g0 g0Var34 = new g0("SINT32_LIST", 33, 33, bVar2, m0Var4);
        g0 g0Var35 = new g0("SINT64_LIST", 34, 34, bVar2, m0Var3);
        b bVar3 = b.PACKED_VECTOR;
        g0 g0Var36 = new g0("DOUBLE_LIST_PACKED", 35, 35, bVar3, m0Var);
        f7632f = g0Var36;
        g0 g0Var37 = new g0("FLOAT_LIST_PACKED", 36, 36, bVar3, m0Var2);
        g0 g0Var38 = new g0("INT64_LIST_PACKED", 37, 37, bVar3, m0Var3);
        g0 g0Var39 = new g0("UINT64_LIST_PACKED", 38, 38, bVar3, m0Var3);
        g0 g0Var40 = new g0("INT32_LIST_PACKED", 39, 39, bVar3, m0Var4);
        g0 g0Var41 = new g0("FIXED64_LIST_PACKED", 40, 40, bVar3, m0Var3);
        g0 g0Var42 = new g0("FIXED32_LIST_PACKED", 41, 41, bVar3, m0Var4);
        g0 g0Var43 = new g0("BOOL_LIST_PACKED", 42, 42, bVar3, m0Var5);
        g0 g0Var44 = new g0("UINT32_LIST_PACKED", 43, 43, bVar3, m0Var4);
        g0 g0Var45 = new g0("ENUM_LIST_PACKED", 44, 44, bVar3, m0Var9);
        g0 g0Var46 = new g0("SFIXED32_LIST_PACKED", 45, 45, bVar3, m0Var4);
        g0 g0Var47 = new g0("SFIXED64_LIST_PACKED", 46, 46, bVar3, m0Var3);
        g0 g0Var48 = new g0("SINT32_LIST_PACKED", 47, 47, bVar3, m0Var4);
        g0 g0Var49 = new g0("SINT64_LIST_PACKED", 48, 48, bVar3, m0Var3);
        f7633g = g0Var49;
        g0 g0Var50 = new g0("GROUP_LIST", 49, 49, bVar2, m0Var7);
        f7634h = g0Var50;
        g0 g0Var51 = new g0("MAP", 50, 50, b.MAP, m0.f7712b);
        f7635i = g0Var51;
        f7637k = new g0[]{g0Var, g0Var2, g0Var3, g0Var4, g0Var5, g0Var6, g0Var7, g0Var8, g0Var9, g0Var10, g0Var11, g0Var12, g0Var13, g0Var14, g0Var15, g0Var16, g0Var17, g0Var18, g0Var19, g0Var20, g0Var21, g0Var22, g0Var23, g0Var24, g0Var25, g0Var26, g0Var27, g0Var28, g0Var29, g0Var30, g0Var31, g0Var32, g0Var33, g0Var34, g0Var35, g0Var36, g0Var37, g0Var38, g0Var39, g0Var40, g0Var41, g0Var42, g0Var43, g0Var44, g0Var45, g0Var46, g0Var47, g0Var48, g0Var49, g0Var50, g0Var51};
        g0[] g0VarArrValues = values();
        f7636j = new g0[g0VarArrValues.length];
        for (g0 g0Var52 : g0VarArrValues) {
            f7636j[g0Var52.f7638a] = g0Var52;
        }
    }

    private g0(String str, int i14, int i15, b bVar, m0 m0Var) {
        super(str, i14);
        this.f7638a = i15;
        this.f7639b = bVar;
        int i16 = a.f7640a[bVar.ordinal()];
        if (i16 == 1 || i16 == 2) {
            m0Var.getClass();
        }
        if (bVar == b.SCALAR) {
            int i17 = a.f7641b[m0Var.ordinal()];
        }
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) f7637k.clone();
    }
}
