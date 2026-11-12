package com.huawei.hms.maps.model;

import android.content.Context;
import android.os.RemoteException;
import com.huawei.hms.maps.model.internal.IHeatMapDelegate;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public class HeatMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IHeatMapDelegate f14247a;

    public void changeDataSet(Context context, int i) {
        try {
            this.f14247a.changeDataSetFromRes(i);
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public void setIntensity(Float f) {
        try {
            this.f14247a.setIntensity(String.valueOf(f));
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public void setOpacity(Float f) {
        if (f.floatValue() < 0.0f || f.floatValue() > 1.0f) {
            throw new IllegalArgumentException("Opacity must be in the range [0..1]");
        }
        try {
            this.f14247a.setOpacity(String.valueOf(f));
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public void setRadius(Float f) {
        try {
            this.f14247a.setRadius(String.valueOf(f));
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public void changeDataSet(String str) {
        try {
            this.f14247a.changeDataSet(str);
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public void setIntensity(Map<Float, Float> map) {
        if (map == null) {
            return;
        }
        try {
            this.f14247a.setIntensityMap(b(map));
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public void setOpacity(Map<Float, Float> map) {
        if (map == null) {
            return;
        }
        try {
            this.f14247a.setOpacityMap(b(map));
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public void setRadius(Map<Float, Float> map) {
        if (map == null) {
            return;
        }
        try {
            this.f14247a.setRadiusMap(b(map));
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public void setVisible(boolean z) {
        try {
            this.f14247a.setVisible(z);
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public void setRadiusUnit(HeatMapOptions.RadiusUnit radiusUnit) {
        try {
            this.f14247a.setRadiusUnit(radiusUnit.equals(HeatMapOptions.RadiusUnit.METER) ? 2 : 1);
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public void setColor(Map<Float, Integer> map) {
        if (map == null) {
            return;
        }
        try {
            this.f14247a.setColor(a(map));
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public void remove() {
        try {
            this.f14247a.remove();
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public HeatMapOptions.RadiusUnit getRadiusUnit() {
        try {
            return this.f14247a.getRadiusUnit() == 2 ? HeatMapOptions.RadiusUnit.METER : HeatMapOptions.RadiusUnit.PIXEL;
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    public String getId() {
        try {
            return this.f14247a.getId();
        } catch (RemoteException e) {
            throw new com.huawei.hms.feature.dynamic.RuntimeRemoteException(e);
        }
    }

    private Map b(Map map) {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map2.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
        }
        return map2;
    }

    private Map a(Map map) {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map2.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
        }
        return map2;
    }

    public HeatMap(IHeatMapDelegate iHeatMapDelegate) {
        if (iHeatMapDelegate == null) {
            throw new NullPointerException("Object is null");
        }
        this.f14247a = iHeatMapDelegate;
    }
}
