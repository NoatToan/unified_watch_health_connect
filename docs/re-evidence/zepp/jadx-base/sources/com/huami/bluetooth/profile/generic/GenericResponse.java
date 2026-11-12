package com.huami.bluetooth.profile.generic;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.tekartik.sqflite.Constant;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÂ\u0003J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002J\t\u0010\t\u001a\u00020\bHÆ\u0003J'\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u0019\u0010\u000b\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/huami/bluetooth/profile/generic/GenericResponse;", "", "", "a", "b", Constant.h, "", "isSuccess", "", "component3", "status", "data", "copy", "", "toString", "hashCode", "other", "equals", LogUtil.I, "c", "[B", "getData", "()[B", "<init>", "(II[B)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class GenericResponse {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int cmd;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int status;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final byte[] data;

    public GenericResponse(int i, int i2, @NotNull byte[] bArr) {
        this.cmd = i;
        this.status = i2;
        this.data = bArr;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    private final int getCmd() {
        return this.cmd;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    private final int getStatus() {
        return this.status;
    }

    public static /* synthetic */ GenericResponse copy$default(GenericResponse genericResponse, int i, int i2, byte[] bArr, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = genericResponse.cmd;
        }
        if ((i3 & 2) != 0) {
            i2 = genericResponse.status;
        }
        if ((i3 & 4) != 0) {
            bArr = genericResponse.data;
        }
        return genericResponse.copy(i, i2, bArr);
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    @NotNull
    public final GenericResponse copy(int cmd, int status, @NotNull byte[] data) {
        return new GenericResponse(cmd, status, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenericResponse)) {
            return false;
        }
        GenericResponse genericResponse = (GenericResponse) other;
        return this.cmd == genericResponse.cmd && this.status == genericResponse.status && Intrinsics.areEqual(this.data, genericResponse.data);
    }

    @NotNull
    public final byte[] getData() {
        return this.data;
    }

    public int hashCode() {
        return (((this.cmd * 31) + this.status) * 31) + Arrays.hashCode(this.data);
    }

    public final boolean isSuccess(int cmd) {
        int i = this.status;
        return (i == 1 || i == 2) && this.cmd == cmd;
    }

    @NotNull
    public String toString() {
        return "GenericResponse(cmd=" + this.cmd + ", status=" + this.status + ", data=" + Arrays.toString(this.data) + ')';
    }
}
