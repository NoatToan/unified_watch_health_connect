package com.huami.training.db.po;

import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleepassistant.apilib.utils.WebConst;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Entity(indices = {@Index(unique = true, value = {"jumpType"})})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J)\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001b\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\"\u0010\u001e\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/huami/training/db/po/EntranceKing;", "", "", "component1", "component2", "component3", "iconUrl", "name", "jumpType", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getIconUrl", "()Ljava/lang/String;", "b", "getName", "c", "getJumpType", GoogleApiAvailabilityLight.a, LogUtil.I, "getId", "()I", WebConst.QueryParam.SET_ID, "(I)V", "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class EntranceKing {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String iconUrl;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final String jumpType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @PrimaryKey(autoGenerate = true)
    private int id;

    public EntranceKing(@NotNull String str, @NotNull String str2, @Nullable String str3) {
        this.iconUrl = str;
        this.name = str2;
        this.jumpType = str3;
    }

    public static /* synthetic */ EntranceKing copy$default(EntranceKing entranceKing, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = entranceKing.iconUrl;
        }
        if ((i & 2) != 0) {
            str2 = entranceKing.name;
        }
        if ((i & 4) != 0) {
            str3 = entranceKing.jumpType;
        }
        return entranceKing.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getJumpType() {
        return this.jumpType;
    }

    @NotNull
    public final EntranceKing copy(@NotNull String iconUrl, @NotNull String name, @Nullable String jumpType) {
        return new EntranceKing(iconUrl, name, jumpType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EntranceKing)) {
            return false;
        }
        EntranceKing entranceKing = (EntranceKing) other;
        return Intrinsics.areEqual(this.iconUrl, entranceKing.iconUrl) && Intrinsics.areEqual(this.name, entranceKing.name) && Intrinsics.areEqual(this.jumpType, entranceKing.jumpType);
    }

    @NotNull
    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getJumpType() {
        return this.jumpType;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = ((this.iconUrl.hashCode() * 31) + this.name.hashCode()) * 31;
        String str = this.jumpType;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setId(int i) {
        this.id = i;
    }

    @NotNull
    public String toString() {
        return "EntranceKing(iconUrl=" + this.iconUrl + ", name=" + this.name + ", jumpType=" + ((Object) this.jumpType) + ')';
    }
}
