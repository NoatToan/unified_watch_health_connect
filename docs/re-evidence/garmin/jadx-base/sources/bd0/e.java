package bd0;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.ScrollView;
import androidx.core.view.m1;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import c22.l3;
import c22.m3;
import ch1.a5;
import ch1.d2;
import ch1.m2;
import ch1.w3;
import ch1.x2;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.k2;
import com.garmin.android.apps.connectmobile.segments.presentation.SegmentDetailsActivity;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.android.apps.connectmobile.z1;
import com.github.mikephil.chartingv2.utils.Utils;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.exoplayer2.extractor.BinarySearchSeeker;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.trackselection.RandomTrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelectionUtil;
import com.google.android.exoplayer2.video.VideoFrameReleaseHelper;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.carousel.MaskableFrameLayout;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.CrashlyticsRemoteConfigListener;
import com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy;
import com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import gg1.o0;
import o53.c2;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements com.garmin.android.apps.connectmobile.devices.setup.d.b, vm2.b, androidx.core.view.z, jw.t, SwipeRefreshLayout.e, xg1.c, fb2.b0.a, u03.d, SwipeRefreshLayout.f, g22.j, SynchronizationGuard.CriticalSection, BinarySearchSeeker.SeekTimestampConverter, TrackSelectionUtil.AdaptiveTrackSelectionFactory, VideoFrameReleaseHelper.DisplayHelper.Listener, l7.h, CanvasCompat.CanvasOperation, Deferred.DeferredHandler, Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17557b;

    public /* synthetic */ e(d2 d2Var, zk0.h hVar) {
        this.f17556a = 6;
        this.f17557b = hVar;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public void M7() {
        ((com.garmin.android.apps.connectmobile.k0) this.f17557b).da();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.e
    public boolean a(SwipeRefreshLayout swipeRefreshLayout) {
        SegmentDetailsActivity segmentDetailsActivity = (SegmentDetailsActivity) this.f17557b;
        SegmentDetailsActivity.a aVar = SegmentDetailsActivity.Z;
        ScrollView scrollView = (ScrollView) segmentDetailsActivity.findViewById(R.id.segment_details_scroll_view);
        if (scrollView != null) {
            return scrollView.canScrollVertically(-1);
        }
        return false;
    }

    @Override // u03.d
    public void accept(Object obj) {
        int i14 = this.f17556a;
        Object obj2 = this.f17557b;
        switch (i14) {
            case 11:
                com.garmin.androiddynamicsettings.app.presentationlayer.b.a aVar = com.garmin.androiddynamicsettings.app.presentationlayer.b.f50687j;
                ((ci2.e) obj2).invoke(obj);
                break;
            default:
                GarminConnectMobileApp.a aVar2 = GarminConnectMobileApp.f28685g;
                ((ch1.f) obj2).invoke(obj);
                break;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.devices.setup.d.b
    public void b() {
        switch (this.f17556a) {
            case 0:
                a0.h hVar = (a0.h) this.f17557b;
                ((cd0.c) hVar.f34b).s(-1, false, null, (Intent) hVar.f35c);
                break;
            default:
                cd0.e0 e0Var = (cd0.e0) this.f17557b;
                e0Var.s(-1, false, null, null);
                e0Var.f26817e.o((Activity) e0Var.f26813a, e0Var.f26814b);
                break;
        }
    }

    @Override // vm2.b
    public void cancel() {
        c2 c2Var = (c2) this.f17557b;
        int i14 = e0.f17558i;
        c2Var.c(null);
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelectionUtil.AdaptiveTrackSelectionFactory
    public ExoTrackSelection createAdaptiveTrackSelection(ExoTrackSelection.Definition definition) {
        return ((RandomTrackSelection.Factory) this.f17557b).lambda$createTrackSelections$0(definition);
    }

    @Override // jw.t
    public void d(String str) {
        cc0.a aVar = (cc0.a) this.f17557b;
        aVar.b(new jw.d(aVar, str));
        UserSettingsDTO userSettingsDTO = new UserSettingsDTO();
        userSettingsDTO.m(str);
        com.garmin.android.library.backgroundtaskmanagement.b.e eVar = com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE;
        dc0.a aVar2 = (dc0.a) aVar.f50097g.get(eVar);
        aVar2.f59107b = userSettingsDTO;
        aVar.i(eVar, aVar2);
    }

    @Override // fb2.b0.a
    public void e(Object obj) {
        switch (this.f17556a) {
            case 8:
                x2.z((x2) this.f17557b, (Boolean) obj);
                break;
            case 9:
                w3.p((w3) this.f17557b, obj);
                break;
            default:
                a5.p((a5) this.f17557b, obj);
                break;
        }
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        switch (this.f17556a) {
            case 17:
                return Integer.valueOf(((EventStore) this.f17557b).cleanUp());
            case 18:
                return ((ClientHealthMetricsStore) this.f17557b).loadClientMetrics();
            case 19:
                return ((Uploader) this.f17557b).lambda$logAndUpdateState$6();
            default:
                return ((WorkInitializer) this.f17557b).lambda$ensureContextsScheduled$0();
        }
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void handle(Provider provider) {
        switch (this.f17556a) {
            case 27:
                ((CrashlyticsNativeComponentDeferredProxy) this.f17557b).lambda$new$0(provider);
                break;
            default:
                RemoteConfigDeferredProxy.lambda$setupListener$0((CrashlyticsRemoteConfigListener) this.f17557b, provider);
                break;
        }
    }

    @Override // xg1.c
    public xg1.s l() {
        int i14 = this.f17556a;
        Object obj = this.f17557b;
        switch (i14) {
            case 6:
                zk0.h hVar = (zk0.h) obj;
                int i15 = d2.f27318g;
                return ((zb0.d0) KoinJavaComponent.get(zb0.d0.class)).S(hVar.C() > -1 ? Double.valueOf(hVar.C()) : Double.valueOf(Double.NaN));
            default:
                com.garmin.android.apps.connectmobile.devices.model.f fVar = (com.garmin.android.apps.connectmobile.devices.model.f) obj;
                int i16 = m2.f27415e;
                xg1.g.a aVar = xg1.g.f190896b;
                double dK0 = fVar.k0();
                boolean zG = p005kotlin.jvm.internal.s.g(fVar.o0(), o0.METRIC.f77291a);
                aVar.getClass();
                Bundle bundle = new Bundle();
                xg1.g gVar = new xg1.g();
                if (zG) {
                    bundle.putInt("length", (int) dK0);
                    bundle.putInt("minValue", 14);
                } else {
                    l3.a aVar2 = l3.f23124b;
                    m3 m3Var = m3.METER;
                    m3 m3Var2 = m3.YARD;
                    aVar2.getClass();
                    bundle.putInt("length", (int) l3.a.g(dK0, m3Var, m3Var2));
                    bundle.putInt("minValue", 15);
                }
                gVar.setArguments(bundle);
                return gVar;
        }
    }

    @Override // androidx.core.view.z
    public m1 onApplyWindowInsets(View view2, m1 m1Var) {
        int i14 = this.f17556a;
        Object obj = this.f17557b;
        switch (i14) {
            case 2:
                int i15 = bm.q.D;
                ((bm.q) obj).f134442b.setExtraLeftOffset(Utils.convertPixelsToDp(m1Var.f6508a.i(130).f25190a));
                return m1Var;
            case 14:
                return z1.lambda$applyBottomInsets$1((k2) obj, view2, m1Var);
            default:
                return ((z1) obj).lambda$applyBottomContentInsets$3(view2, m1Var);
        }
    }

    @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper.Listener
    public void onDefaultDisplayChanged(Display display) {
        ((VideoFrameReleaseHelper) this.f17557b).updateDefaultDisplayRefreshRateParams(display);
    }

    @Override // l7.h
    public boolean perform(View view2, l7.h.a aVar) {
        return ((BottomSheetDragHandleView) this.f17557b).lambda$onBottomSheetStateChanged$0(view2, aVar);
    }

    @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
    public void run(Canvas canvas) {
        switch (this.f17556a) {
            case 25:
                ((MaskableFrameLayout) this.f17557b).lambda$dispatchDraw$1(canvas);
                break;
            default:
                ((NavigationView) this.f17557b).lambda$dispatchDraw$0(canvas);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return Boolean.valueOf(((SessionReportingCoordinator) this.f17557b).onReportSendComplete(task));
    }

    @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekTimestampConverter
    public long timeUsToTargetTime(long j8) {
        return ((FlacStreamMetadata) this.f17557b).getSampleNumber(j8);
    }

    public /* synthetic */ e(Object obj, int i14) {
        this.f17556a = i14;
        this.f17557b = obj;
    }
}
