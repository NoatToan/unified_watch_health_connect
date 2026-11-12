package jk0;

import java.util.List;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Ljk0/i;", "", "Lc80/u;", "gearType", "", "Ljk0/h;", "brandLists", "<init>", "(Lc80/u;Ljava/util/List;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILc80/u;Ljava/util/List;Lm63/u1;)V", "Companion", "a", "b", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class i {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f99257c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c80.u f99258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<h> f99259b;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/gear/data/model/GearBrandModelsDTO.$serializer", "Lm63/e0;", "Ljk0/i;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f99260a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f99260a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.gear.data.model.GearBrandModelsDTO", aVar, 2);
            m1Var.j("gearType", false);
            m1Var.j("brandLists", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            o13.l<i63.c<Object>>[] lVarArr = i.f99257c;
            return new i63.c[]{lVarArr[0].getValue(), lVarArr[1].getValue()};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = i.f99257c;
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            c80.u uVar = null;
            List list = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    uVar = (c80.u) cVarC.l(eVar2, 0, lVarArr[0].getValue(), uVar);
                    i15 |= 1;
                } else {
                    if (iE != 1) {
                        hb.a.o(iE);
                        return null;
                    }
                    list = (List) cVarC.l(eVar2, 1, lVarArr[1].getValue(), list);
                    i15 |= 2;
                }
            }
            cVarC.b(eVar2);
            return new i(i15, uVar, list, (u1) null);
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
            o13.l<i63.c<Object>>[] lVarArr = i.f99257c;
            i63.c<Object> value = lVarArr[0].getValue();
            c80.u uVar = iVar.f99258a;
            List<h> list = iVar.f99259b;
            dVarC.e(eVar, 0, value, uVar);
            if (dVarC.C(eVar) || !p005kotlin.jvm.internal.s.g(list, j0.f134944a)) {
                dVarC.e(eVar, 1, lVarArr[1].getValue(), list);
            }
            dVarC.b(eVar);
        }
    }

    static {
        o13.n nVar = o13.n.PUBLICATION;
        f99257c = new o13.l[]{o13.m.a(nVar, new je0.o(11)), o13.m.a(nVar, new je0.o(12))};
    }

    public i(int i14, c80.u uVar, List list, u1 u1Var) {
        if (1 != (i14 & 1)) {
            k1.h(i14, 1, a.f99260a.getF158591b());
            throw null;
        }
        this.f99258a = uVar;
        if ((i14 & 2) == 0) {
            this.f99259b = j0.f134944a;
        } else {
            this.f99259b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f99258a == iVar.f99258a && p005kotlin.jvm.internal.s.g(this.f99259b, iVar.f99259b);
    }

    public final int hashCode() {
        return this.f99259b.hashCode() + (this.f99258a.hashCode() * 31);
    }

    public final String toString() {
        return "GearBrandModelsDTO(gearType=" + this.f99258a + ", brandLists=" + this.f99259b + ")";
    }

    /* JADX INFO: renamed from: jk0.i$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljk0/i$b;", "", "<init>", "()V", "Li63/c;", "Ljk0/i;", "serializer", "()Li63/c;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<i> serializer() {
            return a.f99260a;
        }

        private Companion() {
        }
    }

    public i(c80.u uVar, List<h> list) {
        uVar.getClass();
        list.getClass();
        this.f99258a = uVar;
        this.f99259b = list;
    }

    public i(c80.u uVar, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this(uVar, (i14 & 2) != 0 ? j0.f134944a : list);
    }
}
