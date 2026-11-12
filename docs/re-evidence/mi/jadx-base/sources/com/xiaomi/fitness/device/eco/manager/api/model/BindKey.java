package com.xiaomi.fitness.device.eco.manager.api.model;

import com.google.gson.annotations.SerializedName;
import com.mibi.sdk.component.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/device/eco/manager/api/model/BindKey;", "", Constants.KEY_PAY_RESULT_RET, "", "bindKey", "", "<init>", "(ILjava/lang/String;)V", "getRet", "()I", "setRet", "(I)V", "getBindKey", "()Ljava/lang/String;", "setBindKey", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BindKey {

    @SerializedName("bindkey")
    @Nullable
    private String bindKey;
    private int ret;

    /* JADX WARN: Multi-variable type inference failed */
    public BindKey() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BindKey copy$default(BindKey bindKey, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bindKey.ret;
        }
        if ((i2 & 2) != 0) {
            str = bindKey.bindKey;
        }
        return bindKey.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRet() {
        return this.ret;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBindKey() {
        return this.bindKey;
    }

    @NotNull
    public final BindKey copy(int ret, @Nullable String bindKey) {
        return new BindKey(ret, bindKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BindKey)) {
            return false;
        }
        BindKey bindKey = (BindKey) other;
        return this.ret == bindKey.ret && Intrinsics.areEqual(this.bindKey, bindKey.bindKey);
    }

    @Nullable
    public final String getBindKey() {
        return this.bindKey;
    }

    public final int getRet() {
        return this.ret;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.ret) * 31;
        String str = this.bindKey;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setBindKey(@Nullable String str) {
        this.bindKey = str;
    }

    public final void setRet(int i) {
        this.ret = i;
    }

    @NotNull
    public String toString() {
        return "BindKey(ret=" + this.ret + ", bindKey=" + this.bindKey + ")";
    }

    public BindKey(int i, @Nullable String str) {
        this.ret = i;
        this.bindKey = str;
    }

    public /* synthetic */ BindKey(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str);
    }
}
