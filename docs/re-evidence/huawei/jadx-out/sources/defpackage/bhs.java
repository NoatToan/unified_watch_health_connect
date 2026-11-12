package defpackage;

import android.content.Context;
import android.util.Log;
import com.huawei.appgallery.markethomecountrysdk.f;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class bhs {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<Integer, Class<? extends f>> f1110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static f f1111c;

    public static f b(Context context) {
        synchronized (bhs.class) {
            f fVar = f1111c;
            if (fVar != null) {
                return fVar;
            }
            Log.i("DeviceImplFactory", "deviceType: " + bhw.c(context));
            Class<? extends f> cls = f1110b.get(Integer.valueOf(bhw.c(context)));
            if (cls == null) {
                bhv bhvVar = new bhv();
                f1111c = bhvVar;
                return bhvVar;
            }
            try {
                f1111c = cls.newInstance();
            } catch (Throwable unused) {
                f1111c = new bhv();
                Log.e("DeviceImplFactory", "createDeviceInfo error and create default phone deviceinfo");
            }
            return f1111c;
        }
    }

    static {
        HashMap map = new HashMap();
        f1110b = map;
        map.put(3, bhq.class);
        map.put(1, bhz.class);
        map.put(2, bhy.class);
        map.put(0, bhv.class);
        map.put(4, bhv.class);
        map.put(7, bhr.class);
    }
}
