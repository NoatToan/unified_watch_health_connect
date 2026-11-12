package com.xiaomi.hm.health.bt.profile.menstruation;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationState;", "", "", "value", "B", "getValue", "()B", "<init>", "(Ljava/lang/String;IB)V", "Companion", "NO_RECORD", "IN_PERIOD", "NOT_IN_PERIOD", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public enum MenstruationState {
    NO_RECORD((byte) 0),
    IN_PERIOD((byte) 1),
    NOT_IN_PERIOD((byte) 2);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final byte value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationState$Companion;", "", "", "value", "Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationState;", "fromValue", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final MenstruationState fromValue(byte value) {
            MenstruationState[] menstruationStateArrValues = MenstruationState.values();
            int length = menstruationStateArrValues.length;
            int i = 0;
            while (i < length) {
                MenstruationState menstruationState = menstruationStateArrValues[i];
                i++;
                if (menstruationState.getValue() == value) {
                    return menstruationState;
                }
            }
            return null;
        }
    }

    MenstruationState(byte b) {
        this.value = b;
    }

    @JvmStatic
    @Nullable
    public static final MenstruationState fromValue(byte b) {
        return INSTANCE.fromValue(b);
    }

    public final byte getValue() {
        return this.value;
    }
}
