package com.xiaomi.fitness.rn.share.bean;

import com.mibi.sdk.component.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0010\u001a\u00020\u0011J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/rn/share/bean/DeleteShareBean;", "", "did", "", Constants.KEY_PAY_RESULT_RET, "", "<init>", "(Ljava/lang/String;I)V", "getDid", "()Ljava/lang/String;", "setDid", "(Ljava/lang/String;)V", "getRet", "()I", "setRet", "(I)V", "isDeleteSuccess", "", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeleteShareBean {

    @NotNull
    private String did;
    private int ret;

    public DeleteShareBean(@NotNull String did, int i) {
        Intrinsics.checkNotNullParameter(did, "did");
        this.did = did;
        this.ret = i;
    }

    public static /* synthetic */ DeleteShareBean copy$default(DeleteShareBean deleteShareBean, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = deleteShareBean.did;
        }
        if ((i2 & 2) != 0) {
            i = deleteShareBean.ret;
        }
        return deleteShareBean.copy(str, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDid() {
        return this.did;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRet() {
        return this.ret;
    }

    @NotNull
    public final DeleteShareBean copy(@NotNull String did, int ret) {
        Intrinsics.checkNotNullParameter(did, "did");
        return new DeleteShareBean(did, ret);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeleteShareBean)) {
            return false;
        }
        DeleteShareBean deleteShareBean = (DeleteShareBean) other;
        return Intrinsics.areEqual(this.did, deleteShareBean.did) && this.ret == deleteShareBean.ret;
    }

    @NotNull
    public final String getDid() {
        return this.did;
    }

    public final int getRet() {
        return this.ret;
    }

    public int hashCode() {
        return (this.did.hashCode() * 31) + Integer.hashCode(this.ret);
    }

    public final boolean isDeleteSuccess() {
        return this.ret == 1;
    }

    public final void setDid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.did = str;
    }

    public final void setRet(int i) {
        this.ret = i;
    }

    @NotNull
    public String toString() {
        return "DeleteShareBean(did=" + this.did + ", ret=" + this.ret + ")";
    }
}
