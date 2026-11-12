package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: yr, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lyr;", "T", "", "", "toString", "", "hashCode", "other", "", "equals", "success", "Z", PluginDeviceInfo.FMODEL, "()Z", DeviceTagInterface.CUSTOM_TAG_TYPE, "Ljava/lang/Object;", PluginDeviceInfo.FDESC, "()Ljava/lang/Object;", "<init>", "(ZLjava/lang/Object;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class SettingResult<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final boolean success;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @Nullable
    public final T t;

    public SettingResult(boolean z, @Nullable T t) {
        this.success = z;
        this.t = t;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @Nullable
    public final T b() {
        return this.t;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SettingResult)) {
            return false;
        }
        SettingResult settingResult = (SettingResult) other;
        return this.success == settingResult.success && Intrinsics.areEqual(this.t, settingResult.t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.success;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        T t = this.t;
        return i + (t == null ? 0 : t.hashCode());
    }

    @NotNull
    public String toString() {
        return "SettingResult(success=" + this.success + ", t=" + this.t + ')';
    }

    public /* synthetic */ SettingResult(boolean z, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : obj);
    }
}
