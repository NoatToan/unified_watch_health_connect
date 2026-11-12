package eq;

import com.garmin.android.apps.connectmobile.R;
import g6.f;
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
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0002\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Leq/e;", "", "", "metricResId", "Lg6/f;", "columnWidth", "<init>", "(Ljava/lang/String;ILjava/lang/Integer;F)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f65028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f65029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f65030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f65031f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f65032g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f65033h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f65034i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ e[] f65035j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f65036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f65037b;

    static {
        f.a aVar = f.f75994b;
        e eVar = new e("RANK", 0, null, 40);
        f65028c = eVar;
        e eVar2 = new e("NAME", 1, Integer.valueOf(R.string.lbl_name), 200);
        f65029d = eVar2;
        e eVar3 = new e("TIME", 2, Integer.valueOf(R.string.lbl_time), 100);
        f65030e = eVar3;
        float f14 = 125;
        e eVar4 = new e("AVG_SPEED", 3, Integer.valueOf(R.string.lbl_avg_speed), f14);
        f65031f = eVar4;
        e eVar5 = new e("AVG_HR", 4, Integer.valueOf(R.string.activity_details_average_heart_rate), f14);
        f65032g = eVar5;
        e eVar6 = new e("AVG_POWER", 5, Integer.valueOf(R.string.activity_details_average_power), f14);
        f65033h = eVar6;
        e eVar7 = new e("AVG_CADENCE", 6, Integer.valueOf(R.string.activity_details_average_cadence), f14);
        f65034i = eVar7;
        f65035j = new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7};
    }

    private e(String str, int i14, Integer num, float f14) {
        super(str, i14);
        this.f65036a = num;
        this.f65037b = f14;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f65035j.clone();
    }
}
