package st2;

import com.google.firebase.messaging.Constants;
import i63.h;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.y1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u0011B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000e¨\u0006\u0012"}, d2 = {"Lst2/e;", "", "", "passcode", "Lst2/b;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "decryptionFailed", "<init>", "(Ljava/lang/String;Lst2/b;Ljava/lang/Boolean;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Lst2/b;Ljava/lang/Boolean;Lm63/u1;)V", "Companion", "a", "b", "livetrack_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@h
public final /* data */ class e {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f160925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f160926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f160927c;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/livetrack/settings/dto/ProfilePasscode.$serializer", "Lm63/e0;", "Lst2/e;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "livetrack_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @o13.e
    public /* synthetic */ class a implements e0<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f160928a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f160928a = aVar;
            m1 m1Var = new m1("com.garmin.livetrack.settings.dto.ProfilePasscode", aVar, 3);
            m1Var.j("passcode", false);
            m1Var.j(Constants.IPC_BUNDLE_KEY_SEND_ERROR, true);
            m1Var.j("decryptionFailed", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            return new i63.c[]{y1.f117048a, j63.a.d(b.a.f160917a), j63.a.d(m63.g.f116948a)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            String strR = null;
            b bVar = null;
            Boolean bool = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    strR = cVarC.r(eVar2, 0);
                    i15 |= 1;
                } else if (iE == 1) {
                    bVar = (b) cVarC.v(eVar2, 1, b.a.f160917a, bVar);
                    i15 |= 2;
                } else {
                    if (iE != 2) {
                        hb.a.o(iE);
                        return null;
                    }
                    bool = (Boolean) cVarC.v(eVar2, 2, m63.g.f116948a, bool);
                    i15 |= 4;
                }
            }
            cVarC.b(eVar2);
            return new e(i15, strR, bVar, bool, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0045  */
        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            Integer num;
            e eVar = (e) obj;
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.d dVarC = fVar.c(eVar2);
            String str = eVar.f160925a;
            Boolean bool = eVar.f160927c;
            b bVar = eVar.f160926b;
            boolean z14 = false;
            dVarC.k(eVar2, 0, str);
            if (dVarC.C(eVar2) || bVar != null) {
                dVarC.d(eVar2, 1, b.a.f160917a, bVar);
            }
            if (dVarC.C(eVar2)) {
                dVarC.d(eVar2, 2, m63.g.f116948a, bool);
            } else {
                if (bVar != null && (num = bVar.f160916f) != null && num.intValue() == 6007) {
                    z14 = true;
                }
                if (!s.g(bool, Boolean.valueOf(z14))) {
                    dVarC.d(eVar2, 2, m63.g.f116948a, bool);
                }
            }
            dVarC.b(eVar2);
        }
    }

    public e(int i14, String str, b bVar, Boolean bool, u1 u1Var) {
        Integer num;
        if (1 != (i14 & 1)) {
            k1.h(i14, 1, a.f160928a.getF158591b());
            throw null;
        }
        this.f160925a = str;
        if ((i14 & 2) == 0) {
            this.f160926b = null;
        } else {
            this.f160926b = bVar;
        }
        if ((i14 & 4) != 0) {
            this.f160927c = bool;
        } else {
            b bVar2 = this.f160926b;
            this.f160927c = Boolean.valueOf((bVar2 == null || (num = bVar2.f160916f) == null || num.intValue() != 6007) ? false : true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.f160925a, eVar.f160925a) && s.g(this.f160926b, eVar.f160926b) && s.g(this.f160927c, eVar.f160927c);
    }

    public final int hashCode() {
        int iHashCode = this.f160925a.hashCode() * 31;
        b bVar = this.f160926b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Boolean bool = this.f160927c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ProfilePasscode(passcode=");
        sb3.append(this.f160925a);
        sb3.append(", error=");
        sb3.append(this.f160926b);
        sb3.append(", decryptionFailed=");
        return p6.b.f(sb3, this.f160927c, ")");
    }

    /* JADX INFO: renamed from: st2.e$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lst2/e$b;", "", "<init>", "()V", "Li63/c;", "Lst2/e;", "serializer", "()Li63/c;", "livetrack_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final i63.c<e> serializer() {
            return a.f160928a;
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    public e(String str, b bVar, Boolean bool) {
        str.getClass();
        this.f160925a = str;
        this.f160926b = bVar;
        this.f160927c = bool;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e(String str, b bVar, Boolean bool, int i14, j jVar) {
        Integer num;
        bVar = (i14 & 2) != 0 ? null : bVar;
        if ((i14 & 4) != 0) {
            boolean z14 = false;
            if (bVar != null && (num = bVar.f160916f) != null && num.intValue() == 6007) {
                z14 = true;
            }
            bool = Boolean.valueOf(z14);
        }
        this(str, bVar, bool);
    }
}
