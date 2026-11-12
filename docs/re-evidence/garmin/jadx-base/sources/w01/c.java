package w01;

import android.os.Parcel;
import android.os.Parcelable;
import b71.i;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lw01/c;", "Landroid/os/Parcelable;", "Lw01/b;", "nutritionAndHydrationDTO", "Lw01/e;", "nutritionUnit", "Lq22/b;", "hydrationUnit", "", "intensity", "", "powerGuideId", "", "powerGuideEstimatedDurationHigh", "", "eventTemperature", "eventFeelsLikeTemperature", "La01/a;", "weatherType", "", "hasWeatherError", "<init>", "(Lw01/b;Lw01/e;Lq22/b;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Float;Ljava/lang/Double;Ljava/lang/Double;La01/a;Z)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f181027k = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f181028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f181029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q22.b f181030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f181031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f181032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Float f181033f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f181034g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Double f181035h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a01.a f181036i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f181037j;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel.readInt() == 0 ? null : b.CREATOR.createFromParcel(parcel), e.valueOf(parcel.readString()), q22.b.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? a01.a.valueOf(parcel.readString()) : null, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public /* synthetic */ c(b bVar, e eVar, q22.b bVar2, Integer num, Long l14, Float f14, Double d14, Double d15, a01.a aVar, boolean z14, int i14, j jVar) {
        this(bVar, eVar, bVar2, (i14 & 8) != 0 ? null : num, (i14 & 16) != 0 ? null : l14, (i14 & 32) != 0 ? null : f14, (i14 & 64) != 0 ? null : d14, (i14 & 128) != 0 ? null : d15, (i14 & 256) != 0 ? null : aVar, (i14 & 512) != 0 ? false : z14);
    }

    public static c b(c cVar, Integer num, Long l14, Float f14, Double d14, a01.a aVar, int i14) {
        b bVar = cVar.f181028a;
        e eVar = cVar.f181029b;
        q22.b bVar2 = cVar.f181030c;
        if ((i14 & 8) != 0) {
            num = cVar.f181031d;
        }
        Integer num2 = num;
        if ((i14 & 16) != 0) {
            l14 = cVar.f181032e;
        }
        Long l15 = l14;
        if ((i14 & 32) != 0) {
            f14 = cVar.f181033f;
        }
        Float f15 = f14;
        Double d15 = cVar.f181034g;
        Double d16 = (i14 & 128) != 0 ? cVar.f181035h : d14;
        a01.a aVar2 = (i14 & 256) != 0 ? cVar.f181036i : aVar;
        boolean z14 = cVar.f181037j;
        cVar.getClass();
        eVar.getClass();
        bVar2.getClass();
        return new c(bVar, eVar, bVar2, num2, l15, f15, d15, d16, aVar2, z14);
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
        return s.g(this.f181028a, cVar.f181028a) && this.f181029b == cVar.f181029b && this.f181030c == cVar.f181030c && s.g(this.f181031d, cVar.f181031d) && s.g(this.f181032e, cVar.f181032e) && s.g(this.f181033f, cVar.f181033f) && s.g(this.f181034g, cVar.f181034g) && s.g(this.f181035h, cVar.f181035h) && this.f181036i == cVar.f181036i && this.f181037j == cVar.f181037j;
    }

    public final int hashCode() {
        b bVar = this.f181028a;
        int iHashCode = (this.f181030c.hashCode() + ((this.f181029b.hashCode() + ((bVar == null ? 0 : bVar.hashCode()) * 31)) * 31)) * 31;
        Integer num = this.f181031d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l14 = this.f181032e;
        int iHashCode3 = (iHashCode2 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Float f14 = this.f181033f;
        int iHashCode4 = (iHashCode3 + (f14 == null ? 0 : f14.hashCode())) * 31;
        Double d14 = this.f181034g;
        int iHashCode5 = (iHashCode4 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f181035h;
        int iHashCode6 = (iHashCode5 + (d15 == null ? 0 : d15.hashCode())) * 31;
        a01.a aVar = this.f181036i;
        return Boolean.hashCode(this.f181037j) + ((iHashCode6 + (aVar != null ? aVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        b bVar = this.f181028a;
        e eVar = this.f181029b;
        q22.b bVar2 = this.f181030c;
        Integer num = this.f181031d;
        Long l14 = this.f181032e;
        Float f14 = this.f181033f;
        a01.a aVar = this.f181036i;
        StringBuilder sb3 = new StringBuilder("NutritionAndHydrationDetails(nutritionAndHydrationDTO=");
        sb3.append(bVar);
        sb3.append(", nutritionUnit=");
        sb3.append(eVar);
        sb3.append(", hydrationUnit=");
        sb3.append(bVar2);
        sb3.append(", intensity=");
        sb3.append(num);
        sb3.append(", powerGuideId=");
        sb3.append(l14);
        sb3.append(", powerGuideEstimatedDurationHigh=");
        sb3.append(f14);
        sb3.append(", eventTemperature=");
        i.p(this.f181034g, this.f181035h, ", eventFeelsLikeTemperature=", ", weatherType=", sb3);
        sb3.append(aVar);
        sb3.append(", hasWeatherError=");
        sb3.append(this.f181037j);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        b bVar = this.f181028a;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bVar.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.f181029b.name());
        parcel.writeString(this.f181030c.name());
        Integer num = this.f181031d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Long l14 = this.f181032e;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Float f14 = this.f181033f;
        if (f14 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f14.floatValue());
        }
        Double d14 = this.f181034g;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.f181035h;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        a01.a aVar = this.f181036i;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(aVar.name());
        }
        parcel.writeInt(this.f181037j ? 1 : 0);
    }

    public c(b bVar, e eVar, q22.b bVar2, Integer num, Long l14, Float f14, Double d14, Double d15, a01.a aVar, boolean z14) {
        eVar.getClass();
        bVar2.getClass();
        this.f181028a = bVar;
        this.f181029b = eVar;
        this.f181030c = bVar2;
        this.f181031d = num;
        this.f181032e = l14;
        this.f181033f = f14;
        this.f181034g = d14;
        this.f181035h = d15;
        this.f181036i = aVar;
        this.f181037j = z14;
    }
}
