package lv2;

import cx2.g;
import gw2.i;
import java.util.ArrayList;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Llv2/b;", "", "<init>", "()V", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f115050a = new a(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llv2/b$a;", "", "<init>", "()V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static c a(Map map, Map map2, Map map3, Long l14, Long l15) {
            Map map4;
            Map map5;
            ArrayList arrayList;
            Map map6;
            cx2.b.a aVar = cx2.b.f56665a;
            Map map7 = null;
            String strValueOf = String.valueOf(map2 != null ? map2.get(i.SELECTED_INDEX.f79975a) : null);
            aVar.getClass();
            int iC = cx2.b.a.c(strValueOf);
            Object obj = map.get(i.LINK_OPTIONS.f79975a);
            try {
                if (!(obj instanceof Map)) {
                    obj = null;
                }
                map4 = (Map) obj;
            } catch (ClassCastException unused) {
                map4 = null;
            }
            Object obj2 = map4 != null ? map4.get(i.SELECTION_OPTIONS.f79975a) : null;
            try {
                if (!(obj2 instanceof Map)) {
                    obj2 = null;
                }
                map5 = (Map) obj2;
            } catch (ClassCastException unused2) {
                map5 = null;
            }
            if (map5 != null) {
                Object obj3 = map5.get(i.ROWS.f79975a);
                try {
                    if (!(obj3 instanceof ArrayList)) {
                        obj3 = null;
                    }
                    arrayList = (ArrayList) obj3;
                } catch (ClassCastException unused3) {
                    arrayList = null;
                }
                if (arrayList != null && iC >= 0 && iC <= arrayList.size() - 1) {
                    Object obj4 = arrayList.get(iC);
                    try {
                        if (!(obj4 instanceof Map)) {
                            obj4 = null;
                        }
                        map6 = (Map) obj4;
                    } catch (ClassCastException unused4) {
                        map6 = null;
                    }
                    if (map6 != null) {
                        if (map3 != null) {
                            return new c(Integer.valueOf(iC), g.b(map3), l15, l14);
                        }
                        a aVar2 = b.f115050a;
                        Object obj5 = map6.get(i.TITLE.f79975a);
                        try {
                            if (!(obj5 instanceof Map)) {
                                obj5 = null;
                            }
                            map7 = (Map) obj5;
                        } catch (ClassCastException unused5) {
                        }
                        return new c(Integer.valueOf(iC), g.b(map7), l15, l14);
                    }
                }
            } else if (s.g(map.get(i.TYPE.f79975a), gw2.j.SELECTION_ITEM.f80000a)) {
                Object obj6 = map.get(i.TITLE.f79975a);
                try {
                    if (!(obj6 instanceof Map)) {
                        obj6 = null;
                    }
                    map7 = (Map) obj6;
                } catch (ClassCastException unused6) {
                }
                return new c(Integer.valueOf(iC), g.b(map7), l15, l14);
            }
            return null;
        }

        private a() {
        }
    }
}
