package ok2;

import p005kotlin.Metadata;

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
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lok2/e;", "", "Lok2/e$a;", "cause", "", "wasFileAttempted", "<init>", "(Ljava/lang/String;ILok2/e$a;Z)V", "a", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {
    public static final e A;
    public static final e B;
    public static final e C;

    @x
    public static final e D;

    @x
    public static final e E;

    @x
    public static final e F;

    @x
    public static final e I;
    public static final /* synthetic */ e[] P;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @x
    public static final e f132635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @x
    public static final e f132636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @x
    public static final e f132637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @x
    public static final e f132638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @x
    public static final e f132639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @x
    public static final e f132640h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f132641i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e f132642j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final e f132643k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @x
    public static final e f132644l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final e f132645m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final e f132646n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final e f132647o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final e f132648p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final e f132649q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final e f132650r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final e f132651t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final e f132652v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final e f132653w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @x
    public static final e f132654x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @x
    public static final e f132655y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final e f132656z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f132657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f132658b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lok2/e$a;", "", "<init>", "(Ljava/lang/String;I)V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        DEVICE,
        SERVER,
        APP,
        APP_EXPECTED,
        DEVICE_EXPECTED,
        APP_INTERRUPT,
        DEVICE_INTERRUPT;

        /* JADX INFO: renamed from: ok2.e$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C2520a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f132667a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.DEVICE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.DEVICE_EXPECTED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.DEVICE_INTERRUPT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.SERVER.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.APP.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.APP_EXPECTED.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.APP_INTERRUPT.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f132667a = iArr;
            }
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f132668a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.DEVICE_INTERRUPT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.APP_INTERRUPT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f132668a = iArr;
        }
    }

    static {
        a aVar = a.DEVICE_INTERRUPT;
        e eVar = new e("DEVICE_NOT_CONNECTED", 0, aVar, false, 2, null);
        f132635c = eVar;
        int i14 = 2;
        p005kotlin.jvm.internal.j jVar = null;
        boolean z14 = false;
        e eVar2 = new e("DEVICE_CONNECTION_LOST", 1, aVar, z14, i14, jVar);
        f132636d = eVar2;
        e eVar3 = new e("DEVICE_IS_BUSY", 2, aVar, z14, i14, jVar);
        f132637e = eVar3;
        e eVar4 = new e("DEVICE_INTERRUPTED", 3, aVar, z14, i14, jVar);
        f132638f = eVar4;
        a aVar2 = a.APP_INTERRUPT;
        int i15 = 2;
        p005kotlin.jvm.internal.j jVar2 = null;
        boolean z15 = false;
        e eVar5 = new e("APP_INTERRUPTED", 4, aVar2, z15, i15, jVar2);
        f132639g = eVar5;
        e eVar6 = new e("INACTIVITY_TIMEOUT", 5, aVar2, z15, i15, jVar2);
        f132640h = eVar6;
        a aVar3 = a.APP_EXPECTED;
        e eVar7 = new e("SKIPPED", 6, aVar3, false);
        f132641i = eVar7;
        a aVar4 = a.SERVER;
        e eVar8 = new e("RESOURCE_UNAVAILABLE", 7, aVar4, false);
        f132642j = eVar8;
        e eVar9 = new e("NETWORK_UNAVAILABLE", 8, aVar3, eVar8.f132658b);
        f132643k = eVar9;
        a aVar5 = a.APP;
        int i16 = 2;
        p005kotlin.jvm.internal.j jVar3 = null;
        boolean z16 = false;
        e eVar10 = new e("INTERNAL_ERROR", 9, aVar5, z16, i16, jVar3);
        f132644l = eVar10;
        e eVar11 = new e("AGENT_INTERNAL_ERROR", 10, aVar5, false, 2, null);
        f132645m = eVar11;
        a aVar6 = a.DEVICE;
        e eVar12 = new e("DEVICE_FAILED_TRANSFER", 11, aVar6, z16, i16, jVar3);
        f132646n = eVar12;
        a aVar7 = a.DEVICE_EXPECTED;
        e eVar13 = new e("DATA_SPECIFIC_ERROR", 12, aVar7, z16, i16, jVar3);
        f132647o = eVar13;
        e eVar14 = new e("DEVICE_DISABLED_ITEM", 13, aVar7, false);
        f132648p = eVar14;
        e eVar15 = new e("DEVICE_UNKNOWN_ITEM", 14, aVar6, false, 2, null);
        f132649q = eVar15;
        e eVar16 = new e("LEGACY_IMPLEMENTATION_FAILURE", 15, aVar3, z16, i16, jVar3);
        f132650r = eVar16;
        e eVar17 = new e("SOURCE_LIST_FILES_FAILED", 16, aVar4, z16, i16, jVar3);
        f132651t = eVar17;
        e eVar18 = new e("SOURCE_FAILED", 17, aVar4, z16, i16, jVar3);
        f132652v = eVar18;
        int i17 = 2;
        p005kotlin.jvm.internal.j jVar4 = null;
        boolean z17 = false;
        e eVar19 = new e("FILE_NOT_SUPPORTED", 18, aVar7, z17, i17, jVar4);
        f132653w = eVar19;
        e eVar20 = new e("NO_SPACE", 19, aVar7, z17, i17, jVar4);
        f132654x = eVar20;
        e eVar21 = new e("DEVICE_LIST_FILES_FAILED", 20, aVar6, false, 2, null);
        f132655y = eVar21;
        e eVar22 = new e("DESTINATION_LOAD_FAILED", 21, aVar4, z16, i16, jVar3);
        f132656z = eVar22;
        e eVar23 = new e("DESTINATION_FAILED", 22, aVar4, z16, i16, jVar3);
        A = eVar23;
        e eVar24 = new e("DESTINATION_TIMEOUT", 23, aVar4, z16, i16, jVar3);
        B = eVar24;
        e eVar25 = new e("CONSENT_NOT_GRANTED", 24, aVar3, z16, i16, jVar3);
        C = eVar25;
        e eVar26 = new e("ARCHIVED_BY_DEVICE", 25, aVar7, z17, i17, jVar4);
        D = eVar26;
        e eVar27 = new e("CANCELLED_BY_APP", 26, aVar3, z16, i16, jVar3);
        E = eVar27;
        e eVar28 = new e("CANCELLED_BY_DEVICE", 27, aVar, false, 2, null);
        F = eVar28;
        e eVar29 = new e("DEVICE_REMOVED", 28, aVar2, z15, 2, null);
        I = eVar29;
        P = new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11, eVar12, eVar13, eVar14, eVar15, eVar16, eVar17, eVar18, eVar19, eVar20, eVar21, eVar22, eVar23, eVar24, eVar25, eVar26, eVar27, eVar28, eVar29};
    }

    public /* synthetic */ e(String str, int i14, a aVar, boolean z14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(str, i14, aVar, (i15 & 2) != 0 ? true : z14);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) P.clone();
    }

    public final boolean a() {
        int i14 = b.f132668a[this.f132657a.ordinal()];
        return i14 == 1 || i14 == 2;
    }

    private e(String str, int i14, a aVar, boolean z14) {
        super(str, i14);
        this.f132657a = aVar;
        this.f132658b = z14;
    }
}
