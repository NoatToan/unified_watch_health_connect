package i01;

import b63.o;
import b63.v;
import com.google.firebase.messaging.Constants;
import java.util.List;
import lc.u0;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.v0;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0002\u0016\u0017BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBc\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014¨\u0006\u0018"}, d2 = {"Li01/c;", "", "Li01/a;", "action", "Lb63/o;", Constants.MessagePayloadKeys.FROM, "", "to", "Li01/b;", "logItems", "", "targetMealId", "Lb63/v;", "targetMealTime", "<init>", "(Li01/a;Lb63/o;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lb63/v;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILi01/a;Lb63/o;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lb63/v;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class c {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f86731g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i01.a f86732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f86733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<o> f86734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<b> f86735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f86736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v f86737f;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/data/model/log/BulkFoodLogRequestDTO.$serializer", "Lm63/e0;", "Li01/c;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f86738a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f86738a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.nutrition.data.model.log.BulkFoodLogRequestDTO", aVar, 6);
            m1Var.j("action", false);
            m1Var.j(Constants.MessagePayloadKeys.FROM, false);
            m1Var.j("to", false);
            m1Var.j("foodLogItems", false);
            m1Var.j("targetMealId", true);
            m1Var.j("targetMealTime", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            o13.l<i63.c<Object>>[] lVarArr = c.f86731g;
            return new i63.c[]{lVarArr[0].getValue(), h63.k.f82304a, lVarArr[2].getValue(), lVarArr[3].getValue(), j63.a.d(v0.f117027a), j63.a.d(lVarArr[5].getValue())};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = c.f86731g;
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            i01.a aVar = null;
            o oVar = null;
            List list = null;
            List list2 = null;
            Long l14 = null;
            v vVar = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        break;
                    case 0:
                        aVar = (i01.a) cVarC.l(eVar2, 0, lVarArr[0].getValue(), aVar);
                        i15 |= 1;
                        break;
                    case 1:
                        oVar = (o) cVarC.l(eVar2, 1, h63.k.f82304a, oVar);
                        i15 |= 2;
                        break;
                    case 2:
                        list = (List) cVarC.l(eVar2, 2, lVarArr[2].getValue(), list);
                        i15 |= 4;
                        break;
                    case 3:
                        list2 = (List) cVarC.l(eVar2, 3, lVarArr[3].getValue(), list2);
                        i15 |= 8;
                        break;
                    case 4:
                        l14 = (Long) cVarC.v(eVar2, 4, v0.f117027a, l14);
                        i15 |= 16;
                        break;
                    case 5:
                        vVar = (v) cVarC.v(eVar2, 5, lVarArr[5].getValue(), vVar);
                        i15 |= 32;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            cVarC.b(eVar2);
            return new c(i15, aVar, oVar, list, list2, l14, vVar, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            c cVar = (c) obj;
            cVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = c.f86731g;
            i63.c<Object> value = lVarArr[0].getValue();
            i01.a aVar = cVar.f86732a;
            v vVar = cVar.f86737f;
            Long l14 = cVar.f86736e;
            dVarC.e(eVar, 0, value, aVar);
            dVarC.e(eVar, 1, h63.k.f82304a, cVar.f86733b);
            dVarC.e(eVar, 2, lVarArr[2].getValue(), cVar.f86734c);
            dVarC.e(eVar, 3, lVarArr[3].getValue(), cVar.f86735d);
            if (dVarC.C(eVar) || l14 != null) {
                dVarC.d(eVar, 4, v0.f117027a, l14);
            }
            if (dVarC.C(eVar) || vVar != null) {
                dVarC.d(eVar, 5, lVarArr[5].getValue(), vVar);
            }
            dVarC.b(eVar);
        }
    }

    static {
        n nVar = n.PUBLICATION;
        f86731g = new o13.l[]{o13.m.a(nVar, new ht1.v(18)), null, o13.m.a(nVar, new ht1.v(19)), o13.m.a(nVar, new ht1.v(20)), null, o13.m.a(nVar, new ht1.v(21))};
    }

    public /* synthetic */ c(int i14, i01.a aVar, o oVar, List list, List list2, Long l14, v vVar, u1 u1Var) {
        if (15 != (i14 & 15)) {
            k1.h(i14, 15, a.f86738a.getF158591b());
            throw null;
        }
        this.f86732a = aVar;
        this.f86733b = oVar;
        this.f86734c = list;
        this.f86735d = list2;
        if ((i14 & 16) == 0) {
            this.f86736e = null;
        } else {
            this.f86736e = l14;
        }
        if ((i14 & 32) == 0) {
            this.f86737f = null;
        } else {
            this.f86737f = vVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f86732a == cVar.f86732a && s.g(this.f86733b, cVar.f86733b) && s.g(this.f86734c, cVar.f86734c) && s.g(this.f86735d, cVar.f86735d) && s.g(this.f86736e, cVar.f86736e) && s.g(this.f86737f, cVar.f86737f);
    }

    public final int hashCode() {
        int iB = u0.b(u0.b(n23.j.a(this.f86733b.f16206a, this.f86732a.hashCode() * 31, 31), 31, this.f86734c), 31, this.f86735d);
        Long l14 = this.f86736e;
        int iHashCode = (iB + (l14 == null ? 0 : l14.hashCode())) * 31;
        v vVar = this.f86737f;
        return iHashCode + (vVar != null ? vVar.f16219a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BulkFoodLogRequestDTO(action=");
        sb3.append(this.f86732a);
        sb3.append(", from=");
        sb3.append(this.f86733b);
        sb3.append(", to=");
        n23.j.z(sb3, this.f86734c, ", logItems=", this.f86735d, ", targetMealId=");
        sb3.append(this.f86736e);
        sb3.append(", targetMealTime=");
        sb3.append(this.f86737f);
        sb3.append(")");
        return sb3.toString();
    }

    /* JADX INFO: renamed from: i01.c$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li01/c$b;", "", "<init>", "()V", "Li63/c;", "Li01/c;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<c> serializer() {
            return a.f86738a;
        }

        private Companion() {
        }
    }

    public c(i01.a aVar, o oVar, List<o> list, List<b> list2, Long l14, v vVar) {
        aVar.getClass();
        oVar.getClass();
        list.getClass();
        list2.getClass();
        this.f86732a = aVar;
        this.f86733b = oVar;
        this.f86734c = list;
        this.f86735d = list2;
        this.f86736e = l14;
        this.f86737f = vVar;
    }

    public /* synthetic */ c(i01.a aVar, o oVar, List list, List list2, Long l14, v vVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(aVar, oVar, list, list2, (i14 & 16) != 0 ? null : l14, (i14 & 32) != 0 ? null : vVar);
    }
}
