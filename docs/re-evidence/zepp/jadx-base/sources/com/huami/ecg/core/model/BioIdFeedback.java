package com.huami.ecg.core.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0018\u0010\u0019B\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u000fB\u0019\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u001aB\u0019\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0014\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/huami/ecg/core/model/BioIdFeedback;", "", "", "myself", "", "setOwner", "isMySelf", "", "toString", "", "a", "J", "getBioIdTimestamp", "()J", "setBioIdTimestamp", "(J)V", "bioIdTimestamp", "", "b", LogUtil.I, "isMyself", "()I", "setMyself", "(I)V", "<init>", "()V", "(JI)V", "(JZ)V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class BioIdFeedback {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("generatedTime")
    private long bioIdTimestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("isOneself")
    private int isMyself;

    public BioIdFeedback() {
        this.isMyself = 1;
        this.bioIdTimestamp = 0L;
    }

    public final long getBioIdTimestamp() {
        return this.bioIdTimestamp;
    }

    public final boolean isMySelf() {
        return this.isMyself == 1;
    }

    /* JADX INFO: renamed from: isMyself, reason: from getter */
    public final int getIsMyself() {
        return this.isMyself;
    }

    public final void setBioIdTimestamp(long j) {
        this.bioIdTimestamp = j;
    }

    public final void setMyself(int i) {
        this.isMyself = i;
    }

    public final void setOwner(boolean myself) {
        this.isMyself = myself ? 1 : 0;
    }

    @NotNull
    public String toString() {
        return "<BioIdTimestamp: " + this.bioIdTimestamp + ", IsMyself: " + this.isMyself + SearchCriteria.GT;
    }

    public BioIdFeedback(long j) {
        this.isMyself = 1;
        this.bioIdTimestamp = j;
    }

    public BioIdFeedback(long j, int i) {
        this.isMyself = 1;
        this.bioIdTimestamp = j;
        this.isMyself = i;
    }

    public BioIdFeedback(long j, boolean z) {
        this.isMyself = 1;
        this.bioIdTimestamp = j;
        this.isMyself = z ? 1 : 0;
    }
}
