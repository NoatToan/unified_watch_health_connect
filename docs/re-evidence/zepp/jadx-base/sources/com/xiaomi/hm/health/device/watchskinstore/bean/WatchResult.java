package com.xiaomi.hm.health.device.watchskinstore.bean;

import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B=\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b+\u0010,J\t\u0010\u0004\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJL\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\"\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0018\u001a\u0004\b\f\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\u000e\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u000e\u0010\u0019\"\u0004\b!\u0010\u001bR$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010\u0010\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010'\u001a\u0004\b(\u0010\u000b\"\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinstore/bean/WatchResult;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "component1", "", "component2", "component3", "", "component4", "component5", "()Ljava/lang/Object;", "isSuccessful", "code", "isMoreEnd", "mError", "data", "copy", "(ZIZLjava/lang/Throwable;Ljava/lang/Object;)Lcom/xiaomi/hm/health/device/watchskinstore/bean/WatchResult;", "", "toString", "hashCode", "other", "equals", "Z", "()Z", "setSuccessful", "(Z)V", LogUtil.I, "getCode", "()I", "setCode", "(I)V", "setMoreEnd", "Ljava/lang/Throwable;", "getMError", "()Ljava/lang/Throwable;", "setMError", "(Ljava/lang/Throwable;)V", "Ljava/lang/Object;", "getData", "setData", "(Ljava/lang/Object;)V", "<init>", "(ZIZLjava/lang/Throwable;Ljava/lang/Object;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WatchResult<T> {
    private int code;

    @Nullable
    private T data;
    private boolean isMoreEnd;
    private boolean isSuccessful;

    @Nullable
    private Throwable mError;

    public WatchResult() {
        this(false, 0, false, null, null, 31, null);
    }

    public WatchResult(boolean z, int i, boolean z2, @Nullable Throwable th, @Nullable T t) {
        this.isSuccessful = z;
        this.code = i;
        this.isMoreEnd = z2;
        this.mError = th;
        this.data = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WatchResult copy$default(WatchResult watchResult, boolean z, int i, boolean z2, Throwable th, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            z = watchResult.isSuccessful;
        }
        if ((i2 & 2) != 0) {
            i = watchResult.code;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            z2 = watchResult.isMoreEnd;
        }
        boolean z3 = z2;
        if ((i2 & 8) != 0) {
            th = watchResult.mError;
        }
        Throwable th2 = th;
        if ((i2 & 16) != 0) {
            obj = watchResult.data;
        }
        return watchResult.copy(z, i3, z3, th2, obj);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsSuccessful() {
        return this.isSuccessful;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsMoreEnd() {
        return this.isMoreEnd;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Throwable getMError() {
        return this.mError;
    }

    @Nullable
    public final T component5() {
        return this.data;
    }

    @NotNull
    public final WatchResult<T> copy(boolean isSuccessful, int code, boolean isMoreEnd, @Nullable Throwable mError, @Nullable T data) {
        return new WatchResult<>(isSuccessful, code, isMoreEnd, mError, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WatchResult)) {
            return false;
        }
        WatchResult watchResult = (WatchResult) other;
        return this.isSuccessful == watchResult.isSuccessful && this.code == watchResult.code && this.isMoreEnd == watchResult.isMoreEnd && Intrinsics.areEqual(this.mError, watchResult.mError) && Intrinsics.areEqual(this.data, watchResult.data);
    }

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final T getData() {
        return this.data;
    }

    @Nullable
    public final Throwable getMError() {
        return this.mError;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        boolean z = this.isSuccessful;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = ((r0 * 31) + this.code) * 31;
        boolean z2 = this.isMoreEnd;
        int i2 = (i + (z2 ? 1 : z2)) * 31;
        Throwable th = this.mError;
        int iHashCode = (i2 + (th == null ? 0 : th.hashCode())) * 31;
        T t = this.data;
        return iHashCode + (t != null ? t.hashCode() : 0);
    }

    public final boolean isMoreEnd() {
        return this.isMoreEnd;
    }

    public final boolean isSuccessful() {
        return this.isSuccessful;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setData(@Nullable T t) {
        this.data = t;
    }

    public final void setMError(@Nullable Throwable th) {
        this.mError = th;
    }

    public final void setMoreEnd(boolean z) {
        this.isMoreEnd = z;
    }

    public final void setSuccessful(boolean z) {
        this.isSuccessful = z;
    }

    @NotNull
    public String toString() {
        return "WatchResult(isSuccessful=" + this.isSuccessful + ", code=" + this.code + ", isMoreEnd=" + this.isMoreEnd + ", mError=" + this.mError + ", data=" + this.data + ")";
    }

    public /* synthetic */ WatchResult(boolean z, int i, boolean z2, Throwable th, Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i, (i2 & 4) == 0 ? z2 : false, (i2 & 8) != 0 ? null : th, (i2 & 16) != 0 ? null : obj);
    }
}
