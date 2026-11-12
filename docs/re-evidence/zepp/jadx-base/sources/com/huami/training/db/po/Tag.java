package com.huami.training.db.po;

import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.sleepassistant.apilib.utils.WebConst;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Entity(indices = {@Index(unique = true, value = {"tagId"})})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u001d\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/huami/training/db/po/Tag;", "", "", "component1", "", "component2", "tagId", "name", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "J", "getTagId", "()J", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "c", LogUtil.I, "getId", "()I", WebConst.QueryParam.SET_ID, "(I)V", "id", "<init>", "(JLjava/lang/String;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Tag {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long tagId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @PrimaryKey(autoGenerate = true)
    private int id;

    public Tag(long j, @NotNull String str) {
        this.tagId = j;
        this.name = str;
    }

    public static /* synthetic */ Tag copy$default(Tag tag, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = tag.tagId;
        }
        if ((i & 2) != 0) {
            str = tag.name;
        }
        return tag.copy(j, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTagId() {
        return this.tagId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final Tag copy(long tagId, @NotNull String name) {
        return new Tag(tagId, name);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Tag)) {
            return false;
        }
        Tag tag = (Tag) other;
        return this.tagId == tag.tagId && Intrinsics.areEqual(this.name, tag.name);
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final long getTagId() {
        return this.tagId;
    }

    public int hashCode() {
        return (b.a(this.tagId) * 31) + this.name.hashCode();
    }

    public final void setId(int i) {
        this.id = i;
    }

    @NotNull
    public String toString() {
        return "Tag(tagId=" + this.tagId + ", name=" + this.name + ')';
    }
}
