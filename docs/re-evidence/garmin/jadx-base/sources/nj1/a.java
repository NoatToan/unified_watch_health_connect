package nj1;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import q6.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lnj1/a;", "Landroid/os/Parcelable;", "", "categoryAccessRule", "", "inheritedFromDefault", "updatedTimestampGMT", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "f", "(Ljava/lang/String;)V", "b", "Z", "getInheritedFromDefault", "()Z", "c", "getUpdatedTimestampGMT", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C2427a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("categoryAccessRule")
    private String categoryAccessRule;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("inheritedFromDefault")
    private final boolean inheritedFromDefault;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("updatedTimestampGMT")
    private final String updatedTimestampGMT;

    /* JADX INFO: renamed from: nj1.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2427a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(String str, boolean z14, String str2) {
        str.getClass();
        this.categoryAccessRule = str;
        this.inheritedFromDefault = z14;
        this.updatedTimestampGMT = str2;
    }

    public static a b(a aVar) {
        String str = aVar.categoryAccessRule;
        boolean z14 = aVar.inheritedFromDefault;
        String str2 = aVar.updatedTimestampGMT;
        aVar.getClass();
        str.getClass();
        return new a(str, z14, str2);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCategoryAccessRule() {
        return this.categoryAccessRule;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.categoryAccessRule, aVar.categoryAccessRule) && this.inheritedFromDefault == aVar.inheritedFromDefault && s.g(this.updatedTimestampGMT, aVar.updatedTimestampGMT);
    }

    public final void f(String str) {
        str.getClass();
        this.categoryAccessRule = str;
    }

    public final int hashCode() {
        int iG = f.g(this.categoryAccessRule.hashCode() * 31, 31, this.inheritedFromDefault);
        String str = this.updatedTimestampGMT;
        return iG + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return j.o(this.updatedTimestampGMT, ")", zl.a.d("CategoryDetailsDto(categoryAccessRule=", this.categoryAccessRule, ", inheritedFromDefault=", this.inheritedFromDefault, ", updatedTimestampGMT="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.categoryAccessRule);
        parcel.writeInt(this.inheritedFromDefault ? 1 : 0);
        parcel.writeString(this.updatedTimestampGMT);
    }
}
