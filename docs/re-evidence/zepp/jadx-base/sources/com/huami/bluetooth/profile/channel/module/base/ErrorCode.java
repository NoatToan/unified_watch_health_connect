package com.huami.bluetooth.profile.channel.module.base;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0010\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/base/ErrorCode;", "", "", "toString", "", "isSuccess", "", "a", LogUtil.I, "getCode", "()I", "code", "b", "Ljava/lang/String;", "getDesc", "()Ljava/lang/String;", "desc", "<init>", "(ILjava/lang/String;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class ErrorCode {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String desc;

    public ErrorCode(int i, @NotNull String str) {
        this.code = i;
        this.desc = str;
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    public boolean isSuccess() {
        return false;
    }

    @NotNull
    public String toString() {
        return "ErrorCode{code=" + this.code + ", desc=" + this.desc + '}';
    }
}
