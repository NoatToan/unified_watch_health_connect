package g01;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import i3.e5;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.y1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0015BY\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rBk\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012¨\u0006\u0016"}, d2 = {"Lg01/o;", "", "", "foodId", "foodName", "Lg01/w;", "foodType", "brandName", "_source", "regionCode", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "imageUuid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lg01/w;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lg01/w;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class o {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f74227i = {null, null, o13.m.a(o13.n.PUBLICATION, new fy1.h(28)), null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f74229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f74230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f74231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f74232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f74233f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f74234g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f74235h;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/data/model/consumable/FoodMetadataDTO.$serializer", "Lm63/e0;", "Lg01/o;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements m63.e0<o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f74236a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f74236a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.nutrition.data.model.consumable.FoodMetadataDTO", aVar, 8);
            m1Var.j("foodId", false);
            m1Var.j("foodName", false);
            m1Var.j("foodType", false);
            m1Var.j("brandName", false);
            m1Var.j("source", false);
            m1Var.j("regionCode", false);
            m1Var.j(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, false);
            m1Var.j("imageUuid", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            o13.l<i63.c<Object>>[] lVarArr = o.f74227i;
            y1 y1Var = y1.f117048a;
            return new i63.c[]{j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(lVarArr[2].getValue()), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = o.f74227i;
            int i14 = l63.c.f110557a;
            Object obj = null;
            boolean z14 = true;
            String str = null;
            String str2 = null;
            String str3 = null;
            w wVar = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            int i15 = 0;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        break;
                    case 0:
                        str2 = (String) cVarC.v(eVar2, 0, y1.f117048a, str2);
                        i15 |= 1;
                        break;
                    case 1:
                        str3 = (String) cVarC.v(eVar2, 1, y1.f117048a, str3);
                        i15 |= 2;
                        break;
                    case 2:
                        wVar = (w) cVarC.v(eVar2, 2, lVarArr[2].getValue(), wVar);
                        i15 |= 4;
                        break;
                    case 3:
                        str4 = (String) cVarC.v(eVar2, 3, y1.f117048a, str4);
                        i15 |= 8;
                        break;
                    case 4:
                        str5 = (String) cVarC.v(eVar2, 4, y1.f117048a, str5);
                        i15 |= 16;
                        break;
                    case 5:
                        str6 = (String) cVarC.v(eVar2, 5, y1.f117048a, str6);
                        i15 |= 32;
                        break;
                    case 6:
                        str7 = (String) cVarC.v(eVar2, 6, y1.f117048a, str7);
                        i15 |= 64;
                        break;
                    case 7:
                        str = (String) cVarC.v(eVar2, 7, y1.f117048a, str);
                        i15 |= 128;
                        break;
                    default:
                        hb.a.o(iE);
                        return obj;
                }
                obj = null;
            }
            cVarC.b(eVar2);
            return new o(i15, str2, str3, wVar, str4, str5, str6, str7, str, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            o oVar = (o) obj;
            oVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = o.f74227i;
            y1 y1Var = y1.f117048a;
            String str = oVar.f74228a;
            String str2 = oVar.f74235h;
            dVarC.d(eVar, 0, y1Var, str);
            dVarC.d(eVar, 1, y1Var, oVar.f74229b);
            dVarC.d(eVar, 2, lVarArr[2].getValue(), oVar.f74230c);
            dVarC.d(eVar, 3, y1Var, oVar.f74231d);
            dVarC.d(eVar, 4, y1Var, oVar.f74232e);
            dVarC.d(eVar, 5, y1Var, oVar.f74233f);
            dVarC.d(eVar, 6, y1Var, oVar.f74234g);
            if (dVarC.C(eVar) || str2 != null) {
                dVarC.d(eVar, 7, y1Var, str2);
            }
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ o(int i14, String str, String str2, w wVar, String str3, String str4, String str5, String str6, String str7, u1 u1Var) {
        if (127 != (i14 & 127)) {
            k1.h(i14, 127, a.f74236a.getF158591b());
            throw null;
        }
        this.f74228a = str;
        this.f74229b = str2;
        this.f74230c = wVar;
        this.f74231d = str3;
        this.f74232e = str4;
        this.f74233f = str5;
        this.f74234g = str6;
        if ((i14 & 128) == 0) {
            this.f74235h = null;
        } else {
            this.f74235h = str7;
        }
    }

    public final b11.d a() {
        String str;
        String str2 = this.f74228a;
        if (str2 == null || (str = this.f74229b) == null) {
            return null;
        }
        w wVar = this.f74230c;
        w wVar2 = wVar != null ? wVar : null;
        if (wVar2 == null) {
            wVar2 = w.GENERIC;
        }
        w wVar3 = wVar2;
        u.INSTANCE.getClass();
        u uVarA = u.Companion.a(this.f74232e);
        String str3 = this.f74233f;
        String str4 = str3 == null ? "" : str3;
        String str5 = this.f74234g;
        return new b11.d(str2, str, wVar3, this.f74231d, uVarA, str4, str5 == null ? "" : str5, this.f74235h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return p005kotlin.jvm.internal.s.g(this.f74228a, oVar.f74228a) && p005kotlin.jvm.internal.s.g(this.f74229b, oVar.f74229b) && this.f74230c == oVar.f74230c && p005kotlin.jvm.internal.s.g(this.f74231d, oVar.f74231d) && p005kotlin.jvm.internal.s.g(this.f74232e, oVar.f74232e) && p005kotlin.jvm.internal.s.g(this.f74233f, oVar.f74233f) && p005kotlin.jvm.internal.s.g(this.f74234g, oVar.f74234g) && p005kotlin.jvm.internal.s.g(this.f74235h, oVar.f74235h);
    }

    public final int hashCode() {
        String str = this.f74228a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f74229b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        w wVar = this.f74230c;
        int iHashCode3 = (iHashCode2 + (wVar == null ? 0 : wVar.hashCode())) * 31;
        String str3 = this.f74231d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f74232e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f74233f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f74234g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f74235h;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("FoodMetadataDTO(foodId=", this.f74228a, ", foodName=", this.f74229b, ", foodType=");
        sbI.append(this.f74230c);
        sbI.append(", brandName=");
        sbI.append(this.f74231d);
        sbI.append(", _source=");
        sn.a.t(sbI, this.f74232e, ", regionCode=", this.f74233f, ", languageCode=");
        return e5.h(sbI, this.f74234g, ", imageUuid=", this.f74235h, ")");
    }

    /* JADX INFO: renamed from: g01.o$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg01/o$b;", "", "<init>", "()V", "Li63/c;", "Lg01/o;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<o> serializer() {
            return a.f74236a;
        }

        private Companion() {
        }
    }

    public o(String str, String str2, w wVar, String str3, String str4, String str5, String str6, String str7) {
        this.f74228a = str;
        this.f74229b = str2;
        this.f74230c = wVar;
        this.f74231d = str3;
        this.f74232e = str4;
        this.f74233f = str5;
        this.f74234g = str6;
        this.f74235h = str7;
    }

    public /* synthetic */ o(String str, String str2, w wVar, String str3, String str4, String str5, String str6, String str7, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, wVar, str3, str4, str5, str6, (i14 & 128) != 0 ? null : str7);
    }
}
