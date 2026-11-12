package com.huami.moving.maps.gaode;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import com.amap.api.maps.AMapUtils;
import com.amap.api.maps.model.LatLng;
import com.huami.mifit.sportlib.model.RunnerData;
import com.huami.tools.log.HMLog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class TraceRePlay implements Runnable {
    public static final int DISTANCE_TYPE_1 = 1;
    public static final int DISTANCE_TYPE_10 = 10;
    public static final int DISTANCE_TYPE_100 = 100;
    public static final int DISTANCE_TYPE_2 = 2;
    public static final int DISTANCE_TYPE_200 = 200;
    public static final int DISTANCE_TYPE_5 = 5;
    public static final int DISTANCE_TYPE_50 = 50;
    public static final int DISTANCE_TYPE_500 = 500;
    public static String TAG = "TraceRePlay";
    public static final int TYPE_10_20KM = 10;
    public static final int TYPE_1_10KM = 8;
    public static final int TYPE_LESS_THAN_1KM = 3;
    public static final int TYPE_OVER_20KM = 11;
    private static final int l = 1;
    private static final int m = 3;
    private static final int n = 2;
    private static final int o = 4;
    private static final int p = 5;
    private List<LatLng> b;
    private List<LatLng> c;
    private int d;
    private TraceRePlayListener e;
    public SparseArray<LatLng> j;
    public boolean k;
    private boolean f = false;
    public int g = -1;
    public float h = 0.0f;
    public int i = 0;
    private a a = new a(this);

    public interface TraceRePlayListener {
        void onComplexTrackUpdateMark(LatLng latLng, int i);

        void onTraceUpdateFinish();

        void onTraceUpdating(LatLng latLng, int i);

        void onTrackUpdateMark(LatLng latLng, int i);

        void remvoeAllMake();
    }

    public static class a extends Handler {
        public WeakReference<TraceRePlay> a;

        public a(TraceRePlay traceRePlay) {
            super(Looper.getMainLooper());
            this.a = new WeakReference<>(traceRePlay);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            TraceRePlay traceRePlay = this.a.get();
            int i = message.what;
            if (i == 1) {
                LatLng latLng = (LatLng) message.obj;
                int i2 = message.arg1;
                if (traceRePlay.e != null) {
                    traceRePlay.e.onTraceUpdating(latLng, i2);
                    return;
                }
                return;
            }
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        if (traceRePlay.e != null) {
                            traceRePlay.e.remvoeAllMake();
                            return;
                        }
                        return;
                    } else {
                        if (i != 5) {
                            return;
                        }
                        LatLng latLng2 = (LatLng) message.obj;
                        int i3 = message.arg1;
                        if (traceRePlay.e != null) {
                            traceRePlay.e.onComplexTrackUpdateMark(latLng2, i3);
                            return;
                        }
                        return;
                    }
                }
            } else if (traceRePlay.e != null) {
                traceRePlay.e.onTraceUpdateFinish();
            }
            LatLng latLng3 = (LatLng) message.obj;
            int i4 = message.arg1;
            if (traceRePlay.e != null) {
                traceRePlay.e.onTrackUpdateMark(latLng3, i4);
            }
        }
    }

    public TraceRePlay(List<LatLng> list, List<LatLng> list2, int i, TraceRePlayListener traceRePlayListener) {
        this.b = list;
        this.c = list2;
        this.d = i;
        this.e = traceRePlayListener;
    }

    public float getLineDistance(List<LatLng> list) {
        float fCalculateLineDistance = 0.0f;
        if (list.size() < 2) {
            return 0.0f;
        }
        int i = 0;
        while (i < list.size() - 1) {
            LatLng latLng = list.get(i);
            i++;
            fCalculateLineDistance += AMapUtils.calculateLineDistance(latLng, list.get(i));
        }
        return fCalculateLineDistance / (Boolean.valueOf(RunnerData.getRunner().isMetric()).booleanValue() ? 1000.0f : 1609.34f);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:49:0x0195 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0197  */
    /* JADX WARN: Code duplicated, block: B:52:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:53:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:56:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:57:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:59:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:60:0x020e  */
    /* JADX WARN: Code duplicated, block: B:64:0x022e  */
    /* JADX WARN: Code duplicated, block: B:67:0x023e  */
    /* JADX WARN: Code duplicated, block: B:81:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:91:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x00ff, please report this as an issue */
    @Override // java.lang.Runnable
    public void run() {
        float size;
        float f;
        float f2;
        float f3;
        ArrayList<LatLng> arrayList;
        int size2;
        int i;
        int i2;
        int i3;
        int i4;
        Message messageObtainMessage;
        SparseArray<LatLng> sparseArray;
        int i5;
        int iKeyAt;
        LatLng latLng;
        float size3;
        float f4;
        List<LatLng> list = this.b;
        if (list != null) {
            int i6 = this.g;
            int i7 = 10;
            if (i6 != 3) {
                if (i6 == 8) {
                    size3 = list.size();
                    f4 = ((this.h / 10.0f) * 70.0f) + 10.0f;
                } else if (i6 != 10) {
                    size = list.size();
                    f = 120.0f;
                } else {
                    size3 = list.size();
                    f4 = ((this.h / 20.0f) * 20.0f) + 80.0f;
                }
                f2 = size3 / f4;
                f3 = f2 >= 1.0f ? f2 : 1.0f;
                arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                HMLog.i(TAG, "distanceType：：" + this.g + "     time ::" + f3 + "    mTraceList.size():" + this.b.size() + " distanceMark ：" + this.i, new Object[0]);
                size2 = 0;
                i = 0;
                while (size2 < this.b.size() && !this.f) {
                    if (size2 > this.b.size() - 1) {
                        size2 = this.b.size() - 1;
                    }
                    i2 = size2;
                    LatLng latLng2 = this.b.get(i2);
                    Message messageObtainMessage2 = this.a.obtainMessage();
                    messageObtainMessage2.what = 1;
                    messageObtainMessage2.obj = latLng2;
                    messageObtainMessage2.arg1 = i2;
                    this.a.sendMessage(messageObtainMessage2);
                    if (this.k && (sparseArray = this.j) != null && sparseArray.size() > 0) {
                        for (i5 = 0; i5 < this.j.size(); i5++) {
                            iKeyAt = this.j.keyAt(i5);
                            latLng = this.j.get(iKeyAt);
                            if (this.b.subList(0, i2).contains(latLng)) {
                                HMLog.i(TAG, "标记     latitude::" + latLng.latitude + "   longitude::" + latLng.longitude, new Object[0]);
                                Message messageObtainMessage3 = this.a.obtainMessage();
                                messageObtainMessage3.what = 5;
                                messageObtainMessage3.obj = latLng;
                                messageObtainMessage3.arg1 = iKeyAt;
                                this.a.sendMessage(messageObtainMessage3);
                            }
                        }
                    }
                    if (!this.k && this.i != 0 && i <= this.c.size()) {
                        float lineDistance = getLineDistance(this.b.subList(0, i2));
                        i3 = ((int) lineDistance) / this.i;
                        HMLog.i(TAG, "-----------distance::" + lineDistance + "  number ：：" + i3 + "   distanceMark：：" + this.i + "    size::" + this.b.size(), new Object[0]);
                        i4 = this.i;
                        if (i4 >= i7) {
                            if (i3 > i) {
                                if ((i4 * i3) - 1 >= this.c.size()) {
                                    List<LatLng> list2 = this.c;
                                    arrayList.add(list2.get(list2.size() - 1));
                                } else {
                                    arrayList.add(this.c.get((i3 * this.i) - 1));
                                }
                            }
                            for (LatLng latLng3 : this.b.subList(0, i2)) {
                                for (LatLng latLng4 : arrayList) {
                                    if (AMapUtils.calculateLineDistance(latLng3, latLng4) >= 10.0f && !arrayList2.contains(latLng4)) {
                                        Message messageObtainMessage4 = this.a.obtainMessage();
                                        messageObtainMessage4.what = 3;
                                        messageObtainMessage4.obj = latLng4;
                                        messageObtainMessage4.arg1 = this.c.indexOf(latLng4) + 1;
                                        this.a.sendMessage(messageObtainMessage4);
                                        arrayList2.add(latLng4);
                                        HMLog.i(TAG, "-----------distance::" + this.i, new Object[0]);
                                    }
                                }
                            }
                        } else if (i3 > i) {
                            messageObtainMessage = this.a.obtainMessage();
                            messageObtainMessage.what = 3;
                            if ((this.i * i3) - 1 >= this.c.size()) {
                                List<LatLng> list3 = this.c;
                                messageObtainMessage.obj = list3.get(list3.size() - 1);
                            } else {
                                messageObtainMessage.obj = this.c.get((this.i * i3) - 1);
                            }
                            messageObtainMessage.arg1 = this.i * i3;
                            this.a.sendMessage(messageObtainMessage);
                            HMLog.i(TAG, "-----------distance::" + this.i, new Object[0]);
                            i = i3;
                        }
                    }
                    try {
                        Thread.sleep(this.d);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    size2 = (int) (i2 + f3);
                    i7 = 10;
                }
                Message messageObtainMessage5 = this.a.obtainMessage();
                messageObtainMessage5.what = 4;
                this.a.sendMessage(messageObtainMessage5);
                Message messageObtainMessage6 = this.a.obtainMessage();
                messageObtainMessage6.what = 1;
                List<LatLng> list4 = this.b;
                messageObtainMessage6.obj = list4.get(list4.size() - 1);
                messageObtainMessage6.arg1 = this.b.size() - 1;
                this.a.sendMessage(messageObtainMessage6);
                if (this.f) {
                }
                Message messageObtainMessage7 = this.a.obtainMessage();
                messageObtainMessage7.what = 2;
                this.a.sendMessage(messageObtainMessage7);
            }
            size = list.size();
            f = this.h * 10.0f;
            f2 = size / f;
            if (f2 >= 1.0f) {
            }
            arrayList = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            HMLog.i(TAG, "distanceType：：" + this.g + "     time ::" + f3 + "    mTraceList.size():" + this.b.size() + " distanceMark ：" + this.i, new Object[0]);
            size2 = 0;
            i = 0;
            while (size2 < this.b.size()) {
                if (size2 > this.b.size() - 1) {
                    size2 = this.b.size() - 1;
                }
                i2 = size2;
                LatLng latLng5 = this.b.get(i2);
                Message messageObtainMessage8 = this.a.obtainMessage();
                messageObtainMessage8.what = 1;
                messageObtainMessage8.obj = latLng5;
                messageObtainMessage8.arg1 = i2;
                this.a.sendMessage(messageObtainMessage8);
                if (this.k) {
                    while (i5 < this.j.size()) {
                        iKeyAt = this.j.keyAt(i5);
                        latLng = this.j.get(iKeyAt);
                        if (this.b.subList(0, i2).contains(latLng)) {
                            HMLog.i(TAG, "标记     latitude::" + latLng.latitude + "   longitude::" + latLng.longitude, new Object[0]);
                            Message messageObtainMessage9 = this.a.obtainMessage();
                            messageObtainMessage9.what = 5;
                            messageObtainMessage9.obj = latLng;
                            messageObtainMessage9.arg1 = iKeyAt;
                            this.a.sendMessage(messageObtainMessage9);
                        }
                    }
                }
                if (!this.k) {
                    float lineDistance2 = getLineDistance(this.b.subList(0, i2));
                    i3 = ((int) lineDistance2) / this.i;
                    HMLog.i(TAG, "-----------distance::" + lineDistance2 + "  number ：：" + i3 + "   distanceMark：：" + this.i + "    size::" + this.b.size(), new Object[0]);
                    i4 = this.i;
                    if (i4 >= i7) {
                        if (i3 > i) {
                            if ((i4 * i3) - 1 >= this.c.size()) {
                                List<LatLng> list5 = this.c;
                                arrayList.add(list5.get(list5.size() - 1));
                            } else {
                                arrayList.add(this.c.get((i3 * this.i) - 1));
                            }
                        }
                        while (r0.hasNext()) {
                            while (r5.hasNext()) {
                                if (AMapUtils.calculateLineDistance(latLng3, latLng4) >= 10.0f) {
                                }
                            }
                        }
                    } else if (i3 > i) {
                        messageObtainMessage = this.a.obtainMessage();
                        messageObtainMessage.what = 3;
                        if ((this.i * i3) - 1 >= this.c.size()) {
                            List<LatLng> list6 = this.c;
                            messageObtainMessage.obj = list6.get(list6.size() - 1);
                        } else {
                            messageObtainMessage.obj = this.c.get((this.i * i3) - 1);
                        }
                        messageObtainMessage.arg1 = this.i * i3;
                        this.a.sendMessage(messageObtainMessage);
                        HMLog.i(TAG, "-----------distance::" + this.i, new Object[0]);
                        i = i3;
                    }
                }
                Thread.sleep(this.d);
                size2 = (int) (i2 + f3);
                i7 = 10;
            }
            Message messageObtainMessage10 = this.a.obtainMessage();
            messageObtainMessage10.what = 4;
            this.a.sendMessage(messageObtainMessage10);
            Message messageObtainMessage11 = this.a.obtainMessage();
            messageObtainMessage11.what = 1;
            List<LatLng> list7 = this.b;
            messageObtainMessage11.obj = list7.get(list7.size() - 1);
            messageObtainMessage11.arg1 = this.b.size() - 1;
            this.a.sendMessage(messageObtainMessage11);
            if (this.f) {
                Message messageObtainMessage12 = this.a.obtainMessage();
                messageObtainMessage12.what = 2;
                this.a.sendMessage(messageObtainMessage12);
            }
        }
    }

    public void stopTrace() {
        this.f = true;
    }
}
