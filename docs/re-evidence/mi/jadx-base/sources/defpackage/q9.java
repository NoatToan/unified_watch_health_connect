package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0014"}, d2 = {"Lq9;", "", "", "toString", "", "hashCode", "other", "", "equals", "version", "I", PluginDeviceInfo.FDESC, "()I", "setVersion", "(I)V", "flag", PluginDeviceInfo.FMODEL, "setFlag", "<init>", "(II)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class q9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f31243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f31244b;

    public q9(int i, int i2) {
        this.f31243a = i;
        this.f31244b = i2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF31244b() {
        return this.f31244b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getF31243a() {
        return this.f31243a;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof q9)) {
            return false;
        }
        q9 q9Var = (q9) other;
        return this.f31243a == q9Var.f31243a && this.f31244b == q9Var.f31244b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f31243a) * 31) + Integer.hashCode(this.f31244b);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f31243a);
        sb.append(',');
        sb.append(this.f31244b);
        return sb.toString();
    }
}
