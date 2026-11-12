package com.xiaomi.fitness.sport.route.detail.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Parcelize
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0014R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR&\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/model/CreateRouteCustomStyle;", "Landroid/os/Parcelable;", "senStyle", "Lcom/xiaomi/fitness/sport/route/detail/model/StyleDetail;", "subStyle", "", "<init>", "(Lcom/xiaomi/fitness/sport/route/detail/model/StyleDetail;Ljava/util/List;)V", "getSenStyle", "()Lcom/xiaomi/fitness/sport/route/detail/model/StyleDetail;", "setSenStyle", "(Lcom/xiaomi/fitness/sport/route/detail/model/StyleDetail;)V", "getSubStyle", "()Ljava/util/List;", "setSubStyle", "(Ljava/util/List;)V", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CreateRouteCustomStyle implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreateRouteCustomStyle> CREATOR = new Creator();

    @SerializedName("sen_style")
    @Nullable
    private StyleDetail senStyle;

    @SerializedName("sub_style")
    @Nullable
    private List<StyleDetail> subStyle;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CreateRouteCustomStyle> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateRouteCustomStyle createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ArrayList arrayList = null;
            StyleDetail styleDetailCreateFromParcel = parcel.readInt() == 0 ? null : StyleDetail.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(StyleDetail.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new CreateRouteCustomStyle(styleDetailCreateFromParcel, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateRouteCustomStyle[] newArray(int i) {
            return new CreateRouteCustomStyle[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CreateRouteCustomStyle() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateRouteCustomStyle copy$default(CreateRouteCustomStyle createRouteCustomStyle, StyleDetail styleDetail, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            styleDetail = createRouteCustomStyle.senStyle;
        }
        if ((i & 2) != 0) {
            list = createRouteCustomStyle.subStyle;
        }
        return createRouteCustomStyle.copy(styleDetail, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final StyleDetail getSenStyle() {
        return this.senStyle;
    }

    @Nullable
    public final List<StyleDetail> component2() {
        return this.subStyle;
    }

    @NotNull
    public final CreateRouteCustomStyle copy(@Nullable StyleDetail senStyle, @Nullable List<StyleDetail> subStyle) {
        return new CreateRouteCustomStyle(senStyle, subStyle);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateRouteCustomStyle)) {
            return false;
        }
        CreateRouteCustomStyle createRouteCustomStyle = (CreateRouteCustomStyle) other;
        return Intrinsics.areEqual(this.senStyle, createRouteCustomStyle.senStyle) && Intrinsics.areEqual(this.subStyle, createRouteCustomStyle.subStyle);
    }

    @Nullable
    public final StyleDetail getSenStyle() {
        return this.senStyle;
    }

    @Nullable
    public final List<StyleDetail> getSubStyle() {
        return this.subStyle;
    }

    public int hashCode() {
        StyleDetail styleDetail = this.senStyle;
        int iHashCode = (styleDetail == null ? 0 : styleDetail.hashCode()) * 31;
        List<StyleDetail> list = this.subStyle;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final void setSenStyle(@Nullable StyleDetail styleDetail) {
        this.senStyle = styleDetail;
    }

    public final void setSubStyle(@Nullable List<StyleDetail> list) {
        this.subStyle = list;
    }

    @NotNull
    public String toString() {
        return "CreateRouteCustomStyle(senStyle=" + this.senStyle + ", subStyle=" + this.subStyle + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        StyleDetail styleDetail = this.senStyle;
        if (styleDetail == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            styleDetail.writeToParcel(dest, flags);
        }
        List<StyleDetail> list = this.subStyle;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<StyleDetail> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public CreateRouteCustomStyle(@Nullable StyleDetail styleDetail, @Nullable List<StyleDetail> list) {
        this.senStyle = styleDetail;
        this.subStyle = list;
    }

    public /* synthetic */ CreateRouteCustomStyle(StyleDetail styleDetail, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : styleDetail, (i & 2) != 0 ? null : list);
    }
}
