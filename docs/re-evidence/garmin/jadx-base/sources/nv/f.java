package nv;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lnv/f;", "", "", "descriptionResId", "", "Lnv/a;", "descriptionParams", "<init>", "(Ljava/lang/String;II[Lnv/a;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f127948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f127949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f127950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f127951f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f f127952g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f f127953h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final f f127954i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final f f127955j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final f f127956k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final f f127957l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ f[] f127958m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f127959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nv.a[] f127960b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f127961a;

        static {
            int[] iArr = new int[nv.a.values().length];
            try {
                iArr[nv.a.DEVICE_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[nv.a.BUTTON_PRESS_SECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f127961a = iArr;
        }
    }

    static {
        f fVar = new f("APHRODITE_DESCRIPTION_1", 0, R.string.msg_awake_led_light_generic, null, 2, null);
        f127948c = fVar;
        nv.a aVar = nv.a.BUTTON_PRESS_SECONDS;
        f fVar2 = new f("APHRODITE_DESCRIPTION_2", 1, R.string.msg_flashing_orange_pairing_instruction, new nv.a[]{aVar});
        f127949d = fVar2;
        f fVar3 = new f("HERMES_DESCRIPTION_1", 2, R.string.msg_awake_led_light_generic, null, 2, null);
        f127950e = fVar3;
        f fVar4 = new f("HERMES_DESCRIPTION_2", 3, R.string.msg_flashing_purple_pairing_instruction, new nv.a[]{aVar});
        f127951f = fVar4;
        int i14 = 2;
        j jVar = null;
        nv.a[] aVarArr = null;
        f fVar5 = new f("CINEMA_DESCRIPTION_1", 4, R.string.msg_awake_led_pedals_info, aVarArr, i14, jVar);
        f127952g = fVar5;
        f fVar6 = new f("CINEMA_DESCRIPTION_2", 5, R.string.msg_charged_pedals, aVarArr, i14, jVar);
        f127953h = fVar6;
        f fVar7 = new f("CINEMA_DESCRIPTION_3", 6, R.string.msg_flashing_purple_light_pairing_pedals, aVarArr, i14, jVar);
        f127954i = fVar7;
        f fVar8 = new f("HRM_DESCRIPTION_1", 7, R.string.msg_put_hrm_device_on_placeholder, new nv.a[]{nv.a.DEVICE_NAME});
        f127955j = fVar8;
        f fVar9 = new f("HRM_DESCRIPTION_2", 8, R.string.smart_troubleshooting_hrm_pair_info, null, 2, null);
        f127956k = fVar9;
        f fVar10 = new f("HRM_DESCRIPTION_3", 9, R.string.smart_troubleshooting_hrm_pair_info_1, null, 2, null);
        f127957l = fVar10;
        f127958m = new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10};
    }

    public /* synthetic */ f(String str, int i14, int i15, nv.a[] aVarArr, int i16, j jVar) {
        this(str, i14, i15, (i16 & 2) != 0 ? null : aVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f127958m.clone();
    }

    private f(String str, int i14, int i15, nv.a[] aVarArr) {
        super(str, i14);
        this.f127959a = i15;
        this.f127960b = aVarArr;
    }
}
