package com.xiaomi.hm.health.bt.model;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0003\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÖ\u0003R$\u0010\b\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004\"\u0004\b\u0015\u0010\u0016R$\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/bt/model/HMCardTSResponse;", ExifInterface.GPS_DIRECTION_TRUE, "", "component1", "()Ljava/lang/Object;", "", "component2", "()Ljava/lang/Integer;", "data", "code", "copy", "(Ljava/lang/Object;Ljava/lang/Integer;)Lcom/xiaomi/hm/health/bt/model/HMCardTSResponse;", "", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/Object;", "getData", "setData", "(Ljava/lang/Object;)V", "b", "Ljava/lang/Integer;", "getCode", "setCode", "(Ljava/lang/Integer;)V", "<init>", "(Ljava/lang/Object;Ljava/lang/Integer;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HMCardTSResponse<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private T data;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer code;

    /* JADX WARN: Multi-variable type inference failed */
    public HMCardTSResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public HMCardTSResponse(@Nullable T t, @Nullable Integer num) {
        this.data = t;
        this.code = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HMCardTSResponse copy$default(HMCardTSResponse hMCardTSResponse, Object obj, Integer num, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = hMCardTSResponse.data;
        }
        if ((i & 2) != 0) {
            num = hMCardTSResponse.code;
        }
        return hMCardTSResponse.copy(obj, num);
    }

    @Nullable
    public final T component1() {
        return this.data;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getCode() {
        return this.code;
    }

    @NotNull
    public final HMCardTSResponse<T> copy(@Nullable T data, @Nullable Integer code) {
        return new HMCardTSResponse<>(data, code);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMCardTSResponse)) {
            return false;
        }
        HMCardTSResponse hMCardTSResponse = (HMCardTSResponse) other;
        return Intrinsics.areEqual(this.data, hMCardTSResponse.data) && Intrinsics.areEqual(this.code, hMCardTSResponse.code);
    }

    @Nullable
    public final Integer getCode() {
        return this.code;
    }

    @Nullable
    public final T getData() {
        return this.data;
    }

    public int hashCode() {
        T t = this.data;
        int iHashCode = (t == null ? 0 : t.hashCode()) * 31;
        Integer num = this.code;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final void setCode(@Nullable Integer num) {
        this.code = num;
    }

    public final void setData(@Nullable T t) {
        this.data = t;
    }

    @NotNull
    public String toString() {
        return "HMCardTSResponse(data=" + this.data + ", code=" + this.code + ')';
    }

    public /* synthetic */ HMCardTSResponse(Object obj, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : num);
    }
}
