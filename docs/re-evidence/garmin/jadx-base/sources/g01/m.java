package g01;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.y1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u0011B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000e¨\u0006\u0012"}, d2 = {"Lg01/m;", "", "", "foodId", "regionCode", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lg01/u;", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lg01/u;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lg01/u;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class m {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f74218e = {null, null, null, o13.m.a(o13.n.PUBLICATION, new fy1.h(27))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f74220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f74221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f74222d;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/data/model/consumable/FoodKeyInfoDTO.$serializer", "Lm63/e0;", "Lg01/m;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements m63.e0<m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f74223a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f74223a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.nutrition.data.model.consumable.FoodKeyInfoDTO", aVar, 4);
            m1Var.j("foodId", false);
            m1Var.j("regionCode", false);
            m1Var.j(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, false);
            m1Var.j("source", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            o13.l<i63.c<Object>>[] lVarArr = m.f74218e;
            y1 y1Var = y1.f117048a;
            return new i63.c[]{y1Var, y1Var, y1Var, lVarArr[3].getValue()};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = m.f74218e;
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            String strR = null;
            String strR2 = null;
            String strR3 = null;
            u uVar = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    strR = cVarC.r(eVar2, 0);
                    i15 |= 1;
                } else if (iE == 1) {
                    strR2 = cVarC.r(eVar2, 1);
                    i15 |= 2;
                } else if (iE == 2) {
                    strR3 = cVarC.r(eVar2, 2);
                    i15 |= 4;
                } else {
                    if (iE != 3) {
                        hb.a.o(iE);
                        return null;
                    }
                    uVar = (u) cVarC.l(eVar2, 3, lVarArr[3].getValue(), uVar);
                    i15 |= 8;
                }
            }
            cVarC.b(eVar2);
            return new m(i15, strR, strR2, strR3, uVar, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            m mVar = (m) obj;
            mVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = m.f74218e;
            dVarC.k(eVar, 0, mVar.f74219a);
            dVarC.k(eVar, 1, mVar.f74220b);
            dVarC.k(eVar, 2, mVar.f74221c);
            dVarC.e(eVar, 3, lVarArr[3].getValue(), mVar.f74222d);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ m(int i14, String str, String str2, String str3, u uVar, u1 u1Var) {
        if (15 != (i14 & 15)) {
            k1.h(i14, 15, a.f74223a.getF158591b());
            throw null;
        }
        this.f74219a = str;
        this.f74220b = str2;
        this.f74221c = str3;
        this.f74222d = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return p005kotlin.jvm.internal.s.g(this.f74219a, mVar.f74219a) && p005kotlin.jvm.internal.s.g(this.f74220b, mVar.f74220b) && p005kotlin.jvm.internal.s.g(this.f74221c, mVar.f74221c) && this.f74222d == mVar.f74222d;
    }

    public final int hashCode() {
        return this.f74222d.hashCode() + wr.g.j(wr.g.j(this.f74219a.hashCode() * 31, 31, this.f74220b), 31, this.f74221c);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("FoodKeyInfoDTO(foodId=", this.f74219a, ", regionCode=", this.f74220b, ", languageCode=");
        sbI.append(this.f74221c);
        sbI.append(", source=");
        sbI.append(this.f74222d);
        sbI.append(")");
        return sbI.toString();
    }

    /* JADX INFO: renamed from: g01.m$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg01/m$b;", "", "<init>", "()V", "Li63/c;", "Lg01/m;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<m> serializer() {
            return a.f74223a;
        }

        private Companion() {
        }
    }

    public m(String str, String str2, String str3, u uVar) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        uVar.getClass();
        this.f74219a = str;
        this.f74220b = str2;
        this.f74221c = str3;
        this.f74222d = uVar;
    }
}
