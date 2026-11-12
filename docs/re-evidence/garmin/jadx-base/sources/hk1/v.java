package hk1;

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
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B%\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lhk1/v;", "", "", "appName", "", "isPlatformApplication", "disableInChina", "<init>", "(Ljava/lang/String;ILjava/lang/String;ZZ)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f84198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v f84199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final v f84200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v f84201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ v[] f84202h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ w13.c f84203i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f84205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f84206c;

    static {
        boolean z14 = false;
        v vVar = new v("OFFICE_365", 0, "Microsoft Office 365", false, z14, 2, null);
        f84198d = vVar;
        boolean z15 = false;
        v vVar2 = new v("MY_FITNESS_PAL", 1, "MyFitnessPal", z14, z15, 6, null);
        f84199e = vVar2;
        v vVar3 = new v("STRAVA", 2, "Strava", z15, false, 6, null);
        f84200f = vVar3;
        v vVar4 = new v("GOOGLE_HEALTH_CONNECT", 3, "Health Connect", true, false, 4, null);
        f84201g = vVar4;
        v[] vVarArr = {vVar, vVar2, vVar3, vVar4};
        f84202h = vVarArr;
        f84203i = new w13.c(vVarArr);
    }

    public /* synthetic */ v(String str, int i14, String str2, boolean z14, boolean z15, int i15, p005kotlin.jvm.internal.j jVar) {
        this(str, i14, str2, (i15 & 2) != 0 ? false : z14, (i15 & 4) != 0 ? true : z15);
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f84202h.clone();
    }

    private v(String str, int i14, String str2, boolean z14, boolean z15) {
        super(str, i14);
        this.f84204a = str2;
        this.f84205b = z14;
        this.f84206c = z15;
    }
}
