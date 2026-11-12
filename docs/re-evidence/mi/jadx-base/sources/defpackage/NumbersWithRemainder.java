package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: in, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\u000b\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\f¨\u0006\u0017"}, d2 = {"Lin;", "", "", "toString", "", "hashCode", "other", "", "equals", "floor", "I", PluginDeviceInfo.FMODEL, "()I", "(I)V", "", "remainder", "F", PluginDeviceInfo.FICONON, "()F", "index", PluginDeviceInfo.FDESC, "<init>", "(IFI)V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public final /* data */ class NumbersWithRemainder {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public int floor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    public final float remainder;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final int index;

    public NumbersWithRemainder(int i, float f, int i2) {
        this.floor = i;
        this.remainder = f;
        this.index = i2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getFloor() {
        return this.floor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getRemainder() {
        return this.remainder;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NumbersWithRemainder)) {
            return false;
        }
        NumbersWithRemainder numbersWithRemainder = (NumbersWithRemainder) other;
        return this.floor == numbersWithRemainder.floor && Float.compare(this.remainder, numbersWithRemainder.remainder) == 0 && this.index == numbersWithRemainder.index;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.floor) * 31) + Float.hashCode(this.remainder)) * 31) + Integer.hashCode(this.index);
    }

    @NotNull
    public String toString() {
        return "NumbersWithRemainder(floor=" + this.floor + ", remainder=" + this.remainder + ", index=" + this.index + ')';
    }

    public final void a(int i) {
        this.floor = i;
    }
}
