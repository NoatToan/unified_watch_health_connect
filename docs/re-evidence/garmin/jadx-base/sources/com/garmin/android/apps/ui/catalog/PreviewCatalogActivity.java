package com.garmin.android.apps.ui.catalog;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import ch.qos.logback.core.net.SyslogConstants;
import com.mapbox.maps.extension.compose.style.standard.StandardStyleConfigurationState;
import e2.i0;
import e23.l;
import e23.p;
import i3.e9;
import i3.mc;
import java.util.List;
import l30.y0;
import lc.h0;
import lc.m0;
import lc.v;
import lc.v0;
import lc.y;
import m72.j;
import o13.r;
import o53.b0;
import org.koin.core.error.NoDefinitionFoundException;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000b²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\t\u001a\u0004\u0018\u00010\b8\nX\u008a\u0084\u0002²\u0006\f\u0010\n\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/ui/catalog/PreviewCatalogActivity;", "Lb/g;", "<init>", "()V", "Lx72/e;", StandardStyleConfigurationState.CONFIG_THEME, "", "openBottomSheet", "Llc/v;", "navBackStackEntry", "jumpToBottomButtonEnabled", "preview_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PreviewCatalogActivity extends b.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f49781a = 0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.ui.catalog.PreviewCatalogActivity$CatalogApp$2$1$1$1", f = "PreviewCatalogActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f49782a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p1<Boolean> p1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f49782a = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f49782a, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            int i14 = PreviewCatalogActivity.f49781a;
            this.f49782a.setValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.ui.catalog.PreviewCatalogActivity$CatalogApp$2$5$1$1$1", f = "PreviewCatalogActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<x72.e, Unit> f49783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x72.e f49784b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(l<? super x72.e, Unit> lVar, x72.e eVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f49783a = lVar;
            this.f49784b = eVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f49783a, this.f49784b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f49783a.invoke(this.f49784b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.ui.catalog.PreviewCatalogActivity$CatalogApp$2$hideBottomSheet$1$1$1", f = "PreviewCatalogActivity.kt", l = {SyslogConstants.LOG_LOCAL1}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f49786b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(mc mcVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f49786b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f49786b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f49785a;
            if (i14 == 0) {
                r.b(obj);
                this.f49785a = 1;
                if (this.f49786b.d(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n72.i f49787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ PreviewCatalogActivity f49788b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m0 f49789c;

        public d(n72.i iVar, PreviewCatalogActivity previewCatalogActivity, m0 m0Var) {
            this.f49787a = iVar;
            this.f49788b = previewCatalogActivity;
            this.f49789c = m0Var;
        }

        @Override // e23.a
        public final Unit invoke() {
            n72.i iVar = this.f49787a;
            if (iVar instanceof n72.a) {
                l<Context, Intent> lVar = ((n72.a) iVar).f124847f;
                PreviewCatalogActivity previewCatalogActivity = this.f49788b;
                previewCatalogActivity.startActivity(lVar.invoke(previewCatalogActivity));
            } else {
                y.l(this.f49789c, new w72.g.e(iVar.getF124912a()));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.ui.catalog.PreviewCatalogActivity$SecondaryScreen$2$1$2$1$1", f = "PreviewCatalogActivity.kt", l = {326}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i0 f49791b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(i0 i0Var, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f49791b = i0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(this.f49791b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f49790a;
            if (i14 == 0) {
                r.b(obj);
                this.f49790a = 1;
                i0.a aVar2 = i0.f62432x;
                if (this.f49791b.l(0, 0, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f49792a = new f();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f49793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f49794b;

        public g(l lVar, List list) {
            this.f49793a = lVar;
            this.f49794b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f49793a.invoke(this.f49794b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f49795a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f49796b;

        public h(l lVar, List list) {
            this.f49795a = lVar;
            this.f49796b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f49795a.invoke(this.f49796b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i implements e23.r<e2.d, Integer, m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f49797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ PreviewCatalogActivity f49798b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m0 f49799c;

        public i(List list, PreviewCatalogActivity previewCatalogActivity, m0 m0Var) {
            this.f49797a = list;
            this.f49798b = previewCatalogActivity;
            this.f49799c = m0Var;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0092  */
        @Override // e23.r
        public final Unit invoke(e2.d dVar, Integer num, m mVar, Integer num2) {
            int i14;
            e2.d dVar2 = dVar;
            int iIntValue = num.intValue();
            m mVar2 = mVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i14 = (mVar2.B(dVar2) ? 4 : 2) | iIntValue2;
            } else {
                i14 = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i14 |= mVar2.k(iIntValue) ? 32 : 16;
            }
            if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
                x1 x1Var = n.f135158a;
                n72.i iVar = (n72.i) this.f49797a.get(iIntValue);
                mVar2.C(1302129369);
                String name = iVar.getF124913b();
                String description = iVar.getF124914c();
                h4.r.a aVar = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarA = c2.l.A(aVar, j92.b.f97899b.f97920e, 0.0f, 2);
                boolean zR = mVar2.r(iVar);
                PreviewCatalogActivity previewCatalogActivity = this.f49798b;
                boolean zR2 = zR | mVar2.r(previewCatalogActivity);
                m0 m0Var = this.f49799c;
                boolean zR3 = zR2 | mVar2.r(m0Var);
                Object objQ = mVar2.q();
                if (zR3) {
                    objQ = new d(iVar, previewCatalogActivity, m0Var);
                    mVar2.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new d(iVar, previewCatalogActivity, m0Var);
                        mVar2.K(objQ);
                    }
                }
                l72.l.d(name, description, null, rVarA, null, false, (e23.a) objQ, mVar2, 0, 52);
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"RestrictedApi"})
    public final void K9(x72.e eVar, m72.i iVar, l<? super x72.e, Unit> lVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(1093496272);
        int i15 = i14 | (o0VarE.B(eVar) ? 4 : 2) | (o0VarE.B(iVar) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(this) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0 b0Var = (b0) objQ;
            Object[] objArr = new Object[0];
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new ll0.b(17);
                o0VarE.K(objQ2);
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ2, o0VarE, 48);
            mc mcVarF = e9.f(false, null, o0VarE, 0, 3);
            m0 m0VarI = gl1.y.I(new v0[0], o0VarE);
            boolean zB = o0VarE.B(m0VarI);
            Object objQ3 = o0VarE.q();
            if (zB || objQ3 == c2565a) {
                objQ3 = new w72.a(m0VarI);
                o0VarE.K(objQ3);
            }
            w72.a aVar = (w72.a) objQ3;
            v vVar = (v) gl1.y.l(m0VarI, o0VarE).getF182175a();
            h0 h0Var = vVar != null ? vVar.f111882b : null;
            k3.i.f102517b.getClass();
            k3.e.b(z3.f.c(245830089, new y0(19, h0Var, aVar), o0VarE), k3.i.f102520e, null, z3.f.c(1429447654, new dd1.d(this, m0VarI, b0Var, p1Var, iVar, mcVarF, eVar, lVar, 13), o0VarE), o0VarE, 3078);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new jj2.c(this, eVar, iVar, lVar, i14, 25);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x007a  */
    public final void L9(m0 m0Var, e23.a<Unit> aVar, m72.i iVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1870986481);
        int i15 = (o0VarE.r(this) ? 2048 : 1024) | i14 | (o0VarE.r(m0Var) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.B(iVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            w72.g.f fVar = w72.g.f.INSTANCE;
            boolean zR = o0VarE.r(this) | o0VarE.r(m0Var) | ((i15 & 112) == 32) | ((i15 & 896) == 256);
            Object objQ = o0VarE.q();
            if (zR) {
                ev2.f fVar2 = new ev2.f(iVar, this, m0Var, aVar, 26);
                o0VarE.K(fVar2);
                objQ = fVar2;
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    ev2.f fVar3 = new ev2.f(iVar, this, m0Var, aVar, 26);
                    o0VarE.K(fVar3);
                    objQ = fVar3;
                }
            }
            nc.y.a(m0Var, fVar, null, null, null, null, null, null, null, (l) objQ, o0VarE, (i15 & 14) | 48, 2044);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new j(this, m0Var, aVar, iVar, i14, 0);
        }
    }

    public final void M9(m0 m0Var, e23.a<Unit> aVar, m72.i iVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(6209916);
        int i15 = i14 | (o0VarE.r(m0Var) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.B(iVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            m72.f.a("Garmin Design System", null, aVar, null, null, z3.f.c(-718286630, new y0(18, m0Var, iVar), o0VarE), o0VarE, ((i15 << 3) & 896) | 196662, 24);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new j(this, m0Var, aVar, iVar, i14, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0076  */
    public final void N9(m0 m0Var, String str, e23.a<Unit> aVar, List<? extends n72.i> list, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1992429703);
        int i15 = i14 | (o0VarE.r(m0Var) ? 4 : 2);
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        int i16 = i15 | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(list) ? 2048 : 1024) | (o0VarE.r(this) ? 16384 : 8192);
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            boolean zR = o0VarE.r(m0Var);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new k62.j(m0Var, 10);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new k62.j(m0Var, 10);
                    o0VarE.K(objQ);
                }
            }
            m72.f.a(str, (e23.a) objQ, aVar, null, null, z3.f.c(1578041047, new lb0.a(list, 15, this, m0Var), o0VarE), o0VarE, ((i16 >> 3) & 14) | 196608 | (i16 & 896), 24);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ka0.e(this, m0Var, str, aVar, list, i14);
        }
    }

    @Override // b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b.j.a(this);
        m72.i iVar = null;
        try {
            iVar = (m72.i) KoinJavaComponent.get$default(m72.i.class, null, null, 6, null);
        } catch (NoDefinitionFoundException | Exception unused) {
        }
        c.j.a(this, new z3.e(1856812333, true, new y0(17, this, iVar)));
    }
}
