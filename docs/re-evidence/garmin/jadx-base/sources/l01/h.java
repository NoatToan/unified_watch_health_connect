package l01;

import java.util.List;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Ll01/h;", "", "", "isTrackingEnabled", "", "Ll01/g;", "micronutrients", "<init>", "(Ljava/lang/Boolean;Ljava/util/List;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/util/List;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class h {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f107863c = {null, m.a(n.PUBLICATION, new b(3))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f107864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<g> f107865b;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/data/model/settings/MicronutrientsSettingsDTO.$serializer", "Lm63/e0;", "Ll01/h;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f107866a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f107866a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.nutrition.data.model.settings.MicronutrientsSettingsDTO", aVar, 2);
            m1Var.j("isTrackingEnabled", false);
            m1Var.j("micronutrients", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            return new i63.c[]{j63.a.d(m63.g.f116948a), j63.a.d(h.f107863c[1].getValue())};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = h.f107863c;
            int i14 = l63.c.f110557a;
            u1 u1Var = null;
            boolean z14 = true;
            int i15 = 0;
            Boolean bool = null;
            List list = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    bool = (Boolean) cVarC.v(eVar2, 0, m63.g.f116948a, bool);
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
            return new h(i15, bool, list, u1Var);
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
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = h.f107863c;
            dVarC.d(eVar, 0, m63.g.f116948a, hVar.f107864a);
            dVarC.d(eVar, 1, lVarArr[1].getValue(), hVar.f107865b);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ h(int i14, Boolean bool, List list, u1 u1Var) {
        if (3 != (i14 & 3)) {
            k1.h(i14, 3, a.f107866a.getF158591b());
            throw null;
        }
        this.f107864a = bool;
        this.f107865b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return s.g(this.f107864a, hVar.f107864a) && s.g(this.f107865b, hVar.f107865b);
    }

    public final int hashCode() {
        Boolean bool = this.f107864a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<g> list = this.f107865b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "MicronutrientsSettingsDTO(isTrackingEnabled=" + this.f107864a + ", micronutrients=" + this.f107865b + ")";
    }

    /* JADX INFO: renamed from: l01.h$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ll01/h$b;", "", "<init>", "()V", "Li63/c;", "Ll01/h;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<h> serializer() {
            return a.f107866a;
        }

        private Companion() {
        }
    }

    public h(Boolean bool, List<g> list) {
        this.f107864a = bool;
        this.f107865b = list;
    }
}
