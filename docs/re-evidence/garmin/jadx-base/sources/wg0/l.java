package wg0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.u;
import p13.x;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lwg0/l;", "Landroid/os/Parcelable;", "Lwg0/d;", "newsFeedMapOverlay", "", "Lwg0/c;", "imageList", "Lwg0/k;", MimeTypes.BASE_TYPE_VIDEO, "Lwg0/g;", "metricImage", "", "carouselIndex", "<init>", "(Lwg0/d;Ljava/util/List;Lwg0/k;Lwg0/g;I)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f185101f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f185102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<c> f185103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f185104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f185105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f185106e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<l> {
        @Override // android.os.Parcelable.Creator
        public final l createFromParcel(Parcel parcel) {
            parcel.getClass();
            d dVarCreateFromParcel = parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel);
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA = 0;
            while (iA != i14) {
                iA = kg.f.a(c.CREATOR, parcel, arrayList, iA, 1);
            }
            return new l(dVarCreateFromParcel, arrayList, parcel.readInt() == 0 ? null : k.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? g.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final l[] newArray(int i14) {
            return new l[i14];
        }
    }

    public l(d dVar, List<c> list, k kVar, g gVar, int i14) {
        list.getClass();
        this.f185102a = dVar;
        this.f185103b = list;
        this.f185104c = kVar;
        this.f185105d = gVar;
        this.f185106e = i14;
        Iterator it = d().iterator();
        int i15 = 0;
        while (true) {
            if (!it.hasNext()) {
                i15 = -1;
                break;
            }
            f fVar = (f) it.next();
            if ((fVar instanceof k) || (fVar instanceof c)) {
                break;
            } else {
                i15++;
            }
        }
        this.f185106e = i15 > 0 ? i15 : 0;
    }

    public static l b(l lVar, d dVar, List list, int i14) {
        if ((i14 & 1) != 0) {
            dVar = lVar.f185102a;
        }
        d dVar2 = dVar;
        k kVar = (i14 & 4) != 0 ? lVar.f185104c : null;
        g gVar = lVar.f185105d;
        int i15 = lVar.f185106e;
        lVar.getClass();
        list.getClass();
        return new l(dVar2, list, kVar, gVar, i15);
    }

    public final ArrayList d() {
        return h0.C0(h0.C0(u.C(new Object[]{this.f185102a, this.f185104c}), this.f185103b), x.l(this.f185105d));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return s.g(this.f185102a, lVar.f185102a) && s.g(this.f185103b, lVar.f185103b) && s.g(this.f185104c, lVar.f185104c) && s.g(this.f185105d, lVar.f185105d) && this.f185106e == lVar.f185106e;
    }

    public final int hashCode() {
        d dVar = this.f185102a;
        int iB = u0.b((dVar == null ? 0 : dVar.hashCode()) * 31, 31, this.f185103b);
        k kVar = this.f185104c;
        int iHashCode = (iB + (kVar == null ? 0 : kVar.hashCode())) * 31;
        g gVar = this.f185105d;
        return Integer.hashCode(this.f185106e) + ((iHashCode + (gVar != null ? gVar.f185090a.hashCode() : 0)) * 31);
    }

    public final String toString() {
        int i14 = this.f185106e;
        StringBuilder sb3 = new StringBuilder("ActivityMediaData(newsFeedMapOverlay=");
        sb3.append(this.f185102a);
        sb3.append(", imageList=");
        sb3.append(this.f185103b);
        sb3.append(", video=");
        sb3.append(this.f185104c);
        sb3.append(", metricImage=");
        sb3.append(this.f185105d);
        sb3.append(", carouselIndex=");
        return am.j.q(sb3, i14, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        d dVar = this.f185102a;
        if (dVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dVar.writeToParcel(parcel, i14);
        }
        Iterator itE = kg.f.e(this.f185103b, parcel);
        while (itE.hasNext()) {
            ((c) itE.next()).writeToParcel(parcel, i14);
        }
        k kVar = this.f185104c;
        if (kVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            kVar.writeToParcel(parcel, i14);
        }
        g gVar = this.f185105d;
        if (gVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(gVar.f185090a);
        }
        parcel.writeInt(this.f185106e);
    }

    public /* synthetic */ l(d dVar, List list, k kVar, g gVar, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(dVar, list, kVar, gVar, (i15 & 16) != 0 ? 0 : i14);
    }
}
