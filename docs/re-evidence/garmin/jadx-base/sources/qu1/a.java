package qu1;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import w13.c;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 qu1.a[], still in use, count: 1, list:
  (r0v1 qu1.a[]) from 0x0242: CONSTRUCTOR (r0v1 qu1.a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lqu1/a;", "", "", Action.KEY_ATTRIBUTE, "", "stringId", "iconResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;II)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {
    NO_EQUIPMENT("NO_EQUIPMENT", R.string.lbl_exercise_no_equipment, R.drawable.strength_no_equipment),
    /* JADX INFO: Fake field, exist only in values array */
    ANKLE_WEIGHT("ANKLE_WEIGHT", R.string.lbl_equipment_ankle_weight, R.drawable.equipment_ankle_weight),
    /* JADX INFO: Fake field, exist only in values array */
    BAND("BAND", R.string.lbl_equipment_band, R.drawable.equipment_band),
    /* JADX INFO: Fake field, exist only in values array */
    BARBELL("BARBELL", R.string.lbl_equipment_barbell, R.drawable.equipment_barbell),
    /* JADX INFO: Fake field, exist only in values array */
    BATTLE_ROPE("BATTLE_ROPE", R.string.lbl_equipment_battle_rope, R.drawable.equipment_battle_rope),
    /* JADX INFO: Fake field, exist only in values array */
    BENCH("BENCH", R.string.lbl_equipment_bench, R.drawable.equipment_bench),
    /* JADX INFO: Fake field, exist only in values array */
    BIKE("BIKE", R.string.lbl_equipment_bike, R.drawable.equipment_bike),
    /* JADX INFO: Fake field, exist only in values array */
    BOSU_BALL("BOSU_BALL", R.string.lbl_equipment_bosu_ball, R.drawable.equipment_bosu_ball),
    /* JADX INFO: Fake field, exist only in values array */
    BOX("BOX", R.string.lbl_equipment_box, R.drawable.equipment_box),
    /* JADX INFO: Fake field, exist only in values array */
    CABLE_MACHINE("CABLE_MACHINE", R.string.lbl_equipment_cable_machine, R.drawable.equipment_cable_machine),
    /* JADX INFO: Fake field, exist only in values array */
    DUMBBELL("DUMBBELL", R.string.lbl_equipment_dumbbell, R.drawable.equipment_dumbbell),
    /* JADX INFO: Fake field, exist only in values array */
    EZ_BAR("EZ_BAR", R.string.lbl_equipment_ez_bar, R.drawable.equipment_ez_bar),
    /* JADX INFO: Fake field, exist only in values array */
    FOAM_ROLLER("FOAM_ROLLER", R.string.lbl_equipment_foam_roller, R.drawable.equipment_foam_roller),
    /* JADX INFO: Fake field, exist only in values array */
    JUMP_ROPE("JUMP_ROPE", R.string.lbl_equipment_jump_rope, R.drawable.equipment_jump_rope),
    /* JADX INFO: Fake field, exist only in values array */
    KETTLEBELL("KETTLEBELL", R.string.lbl_equipment_kettlebell, R.drawable.equipment_kettlebell),
    /* JADX INFO: Fake field, exist only in values array */
    MACHINE("MACHINE", R.string.lbl_equipment_machine, R.drawable.equipment_machine),
    /* JADX INFO: Fake field, exist only in values array */
    MEDICINE_BALL("MEDICINE_BALL", R.string.lbl_equipment_medicine_ball, R.drawable.equipment_medicine_ball),
    /* JADX INFO: Fake field, exist only in values array */
    OTHER("OTHER", R.string.lbl_equipment_other, R.drawable.equipment_others),
    /* JADX INFO: Fake field, exist only in values array */
    PACK_WEIGHT("PACK_WEIGHT", R.string.lbl_pack_weight, R.drawable.equipment_pack_weight),
    /* JADX INFO: Fake field, exist only in values array */
    PLATE("PLATE", R.string.lbl_equipment_plate, R.drawable.equipment_plate),
    /* JADX INFO: Fake field, exist only in values array */
    PULLUP_BAR("PULLUP_BAR", R.string.lbl_equipment_pullup_bar, R.drawable.equipment_pullup_bar),
    /* JADX INFO: Fake field, exist only in values array */
    RINGS("RINGS", R.string.lbl_equipment_rings, R.drawable.equipment_rings),
    /* JADX INFO: Fake field, exist only in values array */
    ROPE("ROPE", R.string.lbl_equipment_rope, R.drawable.equipment_rope),
    /* JADX INFO: Fake field, exist only in values array */
    SANDBAG("SANDBAG", R.string.lbl_equipment_sandbag, R.drawable.equipment_sandbag),
    /* JADX INFO: Fake field, exist only in values array */
    SLED("SLED", R.string.lbl_equipment_sled, R.drawable.equipment_sledge_hammer),
    /* JADX INFO: Fake field, exist only in values array */
    SLIDING_DISC("SLIDING_DISC", R.string.lbl_equipment_sliding_disc, R.drawable.equipment_sliding_disc),
    /* JADX INFO: Fake field, exist only in values array */
    SMITH_MACHINE("SMITH_MACHINE", R.string.lbl_equipment_smith_machine, R.drawable.equipment_smith_machine),
    /* JADX INFO: Fake field, exist only in values array */
    SQUAT_RACK("SQUAT_RACK", R.string.lbl_equipment_squat_rack, R.drawable.equipment_squat_rack),
    /* JADX INFO: Fake field, exist only in values array */
    SWISS_BALL("SWISS_BALL", R.string.lbl_equipment_swiss_ball, R.drawable.equipment_swiss_ball),
    /* JADX INFO: Fake field, exist only in values array */
    TRX("TRX", R.string.lbl_equipment_trx, R.drawable.equipment_trx),
    /* JADX INFO: Fake field, exist only in values array */
    WEIGHT_VES("WEIGHT_VEST", R.string.lbl_equipment_weight_ves, R.drawable.equipment_weight_vest);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ c f147897f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f147899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f147900c;

    static {
        f147897f = new c(aVarArr);
        new C2782a(null);
    }

    private a(String str, int i14, int i15) {
        super(str, i);
        this.f147898a = str;
        this.f147899b = i14;
        this.f147900c = i15;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f147896e.clone();
    }

    /* JADX INFO: renamed from: qu1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqu1/a$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2782a {
        public /* synthetic */ C2782a(j jVar) {
            this();
        }

        private C2782a() {
        }
    }
}
