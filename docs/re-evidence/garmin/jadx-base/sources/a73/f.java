package a73;

import android.content.Context;
import android.util.Size;
import androidx.camera.core.impl.b1;
import b0.g1;
import bs2.nv;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.courses.presentation.list.CoursesActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.views.GCMPregnancyTwoLineButton;
import com.garmin.android.apps.connectmobile.q1;
import com.garmin.android.apps.connectmobile.workouts.presentation.common.list.SpinnerDialogView;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.androidbrowserhelper.trusted.splashscreens.PwaWrapperSplashScreenStrategy;
import com.google.androidbrowserhelper.trusted.splashscreens.SplashImageTransferTask;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsTasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;
import com.mapbox.bindgen.Expected;
import com.mapbox.maps.LayerPosition;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.QueryRenderedFeaturesCallback;
import com.mapbox.maps.SnapshotCompleteCallback;
import com.mapbox.maps.SnapshotOverlayCallback;
import com.mapbox.maps.SnapshotResultCallback;
import com.mapbox.maps.Snapshotter;
import com.mapbox.maps.extension.compose.internal.LayerPositionAwareNode;
import com.mapbox.maps.plugin.annotation.AnnotationManagerImpl;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Stack;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o53.c2;
import o53.l1;
import org.apache.commons.lang3.Functions;
import org.apache.commons.lang3.function.FailableBiConsumer;
import org.apache.commons.lang3.function.FailableBiFunction;
import org.apache.commons.lang3.function.FailableBiPredicate;
import org.apache.commons.lang3.function.FailableBooleanSupplier;
import org.apache.commons.lang3.function.FailableRunnable;
import org.apache.commons.lang3.function.FailableSupplier;
import org.joda.time.LocalDate;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r22.a2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements FailableBooleanSupplier, FailableRunnable, FailableSupplier, androidx.concurrent.futures.b.c, a2.d, l52.u, ListenerSet.Event, SplashImageTransferTask.Callback, Continuation, OnSuccessListener, SnapshotCompleteCallback, Expected.Action, QueryRenderedFeaturesCallback, SynchronizationGuard.CriticalSection, q1.a, r22.c0.b, vm2.b, g1.h, j1.l.a, SpinnerDialogView.d, Functions.FailableRunnable, Functions.FailableSupplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1836d;

    public /* synthetic */ f(Object obj, int i14, Object obj2, Object obj3) {
        this.f1833a = i14;
        this.f1836d = obj;
        this.f1834b = obj2;
        this.f1835c = obj3;
    }

    public void a() {
        j1.k.a aVar = (j1.k.a) this.f1836d;
        j1.i iVar = (j1.i) this.f1834b;
        androidx.camera.core.impl.l0 l0Var = (androidx.camera.core.impl.l0) this.f1835c;
        AtomicReference<j1.i> atomicReference = j1.k.this.f96263g;
        do {
            if (atomicReference.compareAndSet(iVar, null)) {
                iVar.b(j1.k.e.IDLE);
                break;
            }
        } while (atomicReference.get() == iVar);
        l0.d dVar = iVar.f96244e;
        if (dVar != null) {
            dVar.cancel(false);
            iVar.f96244e = null;
        }
        l0Var.getCameraState().c(iVar);
    }

    @Override // vm2.b
    public void cancel() {
        ArrayList arrayList = (ArrayList) this.f1836d;
        c2 c2Var = (c2) this.f1834b;
        p005kotlin.jvm.internal.r0 r0Var = (p005kotlin.jvm.internal.r0) this.f1835c;
        im2.c.a aVar = im2.c.f94215e;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((c83.d) it.next()).cancel();
        }
        c2Var.c(null);
        l1 l1Var = (l1) r0Var.f105810a;
        if (l1Var != null) {
            l1Var.c(null);
        }
    }

    @Override // androidx.concurrent.futures.b.c
    public Object d(androidx.concurrent.futures.b.a aVar) {
        androidx.concurrent.futures.b.d dVar = (androidx.concurrent.futures.b.d) this.f1836d;
        Executor executor = (Executor) this.f1834b;
        Collection collection = (Collection) this.f1835c;
        aVar.a(new a0.c(dVar, 7), executor);
        l0.j.a(dVar, new b1(false, aVar), executor);
        return "surfaceList[" + collection + "]";
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        return ((DefaultScheduler) this.f1836d).lambda$schedule$0((TransportContext) this.f1834b, (EventInternal) this.f1835c);
    }

    @Override // com.garmin.android.apps.connectmobile.q1.a
    public void g(boolean z14) {
        int i14 = this.f1833a;
        Object obj = this.f1835c;
        Object obj2 = this.f1834b;
        Object obj3 = this.f1836d;
        switch (i14) {
            case 18:
                CoursesActivity coursesActivity = (CoursesActivity) obj3;
                com.garmin.android.apps.connectmobile.courses.model.d dVar = (com.garmin.android.apps.connectmobile.courses.model.d) obj2;
                i50.i iVar = (i50.i) obj;
                int i15 = CoursesActivity.f33039i;
                if (z14) {
                    coursesActivity.ma().B4(new i50.a.d(dVar, iVar));
                }
                break;
            default:
                h10.f fVar = (h10.f) obj3;
                h10.c cVar = (h10.c) obj2;
                GroupDTO groupDTO = (GroupDTO) obj;
                if (!z14) {
                    fVar.f80759g.dismiss();
                } else {
                    int i16 = h10.f.f80752i;
                    fVar.d(cVar, groupDTO.f31558a);
                    h10.f.a aVar = fVar.f80757e;
                    ArrayList arrayList = fVar.f80758f;
                    h10.r rVar = (h10.r) aVar;
                    h10.o oVar = rVar.f80815i;
                    String str = groupDTO.f31558a;
                    oVar.getClass();
                    str.getClass();
                    xy2.b.K(oVar, new h10.m(oVar, str, null)).f(rVar.getViewLifecycleOwner(), new h10.q(rVar, groupDTO, arrayList, 2));
                }
                break;
        }
    }

    @Override // org.apache.commons.lang3.function.FailableSupplier
    public Object get() {
        switch (this.f1833a) {
            case 2:
                return ((FailableBiFunction) this.f1836d).apply(this.f1834b, this.f1835c);
            default:
                return ((Functions.FailableBiFunction) this.f1836d).apply(this.f1834b, this.f1835c);
        }
    }

    @Override // org.apache.commons.lang3.function.FailableBooleanSupplier
    public boolean getAsBoolean() {
        switch (this.f1833a) {
            case 0:
                return ((FailableBiPredicate) this.f1836d).test(this.f1834b, this.f1835c);
            default:
                return ((Functions.FailableBiPredicate) this.f1836d).test(this.f1834b, this.f1835c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r22.c0.b
    public void h(Calendar calendar) {
        int i14 = this.f1833a;
        Object obj = this.f1835c;
        Object obj2 = this.f1834b;
        p005kotlin.jvm.internal.r0 r0Var = (p005kotlin.jvm.internal.r0) this.f1836d;
        switch (i14) {
            case 20:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a aVar = (com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a) obj2;
                p005kotlin.jvm.internal.m0 m0Var = (p005kotlin.jvm.internal.m0) obj;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a.C0766a c0766a = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a.f40578o;
                r0Var.f105810a = calendar;
                LocalDate localDateFromCalendarFields = LocalDate.fromCalendarFields(calendar);
                GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton = aVar.f40582c;
                if (gCMPregnancyTwoLineButton == null) {
                    p005kotlin.jvm.internal.s.m("mPregnancyDateButton");
                    throw null;
                }
                gCMPregnancyTwoLineButton.setButtonValueLabel(DateFormat.getDateInstance(2, Locale.getDefault()).format(new Date(calendar.getTimeInMillis())));
                boolean z14 = m0Var.f105804a;
                db1.m mVar = aVar.f40592m;
                if (z14) {
                    if (mVar == null) {
                        p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
                        throw null;
                    }
                    mVar.q(localDateFromCalendarFields);
                    db1.m mVar2 = aVar.f40592m;
                    if (mVar2 == null) {
                        p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
                        throw null;
                    }
                    mVar2.s(null);
                } else {
                    if (mVar == null) {
                        p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
                        throw null;
                    }
                    mVar.q(null);
                    db1.m mVar3 = aVar.f40592m;
                    if (mVar3 == null) {
                        p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
                        throw null;
                    }
                    mVar3.s(localDateFromCalendarFields);
                }
                androidx.fragment.app.m activity = aVar.getActivity();
                if (activity != null) {
                    activity.invalidateOptionsMenu();
                    return;
                }
                return;
            default:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b bVar = (com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b) obj2;
                p005kotlin.jvm.internal.m0 m0Var2 = (p005kotlin.jvm.internal.m0) obj;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b.a aVar2 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b.f40906o;
                r0Var.f105810a = calendar;
                LocalDate localDateFromCalendarFields2 = LocalDate.fromCalendarFields(calendar);
                GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton2 = bVar.f40910c;
                if (gCMPregnancyTwoLineButton2 == null) {
                    p005kotlin.jvm.internal.s.m("mPregnancyDateButton");
                    throw null;
                }
                gCMPregnancyTwoLineButton2.setButtonValueLabel(DateFormat.getDateInstance(2, Locale.getDefault()).format(new Date(calendar.getTimeInMillis())));
                boolean z15 = m0Var2.f105804a;
                db1.m mVar4 = bVar.f40916i;
                if (z15) {
                    if (mVar4 == null) {
                        p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
                        throw null;
                    }
                    mVar4.q(localDateFromCalendarFields2);
                    db1.m mVar5 = bVar.f40916i;
                    if (mVar5 == null) {
                        p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
                        throw null;
                    }
                    mVar5.s(null);
                } else {
                    if (mVar4 == null) {
                        p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
                        throw null;
                    }
                    mVar4.q(null);
                    db1.m mVar6 = bVar.f40916i;
                    if (mVar6 == null) {
                        p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
                        throw null;
                    }
                    mVar6.s(localDateFromCalendarFields2);
                }
                androidx.fragment.app.m activity2 = bVar.getActivity();
                if (activity2 != null) {
                    activity2.invalidateOptionsMenu();
                    return;
                }
                return;
        }
    }

    @Override // r22.a2.d
    public void i(String str, int i14, int i15, String str2, String str3, int i16) {
        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f fVar = (com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f) this.f1836d;
        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVar = (com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d) this.f1834b;
        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b bVar = (com.garmin.android.apps.connectmobile.activities.advancedactivityediting.b) this.f1835c;
        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.a aVar = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.f28907h;
        Context context = fVar.getContext();
        if (context != null) {
            dVar.getClass();
            bVar.getClass();
            com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c cVar = dVar.f28864b;
            if (cVar != null) {
                int i17 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c.b.f28859a[bVar.ordinal()];
                if (i17 == 1) {
                    com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c.s(cVar, null, Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), 1);
                } else if (i17 == 2) {
                    com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c.q(cVar, null, Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), 1);
                } else {
                    if (i17 != 3) {
                        lc.u0.r();
                        return;
                    }
                    com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c.o(cVar, null, Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), 1);
                }
            }
            dVar.O4(context);
        }
        Double dA4 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d.A4(dVar, "SUMDURATION", bVar, null, bm.n.SUM_DURATION_TO_SUM_DISTANCE, fVar.f28914f, 4);
        if (dA4 != null) {
            Context context2 = fVar.getContext();
            double dDoubleValue = dA4.doubleValue();
            bVar.getClass();
            com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c cVar2 = dVar.f28864b;
            if (cVar2 != null) {
                int i18 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c.b.f28859a[bVar.ordinal()];
                if (i18 == 1) {
                    cVar2.r(dDoubleValue);
                } else if (i18 == 2) {
                    cVar2.p(dDoubleValue);
                } else {
                    if (i18 != 3) {
                        lc.u0.r();
                        return;
                    }
                    cVar2.m(dDoubleValue);
                }
            }
            dVar.N4(context2);
        }
        int i19 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.b.f28916a[bVar.ordinal()];
        if (i19 == 1) {
            ht.a.f85464a.getClass();
            ht.a.a(null, "TimeStartClick");
            dVar.K4(fVar.f28914f, "SUMDURATION", fz.c.TIME);
        } else if (i19 == 2) {
            ht.a.f85464a.getClass();
            ht.a.a(null, "TimeEndClick");
            dVar.J4(fVar.f28914f, "SUMDURATION", fz.c.TIME);
        } else {
            ht.a.f85464a.getClass();
            ht.a.a(null, "TimeTotalClick");
            im.b bVar2 = fVar.f28914f;
            fz.c cVar3 = fz.c.TIME;
            dVar.K4(bVar2, "SUMDURATION", cVar3);
            dVar.J4(fVar.f28914f, "SUMDURATION", cVar3);
        }
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).onTracksChanged((AnalyticsListener.EventTime) this.f1836d, (TrackGroupArray) this.f1834b, (TrackSelectionArray) this.f1835c);
    }

    @Override // com.garmin.android.apps.connectmobile.workouts.presentation.common.list.SpinnerDialogView.d
    public void j(SpinnerDialogView spinnerDialogView, int[] iArr) {
        switch (this.f1833a) {
            case 25:
                p62.r rVar = (p62.r) this.f1836d;
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) this.f1834b;
                e23.l lVar = (e23.l) this.f1835c;
                iArr.getClass();
                rVar.b(j0Var).j(spinnerDialogView, iArr);
                lVar.invoke(j0Var);
                break;
            default:
                p62.f fVar = (p62.f) this.f1836d;
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var2 = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) this.f1834b;
                e23.l lVar2 = (e23.l) this.f1835c;
                iArr.getClass();
                fVar.b(j0Var2).j(spinnerDialogView, iArr);
                lVar2.invoke(j0Var2);
                break;
        }
    }

    @Override // b0.g1.h
    public void l(g1.g gVar) {
        j1.l lVar;
        j1.k.a aVar = (j1.k.a) this.f1836d;
        androidx.camera.core.impl.l0 l0Var = (androidx.camera.core.impl.l0) this.f1834b;
        g1 g1Var = (g1) this.f1835c;
        j1.k kVar = j1.k.this;
        Objects.toString(gVar);
        boolean z14 = l0Var.c().b() == 0;
        j1.j jVar = kVar.f96260d;
        Size size = g1Var.f13906b;
        jVar.getClass();
        Objects.toString(gVar);
        Objects.toString(size);
        jVar.f96248b = gVar.a();
        jVar.f96249c = gVar.b();
        jVar.f96251e = gVar.d();
        jVar.f96247a = size;
        jVar.f96252f = z14;
        jVar.f96253g = gVar.e();
        jVar.f96250d = gVar.c();
        if (gVar.d() == -1 || ((lVar = kVar.f96258b) != null && (lVar instanceof j1.w))) {
            kVar.f96261e = true;
        } else {
            kVar.f96261e = false;
        }
        kVar.b();
    }

    @Override // l52.u
    public void o(l52.i.a aVar) {
        com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var;
        Stack stack = (Stack) this.f1836d;
        com.garmin.android.apps.connectmobile.workouts.data.model.h0 h0Var = (com.garmin.android.apps.connectmobile.workouts.data.model.h0) this.f1834b;
        p005kotlin.jvm.internal.p0 p0Var = (p005kotlin.jvm.internal.p0) this.f1835c;
        com.garmin.android.apps.connectmobile.workouts.data.model.h0.a aVar2 = com.garmin.android.apps.connectmobile.workouts.data.model.h0.f48185j;
        while (true) {
            try {
                if (stack.size() > 1) {
                    com.garmin.android.apps.connectmobile.workouts.data.model.h0.c cVar = (com.garmin.android.apps.connectmobile.workouts.data.model.h0.c) stack.peek();
                    l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar3 = cVar.f48195a;
                    if (aVar3 != null) {
                        com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var2 = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar3.getData();
                        m52.g gVar = j0Var2 != null ? j0Var2.f48232q : null;
                        if (h0Var.f48193h.f116768d == nv.SWIMMING && gVar != null && gVar == m52.g.NONE && (j0Var = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar3.getData()) != null) {
                            j0Var.f48232q = null;
                        }
                    }
                    if (aVar3 == null || aVar3.d(aVar)) {
                        break;
                        break;
                    }
                    stack.pop();
                    com.garmin.android.apps.connectmobile.workouts.data.model.h0.c cVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.h0.c) stack.peek();
                    com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var3 = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar3.getData();
                    if (j0Var3 != null) {
                        int i14 = p0Var.f105807a;
                        int i15 = cVar2.f48197c;
                        cVar2.f48197c = i15 + 1;
                        j0Var3.f48215a = i14 + i15;
                    }
                    p0Var.f105807a++;
                    com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var4 = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar3.getData();
                    JSONObject jSONObjectK = j0Var4 != null ? j0Var4.k() : null;
                    if (jSONObjectK != null) {
                        jSONObjectK.putOpt("workoutSteps", cVar.f48196b);
                    }
                    cVar2.f48196b.put(jSONObjectK);
                } else {
                    break;
                }
            } catch (JSONException unused) {
                return;
            }
        }
        if (!aVar.k()) {
            stack.push(new com.garmin.android.apps.connectmobile.workouts.data.model.h0.c(aVar));
            return;
        }
        com.garmin.android.apps.connectmobile.workouts.data.model.h0.c cVar3 = (com.garmin.android.apps.connectmobile.workouts.data.model.h0.c) stack.peek();
        com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var5 = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar.getData();
        if (j0Var5 != null) {
            int i16 = p0Var.f105807a;
            int i17 = cVar3.f48197c;
            cVar3.f48197c = i17 + 1;
            j0Var5.f48215a = i16 + i17;
        }
        p0Var.f105807a++;
        JSONArray jSONArray = cVar3.f48196b;
        com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var6 = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar.getData();
        jSONArray.put(j0Var6 != null ? j0Var6.k() : null);
    }

    @Override // com.google.androidbrowserhelper.trusted.splashscreens.SplashImageTransferTask.Callback
    public void onFinished(boolean z14) {
        ((PwaWrapperSplashScreenStrategy) this.f1836d).lambda$configureTwaBuilder$0((androidx.browser.trusted.i) this.f1834b, (Runnable) this.f1835c, z14);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((RolloutsStateSubscriptionsHandler) this.f1836d).lambda$registerRolloutsStateSubscriber$1((Task) this.f1834b, (RolloutsStateSubscriber) this.f1835c, (ConfigContainer) obj);
    }

    @Override // com.mapbox.maps.SnapshotCompleteCallback, com.mapbox.maps.QueryRenderedFeaturesCallback
    public void run(Expected expected) {
        switch (this.f1833a) {
            case 13:
                Snapshotter.start$lambda$17((Snapshotter) this.f1836d, (SnapshotResultCallback) this.f1834b, (SnapshotOverlayCallback) this.f1835c, expected);
                break;
            default:
                AnnotationManagerImpl.queryMapForFeatures$lambda$28$lambda$27((AnnotationManagerImpl) this.f1836d, (CountDownLatch) this.f1834b, (p005kotlin.jvm.internal.r0) this.f1835c, expected);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f1833a) {
            case 9:
                return CrashlyticsTasks.lambda$race$0((TaskCompletionSource) this.f1836d, (AtomicBoolean) this.f1834b, (CancellationTokenSource) this.f1835c, task);
            case 10:
                return ((FirebaseRemoteConfig) this.f1836d).lambda$activate$2((Task) this.f1834b, (Task) this.f1835c, task);
            default:
                return ((ConfigRealtimeHttpClient) this.f1836d).lambda$createRealtimeConnection$0((Task) this.f1834b, (Task) this.f1835c, task);
        }
    }

    @Override // org.apache.commons.lang3.function.FailableRunnable
    public void run() {
        switch (this.f1833a) {
            case 1:
                ((FailableBiConsumer) this.f1836d).accept(this.f1834b, this.f1835c);
                break;
            default:
                ((Functions.FailableBiConsumer) this.f1836d).accept(this.f1834b, this.f1835c);
                break;
        }
    }

    @Override // com.mapbox.bindgen.Expected.Action
    public void run(Object obj) {
        LayerPositionAwareNode.DefaultImpls.repositionLayersForCurrentNode$lambda$1((List) this.f1836d, (LayerPosition) this.f1834b, (MapboxStyleManager) this.f1835c, (String) obj);
    }
}
