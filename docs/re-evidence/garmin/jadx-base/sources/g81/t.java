package g81;

import android.os.Parcel;
import android.os.Parcelable;
import com.mapbox.common.HttpHeaders;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lg81/t;", "Landroid/os/Parcelable;", "", "enduranceScore", "", HttpHeaders.AGE, "gender", "enduranceScoreClassification", "Ln61/d;", "enduranceScoreRanges", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ln61/d;)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t implements Parcelable {
    public static final Parcelable.Creator<t> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f76403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f76404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f76405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n61.d f76406e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<t> {
        @Override // android.os.Parcelable.Creator
        public final t createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new t(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), (n61.d) parcel.readParcelable(t.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final t[] newArray(int i14) {
            return new t[i14];
        }
    }

    static {
        Parcelable.Creator<n61.d> creator = n61.d.CREATOR;
    }

    public t(String str, Integer num, String str2, String str3, n61.d dVar) {
        this.f76402a = str;
        this.f76403b = num;
        this.f76404c = str2;
        this.f76405d = str3;
        this.f76406e = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return p005kotlin.jvm.internal.s.g(this.f76402a, tVar.f76402a) && p005kotlin.jvm.internal.s.g(this.f76403b, tVar.f76403b) && p005kotlin.jvm.internal.s.g(this.f76404c, tVar.f76404c) && p005kotlin.jvm.internal.s.g(this.f76405d, tVar.f76405d) && p005kotlin.jvm.internal.s.g(this.f76406e, tVar.f76406e);
    }

    public final int hashCode() {
        String str = this.f76402a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f76403b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f76404c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f76405d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        n61.d dVar = this.f76406e;
        return iHashCode4 + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = u0.n("EnduranceScoreHelpScreenUIState(enduranceScore=", this.f76403b, this.f76402a, ", age=", ", gender=");
        sn.a.t(sbN, this.f76404c, ", enduranceScoreClassification=", this.f76405d, ", enduranceScoreRanges=");
        sbN.append(this.f76406e);
        sbN.append(")");
        return sbN.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f76402a);
        Integer num = this.f76403b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.f76404c);
        parcel.writeString(this.f76405d);
        parcel.writeParcelable(this.f76406e, i14);
    }
}
