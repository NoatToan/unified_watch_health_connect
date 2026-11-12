package j82;

import android.graphics.Path;
import android.graphics.RectF;
import com.garmin.android.apps.connectmobile.devices.model.v;
import com.garmin.android.apps.connectmobile.powerguide.create.ScheduledEventsActivity;
import cq.p;
import e23.l;
import h4.r;
import java.util.ArrayList;
import m92.c0;
import m92.h0;
import o4.d0;
import o4.e0;
import o4.m;
import o4.m1;
import o4.u1;
import o4.w;
import o53.j;
import p005kotlin.Unit;
import p006l2.l1;
import p13.x;
import p5.k0;
import pc0.o0;
import q4.k;
import u1.q;
import z2.v0;
import z2.w0;
import z2.x0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f97715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f97716b;

    public /* synthetic */ d(long j8, int i14) {
        this.f97715a = i14;
        this.f97716b = j8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r2v72 */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // e23.l
    public final Object invoke(Object obj) throws Exception {
        j<? super R> jVar;
        Object bVar;
        int i14 = this.f97715a;
        Object objValueOf = 0;
        objValueOf = 0;
        int i15 = 5;
        int i16 = 4;
        z = false;
        boolean z14 = false;
        long j8 = this.f97716b;
        switch (i14) {
            case 0:
                q4.f fVar = (q4.f) obj;
                fVar.getClass();
                o4.j jVarA = m.a();
                jVarA.a(Float.intBitsToFloat((int) (fVar.b() >> 32)) / 2, Float.intBitsToFloat((int) (fVar.b() & 4294967295L)));
                jVarA.c(0.0f, 0.0f);
                jVarA.c(Float.intBitsToFloat((int) (fVar.b() >> 32)), 0.0f);
                jVarA.close();
                q4.f.L(fVar, jVarA, this.f97716b, 0.0f, null, 60);
                return Unit.INSTANCE;
            case 1:
                q4.f fVar2 = (q4.f) obj;
                fVar2.getClass();
                o4.j jVarA2 = m.a();
                jVarA2.a(Float.intBitsToFloat((int) (fVar2.b() >> 32)) / 2, 0.0f);
                jVarA2.c(0.0f, Float.intBitsToFloat((int) (fVar2.b() & 4294967295L)));
                jVarA2.c(Float.intBitsToFloat((int) (fVar2.b() >> 32)), Float.intBitsToFloat((int) (fVar2.b() & 4294967295L)));
                jVarA2.close();
                q4.f.L(fVar2, jVarA2, this.f97716b, 0.0f, null, 60);
                return Unit.INSTANCE;
            case 2:
                q4.f fVar3 = (q4.f) obj;
                fVar3.getClass();
                g6.f.a aVar = g6.f.f75994b;
                k kVar = new k(fVar3.s0(1), 0.0f, 0, 0, null, 30, null);
                long j14 = this.f97716b;
                q4.f.o0(fVar3, j14, 0.0f, 0L, kVar, 0, 110);
                o4.j jVarA3 = m.a();
                float f14 = 2;
                float f15 = 5;
                jVarA3.a(Float.intBitsToFloat((int) (fVar3.b() >> 32)) / f14, Float.intBitsToFloat((int) (fVar3.b() & 4294967295L)) / f15);
                n4.d dVar = new n4.d(0.0f, 0.0f, Float.intBitsToFloat((int) (fVar3.b() >> 32)), Float.intBitsToFloat((int) (fVar3.b() & 4294967295L)));
                float f16 = 270.0f - (25.0f / f14);
                if (jVarA3.f128870c == null) {
                    jVarA3.f128870c = new RectF();
                }
                RectF rectF = jVarA3.f128870c;
                rectF.getClass();
                rectF.set(dVar.f123547a, dVar.f123548b, dVar.f123549c, dVar.f123550d);
                Path path = jVarA3.f128869b;
                RectF rectF2 = jVarA3.f128870c;
                rectF2.getClass();
                path.arcTo(rectF2, f16, 25.0f, false);
                jVarA3.c(Float.intBitsToFloat((int) (fVar3.b() >> 32)) / f14, Float.intBitsToFloat((int) (fVar3.b() & 4294967295L)) / f15);
                jVarA3.close();
                q4.f.L(fVar3, jVarA3, j14, 0.0f, null, 60);
                return Unit.INSTANCE;
            case 3:
                q4.f fVar4 = (q4.f) obj;
                fVar4.getClass();
                o4.j jVarA4 = m.a();
                float f17 = 2;
                float f18 = 60.0f / f17;
                jVarA4.a((Float.intBitsToFloat((int) (fVar4.b() >> 32)) / f17) - f18, Float.intBitsToFloat((int) (fVar4.b() & 4294967295L)) + 4.0f);
                jVarA4.c((Float.intBitsToFloat((int) (fVar4.b() >> 32)) / f17) + f18, Float.intBitsToFloat((int) (fVar4.b() & 4294967295L)) + 4.0f);
                jVarA4.c(Float.intBitsToFloat((int) (fVar4.b() >> 32)) / f17, Float.intBitsToFloat((int) (fVar4.b() & 4294967295L)) + 30.0f + 4.0f);
                jVarA4.close();
                d0.f128823b.getClass();
                q4.f.L(fVar4, jVarA4, d0.c(0.05f, d0.f128824c, 14), 0.0f, new k(8.0f, 0.0f, 0, 0, null, 30, null), 52);
                o4.j jVarA5 = m.a();
                jVarA5.a((Float.intBitsToFloat((int) (fVar4.b() >> 32)) / f17) - f18, Float.intBitsToFloat((int) (fVar4.b() & 4294967295L)));
                jVarA5.c((Float.intBitsToFloat((int) (fVar4.b() >> 32)) / f17) + f18, Float.intBitsToFloat((int) (fVar4.b() & 4294967295L)));
                jVarA5.c(Float.intBitsToFloat((int) (fVar4.b() >> 32)) / f17, Float.intBitsToFloat((int) (fVar4.b() & 4294967295L)) + 30.0f);
                jVarA5.close();
                q4.f.L(fVar4, jVarA5, this.f97716b, 0.0f, null, 60);
                return Unit.INSTANCE;
            case 4:
                vb0.e eVar = (vb0.e) obj;
                eVar.getClass();
                return Boolean.valueOf(eVar.getUnitId() == j8);
            case 5:
                ud.a aVar2 = (ud.a) obj;
                kz0.d.b bVar2 = kz0.d.f107782c;
                aVar2.getClass();
                ud.c cVarM0 = aVar2.M0("SELECT deleted FROM edited_posts WHERE activityId == ?");
                try {
                    cVarM0.h(1, j8);
                    if (cVarM0.J0()) {
                        Integer numValueOf = cVarM0.isNull(0) ? null : Integer.valueOf((int) cVarM0.getLong(0));
                        if (numValueOf != null) {
                            objValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        break;
                    }
                    return objValueOf;
                } finally {
                    cVarM0.close();
                }
            case 6:
                ud.a aVar3 = (ud.a) obj;
                kz0.d.b bVar3 = kz0.d.f107782c;
                aVar3.getClass();
                ud.c cVarM1 = aVar3.M0("SELECT activityId FROM edited_posts WHERE local_timestamp > ?");
                try {
                    cVarM1.h(1, j8);
                    ArrayList arrayList = new ArrayList();
                    while (cVarM1.J0()) {
                        arrayList.add(Long.valueOf(cVarM1.getLong(0)));
                    }
                    cVarM1.close();
                    return arrayList;
                } catch (Throwable th3) {
                    cVarM1.close();
                    throw th3;
                }
            case 7:
                l4.f fVar5 = (l4.f) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar5.f109845a.b() >> 32)) / 2.0f;
                return fVar5.e(new p(fIntBitsToFloat, z2.c.d(fVar5, fIntBitsToFloat), e0.a.a(e0.f128843b, j8), i16));
            case 8:
                ((k0) obj).a(x0.f201843c, new w0(l1.Cursor, this.f97716b, v0.Middle, true, null));
                return Unit.INSTANCE;
            case 9:
                q4.f fVar6 = (q4.f) obj;
                fVar6.getClass();
                float f19 = n4.g.f(fVar6.b()) / 2;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar6.i1() >> 32));
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (fVar6.i1() & 4294967295L));
                o4.j jVarA6 = m.a();
                for (int i17 = 0; i17 < 6; i17++) {
                    double d14 = ((double) i17) * 1.0471975511965976d;
                    float fCos = (((float) Math.cos(d14)) * f19) + fIntBitsToFloat2;
                    float fSin = (((float) Math.sin(d14)) * f19) + fIntBitsToFloat3;
                    if (i17 == 0) {
                        jVarA6.a(fCos, fSin);
                    } else {
                        jVarA6.c(fCos, fSin);
                    }
                }
                jVarA6.close();
                q4.f.L(fVar6, jVarA6, this.f97716b, 0.0f, null, 60);
                return Unit.INSTANCE;
            case 10:
                q4.f fVar7 = (q4.f) obj;
                fVar7.getClass();
                q4.f.o0(fVar7, this.f97716b, 0.0f, 0L, null, 0, 126);
                return Unit.INSTANCE;
            case 11:
                r rVar = (r) obj;
                rVar.getClass();
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                return q.b(j92.b.f97899b.f97916a, j8, rVar, m1.f128891a);
            case 12:
                q4.f fVar8 = (q4.f) obj;
                fVar8.getClass();
                q4.f.o0(fVar8, this.f97716b, 0.0f, 0L, null, 0, 126);
                return Unit.INSTANCE;
            case 13:
                q4.f fVar9 = (q4.f) obj;
                fVar9.getClass();
                g6.f.a aVar4 = g6.f.f75994b;
                return c0.e(fVar9, 2, new m92.m.d(j8, objValueOf), false, 0.0f, null, null, x.k(new h0.e.a(0.0f, 0.0f), new h0.e.a(1.0f, 0.0f)), null, null, null, Float.valueOf(0.0f), Float.valueOf(100.0f), null, false, null, 29624);
            case 14:
                pv0.d dVar2 = (pv0.d) obj;
                int i18 = nw0.r.f128099k;
                dVar2.getClass();
                return Boolean.valueOf(dVar2.f141358a == j8);
            case 15:
                p3.d.a aVar5 = (p3.d.a) obj;
                int i19 = p3.d.f135049c;
                l<? super Long, ? extends R> lVar = aVar5.f135053b;
                if (lVar != 0 && (jVar = aVar5.f135052a) != 0) {
                    try {
                        int i24 = o13.q.f128596b;
                        bVar = lVar.invoke(Long.valueOf(j8));
                    } catch (Throwable th4) {
                        int i25 = o13.q.f128596b;
                        bVar = new o13.q.b(th4);
                    }
                    jVar.resumeWith(bVar);
                    break;
                }
                return Unit.INSTANCE;
            case 16:
                v vVar = (v) obj;
                int i26 = o0.f137273b;
                vVar.getClass();
                return v.a(vVar, null, this.f97716b, false, 11);
            case 17:
                v vVar2 = (v) obj;
                int i27 = o0.f137273b;
                vVar2.getClass();
                return Boolean.valueOf(vVar2.f34319a == j8);
            case 18:
                v vVar3 = (v) obj;
                int i28 = o0.f137273b;
                vVar3.getClass();
                return Boolean.valueOf(vVar3.f34319a == j8);
            case 19:
                q4.f fVar10 = (q4.f) obj;
                pk1.k.a aVar6 = pk1.k.f138297g;
                fVar10.getClass();
                q4.f.o0(fVar10, this.f97716b, 48.0f, 0L, null, 0, 124);
                return Unit.INSTANCE;
            case 20:
                return Long.valueOf(j8);
            case 21:
                l4.f fVar11 = (l4.f) obj;
                fVar11.getClass();
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (fVar11.f109845a.b() & 4294967295L)) * 0.75f;
                w.a aVar7 = w.f129023a;
                d0.f128823b.getClass();
                return fVar11.e(new ck0.g(w.a.i(aVar7, x.k(d0.a(d0.f128831j), d0.a(j8)), fIntBitsToFloat4, 12), i15));
            case 22:
                ab1.g gVar = (ab1.g) obj;
                ScheduledEventsActivity.a aVar8 = ScheduledEventsActivity.f40379d;
                gVar.getClass();
                Long l14 = gVar.f2568a;
                if (l14 != null && l14.longValue() == j8) {
                    z14 = true;
                }
                return Boolean.valueOf(z14);
            case 23:
                ud.a aVar9 = (ud.a) obj;
                w10.e.b bVar4 = w10.e.f181186d;
                aVar9.getClass();
                ud.c cVarM2 = aVar9.M0("DELETE FROM open_web_page_requests WHERE dateReceived = ?");
                try {
                    cVarM2.h(1, j8);
                    cVarM2.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM2.close();
                }
            case 24:
                q4.f fVar12 = (q4.f) obj;
                fVar12.getClass();
                q4.f.o0(fVar12, this.f97716b, n4.g.f(fVar12.b()) / 2.5f, fVar12.i1(), null, 0, 120);
                return Unit.INSTANCE;
            case 25:
                q4.f fVar13 = (q4.f) obj;
                fVar13.getClass();
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                float fS0 = fVar13.s0(j92.b.f97900c.f97911c);
                o4.j jVarA7 = m.a();
                jVarA7.a(0.0f, Float.intBitsToFloat((int) (fVar13.b() & 4294967295L)));
                jVarA7.c(0.0f, fS0);
                jVarA7.r(0.0f, 0.0f, fS0, 0.0f);
                jVarA7.c(Float.intBitsToFloat((int) (fVar13.b() >> 32)) - fS0, 0.0f);
                jVarA7.r(Float.intBitsToFloat((int) (fVar13.b() >> 32)), 0.0f, Float.intBitsToFloat((int) (fVar13.b() >> 32)), fS0);
                jVarA7.c(Float.intBitsToFloat((int) (fVar13.b() >> 32)), Float.intBitsToFloat((int) (fVar13.b() & 4294967295L)));
                g6.f.a aVar10 = g6.f.f75994b;
                q4.f.L(fVar13, jVarA7, this.f97716b, 0.0f, new k(fVar13.s0(1), 0.0f, 0, 0, null, 30, null), 52);
                return Unit.INSTANCE;
            case 26:
                q4.f fVar14 = (q4.f) obj;
                fVar14.getClass();
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                float fS1 = fVar14.s0(j92.b.f97900c.f97911c);
                o4.j jVarA8 = m.a();
                jVarA8.a(0.0f, 0.0f);
                jVarA8.c(0.0f, Float.intBitsToFloat((int) (fVar14.b() & 4294967295L)) - fS1);
                jVarA8.r(0.0f, Float.intBitsToFloat((int) (fVar14.b() & 4294967295L)), fS1, Float.intBitsToFloat((int) (fVar14.b() & 4294967295L)));
                jVarA8.c(Float.intBitsToFloat((int) (fVar14.b() >> 32)) - fS1, Float.intBitsToFloat((int) (fVar14.b() & 4294967295L)));
                jVarA8.r(Float.intBitsToFloat((int) (fVar14.b() >> 32)), Float.intBitsToFloat((int) (fVar14.b() & 4294967295L)), Float.intBitsToFloat((int) (fVar14.b() >> 32)), Float.intBitsToFloat((int) (4294967295L & fVar14.b())) - fS1);
                jVarA8.c(Float.intBitsToFloat((int) (fVar14.b() >> 32)), 0.0f);
                g6.f.a aVar11 = g6.f.f75994b;
                q4.f.L(fVar14, jVarA8, this.f97716b, 0.0f, new k(fVar14.s0(1), 0.0f, 0, 0, null, 30, null), 52);
                return Unit.INSTANCE;
            case 27:
                q4.f fVar15 = (q4.f) obj;
                fVar15.getClass();
                float f22 = 1;
                g6.f.a aVar12 = g6.f.f75994b;
                float fS2 = fVar15.s0(f22);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                n4.c.a aVar13 = n4.c.f123541b;
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar15.b() & 4294967295L)))) & 4294967295L);
                long j15 = this.f97716b;
                q4.f.G1(fVar15, j15, jFloatToRawIntBits, jFloatToRawIntBits2, fS2, 0, null, 0, 496);
                q4.f.G1(fVar15, j15, (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar15.b() >> 32)))) << 32), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar15.b() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar15.b() >> 32)))) << 32), fVar15.s0(f22), 0, null, 0, 496);
                return Unit.INSTANCE;
            case 28:
                q4.f fVar16 = (q4.f) obj;
                fVar16.getClass();
                q4.f.o0(fVar16, this.f97716b, 0.0f, 0L, null, 0, 126);
                return Unit.INSTANCE;
            default:
                q4.f fVar17 = (q4.f) obj;
                fVar17.getClass();
                g6.f.a aVar14 = g6.f.f75994b;
                float fS3 = fVar17.s0(4);
                u1.f129010b.getClass();
                q4.f.Q1(fVar17, this.f97716b, 0.0f, 360.0f, 0L, 0L, 0.0f, new k(fS3, 0.0f, u1.f129011c, 0, null, 26, null), 880);
                return Unit.INSTANCE;
        }
    }
}
