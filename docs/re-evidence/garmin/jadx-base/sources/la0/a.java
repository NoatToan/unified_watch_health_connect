package la0;

import com.garmin.proto.generated.GDISimpleSetup;
import i63.c;
import i63.h;
import j90.n;
import java.util.ArrayList;
import java.util.List;
import l63.d;
import l63.f;
import l72.o2;
import lc.u0;
import m63.e0;
import m63.g;
import m63.m1;
import m63.u1;
import m63.v0;
import o13.e;
import o13.l;
import o13.m;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0015BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\f\u0010\rBS\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012¨\u0006\u0016"}, d2 = {"Lla0/a;", "", "", "restoreProfiles", "restoreSensors", "", "selectedBackupProfileDeviceId", "", "Lcom/garmin/proto/generated/GDISimpleSetup$SensorType;", "selectedSensorTypes", "Lj90/n;", "sportProfileTypes", "<init>", "(ZZJLjava/util/List;Ljava/util/List;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IZZJLjava/util/List;Ljava/util/List;Lm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final /* data */ class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l<c<Object>>[] f111607f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f111608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f111609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f111610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<GDISimpleSetup.SensorType> f111611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<n> f111612e;

    /* JADX INFO: renamed from: la0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/presentation/customization/cycling/model/ActivityProfilesAndSensorsData.$serializer", "Lm63/e0;", "Lla0/a;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @e
    public static final /* synthetic */ class C2137a implements e0<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2137a f111613a;
        private static final k63.e descriptor;

        static {
            C2137a c2137a = new C2137a();
            f111613a = c2137a;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.device.setup.presentation.customization.cycling.model.ActivityProfilesAndSensorsData", c2137a, 5);
            m1Var.j("restoreProfiles", true);
            m1Var.j("restoreSensors", true);
            m1Var.j("selectedBackupProfileDeviceId", true);
            m1Var.j("selectedSensorTypes", true);
            m1Var.j("sportProfileTypes", true);
            descriptor = m1Var;
        }

        private C2137a() {
        }

        @Override // m63.e0
        public final c<?>[] childSerializers() {
            l<c<Object>>[] lVarArr = a.f111607f;
            g gVar = g.f116948a;
            return new c[]{gVar, gVar, v0.f117027a, lVarArr[3].getValue(), lVarArr[4].getValue()};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            l<c<Object>>[] lVarArr = a.f111607f;
            int i14 = l63.c.f110557a;
            int i15 = 0;
            boolean zG = false;
            boolean zG2 = false;
            long jW = 0;
            List list = null;
            List list2 = null;
            boolean z14 = true;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    zG = cVarC.g(eVar2, 0);
                    i15 |= 1;
                } else if (iE == 1) {
                    zG2 = cVarC.g(eVar2, 1);
                    i15 |= 2;
                } else if (iE == 2) {
                    jW = cVarC.w(eVar2, 2);
                    i15 |= 4;
                } else if (iE == 3) {
                    list = (List) cVarC.l(eVar2, 3, lVarArr[3].getValue(), list);
                    i15 |= 8;
                } else {
                    if (iE != 4) {
                        hb.a.o(iE);
                        return null;
                    }
                    list2 = (List) cVarC.l(eVar2, 4, lVarArr[4].getValue(), list2);
                    i15 |= 16;
                }
            }
            cVarC.b(eVar2);
            return new a(i15, zG, zG2, jW, list, list2, (u1) null);
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
            List<n> list = aVar.f111612e;
            List<GDISimpleSetup.SensorType> list2 = aVar.f111611d;
            long j8 = aVar.f111610c;
            boolean z14 = aVar.f111609b;
            boolean z15 = aVar.f111608a;
            k63.e eVar = descriptor;
            d dVarC = fVar.c(eVar);
            l<c<Object>>[] lVarArr = a.f111607f;
            if (dVarC.C(eVar) || z15) {
                dVarC.n(eVar, 0, z15);
            }
            if (dVarC.C(eVar) || z14) {
                dVarC.n(eVar, 1, z14);
            }
            if (dVarC.C(eVar) || j8 != 0) {
                dVarC.z(eVar, 2, j8);
            }
            if (dVarC.C(eVar) || !s.g(list2, j0.f134944a)) {
                dVarC.e(eVar, 3, lVarArr[3].getValue(), list2);
            }
            if (dVarC.C(eVar) || !s.g(list, j0.f134944a)) {
                dVarC.e(eVar, 4, lVarArr[4].getValue(), list);
            }
            dVarC.b(eVar);
        }
    }

    static {
        o13.n nVar = o13.n.PUBLICATION;
        f111607f = new l[]{null, null, null, m.a(nVar, new o2(7)), m.a(nVar, new o2(8))};
    }

    public a(int i14, boolean z14, boolean z15, long j8, List list, List list2, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f111608a = false;
        } else {
            this.f111608a = z14;
        }
        if ((i14 & 2) == 0) {
            this.f111609b = false;
        } else {
            this.f111609b = z15;
        }
        if ((i14 & 4) == 0) {
            this.f111610c = 0L;
        } else {
            this.f111610c = j8;
        }
        if ((i14 & 8) == 0) {
            this.f111611d = j0.f134944a;
        } else {
            this.f111611d = list;
        }
        if ((i14 & 16) == 0) {
            this.f111612e = j0.f134944a;
        } else {
            this.f111612e = list2;
        }
    }

    public static a a(a aVar, boolean z14, boolean z15, long j8, ArrayList arrayList, List list, int i14) {
        if ((i14 & 1) != 0) {
            z14 = aVar.f111608a;
        }
        boolean z16 = z14;
        if ((i14 & 2) != 0) {
            z15 = aVar.f111609b;
        }
        boolean z17 = z15;
        if ((i14 & 4) != 0) {
            j8 = aVar.f111610c;
        }
        long j14 = j8;
        List<GDISimpleSetup.SensorType> list2 = arrayList;
        if ((i14 & 8) != 0) {
            list2 = aVar.f111611d;
        }
        List<GDISimpleSetup.SensorType> list3 = list2;
        if ((i14 & 16) != 0) {
            list = aVar.f111612e;
        }
        List list4 = list;
        aVar.getClass();
        list3.getClass();
        list4.getClass();
        return new a(z16, z17, j14, list3, list4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f111608a == aVar.f111608a && this.f111609b == aVar.f111609b && this.f111610c == aVar.f111610c && s.g(this.f111611d, aVar.f111611d) && s.g(this.f111612e, aVar.f111612e);
    }

    public final int hashCode() {
        return this.f111612e.hashCode() + u0.b(q6.f.e(q6.f.g(Boolean.hashCode(this.f111608a) * 31, 31, this.f111609b), 31, this.f111610c), 31, this.f111611d);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("ActivityProfilesAndSensorsData(restoreProfiles=", ", restoreSensors=", ", selectedBackupProfileDeviceId=", this.f111608a, this.f111609b);
        sbM.append(this.f111610c);
        sbM.append(", selectedSensorTypes=");
        sbM.append(this.f111611d);
        sbM.append(", sportProfileTypes=");
        sbM.append(this.f111612e);
        sbM.append(")");
        return sbM.toString();
    }

    /* JADX INFO: renamed from: la0.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lla0/a$b;", "", "<init>", "()V", "Li63/c;", "Lla0/a;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final c<a> serializer() {
            return C2137a.f111613a;
        }

        private Companion() {
        }
    }

    public a() {
        this(false, false, 0L, (List) null, (List) null, 31, (j) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(boolean z14, boolean z15, long j8, List<? extends GDISimpleSetup.SensorType> list, List<n> list2) {
        list.getClass();
        list2.getClass();
        this.f111608a = z14;
        this.f111609b = z15;
        this.f111610c = j8;
        this.f111611d = list;
        this.f111612e = list2;
    }

    public a(boolean z14, boolean z15, long j8, List list, List list2, int i14, j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? 0L : j8, (i14 & 8) != 0 ? j0.f134944a : list, (i14 & 16) != 0 ? j0.f134944a : list2);
    }
}
