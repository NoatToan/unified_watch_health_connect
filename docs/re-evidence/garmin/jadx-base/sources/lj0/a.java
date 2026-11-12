package lj0;

import com.google.mlkit.common.MlKitException;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'h' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes8.dex */
public final class a implements g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f112935h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f112936i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f112937j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f112938k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f112939l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f112940m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f112941n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ a[] f112942o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f112943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f112944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f112945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f112946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f112947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f112948f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f112949g;

    static {
        d dVar = d.POST;
        d dVar2 = d.PUT;
        a aVar = new a("updateActivity", 0, dVar, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, "/activity-service/activity/{0}", 1, dVar2);
        f112935h = aVar;
        a aVar2 = new a("deleteActivityImage", 1, dVar, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, "/activity-service/activity/{0}/image/{1}", 2, d.DELETE);
        f112936i = aVar2;
        a aVar3 = new a("updateActivityImageOrder", 2, dVar, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, "/activity-service/activity/{0}/images/order", 1, dVar2);
        f112937j = aVar3;
        d dVar3 = d.GET;
        a aVar4 = new a("getActivitySummary", 3, dVar3, 200, "/activity-service/activity/{0}", 1);
        f112938k = aVar4;
        a aVar5 = new a("createManualActivity", 4, dVar, 200, "/activity-service/activity", 0);
        f112939l = aVar5;
        a aVar6 = new a("getActivitySplits", 5, dVar3, 200, "/activity-service/activity/{0}/laps", 1);
        f112940m = aVar6;
        a aVar7 = new a("getWeatherForActivity", 6, dVar3, 200, "/weather-service/weather/{0}", 1);
        a aVar8 = new a("excludeActivityFromPowerCurve", 7, dVar, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, "/activity-service/activity/{0}/powerCurve", 1, d.PATCH);
        f112941n = aVar8;
        f112942o = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8};
    }

    private a(String str, int i14, d dVar, int i15, String str2, int i16) {
        super(str, i14);
        this.f112949g = "application/json";
        this.f112946d = dVar;
        this.f112944b = new int[]{i15};
        this.f112943a = str2;
        this.f112945c = i16;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f112942o.clone();
    }

    @Override // lj0.g
    public final byte[] a() {
        return null;
    }

    @Override // lj0.g
    public final d b() {
        return this.f112946d;
    }

    @Override // lj0.g
    public final int[] c() {
        return this.f112944b;
    }

    @Override // lj0.g
    public final int d() {
        return this.f112945c;
    }

    @Override // lj0.g
    public final e.b e() {
        return null;
    }

    @Override // lj0.g
    public final d f() {
        return this.f112947e;
    }

    @Override // lj0.g
    public final String g() {
        return this.f112948f;
    }

    @Override // lj0.g
    public final String getContentType() {
        return this.f112949g;
    }

    @Override // lj0.g
    public final String getURI() {
        return this.f112943a;
    }

    private a(String str, int i14, d dVar, int i15, String str2, int i16, d dVar2) {
        this(str, i14, dVar, i15, str2, i16);
        this.f112947e = dVar2;
    }
}
