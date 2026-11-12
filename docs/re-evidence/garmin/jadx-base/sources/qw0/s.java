package qw0;

import java.util.LinkedHashMap;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
public interface s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f148346a = a.f148347a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqw0/s$a;", "", "<init>", "()V", "gcm-map_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f148347a = new a();

        private a() {
        }

        public static boolean a() {
            return ((zd0.u) KoinJavaComponent.get$default(zd0.u.class, null, null, 6, null)).c(c80.q.MAPS_3D);
        }
    }

    boolean B(String str);

    boolean C();

    void D(String str, com.garmin.android.library.mapsdkadapter.i.d dVar);

    com.garmin.android.library.mapsdkadapter.i.d E(String str);

    Integer F();

    com.garmin.android.library.mapsdkadapter.i.d H();

    void a(boolean z14);

    boolean b();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    default boolean c() {
        boolean z14;
        if (b()) {
            f148346a.getClass();
            if (a.a()) {
                z14 = true;
            } else {
                z14 = false;
            }
        } else {
            z14 = false;
        }
        if (z14) {
            ie2.n.f93149a.getClass();
            LinkedHashMap linkedHashMap = ((com.garmin.android.library.mapsdkadapter.r) ie2.n.a()).f50332c;
            com.garmin.android.library.mapsdkadapter.i.d dVar = com.garmin.android.library.mapsdkadapter.i.d.MAPBOX;
            if (!linkedHashMap.containsKey(dVar)) {
                ((com.garmin.android.library.mapsdkadapter.r) ie2.n.a()).f50332c.put(dVar, Boolean.FALSE);
            }
            ((com.garmin.android.library.mapsdkadapter.r) ie2.n.a()).d(dVar);
        }
        return z14;
    }

    void e(int i14);

    com.garmin.android.library.mapsdkadapter.i.d l();

    void m(com.garmin.android.library.mapsdkadapter.i.d dVar);

    boolean n();

    void o(int i14, String str);

    void p(com.garmin.android.library.mapsdkadapter.i.d dVar);

    Integer q(String str);

    void s(String str, boolean z14);

    com.garmin.android.library.mapsdkadapter.i.d v();

    void x(boolean z14);

    void z(com.garmin.android.library.mapsdkadapter.i.d dVar);
}
