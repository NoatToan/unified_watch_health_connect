package com.amap.api.mapcore.util;

import android.os.RemoteException;
import androidx.core.internal.view.SupportMenu;
import com.amap.api.maps.interfaces.IGlOverlayLayer;
import com.amap.api.maps.model.BuildingOverlayOptions;
import com.amap.api.maps.model.LatLng;
import com.autonavi.amap.api.mapcore.overlays.IBuildingDelegate;
import com.autonavi.amap.mapcore.interfaces.IOverlay;
import com.autonavi.base.amap.api.mapcore.overlays.IOverlayDelegate;
import com.autonavi.base.amap.mapcore.AMapNativeBuildingRenderer;
import com.autonavi.base.amap.mapcore.MapConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class cn implements IBuildingDelegate, IOverlayDelegate {
    private IGlOverlayLayer b;
    private BuildingOverlayOptions c;
    private List<BuildingOverlayOptions> e;
    private String g;
    private float h;
    private boolean i;
    private df j;
    public long a = -1;
    private List<BuildingOverlayOptions> d = new ArrayList();
    private boolean f = true;

    public cn(IGlOverlayLayer iGlOverlayLayer) {
        try {
            this.b = iGlOverlayLayer;
            if (this.c == null) {
                BuildingOverlayOptions buildingOverlayOptions = new BuildingOverlayOptions();
                this.c = buildingOverlayOptions;
                buildingOverlayOptions.setVisible(true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new LatLng(84.9d, -179.9d));
                arrayList.add(new LatLng(84.9d, 179.9d));
                arrayList.add(new LatLng(-84.9d, 179.9d));
                arrayList.add(new LatLng(-84.9d, -179.9d));
                this.c.setBuildingLatlngs(arrayList);
                this.c.setBuildingTopColor(SupportMenu.CATEGORY_MASK);
                this.c.setBuildingSideColor(-12303292);
                this.c.setVisible(true);
                this.c.setZIndex(1.0f);
                this.d.add(this.c);
                a(true);
            }
            try {
                this.g = getId();
            } catch (Exception e) {
                hn.c(e, "BuildingOverlayDelegateImp", "create");
                e.printStackTrace();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void a(boolean z) {
        try {
            synchronized (this) {
                try {
                    if (z) {
                        this.d.set(0, this.c);
                    } else {
                        this.d.removeAll(this.e);
                        this.d.set(0, this.c);
                        this.d.addAll(this.e);
                    }
                    this.i = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayDelegate
    public final boolean calMapFPoint() throws RemoteException {
        return false;
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayDelegate
    public final boolean checkInBounds() {
        return true;
    }

    @Override // com.autonavi.amap.api.mapcore.overlays.IBuildingDelegate, com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void destroy() {
        synchronized (this) {
            long j = this.a;
            if (j != -1) {
                AMapNativeBuildingRenderer.nativeDestory(j);
                List<BuildingOverlayOptions> list = this.d;
                if (list != null) {
                    list.clear();
                }
                this.e = null;
                this.c = null;
                this.a = -1L;
            }
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayDelegate
    public final void draw(MapConfig mapConfig) throws RemoteException {
        df dfVar;
        if (mapConfig == null) {
            return;
        }
        try {
            if (this.a == -1) {
                long jNativeCreate = AMapNativeBuildingRenderer.nativeCreate();
                this.a = jNativeCreate;
                if (jNativeCreate == -1 || (dfVar = this.j) == null) {
                    return;
                }
                AMapNativeBuildingRenderer.nativeSetGLShaderManager(jNativeCreate, dfVar.a());
                return;
            }
            synchronized (this) {
                long j = this.a;
                if (j != -1) {
                    if (this.i) {
                        AMapNativeBuildingRenderer.nativeClearBuildingOptions(j);
                        for (int i = 0; i < this.d.size(); i++) {
                            AMapNativeBuildingRenderer.addBuildingOptions(this.a, this.d.get(i));
                        }
                        this.i = false;
                    }
                    AMapNativeBuildingRenderer.render(this.a, mapConfig.getViewMatrix(), mapConfig.getProjectionMatrix(), (int) mapConfig.getSX(), (int) mapConfig.getSY(), mapConfig.getSZ(), mapConfig.getCurTileIds());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final boolean equalsRemote(IOverlay iOverlay) throws RemoteException {
        return false;
    }

    @Override // com.autonavi.amap.api.mapcore.overlays.IBuildingDelegate
    public final List<BuildingOverlayOptions> getCustomOptions() {
        return this.e;
    }

    @Override // com.autonavi.amap.api.mapcore.overlays.IBuildingDelegate
    public final BuildingOverlayOptions getDefaultOptions() {
        BuildingOverlayOptions buildingOverlayOptions;
        synchronized (this) {
            buildingOverlayOptions = this.c;
        }
        return buildingOverlayOptions;
    }

    @Override // com.autonavi.amap.api.mapcore.overlays.IBuildingDelegate, com.autonavi.amap.mapcore.interfaces.IOverlay
    public final String getId() {
        if (this.g == null) {
            this.g = this.b.createId("Building");
        }
        return this.g;
    }

    @Override // com.autonavi.amap.api.mapcore.overlays.IBuildingDelegate, com.autonavi.amap.mapcore.interfaces.IOverlay
    public final float getZIndex() {
        return this.h;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final int hashCodeRemote() throws RemoteException {
        return 0;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final boolean isAboveMaskLayer() {
        return false;
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayDelegate
    public final boolean isDrawFinish() {
        return false;
    }

    @Override // com.autonavi.amap.api.mapcore.overlays.IBuildingDelegate, com.autonavi.amap.mapcore.interfaces.IOverlay
    public final boolean isVisible() {
        return this.f;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void remove() throws RemoteException {
        IGlOverlayLayer iGlOverlayLayer = this.b;
        if (iGlOverlayLayer == null || iGlOverlayLayer.removeOverlay(this.g, true)) {
            return;
        }
        destroy();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void setAboveMaskLayer(boolean z) {
    }

    @Override // com.autonavi.amap.api.mapcore.overlays.IBuildingDelegate
    public final void setCustomOptions(List<BuildingOverlayOptions> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        synchronized (this) {
            this.e = list;
        }
        a(false);
    }

    @Override // com.autonavi.amap.api.mapcore.overlays.IBuildingDelegate
    public final void setDefaultOptions(BuildingOverlayOptions buildingOverlayOptions) {
        if (buildingOverlayOptions != null) {
            synchronized (this) {
                this.c = buildingOverlayOptions;
            }
            a(true);
        }
    }

    @Override // com.autonavi.amap.api.mapcore.overlays.IBuildingDelegate, com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void setVisible(boolean z) {
        this.f = z;
    }

    @Override // com.autonavi.amap.api.mapcore.overlays.IBuildingDelegate, com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void setZIndex(float f) {
        try {
            this.h = f;
            this.b.changeOverlayIndex();
            synchronized (this) {
                this.c.setZIndex(this.h);
            }
            a(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void a(df dfVar) {
        this.j = dfVar;
    }
}
