package com.garmin.android.apps.connectmobile.courses.presentation.list;

import am.a2;
import am.x0;
import am.z0;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.v;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.create.CourseTypeActivity;
import com.garmin.android.apps.connectmobile.courses.filter.CourseSortFilterActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.list.CoursesActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.search.CourseSearchActivity;
import com.garmin.android.apps.connectmobile.q1;
import com.garmin.android.apps.connectmobile.r0;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import e23.l;
import e23.p;
import fe2.z;
import i3.mc;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import o13.m;
import o13.n;
import o13.r;
import o53.b0;
import o53.m0;
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
import r53.j;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/presentation/list/CoursesActivity;", "Lcom/garmin/android/apps/connectmobile/r0;", "<init>", "()V", "a", "Li50/h;", RemoteConfigConstants.ResponseFieldKey.STATE, "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CoursesActivity extends r0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f33039i = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i50.b f33040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f33041f = m.a(n.NONE, new h(this, null, null, new z(this, 11)));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public MenuItem f33042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MenuItem f33043h;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends q implements l<i50.a, Unit> {
        public b(Object obj) {
            super(1, obj, g50.g.class, "onAction", "onAction(Lcom/garmin/android/apps/connectmobile/courses/presentation/list/model/CoursesAction;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(i50.a aVar) {
            i50.a aVar2 = aVar;
            aVar2.getClass();
            ((g50.g) this.receiver).B4(aVar2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.list.CoursesActivity$onCreate$2$1$2$1", f = "CoursesActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<i50.h> f33045b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(x3<i50.h> x3Var, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f33045b = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return CoursesActivity.this.new c(this.f33045b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            int i14 = CoursesActivity.f33039i;
            boolean z14 = this.f33045b.getF182175a().f91765d;
            CoursesActivity coursesActivity = CoursesActivity.this;
            if (z14) {
                coursesActivity.showProgressOverlay();
            } else {
                coursesActivity.hideProgressOverlay();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.list.CoursesActivity$onCreate$2$1$3$1", f = "CoursesActivity.kt", l = {101}, m = "invokeSuspend", v = 2)
    public static final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f33046a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class a implements j, p005kotlin.jvm.internal.n {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CoursesActivity f33048a;

            public a(CoursesActivity coursesActivity) {
                this.f33048a = coursesActivity;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                i50.c cVar = (i50.c) obj;
                int i14 = CoursesActivity.f33039i;
                final CoursesActivity coursesActivity = this.f33048a;
                coursesActivity.getClass();
                if (cVar instanceof i50.c.g) {
                    t41.d dVar2 = new t41.d(coursesActivity);
                    com.garmin.android.apps.connectmobile.courses.model.d dVar3 = ((i50.c.g) cVar).f91714a;
                    if (dVar2.a(dVar3.distanceInMeters)) {
                        ((s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null)).t(coursesActivity, dVar3);
                    } else {
                        dVar2.b();
                    }
                } else if (cVar instanceof i50.c.e) {
                    ((s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null)).r(coursesActivity, ((i50.c.e) cVar).f91711a);
                    coursesActivity.finish();
                } else {
                    final int i15 = 1;
                    if (cVar instanceof i50.c.b) {
                        CourseDetailsActivity.a aVar = CourseDetailsActivity.f33024k;
                        com.garmin.android.apps.connectmobile.courses.model.d dVar4 = ((i50.c.b) cVar).f91708a;
                        aVar.getClass();
                        Intent intent = new Intent(coursesActivity, (Class<?>) CourseDetailsActivity.class);
                        intent.putExtra("startedFromCourseList", true);
                        intent.putExtra("GCM_extra_course_id", dVar4.courseId);
                        com.garmin.android.apps.connectmobile.courses.model.i.a aVar2 = com.garmin.android.apps.connectmobile.courses.model.i.f32968g;
                        x0 x0VarC = dVar4.C();
                        aVar2.getClass();
                        intent.putExtra("GCM_extra_course_type", com.garmin.android.apps.connectmobile.courses.model.i.a.a(x0VarC));
                        coursesActivity.startActivityForResult(intent, 35);
                    } else if (cVar instanceof i50.c.f) {
                        i50.c.f fVar = (i50.c.f) cVar;
                        ((s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null)).j(coursesActivity, fVar.f91713b, String.valueOf(fVar.f91712a));
                    } else if (cVar instanceof i50.c.h) {
                        i50.c.h hVar = (i50.c.h) cVar;
                        ((s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null)).w(coursesActivity, hVar.f91716b, hVar.f91715a);
                        coursesActivity.finish();
                    } else if (s.g(cVar, i50.c.C1753c.f91709a)) {
                        CourseTypeActivity.a aVar3 = CourseTypeActivity.f32753j;
                        i50.b bVar = coursesActivity.f33040e;
                        if (bVar == null) {
                            s.m("config");
                            throw null;
                        }
                        int i16 = bVar.f91694a;
                        aVar3.getClass();
                        Intent intent2 = new Intent(coursesActivity, (Class<?>) CourseTypeActivity.class);
                        intent2.putExtra("GCM_create_course_flow", i16);
                        coursesActivity.startActivity(intent2);
                    } else if (s.g(cVar, i50.c.d.f91710a)) {
                        CourseTypeActivity.a aVar4 = CourseTypeActivity.f32753j;
                        i50.b bVar2 = coursesActivity.f33040e;
                        if (bVar2 == null) {
                            s.m("config");
                            throw null;
                        }
                        x0 x0Var = bVar2.f91701h;
                        aVar4.getClass();
                        Intent intent3 = new Intent(coursesActivity, (Class<?>) CourseTypeActivity.class);
                        x0Var.getClass();
                        intent3.putExtra("GCM_extra_activity_type", (Parcelable) x0Var);
                        intent3.putExtra("GCM_extra_navigate_to_course_from_ti", true);
                        coursesActivity.startActivity(intent3);
                    } else if (cVar instanceof i50.c.i) {
                        coursesActivity.na();
                    } else {
                        final int i17 = 0;
                        if (cVar instanceof i50.c.j) {
                            final com.garmin.android.apps.connectmobile.courses.model.d dVar5 = ((i50.c.j) cVar).f91718a;
                            x0 x0VarC2 = dVar5.C();
                            i50.b bVar3 = coursesActivity.f33040e;
                            if (bVar3 == null) {
                                s.m("config");
                                throw null;
                            }
                            new androidx.appcompat.app.e.a(coursesActivity).setTitle(coursesActivity.getString(R.string.change_leg_distance_alert_title, dh.b.A(coursesActivity, z0.e(x0VarC2, bVar3.f91700g)))).setMessage(coursesActivity.getString(R.string.change_leg_distance_alert_message)).setCancelable(false).setPositiveButton(R.string.lbl_common_continue, new DialogInterface.OnClickListener() { // from class: g50.b
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i18) {
                                    int i19 = i17;
                                    com.garmin.android.apps.connectmobile.courses.model.d dVar6 = dVar5;
                                    CoursesActivity coursesActivity2 = coursesActivity;
                                    switch (i19) {
                                        case 0:
                                            int i24 = CoursesActivity.f33039i;
                                            coursesActivity2.ma().B4(new i50.a.C1752a(dVar6));
                                            break;
                                        default:
                                            int i25 = CoursesActivity.f33039i;
                                            coursesActivity2.ma().B4(new i50.a.c(dVar6));
                                            break;
                                    }
                                }
                            }).setNegativeButton(R.string.lbl_cancel, new f20.i(9)).show();
                        } else if (cVar instanceof i50.c.k) {
                            i50.c.k kVar = (i50.c.k) cVar;
                            Integer num = kVar.f91721c;
                            int i18 = kVar.f91720b;
                            String string = num != null ? coursesActivity.getString(i18, coursesActivity.getString(num.intValue())) : coursesActivity.getString(i18);
                            string.getClass();
                            u20.d dVarU6 = u20.d.u6(string, coursesActivity.getString(R.string.lbl_delete), coursesActivity.getString(R.string.lbl_cancel));
                            dVarU6.f167881a = new com.google.android.exoplayer2.analytics.q(21, coursesActivity, kVar);
                            dVarU6.show(coursesActivity.getSupportFragmentManager(), "DeleteDialogFragment");
                        } else if (cVar instanceof i50.c.p) {
                            i50.c.p pVar = (i50.c.p) cVar;
                            com.garmin.android.apps.connectmobile.courses.model.d dVar6 = pVar.f91727a;
                            i50.i iVar = pVar.f91728b;
                            q1.b bVar4 = q1.f41066b;
                            String string2 = coursesActivity.getString(R.string.msg_remove_favorite_course);
                            string2.getClass();
                            a73.f fVar2 = new a73.f(coursesActivity, 18, dVar6, iVar);
                            bVar4.getClass();
                            q1 q1VarA = q1.b.a(0, string2, R.string.lbl_common_continue, R.string.lbl_cancel, fVar2);
                            v supportFragmentManager = coursesActivity.getSupportFragmentManager();
                            supportFragmentManager.getClass();
                            q1VarA.v6(supportFragmentManager, "GCMFragTwoBttnAlertDialog");
                        } else if (cVar instanceof i50.c.o) {
                            i50.c.o oVar = (i50.c.o) cVar;
                            String str = oVar.f91725a;
                            long j8 = oVar.f91726b;
                            q1.b bVar5 = q1.f41066b;
                            String string3 = coursesActivity.getString(R.string.power_guide_course_list);
                            string3.getClass();
                            com.google.android.datatransport.runtime.scheduling.jobscheduling.a aVar5 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.a(coursesActivity, str, j8, 4);
                            bVar5.getClass();
                            q1 q1VarA2 = q1.b.a(0, string3, R.string.lbl_replace, R.string.power_guide_view_guide, aVar5);
                            v supportFragmentManager2 = coursesActivity.getSupportFragmentManager();
                            supportFragmentManager2.getClass();
                            q1VarA2.v6(supportFragmentManager2, "GCMFragTwoBttnAlertDialog");
                        } else if (cVar instanceof i50.c.n) {
                            final com.garmin.android.apps.connectmobile.courses.model.d dVar7 = ((i50.c.n) cVar).f91724a;
                            new androidx.appcompat.app.e.a(coursesActivity).setTitle(R.string.courses_private_course_title).setMessage(coursesActivity.getString(R.string.events_make_course_public_msg)).setCancelable(false).setPositiveButton(R.string.lbl_course_make_public, new DialogInterface.OnClickListener() { // from class: g50.b
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i19) {
                                    int i110 = i15;
                                    com.garmin.android.apps.connectmobile.courses.model.d dVar8 = dVar7;
                                    CoursesActivity coursesActivity2 = coursesActivity;
                                    switch (i110) {
                                        case 0:
                                            int i24 = CoursesActivity.f33039i;
                                            coursesActivity2.ma().B4(new i50.a.C1752a(dVar8));
                                            break;
                                        default:
                                            int i25 = CoursesActivity.f33039i;
                                            coursesActivity2.ma().B4(new i50.a.c(dVar8));
                                            break;
                                    }
                                }
                            }).setNegativeButton(R.string.lbl_cancel, new f20.i(10)).show();
                        } else if (cVar instanceof i50.c.l) {
                            u20.e.u6(-1, ((i50.c.l) cVar).f91722a).g(coursesActivity.getSupportFragmentManager());
                        } else if (s.g(cVar, i50.c.m.f91723a)) {
                            coursesActivity.displayFailedMessage();
                        } else {
                            if (!(cVar instanceof i50.c.a)) {
                                u0.r();
                                return null;
                            }
                            com.garmin.android.apps.connectmobile.courses.model.d dVar8 = ((i50.c.a) cVar).f91707a;
                            i50.h hVar2 = (i50.h) coursesActivity.ma().f75904j.f150540a.getValue();
                            Intent intent4 = new Intent();
                            Bundle bundle = new Bundle();
                            i50.b bVar6 = coursesActivity.f33040e;
                            if (bVar6 == null) {
                                s.m("config");
                                throw null;
                            }
                            bundle.putBoolean("GCM_extra_navigate_to_courses_from_reviewentries", bVar6.f91698e);
                            i50.b bVar7 = coursesActivity.f33040e;
                            if (bVar7 == null) {
                                s.m("config");
                                throw null;
                            }
                            bundle.putParcelable("GCM_extra_activity_type", bVar7.f91701h);
                            i50.b bVar8 = coursesActivity.f33040e;
                            if (bVar8 == null) {
                                s.m("config");
                                throw null;
                            }
                            if (bVar8.a()) {
                                i50.b bVar9 = coursesActivity.f33040e;
                                if (bVar9 == null) {
                                    s.m("config");
                                    throw null;
                                }
                                List<x0> list = bVar9.f91702i;
                                if (list != null) {
                                    bundle.putParcelableArrayList("GCM_extra_activity_type_list", new ArrayList<>(list));
                                }
                            }
                            if (dVar8 != null) {
                                a2.b(bundle, "GCM_extra_course", dVar8);
                            }
                            if (hVar2.f91771j) {
                                a2.b(bundle, "GCM_extra_event_leg_distance", hVar2.f91773l);
                            }
                            intent4.putExtras(bundle);
                            coursesActivity.setResult(-1, intent4);
                            coursesActivity.finish();
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
                u13.a aVar6 = u13.a.COROUTINE_SUSPENDED;
                return unit;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof j) && (obj instanceof p005kotlin.jvm.internal.n)) {
                    return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // p005kotlin.jvm.internal.n
            public final o13.h<?> getFunctionDelegate() {
                return new p005kotlin.jvm.internal.a(2, this.f33048a, CoursesActivity.class, "handleEffect", "handleEffect(Lcom/garmin/android/apps/connectmobile/courses/presentation/list/model/CoursesEffect;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return CoursesActivity.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to com.garmin.android.apps.connectmobile.courses.presentation.list.CoursesActivity$d for r5v1 'this'  t13.d
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
                int r1 = r5.f33046a
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
                int r6 = com.garmin.android.apps.connectmobile.courses.presentation.list.CoursesActivity.f33039i
                com.garmin.android.apps.connectmobile.courses.presentation.list.CoursesActivity r6 = com.garmin.android.apps.connectmobile.courses.presentation.list.CoursesActivity.this
                g50.g r1 = r6.ma()
                r53.a2 r1 = r1.f75906l
                com.garmin.android.apps.connectmobile.courses.presentation.list.CoursesActivity$d$a r4 = new com.garmin.android.apps.connectmobile.courses.presentation.list.CoursesActivity$d$a
                r4.<init>(r6)
                r5.f33046a = r3
                r53.d2<T> r6 = r1.f150526a
                java.lang.Object r6 = r6.collect(r4, r5)
                if (r6 != r0) goto L31
                return r0
            L31:
                o2.c.f()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.courses.presentation.list.CoursesActivity.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.list.CoursesActivity$onCreate$2$1$4$1", f = "CoursesActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends i implements p<b0, t13.d<? super Unit>, Object> {
        public e(t13.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return CoursesActivity.this.new e(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            CoursesActivity.this.invalidateOptionsMenu();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.list.CoursesActivity$onCreate$2$1$5$1", f = "CoursesActivity.kt", l = {113, 114}, m = "invokeSuspend", v = 2)
    public static final class f extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f33050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f33051b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3<i50.h> f33052c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(mc mcVar, x3<i50.h> x3Var, t13.d<? super f> dVar) {
            super(2, dVar);
            this.f33051b = mcVar;
            this.f33052c = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new f(this.f33051b, this.f33052c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
        
            if (r5.f33051b.g(r5) == r0) goto L17;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f33050a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    this.f33050a = 2;
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
            r.b(obj);
            int i15 = CoursesActivity.f33039i;
            if (this.f33052c.getF182175a().f91775n) {
                this.f33050a = 1;
                if (m0.b(100L, this) != aVar) {
                    this.f33050a = 2;
                }
                return aVar;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.list.CoursesActivity$onCreate$2$1$6$1$1", f = "CoursesActivity.kt", l = {121}, m = "invokeSuspend", v = 2)
    public static final class g extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f33053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f33054b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(mc mcVar, t13.d<? super g> dVar) {
            super(2, dVar);
            this.f33054b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new g(this.f33054b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f33053a;
            if (i14 == 0) {
                r.b(obj);
                this.f33053a = 1;
                if (this.f33054b.d(this) == aVar) {
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
    public static final class h implements e23.a<g50.g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f33055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f33056b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f33057c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f33058d;

        public h(b.g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f33055a = gVar;
            this.f33056b = qualifier;
            this.f33057c = aVar;
            this.f33058d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, g50.g] */
        @Override // e23.a
        public final g50.g invoke() {
            CreationExtras defaultViewModelCreationExtras;
            b.g gVar = this.f33055a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f33057c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(g50.g.class), viewModelStore, null, defaultViewModelCreationExtras, this.f33056b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f33058d, 4, null);
        }
    }

    static {
        new a(null);
    }

    @Override // com.garmin.android.apps.connectmobile.r0
    public final String fa() {
        i50.b bVar = this.f33040e;
        if (bVar == null) {
            s.m("config");
            throw null;
        }
        if (!bVar.d()) {
            i50.b bVar2 = this.f33040e;
            if (bVar2 == null) {
                s.m("config");
                throw null;
            }
            if (!bVar2.b()) {
                i50.b bVar3 = this.f33040e;
                if (bVar3 == null) {
                    s.m("config");
                    throw null;
                }
                if (!bVar3.c()) {
                    return "COURSES";
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final g50.g ma() {
        return (g50.g) this.f33041f.getValue();
    }

    public final void na() {
        CourseSearchActivity.a aVar = CourseSearchActivity.f33091e;
        k30.n nVar = ((i50.h) ma().f75904j.f150540a.getValue()).f91764c;
        ArrayList arrayListZ4 = ma().z4();
        i50.b bVar = this.f33040e;
        if (bVar == null) {
            s.m("config");
            throw null;
        }
        boolean zB = bVar.b();
        i50.b bVar2 = this.f33040e;
        if (bVar2 == null) {
            s.m("config");
            throw null;
        }
        boolean zC = bVar2.c();
        aVar.getClass();
        Intent intent = new Intent(this, (Class<?>) CourseSearchActivity.class);
        Bundle bundle = new Bundle();
        if (nVar != null) {
            bundle.putParcelable("SORT_FILTER_EXTRA", nVar);
        }
        bundle.putStringArrayList("FAVORITES_LIST_EXTRA", new ArrayList<>(arrayListZ4));
        intent.putExtras(bundle);
        intent.putExtra("PACE_PRO_FILTER", zB);
        intent.putExtra("POWER_GUIDE_FLOW", zC);
        startActivityForResult(intent, 55);
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        Parcelable parcelable;
        if (intent != null) {
            String action = intent.getAction();
            if (i14 != 35) {
                if (i14 == 45) {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            parcelable = (Parcelable) extras.getParcelable("extra_sort_filter", k30.n.class);
                        } else {
                            Parcelable parcelable2 = extras.getParcelable("extra_sort_filter");
                            if (!(parcelable2 instanceof k30.n)) {
                                parcelable2 = null;
                            }
                            parcelable = (k30.n) parcelable2;
                        }
                        k30.n nVar = (k30.n) parcelable;
                        if (nVar != null) {
                            ma().B4(new i50.a.p(nVar));
                        }
                    }
                } else if (i14 != 55) {
                    if (i14 == 345 && i15 == -1 && "android.intent.action.DELETE".equals(action)) {
                        Bundle extras2 = intent.getExtras();
                        long j8 = extras2 != null ? extras2.getLong("GCM_extra_power_guide_id_to_remove", -1L) : -1L;
                        if (j8 != -1) {
                            ma().B4(new i50.a.j(j8));
                        }
                    }
                } else if (intent.getBooleanExtra("GCM_extra_course_selected", false)) {
                    finish();
                } else if ("android.intent.action.EDIT".equals(action)) {
                    ma().B4(i50.a.h.f91679a);
                }
            } else if ("android.intent.action.DELETE".equals(action) || "android.intent.action.EDIT".equals(action)) {
                ma().B4(i50.a.h.f91679a);
            }
        }
        super.onActivityResult(i14, i15, intent);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0105  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:90:0x0186  */
    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ArrayList parcelableArrayListExtra;
        ArrayList arrayList;
        Parcelable parcelable;
        x0 x0Var;
        Parcelable parcelable2;
        Parcelable parcelable3;
        List parcelableArrayListExtra2;
        super.onCreate(bundle);
        Intent intent = getIntent();
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33) {
            if (intent != null) {
                parcelableArrayListExtra = intent.getParcelableArrayListExtra("GCM_extra_activity_type_list", x0.class);
                arrayList = parcelableArrayListExtra;
            } else {
                arrayList = null;
            }
        } else if (intent != null) {
            parcelableArrayListExtra = intent.getParcelableArrayListExtra("GCM_extra_activity_type_list");
            arrayList = parcelableArrayListExtra;
        } else {
            arrayList = null;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            Intent intent2 = getIntent();
            if (i14 >= 33) {
                parcelable = intent2 != null ? (Parcelable) intent2.getParcelableExtra("GCM_extra_activity_type", x0.class) : null;
            } else {
                Parcelable parcelableExtra = intent2 != null ? intent2.getParcelableExtra("GCM_extra_activity_type") : null;
                if (!(parcelableExtra instanceof x0)) {
                    parcelableExtra = null;
                }
                parcelable = (x0) parcelableExtra;
            }
            x0Var = (x0) parcelable;
        } else {
            x0Var = (x0) h0.b0(arrayList);
        }
        x0 x0Var2 = x0Var;
        int intExtra = getIntent().getIntExtra("GCM_create_course_flow", -1);
        boolean booleanExtra = getIntent().getBooleanExtra("GCM_extra_navigate_to_course_from_ti", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("GCM_extra_navigate_to_course_from_ti_for_training_plan", false);
        boolean booleanExtra3 = getIntent().getBooleanExtra("GCM_extra_navigate_to_courses_from_eventdetails", false);
        boolean booleanExtra4 = getIntent().getBooleanExtra("GCM_extra_navigate_to_courses_from_reviewentries", false);
        boolean booleanExtra5 = getIntent().getBooleanExtra("GCM_extra_is_sharable_event", false);
        boolean booleanExtra6 = getIntent().getBooleanExtra("GCM_extra_is_triathlon_event", false);
        int intExtra2 = getIntent().getIntExtra("GCM_extra_is_garmin_coach_distance", -1);
        Intent intent3 = getIntent();
        if (i14 >= 33) {
            parcelable2 = intent3 != null ? (Parcelable) intent3.getParcelableExtra("GCM_extra_event_leg_distance", com.garmin.android.apps.connectmobile.workouts.data.model.f.class) : null;
        } else {
            Parcelable parcelableExtra2 = intent3 != null ? intent3.getParcelableExtra("GCM_extra_event_leg_distance") : null;
            if (!(parcelableExtra2 instanceof com.garmin.android.apps.connectmobile.workouts.data.model.f)) {
                parcelableExtra2 = null;
            }
            parcelable2 = (com.garmin.android.apps.connectmobile.workouts.data.model.f) parcelableExtra2;
        }
        com.garmin.android.apps.connectmobile.workouts.data.model.f fVar = (com.garmin.android.apps.connectmobile.workouts.data.model.f) parcelable2;
        Intent intent4 = getIntent();
        if (i14 >= 33) {
            parcelable3 = intent4 != null ? (Parcelable) intent4.getParcelableExtra("GCM_extra_event_location", com.garmin.android.library.mapsdkadapter.f.class) : null;
        } else {
            Parcelable parcelableExtra3 = intent4 != null ? intent4.getParcelableExtra("GCM_extra_event_location") : null;
            if (!(parcelableExtra3 instanceof com.garmin.android.library.mapsdkadapter.f)) {
                parcelableExtra3 = null;
            }
            parcelable3 = (com.garmin.android.library.mapsdkadapter.f) parcelableExtra3;
        }
        com.garmin.android.library.mapsdkadapter.f fVar2 = (com.garmin.android.library.mapsdkadapter.f) parcelable3;
        Intent intent5 = getIntent();
        if (i14 >= 33) {
            if (intent5 != null) {
                parcelableArrayListExtra2 = intent5.getParcelableArrayListExtra("GCM_extra_power_guide_list", ab1.g.class);
            } else {
                parcelableArrayListExtra2 = null;
            }
        } else if (intent5 != null) {
            parcelableArrayListExtra2 = intent5.getParcelableArrayListExtra("GCM_extra_power_guide_list");
        } else {
            parcelableArrayListExtra2 = null;
        }
        if (parcelableArrayListExtra2 == null) {
            parcelableArrayListExtra2 = j0.f134944a;
        }
        this.f33040e = new i50.b(intExtra, booleanExtra, booleanExtra2, booleanExtra3, booleanExtra4, booleanExtra5, booleanExtra6, x0Var2, arrayList, intExtra2, fVar, fVar2, parcelableArrayListExtra2);
        setContentView(R.layout.composable_container);
        ((s20.h) KoinJavaComponent.get$default(s20.h.class, null, null, 6, null)).m();
        String strFa = fa();
        if (strFa != null) {
            ca(strFa);
        }
        i50.b bVar = this.f33040e;
        if (bVar == null) {
            s.m("config");
            throw null;
        }
        if (bVar.d()) {
            initActionBar(true, R.string.add_event);
        } else {
            i50.b bVar2 = this.f33040e;
            if (bVar2 == null) {
                s.m("config");
                throw null;
            }
            if (bVar2.b()) {
                initActionBar(true, R.string.pacepro_lbl_select_course);
            } else {
                i50.b bVar3 = this.f33040e;
                if (bVar3 == null) {
                    s.m("config");
                    throw null;
                }
                if (bVar3.c()) {
                    initActionBar(true, R.string.pacepro_lbl_select_course);
                } else {
                    i50.b bVar4 = this.f33040e;
                    if (bVar4 == null) {
                        s.m("config");
                        throw null;
                    }
                    if (bVar4.f91697d) {
                        initActionBar(true, R.string.add_a_course);
                    } else {
                        initActionBar(true, R.string.concept_courses);
                    }
                }
            }
        }
        ((ComposeView) findViewById(R.id.composable_container)).setContent(new z3.e(419879889, true, new g50.c(this, 0)));
        ma().B4(i50.a.l.f91683a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        boolean z14;
        MenuItem menuItem;
        menu.getClass();
        getMenuInflater().inflate(R.menu.my_courses, menu);
        this.f33042g = menu.findItem(R.id.menu_item_search);
        this.f33043h = menu.findItem(R.id.menu_item_filter);
        i50.b bVar = this.f33040e;
        if (bVar == null) {
            s.m("config");
            throw null;
        }
        if (bVar.b() && (menuItem = this.f33043h) != null) {
            menuItem.setIcon(R.drawable.filter);
        }
        boolean z15 = ((i50.h) ma().f75904j.f150540a.getValue()).f91772k;
        MenuItem menuItem2 = this.f33042g;
        if (menuItem2 != null) {
            i50.b bVar2 = this.f33040e;
            if (bVar2 == null) {
                s.m("config");
                throw null;
            }
            if (bVar2.d()) {
                z14 = false;
            } else {
                i50.b bVar3 = this.f33040e;
                if (bVar3 == null) {
                    s.m("config");
                    throw null;
                }
                if (bVar3.f91697d) {
                    z14 = false;
                } else {
                    z14 = true;
                }
            }
            menuItem2.setVisible(z14);
        }
        MenuItem menuItem3 = this.f33043h;
        if (menuItem3 == null) {
            return true;
        }
        i50.b bVar4 = this.f33040e;
        if (bVar4 != null) {
            menuItem3.setVisible((bVar4.d() && z15) ? false : true);
            return true;
        }
        s.m("config");
        throw null;
    }

    @Override // b.g, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        ma().B4(i50.a.l.f91683a);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menu_item_search) {
            na();
            return true;
        }
        if (itemId != R.id.menu_item_filter) {
            return super.onOptionsItemSelected(menuItem);
        }
        i50.b bVar = this.f33040e;
        if (bVar == null) {
            s.m("config");
            throw null;
        }
        if (bVar.d()) {
            ht.a aVar = ht.a.f85464a;
            Bundle bundle = new Bundle();
            aVar.getClass();
            ht.a.a(bundle, "CreateEventCourseFilterSelected");
        }
        CourseSortFilterActivity.a aVar2 = CourseSortFilterActivity.f32768c;
        k30.n nVar = ((i50.h) ma().f75904j.f150540a.getValue()).f91764c;
        aVar2.getClass();
        nVar.getClass();
        Intent intent = new Intent(this, (Class<?>) CourseSortFilterActivity.class);
        intent.putExtra("extra_sort_filter", nVar);
        startActivityForResult(intent, 45);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        menu.getClass();
        oc.b.G(this.f33042g, this, R.color.gcm_icon_primary);
        oc.b.G(this.f33043h, this, R.color.gcm_icon_primary);
        return super.onPrepareOptionsMenu(menu);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/presentation/list/CoursesActivity$a;", "", "<init>", "()V", "", "VIEW_COURSE_REQUEST_CODE", "I", "FILTER_COURSE_REQUEST_CODE", "SEARCH_COURSE_REQUEST_CODE", "LAUNCH_COURSE_FROM_TI_EVENT_CREATION", "LAUNCH_COURSE_FROM_EVENT_DETAILS", "", "WHATS_NEW_SHEET_DELAY_MS", "J", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
