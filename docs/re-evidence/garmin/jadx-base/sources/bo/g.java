package bo;

import com.garmin.android.apps.connectmobile.f3;
import m63.e0;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.y1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\r¨\u0006\u0011"}, d2 = {"Lbo/g;", "", "", "typeId", "", "typeKey", "", "sortOrder", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Lm63/u1;)V", "Companion", "a", "b", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class g {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f19116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f19118c;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/activities/history/data/model/EventTypeDTO.$serializer", "Lm63/e0;", "Lbo/g;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f19119a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f19119a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.activities.history.data.model.EventTypeDTO", aVar, 3);
            m1Var.j("typeId", true);
            m1Var.j("typeKey", true);
            m1Var.j("sortOrder", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            return new i63.c[]{j63.a.d(v0.f117027a), j63.a.d(y1.f117048a), j63.a.d(m0.f116981a)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            Long l14 = null;
            String str = null;
            Integer num = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    l14 = (Long) cVarC.v(eVar2, 0, v0.f117027a, l14);
                    i15 |= 1;
                } else if (iE == 1) {
                    str = (String) cVarC.v(eVar2, 1, y1.f117048a, str);
                    i15 |= 2;
                } else {
                    if (iE != 2) {
                        hb.a.o(iE);
                        return null;
                    }
                    num = (Integer) cVarC.v(eVar2, 2, m0.f116981a, num);
                    i15 |= 4;
                }
            }
            cVarC.b(eVar2);
            return new g(i15, l14, str, num, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            g gVar = (g) obj;
            gVar.getClass();
            Integer num = gVar.f19118c;
            String str = gVar.f19117b;
            Long l14 = gVar.f19116a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            if (dVarC.C(eVar) || l14 != null) {
                dVarC.d(eVar, 0, v0.f117027a, l14);
            }
            if (dVarC.C(eVar) || str != null) {
                dVarC.d(eVar, 1, y1.f117048a, str);
            }
            if (dVarC.C(eVar) || num != null) {
                dVarC.d(eVar, 2, m0.f116981a, num);
            }
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ g(int i14, Long l14, String str, Integer num, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f19116a = null;
        } else {
            this.f19116a = l14;
        }
        if ((i14 & 2) == 0) {
            this.f19117b = null;
        } else {
            this.f19117b = str;
        }
        if ((i14 & 4) == 0) {
            this.f19118c = null;
        } else {
            this.f19118c = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.f19116a, gVar.f19116a) && s.g(this.f19117b, gVar.f19117b) && s.g(this.f19118c, gVar.f19118c);
    }

    public final int hashCode() {
        Long l14 = this.f19116a;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.f19117b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f19118c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return f3.i(b71.i.j("EventTypeDTO(typeId=", ", typeKey=", this.f19117b, this.f19116a, ", sortOrder="), this.f19118c, ")");
    }

    /* JADX INFO: renamed from: bo.g$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbo/g$b;", "", "<init>", "()V", "Li63/c;", "Lbo/g;", "serializer", "()Li63/c;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<g> serializer() {
            return a.f19119a;
        }

        private Companion() {
        }
    }

    public g() {
        this((Long) null, (String) null, (Integer) null, 7, (p005kotlin.jvm.internal.j) null);
    }

    public g(Long l14, String str, Integer num) {
        this.f19116a = l14;
        this.f19117b = str;
        this.f19118c = num;
    }

    public /* synthetic */ g(Long l14, String str, Integer num, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : num);
    }
}
