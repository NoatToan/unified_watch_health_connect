package qv;

import i63.h;
import java.util.List;
import l63.d;
import l63.f;
import lc.u0;
import m63.e0;
import m63.g;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.y1;
import o13.e;
import o13.l;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0002\u0015\u0016BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eBa\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013¨\u0006\u0017"}, d2 = {"Lqv/b;", "", "", "deviceId", "", "deviceName", "deviceImageUrl", "", "backupProfileNames", "", "selected", "enabled", "lastUpdateDate", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IJLjava/lang/String;Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final /* data */ class b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l<i63.c<Object>>[] f147904h = {null, null, null, m.a(n.PUBLICATION, new qr.n(21)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f147905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f147907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<String> f147908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f147909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f147910f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f147911g;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/bic/model/SportProfileBackupAdapterItem.$serializer", "Lm63/e0;", "Lqv/b;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @e
    public static final /* synthetic */ class a implements e0<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f147912a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f147912a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.bic.model.SportProfileBackupAdapterItem", aVar, 7);
            m1Var.j("deviceId", false);
            m1Var.j("deviceName", false);
            m1Var.j("deviceImageUrl", false);
            m1Var.j("backupProfileNames", false);
            m1Var.j("selected", true);
            m1Var.j("enabled", true);
            m1Var.j("lastUpdateDate", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            l<i63.c<Object>>[] lVarArr = b.f147904h;
            y1 y1Var = y1.f117048a;
            g gVar = g.f116948a;
            return new i63.c[]{v0.f117027a, j63.a.d(y1Var), j63.a.d(y1Var), lVarArr[3].getValue(), gVar, gVar, y1Var};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            l<i63.c<Object>>[] lVarArr = b.f147904h;
            int i14 = l63.c.f110557a;
            int i15 = 0;
            boolean zG = false;
            boolean zG2 = false;
            long jW = 0;
            String str = null;
            String str2 = null;
            List list = null;
            String strR = null;
            boolean z14 = true;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        break;
                    case 0:
                        jW = cVarC.w(eVar2, 0);
                        i15 |= 1;
                        break;
                    case 1:
                        str = (String) cVarC.v(eVar2, 1, y1.f117048a, str);
                        i15 |= 2;
                        break;
                    case 2:
                        str2 = (String) cVarC.v(eVar2, 2, y1.f117048a, str2);
                        i15 |= 4;
                        break;
                    case 3:
                        list = (List) cVarC.l(eVar2, 3, lVarArr[3].getValue(), list);
                        i15 |= 8;
                        break;
                    case 4:
                        zG = cVarC.g(eVar2, 4);
                        i15 |= 16;
                        break;
                    case 5:
                        zG2 = cVarC.g(eVar2, 5);
                        i15 |= 32;
                        break;
                    case 6:
                        strR = cVarC.r(eVar2, 6);
                        i15 |= 64;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            cVarC.b(eVar2);
            return new b(i15, jW, str, str2, list, zG, zG2, strR, (u1) null);
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
            l<i63.c<Object>>[] lVarArr = b.f147904h;
            long j8 = bVar.f147905a;
            boolean z14 = bVar.f147910f;
            boolean z15 = bVar.f147909e;
            dVarC.z(eVar, 0, j8);
            y1 y1Var = y1.f117048a;
            dVarC.d(eVar, 1, y1Var, bVar.f147906b);
            dVarC.d(eVar, 2, y1Var, bVar.f147907c);
            dVarC.e(eVar, 3, lVarArr[3].getValue(), bVar.f147908d);
            if (dVarC.C(eVar) || z15) {
                dVarC.n(eVar, 4, z15);
            }
            if (dVarC.C(eVar) || !z14) {
                dVarC.n(eVar, 5, z14);
            }
            dVarC.k(eVar, 6, bVar.f147911g);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ b(int i14, long j8, String str, String str2, List list, boolean z14, boolean z15, String str3, u1 u1Var) {
        if (79 != (i14 & 79)) {
            k1.h(i14, 79, a.f147912a.getF158591b());
            throw null;
        }
        this.f147905a = j8;
        this.f147906b = str;
        this.f147907c = str2;
        this.f147908d = list;
        if ((i14 & 16) == 0) {
            this.f147909e = false;
        } else {
            this.f147909e = z14;
        }
        if ((i14 & 32) == 0) {
            this.f147910f = true;
        } else {
            this.f147910f = z15;
        }
        this.f147911g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f147905a == bVar.f147905a && s.g(this.f147906b, bVar.f147906b) && s.g(this.f147907c, bVar.f147907c) && s.g(this.f147908d, bVar.f147908d) && this.f147909e == bVar.f147909e && this.f147910f == bVar.f147910f && s.g(this.f147911g, bVar.f147911g);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f147905a) * 31;
        String str = this.f147906b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f147907c;
        return this.f147911g.hashCode() + q6.f.g(q6.f.g(u0.b((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f147908d), 31, this.f147909e), 31, this.f147910f);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f147905a, "SportProfileBackupAdapterItem(deviceId=", ", deviceName=", this.f147906b);
        sbK.append(", deviceImageUrl=");
        sbK.append(this.f147907c);
        sbK.append(", backupProfileNames=");
        sbK.append(this.f147908d);
        com.airbnb.lottie.animation.keyframe.a.v(", selected=", ", enabled=", sbK, this.f147909e, this.f147910f);
        return v.e0.h(sbK, ", lastUpdateDate=", this.f147911g, ")");
    }

    /* JADX INFO: renamed from: qv.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lqv/b$b;", "", "<init>", "()V", "Li63/c;", "Lqv/b;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final i63.c<b> serializer() {
            return a.f147912a;
        }

        private Companion() {
        }
    }

    public b(long j8, String str, String str2, List<String> list, boolean z14, boolean z15, String str3) {
        list.getClass();
        str3.getClass();
        this.f147905a = j8;
        this.f147906b = str;
        this.f147907c = str2;
        this.f147908d = list;
        this.f147909e = z14;
        this.f147910f = z15;
        this.f147911g = str3;
    }

    public /* synthetic */ b(long j8, String str, String str2, List list, boolean z14, boolean z15, String str3, int i14, j jVar) {
        this(j8, str, str2, list, (i14 & 16) != 0 ? false : z14, (i14 & 32) != 0 ? true : z15, str3);
    }
}
