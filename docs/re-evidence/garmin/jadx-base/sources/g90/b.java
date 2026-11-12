package g90;

import i63.h;
import l63.d;
import l63.f;
import m63.e0;
import m63.g;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.y1;
import n23.j;
import o13.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Lg90/b;", "", "", "text", "", "isEmphasis", "<init>", "(Ljava/lang/String;Z)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;ZLm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final /* data */ class b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f76466b;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/domain/consent/model/ConsentTextBodyBlock.$serializer", "Lm63/e0;", "Lg90/b;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @e
    public static final /* synthetic */ class a implements e0<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f76467a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f76467a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.device.setup.domain.consent.model.ConsentTextBodyBlock", aVar, 2);
            m1Var.j("text", false);
            m1Var.j("isEmphasis", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            return new i63.c[]{y1.f117048a, g.f116948a};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            u1 u1Var = null;
            boolean z14 = true;
            int i15 = 0;
            boolean zG = false;
            String strR = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    strR = cVarC.r(eVar2, 0);
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
            return new b(i15, strR, zG, u1Var);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(f fVar, Object obj) {
            b bVar = (b) obj;
            bVar.getClass();
            k63.e eVar = descriptor;
            d dVarC = fVar.c(eVar);
            String str = bVar.f76465a;
            boolean z14 = bVar.f76466b;
            dVarC.k(eVar, 0, str);
            if (dVarC.C(eVar) || z14) {
                dVarC.n(eVar, 1, z14);
            }
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ b(int i14, String str, boolean z14, u1 u1Var) {
        if (1 != (i14 & 1)) {
            k1.h(i14, 1, a.f76467a.getF158591b());
            throw null;
        }
        this.f76465a = str;
        if ((i14 & 2) == 0) {
            this.f76466b = false;
        } else {
            this.f76466b = z14;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f76465a, bVar.f76465a) && this.f76466b == bVar.f76466b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f76466b) + (this.f76465a.hashCode() * 31);
    }

    public final String toString() {
        return j.g("ConsentTextBodyBlock(text=", this.f76465a, ", isEmphasis=", this.f76466b, ")");
    }

    /* JADX INFO: renamed from: g90.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg90/b$b;", "", "<init>", "()V", "Li63/c;", "Lg90/b;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<b> serializer() {
            return a.f76467a;
        }

        private Companion() {
        }
    }

    public b(String str, boolean z14) {
        str.getClass();
        this.f76465a = str;
        this.f76466b = z14;
    }

    public /* synthetic */ b(String str, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? false : z14);
    }
}
