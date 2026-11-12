package com.huami.nfc.car.entity;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0006\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/huami/nfc/car/entity/SupportCar;", "", "", "component1", "", "component2", "factoryCode", "status", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getFactoryCode", "()Ljava/lang/String;", "b", LogUtil.I, "getStatus", "()I", "<init>", "(Ljava/lang/String;I)V", "nfc-car_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SupportCar {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("factory_code")
    @NotNull
    private final String factoryCode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("status")
    private final int status;

    /* JADX WARN: Multi-variable type inference failed */
    public SupportCar() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public SupportCar(@NotNull String str, int i) {
        this.factoryCode = str;
        this.status = i;
    }

    public static /* synthetic */ SupportCar copy$default(SupportCar supportCar, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = supportCar.factoryCode;
        }
        if ((i2 & 2) != 0) {
            i = supportCar.status;
        }
        return supportCar.copy(str, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFactoryCode() {
        return this.factoryCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final SupportCar copy(@NotNull String factoryCode, int status) {
        return new SupportCar(factoryCode, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportCar)) {
            return false;
        }
        SupportCar supportCar = (SupportCar) other;
        return Intrinsics.areEqual(this.factoryCode, supportCar.factoryCode) && this.status == supportCar.status;
    }

    @NotNull
    public final String getFactoryCode() {
        return this.factoryCode;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.factoryCode.hashCode() * 31) + this.status;
    }

    @NotNull
    public String toString() {
        return "SupportCar(factoryCode=" + this.factoryCode + ", status=" + this.status + ')';
    }

    public /* synthetic */ SupportCar(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? -1 : i);
    }
}
