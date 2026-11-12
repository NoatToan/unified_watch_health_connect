package i01;

import ht1.v;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.y1;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0013B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010¨\u0006\u0014"}, d2 = {"Li01/b;", "", "", "logId", "Lb63/l;", "timestamp", "Lb63/v;", "mealTime", "", "mealId", "<init>", "(Ljava/lang/String;Lb63/l;Lb63/v;Ljava/lang/Long;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Lb63/l;Lb63/v;Ljava/lang/Long;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f86725e = {null, null, o13.m.a(n.PUBLICATION, new v(17)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f86726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b63.l f86727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b63.v f86728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f86729d;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/data/model/log/BulkFoodLogItemDTO.$serializer", "Lm63/e0;", "Li01/b;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f86730a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f86730a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.nutrition.data.model.log.BulkFoodLogItemDTO", aVar, 4);
            m1Var.j("logId", false);
            m1Var.j("logTimestamp", false);
            m1Var.j("mealTime", false);
            m1Var.j("mealId", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            return new i63.c[]{j63.a.d(y1.f117048a), j63.a.d(h63.j.f82302a), j63.a.d(b.f86725e[2].getValue()), j63.a.d(v0.f117027a)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = b.f86725e;
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            String str = null;
            b63.l lVar = null;
            b63.v vVar = null;
            Long l14 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    str = (String) cVarC.v(eVar2, 0, y1.f117048a, str);
                    i15 |= 1;
                } else if (iE == 1) {
                    lVar = (b63.l) cVarC.v(eVar2, 1, h63.j.f82302a, lVar);
                    i15 |= 2;
                } else if (iE == 2) {
                    vVar = (b63.v) cVarC.v(eVar2, 2, lVarArr[2].getValue(), vVar);
                    i15 |= 4;
                } else {
                    if (iE != 3) {
                        hb.a.o(iE);
                        return null;
                    }
                    l14 = (Long) cVarC.v(eVar2, 3, v0.f117027a, l14);
                    i15 |= 8;
                }
            }
            cVarC.b(eVar2);
            return new b(i15, str, lVar, vVar, l14, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            b bVar = (b) obj;
            bVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = b.f86725e;
            dVarC.d(eVar, 0, y1.f117048a, bVar.f86726a);
            dVarC.d(eVar, 1, h63.j.f82302a, bVar.f86727b);
            dVarC.d(eVar, 2, lVarArr[2].getValue(), bVar.f86728c);
            dVarC.d(eVar, 3, v0.f117027a, bVar.f86729d);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ b(int i14, String str, b63.l lVar, b63.v vVar, Long l14, u1 u1Var) {
        if (15 != (i14 & 15)) {
            k1.h(i14, 15, a.f86730a.getF158591b());
            throw null;
        }
        this.f86726a = str;
        this.f86727b = lVar;
        this.f86728c = vVar;
        this.f86729d = l14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f86726a, bVar.f86726a) && s.g(this.f86727b, bVar.f86727b) && s.g(this.f86728c, bVar.f86728c) && s.g(this.f86729d, bVar.f86729d);
    }

    public final int hashCode() {
        String str = this.f86726a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        b63.l lVar = this.f86727b;
        int iHashCode2 = (iHashCode + (lVar == null ? 0 : lVar.f16204a.hashCode())) * 31;
        b63.v vVar = this.f86728c;
        int iHashCode3 = (iHashCode2 + (vVar == null ? 0 : vVar.f16219a.hashCode())) * 31;
        Long l14 = this.f86729d;
        return iHashCode3 + (l14 != null ? l14.hashCode() : 0);
    }

    public final String toString() {
        return "BulkFoodLogItemDTO(logId=" + this.f86726a + ", timestamp=" + this.f86727b + ", mealTime=" + this.f86728c + ", mealId=" + this.f86729d + ")";
    }

    /* JADX INFO: renamed from: i01.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li01/b$b;", "", "<init>", "()V", "Li63/c;", "Li01/b;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<b> serializer() {
            return a.f86730a;
        }

        private Companion() {
        }
    }

    public b(String str, b63.l lVar, b63.v vVar, Long l14) {
        this.f86726a = str;
        this.f86727b = lVar;
        this.f86728c = vVar;
        this.f86729d = l14;
    }
}
