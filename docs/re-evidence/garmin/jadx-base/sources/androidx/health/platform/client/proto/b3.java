package androidx.health.platform.client.proto;

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
public class b3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b3 f7540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b3 f7541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b3 f7542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b3 f7543f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b3 f7544g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b3 f7545h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b3 f7546i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b3 f7547j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f7548k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f7549l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c f7550m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final d f7551n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b3 f7552o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b3 f7553p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b3 f7554q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b3 f7555r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b3 f7556t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b3 f7557v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ b3[] f7558w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c3 f7559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7560b;

    public final enum a extends b3 {
        public a(String str, int i14, c3 c3Var, int i15) {
            super(str, i14, c3Var, i15);
        }
    }

    public final enum b extends b3 {
        public b(String str, int i14, c3 c3Var, int i15) {
            super(str, i14, c3Var, i15);
        }
    }

    public final enum c extends b3 {
        public c(String str, int i14, c3 c3Var, int i15) {
            super(str, i14, c3Var, i15);
        }
    }

    public final enum d extends b3 {
        public d(String str, int i14, c3 c3Var, int i15) {
            super(str, i14, c3Var, i15);
        }
    }

    static {
        b3 b3Var = new b3("DOUBLE", 0, c3.DOUBLE, 1);
        f7540c = b3Var;
        b3 b3Var2 = new b3("FLOAT", 1, c3.FLOAT, 5);
        f7541d = b3Var2;
        c3 c3Var = c3.LONG;
        b3 b3Var3 = new b3("INT64", 2, c3Var, 0);
        f7542e = b3Var3;
        b3 b3Var4 = new b3("UINT64", 3, c3Var, 0);
        f7543f = b3Var4;
        c3 c3Var2 = c3.INT;
        b3 b3Var5 = new b3("INT32", 4, c3Var2, 0);
        f7544g = b3Var5;
        b3 b3Var6 = new b3("FIXED64", 5, c3Var, 1);
        f7545h = b3Var6;
        b3 b3Var7 = new b3("FIXED32", 6, c3Var2, 5);
        f7546i = b3Var7;
        b3 b3Var8 = new b3("BOOL", 7, c3.BOOLEAN, 0);
        f7547j = b3Var8;
        a aVar = new a("STRING", 8, c3.STRING, 2);
        f7548k = aVar;
        c3 c3Var3 = c3.MESSAGE;
        b bVar = new b("GROUP", 9, c3Var3, 3);
        f7549l = bVar;
        c cVar = new c("MESSAGE", 10, c3Var3, 2);
        f7550m = cVar;
        d dVar = new d("BYTES", 11, c3.BYTE_STRING, 2);
        f7551n = dVar;
        b3 b3Var9 = new b3("UINT32", 12, c3Var2, 0);
        f7552o = b3Var9;
        b3 b3Var10 = new b3("ENUM", 13, c3.ENUM, 0);
        f7553p = b3Var10;
        b3 b3Var11 = new b3("SFIXED32", 14, c3Var2, 5);
        f7554q = b3Var11;
        b3 b3Var12 = new b3("SFIXED64", 15, c3Var, 1);
        f7555r = b3Var12;
        b3 b3Var13 = new b3("SINT32", 16, c3Var2, 0);
        f7556t = b3Var13;
        b3 b3Var14 = new b3("SINT64", 17, c3Var, 0);
        f7557v = b3Var14;
        f7558w = new b3[]{b3Var, b3Var2, b3Var3, b3Var4, b3Var5, b3Var6, b3Var7, b3Var8, aVar, bVar, cVar, dVar, b3Var9, b3Var10, b3Var11, b3Var12, b3Var13, b3Var14};
    }

    private b3(String str, int i14, c3 c3Var, int i15) {
        super(str, i14);
        this.f7559a = c3Var;
        this.f7560b = i15;
    }

    public static b3 valueOf(String str) {
        return (b3) Enum.valueOf(b3.class, str);
    }

    public static b3[] values() {
        return (b3[]) f7558w.clone();
    }
}
