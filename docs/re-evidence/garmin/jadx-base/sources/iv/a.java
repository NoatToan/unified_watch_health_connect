package iv;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg.f;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Liv/a;", "Landroid/os/Parcelable;", "", "applicationKey", "", "Liv/b;", "settingValues", "", "deviceId", "<init>", "(Ljava/lang/String;Ljava/util/List;J)V", "a", "Ljava/lang/String;", "getApplicationKey", "()Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "J", "getDeviceId", "()J", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C1820a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("applicationKey")
    private final String applicationKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("settingValues")
    private final List<b> settingValues;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceId")
    private final long deviceId;

    /* JADX INFO: renamed from: iv.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1820a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA = 0;
            while (iA != i14) {
                iA = f.a(b.CREATOR, parcel, arrayList, iA, 1);
            }
            return new a(string, arrayList, parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(String str, List<b> list, long j8) {
        str.getClass();
        list.getClass();
        this.applicationKey = str;
        this.settingValues = list;
        this.deviceId = j8;
    }

    public final List<b> b() {
        return this.settingValues;
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
        return s.g(this.applicationKey, aVar.applicationKey) && s.g(this.settingValues, aVar.settingValues) && this.deviceId == aVar.deviceId;
    }

    public final long getDeviceId() {
        return this.deviceId;
    }

    public final int hashCode() {
        return Long.hashCode(this.deviceId) + u0.b(this.applicationKey.hashCode() * 31, 31, this.settingValues);
    }

    public final String toString() {
        return j.i(this.deviceId, ")", l2.g("FavoriteActivities(applicationKey=", this.applicationKey, ", settingValues=", this.settingValues, ", deviceId="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.applicationKey);
        Iterator itE = f.e(this.settingValues, parcel);
        while (itE.hasNext()) {
            ((b) itE.next()).writeToParcel(parcel, i14);
        }
        parcel.writeLong(this.deviceId);
    }
}
