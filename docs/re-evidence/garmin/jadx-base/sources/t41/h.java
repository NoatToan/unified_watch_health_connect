package t41;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lt41/h;", "", "", "portraitLabelResId", "landscapeLabelResId", "", "isEditable", "<init>", "(Ljava/lang/String;IIIZ)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f162301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f162302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f162303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h f162304g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h f162305h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h f162306i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h f162307j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h f162308k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h f162309l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ h[] f162310m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f162311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f162312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f162313c;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f162314a;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.f162308k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f162314a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        h hVar = new h("INDEX", 0, R.string.lbl_split, 0, false, 6, null);
        f162301d = hVar;
        Object[] objArr = 0 == true ? 1 : 0;
        h hVar2 = new h("DISTANCE", 1, R.string.pacepro_column_header_split_distance, objArr, false, 6, null);
        f162302e = hVar2;
        Object[] objArr2 = 0 == true ? 1 : 0;
        h hVar3 = new h("TIME", 2, R.string.pacepro_column_header_split_time, objArr2, true, 2, null);
        f162303f = hVar3;
        h hVar4 = new h("PACE", 3, R.string.pacepro_column_header_split_pace, 0, true, 2, null);
        f162304g = hVar4;
        h hVar5 = new h("CUMULATIVE_DISTANCE", 4, R.string.pacepro_column_header_cumulative_distance, 0, false, 6, null);
        f162305h = hVar5;
        h hVar6 = new h("CUMULATIVE_TIME", 5, R.string.pacepro_column_header_cumulative, R.string.LapList_cumulative_time_label, false, 4, null);
        f162306i = hVar6;
        Object[] objArr3 = 0 == true ? 1 : 0;
        h hVar7 = new h("TOTAL_DISTANCE", 6, R.string.lbl_distance, objArr3, false, 6, null);
        f162307j = hVar7;
        Object[] objArr4 = 0 == true ? 1 : 0;
        h hVar8 = new h("CUMULATIVE_AVG_PACE", 7, R.string.pacepro_column_header_cumulative_avg_pace, objArr4, false, 6, null);
        f162308k = hVar8;
        Object[] objArr5 = 0 == true ? 1 : 0;
        h hVar9 = new h("ELEVATION_CHANGE", 8, R.string.pacepro_splits_elevation_changes, objArr5, false, 6, null);
        f162309l = hVar9;
        f162310m = new h[]{hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9};
    }

    public /* synthetic */ h(String str, int i14, int i15, int i16, boolean z14, int i17, j jVar) {
        this(str, i14, i15, (i17 & 2) != 0 ? i15 : i16, (i17 & 4) != 0 ? false : z14);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f162310m.clone();
    }

    private h(String str, int i14, int i15, int i16, boolean z14) {
        super(str, i14);
        this.f162311a = i15;
        this.f162312b = i16;
        this.f162313c = z14;
    }
}
