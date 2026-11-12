package ln;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

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
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB3\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lln/b;", "", "", Action.KEY_ATTRIBUTE, "", "labelResId", "templateResId", "sortOrder", "", "isLapByCoursePoint", "<init>", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Integer;IZ)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f113631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f113632f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f113633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f113634h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f113635i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f113636j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f113637k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f113638l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ b[] f113639m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f113641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f113642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f113643d;

    static {
        b bVar = new b("AUTO_LAP", 0, "AUTO_LAP", R.string.auto_lap, null, 0, false);
        f113632f = bVar;
        b bVar2 = new b("MANUAL", 1, "MARKER_MANUAL", R.string.sleep_lbl_manual, null, 1, true);
        f113633g = bVar2;
        Integer numValueOf = Integer.valueOf(R.string.timing_gates);
        b bVar3 = new b("MILE", 2, "MARKER_MILE", R.string.lbl_mile_singular, numValueOf, 2, true);
        f113634h = bVar3;
        b bVar4 = new b("HALF", 3, "MARKER_HALF_MARATHON", R.string.atp_lbl_half_marathon, numValueOf, 3, true);
        f113635i = bVar4;
        b bVar5 = new b("KILOMETER", 4, "MARKER_KILOMETER", R.string.lbl_kilometer_singular, numValueOf, 4, true);
        f113636j = bVar5;
        b bVar6 = new b("FIVE_KILOMETER", 5, "MARKER_5K", R.string.personal_records_label_5k_run, numValueOf, 5, true);
        f113637k = bVar6;
        b bVar7 = new b("NONE", 6, "NONE", R.string.lbl_none, null, 6, false);
        f113638l = bVar7;
        f113639m = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7};
        f113631e = new a(null);
    }

    private b(String str, int i14, String str2, int i15, Integer num, int i16, boolean z14) {
        super(str, i14);
        this.f113640a = str2;
        this.f113641b = i15;
        this.f113642c = num;
        this.f113643d = z14;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f113639m.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lln/b$a;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
