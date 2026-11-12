package com.huami.step.model;

import com.huami.treadmill.ui.tdmillhome.TdmillHmFragment;
import defpackage.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0007\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/huami/step/model/UserOfStep;", "", "", "component1", "", "component2", "registerTime", TdmillHmFragment.ARG_IS_OVERSEA, "copy", "", "toString", "", "hashCode", "other", "equals", "a", "J", "getRegisterTime", "()J", "b", "Z", "()Z", "<init>", "(JZ)V", "step_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class UserOfStep {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long registerTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final boolean isOversea;

    public UserOfStep(long j, boolean z) {
        this.registerTime = j;
        this.isOversea = z;
    }

    public static /* synthetic */ UserOfStep copy$default(UserOfStep userOfStep, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = userOfStep.registerTime;
        }
        if ((i & 2) != 0) {
            z = userOfStep.isOversea;
        }
        return userOfStep.copy(j, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getRegisterTime() {
        return this.registerTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsOversea() {
        return this.isOversea;
    }

    @NotNull
    public final UserOfStep copy(long registerTime, boolean isOversea) {
        return new UserOfStep(registerTime, isOversea);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserOfStep)) {
            return false;
        }
        UserOfStep userOfStep = (UserOfStep) other;
        return this.registerTime == userOfStep.registerTime && this.isOversea == userOfStep.isOversea;
    }

    public final long getRegisterTime() {
        return this.registerTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iA = b.a(this.registerTime) * 31;
        boolean z = this.isOversea;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iA + r1;
    }

    public final boolean isOversea() {
        return this.isOversea;
    }

    @NotNull
    public String toString() {
        return "UserOfStep(registerTime=" + this.registerTime + ", isOversea=" + this.isOversea + ")";
    }
}
