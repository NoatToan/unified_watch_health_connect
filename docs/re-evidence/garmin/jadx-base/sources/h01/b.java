package h01;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import g01.u;
import go1.j;
import i3.e5;
import i63.h;
import l63.d;
import l63.f;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.x;
import m63.y1;
import o13.e;
import o13.l;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import wr.g;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0014B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011¨\u0006\u0015"}, d2 = {"Lh01/b;", "", "", "foodId", "servingId", "Lg01/u;", "source", "", "servingQty", "regionCode", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lg01/u;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lg01/u;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final /* data */ class b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l<i63.c<Object>>[] f80633g = {null, null, m.a(n.PUBLICATION, new j(14)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f80634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f80635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f80636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f80637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f80638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f80639f;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/data/model/favorite/FavoriteFoodDetailsDTO.$serializer", "Lm63/e0;", "Lh01/b;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @e
    public static final /* synthetic */ class a implements e0<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f80640a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f80640a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.nutrition.data.model.favorite.FavoriteFoodDetailsDTO", aVar, 6);
            m1Var.j("foodId", false);
            m1Var.j("servingId", false);
            m1Var.j("source", false);
            m1Var.j("servingQty", false);
            m1Var.j("regionCode", false);
            m1Var.j(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            l<i63.c<Object>>[] lVarArr = b.f80633g;
            y1 y1Var = y1.f117048a;
            return new i63.c[]{y1Var, y1Var, lVarArr[2].getValue(), j63.a.d(x.f117036a), y1Var, y1Var};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            l<i63.c<Object>>[] lVarArr = b.f80633g;
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            String strR = null;
            String strR2 = null;
            u uVar = null;
            Double d14 = null;
            String strR3 = null;
            String strR4 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        break;
                    case 0:
                        strR = cVarC.r(eVar2, 0);
                        i15 |= 1;
                        break;
                    case 1:
                        strR2 = cVarC.r(eVar2, 1);
                        i15 |= 2;
                        break;
                    case 2:
                        uVar = (u) cVarC.l(eVar2, 2, lVarArr[2].getValue(), uVar);
                        i15 |= 4;
                        break;
                    case 3:
                        d14 = (Double) cVarC.v(eVar2, 3, x.f117036a, d14);
                        i15 |= 8;
                        break;
                    case 4:
                        strR3 = cVarC.r(eVar2, 4);
                        i15 |= 16;
                        break;
                    case 5:
                        strR4 = cVarC.r(eVar2, 5);
                        i15 |= 32;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            cVarC.b(eVar2);
            return new b(i15, strR, strR2, uVar, d14, strR3, strR4, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(f fVar, Object obj) {
            b bVar = (b) obj;
            bVar.getClass();
            k63.e eVar = descriptor;
            d dVarC = fVar.c(eVar);
            l<i63.c<Object>>[] lVarArr = b.f80633g;
            dVarC.k(eVar, 0, bVar.f80634a);
            dVarC.k(eVar, 1, bVar.f80635b);
            dVarC.e(eVar, 2, lVarArr[2].getValue(), bVar.f80636c);
            dVarC.d(eVar, 3, x.f117036a, bVar.f80637d);
            dVarC.k(eVar, 4, bVar.f80638e);
            dVarC.k(eVar, 5, bVar.f80639f);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ b(int i14, String str, String str2, u uVar, Double d14, String str3, String str4, u1 u1Var) {
        if (63 != (i14 & 63)) {
            k1.h(i14, 63, a.f80640a.getF158591b());
            throw null;
        }
        this.f80634a = str;
        this.f80635b = str2;
        this.f80636c = uVar;
        this.f80637d = d14;
        this.f80638e = str3;
        this.f80639f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f80634a, bVar.f80634a) && s.g(this.f80635b, bVar.f80635b) && this.f80636c == bVar.f80636c && s.g(this.f80637d, bVar.f80637d) && s.g(this.f80638e, bVar.f80638e) && s.g(this.f80639f, bVar.f80639f);
    }

    public final int hashCode() {
        int iHashCode = (this.f80636c.hashCode() + g.j(this.f80634a.hashCode() * 31, 31, this.f80635b)) * 31;
        Double d14 = this.f80637d;
        return this.f80639f.hashCode() + g.j((iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31, 31, this.f80638e);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("FavoriteFoodDetailsDTO(foodId=", this.f80634a, ", servingId=", this.f80635b, ", source=");
        sbI.append(this.f80636c);
        sbI.append(", servingQty=");
        sbI.append(this.f80637d);
        sbI.append(", regionCode=");
        return e5.h(sbI, this.f80638e, ", languageCode=", this.f80639f, ")");
    }

    /* JADX INFO: renamed from: h01.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lh01/b$b;", "", "<init>", "()V", "Li63/c;", "Lh01/b;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<b> serializer() {
            return a.f80640a;
        }

        private Companion() {
        }
    }

    public b(String str, String str2, u uVar, Double d14, String str3, String str4) {
        str.getClass();
        str2.getClass();
        uVar.getClass();
        str3.getClass();
        str4.getClass();
        this.f80634a = str;
        this.f80635b = str2;
        this.f80636c = uVar;
        this.f80637d = d14;
        this.f80638e = str3;
        this.f80639f = str4;
    }
}
