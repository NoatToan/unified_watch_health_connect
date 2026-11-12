package m52;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'f' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lm52/a;", "", "", TtmlNode.ATTR_ID, "", "isTimeStep", "<init>", "(Ljava/lang/String;IIZ)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2219a f116647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f116648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f116649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f116650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f116651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f116652h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f116653i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f116654j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f116655k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f116656l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f116657m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f116658n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f116659o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ a[] f116660p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f116661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f116662b;

    static {
        a aVar = new a("LAP_BUTTON", 0, 1, false, 2, null);
        f116648d = aVar;
        a aVar2 = new a("TIME", 1, 2, true);
        f116649e = aVar2;
        int i14 = 2;
        p005kotlin.jvm.internal.j jVar = null;
        boolean z14 = false;
        a aVar3 = new a("DISTANCE", 2, 3, z14, i14, jVar);
        f116650f = aVar3;
        a aVar4 = new a("CALORIES", 3, 4, z14, i14, jVar);
        f116651g = aVar4;
        int i15 = 5;
        a aVar5 = new a("POWER", 4, i15, z14, i14, jVar);
        f116652h = aVar5;
        int i16 = 6;
        a aVar6 = new a("HEART_RATE", i15, i16, false, 2, null);
        f116653i = aVar6;
        a aVar7 = new a("ITERATIONS", i16, 7, false, 2, null);
        f116654j = aVar7;
        a aVar8 = new a("FIXED_REST", 7, 8, true);
        f116655k = aVar8;
        a aVar9 = new a("FIXED_REPETITION", 8, 9, true);
        f116656l = aVar9;
        int i17 = 10;
        a aVar10 = new a("REPS", 9, i17, false, 2, null);
        f116657m = aVar10;
        a aVar11 = new a("INVALID", i17, 11, false, 2, null);
        f116658n = aVar11;
        a aVar12 = new a("REPETITION_SWIM_CSS_OFFSET", 11, 16, true);
        f116659o = aVar12;
        f116660p = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12};
        f116647c = new C2219a(null);
    }

    public /* synthetic */ a(String str, int i14, int i15, boolean z14, int i16, p005kotlin.jvm.internal.j jVar) {
        this(str, i14, i15, (i16 & 2) != 0 ? false : z14);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f116660p.clone();
    }

    /* JADX INFO: renamed from: m52.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lm52/a$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2219a {
        public /* synthetic */ C2219a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C2219a() {
        }
    }

    private a(String str, int i14, int i15, boolean z14) {
        super(str, i14);
        this.f116661a = i15;
        this.f116662b = z14;
    }
}
