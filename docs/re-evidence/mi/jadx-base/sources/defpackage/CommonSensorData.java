package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: b5, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017B\u001f\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0016\u0010\u0018J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lb5;", "Lxdt;", "Lvr;", PluginDeviceInfo.FMODEL, "()Lvr;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "dataType", "", "", "data", "", "timestamp", "<init>", "(Lvr;Ljava/util/List;Ljava/lang/Long;)V", "(Lvr;Ljava/util/List;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class CommonSensorData extends xdt {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    @NotNull
    public final vr dataType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @NotNull
    public final List<Number> data;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public final Long timestamp;

    /* JADX WARN: Multi-variable type inference failed */
    public CommonSensorData(@NotNull vr dataType, @NotNull List<? extends Number> data, @Nullable Long l) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        Intrinsics.checkNotNullParameter(data, "data");
        this.dataType = dataType;
        this.data = data;
        this.timestamp = l;
    }

    @Override // defpackage.xdt
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public vr getDataType() {
        return this.dataType;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonSensorData)) {
            return false;
        }
        CommonSensorData commonSensorData = (CommonSensorData) other;
        return this.dataType == commonSensorData.dataType && Intrinsics.areEqual(this.data, commonSensorData.data) && Intrinsics.areEqual(this.timestamp, commonSensorData.timestamp);
    }

    public int hashCode() {
        int iHashCode = ((this.dataType.hashCode() * 31) + this.data.hashCode()) * 31;
        Long l = this.timestamp;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    @NotNull
    public String toString() {
        return "CommonSensorData(dataType=" + this.dataType + ", data=" + this.data + ", timestamp=" + this.timestamp + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommonSensorData(@NotNull vr dataType, @NotNull List<? extends Number> data) {
        this(dataType, data, null);
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        Intrinsics.checkNotNullParameter(data, "data");
    }
}
