package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a0 f6664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f6665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a0 f6666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a0 f6667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a0 f6668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a0 f6669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a0 f6670h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a0 f6671i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a0 f6672j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a0 f6673k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ a0[] f6674l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6675a;

    static {
        a0 a0Var = new a0("VOID", 0, Void.class, Void.class, null);
        f6664b = a0Var;
        Class cls = Integer.TYPE;
        a0 a0Var2 = new a0("INT", 1, cls, Integer.class, 0);
        f6665c = a0Var2;
        a0 a0Var3 = new a0("LONG", 2, Long.TYPE, Long.class, 0L);
        f6666d = a0Var3;
        a0 a0Var4 = new a0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f6667e = a0Var4;
        a0 a0Var5 = new a0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f6668f = a0Var5;
        a0 a0Var6 = new a0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f6669g = a0Var6;
        a0 a0Var7 = new a0("STRING", 6, String.class, String.class, "");
        f6670h = a0Var7;
        a0 a0Var8 = new a0("BYTE_STRING", 7, h.class, h.class, h.f6707b);
        f6671i = a0Var8;
        a0 a0Var9 = new a0("ENUM", 8, cls, Integer.class, null);
        f6672j = a0Var9;
        a0 a0Var10 = new a0("MESSAGE", 9, Object.class, Object.class, null);
        f6673k = a0Var10;
        f6674l = new a0[]{a0Var, a0Var2, a0Var3, a0Var4, a0Var5, a0Var6, a0Var7, a0Var8, a0Var9, a0Var10};
    }

    private a0(String str, int i14, Class cls, Class cls2, Object obj) {
        super(str, i14);
        this.f6675a = obj;
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) f6674l.clone();
    }
}
