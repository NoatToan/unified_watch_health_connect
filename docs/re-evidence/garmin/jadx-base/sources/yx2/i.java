package yx2;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.f3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import m63.e0;
import m63.k1;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.y1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f B\u0099\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0018\u0010\u0019B±\u0001\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0018\u0010\u001d¨\u0006!"}, d2 = {"Lyx2/i;", "Landroid/os/Parcelable;", "", "subscriptionPartNumber", "groupCode", "platformKey", "billingIntervalKey", "contractTermKey", "", "Lyx2/h;", "premiumFeatures", "metaPackageSku", "name", "Lyx2/m;", "translation", "Lyx2/l;", "pricing", "", "isTrialAvailable", "", "trialDuration", "hasSubscription", "trialExpirationDateString", "freeTrialConfigurationKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lyx2/m;Lyx2/l;ZIZLjava/lang/String;Ljava/lang/Integer;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lyx2/m;Lyx2/l;ZIZLjava/lang/String;Ljava/lang/Integer;Lm63/u1;)V", "Companion", "a", "b", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@i63.h
public final /* data */ class i implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f200088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f200089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f200090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f200091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f200092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<h> f200093f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f200094g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f200095h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m f200096i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f200097j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f200098k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f200099l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f200100m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f200101n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Integer f200102o;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f200086p = 8;
    public static final Parcelable.Creator<i> CREATOR = new c();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f200087q = {null, null, null, null, null, o13.m.a(o13.n.PUBLICATION, new b(3)), null, null, null, null, null, null, null, null, null};

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/subscriptions/dto/PurchasableSubscriptionDTO.$serializer", "Lm63/e0;", "Lyx2/i;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @o13.e
    public /* synthetic */ class a implements e0<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f200103a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f200103a = aVar;
            m1 m1Var = new m1("com.garmin.subscriptions.dto.PurchasableSubscriptionDTO", aVar, 15);
            m1Var.j("partNumber", false);
            m1Var.j("groupCode", true);
            m1Var.j("platform", false);
            m1Var.j("billingInterval", false);
            m1Var.j("contractTerm", false);
            m1Var.j("premiumFeatures", false);
            m1Var.j("metaPackageSku", false);
            m1Var.j("name", false);
            m1Var.j("translation", true);
            m1Var.j("pricing", true);
            m1Var.j("isTrialAvailable", false);
            m1Var.j("trialDuration", false);
            m1Var.j("hasSubscription", false);
            m1Var.j("trialExpirationDate", true);
            m1Var.j("freeTrialConfigurationType", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            o13.l<i63.c<Object>>[] lVarArr = i.f200087q;
            y1 y1Var = y1.f117048a;
            m63.g gVar = m63.g.f116948a;
            m0 m0Var = m0.f116981a;
            return new i63.c[]{y1Var, j63.a.d(y1Var), y1Var, y1Var, y1Var, lVarArr[5].getValue(), y1Var, y1Var, j63.a.d(m.a.f200126a), j63.a.d(l.a.f200121a), gVar, m0Var, gVar, j63.a.d(y1Var), j63.a.d(m0Var)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            o13.l<i63.c<Object>>[] lVarArr;
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr2 = i.f200087q;
            int i14 = l63.c.f110557a;
            Integer num = null;
            String str = null;
            l lVar = null;
            boolean z14 = true;
            m mVar = null;
            int i15 = 0;
            String strR = null;
            String str2 = null;
            String strR2 = null;
            String strR3 = null;
            String strR4 = null;
            List list = null;
            String strR5 = null;
            String strR6 = null;
            boolean zG = false;
            int iA = 0;
            boolean zG2 = false;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        lVarArr2 = lVarArr2;
                        break;
                    case 0:
                        lVarArr = lVarArr2;
                        strR = cVarC.r(eVar2, 0);
                        i15 |= 1;
                        lVarArr2 = lVarArr;
                        z14 = z14;
                        break;
                    case 1:
                        lVarArr = lVarArr2;
                        str2 = (String) cVarC.v(eVar2, 1, y1.f117048a, str2);
                        i15 |= 2;
                        lVarArr2 = lVarArr;
                        z14 = z14;
                        break;
                    case 2:
                        strR2 = cVarC.r(eVar2, 2);
                        i15 |= 4;
                        lVarArr2 = lVarArr2;
                        break;
                    case 3:
                        strR3 = cVarC.r(eVar2, 3);
                        i15 |= 8;
                        lVarArr2 = lVarArr2;
                        break;
                    case 4:
                        strR4 = cVarC.r(eVar2, 4);
                        i15 |= 16;
                        lVarArr2 = lVarArr2;
                        break;
                    case 5:
                        lVarArr = lVarArr2;
                        list = (List) cVarC.l(eVar2, 5, lVarArr[5].getValue(), list);
                        i15 |= 32;
                        lVarArr2 = lVarArr;
                        z14 = z14;
                        break;
                    case 6:
                        strR5 = cVarC.r(eVar2, 6);
                        i15 |= 64;
                        lVarArr2 = lVarArr2;
                        break;
                    case 7:
                        strR6 = cVarC.r(eVar2, 7);
                        i15 |= 128;
                        lVarArr2 = lVarArr2;
                        break;
                    case 8:
                        lVarArr = lVarArr2;
                        mVar = (m) cVarC.v(eVar2, 8, m.a.f200126a, mVar);
                        i15 |= 256;
                        lVarArr2 = lVarArr;
                        z14 = z14;
                        break;
                    case 9:
                        lVarArr = lVarArr2;
                        lVar = (l) cVarC.v(eVar2, 9, l.a.f200121a, lVar);
                        i15 |= 512;
                        lVarArr2 = lVarArr;
                        z14 = z14;
                        break;
                    case 10:
                        zG = cVarC.g(eVar2, 10);
                        i15 |= 1024;
                        lVarArr2 = lVarArr2;
                        break;
                    case 11:
                        iA = cVarC.A(eVar2, 11);
                        i15 |= 2048;
                        lVarArr2 = lVarArr2;
                        break;
                    case 12:
                        zG2 = cVarC.g(eVar2, 12);
                        i15 |= 4096;
                        lVarArr2 = lVarArr2;
                        break;
                    case 13:
                        lVarArr = lVarArr2;
                        str = (String) cVarC.v(eVar2, 13, y1.f117048a, str);
                        i15 |= 8192;
                        lVarArr2 = lVarArr;
                        z14 = z14;
                        break;
                    case 14:
                        lVarArr = lVarArr2;
                        num = (Integer) cVarC.v(eVar2, 14, m0.f116981a, num);
                        i15 |= 16384;
                        lVarArr2 = lVarArr;
                        z14 = z14;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            cVarC.b(eVar2);
            return new i(i15, strR, str2, strR2, strR3, strR4, list, strR5, strR6, mVar, lVar, zG, iA, zG2, str, num, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            i iVar = (i) obj;
            iVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = i.f200087q;
            String str = iVar.f200088a;
            Integer num = iVar.f200102o;
            String str2 = iVar.f200101n;
            l lVar = iVar.f200097j;
            m mVar = iVar.f200096i;
            String str3 = iVar.f200089b;
            dVarC.k(eVar, 0, str);
            if (dVarC.C(eVar) || str3 != null) {
                dVarC.d(eVar, 1, y1.f117048a, str3);
            }
            dVarC.k(eVar, 2, iVar.f200090c);
            dVarC.k(eVar, 3, iVar.f200091d);
            dVarC.k(eVar, 4, iVar.f200092e);
            dVarC.e(eVar, 5, lVarArr[5].getValue(), iVar.f200093f);
            dVarC.k(eVar, 6, iVar.f200094g);
            dVarC.k(eVar, 7, iVar.f200095h);
            if (dVarC.C(eVar) || mVar != null) {
                dVarC.d(eVar, 8, m.a.f200126a, mVar);
            }
            if (dVarC.C(eVar) || lVar != null) {
                dVarC.d(eVar, 9, l.a.f200121a, lVar);
            }
            dVarC.n(eVar, 10, iVar.f200098k);
            dVarC.v(11, iVar.f200099l, eVar);
            dVarC.n(eVar, 12, iVar.f200100m);
            if (dVarC.C(eVar) || str2 != null) {
                dVarC.d(eVar, 13, y1.f117048a, str2);
            }
            if (dVarC.C(eVar) || num != null) {
                dVarC.d(eVar, 14, m0.f116981a, num);
            }
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            boolean z14;
            boolean z15;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA = 0;
            while (iA != i14) {
                iA = kg.f.a(h.CREATOR, parcel, arrayList, iA, 1);
            }
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            m mVarCreateFromParcel = parcel.readInt() == 0 ? null : m.CREATOR.createFromParcel(parcel);
            l lVarCreateFromParcel = parcel.readInt() == 0 ? null : l.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z14 = false;
                z15 = true;
            } else {
                z14 = false;
                z15 = false;
            }
            Integer numValueOf = null;
            int i15 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z14 = true;
            }
            String string8 = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new i(string, string2, string3, string4, string5, arrayList, string6, string7, mVarCreateFromParcel, lVarCreateFromParcel, z15, i15, z14, string8, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i14) {
            return new i[i14];
        }
    }

    public /* synthetic */ i(int i14, String str, String str2, String str3, String str4, String str5, List list, String str6, String str7, m mVar, l lVar, boolean z14, int i15, boolean z15, String str8, Integer num, u1 u1Var) {
        if (7421 != (i14 & 7421)) {
            k1.h(i14, 7421, a.f200103a.getF158591b());
            throw null;
        }
        this.f200088a = str;
        if ((i14 & 2) == 0) {
            this.f200089b = null;
        } else {
            this.f200089b = str2;
        }
        this.f200090c = str3;
        this.f200091d = str4;
        this.f200092e = str5;
        this.f200093f = list;
        this.f200094g = str6;
        this.f200095h = str7;
        if ((i14 & 256) == 0) {
            this.f200096i = null;
        } else {
            this.f200096i = mVar;
        }
        if ((i14 & 512) == 0) {
            this.f200097j = null;
        } else {
            this.f200097j = lVar;
        }
        this.f200098k = z14;
        this.f200099l = i15;
        this.f200100m = z15;
        if ((i14 & 8192) == 0) {
            this.f200101n = null;
        } else {
            this.f200101n = str8;
        }
        if ((i14 & 16384) == 0) {
            this.f200102o = null;
        } else {
            this.f200102o = num;
        }
    }

    public final zx2.a b() {
        zx2.a.f207370b.getClass();
        return zx2.a.C3869a.a(this.f200091d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return s.g(this.f200088a, iVar.f200088a) && s.g(this.f200089b, iVar.f200089b) && s.g(this.f200090c, iVar.f200090c) && s.g(this.f200091d, iVar.f200091d) && s.g(this.f200092e, iVar.f200092e) && s.g(this.f200093f, iVar.f200093f) && s.g(this.f200094g, iVar.f200094g) && s.g(this.f200095h, iVar.f200095h) && s.g(this.f200096i, iVar.f200096i) && s.g(this.f200097j, iVar.f200097j) && this.f200098k == iVar.f200098k && this.f200099l == iVar.f200099l && this.f200100m == iVar.f200100m && s.g(this.f200101n, iVar.f200101n) && s.g(this.f200102o, iVar.f200102o);
    }

    public final int hashCode() {
        int iHashCode = this.f200088a.hashCode() * 31;
        String str = this.f200089b;
        int iJ = wr.g.j(wr.g.j(u0.b(wr.g.j(wr.g.j(wr.g.j((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f200090c), 31, this.f200091d), 31, this.f200092e), 31, this.f200093f), 31, this.f200094g), 31, this.f200095h);
        m mVar = this.f200096i;
        int iHashCode2 = (iJ + (mVar == null ? 0 : mVar.hashCode())) * 31;
        l lVar = this.f200097j;
        int iG = q6.f.g(q2.d(this.f200099l, q6.f.g((iHashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31, 31, this.f200098k), 31), 31, this.f200100m);
        String str2 = this.f200101n;
        int iHashCode3 = (iG + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f200102o;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("PurchasableSubscriptionDTO(subscriptionPartNumber=", this.f200088a, ", groupCode=", this.f200089b, ", platformKey=");
        sn.a.t(sbI, this.f200090c, ", billingIntervalKey=", this.f200091d, ", contractTermKey=");
        v.e0.o(this.f200092e, ", premiumFeatures=", ", metaPackageSku=", sbI, this.f200093f);
        sn.a.t(sbI, this.f200094g, ", name=", this.f200095h, ", translation=");
        sbI.append(this.f200096i);
        sbI.append(", pricing=");
        sbI.append(this.f200097j);
        sbI.append(", isTrialAvailable=");
        sbI.append(this.f200098k);
        sbI.append(", trialDuration=");
        sbI.append(this.f200099l);
        sbI.append(", hasSubscription=");
        fb1.c.w(", trialExpirationDateString=", this.f200101n, ", freeTrialConfigurationKey=", sbI, this.f200100m);
        return f3.i(sbI, this.f200102o, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f200088a);
        parcel.writeString(this.f200089b);
        parcel.writeString(this.f200090c);
        parcel.writeString(this.f200091d);
        parcel.writeString(this.f200092e);
        Iterator itE = kg.f.e(this.f200093f, parcel);
        while (itE.hasNext()) {
            h hVar = (h) itE.next();
            hVar.getClass();
            parcel.writeString(hVar.f200084a);
        }
        parcel.writeString(this.f200094g);
        parcel.writeString(this.f200095h);
        m mVar = this.f200096i;
        if (mVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mVar.writeToParcel(parcel, i14);
        }
        l lVar = this.f200097j;
        if (lVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            lVar.writeToParcel(parcel, i14);
        }
        parcel.writeInt(this.f200098k ? 1 : 0);
        parcel.writeInt(this.f200099l);
        parcel.writeInt(this.f200100m ? 1 : 0);
        parcel.writeString(this.f200101n);
        Integer num = this.f200102o;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
    }

    /* JADX INFO: renamed from: yx2.i$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lyx2/i$b;", "", "<init>", "()V", "Li63/c;", "Lyx2/i;", "serializer", "()Li63/c;", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final i63.c<i> serializer() {
            return a.f200103a;
        }

        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    public i(String str, String str2, String str3, String str4, String str5, List<h> list, String str6, String str7, m mVar, l lVar, boolean z14, int i14, boolean z15, String str8, Integer num) {
        str.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        list.getClass();
        str6.getClass();
        str7.getClass();
        this.f200088a = str;
        this.f200089b = str2;
        this.f200090c = str3;
        this.f200091d = str4;
        this.f200092e = str5;
        this.f200093f = list;
        this.f200094g = str6;
        this.f200095h = str7;
        this.f200096i = mVar;
        this.f200097j = lVar;
        this.f200098k = z14;
        this.f200099l = i14;
        this.f200100m = z15;
        this.f200101n = str8;
        this.f200102o = num;
    }

    public /* synthetic */ i(String str, String str2, String str3, String str4, String str5, List list, String str6, String str7, m mVar, l lVar, boolean z14, int i14, boolean z15, String str8, Integer num, int i15, p005kotlin.jvm.internal.j jVar) {
        this(str, (i15 & 2) != 0 ? null : str2, str3, str4, str5, list, str6, str7, (i15 & 256) != 0 ? null : mVar, (i15 & 512) != 0 ? null : lVar, z14, i14, z15, (i15 & 8192) != 0 ? null : str8, (i15 & 16384) != 0 ? null : num);
    }
}
