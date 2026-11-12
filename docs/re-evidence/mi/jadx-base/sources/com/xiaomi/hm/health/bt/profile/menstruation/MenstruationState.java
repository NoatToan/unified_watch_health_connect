package com.xiaomi.hm.health.bt.profile.menstruation;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.api.c;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationState;", "", "", "value", c.f13755a, "getValue", "()B", "<init>", "(Ljava/lang/String;IB)V", "Companion", PluginDeviceInfo.FMODEL, "NO_RECORD", "IN_PERIOD", "NOT_IN_PERIOD", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public enum MenstruationState {
    NO_RECORD((byte) 0),
    IN_PERIOD((byte) 1),
    NOT_IN_PERIOD((byte) 2);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final byte value;

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bt.profile.menstruation.MenstruationState$a, reason: from kotlin metadata */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationState$a;", "", "", "value", "Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationState;", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final MenstruationState a(byte value) {
            for (MenstruationState menstruationState : MenstruationState.values()) {
                if (menstruationState.getValue() == value) {
                    return menstruationState;
                }
            }
            return null;
        }
    }

    MenstruationState(byte b2) {
        this.value = b2;
    }

    @JvmStatic
    @Nullable
    public static final MenstruationState fromValue(byte b2) {
        return INSTANCE.a(b2);
    }

    public final byte getValue() {
        return this.value;
    }
}
