package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.garmin.android.apps.connectmobile.courses.presentation.list.CoursesActivity;
import com.garmin.android.apps.connectmobile.q1;
import com.garmin.android.apps.connectmobile.settings.devices.wifi.GCMWiFiNetworksActivity;
import com.garmin.android.apps.connectmobile.training.atp.dashboard.TrainingPlanDashboardActivity;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import hc0.k;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import l0.e;
import l0.h;
import l0.j;
import p005kotlin.jvm.internal.s;
import sd2.f;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class a implements SynchronizationGuard.CriticalSection, ListenerSet.Event, Continuation, q1.a, androidx.concurrent.futures.b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f52841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f52842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f52843d;

    public /* synthetic */ a(Object obj, long j8, Object obj2, int i14) {
        this.f52840a = i14;
        this.f52842c = obj;
        this.f52841b = j8;
        this.f52843d = obj2;
    }

    @Override // androidx.concurrent.futures.b.c
    public Object d(androidx.concurrent.futures.b.a aVar) {
        switch (this.f52840a) {
            case 6:
                androidx.concurrent.futures.b.d dVar = (androidx.concurrent.futures.b.d) this.f52842c;
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f52843d;
                j.g(dVar, aVar);
                if (!dVar.f6084b.isDone()) {
                    final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new e(0, aVar, dVar), this.f52841b, TimeUnit.MILLISECONDS);
                    final int i14 = 0;
                    dVar.addListener(new Runnable() { // from class: l0.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i15 = i14;
                            ScheduledFuture scheduledFuture = scheduledFutureSchedule;
                            switch (i15) {
                                case 0:
                                    j.a aVar2 = j.f107810a;
                                    scheduledFuture.cancel(true);
                                    break;
                                default:
                                    j.a aVar3 = j.f107810a;
                                    scheduledFuture.cancel(true);
                                    break;
                            }
                        }
                    }, k0.b.a());
                }
                return "TimeoutFuture[" + dVar + "]";
            default:
                ListenableFuture listenableFuture = (ListenableFuture) this.f52842c;
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.f52843d;
                j.g(listenableFuture, aVar);
                if (!listenableFuture.isDone()) {
                    long j8 = this.f52841b;
                    final ScheduledFuture scheduledFutureSchedule2 = scheduledExecutorService2.schedule(new h(aVar, listenableFuture, j8, 0), j8, TimeUnit.MILLISECONDS);
                    final int i15 = 1;
                    listenableFuture.addListener(new Runnable() { // from class: l0.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i16 = i15;
                            ScheduledFuture scheduledFuture = scheduledFutureSchedule2;
                            switch (i16) {
                                case 0:
                                    j.a aVar2 = j.f107810a;
                                    scheduledFuture.cancel(true);
                                    break;
                                default:
                                    j.a aVar3 = j.f107810a;
                                    scheduledFuture.cancel(true);
                                    break;
                            }
                        }
                    }, k0.b.a());
                }
                return "TimeoutFuture[" + listenableFuture + "]";
        }
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        return ((Uploader) this.f52842c).lambda$logAndUpdateState$8((TransportContext) this.f52843d, this.f52841b);
    }

    @Override // com.garmin.android.apps.connectmobile.q1.a
    public void g(boolean z14) {
        int i14 = this.f52840a;
        long j8 = this.f52841b;
        Object obj = this.f52843d;
        Object obj2 = this.f52842c;
        switch (i14) {
            case 3:
                TrainingPlanDashboardActivity trainingPlanDashboardActivity = (TrainingPlanDashboardActivity) obj2;
                xw1.j jVar = (xw1.j) obj;
                if (!z14) {
                    TrainingPlanDashboardActivity.a aVar = TrainingPlanDashboardActivity.f45383n;
                    return;
                }
                zt1.h hVar = trainingPlanDashboardActivity.f45386g;
                if (hVar != null) {
                    hVar.B(Long.valueOf(j8), jVar);
                    return;
                } else {
                    s.m("presenter");
                    throw null;
                }
            case 4:
                CoursesActivity coursesActivity = (CoursesActivity) obj2;
                String str = (String) obj;
                int i15 = CoursesActivity.f33039i;
                if (z14) {
                    coursesActivity.ma().B4(new i50.a.m(str, j8));
                    return;
                } else {
                    coursesActivity.ma().B4(new i50.a.s(Long.parseLong(str), j8));
                    return;
                }
            default:
                k kVar = (k) obj2;
                gc0.e eVar = (gc0.e) obj;
                kVar.getClass();
                if (z14) {
                    f fVar = eVar.f76845a;
                    String productNumber = fVar.getProductNumber();
                    String productDisplayName = fVar.getProductDisplayName();
                    GCMWiFiNetworksActivity.f43245f.h(kVar.requireActivity(), -1, this.f52841b, productNumber, productDisplayName, fVar.getImageURL(), true);
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).onRenderedFirstFrame((AnalyticsListener.EventTime) this.f52842c, this.f52843d, this.f52841b);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((ConfigFetchHandler) this.f52842c).lambda$fetch$0(this.f52841b, (HashMap) this.f52843d, task);
    }

    public /* synthetic */ a(Object obj, Object obj2, long j8, int i14) {
        this.f52840a = i14;
        this.f52842c = obj;
        this.f52843d = obj2;
        this.f52841b = j8;
    }
}
