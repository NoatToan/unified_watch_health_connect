package com.garmin.android.apps.connectmobile.workouts.presentation.details;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.t1;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w0;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c22.j0;
import c62.k2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.q1;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutScheduleDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.h0;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.MultiSportsDetailsActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.MultiSportCreateEditActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.schedule.ScheduleWorkoutTypeActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.w3;
import lc.u0;
import o53.b0;
import o53.f0;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p005kotlin.jvm.internal.x0;
import p13.c0;
import r22.m0;
import r22.p0;
import r22.q0;
import r53.o2;
import w52.v0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/MultiSportsDetailsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lw52/v0;", "<init>", "()V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MultiSportsDetailsActivity extends com.garmin.android.apps.connectmobile.c implements v0 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final a f48440z = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f48441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GCMComplexTwoLineButton f48442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView f48443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ComposeView f48444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ComposeView f48445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ComposeView f48446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ComposeView f48447g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p0 f48448h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MenuItem f48449i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MenuItem f48450j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public MenuItem f48451k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public MenuItem f48452l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public MenuItem f48453m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public MenuItem f48454n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public MenuItem f48455o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MenuItem f48456p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public MenuItem f48457q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public MenuItem f48458r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o52.e f48459t = (o52.e) KoinJavaComponent.get$default(o52.e.class, null, null, 6, null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final w1 f48460v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final w1 f48461w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final f.c<Intent> f48462x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final f.c<Intent> f48463y;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48464a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f48464a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.MultiSportsDetailsActivity$onCreate$1", f = "MultiSportsDetailsActivity.kt", l = {142}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48465a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ MultiSportsDetailsActivity f48467a;

            public a(MultiSportsDetailsActivity multiSportsDetailsActivity) {
                this.f48467a = multiSportsDetailsActivity;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                v52.c cVar = (v52.c) obj;
                boolean z14 = cVar instanceof v52.c.b;
                MultiSportsDetailsActivity multiSportsDetailsActivity = this.f48467a;
                if (z14) {
                    multiSportsDetailsActivity.showProgressOverlay();
                } else if (cVar instanceof v52.c.C3278c) {
                    multiSportsDetailsActivity.hideProgressOverlay();
                    c62.o oVar = (c62.o) ((v52.c.C3278c) cVar).f175760a;
                    multiSportsDetailsActivity.ga(oVar.f24821a, oVar.f24822b);
                    multiSportsDetailsActivity.ha(true);
                } else {
                    if (!(cVar instanceof v52.c.a)) {
                        u0.r();
                        return null;
                    }
                    multiSportsDetailsActivity.hideProgressOverlay();
                    multiSportsDetailsActivity.displayFailedMessage();
                }
                return Unit.INSTANCE;
            }
        }

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return MultiSportsDetailsActivity.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f48465a;
            if (i14 == 0) {
                o13.r.b(obj);
                a aVar2 = MultiSportsDetailsActivity.f48440z;
                MultiSportsDetailsActivity multiSportsDetailsActivity = MultiSportsDetailsActivity.this;
                o2<v52.c<c62.o>> o2Var = multiSportsDetailsActivity.ea().M0;
                a aVar3 = new a(multiSportsDetailsActivity);
                this.f48465a = 1;
                if (o2Var.collect(aVar3, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            o2.c.f();
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.MultiSportsDetailsActivity$onCreate$2", f = "MultiSportsDetailsActivity.kt", l = {162}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48468a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ MultiSportsDetailsActivity f48470a;

            public a(MultiSportsDetailsActivity multiSportsDetailsActivity) {
                this.f48470a = multiSportsDetailsActivity;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                v52.c cVar = (v52.c) obj;
                boolean z14 = cVar instanceof v52.c.b;
                MultiSportsDetailsActivity multiSportsDetailsActivity = this.f48470a;
                if (z14) {
                    multiSportsDetailsActivity.showProgressOverlay();
                } else if (cVar instanceof v52.c.C3278c) {
                    multiSportsDetailsActivity.hideProgressOverlay();
                    com.garmin.android.apps.connectmobile.workouts.presentation.details.d dVar2 = (com.garmin.android.apps.connectmobile.workouts.presentation.details.d) ((v52.c.C3278c) cVar).f175760a;
                    if (dVar2 instanceof com.garmin.android.apps.connectmobile.workouts.presentation.details.d.p) {
                        View viewFindViewById = multiSportsDetailsActivity.findViewById(R.id.main_view);
                        q0.b bVar = q0.f149800b;
                        viewFindViewById.getClass();
                        bVar.getClass();
                        q0.b.a(viewFindViewById, R.string.msg_workouts_show_on_sync, 0).show();
                    } else if (dVar2 instanceof com.garmin.android.apps.connectmobile.workouts.presentation.details.d.q) {
                        com.garmin.android.apps.connectmobile.workouts.presentation.details.d.q qVar = (com.garmin.android.apps.connectmobile.workouts.presentation.details.d.q) dVar2;
                        multiSportsDetailsActivity.f48459t.B(multiSportsDetailsActivity, qVar.f48538a, qVar.f48539b);
                    } else if (dVar2 instanceof com.garmin.android.apps.connectmobile.workouts.presentation.details.d.o) {
                        f12.l.f68084a.getClass();
                        f12.l.a.a().T3(true);
                        Toast.makeText(multiSportsDetailsActivity, R.string.workout_has_been_scheduled, 1).show();
                    } else if (dVar2 instanceof com.garmin.android.apps.connectmobile.workouts.presentation.details.d.f) {
                        if (multiSportsDetailsActivity.ea().f48605r != null) {
                            com.garmin.android.apps.connectmobile.workouts.presentation.details.d.f fVar = (com.garmin.android.apps.connectmobile.workouts.presentation.details.d.f) dVar2;
                            long j8 = fVar.f48523b;
                            ArrayList<? extends Parcelable> arrayList = fVar.f48522a.f48038a;
                            arrayList.getClass();
                            if (arrayList.size() == 0) {
                                WorkoutDetailsDTO workoutDetailsDTO = multiSportsDetailsActivity.ea().f48605r;
                                if (workoutDetailsDTO != null) {
                                    long j14 = workoutDetailsDTO.f48040a;
                                    c62.p pVarEa = multiSportsDetailsActivity.ea();
                                    ge1.b.T(v1.a(pVarEa), null, null, new s(pVarEa, j0.b(new DateTime(j8), "\"yyyy-MM-dd\"", null), j14, null), 3);
                                }
                            } else {
                                WorkoutDetailsDTO workoutDetailsDTO2 = multiSportsDetailsActivity.ea().f48605r;
                                int i14 = ScheduleWorkoutTypeActivity.f49542g;
                                Intent intent = new Intent(multiSportsDetailsActivity, (Class<?>) ScheduleWorkoutTypeActivity.class);
                                intent.putExtra("GCM_workout_dto", workoutDetailsDTO2);
                                intent.putExtra("extra.date.time", j8);
                                intent.putParcelableArrayListExtra("GCM_tp_active_plans", arrayList);
                                multiSportsDetailsActivity.startActivityForResult(intent, 9478);
                            }
                        } else {
                            multiSportsDetailsActivity.displayFailedMessage();
                        }
                    } else if (dVar2 instanceof com.garmin.android.apps.connectmobile.workouts.presentation.details.d.v) {
                        if (((com.garmin.android.apps.connectmobile.workouts.presentation.details.d.v) dVar2).f48550a) {
                            multiSportsDetailsActivity.setResult(-1);
                            f12.l.f68084a.getClass();
                            f12.l.a.a().T3(true);
                            multiSportsDetailsActivity.setTitle(multiSportsDetailsActivity.ea().f48611z);
                        } else {
                            Toast.makeText(multiSportsDetailsActivity, R.string.workout_update_failed, 0).show();
                        }
                    } else if (dVar2 instanceof com.garmin.android.apps.connectmobile.workouts.presentation.details.d.C0946d) {
                        f12.l.f68084a.getClass();
                        f12.l.a.a().T3(true);
                        multiSportsDetailsActivity.setResult(-1);
                        multiSportsDetailsActivity.finish();
                    } else if (dVar2 instanceof com.garmin.android.apps.connectmobile.workouts.presentation.details.d.b) {
                        WorkoutDetailsDTO workoutDetailsDTO3 = ((com.garmin.android.apps.connectmobile.workouts.presentation.details.d.b) dVar2).f48519a;
                        if (workoutDetailsDTO3 == null) {
                            Toast.makeText(multiSportsDetailsActivity, R.string.workout_create_failed, 1).show();
                        } else {
                            Intent intent2 = new Intent(multiSportsDetailsActivity, (Class<?>) MultiSportsDetailsActivity.class);
                            intent2.putExtra("GCM_workout_id", workoutDetailsDTO3.f48040a);
                            multiSportsDetailsActivity.startActivity(intent2);
                            multiSportsDetailsActivity.setResult(-1);
                            multiSportsDetailsActivity.finish();
                        }
                    } else if (dVar2 instanceof com.garmin.android.apps.connectmobile.workouts.presentation.details.d.l) {
                        f12.l.f68084a.getClass();
                        f12.l.a.a().T3(true);
                        multiSportsDetailsActivity.setResult(-1);
                        multiSportsDetailsActivity.finish();
                    } else if (dVar2 instanceof com.garmin.android.apps.connectmobile.workouts.presentation.details.d.c) {
                        boolean z15 = ((com.garmin.android.apps.connectmobile.workouts.presentation.details.d.c) dVar2).f48520a;
                        p0 p0Var = multiSportsDetailsActivity.f48448h;
                        if (z15) {
                            if (p0Var != null) {
                                p0Var.y6(R.string.save_msn_workout_success_title, R.string.save_msn_workout_success_msg);
                            }
                            multiSportsDetailsActivity.setResult(-1);
                            multiSportsDetailsActivity.ga(multiSportsDetailsActivity.ea().f48605r, multiSportsDetailsActivity.ea().K0);
                            long longExtra = multiSportsDetailsActivity.getIntent().getLongExtra("GCM_workout_queue_download_to_device", -1L);
                            if (longExtra != -1) {
                                t1.a(multiSportsDetailsActivity.ea().c5(longExtra, !multiSportsDetailsActivity.ea().X4(multiSportsDetailsActivity.ea().f48605r).isEmpty()), new a12.a(new a02.a(longExtra, 6), 28)).f(multiSportsDetailsActivity, new e(new c62.i(multiSportsDetailsActivity)));
                            }
                        } else if (p0Var != null) {
                            p0Var.w6();
                        }
                    } else if (!(dVar2 instanceof com.garmin.android.apps.connectmobile.workouts.presentation.details.d.h) && ((dVar2 instanceof com.garmin.android.apps.connectmobile.workouts.presentation.details.d.r) || (dVar2 instanceof com.garmin.android.apps.connectmobile.workouts.presentation.details.d.x) || (dVar2 instanceof com.garmin.android.apps.connectmobile.workouts.presentation.details.d.s) || (dVar2 instanceof com.garmin.android.apps.connectmobile.workouts.presentation.details.d.t) || (dVar2 instanceof com.garmin.android.apps.connectmobile.workouts.presentation.details.d.a) || (dVar2 instanceof com.garmin.android.apps.connectmobile.workouts.presentation.details.d.u))) {
                        multiSportsDetailsActivity.displayFailedMessage();
                    }
                } else {
                    if (!(cVar instanceof v52.c.a)) {
                        u0.r();
                        return null;
                    }
                    multiSportsDetailsActivity.hideProgressOverlay();
                    multiSportsDetailsActivity.displayFailedMessage();
                }
                return Unit.INSTANCE;
            }
        }

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return MultiSportsDetailsActivity.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f48468a;
            if (i14 == 0) {
                o13.r.b(obj);
                a aVar2 = MultiSportsDetailsActivity.f48440z;
                MultiSportsDetailsActivity multiSportsDetailsActivity = MultiSportsDetailsActivity.this;
                r53.i<v52.c<com.garmin.android.apps.connectmobile.workouts.presentation.details.d>> iVar = multiSportsDetailsActivity.ea().H0;
                a aVar3 = new a(multiSportsDetailsActivity);
                this.f48468a = 1;
                if (iVar.collect(aVar3, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f48471a;

        public e(e23.l lVar) {
            lVar.getClass();
            this.f48471a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f48471a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f48471a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Integer.valueOf(((h0) t7).getSegmentOrder()), Integer.valueOf(((h0) t14).getSegmentOrder()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class g extends p005kotlin.jvm.internal.q implements e23.q<String, String, e23.a<? extends Unit>, Unit> {
        public g(Object obj) {
            super(3, obj, MultiSportsDetailsActivity.class, "tryDownloadAudioNote", "tryDownloadAudioNote(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", 0);
        }

        @Override // e23.q
        public final Unit invoke(String str, String str2, e23.a<? extends Unit> aVar) {
            String str3 = str;
            String str4 = str2;
            e23.a<? extends Unit> aVar2 = aVar;
            str3.getClass();
            str4.getClass();
            aVar2.getClass();
            MultiSportsDetailsActivity multiSportsDetailsActivity = (MultiSportsDetailsActivity) this.receiver;
            a aVar3 = MultiSportsDetailsActivity.f48440z;
            multiSportsDetailsActivity.getClass();
            ge1.b.T(f0.w(multiSportsDetailsActivity), null, null, new c62.n(multiSportsDetailsActivity, str3, str4, aVar2, null), 3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f48472a;

        public h(b.g gVar) {
            this.f48472a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f48472a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f48473a;

        public i(b.g gVar) {
            this.f48473a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f48473a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class j implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f48474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f48475b;

        public j(e23.a aVar, b.g gVar) {
            this.f48474a = aVar;
            this.f48475b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f48474a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f48475b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class k implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f48476a;

        public k(b.g gVar) {
            this.f48476a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f48476a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class l implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f48477a;

        public l(b.g gVar) {
            this.f48477a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f48477a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class m implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f48478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f48479b;

        public m(e23.a aVar, b.g gVar) {
            this.f48478a = aVar;
            this.f48479b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f48478a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f48479b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public MultiSportsDetailsActivity() {
        h hVar = new h(this);
        t0 t0Var = s0.f105811a;
        this.f48460v = new w1(t0Var.b(c62.p.class), new i(this), hVar, new j(null, this));
        this.f48461w = new w1(t0Var.b(w52.e.class), new l(this), new k(this), new m(null, this));
        final int i14 = 0;
        this.f48462x = registerForActivityResult(new g.h(), new f.b(this) { // from class: c62.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MultiSportsDetailsActivity f24740b;

            {
                this.f24740b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Bundle extras;
                int i15 = i14;
                MultiSportsDetailsActivity multiSportsDetailsActivity = this.f24740b;
                f.a aVar = (f.a) obj;
                switch (i15) {
                    case 0:
                        MultiSportsDetailsActivity.a aVar2 = MultiSportsDetailsActivity.f48440z;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            f12.l.f68084a.getClass();
                            f12.l.a.a().T3(true);
                            multiSportsDetailsActivity.setResult(-1);
                            multiSportsDetailsActivity.finish();
                        }
                        break;
                    default:
                        MultiSportsDetailsActivity.a aVar3 = MultiSportsDetailsActivity.f48440z;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            Intent intent = aVar.f67586b;
                            multiSportsDetailsActivity.fa((intent == null || (extras = intent.getExtras()) == null) ? null : Integer.valueOf(extras.getInt("extra_workout_segment_order")));
                        }
                        break;
                }
            }
        });
        final int i15 = 1;
        this.f48463y = registerForActivityResult(new g.h(), new f.b(this) { // from class: c62.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MultiSportsDetailsActivity f24740b;

            {
                this.f24740b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Bundle extras;
                int i16 = i15;
                MultiSportsDetailsActivity multiSportsDetailsActivity = this.f24740b;
                f.a aVar = (f.a) obj;
                switch (i16) {
                    case 0:
                        MultiSportsDetailsActivity.a aVar2 = MultiSportsDetailsActivity.f48440z;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            f12.l.f68084a.getClass();
                            f12.l.a.a().T3(true);
                            multiSportsDetailsActivity.setResult(-1);
                            multiSportsDetailsActivity.finish();
                        }
                        break;
                    default:
                        MultiSportsDetailsActivity.a aVar3 = MultiSportsDetailsActivity.f48440z;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            Intent intent = aVar.f67586b;
                            multiSportsDetailsActivity.fa((intent == null || (extras = intent.getExtras()) == null) ? null : Integer.valueOf(extras.getInt("extra_workout_segment_order")));
                        }
                        break;
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void ca(MultiSportsDetailsActivity multiSportsDetailsActivity, g3 g3Var) {
        multiSportsDetailsActivity.getClass();
        int i14 = b.f48464a[g3Var.f35300a.ordinal()];
        if (i14 == 1) {
            multiSportsDetailsActivity.showProgressOverlay();
            return;
        }
        if (i14 != 2) {
            if (i14 != 3) {
                u0.r();
                return;
            }
            multiSportsDetailsActivity.hideProgressOverlay();
            String string = multiSportsDetailsActivity.getString(R.string.txt_error_occurred);
            string.getClass();
            Toast toastMakeText = Toast.makeText(multiSportsDetailsActivity, string, 1);
            toastMakeText.setGravity(49, 0, 150);
            toastMakeText.show();
            String str = g3Var.f35302c;
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "MultiSportsDetailsActivity", str);
            return;
        }
        multiSportsDetailsActivity.hideProgressOverlay();
        o13.p pVar = (o13.p) g3Var.f35301b;
        if (pVar == null) {
            return;
        }
        long jLongValue = ((Number) pVar.f128594a).longValue();
        String str2 = (String) pVar.f128595b;
        m52.k kVarR4 = multiSportsDetailsActivity.ea().R4(multiSportsDetailsActivity.ea().f48605r, Boolean.TRUE);
        if (kVarR4 == null) {
            return;
        }
        String strI = ((rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null)).i(jLongValue);
        String string2 = multiSportsDetailsActivity.getString(k2.b(kVarR4));
        string2.getClass();
        m0 m0VarB = m0.a.b(m0.f149759e, string2, multiSportsDetailsActivity.getString(R.string.workout_send_to_device_complete_message, strI), 256);
        f0.w(multiSportsDetailsActivity).b(new g22.g(new bb0.d(22, m0VarB, multiSportsDetailsActivity), null));
        f0.w(multiSportsDetailsActivity).b(new g22.h(1500L, new ak0.m(m0VarB, 21, str2, multiSportsDetailsActivity), null));
    }

    public static void ja(MenuItem menuItem, boolean z14) {
        if (menuItem != null) {
            menuItem.setVisible(z14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:37:0x00df A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object da(String str, String str2, v13.c cVar) {
        c62.h hVar;
        String str3;
        boolean z14;
        Object objDa;
        if (cVar instanceof c62.h) {
            hVar = (c62.h) cVar;
            int i14 = hVar.f24750f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f24750f = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new c62.h(this, cVar);
            }
        } else {
            hVar = new c62.h(this, cVar);
        }
        Object objX4 = hVar.f24748d;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f24750f;
        if (i15 == 0) {
            o13.r.b(objX4);
            showProgressOverlay();
            w52.e eVar = (w52.e) this.f48461w.getValue();
            hVar.f24745a = str;
            hVar.f24746b = str2;
            hVar.f24750f = 1;
            objX4 = eVar.x4(str, str2, hVar);
            if (objX4 != obj) {
            }
            return obj;
        }
        if (i15 == 1) {
            str2 = hVar.f24746b;
            str = hVar.f24745a;
            o13.r.b(objX4);
        } else {
            if (i15 != 2) {
                if (i15 == 3) {
                    o13.r.b(objX4);
                    return objX4;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z14 = hVar.f24747c;
            str2 = hVar.f24746b;
            str3 = hVar.f24745a;
            o13.r.b(objX4);
        }
        if (!((Boolean) objX4).booleanValue()) {
            return Boolean.FALSE;
        }
        hVar.f24745a = null;
        hVar.f24746b = null;
        hVar.f24747c = z14;
        hVar.f24750f = 3;
        objDa = da(str3, str2, hVar);
        if (objDa != obj) {
            return obj;
        }
        return objDa;
        boolean zBooleanValue = ((Boolean) objX4).booleanValue();
        hideProgressOverlay();
        if (zBooleanValue) {
            return Boolean.TRUE;
        }
        hVar.f24745a = str;
        hVar.f24746b = str2;
        hVar.f24747c = zBooleanValue;
        hVar.f24750f = 2;
        t13.i iVar = new t13.i(u13.f.b(hVar));
        new androidx.appcompat.app.e.a(this).setTitle(R.string.audio_note_failed_to_download_alert_title).setMessage(R.string.audio_note_failed_to_download_alert_message).setPositiveButton(R.string.common_retry, new c62.k(iVar)).setNegativeButton(R.string.common_cancel, new c62.l(iVar)).setOnCancelListener(new c62.m(iVar)).show();
        Object objA = iVar.a();
        if (objA != obj) {
            str3 = str;
            z14 = zBooleanValue;
            objX4 = objA;
            if (!((Boolean) objX4).booleanValue()) {
                return Boolean.FALSE;
            }
            hVar.f24745a = null;
            hVar.f24746b = null;
            hVar.f24747c = z14;
            hVar.f24750f = 3;
            objDa = da(str3, str2, hVar);
            if (objDa != obj) {
                return objDa;
            }
        }
        return obj;
    }

    public final c62.p ea() {
        return (c62.p) this.f48460v.getValue();
    }

    public final void fa(Integer num) {
        if (ea().f48605r == null) {
            return;
        }
        long longExtra = getIntent().getLongExtra("GCM_workout_queue_download_to_device", -1L);
        MultiSportCreateEditActivity.a aVar = MultiSportCreateEditActivity.f49083f;
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        WorkoutDetailsDTO workoutDetailsDTO = ea().f48605r;
        long j8 = workoutDetailsDTO != null ? workoutDetailsDTO.f48040a : 0L;
        WorkoutDetailsDTO workoutDetailsDTO2 = ea().f48605r;
        aVar.getClass();
        Intent intent = new Intent(applicationContext, (Class<?>) MultiSportCreateEditActivity.class);
        intent.putExtra("GCM_workout_id", j8);
        intent.putExtra("GCM_workout_queue_download_to_device", longExtra);
        intent.putExtra("extra_workout_segment_order", num);
        intent.putExtra("extra_workout_dto", workoutDetailsDTO2);
        this.f48462x.a(intent, null);
    }

    /* JADX WARN: Code duplicated, block: B:149:0x021b  */
    /* JADX WARN: Code duplicated, block: B:191:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:70:0x010b  */
    /* JADX WARN: Code duplicated, block: B:72:0x010f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0115  */
    /* JADX WARN: Code duplicated, block: B:76:0x0118  */
    /* JADX WARN: Code duplicated, block: B:79:0x011d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x011f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0126  */
    /* JADX WARN: Code duplicated, block: B:83:0x0138  */
    /* JADX WARN: Code duplicated, block: B:85:0x013c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0140 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x0142  */
    public final void ga(WorkoutDetailsDTO workoutDetailsDTO, Map<Integer, com.garmin.android.apps.connectmobile.repcounting.model.c> map) {
        ArrayList arrayList;
        m52.b bVar;
        ComposeView composeView;
        ComposeView composeView2;
        Integer num;
        ComposeView composeView3;
        ComposeView composeView4;
        List<h0> list;
        long jLongValue;
        List<h0> list2;
        if (workoutDetailsDTO != null && (list2 = workoutDetailsDTO.Q0) != null && list2.size() > 1) {
            c0.u(list2, new f());
        }
        RecyclerView recyclerView = this.f48443c;
        if (recyclerView == null) {
            p005kotlin.jvm.internal.s.m("recyclerView");
            throw null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f fVar = new com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.f(this, null, null, null, new c62.e(this, workoutDetailsDTO, 0), 14, null);
        if (workoutDetailsDTO != null) {
            fVar.r(workoutDetailsDTO, map);
        }
        RecyclerView recyclerView2 = this.f48443c;
        if (recyclerView2 == null) {
            p005kotlin.jvm.internal.s.m("recyclerView");
            throw null;
        }
        recyclerView2.setAdapter(fVar);
        if (ea().F) {
            Integer num2 = workoutDetailsDTO != null ? workoutDetailsDTO.f48049j : null;
            ComposeView composeView5 = this.f48444d;
            if (num2 != null) {
                if (composeView5 == null) {
                    p005kotlin.jvm.internal.s.m("estimatesView");
                    throw null;
                }
                composeView5.setVisibility(0);
                ComposeView composeView6 = this.f48444d;
                if (composeView6 == null) {
                    p005kotlin.jvm.internal.s.m("estimatesView");
                    throw null;
                }
                composeView6.setContent(new z3.e(-1167090439, true, new c62.e(this, workoutDetailsDTO, 1)));
            } else {
                if (composeView5 == null) {
                    p005kotlin.jvm.internal.s.m("estimatesView");
                    throw null;
                }
                composeView5.setVisibility(8);
            }
        } else {
            WorkoutDetailsDTO workoutDetailsDTO2 = ea().f48605r;
            if (workoutDetailsDTO2 == null || (list = workoutDetailsDTO2.Q0) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((h0) obj).f48193h == m52.k.f116758r) {
                        arrayList.add(obj);
                    }
                }
            }
            if (arrayList == null || arrayList.isEmpty() || arrayList.isEmpty()) {
                if (workoutDetailsDTO != null) {
                    bVar = workoutDetailsDTO.f48053m;
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    composeView = this.f48444d;
                    if (composeView != null) {
                        p005kotlin.jvm.internal.s.m("estimatesView");
                        throw null;
                    }
                    composeView.setVisibility(0);
                    composeView2 = this.f48444d;
                    if (composeView2 != null) {
                        p005kotlin.jvm.internal.s.m("estimatesView");
                        throw null;
                    }
                    composeView2.setContent(new z3.e(1974059216, true, new c62.e(this, workoutDetailsDTO, 2)));
                } else {
                    if (workoutDetailsDTO != null) {
                        num = workoutDetailsDTO.f48049j;
                    } else {
                        num = null;
                    }
                    composeView3 = this.f48444d;
                    if (num != null) {
                        if (composeView3 != null) {
                            p005kotlin.jvm.internal.s.m("estimatesView");
                            throw null;
                        }
                        composeView3.setVisibility(0);
                        composeView4 = this.f48444d;
                        if (composeView4 != null) {
                            p005kotlin.jvm.internal.s.m("estimatesView");
                            throw null;
                        }
                        composeView4.setContent(new z3.e(1011528071, true, new c62.e(this, workoutDetailsDTO, 3)));
                    } else {
                        if (composeView3 != null) {
                            p005kotlin.jvm.internal.s.m("estimatesView");
                            throw null;
                        }
                        composeView3.setVisibility(8);
                    }
                }
            } else {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        h0 h0Var = (h0) it.next();
                        if (h0Var.getEstimateType() == m52.b.TIME_ESTIMATED || h0Var.getEstimateType() == m52.b.DISTANCE_ESTIMATED) {
                        }
                    } else {
                        if (workoutDetailsDTO != null) {
                            bVar = workoutDetailsDTO.f48053m;
                        } else {
                            bVar = null;
                        }
                        if (bVar != null) {
                            composeView = this.f48444d;
                            if (composeView != null) {
                                p005kotlin.jvm.internal.s.m("estimatesView");
                                throw null;
                            }
                            composeView.setVisibility(0);
                            composeView2 = this.f48444d;
                            if (composeView2 != null) {
                                p005kotlin.jvm.internal.s.m("estimatesView");
                                throw null;
                            }
                            composeView2.setContent(new z3.e(1974059216, true, new c62.e(this, workoutDetailsDTO, 2)));
                        }
                    }
                    if (workoutDetailsDTO != null) {
                        num = workoutDetailsDTO.f48049j;
                    } else {
                        num = null;
                    }
                    composeView3 = this.f48444d;
                    if (num != null) {
                        if (composeView3 != null) {
                            p005kotlin.jvm.internal.s.m("estimatesView");
                            throw null;
                        }
                        composeView3.setVisibility(0);
                        composeView4 = this.f48444d;
                        if (composeView4 != null) {
                            p005kotlin.jvm.internal.s.m("estimatesView");
                            throw null;
                        }
                        composeView4.setContent(new z3.e(1011528071, true, new c62.e(this, workoutDetailsDTO, 3)));
                    } else {
                        if (composeView3 != null) {
                            p005kotlin.jvm.internal.s.m("estimatesView");
                            throw null;
                        }
                        composeView3.setVisibility(8);
                    }
                }
            }
        }
        ComposeView composeView7 = this.f48445e;
        if (composeView7 == null) {
            p005kotlin.jvm.internal.s.m("noteView");
            throw null;
        }
        composeView7.setContent(new z3.e(701472431, true, new c62.f(0, workoutDetailsDTO)));
        String str = workoutDetailsDTO != null ? workoutDetailsDTO.T : null;
        if (str == null || str.length() == 0) {
            ComposeView composeView8 = this.f48446f;
            if (composeView8 == null) {
                p005kotlin.jvm.internal.s.m("audioNotesView");
                throw null;
            }
            composeView8.setVisibility(8);
        } else {
            ComposeView composeView9 = this.f48446f;
            if (composeView9 == null) {
                p005kotlin.jvm.internal.s.m("audioNotesView");
                throw null;
            }
            composeView9.setContent(new z3.e(2065036148, true, new c62.e(workoutDetailsDTO, this, 4)));
        }
        setTitle(workoutDetailsDTO != null ? workoutDetailsDTO.f48041b : null);
        WorkoutDetailsDTO workoutDetailsDTO3 = ea().f48605r;
        if (workoutDetailsDTO3 == null || !workoutDetailsDTO3.J0 || ea().F) {
            GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f48442b;
            if (gCMComplexTwoLineButton == null) {
                p005kotlin.jvm.internal.s.m("transitions");
                throw null;
            }
            gCMComplexTwoLineButton.setVisibility(8);
        } else {
            GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.f48442b;
            if (gCMComplexTwoLineButton2 == null) {
                p005kotlin.jvm.internal.s.m("transitions");
                throw null;
            }
            gCMComplexTwoLineButton2.setVisibility(0);
            GCMComplexTwoLineButton gCMComplexTwoLineButton3 = this.f48442b;
            if (gCMComplexTwoLineButton3 == null) {
                p005kotlin.jvm.internal.s.m("transitions");
                throw null;
            }
            gCMComplexTwoLineButton3.g(true);
        }
        if (ea().f48605r == null) {
            jLongValue = -1;
        } else {
            WorkoutDetailsDTO workoutDetailsDTO4 = ea().f48605r;
            if ((workoutDetailsDTO4 != null ? workoutDetailsDTO4.f48040a : 0L) > 0) {
                jLongValue = -1;
            } else {
                WorkoutDetailsDTO workoutDetailsDTO5 = ea().f48605r;
                String str2 = workoutDetailsDTO5 != null ? workoutDetailsDTO5.E : null;
                if (g22.n.d(str2)) {
                    i62.p.f91878a.getClass();
                    str2.getClass();
                    List<Long> list3 = i62.p.f91879b.get(str2);
                    if (list3 == null || list3.isEmpty()) {
                        jLongValue = -1;
                    } else {
                        jLongValue = list3.get(0).longValue();
                    }
                } else {
                    jLongValue = -1;
                }
            }
        }
        if (ea().E && jLongValue == -1) {
            View view2 = this.f48441a;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        } else {
            View view3 = this.f48441a;
            if (view3 != null) {
                view3.setVisibility(8);
            }
        }
        if (!ea().F || ((workoutDetailsDTO == null || !zf.b.D(Double.valueOf(workoutDetailsDTO.Z))) && (workoutDetailsDTO == null || !zf.b.D(Double.valueOf(workoutDetailsDTO.f48051k0))))) {
            ComposeView composeView10 = this.f48447g;
            if (composeView10 != null) {
                composeView10.setVisibility(8);
                return;
            } else {
                p005kotlin.jvm.internal.s.m("trainingEffectContainer");
                throw null;
            }
        }
        ComposeView composeView11 = this.f48447g;
        if (composeView11 == null) {
            p005kotlin.jvm.internal.s.m("trainingEffectContainer");
            throw null;
        }
        composeView11.setVisibility(0);
        ComposeView composeView12 = this.f48447g;
        if (composeView12 == null) {
            p005kotlin.jvm.internal.s.m("trainingEffectContainer");
            throw null;
        }
        composeView12.setViewCompositionStrategy(w3.d.f91628b);
        composeView12.setContent(new z3.e(-594162168, true, new c62.e(this, workoutDetailsDTO, 5)));
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:107:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:109:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:114:0x0204  */
    /* JADX WARN: Code duplicated, block: B:116:0x0207  */
    /* JADX WARN: Code duplicated, block: B:118:0x020b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0213  */
    /* JADX WARN: Code duplicated, block: B:124:0x0220  */
    /* JADX WARN: Code duplicated, block: B:126:0x0228  */
    /* JADX WARN: Code duplicated, block: B:127:0x0231  */
    /* JADX WARN: Code duplicated, block: B:130:0x023b  */
    /* JADX WARN: Code duplicated, block: B:131:0x023d  */
    /* JADX WARN: Code duplicated, block: B:133:0x0265  */
    /* JADX WARN: Code duplicated, block: B:135:0x0269  */
    /* JADX WARN: Code duplicated, block: B:138:0x0271  */
    /* JADX WARN: Code duplicated, block: B:40:0x0097  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:59:0x0106  */
    /* JADX WARN: Code duplicated, block: B:60:0x013a  */
    /* JADX WARN: Code duplicated, block: B:62:0x0142  */
    /* JADX WARN: Code duplicated, block: B:67:0x0151  */
    /* JADX WARN: Code duplicated, block: B:69:0x0159  */
    /* JADX WARN: Code duplicated, block: B:71:0x0161  */
    /* JADX WARN: Code duplicated, block: B:72:0x0164  */
    /* JADX WARN: Code duplicated, block: B:74:0x0167  */
    /* JADX WARN: Code duplicated, block: B:80:0x0179  */
    /* JADX WARN: Code duplicated, block: B:82:0x0181  */
    /* JADX WARN: Code duplicated, block: B:84:0x0189  */
    /* JADX WARN: Code duplicated, block: B:85:0x018e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0194  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:97:0x01aa  */
    public final void ha(boolean z14) {
        boolean z15;
        WorkoutDetailsDTO workoutDetailsDTO;
        boolean z16;
        boolean z17;
        boolean z18;
        WorkoutDetailsDTO workoutDetailsDTO2;
        Boolean boolValueOf;
        m52.k kVar;
        WorkoutScheduleDTO workoutScheduleDTO;
        WorkoutDetailsDTO workoutDetailsDTO3;
        WorkoutScheduleDTO workoutScheduleDTO2;
        WorkoutDetailsDTO workoutDetailsDTO4;
        boolean zC;
        boolean z19;
        boolean z24;
        boolean z25;
        WorkoutScheduleDTO workoutScheduleDTO3;
        DateTime dateTimeC;
        WorkoutDetailsDTO workoutDetailsDTO5;
        WorkoutScheduleDTO workoutScheduleDTO4;
        WorkoutDetailsDTO workoutDetailsDTO6;
        WorkoutScheduleDTO workoutScheduleDTO5;
        WorkoutDetailsDTO workoutDetailsDTO7;
        boolean zC2;
        WorkoutScheduleDTO workoutScheduleDTO6;
        WorkoutDetailsDTO workoutDetailsDTO8;
        if (ea().f48606t != null) {
            WorkoutScheduleDTO workoutScheduleDTO7 = ea().f48606t;
            if ((workoutScheduleDTO7 != null ? workoutScheduleDTO7.f48065a : null) != null && (workoutScheduleDTO6 = ea().f48606t) != null && (workoutDetailsDTO8 = workoutScheduleDTO6.f48065a) != null && workoutDetailsDTO8.D()) {
                WorkoutScheduleDTO workoutScheduleDTO8 = ea().f48606t;
                boolean z26 = (g22.k.c(workoutScheduleDTO8 != null ? workoutScheduleDTO8.C() : null) || ea().f48604q) ? false : true;
                ja(this.f48449i, z14 && z26 && !ea().A);
                ja(this.f48450j, z14 && z26 && !ea().A);
                ja(this.f48451k, false);
                ja(this.f48452l, false);
                ja(this.f48453m, false);
                ja(this.f48454n, false);
                ja(this.f48455o, false);
                ja(this.f48456p, false);
                ja(this.f48457q, false);
            } else if (ea().I != com.garmin.android.apps.connectmobile.workouts.presentation.details.c.ForScheduledWorkout) {
                if (ea().f48606t != null) {
                    workoutScheduleDTO4 = ea().f48606t;
                    if (workoutScheduleDTO4 != null) {
                        workoutDetailsDTO6 = workoutScheduleDTO4.f48065a;
                    } else {
                        workoutDetailsDTO6 = null;
                    }
                    if (workoutDetailsDTO6 == null) {
                    }
                }
                ja(this.f48451k, false);
                ja(this.f48456p, false);
                ja(this.f48452l, false);
                ja(this.f48453m, z14);
                ja(this.f48454n, false);
                ja(this.f48455o, z14);
                ja(this.f48457q, false);
                ja(this.f48458r, z14);
                ja(this.f48449i, false);
                ja(this.f48450j, false);
            } else if (ea().E) {
                ja(this.f48451k, false);
                ja(this.f48456p, false);
                ja(this.f48452l, false);
                ja(this.f48453m, false);
                ja(this.f48454n, false);
                ja(this.f48455o, false);
                ja(this.f48457q, false);
                ja(this.f48458r, false);
                ja(this.f48449i, false);
                ja(this.f48450j, false);
            } else if (ea().f48605r == null) {
                if (ea().f48606t != null) {
                    workoutScheduleDTO = ea().f48606t;
                    if (workoutScheduleDTO != null) {
                        workoutDetailsDTO3 = workoutScheduleDTO.f48065a;
                    } else {
                        workoutDetailsDTO3 = null;
                    }
                    if (workoutDetailsDTO3 == null) {
                    }
                }
                if (ea().f48605r == null) {
                    MenuItem menuItem = this.f48451k;
                    if (z14) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    ja(menuItem, z15);
                    ja(this.f48456p, z14);
                    ja(this.f48452l, false);
                    ja(this.f48453m, z14);
                    ja(this.f48454n, z14);
                    ja(this.f48455o, z14);
                    ja(this.f48457q, z14);
                    ja(this.f48458r, false);
                    ja(this.f48449i, false);
                    ja(this.f48450j, false);
                } else {
                    workoutDetailsDTO = ea().f48605r;
                    if (workoutDetailsDTO == null) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    if (z16) {
                        MenuItem menuItem2 = this.f48451k;
                        if (z14) {
                            z17 = false;
                        } else {
                            z17 = false;
                        }
                        ja(menuItem2, z17);
                        ja(this.f48456p, z14);
                        MenuItem menuItem3 = this.f48452l;
                        if (z14) {
                            workoutDetailsDTO2 = ea().f48605r;
                            if (workoutDetailsDTO2 != null) {
                                boolValueOf = Boolean.valueOf(workoutDetailsDTO2.c0());
                            } else {
                                boolValueOf = null;
                            }
                            boolValueOf.getClass();
                            if (boolValueOf.booleanValue()) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                        } else {
                            z18 = false;
                        }
                        ja(menuItem3, z18);
                        ja(this.f48453m, z14);
                        ja(this.f48454n, z14);
                        ja(this.f48455o, z14);
                        ja(this.f48457q, z14);
                        ja(this.f48458r, false);
                        ja(this.f48449i, false);
                        ja(this.f48450j, false);
                    } else {
                        MenuItem menuItem4 = this.f48451k;
                        if (z14) {
                            z15 = false;
                        } else {
                            z15 = false;
                        }
                        ja(menuItem4, z15);
                        ja(this.f48456p, z14);
                        ja(this.f48452l, false);
                        ja(this.f48453m, z14);
                        ja(this.f48454n, z14);
                        ja(this.f48455o, z14);
                        ja(this.f48457q, z14);
                        ja(this.f48458r, false);
                        ja(this.f48449i, false);
                        ja(this.f48450j, false);
                    }
                }
            } else {
                if (ea().f48606t != null) {
                    workoutScheduleDTO = ea().f48606t;
                    if (workoutScheduleDTO != null) {
                        workoutDetailsDTO3 = workoutScheduleDTO.f48065a;
                    } else {
                        workoutDetailsDTO3 = null;
                    }
                    if (workoutDetailsDTO3 == null) {
                    }
                }
                if (ea().f48605r == null) {
                    MenuItem menuItem5 = this.f48451k;
                    if (z14) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    ja(menuItem5, z15);
                    ja(this.f48456p, z14);
                    ja(this.f48452l, false);
                    ja(this.f48453m, z14);
                    ja(this.f48454n, z14);
                    ja(this.f48455o, z14);
                    ja(this.f48457q, z14);
                    ja(this.f48458r, false);
                    ja(this.f48449i, false);
                    ja(this.f48450j, false);
                } else {
                    workoutDetailsDTO = ea().f48605r;
                    if (workoutDetailsDTO == null) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    if (z16) {
                        MenuItem menuItem6 = this.f48451k;
                        if (z14) {
                            z17 = false;
                        } else {
                            z17 = false;
                        }
                        ja(menuItem6, z17);
                        ja(this.f48456p, z14);
                        MenuItem menuItem7 = this.f48452l;
                        if (z14) {
                            z18 = false;
                        } else {
                            workoutDetailsDTO2 = ea().f48605r;
                            if (workoutDetailsDTO2 != null) {
                                boolValueOf = Boolean.valueOf(workoutDetailsDTO2.c0());
                            } else {
                                boolValueOf = null;
                            }
                            boolValueOf.getClass();
                            if (boolValueOf.booleanValue()) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                        }
                        ja(menuItem7, z18);
                        ja(this.f48453m, z14);
                        ja(this.f48454n, z14);
                        ja(this.f48455o, z14);
                        ja(this.f48457q, z14);
                        ja(this.f48458r, false);
                        ja(this.f48449i, false);
                        ja(this.f48450j, false);
                    } else {
                        MenuItem menuItem8 = this.f48451k;
                        if (z14) {
                            z15 = false;
                        } else {
                            z15 = false;
                        }
                        ja(menuItem8, z15);
                        ja(this.f48456p, z14);
                        ja(this.f48452l, false);
                        ja(this.f48453m, z14);
                        ja(this.f48454n, z14);
                        ja(this.f48455o, z14);
                        ja(this.f48457q, z14);
                        ja(this.f48458r, false);
                        ja(this.f48449i, false);
                        ja(this.f48450j, false);
                    }
                }
            }
        } else if (ea().I != com.garmin.android.apps.connectmobile.workouts.presentation.details.c.ForScheduledWorkout) {
            if (ea().f48606t != null) {
                workoutScheduleDTO4 = ea().f48606t;
                if (workoutScheduleDTO4 != null) {
                    workoutDetailsDTO6 = workoutScheduleDTO4.f48065a;
                } else {
                    workoutDetailsDTO6 = null;
                }
                if (workoutDetailsDTO6 == null && (workoutScheduleDTO5 = ea().f48606t) != null && (workoutDetailsDTO7 = workoutScheduleDTO5.f48065a) != null && workoutDetailsDTO7.G()) {
                    if (ea().E) {
                        ja(this.f48451k, false);
                        ja(this.f48456p, false);
                        ja(this.f48452l, false);
                        ja(this.f48453m, false);
                        ja(this.f48454n, false);
                        ja(this.f48455o, false);
                        ja(this.f48457q, false);
                        ja(this.f48458r, false);
                        ja(this.f48449i, false);
                        ja(this.f48450j, false);
                    } else if (ea().f48605r == null) {
                        if (ea().f48606t != null) {
                            workoutScheduleDTO = ea().f48606t;
                            if (workoutScheduleDTO != null) {
                                workoutDetailsDTO3 = workoutScheduleDTO.f48065a;
                            } else {
                                workoutDetailsDTO3 = null;
                            }
                            if (workoutDetailsDTO3 == null) {
                            }
                        }
                        if (ea().f48605r == null) {
                            MenuItem menuItem9 = this.f48451k;
                            if (z14) {
                                z15 = false;
                            } else {
                                z15 = false;
                            }
                            ja(menuItem9, z15);
                            ja(this.f48456p, z14);
                            ja(this.f48452l, false);
                            ja(this.f48453m, z14);
                            ja(this.f48454n, z14);
                            ja(this.f48455o, z14);
                            ja(this.f48457q, z14);
                            ja(this.f48458r, false);
                            ja(this.f48449i, false);
                            ja(this.f48450j, false);
                        } else {
                            workoutDetailsDTO = ea().f48605r;
                            if (workoutDetailsDTO == null) {
                                z16 = false;
                            } else {
                                z16 = false;
                            }
                            if (z16) {
                                MenuItem menuItem10 = this.f48451k;
                                if (z14) {
                                    z17 = false;
                                } else {
                                    z17 = false;
                                }
                                ja(menuItem10, z17);
                                ja(this.f48456p, z14);
                                MenuItem menuItem11 = this.f48452l;
                                if (z14) {
                                    z18 = false;
                                } else {
                                    workoutDetailsDTO2 = ea().f48605r;
                                    if (workoutDetailsDTO2 != null) {
                                        boolValueOf = Boolean.valueOf(workoutDetailsDTO2.c0());
                                    } else {
                                        boolValueOf = null;
                                    }
                                    boolValueOf.getClass();
                                    if (boolValueOf.booleanValue()) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                }
                                ja(menuItem11, z18);
                                ja(this.f48453m, z14);
                                ja(this.f48454n, z14);
                                ja(this.f48455o, z14);
                                ja(this.f48457q, z14);
                                ja(this.f48458r, false);
                                ja(this.f48449i, false);
                                ja(this.f48450j, false);
                            } else {
                                MenuItem menuItem12 = this.f48451k;
                                if (z14) {
                                    z15 = false;
                                } else {
                                    z15 = false;
                                }
                                ja(menuItem12, z15);
                                ja(this.f48456p, z14);
                                ja(this.f48452l, false);
                                ja(this.f48453m, z14);
                                ja(this.f48454n, z14);
                                ja(this.f48455o, z14);
                                ja(this.f48457q, z14);
                                ja(this.f48458r, false);
                                ja(this.f48449i, false);
                                ja(this.f48450j, false);
                            }
                        }
                    } else {
                        if (ea().f48606t != null) {
                            workoutScheduleDTO = ea().f48606t;
                            if (workoutScheduleDTO != null) {
                                workoutDetailsDTO3 = workoutScheduleDTO.f48065a;
                            } else {
                                workoutDetailsDTO3 = null;
                            }
                            if (workoutDetailsDTO3 == null) {
                            }
                        }
                        if (ea().f48605r == null) {
                            MenuItem menuItem13 = this.f48451k;
                            if (z14) {
                                z15 = false;
                            } else {
                                z15 = false;
                            }
                            ja(menuItem13, z15);
                            ja(this.f48456p, z14);
                            ja(this.f48452l, false);
                            ja(this.f48453m, z14);
                            ja(this.f48454n, z14);
                            ja(this.f48455o, z14);
                            ja(this.f48457q, z14);
                            ja(this.f48458r, false);
                            ja(this.f48449i, false);
                            ja(this.f48450j, false);
                        } else {
                            workoutDetailsDTO = ea().f48605r;
                            if (workoutDetailsDTO == null) {
                                z16 = false;
                            } else {
                                z16 = false;
                            }
                            if (z16) {
                                MenuItem menuItem14 = this.f48451k;
                                if (z14) {
                                    z17 = false;
                                } else {
                                    z17 = false;
                                }
                                ja(menuItem14, z17);
                                ja(this.f48456p, z14);
                                MenuItem menuItem15 = this.f48452l;
                                if (z14) {
                                    z18 = false;
                                } else {
                                    workoutDetailsDTO2 = ea().f48605r;
                                    if (workoutDetailsDTO2 != null) {
                                        boolValueOf = Boolean.valueOf(workoutDetailsDTO2.c0());
                                    } else {
                                        boolValueOf = null;
                                    }
                                    boolValueOf.getClass();
                                    if (boolValueOf.booleanValue()) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                }
                                ja(menuItem15, z18);
                                ja(this.f48453m, z14);
                                ja(this.f48454n, z14);
                                ja(this.f48455o, z14);
                                ja(this.f48457q, z14);
                                ja(this.f48458r, false);
                                ja(this.f48449i, false);
                                ja(this.f48450j, false);
                            } else {
                                MenuItem menuItem16 = this.f48451k;
                                if (z14) {
                                    z15 = false;
                                } else {
                                    z15 = false;
                                }
                                ja(menuItem16, z15);
                                ja(this.f48456p, z14);
                                ja(this.f48452l, false);
                                ja(this.f48453m, z14);
                                ja(this.f48454n, z14);
                                ja(this.f48455o, z14);
                                ja(this.f48457q, z14);
                                ja(this.f48458r, false);
                                ja(this.f48449i, false);
                                ja(this.f48450j, false);
                            }
                        }
                    }
                }
            }
            ja(this.f48451k, false);
            ja(this.f48456p, false);
            ja(this.f48452l, false);
            ja(this.f48453m, z14);
            ja(this.f48454n, false);
            ja(this.f48455o, z14);
            ja(this.f48457q, false);
            ja(this.f48458r, z14);
            ja(this.f48449i, false);
            ja(this.f48450j, false);
        } else if (ea().E) {
            ja(this.f48451k, false);
            ja(this.f48456p, false);
            ja(this.f48452l, false);
            ja(this.f48453m, false);
            ja(this.f48454n, false);
            ja(this.f48455o, false);
            ja(this.f48457q, false);
            ja(this.f48458r, false);
            ja(this.f48449i, false);
            ja(this.f48450j, false);
        } else if (ea().f48605r == null && (workoutDetailsDTO5 = ea().f48605r) != null && workoutDetailsDTO5.G()) {
            if (ea().f48606t != null) {
                workoutScheduleDTO3 = ea().f48606t;
                if (workoutScheduleDTO3 != null) {
                    dateTimeC = workoutScheduleDTO3.C();
                } else {
                    dateTimeC = null;
                }
                zC = g22.k.c(dateTimeC);
            } else {
                zC = false;
            }
            if (zC) {
                z19 = false;
            } else {
                z19 = false;
            }
            MenuItem menuItem17 = this.f48451k;
            if (z14) {
                z24 = false;
            } else {
                z24 = false;
            }
            ja(menuItem17, z24);
            ja(this.f48456p, false);
            ja(this.f48452l, false);
            ja(this.f48453m, z14);
            ja(this.f48454n, false);
            ja(this.f48455o, z14);
            ja(this.f48457q, false);
            ja(this.f48458r, false);
            ja(this.f48449i, false);
            MenuItem menuItem18 = this.f48450j;
            if (z14) {
                z25 = false;
            } else {
                z25 = false;
            }
            ja(menuItem18, z25);
        } else {
            if (ea().f48606t != null) {
                workoutScheduleDTO = ea().f48606t;
                if (workoutScheduleDTO != null) {
                    workoutDetailsDTO3 = workoutScheduleDTO.f48065a;
                } else {
                    workoutDetailsDTO3 = null;
                }
                if (workoutDetailsDTO3 == null && (workoutScheduleDTO2 = ea().f48606t) != null && (workoutDetailsDTO4 = workoutScheduleDTO2.f48065a) != null && workoutDetailsDTO4.G()) {
                    if (ea().f48606t != null) {
                        workoutScheduleDTO3 = ea().f48606t;
                        if (workoutScheduleDTO3 != null) {
                            dateTimeC = workoutScheduleDTO3.C();
                        } else {
                            dateTimeC = null;
                        }
                        zC = g22.k.c(dateTimeC);
                    } else {
                        zC = false;
                    }
                    if (zC || ea().f48604q) {
                        z19 = false;
                    } else {
                        z19 = true;
                    }
                    MenuItem menuItem19 = this.f48451k;
                    if (z14 || !z19) {
                        z24 = false;
                    } else {
                        z24 = true;
                    }
                    ja(menuItem19, z24);
                    ja(this.f48456p, false);
                    ja(this.f48452l, false);
                    ja(this.f48453m, z14);
                    ja(this.f48454n, false);
                    ja(this.f48455o, z14);
                    ja(this.f48457q, false);
                    ja(this.f48458r, false);
                    ja(this.f48449i, false);
                    MenuItem menuItem110 = this.f48450j;
                    if (z14 || ea().f48601n) {
                        z25 = false;
                    } else {
                        z25 = true;
                    }
                    ja(menuItem110, z25);
                }
            }
            if (ea().f48605r == null) {
                MenuItem menuItem111 = this.f48451k;
                if (z14 || !ia()) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                ja(menuItem111, z15);
                ja(this.f48456p, z14);
                ja(this.f48452l, false);
                ja(this.f48453m, z14);
                ja(this.f48454n, z14);
                ja(this.f48455o, z14);
                ja(this.f48457q, z14);
                ja(this.f48458r, false);
                ja(this.f48449i, false);
                ja(this.f48450j, false);
            } else {
                workoutDetailsDTO = ea().f48605r;
                if (workoutDetailsDTO == null && (kVar = workoutDetailsDTO.f48044e) != null && kVar.f116776l) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (z16) {
                    MenuItem menuItem112 = this.f48451k;
                    if (z14 || !ia()) {
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    ja(menuItem112, z17);
                    ja(this.f48456p, z14);
                    MenuItem menuItem113 = this.f48452l;
                    if (z14) {
                        z18 = false;
                    } else {
                        workoutDetailsDTO2 = ea().f48605r;
                        if (workoutDetailsDTO2 != null) {
                            boolValueOf = Boolean.valueOf(workoutDetailsDTO2.c0());
                        } else {
                            boolValueOf = null;
                        }
                        boolValueOf.getClass();
                        if (boolValueOf.booleanValue()) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                    }
                    ja(menuItem113, z18);
                    ja(this.f48453m, z14);
                    ja(this.f48454n, z14);
                    ja(this.f48455o, z14);
                    ja(this.f48457q, z14);
                    ja(this.f48458r, false);
                    ja(this.f48449i, false);
                    ja(this.f48450j, false);
                } else {
                    MenuItem menuItem114 = this.f48451k;
                    if (z14) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    ja(menuItem114, z15);
                    ja(this.f48456p, z14);
                    ja(this.f48452l, false);
                    ja(this.f48453m, z14);
                    ja(this.f48454n, z14);
                    ja(this.f48455o, z14);
                    ja(this.f48457q, z14);
                    ja(this.f48458r, false);
                    ja(this.f48449i, false);
                    ja(this.f48450j, false);
                }
            }
        }
        WorkoutDetailsDTO workoutDetailsDTO9 = ea().f48605r;
        if (workoutDetailsDTO9 != null && workoutDetailsDTO9.D()) {
            if (ea().f48606t != null) {
                WorkoutScheduleDTO workoutScheduleDTO9 = ea().f48606t;
                zC2 = g22.k.c(workoutScheduleDTO9 != null ? workoutScheduleDTO9.C() : null);
            } else {
                zC2 = false;
            }
            ja(this.f48453m, false);
            ja(this.f48454n, false);
            ja(this.f48455o, false);
            ja(this.f48450j, (ea().f48601n || ea().A) ? false : true);
            ja(this.f48451k, z14 && (!zC2 && !ea().f48604q));
        }
        WorkoutDetailsDTO workoutDetailsDTO10 = ea().f48605r;
        if (workoutDetailsDTO10 != null && workoutDetailsDTO10.I()) {
            Bundle extras = getIntent().getExtras();
            boolean z27 = extras != null ? extras.getBoolean("GCM_workout_completed", false) : false;
            Bundle extras2 = getIntent().getExtras();
            boolean z28 = extras2 != null ? extras2.getBoolean("GCM_workout_is_plan_completed", false) : false;
            ja(this.f48451k, false);
            ja(this.f48456p, false);
            ja(this.f48452l, false);
            ja(this.f48453m, false);
            ja(this.f48454n, false);
            ja(this.f48455o, false);
            ja(this.f48457q, false);
            ja(this.f48458r, false);
            ja(this.f48449i, (!z14 || z27 || z28) ? false : true);
            ja(this.f48450j, false);
        }
        if (ea().F) {
            ja(this.f48451k, false);
            ja(this.f48456p, false);
            ja(this.f48452l, false);
            ja(this.f48453m, false);
            ja(this.f48454n, false);
            ja(this.f48455o, false);
            ja(this.f48457q, false);
            ja(this.f48458r, false);
            ja(this.f48449i, false);
            ja(this.f48450j, false);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.s2
    public final void hideProgressOverlay() {
        super.hideProgressOverlay();
        ha(true);
    }

    public final boolean ia() {
        if (ea().f48605r == null) {
            return false;
        }
        WorkoutDetailsDTO workoutDetailsDTO = ea().f48605r;
        List<h0> list = workoutDetailsDTO != null ? workoutDetailsDTO.Q0 : null;
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        WorkoutDetailsDTO workoutDetailsDTO;
        WorkoutDetailsDTO workoutDetailsDTO2;
        if (i14 == 203) {
            if (i15 != -1) {
                return;
            }
            c62.p pVarEa = ea();
            int i16 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
            w0 w0Var = new w0(g3.a.c(g3.f35298f));
            ge1.b.T(v1.a(pVarEa), null, null, new v(pVarEa, w0Var, null, null), 3);
            t1.a(w0Var, new a12.a(new b41.a(intent, 17), 28)).f(this, new e(new c62.j(this)));
            return;
        }
        if (i14 == 208) {
            if (i15 != 0) {
                ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).T3(true);
                setResult(-1);
                finish();
                return;
            }
            return;
        }
        if (i14 == 9478) {
            if (i15 == -1) {
                Toast.makeText(this, R.string.workout_has_been_scheduled, 1).show();
                return;
            }
            return;
        }
        if (i15 == -1 && ea().f48605r != null && (((workoutDetailsDTO = ea().f48605r) != null && workoutDetailsDTO.H()) || ((workoutDetailsDTO2 = ea().f48605r) != null && workoutDetailsDTO2.F()))) {
            setResult(-1);
        }
        super.onActivityResult(i14, i15, intent);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        setContentView(R.layout.multisport_workout_details_activity);
        initActionBar(true, getString(R.string.lbl_overview));
        Bundle extras = getIntent().getExtras();
        com.garmin.android.apps.connectmobile.workouts.presentation.details.c.a aVar = com.garmin.android.apps.connectmobile.workouts.presentation.details.c.f48511a;
        Parcelable parcelable2 = null;
        Integer numValueOf = extras != null ? Integer.valueOf(extras.getInt("GCM_extra_activity_type")) : null;
        aVar.getClass();
        com.garmin.android.apps.connectmobile.workouts.presentation.details.c cVarA = com.garmin.android.apps.connectmobile.workouts.presentation.details.c.a.a(numValueOf);
        if (cVarA == com.garmin.android.apps.connectmobile.workouts.presentation.details.c.SetResultOnCreate) {
            setResult(-1);
        }
        ge1.b.T(f0.w(this), null, null, new c(null), 3);
        ge1.b.T(f0.w(this), null, null, new d(null), 3);
        if (extras != null) {
            try {
                c62.p pVarEa = ea();
                boolean z14 = extras.getBoolean("GCM_workout_is_protected");
                boolean z15 = extras.getBoolean("GCM_workout_is_race");
                boolean z16 = extras.getBoolean("EXTRA_IS_FBT_WORKOUT", false);
                Long lValueOf = Long.valueOf(extras.getLong("GCM_workout_id", -1L));
                Long lValueOf2 = Long.valueOf(extras.getLong("GCM_workout_schedule_id", -1L));
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = (Parcelable) extras.getParcelable("GCM_calendar_items", CalendarItemDTO.class);
                } else {
                    Parcelable parcelable3 = extras.getParcelable("GCM_calendar_items");
                    if (parcelable3 instanceof CalendarItemDTO) {
                        parcelable2 = parcelable3;
                    }
                    parcelable = (CalendarItemDTO) parcelable2;
                }
                String string = extras.getString("EXTRA_SCHEDULE_WORKOUT_UUID");
                String string2 = extras.getString("GCM_workout_source_id");
                cVarA.getClass();
                pVarEa.e5(z14, z15, z16, false, 0, lValueOf, lValueOf2, (CalendarItemDTO) parcelable, string, string2, cVarA, false, false, null);
            } catch (Throwable unused) {
                Toast.makeText(this, getString(R.string.txt_something_went_wrong_try_again), 0).show();
                finish();
            }
        }
        View viewFindViewById = findViewById(R.id.estimate_view);
        viewFindViewById.getClass();
        this.f48444d = (ComposeView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.main_view);
        View viewFindViewById3 = findViewById(R.id.workout_note_clickable);
        viewFindViewById3.getClass();
        this.f48445e = (ComposeView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.audio_note_view);
        viewFindViewById4.getClass();
        this.f48446f = (ComposeView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.training_effect_container);
        viewFindViewById5.getClass();
        this.f48447g = (ComposeView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.transition_toggle);
        viewFindViewById6.getClass();
        GCMComplexTwoLineButton gCMComplexTwoLineButton = (GCMComplexTwoLineButton) viewFindViewById6;
        this.f48442b = gCMComplexTwoLineButton;
        if (ea().F) {
            gCMComplexTwoLineButton.setVisibility(8);
        } else {
            gCMComplexTwoLineButton.f(true);
            gCMComplexTwoLineButton.setParentContainerScreenReaderFocusable(true);
            gCMComplexTwoLineButton.setSwitchEnabled(false);
        }
        View viewFindViewById7 = findViewById(R.id.recycler_view);
        viewFindViewById7.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById7;
        this.f48443c = recyclerView;
        recyclerView.setHasFixedSize(true);
        View viewFindViewById8 = viewFindViewById2.findViewById(R.id.sports_list_header);
        viewFindViewById8.getClass();
        TextView textView = new k32.h(viewFindViewById8).f102692a;
        if (textView != null) {
            textView.setText(R.string.lbl_workout_legs);
        }
        this.f48441a = findViewById(R.id.save_btn_container);
        findViewById(R.id.save_btn).setOnClickListener(new a32.b(this, 22));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x008f  */
    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        WorkoutScheduleDTO workoutScheduleDTO;
        WorkoutDetailsDTO workoutDetailsDTO;
        menu.getClass();
        getMenuInflater().inflate(R.menu.workout_details, menu);
        menu.findItem(R.id.menu_item_send_to_device).setVisible(true);
        if (ea().f48606t == null) {
            this.f48451k = menu.findItem(R.id.menu_item_send_to_device);
            this.f48456p = menu.findItem(R.id.workout_add_to_calendar);
            this.f48452l = menu.findItem(R.id.workout_help);
            this.f48453m = menu.findItem(R.id.workout_edit);
            this.f48454n = menu.findItem(R.id.workout_clone);
            this.f48455o = menu.findItem(R.id.workout_rename);
            this.f48457q = menu.findItem(R.id.workout_delete);
            this.f48458r = menu.findItem(R.id.remove_from_calendar);
            this.f48449i = menu.findItem(R.id.workout_reschedule);
            this.f48450j = menu.findItem(R.id.workout_remove);
        } else {
            WorkoutScheduleDTO workoutScheduleDTO2 = ea().f48606t;
            if ((workoutScheduleDTO2 != null ? workoutScheduleDTO2.f48065a : null) == null || (workoutScheduleDTO = ea().f48606t) == null || (workoutDetailsDTO = workoutScheduleDTO.f48065a) == null || !workoutDetailsDTO.D()) {
                this.f48451k = menu.findItem(R.id.menu_item_send_to_device);
                this.f48456p = menu.findItem(R.id.workout_add_to_calendar);
                this.f48452l = menu.findItem(R.id.workout_help);
                this.f48453m = menu.findItem(R.id.workout_edit);
                this.f48454n = menu.findItem(R.id.workout_clone);
                this.f48455o = menu.findItem(R.id.workout_rename);
                this.f48457q = menu.findItem(R.id.workout_delete);
                this.f48458r = menu.findItem(R.id.remove_from_calendar);
                this.f48449i = menu.findItem(R.id.workout_reschedule);
                this.f48450j = menu.findItem(R.id.workout_remove);
            } else {
                this.f48449i = menu.findItem(R.id.workout_reschedule);
                this.f48450j = menu.findItem(R.id.workout_remove);
                this.f48451k = menu.findItem(R.id.menu_item_send_to_device);
                this.f48452l = menu.findItem(R.id.workout_help);
                this.f48453m = menu.findItem(R.id.workout_edit);
                this.f48454n = menu.findItem(R.id.workout_clone);
                this.f48455o = menu.findItem(R.id.workout_rename);
                this.f48456p = menu.findItem(R.id.workout_add_to_calendar);
                this.f48457q = menu.findItem(R.id.workout_delete);
            }
        }
        WorkoutDetailsDTO workoutDetailsDTO2 = ea().f48605r;
        if (workoutDetailsDTO2 != null && workoutDetailsDTO2.D()) {
            this.f48453m = menu.findItem(R.id.workout_edit);
            this.f48454n = menu.findItem(R.id.workout_clone);
            this.f48455o = menu.findItem(R.id.workout_rename);
            this.f48451k = menu.findItem(R.id.menu_item_send_to_device);
        }
        ha(false);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        WorkoutDetailsDTO workoutDetailsDTO;
        WorkoutScheduleDTO workoutScheduleDTO;
        WorkoutDetailsDTO workoutDetailsDTO2;
        Window window;
        menuItem.getClass();
        int i14 = 1;
        if (ea().f48605r != null) {
            int itemId = menuItem.getItemId();
            if (itemId == R.id.menu_item_send_to_device) {
                ea().U4(ea().f48605r);
                return true;
            }
            if (itemId == R.id.workout_help) {
                HelpActivity.a aVar = HelpActivity.f36653a;
                ro0.l lVar = ro0.l.WORKOUT_ESTIMATE;
                aVar.getClass();
                HelpActivity.a.d(this, lVar, null, null);
                return true;
            }
            if (itemId == R.id.workout_edit) {
                fa(null);
                return true;
            }
            if (itemId == R.id.workout_add_to_calendar) {
                new r22.c0(this, DateTime.now().minusYears(1).withTimeAtStartOfDay().getMillis(), r22.c0.a(DateTime.now().plusYears(1)).getMillis(), Calendar.getInstance(), new c62.d(this, 0)).show();
                return true;
            }
            int i15 = 2;
            if (itemId == R.id.workout_clone) {
                c62.p pVarEa = ea();
                WorkoutDetailsDTO workoutDetailsDTO3 = ea().f48605r;
                Long lValueOf = workoutDetailsDTO3 != null ? Long.valueOf(workoutDetailsDTO3.f48040a) : null;
                x0 x0Var = x0.f105818a;
                String string = getString(R.string.workout_duplicate_default_format);
                string.getClass();
                WorkoutDetailsDTO workoutDetailsDTO4 = ea().f48605r;
                String str = String.format(string, Arrays.copyOf(new Object[]{workoutDetailsDTO4 != null ? workoutDetailsDTO4.f48041b : null}, 1));
                w9.a aVarA = v1.a(pVarEa);
                x53.c cVar = o53.s0.f129406a;
                ge1.b.T(aVarA, x53.b.f189152a, null, new com.garmin.android.apps.connectmobile.workouts.presentation.details.g(lValueOf, str, pVarEa, null), 2);
                return true;
            }
            if (itemId == R.id.workout_delete) {
                new androidx.appcompat.app.e.a(this).setTitle(R.string.workout_delete_confirmation).setMessage(R.string.workout_delete_warning_message).setNegativeButton(R.string.lbl_cancel, new ag0.e(20)).setPositiveButton(R.string.lbl_delete, new ai1.a(this, 7)).show();
                return true;
            }
            if (itemId == R.id.workout_rename) {
                View viewInflate = LayoutInflater.from(this).inflate(R.layout.workout_dialog, (ViewGroup) null);
                EditText editText = (EditText) viewInflate.findViewById(R.id.edit_text);
                WorkoutDetailsDTO workoutDetailsDTO5 = ea().f48605r;
                editText.setText(workoutDetailsDTO5 != null ? workoutDetailsDTO5.f48041b : null);
                editText.setSingleLine();
                editText.setSelectAllOnFocus(true);
                androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(this).setTitle(R.string.workout_name).setView(viewInflate).setPositiveButton(getString(R.string.lbl_save), new ag0.d(5, this, editText)).setNegativeButton(R.string.lbl_cancel, (DialogInterface.OnClickListener) null).create();
                eVarCreate.getClass();
                if (eVarCreate.getWindow() != null && (window = eVarCreate.getWindow()) != null) {
                    window.setSoftInputMode(4);
                }
                eVarCreate.show();
                return true;
            }
            int i16 = 3;
            if (itemId == R.id.remove_from_calendar) {
                WorkoutDetailsDTO workoutDetailsDTO6 = ea().f48605r;
                if ((workoutDetailsDTO6 != null ? workoutDetailsDTO6.Y : -1L) <= 0) {
                    c62.p pVarEa2 = ea();
                    ge1.b.T(v1.a(pVarEa2), null, null, new p(pVarEa2, ea().B, null), 3);
                    return true;
                }
                c62.p pVarEa3 = ea();
                WorkoutDetailsDTO workoutDetailsDTO7 = ea().f48605r;
                ge1.b.T(v1.a(pVarEa3), null, null, new q(pVarEa3, workoutDetailsDTO7 != null ? workoutDetailsDTO7.Y : -1L, ea().B, null), 3);
                return true;
            }
            if (itemId != R.id.workout_reschedule) {
                if (itemId != R.id.workout_remove) {
                    return super.onOptionsItemSelected(menuItem);
                }
                if (ea().f48606t != null) {
                    WorkoutScheduleDTO workoutScheduleDTO2 = ea().f48606t;
                    if ((workoutScheduleDTO2 != null ? workoutScheduleDTO2.f48065a : null) != null && (workoutScheduleDTO = ea().f48606t) != null && (workoutDetailsDTO2 = workoutScheduleDTO.f48065a) != null && workoutDetailsDTO2.G()) {
                        q1.b bVar = q1.f41066b;
                        String string2 = getString(R.string.msg_remove_workout);
                        string2.getClass();
                        String string3 = getString(R.string.itp_remove_workout_body);
                        string3.getClass();
                        c62.d dVar = new c62.d(this, i14);
                        bVar.getClass();
                        q1 q1VarC = q1.b.c(string2, string3, R.string.common_confirm, R.string.device_action_cancel, dVar);
                        androidx.fragment.app.v supportFragmentManager = getSupportFragmentManager();
                        supportFragmentManager.getClass();
                        q1VarC.v6(supportFragmentManager, null);
                        return true;
                    }
                }
                if (ea().f48605r != null && (workoutDetailsDTO = ea().f48605r) != null && workoutDetailsDTO.G()) {
                    q1.b bVar2 = q1.f41066b;
                    String string4 = getString(R.string.msg_remove_workout);
                    string4.getClass();
                    String string5 = getString(R.string.itp_remove_workout_body);
                    string5.getClass();
                    c62.d dVar2 = new c62.d(this, i15);
                    bVar2.getClass();
                    q1 q1VarC2 = q1.b.c(string4, string5, R.string.common_confirm, R.string.device_action_cancel, dVar2);
                    androidx.fragment.app.v supportFragmentManager2 = getSupportFragmentManager();
                    supportFragmentManager2.getClass();
                    q1VarC2.v6(supportFragmentManager2, null);
                    return true;
                }
                if (ea().f48606t != null) {
                    WorkoutScheduleDTO workoutScheduleDTO3 = ea().f48606t;
                    if ((workoutScheduleDTO3 != null ? workoutScheduleDTO3.f48065a : null) != null) {
                        q1.b bVar3 = q1.f41066b;
                        String string6 = getString(R.string.msg_remove_workout);
                        string6.getClass();
                        String string7 = getString(R.string.msg_remove_workout_info);
                        string7.getClass();
                        c62.d dVar3 = new c62.d(this, i16);
                        bVar3.getClass();
                        q1 q1VarC3 = q1.b.c(string6, string7, R.string.common_confirm, R.string.device_action_cancel, dVar3);
                        androidx.fragment.app.v supportFragmentManager3 = getSupportFragmentManager();
                        supportFragmentManager3.getClass();
                        q1VarC3.v6(supportFragmentManager3, null);
                        return true;
                    }
                }
                a2 a2Var = a2.WORKOUTS;
                String str2 = "Error! " + ea().f48606t + " or the workout details it contains was null!";
                i2.f36769a.getClass();
                i2.a.f(a2Var, "MultiSportsDetailsActivity", str2);
                displayFailedMessage();
                return true;
            }
            WorkoutScheduleDTO workoutScheduleDTO4 = ea().f48606t;
            if (workoutScheduleDTO4 != null) {
                this.f48459t.E(this, workoutScheduleDTO4);
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        WorkoutDetailsDTO workoutDetailsDTO;
        String str;
        menu.getClass();
        ha(!isProgressOverlayVisible());
        if (ea().f48605r != null && (workoutDetailsDTO = ea().f48605r) != null && (str = workoutDetailsDTO.f48056p) != null && str.length() > 0) {
            ja(this.f48452l, false);
            ja(this.f48453m, false);
            ja(this.f48454n, false);
            ja(this.f48455o, false);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.s2
    public final void showProgressOverlay() {
        super.showProgressOverlay();
        ha(false);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/MultiSportsDetailsActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "WORKOUT_SENT_DIALOG_KEY", "KEY_SNACKBAR_MESSAGE", "EXTRA_SCHEDULE_WORKOUT_ID", "EXTRA_SCHEDULE_WORKOUT_UUID", "EXTRA_IS_FBT_WORKOUT", "EXTRA_WORKOUT_SEGMENT_ORDER", "", "REQUEST_CODE_TARGET_DEVICE_SELECTION", "I", "REQUEST_CODE_VIEW_WORKOUT_FROM_GSM", "REQUEST_CODE_RESCHEDULE_WORKOUT", "WORKOUT_SENT_DIALOG_DISMISS_TIME", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(Context context, long j8, long j14, boolean z14) {
            Intent intentD = sn.a.d(context, context, MultiSportsDetailsActivity.class);
            intentD.putExtra("GCM_workout_id", j8);
            intentD.putExtra("GCM_workout_schedule_id", j14);
            intentD.putExtra("GCM_workout_is_protected", z14);
            context.startActivity(intentD);
        }

        private a() {
        }
    }
}
