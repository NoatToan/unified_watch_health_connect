package com.huami.android.tools.pay.wechat;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B'\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b \u0010!J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J)\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\bHÆ\u0001J\t\u0010\u000e\u001a\u00020\u0006HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010\f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/huami/android/tools/pay/wechat/WeChatResponse;", "", "", "isSuccessful", "", "component1", "", "component2", "Lcom/huami/android/tools/pay/wechat/WeChatPayResult;", "component3", "code", "message", "data", "copy", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getCode", "()I", "b", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "c", "Lcom/huami/android/tools/pay/wechat/WeChatPayResult;", "getData", "()Lcom/huami/android/tools/pay/wechat/WeChatPayResult;", "setData", "(Lcom/huami/android/tools/pay/wechat/WeChatPayResult;)V", "<init>", "(ILjava/lang/String;Lcom/huami/android/tools/pay/wechat/WeChatPayResult;)V", "Companion", "paycompat_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WeChatResponse {
    public static final int CODE_CANCEL = -2;
    public static final int CODE_ERROR = -1;
    public static final int CODE_NOT_INSTALL = 1048577;
    public static final int CODE_REGISTER_APP_FAIL = 1048579;
    public static final int CODE_REQUEST_FAIL = 1048578;
    public static final int CODE_SEND_REQUEST_FAIL = 1048580;
    public static final int CODE_SUCCESS = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String message;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private WeChatPayResult data;

    public WeChatResponse() {
        this(0, null, null, 7, null);
    }

    public WeChatResponse(int i, @NotNull String str, @Nullable WeChatPayResult weChatPayResult) {
        this.code = i;
        this.message = str;
        this.data = weChatPayResult;
    }

    public static /* synthetic */ WeChatResponse copy$default(WeChatResponse weChatResponse, int i, String str, WeChatPayResult weChatPayResult, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = weChatResponse.code;
        }
        if ((i2 & 2) != 0) {
            str = weChatResponse.message;
        }
        if ((i2 & 4) != 0) {
            weChatPayResult = weChatResponse.data;
        }
        return weChatResponse.copy(i, str, weChatPayResult);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final WeChatPayResult getData() {
        return this.data;
    }

    @NotNull
    public final WeChatResponse copy(int code, @NotNull String message, @Nullable WeChatPayResult data) {
        return new WeChatResponse(code, message, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeChatResponse)) {
            return false;
        }
        WeChatResponse weChatResponse = (WeChatResponse) other;
        return this.code == weChatResponse.code && Intrinsics.areEqual(this.message, weChatResponse.message) && Intrinsics.areEqual(this.data, weChatResponse.data);
    }

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final WeChatPayResult getData() {
        return this.data;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int iHashCode = ((this.code * 31) + this.message.hashCode()) * 31;
        WeChatPayResult weChatPayResult = this.data;
        return iHashCode + (weChatPayResult == null ? 0 : weChatPayResult.hashCode());
    }

    public final boolean isSuccessful() {
        return this.code == 0;
    }

    public final void setData(@Nullable WeChatPayResult weChatPayResult) {
        this.data = weChatPayResult;
    }

    @NotNull
    public String toString() {
        return "WeChatResponse(code=" + this.code + ", message=" + this.message + ", data=" + this.data + ')';
    }

    public /* synthetic */ WeChatResponse(int i, String str, WeChatPayResult weChatPayResult, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : weChatPayResult);
    }
}
