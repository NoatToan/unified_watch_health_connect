package yw1;

import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0002\u0015\u0016Bk\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eB\u007f\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013¨\u0006\u0017"}, d2 = {"Lyw1/e;", "", "Lyw1/f;", "avgSpeed", "avgPower", "calories", "distance", "steps", "duration", "moderateIntensityMinutes", "vigorousIntensityMinutes", "movingDuration", "totalSets", "<init>", "(Lyw1/f;Lyw1/f;Lyw1/f;Lyw1/f;Lyw1/f;Lyw1/f;Lyw1/f;Lyw1/f;Lyw1/f;Lyw1/f;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILyw1/f;Lyw1/f;Lyw1/f;Lyw1/f;Lyw1/f;Lyw1/f;Lyw1/f;Lyw1/f;Lyw1/f;Lyw1/f;Lm63/u1;)V", "Companion", "a", "b", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class e {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f199903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f199904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f199905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f199906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f199907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f199908f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f199909g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f199910h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f f199911i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f199912j;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/training/model/progressreport/FBTActivityStats.$serializer", "Lm63/e0;", "Lyw1/e;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f199913a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f199913a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.training.model.progressreport.FBTActivityStats", aVar, 10);
            m1Var.j("avgSpeed", false);
            m1Var.j("avgPower", false);
            m1Var.j("calories", false);
            m1Var.j("distance", false);
            m1Var.j("steps", false);
            m1Var.j("duration", false);
            m1Var.j("moderateIntensityMinutes", false);
            m1Var.j("vigorousIntensityMinutes", false);
            m1Var.j("movingDuration", false);
            m1Var.j("totalSets", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            f.a aVar = f.a.f199919a;
            return new i63.c[]{j63.a.d(aVar), j63.a.d(aVar), j63.a.d(aVar), j63.a.d(aVar), j63.a.d(aVar), j63.a.d(aVar), j63.a.d(aVar), j63.a.d(aVar), j63.a.d(aVar), j63.a.d(aVar)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            f fVar = null;
            boolean z14 = true;
            f fVar2 = null;
            int i15 = 0;
            f fVar3 = null;
            f fVar4 = null;
            f fVar5 = null;
            f fVar6 = null;
            f fVar7 = null;
            f fVar8 = null;
            f fVar9 = null;
            f fVar10 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        break;
                    case 0:
                        fVar3 = (f) cVarC.v(eVar2, 0, f.a.f199919a, fVar3);
                        i15 |= 1;
                        break;
                    case 1:
                        fVar4 = (f) cVarC.v(eVar2, 1, f.a.f199919a, fVar4);
                        i15 |= 2;
                        break;
                    case 2:
                        fVar5 = (f) cVarC.v(eVar2, 2, f.a.f199919a, fVar5);
                        i15 |= 4;
                        break;
                    case 3:
                        fVar6 = (f) cVarC.v(eVar2, 3, f.a.f199919a, fVar6);
                        i15 |= 8;
                        break;
                    case 4:
                        fVar7 = (f) cVarC.v(eVar2, 4, f.a.f199919a, fVar7);
                        i15 |= 16;
                        break;
                    case 5:
                        fVar8 = (f) cVarC.v(eVar2, 5, f.a.f199919a, fVar8);
                        i15 |= 32;
                        break;
                    case 6:
                        fVar9 = (f) cVarC.v(eVar2, 6, f.a.f199919a, fVar9);
                        i15 |= 64;
                        break;
                    case 7:
                        fVar10 = (f) cVarC.v(eVar2, 7, f.a.f199919a, fVar10);
                        i15 |= 128;
                        break;
                    case 8:
                        fVar2 = (f) cVarC.v(eVar2, 8, f.a.f199919a, fVar2);
                        i15 |= 256;
                        break;
                    case 9:
                        fVar = (f) cVarC.v(eVar2, 9, f.a.f199919a, fVar);
                        i15 |= 512;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            cVarC.b(eVar2);
            return new e(i15, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar2, fVar, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            e eVar = (e) obj;
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.d dVarC = fVar.c(eVar2);
            f.a aVar = f.a.f199919a;
            dVarC.d(eVar2, 0, aVar, eVar.f199903a);
            dVarC.d(eVar2, 1, aVar, eVar.f199904b);
            dVarC.d(eVar2, 2, aVar, eVar.f199905c);
            dVarC.d(eVar2, 3, aVar, eVar.f199906d);
            dVarC.d(eVar2, 4, aVar, eVar.f199907e);
            dVarC.d(eVar2, 5, aVar, eVar.f199908f);
            dVarC.d(eVar2, 6, aVar, eVar.f199909g);
            dVarC.d(eVar2, 7, aVar, eVar.f199910h);
            dVarC.d(eVar2, 8, aVar, eVar.f199911i);
            dVarC.d(eVar2, 9, aVar, eVar.f199912j);
            dVarC.b(eVar2);
        }
    }

    public /* synthetic */ e(int i14, f fVar, f fVar2, f fVar3, f fVar4, f fVar5, f fVar6, f fVar7, f fVar8, f fVar9, f fVar10, u1 u1Var) {
        if (1023 != (i14 & 1023)) {
            k1.h(i14, 1023, a.f199913a.getF158591b());
            throw null;
        }
        this.f199903a = fVar;
        this.f199904b = fVar2;
        this.f199905c = fVar3;
        this.f199906d = fVar4;
        this.f199907e = fVar5;
        this.f199908f = fVar6;
        this.f199909g = fVar7;
        this.f199910h = fVar8;
        this.f199911i = fVar9;
        this.f199912j = fVar10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return p005kotlin.jvm.internal.s.g(this.f199903a, eVar.f199903a) && p005kotlin.jvm.internal.s.g(this.f199904b, eVar.f199904b) && p005kotlin.jvm.internal.s.g(this.f199905c, eVar.f199905c) && p005kotlin.jvm.internal.s.g(this.f199906d, eVar.f199906d) && p005kotlin.jvm.internal.s.g(this.f199907e, eVar.f199907e) && p005kotlin.jvm.internal.s.g(this.f199908f, eVar.f199908f) && p005kotlin.jvm.internal.s.g(this.f199909g, eVar.f199909g) && p005kotlin.jvm.internal.s.g(this.f199910h, eVar.f199910h) && p005kotlin.jvm.internal.s.g(this.f199911i, eVar.f199911i) && p005kotlin.jvm.internal.s.g(this.f199912j, eVar.f199912j);
    }

    public final int hashCode() {
        f fVar = this.f199903a;
        int iHashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
        f fVar2 = this.f199904b;
        int iHashCode2 = (iHashCode + (fVar2 == null ? 0 : fVar2.hashCode())) * 31;
        f fVar3 = this.f199905c;
        int iHashCode3 = (iHashCode2 + (fVar3 == null ? 0 : fVar3.hashCode())) * 31;
        f fVar4 = this.f199906d;
        int iHashCode4 = (iHashCode3 + (fVar4 == null ? 0 : fVar4.hashCode())) * 31;
        f fVar5 = this.f199907e;
        int iHashCode5 = (iHashCode4 + (fVar5 == null ? 0 : fVar5.hashCode())) * 31;
        f fVar6 = this.f199908f;
        int iHashCode6 = (iHashCode5 + (fVar6 == null ? 0 : fVar6.hashCode())) * 31;
        f fVar7 = this.f199909g;
        int iHashCode7 = (iHashCode6 + (fVar7 == null ? 0 : fVar7.hashCode())) * 31;
        f fVar8 = this.f199910h;
        int iHashCode8 = (iHashCode7 + (fVar8 == null ? 0 : fVar8.hashCode())) * 31;
        f fVar9 = this.f199911i;
        int iHashCode9 = (iHashCode8 + (fVar9 == null ? 0 : fVar9.hashCode())) * 31;
        f fVar10 = this.f199912j;
        return iHashCode9 + (fVar10 != null ? fVar10.hashCode() : 0);
    }

    public final String toString() {
        return "FBTActivityStats(avgSpeed=" + this.f199903a + ", avgPower=" + this.f199904b + ", calories=" + this.f199905c + ", distance=" + this.f199906d + ", steps=" + this.f199907e + ", duration=" + this.f199908f + ", moderateIntensityMinutes=" + this.f199909g + ", vigorousIntensityMinutes=" + this.f199910h + ", movingDuration=" + this.f199911i + ", totalSets=" + this.f199912j + ")";
    }

    /* JADX INFO: renamed from: yw1.e$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lyw1/e$b;", "", "<init>", "()V", "Li63/c;", "Lyw1/e;", "serializer", "()Li63/c;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<e> serializer() {
            return a.f199913a;
        }

        private Companion() {
        }
    }

    public e(f fVar, f fVar2, f fVar3, f fVar4, f fVar5, f fVar6, f fVar7, f fVar8, f fVar9, f fVar10) {
        this.f199903a = fVar;
        this.f199904b = fVar2;
        this.f199905c = fVar3;
        this.f199906d = fVar4;
        this.f199907e = fVar5;
        this.f199908f = fVar6;
        this.f199909g = fVar7;
        this.f199910h = fVar8;
        this.f199911i = fVar9;
        this.f199912j = fVar10;
    }
}
