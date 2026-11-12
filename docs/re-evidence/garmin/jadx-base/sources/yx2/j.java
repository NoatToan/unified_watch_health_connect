package yx2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.y1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0012B7\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000f¨\u0006\u0013"}, d2 = {"Lyx2/j;", "Landroid/os/Parcelable;", "", "Lyx2/i;", "subscriptions", "", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "currencyCode", "responseExpiration", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@i63.h
public final /* data */ class j implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<i> f200105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f200106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f200107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f200108d;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<j> CREATOR = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f200104e = {o13.m.a(o13.n.PUBLICATION, new b(4)), null, null, null};

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/subscriptions/dto/PurchasableSubscriptionsDTO.$serializer", "Lm63/e0;", "Lyx2/j;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @o13.e
    public /* synthetic */ class a implements e0<j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f200109a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f200109a = aVar;
            m1 m1Var = new m1("com.garmin.subscriptions.dto.PurchasableSubscriptionsDTO", aVar, 4);
            m1Var.j("purchasableSubscriptions", true);
            m1Var.j(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, true);
            m1Var.j("currencyCode", true);
            m1Var.j("responseExpiration", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            y1 y1Var = y1.f117048a;
            return new i63.c[]{j.f200104e[0].getValue(), j63.a.d(y1Var), j63.a.d(y1Var), y1Var};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = j.f200104e;
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            List list = null;
            String str = null;
            String str2 = null;
            String strR = null;
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
                } else {
                    if (iE != 3) {
                        hb.a.o(iE);
                        return null;
                    }
                    strR = cVarC.r(eVar2, 3);
                    i15 |= 8;
                }
            }
            cVarC.b(eVar2);
            return new j(i15, list, str, str2, strR, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            j jVar = (j) obj;
            jVar.getClass();
            String str = jVar.f200107c;
            String str2 = jVar.f200106b;
            List<i> list = jVar.f200105a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = j.f200104e;
            if (dVarC.C(eVar) || !s.g(list, j0.f134944a)) {
                dVarC.e(eVar, 0, lVarArr[0].getValue(), list);
            }
            if (dVarC.C(eVar) || str2 != null) {
                dVarC.d(eVar, 1, y1.f117048a, str2);
            }
            if (dVarC.C(eVar) || str != null) {
                dVarC.d(eVar, 2, y1.f117048a, str);
            }
            dVarC.k(eVar, 3, jVar.f200108d);
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA = 0;
            while (iA != i14) {
                iA = kg.f.a(i.CREATOR, parcel, arrayList, iA, 1);
            }
            return new j(arrayList, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i14) {
            return new j[i14];
        }
    }

    public j(int i14, List list, String str, String str2, String str3, u1 u1Var) {
        if (8 != (i14 & 8)) {
            k1.h(i14, 8, a.f200109a.getF158591b());
            throw null;
        }
        this.f200105a = (i14 & 1) == 0 ? j0.f134944a : list;
        if ((i14 & 2) == 0) {
            this.f200106b = null;
        } else {
            this.f200106b = str;
        }
        if ((i14 & 4) == 0) {
            this.f200107c = null;
        } else {
            this.f200107c = str2;
        }
        this.f200108d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return s.g(this.f200105a, jVar.f200105a) && s.g(this.f200106b, jVar.f200106b) && s.g(this.f200107c, jVar.f200107c) && s.g(this.f200108d, jVar.f200108d);
    }

    public final int hashCode() {
        int iHashCode = this.f200105a.hashCode() * 31;
        String str = this.f200106b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f200107c;
        return this.f200108d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PurchasableSubscriptionsDTO(subscriptions=");
        sb3.append(this.f200105a);
        sb3.append(", countryCode=");
        sb3.append(this.f200106b);
        sb3.append(", currencyCode=");
        return e5.h(sb3, this.f200107c, ", responseExpiration=", this.f200108d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Iterator itE = kg.f.e(this.f200105a, parcel);
        while (itE.hasNext()) {
            ((i) itE.next()).writeToParcel(parcel, i14);
        }
        parcel.writeString(this.f200106b);
        parcel.writeString(this.f200107c);
        parcel.writeString(this.f200108d);
    }

    /* JADX INFO: renamed from: yx2.j$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lyx2/j$b;", "", "<init>", "()V", "Li63/c;", "Lyx2/j;", "serializer", "()Li63/c;", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final i63.c<j> serializer() {
            return a.f200109a;
        }

        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    public j(List<i> list, String str, String str2, String str3) {
        list.getClass();
        str3.getClass();
        this.f200105a = list;
        this.f200106b = str;
        this.f200107c = str2;
        this.f200108d = str3;
    }

    public j(List list, String str, String str2, String str3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? j0.f134944a : list, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, str3);
    }
}
