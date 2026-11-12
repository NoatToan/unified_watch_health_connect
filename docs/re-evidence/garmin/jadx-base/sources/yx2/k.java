package yx2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.y1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import u62.z;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0014BI\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fBY\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011¨\u0006\u0015"}, d2 = {"Lyx2/k;", "Landroid/os/Parcelable;", "", "Lyx2/i;", "subscriptions", "", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "currencyCode", "responseExpiration", "Lyx2/c;", "customerSubscriptions", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lm63/u1;)V", "Companion", "a", "b", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@i63.h
public final /* data */ class k implements Parcelable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f200110f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<i> f200111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f200112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f200113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f200114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<yx2.c> f200115e;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<k> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/subscriptions/dto/PurchasableSubscriptionsResponseDTO.$serializer", "Lm63/e0;", "Lyx2/k;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @o13.e
    public /* synthetic */ class a implements e0<k> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f200116a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f200116a = aVar;
            m1 m1Var = new m1("com.garmin.subscriptions.dto.PurchasableSubscriptionsResponseDTO", aVar, 5);
            m1Var.j("purchasableSubscriptions", true);
            m1Var.j(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, true);
            m1Var.j("currencyCode", true);
            m1Var.j("responseExpiration", false);
            m1Var.j("customerSubscriptions", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            o13.l<i63.c<Object>>[] lVarArr = k.f200110f;
            y1 y1Var = y1.f117048a;
            return new i63.c[]{lVarArr[0].getValue(), j63.a.d(y1Var), j63.a.d(y1Var), y1Var, j63.a.d(lVarArr[4].getValue())};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = k.f200110f;
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            List list = null;
            String str = null;
            String str2 = null;
            String strR = null;
            List list2 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    list = (List) cVarC.l(eVar2, 0, lVarArr[0].getValue(), list);
                    i15 |= 1;
                } else if (iE == 1) {
                    str = (String) cVarC.v(eVar2, 1, y1.f117048a, str);
                    i15 |= 2;
                } else if (iE == 2) {
                    str2 = (String) cVarC.v(eVar2, 2, y1.f117048a, str2);
                    i15 |= 4;
                } else if (iE == 3) {
                    strR = cVarC.r(eVar2, 3);
                    i15 |= 8;
                } else {
                    if (iE != 4) {
                        hb.a.o(iE);
                        return null;
                    }
                    list2 = (List) cVarC.v(eVar2, 4, lVarArr[4].getValue(), list2);
                    i15 |= 16;
                }
            }
            cVarC.b(eVar2);
            return new k(i15, list, str, str2, strR, list2, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            k kVar = (k) obj;
            kVar.getClass();
            String str = kVar.f200113c;
            String str2 = kVar.f200112b;
            List<i> list = kVar.f200111a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = k.f200110f;
            if (dVarC.C(eVar) || !s.g(list, j0.f134944a)) {
                dVarC.e(eVar, 0, lVarArr[0].getValue(), list);
            }
            if (dVarC.C(eVar) || str2 != null) {
                dVarC.d(eVar, 1, y1.f117048a, str2);
            }
            if (dVarC.C(eVar) || str != null) {
                dVarC.d(eVar, 2, y1.f117048a, str);
            }
            String str3 = kVar.f200114d;
            List<yx2.c> list2 = kVar.f200115e;
            dVarC.k(eVar, 3, str3);
            if (dVarC.C(eVar) || list2 != null) {
                dVarC.d(eVar, 4, lVarArr[4].getValue(), list2);
            }
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            int i14 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i14);
            int iA = 0;
            int iA2 = 0;
            while (iA2 != i14) {
                iA2 = kg.f.a(i.CREATOR, parcel, arrayList2, iA2, 1);
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i15 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i15);
                while (iA != i15) {
                    iA = kg.f.a(yx2.c.CREATOR, parcel, arrayList3, iA, 1);
                }
                arrayList = arrayList3;
            }
            return new k(arrayList2, string, string2, string3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i14) {
            return new k[i14];
        }
    }

    static {
        o13.n nVar = o13.n.PUBLICATION;
        f200110f = new o13.l[]{o13.m.a(nVar, new b(5)), null, null, null, o13.m.a(nVar, new b(6))};
    }

    public k(int i14, List list, String str, String str2, String str3, List list2, u1 u1Var) {
        if (8 != (i14 & 8)) {
            k1.h(i14, 8, a.f200116a.getF158591b());
            throw null;
        }
        this.f200111a = (i14 & 1) == 0 ? j0.f134944a : list;
        if ((i14 & 2) == 0) {
            this.f200112b = null;
        } else {
            this.f200112b = str;
        }
        if ((i14 & 4) == 0) {
            this.f200113c = null;
        } else {
            this.f200113c = str2;
        }
        this.f200114d = str3;
        if ((i14 & 16) == 0) {
            this.f200115e = null;
        } else {
            this.f200115e = list2;
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
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return s.g(this.f200111a, kVar.f200111a) && s.g(this.f200112b, kVar.f200112b) && s.g(this.f200113c, kVar.f200113c) && s.g(this.f200114d, kVar.f200114d) && s.g(this.f200115e, kVar.f200115e);
    }

    public final int hashCode() {
        int iHashCode = this.f200111a.hashCode() * 31;
        String str = this.f200112b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f200113c;
        int iJ = wr.g.j((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f200114d);
        List<yx2.c> list = this.f200115e;
        return iJ + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PurchasableSubscriptionsResponseDTO(subscriptions=");
        sb3.append(this.f200111a);
        sb3.append(", countryCode=");
        sb3.append(this.f200112b);
        sb3.append(", currencyCode=");
        sn.a.t(sb3, this.f200113c, ", responseExpiration=", this.f200114d, ", customerSubscriptions=");
        return z.c(sb3, this.f200115e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Iterator itE = kg.f.e(this.f200111a, parcel);
        while (itE.hasNext()) {
            ((i) itE.next()).writeToParcel(parcel, i14);
        }
        parcel.writeString(this.f200112b);
        parcel.writeString(this.f200113c);
        parcel.writeString(this.f200114d);
        List<yx2.c> list = this.f200115e;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            ((yx2.c) itO.next()).writeToParcel(parcel, i14);
        }
    }

    /* JADX INFO: renamed from: yx2.k$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lyx2/k$b;", "", "<init>", "()V", "Li63/c;", "Lyx2/k;", "serializer", "()Li63/c;", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final i63.c<k> serializer() {
            return a.f200116a;
        }

        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    public k(List<i> list, String str, String str2, String str3, List<yx2.c> list2) {
        list.getClass();
        str3.getClass();
        this.f200111a = list;
        this.f200112b = str;
        this.f200113c = str2;
        this.f200114d = str3;
        this.f200115e = list2;
    }

    public k(List list, String str, String str2, String str3, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? j0.f134944a : list, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, str3, (i14 & 16) != 0 ? null : list2);
    }
}
