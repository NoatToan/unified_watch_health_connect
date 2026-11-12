package com.huami.moving.ui.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.amap.api.maps.AMap;
import com.amap.api.maps.CameraUpdateFactory;
import com.amap.api.maps.model.CameraPosition;
import com.amap.api.maps.model.LatLng;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class AnimateUtils implements Runnable {
    public static final int TRACE_FINISH = 1;
    public static final int TRACE_MOVE = 2;
    private a a = new a(this);
    private int b;
    private CancelableCallback c;
    private AMap d;
    private long e;
    private CameraPosition f;
    private CameraPosition g;
    private LatLngScroller h;
    private NumberScroller i;
    private NumberScroller j;

    public interface CancelableCallback {
        void onUpdateFinish();
    }

    public static class a extends Handler {
        public WeakReference<AnimateUtils> a;

        public a(AnimateUtils animateUtils) {
            super(Looper.getMainLooper());
            this.a = new WeakReference<>(animateUtils);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            AnimateUtils animateUtils = this.a.get();
            int i = message.what;
            if (i == 1) {
                if (animateUtils.c != null) {
                    animateUtils.c.onUpdateFinish();
                }
            } else if (i == 2 && animateUtils.h.computeOffset() && animateUtils.j.computeOffset() && animateUtils.i.computeOffset()) {
                animateUtils.d.moveCamera(CameraUpdateFactory.newCameraPosition(new CameraPosition(new LatLng(animateUtils.h.getCurrLatitude(), animateUtils.h.getCurrLongitude()), animateUtils.j.getCurr(), animateUtils.i.getCurr(), 0.0f)));
            }
        }
    }

    public AnimateUtils(int i, AMap aMap, long j, CameraPosition cameraPosition, CameraPosition cameraPosition2, CancelableCallback cancelableCallback) {
        this.d = aMap;
        this.e = j;
        this.f = cameraPosition;
        this.g = cameraPosition2;
        this.b = i;
        this.c = cancelableCallback;
        LatLngScroller latLngScroller = new LatLngScroller();
        this.h = latLngScroller;
        latLngScroller.setDuration(j);
        NumberScroller numberScroller = new NumberScroller();
        this.i = numberScroller;
        numberScroller.setDuration(j);
        NumberScroller numberScroller2 = new NumberScroller();
        this.j = numberScroller2;
        numberScroller2.setDuration(j);
    }

    @Override // java.lang.Runnable
    public void run() {
        LatLngScroller latLngScroller = this.h;
        LatLng latLng = this.f.target;
        double d = latLng.latitude;
        double d2 = latLng.longitude;
        LatLng latLng2 = this.g.target;
        latLngScroller.startScroll(d, d2, latLng2.latitude - d, latLng2.longitude - d2);
        NumberScroller numberScroller = this.i;
        float f = this.f.tilt;
        numberScroller.startScroll(f, this.g.tilt - f);
        NumberScroller numberScroller2 = this.j;
        float f2 = this.f.zoom;
        numberScroller2.startScroll(f2, this.g.zoom - f2);
        int i = 0;
        while (i < this.e) {
            Message messageObtainMessage = this.a.obtainMessage();
            messageObtainMessage.what = 2;
            this.a.sendMessage(messageObtainMessage);
            try {
                Thread.sleep(this.b);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i += this.b;
        }
        Message messageObtainMessage2 = this.a.obtainMessage();
        messageObtainMessage2.what = 1;
        this.a.sendMessage(messageObtainMessage2);
    }
}
