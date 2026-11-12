package com.huami.bluetooth.profile.channel.module.hearing.entity.battery;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/entity/battery/EarphoneStatus;", "", "", "component1", "component2", "leftInCase", "rightInCase", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Z", "getLeftInCase", "()Z", "setLeftInCase", "(Z)V", "b", "getRightInCase", "setRightInCase", "<init>", "(ZZ)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class EarphoneStatus {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private boolean leftInCase;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private boolean rightInCase;

    /* JADX WARN: Illegal instructions before constructor call */
    public EarphoneStatus() {
        boolean z = false;
        this(z, z, 3, null);
    }

    public EarphoneStatus(boolean z, boolean z2) {
        this.leftInCase = z;
        this.rightInCase = z2;
    }

    public static /* synthetic */ EarphoneStatus copy$default(EarphoneStatus earphoneStatus, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = earphoneStatus.leftInCase;
        }
        if ((i & 2) != 0) {
            z2 = earphoneStatus.rightInCase;
        }
        return earphoneStatus.copy(z, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getLeftInCase() {
        return this.leftInCase;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getRightInCase() {
        return this.rightInCase;
    }

    @NotNull
    public final EarphoneStatus copy(boolean leftInCase, boolean rightInCase) {
        return new EarphoneStatus(leftInCase, rightInCase);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EarphoneStatus)) {
            return false;
        }
        EarphoneStatus earphoneStatus = (EarphoneStatus) other;
        return this.leftInCase == earphoneStatus.leftInCase && this.rightInCase == earphoneStatus.rightInCase;
    }

    public final boolean getLeftInCase() {
        return this.leftInCase;
    }

    public final boolean getRightInCase() {
        return this.rightInCase;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public int hashCode() {
        boolean z = this.leftInCase;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.rightInCase;
        return i + (z2 ? 1 : z2);
    }

    public final void setLeftInCase(boolean z) {
        this.leftInCase = z;
    }

    public final void setRightInCase(boolean z) {
        this.rightInCase = z;
    }

    @NotNull
    public String toString() {
        return "EarphoneStatus(leftInCase=" + this.leftInCase + ", rightInCase=" + this.rightInCase + ')';
    }

    public /* synthetic */ EarphoneStatus(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
