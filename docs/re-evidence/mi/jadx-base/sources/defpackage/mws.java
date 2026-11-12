package defpackage;

import com.amap.api.col.p0003sl.d0;
import com.amap.api.col.p0003sl.e0;
import com.amap.api.col.p0003sl.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class mws {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile boolean f27303a = false;

    public static synchronized void a() {
        if (!f27303a) {
            d0.b().g("regeo", new f0("/geocode/regeo"));
            d0.b().g("placeAround", new f0("/place/around"));
            d0.b().g("placeText", new e0("/place/text"));
            d0.b().g("geo", new e0("/geocode/geo"));
            f27303a = true;
        }
    }
}
