package com.xiaomi.fitness.mijia.sdk.data;

import com.xiaomi.smarthome.frame.ErrorCode;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0010\u001a\u00020\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/mijia/sdk/data/BaseBean;", "", "<init>", "()V", "code", "", "getCode", "()I", "setCode", "(I)V", "message", "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "isSuccess", "", "mijia-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class BaseBean {
    private int code = -1;

    @Nullable
    private String message = "";

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    public final boolean isSuccess() {
        return this.code == ErrorCode.SUCCESS.getCode();
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setMessage(@Nullable String str) {
        this.message = str;
    }
}
