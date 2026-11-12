package ad1;

import com.garmin.android.apps.connectmobile.R;
import g6.f;
import o92.e;
import p005kotlin.Metadata;
import w13.c;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'f' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B5\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lad1/b;", "", "", "nameResId", "", "distanceInMeters", "Lg6/f;", "indicatorSize", "Lo92/e;", "indicatorShapeType", "indicatorColorResId", "<init>", "(Ljava/lang/String;IIFFLo92/e;I)V", "gcm-race-predictor_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f2758f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f2759g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f2760h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f2761i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ b[] f2762j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ c f2763k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f2765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f2766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f2767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2768e;

    static {
        e eVar = e.CIRCLE;
        float f14 = 10;
        f.a aVar = f.f75994b;
        b bVar = new b("DISTANCE_5K", 0, R.string.pacepro_lbl_distance_5k, 5000.0f, f14, eVar, R.color.blue_40);
        f2758f = bVar;
        b bVar2 = new b("DISTANCE_10K", 1, R.string.pacepro_lbl_distance_10k, 10000.0f, f14, e.TRIANGLE, R.color.green_70);
        f2759g = bVar2;
        b bVar3 = new b("DISTANCE_HALF", 2, R.string.pacepro_lbl_distance_half_marathon_abbreviated, 21097.5f, f14, e.RECTANGLE, R.color.orange_60);
        f2760h = bVar3;
        b bVar4 = new b("DISTANCE_MARATHON", 3, R.string.pacepro_lbl_distance_marathon, 42195.0f, 12, e.DIAMOND, R.color.red_60);
        f2761i = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        f2762j = bVarArr;
        f2763k = new c(bVarArr);
    }

    private b(String str, int i14, int i15, float f14, float f15, e eVar, int i16) {
        super(str, i14);
        this.f2764a = i15;
        this.f2765b = f14;
        this.f2766c = f15;
        this.f2767d = eVar;
        this.f2768e = i16;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f2762j.clone();
    }
}
