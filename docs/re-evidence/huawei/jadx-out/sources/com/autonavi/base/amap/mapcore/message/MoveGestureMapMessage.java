package com.autonavi.base.amap.mapcore.message;

import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.base.ae.gmap.GLMapState;
import com.autonavi.base.ae.gmap.maploader.Pools;

/* JADX INFO: loaded from: classes4.dex */
public class MoveGestureMapMessage extends AbstractGestureMapMessage {
    private static final Pools.SynchronizedPool<MoveGestureMapMessage> M_POOL = new Pools.SynchronizedPool<>(1024);
    static int newCount;
    public float touchDeltaX;
    public float touchDeltaY;
    public int touchX;
    public int touchY;

    @Override // com.autonavi.base.amap.mapcore.message.AbstractGestureMapMessage, com.autonavi.base.ae.gmap.AbstractMapMessage
    public int getType() {
        return 0;
    }

    public static MoveGestureMapMessage obtain(int i, float f, float f2, float f3, float f4) {
        MoveGestureMapMessage moveGestureMapMessageAcquire;
        synchronized (MoveGestureMapMessage.class) {
            moveGestureMapMessageAcquire = M_POOL.acquire();
            if (moveGestureMapMessageAcquire == null) {
                moveGestureMapMessageAcquire = new MoveGestureMapMessage(i, f, f2);
            } else {
                moveGestureMapMessageAcquire.reset();
                moveGestureMapMessageAcquire.setParams(i, f, f2);
            }
            moveGestureMapMessageAcquire.touchX = (int) f3;
            moveGestureMapMessageAcquire.touchY = (int) f4;
        }
        return moveGestureMapMessageAcquire;
    }

    public void recycle() {
        M_POOL.release(this);
    }

    public static void destory() {
        M_POOL.destory();
    }

    private void setParams(int i, float f, float f2) {
        setState(i);
        this.touchDeltaX = f;
        this.touchDeltaY = f2;
    }

    public MoveGestureMapMessage(int i, float f, float f2) {
        super(i);
        this.touchX = 0;
        this.touchY = 0;
        this.touchDeltaX = f;
        this.touchDeltaY = f2;
        newCount++;
    }

    @Override // com.autonavi.base.amap.mapcore.message.AbstractGestureMapMessage
    public void runCameraUpdate(GLMapState gLMapState) {
        int i = (int) this.touchDeltaX;
        int i2 = (int) this.touchDeltaY;
        int i3 = this.touchX;
        int i4 = this.touchY;
        IPoint iPointObtain = IPoint.obtain();
        win2geo(gLMapState, this.touchX, this.touchY, iPointObtain);
        IPoint iPointObtain2 = IPoint.obtain();
        win2geo(gLMapState, i3 - i, i4 - i2, iPointObtain2);
        IPoint iPointObtain3 = IPoint.obtain();
        gLMapState.getMapGeoCenter(iPointObtain3);
        gLMapState.setMapGeoCenter(iPointObtain3.x + (iPointObtain2.x - iPointObtain.x), iPointObtain3.y + (iPointObtain2.y - iPointObtain.y));
        gLMapState.recalculate();
        iPointObtain3.recycle();
        iPointObtain.recycle();
        iPointObtain2.recycle();
    }
}
