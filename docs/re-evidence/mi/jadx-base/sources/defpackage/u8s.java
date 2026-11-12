package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.amap.api.maps.AMap;
import com.amap.api.maps.InfoWindowParams;
import com.amap.api.maps.model.BaseOverlay;
import com.amap.api.maps.model.BasePointOverlay;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MarkerOptions;
import com.autonavi.base.amap.api.mapcore.BaseOverlayImp;
import com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction;

/* JADX INFO: loaded from: classes4.dex */
public final class u8s {
    public View d;
    public TextView e;
    public TextView f;
    public Context h;
    public IInfoWindowAction i;
    public IInfoWindowAction j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public BaseOverlay f35530k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AMap.InfoWindowAdapter f35528a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AMap.CommonInfoWindowAdapter f35529b = null;
    public boolean c = true;
    public Drawable g = null;
    public AMap.InfoWindowAdapter l = new a();
    public AMap.CommonInfoWindowAdapter m = new b();

    public class a implements AMap.InfoWindowAdapter {
        public a() {
        }

        @Override // com.amap.api.maps.AMap.InfoWindowAdapter
        public final View getInfoContents(Marker marker) {
            return null;
        }

        @Override // com.amap.api.maps.AMap.InfoWindowAdapter
        public final View getInfoWindow(Marker marker) {
            try {
                if (u8s.this.g == null) {
                    u8s u8sVar = u8s.this;
                    u8sVar.g = kls.c(u8sVar.h, "infowindow_bg.9.png");
                }
                if (u8s.this.d == null) {
                    u8s.this.d = new LinearLayout(u8s.this.h);
                    u8s.this.d.setBackground(u8s.this.g);
                    u8s.this.e = new TextView(u8s.this.h);
                    u8s.this.e.setText(marker.getTitle());
                    u8s.this.e.setTextColor(-16777216);
                    u8s.this.f = new TextView(u8s.this.h);
                    u8s.this.f.setTextColor(-16777216);
                    u8s.this.f.setText(marker.getSnippet());
                    ((LinearLayout) u8s.this.d).setOrientation(1);
                    ((LinearLayout) u8s.this.d).addView(u8s.this.e);
                    ((LinearLayout) u8s.this.d).addView(u8s.this.f);
                }
            } catch (Throwable th) {
                m2t.r(th, "InfoWindowDelegate", "showInfoWindow decodeDrawableFromAsset");
                th.printStackTrace();
            }
            return u8s.this.d;
        }
    }

    public class b implements AMap.CommonInfoWindowAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public InfoWindowParams f35532a = null;

        public b() {
        }

