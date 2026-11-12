package i01;

import b63.o;
import ht1.v;
import java.util.List;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Li01/h;", "", "Lb63/o;", "date", "", "Li01/f;", "logItems", "<init>", "(Lb63/o;Ljava/util/List;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILb63/o;Ljava/util/List;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class h {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f86765c = {null, o13.m.a(n.PUBLICATION, new v(28))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f86766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<f> f86767b;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/data/model/log/FoodLogRequestDTO.$serializer", "Lm63/e0;", "Li01/h;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f86768a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f86768a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.nutrition.data.model.log.FoodLogRequestDTO", aVar, 2);
            m1Var.j("mealDate", true);
            m1Var.j("foodLogItems", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            return new i63.c[]{j63.a.d(h63.k.f82304a), j63.a.d(h.f86765c[1].getValue())};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = h.f86765c;
            int i14 = l63.c.f110557a;
            u1 u1Var = null;
            boolean z14 = true;
            int i15 = 0;
            o oVar = null;
            List list = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    oVar = (o) cVarC.v(eVar2, 0, h63.k.f82304a, oVar);
                    i15 |= 1;
                } else {
                    if (iE != 1) {
                        hb.a.o(iE);
                        return null;
                    }
                    list = (List) cVarC.v(eVar2, 1, lVarArr[1].getValue(), list);
                    i15 |= 2;
                }
            }
            cVarC.b(eVar2);
            return new h(i15, oVar, list, u1Var);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            h hVar = (h) obj;
            hVar.getClass();
            o oVar = hVar.f86766a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = h.f86765c;
            if (dVarC.C(eVar) || oVar != null) {
                dVarC.d(eVar, 0, h63.k.f82304a, oVar);
            }
            dVarC.d(eVar, 1, lVarArr[1].getValue(), hVar.f86767b);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ h(int i14, o oVar, List list, u1 u1Var) {
        if (2 != (i14 & 2)) {
            k1.h(i14, 2, a.f86768a.getF158591b());
            throw null;
        }
        if ((i14 & 1) == 0) {
            this.f86766a = null;
        } else {
            this.f86766a = oVar;
        }
        this.f86767b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return s.g(this.f86766a, hVar.f86766a) && s.g(this.f86767b, hVar.f86767b);
    }

    public final int hashCode() {
        o oVar = this.f86766a;
        int iHashCode = (oVar == null ? 0 : oVar.f16206a.hashCode()) * 31;
        List<f> list = this.f86767b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "FoodLogRequestDTO(date=" + this.f86766a + ", logItems=" + this.f86767b + ")";
    }

    /* JADX INFO: renamed from: i01.h$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li01/h$b;", "", "<init>", "()V", "Li63/c;", "Li01/h;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<h> serializer() {
            return a.f86768a;
        }

        private Companion() {
        }
    }

    public h(o oVar, List<f> list) {
        this.f86766a = oVar;
        this.f86767b = list;
    }

    public /* synthetic */ h(o oVar, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : oVar, list);
    }
}
