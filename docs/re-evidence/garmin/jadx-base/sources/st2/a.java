package st2;

import i63.h;
import m63.e0;
import m63.m1;
import m63.u1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Lst2/a;", "", "", "courseSharing", "autoStart", "spectatorText", "spectatorAudio", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lm63/u1;)V", "Companion", "a", "b", "livetrack_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@h
public final /* data */ class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f160906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f160907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f160908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f160909d;

    /* JADX INFO: renamed from: st2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/livetrack/settings/dto/DeviceSettings.$serializer", "Lm63/e0;", "Lst2/a;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "livetrack_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @o13.e
    public /* synthetic */ class C3038a implements e0<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C3038a f160910a;
        private static final k63.e descriptor;

        static {
            C3038a c3038a = new C3038a();
            f160910a = c3038a;
            m1 m1Var = new m1("com.garmin.livetrack.settings.dto.DeviceSettings", c3038a, 4);
            m1Var.j("courseSharingEnabled", true);
            m1Var.j("autoStart", true);
            m1Var.j("spectatorText", true);
            m1Var.j("spectatorAudio", true);
            descriptor = m1Var;
        }

        private C3038a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            m63.g gVar = m63.g.f116948a;
            return new i63.c[]{j63.a.d(gVar), j63.a.d(gVar), j63.a.d(gVar), j63.a.d(gVar)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    bool = (Boolean) cVarC.v(eVar2, 0, m63.g.f116948a, bool);
                    i15 |= 1;
                } else if (iE == 1) {
                    bool2 = (Boolean) cVarC.v(eVar2, 1, m63.g.f116948a, bool2);
                    i15 |= 2;
                } else if (iE == 2) {
                    bool3 = (Boolean) cVarC.v(eVar2, 2, m63.g.f116948a, bool3);
                    i15 |= 4;
                } else {
                    if (iE != 3) {
                        hb.a.o(iE);
                        return null;
                    }
                    bool4 = (Boolean) cVarC.v(eVar2, 3, m63.g.f116948a, bool4);
                    i15 |= 8;
                }
            }
            cVarC.b(eVar2);
            return new a(i15, bool, bool2, bool3, bool4, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            a aVar = (a) obj;
            aVar.getClass();
            Boolean bool = aVar.f160909d;
            Boolean bool2 = aVar.f160908c;
            Boolean bool3 = aVar.f160907b;
            Boolean bool4 = aVar.f160906a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            if (dVarC.C(eVar) || bool4 != null) {
                dVarC.d(eVar, 0, m63.g.f116948a, bool4);
            }
            if (dVarC.C(eVar) || bool3 != null) {
                dVarC.d(eVar, 1, m63.g.f116948a, bool3);
            }
            if (dVarC.C(eVar) || bool2 != null) {
                dVarC.d(eVar, 2, m63.g.f116948a, bool2);
            }
            if (dVarC.C(eVar) || bool != null) {
                dVarC.d(eVar, 3, m63.g.f116948a, bool);
            }
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ a(int i14, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f160906a = null;
        } else {
            this.f160906a = bool;
        }
        if ((i14 & 2) == 0) {
            this.f160907b = null;
        } else {
            this.f160907b = bool2;
        }
        if ((i14 & 4) == 0) {
            this.f160908c = null;
        } else {
            this.f160908c = bool3;
        }
        if ((i14 & 8) == 0) {
            this.f160909d = null;
        } else {
            this.f160909d = bool4;
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
        return s.g(this.f160906a, aVar.f160906a) && s.g(this.f160907b, aVar.f160907b) && s.g(this.f160908c, aVar.f160908c) && s.g(this.f160909d, aVar.f160909d);
    }

    public final int hashCode() {
        Boolean bool = this.f160906a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f160907b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f160908c;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f160909d;
        return iHashCode3 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final String toString() {
        return "DeviceSettings(courseSharing=" + this.f160906a + ", autoStart=" + this.f160907b + ", spectatorText=" + this.f160908c + ", spectatorAudio=" + this.f160909d + ")";
    }

    /* JADX INFO: renamed from: st2.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lst2/a$b;", "", "<init>", "()V", "Li63/c;", "Lst2/a;", "serializer", "()Li63/c;", "livetrack_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final i63.c<a> serializer() {
            return C3038a.f160910a;
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    public a() {
        this((Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, 15, (j) null);
    }

    public a(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.f160906a = bool;
        this.f160907b = bool2;
        this.f160908c = bool3;
        this.f160909d = bool4;
    }

    public /* synthetic */ a(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : bool, (i14 & 2) != 0 ? null : bool2, (i14 & 4) != 0 ? null : bool3, (i14 & 8) != 0 ? null : bool4);
    }
}
