package xu2;

import gw2.i;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.y0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lxu2/a;", "", "<init>", "()V", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3588a f192253a = new C3588a(null);

    /* JADX INFO: renamed from: xu2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxu2/a$a;", "", "<init>", "()V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C3588a {
        public /* synthetic */ C3588a(j jVar) {
            this();
        }

        public static b a(int i14, Map map) {
            Map map2;
            Boolean bool;
            Long l14;
            map.getClass();
            dw2.b.f61449a.getClass();
            Map mapA = dw2.b.a(i14, map);
            if (mapA != null) {
                Object obj = mapA.get(i.BATTERY_STATUS_SETTINGS.f79975a);
                try {
                    if (!y0.h(obj)) {
                        obj = null;
                    }
                    map2 = (Map) obj;
                } catch (ClassCastException unused) {
                    map2 = null;
                }
                Object obj2 = map2 != null ? map2.get(i.IS_CHARGING.f79975a) : null;
                try {
                    if (!(obj2 instanceof Boolean)) {
                        obj2 = null;
                    }
                    bool = (Boolean) obj2;
                } catch (ClassCastException unused2) {
                    bool = null;
                }
                Object obj3 = map2 != null ? map2.get(i.STATE_OF_CHARGE.f79975a) : null;
                try {
                    if (!(obj3 instanceof Long)) {
                        obj3 = null;
                    }
                    l14 = (Long) obj3;
                } catch (ClassCastException unused3) {
                    l14 = null;
                }
                Integer numValueOf = l14 != null ? Integer.valueOf((int) l14.longValue()) : null;
                if (bool != null && numValueOf != null) {
                    return new b(bool.booleanValue(), numValueOf.intValue());
                }
            }
            return null;
        }

        private C3588a() {
        }
    }
}
