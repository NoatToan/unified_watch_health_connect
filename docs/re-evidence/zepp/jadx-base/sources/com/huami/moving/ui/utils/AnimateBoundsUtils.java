package com.huami.moving.ui.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.amap.api.maps.AMap;
import com.amap.api.maps.CameraUpdateFactory;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class AnimateBoundsUtils implements Runnable {
    public static final int TRACE_FINISH = 1;
    public static final int TRACE_MOVE = 2;
    private a a = new a(this);
    private CancelableCallback b;
    private AMap c;
    private long d;
    private List<LatLng> e;
    public int mIntervalMillisecond;

    public interface CancelableCallback {
        void onUpdateFinish();
    }

    public static class a extends Handler {
        public WeakReference<AnimateBoundsUtils> a;

        /* JADX INFO: renamed from: com.huami.moving.ui.utils.AnimateBoundsUtils$a$a, reason: collision with other inner class name */
        public class C0498a implements AMap.CancelableCallback {
            public C0498a() {
            }

            @Override // com.amap.api.maps.AMap.CancelableCallback
            public void onCancel() {
            }

            @Override // com.amap.api.maps.AMap.CancelableCallback
            public void onFinish() {
            }
        }

        public a(AnimateBoundsUtils animateBoundsUtils) {
            super(Looper.getMainLooper());
            this.a = new WeakReference<>(animateBoundsUtils);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            AnimateBoundsUtils animateBoundsUtils = this.a.get();
            int i = message.what;
            if (i == 1) {
                if (animateBoundsUtils.b != null) {
                    animateBoundsUtils.b.onUpdateFinish();
                    LatLngBounds.Builder builder = LatLngBounds.builder();
                    Iterator it2 = animateBoundsUtils.e.iterator();
                    while (it2.hasNext()) {
                        builder.include((LatLng) it2.next());
                    }
                    animateBoundsUtils.c.moveCamera(CameraUpdateFactory.newLatLngBounds(builder.build(), 200));
                    return;
                }
                return;
            }
            if (i != 2) {
                return;
            }
            List listSubList = animateBoundsUtils.e.subList(0, (int) (((double) animateBoundsUtils.e.size()) * (((double) message.arg1) / (animateBoundsUtils.d * 1.0d))));
            LatLngBounds.Builder builder2 = LatLngBounds.builder();
            Iterator it3 = listSubList.iterator();
            while (it3.hasNext()) {
                builder2.include((LatLng) it3.next());
            }
            animateBoundsUtils.c.animateCamera(CameraUpdateFactory.newLatLngBounds(builder2.build(), 200), animateBoundsUtils.mIntervalMillisecond, new C0498a());
        }
    }

    public AnimateBoundsUtils(int i, AMap aMap, long j, List<LatLng> list, CancelableCallback cancelableCallback) {
        this.c = aMap;
        this.d = j;
        this.e = list;
        this.mIntervalMillisecond = i;
        this.b = cancelableCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = 0;
        while (i < this.d) {
            Message messageObtainMessage = this.a.obtainMessage();
            messageObtainMessage.what = 2;
            messageObtainMessage.arg1 = i;
            this.a.sendMessage(messageObtainMessage);
            try {
                Thread.sleep(this.mIntervalMillisecond);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i += this.mIntervalMillisecond;
        }
        Message messageObtainMessage2 = this.a.obtainMessage();
        messageObtainMessage2.what = 2;
        messageObtainMessage2.arg1 = (int) this.d;
        this.a.sendMessage(messageObtainMessage2);
        Message messageObtainMessage3 = this.a.obtainMessage();
        messageObtainMessage3.what = 1;
        this.a.sendMessage(messageObtainMessage3);
    }
}
