package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003R\u0017\u0010\u000b\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lfu;", "R", "Lol;", "", "toString", "", "hashCode", "", "other", "", "equals", "data", "Ljava/lang/Object;", PluginDeviceInfo.FMODEL, "()Ljava/lang/Object;", "<init>", "(Ljava/lang/Object;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class fu<R> extends ol<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final R f18239b;

    public fu(R r2) {
        super(null);
        this.f18239b = r2;
    }

    public final R a() {
        return this.f18239b;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof fu) && Intrinsics.areEqual(this.f18239b, ((fu) other).f18239b);
    }

    public int hashCode() {
        R r2 = this.f18239b;
        if (r2 == null) {
            return 0;
        }
        return r2.hashCode();
    }

    @NotNull
    public String toString() {
        R r2 = this.f18239b;
        return "Success(data=" + (r2 instanceof byte[] ? tet.x((byte[]) r2) : String.valueOf(r2)) + ')';
    }
}
