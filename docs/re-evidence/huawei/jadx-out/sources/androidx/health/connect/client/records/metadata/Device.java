package androidx.health.connect.client.records.metadata;

import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.zcm;
import defpackage.zcp;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationRetention;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00152\u00020\u0001:\u0002\u0015\u0016B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0003H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016R\u0017\u0010\u0002\u001a\u00020\u0003¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0017"}, d2 = {"Landroidx/health/connect/client/records/metadata/Device;", "", "type", "", "manufacturer", "", "model", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getType$annotations", "()V", "getType", "()I", "getManufacturer", "()Ljava/lang/String;", "getModel", "equals", "", "other", WatchFaceConstant.HASHCODE, "toString", "Companion", "DeviceType", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
    private final String manufacturer;
    private final String model;
    private final int type;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/health/connect/client/records/metadata/Device$DeviceType;", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface DeviceType {
    }

    public static /* synthetic */ void getType$annotations() {
    }

    public Device(int i, String str, String str2) {
        this.type = i;
        this.manufacturer = str;
        this.model = str2;
    }

    public /* synthetic */ Device(int i, String str, String str2, int i2, zcm zcmVar) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2);
    }

    public final int getType() {
        return this.type;
    }

    public final String getManufacturer() {
        return this.manufacturer;
    }

    public final String getModel() {
        return this.model;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!zcp.b(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        zcp.e(other, "");
        Device device = (Device) other;
        return this.type == device.type && zcp.b((Object) this.manufacturer, (Object) device.manufacturer) && zcp.b((Object) this.model, (Object) device.model);
    }

    public int hashCode() {
        int i = this.type;
        String str = this.manufacturer;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.model;
        return (((i * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Device(type=" + this.type + ", manufacturer=" + this.manufacturer + ", model=" + this.model + g4.l;
    }
}
