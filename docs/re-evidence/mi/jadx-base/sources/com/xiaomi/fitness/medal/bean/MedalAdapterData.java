package com.xiaomi.fitness.medal.bean;

import defpackage.ecf;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\"\u0010#J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\f\u0010\nJF\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0004J\u0010\u0010\u0015\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\nJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u0004R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007R\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u001f\u0010\nR\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b \u0010\nR\u0017\u0010\u0011\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b!\u0010\n¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/medal/bean/MedalAdapterData;", "", "", "component1", "()Ljava/lang/String;", "Lecf$a$a;", "component2", "()Lecf$a$a;", "", "component3", "()I", "component4", "component5", "categoryName", "medalData", "itemType", "cityMedalsCountNotGot", "categoryId", "copy", "(Ljava/lang/String;Lecf$a$a;III)Lcom/xiaomi/fitness/medal/bean/MedalAdapterData;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCategoryName", "Lecf$a$a;", "getMedalData", "I", "getItemType", "getCityMedalsCountNotGot", "getCategoryId", "<init>", "(Ljava/lang/String;Lecf$a$a;III)V", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final /* data */ class MedalAdapterData {
    private final int categoryId;

    @Nullable
    private final String categoryName;
    private final int cityMedalsCountNotGot;
    private final int itemType;

    @Nullable
    private final ecf.a.C0923a medalData;

    public /* synthetic */ MedalAdapterData(String str, ecf.a.C0923a c0923a, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, c0923a, i, (i4 & 8) != 0 ? -1 : i2, i3);
    }

    public static /* synthetic */ MedalAdapterData copy$default(MedalAdapterData medalAdapterData, String str, ecf.a.C0923a c0923a, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = medalAdapterData.categoryName;
        }
        if ((i4 & 2) != 0) {
            c0923a = medalAdapterData.medalData;
        }
        ecf.a.C0923a c0923a2 = c0923a;
        if ((i4 & 4) != 0) {
            i = medalAdapterData.itemType;
        }
        int i5 = i;
        if ((i4 & 8) != 0) {
            i2 = medalAdapterData.cityMedalsCountNotGot;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            i3 = medalAdapterData.categoryId;
        }
        return medalAdapterData.copy(str, c0923a2, i5, i6, i3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCategoryName() {
        return this.categoryName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ecf.a.C0923a getMedalData() {
        return this.medalData;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getItemType() {
        return this.itemType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getCityMedalsCountNotGot() {
        return this.cityMedalsCountNotGot;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getCategoryId() {
        return this.categoryId;
    }

    @NotNull
    public final MedalAdapterData copy(@Nullable String categoryName, @Nullable ecf.a.C0923a medalData, int itemType, int cityMedalsCountNotGot, int categoryId) {
        return new MedalAdapterData(categoryName, medalData, itemType, cityMedalsCountNotGot, categoryId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MedalAdapterData)) {
            return false;
        }
        MedalAdapterData medalAdapterData = (MedalAdapterData) other;
        return Intrinsics.areEqual(this.categoryName, medalAdapterData.categoryName) && Intrinsics.areEqual(this.medalData, medalAdapterData.medalData) && this.itemType == medalAdapterData.itemType && this.cityMedalsCountNotGot == medalAdapterData.cityMedalsCountNotGot && this.categoryId == medalAdapterData.categoryId;
    }

    public final int getCategoryId() {
        return this.categoryId;
    }

    @Nullable
    public final String getCategoryName() {
        return this.categoryName;
    }

    public final int getCityMedalsCountNotGot() {
        return this.cityMedalsCountNotGot;
    }

    public final int getItemType() {
        return this.itemType;
    }

    @Nullable
    public final ecf.a.C0923a getMedalData() {
        return this.medalData;
    }

    public int hashCode() {
        String str = this.categoryName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ecf.a.C0923a c0923a = this.medalData;
        return ((((((iHashCode + (c0923a != null ? c0923a.hashCode() : 0)) * 31) + Integer.hashCode(this.itemType)) * 31) + Integer.hashCode(this.cityMedalsCountNotGot)) * 31) + Integer.hashCode(this.categoryId);
    }

    @NotNull
    public String toString() {
        return "MedalAdapterData(categoryName=" + this.categoryName + ", medalData=" + this.medalData + ", itemType=" + this.itemType + ", cityMedalsCountNotGot=" + this.cityMedalsCountNotGot + ", categoryId=" + this.categoryId + ")";
    }

    public MedalAdapterData(@Nullable String str, @Nullable ecf.a.C0923a c0923a, int i, int i2, int i3) {
        this.categoryName = str;
        this.medalData = c0923a;
        this.itemType = i;
        this.cityMedalsCountNotGot = i2;
        this.categoryId = i3;
    }
}
