package u50;

import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.search.CourseSearchActivity;
import com.garmin.android.apps.connectmobile.g1;
import e23.p;
import i3.fe;
import lc.u0;
import o53.b0;
import o53.f0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.search.CourseSearchActivity$setupComposeContent$1$1$3$1", f = "CourseSearchActivity.kt", l = {109}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f168648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CourseSearchActivity f168649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fe f168650c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CourseSearchActivity f168651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fe f168652b;

        public a(CourseSearchActivity courseSearchActivity, fe feVar) {
            this.f168651a = courseSearchActivity;
            this.f168652b = feVar;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            x50.c cVar = (x50.c) obj;
            CourseSearchActivity.a aVar = CourseSearchActivity.f33091e;
            CourseSearchActivity courseSearchActivity = this.f168651a;
            courseSearchActivity.getClass();
            boolean zG = s.g(cVar, x50.c.i.f188995a);
            fe feVar = this.f168652b;
            if (zG) {
                String string = courseSearchActivity.getString(R.string.msg_too_many_courses_from_search);
                string.getClass();
                ge1.b.T(f0.w(courseSearchActivity), null, null, new f(feVar, string, null), 3);
            } else if (s.g(cVar, x50.c.g.f188993a)) {
                String string2 = courseSearchActivity.getString(R.string.msg_no_courses_from_search);
                string2.getClass();
                ge1.b.T(f0.w(courseSearchActivity), null, null, new f(feVar, string2, null), 3);
            } else if (cVar instanceof x50.c.C3514c) {
                com.garmin.android.apps.connectmobile.courses.model.d dVar2 = ((x50.c.C3514c) cVar).f188989a;
                t41.d dVar3 = new t41.d(courseSearchActivity);
                if (dVar3.a(dVar2.distanceInMeters)) {
                    ((s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null)).t(courseSearchActivity, dVar2);
                } else {
                    dVar3.b();
                }
            } else if (cVar instanceof x50.c.b) {
                ((s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null)).r(courseSearchActivity, ((x50.c.b) cVar).f188988a);
                courseSearchActivity.setResult(-1, new Intent().putExtra("GCM_extra_course_selected", true));
                courseSearchActivity.finish();
            } else if (cVar instanceof x50.c.a) {
                CourseDetailsActivity.a aVar2 = CourseDetailsActivity.f33024k;
                com.garmin.android.apps.connectmobile.courses.model.d dVar4 = ((x50.c.a) cVar).f188987a;
                aVar2.getClass();
                CourseDetailsActivity.a.a(courseSearchActivity, dVar4, 15);
            } else if (cVar instanceof x50.c.f) {
                String string3 = courseSearchActivity.getString(R.string.msg_course_confirm_delete);
                u20.d dVar5 = new u20.d();
                Bundle bundle = new Bundle();
                bundle.putString("ENTITY_NAME_EXTRA", string3);
                dVar5.setArguments(bundle);
                dVar5.f167881a = new o62.b0(18, courseSearchActivity, cVar);
                dVar5.show(courseSearchActivity.getSupportFragmentManager(), "DeleteDialogFragment");
            } else if (s.g(cVar, x50.c.e.f188991a)) {
                u20.e.u6(-1, R.string.msg_course_save_fail).g(courseSearchActivity.getSupportFragmentManager());
            } else if (s.g(cVar, x50.c.d.f188990a)) {
                ((s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null)).h(courseSearchActivity);
            } else {
                if (!s.g(cVar, x50.c.h.f188994a)) {
                    u0.r();
                    return null;
                }
                g1.b(courseSearchActivity, com.garmin.android.library.backgroundtaskmanagement.b.c.RECOVERABLE);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CourseSearchActivity courseSearchActivity, fe feVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f168649b = courseSearchActivity;
        this.f168650c = feVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f168649b, this.f168650c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to u50.e for r6v1 'this'  t13.d
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
            int r1 = r6.f168648a
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
            com.garmin.android.apps.connectmobile.courses.presentation.search.CourseSearchActivity$a r7 = com.garmin.android.apps.connectmobile.courses.presentation.search.CourseSearchActivity.f33091e
            com.garmin.android.apps.connectmobile.courses.presentation.search.CourseSearchActivity r7 = r6.f168649b
            u50.h r1 = r7.ca()
            r53.a2 r1 = r1.f168675k
            u50.e$a r4 = new u50.e$a
            i3.fe r5 = r6.f168650c
            r4.<init>(r7, r5)
            r6.f168648a = r3
            r53.d2<T> r7 = r1.f150526a
            java.lang.Object r7 = r7.collect(r4, r6)
            if (r7 != r0) goto L33
            return r0
        L33:
            o2.c.f()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: u50.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
