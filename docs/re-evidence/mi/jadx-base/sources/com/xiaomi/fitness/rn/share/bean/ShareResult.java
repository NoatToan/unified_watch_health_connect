package com.xiaomi.fitness.rn.share.bean;

import com.xiaomi.fitness.mijia.sdk.data.BaseBean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/rn/share/bean/ShareResult;", "Lcom/xiaomi/fitness/mijia/sdk/data/BaseBean;", "result", "", "<init>", "(Ljava/lang/String;)V", "getResult", "()Ljava/lang/String;", "setResult", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ShareResult extends BaseBean {

    @Nullable
    private String result;

    /* JADX WARN: Multi-variable type inference failed */
    public ShareResult() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ShareResult copy$default(ShareResult shareResult, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shareResult.result;
        }
        return shareResult.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getResult() {
        return this.result;
    }

    @NotNull
    public final ShareResult copy(@Nullable String result) {
        return new ShareResult(result);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ShareResult) && Intrinsics.areEqual(this.result, ((ShareResult) other).result);
    }

    @Nullable
    public final String getResult() {
        return this.result;
    }

    public int hashCode() {
        String str = this.result;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setResult(@Nullable String str) {
        this.result = str;
    }

    @NotNull
    public String toString() {
        return "ShareResult(result=" + this.result + ")";
    }

    public /* synthetic */ ShareResult(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public ShareResult(@Nullable String str) {
        this.result = str;
    }
}
