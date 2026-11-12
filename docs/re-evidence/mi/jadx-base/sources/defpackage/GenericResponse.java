package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: vc, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0005\u0010\u000e¨\u0006\u0012"}, d2 = {"Lvc;", "", "", "cmd", "", PluginDeviceInfo.FMODEL, "", "toString", "hashCode", "other", "equals", "", "data", "[B", "()[B", "status", "<init>", "(II[B)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class GenericResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final int cmd;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    public final int status;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final byte[] data;

    public GenericResponse(int i, int i2, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.cmd = i;
        this.status = i2;
        this.data = data;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenericResponse)) {
            return false;
        }
        GenericResponse genericResponse = (GenericResponse) other;
        return this.cmd == genericResponse.cmd && this.status == genericResponse.status && Intrinsics.areEqual(this.data, genericResponse.data);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.cmd) * 31) + Integer.hashCode(this.status)) * 31) + Arrays.hashCode(this.data);
    }

    @NotNull
    public String toString() {
        return "GenericResponse(cmd=" + this.cmd + ", status=" + this.status + ", data=" + Arrays.toString(this.data) + ')';
    }

    public final boolean a(int cmd) {
        int i = this.status;
        return (i == 1 || i == 2) && this.cmd == cmd;
    }
}
