package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: br, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lbr;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lr8;", "type", "Lr8;", PluginDeviceInfo.FDESC, "()Lr8;", "status", "I", PluginDeviceInfo.FMODEL, "()I", "<init>", "(Lr8;I)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class ScaleDataItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    @NotNull
    public final r8 type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    public final int status;

    public ScaleDataItem(@NotNull r8 type, int i) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.status = i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final r8 getType() {
        return this.type;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScaleDataItem)) {
            return false;
        }
        ScaleDataItem scaleDataItem = (ScaleDataItem) other;
        return this.type == scaleDataItem.type && this.status == scaleDataItem.status;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + Integer.hashCode(this.status);
    }

    @NotNull
    public String toString() {
        return "ScaleDataItem(type=" + this.type + ", status=" + this.status + ')';
    }
}
