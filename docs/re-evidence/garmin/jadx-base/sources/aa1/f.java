package aa1;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Laa1/f;", "Landroid/os/Parcelable;", "Lq91/d;", "personalRecordType", "", "isSelected", "", "iconResId", "", "title", "titleContentDescription", "<init>", "(Lq91/d;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "gcm-personal-records_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q91.d f2270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f2272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2274e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new f((q91.d) parcel.readParcelable(f.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    public /* synthetic */ f(q91.d dVar, boolean z14, Integer num, String str, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(dVar, z14, (i14 & 4) != 0 ? null : num, (i14 & 8) != 0 ? null : str, (i14 & 16) != 0 ? null : str2);
    }

    public static f b(f fVar, boolean z14) {
        q91.d dVar = fVar.f2270a;
        Integer num = fVar.f2272c;
        String str = fVar.f2273d;
        String str2 = fVar.f2274e;
        dVar.getClass();
        return new f(dVar, z14, num, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f2270a == fVar.f2270a && this.f2271b == fVar.f2271b && s.g(this.f2272c, fVar.f2272c) && s.g(this.f2273d, fVar.f2273d) && s.g(this.f2274e, fVar.f2274e);
    }

    public final int hashCode() {
        int iG = q6.f.g(this.f2270a.hashCode() * 31, 31, this.f2271b);
        Integer num = this.f2272c;
        int iHashCode = (iG + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f2273d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f2274e;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PersonalRecordTypeEditState(personalRecordType=");
        sb3.append(this.f2270a);
        sb3.append(", isSelected=");
        sb3.append(this.f2271b);
        sb3.append(", iconResId=");
        p6.b.l(this.f2272c, ", title=", this.f2273d, ", titleContentDescription=", sb3);
        return am.j.o(this.f2274e, ")", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeParcelable(this.f2270a, i14);
        parcel.writeInt(this.f2271b ? 1 : 0);
        Integer num = this.f2272c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.f2273d);
        parcel.writeString(this.f2274e);
    }

    public f(q91.d dVar, boolean z14, Integer num, String str, String str2) {
        dVar.getClass();
        this.f2270a = dVar;
        this.f2271b = z14;
        this.f2272c = num;
        this.f2273d = str;
        this.f2274e = str2;
    }
}
