package com.huami.watchfacesstore.room.publisher;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Entity(primaryKeys = {"id"})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0003J7\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019¨\u0006 "}, d2 = {"Lcom/huami/watchfacesstore/room/publisher/PublisherInfo;", "", "", "component1", "", "component2", "component3", "component4", "id", "name", "icon", "description", "copy", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getId", "()I", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "c", "getIcon", GoogleApiAvailabilityLight.a, "getDescription", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PublisherInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @ColumnInfo
    private final int id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @ColumnInfo
    @Nullable
    private final String name;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @ColumnInfo
    @Nullable
    private final String icon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @ColumnInfo
    @Nullable
    private final String description;

    public PublisherInfo(int i, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.id = i;
        this.name = str;
        this.icon = str2;
        this.description = str3;
    }

    public static /* synthetic */ PublisherInfo copy$default(PublisherInfo publisherInfo, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = publisherInfo.id;
        }
        if ((i2 & 2) != 0) {
            str = publisherInfo.name;
        }
        if ((i2 & 4) != 0) {
            str2 = publisherInfo.icon;
        }
        if ((i2 & 8) != 0) {
            str3 = publisherInfo.description;
        }
        return publisherInfo.copy(i, str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final PublisherInfo copy(int id, @Nullable String name, @Nullable String icon, @Nullable String description) {
        return new PublisherInfo(id, name, icon, description);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PublisherInfo)) {
            return false;
        }
        PublisherInfo publisherInfo = (PublisherInfo) other;
        return this.id == publisherInfo.id && Intrinsics.areEqual(this.name, publisherInfo.name) && Intrinsics.areEqual(this.icon, publisherInfo.icon) && Intrinsics.areEqual(this.description, publisherInfo.description);
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int i = this.id * 31;
        String str = this.name;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.icon;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PublisherInfo(id=" + this.id + ", name=" + this.name + ", icon=" + this.icon + ", description=" + this.description + ")";
    }
}
