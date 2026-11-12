package com.garmin.android.apps.connectmobile.courses.presentation.automatic;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.v;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.courses.model.PointOfInterestDTO;
import com.garmin.android.apps.connectmobile.courses.model.h;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.q1;
import com.google.android.gms.maps.model.LatLng;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import e23.l;
import e23.p;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import kx0.f;
import l3.p1;
import l30.a1;
import l30.b1;
import l30.c1;
import l30.d1;
import l30.e1;
import l30.f1;
import l30.g1;
import l30.h1;
import l30.i0;
import l30.u0;
import l30.v0;
import l30.w0;
import l30.x0;
import l30.z0;
import m30.m;
import m30.t;
import n30.i;
import n30.k;
import o13.n;
import o13.r;
import o53.b0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import p13.j0;
import p3.x3;
import r53.b2;
import r53.c2;
import r53.j;
import r53.m1;
import r53.p2;
import r53.u;
import u20.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\f²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/presentation/automatic/MultipleCoursesActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lm30/m$b;", "Lu20/g;", "Lu40/g;", "Ll40/b;", "Lm30/t$a;", "<init>", "()V", "a", "Ln30/l;", RemoteConfigConstants.ResponseFieldKey.STATE, "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MultipleCoursesActivity extends com.garmin.android.apps.connectmobile.c implements m.b, g, u40.g, l40.b, t.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f33000c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bundle f33001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f33002b = o13.m.a(n.NONE, new e(this, null, null, new x0(this, 1)));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends q implements l<i, Unit> {
        public b(Object obj) {
            super(1, obj, MultipleCoursesActivity.class, "onAction", "onAction(Lcom/garmin/android/apps/connectmobile/courses/presentation/automatic/model/MultipleCoursesAction;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(i iVar) {
            i iVar2 = iVar;
            iVar2.getClass();
            MultipleCoursesActivity multipleCoursesActivity = (MultipleCoursesActivity) this.receiver;
            a aVar = MultipleCoursesActivity.f33000c;
            multipleCoursesActivity.ea(iVar2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.automatic.MultipleCoursesActivity$onCreate$2$1$2$1", f = "MultipleCoursesActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<n30.l> f33004b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(x3<n30.l> x3Var, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f33004b = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return MultipleCoursesActivity.this.new c(this.f33004b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            a aVar2 = MultipleCoursesActivity.f33000c;
            x3<n30.l> x3Var = this.f33004b;
            boolean z14 = x3Var.getF182175a().f123525a;
            MultipleCoursesActivity multipleCoursesActivity = MultipleCoursesActivity.this;
            if (z14) {
                n50.a aVar3 = x3Var.getF182175a().f123526b;
                if (aVar3 != null) {
                    multipleCoursesActivity.showProgressOverlay(multipleCoursesActivity.getString(aVar3.f123725a));
                } else {
                    multipleCoursesActivity.showProgressOverlay();
                }
            } else {
                multipleCoursesActivity.hideProgressOverlay();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.automatic.MultipleCoursesActivity$onCreate$2$1$3$1", f = "MultipleCoursesActivity.kt", l = {133}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f33005a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ MultipleCoursesActivity f33007a;

            public a(MultipleCoursesActivity multipleCoursesActivity) {
                this.f33007a = multipleCoursesActivity;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                w20.a aVar;
                n30.j jVar = (n30.j) obj;
                boolean zG = s.g(jVar, n30.j.y.f123520a);
                MultipleCoursesActivity multipleCoursesActivity = this.f33007a;
                if (zG) {
                    multipleCoursesActivity.getClass();
                    new androidx.appcompat.app.e.a(multipleCoursesActivity).setTitle(R.string.lbl_no_available_routes).setMessage(R.string.msg_no_round_trip_routes).setPositiveButton(R.string.common_learn_more, new f(multipleCoursesActivity, 3)).setNegativeButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null).show();
                } else {
                    if (s.g(jVar, n30.j.k.f123506a)) {
                        a aVar2 = MultipleCoursesActivity.f33000c;
                        k kVar = (k) h0.n0(((n30.l) multipleCoursesActivity.da().f109524j.f150540a.getValue()).f123528d);
                        int i14 = kVar != null ? kVar.f123523b : 0;
                        List<w20.a> listB = ((n30.l) multipleCoursesActivity.da().f109524j.f150540a.getValue()).b();
                        if (listB != null && (aVar = (w20.a) h0.e0(i14, listB)) != null) {
                            CreateCourseActivity.f32989g.getClass();
                            Intent intent = new Intent(multipleCoursesActivity, (Class<?>) CreateCourseActivity.class);
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("GCM_extra_course_data", aVar);
                            bundle.putBoolean("GCM_extra_course_navigate_up", true);
                            bundle.putBoolean("GCM_extra_course_navigate_multiple_courses", true);
                            l2.f37135b.getClass();
                            l2.a.b().a(intent, bundle);
                            multipleCoursesActivity.startActivity(intent);
                        }
                    } else if (jVar instanceof n30.j.z) {
                        List<ClimbDTO> list = ((n30.j.z) jVar).f123521a;
                        a aVar3 = MultipleCoursesActivity.f33000c;
                        multipleCoursesActivity.getClass();
                        if (list != null && !list.isEmpty()) {
                            v supportFragmentManager = multipleCoursesActivity.getSupportFragmentManager();
                            supportFragmentManager.getClass();
                            c60.e.c(supportFragmentManager);
                            a1 a1VarDa = multipleCoursesActivity.da();
                            a1VarDa.getClass();
                            a1VarDa.x4(n30.j.d.f123499a);
                            if (list.size() == 1) {
                                ClimbDTO climbDTO = (ClimbDTO) h0.b0(list);
                                Long gmapClimbId = climbDTO.getGmapClimbId();
                                j0 j0Var = j0.f134944a;
                                v supportFragmentManager2 = multipleCoursesActivity.getSupportFragmentManager();
                                supportFragmentManager2.getClass();
                                c60.e.f(list, -1, -1, j0Var, false, true, false, supportFragmentManager2, new u0(multipleCoursesActivity, 5), null, null, new p1(6, multipleCoursesActivity, gmapClimbId));
                                multipleCoursesActivity.da().z4(multipleCoursesActivity.getResources().getDisplayMetrics().heightPixels / 2);
                                a1 a1VarDa2 = multipleCoursesActivity.da();
                                a1VarDa2.getClass();
                                a1VarDa2.x4(new n30.j.C2317j(climbDTO));
                            } else {
                                j0 j0Var2 = j0.f134944a;
                                v supportFragmentManager3 = multipleCoursesActivity.getSupportFragmentManager();
                                supportFragmentManager3.getClass();
                                c60.e.h(list, j0Var2, false, supportFragmentManager3, new u0(multipleCoursesActivity, 0), new z0(list, multipleCoursesActivity), new i0(1, multipleCoursesActivity, list));
                                multipleCoursesActivity.da().z4(multipleCoursesActivity.getResources().getDisplayMetrics().heightPixels / 2);
                                a1 a1VarDa3 = multipleCoursesActivity.da();
                                a1VarDa3.getClass();
                                a1VarDa3.x4(new n30.j.g(list));
                            }
                        }
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
            return MultipleCoursesActivity.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to com.garmin.android.apps.connectmobile.courses.presentation.automatic.MultipleCoursesActivity$d for r5v1 'this'  t13.d
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
                int r1 = r5.f33005a
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
                com.garmin.android.apps.connectmobile.courses.presentation.automatic.MultipleCoursesActivity$a r6 = com.garmin.android.apps.connectmobile.courses.presentation.automatic.MultipleCoursesActivity.f33000c
                com.garmin.android.apps.connectmobile.courses.presentation.automatic.MultipleCoursesActivity r6 = com.garmin.android.apps.connectmobile.courses.presentation.automatic.MultipleCoursesActivity.this
                l30.a1 r1 = r6.da()
                r53.a2 r1 = r1.f109526l
                com.garmin.android.apps.connectmobile.courses.presentation.automatic.MultipleCoursesActivity$d$a r4 = new com.garmin.android.apps.connectmobile.courses.presentation.automatic.MultipleCoursesActivity$d$a
                r4.<init>(r6)
                r5.f33005a = r3
                r53.d2<T> r6 = r1.f150526a
                java.lang.Object r6 = r6.collect(r4, r5)
                if (r6 != r0) goto L31
                return r0
            L31:
                o2.c.f()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.courses.presentation.automatic.MultipleCoursesActivity.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<a1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f33008a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f33009b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f33010c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f33011d;

        public e(b.g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f33008a = gVar;
            this.f33009b = qualifier;
            this.f33010c = aVar;
            this.f33011d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, l30.a1] */
        @Override // e23.a
        public final a1 invoke() {
            CreationExtras defaultViewModelCreationExtras;
            b.g gVar = this.f33008a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f33010c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(a1.class), f189591b, null, defaultViewModelCreationExtras, this.f33009b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f33011d, 4, null);
        }
    }

    public static void ca(MultipleCoursesActivity multipleCoursesActivity, boolean z14) {
        if (z14) {
            super.onBackPressed();
        }
    }

    @Override // l40.b
    public final void F3(l40.a aVar) {
        da().F3(aVar);
    }

    @Override // u20.g
    public final void H1(com.garmin.android.library.mapsdkadapter.e eVar, int i14, List<? extends h> list) {
        list.getClass();
        ea(new i.k(eVar, i14, list));
    }

    @Override // u20.g
    public final void K2(com.garmin.android.library.mapsdkadapter.e eVar, com.garmin.android.apps.connectmobile.courses.model.c cVar, com.garmin.android.apps.connectmobile.courses.model.b bVar, com.garmin.android.apps.connectmobile.courses.model.b bVar2) {
        cVar.getClass();
        bVar.getClass();
        bVar2.getClass();
        ea(new i.C2316i(eVar, cVar, bVar, bVar2));
    }

    @Override // l40.b
    /* JADX INFO: renamed from: S2 */
    public final b2 getX() {
        return da().f109527m;
    }

    @Override // m30.m.b
    public final void X(com.garmin.android.library.mapsdkadapter.f fVar) {
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        c60.e.c(supportFragmentManager);
        ea(new i.n(fVar.f50283a));
    }

    @Override // u20.g
    public final void a5(PointOfInterestDTO pointOfInterestDTO) {
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        c60.e.c(supportFragmentManager);
        a1 a1VarDa = da();
        a1VarDa.getClass();
        a1VarDa.x4(n30.j.d.f123499a);
        j0 j0Var = j0.f134944a;
        v supportFragmentManager2 = getSupportFragmentManager();
        supportFragmentManager2.getClass();
        c60.e.r(pointOfInterestDTO, j0Var, true, false, supportFragmentManager2, new i0(2, this, pointOfInterestDTO), new c50.a(2), new v0(this, 1), new u0(this, 3));
        a1 a1VarDa2 = da();
        a1VarDa2.getClass();
        a1VarDa2.x4(new n30.j.i(pointOfInterestDTO));
    }

    @Override // u20.g
    public final void c4(int i14, int i15, List list) {
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        c60.e.c(supportFragmentManager);
        a1 a1VarDa = da();
        a1VarDa.getClass();
        a1VarDa.x4(n30.j.d.f123499a);
        v supportFragmentManager2 = getSupportFragmentManager();
        supportFragmentManager2.getClass();
        c60.e.g(list, i14, i15, supportFragmentManager2, new v0(this, 0), new u0(this, 1), new u0(this, 2));
        da().z4(getResources().getDisplayMetrics().heightPixels / 2);
        a1 a1VarDa2 = da();
        a1VarDa2.getClass();
        a1VarDa2.x4(new n30.j.e(i14));
    }

    @Override // m30.t.a
    public final void d() {
        HelpActivity.a aVar = HelpActivity.f36653a;
        ro0.l lVar = ro0.l.CREATE_COURSE;
        aVar.getClass();
        HelpActivity.a.d(this, lVar, null, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final a1 da() {
        return (a1) this.f33002b.getValue();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (isProgressOverlayVisible()) {
            return true;
        }
        n30.h hVar = ((n30.l) da().f109524j.f150540a.getValue()).f123529e;
        hVar.getClass();
        if (hVar.f123470a && !hVar.f123471b && hVar.f123472c) {
            ea(i.b.f123474a);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:67:0x01a7  */
    public final void ea(i iVar) {
        List<w20.a> list;
        LatLng latLng;
        w20.a aVar;
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        GeoPointDTO geoPointDTOD;
        n30.e eVar2;
        if (s.g(iVar, i.c.f123475a)) {
            onBackPressed();
            return;
        }
        if (s.g(iVar, i.g.f123480a)) {
            if (getSupportFragmentManager().G("CreateCourseOnboarding") != null) {
                return;
            }
            o40.b.f129051d.getClass();
            o40.b bVarA = o40.b.a.a(false);
            bVarA.f129053b = new x0(this, 0);
            bVarA.show(getSupportFragmentManager(), "CreateCourseOnboarding");
            return;
        }
        if (s.g(iVar, i.e.f123477a)) {
            t.f116400b.getClass();
            t tVar = new t();
            tVar.show(getSupportFragmentManager(), tVar.getTag());
            return;
        }
        if (s.g(iVar, i.d.f123476a)) {
            k kVar = (k) h0.n0(((n30.l) da().f109524j.f150540a.getValue()).f123528d);
            eVar2 = kVar != null ? kVar.f123524c : null;
            if (eVar2 == null) {
                return;
            }
            m30.v.a aVar2 = m30.v.f116406k;
            com.garmin.android.apps.connectmobile.courses.model.i f104023a = getF104023a();
            aVar2.getClass();
            f104023a.getClass();
            m30.v vVar = new m30.v();
            Bundle bundle = new Bundle();
            bundle.putParcelable("courseParameters", eVar2);
            bundle.putSerializable("courseType", f104023a);
            vVar.setArguments(bundle);
            vVar.f116407h = new w0(this);
            vVar.show(getSupportFragmentManager(), vVar.getTag());
            return;
        }
        a1 a1VarDa = da();
        p2 p2Var = a1VarDa.f109523i;
        iVar.getClass();
        if (iVar.equals(i.a.f123473a)) {
            ((s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null)).x();
            p2Var.k(null, n30.l.a((n30.l) p2Var.getValue(), false, null, false, null, n30.h.a(((n30.l) p2Var.getValue()).f123529e), null, 47));
            a1VarDa.x4(n30.j.w.f123518a);
            return;
        }
        if (iVar.equals(i.b.f123474a)) {
            a1VarDa.x4(n30.j.c.f123498a);
            return;
        }
        if (iVar.equals(i.l.f123493a)) {
            List<k> list2 = ((n30.l) p2Var.getValue()).f123528d;
            if (list2.isEmpty()) {
                return;
            }
            p2Var.k(null, n30.l.a((n30.l) p2Var.getValue(), false, null, false, h0.V(1, list2), null, null, 55));
            return;
        }
        if (iVar instanceof i.n) {
            LatLng latLng2 = ((i.n) iVar).f123495a;
            k kVar2 = (k) h0.n0(((n30.l) p2Var.getValue()).f123528d);
            eVar2 = kVar2 != null ? kVar2.f123524c : null;
            if (eVar2 == null) {
                return;
            }
            a1VarDa.y4(latLng2, eVar2);
            return;
        }
        if (iVar instanceof i.m) {
            n30.e eVar3 = ((i.m) iVar).f123494a;
            k kVar3 = (k) h0.n0(((n30.l) p2Var.getValue()).f123528d);
            if (kVar3 == null) {
                return;
            }
            List<w20.a> list3 = kVar3.f123522a;
            if (list3 == null || (aVar = (w20.a) h0.d0(list3)) == null || (eVar = aVar.f181476a) == null || (geoPointDTOD = eVar.D()) == null) {
                latLng = null;
            } else {
                Double d14 = geoPointDTOD.latitude;
                Double d15 = geoPointDTOD.longitude;
                if (d14 == null || d15 == null) {
                    latLng = null;
                } else {
                    latLng = new LatLng(d14.doubleValue(), d15.doubleValue());
                }
            }
            if (latLng == null) {
                p2Var.k(null, n30.l.a((n30.l) p2Var.getValue(), false, null, false, h0.D0(h0.V(1, ((n30.l) p2Var.getValue()).f123528d), k.a(kVar3, null, 0, eVar3, 3)), null, null, 55));
                return;
            } else {
                a1VarDa.y4(latLng, eVar3);
                return;
            }
        }
        if (iVar instanceof i.f) {
            i.f fVar = (i.f) iVar;
            int i14 = fVar.f123478a;
            boolean z14 = fVar.f123479b;
            List<k> list4 = ((n30.l) p2Var.getValue()).f123528d;
            k kVar4 = (k) h0.n0(list4);
            if (kVar4 != null && (list = kVar4.f123522a) != null && i14 >= 0 && i14 < list.size()) {
                if (i14 == kVar4.f123523b) {
                    if (z14) {
                        a1VarDa.x4(n30.j.k.f123506a);
                        return;
                    }
                    return;
                } else {
                    b30.r rVar = a1VarDa.f109522h;
                    rVar.getClass();
                    u uVar = new u(new m1(new r53.v(new f1(a1VarDa, null), new c2(new b30.q(kVar4, i14, rVar, null))), new g1(a1VarDa, list4, null)), new h1(a1VarDa, z14, null));
                    x53.c cVar = o53.s0.f129406a;
                    r53.s.C(r53.s.A(uVar, x53.b.f189152a), v1.a(a1VarDa));
                    return;
                }
            }
            return;
        }
        if (iVar instanceof i.k) {
            i.k kVar5 = (i.k) iVar;
            com.garmin.android.library.mapsdkadapter.e eVar4 = kVar5.f123490a;
            int i15 = kVar5.f123491b;
            List<h> list5 = kVar5.f123492c;
            o53.c2 c2Var = a1VarDa.f109528n;
            if (c2Var != null) {
                c2Var.c(null);
            }
            m1 m1Var = new m1(a1VarDa.f109518d.a(eVar4, i15, list5), new c1(a1VarDa, null));
            x53.c cVar2 = o53.s0.f129406a;
            a1VarDa.f109528n = r53.s.C(r53.s.g(r53.s.A(m1Var, x53.b.f189152a)), v1.a(a1VarDa));
            return;
        }
        if (iVar instanceof i.C2316i) {
            i.C2316i c2316i = (i.C2316i) iVar;
            com.garmin.android.library.mapsdkadapter.e eVar5 = c2316i.f123484a;
            com.garmin.android.apps.connectmobile.courses.model.c cVar3 = c2316i.f123485b;
            com.garmin.android.apps.connectmobile.courses.model.b bVar = c2316i.f123486c;
            com.garmin.android.apps.connectmobile.courses.model.b bVar2 = c2316i.f123487d;
            o53.c2 c2Var2 = a1VarDa.f109529o;
            if (c2Var2 != null) {
                c2Var2.c(null);
            }
            m1 m1Var2 = new m1(a1VarDa.f109519e.a(eVar5, cVar3, bVar, bVar2), new d1(a1VarDa, null));
            x53.c cVar4 = o53.s0.f129406a;
            a1VarDa.f109529o = r53.s.C(r53.s.g(r53.s.A(m1Var2, x53.b.f189152a)), v1.a(a1VarDa));
            return;
        }
        if (iVar instanceof i.h) {
            i.h hVar = (i.h) iVar;
            m1 m1Var3 = new m1(a1VarDa.f109520f.a(hVar.f123481a, hVar.f123482b, hVar.f123483c), new e1(a1VarDa, null));
            x53.c cVar5 = o53.s0.f129406a;
            r53.s.C(r53.s.A(m1Var3, x53.b.f189152a), v1.a(a1VarDa));
            return;
        }
        if (iVar instanceof i.j) {
            i.j jVar = (i.j) iVar;
            com.garmin.android.library.mapsdkadapter.e eVar6 = jVar.f123488a;
            List<fn0.c> list6 = jVar.f123489b;
            o53.c2 c2Var3 = a1VarDa.f109530p;
            if (c2Var3 != null) {
                c2Var3.c(null);
            }
            m1 m1Var4 = new m1(a1VarDa.f109521g.a(eVar6, list6), new b1(a1VarDa, null));
            x53.c cVar6 = o53.s0.f129406a;
            a1VarDa.f109530p = r53.s.C(r53.s.g(r53.s.A(m1Var4, x53.b.f189152a)), v1.a(a1VarDa));
        }
    }

    @Override // u40.g
    public final void f8(com.garmin.android.library.mapsdkadapter.i iVar) {
        j22.b bVar = j22.b.f96736a;
        j22.a aVar = j22.a.f96719h;
        bVar.getClass();
        if (!j22.b.k(aVar)) {
            j22.b.x(this, 2, aVar);
            return;
        }
        a1 a1VarDa = da();
        a1VarDa.getClass();
        a1VarDa.x4(n30.j.a.f123496a);
    }

    @Override // u20.g
    public final void h2(ArrayList arrayList, com.garmin.android.apps.connectmobile.courses.model.b bVar, com.garmin.android.apps.connectmobile.courses.model.b bVar2) {
        bVar.getClass();
        bVar2.getClass();
        ea(new i.h(arrayList, bVar, bVar2));
    }

    @Override // u20.g
    /* JADX INFO: renamed from: j6 */
    public final com.garmin.android.apps.connectmobile.courses.model.i getF104023a() {
        Object serializable;
        Bundle bundle = this.f33001a;
        if (bundle != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = bundle.getSerializable("GCM_extra_course_type", com.garmin.android.apps.connectmobile.courses.model.i.class);
            } else {
                Object serializable2 = bundle.getSerializable("GCM_extra_course_type");
                if (!(serializable2 instanceof com.garmin.android.apps.connectmobile.courses.model.i)) {
                    serializable2 = null;
                }
                serializable = (com.garmin.android.apps.connectmobile.courses.model.i) serializable2;
            }
            com.garmin.android.apps.connectmobile.courses.model.i iVar = (com.garmin.android.apps.connectmobile.courses.model.i) serializable;
            if (iVar != null) {
                return iVar;
            }
        }
        return com.garmin.android.apps.connectmobile.courses.model.i.OTHER;
    }

    @Override // u20.g
    public final void l8(fn0.a aVar) {
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        c60.e.c(supportFragmentManager);
        a1 a1VarDa = da();
        a1VarDa.getClass();
        a1VarDa.x4(n30.j.d.f123499a);
        v supportFragmentManager2 = getSupportFragmentManager();
        supportFragmentManager2.getClass();
        c60.e.p(aVar, supportFragmentManager2, new i0(3, this, aVar), new v0(this, 2), new u0(this, 4));
        a1 a1VarDa2 = da();
        a1VarDa2.getClass();
        a1VarDa2.x4(new n30.j.h(aVar));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        List<w20.a> listB = ((n30.l) da().f109524j.f150540a.getValue()).b();
        if (listB == null || listB.isEmpty()) {
            super.onBackPressed();
            return;
        }
        if (isFinishing()) {
            return;
        }
        String string = getString(R.string.msg_quit_without_save);
        string.getClass();
        q1.b bVar = q1.f41066b;
        w0 w0Var = new w0(this);
        bVar.getClass();
        q1 q1VarA = q1.b.a(0, string, R.string.lbl_yes, R.string.lbl_cancel, w0Var);
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        q1VarA.v6(supportFragmentManager, "GCMFragTwoBttnAlertDialog");
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.course_details_content);
        if (bundle == null) {
            Intent intent = getIntent();
            bundle = intent != null ? intent.getExtras() : null;
        }
        this.f33001a = bundle;
        if (bundle == null) {
            finish();
            return;
        }
        View viewFindViewById = findViewById(R.id.course_details_layout);
        kg.f fVar = new kg.f(19);
        WeakHashMap<View, androidx.core.view.g1> weakHashMap = androidx.core.view.s0.f6563a;
        androidx.core.view.s0.d.c(viewFindViewById, fVar);
        ((ComposeView) findViewById(R.id.composable_container)).setContent(new z3.e(1057809052, true, new v0(this, 3)));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // androidx.fragment.app.m, b.g, android.app.Activity
    public final void onRequestPermissionsResult(int i14, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        super.onRequestPermissionsResult(i14, strArr, iArr);
        j22.b.f96736a.getClass();
        if (j22.b.E(iArr)) {
            a1 a1VarDa = da();
            a1VarDa.getClass();
            a1VarDa.x4(n30.j.a.f123496a);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, z6.e, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putAll(this.f33001a);
    }

    @Override // u20.g
    public final void p5(com.garmin.android.library.mapsdkadapter.e eVar, List<? extends fn0.c> list) {
        list.getClass();
        ea(new i.j(eVar, list));
    }

    @Override // u20.g
    public final void q8() {
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        c60.e.b(supportFragmentManager);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/presentation/automatic/MultipleCoursesActivity$a;", "", "<init>", "()V", "", "GARMIN_SUPPORT_URL", "Ljava/lang/String;", "", "REQUEST_CODE_PERM_LOCATION", "I", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
