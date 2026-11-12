package com.huami.bluetooth.profile.channel.module.notification;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\u001c\b\u0002\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\t¢\u0006\u0004\b&\u0010'J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\tHÆ\u0003JO\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\u001c\b\u0002\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\tHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\r\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u000e\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR-\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\t8\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/NotificationVersion;", "", "", "component1", "component2", "", "component3", "component4", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "component5", "version", "max", "supportReply", "supportVibration", "vibrationList", "copy", "", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getVersion", "()I", "b", "getMax", "c", "Z", "getSupportReply", "()Z", GoogleApiAvailabilityLight.a, "getSupportVibration", "e", "Ljava/util/ArrayList;", "getVibrationList", "()Ljava/util/ArrayList;", "<init>", "(IIZZLjava/util/ArrayList;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class NotificationVersion {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int version;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int max;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final boolean supportReply;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final boolean supportVibration;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final ArrayList<Integer> vibrationList;

    public NotificationVersion(int i, int i2, boolean z, boolean z2, @Nullable ArrayList<Integer> arrayList) {
        this.version = i;
        this.max = i2;
        this.supportReply = z;
        this.supportVibration = z2;
        this.vibrationList = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotificationVersion copy$default(NotificationVersion notificationVersion, int i, int i2, boolean z, boolean z2, ArrayList arrayList, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = notificationVersion.version;
        }
        if ((i3 & 2) != 0) {
            i2 = notificationVersion.max;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            z = notificationVersion.supportReply;
        }
        boolean z3 = z;
        if ((i3 & 8) != 0) {
            z2 = notificationVersion.supportVibration;
        }
        boolean z4 = z2;
        if ((i3 & 16) != 0) {
            arrayList = notificationVersion.vibrationList;
        }
        return notificationVersion.copy(i, i4, z3, z4, arrayList);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMax() {
        return this.max;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getSupportReply() {
        return this.supportReply;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getSupportVibration() {
        return this.supportVibration;
    }

    @Nullable
    public final ArrayList<Integer> component5() {
        return this.vibrationList;
    }

    @NotNull
    public final NotificationVersion copy(int version, int max, boolean supportReply, boolean supportVibration, @Nullable ArrayList<Integer> vibrationList) {
        return new NotificationVersion(version, max, supportReply, supportVibration, vibrationList);
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

    public final int getMax() {
        return this.max;
    }

    public final boolean getSupportReply() {
        return this.supportReply;
    }

    public final boolean getSupportVibration() {
        return this.supportVibration;
    }

    public final int getVersion() {
        return this.version;
    }

    @Nullable
    public final ArrayList<Integer> getVibrationList() {
        return this.vibrationList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int i = ((this.version * 31) + this.max) * 31;
        boolean z = this.supportReply;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i2 = (i + r1) * 31;
        boolean z2 = this.supportVibration;
        int i3 = (i2 + (z2 ? 1 : z2)) * 31;
        ArrayList<Integer> arrayList = this.vibrationList;
        return i3 + (arrayList == null ? 0 : arrayList.hashCode());
    }

    @NotNull
    public String toString() {
        return "NotificationVersion(version=" + this.version + ", max=" + this.max + ", supportReply=" + this.supportReply + ", supportVibration=" + this.supportVibration + ", vibrationList=" + this.vibrationList + ')';
    }

    public /* synthetic */ NotificationVersion(int i, int i2, boolean z, boolean z2, ArrayList arrayList, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? false : z2, (i3 & 16) != 0 ? null : arrayList);
    }
}
