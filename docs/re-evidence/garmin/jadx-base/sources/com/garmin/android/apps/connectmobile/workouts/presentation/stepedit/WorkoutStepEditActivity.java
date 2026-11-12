package com.garmin.android.apps.connectmobile.workouts.presentation.stepedit;

import am.x0;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.h1;
import androidx.lifecycle.u1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.stats.exercises.NewSelectExerciseActivity;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.j0;
import com.garmin.android.apps.connectmobile.workouts.data.model.v;
import com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.WorkoutStepEditActivity;
import e23.p;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import mt0.y;
import o13.r;
import o53.b0;
import o53.f0;
import o53.s0;
import o62.a0;
import o62.v0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.t0;
import p005kotlin.jvm.internal.z;
import r53.e2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/WorkoutStepEditActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WorkoutStepEditActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f49573h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f49574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f49575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f.c<Intent> f49576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f.c<Intent> f49577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f.c<Intent> f49578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f.c<Intent> f49579f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f.c<Intent> f49580g;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends q implements e23.q<String, String, t13.d<? super Boolean>, Object> {
        public b(Object obj) {
            super(3, obj, w52.e.class, "downloadAudioNote", "downloadAudioNote(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // e23.q
        public final Object invoke(String str, String str2, t13.d<? super Boolean> dVar) {
            return ((w52.e) this.receiver).x4(str, str2, dVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class c extends q implements p<File, t13.d<? super com.garmin.android.apps.connectmobile.workouts.data.model.a>, Object> {
        public c(Object obj) {
            super(2, obj, w52.e.class, "uploadAudioNote", "uploadAudioNote(Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // e23.p
        public final Object invoke(File file, t13.d<? super com.garmin.android.apps.connectmobile.workouts.data.model.a> dVar) {
            w52.e eVar = (w52.e) this.receiver;
            eVar.getClass();
            x53.c cVar = s0.f129406a;
            return ge1.b.e0(x53.b.f189152a, new w52.g(file, eVar, null), dVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.WorkoutStepEditActivity$onCreate$4$1", f = "WorkoutStepEditActivity.kt", l = {171}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49581a;

        public e(t13.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return WorkoutStepEditActivity.this.new e(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f49581a;
            if (i14 == 0) {
                r.b(obj);
                a aVar2 = WorkoutStepEditActivity.f49573h;
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j jVarDa = WorkoutStepEditActivity.this.da();
                this.f49581a = 1;
                if (jVarDa.N4(this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.WorkoutStepEditActivity$onCreate$6", f = "WorkoutStepEditActivity.kt", l = {194}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49583a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.WorkoutStepEditActivity$onCreate$6$1", f = "WorkoutStepEditActivity.kt", l = {195}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f49585a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkoutStepEditActivity f49586b;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.WorkoutStepEditActivity$f$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C0978a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ WorkoutStepEditActivity f49587a;

                public C0978a(WorkoutStepEditActivity workoutStepEditActivity) {
                    this.f49587a = workoutStepEditActivity;
                }

                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.g gVar = (com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.g) obj;
                    a aVar = WorkoutStepEditActivity.f49573h;
                    WorkoutStepEditActivity workoutStepEditActivity = this.f49587a;
                    workoutStepEditActivity.getClass();
                    if (gVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.g.b) {
                        if (((com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.g.b) gVar).f49671a) {
                            workoutStepEditActivity.showProgressOverlay();
                        } else {
                            workoutStepEditActivity.hideProgressOverlay();
                        }
                    } else if (gVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.g.h) {
                        new androidx.appcompat.app.e.a(workoutStepEditActivity).setTitle(R.string.audio_note_failed_to_download_alert_title).setMessage(R.string.audio_note_failed_to_download_alert_message).setPositiveButton(R.string.common_retry, new hg1.g(28, workoutStepEditActivity, gVar)).setNegativeButton(R.string.common_cancel, new y(11)).show();
                    } else {
                        int i14 = 0;
                        if (!(gVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.g.c)) {
                            com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.c cVarValueOf = null;
                            if (gVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.g.i) {
                                m52.a aVar2 = ((com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.g.i) gVar).f49692a;
                                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.c.f49632d.getClass();
                                try {
                                    cVarValueOf = com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.c.valueOf(aVar2.name());
                                } catch (Exception unused) {
                                }
                                if (cVarValueOf != null) {
                                    WorkoutRestStepHelpActivity.a aVar3 = WorkoutRestStepHelpActivity.f49572a;
                                    String string = workoutStepEditActivity.getString(cVarValueOf.f49634a);
                                    string.getClass();
                                    String string2 = workoutStepEditActivity.getString(cVarValueOf.f49635b);
                                    string2.getClass();
                                    String string3 = workoutStepEditActivity.getString(cVarValueOf.f49636c);
                                    string3.getClass();
                                    aVar3.getClass();
                                    Intent intent = new Intent(workoutStepEditActivity, (Class<?>) WorkoutRestStepHelpActivity.class);
                                    intent.putExtra("EXTRA_TITLE", string);
                                    intent.putExtra("EXTRA_HELP_TITLE", string2);
                                    intent.putExtra("EXTRA_HELP_DESCRIPTION", string3);
                                    workoutStepEditActivity.startActivity(intent);
                                }
                            } else if (gVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.g.e) {
                                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.g.e eVar = (com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.g.e) gVar;
                                x0 x0Var = eVar.f49681c;
                                workoutStepEditActivity.f49576c.a(NewSelectExerciseActivity.a.a(NewSelectExerciseActivity.f29823c, workoutStepEditActivity, eVar.f49679a, eVar.f49680b, hq.j.b(workoutStepEditActivity, x0Var), false, hq.j.a(workoutStepEditActivity, x0Var), hq.j.d(x0Var), hq.j.c(x0Var), s.g(workoutStepEditActivity.getResources().getConfiguration().getLocales().get(0).getLanguage(), "en"), 16), null);
                            } else if (gVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.g.f) {
                                WorkoutStepEditWeightActivity.a aVar4 = WorkoutStepEditWeightActivity.f49597b;
                                v0 v0Var = ((com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.g.f) gVar).f49682a;
                                aVar4.getClass();
                                Intent intent2 = new Intent(workoutStepEditActivity, (Class<?>) WorkoutStepEditWeightActivity.class);
                                intent2.putExtra("WORKOUT_STEP_WEIGHT", v0Var);
                                workoutStepEditActivity.f49577d.a(intent2, null);
                            } else if (gVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.g.j) {
                                HelpActivity.a aVar5 = HelpActivity.f36653a;
                                ro0.l lVar = ro0.l.WORKOUT_STEP_TARGET_HELP;
                                aVar5.getClass();
                                HelpActivity.a.d(workoutStepEditActivity, lVar, null, null);
                            } else if (gVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.g.C0983g) {
                                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.g.C0983g c0983g = (com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.g.C0983g) gVar;
                                Intent intentF = ((o52.e) KoinJavaComponent.get$default(o52.e.class, null, null, 6, null)).F(workoutStepEditActivity, c0983g.f49684b, c0983g.f49685c, c0983g.f49686d, c0983g.f49687e, c0983g.f49688f);
                                if (c0983g.f49683a) {
                                    workoutStepEditActivity.f49578e.a(intentF, null);
                                } else {
                                    workoutStepEditActivity.f49579f.a(intentF, null);
                                }
                            } else if (gVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.g.d) {
                                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.g.d dVar2 = (com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.g.d) gVar;
                                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.a aVar6 = new com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.a(workoutStepEditActivity, dVar2.f49674b, dVar2.f49675c, dVar2.f49676d, dVar2.f49677e, new o62.b0(i14, workoutStepEditActivity, dVar2));
                                if (dVar2.f49678f) {
                                    aVar6.setTitle(workoutStepEditActivity.getString(R.string.workout_set_intensity_target) + " (" + x52.f.f189094y.b(workoutStepEditActivity) + ")");
                                    v22.e.j(aVar6.f49616l);
                                }
                                aVar6.show();
                            } else {
                                if (!(gVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.g.a)) {
                                    u0.r();
                                    return null;
                                }
                                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.g.a aVar7 = (com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.g.a) gVar;
                                EditRepsActivity.a aVar8 = EditRepsActivity.f49554a;
                                int i15 = aVar7.f49668a;
                                boolean z14 = aVar7.f49669b;
                                boolean z15 = aVar7.f49670c;
                                aVar8.getClass();
                                Intent intent3 = new Intent(workoutStepEditActivity, (Class<?>) EditRepsActivity.class);
                                intent3.putExtra("reps", i15);
                                intent3.putExtra("is_reps_plus_supported", z14);
                                intent3.putExtra("is_reps_plus_enabled", z15);
                                workoutStepEditActivity.f49580g.a(intent3, null);
                            }
                        } else if (((com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.g.c) gVar).f49672a) {
                            workoutStepEditActivity.onBackPressed();
                        } else {
                            new androidx.appcompat.app.e.a(workoutStepEditActivity).setTitle(R.string.workout_unable_to_save_alert_title).setMessage(R.string.workout_unable_to_save_alert_message).setPositiveButton(R.string.common_retry, new a0(workoutStepEditActivity, i14)).setNegativeButton(R.string.common_cancel, new y(11)).show();
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WorkoutStepEditActivity workoutStepEditActivity, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f49586b = workoutStepEditActivity;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f49586b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f49585a;
                if (i14 == 0) {
                    r.b(obj);
                    a aVar2 = WorkoutStepEditActivity.f49573h;
                    WorkoutStepEditActivity workoutStepEditActivity = this.f49586b;
                    e2 e2Var = workoutStepEditActivity.da().f49708h;
                    C0978a c0978a = new C0978a(workoutStepEditActivity);
                    this.f49585a = 1;
                    e2Var.getClass();
                    if (e2.m(e2Var, c0978a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                o2.c.f();
                return null;
            }
        }

        public f(t13.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return WorkoutStepEditActivity.this.new f(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f49583a;
            if (i14 == 0) {
                r.b(obj);
                WorkoutStepEditActivity workoutStepEditActivity = WorkoutStepEditActivity.this;
                androidx.lifecycle.b0 f158016a = workoutStepEditActivity.getF158016a();
                androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
                a aVar2 = new a(workoutStepEditActivity, null);
                this.f49583a = 1;
                if (h1.a(f158016a, bVar, aVar2, this) == aVar) {
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
    public static final class g implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f49588a;

        public g(e23.l lVar) {
            lVar.getClass();
            this.f49588a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f49588a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f49588a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f49589a;

        public h(b.g gVar) {
            this.f49589a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f49589a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f49590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f49591b;

        public i(e23.a aVar, b.g gVar) {
            this.f49590a = aVar;
            this.f49591b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f49590a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f49591b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class j implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f49592a;

        public j(b.g gVar) {
            this.f49592a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f49592a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class k implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f49593a;

        public k(b.g gVar) {
            this.f49593a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f49593a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class l implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f49594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f49595b;

        public l(e23.a aVar, b.g gVar) {
            this.f49594a = aVar;
            this.f49595b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f49594a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f49595b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/workouts/presentation/stepedit/WorkoutStepEditActivity$m", "Landroidx/lifecycle/x1$c;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class m implements x1.c {
        public m() {
        }

        /* JADX WARN: Code duplicated, block: B:113:0x0155  */
        @Override // androidx.lifecycle.x1.c
        public final <T extends u1> T create(Class<T> cls, CreationExtras creationExtras) {
            Object serializable;
            Object obj;
            com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b aVar;
            ArrayList parcelableArrayList;
            Parcelable parcelable;
            Serializable serializable2;
            Serializable serializable3;
            Object obj2;
            l2.a aVar2 = l2.f37135b;
            Intent intent = WorkoutStepEditActivity.this.getIntent();
            aVar2.getClass();
            Bundle bundleA = l2.a.a(intent);
            int i14 = Build.VERSION.SDK_INT;
            Serializable serializable4 = null;
            parcelableArrayList = null;
            List parcelableArrayList2 = null;
            Parcelable parcelable2 = null;
            if (i14 >= 33) {
                serializable = bundleA != null ? bundleA.getSerializable("GCM_extra_activity_id", m52.k.class) : null;
            } else {
                Serializable serializable5 = bundleA != null ? bundleA.getSerializable("GCM_extra_activity_id") : null;
                if (!(serializable5 instanceof m52.k)) {
                    serializable5 = null;
                }
                serializable = (m52.k) serializable5;
            }
            serializable.getClass();
            m52.k kVar = (m52.k) serializable;
            if (i14 >= 33) {
                obj = bundleA != null ? (Parcelable) bundleA.getParcelable("GCM_extra_activity_metadata", j0.class) : null;
            } else {
                Parcelable parcelable3 = bundleA != null ? bundleA.getParcelable("GCM_extra_activity_metadata") : null;
                if (!(parcelable3 instanceof j0)) {
                    parcelable3 = null;
                }
                obj = (j0) parcelable3;
            }
            obj.getClass();
            j0 j0Var = (j0) obj;
            if (kVar == m52.k.f116758r) {
                boolean z14 = bundleA != null ? bundleA.getBoolean("GCM_extra_activity_type", false) : false;
                Double d14 = (bundleA == null || (obj2 = bundleA.get("GCM_extra_activity_pool_length_value")) == null) ? null : (Double) obj2;
                if (i14 >= 33) {
                    serializable2 = bundleA != null ? bundleA.getSerializable("GCM_extra_activity_pool_length_unit", m52.j.class) : null;
                } else {
                    Serializable serializable6 = bundleA != null ? bundleA.getSerializable("GCM_extra_activity_pool_length_unit") : null;
                    if (!(serializable6 instanceof m52.j)) {
                        serializable6 = null;
                    }
                    serializable2 = (m52.j) serializable6;
                }
                m52.j jVar = (m52.j) serializable2;
                if (jVar == null) {
                    jVar = m52.j.f116747g;
                }
                m52.j jVar2 = jVar;
                if (i14 >= 33) {
                    serializable3 = bundleA != null ? bundleA.getSerializable("extra_pool_length_unit_unspecified_pool_size", m52.j.class) : null;
                } else {
                    Serializable serializable7 = bundleA != null ? bundleA.getSerializable("extra_pool_length_unit_unspecified_pool_size") : null;
                    if (!(serializable7 instanceof m52.j)) {
                        serializable7 = null;
                    }
                    serializable3 = (m52.j) serializable7;
                }
                m52.j jVar3 = (m52.j) serializable3;
                if (i14 < 33) {
                    Serializable serializable8 = bundleA != null ? bundleA.getSerializable("extra_css_value") : null;
                    serializable4 = (o13.p) (serializable8 instanceof o13.p ? serializable8 : null);
                } else if (bundleA != null) {
                    serializable4 = bundleA.getSerializable("extra_css_value", o13.p.class);
                }
                aVar = new com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b.c(z14, d14, jVar2, jVar3, (o13.p) serializable4, bundleA != null ? bundleA.getBoolean("extra_has_send_off_time_step", false) : false, bundleA != null ? bundleA.getBoolean("extra_has_target_pace_step", false) : false);
            } else if (k52.g.b().contains(kVar)) {
                boolean z15 = bundleA != null ? bundleA.getBoolean("extra_is_in_timed_repeat", false) : false;
                if (i14 >= 33) {
                    parcelable = bundleA != null ? (Parcelable) bundleA.getParcelable("EXTRA_EXERCISE_LIST", com.garmin.android.apps.connectmobile.repcounting.model.c.class) : null;
                } else {
                    Parcelable parcelable4 = bundleA != null ? bundleA.getParcelable("EXTRA_EXERCISE_LIST") : null;
                    if (!(parcelable4 instanceof com.garmin.android.apps.connectmobile.repcounting.model.c)) {
                        parcelable4 = null;
                    }
                    parcelable = (com.garmin.android.apps.connectmobile.repcounting.model.c) parcelable4;
                }
                com.garmin.android.apps.connectmobile.repcounting.model.c cVar = (com.garmin.android.apps.connectmobile.repcounting.model.c) parcelable;
                if (cVar == null) {
                    cVar = new com.garmin.android.apps.connectmobile.repcounting.model.c();
                }
                if (i14 >= 33) {
                    if (bundleA != null) {
                        parcelableArrayList2 = bundleA.getParcelableArrayList("EXTRA_BENCHMARKS", com.garmin.android.apps.connectmobile.workouts.data.model.b.class);
                    }
                } else if (bundleA != null) {
                    parcelableArrayList2 = bundleA.getParcelableArrayList("EXTRA_BENCHMARKS");
                }
                if (parcelableArrayList2 == null) {
                    parcelableArrayList2 = p13.j0.f134944a;
                }
                aVar = new com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b.C0980b(z15, cVar, parcelableArrayList2);
            } else {
                if (i14 >= 33) {
                    if (bundleA != null) {
                        parcelableArrayList = bundleA.getParcelableArrayList("GCM_extra_activity_power_curve_target_list", v.class);
                    } else {
                        parcelableArrayList = null;
                    }
                } else if (bundleA != null) {
                    parcelableArrayList = bundleA.getParcelableArrayList("GCM_extra_activity_power_curve_target_list");
                } else {
                    parcelableArrayList = null;
                }
                if (i14 < 33) {
                    Parcelable parcelable5 = bundleA != null ? bundleA.getParcelable("GCM_extra_cycling_power_zones") : null;
                    parcelable2 = (PowerZonesDTO) (parcelable5 instanceof PowerZonesDTO ? parcelable5 : null);
                } else if (bundleA != null) {
                    parcelable2 = (Parcelable) bundleA.getParcelable("GCM_extra_cycling_power_zones", PowerZonesDTO.class);
                }
                aVar = new com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b.a(parcelableArrayList, (PowerZonesDTO) parcelable2);
            }
            return new com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j(kVar, j0Var, aVar);
        }
    }

    public WorkoutStepEditActivity() {
        n82.i iVar = new n82.i(this, 13);
        t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
        this.f49574a = new w1(t0Var.b(com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j.class), new h(this), iVar, new i(null, this));
        this.f49575b = new w1(t0Var.b(w52.e.class), new k(this), new j(this), new l(null, this));
        final int i14 = 1;
        this.f49576c = registerForActivityResult(new g.h(), new f.b(this) { // from class: o62.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkoutStepEditActivity f129812b;

            {
                this.f129812b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                Parcelable parcelable;
                Double dM;
                Intent intent2;
                Parcelable parcelable2;
                int i15 = i14;
                String str = null;
                str = null;
                WorkoutStepEditActivity workoutStepEditActivity = this.f129812b;
                switch (i15) {
                    case 0:
                        f.a aVar = (f.a) obj;
                        WorkoutStepEditActivity.a aVar2 = WorkoutStepEditActivity.f49573h;
                        aVar.getClass();
                        if (aVar.f67585a == -1 && (intent = aVar.f67586b) != null) {
                            int intExtra = intent.getIntExtra("reps", -1);
                            boolean booleanExtra = intent.getBooleanExtra("is_reps_plus_enabled", false);
                            if (intExtra > 0) {
                                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j jVarDa = workoutStepEditActivity.da();
                                jVarDa.f49703c.j(com.garmin.android.apps.connectmobile.workouts.data.model.j0.b(jVarDa.G4(), 0, null, false, booleanExtra, null, intExtra, null, 0.0d, 0.0d, null, 0, 0, 0, 0, null, 0.0d, 0.0d, null, null, null, null, 0.0d, null, null, -8449, 16383));
                            }
                            break;
                        }
                        break;
                    case 1:
                        f.a aVar3 = (f.a) obj;
                        WorkoutStepEditActivity.a aVar4 = WorkoutStepEditActivity.f49573h;
                        aVar3.getClass();
                        Intent intent3 = aVar3.f67586b;
                        if (intent3 != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable = (Parcelable) intent3.getParcelableExtra("RESULT_SELECTED_EXERCISE", com.garmin.android.apps.connectmobile.repcounting.model.d.class);
                            } else {
                                Parcelable parcelableExtra = intent3.getParcelableExtra("RESULT_SELECTED_EXERCISE");
                                if (!(parcelableExtra instanceof com.garmin.android.apps.connectmobile.repcounting.model.d)) {
                                    parcelableExtra = null;
                                }
                                parcelable = (com.garmin.android.apps.connectmobile.repcounting.model.d) parcelableExtra;
                            }
                            com.garmin.android.apps.connectmobile.repcounting.model.d dVar = (com.garmin.android.apps.connectmobile.repcounting.model.d) parcelable;
                            if (dVar != null) {
                                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j jVarDa2 = workoutStepEditActivity.da();
                                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0VarB = com.garmin.android.apps.connectmobile.workouts.data.model.j0.b(jVarDa2.G4(), 0, null, false, false, null, 0.0d, null, 0.0d, 0.0d, null, 0, 0, 0, 0, null, 0.0d, 0.0d, null, null, null, null, 0.0d, null, null, -1, 16383);
                                String str2 = j0VarB.H0;
                                String strG = j0VarB.g();
                                if (!zf.b.E(dVar.f41102a, dVar.f41106e, str2, strG)) {
                                    j0VarB.H0 = dVar.f41102a;
                                    j0VarB.I0 = dVar.f41106e;
                                    double d14 = j0VarB.J0;
                                    if (strG == null || strG.length() == 0 || jVarDa2.B4().f49623b.H(str2, strG) || dVar.f41105d || Double.isNaN(d14) || d14 < 0.0d) {
                                        j0VarB.J0 = dVar.f41105d ? -1.0d : 0.0d;
                                    }
                                    double dDoubleValue = Double.NaN;
                                    j0VarB.M0 = Double.NaN;
                                    com.garmin.android.apps.connectmobile.workouts.data.model.b bVarT = gl1.d.t(jVarDa2.B4().f49624c, dVar);
                                    String benchmarkKey = bVarT != null ? bVarT.getBenchmarkKey() : null;
                                    if (benchmarkKey != null && benchmarkKey.length() != 0) {
                                        str = benchmarkKey;
                                    }
                                    j0VarB.L0 = str;
                                    if (bVarT != null && (dM = bVarT.m()) != null) {
                                        dDoubleValue = dM.doubleValue();
                                    }
                                    j0VarB.N0 = dDoubleValue;
                                    jVarDa2.f49703c.j(j0VarB);
                                }
                            }
                        }
                        break;
                    case 2:
                        f.a aVar5 = (f.a) obj;
                        WorkoutStepEditActivity.a aVar6 = WorkoutStepEditActivity.f49573h;
                        aVar5.getClass();
                        if (aVar5.f67585a == -1 && (intent2 = aVar5.f67586b) != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable2 = (Parcelable) intent2.getParcelableExtra("WORKOUT_STEP_WEIGHT", v0.class);
                            } else {
                                Parcelable parcelableExtra2 = intent2.getParcelableExtra("WORKOUT_STEP_WEIGHT");
                                parcelable2 = (v0) (parcelableExtra2 instanceof v0 ? parcelableExtra2 : null);
                            }
                            v0 v0Var = (v0) parcelable2;
                            if (v0Var != null) {
                                workoutStepEditActivity.da().L4(v0Var);
                            }
                            break;
                        }
                        break;
                    case 3:
                        f.a aVar7 = (f.a) obj;
                        WorkoutStepEditActivity.a aVar8 = WorkoutStepEditActivity.f49573h;
                        aVar7.getClass();
                        Intent intent4 = aVar7.f67586b;
                        if (intent4 != null) {
                            int intExtra2 = intent4.getIntExtra("POWER_CURVE_DURATION", -1);
                            int intExtra3 = intent4.getIntExtra("POWER_CURVE_SCALE", -1);
                            if (intExtra2 != -1 && intExtra3 != -1) {
                                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j jVarDa3 = workoutStepEditActivity.da();
                                jVarDa3.f49703c.j(com.garmin.android.apps.connectmobile.workouts.data.model.j0.b(jVarDa3.G4(), 0, null, false, false, null, 0.0d, null, 0.0d, 0.0d, null, intExtra2, intExtra3, 0, 0, null, 0.0d, 0.0d, null, null, null, null, 0.0d, null, null, -3145729, 16383));
                                break;
                            }
                        }
                        break;
                    default:
                        f.a aVar9 = (f.a) obj;
                        WorkoutStepEditActivity.a aVar10 = WorkoutStepEditActivity.f49573h;
                        aVar9.getClass();
                        Intent intent5 = aVar9.f67586b;
                        if (intent5 != null) {
                            int intExtra4 = intent5.getIntExtra("POWER_CURVE_DURATION", -1);
                            int intExtra5 = intent5.getIntExtra("POWER_CURVE_SCALE", -1);
                            if (intExtra4 != -1 && intExtra5 != -1) {
                                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j jVarDa4 = workoutStepEditActivity.da();
                                jVarDa4.f49703c.j(com.garmin.android.apps.connectmobile.workouts.data.model.j0.b(jVarDa4.G4(), 0, null, false, false, null, 0.0d, null, 0.0d, 0.0d, null, 0, 0, intExtra4, intExtra5, null, 0.0d, 0.0d, null, null, null, null, 0.0d, null, null, -25165825, 16383));
                                break;
                            }
                        }
                        break;
                }
            }
        });
        final int i15 = 2;
        this.f49577d = registerForActivityResult(new g.h(), new f.b(this) { // from class: o62.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkoutStepEditActivity f129812b;

            {
                this.f129812b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                Parcelable parcelable;
                Double dM;
                Intent intent2;
                Parcelable parcelable2;
                int i16 = i15;
                String str = null;
                str = null;
                WorkoutStepEditActivity workoutStepEditActivity = this.f129812b;
                switch (i16) {
                    case 0:
                        f.a aVar = (f.a) obj;
                        WorkoutStepEditActivity.a aVar2 = WorkoutStepEditActivity.f49573h;
                        aVar.getClass();
                        if (aVar.f67585a == -1 && (intent = aVar.f67586b) != null) {
                            int intExtra = intent.getIntExtra("reps", -1);
                            boolean booleanExtra = intent.getBooleanExtra("is_reps_plus_enabled", false);
                            if (intExtra > 0) {
                                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j jVarDa = workoutStepEditActivity.da();
                                jVarDa.f49703c.j(com.garmin.android.apps.connectmobile.workouts.data.model.j0.b(jVarDa.G4(), 0, null, false, booleanExtra, null, intExtra, null, 0.0d, 0.0d, null, 0, 0, 0, 0, null, 0.0d, 0.0d, null, null, null, null, 0.0d, null, null, -8449, 16383));
                            }
                            break;
                        }
                        break;
                    case 1:
                        f.a aVar3 = (f.a) obj;
                        WorkoutStepEditActivity.a aVar4 = WorkoutStepEditActivity.f49573h;
                        aVar3.getClass();
                        Intent intent3 = aVar3.f67586b;
                        if (intent3 != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable = (Parcelable) intent3.getParcelableExtra("RESULT_SELECTED_EXERCISE", com.garmin.android.apps.connectmobile.repcounting.model.d.class);
                            } else {
                                Parcelable parcelableExtra = intent3.getParcelableExtra("RESULT_SELECTED_EXERCISE");
                                if (!(parcelableExtra instanceof com.garmin.android.apps.connectmobile.repcounting.model.d)) {
                                    parcelableExtra = null;
                                }
                                parcelable = (com.garmin.android.apps.connectmobile.repcounting.model.d) parcelableExtra;
                            }
                            com.garmin.android.apps.connectmobile.repcounting.model.d dVar = (com.garmin.android.apps.connectmobile.repcounting.model.d) parcelable;
                            if (dVar != null) {
                                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j jVarDa2 = workoutStepEditActivity.da();
                                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0VarB = com.garmin.android.apps.connectmobile.workouts.data.model.j0.b(jVarDa2.G4(), 0, null, false, false, null, 0.0d, null, 0.0d, 0.0d, null, 0, 0, 0, 0, null, 0.0d, 0.0d, null, null, null, null, 0.0d, null, null, -1, 16383);
                                String str2 = j0VarB.H0;
                                String strG = j0VarB.g();
                                if (!zf.b.E(dVar.f41102a, dVar.f41106e, str2, strG)) {
                                    j0VarB.H0 = dVar.f41102a;
                                    j0VarB.I0 = dVar.f41106e;
                                    double d14 = j0VarB.J0;
                                    if (strG == null || strG.length() == 0 || jVarDa2.B4().f49623b.H(str2, strG) || dVar.f41105d || Double.isNaN(d14) || d14 < 0.0d) {
                                        j0VarB.J0 = dVar.f41105d ? -1.0d : 0.0d;
                                    }
                                    double dDoubleValue = Double.NaN;
                                    j0VarB.M0 = Double.NaN;
                                    com.garmin.android.apps.connectmobile.workouts.data.model.b bVarT = gl1.d.t(jVarDa2.B4().f49624c, dVar);
                                    String benchmarkKey = bVarT != null ? bVarT.getBenchmarkKey() : null;
                                    if (benchmarkKey != null && benchmarkKey.length() != 0) {
                                        str = benchmarkKey;
                                    }
                                    j0VarB.L0 = str;
                                    if (bVarT != null && (dM = bVarT.m()) != null) {
                                        dDoubleValue = dM.doubleValue();
                                    }
                                    j0VarB.N0 = dDoubleValue;
                                    jVarDa2.f49703c.j(j0VarB);
                                }
                            }
                        }
                        break;
                    case 2:
                        f.a aVar5 = (f.a) obj;
                        WorkoutStepEditActivity.a aVar6 = WorkoutStepEditActivity.f49573h;
                        aVar5.getClass();
                        if (aVar5.f67585a == -1 && (intent2 = aVar5.f67586b) != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable2 = (Parcelable) intent2.getParcelableExtra("WORKOUT_STEP_WEIGHT", v0.class);
                            } else {
                                Parcelable parcelableExtra2 = intent2.getParcelableExtra("WORKOUT_STEP_WEIGHT");
                                parcelable2 = (v0) (parcelableExtra2 instanceof v0 ? parcelableExtra2 : null);
                            }
                            v0 v0Var = (v0) parcelable2;
                            if (v0Var != null) {
                                workoutStepEditActivity.da().L4(v0Var);
                            }
                            break;
                        }
                        break;
                    case 3:
                        f.a aVar7 = (f.a) obj;
                        WorkoutStepEditActivity.a aVar8 = WorkoutStepEditActivity.f49573h;
                        aVar7.getClass();
                        Intent intent4 = aVar7.f67586b;
                        if (intent4 != null) {
                            int intExtra2 = intent4.getIntExtra("POWER_CURVE_DURATION", -1);
                            int intExtra3 = intent4.getIntExtra("POWER_CURVE_SCALE", -1);
                            if (intExtra2 != -1 && intExtra3 != -1) {
                                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j jVarDa3 = workoutStepEditActivity.da();
                                jVarDa3.f49703c.j(com.garmin.android.apps.connectmobile.workouts.data.model.j0.b(jVarDa3.G4(), 0, null, false, false, null, 0.0d, null, 0.0d, 0.0d, null, intExtra2, intExtra3, 0, 0, null, 0.0d, 0.0d, null, null, null, null, 0.0d, null, null, -3145729, 16383));
                                break;
                            }
                        }
                        break;
                    default:
                        f.a aVar9 = (f.a) obj;
                        WorkoutStepEditActivity.a aVar10 = WorkoutStepEditActivity.f49573h;
                        aVar9.getClass();
                        Intent intent5 = aVar9.f67586b;
                        if (intent5 != null) {
                            int intExtra4 = intent5.getIntExtra("POWER_CURVE_DURATION", -1);
                            int intExtra5 = intent5.getIntExtra("POWER_CURVE_SCALE", -1);
                            if (intExtra4 != -1 && intExtra5 != -1) {
                                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j jVarDa4 = workoutStepEditActivity.da();
                                jVarDa4.f49703c.j(com.garmin.android.apps.connectmobile.workouts.data.model.j0.b(jVarDa4.G4(), 0, null, false, false, null, 0.0d, null, 0.0d, 0.0d, null, 0, 0, intExtra4, intExtra5, null, 0.0d, 0.0d, null, null, null, null, 0.0d, null, null, -25165825, 16383));
                                break;
                            }
                        }
                        break;
                }
            }
        });
        final int i16 = 3;
        this.f49578e = registerForActivityResult(new g.h(), new f.b(this) { // from class: o62.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkoutStepEditActivity f129812b;

            {
                this.f129812b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                Parcelable parcelable;
                Double dM;
                Intent intent2;
                Parcelable parcelable2;
                int i17 = i16;
                String str = null;
                str = null;
                WorkoutStepEditActivity workoutStepEditActivity = this.f129812b;
                switch (i17) {
                    case 0:
                        f.a aVar = (f.a) obj;
                        WorkoutStepEditActivity.a aVar2 = WorkoutStepEditActivity.f49573h;
                        aVar.getClass();
                        if (aVar.f67585a == -1 && (intent = aVar.f67586b) != null) {
                            int intExtra = intent.getIntExtra("reps", -1);
                            boolean booleanExtra = intent.getBooleanExtra("is_reps_plus_enabled", false);
                            if (intExtra > 0) {
                                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j jVarDa = workoutStepEditActivity.da();
                                jVarDa.f49703c.j(com.garmin.android.apps.connectmobile.workouts.data.model.j0.b(jVarDa.G4(), 0, null, false, booleanExtra, null, intExtra, null, 0.0d, 0.0d, null, 0, 0, 0, 0, null, 0.0d, 0.0d, null, null, null, null, 0.0d, null, null, -8449, 16383));
                            }
                            break;
                        }
                        break;
                    case 1:
                        f.a aVar3 = (f.a) obj;
                        WorkoutStepEditActivity.a aVar4 = WorkoutStepEditActivity.f49573h;
                        aVar3.getClass();
                        Intent intent3 = aVar3.f67586b;
                        if (intent3 != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable = (Parcelable) intent3.getParcelableExtra("RESULT_SELECTED_EXERCISE", com.garmin.android.apps.connectmobile.repcounting.model.d.class);
                            } else {
                                Parcelable parcelableExtra = intent3.getParcelableExtra("RESULT_SELECTED_EXERCISE");
                                if (!(parcelableExtra instanceof com.garmin.android.apps.connectmobile.repcounting.model.d)) {
                                    parcelableExtra = null;
                                }
                                parcelable = (com.garmin.android.apps.connectmobile.repcounting.model.d) parcelableExtra;
                            }
                            com.garmin.android.apps.connectmobile.repcounting.model.d dVar = (com.garmin.android.apps.connectmobile.repcounting.model.d) parcelable;
                            if (dVar != null) {
                                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j jVarDa2 = workoutStepEditActivity.da();
                                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0VarB = com.garmin.android.apps.connectmobile.workouts.data.model.j0.b(jVarDa2.G4(), 0, null, false, false, null, 0.0d, null, 0.0d, 0.0d, null, 0, 0, 0, 0, null, 0.0d, 0.0d, null, null, null, null, 0.0d, null, null, -1, 16383);
                                String str2 = j0VarB.H0;
                                String strG = j0VarB.g();
                                if (!zf.b.E(dVar.f41102a, dVar.f41106e, str2, strG)) {
                                    j0VarB.H0 = dVar.f41102a;
                                    j0VarB.I0 = dVar.f41106e;
                                    double d14 = j0VarB.J0;
                                    if (strG == null || strG.length() == 0 || jVarDa2.B4().f49623b.H(str2, strG) || dVar.f41105d || Double.isNaN(d14) || d14 < 0.0d) {
                                        j0VarB.J0 = dVar.f41105d ? -1.0d : 0.0d;
                                    }
                                    double dDoubleValue = Double.NaN;
                                    j0VarB.M0 = Double.NaN;
                                    com.garmin.android.apps.connectmobile.workouts.data.model.b bVarT = gl1.d.t(jVarDa2.B4().f49624c, dVar);
                                    String benchmarkKey = bVarT != null ? bVarT.getBenchmarkKey() : null;
                                    if (benchmarkKey != null && benchmarkKey.length() != 0) {
                                        str = benchmarkKey;
                                    }
                                    j0VarB.L0 = str;
                                    if (bVarT != null && (dM = bVarT.m()) != null) {
                                        dDoubleValue = dM.doubleValue();
                                    }
                                    j0VarB.N0 = dDoubleValue;
                                    jVarDa2.f49703c.j(j0VarB);
                                }
                            }
                        }
                        break;
                    case 2:
                        f.a aVar5 = (f.a) obj;
                        WorkoutStepEditActivity.a aVar6 = WorkoutStepEditActivity.f49573h;
                        aVar5.getClass();
                        if (aVar5.f67585a == -1 && (intent2 = aVar5.f67586b) != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable2 = (Parcelable) intent2.getParcelableExtra("WORKOUT_STEP_WEIGHT", v0.class);
                            } else {
                                Parcelable parcelableExtra2 = intent2.getParcelableExtra("WORKOUT_STEP_WEIGHT");
                                parcelable2 = (v0) (parcelableExtra2 instanceof v0 ? parcelableExtra2 : null);
                            }
                            v0 v0Var = (v0) parcelable2;
                            if (v0Var != null) {
                                workoutStepEditActivity.da().L4(v0Var);
                            }
                            break;
                        }
                        break;
                    case 3:
                        f.a aVar7 = (f.a) obj;
                        WorkoutStepEditActivity.a aVar8 = WorkoutStepEditActivity.f49573h;
                        aVar7.getClass();
                        Intent intent4 = aVar7.f67586b;
                        if (intent4 != null) {
                            int intExtra2 = intent4.getIntExtra("POWER_CURVE_DURATION", -1);
                            int intExtra3 = intent4.getIntExtra("POWER_CURVE_SCALE", -1);
                            if (intExtra2 != -1 && intExtra3 != -1) {
                                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j jVarDa3 = workoutStepEditActivity.da();
                                jVarDa3.f49703c.j(com.garmin.android.apps.connectmobile.workouts.data.model.j0.b(jVarDa3.G4(), 0, null, false, false, null, 0.0d, null, 0.0d, 0.0d, null, intExtra2, intExtra3, 0, 0, null, 0.0d, 0.0d, null, null, null, null, 0.0d, null, null, -3145729, 16383));
                                break;
                            }
                        }
                        break;
                    default:
                        f.a aVar9 = (f.a) obj;
                        WorkoutStepEditActivity.a aVar10 = WorkoutStepEditActivity.f49573h;
                        aVar9.getClass();
                        Intent intent5 = aVar9.f67586b;
                        if (intent5 != null) {
                            int intExtra4 = intent5.getIntExtra("POWER_CURVE_DURATION", -1);
                            int intExtra5 = intent5.getIntExtra("POWER_CURVE_SCALE", -1);
                            if (intExtra4 != -1 && intExtra5 != -1) {
                                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j jVarDa4 = workoutStepEditActivity.da();
                                jVarDa4.f49703c.j(com.garmin.android.apps.connectmobile.workouts.data.model.j0.b(jVarDa4.G4(), 0, null, false, false, null, 0.0d, null, 0.0d, 0.0d, null, 0, 0, intExtra4, intExtra5, null, 0.0d, 0.0d, null, null, null, null, 0.0d, null, null, -25165825, 16383));
                                break;
                            }
                        }
                        break;
                }
            }
        });
        final int i17 = 4;
        this.f49579f = registerForActivityResult(new g.h(), new f.b(this) { // from class: o62.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkoutStepEditActivity f129812b;

            {
                this.f129812b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                Parcelable parcelable;
                Double dM;
                Intent intent2;
                Parcelable parcelable2;
                int i18 = i17;
                String str = null;
                str = null;
                WorkoutStepEditActivity workoutStepEditActivity = this.f129812b;
                switch (i18) {
                    case 0:
                        f.a aVar = (f.a) obj;
                        WorkoutStepEditActivity.a aVar2 = WorkoutStepEditActivity.f49573h;
                        aVar.getClass();
                        if (aVar.f67585a == -1 && (intent = aVar.f67586b) != null) {
                            int intExtra = intent.getIntExtra("reps", -1);
                            boolean booleanExtra = intent.getBooleanExtra("is_reps_plus_enabled", false);
                            if (intExtra > 0) {
                                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j jVarDa = workoutStepEditActivity.da();
                                jVarDa.f49703c.j(com.garmin.android.apps.connectmobile.workouts.data.model.j0.b(jVarDa.G4(), 0, null, false, booleanExtra, null, intExtra, null, 0.0d, 0.0d, null, 0, 0, 0, 0, null, 0.0d, 0.0d, null, null, null, null, 0.0d, null, null, -8449, 16383));
                            }
                            break;
                        }
                        break;
                    case 1:
                        f.a aVar3 = (f.a) obj;
                        WorkoutStepEditActivity.a aVar4 = WorkoutStepEditActivity.f49573h;
                        aVar3.getClass();
                        Intent intent3 = aVar3.f67586b;
                        if (intent3 != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable = (Parcelable) intent3.getParcelableExtra("RESULT_SELECTED_EXERCISE", com.garmin.android.apps.connectmobile.repcounting.model.d.class);
                            } else {
                                Parcelable parcelableExtra = intent3.getParcelableExtra("RESULT_SELECTED_EXERCISE");
                                if (!(parcelableExtra instanceof com.garmin.android.apps.connectmobile.repcounting.model.d)) {
                                    parcelableExtra = null;
                                }
                                parcelable = (com.garmin.android.apps.connectmobile.repcounting.model.d) parcelableExtra;
                            }
                            com.garmin.android.apps.connectmobile.repcounting.model.d dVar = (com.garmin.android.apps.connectmobile.repcounting.model.d) parcelable;
                            if (dVar != null) {
                                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j jVarDa2 = workoutStepEditActivity.da();
                                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0VarB = com.garmin.android.apps.connectmobile.workouts.data.model.j0.b(jVarDa2.G4(), 0, null, false, false, null, 0.0d, null, 0.0d, 0.0d, null, 0, 0, 0, 0, null, 0.0d, 0.0d, null, null, null, null, 0.0d, null, null, -1, 16383);
                                String str2 = j0VarB.H0;
                                String strG = j0VarB.g();
                                if (!zf.b.E(dVar.f41102a, dVar.f41106e, str2, strG)) {
                                    j0VarB.H0 = dVar.f41102a;
                                    j0VarB.I0 = dVar.f41106e;
                                    double d14 = j0VarB.J0;
                                    if (strG == null || strG.length() == 0 || jVarDa2.B4().f49623b.H(str2, strG) || dVar.f41105d || Double.isNaN(d14) || d14 < 0.0d) {
                                        j0VarB.J0 = dVar.f41105d ? -1.0d : 0.0d;
                                    }
                                    double dDoubleValue = Double.NaN;
                                    j0VarB.M0 = Double.NaN;
                                    com.garmin.android.apps.connectmobile.workouts.data.model.b bVarT = gl1.d.t(jVarDa2.B4().f49624c, dVar);
                                    String benchmarkKey = bVarT != null ? bVarT.getBenchmarkKey() : null;
                                    if (benchmarkKey != null && benchmarkKey.length() != 0) {
                                        str = benchmarkKey;
                                    }
                                    j0VarB.L0 = str;
                                    if (bVarT != null && (dM = bVarT.m()) != null) {
                                        dDoubleValue = dM.doubleValue();
                                    }
                                    j0VarB.N0 = dDoubleValue;
                                    jVarDa2.f49703c.j(j0VarB);
                                }
                            }
                        }
                        break;
                    case 2:
                        f.a aVar5 = (f.a) obj;
                        WorkoutStepEditActivity.a aVar6 = WorkoutStepEditActivity.f49573h;
                        aVar5.getClass();
                        if (aVar5.f67585a == -1 && (intent2 = aVar5.f67586b) != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable2 = (Parcelable) intent2.getParcelableExtra("WORKOUT_STEP_WEIGHT", v0.class);
                            } else {
                                Parcelable parcelableExtra2 = intent2.getParcelableExtra("WORKOUT_STEP_WEIGHT");
                                parcelable2 = (v0) (parcelableExtra2 instanceof v0 ? parcelableExtra2 : null);
                            }
                            v0 v0Var = (v0) parcelable2;
                            if (v0Var != null) {
                                workoutStepEditActivity.da().L4(v0Var);
                            }
                            break;
                        }
                        break;
                    case 3:
                        f.a aVar7 = (f.a) obj;
                        WorkoutStepEditActivity.a aVar8 = WorkoutStepEditActivity.f49573h;
                        aVar7.getClass();
                        Intent intent4 = aVar7.f67586b;
                        if (intent4 != null) {
                            int intExtra2 = intent4.getIntExtra("POWER_CURVE_DURATION", -1);
                            int intExtra3 = intent4.getIntExtra("POWER_CURVE_SCALE", -1);
                            if (intExtra2 != -1 && intExtra3 != -1) {
                                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j jVarDa3 = workoutStepEditActivity.da();
                                jVarDa3.f49703c.j(com.garmin.android.apps.connectmobile.workouts.data.model.j0.b(jVarDa3.G4(), 0, null, false, false, null, 0.0d, null, 0.0d, 0.0d, null, intExtra2, intExtra3, 0, 0, null, 0.0d, 0.0d, null, null, null, null, 0.0d, null, null, -3145729, 16383));
                                break;
                            }
                        }
                        break;
                    default:
                        f.a aVar9 = (f.a) obj;
                        WorkoutStepEditActivity.a aVar10 = WorkoutStepEditActivity.f49573h;
                        aVar9.getClass();
                        Intent intent5 = aVar9.f67586b;
                        if (intent5 != null) {
                            int intExtra4 = intent5.getIntExtra("POWER_CURVE_DURATION", -1);
                            int intExtra5 = intent5.getIntExtra("POWER_CURVE_SCALE", -1);
                            if (intExtra4 != -1 && intExtra5 != -1) {
                                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j jVarDa4 = workoutStepEditActivity.da();
                                jVarDa4.f49703c.j(com.garmin.android.apps.connectmobile.workouts.data.model.j0.b(jVarDa4.G4(), 0, null, false, false, null, 0.0d, null, 0.0d, 0.0d, null, 0, 0, intExtra4, intExtra5, null, 0.0d, 0.0d, null, null, null, null, 0.0d, null, null, -25165825, 16383));
                                break;
                            }
                        }
                        break;
                }
            }
        });
        final int i18 = 0;
        this.f49580g = registerForActivityResult(new g.h(), new f.b(this) { // from class: o62.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkoutStepEditActivity f129812b;

            {
                this.f129812b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                Parcelable parcelable;
                Double dM;
                Intent intent2;
                Parcelable parcelable2;
                int i19 = i18;
                String str = null;
                str = null;
                WorkoutStepEditActivity workoutStepEditActivity = this.f129812b;
                switch (i19) {
                    case 0:
                        f.a aVar = (f.a) obj;
                        WorkoutStepEditActivity.a aVar2 = WorkoutStepEditActivity.f49573h;
                        aVar.getClass();
                        if (aVar.f67585a == -1 && (intent = aVar.f67586b) != null) {
                            int intExtra = intent.getIntExtra("reps", -1);
                            boolean booleanExtra = intent.getBooleanExtra("is_reps_plus_enabled", false);
                            if (intExtra > 0) {
                                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j jVarDa = workoutStepEditActivity.da();
                                jVarDa.f49703c.j(com.garmin.android.apps.connectmobile.workouts.data.model.j0.b(jVarDa.G4(), 0, null, false, booleanExtra, null, intExtra, null, 0.0d, 0.0d, null, 0, 0, 0, 0, null, 0.0d, 0.0d, null, null, null, null, 0.0d, null, null, -8449, 16383));
                            }
                            break;
                        }
                        break;
                    case 1:
                        f.a aVar3 = (f.a) obj;
                        WorkoutStepEditActivity.a aVar4 = WorkoutStepEditActivity.f49573h;
                        aVar3.getClass();
                        Intent intent3 = aVar3.f67586b;
                        if (intent3 != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable = (Parcelable) intent3.getParcelableExtra("RESULT_SELECTED_EXERCISE", com.garmin.android.apps.connectmobile.repcounting.model.d.class);
                            } else {
                                Parcelable parcelableExtra = intent3.getParcelableExtra("RESULT_SELECTED_EXERCISE");
                                if (!(parcelableExtra instanceof com.garmin.android.apps.connectmobile.repcounting.model.d)) {
                                    parcelableExtra = null;
                                }
                                parcelable = (com.garmin.android.apps.connectmobile.repcounting.model.d) parcelableExtra;
                            }
                            com.garmin.android.apps.connectmobile.repcounting.model.d dVar = (com.garmin.android.apps.connectmobile.repcounting.model.d) parcelable;
                            if (dVar != null) {
                                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j jVarDa2 = workoutStepEditActivity.da();
                                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0VarB = com.garmin.android.apps.connectmobile.workouts.data.model.j0.b(jVarDa2.G4(), 0, null, false, false, null, 0.0d, null, 0.0d, 0.0d, null, 0, 0, 0, 0, null, 0.0d, 0.0d, null, null, null, null, 0.0d, null, null, -1, 16383);
                                String str2 = j0VarB.H0;
                                String strG = j0VarB.g();
                                if (!zf.b.E(dVar.f41102a, dVar.f41106e, str2, strG)) {
                                    j0VarB.H0 = dVar.f41102a;
                                    j0VarB.I0 = dVar.f41106e;
                                    double d14 = j0VarB.J0;
                                    if (strG == null || strG.length() == 0 || jVarDa2.B4().f49623b.H(str2, strG) || dVar.f41105d || Double.isNaN(d14) || d14 < 0.0d) {
                                        j0VarB.J0 = dVar.f41105d ? -1.0d : 0.0d;
                                    }
                                    double dDoubleValue = Double.NaN;
                                    j0VarB.M0 = Double.NaN;
                                    com.garmin.android.apps.connectmobile.workouts.data.model.b bVarT = gl1.d.t(jVarDa2.B4().f49624c, dVar);
                                    String benchmarkKey = bVarT != null ? bVarT.getBenchmarkKey() : null;
                                    if (benchmarkKey != null && benchmarkKey.length() != 0) {
                                        str = benchmarkKey;
                                    }
                                    j0VarB.L0 = str;
                                    if (bVarT != null && (dM = bVarT.m()) != null) {
                                        dDoubleValue = dM.doubleValue();
                                    }
                                    j0VarB.N0 = dDoubleValue;
                                    jVarDa2.f49703c.j(j0VarB);
                                }
                            }
                        }
                        break;
                    case 2:
                        f.a aVar5 = (f.a) obj;
                        WorkoutStepEditActivity.a aVar6 = WorkoutStepEditActivity.f49573h;
                        aVar5.getClass();
                        if (aVar5.f67585a == -1 && (intent2 = aVar5.f67586b) != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable2 = (Parcelable) intent2.getParcelableExtra("WORKOUT_STEP_WEIGHT", v0.class);
                            } else {
                                Parcelable parcelableExtra2 = intent2.getParcelableExtra("WORKOUT_STEP_WEIGHT");
                                parcelable2 = (v0) (parcelableExtra2 instanceof v0 ? parcelableExtra2 : null);
                            }
                            v0 v0Var = (v0) parcelable2;
                            if (v0Var != null) {
                                workoutStepEditActivity.da().L4(v0Var);
                            }
                            break;
                        }
                        break;
                    case 3:
                        f.a aVar7 = (f.a) obj;
                        WorkoutStepEditActivity.a aVar8 = WorkoutStepEditActivity.f49573h;
                        aVar7.getClass();
                        Intent intent4 = aVar7.f67586b;
                        if (intent4 != null) {
                            int intExtra2 = intent4.getIntExtra("POWER_CURVE_DURATION", -1);
                            int intExtra3 = intent4.getIntExtra("POWER_CURVE_SCALE", -1);
                            if (intExtra2 != -1 && intExtra3 != -1) {
                                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j jVarDa3 = workoutStepEditActivity.da();
                                jVarDa3.f49703c.j(com.garmin.android.apps.connectmobile.workouts.data.model.j0.b(jVarDa3.G4(), 0, null, false, false, null, 0.0d, null, 0.0d, 0.0d, null, intExtra2, intExtra3, 0, 0, null, 0.0d, 0.0d, null, null, null, null, 0.0d, null, null, -3145729, 16383));
                                break;
                            }
                        }
                        break;
                    default:
                        f.a aVar9 = (f.a) obj;
                        WorkoutStepEditActivity.a aVar10 = WorkoutStepEditActivity.f49573h;
                        aVar9.getClass();
                        Intent intent5 = aVar9.f67586b;
                        if (intent5 != null) {
                            int intExtra4 = intent5.getIntExtra("POWER_CURVE_DURATION", -1);
                            int intExtra5 = intent5.getIntExtra("POWER_CURVE_SCALE", -1);
                            if (intExtra4 != -1 && intExtra5 != -1) {
                                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j jVarDa4 = workoutStepEditActivity.da();
                                jVarDa4.f49703c.j(com.garmin.android.apps.connectmobile.workouts.data.model.j0.b(jVarDa4.G4(), 0, null, false, false, null, 0.0d, null, 0.0d, 0.0d, null, 0, 0, intExtra4, intExtra5, null, 0.0d, 0.0d, null, null, null, null, 0.0d, null, null, -25165825, 16383));
                                break;
                            }
                        }
                        break;
                }
            }
        });
    }

    public final w52.e ca() {
        return (w52.e) this.f49575b.getValue();
    }

    public final com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j da() {
        return (com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j) this.f49574a.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    @SuppressLint({"CommitTransaction"})
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_composable_container);
        com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j jVarDa = da();
        String str = ca().f182503c;
        b bVar = new b(ca());
        c cVar = new c(ca());
        z zVar = new z(ca()) { // from class: com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.WorkoutStepEditActivity.d
            @Override // p005kotlin.jvm.internal.z, k23.m
            public final Object get() {
                return ((w52.e) this.receiver).f182502b;
            }

            @Override // p005kotlin.jvm.internal.z, k23.i
            public final void set(Object obj) {
                ((w52.e) this.receiver).f182502b = (File) obj;
            }
        };
        str.getClass();
        jVarDa.f49709i = new com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j.a(str, bVar, cVar, zVar);
        T tD = da().f49704d.d();
        tD.getClass();
        f0.k(getOnBackPressedDispatcher(), null, new o50.a(1, this, (j0) tD), 1);
        initActionBar(true, "");
        da().f49706f.f(this, new g(new nw0.f(this, 7)));
        ge1.b.T(f0.w(this), null, null, new f(null), 3);
        ((ComposeView) findViewById(R.id.composable_container)).setContent(new z3.e(534772779, true, new o62.z(this, 1)));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.getClass();
        menuInflater.inflate(R.menu.workout_step_edit, menu);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            getOnBackPressedDispatcher().d();
            return true;
        }
        if (itemId != R.id.workout_step_delete) {
            return super.onOptionsItemSelected(menuItem);
        }
        T tD = da().f49704d.d();
        tD.getClass();
        m52.d dVar = ((j0) tD).f48217c;
        x52.e.f189070c.getClass();
        String string = getString(R.string.workout_delete_step, getString(x52.e.a.a(dVar).a(da().f49701a)));
        string.getClass();
        v52.a.a(this, null, string, new a0(this, 1));
        return true;
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        menu.getClass();
        if (da().f49701a == m52.k.f116758r) {
            com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b bVar = da().f49702b;
            bVar.getClass();
            if (((com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b.c) bVar).f49625a) {
                menu.removeItem(R.id.workout_step_delete);
            }
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/WorkoutStepEditActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_IS_IN_TIMED_REPEAT", "EXTRA_CSS_VALUE", "EXTRA_POOL_LENGTH_UNIT_UNSPECIFIED_POOL_SIZE", "EXTRA_SWIM_HAS_SEND_OFF_TIME_STEP", "EXTRA_SWIM_HAS_TARGET_PACE_STEP", "", "RESULT_DELETE", "I", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
