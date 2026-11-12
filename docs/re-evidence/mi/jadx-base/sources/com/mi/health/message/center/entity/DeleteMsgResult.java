package com.mi.health.message.center.entity;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/mi/health/message/center/entity/DeleteMsgResult;", "", "deleteResult", "", "<init>", "(Ljava/lang/Boolean;)V", "getDeleteResult", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lcom/mi/health/message/center/entity/DeleteMsgResult;", "equals", "other", "hashCode", "", "toString", "", "message-center_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeleteMsgResult {

    @SerializedName("delete_ret")
    @Nullable
    private final Boolean deleteResult;

    public DeleteMsgResult(@Nullable Boolean bool) {
        this.deleteResult = bool;
    }

    public static /* synthetic */ DeleteMsgResult copy$default(DeleteMsgResult deleteMsgResult, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = deleteMsgResult.deleteResult;
        }
        return deleteMsgResult.copy(bool);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getDeleteResult() {
        return this.deleteResult;
    }

    @NotNull
    public final DeleteMsgResult copy(@Nullable Boolean deleteResult) {
        return new DeleteMsgResult(deleteResult);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DeleteMsgResult) && Intrinsics.areEqual(this.deleteResult, ((DeleteMsgResult) other).deleteResult);
    }

    @Nullable
    public final Boolean getDeleteResult() {
        return this.deleteResult;
    }

    public int hashCode() {
        Boolean bool = this.deleteResult;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    @NotNull
    public String toString() {
        return "DeleteMsgResult(deleteResult=" + this.deleteResult + ")";
    }
}
