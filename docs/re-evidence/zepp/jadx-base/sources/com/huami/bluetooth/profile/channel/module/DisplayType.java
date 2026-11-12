package com.huami.bluetooth.profile.channel.module;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.nfc.bus.NoticesEntity;
import com.xiaomi.hm.health.bodyfat.utils.StatEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/DisplayType;", "", "", "value", LogUtil.I, "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", NoticesEntity.LOOP_TYPE_NONE, "WEIGHT", "WEIGHT_TREND", "BFR", "MUSCLE_MASS", "HEART_RATE", "PBW", "BONE_MASS", "PROTEIN_RATE", StatEvent.BF_OPERATION_BMR_TYPE, "VISCERAL_FAT_RATE", "SUBCUTANEOUS_FAT", "SKELETAL_MUSCLE", "PHYSICAL_AGE", StatEvent.BF_OPERATION_BMI_TYPE, "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public enum DisplayType {
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


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/DisplayType$Companion;", "", "", "value", "Lcom/huami/bluetooth/profile/channel/module/DisplayType;", "fromValue", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:13:0x001d  */
        /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
        @NotNull
        public final DisplayType fromValue(int value) {
            for (DisplayType displayType : DisplayType.values()) {
                if (displayType.getValue() == value) {
                    if (displayType == null) {
                        return DisplayType.NONE;
                    }
                    return displayType;
                }
            }
            displayType = null;
            if (displayType == null) {
                return DisplayType.NONE;
            }
            return displayType;
        }
    }

    DisplayType(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
