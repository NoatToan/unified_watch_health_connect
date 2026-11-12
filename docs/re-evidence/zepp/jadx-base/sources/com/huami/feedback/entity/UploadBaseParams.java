package com.huami.feedback.entity;

import com.huami.feedback.zepp.ui.FeedbackActivity;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J)\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/huami/feedback/entity/UploadBaseParams;", "", "", "component1", "", "component2", "component3", "loginID", "userName", FeedbackActivity.KEY_FEEDBACK_SOURCE, "copy", "toString", "", "hashCode", "other", "", "equals", "a", "J", "getLoginID", "()J", "b", "Ljava/lang/String;", "getUserName", "()Ljava/lang/String;", "c", "getFromSource", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class UploadBaseParams {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long loginID;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final String userName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String fromSource;

    public UploadBaseParams(long j, @Nullable String str, @NotNull String str2) {
        this.loginID = j;
        this.userName = str;
        this.fromSource = str2;
    }

    public static /* synthetic */ UploadBaseParams copy$default(UploadBaseParams uploadBaseParams, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = uploadBaseParams.loginID;
        }
        if ((i & 2) != 0) {
            str = uploadBaseParams.userName;
        }
        if ((i & 4) != 0) {
            str2 = uploadBaseParams.fromSource;
        }
        return uploadBaseParams.copy(j, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getLoginID() {
        return this.loginID;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFromSource() {
        return this.fromSource;
    }

    @NotNull
    public final UploadBaseParams copy(long loginID, @Nullable String userName, @NotNull String fromSource) {
        return new UploadBaseParams(loginID, userName, fromSource);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadBaseParams)) {
            return false;
        }
        UploadBaseParams uploadBaseParams = (UploadBaseParams) other;
        return this.loginID == uploadBaseParams.loginID && Intrinsics.areEqual(this.userName, uploadBaseParams.userName) && Intrinsics.areEqual(this.fromSource, uploadBaseParams.fromSource);
    }

    @NotNull
    public final String getFromSource() {
        return this.fromSource;
    }

    public final long getLoginID() {
        return this.loginID;
    }

    @Nullable
    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        int iA = b.a(this.loginID) * 31;
        String str = this.userName;
        return ((iA + (str == null ? 0 : str.hashCode())) * 31) + this.fromSource.hashCode();
    }

    @NotNull
    public String toString() {
        return "UploadBaseParams(loginID=" + this.loginID + ", userName=" + ((Object) this.userName) + ", fromSource=" + this.fromSource + ')';
    }
}
