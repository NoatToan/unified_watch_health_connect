package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.sportrecognize;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.devicex.R;
import com.xiaomi.hm.health.device.introduce.IntroduceShuffleFactoryKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\n\u001a\u00020\u00078F@\u0006¢\u0006\u0006\u001a\u0004\b\b\u0010\tj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/sportrecognize/SportRecognizeSensitivity;", "", "", "value", LogUtil.I, "getValue", "()I", "", "getDesc", "()Ljava/lang/String;", "desc", "<init>", "(Ljava/lang/String;II)V", "Companion", "HIGH", "STANDARD", "LOW", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public enum SportRecognizeSensitivity {
    HIGH(0),
    STANDARD(1),
    LOW(2);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/sportrecognize/SportRecognizeSensitivity$Companion;", "", "", "value", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/sportrecognize/SportRecognizeSensitivity;", "fromValue", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final SportRecognizeSensitivity fromValue(int value) {
            for (SportRecognizeSensitivity sportRecognizeSensitivity : SportRecognizeSensitivity.values()) {
                if (sportRecognizeSensitivity.getValue() == value) {
                    return sportRecognizeSensitivity;
                }
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SportRecognizeSensitivity.values().length];
            iArr[SportRecognizeSensitivity.HIGH.ordinal()] = 1;
            iArr[SportRecognizeSensitivity.STANDARD.ordinal()] = 2;
            iArr[SportRecognizeSensitivity.LOW.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    SportRecognizeSensitivity(int i) {
        this.value = i;
    }

    @NotNull
    public final String getDesc() {
        int i;
        int i2 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i2 == 1) {
            i = R.string.ds_sport_recognize_sensitivity_high;
        } else if (i2 == 2) {
            i = R.string.ds_sport_recognize_sensitivity_standard;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.string.ds_sport_recognize_sensitivity_low;
        }
        return IntroduceShuffleFactoryKt.getString(i);
    }

    public final int getValue() {
        return this.value;
    }
}
