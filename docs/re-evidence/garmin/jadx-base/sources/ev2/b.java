package ev2;

import gw2.i;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.y0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lev2/b;", "", "<init>", "()V", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f66165a = new a(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lev2/b$a;", "", "<init>", "()V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static c a(int i14, Map map) {
            Map map2;
            Map map3;
            Map map4;
            Long l14;
            map.getClass();
            dw2.b.f61449a.getClass();
            Map mapA = dw2.b.a(i14, map);
            Long l15 = null;
            if (mapA == null) {
                return null;
            }
            Object obj = mapA.get(i.DOUBLE_LABEL_SETTINGS.f79975a);
            try {
                if (!y0.h(obj)) {
                    obj = null;
                }
                map2 = (Map) obj;
            } catch (ClassCastException unused) {
                map2 = null;
            }
            Object obj2 = map2 != null ? map2.get(i.SUBTEXT.f79975a) : null;
            try {
                if (!y0.h(obj2)) {
                    obj2 = null;
                }
                map3 = (Map) obj2;
            } catch (ClassCastException unused2) {
                map3 = null;
            }
            Object obj3 = map2 != null ? map2.get(i.ICON_SETTINGS.f79975a) : null;
            try {
                if (!y0.h(obj3)) {
                    obj3 = null;
                }
                map4 = (Map) obj3;
            } catch (ClassCastException unused3) {
                map4 = null;
            }
            Object obj4 = map4 != null ? map4.get(i.LIGHT_COLOR.f79975a) : null;
            try {
                if (!(obj4 instanceof Long)) {
                    obj4 = null;
                }
                l14 = (Long) obj4;
            } catch (ClassCastException unused4) {
                l14 = null;
            }
            Object obj5 = map4 != null ? map4.get(i.DARK_COLOR.f79975a) : null;
            try {
                if (!(obj5 instanceof Long)) {
                    obj5 = null;
                }
                l15 = (Long) obj5;
            } catch (ClassCastException unused5) {
            }
            return new c(cx2.g.b(map3), l14, l15);
        }

        private a() {
        }
    }
}
