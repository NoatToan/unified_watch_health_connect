package kx2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

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
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0015\b\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkx2/g;", "", "Ljc2/c;", "errorPriority", "<init>", "(Ljava/lang/String;ILjc2/c;)V", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f107144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f107145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f107146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f107147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f107148f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g f107149g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f107150h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g f107151i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final g f107152j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final g f107153k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final g f107154l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final g f107155m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final g f107156n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ g[] f107157o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jc2.c f107158a;

    static {
        g gVar = new g("GHS_COMPLETED_SUCCESS", 0, null, 1, null);
        f107144b = gVar;
        jc2.c cVar = jc2.c.HIGH;
        g gVar2 = new g("GHS_FIT_FILE_INVALID", 1, cVar);
        f107145c = gVar2;
        g gVar3 = new g("GHS_FIT_FILE_TYPE_UNSUPPORTED", 2, cVar);
        f107146d = gVar3;
        jc2.c cVar2 = jc2.c.NORMAL;
        g gVar4 = new g("GHS_NO_CONSENT", 3, cVar2);
        f107147e = gVar4;
        g gVar5 = new g("GHS_PROCESSING", 4, null, 1, null);
        f107148f = gVar5;
        g gVar6 = new g("GHS_PROCESSING_ERROR", 5, cVar);
        f107149g = gVar6;
        g gVar7 = new g("GHS_PROCESSING_TIMEOUT", 6, cVar);
        f107150h = gVar7;
        g gVar8 = new g("GHS_SAMD_ID_MISMATCH", 7, cVar2);
        f107151i = gVar8;
        g gVar9 = new g("GHS_SERVER_ERROR", 8, cVar);
        f107152j = gVar9;
        g gVar10 = new g("NETWORK_EXCEPTION", 9, cVar2);
        f107153k = gVar10;
        g gVar11 = new g("NONE", 10, null, 1, null);
        f107154l = gVar11;
        g gVar12 = new g("UNKNOWN_ERROR", 11, cVar);
        f107155m = gVar12;
        g gVar13 = new g("UPLOADING_TO_GHS", 12, null, 1, null);
        f107156n = gVar13;
        f107157o = new g[]{gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11, gVar12, gVar13};
    }

    public /* synthetic */ g(String str, int i14, jc2.c cVar, int i15, j jVar) {
        this(str, i14, (i15 & 1) != 0 ? null : cVar);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f107157o.clone();
    }

    private g(String str, int i14, jc2.c cVar) {
        super(str, i14);
        this.f107158a = cVar;
    }
}
