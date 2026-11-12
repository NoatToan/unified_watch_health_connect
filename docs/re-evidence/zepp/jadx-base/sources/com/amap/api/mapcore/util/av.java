package com.amap.api.mapcore.util;

import android.os.RemoteException;
import com.amap.api.maps.AMap;
import com.amap.api.maps.model.MultiPointItem;
import com.amap.api.maps.model.MultiPointOverlayOptions;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.interfaces.IMultiPointOverlay;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.autonavi.base.amap.mapcore.MapConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class av {
    public df a;
    private List<at> b = new ArrayList();
    private AMap.OnMultiPointClickListener c;
    private IAMapDelegate d;

    public av(IAMapDelegate iAMapDelegate) {
        this.d = iAMapDelegate;
    }

    public final df a() {
        df gLShaderManager = this.d.getGLShaderManager();
        this.a = gLShaderManager;
        return gLShaderManager;
    }

    public final synchronized void b() {
        this.c = null;
        try {
            synchronized (this.b) {
                Iterator<at> it2 = this.b.iterator();
                while (it2.hasNext()) {
                    it2.next().destroy(false);
                }
                this.b.clear();
            }
        } catch (Throwable th) {
            hn.c(th, "MultiPointOverlayManagerLayer", "destory");
            th.printStackTrace();
        }
    }

    public final synchronized void c() {
        try {
            synchronized (this.b) {
                this.b.clear();
            }
        } catch (Throwable th) {
            hn.c(th, "MultiPointOverlayManagerLayer", "clear");
            th.printStackTrace();
        }
    }

    public final void d() {
        IAMapDelegate iAMapDelegate = this.d;
        if (iAMapDelegate != null) {
            iAMapDelegate.setRunLowFrame(false);
        }
    }

    public final synchronized IMultiPointOverlay a(MultiPointOverlayOptions multiPointOverlayOptions) throws RemoteException {
        if (multiPointOverlayOptions == null) {
            return null;
        }
        au auVar = new au(multiPointOverlayOptions, this);
        synchronized (this.b) {
            this.b.add(auVar);
        }
        return auVar;
    }

    public final boolean a(MapConfig mapConfig, float[] fArr, float[] fArr2) {
        try {
            synchronized (this.b) {
                try {
                    Iterator<at> it2 = this.b.iterator();
                    while (it2.hasNext()) {
                        it2.next().a(mapConfig, fArr, fArr2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        } catch (Throwable th2) {
            hn.c(th2, "MultiPointOverlayManagerLayer", "draw");
            th2.printStackTrace();
            return false;
        }
    }

    public final boolean a(IPoint iPoint) {
        MultiPointItem multiPointItemOnClick;
        if (this.c == null) {
            return false;
        }
        synchronized (this.b) {
            for (at atVar : this.b) {
                if (atVar != null && (multiPointItemOnClick = atVar.onClick(iPoint)) != null) {
                    AMap.OnMultiPointClickListener onMultiPointClickListener = this.c;
                    return onMultiPointClickListener != null ? onMultiPointClickListener.onPointClick(multiPointItemOnClick) : false;
                }
            }
            return false;
        }
    }

    public final void a(AMap.OnMultiPointClickListener onMultiPointClickListener) {
        this.c = onMultiPointClickListener;
    }

    public final void a(au auVar) {
        this.b.remove(auVar);
    }
}
