package qw0;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.map.GCMMapView;
import org.xmlpull.v1.XmlPullParser;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lqw0/a;", "Landroidx/fragment/app/Fragment;", "", "Lcom/garmin/android/library/mapsdkadapter/i$l;", "Lcom/garmin/android/library/mapsdkadapter/i$g;", "<init>", "()V", "a", "gcm-map_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a extends Fragment implements com.garmin.android.library.mapsdkadapter.i.l, com.garmin.android.library.mapsdkadapter.i.g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f148289g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f148290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GCMMapView f148291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FrameLayout f148292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FrameLayout f148293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public qe2.h f148294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f148295f = 1;

    static {
        new C2795a(null);
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.l
    public final void O5(com.garmin.android.library.mapsdkadapter.i.d dVar) {
        dVar.getClass();
        GCMMapView gCMMapView = this.f148291b;
        if (gCMMapView != null) {
            gCMMapView.c();
            gCMMapView.setOnClickListener(new pm0.h(7, dVar, this));
        }
    }

    /* JADX INFO: renamed from: getMap, reason: from getter */
    public final qe2.h getF148294e() {
        return this.f148294e;
    }

    public void h1(com.garmin.android.library.mapsdkadapter.i iVar) {
        w6();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        this.f148290a = (int) TypedValue.applyDimension(1, 40.0f, context.getResources().getDisplayMetrics());
    }

    public void onCameraIdle() {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate((XmlPullParser) getResources().getLayout(R.layout.gcm_map_fragment), viewGroup, false);
        viewInflate.getClass();
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        this.f148292c = (FrameLayout) constraintLayout.findViewById(R.id.map_legend_container);
        this.f148293d = (FrameLayout) constraintLayout.findViewById(R.id.polyline_legend_container);
        GCMMapView gCMMapView = (GCMMapView) constraintLayout.findViewById(R.id.mapView);
        ie2.l lVar = new ie2.l(0, false, null, 0.0f, null, null, null, null, null, null, null, null, 4095, null);
        lVar.f93147l = Integer.valueOf(this.f148295f);
        gCMMapView.f(null, null, lVar, this);
        gCMMapView.onCreate(bundle);
        this.f148294e = gCMMapView.getMapProxy();
        this.f148291b = gCMMapView;
        return constraintLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        GCMMapView gCMMapView = this.f148291b;
        if (gCMMapView != null) {
            gCMMapView.onDestroy();
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        GCMMapView gCMMapView = this.f148291b;
        if (gCMMapView != null) {
            gCMMapView.onLowMemory();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        GCMMapView gCMMapView = this.f148291b;
        if (gCMMapView != null) {
            gCMMapView.onPause();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        GCMMapView gCMMapView = this.f148291b;
        if (gCMMapView != null) {
            if (gCMMapView.getMapAdapter().L()) {
                gCMMapView.onResume();
                return;
            }
            gCMMapView.c();
            androidx.fragment.app.m mVarRequireActivity = requireActivity();
            mVarRequireActivity.getClass();
            Dialog dialogG = gCMMapView.getMapAdapter().G(mVarRequireActivity);
            if (dialogG != null) {
                dialogG.show();
            }
        }
    }

    public final void u6(com.garmin.android.library.mapsdkadapter.e eVar, int i14) {
        qe2.h hVar;
        if (eVar == null || (hVar = this.f148294e) == null) {
            return;
        }
        hVar.c(eVar, i14);
    }

    public final void v6(com.garmin.android.library.mapsdkadapter.f fVar, int i14) {
        qe2.h hVar;
        if (fVar == null || (hVar = this.f148294e) == null) {
            return;
        }
        hVar.V(fVar, i14, -1);
    }

    public void w6() {
        i2.a.c(i2.f36769a, "GCMAbstractMapFragment", "initMapUISettings()");
        qe2.h hVar = this.f148294e;
        ie2.k uiSettings = hVar != null ? hVar.f144584a.getUiSettings() : null;
        if (uiSettings != null) {
            uiSettings.setAllGesturesEnabled(true);
        }
        if (uiSettings != null) {
            uiSettings.b();
        }
        if (uiSettings != null) {
            uiSettings.setRotateGesturesEnabled(true);
        }
        if (uiSettings != null) {
            uiSettings.setScrollGesturesEnabled(true);
        }
        if (uiSettings != null) {
            uiSettings.setTiltGesturesEnabled(true);
        }
        if (uiSettings != null) {
            uiSettings.setZoomControlsEnabled(true);
        }
        if (uiSettings != null) {
            uiSettings.setZoomGesturesEnabled(true);
        }
    }

    public final void y6(int i14) {
        qe2.h hVar = this.f148294e;
        if (hVar != null) {
            hVar.setPadding(0, 0, 0, i14);
        }
    }

    /* JADX INFO: renamed from: qw0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lqw0/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "BOUNDING_BOX_PADDING", "I", "gcm-map_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2795a {
        public /* synthetic */ C2795a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C2795a() {
        }
    }
}
