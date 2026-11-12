package nv;

import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.x;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'o' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB_\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lnv/e;", "", "", "instructionTitleResourceId", "instructionLinkMsgResourceId", "instructionDescriptionTitleResourceId", "", "Lnv/f;", "instructionDescriptions", "instructionDescriptionLinkMsgResourceId", "instructionDescriptionLink", "instructionDescriptionHintResourceId", "<init>", "(Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;[Lnv/f;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f127930h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final List<e> f127931i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final List<e> f127932j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final List<e> f127933k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final List<e> f127934l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final List<e> f127935m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final List<e> f127936n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final e f127937o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final e f127938p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ e[] f127939q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f127940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f127941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f127942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f[] f127943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f127944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f127945f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f127946g;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f127947a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.f127938p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f127947a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Integer num = null;
        e eVar = new e("PAIRING_MODE_INSTRUCTION", 0, R.string.smart_troubleshooting_pairing_mode_on, Integer.valueOf(R.string.lbl_show_how_to_pair), null, null, null, null, num, 124, null);
        f127937o = eVar;
        Integer numValueOf = Integer.valueOf(R.string.smart_troubleshooting_enter_pairing_mode);
        Integer numValueOf2 = Integer.valueOf(R.string.smart_troubleshooting_instructions_device_title);
        f[] fVarArr = {f.f127948c, f.f127949d};
        Integer numValueOf3 = Integer.valueOf(R.string.msg_pairing_not_sleep_generic);
        e eVar2 = new e("PAIRING_MODE_INSTRUCTION_APHRODITE", 1, R.string.smart_troubleshooting_pairing_mode_on, numValueOf, numValueOf2, fVarArr, null, num, numValueOf3, 48, null);
        j jVar = null;
        e eVar3 = new e("PAIRING_MODE_INSTRUCTION_HERMES", 2, R.string.smart_troubleshooting_pairing_mode_on, numValueOf, numValueOf2, new f[]{f.f127950e, f.f127951f}, null, null, numValueOf3, 48, jVar);
        e eVar4 = new e("PAIRING_MODE_INSTRUCTION_CINEMA", 3, R.string.smart_troubleshooting_pairing_mode_on, numValueOf, Integer.valueOf(R.string.smart_troubleshooting_instructions_pedal_title), new f[]{f.f127952g, f.f127953h, f.f127954i}, numValueOf, Integer.valueOf(R.string.troubleshooting_pairing_mode_cinema), Integer.valueOf(R.string.smart_troubleshooting_pairing_mode_note_pedals));
        f127938p = eVar4;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        e eVar5 = new e("BLUETOOTH_INSTRUCTION", 4, R.string.smart_troubleshooting_toggle_bt, null, num2, null, null, num3, num4, 126, null);
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        e eVar6 = new e("RESTART_PHONE_INSTRUCTION", 5, R.string.smart_troubleshooting_restart_phone, num2, objArr, objArr2, num3, num4, null, 126, null);
        e eVar7 = new e("HRM_PUT_DEVICE_ON_INSTRUCTION", 6, R.string.smart_troubleshooting_pairing_mode_on, numValueOf, numValueOf2, new f[]{f.f127955j, f.f127956k, f.f127957l}, null, null, null, 112, jVar);
        f127939q = new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7};
        f127930h = new a(null);
        f127931i = x.k(eVar, eVar5, eVar6);
        f127932j = x.k(eVar7, eVar5, eVar6);
        f127933k = x.k(eVar2, eVar5, eVar6);
        f127934l = x.k(eVar3, eVar5, eVar6);
        f127935m = x.k(eVar, eVar5, eVar6);
        f127936n = x.k(eVar4, eVar5, eVar6);
    }

    public /* synthetic */ e(String str, int i14, int i15, Integer num, Integer num2, f[] fVarArr, Integer num3, Integer num4, Integer num5, int i16, j jVar) {
        this(str, i14, i15, (i16 & 2) != 0 ? null : num, (i16 & 4) != 0 ? null : num2, (i16 & 8) != 0 ? null : fVarArr, (i16 & 16) != 0 ? null : num3, (i16 & 32) != 0 ? null : num4, (i16 & 64) != 0 ? null : num5);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f127939q.clone();
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0007¨\u0006\r"}, d2 = {"Lnv/e$a;", "", "<init>", "()V", "", "Lnv/e;", "DEFAULT_INSTRUCTIONS", "Ljava/util/List;", "HRM_INSTRUCTIONS", "APHRODITE_INSTRUCTIONS", "HERMES_INSTRUCTIONS", "RING_INSTRUCTIONS", "CINEMA_INSTRUCTIONS", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    private e(String str, int i14, int i15, Integer num, Integer num2, f[] fVarArr, Integer num3, Integer num4, Integer num5) {
        super(str, i14);
        this.f127940a = i15;
        this.f127941b = num;
        this.f127942c = num2;
        this.f127943d = fVarArr;
        this.f127944e = num3;
        this.f127945f = num4;
        this.f127946g = num5;
    }
}
