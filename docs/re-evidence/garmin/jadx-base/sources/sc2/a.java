package sc2;

import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'b' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsc2/a;", "", "Luc2/c;", "rateLimitGroup", "<init>", "(Ljava/lang/String;ILuc2/c;)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f158476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f158477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f158478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a[] f158479e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uc2.c f158480a;

    static {
        uc2.c cVar = uc2.c.DI;
        a aVar = new a("OAUTH1_GC", 0, cVar);
        f158476b = aVar;
        a aVar2 = new a("OAUTH2_DI", 1, cVar);
        f158477c = aVar2;
        a aVar3 = new a("OAUTH2_IT", 2, uc2.c.IT);
        f158478d = aVar3;
        f158479e = new a[]{aVar, aVar2, aVar3};
    }

    private a(String str, int i14, uc2.c cVar) {
        super(str, i14);
        this.f158480a = cVar;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f158479e.clone();
    }
}
