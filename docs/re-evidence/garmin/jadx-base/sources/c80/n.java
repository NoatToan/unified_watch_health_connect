package c80;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.y1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u001aB\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012B\u0095\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017¨\u0006\u001b"}, d2 = {"Lc80/n;", "", "", "identifier", "shopUrl", "name", "description", "offer", "detailedOffer", "Lc80/d;", FirebaseAnalytics.Param.COUPON, "couponUsageDisclaimer", "", "resources", "Lb63/l;", "expiresOn", "couponRestrictionGroupCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc80/d;Ljava/lang/String;Ljava/util/Map;Lb63/l;Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc80/d;Ljava/lang/String;Ljava/util/Map;Lb63/l;Ljava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class n {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f25463l = {null, null, null, null, null, null, null, null, o13.m.a(o13.n.PUBLICATION, new c63.g0(9)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f25468e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f25469f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f25470g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f25471h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map<String, String> f25472i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b63.l f25473j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f25474k;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/data/model/ExclusiveOfferDTO.$serializer", "Lm63/e0;", "Lc80/n;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements m63.e0<n> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f25475a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f25475a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.data.model.ExclusiveOfferDTO", aVar, 11);
            m1Var.j("identifier", false);
            m1Var.j("shopUrl", false);
            m1Var.j("name", false);
            m1Var.j("description", false);
            m1Var.j("offer", false);
            m1Var.j("detailedOffer", false);
            m1Var.j(FirebaseAnalytics.Param.COUPON, false);
            m1Var.j("couponUsageDisclaimer", false);
            m1Var.j("resources", false);
            m1Var.j("expiresOn", false);
            m1Var.j("couponRestrictionGroupCode", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            o13.l<i63.c<Object>>[] lVarArr = n.f25463l;
            y1 y1Var = y1.f117048a;
            return new i63.c[]{y1Var, j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(d.a.f25322a), j63.a.d(y1Var), j63.a.d(lVarArr[8].getValue()), j63.a.d(h63.j.f82302a), j63.a.d(y1Var)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            o13.l<i63.c<Object>>[] lVarArr;
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr2 = n.f25463l;
            int i14 = l63.c.f110557a;
            String str = null;
            b63.l lVar = null;
            Map map = null;
            boolean z14 = true;
            String str2 = null;
            int i15 = 0;
            String strR = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            d dVar = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        lVarArr2 = lVarArr2;
                        continue;
                    case 0:
                        lVarArr = lVarArr2;
                        strR = cVarC.r(eVar2, 0);
                        i15 |= 1;
                        break;
                    case 1:
                        lVarArr = lVarArr2;
                        str3 = (String) cVarC.v(eVar2, 1, y1.f117048a, str3);
                        i15 |= 2;
                        break;
                    case 2:
                        lVarArr = lVarArr2;
                        str4 = (String) cVarC.v(eVar2, 2, y1.f117048a, str4);
                        i15 |= 4;
                        break;
                    case 3:
                        lVarArr = lVarArr2;
                        str5 = (String) cVarC.v(eVar2, 3, y1.f117048a, str5);
                        i15 |= 8;
                        break;
                    case 4:
                        lVarArr = lVarArr2;
                        str6 = (String) cVarC.v(eVar2, 4, y1.f117048a, str6);
                        i15 |= 16;
                        break;
                    case 5:
                        lVarArr = lVarArr2;
                        str7 = (String) cVarC.v(eVar2, 5, y1.f117048a, str7);
                        i15 |= 32;
                        break;
                    case 6:
                        lVarArr = lVarArr2;
                        dVar = (d) cVarC.v(eVar2, 6, d.a.f25322a, dVar);
                        i15 |= 64;
                        break;
                    case 7:
                        lVarArr = lVarArr2;
                        str2 = (String) cVarC.v(eVar2, 7, y1.f117048a, str2);
                        i15 |= 128;
                        break;
                    case 8:
                        lVarArr = lVarArr2;
                        map = (Map) cVarC.v(eVar2, 8, lVarArr[8].getValue(), map);
                        i15 |= 256;
                        break;
                    case 9:
                        lVarArr = lVarArr2;
                        lVar = (b63.l) cVarC.v(eVar2, 9, h63.j.f82302a, lVar);
                        i15 |= 512;
                        break;
                    case 10:
                        lVarArr = lVarArr2;
                        str = (String) cVarC.v(eVar2, 10, y1.f117048a, str);
                        i15 |= 1024;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
                lVarArr2 = lVarArr;
                z14 = z14;
            }
            cVarC.b(eVar2);
            return new n(i15, strR, str3, str4, str5, str6, str7, dVar, str2, map, lVar, str, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            n nVar = (n) obj;
            nVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = n.f25463l;
            dVarC.k(eVar, 0, nVar.f25464a);
            y1 y1Var = y1.f117048a;
            dVarC.d(eVar, 1, y1Var, nVar.f25465b);
            dVarC.d(eVar, 2, y1Var, nVar.f25466c);
            dVarC.d(eVar, 3, y1Var, nVar.f25467d);
            dVarC.d(eVar, 4, y1Var, nVar.f25468e);
            dVarC.d(eVar, 5, y1Var, nVar.f25469f);
            dVarC.d(eVar, 6, d.a.f25322a, nVar.f25470g);
            dVarC.d(eVar, 7, y1Var, nVar.f25471h);
            dVarC.d(eVar, 8, lVarArr[8].getValue(), nVar.f25472i);
            dVarC.d(eVar, 9, h63.j.f82302a, nVar.f25473j);
            dVarC.d(eVar, 10, y1Var, nVar.f25474k);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ n(int i14, String str, String str2, String str3, String str4, String str5, String str6, d dVar, String str7, Map map, b63.l lVar, String str8, u1 u1Var) {
        if (2047 != (i14 & 2047)) {
            k1.h(i14, 2047, a.f25475a.getF158591b());
            throw null;
        }
        this.f25464a = str;
        this.f25465b = str2;
        this.f25466c = str3;
        this.f25467d = str4;
        this.f25468e = str5;
        this.f25469f = str6;
        this.f25470g = dVar;
        this.f25471h = str7;
        this.f25472i = map;
        this.f25473j = lVar;
        this.f25474k = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return p005kotlin.jvm.internal.s.g(this.f25464a, nVar.f25464a) && p005kotlin.jvm.internal.s.g(this.f25465b, nVar.f25465b) && p005kotlin.jvm.internal.s.g(this.f25466c, nVar.f25466c) && p005kotlin.jvm.internal.s.g(this.f25467d, nVar.f25467d) && p005kotlin.jvm.internal.s.g(this.f25468e, nVar.f25468e) && p005kotlin.jvm.internal.s.g(this.f25469f, nVar.f25469f) && p005kotlin.jvm.internal.s.g(this.f25470g, nVar.f25470g) && p005kotlin.jvm.internal.s.g(this.f25471h, nVar.f25471h) && p005kotlin.jvm.internal.s.g(this.f25472i, nVar.f25472i) && p005kotlin.jvm.internal.s.g(this.f25473j, nVar.f25473j) && p005kotlin.jvm.internal.s.g(this.f25474k, nVar.f25474k);
    }

    public final int hashCode() {
        int iHashCode = this.f25464a.hashCode() * 31;
        String str = this.f25465b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f25466c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f25467d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f25468e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f25469f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        d dVar = this.f25470g;
        int iHashCode7 = (iHashCode6 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str6 = this.f25471h;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Map<String, String> map = this.f25472i;
        int iHashCode9 = (iHashCode8 + (map == null ? 0 : map.hashCode())) * 31;
        b63.l lVar = this.f25473j;
        int iHashCode10 = (iHashCode9 + (lVar == null ? 0 : lVar.f16204a.hashCode())) * 31;
        String str7 = this.f25474k;
        return iHashCode10 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("ExclusiveOfferDTO(identifier=", this.f25464a, ", shopUrl=", this.f25465b, ", name=");
        sn.a.t(sbI, this.f25466c, ", description=", this.f25467d, ", offer=");
        sn.a.t(sbI, this.f25468e, ", detailedOffer=", this.f25469f, ", coupon=");
        sbI.append(this.f25470g);
        sbI.append(", couponUsageDisclaimer=");
        sbI.append(this.f25471h);
        sbI.append(", resources=");
        sbI.append(this.f25472i);
        sbI.append(", expiresOn=");
        sbI.append(this.f25473j);
        sbI.append(", couponRestrictionGroupCode=");
        return am.j.o(this.f25474k, ")", sbI);
    }

    /* JADX INFO: renamed from: c80.n$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lc80/n$b;", "", "<init>", "()V", "Li63/c;", "Lc80/n;", "serializer", "()Li63/c;", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<n> serializer() {
            return a.f25475a;
        }

        private Companion() {
        }
    }

    public n(String str, String str2, String str3, String str4, String str5, String str6, d dVar, String str7, Map<String, String> map, b63.l lVar, String str8) {
        str.getClass();
        this.f25464a = str;
        this.f25465b = str2;
        this.f25466c = str3;
        this.f25467d = str4;
        this.f25468e = str5;
        this.f25469f = str6;
        this.f25470g = dVar;
        this.f25471h = str7;
        this.f25472i = map;
        this.f25473j = lVar;
        this.f25474k = str8;
    }
}
