package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetFragment;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: hn, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\u001c\b\u0002\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lhn;", "", "", "toString", "", "hashCode", "other", "", "equals", "version", "I", PluginDeviceInfo.FMODEL, "()I", VibrateModeSetFragment.MAX, "supportReply", "supportVibration", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "vibrationList", "<init>", "(IIZZLjava/util/ArrayList;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class NotificationVersion {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final int version;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    public final int max;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final boolean supportReply;

    /* JADX INFO: renamed from: d, reason: from toString */
    public final boolean supportVibration;

    /* JADX INFO: renamed from: e, reason: from toString */
    @Nullable
    public final ArrayList<Integer> vibrationList;

    public NotificationVersion(int i, int i2, boolean z, boolean z2, @Nullable ArrayList<Integer> arrayList) {
        this.version = i;
        this.max = i2;
        this.supportReply = z;
        this.supportVibration = z2;
        this.vibrationList = arrayList;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationVersion)) {
            return false;
        }
        NotificationVersion notificationVersion = (NotificationVersion) other;
        return this.version == notificationVersion.version && this.max == notificationVersion.max && this.supportReply == notificationVersion.supportReply && this.supportVibration == notificationVersion.supportVibration && Intrinsics.areEqual(this.vibrationList, notificationVersion.vibrationList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.version) * 31) + Integer.hashCode(this.max)) * 31;
        boolean z = this.supportReply;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.supportVibration;
        int i2 = (i + (z2 ? 1 : z2)) * 31;
        ArrayList<Integer> arrayList = this.vibrationList;
        return i2 + (arrayList == null ? 0 : arrayList.hashCode());
    }

    @NotNull
    public String toString() {
        return "NotificationVersion(version=" + this.version + ", max=" + this.max + ", supportReply=" + this.supportReply + ", supportVibration=" + this.supportVibration + ", vibrationList=" + this.vibrationList + ')';
    }

    public /* synthetic */ NotificationVersion(int i, int i2, boolean z, boolean z2, ArrayList arrayList, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? false : z2, (i3 & 16) != 0 ? null : arrayList);
    }
}
