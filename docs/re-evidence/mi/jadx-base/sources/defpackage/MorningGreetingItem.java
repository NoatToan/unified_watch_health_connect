package defpackage;

import androidx.annotation.IntRange;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: rl, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\t\u001a\u00020\u0004\u0012\b\b\u0003\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lrl;", "", "", "toString", "", "hashCode", "other", "", "equals", "uid", "I", PluginDeviceInfo.FICONON, "()I", "suid", PluginDeviceInfo.FDESC, "Lzc;", "enable", "Lzc;", PluginDeviceInfo.FMODEL, "()Lzc;", "<init>", "(IILzc;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class MorningGreetingItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final int uid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    public final int suid;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final zc enable;

    public MorningGreetingItem(@IntRange(from = 0) int i, @IntRange(from = 0) int i2, @NotNull zc enable) {
        Intrinsics.checkNotNullParameter(enable, "enable");
        this.uid = i;
        this.suid = i2;
        this.enable = enable;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final zc getEnable() {
        return this.enable;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getSuid() {
        return this.suid;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getUid() {
        return this.uid;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MorningGreetingItem)) {
            return false;
        }
        MorningGreetingItem morningGreetingItem = (MorningGreetingItem) other;
        return this.uid == morningGreetingItem.uid && this.suid == morningGreetingItem.suid && this.enable == morningGreetingItem.enable;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.uid) * 31) + Integer.hashCode(this.suid)) * 31) + this.enable.hashCode();
    }

    @NotNull
    public String toString() {
        return "MorningGreetingItem(uid=" + this.uid + ", suid=" + this.suid + ", enable=" + this.enable + ')';
    }
}
