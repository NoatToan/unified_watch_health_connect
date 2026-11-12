package com.xiaomi.fitness.nfc.bean.yoyo;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\n\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R \u0010\u0003\u001a\u00028\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/nfc/bean/yoyo/EasyCardResponse;", "T", "Lcom/xiaomi/fitness/nfc/bean/yoyo/BaseEasyCardResponse;", "respData", "<init>", "(Ljava/lang/Object;)V", "getRespData", "()Ljava/lang/Object;", "setRespData", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/xiaomi/fitness/nfc/bean/yoyo/EasyCardResponse;", "equals", "", "other", "", "hashCode", "", "toString", "", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EasyCardResponse<T> extends BaseEasyCardResponse {

    @SerializedName("respData")
    private T respData;

    public EasyCardResponse(T t) {
        this.respData = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EasyCardResponse copy$default(EasyCardResponse easyCardResponse, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = easyCardResponse.respData;
        }
        return easyCardResponse.copy(obj);
    }

    public final T component1() {
        return this.respData;
    }

    @NotNull
    public final EasyCardResponse<T> copy(T respData) {
        return new EasyCardResponse<>(respData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof EasyCardResponse) && Intrinsics.areEqual(this.respData, ((EasyCardResponse) other).respData);
    }

    public final T getRespData() {
        return this.respData;
    }

    public int hashCode() {
        T t = this.respData;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public final void setRespData(T t) {
        this.respData = t;
    }

    @NotNull
    public String toString() {
        return "EasyCardResponse(respData=" + this.respData + ")";
    }
}
