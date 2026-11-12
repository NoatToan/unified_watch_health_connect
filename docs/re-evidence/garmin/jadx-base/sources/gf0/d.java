package gf0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import u62.z;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014¨\u0006\u0015"}, d2 = {"Lgf0/d;", "Landroid/os/Parcelable;", "", "sampleRate", "", "durationInSeconds", "", "samples", "<init>", "(Ljava/lang/Double;Ljava/lang/Integer;Ljava/util/List;)V", "a", "Ljava/lang/Double;", "getSampleRate", "()Ljava/lang/Double;", "b", "Ljava/lang/Integer;", "getDurationInSeconds", "()Ljava/lang/Integer;", "c", "Ljava/util/List;", "()Ljava/util/List;", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sampleRate")
    private final Double sampleRate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("durationInSeconds")
    private final Integer durationInSeconds;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("samples")
    private final List<Double> samples;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            ArrayList arrayList = null;
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    arrayList2.add(Double.valueOf(parcel.readDouble()));
                }
                arrayList = arrayList2;
            }
            return new d(dValueOf, numValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public /* synthetic */ d(Double d14, Integer num, List list, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : d14, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : list);
    }

    public final List<Double> b() {
        return this.samples;
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
        return s.g(this.sampleRate, dVar.sampleRate) && s.g(this.durationInSeconds, dVar.durationInSeconds) && s.g(this.samples, dVar.samples);
    }

    public final int hashCode() {
        Double d14 = this.sampleRate;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        Integer num = this.durationInSeconds;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<Double> list = this.samples;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        Double d14 = this.sampleRate;
        Integer num = this.durationInSeconds;
        List<Double> list = this.samples;
        StringBuilder sb3 = new StringBuilder("EcgReadingDto(sampleRate=");
        sb3.append(d14);
        sb3.append(", durationInSeconds=");
        sb3.append(num);
        sb3.append(", samples=");
        return z.c(sb3, list, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Double d14 = this.sampleRate;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Integer num = this.durationInSeconds;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        List<Double> list = this.samples;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            parcel.writeDouble(((Number) itO.next()).doubleValue());
        }
    }

    public d(Double d14, Integer num, List<Double> list) {
        this.sampleRate = d14;
        this.durationInSeconds = num;
        this.samples = list;
    }

    public d() {
        this(null, null, null, 7, null);
    }
}
