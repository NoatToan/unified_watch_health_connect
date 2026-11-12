package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lr8;", "", "", "value", "I", PluginDeviceInfo.FDESC, "()I", "<init>", "(Ljava/lang/String;II)V", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public enum r8 {
    NONE(0),
    WEIGHT(1),
    WEIGHT_TREND(2),
    BFR(3),
    MUSCLE_MASS(4),
    HEART_RATE(5),
    PBW(6),
    BONE_MASS(7),
    PROTEIN_RATE(8),
    BMR(9),
    VISCERAL_FAT_RATE(10),
    SUBCUTANEOUS_FAT(11),
    SKELETAL_MUSCLE(12),
    PHYSICAL_AGE(13),
    BMI(14);


    @NotNull
    public static final a u = new a(null);
    public final int t;

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lr8$a;", "", "", "value", "Lr8;", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
        @NotNull
        public final r8 a(int value) {
            for (r8 r8Var : r8.values()) {
                if (r8Var.getT() == value) {
                    if (r8Var == null) {
                        return r8.NONE;
                    }
                    return r8Var;
                }
            }
            r8Var = null;
            if (r8Var == null) {
                return r8.NONE;
            }
            return r8Var;
        }
    }

    r8(int i) {
        this.t = i;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getT() {
        return this.t;
    }
}
