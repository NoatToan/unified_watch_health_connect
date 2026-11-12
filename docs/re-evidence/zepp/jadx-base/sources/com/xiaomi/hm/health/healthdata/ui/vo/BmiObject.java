package com.xiaomi.hm.health.healthdata.ui.vo;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0003J9\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/vo/BmiObject;", "", "", "", "component1", "", "component2", "", "component3", "colors", "levelHints", "sectionValues", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/util/List;", "getColors", "()Ljava/util/List;", "setColors", "(Ljava/util/List;)V", "b", "getLevelHints", "setLevelHints", "c", "getSectionValues", "setSectionValues", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BmiObject {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private List<Integer> colors;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private List<String> levelHints;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private List<Float> sectionValues;

    public BmiObject(@NotNull List<Integer> list, @NotNull List<String> list2, @NotNull List<Float> list3) {
        this.colors = list;
        this.levelHints = list2;
        this.sectionValues = list3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BmiObject copy$default(BmiObject bmiObject, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bmiObject.colors;
        }
        if ((i & 2) != 0) {
            list2 = bmiObject.levelHints;
        }
        if ((i & 4) != 0) {
            list3 = bmiObject.sectionValues;
        }
        return bmiObject.copy(list, list2, list3);
    }

    @NotNull
    public final List<Integer> component1() {
        return this.colors;
    }

    @NotNull
    public final List<String> component2() {
        return this.levelHints;
    }

    @NotNull
    public final List<Float> component3() {
        return this.sectionValues;
    }

    @NotNull
    public final BmiObject copy(@NotNull List<Integer> colors, @NotNull List<String> levelHints, @NotNull List<Float> sectionValues) {
        return new BmiObject(colors, levelHints, sectionValues);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BmiObject)) {
            return false;
        }
        BmiObject bmiObject = (BmiObject) other;
        return Intrinsics.areEqual(this.colors, bmiObject.colors) && Intrinsics.areEqual(this.levelHints, bmiObject.levelHints) && Intrinsics.areEqual(this.sectionValues, bmiObject.sectionValues);
    }

    @NotNull
    public final List<Integer> getColors() {
        return this.colors;
    }

    @NotNull
    public final List<String> getLevelHints() {
        return this.levelHints;
    }

    @NotNull
    public final List<Float> getSectionValues() {
        return this.sectionValues;
    }

    public int hashCode() {
        return (((this.colors.hashCode() * 31) + this.levelHints.hashCode()) * 31) + this.sectionValues.hashCode();
    }

    public final void setColors(@NotNull List<Integer> list) {
        this.colors = list;
    }

    public final void setLevelHints(@NotNull List<String> list) {
        this.levelHints = list;
    }

    public final void setSectionValues(@NotNull List<Float> list) {
        this.sectionValues = list;
    }

    @NotNull
    public String toString() {
        return "BmiObject(colors=" + this.colors + ", levelHints=" + this.levelHints + ", sectionValues=" + this.sectionValues + ")";
    }
}
