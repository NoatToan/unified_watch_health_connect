package defpackage;

import com.mibi.sdk.component.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: n1, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0011B)\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u0012"}, d2 = {"Ln1;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lgg;", "role", "level", Constants.KEY_CHARGE_STATUS, "", "recentBatteryTime", "<init>", "(Lgg;IZLjava/lang/Long;)V", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class BatteryInfo {

    @NotNull
    public static final a e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    @NotNull
    public final gg role;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    public final int level;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final boolean chargeStatus;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public final Long recentBatteryTime;

    /* JADX INFO: renamed from: n1$a */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Ln1$a;", "", "Ljava/nio/ByteBuffer;", "byteBuffer", "", "role", "Ln1;", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BatteryInfo a(@NotNull ByteBuffer byteBuffer, int role) {
            Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
            return new BatteryInfo(gg.f18943b.a(role), byteBuffer.get(), c3.a(byteBuffer.get()), (byteBuffer.position() >= byteBuffer.limit() || role != gg.a.c.getF18944a()) ? null : Long.valueOf(tet.v(new byte[]{byteBuffer.get(), byteBuffer.get(), byteBuffer.get(), byteBuffer.get()}, 0, 4)));
        }
    }

    public BatteryInfo(@NotNull gg role, int i, boolean z, @Nullable Long l) {
        Intrinsics.checkNotNullParameter(role, "role");
        this.role = role;
        this.level = i;
        this.chargeStatus = z;
        this.recentBatteryTime = l;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BatteryInfo)) {
            return false;
        }
        BatteryInfo batteryInfo = (BatteryInfo) other;
        return Intrinsics.areEqual(this.role, batteryInfo.role) && this.level == batteryInfo.level && this.chargeStatus == batteryInfo.chargeStatus && Intrinsics.areEqual(this.recentBatteryTime, batteryInfo.recentBatteryTime);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public int hashCode() {
        int iHashCode = ((this.role.hashCode() * 31) + Integer.hashCode(this.level)) * 31;
        boolean z = this.chargeStatus;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        Long l = this.recentBatteryTime;
        return i + (l == null ? 0 : l.hashCode());
    }

    @NotNull
    public String toString() {
        return "BatteryInfo(role=" + this.role + ", level=" + this.level + ", chargeStatus=" + this.chargeStatus + ", recentBatteryTime=" + this.recentBatteryTime + ')';
    }
}
