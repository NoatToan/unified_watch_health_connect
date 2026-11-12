package com.huami.moving.config;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J1\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014¨\u0006\u001c"}, d2 = {"Lcom/huami/moving/config/SportTypeGroupItem;", "", "", "component1", "", "component2", "component3", "component4", "name", "type", "id", "sportGroup", "copy", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", LogUtil.I, "getType", "()I", "getId", "getSportGroup", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "moving_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SportTypeGroupItem {
    private final int id;

    @NotNull
    private final String name;

    @NotNull
    private final String sportGroup;
    private final int type;

    public SportTypeGroupItem(@NotNull String str, int i, int i2, @NotNull String str2) {
        this.name = str;
        this.type = i;
        this.id = i2;
        this.sportGroup = str2;
    }

    public static /* synthetic */ SportTypeGroupItem copy$default(SportTypeGroupItem sportTypeGroupItem, String str, int i, int i2, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = sportTypeGroupItem.name;
        }
        if ((i3 & 2) != 0) {
            i = sportTypeGroupItem.type;
        }
        if ((i3 & 4) != 0) {
            i2 = sportTypeGroupItem.id;
        }
        if ((i3 & 8) != 0) {
            str2 = sportTypeGroupItem.sportGroup;
        }
        return sportTypeGroupItem.copy(str, i, i2, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSportGroup() {
        return this.sportGroup;
    }

    @NotNull
    public final SportTypeGroupItem copy(@NotNull String name, int type, int id, @NotNull String sportGroup) {
        return new SportTypeGroupItem(name, type, id, sportGroup);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportTypeGroupItem)) {
            return false;
        }
        SportTypeGroupItem sportTypeGroupItem = (SportTypeGroupItem) other;
        return Intrinsics.areEqual(this.name, sportTypeGroupItem.name) && this.type == sportTypeGroupItem.type && this.id == sportTypeGroupItem.id && Intrinsics.areEqual(this.sportGroup, sportTypeGroupItem.sportGroup);
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getSportGroup() {
        return this.sportGroup;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.type) * 31) + this.id) * 31) + this.sportGroup.hashCode();
    }

    @NotNull
    public String toString() {
        return "SportTypeGroupItem(name=" + this.name + ", type=" + this.type + ", id=" + this.id + ", sportGroup=" + this.sportGroup + ")";
    }
}
