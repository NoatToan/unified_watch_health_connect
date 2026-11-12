package com.amap.api.col.p0003sl;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.amap.api.maps.model.LatLng;
import com.amap.api.trace.LBSTraceClient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class ii {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile ii f2754b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, a> f2755a;

    public ii() {
        this.f2755a = null;
        this.f2755a = Collections.synchronizedMap(new HashMap());
    }

    public static ii a() {
        if (f2754b == null) {
            synchronized (ii.class) {
                if (f2754b == null) {
                    f2754b = new ii();
                }
            }
        }
        return f2754b;
    }

    public final void a(String str, int i, List<LatLng> list) {
        synchronized (this) {
            Map<String, a> map = this.f2755a;
            if (map != null) {
                map.get(str).a().put(Integer.valueOf(i), list);
            }
        }
    }

    public final void a(String str, int i, int i2, int i3) {
        synchronized (this) {
            Map<String, a> map = this.f2755a;
            if (map != null) {
                map.put(str, new a(i, i2, i3, new HashMap(16)));
            }
        }
    }

    public final a a(String str) {
        synchronized (this) {
            Map<String, a> map = this.f2755a;
            if (map == null) {
                return null;
            }
            return map.get(str);
        }
    }

    public static void a(Handler handler, int i, String str) {
        Message messageObtainMessage = handler.obtainMessage();
        messageObtainMessage.obj = str;
        messageObtainMessage.what = 102;
        Bundle bundle = new Bundle();
        bundle.putInt("lineID", i);
        messageObtainMessage.setData(bundle);
        handler.sendMessage(messageObtainMessage);
    }

    final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f2757b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f2758c;
        private int e;
        private HashMap<Integer, List<LatLng>> g;
        private int d = 0;
        private int f = 0;
        private List<LatLng> h = new ArrayList();

        public a(int i, int i2, int i3, HashMap<Integer, List<LatLng>> map) {
            this.f2757b = 0;
            this.f2758c = 0;
            this.e = 0;
            this.f2757b = i2;
            this.g = map;
            this.f2758c = i;
            this.e = i3;
        }

        public final HashMap<Integer, List<LatLng>> a() {
            return this.g;
        }

        public final void a(Handler handler) {
            List<LatLng> list;
            for (int i = this.d; i <= this.f2757b && (list = this.g.get(Integer.valueOf(i))) != null; i++) {
                this.h.addAll(list);
                a(handler, list);
            }
            if (this.d == this.f2757b + 1) {
                b(handler);
            }
        }

        private void a(Handler handler, List<LatLng> list) {
            Message messageObtainMessage = handler.obtainMessage();
            messageObtainMessage.obj = list;
            messageObtainMessage.what = 100;
            messageObtainMessage.arg1 = this.d;
            Bundle bundle = new Bundle();
            bundle.putInt("lineID", this.f2758c);
            messageObtainMessage.setData(bundle);
            handler.sendMessage(messageObtainMessage);
            this.d++;
            this.f++;
        }

        private void b(Handler handler) {
            if (this.f > 0) {
                int iA = Cif.a(this.h);
                Message messageObtainMessage = handler.obtainMessage();
                messageObtainMessage.obj = this.h;
                messageObtainMessage.what = 101;
                messageObtainMessage.arg1 = iA;
                messageObtainMessage.arg2 = this.e;
                Bundle bundle = new Bundle();
                bundle.putInt("lineID", this.f2758c);
                messageObtainMessage.setData(bundle);
                handler.sendMessage(messageObtainMessage);
                return;
            }
            ii.a(handler, this.f2758c, LBSTraceClient.MIN_GRASP_POINT_ERROR);
        }
    }
}
