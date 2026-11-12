package com.autonavi.base.amap.mapcore.message;

import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.base.ae.gmap.GLMapState;
import com.autonavi.base.ae.gmap.maploader.Pools;

/* JADX INFO: loaded from: classes4.dex */
public class ScaleGestureMapMessage extends AbstractGestureMapMessage {
    private static final Pools.SynchronizedPool<ScaleGestureMapMessage> M_POOL = new Pools.SynchronizedPool<>(256);
    public int pivotX;
    public int pivotY;
    public float scaleDelta;

    @Override // com.autonavi.base.amap.mapcore.message.AbstractGestureMapMessage, com.autonavi.base.ae.gmap.AbstractMapMessage
    public int getType() {
        return 1;
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

    public void recycle() {
        M_POOL.release(this);
    }

    public static void destory() {
        M_POOL.destory();
    }

    private void setParams(int i, float f, int i2, int i3) {
        setState(i);
        this.scaleDelta = f;
        this.pivotX = i2;
        this.pivotY = i3;
    }

    public ScaleGestureMapMessage(int i, float f, int i2, int i3) {
        super(i);
        this.scaleDelta = 0.0f;
        this.pivotX = 0;
        this.pivotY = 0;
        setParams(i, f, i2, i3);
    }

    @Override // com.autonavi.base.amap.mapcore.message.AbstractGestureMapMessage
    public void runCameraUpdate(GLMapState gLMapState) {
        IPoint iPointObtain;
        IPoint iPointObtain2;
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
        if (i > 0 || i2 > 0) {
            iPointObtain = IPoint.obtain();
            iPointObtain2 = IPoint.obtain();
            win2geo(gLMapState, i, i2, iPointObtain);
            gLMapState.setMapGeoCenter(iPointObtain.x, iPointObtain.y);
        } else {
            iPointObtain = null;
            iPointObtain2 = null;
        }
        setMapZoomer(gLMapState);
        if (i > 0 || i2 > 0) {
            win2geo(gLMapState, i, i2, iPointObtain2);
            if (iPointObtain != null) {
                gLMapState.setMapGeoCenter((iPointObtain.x * 2) - iPointObtain2.x, (iPointObtain.y * 2) - iPointObtain2.y);
            }
            gLMapState.recalculate();
        }
        if (iPointObtain != null) {
            iPointObtain.recycle();
        }
        if (iPointObtain2 != null) {
            iPointObtain2.recycle();
        }
    }

    private void setMapZoomer(GLMapState gLMapState) {
        gLMapState.setMapZoomer(gLMapState.getMapZoomer() + this.scaleDelta);
        gLMapState.recalculate();
    }
}
