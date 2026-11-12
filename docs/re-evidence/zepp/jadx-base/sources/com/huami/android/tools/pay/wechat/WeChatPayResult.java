package com.huami.android.tools.pay.wechat;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0003J7\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019¨\u0006 "}, d2 = {"Lcom/huami/android/tools/pay/wechat/WeChatPayResult;", "", "", "component1", "", "component2", "component3", "component4", "errCode", "errStr", "transaction", "openId", "copy", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getErrCode", "()I", "b", "Ljava/lang/String;", "getErrStr", "()Ljava/lang/String;", "c", "getTransaction", GoogleApiAvailabilityLight.a, "getOpenId", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "paycompat_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WeChatPayResult {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int errCode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final String errStr;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final String transaction;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final String openId;

    public WeChatPayResult(int i, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.errCode = i;
        this.errStr = str;
        this.transaction = str2;
        this.openId = str3;
    }

    public static /* synthetic */ WeChatPayResult copy$default(WeChatPayResult weChatPayResult, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = weChatPayResult.errCode;
        }
        if ((i2 & 2) != 0) {
            str = weChatPayResult.errStr;
        }
        if ((i2 & 4) != 0) {
            str2 = weChatPayResult.transaction;
        }
        if ((i2 & 8) != 0) {
            str3 = weChatPayResult.openId;
        }
        return weChatPayResult.copy(i, str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getErrCode() {
        return this.errCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getErrStr() {
        return this.errStr;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTransaction() {
        return this.transaction;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOpenId() {
        return this.openId;
    }

    @NotNull
    public final WeChatPayResult copy(int errCode, @Nullable String errStr, @Nullable String transaction, @Nullable String openId) {
        return new WeChatPayResult(errCode, errStr, transaction, openId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeChatPayResult)) {
            return false;
        }
        WeChatPayResult weChatPayResult = (WeChatPayResult) other;
        return this.errCode == weChatPayResult.errCode && Intrinsics.areEqual(this.errStr, weChatPayResult.errStr) && Intrinsics.areEqual(this.transaction, weChatPayResult.transaction) && Intrinsics.areEqual(this.openId, weChatPayResult.openId);
    }

    public final int getErrCode() {
        return this.errCode;
    }

    @Nullable
    public final String getErrStr() {
        return this.errStr;
    }

    @Nullable
    public final String getOpenId() {
        return this.openId;
    }

    @Nullable
    public final String getTransaction() {
        return this.transaction;
    }

    public int hashCode() {
        int i = this.errCode * 31;
        String str = this.errStr;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.transaction;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.openId;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WeChatPayResult(errCode=" + this.errCode + ", errStr=" + ((Object) this.errStr) + ", transaction=" + ((Object) this.transaction) + ", openId=" + ((Object) this.openId) + ')';
    }
}
