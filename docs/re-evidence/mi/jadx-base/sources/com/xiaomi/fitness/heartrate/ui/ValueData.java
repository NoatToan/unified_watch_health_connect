package com.xiaomi.fitness.heartrate.ui;

import android.content.Context;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 &2\u00020\u0001:\u0001&B!\b\u0016\u0012\u0016\u0010\u0002\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\"\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006B)\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0016\u0010\u0002\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\"\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\tJ\u0013\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0002\u0010\u0014J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004J\b\u0010\u001f\u001a\u00020\u000bH\u0016J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u000e\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020%R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\r¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/heartrate/ui/ValueData;", "", Constants.KEY_RECHARGE_VALUES, "", "", "<init>", "([Ljava/lang/Number;)V", "description", "", "(Ljava/lang/String;[Ljava/lang/Number;)V", "uniqueIndex", "", "getUniqueIndex", "()I", "setUniqueIndex", "(I)V", "[Ljava/lang/Number;", "getDescription", "()Ljava/lang/String;", "getValues", "()[Ljava/lang/Number;", "getDataAt", "idx", "def", "begin", "getBegin", "()Ljava/lang/Number;", StatConstants.PARAM_END, "getEnd", MediaStoreUtil.MediaInfo.SIZE, "getSize", "hashCode", "equals", "", DeviceTagInterface.CUSTOM_TAG_DEVICE_TAG_ORDER, "toString", "context", "Landroid/content/Context;", "Companion", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ValueData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ValueData EMPTY = new ValueData("", new Number[0]);

    @NotNull
    private static final Number[] NULL_VALUES = new Number[0];

    @NotNull
    private final String description;
    private int uniqueIndex;

    @Nullable
    private final Number[] values;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0004\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/heartrate/ui/ValueData$Companion;", "", "<init>", "()V", "EMPTY", "Lcom/xiaomi/fitness/heartrate/ui/ValueData;", "getEMPTY", "()Lcom/xiaomi/fitness/heartrate/ui/ValueData;", "NULL_VALUES", "", "", "[Ljava/lang/Number;", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ValueData getEMPTY() {
            return ValueData.EMPTY;
        }
    }

    public ValueData(@NotNull Number... values) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.values = (Number[]) Arrays.copyOf(values, values.length);
        this.description = "";
    }

    public boolean equals(@Nullable Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || !Intrinsics.areEqual(ValueData.class, o.getClass())) {
            return false;
        }
        ValueData valueData = (ValueData) o;
        return Arrays.equals(this.values, valueData.values) && Intrinsics.areEqual(this.description, valueData.description);
    }

    @Nullable
    public final Number getBegin() {
        return getDataAt(0, null);
    }

    @Nullable
    public final Number getDataAt(int idx, @Nullable Number def) {
        Number[] numberArr = this.values;
        return (numberArr == null || numberArr.length == 0 || numberArr.length <= idx) ? def : numberArr[idx];
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final Number getEnd() {
        int size = getSize();
        if (size <= 0) {
            return null;
        }
        return getDataAt(size - 1, null);
    }

    public final int getSize() {
        Number[] numberArr = this.values;
        if (numberArr != null) {
            return numberArr.length;
        }
        return 0;
    }

    public final int getUniqueIndex() {
        return this.uniqueIndex;
    }

    @NotNull
    public final Number[] getValues() {
        Number[] numberArr = this.values;
        return numberArr == null ? NULL_VALUES : numberArr;
    }

    public int hashCode() {
        return (Objects.hash(this.description) * 31) + Arrays.hashCode(this.values);
    }

    public final void setUniqueIndex(int i) {
        this.uniqueIndex = i;
    }

    @NotNull
    public final String toString(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = this.description;
        Number[] numberArr = this.values;
        return str + (numberArr != null ? Arrays.toString(numberArr) : AbstractJsonLexerKt.NULL);
    }

    public ValueData(@NotNull String description, @NotNull Number... values) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(values, "values");
        Objects.requireNonNull(description);
        this.description = description;
        this.values = (Number[]) Arrays.copyOf(values, values.length);
    }
}
