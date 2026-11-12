package j22;

import android.annotation.TargetApi;
import android.os.Build;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'k' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lj22/a;", "", "", "permNameStrResID", "", "manifestString", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1845a f96714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f96715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f96716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f96717f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f96718g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f96719h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @TargetApi(29)
    public static final a f96720i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f96721j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f96722k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f96723l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f96724m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f96725n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f96726o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @TargetApi(26)
    public static final a f96727p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @TargetApi(31)
    public static final a f96728q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @TargetApi(31)
    public static final a f96729r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @TargetApi(31)
    public static final a f96730t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f96731v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f96732w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ a[] f96733x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f96734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f96735b;

    /* JADX INFO: Fake field, exist only in values array */
    a EF4;

    static {
        a aVar = new a("READ_CALENDAR", 0, R.string.permission_calendar, "android.permission.READ_CALENDAR");
        f96715d = aVar;
        a aVar2 = new a("CAMERA", 1, R.string.permission_camera, "android.permission.CAMERA");
        f96716e = aVar2;
        a aVar3 = new a("READ_CONTACTS", 2, R.string.permission_contacts, "android.permission.READ_CONTACTS");
        f96717f = aVar3;
        a aVar4 = new a("WRITE_CONTACTS", 3, R.string.permission_contacts, "android.permission.WRITE_CONTACTS");
        a aVar5 = new a("ACCESS_COARSE_LOCATION", 4, R.string.permission_location, "android.permission.ACCESS_COARSE_LOCATION");
        f96718g = aVar5;
        a aVar6 = new a("ACCESS_FINE_LOCATION", 5, R.string.permission_location, "android.permission.ACCESS_FINE_LOCATION");
        f96719h = aVar6;
        a aVar7 = new a("ACCESS_BACKGROUND_LOCATION", 6, R.string.permission_location, "android.permission.ACCESS_BACKGROUND_LOCATION");
        f96720i = aVar7;
        int i14 = R.string.permission_storage;
        a aVar8 = new a("READ_EXTERNAL_STORAGE", 7, R.string.permission_storage, "android.permission.READ_EXTERNAL_STORAGE");
        f96721j = aVar8;
        a aVar9 = new a("WRITE_EXTERNAL_STORAGE", 8, Build.VERSION.SDK_INT > 29 ? R.string.permission_files_and_media : i14, "android.permission.WRITE_EXTERNAL_STORAGE");
        f96722k = aVar9;
        a aVar10 = new a("READ_PHONE_STATE", 9, R.string.permission_phone, "android.permission.READ_PHONE_STATE");
        f96723l = aVar10;
        a aVar11 = new a("SEND_SMS", 10, R.string.permission_sms, "android.permission.SEND_SMS");
        f96724m = aVar11;
        a aVar12 = new a("CALL_PHONE", 11, R.string.permission_phone, "android.permission.CALL_PHONE");
        f96725n = aVar12;
        a aVar13 = new a("READ_CALL_LOG", 12, R.string.permission_phone, "android.permission.READ_CALL_LOG");
        f96726o = aVar13;
        a aVar14 = new a("ANSWER_PHONE_CALLS", 13, R.string.permission_phone, "android.permission.ANSWER_PHONE_CALLS");
        f96727p = aVar14;
        a aVar15 = new a("BLUETOOTH_CONNECT", 14, R.string.permission_nearby_devices, "android.permission.BLUETOOTH_CONNECT");
        f96728q = aVar15;
        a aVar16 = new a("BLUETOOTH_SCAN", 15, R.string.permission_nearby_devices, "android.permission.BLUETOOTH_SCAN");
        f96729r = aVar16;
        a aVar17 = new a("SCHEDULE_EXACT_ALARM", 16, R.string.lbl_alarms_and_reminders, "android.permission.SCHEDULE_EXACT_ALARM");
        f96730t = aVar17;
        a aVar18 = new a("POST_NOTIFICATIONS", 17, R.string.concept_notifications, "android.permission.POST_NOTIFICATIONS");
        f96731v = aVar18;
        a aVar19 = new a("POST_PROMOTED_NOTIFICATIONS", 18, R.string.concept_notifications, "android.permission.POST_PROMOTED_NOTIFICATIONS");
        a aVar20 = new a("MICROPHONE", 19, R.string.lbl_microphone, "android.permission.RECORD_AUDIO");
        f96732w = aVar20;
        f96733x = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20};
        f96714c = new C1845a(null);
    }

    private a(String str, int i14, int i15, String str2) {
        super(str, i14);
        this.f96734a = i15;
        this.f96735b = str2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f96733x.clone();
    }

    /* JADX INFO: renamed from: j22.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj22/a$a;", "", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1845a {
        public /* synthetic */ C1845a(j jVar) {
            this();
        }

        private C1845a() {
        }
    }
}
