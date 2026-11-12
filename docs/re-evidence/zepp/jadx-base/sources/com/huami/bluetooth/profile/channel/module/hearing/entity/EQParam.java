package com.huami.bluetooth.profile.channel.module.hearing.entity;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00040\bj\b\u0012\u0004\u0012\u00020\u0004`\t\u0012\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00040\bj\b\u0012\u0004\u0012\u00020\u0004`\t\u0012\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b(\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\u0019\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00040\bj\b\u0012\u0004\u0012\u00020\u0004`\tHÆ\u0003J\u0019\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00040\bj\b\u0012\u0004\u0012\u00020\u0004`\tHÆ\u0003J\t\u0010\f\u001a\u00020\u0004HÆ\u0003Je\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\u0018\b\u0002\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00040\bj\b\u0012\u0004\u0012\u00020\u0004`\t2\u0018\b\u0002\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00040\bj\b\u0012\u0004\u0012\u00020\u0004`\t2\b\b\u0002\u0010\u0012\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\r\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u000e\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\u000f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR)\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00040\bj\b\u0012\u0004\u0012\u00020\u0004`\t8\u0006@\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R)\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00040\bj\b\u0012\u0004\u0012\u00020\u0004`\t8\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0019\u0010\u0012\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010\u0019\u001a\u0004\b'\u0010\u001b¨\u0006*"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/entity/EQParam;", "", "", "toString", "", "component1", "component2", "component3", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "component4", "component5", "component6", "position", "mode", "frequencyListSize", "frequencyList", "valueList", "noiseReductionLevel", "copy", "hashCode", "other", "", "equals", "a", LogUtil.I, "getPosition", "()I", "b", "getMode", "c", "getFrequencyListSize", GoogleApiAvailabilityLight.a, "Ljava/util/ArrayList;", "getFrequencyList", "()Ljava/util/ArrayList;", "e", "getValueList", "f", "getNoiseReductionLevel", "<init>", "(IIILjava/util/ArrayList;Ljava/util/ArrayList;I)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class EQParam {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int position;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int mode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int frequencyListSize;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final ArrayList<Integer> frequencyList;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final ArrayList<Integer> valueList;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final int noiseReductionLevel;

    public EQParam(int i, int i2, int i3, @NotNull ArrayList<Integer> arrayList, @NotNull ArrayList<Integer> arrayList2, int i4) {
        this.position = i;
        this.mode = i2;
        this.frequencyListSize = i3;
        this.frequencyList = arrayList;
        this.valueList = arrayList2;
        this.noiseReductionLevel = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EQParam copy$default(EQParam eQParam, int i, int i2, int i3, ArrayList arrayList, ArrayList arrayList2, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = eQParam.position;
        }
        if ((i5 & 2) != 0) {
            i2 = eQParam.mode;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = eQParam.frequencyListSize;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            arrayList = eQParam.frequencyList;
        }
        ArrayList arrayList3 = arrayList;
        if ((i5 & 16) != 0) {
            arrayList2 = eQParam.valueList;
        }
        ArrayList arrayList4 = arrayList2;
        if ((i5 & 32) != 0) {
            i4 = eQParam.noiseReductionLevel;
        }
        return eQParam.copy(i, i6, i7, arrayList3, arrayList4, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getFrequencyListSize() {
        return this.frequencyListSize;
    }

    @NotNull
    public final ArrayList<Integer> component4() {
        return this.frequencyList;
    }

    @NotNull
    public final ArrayList<Integer> component5() {
        return this.valueList;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getNoiseReductionLevel() {
        return this.noiseReductionLevel;
    }

    @NotNull
    public final EQParam copy(int position, int mode, int frequencyListSize, @NotNull ArrayList<Integer> frequencyList, @NotNull ArrayList<Integer> valueList, int noiseReductionLevel) {
        return new EQParam(position, mode, frequencyListSize, frequencyList, valueList, noiseReductionLevel);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EQParam)) {
            return false;
        }
        EQParam eQParam = (EQParam) other;
        return this.position == eQParam.position && this.mode == eQParam.mode && this.frequencyListSize == eQParam.frequencyListSize && Intrinsics.areEqual(this.frequencyList, eQParam.frequencyList) && Intrinsics.areEqual(this.valueList, eQParam.valueList) && this.noiseReductionLevel == eQParam.noiseReductionLevel;
    }

    @NotNull
    public final ArrayList<Integer> getFrequencyList() {
        return this.frequencyList;
    }

    public final int getFrequencyListSize() {
        return this.frequencyListSize;
    }

    public final int getMode() {
        return this.mode;
    }

    public final int getNoiseReductionLevel() {
        return this.noiseReductionLevel;
    }

    public final int getPosition() {
        return this.position;
    }

    @NotNull
    public final ArrayList<Integer> getValueList() {
        return this.valueList;
    }

    public int hashCode() {
        return (((((((((this.position * 31) + this.mode) * 31) + this.frequencyListSize) * 31) + this.frequencyList.hashCode()) * 31) + this.valueList.hashCode()) * 31) + this.noiseReductionLevel;
    }

    @NotNull
    public String toString() {
        return "EQParam{position=" + this.position + ", mode=" + this.mode + ", frequencyListSize=" + this.frequencyListSize + ", frequencyList=" + this.frequencyList + ", valueList=" + this.valueList + ", noiseReductionLevel" + this.noiseReductionLevel + ", }";
    }
}
