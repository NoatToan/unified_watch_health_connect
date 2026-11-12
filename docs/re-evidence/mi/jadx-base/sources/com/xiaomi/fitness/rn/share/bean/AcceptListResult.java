package com.xiaomi.fitness.rn.share.bean;

import com.xiaomi.fitness.mijia.sdk.data.BaseBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\u000b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/rn/share/bean/AcceptListResult;", "Lcom/xiaomi/fitness/mijia/sdk/data/BaseBean;", "result", "", "Lcom/xiaomi/fitness/rn/share/bean/AcceptItemBean;", "<init>", "(Ljava/util/List;)V", "getResult", "()Ljava/util/List;", "setResult", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AcceptListResult extends BaseBean {

    @Nullable
    private List<AcceptItemBean> result;

    /* JADX WARN: Multi-variable type inference failed */
    public AcceptListResult() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AcceptListResult copy$default(AcceptListResult acceptListResult, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = acceptListResult.result;
        }
        return acceptListResult.copy(list);
    }

    @Nullable
    public final List<AcceptItemBean> component1() {
        return this.result;
    }

    @NotNull
    public final AcceptListResult copy(@Nullable List<AcceptItemBean> result) {
        return new AcceptListResult(result);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AcceptListResult) && Intrinsics.areEqual(this.result, ((AcceptListResult) other).result);
    }

    @Nullable
    public final List<AcceptItemBean> getResult() {
        return this.result;
    }

    public int hashCode() {
        List<AcceptItemBean> list = this.result;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setResult(@Nullable List<AcceptItemBean> list) {
        this.result = list;
    }

    @NotNull
    public String toString() {
        return "AcceptListResult(result=" + this.result + ")";
    }

    public /* synthetic */ AcceptListResult(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }

    public AcceptListResult(@Nullable List<AcceptItemBean> list) {
        this.result = list;
    }
}
