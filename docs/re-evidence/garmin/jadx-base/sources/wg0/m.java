package wg0;

import android.os.Parcel;
import android.os.Parcelable;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lwg0/m;", "Landroid/os/Parcelable;", "", "activityCommentCount", "activityLikeCount", "", "conversationPk", "", "conversationUuid", "Lwg0/b;", "featuredComment", "", "likedByUser", "likeInProgress", "", "Lwg0/n;", "likeProfileInfoList", "<init>", "(IILjava/lang/Long;Ljava/lang/String;Lwg0/b;ZZLjava/util/List;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f185107i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f185108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f185109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f185110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f185111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f185112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f185113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f185114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<n> f185115h;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<m> {
        @Override // android.os.Parcelable.Creator
        public final m createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            int i15 = parcel.readInt();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            b bVarCreateFromParcel = parcel.readInt() != 0 ? b.CREATOR.createFromParcel(parcel) : null;
            boolean z14 = false;
            int iA = 0;
            boolean z15 = true;
            if (parcel.readInt() != 0) {
                z14 = true;
            }
            if (parcel.readInt() == 0) {
                z15 = z14;
            }
            int i16 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i16);
            while (iA != i16) {
                iA = kg.f.a(n.CREATOR, parcel, arrayList, iA, 1);
            }
            return new m(i14, i15, lValueOf, string, bVarCreateFromParcel, z14, z15, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final m[] newArray(int i14) {
            return new m[i14];
        }
    }

    public m(int i14, int i15, Long l14, String str, b bVar, boolean z14, boolean z15, List<n> list) {
        int iNextIndex;
        list.getClass();
        this.f185108a = i14;
        this.f185109b = i15;
        this.f185110c = l14;
        this.f185111d = str;
        this.f185112e = bVar;
        this.f185113f = z14;
        this.f185114g = z15;
        this.f185115h = list;
        ListIterator<n> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            } else if (listIterator.previous().f185116a.equals(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName())) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex == -1 || iNextIndex == this.f185115h.size() - 1) {
            return;
        }
        this.f185115h.add(this.f185115h.remove(iNextIndex));
    }

    public static m b(m mVar, b bVar, ArrayList arrayList, int i14) {
        int i15 = mVar.f185108a;
        int i16 = mVar.f185109b;
        Long l14 = mVar.f185110c;
        String str = mVar.f185111d;
        if ((i14 & 16) != 0) {
            bVar = mVar.f185112e;
        }
        b bVar2 = bVar;
        boolean z14 = mVar.f185113f;
        boolean z15 = (i14 & 64) != 0 ? mVar.f185114g : false;
        List<n> list = arrayList;
        if ((i14 & 128) != 0) {
            list = mVar.f185115h;
        }
        List<n> list2 = list;
        mVar.getClass();
        list2.getClass();
        return new m(i15, i16, l14, str, bVar2, z14, z15, list2);
    }

    public final void d() {
        if (this.f185113f) {
            g();
        } else {
            f();
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f185108a == mVar.f185108a && this.f185109b == mVar.f185109b && s.g(this.f185110c, mVar.f185110c) && s.g(this.f185111d, mVar.f185111d) && s.g(this.f185112e, mVar.f185112e) && this.f185113f == mVar.f185113f && this.f185114g == mVar.f185114g && s.g(this.f185115h, mVar.f185115h);
    }

    public final void f() {
        f12.b bVar = (f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
        this.f185113f = true;
        this.f185109b++;
        f12.l.f68084a.getClass();
        String strZ4 = f12.l.a.a().z4("FRAMED_THUMBNAIL");
        if (strZ4 == null) {
            strZ4 = f12.l.a.a().q4();
        }
        this.f185115h.add(new n(bVar.getUserDisplayName(), bVar.getUserFullName(), strZ4));
    }

    public final void g() {
        int iNextIndex;
        f12.b bVar = (f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
        this.f185113f = false;
        this.f185109b--;
        List<n> list = this.f185115h;
        ListIterator<n> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            } else if (listIterator.previous().f185116a.equals(bVar.getUserDisplayName())) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex != -1) {
            list.remove(iNextIndex);
        }
    }

    public final int hashCode() {
        int iD = q2.d(this.f185109b, Integer.hashCode(this.f185108a) * 31, 31);
        Long l14 = this.f185110c;
        int iHashCode = (iD + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str = this.f185111d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        b bVar = this.f185112e;
        return this.f185115h.hashCode() + q6.f.g(q6.f.g((iHashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31, 31, this.f185113f), 31, this.f185114g);
    }

    public final String toString() {
        int i14 = this.f185109b;
        Long l14 = this.f185110c;
        String str = this.f185111d;
        boolean z14 = this.f185113f;
        boolean z15 = this.f185114g;
        StringBuilder sbJ = e5.j(this.f185108a, i14, "ActivitySocialData(activityCommentCount=", ", activityLikeCount=", ", conversationPk=");
        b71.i.q(l14, ", conversationUuid=", str, ", featuredComment=", sbJ);
        sbJ.append(this.f185112e);
        sbJ.append(", likedByUser=");
        sbJ.append(z14);
        sbJ.append(", likeInProgress=");
        sbJ.append(z15);
        sbJ.append(", likeProfileInfoList=");
        sbJ.append(this.f185115h);
        sbJ.append(")");
        return sbJ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f185108a);
        parcel.writeInt(this.f185109b);
        Long l14 = this.f185110c;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.f185111d);
        b bVar = this.f185112e;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bVar.writeToParcel(parcel, i14);
        }
        parcel.writeInt(this.f185113f ? 1 : 0);
        parcel.writeInt(this.f185114g ? 1 : 0);
        Iterator itE = kg.f.e(this.f185115h, parcel);
        while (itE.hasNext()) {
            ((n) itE.next()).writeToParcel(parcel, i14);
        }
    }

    public /* synthetic */ m(int i14, int i15, Long l14, String str, b bVar, boolean z14, boolean z15, List list, int i16, p005kotlin.jvm.internal.j jVar) {
        this(i14, i15, l14, str, (i16 & 16) != 0 ? null : bVar, z14, (i16 & 64) != 0 ? false : z15, list);
    }
}
