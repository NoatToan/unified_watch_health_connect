package l30;

import android.content.DialogInterface;
import android.view.View;
import android.widget.FrameLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.courses.presentation.automatic.CreateCourseActivity;
import java.util.List;
import l3.p1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.automatic.CreateCourseActivity$setupComposeContent$1$1$3$1", f = "CreateCourseActivity.kt", l = {228}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f109584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CreateCourseActivity f109585b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a implements r53.j, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CreateCourseActivity f109586a;

        public a(CreateCourseActivity createCourseActivity) {
            this.f109586a = createCourseActivity;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            com.garmin.android.apps.connectmobile.courses.model.e eVar;
            n30.c cVar = (n30.c) obj;
            CreateCourseActivity.a aVar = CreateCourseActivity.f32989g;
            CreateCourseActivity createCourseActivity = this.f109586a;
            createCourseActivity.getClass();
            if (p005kotlin.jvm.internal.s.g(cVar, n30.c.f0.f123412a)) {
                createCourseActivity.displayFailedMessage();
            } else {
                List<GeoPointDTO> list = null;
                if (p005kotlin.jvm.internal.s.g(cVar, n30.c.k0.f123423a)) {
                    new androidx.appcompat.app.e.a(createCourseActivity).setTitle(R.string.lbl_no_available_routes).setMessage(R.string.msg_no_round_trip_routes).setPositiveButton(R.string.common_learn_more, new d(createCourseActivity, 1)).setNegativeButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null).show();
                } else if (cVar instanceof n30.c.m0) {
                    List<ClimbDTO> list2 = ((n30.c.m0) cVar).f123427a;
                    if (list2 != null && !list2.isEmpty()) {
                        androidx.fragment.app.v supportFragmentManager = createCourseActivity.getSupportFragmentManager();
                        supportFragmentManager.getClass();
                        c60.e.c(supportFragmentManager);
                        createCourseActivity.ea().A4();
                        if (list2.size() == 1) {
                            ClimbDTO climbDTO = (ClimbDTO) p13.h0.b0(list2);
                            Long gmapClimbId = climbDTO.getGmapClimbId();
                            p13.j0 j0Var = p13.j0.f134944a;
                            boolean z14 = createCourseActivity.f32992c;
                            androidx.fragment.app.v supportFragmentManager2 = createCourseActivity.getSupportFragmentManager();
                            supportFragmentManager2.getClass();
                            c60.e.f(list2, -1, -1, j0Var, false, true, z14, supportFragmentManager2, new c(createCourseActivity, 6), null, null, new p1(4, createCourseActivity, gmapClimbId));
                            createCourseActivity.ea().C4(createCourseActivity.getResources().getDisplayMetrics().heightPixels / 2);
                            z zVarEa = createCourseActivity.ea();
                            zVarEa.getClass();
                            zVarEa.z4(new n30.c.t(climbDTO));
                        } else {
                            p13.j0 j0Var2 = p13.j0.f134944a;
                            androidx.fragment.app.v supportFragmentManager3 = createCourseActivity.getSupportFragmentManager();
                            supportFragmentManager3.getClass();
                            c60.e.h(list2, j0Var2, false, supportFragmentManager3, new c(createCourseActivity, 7), new k(list2, createCourseActivity), new k11.h(26, createCourseActivity, list2));
                            createCourseActivity.ea().C4(createCourseActivity.getResources().getDisplayMetrics().heightPixels / 2);
                            z zVarEa2 = createCourseActivity.ea();
                            zVarEa2.getClass();
                            zVarEa2.z4(new n30.c.p(list2));
                        }
                    }
                } else if (cVar instanceof n30.c.o0) {
                    com.garmin.android.apps.connectmobile.courses.model.g gVar = ((n30.c.o0) cVar).f123431a;
                    z zVarEa3 = createCourseActivity.ea();
                    zVarEa3.getClass();
                    zVarEa3.z4(new n30.c.n0(gVar));
                    z zVarEa4 = createCourseActivity.ea();
                    zVarEa4.getClass();
                    zVarEa4.z4(new n30.c.q(gVar));
                    createCourseActivity.ga(gVar, false);
                } else if (cVar instanceof n30.c.i0) {
                    n30.c.i0 i0Var = (n30.c.i0) cVar;
                    List<GeoPointDTO> list3 = i0Var.f123418a;
                    com.garmin.android.apps.connectmobile.courses.model.g gVar2 = i0Var.f123419b;
                    androidx.fragment.app.v supportFragmentManager4 = createCourseActivity.getSupportFragmentManager();
                    supportFragmentManager4.getClass();
                    c60.e.q(supportFragmentManager4, list3, new l01.b(24), new p1(2, createCourseActivity, gVar2));
                } else if (cVar instanceof n30.c.l0) {
                    com.garmin.android.apps.connectmobile.courses.model.e eVar2 = ((n30.c.l0) cVar).f123425a;
                    if (!createCourseActivity.isFinishing()) {
                        View viewFindViewById = createCourseActivity.findViewById(R.id.fullscreen_content_overlay);
                        viewFindViewById.getClass();
                        ((FrameLayout) viewFindViewById).setVisibility(0);
                        z30.b.f202126f.getClass();
                        z30.b bVarA = z30.b.a.a();
                        androidx.fragment.app.v supportFragmentManager5 = createCourseActivity.getSupportFragmentManager();
                        supportFragmentManager5.getClass();
                        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager5);
                        aVar2.l(R.id.fullscreen_content_overlay, bVarA, null);
                        aVar2.s(true, true);
                        bVarA.f202127a = new p1(3, createCourseActivity, eVar2);
                    }
                } else if (cVar instanceof n30.c.C2315c) {
                    n30.c.C2315c c2315c = (n30.c.C2315c) cVar;
                    com.garmin.android.apps.connectmobile.courses.model.f fVar = c2315c.f123404a;
                    com.garmin.android.library.mapsdkadapter.f fVar2 = c2315c.f123405b;
                    z zVarEa5 = createCourseActivity.ea();
                    kh0.d dVar2 = new kh0.d(createCourseActivity, 20);
                    c cVar2 = new c(createCourseActivity, 8);
                    zVarEa5.getClass();
                    w20.a aVar3 = ((n30.f) zVarEa5.f109668w.getValue()).f123456d;
                    if (aVar3 != null && (eVar = aVar3.f181476a) != null) {
                        list = eVar.geoPoints;
                    }
                    zVarEa5.z4(new n30.c.b(list, fVar, fVar2, dVar2, cVar2));
                }
            }
            Unit unit = Unit.INSTANCE;
            u13.a aVar4 = u13.a.COROUTINE_SUSPENDED;
            return unit;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof r53.j) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return new p005kotlin.jvm.internal.a(2, this.f109586a, CreateCourseActivity.class, "handleEffect", "handleEffect(Lcom/garmin/android/apps/connectmobile/courses/presentation/automatic/model/AutomaticCourseEffect;)V", 4);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(CreateCourseActivity createCourseActivity, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f109585b = createCourseActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f109585b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to l30.i for r5v1 'this'  t13.d
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
            int r1 = r5.f109584a
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
            com.garmin.android.apps.connectmobile.courses.presentation.automatic.CreateCourseActivity$a r6 = com.garmin.android.apps.connectmobile.courses.presentation.automatic.CreateCourseActivity.f32989g
            com.garmin.android.apps.connectmobile.courses.presentation.automatic.CreateCourseActivity r6 = r5.f109585b
            l30.z r1 = r6.ea()
            r53.a2 r1 = r1.f109671z
            l30.i$a r4 = new l30.i$a
            r4.<init>(r6)
            r5.f109584a = r3
            r53.d2<T> r6 = r1.f150526a
            java.lang.Object r6 = r6.collect(r4, r5)
            if (r6 != r0) goto L31
            return r0
        L31:
            o2.c.f()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l30.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
