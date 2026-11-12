package xw1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lxw1/e;", "Landroid/os/Parcelable;", "", "coachId", "Lxw1/i;", "contentfulModel", "", "firstName", "lastName", "coachUrl", "imageUrl", "tagline", "<init>", "(Ljava/lang/Long;Lxw1/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "Lxw1/i;", "d", "()Lxw1/i;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("coachId")
    private final Long coachId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("contentfulModel")
    private final i contentfulModel;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f192366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f192367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f192368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f192369f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f192370g;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new e(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? i.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public /* synthetic */ e(Long l14, i iVar, String str, String str2, String str3, String str4, String str5, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : iVar, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? null : str3, (i14 & 32) != 0 ? null : str4, (i14 & 64) != 0 ? null : str5);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getCoachId() {
        return this.coachId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final i getContentfulModel() {
        return this.contentfulModel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.coachId, eVar.coachId) && s.g(this.contentfulModel, eVar.contentfulModel) && s.g(this.f192366c, eVar.f192366c) && s.g(this.f192367d, eVar.f192367d) && s.g(this.f192368e, eVar.f192368e) && s.g(this.f192369f, eVar.f192369f) && s.g(this.f192370g, eVar.f192370g);
    }

    public final int hashCode() {
        Long l14 = this.coachId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        i iVar = this.contentfulModel;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        String str = this.f192366c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f192367d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f192368e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f192369f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f192370g;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        Long l14 = this.coachId;
        i iVar = this.contentfulModel;
        String str = this.f192366c;
        String str2 = this.f192367d;
        String str3 = this.f192369f;
        String str4 = this.f192370g;
        StringBuilder sb3 = new StringBuilder("CoachDTO(coachId=");
        sb3.append(l14);
        sb3.append(", contentfulModel=");
        sb3.append(iVar);
        sb3.append(", firstName=");
        sn.a.t(sb3, str, ", lastName=", str2, ", coachUrl=");
        sn.a.t(sb3, this.f192368e, ", imageUrl=", str3, ", tagline=");
        return am.j.o(str4, ")", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.coachId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        i iVar = this.contentfulModel;
        if (iVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iVar.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.f192366c);
        parcel.writeString(this.f192367d);
        parcel.writeString(this.f192368e);
        parcel.writeString(this.f192369f);
        parcel.writeString(this.f192370g);
    }

    public e(Long l14, i iVar, String str, String str2, String str3, String str4, String str5) {
        this.coachId = l14;
        this.contentfulModel = iVar;
        this.f192366c = str;
        this.f192367d = str2;
        this.f192368e = str3;
        this.f192369f = str4;
        this.f192370g = str5;
    }

    public e() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
