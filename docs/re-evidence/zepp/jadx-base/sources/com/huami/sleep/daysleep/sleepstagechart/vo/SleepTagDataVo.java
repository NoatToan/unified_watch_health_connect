package com.huami.sleep.daysleep.sleepstagechart.vo;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J'\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u000b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u000b\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/huami/sleep/daysleep/sleepstagechart/vo/SleepTagDataVo;", "", "", "hashCode", "", "component1", "component2", "", "component3", "tag", "tagType", "isSelect", "copy", "toString", "other", "equals", "a", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "b", LogUtil.I, "getTagType", "()I", "c", "Z", "()Z", "setSelect", "(Z)V", "<init>", "(Ljava/lang/String;IZ)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SleepTagDataVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String tag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int tagType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private boolean isSelect;

    public SleepTagDataVo(@NotNull String str, int i, boolean z) {
        this.tag = str;
        this.tagType = i;
        this.isSelect = z;
    }

    public static /* synthetic */ SleepTagDataVo copy$default(SleepTagDataVo sleepTagDataVo, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = sleepTagDataVo.tag;
        }
        if ((i2 & 2) != 0) {
            i = sleepTagDataVo.tagType;
        }
        if ((i2 & 4) != 0) {
            z = sleepTagDataVo.isSelect;
        }
        return sleepTagDataVo.copy(str, i, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTagType() {
        return this.tagType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsSelect() {
        return this.isSelect;
    }

    @NotNull
    public final SleepTagDataVo copy(@NotNull String tag, int tagType, boolean isSelect) {
        return new SleepTagDataVo(tag, tagType, isSelect);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepTagDataVo)) {
            return false;
        }
        SleepTagDataVo sleepTagDataVo = (SleepTagDataVo) other;
        return Intrinsics.areEqual(this.tag, sleepTagDataVo.tag) && this.tagType == sleepTagDataVo.tagType && this.isSelect == sleepTagDataVo.isSelect;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    public final int getTagType() {
        return this.tagType;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public final boolean isSelect() {
        return this.isSelect;
    }

    public final void setSelect(boolean z) {
        this.isSelect = z;
    }

    @NotNull
    public String toString() {
        return "SleepTagDataVo(tag=" + this.tag + ", tagType=" + this.tagType + ", isSelect=" + this.isSelect + ")";
    }

    public /* synthetic */ SleepTagDataVo(String str, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 4) != 0 ? false : z);
    }
}
