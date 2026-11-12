package com.huami.http.ednetwork;

import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B%\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0004\u001a\u00020\u0003R\u0019\u0010\n\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u0004\u0018\u00018\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/huami/http/ednetwork/HttpDeResponse;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "isSuccessful", "", "a", LogUtil.I, "getCode", "()I", "code", "", "b", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "c", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "data", "<init>", "(ILjava/lang/String;Ljava/lang/Object;)V", "httpkit_release"}, k = 1, mv = {1, 5, 1})
public final class HttpDeResponse<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final String message;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final T data;

    public HttpDeResponse(int i, @Nullable String str, @Nullable T t) {
        this.code = i;
        this.message = str;
        this.data = t;
    }

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final T getData() {
        return this.data;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    public final boolean isSuccessful() {
        return this.code == 0;
    }

    public /* synthetic */ HttpDeResponse(int i, String str, Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? "" : str, obj);
    }
}
