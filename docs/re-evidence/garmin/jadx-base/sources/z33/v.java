package z33;

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
/* JADX INFO: loaded from: classes3.dex */
public class v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f202248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f202249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v f202250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final v f202251f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v f202252g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v f202253h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final v f202254i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final v f202255j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f202256k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f202257l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c f202258m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final d f202259n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final v f202260o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final v f202261p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final v f202262q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final v f202263r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final v f202264t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final v f202265v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ v[] f202266w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f202267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f202268b;

    public static enum a extends v {
        public a(String str, int i14, w wVar, int i15) {
            super(str, i14, wVar, i15);
        }
    }

    public static enum b extends v {
        public b(String str, int i14, w wVar, int i15) {
            super(str, i14, wVar, i15);
        }

        @Override // z33.v
        public final boolean a() {
            return false;
        }
    }

    public static enum c extends v {
        public c(String str, int i14, w wVar, int i15) {
            super(str, i14, wVar, i15);
        }

        @Override // z33.v
        public final boolean a() {
            return false;
        }
    }

    public static enum d extends v {
        public d(String str, int i14, w wVar, int i15) {
            super(str, i14, wVar, i15);
        }

        @Override // z33.v
        public final boolean a() {
            return false;
        }
    }

    static {
        v vVar = new v("DOUBLE", 0, w.DOUBLE, 1);
        f202248c = vVar;
        v vVar2 = new v("FLOAT", 1, w.FLOAT, 5);
        f202249d = vVar2;
        w wVar = w.LONG;
        v vVar3 = new v("INT64", 2, wVar, 0);
        f202250e = vVar3;
        v vVar4 = new v("UINT64", 3, wVar, 0);
        f202251f = vVar4;
        w wVar2 = w.INT;
        v vVar5 = new v("INT32", 4, wVar2, 0);
        f202252g = vVar5;
        v vVar6 = new v("FIXED64", 5, wVar, 1);
        f202253h = vVar6;
        v vVar7 = new v("FIXED32", 6, wVar2, 5);
        f202254i = vVar7;
        v vVar8 = new v("BOOL", 7, w.BOOLEAN, 0);
        f202255j = vVar8;
        a aVar = new a("STRING", 8, w.STRING, 2);
        f202256k = aVar;
        w wVar3 = w.MESSAGE;
        b bVar = new b("GROUP", 9, wVar3, 3);
        f202257l = bVar;
        c cVar = new c("MESSAGE", 10, wVar3, 2);
        f202258m = cVar;
        d dVar = new d("BYTES", 11, w.BYTE_STRING, 2);
        f202259n = dVar;
        v vVar9 = new v("UINT32", 12, wVar2, 0);
        f202260o = vVar9;
        v vVar10 = new v("ENUM", 13, w.ENUM, 0);
        f202261p = vVar10;
        v vVar11 = new v("SFIXED32", 14, wVar2, 5);
        f202262q = vVar11;
        v vVar12 = new v("SFIXED64", 15, wVar, 1);
        f202263r = vVar12;
        v vVar13 = new v("SINT32", 16, wVar2, 0);
        f202264t = vVar13;
        v vVar14 = new v("SINT64", 17, wVar, 0);
        f202265v = vVar14;
        f202266w = new v[]{vVar, vVar2, vVar3, vVar4, vVar5, vVar6, vVar7, vVar8, aVar, bVar, cVar, dVar, vVar9, vVar10, vVar11, vVar12, vVar13, vVar14};
    }

    private v(String str, int i14, w wVar, int i15) {
        super(str, i14);
        this.f202267a = wVar;
        this.f202268b = i15;
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f202266w.clone();
    }

    public boolean a() {
        return !(this instanceof a);
    }
}
