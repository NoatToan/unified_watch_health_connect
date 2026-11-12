package za1;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import com.github.mikephil.charting.data.Entry;
import ds.e0;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lza1/c;", "Landroid/os/Parcelable;", "", "minPowerTarget", "avgPowerTarget", "maxPowerTarget", "ftp", "", "totalDistance", "minElevation", "maxElevation", "", "Lcom/github/mikephil/charting/data/Entry;", "powerTargetEntries", "Lza1/a;", "elevationEntries", "Lcom/garmin/android/apps/connectmobile/settings/user/PowerZonesDTO;", "powerZonesDTO", "<init>", "(IIIIDDDLjava/util/List;Ljava/util/List;Lcom/garmin/android/apps/connectmobile/settings/user/PowerZonesDTO;)V", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f203288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f203289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f203290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f203291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f203292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f203293f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f203294g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<Entry> f203295h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<za1.a> f203296i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final PowerZonesDTO f203297j;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            int i15 = parcel.readInt();
            int i16 = parcel.readInt();
            int i17 = parcel.readInt();
            double d14 = parcel.readDouble();
            double d15 = parcel.readDouble();
            double d16 = parcel.readDouble();
            int i18 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i18);
            int iD = 0;
            while (iD != i18) {
                iD = u0.d(c.class, parcel, arrayList, iD, 1);
            }
            int i19 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i19);
            int iD2 = 0;
            while (iD2 != i19) {
                iD2 = u0.d(c.class, parcel, arrayList2, iD2, 1);
            }
            return new c(i14, i15, i16, i17, d14, d15, d16, arrayList, arrayList2, (PowerZonesDTO) parcel.readParcelable(c.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(int i14, int i15, int i16, int i17, double d14, double d15, double d16, List<? extends Entry> list, List<za1.a> list2, PowerZonesDTO powerZonesDTO) {
        list.getClass();
        list2.getClass();
        powerZonesDTO.getClass();
        this.f203288a = i14;
        this.f203289b = i15;
        this.f203290c = i16;
        this.f203291d = i17;
        this.f203292e = d14;
        this.f203293f = d15;
        this.f203294g = d16;
        this.f203295h = list;
        this.f203296i = list2;
        this.f203297j = powerZonesDTO;
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
        return this.f203288a == cVar.f203288a && this.f203289b == cVar.f203289b && this.f203290c == cVar.f203290c && this.f203291d == cVar.f203291d && Double.compare(this.f203292e, cVar.f203292e) == 0 && Double.compare(this.f203293f, cVar.f203293f) == 0 && Double.compare(this.f203294g, cVar.f203294g) == 0 && this.f203295h.equals(cVar.f203295h) && this.f203296i.equals(cVar.f203296i) && this.f203297j.equals(cVar.f203297j);
    }

    public final int hashCode() {
        return this.f203297j.hashCode() + u0.b(u0.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(q2.d(this.f203291d, q2.d(this.f203290c, q2.d(this.f203289b, Integer.hashCode(this.f203288a) * 31, 31), 31), 31), 31, this.f203292e), 31, this.f203293f), 31, this.f203294g), 31, this.f203295h), 31, this.f203296i);
    }

    public final String toString() {
        StringBuilder sbJ = e5.j(this.f203288a, this.f203289b, "PowerGuideChartData(minPowerTarget=", ", avgPowerTarget=", ", maxPowerTarget=");
        e0.m(this.f203290c, this.f203291d, ", ftp=", ", totalDistance=", sbJ);
        sbJ.append(this.f203292e);
        j.x(sbJ, ", minElevation=", this.f203293f, ", maxElevation=");
        sbJ.append(this.f203294g);
        sbJ.append(", powerTargetEntries=");
        sbJ.append(this.f203295h);
        sbJ.append(", elevationEntries=");
        sbJ.append(this.f203296i);
        sbJ.append(", powerZonesDTO=");
        sbJ.append(this.f203297j);
        sbJ.append(")");
        return sbJ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f203288a);
        parcel.writeInt(this.f203289b);
        parcel.writeInt(this.f203290c);
        parcel.writeInt(this.f203291d);
        parcel.writeDouble(this.f203292e);
        parcel.writeDouble(this.f203293f);
        parcel.writeDouble(this.f203294g);
        Iterator itE = kg.f.e(this.f203295h, parcel);
        while (itE.hasNext()) {
            parcel.writeParcelable((Parcelable) itE.next(), i14);
        }
        Iterator itE2 = kg.f.e(this.f203296i, parcel);
        while (itE2.hasNext()) {
            parcel.writeParcelable((Parcelable) itE2.next(), i14);
        }
        parcel.writeParcelable(this.f203297j, i14);
    }
}
