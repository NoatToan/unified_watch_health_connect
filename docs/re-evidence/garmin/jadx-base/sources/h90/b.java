package h90;

import androidx.core.view.j;
import i3.e5;
import i63.h;
import m63.e0;
import m63.k1;
import m63.m0;
import m63.m1;
import m63.u1;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB;\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\f¨\u0006\u0010"}, d2 = {"Lh90/b;", "", "", "leftWristLeftButtonImage", "leftWristRightButtonImage", "rightWristLeftButtonImage", "rightWristRightButtonImage", "<init>", "(IIII)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IIIIILm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final /* data */ class b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f82517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f82518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f82519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f82520d;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/domain/customization/ButtonDirectionResources.$serializer", "Lm63/e0;", "Lh90/b;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f82521a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f82521a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.device.setup.domain.customization.ButtonDirectionResources", aVar, 4);
            m1Var.j("leftWristLeftButtonImage", false);
            m1Var.j("leftWristRightButtonImage", false);
            m1Var.j("rightWristLeftButtonImage", false);
            m1Var.j("rightWristRightButtonImage", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            m0 m0Var = m0.f116981a;
            return new i63.c[]{m0Var, m0Var, m0Var, m0Var};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            int iA = 0;
            int iA2 = 0;
            int iA3 = 0;
            int iA4 = 0;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    iA = cVarC.A(eVar2, 0);
                    i15 |= 1;
                } else if (iE == 1) {
                    iA2 = cVarC.A(eVar2, 1);
                    i15 |= 2;
                } else if (iE == 2) {
                    iA3 = cVarC.A(eVar2, 2);
                    i15 |= 4;
                } else {
                    if (iE != 3) {
                        hb.a.o(iE);
                        return null;
                    }
                    iA4 = cVarC.A(eVar2, 3);
                    i15 |= 8;
                }
            }
            cVarC.b(eVar2);
            return new b(i15, iA, iA2, iA3, iA4, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            b bVar = (b) obj;
            bVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            dVarC.v(0, bVar.f82517a, eVar);
            dVarC.v(1, bVar.f82518b, eVar);
            dVarC.v(2, bVar.f82519c, eVar);
            dVarC.v(3, bVar.f82520d, eVar);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ b(int i14, int i15, int i16, int i17, int i18, u1 u1Var) {
        if (15 != (i14 & 15)) {
            k1.h(i14, 15, a.f82521a.getF158591b());
            throw null;
        }
        this.f82517a = i15;
        this.f82518b = i16;
        this.f82519c = i17;
        this.f82520d = i18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f82517a == bVar.f82517a && this.f82518b == bVar.f82518b && this.f82519c == bVar.f82519c && this.f82520d == bVar.f82520d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f82520d) + q2.d(this.f82519c, q2.d(this.f82518b, Integer.hashCode(this.f82517a) * 31, 31), 31);
    }

    public final String toString() {
        return j.e(this.f82519c, this.f82520d, ", rightWristRightButtonImage=", ")", e5.j(this.f82517a, this.f82518b, "ButtonDirectionResources(leftWristLeftButtonImage=", ", leftWristRightButtonImage=", ", rightWristLeftButtonImage="));
    }

    /* JADX INFO: renamed from: h90.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lh90/b$b;", "", "<init>", "()V", "Li63/c;", "Lh90/b;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<b> serializer() {
            return a.f82521a;
        }

        private Companion() {
        }
    }

    public b(int i14, int i15, int i16, int i17) {
        this.f82517a = i14;
        this.f82518b = i15;
        this.f82519c = i16;
        this.f82520d = i17;
    }
}
