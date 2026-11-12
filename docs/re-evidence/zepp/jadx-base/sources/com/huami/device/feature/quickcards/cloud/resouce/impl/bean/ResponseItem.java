package com.huami.device.feature.quickcards.cloud.resouce.impl.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J+\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001b\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/huami/device/feature/quickcards/cloud/resouce/impl/bean/ResponseItem;", "", "", "component1", "component2", "component3", "id", "name", "icon", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "getName", "c", "getIcon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "quick-card-api_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ResponseItem {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final String name;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final String icon;

    public ResponseItem(@NotNull String str, @Nullable String str2, @Nullable String str3) {
        this.id = str;
        this.name = str2;
        this.icon = str3;
    }

    public static /* synthetic */ ResponseItem copy$default(ResponseItem responseItem, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = responseItem.id;
        }
        if ((i & 2) != 0) {
            str2 = responseItem.name;
        }
        if ((i & 4) != 0) {
            str3 = responseItem.icon;
        }
        return responseItem.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
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

    @NotNull
    public final ResponseItem copy(@NotNull String id, @Nullable String name, @Nullable String icon) {
        return new ResponseItem(id, name, icon);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResponseItem)) {
            return false;
        }
        ResponseItem responseItem = (ResponseItem) other;
        return Intrinsics.areEqual(this.id, responseItem.id) && Intrinsics.areEqual(this.name, responseItem.name) && Intrinsics.areEqual(this.icon, responseItem.icon);
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.icon;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ResponseItem(id=" + this.id + ", name=" + ((Object) this.name) + ", icon=" + ((Object) this.icon) + ')';
    }
}
