package com.garmin.android.apps.connectmobile.courses.presentation.planner;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.g1;
import androidx.fragment.app.v;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.courses.presentation.planner.CoursePointListActivity;
import com.garmin.android.apps.connectmobile.l2;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import e23.l;
import e23.p;
import g30.h;
import g30.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import lc.u0;
import o13.m;
import o13.n;
import o13.r;
import o53.b0;
import o62.s0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p3.x3;
import r1.q2;
import r50.a0;
import r50.f;
import r50.o;
import r50.t;
import r50.w;
import r50.x;
import r50.y;
import r50.z;
import r53.b2;
import r53.c2;
import r53.j;
import r53.m1;
import r53.p2;
import r53.u;
import u20.g;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/presentation/planner/CoursePointListActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lu20/g;", "Lu40/g;", "Ll40/b;", "<init>", "()V", "a", "Lt50/e;", RemoteConfigConstants.ResponseFieldKey.STATE, "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CoursePointListActivity extends com.garmin.android.apps.connectmobile.c implements g, u40.g, l40.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f33079c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f33080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f33081b = m.a(n.NONE, new e(this, null, null, new f(this, 2)));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends q implements l<t50.b, Unit> {
        public b(Object obj) {
            super(1, obj, CoursePointListActivity.class, "onAction", "onAction(Lcom/garmin/android/apps/connectmobile/courses/presentation/planner/model/CoursePointListAction;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(t50.b bVar) {
            t50.b bVar2 = bVar;
            bVar2.getClass();
            CoursePointListActivity coursePointListActivity = (CoursePointListActivity) this.receiver;
            a aVar = CoursePointListActivity.f33079c;
            coursePointListActivity.ea(bVar2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.planner.CoursePointListActivity$onCreate$2$1$2$1", f = "CoursePointListActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<t50.e> f33083b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(x3<t50.e> x3Var, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f33083b = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return CoursePointListActivity.this.new c(this.f33083b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            a aVar2 = CoursePointListActivity.f33079c;
            boolean z14 = this.f33083b.getF182175a().f162541a;
            CoursePointListActivity coursePointListActivity = CoursePointListActivity.this;
            if (z14) {
                coursePointListActivity.showProgressOverlay();
            } else {
                coursePointListActivity.hideProgressOverlay();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.planner.CoursePointListActivity$onCreate$2$1$3$1", f = "CoursePointListActivity.kt", l = {101}, m = "invokeSuspend", v = 2)
    public static final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f33084a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CoursePointListActivity f33086a;

            public a(CoursePointListActivity coursePointListActivity) {
                this.f33086a = coursePointListActivity;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                com.garmin.android.apps.connectmobile.courses.model.e eVar;
                t50.c cVar = (t50.c) obj;
                boolean zG = s.g(cVar, t50.c.o.f162531a);
                CoursePointListActivity coursePointListActivity = this.f33086a;
                if (zG) {
                    a aVar = CoursePointListActivity.f33079c;
                    coursePointListActivity.displayFailedMessage();
                } else if (cVar instanceof t50.c.s) {
                    com.garmin.android.apps.connectmobile.courses.model.g gVar = ((t50.c.s) cVar).f162536a;
                    a aVar2 = CoursePointListActivity.f33079c;
                    r50.g gVarDa = coursePointListActivity.da();
                    gVarDa.getClass();
                    gVarDa.y4(new t50.c.r(gVar));
                    coursePointListActivity.da().A4(gVar);
                    coursePointListActivity.fa(gVar);
                } else {
                    int i14 = 0;
                    if (cVar instanceof t50.c.q) {
                        t50.c.q qVar = (t50.c.q) cVar;
                        List<GeoPointDTO> list = qVar.f162533a;
                        com.garmin.android.apps.connectmobile.courses.model.g gVar2 = qVar.f162534b;
                        a aVar3 = CoursePointListActivity.f33079c;
                        v supportFragmentManager = coursePointListActivity.getSupportFragmentManager();
                        supportFragmentManager.getClass();
                        c60.e.q(supportFragmentManager, list, new qy0.a(21), new r50.b(coursePointListActivity, gVar2, 0));
                    } else if (cVar instanceof t50.c.C3061c) {
                        t50.c.C3061c c3061c = (t50.c.C3061c) cVar;
                        com.garmin.android.apps.connectmobile.courses.model.f fVar = c3061c.f162518a;
                        com.garmin.android.library.mapsdkadapter.f fVar2 = c3061c.f162519b;
                        a aVar4 = CoursePointListActivity.f33079c;
                        r50.g gVarDa2 = coursePointListActivity.da();
                        s0 s0Var = new s0(coursePointListActivity, 15);
                        r50.c cVar2 = new r50.c(coursePointListActivity, i14);
                        gVarDa2.getClass();
                        w20.a aVar5 = ((t50.e) gVarDa2.f150432k.getValue()).f162543c;
                        gVarDa2.y4(new t50.c.b((aVar5 == null || (eVar = aVar5.f181476a) == null) ? null : eVar.geoPoints, fVar, fVar2, s0Var, cVar2));
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return CoursePointListActivity.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to com.garmin.android.apps.connectmobile.courses.presentation.planner.CoursePointListActivity$d for r5v1 'this'  t13.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                u13.a r0 = u13.a.COROUTINE_SUSPENDED
                int r1 = r5.f33084a
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L14
                if (r1 == r3) goto L10
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r6)
                return r2
            L10:
                o13.r.b(r6)
                goto L31
            L14:
                o13.r.b(r6)
                com.garmin.android.apps.connectmobile.courses.presentation.planner.CoursePointListActivity$a r6 = com.garmin.android.apps.connectmobile.courses.presentation.planner.CoursePointListActivity.f33079c
                com.garmin.android.apps.connectmobile.courses.presentation.planner.CoursePointListActivity r6 = com.garmin.android.apps.connectmobile.courses.presentation.planner.CoursePointListActivity.this
                r50.g r1 = r6.da()
                r53.a2 r1 = r1.f150435n
                com.garmin.android.apps.connectmobile.courses.presentation.planner.CoursePointListActivity$d$a r4 = new com.garmin.android.apps.connectmobile.courses.presentation.planner.CoursePointListActivity$d$a
                r4.<init>(r6)
                r5.f33084a = r3
                r53.d2<T> r6 = r1.f150526a
                java.lang.Object r6 = r6.collect(r4, r5)
                if (r6 != r0) goto L31
                return r0
            L31:
                o2.c.f()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.courses.presentation.planner.CoursePointListActivity.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<r50.g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f33087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f33088b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f33089c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f33090d;

        public e(b.g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f33087a = gVar;
            this.f33088b = qualifier;
            this.f33089c = aVar;
            this.f33090d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, r50.g] */
        @Override // e23.a
        public final r50.g invoke() {
            CreationExtras defaultViewModelCreationExtras;
            b.g gVar = this.f33087a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f33089c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(p005kotlin.jvm.internal.s0.f105811a.b(r50.g.class), f189591b, null, defaultViewModelCreationExtras, this.f33088b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f33090d, 4, null);
        }
    }

    @Override // l40.b
    public final void F3(l40.a aVar) {
        da().F3(aVar);
    }

    @Override // u40.g
    public final void J4(com.garmin.android.apps.connectmobile.courses.model.g gVar, GeoPointDTO geoPointDTO) {
        ea(new t50.b.i(gVar, geoPointDTO));
    }

    @Override // l40.b
    /* JADX INFO: renamed from: S2 */
    public final b2 getX() {
        return da().f150436o;
    }

    public final com.garmin.android.apps.connectmobile.courses.model.e ca() {
        w20.a aVar = ((t50.e) da().f150433l.f150540a.getValue()).f162543c;
        if (aVar != null) {
            return aVar.f181476a;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final r50.g da() {
        return (r50.g) this.f33081b.getValue();
    }

    public final void ea(t50.b bVar) {
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        com.garmin.android.apps.connectmobile.courses.model.e eVar2;
        com.garmin.android.apps.connectmobile.courses.model.e eVar3;
        com.garmin.android.apps.connectmobile.courses.model.e eVar4;
        com.garmin.android.apps.connectmobile.courses.model.e eVar5;
        com.garmin.android.apps.connectmobile.courses.model.e eVar6;
        List<com.garmin.android.apps.connectmobile.courses.model.g> listJ;
        Object next;
        com.garmin.android.apps.connectmobile.courses.model.e eVar7;
        com.garmin.android.apps.connectmobile.courses.model.e eVar8;
        c2 c2Var;
        if (s.g(bVar, t50.b.h.f162500a)) {
            onBackPressed();
            return;
        }
        if (s.g(bVar, t50.b.C3060b.f162492a)) {
            v supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            c60.e.m(supportFragmentManager, new r50.c(this, 4));
            return;
        }
        if (bVar instanceof t50.b.k) {
            z4(((t50.b.k) bVar).f162505a);
            return;
        }
        r50.g gVarDa = da();
        boolean z14 = gVarDa.f150422a;
        p2 p2Var = gVarDa.f150432k;
        bVar.getClass();
        List<GeoPointDTO> list = null;
        if (bVar instanceof t50.b.d) {
            t50.a aVar = ((t50.b.d) bVar).f162494a;
            w20.a aVar2 = ((t50.e) p2Var.getValue()).f162543c;
            if (aVar2 == null || (eVar8 = aVar2.f181476a) == null) {
                return;
            }
            int i14 = r50.g.a.f150437a[aVar.ordinal()];
            if (i14 == 1) {
                h hVar = gVarDa.f150423b;
                hVar.getClass();
                c2Var = new c2(new g30.g(eVar8, !z14, hVar, null));
            } else if (i14 == 2) {
                g30.d dVar = gVarDa.f150424c;
                dVar.getClass();
                c2Var = new c2(new g30.c(eVar8, !z14, dVar, null));
            } else if (i14 != 3) {
                u0.r();
                return;
            } else {
                g30.f fVar = gVarDa.f150425d;
                fVar.getClass();
                c2Var = new c2(new g30.e(eVar8, !z14, fVar, null));
            }
            u uVar = new u(new m1(new r53.v(new r50.q(gVarDa, null), c2Var), new r50.r(gVarDa, null)), new r50.s(gVarDa, null));
            x53.c cVar = o53.s0.f129406a;
            r53.s.C(r53.s.A(uVar, x53.b.f189152a), v1.a(gVarDa));
            return;
        }
        if (bVar instanceof t50.b.a) {
            com.garmin.android.apps.connectmobile.courses.model.g gVar = ((t50.b.a) bVar).f162491a;
            w20.a aVar3 = ((t50.e) p2Var.getValue()).f162543c;
            if (aVar3 == null || (eVar7 = aVar3.f181476a) == null) {
                return;
            }
            g30.b bVar2 = gVarDa.f150426e;
            bVar2.getClass();
            u uVar2 = new u(new m1(new r53.v(new r50.h(gVarDa, null), new c2(new g30.a(eVar7, !z14, bVar2, gVar, null))), new r50.i(gVarDa, null)), new r50.j(gVarDa, null));
            x53.c cVar2 = o53.s0.f129406a;
            r53.s.C(r53.s.A(uVar2, x53.b.f189152a), v1.a(gVarDa));
            return;
        }
        if (bVar instanceof t50.b.c) {
            long j8 = ((t50.b.c) bVar).f162493a;
            w20.a aVar4 = ((t50.e) p2Var.getValue()).f162543c;
            if (aVar4 == null || (eVar6 = aVar4.f181476a) == null || (listJ = eVar6.j()) == null) {
                return;
            }
            Iterator<T> it = listJ.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Long coursePointId = ((com.garmin.android.apps.connectmobile.courses.model.g) next).getCoursePointId();
                if (coursePointId != null && coursePointId.longValue() == j8) {
                    break;
                }
            }
            com.garmin.android.apps.connectmobile.courses.model.g gVar2 = (com.garmin.android.apps.connectmobile.courses.model.g) next;
            if (gVar2 == null) {
                return;
            }
            g30.j jVar = gVarDa.f150427f;
            jVar.getClass();
            u uVar3 = new u(new m1(new r53.v(new r50.n(gVarDa, null), new c2(new g30.i(eVar6, !z14, jVar, gVar2, null))), new o(gVarDa, null)), new r50.p(gVarDa, null));
            x53.c cVar3 = o53.s0.f129406a;
            r53.s.C(r53.s.A(uVar3, x53.b.f189152a), v1.a(gVarDa));
            return;
        }
        if (bVar instanceof t50.b.e) {
            t50.b.e eVar9 = (t50.b.e) bVar;
            com.garmin.android.apps.connectmobile.courses.model.g gVar3 = eVar9.f162495a;
            com.garmin.android.apps.connectmobile.courses.model.g gVar4 = eVar9.f162496b;
            w20.a aVar5 = ((t50.e) p2Var.getValue()).f162543c;
            if (aVar5 == null || (eVar5 = aVar5.f181476a) == null) {
                return;
            }
            g30.l lVar = gVarDa.f150428g;
            lVar.getClass();
            u uVar4 = new u(new m1(new r53.v(new t(gVarDa, null), new c2(new k(eVar5, !z14, lVar, gVar4, gVar3, null))), new r50.u(gVarDa, null)), new r50.v(gVarDa, null));
            x53.c cVar4 = o53.s0.f129406a;
            r53.s.C(r53.s.A(uVar4, x53.b.f189152a), v1.a(gVarDa));
            return;
        }
        if (bVar instanceof t50.b.g) {
            String str = ((t50.b.g) bVar).f162499a;
            w20.a aVar6 = ((t50.e) p2Var.getValue()).f162543c;
            if (aVar6 == null || (eVar4 = aVar6.f181476a) == null) {
                return;
            }
            g30.p pVar = gVarDa.f150429h;
            pVar.getClass();
            u uVar5 = new u(new m1(new r53.v(new z(gVarDa, null), new c2(new g30.o(eVar4, !z14, pVar, str, null))), new a0(gVarDa, null)), new r50.b0(gVarDa, null));
            x53.c cVar5 = o53.s0.f129406a;
            r53.s.C(r53.s.A(uVar5, x53.b.f189152a), v1.a(gVarDa));
            return;
        }
        if (bVar instanceof t50.b.f) {
            t50.b.f fVar2 = (t50.b.f) bVar;
            String str2 = fVar2.f162497a;
            Integer num = fVar2.f162498b;
            w20.a aVar7 = ((t50.e) p2Var.getValue()).f162543c;
            if (aVar7 == null || (eVar3 = aVar7.f181476a) == null) {
                return;
            }
            g30.n nVar = gVarDa.f150430i;
            nVar.getClass();
            u uVar6 = new u(new m1(new r53.v(new w(gVarDa, null), new c2(new g30.m(eVar3, !z14, nVar, str2, num, null))), new x(gVarDa, null)), new y(gVarDa, null));
            x53.c cVar6 = o53.s0.f129406a;
            r53.s.C(r53.s.A(uVar6, x53.b.f189152a), v1.a(gVarDa));
            return;
        }
        if (bVar instanceof t50.b.i) {
            t50.b.i iVar = (t50.b.i) bVar;
            com.garmin.android.apps.connectmobile.courses.model.g gVar5 = iVar.f162501a;
            GeoPointDTO geoPointDTO = iVar.f162502b;
            w20.a aVar8 = ((t50.e) p2Var.getValue()).f162543c;
            if (aVar8 != null && (eVar2 = aVar8.f181476a) != null) {
                list = eVar2.geoPoints;
            }
            if (list == null || list.isEmpty()) {
                return;
            }
            new s20.m();
            ArrayList arrayListE = s20.m.e(list, geoPointDTO);
            if (arrayListE.size() > 1) {
                gVarDa.y4(new t50.c.q(arrayListE, gVar5));
                return;
            } else {
                if (arrayListE.isEmpty()) {
                    return;
                }
                gVarDa.B4(gVar5, (GeoPointDTO) h0.b0(arrayListE));
                return;
            }
        }
        if (bVar instanceof t50.b.l) {
            t50.b.l lVar2 = (t50.b.l) bVar;
            gVarDa.B4(lVar2.f162506a, lVar2.f162507b);
            return;
        }
        if (bVar instanceof t50.b.j) {
            t50.b.j jVar2 = (t50.b.j) bVar;
            com.garmin.android.apps.connectmobile.courses.model.f fVar3 = jVar2.f162503a;
            com.garmin.android.library.mapsdkadapter.f fVar4 = jVar2.f162504b;
            q42.v vVar = new q42.v(gVarDa, 9, fVar3, fVar4);
            w20.a aVar9 = ((t50.e) p2Var.getValue()).f162543c;
            if (aVar9 == null) {
                return;
            }
            w20.a aVar10 = ((t50.e) p2Var.getValue()).f162543c;
            if (((aVar10 == null || (eVar = aVar10.f181476a) == null) ? null : eVar.h()) != com.garmin.android.library.mapsdkadapter.i.b.WGS84 || fVar4.f50284b != com.garmin.android.library.mapsdkadapter.i.b.GCJ02) {
                vVar.invoke();
                return;
            }
            z20.d dVar2 = gVarDa.f150431j;
            dVar2.getClass();
            u uVar7 = new u(new m1(new r53.v(new r50.k(gVarDa, null), new c2(new z20.c(dVar2, aVar9, null))), new r50.l(gVarDa, vVar, null)), new r50.m(gVarDa, null));
            x53.c cVar7 = o53.s0.f129406a;
            r53.s.C(r53.s.A(uVar7, x53.b.f189152a), v1.a(gVarDa));
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    public final void fa(final com.garmin.android.apps.connectmobile.courses.model.g gVar) {
        final boolean z14;
        List<com.garmin.android.apps.connectmobile.courses.model.g> listJ;
        if (s.g(gVar.getCoursePointType(), com.garmin.android.apps.connectmobile.courses.model.f.COURSE_START.f32922a) || s.g(gVar.getCoursePointType(), com.garmin.android.apps.connectmobile.courses.model.f.COURSE_FINISH.f32922a)) {
            z14 = false;
        } else {
            com.garmin.android.apps.connectmobile.courses.model.e eVarCa = ca();
            Object obj = null;
            if (eVarCa != null && (listJ = eVarCa.j()) != null) {
                for (Object obj2 : listJ) {
                    if (s.g(((com.garmin.android.apps.connectmobile.courses.model.g) obj2).getCoursePointId(), gVar.getCoursePointId())) {
                        obj = obj2;
                        break;
                    }
                }
                obj = (com.garmin.android.apps.connectmobile.courses.model.g) obj;
            }
            if (obj == null) {
                z14 = true;
            } else {
                z14 = false;
            }
        }
        r50.g gVarDa = da();
        gVarDa.getClass();
        gVarDa.y4(t50.c.k.f162527a);
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        final int i14 = 1;
        final int i15 = 0;
        c60.e.l(gVar, supportFragmentManager, new e23.a() { // from class: r50.a
            @Override // e23.a
            public final Object invoke() {
                List<com.garmin.android.apps.connectmobile.courses.model.g> listJ2;
                int i16 = i14;
                com.garmin.android.apps.connectmobile.courses.model.g gVar2 = gVar;
                CoursePointListActivity coursePointListActivity = this;
                boolean z15 = z14;
                switch (i16) {
                    case 0:
                        CoursePointListActivity.a aVar = CoursePointListActivity.f33079c;
                        if (z15) {
                            g gVarDa2 = coursePointListActivity.da();
                            gVarDa2.getClass();
                            gVarDa2.y4(new t50.c.f(gVar2));
                            coursePointListActivity.da().z4();
                        } else {
                            com.garmin.android.apps.connectmobile.courses.model.e eVarCa2 = coursePointListActivity.ca();
                            com.garmin.android.apps.connectmobile.courses.model.g gVar3 = null;
                            Object obj3 = null;
                            gVar3 = null;
                            if (eVarCa2 != null && (listJ2 = eVarCa2.j()) != null) {
                                for (Object obj4 : listJ2) {
                                    if (p005kotlin.jvm.internal.s.g(((com.garmin.android.apps.connectmobile.courses.model.g) obj4).getCoursePointId(), gVar2.getCoursePointId())) {
                                        obj3 = obj4;
                                        gVar3 = (com.garmin.android.apps.connectmobile.courses.model.g) obj3;
                                    }
                                }
                                gVar3 = (com.garmin.android.apps.connectmobile.courses.model.g) obj3;
                            }
                            if (gVar3 != null) {
                                g gVarDa3 = coursePointListActivity.da();
                                gVarDa3.getClass();
                                gVarDa3.y4(new t50.c.r(gVar3));
                                coursePointListActivity.da().A4(gVar3);
                            }
                        }
                        break;
                    default:
                        CoursePointListActivity.a aVar2 = CoursePointListActivity.f33079c;
                        if (z15) {
                            g gVarDa4 = coursePointListActivity.da();
                            gVarDa4.getClass();
                            gVarDa4.y4(new t50.c.f(gVar2));
                            coursePointListActivity.da().z4();
                        } else {
                            androidx.fragment.app.v supportFragmentManager2 = coursePointListActivity.getSupportFragmentManager();
                            supportFragmentManager2.getClass();
                            c60.e.c(supportFragmentManager2);
                            Long coursePointId = gVar2.getCoursePointId();
                            if (coursePointId != null) {
                                coursePointListActivity.ea(new t50.b.c(coursePointId.longValue()));
                            }
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }, new ad0.f(z14, this, gVar, 19), new r50.c(this, 5), new r50.e(this, 3), new r50.c(this, 6), new e23.a() { // from class: r50.a
            @Override // e23.a
            public final Object invoke() {
                List<com.garmin.android.apps.connectmobile.courses.model.g> listJ2;
                int i16 = i15;
                com.garmin.android.apps.connectmobile.courses.model.g gVar2 = gVar;
                CoursePointListActivity coursePointListActivity = this;
                boolean z15 = z14;
                switch (i16) {
                    case 0:
                        CoursePointListActivity.a aVar = CoursePointListActivity.f33079c;
                        if (z15) {
                            g gVarDa2 = coursePointListActivity.da();
                            gVarDa2.getClass();
                            gVarDa2.y4(new t50.c.f(gVar2));
                            coursePointListActivity.da().z4();
                        } else {
                            com.garmin.android.apps.connectmobile.courses.model.e eVarCa2 = coursePointListActivity.ca();
                            com.garmin.android.apps.connectmobile.courses.model.g gVar3 = null;
                            Object obj3 = null;
                            gVar3 = null;
                            if (eVarCa2 != null && (listJ2 = eVarCa2.j()) != null) {
                                for (Object obj4 : listJ2) {
                                    if (p005kotlin.jvm.internal.s.g(((com.garmin.android.apps.connectmobile.courses.model.g) obj4).getCoursePointId(), gVar2.getCoursePointId())) {
                                        obj3 = obj4;
                                        gVar3 = (com.garmin.android.apps.connectmobile.courses.model.g) obj3;
                                    }
                                }
                                gVar3 = (com.garmin.android.apps.connectmobile.courses.model.g) obj3;
                            }
                            if (gVar3 != null) {
                                g gVarDa3 = coursePointListActivity.da();
                                gVarDa3.getClass();
                                gVarDa3.y4(new t50.c.r(gVar3));
                                coursePointListActivity.da().A4(gVar3);
                            }
                        }
                        break;
                    default:
                        CoursePointListActivity.a aVar2 = CoursePointListActivity.f33079c;
                        if (z15) {
                            g gVarDa4 = coursePointListActivity.da();
                            gVarDa4.getClass();
                            gVarDa4.y4(new t50.c.f(gVar2));
                            coursePointListActivity.da().z4();
                        } else {
                            androidx.fragment.app.v supportFragmentManager2 = coursePointListActivity.getSupportFragmentManager();
                            supportFragmentManager2.getClass();
                            c60.e.c(supportFragmentManager2);
                            Long coursePointId = gVar2.getCoursePointId();
                            if (coursePointId != null) {
                                coursePointListActivity.ea(new t50.b.c(coursePointId.longValue()));
                            }
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        });
        da().A4(gVar);
    }

    @Override // u40.g
    public final void h1(com.garmin.android.apps.connectmobile.courses.model.g gVar) {
        fa(gVar);
    }

    @Override // u20.g
    /* JADX INFO: renamed from: j6 */
    public final com.garmin.android.apps.connectmobile.courses.model.i getF104023a() {
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        com.garmin.android.apps.connectmobile.courses.model.i iVarM;
        w20.a aVar = ((t50.e) da().f150433l.f150540a.getValue()).f162543c;
        return (aVar == null || (eVar = aVar.f181476a) == null || (iVarM = eVar.m()) == null) ? com.garmin.android.apps.connectmobile.courses.model.i.OTHER : iVarM;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        if (((t50.e) da().f150433l.f150540a.getValue()).f162544d) {
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putParcelable("GCM_extra_course_detail", ca());
            com.airbnb.lottie.animation.keyframe.a.q(l2.f37135b, intent, bundle);
            setResult(-1, intent);
        }
        super.onBackPressed();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        setContentView(R.layout.course_details_content);
        Intent intent = getIntent();
        boolean z14 = false;
        if (intent != null && (extras = intent.getExtras()) != null) {
            z14 = extras.getBoolean("isCreatingCourse", false);
        }
        this.f33080a = z14;
        View viewFindViewById = findViewById(R.id.course_details_layout);
        q2 q2Var = new q2(3);
        WeakHashMap<View, g1> weakHashMap = androidx.core.view.s0.f6563a;
        androidx.core.view.s0.d.c(viewFindViewById, q2Var);
        ((ComposeView) findViewById(R.id.composable_container)).setContent(new z3.e(1165298669, true, new r50.e(this, 1)));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // u20.g
    public final void p5(com.garmin.android.library.mapsdkadapter.e eVar, List<? extends fn0.c> list) {
        list.getClass();
        r50.g gVarDa = da();
        w20.a aVar = ((t50.e) gVarDa.f150432k.getValue()).f162543c;
        List<fn0.a> list2 = aVar != null ? aVar.f181478c : null;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        gVarDa.y4(new t50.c.p(list2));
    }

    @Override // u40.g
    public final void z4(com.garmin.android.apps.connectmobile.courses.model.g gVar) {
        com.garmin.android.apps.connectmobile.courses.model.e eVarCa;
        if (s.g(gVar.getCoursePointType(), com.garmin.android.apps.connectmobile.courses.model.f.MARKER_MILE.f32922a) || s.g(gVar.getCoursePointType(), com.garmin.android.apps.connectmobile.courses.model.f.MARKER_KILOMETER.f32922a) || s.g(gVar.getCoursePointType(), com.garmin.android.apps.connectmobile.courses.model.f.MARKER_HALF_MARATHON.f32922a) || (eVarCa = ca()) == null) {
            return;
        }
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        c60.e.c(supportFragmentManager);
        r50.g gVarDa = da();
        gVarDa.getClass();
        gVarDa.y4(t50.c.k.f162527a);
        boolean z14 = this.f33080a || (eVarCa.c0() && !eVarCa.f0());
        v supportFragmentManager2 = getSupportFragmentManager();
        supportFragmentManager2.getClass();
        c60.e.j(gVar, z14, supportFragmentManager2, new r50.c(this, 1), new r50.d(gVar, this), new r50.b(this, gVar, 1), new r50.c(this, 2), new r50.e(this, 0), new r50.d(this, gVar, 1), new r50.d(this, gVar, 2));
        da().A4(gVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/presentation/planner/CoursePointListActivity$a;", "", "<init>", "()V", "", "IS_CREATING_COURSE", "Ljava/lang/String;", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(Context context, com.garmin.android.apps.connectmobile.courses.model.e eVar, boolean z14, f.c cVar) {
            context.getClass();
            cVar.getClass();
            ((s20.g) KoinJavaComponent.get$default(s20.g.class, null, null, 6, null)).G(eVar);
            Intent intent = new Intent(context, (Class<?>) CoursePointListActivity.class);
            intent.putExtra("isCreatingCourse", z14);
            cVar.a(intent, null);
        }

        private a() {
        }
    }
}