        @Override // com.amap.api.maps.AMap.CommonInfoWindowAdapter
        public final InfoWindowParams getInfoWindowParams(BasePointOverlay basePointOverlay) {
            try {
                if (this.f35532a == null) {
                    this.f35532a = new InfoWindowParams();
                    if (u8s.this.g == null) {
                        u8s u8sVar = u8s.this;
                        u8sVar.g = kls.c(u8sVar.h, "infowindow_bg.9.png");
                    }
                    u8s.this.d = new LinearLayout(u8s.this.h);
                    u8s.this.d.setBackground(u8s.this.g);
                    u8s.this.e = new TextView(u8s.this.h);
                    u8s.this.e.setText("标题");
                    u8s.this.e.setTextColor(-16777216);
                    u8s.this.f = new TextView(u8s.this.h);
                    u8s.this.f.setTextColor(-16777216);
                    u8s.this.f.setText("内容");
                    ((LinearLayout) u8s.this.d).setOrientation(1);
                    ((LinearLayout) u8s.this.d).addView(u8s.this.e);
                    ((LinearLayout) u8s.this.d).addView(u8s.this.f);
                    this.f35532a.setInfoWindowType(2);
                    this.f35532a.setInfoWindow(u8s.this.d);
                }
                return this.f35532a;
            } catch (Throwable th) {
                m2t.r(th, "InfoWindowDelegate", "showInfoWindow decodeDrawableFromAsset");
                th.printStackTrace();
                return null;
            }
        }
    }

    public u8s(Context context) {
        this.h = context;
    }

    public static void g(View view, BasePointOverlay basePointOverlay) {
        if (view == null || basePointOverlay == null || basePointOverlay.getPosition() == null || !gls.g()) {
            return;
        }
        String strZ = zns.Z(view);
        if (TextUtils.isEmpty(strZ)) {
            return;
        }
        gls.a().c(basePointOverlay.getPosition(), strZ, "");
    }

    public static boolean t(AMap.InfoWindowAdapter infoWindowAdapter) {
        if (infoWindowAdapter == null) {
            return true;
        }
        Marker marker = new Marker(null, null, new MarkerOptions(), "check");
        return infoWindowAdapter.getInfoWindow(marker) == null && infoWindowAdapter.getInfoContents(marker) == null;
    }

    public final View d(BasePointOverlay basePointOverlay) {
        InfoWindowParams infoWindowParams;
        AMap.InfoWindowAdapter infoWindowAdapter = this.f35528a;
        if (infoWindowAdapter != null) {
            View infoWindow = infoWindowAdapter.getInfoWindow((Marker) basePointOverlay);
            g(infoWindow, basePointOverlay);
            return infoWindow;
        }
        AMap.CommonInfoWindowAdapter commonInfoWindowAdapter = this.f35529b;
        if (commonInfoWindowAdapter != null && (infoWindowParams = commonInfoWindowAdapter.getInfoWindowParams(basePointOverlay)) != null) {
            View infoWindow2 = infoWindowParams.getInfoWindow();
            g(infoWindow2, basePointOverlay);
            return infoWindow2;
        }
        InfoWindowParams infoWindowParams2 = this.m.getInfoWindowParams(basePointOverlay);
        if (infoWindowParams2 != null) {
            return infoWindowParams2.getInfoWindow();
        }
        return null;
    }

    public final BaseOverlay f(MotionEvent motionEvent) {
        IInfoWindowAction iInfoWindowActionY = y();
        if (iInfoWindowActionY == null || !iInfoWindowActionY.onInfoWindowTap(motionEvent)) {
            return null;
        }
        return this.f35530k;
    }

    public final synchronized void h(AMap.CommonInfoWindowAdapter commonInfoWindowAdapter) {
        try {
            this.f35529b = commonInfoWindowAdapter;
            this.f35528a = null;
            if (commonInfoWindowAdapter == null) {
                this.f35529b = this.m;
                this.c = true;
            } else {
                this.c = false;
            }
            IInfoWindowAction iInfoWindowAction = this.j;
            if (iInfoWindowAction != null) {
                iInfoWindowAction.hideInfoWindow();
            }
            IInfoWindowAction iInfoWindowAction2 = this.i;
            if (iInfoWindowAction2 != null) {
                iInfoWindowAction2.hideInfoWindow();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void i(AMap.InfoWindowAdapter infoWindowAdapter) {
        try {
            this.f35528a = infoWindowAdapter;
            this.f35529b = null;
            if (t(infoWindowAdapter)) {
                this.f35528a = this.l;
                this.c = true;
            } else {
                this.c = false;
            }
            IInfoWindowAction iInfoWindowAction = this.j;
            if (iInfoWindowAction != null) {
                iInfoWindowAction.hideInfoWindow();
            }
            IInfoWindowAction iInfoWindowAction2 = this.i;
            if (iInfoWindowAction2 != null) {
                iInfoWindowAction2.hideInfoWindow();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void j(BaseOverlay baseOverlay) throws RemoteException {
        IInfoWindowAction iInfoWindowActionY = y();
        if (iInfoWindowActionY == null || !(baseOverlay instanceof BasePointOverlay)) {
            return;
        }
        iInfoWindowActionY.showInfoWindow((BasePointOverlay) baseOverlay);
        this.f35530k = baseOverlay;
    }

    public final void k(BaseOverlayImp baseOverlayImp) throws RemoteException {
        IInfoWindowAction iInfoWindowActionY = y();
        if (iInfoWindowActionY != null) {
            iInfoWindowActionY.showInfoWindow(baseOverlayImp);
        }
    }

    public final void l(IInfoWindowAction iInfoWindowAction) {
        synchronized (this) {
            try {
                this.i = iInfoWindowAction;
                if (iInfoWindowAction != null) {
                    iInfoWindowAction.setInfoWindowAdapterManager(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(String str, String str2) {
        TextView textView = this.e;
        if (textView != null) {
            textView.requestLayout();
            this.e.setText(str);
        }
        TextView textView2 = this.f;
        if (textView2 != null) {
            textView2.requestLayout();
            this.f.setText(str2);
        }
        View view = this.d;
        if (view != null) {
            view.requestLayout();
        }
    }

    public final synchronized boolean n() {
        return this.c;
    }

    public final View p(BasePointOverlay basePointOverlay) {
        InfoWindowParams infoWindowParams;
        AMap.InfoWindowAdapter infoWindowAdapter = this.f35528a;
        if (infoWindowAdapter != null) {
            View infoContents = infoWindowAdapter.getInfoContents((Marker) basePointOverlay);
            g(infoContents, basePointOverlay);
            return infoContents;
        }
        AMap.CommonInfoWindowAdapter commonInfoWindowAdapter = this.f35529b;
        if (commonInfoWindowAdapter != null && (infoWindowParams = commonInfoWindowAdapter.getInfoWindowParams(basePointOverlay)) != null) {
            View infoContents2 = infoWindowParams.getInfoContents();
            g(infoContents2, basePointOverlay);
            return infoContents2;
        }
        InfoWindowParams infoWindowParams2 = this.m.getInfoWindowParams(basePointOverlay);
        if (infoWindowParams2 != null) {
            return infoWindowParams2.getInfoContents();
        }
        return null;
    }

    public final void r() {
        IInfoWindowAction iInfoWindowActionY = y();
        if (iInfoWindowActionY != null) {
            iInfoWindowActionY.redrawInfoWindow();
        }
    }

    public final void s(IInfoWindowAction iInfoWindowAction) {
        synchronized (this) {
            try {
                this.j = iInfoWindowAction;
                if (iInfoWindowAction != null) {
                    iInfoWindowAction.setInfoWindowAdapterManager(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final long u(BasePointOverlay basePointOverlay) {
        InfoWindowParams infoWindowParams;
        AMap.InfoWindowAdapter infoWindowAdapter = this.f35528a;
        if (infoWindowAdapter != null && (infoWindowAdapter instanceof AMap.ImageInfoWindowAdapter)) {
            return ((AMap.ImageInfoWindowAdapter) infoWindowAdapter).getInfoWindowUpdateTime();
        }
        AMap.CommonInfoWindowAdapter commonInfoWindowAdapter = this.f35529b;
        if (commonInfoWindowAdapter == null || (infoWindowParams = commonInfoWindowAdapter.getInfoWindowParams(basePointOverlay)) == null) {
            return 0L;
        }
        return infoWindowParams.getInfoWindowUpdateTime();
    }

    public final void w() {
        IInfoWindowAction iInfoWindowActionY = y();
        if (iInfoWindowActionY != null) {
            iInfoWindowActionY.hideInfoWindow();
        }
    }

    public final synchronized IInfoWindowAction y() {
        AMap.InfoWindowAdapter infoWindowAdapter = this.f35528a;
        if (infoWindowAdapter != null) {
            if (infoWindowAdapter instanceof AMap.ImageInfoWindowAdapter) {
                return this.j;
            }
            if (infoWindowAdapter instanceof AMap.MultiPositionInfoWindowAdapter) {
                return this.j;
            }
        }
        AMap.CommonInfoWindowAdapter commonInfoWindowAdapter = this.f35529b;
        if (commonInfoWindowAdapter == null || commonInfoWindowAdapter.getInfoWindowParams(null).getInfoWindowType() != 1) {
            return this.i;
        }
        return this.j;
    }
}
