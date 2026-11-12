package j61;

import m63.e0;
import m63.m0;
import m63.m1;
import m63.u1;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u0018Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0010\u0010\u0011Bk\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0010\u0010\u0015¨\u0006\u0019"}, d2 = {"Lj61/i;", "", "Lj61/k;", "profileType", "Lj61/l;", "profileTypeFeedback", "Lj61/c;", "anaerobicCapacityFeedback", "", "anaerobicCapacity", "Lj61/a;", "aerobicCapacityFeedback", "aerobicCapacity", "Lj61/b;", "aerobicEnduranceFeedback", "aerobicEndurance", "<init>", "(Lj61/k;Lj61/l;Lj61/c;Ljava/lang/Integer;Lj61/a;Ljava/lang/Integer;Lj61/b;Ljava/lang/Integer;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILj61/k;Lj61/l;Lj61/c;Ljava/lang/Integer;Lj61/a;Ljava/lang/Integer;Lj61/b;Ljava/lang/Integer;Lm63/u1;)V", "Companion", "a", "b", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class i {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f97346i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f97347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f97348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f97349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f97350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j61.a f97351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f97352f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f97353g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f97354h;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/performance/cyclingability/model/CyclingAbilityDTO.$serializer", "Lm63/e0;", "Lj61/i;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f97355a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f97355a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.performance.cyclingability.model.CyclingAbilityDTO", aVar, 8);
            m1Var.j("profileType", true);
            m1Var.j("profileTypeFeedback", true);
            m1Var.j("anaerobicCapacityFeedback", true);
            m1Var.j("anaerobicCapacity", true);
            m1Var.j("aerobicCapacityFeedback", true);
            m1Var.j("aerobicCapacity", true);
            m1Var.j("aerobicEnduranceFeedback", true);
            m1Var.j("aerobicEndurance", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            o13.l<i63.c<Object>>[] lVarArr = i.f97346i;
            i63.c<?> cVarD = j63.a.d(lVarArr[0].getValue());
            i63.c<?> cVarD2 = j63.a.d(lVarArr[1].getValue());
            i63.c<?> cVarD3 = j63.a.d(lVarArr[2].getValue());
            m0 m0Var = m0.f116981a;
            return new i63.c[]{cVarD, cVarD2, cVarD3, j63.a.d(m0Var), j63.a.d(lVarArr[4].getValue()), j63.a.d(m0Var), j63.a.d(lVarArr[6].getValue()), j63.a.d(m0Var)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = i.f97346i;
            int i14 = l63.c.f110557a;
            Object obj = null;
            boolean z14 = true;
            Integer num = null;
            k kVar = null;
            l lVar = null;
            c cVar = null;
            Integer num2 = null;
            j61.a aVar = null;
            Integer num3 = null;
            b bVar = null;
            int i15 = 0;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        break;
                    case 0:
                        kVar = (k) cVarC.v(eVar2, 0, lVarArr[0].getValue(), kVar);
                        i15 |= 1;
                        break;
                    case 1:
                        lVar = (l) cVarC.v(eVar2, 1, lVarArr[1].getValue(), lVar);
                        i15 |= 2;
                        break;
                    case 2:
                        cVar = (c) cVarC.v(eVar2, 2, lVarArr[2].getValue(), cVar);
                        i15 |= 4;
                        break;
                    case 3:
                        num2 = (Integer) cVarC.v(eVar2, 3, m0.f116981a, num2);
                        i15 |= 8;
                        break;
                    case 4:
                        aVar = (j61.a) cVarC.v(eVar2, 4, lVarArr[4].getValue(), aVar);
                        i15 |= 16;
                        break;
                    case 5:
                        num3 = (Integer) cVarC.v(eVar2, 5, m0.f116981a, num3);
                        i15 |= 32;
                        break;
                    case 6:
                        bVar = (b) cVarC.v(eVar2, 6, lVarArr[6].getValue(), bVar);
                        i15 |= 64;
                        break;
                    case 7:
                        num = (Integer) cVarC.v(eVar2, 7, m0.f116981a, num);
                        i15 |= 128;
                        break;
                    default:
                        hb.a.o(iE);
                        return obj;
                }
                obj = null;
            }
            cVarC.b(eVar2);
            return new i(i15, kVar, lVar, cVar, num2, aVar, num3, bVar, num, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF116202c() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            i iVar = (i) obj;
            iVar.getClass();
            Integer num = iVar.f97354h;
            b bVar = iVar.f97353g;
            Integer num2 = iVar.f97352f;
            j61.a aVar = iVar.f97351e;
            Integer num3 = iVar.f97350d;
            c cVar = iVar.f97349c;
            l lVar = iVar.f97348b;
            k kVar = iVar.f97347a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = i.f97346i;
            if (dVarC.C(eVar) || kVar != null) {
                dVarC.d(eVar, 0, lVarArr[0].getValue(), kVar);
            }
            if (dVarC.C(eVar) || lVar != null) {
                dVarC.d(eVar, 1, lVarArr[1].getValue(), lVar);
            }
            if (dVarC.C(eVar) || cVar != null) {
                dVarC.d(eVar, 2, lVarArr[2].getValue(), cVar);
            }
            if (dVarC.C(eVar) || num3 != null) {
                dVarC.d(eVar, 3, m0.f116981a, num3);
            }
            if (dVarC.C(eVar) || aVar != null) {
                dVarC.d(eVar, 4, lVarArr[4].getValue(), aVar);
            }
            if (dVarC.C(eVar) || num2 != null) {
                dVarC.d(eVar, 5, m0.f116981a, num2);
            }
            if (dVarC.C(eVar) || bVar != null) {
                dVarC.d(eVar, 6, lVarArr[6].getValue(), bVar);
            }
            if (dVarC.C(eVar) || num != null) {
                dVarC.d(eVar, 7, m0.f116981a, num);
            }
            dVarC.b(eVar);
        }
    }

    static {
        n nVar = n.PUBLICATION;
        f97346i = new o13.l[]{m.a(nVar, new j21.f(6)), m.a(nVar, new j21.f(7)), m.a(nVar, new j21.f(8)), null, m.a(nVar, new j21.f(9)), null, m.a(nVar, new j21.f(10)), null};
    }

    public /* synthetic */ i(int i14, k kVar, l lVar, c cVar, Integer num, j61.a aVar, Integer num2, b bVar, Integer num3, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f97347a = null;
        } else {
            this.f97347a = kVar;
        }
        if ((i14 & 2) == 0) {
            this.f97348b = null;
        } else {
            this.f97348b = lVar;
        }
        if ((i14 & 4) == 0) {
            this.f97349c = null;
        } else {
            this.f97349c = cVar;
        }
        if ((i14 & 8) == 0) {
            this.f97350d = null;
        } else {
            this.f97350d = num;
        }
        if ((i14 & 16) == 0) {
            this.f97351e = null;
        } else {
            this.f97351e = aVar;
        }
        if ((i14 & 32) == 0) {
            this.f97352f = null;
        } else {
            this.f97352f = num2;
        }
        if ((i14 & 64) == 0) {
            this.f97353g = null;
        } else {
            this.f97353g = bVar;
        }
        if ((i14 & 128) == 0) {
            this.f97354h = null;
        } else {
            this.f97354h = num3;
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getF97350d() {
        return this.f97350d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f97347a == iVar.f97347a && this.f97348b == iVar.f97348b && this.f97349c == iVar.f97349c && s.g(this.f97350d, iVar.f97350d) && this.f97351e == iVar.f97351e && s.g(this.f97352f, iVar.f97352f) && this.f97353g == iVar.f97353g && s.g(this.f97354h, iVar.f97354h);
    }

    public final int hashCode() {
        k kVar = this.f97347a;
        int iHashCode = (kVar == null ? 0 : kVar.hashCode()) * 31;
        l lVar = this.f97348b;
        int iHashCode2 = (iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        c cVar = this.f97349c;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Integer num = this.f97350d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        j61.a aVar = this.f97351e;
        int iHashCode5 = (iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Integer num2 = this.f97352f;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        b bVar = this.f97353g;
        int iHashCode7 = (iHashCode6 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Integer num3 = this.f97354h;
        return iHashCode7 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "CyclingAbilityDTO(profileType=" + this.f97347a + ", profileTypeFeedback=" + this.f97348b + ", anaerobicCapacityFeedback=" + this.f97349c + ", anaerobicCapacity=" + this.f97350d + ", aerobicCapacityFeedback=" + this.f97351e + ", aerobicCapacity=" + this.f97352f + ", aerobicEnduranceFeedback=" + this.f97353g + ", aerobicEndurance=" + this.f97354h + ")";
    }

    /* JADX INFO: renamed from: j61.i$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lj61/i$b;", "", "<init>", "()V", "Li63/c;", "Lj61/i;", "serializer", "()Li63/c;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<i> serializer() {
            return a.f97355a;
        }

        private Companion() {
        }
    }

    public i() {
        this((k) null, (l) null, (c) null, (Integer) null, (j61.a) null, (Integer) null, (b) null, (Integer) null, 255, (p005kotlin.jvm.internal.j) null);
    }

    public i(k kVar, l lVar, c cVar, Integer num, j61.a aVar, Integer num2, b bVar, Integer num3) {
        this.f97347a = kVar;
        this.f97348b = lVar;
        this.f97349c = cVar;
        this.f97350d = num;
        this.f97351e = aVar;
        this.f97352f = num2;
        this.f97353g = bVar;
        this.f97354h = num3;
    }

    public /* synthetic */ i(k kVar, l lVar, c cVar, Integer num, j61.a aVar, Integer num2, b bVar, Integer num3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : kVar, (i14 & 2) != 0 ? null : lVar, (i14 & 4) != 0 ? null : cVar, (i14 & 8) != 0 ? null : num, (i14 & 16) != 0 ? null : aVar, (i14 & 32) != 0 ? null : num2, (i14 & 64) != 0 ? null : bVar, (i14 & 128) != 0 ? null : num3);
    }
}
