package com.xiaomi.fitness.electronic.scale.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/data/DeleteByDidAndCreateTimeBean;", "", "did", "", "createTime", "", "<init>", "(Ljava/lang/String;J)V", "getDid", "()Ljava/lang/String;", "setDid", "(Ljava/lang/String;)V", "getCreateTime", "()J", "setCreateTime", "(J)V", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeleteByDidAndCreateTimeBean {
    private long createTime;

    @NotNull
    private String did;

    public DeleteByDidAndCreateTimeBean(@NotNull String did, long j) {
        Intrinsics.checkNotNullParameter(did, "did");
        this.did = did;
        this.createTime = j;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    @NotNull
    public final String getDid() {
        return this.did;
    }

    public final void setCreateTime(long j) {
        this.createTime = j;
    }

    public final void setDid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.did = str;
    }
}
