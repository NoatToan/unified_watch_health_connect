package defpackage;

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

/* JADX INFO: loaded from: classes4.dex */
public class b0t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile b0t f3662b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, a> f3663a;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3664a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3665b;
        public int d;
        public HashMap<Integer, List<LatLng>> f;
        public int c = 0;
        public int e = 0;
        public List<LatLng> g = new ArrayList();

        public a(int i, int i2, int i3, HashMap<Integer, List<LatLng>> map) {
            this.f3664a = 0;
            this.f3665b = 0;
            this.d = 0;
            this.f3664a = i2;
            this.f = map;
            this.f3665b = i;
            this.d = i3;
        }

        public final HashMap<Integer, List<LatLng>> a() {
            return this.f;
        }

        public final void b(Handler handler) {
            List<LatLng> list;
            for (int i = this.c; i <= this.f3664a && (list = this.f.get(Integer.valueOf(i))) != null; i++) {
                this.g.addAll(list);
                c(handler, list);
            }
            if (this.c == this.f3664a + 1) {
                d(handler);
            }
        }

        public final void c(Handler handler, List<LatLng> list) {
            Message messageObtainMessage = handler.obtainMessage();
            messageObtainMessage.obj = list;
            messageObtainMessage.what = 100;
            messageObtainMessage.arg1 = this.c;
            Bundle bundle = new Bundle();
            bundle.putInt("lineID", this.f3665b);
            messageObtainMessage.setData(bundle);
            handler.sendMessage(messageObtainMessage);
            this.c++;
            this.e++;
        }

        public final void d(Handler handler) {
            if (this.e <= 0) {
                b0t.c(handler, this.f3665b, LBSTraceClient.MIN_GRASP_POINT_ERROR);
                return;
            }
            int iA = xzs.a(this.g);
            Message messageObtainMessage = handler.obtainMessage();
            messageObtainMessage.obj = this.g;
            messageObtainMessage.what = 101;
            messageObtainMessage.arg1 = iA;
            messageObtainMessage.arg2 = this.d;
            Bundle bundle = new Bundle();
            bundle.putInt("lineID", this.f3665b);
            messageObtainMessage.setData(bundle);
            handler.sendMessage(messageObtainMessage);
        }
    }

    public b0t() {
        this.f3663a = null;
        this.f3663a = Collections.synchronizedMap(new HashMap());
    }

    public static b0t b() {
        if (f3662b == null) {
            synchronized (b0t.class) {
                try {
                    if (f3662b == null) {
                        f3662b = new b0t();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f3662b;
    }

    public static void c(Handler handler, int i, String str) {
        Message messageObtainMessage = handler.obtainMessage();
        messageObtainMessage.obj = str;
        messageObtainMessage.what = 102;
        Bundle bundle = new Bundle();
        bundle.putInt("lineID", i);
        messageObtainMessage.setData(bundle);
        handler.sendMessage(messageObtainMessage);
    }

    public final synchronized a a(String str) {
        Map<String, a> map = this.f3663a;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public final synchronized void d(String str, int i, int i2, int i3) {
        Map<String, a> map = this.f3663a;
        if (map != null) {
            map.put(str, new a(i, i2, i3, new HashMap(16)));
        }
    }

    public final synchronized void e(String str, int i, List<LatLng> list) {
        Map<String, a> map = this.f3663a;
        if (map != null) {
            map.get(str).a().put(Integer.valueOf(i), list);
        }
    }
}
