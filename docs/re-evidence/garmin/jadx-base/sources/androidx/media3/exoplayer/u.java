package androidx.media3.exoplayer;

import android.hardware.camera2.CaptureRequest;
import android.media.Image;
import android.media.ImageWriter;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.InReachSubscriptionReminder;
import com.garmin.android.apps.connectmobile.training.atp.dashboard.EditTabBarActivity;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow;
import com.garmin.android.apps.connectmobile.workouts.presentation.view.SwipeToOptions;
import com.garmin.proto.generated.GDIHandCalibration;
import com.garmin.proto.generated.GDIHandCalibrationExtension;
import com.garmin.proto.generated.GDISmartProto;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.common.util.concurrent.ListenableFuture;
import com.mapbox.maps.MapView;
import com.mapbox.maps.StyleLoaded;
import com.mapbox.maps.StyleLoadedCallback;
import com.mapbox.maps.plugin.annotation.AnnotationConfig;
import com.mapbox.maps.plugin.annotation.AnnotationPlugin;
import com.mapbox.maps.plugin.annotation.AnnotationSourceOptions;
import com.mapbox.maps.plugin.annotation.AnnotationsUtils;
import com.mapbox.maps.plugin.annotation.generated.PointAnnotationManager;
import com.mapbox.maps.plugin.annotation.generated.PointAnnotationManagerKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Stack;
import java.util.concurrent.Executor;
import l0.e;
import p005kotlin.Unit;
import r22.a2;
import v.r2;
import v.s2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements fa.j.a, a2.d, SynchronizationGuard.CriticalSection, ListenerSet.Event, GCMCheckableRow.b, q03.u, SwipeToOptions.b, l52.u, StyleLoadedCallback, l0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9696d;

    public /* synthetic */ u(int i14, androidx.media3.common.z.e eVar, androidx.media3.common.z.e eVar2) {
        this.f9693a = 0;
        this.f9694b = i14;
        this.f9695c = eVar;
        this.f9696d = eVar2;
    }

    @Override // com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow.b
    public void a(View view2, boolean z14) {
        switch (this.f9693a) {
            case 4:
                EditTabBarActivity editTabBarActivity = (EditTabBarActivity) this.f9695c;
                ArrayList arrayList = (ArrayList) this.f9696d;
                if (!z14) {
                    TextView textView = editTabBarActivity.f45354b;
                    if (textView == null) {
                        p005kotlin.jvm.internal.s.m("footer");
                        throw null;
                    }
                    textView.setVisibility(8);
                    Button button = editTabBarActivity.f45355c;
                    if (button != null) {
                        button.setVisibility(8);
                        return;
                    } else {
                        p005kotlin.jvm.internal.s.m("replaceButton");
                        throw null;
                    }
                }
                for (GCMCheckableRow gCMCheckableRow : editTabBarActivity.f45353a) {
                    if (!p005kotlin.jvm.internal.s.g(gCMCheckableRow, view2)) {
                        gCMCheckableRow.c(false);
                    }
                }
                TextView textView2 = editTabBarActivity.f45354b;
                if (textView2 == null) {
                    p005kotlin.jvm.internal.s.m("footer");
                    throw null;
                }
                String str = EditTabBarActivity.f45352f;
                if (str == null) {
                    p005kotlin.jvm.internal.s.m("newItem");
                    throw null;
                }
                textView2.setText(str.equals("PREGNANCY") ? "" : editTabBarActivity.getString(R.string.msg_tab_bar_item_replacement_info, arrayList.get(this.f9694b)));
                TextView textView3 = editTabBarActivity.f45354b;
                if (textView3 == null) {
                    p005kotlin.jvm.internal.s.m("footer");
                    throw null;
                }
                textView3.setVisibility(0);
                Button button2 = editTabBarActivity.f45355c;
                if (button2 != null) {
                    button2.setVisibility(0);
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("replaceButton");
                    throw null;
                }
            default:
                d10.j jVar = (d10.j) this.f9695c;
                d10.h.a aVar = (d10.h.a) this.f9696d;
                int i14 = this.f9694b;
                jVar.f57039a = i14;
                aVar.f57035a.setEnabled(false);
                jVar.t(i14);
                jVar.notifyDataSetChanged();
                return;
        }
    }

    @Override // l0.a
    public ListenableFuture apply(Object obj) throws Exception {
        int i14;
        androidx.camera.core.e eVarA;
        ImageWriter imageWriter;
        v.a0.d dVar = (v.a0.d) this.f9695c;
        List<androidx.camera.core.impl.v0> list = (List) this.f9696d;
        v.l lVar = dVar.f173646d;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (androidx.camera.core.impl.v0 v0Var : list) {
            androidx.camera.core.impl.v0.a aVarF = androidx.camera.core.impl.v0.a.f(v0Var);
            androidx.camera.core.impl.c0 c0Var = null;
            if (v0Var.f5815c == 5) {
                s2 s2Var = lVar.f173889m;
                if (!s2Var.f174073e && !s2Var.f174072d) {
                    try {
                        eVarA = s2Var.f174071c.a();
                    } catch (NoSuchElementException unused) {
                        eVarA = null;
                    }
                    if (eVarA != null) {
                        s2.a aVar = lVar.f173889m.f174078j;
                        if (aVar != null) {
                            Image image = eVarA.getImage();
                            if (aVar.f174080b.get() && (imageWriter = aVar.f174079a) != null && image != null) {
                                try {
                                    imageWriter.queueInputImage(image);
                                    ImageWriter imageWriter2 = aVar.f174079a;
                                    final r2 r2Var = new r2(eVarA);
                                    final Executor executor = aVar.f174081c;
                                    imageWriter2.setOnImageReleasedListener(new ImageWriter.OnImageReleasedListener() { // from class: n0.a
                                        @Override // android.media.ImageWriter.OnImageReleasedListener
                                        public final void onImageReleased(ImageWriter imageWriter3) {
                                            executor.execute(new e(8, r2Var, imageWriter3));
                                        }
                                    }, j0.p.a());
                                    b0.m0 m0VarA0 = eVarA.A0();
                                    if (m0VarA0 instanceof m0.b) {
                                        c0Var = ((m0.b) m0VarA0).f115491a;
                                    }
                                } catch (IllegalStateException e4) {
                                    e4.getMessage();
                                }
                            }
                        }
                        if (c0Var == null) {
                            eVarA.close();
                        }
                    }
                }
            }
            if (c0Var != null) {
                aVarF.f5828h = c0Var;
            } else {
                if (dVar.f173643a != 3 || dVar.f173648f) {
                    int i15 = v0Var.f5815c;
                    i14 = (i15 == -1 || i15 == 5) ? 2 : -1;
                } else {
                    i14 = 4;
                }
                if (i14 != -1) {
                    aVarF.f5823c = i14;
                }
            }
            y.m mVar = dVar.f173647e;
            if (mVar.f192952b && this.f9694b == 0 && mVar.f192951a) {
                u.a.C3144a c3144a = new u.a.C3144a();
                c3144a.c(CaptureRequest.CONTROL_AE_MODE, 3);
                aVarF.c(c3144a.a());
            }
            androidx.concurrent.futures.b.a aVar2 = new androidx.concurrent.futures.b.a();
            androidx.concurrent.futures.b.d<T> dVar2 = new androidx.concurrent.futures.b.d<>(aVar2);
            aVar2.f6080b = dVar2;
            aVar2.f6079a = v.h.class;
            try {
                aVarF.b(new v.c0(dVar, aVar2));
                aVar2.f6079a = "submitStillCapture";
            } catch (Exception e14) {
                dVar2.a(e14);
            }
            arrayList.add(dVar2);
            arrayList2.add(aVarF.e());
        }
        lVar.A(arrayList2);
        return l0.j.b(arrayList);
    }

    @Override // q03.u
    public void c(e13.a.C1312a c1312a) {
        com.garmin.android.apps.connectmobile.handalignment.f fVar = (com.garmin.android.apps.connectmobile.handalignment.f) this.f9695c;
        GDIHandCalibration.HandType handType = (GDIHandCalibration.HandType) this.f9696d;
        com.garmin.android.apps.connectmobile.handalignment.f.a aVar = com.garmin.android.apps.connectmobile.handalignment.f.f36613h;
        com.garmin.android.apps.connectmobile.handalignment.b bVar = com.garmin.android.apps.connectmobile.handalignment.b.f36607a;
        long j8 = fVar.f36615a;
        com.garmin.android.apps.connectmobile.handalignment.f.h hVar = new com.garmin.android.apps.connectmobile.handalignment.f.h(c1312a, fVar);
        bVar.getClass();
        handType.getClass();
        wm2.a aVarA = com.garmin.android.apps.connectmobile.handalignment.b.a(j8);
        if (aVarA != null) {
            GDISmartProto.Smart.Builder builderNewBuilder = GDISmartProto.Smart.newBuilder();
            builderNewBuilder.getClass();
            GDIHandCalibration.HandCalibrationService.Builder builderNewBuilder2 = GDIHandCalibration.HandCalibrationService.newBuilder();
            GDIHandCalibration.StepRequest.Builder builderNewBuilder3 = GDIHandCalibration.StepRequest.newBuilder();
            builderNewBuilder3.setHandType(handType);
            int i14 = this.f9694b;
            builderNewBuilder3.setHandDir(i14 > 0 ? GDIHandCalibration.HandDirection.CLOCKWISE : GDIHandCalibration.HandDirection.COUNTERCLOCKWISE);
            builderNewBuilder3.setHandSteps(Math.abs(i14));
            builderNewBuilder2.setStepRequest(builderNewBuilder3.build());
            GDIHandCalibration.HandCalibrationService handCalibrationServiceBuild = builderNewBuilder2.build();
            handCalibrationServiceBuild.getClass();
            builderNewBuilder.setExtension(GDIHandCalibrationExtension.handCalibrationService, handCalibrationServiceBuild);
            GDISmartProto.Smart smartBuild = builderNewBuilder.build();
            smartBuild.getClass();
            aVarA.initiateRequest(smartBuild, j8, new com.garmin.android.apps.connectmobile.handalignment.d(hVar));
        }
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        return ((Uploader) this.f9695c).lambda$upload$0((TransportContext) this.f9696d, this.f9694b);
    }

    @Override // r22.a2.d
    public void i(String str, int i14, int i15, String str2, String str3, int i16) {
        InReachSubscriptionReminder.handleClick$lambda$0((mg1.a) this.f9695c, this.f9694b, (e23.a) this.f9696d, i14, i15, i16, str, str2, str3);
    }

    @Override // fa.j.a
    public void invoke(Object obj) {
        int i14 = this.f9693a;
        int i15 = this.f9694b;
        Object obj2 = this.f9696d;
        Object obj3 = this.f9695c;
        switch (i14) {
            case 0:
                androidx.media3.common.z.d dVar = (androidx.media3.common.z.d) obj;
                int i16 = v.f9731j0;
                dVar.getClass();
                dVar.a6(i15, (androidx.media3.common.z.e) obj3, (androidx.media3.common.z.e) obj2);
                break;
            default:
                ((AnalyticsListener) obj).onMediaItemTransition((AnalyticsListener.EventTime) obj3, (MediaItem) obj2, i15);
                break;
        }
    }

    @Override // l52.u
    public void o(l52.i.a aVar) {
        Stack stack = (Stack) this.f9695c;
        Parcel parcel = (Parcel) this.f9696d;
        Parcelable.Creator<l52.m<Parcelable>> creator = l52.m.CREATOR;
        while (!stack.isEmpty() && !((l52.f) stack.peek()).d(aVar)) {
            parcel.writeByte((byte) 2);
            stack.pop();
        }
        boolean z14 = aVar instanceof l52.f.b;
        int i14 = this.f9694b;
        if (z14) {
            parcel.writeByte((byte) 0);
            l52.f.b bVar = (l52.f.b) aVar;
            parcel.writeParcelable(bVar.f110254e, i14);
            parcel.writeSerializable(bVar.f110247a);
            return;
        }
        if (aVar instanceof l52.f.a) {
            parcel.writeByte((byte) 1);
            l52.f.a aVar2 = (l52.f.a) aVar;
            parcel.writeParcelable(aVar2.f110251e, i14);
            parcel.writeSerializable(aVar2.f110247a);
            parcel.writeSerializable(aVar2.f110252f.f110247a);
            stack.push(aVar);
        }
    }

    @Override // com.mapbox.maps.StyleLoadedCallback
    public void run(StyleLoaded styleLoaded) {
        ne2.s sVar = (ne2.s) this.f9695c;
        List list = (List) this.f9696d;
        styleLoaded.getClass();
        HashMap<Integer, PointAnnotationManager> map = sVar.f125707y;
        ArrayList<qe2.a> arrayList = sVar.E;
        int i14 = this.f9694b;
        if (map.get(Integer.valueOf(i14)) == null) {
            MapView mapView = sVar.f125704v;
            AnnotationPlugin annotations = mapView != null ? AnnotationsUtils.getAnnotations(mapView) : null;
            PointAnnotationManager pointAnnotationManagerCreatePointAnnotationManager = annotations != null ? PointAnnotationManagerKt.createPointAnnotationManager(annotations, new AnnotationConfig(null, null, null, new AnnotationSourceOptions(null, null, null, null, ne2.v.c(sVar, i14), 15, null), 7, null)) : null;
            if (pointAnnotationManagerCreatePointAnnotationManager != null) {
                pointAnnotationManagerCreatePointAnnotationManager.addClusterClickListener(new ne2.d(sVar));
                map.put(Integer.valueOf(i14), pointAnnotationManagerCreatePointAnnotationManager);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    com.garmin.android.library.mapsdkadapter.p pVar = (com.garmin.android.library.mapsdkadapter.p) obj;
                    if (arrayList == null || !arrayList.isEmpty()) {
                        Iterator<qe2.a> it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                qe2.a next = it.next();
                                if (p005kotlin.jvm.internal.s.g(pVar.f50327a.f50309a, next.getF125696a().f50327a.f50309a) && p005kotlin.jvm.internal.s.g(pVar.f50327a.f50320l, next.getF125696a().f50327a.f50320l)) {
                                    break;
                                }
                            }
                        }
                    }
                    arrayList2.add(obj);
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    com.garmin.android.library.mapsdkadapter.p pVar2 = new com.garmin.android.library.mapsdkadapter.p((com.garmin.android.library.mapsdkadapter.p) it3.next());
                    arrayList.add(new ne2.o(pVar2, Integer.valueOf(i14)));
                    pointAnnotationManagerCreatePointAnnotationManager.setIconImage("cluster_icon_tag");
                    pointAnnotationManagerCreatePointAnnotationManager.create(ne2.x.a(pVar2, sVar.f125702r));
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public /* synthetic */ u(Object obj, int i14, Object obj2, int i15) {
        this.f9693a = i15;
        this.f9695c = obj;
        this.f9694b = i14;
        this.f9696d = obj2;
    }

    public /* synthetic */ u(Object obj, Object obj2, int i14, int i15) {
        this.f9693a = i15;
        this.f9695c = obj;
        this.f9696d = obj2;
        this.f9694b = i14;
    }
}
