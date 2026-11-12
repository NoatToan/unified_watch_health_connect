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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\u000b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR&\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/model/RouteStyleListResult;", "Landroid/os/Parcelable;", "styleList", "", "Lcom/xiaomi/fitness/sport/route/detail/model/CreateRouteCustomStyle;", "<init>", "(Ljava/util/List;)V", "getStyleList", "()Ljava/util/List;", "setStyleList", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteStyleListResult implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RouteStyleListResult> CREATOR = new Creator();

    @SerializedName("style_list")
    @Nullable
    private List<CreateRouteCustomStyle> styleList;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RouteStyleListResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RouteStyleListResult createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(CreateRouteCustomStyle.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new RouteStyleListResult(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RouteStyleListResult[] newArray(int i) {
            return new RouteStyleListResult[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RouteStyleListResult() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RouteStyleListResult copy$default(RouteStyleListResult routeStyleListResult, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = routeStyleListResult.styleList;
        }
        return routeStyleListResult.copy(list);
    }

    @Nullable
    public final List<CreateRouteCustomStyle> component1() {
        return this.styleList;
    }

    @NotNull
    public final RouteStyleListResult copy(@Nullable List<CreateRouteCustomStyle> styleList) {
        return new RouteStyleListResult(styleList);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RouteStyleListResult) && Intrinsics.areEqual(this.styleList, ((RouteStyleListResult) other).styleList);
    }

    @Nullable
    public final List<CreateRouteCustomStyle> getStyleList() {
        return this.styleList;
    }

    public int hashCode() {
        List<CreateRouteCustomStyle> list = this.styleList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setStyleList(@Nullable List<CreateRouteCustomStyle> list) {
        this.styleList = list;
    }

    @NotNull
    public String toString() {
        return "RouteStyleListResult(styleList=" + this.styleList + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<CreateRouteCustomStyle> list = this.styleList;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<CreateRouteCustomStyle> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public RouteStyleListResult(@Nullable List<CreateRouteCustomStyle> list) {
        this.styleList = list;
    }

    public /* synthetic */ RouteStyleListResult(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
