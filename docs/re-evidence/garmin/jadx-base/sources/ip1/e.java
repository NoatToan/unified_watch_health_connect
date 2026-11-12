package ip1;

import com.garmin.android.apps.connectmobile.R;
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
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B5\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lip1/e;", "", "", "legendResId", "colorResId", "gradientStartColorResId", "gradientEndColorResId", "<init>", "(Ljava/lang/String;IIILjava/lang/Integer;Ljava/lang/Integer;)V", "gcm-solar-charge_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f94675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f94676f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f94677g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f94678h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ e[] f94679i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f94680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f94681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f94682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f94683d;

    static {
        e eVar = new e("CHARGING", 0, R.string.edge_solar_charge_chart_legend, R.color.palette_mango_27, Integer.valueOf(R.color.palette_mango_2_alpha), Integer.valueOf(R.color.palette_mango_2_transparent));
        f94675e = eVar;
        Integer num = null;
        e eVar2 = new e("BATTERY_FULL", 1, R.string.lbl_battery_full, R.color.palette_chart_green_4, null, num, 12, null);
        f94676f = eVar2;
        Integer num2 = null;
        e eVar3 = new e("BATTERY_COLD", 2, R.string.lbl_battery_cold, R.color.palette_blue_26, num, num2, 12, null);
        f94677g = eVar3;
        e eVar4 = new e("BATTERY_HOT", 3, R.string.lbl_battery_hot, R.color.palette_red_15, num2, null, 12, null);
        f94678h = eVar4;
        f94679i = new e[]{eVar, eVar2, eVar3, eVar4};
    }

    public /* synthetic */ e(String str, int i14, int i15, int i16, Integer num, Integer num2, int i17, p005kotlin.jvm.internal.j jVar) {
        this(str, i14, i15, i16, (i17 & 4) != 0 ? null : num, (i17 & 8) != 0 ? null : num2);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f94679i.clone();
    }

    private e(String str, int i14, int i15, int i16, Integer num, Integer num2) {
        super(str, i14);
        this.f94680a = i15;
        this.f94681b = i16;
        this.f94682c = num;
        this.f94683d = num2;
    }
}
