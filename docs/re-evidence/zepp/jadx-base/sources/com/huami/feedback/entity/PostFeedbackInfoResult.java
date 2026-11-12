package com.huami.feedback.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\b¨\u0006 "}, d2 = {"Lcom/huami/feedback/entity/PostFeedbackInfoResult;", "", "", "component1", "", "component2", "", "component3", "()Ljava/lang/Long;", "success", "uploadUrl", "syncTime", "copy", "(ZLjava/lang/String;Ljava/lang/Long;)Lcom/huami/feedback/entity/PostFeedbackInfoResult;", "toString", "", "hashCode", "other", "equals", "a", "Z", "getSuccess", "()Z", "b", "Ljava/lang/String;", "getUploadUrl", "()Ljava/lang/String;", "c", "Ljava/lang/Long;", "getSyncTime", "<init>", "(ZLjava/lang/String;Ljava/lang/Long;)V", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PostFeedbackInfoResult {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean success;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final String uploadUrl;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long syncTime;

    public PostFeedbackInfoResult(boolean z, @Nullable String str, @Nullable Long l) {
        this.success = z;
        this.uploadUrl = str;
        this.syncTime = l;
    }

    public static /* synthetic */ PostFeedbackInfoResult copy$default(PostFeedbackInfoResult postFeedbackInfoResult, boolean z, String str, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            z = postFeedbackInfoResult.success;
        }
        if ((i & 2) != 0) {
            str = postFeedbackInfoResult.uploadUrl;
        }
        if ((i & 4) != 0) {
            l = postFeedbackInfoResult.syncTime;
        }
        return postFeedbackInfoResult.copy(z, str, l);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUploadUrl() {
        return this.uploadUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getSyncTime() {
        return this.syncTime;
    }

    @NotNull
    public final PostFeedbackInfoResult copy(boolean success, @Nullable String uploadUrl, @Nullable Long syncTime) {
        return new PostFeedbackInfoResult(success, uploadUrl, syncTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostFeedbackInfoResult)) {
            return false;
        }
        PostFeedbackInfoResult postFeedbackInfoResult = (PostFeedbackInfoResult) other;
        return this.success == postFeedbackInfoResult.success && Intrinsics.areEqual(this.uploadUrl, postFeedbackInfoResult.uploadUrl) && Intrinsics.areEqual(this.syncTime, postFeedbackInfoResult.syncTime);
    }

    public final boolean getSuccess() {
        return this.success;
    }

    @Nullable
    public final Long getSyncTime() {
        return this.syncTime;
    }

    @Nullable
    public final String getUploadUrl() {
        return this.uploadUrl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.success;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.uploadUrl;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.syncTime;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PostFeedbackInfoResult(success=" + this.success + ", uploadUrl=" + ((Object) this.uploadUrl) + ", syncTime=" + this.syncTime + ')';
    }

    public /* synthetic */ PostFeedbackInfoResult(boolean z, String str, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : l);
    }
}
