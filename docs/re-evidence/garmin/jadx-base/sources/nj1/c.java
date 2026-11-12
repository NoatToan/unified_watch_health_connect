package nj1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import q6.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u0015\u0010\r¨\u0006\u0016"}, d2 = {"Lnj1/c;", "Landroid/os/Parcelable;", "", "accessRule", "", "inheritedFromCategory", "inheritedFromDefault", "updatedTimestampGMT", "<init>", "(Ljava/lang/String;ZZLjava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "d", "(Ljava/lang/String;)V", "Z", "getInheritedFromCategory", "()Z", "c", "getInheritedFromDefault", "getUpdatedTimestampGMT", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("accessRule")
    private String accessRule;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("inheritedFromCategory")
    private final boolean inheritedFromCategory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("inheritedFromDefault")
    private final boolean inheritedFromDefault;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("updatedTimestampGMT")
    private final String updatedTimestampGMT;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public c(String str, boolean z14, boolean z15, String str2) {
        str.getClass();
        this.accessRule = str;
        this.inheritedFromCategory = z14;
        this.inheritedFromDefault = z15;
        this.updatedTimestampGMT = str2;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAccessRule() {
        return this.accessRule;
    }

    public final void d(String str) {
        str.getClass();
        this.accessRule = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.accessRule, cVar.accessRule) && this.inheritedFromCategory == cVar.inheritedFromCategory && this.inheritedFromDefault == cVar.inheritedFromDefault && s.g(this.updatedTimestampGMT, cVar.updatedTimestampGMT);
    }

    public final int hashCode() {
        int iG = f.g(f.g(this.accessRule.hashCode() * 31, 31, this.inheritedFromCategory), 31, this.inheritedFromDefault);
        String str = this.updatedTimestampGMT;
        return iG + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.accessRule;
        boolean z14 = this.inheritedFromCategory;
        boolean z15 = this.inheritedFromDefault;
        String str2 = this.updatedTimestampGMT;
        StringBuilder sbD = zl.a.d("SubcategoryDetailsDto(accessRule=", str, ", inheritedFromCategory=", z14, ", inheritedFromDefault=");
        sbD.append(z15);
        sbD.append(", updatedTimestampGMT=");
        sbD.append(str2);
        sbD.append(")");
        return sbD.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.accessRule);
        parcel.writeInt(this.inheritedFromCategory ? 1 : 0);
        parcel.writeInt(this.inheritedFromDefault ? 1 : 0);
        parcel.writeString(this.updatedTimestampGMT);
    }
}
