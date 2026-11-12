package dh0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ldh0/d;", "Landroid/os/Parcelable;", "Ldh0/g;", "metricType", "", "value", "targetValue", "", "stale", "", "Ldh0/h;", "staleInputs", "Lorg/joda/time/LocalDate;", "lastMeasurementDate", "", "numOfWeeksForIm", "priority", "<init>", "(Ldh0/g;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/util/List;Lorg/joda/time/LocalDate;Ljava/lang/Integer;Ljava/lang/Integer;)V", "gcm-fitness-age_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f59564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f59565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f59566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f59567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<h> f59568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LocalDate f59569f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f59570g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f59571h;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            g gVarValueOf = g.valueOf(parcel.readString());
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    arrayList2.add(h.valueOf(parcel.readString()));
                }
                arrayList = arrayList2;
            }
            return new d(gVarValueOf, dValueOf, dValueOf2, boolValueOf, arrayList, (LocalDate) parcel.readSerializable(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public /* synthetic */ d(g gVar, Double d14, Double d15, Boolean bool, List list, LocalDate localDate, Integer num, Integer num2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(gVar, (i14 & 2) != 0 ? null : d14, (i14 & 4) != 0 ? null : d15, (i14 & 8) != 0 ? null : bool, (i14 & 16) != 0 ? null : list, (i14 & 32) != 0 ? null : localDate, (i14 & 64) != 0 ? null : num, (i14 & 128) != 0 ? null : num2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f59564a == dVar.f59564a && s.g(this.f59565b, dVar.f59565b) && s.g(this.f59566c, dVar.f59566c) && s.g(this.f59567d, dVar.f59567d) && s.g(this.f59568e, dVar.f59568e) && s.g(this.f59569f, dVar.f59569f) && s.g(this.f59570g, dVar.f59570g) && s.g(this.f59571h, dVar.f59571h);
    }

    public final int hashCode() {
        int iHashCode = this.f59564a.hashCode() * 31;
        Double d14 = this.f59565b;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f59566c;
        int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Boolean bool = this.f59567d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<h> list = this.f59568e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        LocalDate localDate = this.f59569f;
        int iHashCode6 = (iHashCode5 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        Integer num = this.f59570g;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f59571h;
        return iHashCode7 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FitnessAgeDetailsMetric(metricType=");
        sb3.append(this.f59564a);
        sb3.append(", value=");
        sb3.append(this.f59565b);
        sb3.append(", targetValue=");
        sb3.append(this.f59566c);
        sb3.append(", stale=");
        sb3.append(this.f59567d);
        sb3.append(", staleInputs=");
        sb3.append(this.f59568e);
        sb3.append(", lastMeasurementDate=");
        sb3.append(this.f59569f);
        sb3.append(", numOfWeeksForIm=");
        return b71.i.h(sb3, this.f59570g, ", priority=", this.f59571h, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f59564a.name());
        Double d14 = this.f59565b;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.f59566c;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Boolean bool = this.f59567d;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        List<h> list = this.f59568e;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                parcel.writeString(((h) itO.next()).name());
            }
        }
        parcel.writeSerializable(this.f59569f);
        Integer num = this.f59570g;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.f59571h;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(g gVar, Double d14, Double d15, Boolean bool, List<? extends h> list, LocalDate localDate, Integer num, Integer num2) {
        gVar.getClass();
        this.f59564a = gVar;
        this.f59565b = d14;
        this.f59566c = d15;
        this.f59567d = bool;
        this.f59568e = list;
        this.f59569f = localDate;
        this.f59570g = num;
        this.f59571h = num2;
    }
}
