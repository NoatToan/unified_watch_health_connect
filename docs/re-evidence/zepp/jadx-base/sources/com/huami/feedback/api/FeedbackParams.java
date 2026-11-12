package com.huami.feedback.api;

import android.net.Uri;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.feedback.zepp.ui.FeedbackActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b%\u0010&J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003JI\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\u000f\u001a\u00020\tHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001b\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R!\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u000f\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u000f\u0010$¨\u0006'"}, d2 = {"Lcom/huami/feedback/api/FeedbackParams;", "", "", "component1", "component2", "component3", "", "Landroid/net/Uri;", "component4", "", "component5", "feedbackInfo", FeedbackActivity.KEY_FEEDBACK_SOURCE, "issueId", "images", "isForceDark", "copy", "toString", "", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getFeedbackInfo", "()Ljava/lang/String;", "b", "getFromSource", "c", "getIssueId", GoogleApiAvailabilityLight.a, "Ljava/util/List;", "getImages", "()Ljava/util/List;", "e", "Z", "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "feedback-api_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class FeedbackParams {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final String feedbackInfo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final String fromSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final String issueId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final List<Uri> images;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final boolean isForceDark;

    public FeedbackParams() {
        this(null, null, null, null, false, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FeedbackParams(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<? extends Uri> list, boolean z) {
        this.feedbackInfo = str;
        this.fromSource = str2;
        this.issueId = str3;
        this.images = list;
        this.isForceDark = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeedbackParams copy$default(FeedbackParams feedbackParams, String str, String str2, String str3, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedbackParams.feedbackInfo;
        }
        if ((i & 2) != 0) {
            str2 = feedbackParams.fromSource;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = feedbackParams.issueId;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            list = feedbackParams.images;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            z = feedbackParams.isForceDark;
        }
        return feedbackParams.copy(str, str4, str5, list2, z);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFeedbackInfo() {
        return this.feedbackInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFromSource() {
        return this.fromSource;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIssueId() {
        return this.issueId;
    }

    @Nullable
    public final List<Uri> component4() {
        return this.images;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsForceDark() {
        return this.isForceDark;
    }

    @NotNull
    public final FeedbackParams copy(@Nullable String feedbackInfo, @Nullable String fromSource, @Nullable String issueId, @Nullable List<? extends Uri> images, boolean isForceDark) {
        return new FeedbackParams(feedbackInfo, fromSource, issueId, images, isForceDark);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedbackParams)) {
            return false;
        }
        FeedbackParams feedbackParams = (FeedbackParams) other;
        return Intrinsics.areEqual(this.feedbackInfo, feedbackParams.feedbackInfo) && Intrinsics.areEqual(this.fromSource, feedbackParams.fromSource) && Intrinsics.areEqual(this.issueId, feedbackParams.issueId) && Intrinsics.areEqual(this.images, feedbackParams.images) && this.isForceDark == feedbackParams.isForceDark;
    }

    @Nullable
    public final String getFeedbackInfo() {
        return this.feedbackInfo;
    }

    @Nullable
    public final String getFromSource() {
        return this.fromSource;
    }

    @Nullable
    public final List<Uri> getImages() {
        return this.images;
    }

    @Nullable
    public final String getIssueId() {
        return this.issueId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public int hashCode() {
        String str = this.feedbackInfo;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fromSource;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.issueId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<Uri> list = this.images;
        int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        boolean z = this.isForceDark;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode4 + r1;
    }

    public final boolean isForceDark() {
        return this.isForceDark;
    }

    @NotNull
    public String toString() {
        return "FeedbackParams(feedbackInfo=" + ((Object) this.feedbackInfo) + ", fromSource=" + ((Object) this.fromSource) + ", issueId=" + ((Object) this.issueId) + ", images=" + this.images + ", isForceDark=" + this.isForceDark + ')';
    }

    public /* synthetic */ FeedbackParams(String str, String str2, String str3, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) == 0 ? list : null, (i & 16) != 0 ? false : z);
    }
}
