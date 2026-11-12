package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0013\u0010\u0019R\"\u0010\u001a\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u001b\u0010\f\"\u0004\b\u0013\u0010\u000e¨\u0006\u001f"}, d2 = {"Lp1;", "", "", "toString", "", "hashCode", "other", "", "equals", "remainElectricity", "I", "getRemainElectricity", "()I", PluginDeviceInfo.FDESC, "(I)V", "charging", "Z", "getCharging", "()Z", PluginDeviceInfo.FMODEL, "(Z)V", "lastTimeFullCharge", "Ljava/lang/String;", "getLastTimeFullCharge", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "levelLastCharge", "getLevelLastCharge", "lastTimeCharge", "<init>", "(IZLjava/lang/String;Ljava/lang/String;I)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f29886b;

    @NotNull
    public String c;

    @NotNull
    public String d;
    public int e;

    public p1() {
        this(0, false, null, null, 0, 31, null);
    }

    public final void a(boolean z) {
        this.f29886b = z;
    }

    public final void b(int i) {
        this.f29885a = i;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) other;
        return this.f29885a == p1Var.f29885a && this.f29886b == p1Var.f29886b && Intrinsics.areEqual(this.c, p1Var.c) && Intrinsics.areEqual(this.d, p1Var.d) && this.e == p1Var.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f29885a) * 31;
        boolean z = this.f29886b;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((((iHashCode + r1) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + Integer.hashCode(this.e);
    }

    @NotNull
    public String toString() {
        return "BatteryInfo{remainElectricity=" + this.f29885a + ",charging=" + this.f29886b + ",lastTimeFullCharge=" + this.c + ",lastTimeCharge=" + this.d + ",levelLastCharge=" + this.e + AbstractJsonLexerKt.END_OBJ;
    }

    public p1(int i, boolean z, @NotNull String lastTimeFullCharge, @NotNull String lastTimeCharge, int i2) {
        Intrinsics.checkNotNullParameter(lastTimeFullCharge, "lastTimeFullCharge");
        Intrinsics.checkNotNullParameter(lastTimeCharge, "lastTimeCharge");
        this.f29885a = i;
        this.f29886b = z;
        this.c = lastTimeFullCharge;
        this.d = lastTimeCharge;
        this.e = i2;
    }

    public final void a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.c = str;
    }

    public final void a(int i) {
        this.e = i;
    }

    public /* synthetic */ p1(int i, boolean z, String str, String str2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? -1 : i2);
    }
}
