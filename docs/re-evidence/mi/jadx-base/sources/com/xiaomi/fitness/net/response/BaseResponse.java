package com.xiaomi.fitness.net.response;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.util.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0010\u001a\u00020\u0011R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/net/response/BaseResponse;", "", "<init>", "()V", "code", "", "getCode", "()I", "setCode", "(I)V", "msg", "", "getMsg", "()Ljava/lang/String;", "setMsg", "(Ljava/lang/String;)V", "isSuccess", "", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class BaseResponse {

    @SerializedName(alternate = {"alternate", "status"}, value = "code")
    private int code = -1;

    @SerializedName(alternate = {Constants.EXTRA_ERROR_MESSAGE, "message"}, value = "msg")
    @Nullable
    private String msg = "";

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final String getMsg() {
        return this.msg;
    }

    public final boolean isSuccess() {
        int i = this.code;
        return i == 0 || i == 200;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setMsg(@Nullable String str) {
        this.msg = str;
    }
}
