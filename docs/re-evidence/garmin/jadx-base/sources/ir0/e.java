package ir0;

import android.os.Parcel;
import android.os.Parcelable;
import g22.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lir0/e;", "Landroid/os/Parcelable;", "", "Lir0/f;", "summaries", "", "daily", "<init>", "(Ljava/util/List;Z)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f94792c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<f> f94793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f94794b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(f.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new e(arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public /* synthetic */ e(List list, boolean z14, int i14, j jVar) {
        this(list, (i14 & 2) != 0 ? true : z14);
    }

    public final int b() {
        List<f> list = this.f94793a;
        ArrayList arrayListK = list != null ? k(list) : null;
        if (arrayListK == null || !(!arrayListK.isEmpty())) {
            return 0;
        }
        Iterator it = arrayListK.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            Integer numD = ((f) it.next()).d();
            iIntValue += numD != null ? numD.intValue() : 0;
        }
        return iIntValue / arrayListK.size();
    }

    public final int d() {
        List<f> list = this.f94793a;
        ArrayList arrayListK = list != null ? k(list) : null;
        if (arrayListK == null || !(!arrayListK.isEmpty())) {
            return 0;
        }
        Iterator it = arrayListK.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            Integer numF = ((f) it.next()).f();
            iIntValue += numF != null ? numF.intValue() : 0;
        }
        return iIntValue / arrayListK.size();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.f94793a, eVar.f94793a) && this.f94794b == eVar.f94794b;
    }

    public final int f() {
        List<f> list = this.f94793a;
        ArrayList arrayListK = list != null ? k(list) : null;
        if (arrayListK == null || !(!arrayListK.isEmpty())) {
            return 0;
        }
        Iterator it = arrayListK.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            Integer numG = ((f) it.next()).g();
            iIntValue += numG != null ? numG.intValue() : 0;
        }
        return iIntValue / arrayListK.size();
    }

    public final int g() {
        List<f> list = this.f94793a;
        if (list == null) {
            return 0;
        }
        Iterator<T> it = list.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            Integer numF = ((f) it.next()).f();
            iIntValue += numF != null ? numF.intValue() : 0;
        }
        return iIntValue;
    }

    public final int h() {
        List<f> list = this.f94793a;
        if (list == null) {
            return 0;
        }
        Iterator<T> it = list.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            Integer numD = ((f) it.next()).d();
            iIntValue += numD != null ? numD.intValue() : 0;
        }
        return iIntValue;
    }

    public final int hashCode() {
        List<f> list = this.f94793a;
        return Boolean.hashCode(this.f94794b) + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final int i() {
        List<f> list = this.f94793a;
        if (list == null) {
            return 0;
        }
        Iterator<T> it = list.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            Integer numG = ((f) it.next()).g();
            iIntValue += numG != null ? numG.intValue() : 0;
        }
        return iIntValue;
    }

    public final int j() {
        List<f> list = this.f94793a;
        if (list != null && !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                int i14 = ((f) it.next()).f94797b;
                if (i14 > 0) {
                    return i14;
                }
            }
        }
        return -1;
    }

    public final ArrayList k(List list) {
        LocalDate localDateNow = LocalDate.now();
        if (this.f94794b) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                LocalDate localDateB = ((f) obj).b();
                if ((localDateB != null && localDateB.isBefore(localDateNow)) || (localDateB != null && localDateB.isEqual(localDateNow))) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        DateTime dateTimeAtStartOfDay = localDateNow.toDateTimeAtStartOfDay();
        dateTimeAtStartOfDay.getClass();
        LocalDate localDate = k.o(1, dateTimeAtStartOfDay).toLocalDate();
        if (list == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            LocalDate localDateB2 = ((f) obj2).b();
            if (localDateB2 != null && localDateB2.isBefore(localDate)) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    public final boolean m() {
        Object next;
        f fVar;
        List<f> list = this.f94793a;
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            fVar = (f) next;
            if (fVar.d() != null || fVar.g() != null) {
                break;
            }
        } while (fVar.f94797b <= 0);
        return ((f) next) != null;
    }

    public final String toString() {
        return "IntensityMinutesSummary(summaries=" + this.f94793a + ", daily=" + this.f94794b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        List<f> list = this.f94793a;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((f) itO.next()).writeToParcel(parcel, i14);
            }
        }
        parcel.writeInt(this.f94794b ? 1 : 0);
    }

    public e(List<f> list, boolean z14) {
        this.f94793a = list;
        this.f94794b = z14;
    }
}
