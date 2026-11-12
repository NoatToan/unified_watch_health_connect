package androidx.health.platform.client.proto;

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
public final class m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m0 f7712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m0 f7713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m0 f7714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m0 f7715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m0 f7716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m0 f7717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m0 f7718h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final m0 f7719i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final m0 f7720j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final m0 f7721k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ m0[] f7722l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7723a;

    static {
        m0 m0Var = new m0("VOID", 0, Void.class, Void.class, null);
        f7712b = m0Var;
        Class cls = Integer.TYPE;
        m0 m0Var2 = new m0("INT", 1, cls, Integer.class, 0);
        f7713c = m0Var2;
        m0 m0Var3 = new m0("LONG", 2, Long.TYPE, Long.class, 0L);
        f7714d = m0Var3;
        m0 m0Var4 = new m0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f7715e = m0Var4;
        m0 m0Var5 = new m0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f7716f = m0Var5;
        m0 m0Var6 = new m0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f7717g = m0Var6;
        m0 m0Var7 = new m0("STRING", 6, String.class, String.class, "");
        f7718h = m0Var7;
        m0 m0Var8 = new m0("BYTE_STRING", 7, i.class, i.class, i.f7657b);
        f7719i = m0Var8;
        m0 m0Var9 = new m0("ENUM", 8, cls, Integer.class, null);
        f7720j = m0Var9;
        m0 m0Var10 = new m0("MESSAGE", 9, Object.class, Object.class, null);
        f7721k = m0Var10;
        f7722l = new m0[]{m0Var, m0Var2, m0Var3, m0Var4, m0Var5, m0Var6, m0Var7, m0Var8, m0Var9, m0Var10};
    }

    private m0(String str, int i14, Class cls, Class cls2, Object obj) {
        super(str, i14);
        this.f7723a = obj;
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) f7722l.clone();
    }
}
