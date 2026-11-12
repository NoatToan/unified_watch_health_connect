package b50;

import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.CourseSegmentDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.courses.presentation.automatic.CreateCourseActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.planner.CoursePointListActivity;
import com.garmin.android.apps.connectmobile.l2;
import i3.fe;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsActivity$setupComposeContent$1$1$4$1", f = "CourseDetailsActivity.kt", l = {216}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CourseDetailsActivity f16004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fe f16005c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CourseDetailsActivity f16006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fe f16007b;

        public a(CourseDetailsActivity courseDetailsActivity, fe feVar) {
            this.f16006a = courseDetailsActivity;
            this.f16007b = feVar;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            List listC;
            Intent intentA;
            e50.b bVar = (e50.b) obj;
            CourseDetailsActivity.a aVar = CourseDetailsActivity.f33024k;
            CourseDetailsActivity courseDetailsActivity = this.f16006a;
            courseDetailsActivity.getClass();
            if (p005kotlin.jvm.internal.s.g(bVar, e50.b.v.f62973a)) {
                courseDetailsActivity.displayFailedMessage();
            } else if (bVar instanceof e50.b.s) {
                u20.e.u6(-1, ((e50.b.s) bVar).f62970a.f63016b).g(courseDetailsActivity.getSupportFragmentManager());
            } else if (p005kotlin.jvm.internal.s.g(bVar, e50.b.j.f62960a)) {
                com.garmin.android.apps.connectmobile.courses.model.e eVarEa = courseDetailsActivity.ea();
                if (eVarEa != null) {
                    CoursePointListActivity.a aVar2 = CoursePointListActivity.f33079c;
                    com.garmin.android.apps.connectmobile.courses.model.e eVar = new com.garmin.android.apps.connectmobile.courses.model.e(eVarEa);
                    f.c<Intent> cVar = courseDetailsActivity.f33029e;
                    aVar2.getClass();
                    CoursePointListActivity.a.a(courseDetailsActivity, eVar, false, cVar);
                }
            } else {
                if (p005kotlin.jvm.internal.s.g(bVar, e50.b.k.f62961a)) {
                    com.garmin.android.apps.connectmobile.courses.model.e eVarEa2 = courseDetailsActivity.ea();
                    if (eVarEa2 != null) {
                        courseDetailsActivity.na();
                        List<CourseSegmentDTO> listI = eVarEa2.i();
                        if (listI == null || listI.isEmpty()) {
                            CreateCourseActivity.a aVar3 = CreateCourseActivity.f32989g;
                            List<com.garmin.android.apps.connectmobile.pacepro.data.dto.b> listGa = courseDetailsActivity.ga();
                            ab1.g gVarHa = courseDetailsActivity.ha();
                            listC = gVarHa != null ? p13.w.c(gVarHa) : null;
                            if (listC == null) {
                                listC = p13.j0.f134944a;
                            }
                            List list = listC;
                            boolean zJa = courseDetailsActivity.ja();
                            boolean zKa = courseDetailsActivity.ka();
                            aVar3.getClass();
                            intentA = CreateCourseActivity.a.a(courseDetailsActivity, eVarEa2, listGa, list, zJa, zKa, true);
                        } else {
                            CreateCustomCourseActivity.a aVar4 = CreateCustomCourseActivity.f33013f;
                            List<com.garmin.android.apps.connectmobile.pacepro.data.dto.b> listGa2 = courseDetailsActivity.ga();
                            ab1.g gVarHa2 = courseDetailsActivity.ha();
                            listC = gVarHa2 != null ? p13.w.c(gVarHa2) : null;
                            if (listC == null) {
                                listC = p13.j0.f134944a;
                            }
                            boolean zJa2 = courseDetailsActivity.ja();
                            boolean z14 = true;
                            List list2 = listC;
                            boolean zKa2 = courseDetailsActivity.ka();
                            if (!courseDetailsActivity.f33032h && !courseDetailsActivity.f33034j) {
                                z14 = false;
                            }
                            aVar4.getClass();
                            intentA = CreateCustomCourseActivity.a.a(courseDetailsActivity, eVarEa2, listGa2, list2, zJa2, zKa2, z14);
                        }
                        courseDetailsActivity.startActivity(intentA);
                    }
                } else if (bVar instanceof e50.b.z) {
                    long j8 = ((e50.b.z) bVar).f62978a;
                    com.garmin.android.apps.connectmobile.courses.model.e eVarEa3 = courseDetailsActivity.ea();
                    if (eVarEa3 != null) {
                        String strA = eVarEa3.m().a(courseDetailsActivity);
                        String string = courseDetailsActivity.getString(R.string.courses_send_to_device_message, CourseDetailsActivity.fa(j8));
                        string.getClass();
                        courseDetailsActivity.da(j8, strA, string);
                    }
                } else if (p005kotlin.jvm.internal.s.g(bVar, e50.b.t.f62971a)) {
                    if (courseDetailsActivity.f33032h) {
                        courseDetailsActivity.la();
                    } else {
                        com.garmin.android.apps.connectmobile.courses.model.e eVarEa4 = courseDetailsActivity.ea();
                        if (eVarEa4 != null) {
                            Intent intent = new Intent();
                            intent.setAction("android.intent.action.DELETE");
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("GCM_extra_course", new com.garmin.android.apps.connectmobile.courses.model.d(eVarEa4));
                            com.airbnb.lottie.animation.keyframe.a.q(l2.f37135b, intent, bundle);
                            courseDetailsActivity.setResult(-1, intent);
                            courseDetailsActivity.finish();
                        }
                    }
                } else if (bVar instanceof e50.b.r) {
                    e50.b.r rVar = (e50.b.r) bVar;
                    com.garmin.android.apps.connectmobile.courses.model.e eVar2 = rVar.f62968a;
                    boolean z15 = rVar.f62969b;
                    CourseDetailsActivity.f33024k.getClass();
                    Intent intent2 = new Intent(courseDetailsActivity, (Class<?>) CourseDetailsActivity.class);
                    intent2.putExtra("GCM_extra_course_navigate_up", true);
                    intent2.putExtra("showElevationDialog", z15);
                    intent2.putExtra("GCM_extra_course_id", eVar2.courseId);
                    intent2.putExtra("GCM_extra_course_type", eVar2.m());
                    courseDetailsActivity.startActivity(intent2);
                    courseDetailsActivity.na();
                    courseDetailsActivity.finish();
                } else if (bVar instanceof e50.b.b0) {
                    String string2 = courseDetailsActivity.getString(((e50.b.b0) bVar).f62950a ? R.string.activity_favorite_general_success_message : R.string.activity_unfavorite_general_success_message);
                    string2.getClass();
                    courseDetailsActivity.qa(this.f16007b, string2, null);
                } else if (bVar instanceof e50.b.y) {
                    long j14 = ((e50.b.y) bVar).f62977a;
                    ((s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null)).y(courseDetailsActivity, j14);
                    String string3 = courseDetailsActivity.getString(R.string.courses_send_to_device_title_running);
                    string3.getClass();
                    String string4 = courseDetailsActivity.getString(R.string.pacepro_send_to_device_message, CourseDetailsActivity.fa(j14));
                    string4.getClass();
                    courseDetailsActivity.da(j14, string3, string4);
                } else if (bVar instanceof e50.b.a0) {
                    long j15 = ((e50.b.a0) bVar).f62948a;
                    ((s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null)).y(courseDetailsActivity, j15);
                    String string5 = courseDetailsActivity.getString(R.string.power_guide_title);
                    string5.getClass();
                    String string6 = courseDetailsActivity.getString(R.string.power_guide_send_to_device_msg, CourseDetailsActivity.fa(j15));
                    string6.getClass();
                    courseDetailsActivity.da(j15, string5, string6);
                } else if (p005kotlin.jvm.internal.s.g(bVar, e50.b.u.f62972a)) {
                    u20.e.u6(R.string.power_guide_could_not_delete_title, R.string.power_guide_could_not_delete_msg).g(courseDetailsActivity.getSupportFragmentManager());
                } else if (p005kotlin.jvm.internal.s.g(bVar, e50.b.q.f62967a)) {
                    courseDetailsActivity.oa();
                } else if (bVar instanceof e50.b.d0) {
                    com.garmin.android.apps.connectmobile.courses.model.g gVar = ((e50.b.d0) bVar).f62954a;
                    p pVarIa = courseDetailsActivity.ia();
                    pVarIa.getClass();
                    pVarIa.z4(new e50.b.c0(gVar));
                    courseDetailsActivity.ia().A4(gVar);
                    courseDetailsActivity.pa(gVar);
                } else if (bVar instanceof e50.b.x) {
                    e50.b.x xVar = (e50.b.x) bVar;
                    List<GeoPointDTO> list3 = xVar.f62975a;
                    com.garmin.android.apps.connectmobile.courses.model.g gVar2 = xVar.f62976b;
                    courseDetailsActivity.ia().F4(false);
                    androidx.fragment.app.v supportFragmentManager = courseDetailsActivity.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    c60.e.q(supportFragmentManager, list3, new b4.b(1), new b50.a(courseDetailsActivity, gVar2, 0));
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(CourseDetailsActivity courseDetailsActivity, fe feVar, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f16004b = courseDetailsActivity;
        this.f16005c = feVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(this.f16004b, this.f16005c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to b50.m for r6v1 'this'  t13.d
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            u13.a r0 = u13.a.COROUTINE_SUSPENDED
            int r1 = r6.f16003a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L14
            if (r1 == r3) goto L10
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r7)
            return r2
        L10:
            o13.r.b(r7)
            goto L33
        L14:
            o13.r.b(r7)
            com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsActivity$a r7 = com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsActivity.f33024k
            com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsActivity r7 = r6.f16004b
            b50.p r1 = r7.ia()
            r53.a2 r1 = r1.B
            b50.m$a r4 = new b50.m$a
            i3.fe r5 = r6.f16005c
            r4.<init>(r7, r5)
            r6.f16003a = r3
            r53.d2<T> r7 = r1.f150526a
            java.lang.Object r7 = r7.collect(r4, r6)
            if (r7 != r0) goto L33
            return r0
        L33:
            o2.c.f()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b50.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
