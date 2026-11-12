package wu2;

import iw2.i1;
import java.util.HashMap;
import java.util.Map;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.y0;
import tn.k;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lwu2/d;", "", "<init>", "()V", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f187341a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final cx2.h f187342b = new cx2.h("ActionDataHandler", null, 2, null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lwu2/d$a;", "", "<init>", "()V", "Lcx2/h;", "logger", "Lcx2/h;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static e b(int i14, Map map) {
            Map map2;
            map.getClass();
            dw2.b.f61449a.getClass();
            Map mapA = dw2.b.a(i14, map);
            Map map3 = null;
            if (mapA == null) {
                return null;
            }
            Object obj = mapA.get(gw2.i.ACTION_SETTINGS.f79975a);
            try {
                if (!y0.h(obj)) {
                    obj = null;
                }
                map2 = (Map) obj;
            } catch (ClassCastException unused) {
                map2 = null;
            }
            Object obj2 = map2 != null ? map2.get(gw2.i.SUBTEXT.f79975a) : null;
            try {
                if (!y0.h(obj2)) {
                    obj2 = null;
                }
                map3 = (Map) obj2;
            } catch (ClassCastException unused2) {
            }
            return new e(cx2.g.b(map3));
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0056  */
        /* JADX WARN: Code duplicated, block: B:25:0x006b  */
        /* JADX WARN: Code duplicated, block: B:32:0x007c  */
        /* JADX WARN: Code duplicated, block: B:38:0x0084  */
        /* JADX WARN: Code duplicated, block: B:39:0x0089  */
        /* JADX WARN: Code duplicated, block: B:43:0x0096  */
        /* JADX WARN: Code duplicated, block: B:48:0x009d  */
        /* JADX WARN: Code duplicated, block: B:52:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:57:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:60:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:67:0x00d5  */
        /* JADX WARN: Code duplicated, block: B:74:0x00ea  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code duplicated, block: B:80:0x00f5  */
        /* JADX WARN: Code duplicated, block: B:83:0x0100  */
        public final Object a(int i14, int i15, v13.c cVar) {
            c cVar2;
            String str;
            Object obj;
            HashMap map;
            Object obj2;
            Boolean bool;
            boolean zBooleanValue;
            Object obj3;
            Boolean bool2;
            Object obj4;
            HashMap map2;
            Object obj5;
            Map map3;
            tv2.c cVarB;
            Object obj6;
            Map map4;
            tv2.c cVarB2;
            Object obj7;
            Map map5;
            tv2.c cVarB3;
            if (cVar instanceof c) {
                cVar2 = (c) cVar;
                int i16 = cVar2.f187340e;
                if ((i16 & Integer.MIN_VALUE) != 0) {
                    cVar2.f187340e = i16 - Integer.MIN_VALUE;
                } else {
                    cVar2 = new c(this, cVar);
                }
            } else {
                cVar2 = new c(this, cVar);
            }
            Object objX = cVar2.f187338c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i17 = cVar2.f187340e;
            tv2.b bVar = null;
            if (i17 == 0) {
                r.b(objX);
                d.f187342b.getClass();
                i1 i1VarD = com.garmin.realtimesettings.app.initialization.b.d(com.garmin.realtimesettings.app.initialization.b.f52589a);
                if (i1VarD != null) {
                    cVar2.f187336a = i14;
                    cVar2.f187337b = i15;
                    cVar2.f187340e = 1;
                    objX = i1VarD.x(i14, i15, cVar2);
                    if (objX == aVar) {
                        return aVar;
                    }
                } else {
                    str = null;
                }
                if (str != null) {
                    d.f187342b.d(null, k.e(i15, i14, "Did not receive response for Action Row - ", " for composition "));
                    return new jw2.a(false, false, null, null, 15, null);
                }
                com.garmin.realtimesettings.app.util.a.f52669a.getClass();
                HashMap mapB = com.garmin.realtimesettings.app.util.a.C1130a.b(str);
                obj = mapB.get(gw2.i.UPDATED_SETTINGS.f79975a);
                try {
                    if (!(obj instanceof HashMap)) {
                        obj = null;
                    }
                    map = (HashMap) obj;
                } catch (ClassCastException unused) {
                    map = null;
                }
                obj2 = mapB.get(gw2.i.EXIT_INSTANTIATION.f79975a);
                try {
                    if (!(obj2 instanceof Boolean)) {
                        obj2 = null;
                    }
                    bool = (Boolean) obj2;
                } catch (ClassCastException unused2) {
                    bool = null;
                }
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                obj3 = mapB.get(gw2.i.INVALIDATE.f79975a);
                try {
                    if (!(obj3 instanceof Boolean)) {
                        obj3 = null;
                    }
                    bool2 = (Boolean) obj3;
                } catch (ClassCastException unused3) {
                    bool2 = null;
                }
                boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                obj4 = mapB.get(gw2.i.INFORMATION_MESSAGE.f79975a);
                try {
                    if (!(obj4 instanceof HashMap)) {
                        obj4 = null;
                    }
                    map2 = (HashMap) obj4;
                } catch (ClassCastException unused4) {
                    map2 = null;
                }
                if (map2 != null) {
                    obj5 = map2.get(gw2.i.NEUTRAL_TEXT.f79975a);
                    try {
                        if (!(obj5 instanceof Map)) {
                            obj5 = null;
                        }
                        map3 = (Map) obj5;
                    } catch (ClassCastException unused5) {
                        map3 = null;
                    }
                    cVarB = cx2.g.b(map3);
                    obj6 = map2.get(gw2.i.TITLE.f79975a);
                    try {
                        if (!(obj6 instanceof Map)) {
                            obj6 = null;
                        }
                        map4 = (Map) obj6;
                    } catch (ClassCastException unused6) {
                        map4 = null;
                    }
                    cVarB2 = cx2.g.b(map4);
                    obj7 = map2.get(gw2.i.MESSAGE.f79975a);
                    try {
                        if (!(obj7 instanceof Map)) {
                            obj7 = null;
                        }
                        map5 = (Map) obj7;
                    } catch (ClassCastException unused7) {
                        map5 = null;
                    }
                    cVarB3 = cx2.g.b(map5);
                    if (map5 != null) {
                        bVar = new tv2.b(cVarB2, cVarB3, cVarB);
                    }
                }
                return new jw2.a(zBooleanValue, zBooleanValue2, map, bVar);
            }
            if (i17 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i15 = cVar2.f187337b;
            i14 = cVar2.f187336a;
            r.b(objX);
            str = (String) objX;
            if (str != null) {
                d.f187342b.d(null, k.e(i15, i14, "Did not receive response for Action Row - ", " for composition "));
                return new jw2.a(false, false, null, null, 15, null);
            }
            com.garmin.realtimesettings.app.util.a.f52669a.getClass();
            HashMap mapB2 = com.garmin.realtimesettings.app.util.a.C1130a.b(str);
            obj = mapB2.get(gw2.i.UPDATED_SETTINGS.f79975a);
            if (!(obj instanceof HashMap)) {
                obj = null;
            }
            map = (HashMap) obj;
            obj2 = mapB2.get(gw2.i.EXIT_INSTANTIATION.f79975a);
            if (!(obj2 instanceof Boolean)) {
                obj2 = null;
            }
            bool = (Boolean) obj2;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            obj3 = mapB2.get(gw2.i.INVALIDATE.f79975a);
            if (!(obj3 instanceof Boolean)) {
                obj3 = null;
            }
            bool2 = (Boolean) obj3;
            if (bool2 != null) {
            }
            obj4 = mapB2.get(gw2.i.INFORMATION_MESSAGE.f79975a);
            if (!(obj4 instanceof HashMap)) {
                obj4 = null;
            }
            map2 = (HashMap) obj4;
            if (map2 != null) {
                obj5 = map2.get(gw2.i.NEUTRAL_TEXT.f79975a);
                if (!(obj5 instanceof Map)) {
                    obj5 = null;
                }
                map3 = (Map) obj5;
                cVarB = cx2.g.b(map3);
                obj6 = map2.get(gw2.i.TITLE.f79975a);
                if (!(obj6 instanceof Map)) {
                    obj6 = null;
                }
                map4 = (Map) obj6;
                cVarB2 = cx2.g.b(map4);
                obj7 = map2.get(gw2.i.MESSAGE.f79975a);
                if (!(obj7 instanceof Map)) {
                    obj7 = null;
                }
                map5 = (Map) obj7;
                cVarB3 = cx2.g.b(map5);
                if (map5 != null) {
                    bVar = new tv2.b(cVarB2, cVarB3, cVarB);
                }
            }
            return new jw2.a(zBooleanValue, zBooleanValue2, map, bVar);
        }

        private a() {
        }
    }
}
