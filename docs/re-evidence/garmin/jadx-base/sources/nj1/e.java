package nj1;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0012"}, d2 = {"Lnj1/e;", "Landroid/os/Parcelable;", "Lnj1/b;", "activityPrivacySettings", "profilePrivacySettings", "wellnessPrivacySettings", "<init>", "(Lnj1/b;Lnj1/b;Lnj1/b;)V", "a", "Lnj1/b;", "d", "()Lnj1/b;", "h", "(Lnj1/b;)V", "b", "getProfilePrivacySettings", "c", "getWellnessPrivacySettings", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityPrivacySettings")
    private b activityPrivacySettings;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profilePrivacySettings")
    private final b profilePrivacySettings;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("wellnessPrivacySettings")
    private final b wellnessPrivacySettings;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            parcel.getClass();
            Parcelable.Creator<b> creator = b.CREATOR;
            return new e(creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public e(b bVar, b bVar2, b bVar3) {
        bVar.getClass();
        bVar2.getClass();
        bVar3.getClass();
        this.activityPrivacySettings = bVar;
        this.profilePrivacySettings = bVar2;
        this.wellnessPrivacySettings = bVar3;
    }

    public final PrivacyType b() {
        return PrivacyType.Companion.b(PrivacyType.INSTANCE, this.activityPrivacySettings.getCategoryDetails().getCategoryAccessRule());
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b getActivityPrivacySettings() {
        return this.activityPrivacySettings;
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
        return s.g(this.activityPrivacySettings, eVar.activityPrivacySettings) && s.g(this.profilePrivacySettings, eVar.profilePrivacySettings) && s.g(this.wellnessPrivacySettings, eVar.wellnessPrivacySettings);
    }

    public final PrivacyType f() {
        return PrivacyType.Companion.b(PrivacyType.INSTANCE, this.profilePrivacySettings.getCategoryDetails().getCategoryAccessRule());
    }

    public final PrivacyType g() {
        return PrivacyType.Companion.b(PrivacyType.INSTANCE, this.wellnessPrivacySettings.getCategoryDetails().getCategoryAccessRule());
    }

    public final void h(b bVar) {
        this.activityPrivacySettings = bVar;
    }

    public final int hashCode() {
        return this.wellnessPrivacySettings.hashCode() + ((this.profilePrivacySettings.hashCode() + (this.activityPrivacySettings.hashCode() * 31)) * 31);
    }

    public final void i(PrivacyType privacyType) {
        privacyType.getClass();
        this.profilePrivacySettings.getCategoryDetails().f(privacyType.getCategoryAccessRule());
        Iterator<T> it = this.profilePrivacySettings.d().iterator();
        while (it.hasNext()) {
            ((d) it.next()).getSubcategoryDetails().d(privacyType.getCategoryAccessRule());
        }
    }

    public final void j(PrivacyType privacyType) {
        privacyType.getClass();
        this.wellnessPrivacySettings.getCategoryDetails().f(privacyType.getCategoryAccessRule());
        Iterator<T> it = this.wellnessPrivacySettings.d().iterator();
        while (it.hasNext()) {
            ((d) it.next()).getSubcategoryDetails().d(privacyType.getCategoryAccessRule());
        }
    }

    public final String toString() {
        return "UserPrivacyDto(activityPrivacySettings=" + this.activityPrivacySettings + ", profilePrivacySettings=" + this.profilePrivacySettings + ", wellnessPrivacySettings=" + this.wellnessPrivacySettings + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        this.activityPrivacySettings.writeToParcel(parcel, i14);
        this.profilePrivacySettings.writeToParcel(parcel, i14);
        this.wellnessPrivacySettings.writeToParcel(parcel, i14);
    }
}
