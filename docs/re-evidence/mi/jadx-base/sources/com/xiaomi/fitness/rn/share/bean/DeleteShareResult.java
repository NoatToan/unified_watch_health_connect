package com.xiaomi.fitness.rn.share.bean;

import com.xiaomi.fitness.mijia.sdk.data.BaseBean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/rn/share/bean/DeleteShareResult;", "Lcom/xiaomi/fitness/mijia/sdk/data/BaseBean;", "result", "Lcom/xiaomi/fitness/rn/share/bean/DeleteShareGetBean;", "<init>", "(Lcom/xiaomi/fitness/rn/share/bean/DeleteShareGetBean;)V", "getResult", "()Lcom/xiaomi/fitness/rn/share/bean/DeleteShareGetBean;", "setResult", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeleteShareResult extends BaseBean {

    @Nullable
    private DeleteShareGetBean result;

    /* JADX WARN: Multi-variable type inference failed */
    public DeleteShareResult() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DeleteShareResult copy$default(DeleteShareResult deleteShareResult, DeleteShareGetBean deleteShareGetBean, int i, Object obj) {
        if ((i & 1) != 0) {
            deleteShareGetBean = deleteShareResult.result;
        }
        return deleteShareResult.copy(deleteShareGetBean);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DeleteShareGetBean getResult() {
        return this.result;
    }

    @NotNull
    public final DeleteShareResult copy(@Nullable DeleteShareGetBean result) {
        return new DeleteShareResult(result);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DeleteShareResult) && Intrinsics.areEqual(this.result, ((DeleteShareResult) other).result);
    }

    @Nullable
    public final DeleteShareGetBean getResult() {
        return this.result;
    }

    public int hashCode() {
        DeleteShareGetBean deleteShareGetBean = this.result;
        if (deleteShareGetBean == null) {
            return 0;
        }
        return deleteShareGetBean.hashCode();
    }

    public final void setResult(@Nullable DeleteShareGetBean deleteShareGetBean) {
        this.result = deleteShareGetBean;
    }

    @NotNull
    public String toString() {
        return "DeleteShareResult(result=" + this.result + ")";
    }

    public /* synthetic */ DeleteShareResult(DeleteShareGetBean deleteShareGetBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : deleteShareGetBean);
    }

    public DeleteShareResult(@Nullable DeleteShareGetBean deleteShareGetBean) {
        this.result = deleteShareGetBean;
    }
}
