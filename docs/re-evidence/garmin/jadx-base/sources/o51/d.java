package o51;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lo51/d;", "Landroid/os/Parcelable;", "", "isLoading", "isPullToRefreshLoading", "isError", "Li53/c;", "Lo51/c;", "paceProPlanList", "Lo51/g;", "sendToDeviceState", "<init>", "(ZZZLi53/c;Lo51/g;)V", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f129223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f129224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f129225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.c<c> f129226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f129227e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            i53.f fVarJ;
            parcel.getClass();
            int iA = 0;
            boolean z14 = parcel.readInt() != 0;
            boolean z15 = parcel.readInt() != 0;
            boolean z16 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                fVarJ = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i14);
                while (iA != i14) {
                    iA = kg.f.a(c.CREATOR, parcel, arrayList, iA, 1);
                }
                fVarJ = i53.a.j(arrayList);
            }
            return new d(z14, z15, z16, fVarJ, g.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public /* synthetic */ d(boolean z14, boolean z15, boolean z16, i53.c cVar, g gVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? false : z16, (i14 & 8) != 0 ? null : cVar, (i14 & 16) != 0 ? new g(false, false, false, null, 15, null) : gVar);
    }

    public static d b(d dVar, boolean z14, boolean z15, boolean z16, i53.f fVar, g gVar, int i14) {
        if ((i14 & 1) != 0) {
            z14 = dVar.f129223a;
        }
        boolean z17 = z14;
        if ((i14 & 2) != 0) {
            z15 = dVar.f129224b;
        }
        boolean z18 = z15;
        if ((i14 & 4) != 0) {
            z16 = dVar.f129225c;
        }
        boolean z19 = z16;
        i53.c<c> cVar = fVar;
        if ((i14 & 8) != 0) {
            cVar = dVar.f129226d;
        }
        i53.c<c> cVar2 = cVar;
        if ((i14 & 16) != 0) {
            gVar = dVar.f129227e;
        }
        g gVar2 = gVar;
        dVar.getClass();
        gVar2.getClass();
        return new d(z17, z18, z19, cVar2, gVar2);
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
        return this.f129223a == dVar.f129223a && this.f129224b == dVar.f129224b && this.f129225c == dVar.f129225c && s.g(this.f129226d, dVar.f129226d) && s.g(this.f129227e, dVar.f129227e);
    }

    public final int hashCode() {
        int iG = q6.f.g(q6.f.g(Boolean.hashCode(this.f129223a) * 31, 31, this.f129224b), 31, this.f129225c);
        i53.c<c> cVar = this.f129226d;
        return this.f129227e.hashCode() + ((iG + (cVar == null ? 0 : cVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("PaceProListScreenState(isLoading=", ", isPullToRefreshLoading=", ", isError=", this.f129223a, this.f129224b);
        sbM.append(this.f129225c);
        sbM.append(", paceProPlanList=");
        sbM.append(this.f129226d);
        sbM.append(", sendToDeviceState=");
        sbM.append(this.f129227e);
        sbM.append(")");
        return sbM.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f129223a ? 1 : 0);
        parcel.writeInt(this.f129224b ? 1 : 0);
        parcel.writeInt(this.f129225c ? 1 : 0);
        i53.c<c> cVar = this.f129226d;
        if (cVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(cVar.size());
            Iterator<c> it = cVar.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i14);
            }
        }
        this.f129227e.writeToParcel(parcel, i14);
    }

    public d(boolean z14, boolean z15, boolean z16, i53.c<c> cVar, g gVar) {
        gVar.getClass();
        this.f129223a = z14;
        this.f129224b = z15;
        this.f129225c = z16;
        this.f129226d = cVar;
        this.f129227e = gVar;
    }

    public d() {
        this(false, false, false, null, null, 31, null);
    }
}
