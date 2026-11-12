package nj1;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg.f;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lnj1/b;", "Landroid/os/Parcelable;", "Lnj1/a;", "categoryDetails", "", "Lnj1/d;", "subcategoryPrivacySettings", "<init>", "(Lnj1/a;Ljava/util/List;)V", "a", "Lnj1/a;", "b", "()Lnj1/a;", "Ljava/util/List;", "d", "()Ljava/util/List;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("categoryDetails")
    private final nj1.a categoryDetails;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("subcategoryPrivacySettings")
    private final List<d> subcategoryPrivacySettings;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            nj1.a aVarCreateFromParcel = nj1.a.CREATOR.createFromParcel(parcel);
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA = 0;
            while (iA != i14) {
                iA = f.a(d.CREATOR, parcel, arrayList, iA, 1);
            }
            return new b(aVarCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(nj1.a aVar, List<d> list) {
        aVar.getClass();
        list.getClass();
        this.categoryDetails = aVar;
        this.subcategoryPrivacySettings = list;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final nj1.a getCategoryDetails() {
        return this.categoryDetails;
    }

    public final List<d> d() {
        return this.subcategoryPrivacySettings;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.categoryDetails, bVar.categoryDetails) && s.g(this.subcategoryPrivacySettings, bVar.subcategoryPrivacySettings);
    }

    public final void f(PrivacyType privacyType) {
        this.categoryDetails.f(privacyType.getCategoryAccessRule());
        Iterator<T> it = this.subcategoryPrivacySettings.iterator();
        while (it.hasNext()) {
            ((d) it.next()).getSubcategoryDetails().d(privacyType.getCategoryAccessRule());
        }
    }

    public final int hashCode() {
        return this.subcategoryPrivacySettings.hashCode() + (this.categoryDetails.hashCode() * 31);
    }

    public final String toString() {
        return "PrivacySettingsDto(categoryDetails=" + this.categoryDetails + ", subcategoryPrivacySettings=" + this.subcategoryPrivacySettings + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        this.categoryDetails.writeToParcel(parcel, i14);
        Iterator itE = f.e(this.subcategoryPrivacySettings, parcel);
        while (itE.hasNext()) {
            ((d) itE.next()).writeToParcel(parcel, i14);
        }
    }
}
