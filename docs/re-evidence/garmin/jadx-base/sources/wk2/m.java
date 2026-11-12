package wk2;

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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lwk2/m;", "", "Lwk2/h;", "direction", "<init>", "(Ljava/lang/String;ILwk2/h;)V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f185862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f185863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f185864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f185865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m f185866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m f185867g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ m[] f185868h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f185869a;

    static {
        h hVar = h.PHONE_TO_DEVICE;
        m mVar = new m("CACHE", 0, hVar);
        f185862b = mVar;
        m mVar2 = new m("APP_DOWNLOAD", 1, hVar);
        f185863c = mVar2;
        m mVar3 = new m("DOWNLOAD_AGENT", 2, hVar);
        f185864d = mVar3;
        h hVar2 = h.DEVICE_TO_PHONE;
        m mVar4 = new m("UPLOAD_AGENT", 3, hVar2);
        f185865e = mVar4;
        m mVar5 = new m("APP_UPLOAD", 4, hVar2);
        f185866f = mVar5;
        m mVar6 = new m("DEVICE", 5, hVar2);
        f185867g = mVar6;
        f185868h = new m[]{mVar, mVar2, mVar3, mVar4, mVar5, mVar6};
    }

    private m(String str, int i14, h hVar) {
        super(str, i14);
        this.f185869a = hVar;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f185868h.clone();
    }
}
