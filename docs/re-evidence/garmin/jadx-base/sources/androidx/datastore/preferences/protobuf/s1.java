package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public class s1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s1 f6826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s1 f6827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s1 f6828e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final s1 f6829f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final s1 f6830g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final s1 f6831h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final s1 f6832i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final s1 f6833j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f6834k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f6835l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c f6836m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final d f6837n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final s1 f6838o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final s1 f6839p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final s1 f6840q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final s1 f6841r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final s1 f6842t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final s1 f6843v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ s1[] f6844w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1 f6845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6846b;

    public final enum a extends s1 {
        public a(String str, int i14, t1 t1Var, int i15) {
            super(str, i14, t1Var, i15);
        }
    }

    public final enum b extends s1 {
        public b(String str, int i14, t1 t1Var, int i15) {
            super(str, i14, t1Var, i15);
        }
    }

    public final enum c extends s1 {
        public c(String str, int i14, t1 t1Var, int i15) {
            super(str, i14, t1Var, i15);
        }
    }

    public final enum d extends s1 {
        public d(String str, int i14, t1 t1Var, int i15) {
            super(str, i14, t1Var, i15);
        }
    }

    static {
        s1 s1Var = new s1("DOUBLE", 0, t1.DOUBLE, 1);
        f6826c = s1Var;
        s1 s1Var2 = new s1("FLOAT", 1, t1.FLOAT, 5);
        f6827d = s1Var2;
        t1 t1Var = t1.LONG;
        s1 s1Var3 = new s1("INT64", 2, t1Var, 0);
        f6828e = s1Var3;
        s1 s1Var4 = new s1("UINT64", 3, t1Var, 0);
        f6829f = s1Var4;
        t1 t1Var2 = t1.INT;
        s1 s1Var5 = new s1("INT32", 4, t1Var2, 0);
        f6830g = s1Var5;
        s1 s1Var6 = new s1("FIXED64", 5, t1Var, 1);
        f6831h = s1Var6;
        s1 s1Var7 = new s1("FIXED32", 6, t1Var2, 5);
        f6832i = s1Var7;
        s1 s1Var8 = new s1("BOOL", 7, t1.BOOLEAN, 0);
        f6833j = s1Var8;
        a aVar = new a("STRING", 8, t1.STRING, 2);
        f6834k = aVar;
        t1 t1Var3 = t1.MESSAGE;
        b bVar = new b("GROUP", 9, t1Var3, 3);
        f6835l = bVar;
        c cVar = new c("MESSAGE", 10, t1Var3, 2);
        f6836m = cVar;
        d dVar = new d("BYTES", 11, t1.BYTE_STRING, 2);
        f6837n = dVar;
        s1 s1Var9 = new s1("UINT32", 12, t1Var2, 0);
        f6838o = s1Var9;
        s1 s1Var10 = new s1("ENUM", 13, t1.ENUM, 0);
        f6839p = s1Var10;
        s1 s1Var11 = new s1("SFIXED32", 14, t1Var2, 5);
        f6840q = s1Var11;
        s1 s1Var12 = new s1("SFIXED64", 15, t1Var, 1);
        f6841r = s1Var12;
        s1 s1Var13 = new s1("SINT32", 16, t1Var2, 0);
        f6842t = s1Var13;
        s1 s1Var14 = new s1("SINT64", 17, t1Var, 0);
        f6843v = s1Var14;
        f6844w = new s1[]{s1Var, s1Var2, s1Var3, s1Var4, s1Var5, s1Var6, s1Var7, s1Var8, aVar, bVar, cVar, dVar, s1Var9, s1Var10, s1Var11, s1Var12, s1Var13, s1Var14};
    }

    private s1(String str, int i14, t1 t1Var, int i15) {
        super(str, i14);
        this.f6845a = t1Var;
        this.f6846b = i15;
    }

    public static s1 valueOf(String str) {
        return (s1) Enum.valueOf(s1.class, str);
    }

    public static s1[] values() {
        return (s1[]) f6844w.clone();
    }
}
