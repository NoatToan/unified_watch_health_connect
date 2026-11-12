package androidx.health.connect.client.records.metadata;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B)\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001d\u0010\u0010\u001a\u00020\u00068\u0006¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0012\u0010\b¨\u0006\u0018"}, d2 = {"Landroidx/health/connect/client/records/metadata/Device;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "manufacturer", "Ljava/lang/String;", "getManufacturer", "()Ljava/lang/String;", "model", "getModel", "type", "I", "getType", "getType$annotations", "()V", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "Companion", "connect-client_release"}, k = 1, mv = {1, 8, 0})
public final class Device {
    public static final int TYPE_CHEST_STRAP = 7;
    public static final int TYPE_FITNESS_BAND = 6;
    public static final int TYPE_HEAD_MOUNTED = 5;
    public static final int TYPE_PHONE = 2;
    public static final int TYPE_RING = 4;
    public static final int TYPE_SCALE = 3;
    public static final int TYPE_SMART_DISPLAY = 8;
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_WATCH = 1;

    @Nullable
    private final String manufacturer;

    @Nullable
    private final String model;
    private final int type;

    public Device() {
        this(null, null, 0, 7, null);
    }

    public static /* synthetic */ void getType$annotations() {
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(Device.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type androidx.health.connect.client.records.metadata.Device");
        Device device = (Device) other;
        return Intrinsics.areEqual(this.manufacturer, device.manufacturer) && Intrinsics.areEqual(this.model, device.model) && this.type == device.type;
    }

    @Nullable
    public final String getManufacturer() {
        return this.manufacturer;
    }

    @Nullable
    public final String getModel() {
        return this.model;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.manufacturer;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.model;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.type;
    }

    public Device(@Nullable String str, @Nullable String str2, int i) {
        this.manufacturer = str;
        this.model = str2;
        this.type = i;
    }

    public /* synthetic */ Device(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? 0 : i);
    }
}
