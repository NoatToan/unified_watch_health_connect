package com.huami.bluetooth.profile.channel.module.hearing.entity;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\u0018\b\u0002\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0007j\b\u0012\u0004\u0012\u00020\u0004`\b\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0007j\b\u0012\u0004\u0012\u00020\u0004`\b¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\u0019\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0007j\b\u0012\u0004\u0012\u00020\u0004`\bHÆ\u0003J\u0019\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0007j\b\u0012\u0004\u0012\u00020\u0004`\bHÆ\u0003JQ\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\u0018\b\u0002\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0007j\b\u0012\u0004\u0012\u00020\u0004`\b2\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0007j\b\u0012\u0004\u0012\u00020\u0004`\bHÆ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R)\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0007j\b\u0012\u0004\u0012\u00020\u0004`\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR)\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0007j\b\u0012\u0004\u0012\u00020\u0004`\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001d¨\u0006\""}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/entity/WDRCParam;", "", "", "toString", "", "component1", "component2", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "component3", "component4", "position", "frequencyListSize", "frequencyList", "wdrcValues", "copy", "hashCode", "other", "", "equals", "a", LogUtil.I, "getPosition", "()I", "b", "getFrequencyListSize", "c", "Ljava/util/ArrayList;", "getFrequencyList", "()Ljava/util/ArrayList;", GoogleApiAvailabilityLight.a, "getWdrcValues", "<init>", "(IILjava/util/ArrayList;Ljava/util/ArrayList;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WDRCParam {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int position;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int frequencyListSize;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final ArrayList<Integer> frequencyList;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final ArrayList<Integer> valueList;

    public WDRCParam(int i, int i2, @NotNull ArrayList<Integer> arrayList, @NotNull ArrayList<Integer> arrayList2) {
        this.position = i;
        this.frequencyListSize = i2;
        this.frequencyList = arrayList;
        this.valueList = arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WDRCParam copy$default(WDRCParam wDRCParam, int i, int i2, ArrayList arrayList, ArrayList arrayList2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = wDRCParam.position;
        }
        if ((i3 & 2) != 0) {
            i2 = wDRCParam.frequencyListSize;
        }
        if ((i3 & 4) != 0) {
            arrayList = wDRCParam.frequencyList;
        }
        if ((i3 & 8) != 0) {
            arrayList2 = wDRCParam.valueList;
        }
        return wDRCParam.copy(i, i2, arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getFrequencyListSize() {
        return this.frequencyListSize;
    }

    @NotNull
    public final ArrayList<Integer> component3() {
        return this.frequencyList;
    }

    @NotNull
    public final ArrayList<Integer> component4() {
        return this.valueList;
    }

    @NotNull
    public final WDRCParam copy(int position, int frequencyListSize, @NotNull ArrayList<Integer> frequencyList, @NotNull ArrayList<Integer> wdrcValues) {
        return new WDRCParam(position, frequencyListSize, frequencyList, wdrcValues);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WDRCParam)) {
            return false;
        }
        WDRCParam wDRCParam = (WDRCParam) other;
        return this.position == wDRCParam.position && this.frequencyListSize == wDRCParam.frequencyListSize && Intrinsics.areEqual(this.frequencyList, wDRCParam.frequencyList) && Intrinsics.areEqual(this.valueList, wDRCParam.valueList);
    }

    @NotNull
    public final ArrayList<Integer> getFrequencyList() {
        return this.frequencyList;
    }

    public final int getFrequencyListSize() {
        return this.frequencyListSize;
    }

    public final int getPosition() {
        return this.position;
    }

    @NotNull
    public final ArrayList<Integer> getWdrcValues() {
        return this.valueList;
    }

    public int hashCode() {
        return (((((this.position * 31) + this.frequencyListSize) * 31) + this.frequencyList.hashCode()) * 31) + this.valueList.hashCode();
    }

    @NotNull
    public String toString() {
        return "WDRCParam{position=" + this.position + ", frequencyListSize=" + this.frequencyListSize + ", frequencyList=" + this.frequencyList + ", valueList=" + this.valueList + '}';
    }

    public /* synthetic */ WDRCParam(int i, int i2, ArrayList arrayList, ArrayList arrayList2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? 6 : i2, (i3 & 4) != 0 ? CollectionsKt__CollectionsKt.arrayListOf(250, 500, 1000, 2000, 4000, 6000) : arrayList, arrayList2);
    }
}
