package com.xiaomi.fitness.membership.export.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Parcelize
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/membership/export/data/HomeConfig;", "Landroid/os/Parcelable;", MedicalIdSPContract.PREF_FIRST, "", "", "second", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getFirst", "()Ljava/util/List;", "getSecond", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "membership-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HomeConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HomeConfig> CREATOR = new Creator();

    @Nullable
    private final List<String> first;

    @Nullable
    private final List<String> second;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<HomeConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HomeConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HomeConfig(parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HomeConfig[] newArray(int i) {
            return new HomeConfig[i];
        }
    }

    public HomeConfig(@Nullable List<String> list, @Nullable List<String> list2) {
        this.first = list;
        this.second = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomeConfig copy$default(HomeConfig homeConfig, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = homeConfig.first;
        }
        if ((i & 2) != 0) {
            list2 = homeConfig.second;
        }
        return homeConfig.copy(list, list2);
    }

    @Nullable
    public final List<String> component1() {
        return this.first;
    }

    @Nullable
    public final List<String> component2() {
        return this.second;
    }

    @NotNull
    public final HomeConfig copy(@Nullable List<String> first, @Nullable List<String> second) {
        return new HomeConfig(first, second);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeConfig)) {
            return false;
        }
        HomeConfig homeConfig = (HomeConfig) other;
        return Intrinsics.areEqual(this.first, homeConfig.first) && Intrinsics.areEqual(this.second, homeConfig.second);
    }

    @Nullable
    public final List<String> getFirst() {
        return this.first;
    }

    @Nullable
    public final List<String> getSecond() {
        return this.second;
    }

    public int hashCode() {
        List<String> list = this.first;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.second;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HomeConfig(first=" + this.first + ", second=" + this.second + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeStringList(this.first);
        dest.writeStringList(this.second);
    }
}
