package com.xiaomi.hm.health.healthtag.ui.vo;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0005HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0007HÖ\u0001R\u0019\u0010\u000b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\f\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\r\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/healthtag/ui/vo/TagInfoVo;", "", "other", "", "equals", "", "hashCode", "", "component1", "component2", "component3", "tag", "tagType", "isSelect", "copy", "toString", "a", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "b", LogUtil.I, "getTagType", "()I", "c", "Z", "()Z", "setSelect", "(Z)V", "<init>", "(Ljava/lang/String;IZ)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TagInfoVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String tag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int tagType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private boolean isSelect;

    public TagInfoVo(@NotNull String str, int i, boolean z) {
        this.tag = str;
        this.tagType = i;
        this.isSelect = z;
    }

    public static /* synthetic */ TagInfoVo copy$default(TagInfoVo tagInfoVo, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = tagInfoVo.tag;
        }
        if ((i2 & 2) != 0) {
            i = tagInfoVo.tagType;
        }
        if ((i2 & 4) != 0) {
            z = tagInfoVo.isSelect;
        }
        return tagInfoVo.copy(str, i, z);
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
    public final TagInfoVo copy(@NotNull String tag, int tagType, boolean isSelect) {
        return new TagInfoVo(tag, tagType, isSelect);
    }

    public boolean equals(@Nullable Object other) {
        if (other == null) {
            return false;
        }
        return Intrinsics.areEqual(this.tag, ((TagInfoVo) other).tag);
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
        return "TagInfoVo(tag=" + this.tag + ", tagType=" + this.tagType + ", isSelect=" + this.isSelect + ")";
    }

    public /* synthetic */ TagInfoVo(String str, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 4) != 0 ? false : z);
    }
}
