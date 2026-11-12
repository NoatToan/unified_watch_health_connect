package com.huami.bluetooth.profile.ecf.data;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.utils.ByteUtilsKt;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0001$B!\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\n\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u001e8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/ActivityGoal;", "", "Lcom/huami/bluetooth/profile/ecf/data/ActivityGoal$GoalType;", "component1", "", "component2", "", "component3", "type", "value", "isRemindEnable", "copy", "", "toString", "hashCode", "other", "equals", "a", "Lcom/huami/bluetooth/profile/ecf/data/ActivityGoal$GoalType;", "getType", "()Lcom/huami/bluetooth/profile/ecf/data/ActivityGoal$GoalType;", "b", LogUtil.I, "getValue", "()I", "c", "Z", "()Z", "setRemindEnable", "(Z)V", "", "getBytes$bluetooth_release", "()[B", HTTP.CONTENT_RANGE_BYTES, "<init>", "(Lcom/huami/bluetooth/profile/ecf/data/ActivityGoal$GoalType;IZ)V", "GoalType", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ActivityGoal {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final GoalType type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int value;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private boolean isRemindEnable;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B%\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R%\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/ActivityGoal$GoalType;", "", "", "bitSet", LogUtil.I, "getBitSet", "()I", "Lkotlin/Function1;", "", "converter", "Lkotlin/jvm/functions/Function1;", "getConverter", "()Lkotlin/jvm/functions/Function1;", "<init>", "(Ljava/lang/String;IILkotlin/jvm/functions/Function1;)V", "Companion", GoogleApiAvailabilityLight.a, "STEP", "CALORIES", "DISTANCE", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public enum GoalType {
        STEP(0, a.a),
        CALORIES(1, b.a),
        DISTANCE(2, c.a);


        @Deprecated
        public static final int CALORIES_GOAL_BYTES = 4;

        @NotNull
        private static final d Companion = new d(null);

        @Deprecated
        public static final int DISTANCE_GOAL_BYTES = 4;

        @Deprecated
        public static final int STEP_GOAL_BYTES = 4;
        private final int bitSet;

        @NotNull
        private final Function1<Integer, byte[]> converter;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Integer, byte[]> {
            public static final a a = new a();

            public a() {
                super(1);
            }

            @NotNull
            public final byte[] a(int i) {
                return ByteUtilsKt.toByteArray(i, 4);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ byte[] invoke(Integer num) {
                return a(num.intValue());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<Integer, byte[]> {
            public static final b a = new b();

            public b() {
                super(1);
            }

            @NotNull
            public final byte[] a(int i) {
                return ByteUtilsKt.toByteArray(i, 4);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ byte[] invoke(Integer num) {
                return a(num.intValue());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function1<Integer, byte[]> {
            public static final c a = new c();

            public c() {
                super(1);
            }

            @NotNull
            public final byte[] a(int i) {
                return ByteUtilsKt.toByteArray(i, 4);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ byte[] invoke(Integer num) {
                return a(num.intValue());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"com/huami/bluetooth/profile/ecf/data/ActivityGoal$GoalType$d", "", "", "CALORIES_GOAL_BYTES", LogUtil.I, "DISTANCE_GOAL_BYTES", "STEP_GOAL_BYTES", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class d {
            private d() {
            }

            public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        GoalType(int i, Function1 function1) {
            this.bitSet = i;
            this.converter = function1;
        }

        public final int getBitSet() {
            return this.bitSet;
        }

        @NotNull
        public final Function1<Integer, byte[]> getConverter() {
            return this.converter;
        }
    }

    public ActivityGoal(@NotNull GoalType goalType, int i, boolean z) {
        this.type = goalType;
        this.value = i;
        this.isRemindEnable = z;
    }

    public static /* synthetic */ ActivityGoal copy$default(ActivityGoal activityGoal, GoalType goalType, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            goalType = activityGoal.type;
        }
        if ((i2 & 2) != 0) {
            i = activityGoal.value;
        }
        if ((i2 & 4) != 0) {
            z = activityGoal.isRemindEnable;
        }
        return activityGoal.copy(goalType, i, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final GoalType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsRemindEnable() {
        return this.isRemindEnable;
    }

    @NotNull
    public final ActivityGoal copy(@NotNull GoalType type, int value, boolean isRemindEnable) {
        return new ActivityGoal(type, value, isRemindEnable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivityGoal)) {
            return false;
        }
        ActivityGoal activityGoal = (ActivityGoal) other;
        return this.type == activityGoal.type && this.value == activityGoal.value && this.isRemindEnable == activityGoal.isRemindEnable;
    }

    @NotNull
    public final byte[] getBytes$bluetooth_release() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(ByteUtilsKt.toInt(isRemindEnable()));
        byteArrayOutputStream.write(getType().getConverter().invoke(Integer.valueOf(getValue())));
        return byteArrayOutputStream.toByteArray();
    }

    @NotNull
    public final GoalType getType() {
        return this.type;
    }

    public final int getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        int iHashCode = ((this.type.hashCode() * 31) + this.value) * 31;
        boolean z = this.isRemindEnable;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final boolean isRemindEnable() {
        return this.isRemindEnable;
    }

    public final void setRemindEnable(boolean z) {
        this.isRemindEnable = z;
    }

    @NotNull
    public String toString() {
        return "ActivityGoal(type=" + this.type + ", value=" + this.value + ", isRemindEnable=" + this.isRemindEnable + ')';
    }

    public /* synthetic */ ActivityGoal(GoalType goalType, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(goalType, i, (i2 & 4) != 0 ? false : z);
    }
}
