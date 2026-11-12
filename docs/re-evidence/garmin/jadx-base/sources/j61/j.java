package j61;

import java.util.Map;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import o13.m;
import o13.n;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0012B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nBG\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000f¨\u0006\u0013"}, d2 = {"Lj61/j;", "", "Lorg/joda/time/DateTime;", "startDate", "endDate", "", "", "Lj61/i;", "cyclingAbilitiesMap", "<init>", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/util/Map;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/util/Map;Lm63/u1;)V", "Companion", "a", "b", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class j {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f97356d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f97357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f97358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, i> f97359c;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/performance/cyclingability/model/CyclingAbilityReportDTO.$serializer", "Lm63/e0;", "Lj61/j;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f97360a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f97360a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.performance.cyclingability.model.CyclingAbilityReportDTO", aVar, 3);
            m1Var.j("startDate", false);
            m1Var.j("endDate", false);
            m1Var.j("cyclingAbilitiesMap", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            o13.l<i63.c<Object>>[] lVarArr = j.f97356d;
            return new i63.c[]{j63.a.d(lVarArr[0].getValue()), j63.a.d(lVarArr[1].getValue()), j63.a.d(lVarArr[2].getValue())};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = j.f97356d;
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            DateTime dateTime = null;
            DateTime dateTime2 = null;
            Map map = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    dateTime = (DateTime) cVarC.v(eVar2, 0, lVarArr[0].getValue(), dateTime);
                    i15 |= 1;
                } else if (iE == 1) {
                    dateTime2 = (DateTime) cVarC.v(eVar2, 1, lVarArr[1].getValue(), dateTime2);
                    i15 |= 2;
                } else {
                    if (iE != 2) {
                        hb.a.o(iE);
                        return null;
                    }
                    map = (Map) cVarC.v(eVar2, 2, lVarArr[2].getValue(), map);
                    i15 |= 4;
                }
            }
            cVarC.b(eVar2);
            return new j(i15, dateTime, dateTime2, map, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF116202c() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            j jVar = (j) obj;
            jVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = j.f97356d;
            dVarC.d(eVar, 0, lVarArr[0].getValue(), jVar.f97357a);
            dVarC.d(eVar, 1, lVarArr[1].getValue(), jVar.f97358b);
            dVarC.d(eVar, 2, lVarArr[2].getValue(), jVar.f97359c);
            dVarC.b(eVar);
        }
    }

    static {
        n nVar = n.PUBLICATION;
        f97356d = new o13.l[]{m.a(nVar, new j21.f(11)), m.a(nVar, new j21.f(12)), m.a(nVar, new j21.f(13))};
    }

    public /* synthetic */ j(int i14, DateTime dateTime, DateTime dateTime2, Map map, u1 u1Var) {
        if (7 != (i14 & 7)) {
            k1.h(i14, 7, a.f97360a.getF116202c());
            throw null;
        }
        this.f97357a = dateTime;
        this.f97358b = dateTime2;
        this.f97359c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return s.g(this.f97357a, jVar.f97357a) && s.g(this.f97358b, jVar.f97358b) && s.g(this.f97359c, jVar.f97359c);
    }

    public final int hashCode() {
        DateTime dateTime = this.f97357a;
        int iHashCode = (dateTime == null ? 0 : dateTime.hashCode()) * 31;
        DateTime dateTime2 = this.f97358b;
        int iHashCode2 = (iHashCode + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        Map<String, i> map = this.f97359c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CyclingAbilityReportDTO(startDate=");
        sb3.append(this.f97357a);
        sb3.append(", endDate=");
        sb3.append(this.f97358b);
        sb3.append(", cyclingAbilitiesMap=");
        return am.j.s(sb3, this.f97359c, ")");
    }

    /* JADX INFO: renamed from: j61.j$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lj61/j$b;", "", "<init>", "()V", "Li63/c;", "Lj61/j;", "serializer", "()Li63/c;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<j> serializer() {
            return a.f97360a;
        }

        private Companion() {
        }
    }

    public j(DateTime dateTime, DateTime dateTime2, Map<String, i> map) {
        this.f97357a = dateTime;
        this.f97358b = dateTime2;
        this.f97359c = map;
    }
}
