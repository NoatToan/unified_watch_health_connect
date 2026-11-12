package v41;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.pacepro.domain.algorithm.PaceProAlgorithm;
import o53.c2;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import r53.z1;
import ty1.f1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pacepro.domain.usecase.InitializePaceProPlanUseCase$initialize$1", f = "InitializePaceProPlanUseCase.kt", l = {61, 65, 68, 82}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f175609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f175610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u41.a f175611c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, u41.a aVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f175610b = mVar;
        this.f175611c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f175610b, this.f175611c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0213  */
    /* JADX WARN: Code duplicated, block: B:72:0x021c  */
    /* JADX WARN: Code duplicated, block: B:74:0x021f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0243  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b9, code lost:
    
        if (v41.m.b(r5.f175610b, r0, null, r4, r5) == r6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0134, code lost:
    
        if (v41.m.b(r5.f175610b, r13, r0, r4, r5) == r6) goto L53;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j8;
        u41.b value;
        Long l14;
        z1<u41.b> z1Var;
        PaceProAlgorithm paceProAlgorithm;
        u41.b value2;
        u41.b bVar;
        com.garmin.android.apps.connectmobile.pacepro.data.dto.a aVar;
        Long l15;
        c2 c2Var;
        h hVar = this;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = hVar.f175609a;
        long j14 = 0;
        u41.a aVar3 = hVar.f175611c;
        m mVar = hVar.f175610b;
        if (i14 == 0) {
            o13.r.b(obj);
            hVar.f175609a = 1;
            if (m.a(mVar, hVar) != aVar2) {
            }
            return aVar2;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else if (i14 == 2) {
            o13.r.b(obj);
            l14 = mVar.f175635d.getValue().f168609a.f39760b.f39766c;
            if (l14 != null || l14.longValue() == 0) {
                l14 = null;
            }
            if (l14 != null && !mVar.f175635d.getValue().f168621m) {
                long jLongValue = l14.longValue();
                String str = aVar3.f168604g;
                hVar.f175609a = 3;
            }
        } else {
            if (i14 != 3 && i14 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        j8 = 0;
        z1Var = mVar.f175635d;
        paceProAlgorithm = mVar.f175634c;
        do {
            value2 = z1Var.getValue();
            bVar = value2;
            aVar = bVar.f168609a;
        } while (!z1Var.b(value2, u41.b.a(bVar, com.garmin.android.apps.connectmobile.pacepro.data.dto.a.b(aVar, null, com.garmin.android.apps.connectmobile.pacepro.data.dto.b.b(aVar.f39760b, null, null, null, null, 0.0d, null, null, 0L, 0.0d, false, new Float(paceProAlgorithm.f39787a), null, new Float(paceProAlgorithm.f39789c), 98303), 1), null, null, 0, 0, null, null, null, null, null, null, false, false, false, 16382)));
        l15 = mVar.f175635d.getValue().f168609a.f39760b.f39766c;
        if (l15 != null || l15.longValue() == j8) {
            l15 = null;
        }
        if (l15 != null) {
            long jLongValue2 = l15.longValue();
            o53.b0 b0Var = mVar.f175633b;
            x53.c cVar = s0.f129406a;
            ge1.b.T(b0Var, x53.b.f189152a, null, new g(mVar, jLongValue2, null), 2);
        }
        s sVar = mVar.f175641j;
        f1 f1Var = new f1(mVar, 26);
        m0 m0Var = new m0();
        c2Var = sVar.f175675g;
        if (c2Var != null) {
            c2Var.c(null);
        }
        o53.b0 b0Var2 = sVar.f175670b;
        x53.c cVar2 = s0.f129406a;
        sVar.f175675g = ge1.b.T(b0Var2, x53.b.f189152a, null, new r(sVar, m0Var, f1Var, null), 2);
        return Unit.INSTANCE;
        z1<u41.b> z1Var2 = mVar.f175635d;
        z1<u41.b> z1Var3 = mVar.f175635d;
        while (!z1Var2.b(z1Var2.getValue(), u41.b.a(mVar.f175642k, null, null, null, 0, 0, null, null, null, null, null, null, true, false, false, 14335))) {
            hVar = this;
        }
        com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar2 = aVar3.f168598a;
        Long l16 = aVar3.f168601d;
        if (bVar2 == null) {
            String str2 = aVar3.f168599b;
            if (str2 == null) {
                Double d14 = aVar3.f168600c;
                if (d14 != null && l16 != null && aVar3.f168602e != null) {
                    double dDoubleValue = d14.doubleValue();
                    long jLongValue3 = l16.longValue();
                    t41.a aVar4 = aVar3.f168602e;
                    while (true) {
                        u41.b value3 = z1Var3.getValue();
                        u41.b bVar3 = value3;
                        com.garmin.android.apps.connectmobile.pacepro.data.dto.a aVar5 = bVar3.f168609a;
                        j8 = j14;
                        long j15 = jLongValue3;
                        t41.a aVar6 = aVar4;
                        if (z1Var3.b(value3, u41.b.a(bVar3, com.garmin.android.apps.connectmobile.pacepro.data.dto.a.b(aVar5, null, com.garmin.android.apps.connectmobile.pacepro.data.dto.b.b(aVar5.f39760b, null, null, null, aVar6, dDoubleValue, null, null, j15, dDoubleValue / jLongValue3, false, null, null, null, 260511), 1), null, null, 0, 0, null, null, null, null, null, null, false, false, false, 12286))) {
                            break;
                        }
                        jLongValue3 = j15;
                        aVar4 = aVar6;
                        j14 = j8;
                    }
                }
                z1Var = mVar.f175635d;
                paceProAlgorithm = mVar.f175634c;
                do {
                    value2 = z1Var.getValue();
                    bVar = value2;
                    aVar = bVar.f168609a;
                } while (!z1Var.b(value2, u41.b.a(bVar, com.garmin.android.apps.connectmobile.pacepro.data.dto.a.b(aVar, null, com.garmin.android.apps.connectmobile.pacepro.data.dto.b.b(aVar.f39760b, null, null, null, null, 0.0d, null, null, 0L, 0.0d, false, new Float(paceProAlgorithm.f39787a), null, new Float(paceProAlgorithm.f39789c), 98303), 1), null, null, 0, 0, null, null, null, null, null, null, false, false, false, 16382)));
                l15 = mVar.f175635d.getValue().f168609a.f39760b.f39766c;
                if (l15 != null) {
                    l15 = null;
                } else {
                    l15 = null;
                }
                if (l15 != null) {
                    long jLongValue4 = l15.longValue();
                    o53.b0 b0Var3 = mVar.f175633b;
                    x53.c cVar3 = s0.f129406a;
                    ge1.b.T(b0Var3, x53.b.f189152a, null, new g(mVar, jLongValue4, null), 2);
                }
                s sVar2 = mVar.f175641j;
                f1 f1Var2 = new f1(mVar, 26);
                m0 m0Var2 = new m0();
                c2Var = sVar2.f175675g;
                if (c2Var != null) {
                    c2Var.c(null);
                }
                o53.b0 b0Var4 = sVar2.f175670b;
                x53.c cVar4 = s0.f129406a;
                sVar2.f175675g = ge1.b.T(b0Var4, x53.b.f189152a, null, new r(sVar2, m0Var2, f1Var2, null), 2);
                return Unit.INSTANCE;
            }
            Long lJ = d53.t.j(str2);
            if (lJ == null || lJ.longValue() == 0) {
                lJ = null;
            }
            if (lJ == null) {
                i2.a aVar7 = i2.f36769a;
                aVar7.getClass();
                i2.a.e(a2.PACE_PRO, "Invalid courseId (" + lJ + ")!");
                do {
                    value = z1Var3.getValue();
                } while (!z1Var3.b(value, u41.b.a(value, null, null, null, 0, 0, null, null, null, null, null, null, false, true, false, 12287)));
            } else {
                long jLongValue5 = lJ.longValue();
                Long l17 = aVar3.f168601d;
                String str3 = aVar3.f168604g;
                hVar.f175609a = 4;
            }
            j8 = 0;
            z1Var = mVar.f175635d;
            paceProAlgorithm = mVar.f175634c;
            do {
                value2 = z1Var.getValue();
                bVar = value2;
                aVar = bVar.f168609a;
            } while (!z1Var.b(value2, u41.b.a(bVar, com.garmin.android.apps.connectmobile.pacepro.data.dto.a.b(aVar, null, com.garmin.android.apps.connectmobile.pacepro.data.dto.b.b(aVar.f39760b, null, null, null, null, 0.0d, null, null, 0L, 0.0d, false, new Float(paceProAlgorithm.f39787a), null, new Float(paceProAlgorithm.f39789c), 98303), 1), null, null, 0, 0, null, null, null, null, null, null, false, false, false, 16382)));
            l15 = mVar.f175635d.getValue().f168609a.f39760b.f39766c;
            if (l15 != null) {
                l15 = null;
            } else {
                l15 = null;
            }
            if (l15 != null) {
                long jLongValue6 = l15.longValue();
                o53.b0 b0Var5 = mVar.f175633b;
                x53.c cVar5 = s0.f129406a;
                ge1.b.T(b0Var5, x53.b.f189152a, null, new g(mVar, jLongValue6, null), 2);
            }
            s sVar3 = mVar.f175641j;
            f1 f1Var3 = new f1(mVar, 26);
            m0 m0Var3 = new m0();
            c2Var = sVar3.f175675g;
            if (c2Var != null) {
                c2Var.c(null);
            }
            o53.b0 b0Var6 = sVar3.f175670b;
            x53.c cVar6 = s0.f129406a;
            sVar3.f175675g = ge1.b.T(b0Var6, x53.b.f189152a, null, new r(sVar3, m0Var3, f1Var3, null), 2);
            return Unit.INSTANCE;
        }
        hVar.f175609a = 2;
        if (m.c(mVar, bVar2, hVar) != aVar2) {
            l14 = mVar.f175635d.getValue().f168609a.f39760b.f39766c;
            if (l14 != null) {
                l14 = null;
            } else {
                l14 = null;
            }
            if (l14 != null) {
                long jLongValue7 = l14.longValue();
                String str4 = aVar3.f168604g;
                hVar.f175609a = 3;
            }
            j8 = 0;
            z1Var = mVar.f175635d;
            paceProAlgorithm = mVar.f175634c;
            do {
                value2 = z1Var.getValue();
                bVar = value2;
                aVar = bVar.f168609a;
            } while (!z1Var.b(value2, u41.b.a(bVar, com.garmin.android.apps.connectmobile.pacepro.data.dto.a.b(aVar, null, com.garmin.android.apps.connectmobile.pacepro.data.dto.b.b(aVar.f39760b, null, null, null, null, 0.0d, null, null, 0L, 0.0d, false, new Float(paceProAlgorithm.f39787a), null, new Float(paceProAlgorithm.f39789c), 98303), 1), null, null, 0, 0, null, null, null, null, null, null, false, false, false, 16382)));
            l15 = mVar.f175635d.getValue().f168609a.f39760b.f39766c;
            if (l15 != null) {
                l15 = null;
            } else {
                l15 = null;
            }
            if (l15 != null) {
                long jLongValue8 = l15.longValue();
                o53.b0 b0Var7 = mVar.f175633b;
                x53.c cVar7 = s0.f129406a;
                ge1.b.T(b0Var7, x53.b.f189152a, null, new g(mVar, jLongValue8, null), 2);
            }
            s sVar4 = mVar.f175641j;
            f1 f1Var4 = new f1(mVar, 26);
            m0 m0Var4 = new m0();
            c2Var = sVar4.f175675g;
            if (c2Var != null) {
                c2Var.c(null);
            }
            o53.b0 b0Var8 = sVar4.f175670b;
            x53.c cVar8 = s0.f129406a;
            sVar4.f175675g = ge1.b.T(b0Var8, x53.b.f189152a, null, new r(sVar4, m0Var4, f1Var4, null), 2);
            return Unit.INSTANCE;
        }
        return aVar2;
    }
}
