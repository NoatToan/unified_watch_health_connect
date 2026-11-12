package com.huami.nfc.car.entity;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003J\u001b\u0010\u0006\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/huami/nfc/car/entity/SupportCarList;", "", "", "Lcom/huami/nfc/car/entity/SupportCar;", "component1", "devices", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/util/List;", "getDevices", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "nfc-car_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SupportCarList {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("devices")
    @Nullable
    private final List<SupportCar> devices;

    /* JADX WARN: Multi-variable type inference failed */
    public SupportCarList() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public SupportCarList(@Nullable List<SupportCar> list) {
        this.devices = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SupportCarList copy$default(SupportCarList supportCarList, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = supportCarList.devices;
        }
        return supportCarList.copy(list);
    }

    @Nullable
    public final List<SupportCar> component1() {
        return this.devices;
    }

    @NotNull
    public final SupportCarList copy(@Nullable List<SupportCar> devices) {
        return new SupportCarList(devices);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SupportCarList) && Intrinsics.areEqual(this.devices, ((SupportCarList) other).devices);
    }

    @Nullable
    public final List<SupportCar> getDevices() {
        return this.devices;
    }

    public int hashCode() {
        List<SupportCar> list = this.devices;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        return "SupportCarList(devices=" + this.devices + ')';
    }

    public /* synthetic */ SupportCarList(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}
