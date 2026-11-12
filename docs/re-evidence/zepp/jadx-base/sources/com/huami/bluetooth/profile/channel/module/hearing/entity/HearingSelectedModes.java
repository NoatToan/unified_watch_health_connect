package com.huami.bluetooth.profile.channel.module.hearing.entity;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0006j\b\u0012\u0004\u0012\u00020\u0004`\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u0019\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0006j\b\u0012\u0004\u0012\u00020\u0004`\u0007HÆ\u0003J-\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00042\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0006j\b\u0012\u0004\u0012\u00020\u0004`\u0007HÆ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0006j\b\u0012\u0004\u0012\u00020\u0004`\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/entity/HearingSelectedModes;", "", "", "toString", "", "component1", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "component2", "size", "modes", "copy", "hashCode", "other", "", "equals", "a", LogUtil.I, "getSize", "()I", "b", "Ljava/util/ArrayList;", "getModes", "()Ljava/util/ArrayList;", "<init>", "(ILjava/util/ArrayList;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HearingSelectedModes {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int size;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final ArrayList<Integer> modes;

    public HearingSelectedModes(int i, @NotNull ArrayList<Integer> arrayList) {
        this.size = i;
        this.modes = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HearingSelectedModes copy$default(HearingSelectedModes hearingSelectedModes, int i, ArrayList arrayList, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = hearingSelectedModes.size;
        }
        if ((i2 & 2) != 0) {
            arrayList = hearingSelectedModes.modes;
        }
        return hearingSelectedModes.copy(i, arrayList);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    @NotNull
    public final ArrayList<Integer> component2() {
        return this.modes;
    }

    @NotNull
    public final HearingSelectedModes copy(int size, @NotNull ArrayList<Integer> modes) {
        return new HearingSelectedModes(size, modes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HearingSelectedModes)) {
            return false;
        }
        HearingSelectedModes hearingSelectedModes = (HearingSelectedModes) other;
        return this.size == hearingSelectedModes.size && Intrinsics.areEqual(this.modes, hearingSelectedModes.modes);
    }

    @NotNull
    public final ArrayList<Integer> getModes() {
        return this.modes;
    }

    public final int getSize() {
        return this.size;
    }

    public int hashCode() {
        return (this.size * 31) + this.modes.hashCode();
    }

    @NotNull
    public String toString() {
        return "HearingSelectedModes{size=" + this.size + ", modes=" + this.modes + '}';
    }
}
