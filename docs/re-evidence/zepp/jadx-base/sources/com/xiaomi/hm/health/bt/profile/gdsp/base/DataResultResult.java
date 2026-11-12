package com.xiaomi.hm.health.bt.profile.gdsp.base;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/base/DataResultResult;", "", "", "toString", "", "a", LogUtil.I, "getErrorCode", "()I", "errorCode", "", "b", "[B", "getData", "()[B", "data", "<init>", "(I[B)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class DataResultResult {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int errorCode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final byte[] data;

    public DataResultResult(int i, @Nullable byte[] bArr) {
        this.errorCode = i;
        this.data = bArr;
    }

    @Nullable
    public final byte[] getData() {
        return this.data;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DataResultResult(errorCode=");
        sb.append(this.errorCode);
        sb.append(", data=");
        byte[] bArr = this.data;
        sb.append(bArr == null ? null : Integer.valueOf(bArr.length));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ DataResultResult(int i, byte[] bArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : bArr);
    }
}
