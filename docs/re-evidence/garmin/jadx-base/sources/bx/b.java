package bx;

import am.x0;
import am.z0;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.y;
import u62.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0018\b\u0002\u0010\u000f\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000b\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b\u0012\u0018\b\u0002\u0010\u0012\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000b\u0018\u00010\u000b¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b\u0019\u0010 R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R*\u0010\u000f\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000b\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010&\u001a\u0004\b)\u0010(R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010(R*\u0010\u0012\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000b\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010&\u001a\u0004\b,\u0010(¨\u0006-"}, d2 = {"Lbx/b;", "Landroid/os/Parcelable;", "Lhx/b;", "event", "", "activityName", "activityType", "", "activityId", "", "averageStress", "", "Lbx/k;", "stressValueDescriptorsDTOList", "", "stressValuesArray", "Lbx/h;", "bodyBatteryValueDescriptorDTOList", "bodyBatteryValuesArray", "<init>", "(Lhx/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "a", "Lhx/b;", IntegerTokenConverter.CONVERTER_KEY, "()Lhx/b;", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "g", "Ljava/lang/Long;", "()Ljava/lang/Long;", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Double;", "getAverageStress", "()Ljava/lang/Double;", "f", "Ljava/util/List;", "getStressValueDescriptorsDTOList", "()Ljava/util/List;", "getStressValuesArray", "h", "getBodyBatteryValueDescriptorDTOList", "getBodyBatteryValuesArray", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("event")
    private final hx.b event;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityName")
    private final String activityName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityType")
    private final String activityType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityId")
    private final Long activityId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageStress")
    private final Double averageStress;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("stressValueDescriptorsDTOList")
    private final List<k> stressValueDescriptorsDTOList;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("stressValuesArray")
    private final List<List<Object>> stressValuesArray;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("bodyBatteryValueDescriptorDTOList")
    private final List<h> bodyBatteryValueDescriptorDTOList;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("bodyBatteryValuesArray")
    private final List<List<Object>> bodyBatteryValuesArray;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            parcel.getClass();
            Class<b> cls = b.class;
            hx.b bVar = (hx.b) parcel.readParcelable(cls.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(k.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i15 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i15);
                for (int i16 = 0; i16 != i15; i16++) {
                    int i17 = parcel.readInt();
                    ArrayList arrayList6 = new ArrayList(i17);
                    for (int i18 = 0; i18 != i17; i18++) {
                        arrayList6.add(parcel.readValue(cls.getClassLoader()));
                    }
                    arrayList5.add(arrayList6);
                }
                arrayList2 = arrayList5;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i19 = parcel.readInt();
                arrayList3 = new ArrayList(i19);
                int iA2 = 0;
                while (iA2 != i19) {
                    iA2 = kg.f.a(h.CREATOR, parcel, arrayList3, iA2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i24 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i24);
                for (int i25 = 0; i25 != i24; i25++) {
                    int i26 = parcel.readInt();
                    ArrayList arrayList8 = new ArrayList(i26);
                    int i27 = 0;
                    while (true) {
                        Class<b> cls2 = cls;
                        if (i27 != i26) {
                            arrayList8.add(parcel.readValue(cls2.getClassLoader()));
                            i27++;
                            cls = cls2;
                        }
                    }
                    arrayList7.add(arrayList8);
                }
                arrayList4 = arrayList7;
            }
            return new b(bVar, string, string2, lValueOf, dValueOf, arrayList, arrayList2, arrayList3, arrayList4);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public /* synthetic */ b(hx.b bVar, String str, String str2, Long l14, Double d14, List list, List list2, List list3, List list4, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : bVar, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : l14, (i14 & 16) != 0 ? null : d14, (i14 & 32) != 0 ? null : list, (i14 & 64) != 0 ? null : list2, (i14 & 128) != 0 ? null : list3, (i14 & 256) != 0 ? null : list4);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getActivityId() {
        return this.activityId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getActivityName() {
        return this.activityName;
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
        return s.g(this.event, bVar.event) && s.g(this.activityName, bVar.activityName) && s.g(this.activityType, bVar.activityType) && s.g(this.activityId, bVar.activityId) && s.g(this.averageStress, bVar.averageStress) && s.g(this.stressValueDescriptorsDTOList, bVar.stressValueDescriptorsDTOList) && s.g(this.stressValuesArray, bVar.stressValuesArray) && s.g(this.bodyBatteryValueDescriptorDTOList, bVar.bodyBatteryValueDescriptorDTOList) && s.g(this.bodyBatteryValuesArray, bVar.bodyBatteryValuesArray);
    }

    public final x0 f() {
        x0 x0VarM;
        String str = this.activityType;
        return (str == null || (x0VarM = z0.m(str)) == null) ? x0.F : x0VarM;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getActivityType() {
        return this.activityType;
    }

    public final List<g> h() {
        List<List<Object>> list = this.bodyBatteryValuesArray;
        if (list == null) {
            return j0.f134944a;
        }
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List list2 = (List) it.next();
            Object obj = list2.get(0);
            Double d14 = null;
            Double d15 = obj instanceof Double ? (Double) obj : null;
            Long lValueOf = d15 != null ? Long.valueOf((long) d15.doubleValue()) : null;
            Object obj2 = list2.get(1);
            String str = obj2 instanceof String ? (String) obj2 : null;
            Object obj3 = list2.get(2);
            Double d16 = obj3 instanceof Double ? (Double) obj3 : null;
            Integer numValueOf = d16 != null ? Integer.valueOf((int) d16.doubleValue()) : null;
            Object obj4 = list2.get(3);
            if (obj4 instanceof Double) {
                d14 = (Double) obj4;
            }
            arrayList.add(new g(lValueOf, str, numValueOf, d14));
        }
        return arrayList;
    }

    public final int hashCode() {
        hx.b bVar = this.event;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        String str = this.activityName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.activityType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l14 = this.activityId;
        int iHashCode4 = (iHashCode3 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Double d14 = this.averageStress;
        int iHashCode5 = (iHashCode4 + (d14 == null ? 0 : d14.hashCode())) * 31;
        List<k> list = this.stressValueDescriptorsDTOList;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<List<Object>> list2 = this.stressValuesArray;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<h> list3 = this.bodyBatteryValueDescriptorDTOList;
        int iHashCode8 = (iHashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<List<Object>> list4 = this.bodyBatteryValuesArray;
        return iHashCode8 + (list4 != null ? list4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final hx.b getEvent() {
        return this.event;
    }

    public final List<j> j() {
        List<List<Object>> list = this.stressValuesArray;
        if (list == null) {
            return j0.f134944a;
        }
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List list2 = (List) it.next();
            Object obj = list2.get(0);
            Integer numValueOf = null;
            Double d14 = obj instanceof Double ? (Double) obj : null;
            Long lValueOf = d14 != null ? Long.valueOf((long) d14.doubleValue()) : null;
            Object obj2 = list2.get(1);
            Double d15 = obj2 instanceof Double ? (Double) obj2 : null;
            if (d15 != null) {
                numValueOf = Integer.valueOf((int) d15.doubleValue());
            }
            arrayList.add(new j(lValueOf, numValueOf));
        }
        return arrayList;
    }

    public final String toString() {
        hx.b bVar = this.event;
        String str = this.activityName;
        String str2 = this.activityType;
        Long l14 = this.activityId;
        Double d14 = this.averageStress;
        List<k> list = this.stressValueDescriptorsDTOList;
        List<List<Object>> list2 = this.stressValuesArray;
        List<h> list3 = this.bodyBatteryValueDescriptorDTOList;
        List<List<Object>> list4 = this.bodyBatteryValuesArray;
        StringBuilder sb3 = new StringBuilder("BodyBatteryEventDetailsDTO(event=");
        sb3.append(bVar);
        sb3.append(", activityName=");
        sb3.append(str);
        sb3.append(", activityType=");
        n23.j.q(l14, str2, ", activityId=", ", averageStress=", sb3);
        sb3.append(d14);
        sb3.append(", stressValueDescriptorsDTOList=");
        sb3.append(list);
        sb3.append(", stressValuesArray=");
        n23.j.z(sb3, list2, ", bodyBatteryValueDescriptorDTOList=", list3, ", bodyBatteryValuesArray=");
        return z.c(sb3, list4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeParcelable(this.event, i14);
        parcel.writeString(this.activityName);
        parcel.writeString(this.activityType);
        Long l14 = this.activityId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Double d14 = this.averageStress;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        List<k> list = this.stressValueDescriptorsDTOList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((k) itO.next()).writeToParcel(parcel, i14);
            }
        }
        List<List<Object>> list2 = this.stressValuesArray;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO2 = u0.o(parcel, list2, 1);
            while (itO2.hasNext()) {
                Iterator itE = kg.f.e((List) itO2.next(), parcel);
                while (itE.hasNext()) {
                    parcel.writeValue(itE.next());
                }
            }
        }
        List<h> list3 = this.bodyBatteryValueDescriptorDTOList;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO3 = u0.o(parcel, list3, 1);
            while (itO3.hasNext()) {
                ((h) itO3.next()).writeToParcel(parcel, i14);
            }
        }
        List<List<Object>> list4 = this.bodyBatteryValuesArray;
        if (list4 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO4 = u0.o(parcel, list4, 1);
        while (itO4.hasNext()) {
            Iterator itE2 = kg.f.e((List) itO4.next(), parcel);
            while (itE2.hasNext()) {
                parcel.writeValue(itE2.next());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(hx.b bVar, String str, String str2, Long l14, Double d14, List<k> list, List<? extends List<? extends Object>> list2, List<h> list3, List<? extends List<? extends Object>> list4) {
        this.event = bVar;
        this.activityName = str;
        this.activityType = str2;
        this.activityId = l14;
        this.averageStress = d14;
        this.stressValueDescriptorsDTOList = list;
        this.stressValuesArray = list2;
        this.bodyBatteryValueDescriptorDTOList = list3;
        this.bodyBatteryValuesArray = list4;
    }

    public b() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }
}
