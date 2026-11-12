package g01;

import java.util.List;
import m63.k1;
import m63.m1;
import m63.u1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Lg01/b0;", "", "", "Lg01/r;", "results", "", "moreDataAvailable", "<init>", "(Ljava/util/List;Z)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/util/List;ZLm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class b0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f74101c = {o13.m.a(o13.n.PUBLICATION, new q(16)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<r> f74102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f74103b;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/data/model/consumable/NaturalLanguageFoodResponseDTO.$serializer", "Lm63/e0;", "Lg01/b0;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements m63.e0<b0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f74104a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f74104a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.nutrition.data.model.consumable.NaturalLanguageFoodResponseDTO", aVar, 2);
            m1Var.j("results", false);
            m1Var.j("moreDataAvailable", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            return new i63.c[]{j63.a.d(b0.f74101c[0].getValue()), m63.g.f116948a};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = b0.f74101c;
            int i14 = l63.c.f110557a;
            u1 u1Var = null;
            boolean z14 = true;
            int i15 = 0;
            boolean zG = false;
            List list = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    list = (List) cVarC.v(eVar2, 0, lVarArr[0].getValue(), list);
                    i15 |= 1;
                } else {
                    if (iE != 1) {
                        hb.a.o(iE);
                        return null;
                    }
                    zG = cVarC.g(eVar2, 1);
                    i15 |= 2;
                }
            }
            cVarC.b(eVar2);
            return new b0(i15, list, zG, u1Var);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            b0 b0Var = (b0) obj;
            b0Var.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            i63.c<Object> value = b0.f74101c[0].getValue();
            List<r> list = b0Var.f74102a;
            boolean z14 = b0Var.f74103b;
            dVarC.d(eVar, 0, value, list);
            if (dVarC.C(eVar) || z14) {
                dVarC.n(eVar, 1, z14);
            }
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ b0(int i14, List list, boolean z14, u1 u1Var) {
        if (1 != (i14 & 1)) {
            k1.h(i14, 1, a.f74104a.getF158591b());
            throw null;
        }
        this.f74102a = list;
        if ((i14 & 2) == 0) {
            this.f74103b = false;
        } else {
            this.f74103b = z14;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return p005kotlin.jvm.internal.s.g(this.f74102a, b0Var.f74102a) && this.f74103b == b0Var.f74103b;
    }

    public final int hashCode() {
        List<r> list = this.f74102a;
        return Boolean.hashCode(this.f74103b) + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        return "NaturalLanguageFoodResponseDTO(results=" + this.f74102a + ", moreDataAvailable=" + this.f74103b + ")";
    }

    /* JADX INFO: renamed from: g01.b0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg01/b0$b;", "", "<init>", "()V", "Li63/c;", "Lg01/b0;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<b0> serializer() {
            return a.f74104a;
        }

        private Companion() {
        }
    }

    public b0(List<r> list, boolean z14) {
        this.f74102a = list;
        this.f74103b = z14;
    }

    public /* synthetic */ b0(List list, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(list, (i14 & 2) != 0 ? false : z14);
    }
}
