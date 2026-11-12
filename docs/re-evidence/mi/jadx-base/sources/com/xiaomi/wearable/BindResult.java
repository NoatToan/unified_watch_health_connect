package com.xiaomi.wearable;

import com.mibi.sdk.component.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0010\u001a\u00020\u0005J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/wearable/BindResult;", "", Constants.KEY_PAY_RESULT_RET, "", "success", "", "<init>", "(IZ)V", "getRet", "()I", "setRet", "(I)V", "getSuccess", "()Z", "setSuccess", "(Z)V", "isSuccess", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "Companion", "device_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BindResult {
    public static final int FAILED = 0;
    public static final int INVALID_MODEL = -2;
    public static final int NO_PERMISSION = -1;
    public static final int SUCCESS = 1;
    private int ret;
    private boolean success;

    /* JADX WARN: Multi-variable type inference failed */
    public BindResult() {
        this(0, 0 == true ? 1 : 0, 3, null);
    }

    public static /* synthetic */ BindResult copy$default(BindResult bindResult, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bindResult.ret;
        }
        if ((i2 & 2) != 0) {
            z = bindResult.success;
        }
        return bindResult.copy(i, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRet() {
        return this.ret;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @NotNull
    public final BindResult copy(int ret, boolean success) {
        return new BindResult(ret, success);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BindResult)) {
            return false;
        }
        BindResult bindResult = (BindResult) other;
        return this.ret == bindResult.ret && this.success == bindResult.success;
    }

    public final int getRet() {
        return this.ret;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return (Integer.hashCode(this.ret) * 31) + Boolean.hashCode(this.success);
    }

    public final boolean isSuccess() {
        return this.ret == 1;
    }

    public final void setRet(int i) {
        this.ret = i;
    }

    public final void setSuccess(boolean z) {
        this.success = z;
    }

    @NotNull
    public String toString() {
        return "BindResult(ret=" + this.ret + ", success=" + this.success + ")";
    }

    public BindResult(int i, boolean z) {
        this.ret = i;
        this.success = z;
    }

    public /* synthetic */ BindResult(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z);
    }
}
