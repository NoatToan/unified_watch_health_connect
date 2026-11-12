package op0;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.hydration.model.HydrationContainersAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import f12.l;
import gg1.n;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kg.f;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.c0;
import p13.h0;
import tn.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lop0/c;", "Landroid/os/Parcelable;", "", "hydrationMeasurementUnit", "", "baseGoalInML", "", "hydrationAutoGoalEnabled", "", "Lop0/a;", "hydrationContainers", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/util/List;)V", "a", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "s", "(Ljava/lang/String;)V", "b", "Ljava/lang/Double;", "d", "()Ljava/lang/Double;", "m", "(Ljava/lang/Double;)V", "c", "Ljava/lang/Boolean;", "g", "()Ljava/lang/Boolean;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "(Ljava/lang/Boolean;)V", "Ljava/util/List;", "h", "()Ljava/util/List;", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "(Ljava/util/List;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hydrationMeasurementUnit")
    private String hydrationMeasurementUnit;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("baseGoalInML")
    private Double baseGoalInML;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hydrationAutoGoalEnabled")
    private Boolean hydrationAutoGoalEnabled;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hydrationContainers")
    @JsonAdapter(HydrationContainersAdapterFactory.class)
    private List<op0.a> hydrationContainers;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            parcel.getClass();
            String string = parcel.readString();
            ArrayList arrayList = null;
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            int iA = 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                while (iA != i14) {
                    iA = f.a(op0.a.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new c(string, dValueOf, boolValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Integer.valueOf(((op0.a) t7).getContainerId()), Integer.valueOf(((op0.a) t14).getContainerId()));
        }
    }

    public /* synthetic */ c(String str, Double d14, Boolean bool, List list, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : d14, (i14 & 4) != 0 ? null : bool, (i14 & 8) != 0 ? null : list);
    }

    public static c b(c cVar, ArrayList arrayList) {
        return new c(cVar.hydrationMeasurementUnit, cVar.baseGoalInML, cVar.hydrationAutoGoalEnabled, arrayList);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Double getBaseGoalInML() {
        return this.baseGoalInML;
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
        return s.g(this.hydrationMeasurementUnit, cVar.hydrationMeasurementUnit) && s.g(this.baseGoalInML, cVar.baseGoalInML) && s.g(this.hydrationAutoGoalEnabled, cVar.hydrationAutoGoalEnabled) && s.g(this.hydrationContainers, cVar.hydrationContainers);
    }

    public final op0.a f(int i14) {
        List<op0.a> list;
        if (i14 == 1) {
            List<op0.a> list2 = this.hydrationContainers;
            if (list2 != null) {
                return (op0.a) h0.e0(0, list2);
            }
            return null;
        }
        if (i14 != 2) {
            if (i14 == 3 && (list = this.hydrationContainers) != null) {
                return (op0.a) h0.e0(2, list);
            }
            return null;
        }
        List<op0.a> list3 = this.hydrationContainers;
        if (list3 != null) {
            return (op0.a) h0.e0(1, list3);
        }
        return null;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Boolean getHydrationAutoGoalEnabled() {
        return this.hydrationAutoGoalEnabled;
    }

    public final List<op0.a> h() {
        return this.hydrationContainers;
    }

    public final int hashCode() {
        String str = this.hydrationMeasurementUnit;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d14 = this.baseGoalInML;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Boolean bool = this.hydrationAutoGoalEnabled;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<op0.a> list = this.hydrationContainers;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final n i() {
        n.a aVar = n.f77276b;
        String str = this.hydrationMeasurementUnit;
        n nVarA1 = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).a1();
        aVar.getClass();
        return n.a.a(str, nVarA1);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getHydrationMeasurementUnit() {
        return this.hydrationMeasurementUnit;
    }

    public final boolean k() {
        return this.hydrationMeasurementUnit == null && this.baseGoalInML == null && this.hydrationAutoGoalEnabled == null && this.hydrationContainers == null;
    }

    public final void m(Double d14) {
        this.baseGoalInML = d14;
    }

    public final void o(op0.a aVar) {
        Object next;
        if (this.hydrationContainers == null) {
            this.hydrationContainers = new ArrayList();
        }
        List<op0.a> list = this.hydrationContainers;
        if (list != null) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((op0.a) next).getContainerId() != aVar.getContainerId());
            op0.a aVar2 = (op0.a) next;
            if (aVar2 != null) {
                list.remove(aVar2);
            }
            String name = aVar2 != null ? aVar2.getName() : null;
            if (name != null) {
                aVar.m(name);
            }
            list.add(aVar);
            if (list.size() > 1) {
                c0.u(list, new b());
            }
        }
    }

    public final void q(Boolean bool) {
        this.hydrationAutoGoalEnabled = bool;
    }

    public final void r(List<op0.a> list) {
        this.hydrationContainers = list;
    }

    public final void s(String str) {
        this.hydrationMeasurementUnit = str;
    }

    public final String toString() {
        return "HydrationSettingsDTO(hydrationMeasurementUnit=" + this.hydrationMeasurementUnit + ", baseGoalInML=" + this.baseGoalInML + ", hydrationAutoGoalEnabled=" + this.hydrationAutoGoalEnabled + ", hydrationContainers=" + this.hydrationContainers + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.hydrationMeasurementUnit);
        Double d14 = this.baseGoalInML;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Boolean bool = this.hydrationAutoGoalEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            k.m(parcel, 1, bool);
        }
        List<op0.a> list = this.hydrationContainers;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            ((op0.a) itO.next()).writeToParcel(parcel, i14);
        }
    }

    public c(String str, Double d14, Boolean bool, List<op0.a> list) {
        this.hydrationMeasurementUnit = str;
        this.baseGoalInML = d14;
        this.hydrationAutoGoalEnabled = bool;
        this.hydrationContainers = list;
    }

    public c() {
        this(null, null, null, null, 15, null);
    }
}
