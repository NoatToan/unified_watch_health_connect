package p71;

import a61.i0;
import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import lc.u0;
import n71.g;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.a1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"Lp71/d;", "Lp71/f;", "Ln71/g;", "stringHandle", "", "Lzw1/a;", "muscles", "<init>", "(Ln71/g;Ljava/util/Set;)V", "muscle", "(Lzw1/a;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements f {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f136309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<zw1.a> f136310b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            g gVar = (g) parcel.readParcelable(d.class.getClassLoader());
            int i14 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                linkedHashSet.add(zw1.a.valueOf(parcel.readString()));
            }
            return new d(gVar, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d(zw1.a aVar) {
        int i14;
        aVar.getClass();
        switch (e.f136311a[aVar.ordinal()]) {
            case 1:
                i14 = R.string.lbl_muscles_abs;
                break;
            case 2:
                i14 = R.string.lbl_muscles_biceps;
                break;
            case 3:
                i14 = R.string.lbl_muscles_calves;
                break;
            case 4:
                i14 = R.string.lbl_muscles_chest;
                break;
            case 5:
                i14 = R.string.lbl_muscles_forearms;
                break;
            case 6:
                i14 = R.string.lbl_muscles_glutes;
                break;
            case 7:
                i14 = R.string.lbl_muscles_hamstrings;
                break;
            case 8:
                i14 = R.string.lbl_muscles_hip_abductors;
                break;
            case 9:
                i14 = R.string.lbl_muscles_hip_adductors;
                break;
            case 10:
                i14 = R.string.lbl_muscles_hip_flexors;
                break;
            case 11:
                i14 = R.string.lbl_muscles_lats;
                break;
            case 12:
                i14 = R.string.lbl_muscles_lower_back;
                break;
            case 13:
                i14 = R.string.lbl_muscles_obliques;
                break;
            case 14:
                i14 = R.string.lbl_muscles_quads;
                break;
            case 15:
                i14 = R.string.lbl_muscles_shoulders;
                break;
            case 16:
                i14 = R.string.lbl_muscles_traps;
                break;
            case 17:
                i14 = R.string.lbl_muscles_triceps;
                break;
            default:
                u0.r();
                throw null;
        }
        this(new g.a(i14), a1.b(aVar));
    }

    @Override // p71.f
    public final boolean B0(com.garmin.android.apps.connectmobile.performance.dto.c cVar) {
        cVar.getClass();
        Set<zw1.a> set = this.f136310b;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (zw1.a aVar : set) {
            i0.a aVar2 = i0.f1604c;
            String str = aVar.f207225a;
            aVar2.getClass();
            if (i0.a.a(cVar, str)) {
                return true;
            }
        }
        return false;
    }

    @Override // p71.f
    /* JADX INFO: renamed from: I0, reason: from getter */
    public final g getF136309a() {
        return this.f136309a;
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
        return s.g(this.f136309a, dVar.f136309a) && s.g(this.f136310b, dVar.f136310b);
    }

    public final int hashCode() {
        return this.f136310b.hashCode() + (this.f136309a.hashCode() * 31);
    }

    public final String toString() {
        return "PrimaryMuscleFilter(stringHandle=" + this.f136309a + ", muscles=" + this.f136310b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeParcelable(this.f136309a, i14);
        Set<zw1.a> set = this.f136310b;
        parcel.writeInt(set.size());
        Iterator<zw1.a> it = set.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next().name());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(g gVar, Set<? extends zw1.a> set) {
        gVar.getClass();
        set.getClass();
        this.f136309a = gVar;
        this.f136310b = set;
    }
}
