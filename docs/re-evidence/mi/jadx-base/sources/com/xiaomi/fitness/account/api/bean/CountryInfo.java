package com.xiaomi.fitness.account.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Parcelize
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/account/api/bean/CountryInfo;", "Landroid/os/Parcelable;", "country", "", "name", "pinyin", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCountry", "()Ljava/lang/String;", "setCountry", "(Ljava/lang/String;)V", "getName", "setName", "getPinyin", "setPinyin", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CountryInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CountryInfo> CREATOR = new Creator();

    @NotNull
    private String country;

    @Nullable
    private String name;

    @Nullable
    private String pinyin;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CountryInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CountryInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CountryInfo(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CountryInfo[] newArray(int i) {
            return new CountryInfo[i];
        }
    }

    public CountryInfo(@NotNull String country, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(country, "country");
        this.country = country;
        this.name = str;
        this.pinyin = str2;
    }

    public static /* synthetic */ CountryInfo copy$default(CountryInfo countryInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = countryInfo.country;
        }
        if ((i & 2) != 0) {
            str2 = countryInfo.name;
        }
        if ((i & 4) != 0) {
            str3 = countryInfo.pinyin;
        }
        return countryInfo.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPinyin() {
        return this.pinyin;
    }

    @NotNull
    public final CountryInfo copy(@NotNull String country, @Nullable String name, @Nullable String pinyin) {
        Intrinsics.checkNotNullParameter(country, "country");
        return new CountryInfo(country, name, pinyin);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountryInfo)) {
            return false;
        }
        CountryInfo countryInfo = (CountryInfo) other;
        return Intrinsics.areEqual(this.country, countryInfo.country) && Intrinsics.areEqual(this.name, countryInfo.name) && Intrinsics.areEqual(this.pinyin, countryInfo.pinyin);
    }

    @NotNull
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPinyin() {
        return this.pinyin;
    }

    public int hashCode() {
        int iHashCode = this.country.hashCode() * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pinyin;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setCountry(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.country = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setPinyin(@Nullable String str) {
        this.pinyin = str;
    }

    @NotNull
    public String toString() {
        return "CountryInfo(country=" + this.country + ", name=" + this.name + ", pinyin=" + this.pinyin + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.country);
        dest.writeString(this.name);
        dest.writeString(this.pinyin);
    }

    public /* synthetic */ CountryInfo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
