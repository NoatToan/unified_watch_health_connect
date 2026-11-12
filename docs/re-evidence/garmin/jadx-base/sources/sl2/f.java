package sl2;

import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsl2/f;", "", "", "isProduction", "<init>", "(Ljava/lang/String;ILjava/lang/Boolean;)V", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f160022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f160023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f160024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f160025e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f160026f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f f160027g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f f160028h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final f f160029i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final f f160030j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final f f160031k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final f f160032l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final f f160033m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final f f160034n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ f[] f160035o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ w13.c f160036p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f160037a;

    static {
        f fVar = new f("INVALID", 0, null);
        f160022b = fVar;
        f fVar2 = new f("UNKNOWN", 1, null);
        f160023c = fVar2;
        Boolean bool = Boolean.FALSE;
        f fVar3 = new f("PN80T_ENG_SAMPLE", 2, bool);
        f160024d = fVar3;
        Boolean bool2 = Boolean.TRUE;
        f fVar4 = new f("PN80T", 3, bool2);
        f160025e = fVar4;
        f fVar5 = new f("PN81T_ENG_SAMPLE", 4, bool);
        f160026f = fVar5;
        f fVar6 = new f("PN81T", 5, bool2);
        f160027g = fVar6;
        f fVar7 = new f("PN80T_ENG_SAMPLE_PRH", 6, bool);
        f160028h = fVar7;
        f fVar8 = new f("PN80T_PRG", 7, bool2);
        f160029i = fVar8;
        f fVar9 = new f("PN81T_GFA", 8, bool2);
        f160030j = fVar9;
        f fVar10 = new f("SN100T_ENG_SAMPLE", 9, bool);
        f160031k = fVar10;
        f fVar11 = new f("SN100T", 10, bool2);
        f160032l = fVar11;
        f fVar12 = new f("SN220T_01Q", 11, bool2);
        f160033m = fVar12;
        f fVar13 = new f("SN220T_VXR", 12, bool2);
        f160034n = fVar13;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11, fVar12, fVar13};
        f160035o = fVarArr;
        f160036p = new w13.c(fVarArr);
    }

    private f(String str, int i14, Boolean bool) {
        super(str, i14);
        this.f160037a = bool;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f160035o.clone();
    }
}
