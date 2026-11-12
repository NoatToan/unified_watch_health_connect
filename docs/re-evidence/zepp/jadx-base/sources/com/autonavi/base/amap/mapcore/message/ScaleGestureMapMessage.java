package com.autonavi.base.amap.mapcore.message;

import android.graphics.Point;
import com.autonavi.ae.gmap.maploader.Pools;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.base.ae.gmap.GLMapState;

/* JADX INFO: loaded from: classes2.dex */
public class ScaleGestureMapMessage extends AbstractGestureMapMessage {
    private static final Pools.SynchronizedPool<ScaleGestureMapMessage> M_POOL = new Pools.SynchronizedPool<>(256);
    public int pivotX;
    public int pivotY;
    public float scaleDelta;

    public ScaleGestureMapMessage(int i, float f, int i2, int i3) {
        super(i);
        this.scaleDelta = 0.0f;
        this.pivotX = 0;
        this.pivotY = 0;
        setParams(i, f, i2, i3);
    }

    public static void destory() {
        M_POOL.destory();
    }

    public static ScaleGestureMapMessage obtain(int i, float f, int i2, int i3) {
        ScaleGestureMapMessage scaleGestureMapMessageAcquire = M_POOL.acquire();
        if (scaleGestureMapMessageAcquire == null) {
            return new ScaleGestureMapMessage(i, f, i2, i3);
        }
        scaleGestureMapMessageAcquire.reset();
        scaleGestureMapMessageAcquire.setParams(i, f, i2, i3);
        return scaleGestureMapMessageAcquire;
    }

    private void setMapZoomer(GLMapState gLMapState) {
        gLMapState.setMapZoomer(gLMapState.getMapZoomer() + this.scaleDelta);
        gLMapState.recalculate();
    }

    private void setParams(int i, float f, int i2, int i3) {
        setState(i);
        this.scaleDelta = f;
        this.pivotX = i2;
        this.pivotY = i3;
    }

    @Override // com.autonavi.base.amap.mapcore.message.AbstractGestureMapMessage, com.autonavi.base.ae.gmap.AbstractMapMessage
    public int getType() {
        return 1;
    }

    public void recycle() {
        M_POOL.release(this);
    }

    @Override // com.autonavi.base.amap.mapcore.message.AbstractGestureMapMessage
    public void runCameraUpdate(GLMapState gLMapState) {
        IPoint iPointObtain;
        if (this.isUseAnchor) {
            setMapZoomer(gLMapState);
            return;
        }
        int i = this.pivotX;
        int i2 = this.pivotY;
        if (this.isGestureScaleByMapCenter) {
            i = this.width >> 1;
            i2 = this.height >> 1;
        }
        IPoint iPointObtain2 = null;
        if (i > 0 || i2 > 0) {
            iPointObtain2 = IPoint.obtain();
            iPointObtain = IPoint.obtain();
            win2geo(gLMapState, i, i2, iPointObtain2);
            gLMapState.setMapGeoCenter(((Point) iPointObtain2).x, ((Point) iPointObtain2).y);
        } else {
            iPointObtain = null;
        }
        setMapZoomer(gLMapState);
        if (i > 0 || i2 > 0) {
            win2geo(gLMapState, i, i2, iPointObtain);
            if (iPointObtain2 != null) {
                gLMapState.setMapGeoCenter((((Point) iPointObtain2).x * 2) - ((Point) iPointObtain).x, (((Point) iPointObtain2).y * 2) - ((Point) iPointObtain).y);
            }
            gLMapState.recalculate();
        }
        if (iPointObtain2 != null) {
            iPointObtain2.recycle();
        }
        if (iPointObtain != null) {
            iPointObtain.recycle();
        }
    }
}
