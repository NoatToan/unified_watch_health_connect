package sn;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import d53.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\rBA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0016\u0010\n\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R*\u0010\n\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, d2 = {"Lsn/b;", "Landroid/os/Parcelable;", "", "userProfilePK", "", "activityUuid", "", "Lsn/e;", "epochDescriptorDTOList", "", "epochArray", "<init>", "(JLjava/lang/String;Ljava/util/List;Ljava/util/List;)V", "a", "J", "getUserProfilePK", "()J", "b", "Ljava/lang/String;", "getActivityUuid", "()Ljava/lang/String;", "c", "Ljava/util/List;", "getEpochDescriptorDTOList", "()Ljava/util/List;", "d", "getEpochArray", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePK")
    private final long userProfilePK;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityUuid")
    private final String activityUuid;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("epochDescriptorDTOList")
    private final List<e> epochDescriptorDTOList;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("epochArray")
    private final List<List<Double>> epochArray;

    /* JADX INFO: renamed from: sn.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3029b implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            long j8 = parcel.readLong();
            String string = parcel.readString();
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(e.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i15 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i15);
                for (int i16 = 0; i16 != i15; i16++) {
                    int i17 = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(i17);
                    for (int i18 = 0; i18 != i17; i18++) {
                        arrayList4.add(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
                    }
                    arrayList3.add(arrayList4);
                }
                arrayList2 = arrayList3;
            }
            return new b(j8, string, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new C3029b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(long j8, String str, List<e> list, List<? extends List<Double>> list2) {
        this.userProfilePK = j8;
        this.activityUuid = str;
        this.epochDescriptorDTOList = list;
        this.epochArray = list2;
    }

    public final ArrayList b(String str) {
        Object next;
        Object next2;
        d dVar;
        List<e> list = this.epochDescriptorDTOList;
        if (list != null && this.epochArray != null && !list.isEmpty() && !this.epochArray.isEmpty()) {
            Iterator<T> it = this.epochDescriptorDTOList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!u.q(((e) next).getCh.qos.logback.core.joran.action.Action.KEY_ATTRIBUTE java.lang.String(), "timestamp", true));
            e eVar = (e) next;
            Iterator<T> it3 = this.epochDescriptorDTOList.iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
            } while (!u.q(((e) next2).getCh.qos.logback.core.joran.action.Action.KEY_ATTRIBUTE java.lang.String(), str, true));
            e eVar2 = (e) next2;
            if (eVar != null && eVar2 != null) {
                int index = eVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String();
                int index2 = eVar2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String();
                List<List<Double>> list2 = this.epochArray;
                ArrayList arrayList = new ArrayList();
                Iterator<T> it4 = list2.iterator();
                while (it4.hasNext()) {
                    List list3 = (List) it4.next();
                    Double d14 = (Double) h0.e0(index, list3);
                    Double d15 = (Double) h0.e0(index2, list3);
                    if (d14 != null) {
                        dVar = new d((long) d14.doubleValue(), d15 != null ? Float.valueOf((float) d15.doubleValue()) : null);
                    } else {
                        dVar = null;
                    }
                    if (dVar != null) {
                        arrayList.add(dVar);
                    }
                }
                return arrayList;
            }
        }
        return null;
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
        return this.userProfilePK == bVar.userProfilePK && s.g(this.activityUuid, bVar.activityUuid) && s.g(this.epochDescriptorDTOList, bVar.epochDescriptorDTOList) && s.g(this.epochArray, bVar.epochArray);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.userProfilePK) * 31;
        String str = this.activityUuid;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<e> list = this.epochDescriptorDTOList;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<List<Double>> list2 = this.epochArray;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        long j8 = this.userProfilePK;
        String str = this.activityUuid;
        List<e> list = this.epochDescriptorDTOList;
        List<List<Double>> list2 = this.epochArray;
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(j8, "ActivityChartDataDTO(userProfilePK=", ", activityUuid=", str);
        sbK.append(", epochDescriptorDTOList=");
        sbK.append(list);
        sbK.append(", epochArray=");
        sbK.append(list2);
        sbK.append(")");
        return sbK.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.userProfilePK);
        parcel.writeString(this.activityUuid);
        List<e> list = this.epochDescriptorDTOList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((e) itO.next()).writeToParcel(parcel, i14);
            }
        }
        List<List<Double>> list2 = this.epochArray;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO2 = u0.o(parcel, list2, 1);
        while (itO2.hasNext()) {
            Iterator itE = kg.f.e((List) itO2.next(), parcel);
            while (itE.hasNext()) {
                Double d14 = (Double) itE.next();
                if (d14 == null) {
                    parcel.writeInt(0);
                } else {
                    sn.a.m(parcel, 1, d14);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lsn/b$a;", "", "<init>", "()V", "", "TIMESTAMP", "Ljava/lang/String;", "HEART_RATE", "STRESS", "SPO_2", "RESPIRATION", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
