package com.mi.health.course.export.data;

import com.google.gson.annotations.SerializedName;
import com.mibi.sdk.component.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b$\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010+\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001fJz\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020\u000e2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u0007HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u0019R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u001a\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001d\u0010\u0016R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u00062"}, d2 = {"Lcom/mi/health/course/export/data/OpenVipModel;", "", "id", "", "usage", "name", "days", "", Constants.KEY_PRICE, "", "priceOld", "spuId", "spuVer", "selected", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getId", "()Ljava/lang/String;", "getUsage", "getName", "getDays", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPrice", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPriceOld", "getSpuId", "getSpuVer", "getSelected", "()Ljava/lang/Boolean;", "setSelected", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/mi/health/course/export/data/OpenVipModel;", "equals", "other", "hashCode", "toString", "course-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OpenVipModel {

    @Nullable
    private final Integer days;

    @Nullable
    private final String id;

    @Nullable
    private final String name;

    @Nullable
    private final Long price;

    @Nullable
    private final Long priceOld;

    @Nullable
    private Boolean selected;

    @SerializedName("spu_id")
    @Nullable
    private final String spuId;

    @SerializedName("spu_ver")
    @Nullable
    private final Integer spuVer;

    @Nullable
    private final String usage;

    public OpenVipModel(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable Long l, @Nullable Long l2, @Nullable String str4, @Nullable Integer num2, @Nullable Boolean bool) {
        this.id = str;
        this.usage = str2;
        this.name = str3;
        this.days = num;
        this.price = l;
        this.priceOld = l2;
        this.spuId = str4;
        this.spuVer = num2;
        this.selected = bool;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUsage() {
        return this.usage;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getDays() {
        return this.days;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getPriceOld() {
        return this.priceOld;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSpuId() {
        return this.spuId;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getSpuVer() {
        return this.spuVer;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getSelected() {
        return this.selected;
    }

    @NotNull
    public final OpenVipModel copy(@Nullable String id, @Nullable String usage, @Nullable String name, @Nullable Integer days, @Nullable Long price, @Nullable Long priceOld, @Nullable String spuId, @Nullable Integer spuVer, @Nullable Boolean selected) {
        return new OpenVipModel(id, usage, name, days, price, priceOld, spuId, spuVer, selected);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenVipModel)) {
            return false;
        }
        OpenVipModel openVipModel = (OpenVipModel) other;
        return Intrinsics.areEqual(this.id, openVipModel.id) && Intrinsics.areEqual(this.usage, openVipModel.usage) && Intrinsics.areEqual(this.name, openVipModel.name) && Intrinsics.areEqual(this.days, openVipModel.days) && Intrinsics.areEqual(this.price, openVipModel.price) && Intrinsics.areEqual(this.priceOld, openVipModel.priceOld) && Intrinsics.areEqual(this.spuId, openVipModel.spuId) && Intrinsics.areEqual(this.spuVer, openVipModel.spuVer) && Intrinsics.areEqual(this.selected, openVipModel.selected);
    }

    @Nullable
    public final Integer getDays() {
        return this.days;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Long getPrice() {
        return this.price;
    }

    @Nullable
    public final Long getPriceOld() {
        return this.priceOld;
    }

    @Nullable
    public final Boolean getSelected() {
        return this.selected;
    }

    @Nullable
    public final String getSpuId() {
        return this.spuId;
    }

    @Nullable
    public final Integer getSpuVer() {
        return this.spuVer;
    }

    @Nullable
    public final String getUsage() {
        return this.usage;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.usage;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.days;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.price;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.priceOld;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str4 = this.spuId;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.spuVer;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.selected;
        return iHashCode8 + (bool != null ? bool.hashCode() : 0);
    }

    public final void setSelected(@Nullable Boolean bool) {
        this.selected = bool;
    }

    @NotNull
    public String toString() {
        return "OpenVipModel(id=" + this.id + ", usage=" + this.usage + ", name=" + this.name + ", days=" + this.days + ", price=" + this.price + ", priceOld=" + this.priceOld + ", spuId=" + this.spuId + ", spuVer=" + this.spuVer + ", selected=" + this.selected + ")";
    }

    public /* synthetic */ OpenVipModel(String str, String str2, String str3, Integer num, Long l, Long l2, String str4, Integer num2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, num, l, l2, str4, num2, (i & 256) != 0 ? Boolean.FALSE : bool);
    }
}
