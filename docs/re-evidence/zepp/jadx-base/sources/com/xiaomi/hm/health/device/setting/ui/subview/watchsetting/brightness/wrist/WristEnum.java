package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.wrist;

import com.xiaomi.hm.health.Constant;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/wrist/WristEnum;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", Constant.OFF, "TIMING", "ALL_DAY", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public enum WristEnum {
    OFF,
    TIMING,
    ALL_DAY;


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/wrist/WristEnum$Companion;", "", "", "ordinal", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/wrist/WristEnum;", "parseWristEnum", "wristEnum", "", "isWristEnable", "isWristAllDay", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isWristAllDay(@NotNull WristEnum wristEnum) {
            return wristEnum == WristEnum.ALL_DAY;
        }

        public final boolean isWristEnable(@NotNull WristEnum wristEnum) {
            return wristEnum == WristEnum.TIMING || wristEnum == WristEnum.ALL_DAY;
        }

        @NotNull
        public final WristEnum parseWristEnum(int ordinal) {
            for (WristEnum wristEnum : WristEnum.values()) {
                if (wristEnum.ordinal() == ordinal) {
                    return wristEnum;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }
}
