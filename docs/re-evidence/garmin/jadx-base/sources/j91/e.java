package j91;

import c80.q;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.g3;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import d91.t;
import e23.p;
import f12.l;
import i3.fe;
import java.util.Locale;
import java.util.Set;
import l72.d3;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import p92.o;
import q92.x;
import v13.i;
import vb.h;
import zd0.j1;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.personalizedinsights.presentation.dev.PersonalizedInsightsDevMenuActivityKt$PersonalizedInsightsDevMenuView$3$1$1$3$1$1", f = "PersonalizedInsightsDevMenuActivity.kt", l = {151, 153, SyslogConstants.LOG_LOCAL4}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f97868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f97869b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ fe f97870c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f97871d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e23.a<Unit> aVar, fe feVar, String str, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f97869b = aVar;
            this.f97870c = feVar;
            this.f97871d = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f97869b, this.f97870c, this.f97871d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0043  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
        
            if (l72.d3.c(r6.f97870c, r6.f97871d, null, r6) == r0) goto L22;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f97868a;
            if (i14 == 0) {
                r.b(obj);
                o oVar = o.f136619a;
                x xVar = x.DI_CONNECT_AI;
                this.f97868a = 1;
                obj = oVar.f(xVar, Locale.getDefault(), this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                r.b(obj);
            } else if (i14 == 2) {
                r.b(obj);
                sn.a.o(l.f68084a, true);
                this.f97869b.invoke();
                this.f97868a = 3;
            } else {
                if (i14 != 3) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
            s92.g gVar = (s92.g) obj;
            if (gVar != null) {
                o oVar2 = o.f136619a;
                x xVar2 = x.DI_CONNECT_AI;
                this.f97868a = 2;
                if (oVar2.u(xVar2, gVar, this) != aVar) {
                    sn.a.o(l.f68084a, true);
                    this.f97869b.invoke();
                    this.f97868a = 3;
                }
            } else {
                sn.a.o(l.f68084a, true);
                this.f97869b.invoke();
                this.f97868a = 3;
            }
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.personalizedinsights.presentation.dev.PersonalizedInsightsDevMenuActivityKt$PersonalizedInsightsDevMenuView$3$1$1$4$1$1", f = "PersonalizedInsightsDevMenuActivity.kt", l = {TsExtractor.TS_STREAM_TYPE_AC4}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f97872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fe f97873b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f97874c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(fe feVar, String str, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f97873b = feVar;
            this.f97874c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f97873b, this.f97874c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f97872a;
            if (i14 == 0) {
                r.b(obj);
                this.f97872a = 1;
                if (d3.c(this.f97873b, this.f97874c, null, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.personalizedinsights.presentation.dev.PersonalizedInsightsDevMenuActivityKt$PersonalizedInsightsDevMenuView$3$1$1$5$1$1", f = "PersonalizedInsightsDevMenuActivity.kt", l = {183}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f97875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fe f97876b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f97877c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(fe feVar, String str, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f97876b = feVar;
            this.f97877c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f97876b, this.f97877c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f97875a;
            if (i14 == 0) {
                r.b(obj);
                this.f97875a = 1;
                if (d3.c(this.f97876b, this.f97877c, null, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.personalizedinsights.presentation.dev.PersonalizedInsightsDevMenuActivityKt$PersonalizedInsightsDevMenuView$3$1$2$11$1", f = "PersonalizedInsightsDevMenuActivity.kt", l = {271}, m = "invokeSuspend", v = 2)
    public static final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public p1 f97878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f97879b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j1 f97880c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f97881d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(j1 j1Var, p1<Boolean> p1Var, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f97880c = j1Var;
            this.f97881d = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f97880c, this.f97881d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            p1<Boolean> p1Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f97879b;
            if (i14 == 0) {
                r.b(obj);
                q qVar = q.MESSAGING_PLUS;
                p1<Boolean> p1Var2 = this.f97881d;
                this.f97878a = p1Var2;
                this.f97879b = 1;
                obj = this.f97880c.l(qVar, this);
                if (obj == aVar) {
                    return aVar;
                }
                p1Var = p1Var2;
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p1Var = this.f97878a;
                r.b(obj);
            }
            Boolean bool = (Boolean) obj;
            bool.getClass();
            p1Var.setValue(bool);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: j91.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.personalizedinsights.presentation.dev.PersonalizedInsightsDevMenuActivityKt$PersonalizedInsightsDevMenuView$3$1$2$4$1$1", f = "PersonalizedInsightsDevMenuActivity.kt", l = {216}, m = "invokeSuspend", v = 2)
    public static final class C1869e extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f97882a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fe f97883b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f97884c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1869e(fe feVar, String str, t13.d<? super C1869e> dVar) {
            super(2, dVar);
            this.f97883b = feVar;
            this.f97884c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C1869e(this.f97883b, this.f97884c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C1869e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f97882a;
            if (i14 == 0) {
                r.b(obj);
                this.f97882a = 1;
                if (d3.c(this.f97883b, this.f97884c, null, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final void a(e23.a<Unit> aVar, g3<Boolean> g3Var, t tVar, e23.l<? super Boolean, Unit> lVar, e23.q<? super String, ? super Set<String>, ? super Boolean, Unit> qVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.a<Unit> aVar4, m mVar, int i14) {
        int i15;
        e23.l<? super Boolean, Unit> lVar2;
        e23.a<Unit> aVar5;
        o0 o0Var;
        o0 o0VarE = mVar.E(-2066895842);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(g3Var) : o0VarE.r(g3Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(tVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            lVar2 = lVar;
            i15 |= o0VarE.r(lVar2) ? 2048 : 1024;
        } else {
            lVar2 = lVar;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(qVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(aVar2) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(aVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            aVar5 = aVar4;
            i15 |= o0VarE.r(aVar5) ? 8388608 : 4194304;
        } else {
            aVar5 = aVar4;
        }
        if (o0VarE.n(i15 & 1, (4793491 & i15) != 4793490)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = com.nimbusds.jose.shaded.gson.internal.a.f(o0VarE);
            }
            fe feVar = (fe) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = (j1) KoinJavaComponent.get$default(j1.class, null, null, 6, null);
                o0VarE.K(objQ2);
            }
            o0Var = o0VarE;
            z02.d.a(false, z3.f.c(-1968547079, new hl1.i(aVar, 10), o0VarE), z3.f.c(-1097725480, new ak0.o(feVar, 16), o0VarE), null, null, z3.f.c(1514739317, new c42.d(g3Var, lVar2, aVar2, aVar5, aVar3, feVar, tVar, qVar, (j1) objQ2), o0VarE), o0Var, 197046, 24);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new bt1.o(aVar, g3Var, tVar, lVar, qVar, aVar2, aVar3, aVar4, i14);
        }
    }
}
