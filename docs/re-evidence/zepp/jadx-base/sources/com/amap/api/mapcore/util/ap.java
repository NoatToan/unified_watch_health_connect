package com.amap.api.mapcore.util;

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
import com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction;

/* JADX INFO: loaded from: classes2.dex */
public final class ap {
    public Context c;
    private View e;
    private TextView f;
    private TextView g;
    private IInfoWindowAction i;
    private IInfoWindowAction j;
    private BaseOverlay k;
    public AMap.InfoWindowAdapter a = null;
    public AMap.CommonInfoWindowAdapter b = null;
    private boolean d = true;
    private Drawable h = null;
    private AMap.InfoWindowAdapter l = new AMap.InfoWindowAdapter() { // from class: com.amap.api.mapcore.util.ap.1
        @Override // com.amap.api.maps.AMap.InfoWindowAdapter
        public final View getInfoContents(Marker marker) {
            return null;
        }

        @Override // com.amap.api.maps.AMap.InfoWindowAdapter
        public final View getInfoWindow(Marker marker) {
            try {
                if (ap.this.h == null) {
                    ap apVar = ap.this;
                    apVar.h = eg.a(apVar.c, "infowindow_bg.9.png");
                }
                if (ap.this.e == null) {
                    ap.this.e = new LinearLayout(ap.this.c);
                    ap.this.e.setBackground(ap.this.h);
                    ap.this.f = new TextView(ap.this.c);
                    ap.this.f.setText(marker.getTitle());
                    ap.this.f.setTextColor(-16777216);
                    ap.this.g = new TextView(ap.this.c);
                    ap.this.g.setTextColor(-16777216);
                    ap.this.g.setText(marker.getSnippet());
                    ((LinearLayout) ap.this.e).setOrientation(1);
                    ((LinearLayout) ap.this.e).addView(ap.this.f);
                    ((LinearLayout) ap.this.e).addView(ap.this.g);
                }
            } catch (Throwable th) {
                hn.c(th, "InfoWindowDelegate", "showInfoWindow decodeDrawableFromAsset");
                th.printStackTrace();
            }
            return ap.this.e;
        }
    };
    private AMap.CommonInfoWindowAdapter m = new AMap.CommonInfoWindowAdapter() { // from class: com.amap.api.mapcore.util.ap.2
        private InfoWindowParams b = null;

        @Override // com.amap.api.maps.AMap.CommonInfoWindowAdapter
        public final InfoWindowParams getInfoWindowParams(BasePointOverlay basePointOverlay) {
            try {
                if (this.b == null) {
                    this.b = new InfoWindowParams();
                    if (ap.this.h == null) {
                        ap apVar = ap.this;
                        apVar.h = eg.a(apVar.c, "infowindow_bg.9.png");
                    }
                    ap.this.e = new LinearLayout(ap.this.c);
                    ap.this.e.setBackground(ap.this.h);
                    ap.this.f = new TextView(ap.this.c);
                    ap.this.f.setText("标题");
                    ap.this.f.setTextColor(-16777216);
                    ap.this.g = new TextView(ap.this.c);
                    ap.this.g.setTextColor(-16777216);
                    ap.this.g.setText("内容");
                    ((LinearLayout) ap.this.e).setOrientation(1);
                    ((LinearLayout) ap.this.e).addView(ap.this.f);
                    ((LinearLayout) ap.this.e).addView(ap.this.g);
                    this.b.setInfoWindowType(2);
                    this.b.setInfoWindow(ap.this.e);
                }
                return this.b;
            } catch (Throwable th) {
                hn.c(th, "InfoWindowDelegate", "showInfoWindow decodeDrawableFromAsset");
                th.printStackTrace();
                return null;
            }
        }
    };

    public ap(Context context) {
        this.c = context;
    }

    public final View c(Marker marker) {
        AMap.InfoWindowAdapter infoWindowAdapter = this.a;
        if (infoWindowAdapter == null || !(infoWindowAdapter instanceof AMap.MultiPositionInfoWindowAdapter)) {
            return null;
        }
        return ((AMap.MultiPositionInfoWindowAdapter) infoWindowAdapter).getOverturnInfoWindowClick(marker);
    }

