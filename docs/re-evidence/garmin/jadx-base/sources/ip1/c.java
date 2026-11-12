package ip1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lip1/c;", "Landroid/os/Parcelable;", "Lip1/b;", "deviceSolarInput", "", "Lip1/a;", "activities", "<init>", "(Lip1/b;Ljava/util/List;)V", "a", "Lip1/b;", "d", "()Lip1/b;", "b", "Ljava/util/List;", "()Ljava/util/List;", "gcm-solar-charge_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceSolarInput")
    private final b deviceSolarInput;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activitySummary")
    private final List<ip1.a> activities;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            ArrayList arrayList = null;
            b bVarCreateFromParcel = parcel.readInt() == 0 ? null : b.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(ip1.a.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new c(bVarCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public c(b bVar, List<ip1.a> list) {
        this.deviceSolarInput = bVar;
        this.activities = list;
    }

    public final List<ip1.a> b() {
        return this.activities;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b getDeviceSolarInput() {
        return this.deviceSolarInput;
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
        return s.g(this.deviceSolarInput, cVar.deviceSolarInput) && s.g(this.activities, cVar.activities);
    }

    public final int hashCode() {
        b bVar = this.deviceSolarInput;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        List<ip1.a> list = this.activities;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "EdgeSolarChargeDTO(deviceSolarInput=" + this.deviceSolarInput + ", activities=" + this.activities + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        b bVar = this.deviceSolarInput;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bVar.writeToParcel(parcel, i14);
        }
        List<ip1.a> list = this.activities;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            ((ip1.a) itO.next()).writeToParcel(parcel, i14);
        }
    }
}
