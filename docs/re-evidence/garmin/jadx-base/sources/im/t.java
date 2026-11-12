package im;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p13.h0;
import ps.x1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0013\b\u0016\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\b\u0010\f¨\u0006\u000f"}, d2 = {"Lim/t;", "Lim/b;", "", "chartType", "Lps/p;", "splitsDTO", "", "startTimeMillis", "<init>", "(ILps/p;J)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "CREATOR", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t extends b {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public final ps.p X0;
    public final long Y0;

    public t(Parcel parcel) {
        super(parcel);
        this.X0 = parcel != null ? (ps.p) parcel.readParcelable(ps.p.class.getClassLoader()) : null;
        this.Y0 = parcel != null ? parcel.readLong() : -1L;
    }

    public final x1 A(int i14) {
        x1 x1Var;
        ArrayList arrayList;
        Object next;
        List<x1> listI;
        double dC = this.f94122l.get(i14).C();
        long j8 = 1000;
        long j14 = this.Y0 / j8;
        ps.p pVar = this.X0;
        if (pVar == null || (listI = pVar.i()) == null) {
            x1Var = null;
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            Iterator it = listI.iterator();
            while (it.hasNext()) {
                Object next2 = it.next();
                x1 x1Var2 = (x1) next2;
                DateTime startDateTime = x1Var2.getStartDateTime();
                long millis = startDateTime != null ? startDateTime.getMillis() : -1L;
                Iterator it3 = it;
                long j15 = (millis / j8) - j14;
                DateTime endDateTime = x1Var2.getEndDateTime();
                long millis2 = ((endDateTime != null ? endDateTime.getMillis() : -1L) / j8) - j14;
                if (dC >= j15 && dC < millis2) {
                    arrayList.add(next2);
                }
                it = it3;
            }
            x1Var = null;
        }
        if (arrayList != null) {
            Iterator it4 = arrayList.iterator();
            do {
                if (!it4.hasNext()) {
                    next = x1Var;
                    break;
                }
                next = it4.next();
            } while (((x1) next).a2() != qs.x.CLIMB_ACTIVE);
            x1 x1Var3 = (x1) next;
            if (x1Var3 != null) {
                return x1Var3;
            }
        }
        return arrayList != null ? (x1) h0.d0(arrayList) : x1Var;
    }

    @Override // im.b, zm.p
    /* JADX INFO: renamed from: getTotalDuration */
    public final double getF94136a1() {
        return 0.0d;
    }

    @Override // im.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        super.writeToParcel(parcel, i14);
        parcel.writeParcelable(this.X0, 0);
        parcel.writeLong(this.Y0);
    }

    /* JADX INFO: renamed from: im.t$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lim/t$a;", "Landroid/os/Parcelable$Creator;", "Lim/t;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<t> {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public final t createFromParcel(Parcel parcel) {
            return new t(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final t[] newArray(int i14) {
            return new t[i14];
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(int i14, ps.p pVar, long j8) {
        super(i14);
        pVar.getClass();
        this.X0 = pVar;
        this.Y0 = j8;
    }
}