    public final Drawable d() {
        if (this.h == null) {
            try {
                this.h = eg.a(this.c, "infowindow_bg.9.png");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return this.h;
    }

    public final void b(IInfoWindowAction iInfoWindowAction) {
        synchronized (this) {
            this.j = iInfoWindowAction;
            if (iInfoWindowAction != null) {
                iInfoWindowAction.setInfoWindowAdapterManager(this);
            }
        }
    }

    public final long c(BasePointOverlay basePointOverlay) {
        InfoWindowParams infoWindowParams;
        AMap.InfoWindowAdapter infoWindowAdapter = this.a;
        if (infoWindowAdapter != null && (infoWindowAdapter instanceof AMap.ImageInfoWindowAdapter)) {
            return ((AMap.ImageInfoWindowAdapter) infoWindowAdapter).getInfoWindowUpdateTime();
        }
        AMap.CommonInfoWindowAdapter commonInfoWindowAdapter = this.b;
        if (commonInfoWindowAdapter == null || (infoWindowParams = commonInfoWindowAdapter.getInfoWindowParams(basePointOverlay)) == null) {
            return 0L;
        }
        return infoWindowParams.getInfoWindowUpdateTime();
    }

    public final void a(IInfoWindowAction iInfoWindowAction) {
        synchronized (this) {
            this.i = iInfoWindowAction;
            if (iInfoWindowAction != null) {
                iInfoWindowAction.setInfoWindowAdapterManager(this);
            }
        }
    }

    public final void b() {
        this.c = null;
        this.e = null;
        this.f = null;
        this.g = null;
        synchronized (this) {
            er.a(this.h);
            this.h = null;
            this.l = null;
            this.a = null;
        }
        this.b = null;
        this.i = null;
        this.j = null;
    }

    public final synchronized boolean a() {
        return this.d;
    }

    public final synchronized IInfoWindowAction c() {
        AMap.InfoWindowAdapter infoWindowAdapter = this.a;
        if (infoWindowAdapter != null) {
            if (infoWindowAdapter instanceof AMap.ImageInfoWindowAdapter) {
                return this.j;
            }
            if (infoWindowAdapter instanceof AMap.MultiPositionInfoWindowAdapter) {
                return this.j;
            }
        }
        AMap.CommonInfoWindowAdapter commonInfoWindowAdapter = this.b;
        if (commonInfoWindowAdapter != null && commonInfoWindowAdapter.getInfoWindowParams(null).getInfoWindowType() == 1) {
            return this.j;
        }
        return this.i;
    }

    public final void a(String str, String str2) {
        TextView textView = this.f;
        if (textView != null) {
            textView.requestLayout();
            this.f.setText(str);
        }
        TextView textView2 = this.g;
        if (textView2 != null) {
            textView2.requestLayout();
            this.g.setText(str2);
        }
        View view = this.e;
        if (view != null) {
            view.requestLayout();
        }
    }

    public final synchronized void a(AMap.InfoWindowAdapter infoWindowAdapter) {
        this.a = infoWindowAdapter;
        this.b = null;
        if (infoWindowAdapter == null) {
            this.a = this.l;
            this.d = true;
        } else {
            this.d = false;
        }
        IInfoWindowAction iInfoWindowAction = this.j;
        if (iInfoWindowAction != null) {
            iInfoWindowAction.hideInfoWindow();
        }
        IInfoWindowAction iInfoWindowAction2 = this.i;
        if (iInfoWindowAction2 != null) {
            iInfoWindowAction2.hideInfoWindow();
        }
    }

    public final View b(BasePointOverlay basePointOverlay) {
        InfoWindowParams infoWindowParams;
        AMap.InfoWindowAdapter infoWindowAdapter = this.a;
        if (infoWindowAdapter != null) {
            View infoContents = infoWindowAdapter.getInfoContents((Marker) basePointOverlay);
            a(infoContents, basePointOverlay);
            return infoContents;
        }
        AMap.CommonInfoWindowAdapter commonInfoWindowAdapter = this.b;
        if (commonInfoWindowAdapter != null && (infoWindowParams = commonInfoWindowAdapter.getInfoWindowParams(basePointOverlay)) != null) {
            View infoContents2 = infoWindowParams.getInfoContents();
            a(infoContents2, basePointOverlay);
            return infoContents2;
        }
        InfoWindowParams infoWindowParams2 = this.m.getInfoWindowParams(basePointOverlay);
        if (infoWindowParams2 != null) {
            return infoWindowParams2.getInfoContents();
        }
        return null;
    }

    public final synchronized void a(AMap.CommonInfoWindowAdapter commonInfoWindowAdapter) {
        this.b = commonInfoWindowAdapter;
        this.a = null;
        if (commonInfoWindowAdapter == null) {
            this.b = this.m;
            this.d = true;
        } else {
            this.d = false;
        }
        IInfoWindowAction iInfoWindowAction = this.j;
        if (iInfoWindowAction != null) {
            iInfoWindowAction.hideInfoWindow();
        }
        IInfoWindowAction iInfoWindowAction2 = this.i;
        if (iInfoWindowAction2 != null) {
            iInfoWindowAction2.hideInfoWindow();
        }
    }

    public final View b(Marker marker) {
        AMap.InfoWindowAdapter infoWindowAdapter = this.a;
        if (infoWindowAdapter == null || !(infoWindowAdapter instanceof AMap.MultiPositionInfoWindowAdapter)) {
            return null;
        }
        return ((AMap.MultiPositionInfoWindowAdapter) infoWindowAdapter).getOverturnInfoWindow(marker);
    }

    private static void a(View view, BasePointOverlay basePointOverlay) {
        if (view == null || basePointOverlay == null || basePointOverlay.getPosition() == null || !eb.c()) {
            return;
        }
        String strB = er.b(view);
        if (TextUtils.isEmpty(strB)) {
            return;
        }
        eb.a().a(basePointOverlay.getPosition(), strB, "");
    }

    public final View a(BasePointOverlay basePointOverlay) {
        InfoWindowParams infoWindowParams;
        AMap.InfoWindowAdapter infoWindowAdapter = this.a;
        if (infoWindowAdapter != null) {
            View infoWindow = infoWindowAdapter.getInfoWindow((Marker) basePointOverlay);
            a(infoWindow, basePointOverlay);
            return infoWindow;
        }
        AMap.CommonInfoWindowAdapter commonInfoWindowAdapter = this.b;
        if (commonInfoWindowAdapter != null && (infoWindowParams = commonInfoWindowAdapter.getInfoWindowParams(basePointOverlay)) != null) {
            View infoWindow2 = infoWindowParams.getInfoWindow();
            a(infoWindow2, basePointOverlay);
            return infoWindow2;
        }
        InfoWindowParams infoWindowParams2 = this.m.getInfoWindowParams(basePointOverlay);
        if (infoWindowParams2 != null) {
            return infoWindowParams2.getInfoWindow();
        }
        return null;
    }

    public final View a(Marker marker) {
        AMap.InfoWindowAdapter infoWindowAdapter = this.a;
        if (infoWindowAdapter == null || !(infoWindowAdapter instanceof AMap.MultiPositionInfoWindowAdapter)) {
            return null;
        }
        return ((AMap.MultiPositionInfoWindowAdapter) infoWindowAdapter).getInfoWindowClick(marker);
    }

    public final BaseOverlay a(MotionEvent motionEvent) {
        IInfoWindowAction iInfoWindowActionC = c();
        if (iInfoWindowActionC == null || !iInfoWindowActionC.onInfoWindowTap(motionEvent)) {
            return null;
        }
        return this.k;
    }

    public final void a(BaseOverlay baseOverlay) throws RemoteException {
        IInfoWindowAction iInfoWindowActionC = c();
        if (iInfoWindowActionC == null || !(baseOverlay instanceof BasePointOverlay)) {
            return;
        }
        iInfoWindowActionC.showInfoWindow((BasePointOverlay) baseOverlay);
        this.k = baseOverlay;
    }
}
