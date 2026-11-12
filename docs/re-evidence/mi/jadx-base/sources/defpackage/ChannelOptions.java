package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: i4, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Li4;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lsft;", "mtu", "Lsft;", PluginDeviceInfo.FMODEL, "()Lsft;", "<init>", "(Lsft;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class ChannelOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    @NotNull
    public final sft mtu;

    public ChannelOptions(@NotNull sft mtu) {
        Intrinsics.checkNotNullParameter(mtu, "mtu");
        this.mtu = mtu;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final sft getMtu() {
        return this.mtu;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ChannelOptions) && Intrinsics.areEqual(this.mtu, ((ChannelOptions) other).mtu);
    }

    public int hashCode() {
        return this.mtu.hashCode();
    }

    @NotNull
    public String toString() {
        return "ChannelOptions(mtu=" + this.mtu + ')';
    }
}
