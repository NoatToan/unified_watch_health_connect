package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: f5, reason: from toString */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lf5;", "", "", "toString", "", "hashCode", "other", "", "equals", "mtu", "I", PluginDeviceInfo.FMODEL, "()I", "<init>", "(I)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class ConnectParam {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final int mtu;

    public ConnectParam(int i) {
        this.mtu = i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getMtu() {
        return this.mtu;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ConnectParam) && this.mtu == ((ConnectParam) other).mtu;
    }

    public int hashCode() {
        return Integer.hashCode(this.mtu);
    }

    @NotNull
    public String toString() {
        return "ConnectParam(mtu=" + this.mtu + ')';
    }
}
