package com.mi.fitness.persist.server.data;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/mi/fitness/persist/server/data/DeleteProjectParams;", "", "phoneId", "", "keyList", "", "Lcom/mi/fitness/persist/server/data/ProjectDataKey;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getPhoneId", "()Ljava/lang/String;", "getKeyList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeleteProjectParams {

    @SerializedName("keys")
    @NotNull
    private final List<ProjectDataKey> keyList;

    @SerializedName("phone_id")
    @NotNull
    private final String phoneId;

    public DeleteProjectParams(@NotNull String phoneId, @NotNull List<ProjectDataKey> keyList) {
        Intrinsics.checkNotNullParameter(phoneId, "phoneId");
        Intrinsics.checkNotNullParameter(keyList, "keyList");
        this.phoneId = phoneId;
        this.keyList = keyList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeleteProjectParams copy$default(DeleteProjectParams deleteProjectParams, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deleteProjectParams.phoneId;
        }
        if ((i & 2) != 0) {
            list = deleteProjectParams.keyList;
        }
        return deleteProjectParams.copy(str, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPhoneId() {
        return this.phoneId;
    }

    @NotNull
    public final List<ProjectDataKey> component2() {
        return this.keyList;
    }

    @NotNull
    public final DeleteProjectParams copy(@NotNull String phoneId, @NotNull List<ProjectDataKey> keyList) {
        Intrinsics.checkNotNullParameter(phoneId, "phoneId");
        Intrinsics.checkNotNullParameter(keyList, "keyList");
        return new DeleteProjectParams(phoneId, keyList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeleteProjectParams)) {
            return false;
        }
        DeleteProjectParams deleteProjectParams = (DeleteProjectParams) other;
        return Intrinsics.areEqual(this.phoneId, deleteProjectParams.phoneId) && Intrinsics.areEqual(this.keyList, deleteProjectParams.keyList);
    }

    @NotNull
    public final List<ProjectDataKey> getKeyList() {
        return this.keyList;
    }

    @NotNull
    public final String getPhoneId() {
        return this.phoneId;
    }

    public int hashCode() {
        return (this.phoneId.hashCode() * 31) + this.keyList.hashCode();
    }

    @NotNull
    public String toString() {
        return "DeleteProjectParams(phoneId=" + this.phoneId + ", keyList=" + this.keyList + ")";
    }
}
