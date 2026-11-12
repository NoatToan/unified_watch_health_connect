package g81;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lg81/w;", "Landroid/os/Parcelable;", "", "axisMinimum", "axisMaximum", "", "xAxisFormat", "Li53/d;", "Lorg/joda/time/LocalDate;", "Lg81/o;", "contributors", "", "colorMap", "<init>", "(FFLjava/lang/String;Li53/d;Li53/d;)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class w implements Parcelable {
    public static final Parcelable.Creator<w> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f76412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f76413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f76414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.d<LocalDate, o> f76415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i53.d<String, Integer> f76416e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<w> {
        @Override // android.os.Parcelable.Creator
        public final w createFromParcel(Parcel parcel) {
            parcel.getClass();
            float f14 = parcel.readFloat();
            float f15 = parcel.readFloat();
            String string = parcel.readString();
            int i14 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                linkedHashMap.put(parcel.readSerializable(), o.CREATOR.createFromParcel(parcel));
            }
            i53.g gVarK = i53.a.k(linkedHashMap);
            int i16 = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(i16);
            for (int i17 = 0; i17 != i16; i17++) {
                linkedHashMap2.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
            }
            return new w(f14, f15, string, gVarK, i53.a.k(linkedHashMap2));
        }

        @Override // android.os.Parcelable.Creator
        public final w[] newArray(int i14) {
            return new w[i14];
        }
    }

    public w(float f14, float f15, String str, i53.d<LocalDate, o> dVar, i53.d<String, Integer> dVar2) {
        str.getClass();
        dVar.getClass();
        dVar2.getClass();
        this.f76412a = f14;
        this.f76413b = f15;
        this.f76414c = str;
        this.f76415d = dVar;
        this.f76416e = dVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Float.compare(this.f76412a, wVar.f76412a) == 0 && Float.compare(this.f76413b, wVar.f76413b) == 0 && this.f76414c.equals(wVar.f76414c) && this.f76415d.equals(wVar.f76415d) && this.f76416e.equals(wVar.f76416e);
    }

    public final int hashCode() {
        return this.f76416e.hashCode() + l2.b(this.f76415d, wr.g.j(q6.f.d(this.f76413b, Float.hashCode(this.f76412a) * 31, 31), 31, this.f76414c), 31);
    }

    public final String toString() {
        StringBuilder sbI = v.e0.i("EnduranceScoreTopContributorChartState(axisMinimum=", this.f76412a, ", axisMaximum=", this.f76413b, ", xAxisFormat=");
        sbI.append(this.f76414c);
        sbI.append(", contributors=");
        sbI.append(this.f76415d);
        sbI.append(", colorMap=");
        sbI.append(this.f76416e);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeFloat(this.f76412a);
        parcel.writeFloat(this.f76413b);
        parcel.writeString(this.f76414c);
        i53.d<LocalDate, o> dVar = this.f76415d;
        parcel.writeInt(dVar.size());
        for (Map.Entry entry : (i53.e) dVar.entrySet()) {
            parcel.writeSerializable((Serializable) entry.getKey());
            ((o) entry.getValue()).writeToParcel(parcel, i14);
        }
        i53.d<String, Integer> dVar2 = this.f76416e;
        parcel.writeInt(dVar2.size());
        for (Map.Entry entry2 : (i53.e) dVar2.entrySet()) {
            parcel.writeString((String) entry2.getKey());
            parcel.writeInt(((Number) entry2.getValue()).intValue());
        }
    }
}
