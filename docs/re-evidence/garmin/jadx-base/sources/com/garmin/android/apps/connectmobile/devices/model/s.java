package com.garmin.android.apps.connectmobile.devices.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/s;", "Landroid/os/Parcelable;", "", "garminCdnUrl", "", "numOfDevices", "cacheRefreshDate", "", "Lcom/garmin/android/apps/connectmobile/devices/model/l;", "devices", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V", "a", "Ljava/lang/String;", "getGarminCdnUrl", "()Ljava/lang/String;", "b", "Ljava/lang/Integer;", "getNumOfDevices", "()Ljava/lang/Integer;", "c", "getCacheRefreshDate", "d", "Ljava/util/List;", "()Ljava/util/List;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class s implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("garminCdnUrl")
    private final String garminCdnUrl;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("numOfDevices")
    private final Integer numOfDevices;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cacheRefreshDate")
    private final String cacheRefreshDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("devices")
    private final List<l> devices;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<s> {
        @Override // android.os.Parcelable.Creator
        public final s createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            ArrayList arrayList = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(l.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new s(string, numValueOf, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final s[] newArray(int i14) {
            return new s[i14];
        }
    }

    public /* synthetic */ s(String str, Integer num, String str2, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : list);
    }

    public final l b(long j8, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                List<l> list = this.devices;
                if (list != null) {
                    arrayList2 = new ArrayList();
                    for (Object obj : list) {
                        if (((l) obj).getApplicationKey().equals(str)) {
                            arrayList2.add(obj);
                        }
                    }
                } else {
                    arrayList2 = null;
                }
                l lVar = (arrayList2 == null || arrayList2.isEmpty()) ? null : (l) h0.b0(arrayList2);
                if (lVar != null) {
                    return lVar;
                }
            }
        }
        List<l> list2 = this.devices;
        if (list2 != null) {
            arrayList = new ArrayList();
            for (Object obj2 : list2) {
                Long fitProductNumber = ((l) obj2).getFitProductNumber();
                if (fitProductNumber != null && fitProductNumber.longValue() == j8) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (l) h0.b0(arrayList);
    }

    public final List<l> d() {
        return this.devices;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return p005kotlin.jvm.internal.s.g(this.garminCdnUrl, sVar.garminCdnUrl) && p005kotlin.jvm.internal.s.g(this.numOfDevices, sVar.numOfDevices) && p005kotlin.jvm.internal.s.g(this.cacheRefreshDate, sVar.cacheRefreshDate) && p005kotlin.jvm.internal.s.g(this.devices, sVar.devices);
    }

    public final int hashCode() {
        String str = this.garminCdnUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.numOfDevices;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.cacheRefreshDate;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<l> list = this.devices;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String str = this.garminCdnUrl;
        Integer num = this.numOfDevices;
        String str2 = this.cacheRefreshDate;
        List<l> list = this.devices;
        StringBuilder sbN = u0.n("DevicesDTO(garminCdnUrl=", num, str, ", numOfDevices=", ", cacheRefreshDate=");
        sbN.append(str2);
        sbN.append(", devices=");
        sbN.append(list);
        sbN.append(")");
        return sbN.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.garminCdnUrl);
        Integer num = this.numOfDevices;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.cacheRefreshDate);
        List<l> list = this.devices;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            ((l) itO.next()).writeToParcel(parcel, i14);
        }
    }

    public s(String str, Integer num, String str2, List<l> list) {
        this.garminCdnUrl = str;
        this.numOfDevices = num;
        this.cacheRefreshDate = str2;
        this.devices = list;
    }

    public s() {
        this(null, null, null, null, 15, null);
    }
}
