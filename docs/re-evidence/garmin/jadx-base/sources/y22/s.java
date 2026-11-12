package y22;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.n0;
import c2.n3;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import f5.z0;
import h5.e0;
import i3.h7;
import i3.i7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l72.c1;
import l72.v2;
import lc.u0;
import o4.d0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;

/* JADX INFO: loaded from: classes10.dex */
public final class s {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.view.photos.ManagePhotosScreenKt$ManagePhotosScreen$2$1", f = "ManagePhotosScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f194285a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j f194286b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3<v> f194287c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e23.a<Unit> aVar, j jVar, x3<v> x3Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f194285a = aVar;
            this.f194286b = jVar;
            this.f194287c = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f194285a, this.f194286b, this.f194287c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            y22.f fVar = this.f194287c.getF182175a().f194320b;
            if (fVar instanceof y22.f.b) {
                this.f194285a.invoke();
                this.f194286b.W0();
            } else if (!(fVar instanceof y22.f.a) && fVar != null) {
                u0.r();
                return null;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.view.photos.ManagePhotosScreenKt$ManagePhotosScreen$3$1", f = "ManagePhotosScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f194288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j f194289b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3<v> f194290c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e23.a<Unit> aVar, j jVar, x3<v> x3Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f194288a = aVar;
            this.f194289b = jVar;
            this.f194290c = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f194288a, this.f194289b, this.f194290c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            i iVar = this.f194290c.getF182175a().f194321c;
            if (iVar instanceof i.b) {
                this.f194288a.invoke();
                this.f194289b.g3();
            } else if (!(iVar instanceof i.a) && iVar != null) {
                u0.r();
                return null;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.view.photos.ManagePhotosScreenKt$ManagePhotosScreen$4$1", f = "ManagePhotosScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f194291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f194292b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3<v> f194293c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f194294d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f194295e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(j jVar, e23.a<Unit> aVar, x3<v> x3Var, p1<Boolean> p1Var, p1<Boolean> p1Var2, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f194291a = jVar;
            this.f194292b = aVar;
            this.f194293c = x3Var;
            this.f194294d = p1Var;
            this.f194295e = p1Var2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f194291a, this.f194292b, this.f194293c, this.f194294d, this.f194295e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            y yVar = this.f194293c.getF182175a().f194322d;
            boolean z14 = yVar instanceof y.b;
            j jVar = this.f194291a;
            p1<Boolean> p1Var = this.f194294d;
            if (z14) {
                p1Var.setValue(Boolean.FALSE);
                jVar.O();
            } else if (yVar instanceof y.c) {
                p1Var.setValue(Boolean.FALSE);
                this.f194292b.invoke();
                jVar.O();
            } else if (yVar instanceof y.a) {
                this.f194295e.setValue(Boolean.TRUE);
            } else if (yVar != null) {
                u0.r();
                return null;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.r<c2.t, Boolean, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ hf.j f194296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ w f194297b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f194298c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1<w> f194299d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.l<Integer, Unit> f194300e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f194301f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ x3<i53.c<w>> f194302g;

        /* JADX WARN: Multi-variable type inference failed */
        public d(hf.j jVar, w wVar, int i14, p1<w> p1Var, e23.l<? super Integer, Unit> lVar, p1<Boolean> p1Var2, x3<? extends i53.c<w>> x3Var) {
            this.f194296a = jVar;
            this.f194297b = wVar;
            this.f194298c = i14;
            this.f194299d = p1Var;
            this.f194300e = lVar;
            this.f194301f = p1Var2;
            this.f194302g = x3Var;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x006d  */
        /* JADX WARN: Code duplicated, block: B:25:0x008f  */
        @Override // e23.r
        public final Unit invoke(c2.t tVar, Boolean bool, p3.m mVar, Integer num) {
            bool.getClass();
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            tVar.getClass();
            if (mVar2.n(iIntValue & 1, (iIntValue & 129) != 128)) {
                x1 x1Var = p3.n.f135158a;
                w wVar = this.f194297b;
                Uri uri = wVar.f194324a;
                int i14 = this.f194298c;
                boolean z14 = i14 == 0;
                p1<Boolean> p1Var = this.f194301f;
                boolean zC = s.c(p1Var);
                boolean zBooleanValue = p1Var.getF182175a().booleanValue();
                boolean z15 = this.f194302g.getF182175a().size() > 1;
                p1<w> p1Var2 = this.f194299d;
                boolean zB = mVar2.B(p1Var2) | mVar2.r(wVar);
                Object objQ = mVar2.q();
                p3.m.a aVar = p3.m.f135153a;
                if (zB) {
                    objQ = new t(wVar, p1Var2);
                    mVar2.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new t(wVar, p1Var2);
                        mVar2.K(objQ);
                    }
                }
                e23.a aVar2 = (e23.a) objQ;
                e23.l<Integer, Unit> lVar = this.f194300e;
                boolean zB2 = mVar2.B(lVar) | mVar2.k(i14);
                Object objQ2 = mVar2.q();
                if (zB2) {
                    objQ2 = new u(lVar, i14);
                    mVar2.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new u(lVar, i14);
                        mVar2.K(objQ2);
                    }
                }
                s.a(this.f194296a, uri, z14, zC, zBooleanValue, z15, aVar2, (e23.a) objQ2, mVar2, 0);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.p f194303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f194304b;

        public e(e23.p pVar, List list) {
            this.f194303a = pVar;
            this.f194304b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            int iIntValue = num.intValue();
            return this.f194303a.invoke(Integer.valueOf(iIntValue), this.f194304b.get(iIntValue));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.p<f2.t, Integer, f2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.q f194305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f194306b;

        public f(e23.q qVar, List list) {
            this.f194305a = qVar;
            this.f194306b = list;
        }

        @Override // e23.p
        public final f2.c invoke(f2.t tVar, Integer num) {
            int iIntValue = num.intValue();
            Integer numValueOf = Integer.valueOf(iIntValue);
            Object obj = this.f194306b.get(iIntValue);
            return f2.c.a(((f2.c) this.f194305a.invoke(tVar, numValueOf, obj)).f68178a);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f194307a;

        public g(List list) {
            this.f194307a = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            this.f194307a.get(num.intValue());
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.r<f2.r, Integer, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f194308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k02.d f194309b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ hf.j f194310c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1 f194311d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.l f194312e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ p1 f194313f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ x3 f194314g;

        public h(List list, k02.d dVar, hf.j jVar, p1 p1Var, e23.l lVar, p1 p1Var2, x3 x3Var) {
            this.f194308a = list;
            this.f194309b = dVar;
            this.f194310c = jVar;
            this.f194311d = p1Var;
            this.f194312e = lVar;
            this.f194313f = p1Var2;
            this.f194314g = x3Var;
        }

        @Override // e23.r
        public final Unit invoke(f2.r rVar, Integer num, p3.m mVar, Integer num2) {
            int i14;
            f2.r rVar2 = rVar;
            int iIntValue = num.intValue();
            p3.m mVar2 = mVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i14 = (mVar2.B(rVar2) ? 4 : 2) | iIntValue2;
            } else {
                i14 = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i14 |= mVar2.k(iIntValue) ? 32 : 16;
            }
            if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
                x1 x1Var = p3.n.f135158a;
                w wVar = (w) this.f194308a.get(iIntValue);
                mVar2.C(1794591288);
                h4.r.a aVar = h4.r.S;
                p1 p1Var = this.f194313f;
                x3 x3Var = this.f194314g;
                k02.b.a(rVar2, this.f194309b, iIntValue, aVar, z3.f.c(269660249, new d(this.f194310c, wVar, iIntValue, this.f194311d, this.f194312e, p1Var, x3Var), mVar2), mVar2, (i14 & 14) | 27712 | (((i14 & 126) << 3) & 896));
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:78:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:91:0x0235  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final hf.j jVar, final Uri uri, final boolean z14, final boolean z15, final boolean z16, final boolean z17, e23.a<Unit> aVar, final e23.a<Unit> aVar2, p3.m mVar, final int i14) {
        final e23.a<Unit> aVar3;
        o0 o0Var;
        h4.r rVar;
        h4.r.a aVar4;
        c2.u uVar;
        boolean z18;
        long jC;
        float f14;
        o0 o0VarE = mVar.E(379530345);
        int i15 = i14 | (o0VarE.r(jVar) ? 4 : 2) | (o0VarE.r(uri) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.h(z15) ? 2048 : 1024) | (o0VarE.h(z16) ? 16384 : 8192) | (o0VarE.h(z17) ? 131072 : 65536) | (o0VarE.r(aVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(aVar2) ? 8388608 : 4194304);
        if (o0VarE.n(i15 & 1, (i15 & 4793491) != 4793490)) {
            x1 x1Var = p3.n.f135158a;
            boolean zB = o0VarE.B(uri);
            Object objQ = o0VarE.q();
            p3.m.a aVar5 = p3.m.f135153a;
            if (zB) {
                objQ = p0.n(null);
                o0VarE.K(objQ);
            } else {
                aVar5.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = p0.n(null);
                    o0VarE.K(objQ);
                }
            }
            p1 p1Var = (p1) objQ;
            h4.r.a aVar6 = h4.r.S;
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar6, o0VarE);
            h5.g.V.getClass();
            e0.a aVar7 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar7);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar2 = c2.u.f22885a;
            float f15 = 1.0f;
            h4.r rVarF = x2.f(aVar6, 1.0f);
            if (z14) {
                n4.g gVar = (n4.g) p1Var.getF182175a();
                if (gVar != null) {
                    rVar = rVarF;
                    long j8 = gVar.f123561a;
                    f14 = 1.0f;
                    o0Var = o0VarE;
                    if (Float.intBitsToFloat((int) (j8 >> 32)) == 0.0f || Float.intBitsToFloat((int) (j8 & 4294967295L)) == 0.0f) {
                        gVar = null;
                    }
                    if (gVar != null) {
                        long j14 = gVar.f123561a;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (j14 >> 32)) / Float.intBitsToFloat((int) (j14 & 4294967295L));
                        if (fIntBitsToFloat >= 1.0f) {
                            f15 = fIntBitsToFloat;
                        }
                    }
                } else {
                    f14 = 1.0f;
                    rVar = rVarF;
                    o0Var = o0VarE;
                }
                f15 = f14;
            } else {
                o0Var = o0VarE;
                rVar = rVarF;
            }
            o0VarE = o0Var;
            h4.r rVarA = v2.a(c2.l.g(rVar, f15), !z16, new p(aVar2, 0), o0VarE, 0);
            d92.b.f58623a.getClass();
            t4.c cVar = new t4.c(d92.b.a(o0VarE).c().g(), null);
            f5.k.f68985a.getClass();
            f5.k.a.C1427a c1427a = f5.k.a.f68987b;
            boolean zB2 = o0VarE.B(p1Var);
            Object objQ2 = o0VarE.q();
            if (zB2) {
                objQ2 = new xq1.c(p1Var, 5);
                o0VarE.K(objQ2);
            } else {
                aVar5.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new xq1.c(p1Var, 5);
                    o0VarE.K(objQ2);
                }
            }
            jf.b.b(uri, null, jVar, rVarA, cVar, null, null, null, (e23.l) objQ2, null, null, c1427a, null, 0, o0VarE, ((i15 >> 3) & 14) | 48 | ((i15 << 6) & 896), 48, 63200);
            if (z15) {
                o0VarE.C(-1549982866);
                aVar4 = aVar6;
                uVar = uVar2;
                h4.r rVarC2 = uVar.c(aVar4, h4.d.a.f81526d);
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar = j92.b.f97899b;
                float f16 = eVar.f97918c;
                bVar2.getClass();
                h4.r rVarC3 = c2.l.C(rVarC2, 0.0f, f16, eVar.f97918c, 0.0f, 9);
                bVar2.getClass();
                h4.r rVarQ = x2.q(rVarC3, j92.b.f97901d.f97905d);
                boolean z19 = (i15 & 3670016) == 1048576;
                Object objQ3 = o0VarE.q();
                if (z19) {
                    aVar3 = aVar;
                    objQ3 = new wv0.v(aVar3, 27);
                    o0VarE.K(objQ3);
                } else {
                    aVar5.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        aVar3 = aVar;
                        objQ3 = new wv0.v(aVar3, 27);
                        o0VarE.K(objQ3);
                    } else {
                        aVar3 = aVar;
                    }
                }
                y22.h.f194256a.getClass();
                h7.a((e23.a) objQ3, rVarQ, false, null, null, y22.h.f194257b, o0VarE, 1572864, 60);
                z18 = false;
                o0VarE.g0(false);
            } else {
                aVar3 = aVar;
                aVar4 = aVar6;
                uVar = uVar2;
                z18 = false;
                o0VarE.C(-1549230093);
                o0VarE.g0(false);
            }
            if (z16) {
                o0VarE.C(-1549166884);
                s62.a.f157643a.getClass();
                u4.d dVarA = v62.h7.a(t62.b.f162798a);
                String strQ = gl1.y.Q(o0VarE, R.string.lbl_reorder);
                if (z17) {
                    o0VarE.C(-1549000972);
                    jC = d92.b.a(o0VarE).f().b();
                    o0VarE.g0(z18);
                } else {
                    o0VarE.C(-1548931966);
                    jC = d0.c(0.5f, d92.b.a(o0VarE).f().b(), 14);
                    o0VarE.g0(z18);
                }
                long j15 = jC;
                h4.r rVarC4 = uVar.c(aVar4, h4.d.a.f81530h);
                j92.b bVar3 = d92.b.f58625c;
                bVar3.getClass();
                j92.e eVar2 = j92.b.f97899b;
                float f17 = eVar2.f97918c;
                bVar3.getClass();
                h4.r rVarC5 = c2.l.C(rVarC4, f17, 0.0f, 0.0f, eVar2.f97918c, 6);
                bVar3.getClass();
                h4.r rVarE = u1.n.e(x2.q(rVarC5, j92.b.f97901d.f97905d), d92.b.a(o0VarE).e().d(), k2.i.f102406a);
                bVar3.getClass();
                i7.b(dVarA, strQ, c2.l.y(rVarE, eVar2.f97917b), j15, o0VarE, 0, 0);
                o0VarE = o0VarE;
                o0VarE.g0(z18);
            } else {
                o0VarE.C(-1548458317);
                o0VarE.g0(z18);
            }
            o0VarE.g0(true);
        } else {
            aVar3 = aVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(uri, z14, z15, z16, z17, aVar3, aVar2, i14) { // from class: y22.q

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Uri f194275b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f194276c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f194277d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f194278e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f194279f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ e23.a f194280g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ e23.a f194281h;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(1);
                    s.a(this.f194274a, this.f194275b, this.f194276c, this.f194277d, this.f194278e, this.f194279f, this.f194280g, this.f194281h, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final j jVar, int i14, String str, hf.j jVar2, e23.a<Unit> aVar, e23.l<? super Integer, Unit> lVar, e23.a<Unit> aVar2, p3.m mVar, int i15) {
        o0 o0Var;
        final int i16;
        p1 p1Var;
        p1 p1Var2;
        p1 p1Var3;
        jVar.getClass();
        aVar.getClass();
        lVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(182163416);
        int i17 = i15 | (o0VarE.B(jVar) ? 4 : 2) | (o0VarE.k(i14) ? 32 : 16) | (o0VarE.B(str) ? 256 : 128) | (o0VarE.r(jVar2) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192) | (o0VarE.r(lVar) ? 131072 : 65536) | (o0VarE.r(aVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i17 & 1, (599187 & i17) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            final Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new xh0.d(21);
                o0VarE.K(objQ);
            }
            p1 p1Var4 = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            Object[] objArr2 = new Object[0];
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new xh0.d(22);
                o0VarE.K(objQ2);
            }
            p1 p1Var5 = (p1) d4.a.e(objArr2, (e23.a) objQ2, o0VarE, 48);
            p1 p1VarC = s9.c.c(jVar.getF153054g(), o0VarE);
            p1 p1VarC2 = s9.c.c(jVar.getF153055h(), o0VarE);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p1 p1Var6 = (p1) objQ3;
            int size = i14 - ((i53.c) p1VarC.getF182175a()).size();
            int i18 = i17 & 14;
            boolean zR = (i18 == 4) | o0VarE.r(context);
            Object objQ4 = o0VarE.q();
            if (zR || objQ4 == c2565a) {
                i16 = 0;
                objQ4 = new e23.l() { // from class: y22.r
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        switch (i16) {
                            case 0:
                                List list = (List) obj;
                                list.getClass();
                                ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(new w((Uri) it.next(), null));
                                }
                                jVar.G2(context, arrayList);
                                break;
                            default:
                                Uri uri = (Uri) obj;
                                uri.getClass();
                                jVar.G2(context, p13.w.c(new w(uri, null)));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ4);
            } else {
                i16 = 0;
            }
            e23.a aVarF = y22.e.f((e23.l) objQ4, o0VarE, size, i16);
            boolean zR2 = (i18 == 4) | o0VarE.r(context);
            Object objQ5 = o0VarE.q();
            if (zR2 || objQ5 == c2565a) {
                final int i19 = 1;
                objQ5 = new e23.l() { // from class: y22.r
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        switch (i19) {
                            case 0:
                                List list = (List) obj;
                                list.getClass();
                                ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(new w((Uri) it.next(), null));
                                }
                                jVar.G2(context, arrayList);
                                break;
                            default:
                                Uri uri = (Uri) obj;
                                uri.getClass();
                                jVar.G2(context, p13.w.c(new w(uri, null)));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ5);
            }
            ug2.k kVarE = y22.e.e((e23.l) objQ5, o0VarE);
            boolean z14 = i18 == 4;
            Object objQ6 = o0VarE.q();
            if (z14 || objQ6 == c2565a) {
                objQ6 = new m(jVar, 2);
                o0VarE.K(objQ6);
            }
            e23.a aVar3 = (e23.a) objQ6;
            boolean zC = c(p1Var4);
            boolean zB = o0VarE.B(aVar3);
            Object objQ7 = o0VarE.q();
            if (zB || objQ7 == c2565a) {
                objQ7 = new wv0.v(aVar3, 28);
                o0VarE.K(objQ7);
            }
            c.w.a(0, 0, (e23.a) objQ7, o0VarE, zC);
            y22.f fVar = ((v) p1VarC2.getF182175a()).f194320b;
            int i24 = i17 & 3670016;
            boolean zB2 = o0VarE.B(p1VarC2) | (i24 == 1048576) | (i18 == 4);
            Object objQ8 = o0VarE.q();
            if (zB2 || objQ8 == c2565a) {
                objQ8 = new a(aVar2, jVar, p1VarC2, null);
                o0VarE.K(objQ8);
            }
            l0.e((e23.p) objQ8, fVar, o0VarE);
            i iVar = ((v) p1VarC2.getF182175a()).f194321c;
            boolean zB3 = o0VarE.B(p1VarC2) | (i24 == 1048576) | (i18 == 4);
            Object objQ9 = o0VarE.q();
            if (zB3 || objQ9 == c2565a) {
                objQ9 = new b(aVar2, jVar, p1VarC2, null);
                o0VarE.K(objQ9);
            }
            l0.e((e23.p) objQ9, iVar, o0VarE);
            y yVar = ((v) p1VarC2.getF182175a()).f194322d;
            boolean zB4 = o0VarE.B(p1VarC2) | o0VarE.B(p1Var4) | (i18 == 4) | (i24 == 1048576) | o0VarE.B(p1Var5);
            Object objQ10 = o0VarE.q();
            if (zB4 || objQ10 == c2565a) {
                p1Var = p1VarC2;
                p1Var2 = p1Var4;
                c cVar = new c(jVar, aVar2, p1Var, p1Var2, p1Var5, null);
                p1Var3 = p1Var5;
                o0VarE.K(cVar);
                objQ10 = cVar;
            } else {
                p1Var3 = p1Var5;
                p1Var2 = p1Var4;
                p1Var = p1VarC2;
            }
            l0.e((e23.p) objQ10, yVar, o0VarE);
            boolean z15 = ((v) p1Var.getF182175a()).f194319a;
            n0 n0Var = n3.f22788a;
            o0Var = o0VarE;
            z02.d.a(z15, z3.f.c(777095453, new et.o(p1Var2, aVar3, aVar, 3), o0VarE), null, null, new n0(0, 0, 0, 0), z3.f.c(-1772751839, new ll.a(i14, p1Var3, jVar, p1Var2, str, p1VarC, jVar2, lVar, aVarF, kVarE, p1Var6, p1Var, context), o0VarE), o0Var, 196656, 12);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q32.b(jVar, i14, str, jVar2, aVar, lVar, aVar2, i15);
        }
    }

    public static final boolean c(p1<Boolean> p1Var) {
        return p1Var.getF182175a().booleanValue();
    }

    public static final void d(e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1890382789);
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2) | (o0VarE.r(aVar2) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            c1.f110940a.a(false, null, gl1.y.Q(o0VarE, R.string.technical_challenge_message), null, null, gl1.y.Q(o0VarE, R.string.lbl_try_again), false, false, aVar, gl1.y.Q(o0VarE, R.string.lbl_cancel), aVar2, o0VarE, (i15 << 24) & 234881024, (i15 >> 3) & 14, 219);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new nw0.l(aVar, aVar2, i14, 23);
        }
    }
}
