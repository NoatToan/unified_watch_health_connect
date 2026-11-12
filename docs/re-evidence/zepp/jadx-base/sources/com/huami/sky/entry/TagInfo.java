package com.huami.sky.entry;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/huami/sky/entry/TagInfo;", "", "", "component1", "component2", "content", "color", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getContent", "()Ljava/lang/String;", "getColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "sky-service_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TagInfo {

    @NotNull
    private final String color;

    @NotNull
    private final String content;

    public TagInfo(@NotNull String str, @NotNull String str2) {
        this.content = str;
        this.color = str2;
    }

    public static /* synthetic */ TagInfo copy$default(TagInfo tagInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tagInfo.content;
        }
        if ((i & 2) != 0) {
            str2 = tagInfo.color;
        }
        return tagInfo.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    @NotNull
    public final TagInfo copy(@NotNull String content, @NotNull String color) {
        return new TagInfo(content, color);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TagInfo)) {
            return false;
        }
        TagInfo tagInfo = (TagInfo) other;
        return Intrinsics.areEqual(this.content, tagInfo.content) && Intrinsics.areEqual(this.color, tagInfo.color);
    }

    @NotNull
    public final String getColor() {
        return this.color;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    public int hashCode() {
        return (this.content.hashCode() * 31) + this.color.hashCode();
    }

    @NotNull
    public String toString() {
        return "TagInfo(content=" + this.content + ", color=" + this.color + ")";
    }
}
