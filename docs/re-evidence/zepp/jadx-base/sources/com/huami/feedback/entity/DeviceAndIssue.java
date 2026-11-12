package com.huami.feedback.entity;

import com.huami.feedback.sync.api.device.FeedbackDevice;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J)\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\t\u0010\u0018R\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/huami/feedback/entity/DeviceAndIssue;", "", "Lcom/huami/feedback/sync/api/device/FeedbackDevice;", "component1", "", "component2", "Lcom/huami/feedback/entity/Issue;", "component3", "feedbackDevice", "isConnected", "issue", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Lcom/huami/feedback/sync/api/device/FeedbackDevice;", "getFeedbackDevice", "()Lcom/huami/feedback/sync/api/device/FeedbackDevice;", "b", "Z", "()Z", "c", "Lcom/huami/feedback/entity/Issue;", "getIssue", "()Lcom/huami/feedback/entity/Issue;", "<init>", "(Lcom/huami/feedback/sync/api/device/FeedbackDevice;ZLcom/huami/feedback/entity/Issue;)V", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DeviceAndIssue {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final FeedbackDevice feedbackDevice;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final boolean isConnected;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final Issue issue;

    public DeviceAndIssue(@Nullable FeedbackDevice feedbackDevice, boolean z, @NotNull Issue issue) {
        this.feedbackDevice = feedbackDevice;
        this.isConnected = z;
        this.issue = issue;
    }

    public static /* synthetic */ DeviceAndIssue copy$default(DeviceAndIssue deviceAndIssue, FeedbackDevice feedbackDevice, boolean z, Issue issue, int i, Object obj) {
        if ((i & 1) != 0) {
            feedbackDevice = deviceAndIssue.feedbackDevice;
        }
        if ((i & 2) != 0) {
            z = deviceAndIssue.isConnected;
        }
        if ((i & 4) != 0) {
            issue = deviceAndIssue.issue;
        }
        return deviceAndIssue.copy(feedbackDevice, z, issue);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final FeedbackDevice getFeedbackDevice() {
        return this.feedbackDevice;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsConnected() {
        return this.isConnected;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Issue getIssue() {
        return this.issue;
    }

    @NotNull
    public final DeviceAndIssue copy(@Nullable FeedbackDevice feedbackDevice, boolean isConnected, @NotNull Issue issue) {
        return new DeviceAndIssue(feedbackDevice, isConnected, issue);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceAndIssue)) {
            return false;
        }
        DeviceAndIssue deviceAndIssue = (DeviceAndIssue) other;
        return Intrinsics.areEqual(this.feedbackDevice, deviceAndIssue.feedbackDevice) && this.isConnected == deviceAndIssue.isConnected && Intrinsics.areEqual(this.issue, deviceAndIssue.issue);
    }

    @Nullable
    public final FeedbackDevice getFeedbackDevice() {
        return this.feedbackDevice;
    }

    @NotNull
    public final Issue getIssue() {
        return this.issue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public int hashCode() {
        FeedbackDevice feedbackDevice = this.feedbackDevice;
        int iHashCode = (feedbackDevice == null ? 0 : feedbackDevice.hashCode()) * 31;
        boolean z = this.isConnected;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((iHashCode + r1) * 31) + this.issue.hashCode();
    }

    public final boolean isConnected() {
        return this.isConnected;
    }

    @NotNull
    public String toString() {
        return "DeviceAndIssue(feedbackDevice=" + this.feedbackDevice + ", isConnected=" + this.isConnected + ", issue=" + this.issue + ')';
    }
}
