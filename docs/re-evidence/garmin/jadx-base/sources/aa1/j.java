package aa1;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.f3;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Laa1/j;", "Landroid/os/Parcelable;", "", "title", "message", "", "iconResId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "gcm-personal-records_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f2303c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new j(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i14) {
            return new j[i14];
        }
    }

    public /* synthetic */ j(String str, String str2, Integer num, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? "" : str2, (i14 & 4) != 0 ? null : num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return s.g(this.f2301a, jVar.f2301a) && s.g(this.f2302b, jVar.f2302b) && s.g(this.f2303c, jVar.f2303c);
    }

    public final int hashCode() {
        int iJ = wr.g.j(this.f2301a.hashCode() * 31, 31, this.f2302b);
        Integer num = this.f2303c;
        return iJ + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return f3.i(p6.b.i("StepsPushesNoDataScreenState(title=", this.f2301a, ", message=", this.f2302b, ", iconResId="), this.f2303c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f2301a);
        parcel.writeString(this.f2302b);
        Integer num = this.f2303c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
    }

    public j(String str, String str2, Integer num) {
        str.getClass();
        str2.getClass();
        this.f2301a = str;
        this.f2302b = str2;
        this.f2303c = num;
    }

    public j() {
        this(null, null, null, 7, null);
    }
}
