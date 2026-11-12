package lj0;

import com.google.mlkit.common.MlKitException;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'j' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes8.dex */
public final class f implements g {
    public static final f A;
    public static final f B;
    public static final f C;
    public static final f D;

    @Deprecated
    public static final f E;
    public static final f F;
    public static final f I;
    public static final /* synthetic */ f[] P;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final f f112984j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final f f112985k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final f f112986l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final f f112987m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final f f112988n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final f f112989o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final f f112990p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final f f112991q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final f f112992r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final f f112993t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final f f112994v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final f f112995w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final f f112996x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final f f112997y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final f f112998z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f112999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f113000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f113001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f113002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f113003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e.b f113004f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f113005g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f113006h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f113007i;

    static {
        d dVar = d.POST;
        f fVar = new f("registerDevice", 0, dVar, new int[]{200, 400}, "/device-service/deviceregistration/device", 0, "application/xml");
        f112984j = fVar;
        f fVar2 = new f("softwareUpdateCheck", 1, dVar, 200, "/device-service/softwareupdate/check?delta={0}", 1, "application/xml");
        f112985k = fVar2;
        f fVar3 = new f("softwareUpdateFITCheck", 2, dVar, 200, "/device-service/softwareupdate/check/fit", 1, "application/octet-stream");
        f112986l = fVar3;
        d dVar2 = d.GET;
        f fVar4 = new f("getDeviceSettings", 3, dVar2, 200, "/device-service/deviceservice/device-info/settings/{0}", 1, "application/json");
        f112987m = fVar4;
        f fVar5 = new f("getVerizonDeviceStatus", 4, dVar2, 200, "https://proxy.gcs.garmin.com/vzw/status/{0}/{1}/", 2, "application/json");
        f112988n = fVar5;
        f fVar6 = new f("getControlsMenuResetList", 5, dVar2, 200, "/devicesettings-service/device/defaults/controls-menu/{0}", 1, "application/json");
        f112989o = fVar6;
        f fVar7 = new f("getDisplayedActivitiesList", 6, dVar2, 200, "/devicesettings-service/device/displayed-activities/{0}", 1, "application/json");
        f112990p = fVar7;
        d dVar3 = d.PUT;
        f fVar8 = new f("saveDeviceSettings", 7, dVar, 200, "/device-service/deviceservice/device-info/settings/{0}", 1, "application/json", dVar3);
        f112991q = fVar8;
        f fVar9 = new f("saveDisplayedActivitiesList", 8, dVar, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, "/devicesettings-service/device/displayed-activities/{0}", 1, "application/json", dVar3);
        f112992r = fVar9;
        f fVar10 = new f("getRunOptions", 9, dVar2, 200, "/device-service/deviceservice/device-info/settings/{0}/sports/running", 1, "application/json");
        f112993t = fVar10;
        f fVar11 = new f("updateDeviceStatus", 10, dVar, 200, "/device-service/deviceregistration/device/status/{0}", 1, "application/json", dVar3);
        f112994v = fVar11;
        f fVar12 = new f("getDeviceRegistrationStatus", 11, dVar2, 200, "/device-service/deviceregistration/device/status/{0}", 1, "application/json");
        f112995w = fVar12;
        f fVar13 = new f("getDeviceRegistrationDetails", 12, dVar2, 200, "/device-service/deviceregistration/devices/{0}", 1, "application/json");
        f112996x = fVar13;
        f fVar14 = new f("updatePrimaryActivityTrackerFlag", 13, dVar, new int[]{200, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS}, "/device-service/deviceservice/device-info/{0}/primary-activity-tracker", 1, "application/json", dVar3);
        f112997y = fVar14;
        f fVar15 = new f("postActivityBackFill", 14, dVar, new int[]{200, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS}, "/devicemessage-service/messages/activityBackfill/device/{0}", 1, "application/json", dVar);
        f fVar16 = new f("reInitializeDevice", 15, dVar3, new int[]{200, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS}, "/device-service/deviceregistration/reinitialize/{0}", 1, "application/json");
        f112998z = fVar16;
        f fVar17 = new f("getDeviceOAuth", 16, dVar2, 200, "/oauth-service/oauth/tokens/device/{0}", 1, "application/json");
        A = fVar17;
        f fVar18 = new f("getActivityOptions", 17, dVar2, 200, "/device-service/deviceservice/device-info/settings/{0}/sport/{1}/subsport/{2}", 3, "application/json");
        B = fVar18;
        f fVar19 = new f("saveActivityOptions", 18, dVar, 200, "/device-service/deviceservice/device-info/settings/{0}/sports/{1}", 2, "application/json", dVar3);
        C = fVar19;
        f fVar20 = new f("saveActivityOptionsV2", 19, dVar, 200, "/device-service/deviceservice/device-info/settings/{0}/sport/{1}/subsport/{2}", 3, "application/json", dVar3);
        D = fVar20;
        f fVar21 = new f("getAllRegisteredDevices", 20, dVar2, 200, "/device-service/deviceregistration/devices", 0, "application/json");
        E = fVar21;
        f fVar22 = new f("updateTruSwingSpeedUnit", 21, dVar3, 200, "/userpreference-service/SwingSpeedMeasurementSystem", 0, "application/json");
        F = fVar22;
        f fVar23 = new f("getTruSwingSpeedUnit", 22, dVar2, 200, "/userpreference-service/SwingSpeedMeasurementSystem", 0, "application/json");
        I = fVar23;
        P = new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11, fVar12, fVar13, fVar14, fVar15, fVar16, fVar17, fVar18, fVar19, fVar20, fVar21, fVar22, fVar23};
    }

    private f(String str, int i14, d dVar, int i15, String str2, int i16, String str3, d dVar2) {
        super(str, i14);
        this.f113003e = null;
        this.f113004f = e.b.RESPONSE_TYPE_STRING;
        this.f113006h = null;
        this.f113007i = null;
        this.f113002d = dVar;
        this.f113000b = new int[]{i15};
        this.f112999a = str2;
        this.f113001c = i16;
        this.f113005g = str3;
        this.f113003e = dVar2;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) P.clone();
    }

    @Override // lj0.g
    public final byte[] a() {
        return this.f113006h;
    }

    @Override // lj0.g
    public final d b() {
        return this.f113002d;
    }

    @Override // lj0.g
    public final int[] c() {
        return this.f113000b;
    }

    @Override // lj0.g
    public final int d() {
        return this.f113001c;
    }

    @Override // lj0.g
    public final e.b e() {
        return this.f113004f;
    }

    @Override // lj0.g
    public final d f() {
        return this.f113003e;
    }

    @Override // lj0.g
    public final String g() {
        return this.f113007i;
    }

    @Override // lj0.g
    public final String getContentType() {
        return this.f113005g;
    }

    @Override // lj0.g
    public final String getURI() {
        return this.f112999a;
    }

    private f(String str, int i14, d dVar, int i15, String str2, int i16, String str3) {
        super(str, i14);
        this.f113003e = null;
        this.f113004f = e.b.RESPONSE_TYPE_STRING;
        this.f113006h = null;
        this.f113007i = null;
        this.f113002d = dVar;
        this.f113000b = new int[]{i15};
        this.f112999a = str2;
        this.f113001c = i16;
        this.f113005g = str3;
    }

    private f(String str, int i14, d dVar, int[] iArr, String str2, int i15) {
        super(str, i14);
        this.f113003e = null;
        this.f113004f = e.b.RESPONSE_TYPE_STRING;
        this.f113006h = null;
        this.f113007i = null;
        this.f113002d = dVar;
        this.f113000b = iArr;
        this.f112999a = str2;
        this.f113001c = i15;
        this.f113005g = "application/json";
    }

    private f(String str, int i14, d dVar, int[] iArr, String str2, int i15, String str3) {
        super(str, i14);
        this.f113003e = null;
        this.f113004f = e.b.RESPONSE_TYPE_STRING;
        this.f113006h = null;
        this.f113007i = null;
        this.f113002d = dVar;
        this.f113000b = iArr;
        this.f112999a = str2;
        this.f113001c = i15;
        this.f113005g = str3;
    }

    private f(String str, int i14, d dVar, int[] iArr, String str2, int i15, String str3, d dVar2) {
        super(str, i14);
        this.f113003e = null;
        this.f113004f = e.b.RESPONSE_TYPE_STRING;
        this.f113006h = null;
        this.f113007i = null;
        this.f113002d = dVar;
        this.f113000b = iArr;
        this.f112999a = str2;
        this.f113001c = i15;
        this.f113005g = str3;
        this.f113003e = dVar2;
    }
}
