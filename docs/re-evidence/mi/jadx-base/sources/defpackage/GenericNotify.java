package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: sc, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u000b\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lsc;", "", "", PluginDeviceInfo.FDESC, "", "toString", "", "hashCode", "other", "equals", "", "data", "[B", PluginDeviceInfo.FMODEL, "()[B", "opCode", "version", "type", "index", "<init>", "(IIII[B)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class GenericNotify {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final int opCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    public final int version;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final int type;

    /* JADX INFO: renamed from: d, reason: from toString */
    public final int index;

    /* JADX INFO: renamed from: e, reason: from toString */
    @NotNull
    public final byte[] data;

    public GenericNotify(int i, int i2, int i3, int i4, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.opCode = i;
        this.version = i2;
        this.type = i3;
        this.index = i4;
        this.data = data;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    public final boolean b() {
        int i = this.type;
        return i == 2 || i == 3;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenericNotify)) {
            return false;
        }
        GenericNotify genericNotify = (GenericNotify) other;
        return this.opCode == genericNotify.opCode && this.version == genericNotify.version && this.type == genericNotify.type && this.index == genericNotify.index && Intrinsics.areEqual(this.data, genericNotify.data);
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.opCode) * 31) + Integer.hashCode(this.version)) * 31) + Integer.hashCode(this.type)) * 31) + Integer.hashCode(this.index)) * 31) + Arrays.hashCode(this.data);
    }

    @NotNull
    public String toString() {
        return "GenericNotify(opCode=" + this.opCode + ", version=" + this.version + ", type=" + this.type + ", index=" + this.index + ", data=" + Arrays.toString(this.data) + ')';
    }
}
