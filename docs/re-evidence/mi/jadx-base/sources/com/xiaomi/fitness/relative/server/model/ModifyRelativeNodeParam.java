package com.xiaomi.fitness.relative.server.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/relative/server/model/ModifyRelativeNodeParam;", "", "relativeId", "", "relativeNode", "", "<init>", "(JLjava/lang/String;)V", "getRelativeId", "()J", "getRelativeNode", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ModifyRelativeNodeParam {

    @SerializedName("relative_uid")
    private final long relativeId;

    @SerializedName("relative_note")
    @NotNull
    private final String relativeNode;

    public ModifyRelativeNodeParam(long j, @NotNull String relativeNode) {
        Intrinsics.checkNotNullParameter(relativeNode, "relativeNode");
        this.relativeId = j;
        this.relativeNode = relativeNode;
    }

    public static /* synthetic */ ModifyRelativeNodeParam copy$default(ModifyRelativeNodeParam modifyRelativeNodeParam, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = modifyRelativeNodeParam.relativeId;
        }
        if ((i & 2) != 0) {
            str = modifyRelativeNodeParam.relativeNode;
        }
        return modifyRelativeNodeParam.copy(j, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getRelativeId() {
        return this.relativeId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRelativeNode() {
        return this.relativeNode;
    }

    @NotNull
    public final ModifyRelativeNodeParam copy(long relativeId, @NotNull String relativeNode) {
        Intrinsics.checkNotNullParameter(relativeNode, "relativeNode");
        return new ModifyRelativeNodeParam(relativeId, relativeNode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModifyRelativeNodeParam)) {
            return false;
        }
        ModifyRelativeNodeParam modifyRelativeNodeParam = (ModifyRelativeNodeParam) other;
        return this.relativeId == modifyRelativeNodeParam.relativeId && Intrinsics.areEqual(this.relativeNode, modifyRelativeNodeParam.relativeNode);
    }

    public final long getRelativeId() {
        return this.relativeId;
    }

    @NotNull
    public final String getRelativeNode() {
        return this.relativeNode;
    }

    public int hashCode() {
        return (Long.hashCode(this.relativeId) * 31) + this.relativeNode.hashCode();
    }

    @NotNull
    public String toString() {
        return "ModifyRelativeNodeParam(relativeId=" + this.relativeId + ", relativeNode=" + this.relativeNode + ")";
    }
}
