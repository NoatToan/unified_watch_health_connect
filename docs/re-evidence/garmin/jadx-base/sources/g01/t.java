package g01;

import java.util.List;
import m63.k1;
import m63.m1;
import m63.u1;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u0011B$\u0012\u0013\b\u0002\u0010\u0005\u001a\r\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB3\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000e¨\u0006\u0012"}, d2 = {"Lg01/t;", "", "", "Lg01/a;", "Li63/d;", "results", "", "moreDataAvailable", "<init>", "(Ljava/util/List;Z)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/util/List;ZLm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final class t {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f74254c = {o13.m.a(o13.n.PUBLICATION, new q(3)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<g01.a> f74255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f74256b;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/data/model/consumable/FoodSearchResponseDTO.$serializer", "Lm63/e0;", "Lg01/t;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements m63.e0<t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f74257a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f74257a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.nutrition.data.model.consumable.FoodSearchResponseDTO", aVar, 2);
            m1Var.j("results", true);
            m1Var.j("moreDataAvailable", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            return new i63.c[]{t.f74254c[0].getValue(), m63.g.f116948a};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = t.f74254c;
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            boolean zG = false;
            List list = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    list = (List) cVarC.l(eVar2, 0, lVarArr[0].getValue(), list);
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
            return new t(i15, list, zG, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            t tVar = (t) obj;
            tVar.getClass();
            List<g01.a> list = tVar.f74255a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = t.f74254c;
            if (dVarC.C(eVar) || !p005kotlin.jvm.internal.s.g(list, j0.f134944a)) {
                dVarC.e(eVar, 0, lVarArr[0].getValue(), list);
            }
            dVarC.n(eVar, 1, tVar.f74256b);
            dVarC.b(eVar);
        }
    }

    public t(int i14, List list, boolean z14, u1 u1Var) {
        if (2 != (i14 & 2)) {
            k1.h(i14, 2, a.f74257a.getF158591b());
            throw null;
        }
        if ((i14 & 1) == 0) {
            this.f74255a = j0.f134944a;
        } else {
            this.f74255a = list;
        }
        this.f74256b = z14;
    }

    /* JADX INFO: renamed from: g01.t$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg01/t$b;", "", "<init>", "()V", "Li63/c;", "Lg01/t;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<t> serializer() {
            return a.f74257a;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t(List<? extends g01.a> list, boolean z14) {
        list.getClass();
        this.f74255a = list;
        this.f74256b = z14;
    }

    public t(List list, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? j0.f134944a : list, z14);
    }
}
