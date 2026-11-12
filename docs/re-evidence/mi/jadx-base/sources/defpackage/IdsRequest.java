package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ij, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u0012"}, d2 = {"Lij;", "", "", PluginDeviceInfo.FMODEL, "", "toString", "", "hashCode", "other", "", "equals", "Llr;", "cmd", "", "", "ids", "<init>", "(Llr;Ljava/util/List;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class IdsRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    @NotNull
    public final lr cmd;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @NotNull
    public final List<Long> ids;

    public IdsRequest(@NotNull lr cmd, @NotNull List<Long> ids) {
        Intrinsics.checkNotNullParameter(cmd, "cmd");
        Intrinsics.checkNotNullParameter(ids, "ids");
        this.cmd = cmd;
        this.ids = ids;
    }

    @NotNull
    public final byte[] a() {
        byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(new byte[]{this.cmd.b()}, c3.a(this.ids.size(), 2));
        Iterator<T> it = this.ids.iterator();
        while (it.hasNext()) {
            bArrPlus = ArraysKt___ArraysJvmKt.plus(bArrPlus, ju.b(((Number) it.next()).longValue()));
        }
        return bArrPlus;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdsRequest)) {
            return false;
        }
        IdsRequest idsRequest = (IdsRequest) other;
        return this.cmd == idsRequest.cmd && Intrinsics.areEqual(this.ids, idsRequest.ids);
    }

    public int hashCode() {
        return (this.cmd.hashCode() * 31) + this.ids.hashCode();
    }

    @NotNull
    public String toString() {
        return "IdsRequest(cmd=" + this.cmd + ", ids=" + this.ids + ')';
    }
}
