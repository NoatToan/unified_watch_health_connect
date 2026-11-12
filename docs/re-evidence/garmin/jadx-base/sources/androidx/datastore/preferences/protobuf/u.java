package androidx.datastore.preferences.protobuf;

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
public final class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f6882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u f6883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u f6884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final u f6885f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final u f6886g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final u f6887h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final u f6888i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final u[] f6889j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ u[] f6890k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f6892b;

    /* JADX INFO: Fake field, exist only in values array */
    u EF0;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f6894b;

        static {
            int[] iArr = new int[a0.values().length];
            f6894b = iArr;
            try {
                iArr[a0.f6671i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6894b[a0.f6673k.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6894b[a0.f6670h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f6893a = iArr2;
            try {
                iArr2[b.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6893a[b.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6893a[b.SCALAR.ordinal()] = 3;
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
        public final boolean f6900a;

        b(boolean z14) {
            this.f6900a = z14;
        }
    }

    static {
        b bVar = b.SCALAR;
        a0 a0Var = a0.f6668f;
        u uVar = new u("DOUBLE", 0, 0, bVar, a0Var);
        a0 a0Var2 = a0.f6667e;
        u uVar2 = new u("FLOAT", 1, 1, bVar, a0Var2);
        a0 a0Var3 = a0.f6666d;
        u uVar3 = new u("INT64", 2, 2, bVar, a0Var3);
        u uVar4 = new u("UINT64", 3, 3, bVar, a0Var3);
        a0 a0Var4 = a0.f6665c;
        u uVar5 = new u("INT32", 4, 4, bVar, a0Var4);
        u uVar6 = new u("FIXED64", 5, 5, bVar, a0Var3);
        u uVar7 = new u("FIXED32", 6, 6, bVar, a0Var4);
        a0 a0Var5 = a0.f6669g;
        u uVar8 = new u("BOOL", 7, 7, bVar, a0Var5);
        a0 a0Var6 = a0.f6670h;
        u uVar9 = new u("STRING", 8, 8, bVar, a0Var6);
        a0 a0Var7 = a0.f6673k;
        u uVar10 = new u("MESSAGE", 9, 9, bVar, a0Var7);
        f6882c = uVar10;
        a0 a0Var8 = a0.f6671i;
        u uVar11 = new u("BYTES", 10, 10, bVar, a0Var8);
        u uVar12 = new u("UINT32", 11, 11, bVar, a0Var4);
        a0 a0Var9 = a0.f6672j;
        u uVar13 = new u("ENUM", 12, 12, bVar, a0Var9);
        u uVar14 = new u("SFIXED32", 13, 13, bVar, a0Var4);
        u uVar15 = new u("SFIXED64", 14, 14, bVar, a0Var3);
        u uVar16 = new u("SINT32", 15, 15, bVar, a0Var4);
        u uVar17 = new u("SINT64", 16, 16, bVar, a0Var3);
        u uVar18 = new u("GROUP", 17, 17, bVar, a0Var7);
        f6883d = uVar18;
        b bVar2 = b.VECTOR;
        u uVar19 = new u("DOUBLE_LIST", 18, 18, bVar2, a0Var);
        u uVar20 = new u("FLOAT_LIST", 19, 19, bVar2, a0Var2);
        u uVar21 = new u("INT64_LIST", 20, 20, bVar2, a0Var3);
        u uVar22 = new u("UINT64_LIST", 21, 21, bVar2, a0Var3);
        u uVar23 = new u("INT32_LIST", 22, 22, bVar2, a0Var4);
        u uVar24 = new u("FIXED64_LIST", 23, 23, bVar2, a0Var3);
        u uVar25 = new u("FIXED32_LIST", 24, 24, bVar2, a0Var4);
        u uVar26 = new u("BOOL_LIST", 25, 25, bVar2, a0Var5);
        u uVar27 = new u("STRING_LIST", 26, 26, bVar2, a0Var6);
        u uVar28 = new u("MESSAGE_LIST", 27, 27, bVar2, a0Var7);
        f6884e = uVar28;
        u uVar29 = new u("BYTES_LIST", 28, 28, bVar2, a0Var8);
        u uVar30 = new u("UINT32_LIST", 29, 29, bVar2, a0Var4);
        u uVar31 = new u("ENUM_LIST", 30, 30, bVar2, a0Var9);
        u uVar32 = new u("SFIXED32_LIST", 31, 31, bVar2, a0Var4);
        u uVar33 = new u("SFIXED64_LIST", 32, 32, bVar2, a0Var3);
        u uVar34 = new u("SINT32_LIST", 33, 33, bVar2, a0Var4);
        u uVar35 = new u("SINT64_LIST", 34, 34, bVar2, a0Var3);
        b bVar3 = b.PACKED_VECTOR;
        u uVar36 = new u("DOUBLE_LIST_PACKED", 35, 35, bVar3, a0Var);
        f6885f = uVar36;
        u uVar37 = new u("FLOAT_LIST_PACKED", 36, 36, bVar3, a0Var2);
        u uVar38 = new u("INT64_LIST_PACKED", 37, 37, bVar3, a0Var3);
        u uVar39 = new u("UINT64_LIST_PACKED", 38, 38, bVar3, a0Var3);
        u uVar40 = new u("INT32_LIST_PACKED", 39, 39, bVar3, a0Var4);
        u uVar41 = new u("FIXED64_LIST_PACKED", 40, 40, bVar3, a0Var3);
        u uVar42 = new u("FIXED32_LIST_PACKED", 41, 41, bVar3, a0Var4);
        u uVar43 = new u("BOOL_LIST_PACKED", 42, 42, bVar3, a0Var5);
        u uVar44 = new u("UINT32_LIST_PACKED", 43, 43, bVar3, a0Var4);
        u uVar45 = new u("ENUM_LIST_PACKED", 44, 44, bVar3, a0Var9);
        u uVar46 = new u("SFIXED32_LIST_PACKED", 45, 45, bVar3, a0Var4);
        u uVar47 = new u("SFIXED64_LIST_PACKED", 46, 46, bVar3, a0Var3);
        u uVar48 = new u("SINT32_LIST_PACKED", 47, 47, bVar3, a0Var4);
        u uVar49 = new u("SINT64_LIST_PACKED", 48, 48, bVar3, a0Var3);
        f6886g = uVar49;
        u uVar50 = new u("GROUP_LIST", 49, 49, bVar2, a0Var7);
        f6887h = uVar50;
        u uVar51 = new u("MAP", 50, 50, b.MAP, a0.f6664b);
        f6888i = uVar51;
        f6890k = new u[]{uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, uVar9, uVar10, uVar11, uVar12, uVar13, uVar14, uVar15, uVar16, uVar17, uVar18, uVar19, uVar20, uVar21, uVar22, uVar23, uVar24, uVar25, uVar26, uVar27, uVar28, uVar29, uVar30, uVar31, uVar32, uVar33, uVar34, uVar35, uVar36, uVar37, uVar38, uVar39, uVar40, uVar41, uVar42, uVar43, uVar44, uVar45, uVar46, uVar47, uVar48, uVar49, uVar50, uVar51};
        u[] uVarArrValues = values();
        f6889j = new u[uVarArrValues.length];
        for (u uVar52 : uVarArrValues) {
            f6889j[uVar52.f6891a] = uVar52;
        }
    }

    private u(String str, int i14, int i15, b bVar, a0 a0Var) {
        super(str, i14);
        this.f6891a = i15;
        this.f6892b = bVar;
        int i16 = a.f6893a[bVar.ordinal()];
        if (i16 == 1 || i16 == 2) {
            a0Var.getClass();
        }
        if (bVar == b.SCALAR) {
            int i17 = a.f6894b[a0Var.ordinal()];
        }
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f6890k.clone();
    }
}
