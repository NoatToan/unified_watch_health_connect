package com.xiaomi.hm.health.ui.smartplay.appnotify;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.xiaomi.hm.health.reminder.c;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/appnotify/Vibration;", "", "", "type", LogUtil.I, "getType", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "BEEP", "BIRDSONG", "DRUMS", c.b, "RAPID", "INVALID", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public enum Vibration {
    BEEP(1),
    BIRDSONG(2),
    DRUMS(3),
    LIGHT(4),
    RAPID(5),
    INVALID(-1);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int type;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0002¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/appnotify/Vibration$Companion;", "", "", "type", "Lcom/xiaomi/hm/health/ui/smartplay/appnotify/Vibration;", "from", "Lkotlin/Pair;", "", "getVibration", "default", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Vibration.values().length];
                iArr[Vibration.BEEP.ordinal()] = 1;
                iArr[Vibration.BIRDSONG.ordinal()] = 2;
                iArr[Vibration.DRUMS.ordinal()] = 3;
                iArr[Vibration.LIGHT.ordinal()] = 4;
                iArr[Vibration.RAPID.ordinal()] = 5;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: default, reason: not valid java name */
        public final int m3453default() {
            return Vibration.BEEP.getType();
        }

        /* JADX WARN: Code duplicated, block: B:13:0x001d  */
        /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
        @NotNull
        public final Vibration from(int type) {
            for (Vibration vibration : Vibration.values()) {
                if (vibration.getType() == type) {
                    if (vibration == null) {
                        return Vibration.INVALID;
                    }
                    return vibration;
                }
            }
            vibration = null;
            if (vibration == null) {
                return Vibration.INVALID;
            }
            return vibration;
        }

        @NotNull
        public final Pair<String, Integer> getVibration(int type) {
            int i = WhenMappings.$EnumSwitchMapping$0[from(type).ordinal()];
            if (i == 1) {
                return new Pair<>(DeviceXFunctionsKt.getString(R.string.vibration_beep), Integer.valueOf(R.drawable.ic_vibration_beep));
            }
            if (i == 2) {
                return new Pair<>(DeviceXFunctionsKt.getString(R.string.vibration_birdsong), Integer.valueOf(R.drawable.ic_vibration_birdsong));
            }
            if (i == 3) {
                return new Pair<>(DeviceXFunctionsKt.getString(R.string.vibration_drums), Integer.valueOf(R.drawable.ic_vibration_drums));
            }
            if (i != 4) {
                return i != 5 ? new Pair<>(DeviceXFunctionsKt.getString(R.string.vibration_invalid), Integer.valueOf(R.drawable.ic_warning_error)) : new Pair<>(DeviceXFunctionsKt.getString(R.string.vibration_rapid), Integer.valueOf(R.drawable.ic_vibration_rapid));
            }
            return new Pair<>(DeviceXFunctionsKt.getString(R.string.vibration_light), Integer.valueOf(R.drawable.ic_vibration_light));
        }
    }

    Vibration(int i) {
        this.type = i;
    }

    public final int getType() {
        return this.type;
    }
}
