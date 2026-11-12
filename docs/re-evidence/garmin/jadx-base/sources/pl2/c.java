package pl2;

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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpl2/c;", "", "", "flag", "", "requiresPasscode", "<init>", "(Ljava/lang/String;IILjava/lang/Boolean;)V", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f138556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f138557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f138558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f138559f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f138560g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f138561h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f138562i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f138563j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f138564k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c f138565l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c f138566m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c f138567n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c f138568o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final c f138569p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final c f138570q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final c f138571r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final c f138572t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ c[] f138573v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f138574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f138575b;

    static {
        Boolean bool = Boolean.TRUE;
        c cVar = new c("FITPAY", 0, 8, bool);
        f138556c = cVar;
        c cVar2 = new c("UNION_PAY", 1, 9, bool);
        f138557d = cVar2;
        c cVar3 = new c("EXTENDED_WALLET_PROTOCOL", 2, 10, null);
        f138558e = cVar3;
        c cVar4 = new c("SUPPORTS_APDU_BATCH", 3, 11, null);
        f138559f = cVar4;
        c cVar5 = new c("SUPPORTS_APDU_CACHE", 4, 12, null);
        f138560g = cVar5;
        c cVar6 = new c("APDU_BATCH_MAX_SIZE_1", 5, 13, null);
        f138561h = cVar6;
        c cVar7 = new c("APDU_BATCH_MAX_SIZE_2", 6, 14, null);
        f138562i = cVar7;
        c cVar8 = new c("APDU_BATCH_MAX_SIZE_3", 7, 15, null);
        f138563j = cVar8;
        c cVar9 = new c("SUPPORTS_NO_PASSCODE", 8, 16, null);
        f138564k = cVar9;
        Boolean bool2 = Boolean.FALSE;
        c cVar10 = new c("NXP", 9, 17, bool2);
        f138565l = cVar10;
        c cVar11 = new c("FELICA", 10, 18, bool2);
        f138566m = cVar11;
        c cVar12 = new c("EASYCARD", 11, 19, bool2);
        f138567n = cVar12;
        c cVar13 = new c("IPASS", 12, 20, bool2);
        f138568o = cVar13;
        c cVar14 = new c("SNOWBALL", 13, 21, bool2);
        f138569p = cVar14;
        c cVar15 = new c("TMONEY", 14, 22, bool2);
        f138570q = cVar15;
        c cVar16 = new c("RABBIT", 15, 23, bool2);
        f138571r = cVar16;
        c cVar17 = new c("M2GO", 16, 31, bool2);
        f138572t = cVar17;
        f138573v = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16, cVar17};
    }

    private c(String str, int i14, int i15, Boolean bool) {
        super(str, i14);
        this.f138574a = i15;
        this.f138575b = bool;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f138573v.clone();
    }
}
