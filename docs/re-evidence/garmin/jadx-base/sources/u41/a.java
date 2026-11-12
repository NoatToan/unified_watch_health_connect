package u41;

import b71.i;
import i63.c;
import i63.h;
import l63.d;
import l63.f;
import m63.e0;
import m63.g;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.x;
import m63.y1;
import o13.e;
import o13.l;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import u1.p1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0002\u001a\u001bB{\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013B{\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018¨\u0006\u001c"}, d2 = {"Lu41/a;", "", "Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/b;", "paceBandSummaryDTO", "", "courseId", "", "distance", "", "time", "Lt41/a;", "distanceUnitType", "", "isOtherClicked", "eventName", "isEventDistanceMatchingCourse", "shouldReturnToPaceProList", "isRelatedPaceProPlan", "<init>", "(Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/b;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;Lt41/a;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;ZZ)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILcom/garmin/android/apps/connectmobile/pacepro/data/dto/b;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;Lt41/a;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;ZZLm63/u1;)V", "Companion", "b", "a", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final /* data */ class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final l<c<Object>>[] f168597k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.pacepro.data.dto.b f168598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f168599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f168600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f168601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t41.a f168602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Boolean f168603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f168604g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f168605h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f168606i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f168607j;

    /* JADX INFO: renamed from: u41.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/pacepro/domain/model/PaceProDetailsInitialParams.$serializer", "Lm63/e0;", "Lu41/a;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @e
    public static final /* synthetic */ class C3162a implements e0<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C3162a f168608a;
        private static final k63.e descriptor;

        static {
            C3162a c3162a = new C3162a();
            f168608a = c3162a;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.pacepro.domain.model.PaceProDetailsInitialParams", c3162a, 10);
            m1Var.j("paceBandSummaryDTO", true);
            m1Var.j("courseId", true);
            m1Var.j("distance", true);
            m1Var.j("time", true);
            m1Var.j("distanceUnitType", true);
            m1Var.j("isOtherClicked", true);
            m1Var.j("eventName", true);
            m1Var.j("isEventDistanceMatchingCourse", true);
            m1Var.j("shouldReturnToPaceProList", true);
            m1Var.j("isRelatedPaceProPlan", true);
            descriptor = m1Var;
        }

        private C3162a() {
        }

        @Override // m63.e0
        public final c<?>[] childSerializers() {
            l<c<Object>>[] lVarArr = a.f168597k;
            c<?> cVarD = j63.a.d(com.garmin.android.apps.connectmobile.pacepro.data.dto.b.a.f39782a);
            y1 y1Var = y1.f117048a;
            c<?> cVarD2 = j63.a.d(y1Var);
            c<?> cVarD3 = j63.a.d(x.f117036a);
            c<?> cVarD4 = j63.a.d(v0.f117027a);
            c<?> cVarD5 = j63.a.d(lVarArr[4].getValue());
            g gVar = g.f116948a;
            return new c[]{cVarD, cVarD2, cVarD3, cVarD4, cVarD5, j63.a.d(gVar), j63.a.d(y1Var), j63.a.d(gVar), gVar, gVar};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            l<c<Object>>[] lVarArr = a.f168597k;
            int i14 = l63.c.f110557a;
            Object obj = null;
            boolean z14 = true;
            Boolean bool = null;
            com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar = null;
            String str = null;
            Double d14 = null;
            Long l14 = null;
            t41.a aVar = null;
            Boolean bool2 = null;
            String str2 = null;
            int i15 = 0;
            boolean zG = false;
            boolean zG2 = false;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        break;
                    case 0:
                        bVar = (com.garmin.android.apps.connectmobile.pacepro.data.dto.b) cVarC.v(eVar2, 0, com.garmin.android.apps.connectmobile.pacepro.data.dto.b.a.f39782a, bVar);
                        i15 |= 1;
                        break;
                    case 1:
                        str = (String) cVarC.v(eVar2, 1, y1.f117048a, str);
                        i15 |= 2;
                        break;
                    case 2:
                        d14 = (Double) cVarC.v(eVar2, 2, x.f117036a, d14);
                        i15 |= 4;
                        break;
                    case 3:
                        l14 = (Long) cVarC.v(eVar2, 3, v0.f117027a, l14);
                        i15 |= 8;
                        break;
                    case 4:
                        aVar = (t41.a) cVarC.v(eVar2, 4, lVarArr[4].getValue(), aVar);
                        i15 |= 16;
                        break;
                    case 5:
                        bool2 = (Boolean) cVarC.v(eVar2, 5, g.f116948a, bool2);
                        i15 |= 32;
                        break;
                    case 6:
                        str2 = (String) cVarC.v(eVar2, 6, y1.f117048a, str2);
                        i15 |= 64;
                        break;
                    case 7:
                        bool = (Boolean) cVarC.v(eVar2, 7, g.f116948a, bool);
                        i15 |= 128;
                        break;
                    case 8:
                        zG = cVarC.g(eVar2, 8);
                        i15 |= 256;
                        break;
                    case 9:
                        zG2 = cVarC.g(eVar2, 9);
                        i15 |= 512;
                        break;
                    default:
                        hb.a.o(iE);
                        return obj;
                }
                obj = null;
            }
            cVarC.b(eVar2);
            return new a(i15, bVar, str, d14, l14, aVar, bool2, str2, bool, zG, zG2, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(f fVar, Object obj) {
            a aVar = (a) obj;
            aVar.getClass();
            boolean z14 = aVar.f168607j;
            boolean z15 = aVar.f168606i;
            Boolean bool = aVar.f168605h;
            String str = aVar.f168604g;
            Boolean bool2 = aVar.f168603f;
            t41.a aVar2 = aVar.f168602e;
            Long l14 = aVar.f168601d;
            Double d14 = aVar.f168600c;
            String str2 = aVar.f168599b;
            com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar = aVar.f168598a;
            k63.e eVar = descriptor;
            d dVarC = fVar.c(eVar);
            l<c<Object>>[] lVarArr = a.f168597k;
            if (dVarC.C(eVar) || bVar != null) {
                dVarC.d(eVar, 0, com.garmin.android.apps.connectmobile.pacepro.data.dto.b.a.f39782a, bVar);
            }
            if (dVarC.C(eVar) || str2 != null) {
                dVarC.d(eVar, 1, y1.f117048a, str2);
            }
            if (dVarC.C(eVar) || d14 != null) {
                dVarC.d(eVar, 2, x.f117036a, d14);
            }
            if (dVarC.C(eVar) || l14 != null) {
                dVarC.d(eVar, 3, v0.f117027a, l14);
            }
            if (dVarC.C(eVar) || aVar2 != null) {
                dVarC.d(eVar, 4, lVarArr[4].getValue(), aVar2);
            }
            if (dVarC.C(eVar) || bool2 != null) {
                dVarC.d(eVar, 5, g.f116948a, bool2);
            }
            if (dVarC.C(eVar) || str != null) {
                dVarC.d(eVar, 6, y1.f117048a, str);
            }
            if (dVarC.C(eVar) || bool != null) {
                dVarC.d(eVar, 7, g.f116948a, bool);
            }
            if (dVarC.C(eVar) || !z15) {
                dVarC.n(eVar, 8, z15);
            }
            if (dVarC.C(eVar) || z14) {
                dVarC.n(eVar, 9, z14);
            }
            dVarC.b(eVar);
        }
    }

    static {
        com.garmin.android.apps.connectmobile.pacepro.data.dto.b.Companion companion = com.garmin.android.apps.connectmobile.pacepro.data.dto.b.INSTANCE;
        f168597k = new l[]{null, null, null, null, m.a(n.PUBLICATION, new p1(4)), null, null, null, null, null};
    }

    public /* synthetic */ a(int i14, com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar, String str, Double d14, Long l14, t41.a aVar, Boolean bool, String str2, Boolean bool2, boolean z14, boolean z15, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f168598a = null;
        } else {
            this.f168598a = bVar;
        }
        if ((i14 & 2) == 0) {
            this.f168599b = null;
        } else {
            this.f168599b = str;
        }
        if ((i14 & 4) == 0) {
            this.f168600c = null;
        } else {
            this.f168600c = d14;
        }
        if ((i14 & 8) == 0) {
            this.f168601d = null;
        } else {
            this.f168601d = l14;
        }
        if ((i14 & 16) == 0) {
            this.f168602e = null;
        } else {
            this.f168602e = aVar;
        }
        if ((i14 & 32) == 0) {
            this.f168603f = null;
        } else {
            this.f168603f = bool;
        }
        if ((i14 & 64) == 0) {
            this.f168604g = null;
        } else {
            this.f168604g = str2;
        }
        if ((i14 & 128) == 0) {
            this.f168605h = null;
        } else {
            this.f168605h = bool2;
        }
        if ((i14 & 256) == 0) {
            this.f168606i = true;
        } else {
            this.f168606i = z14;
        }
        if ((i14 & 512) == 0) {
            this.f168607j = false;
        } else {
            this.f168607j = z15;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f168598a, aVar.f168598a) && s.g(this.f168599b, aVar.f168599b) && s.g(this.f168600c, aVar.f168600c) && s.g(this.f168601d, aVar.f168601d) && this.f168602e == aVar.f168602e && s.g(this.f168603f, aVar.f168603f) && s.g(this.f168604g, aVar.f168604g) && s.g(this.f168605h, aVar.f168605h) && this.f168606i == aVar.f168606i && this.f168607j == aVar.f168607j;
    }

    public final int hashCode() {
        com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar = this.f168598a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        String str = this.f168599b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d14 = this.f168600c;
        int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Long l14 = this.f168601d;
        int iHashCode4 = (iHashCode3 + (l14 == null ? 0 : l14.hashCode())) * 31;
        t41.a aVar = this.f168602e;
        int iHashCode5 = (iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Boolean bool = this.f168603f;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f168604g;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool2 = this.f168605h;
        return Boolean.hashCode(this.f168607j) + q6.f.g((iHashCode7 + (bool2 != null ? bool2.hashCode() : 0)) * 31, 31, this.f168606i);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PaceProDetailsInitialParams(paceBandSummaryDTO=");
        sb3.append(this.f168598a);
        sb3.append(", courseId=");
        sb3.append(this.f168599b);
        sb3.append(", distance=");
        sb3.append(this.f168600c);
        sb3.append(", time=");
        sb3.append(this.f168601d);
        sb3.append(", distanceUnitType=");
        sb3.append(this.f168602e);
        sb3.append(", isOtherClicked=");
        sb3.append(this.f168603f);
        sb3.append(", eventName=");
        i.w(sb3, this.f168604g, ", isEventDistanceMatchingCourse=", this.f168605h, ", shouldReturnToPaceProList=");
        return com.airbnb.lottie.animation.keyframe.a.f(", isRelatedPaceProPlan=", ")", sb3, this.f168606i, this.f168607j);
    }

    /* JADX INFO: renamed from: u41.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lu41/a$b;", "", "<init>", "()V", "Li63/c;", "Lu41/a;", "serializer", "()Li63/c;", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final c<a> serializer() {
            return C3162a.f168608a;
        }

        private Companion() {
        }
    }

    public a() {
        this((com.garmin.android.apps.connectmobile.pacepro.data.dto.b) null, (String) null, (Double) null, (Long) null, (t41.a) null, (Boolean) null, (String) null, (Boolean) null, false, false, 1023, (j) null);
    }

    public a(com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar, String str, Double d14, Long l14, t41.a aVar, Boolean bool, String str2, Boolean bool2, boolean z14, boolean z15) {
        this.f168598a = bVar;
        this.f168599b = str;
        this.f168600c = d14;
        this.f168601d = l14;
        this.f168602e = aVar;
        this.f168603f = bool;
        this.f168604g = str2;
        this.f168605h = bool2;
        this.f168606i = z14;
        this.f168607j = z15;
    }

    public /* synthetic */ a(com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar, String str, Double d14, Long l14, t41.a aVar, Boolean bool, String str2, Boolean bool2, boolean z14, boolean z15, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : bVar, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : d14, (i14 & 8) != 0 ? null : l14, (i14 & 16) != 0 ? null : aVar, (i14 & 32) != 0 ? null : bool, (i14 & 64) != 0 ? null : str2, (i14 & 128) != 0 ? null : bool2, (i14 & 256) != 0 ? true : z14, (i14 & 512) != 0 ? false : z15);
    }
}
