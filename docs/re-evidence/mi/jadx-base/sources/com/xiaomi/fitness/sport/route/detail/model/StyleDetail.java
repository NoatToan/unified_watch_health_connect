package com.xiaomi.fitness.sport.route.detail.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Parcelize
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0003J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0003R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/model/StyleDetail;", "Landroid/os/Parcelable;", "id", "", "desc", "", "icon", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getId", "()I", "setId", "(I)V", "getDesc", "()Ljava/lang/String;", "setDesc", "(Ljava/lang/String;)V", "getIcon", "setIcon", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StyleDetail implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StyleDetail> CREATOR = new Creator();

    @SerializedName("desc")
    @Nullable
    private String desc;

    @SerializedName("icon")
    @Nullable
    private String icon;

    @SerializedName("id")
    private int id;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StyleDetail> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StyleDetail createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StyleDetail(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StyleDetail[] newArray(int i) {
            return new StyleDetail[i];
        }
    }

    public StyleDetail() {
        this(0, null, null, 7, null);
    }

    public static /* synthetic */ StyleDetail copy$default(StyleDetail styleDetail, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = styleDetail.id;
        }
        if ((i2 & 2) != 0) {
            str = styleDetail.desc;
        }
        if ((i2 & 4) != 0) {
            str2 = styleDetail.icon;
        }
        return styleDetail.copy(i, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final StyleDetail copy(int id, @Nullable String desc, @Nullable String icon) {
        return new StyleDetail(id, desc, icon);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StyleDetail)) {
            return false;
        }
        StyleDetail styleDetail = (StyleDetail) other;
        return this.id == styleDetail.id && Intrinsics.areEqual(this.desc, styleDetail.desc) && Intrinsics.areEqual(this.icon, styleDetail.icon);
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    public final int getId() {
        return this.id;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.id) * 31;
        String str = this.desc;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.icon;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setId(int i) {
        this.id = i;
    }

    @NotNull
    public String toString() {
        return "StyleDetail(id=" + this.id + ", desc=" + this.desc + ", icon=" + this.icon + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.id);
        dest.writeString(this.desc);
        dest.writeString(this.icon);
    }

    public StyleDetail(int i, @Nullable String str, @Nullable String str2) {
        this.id = i;
        this.desc = str;
        this.icon = str2;
    }

    public /* synthetic */ StyleDetail(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2);
    }
}
