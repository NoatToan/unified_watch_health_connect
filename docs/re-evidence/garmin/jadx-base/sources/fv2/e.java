package fv2;

import android.content.Context;
import gw2.i;
import iw2.i1;
import java.util.Map;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.y0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lfv2/e;", "", "<init>", "()V", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f73748a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final cx2.h f73749b = new cx2.h("TODPickerDataHandler", null, 2, null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfv2/e$a;", "", "<init>", "()V", "Lcx2/h;", "logger", "Lcx2/h;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static b a(Map map) {
            int iF = fb1.c.f(map, i.MONTH.f79975a, cx2.b.f56665a);
            int iC = cx2.b.a.c(String.valueOf(map.get(i.DAY.f79975a)));
            int iC2 = cx2.b.a.c(String.valueOf(map.get(i.YEAR.f79975a)));
            if (iF <= 0 || iC <= 0 || iC2 <= 0) {
                return null;
            }
            return new b(iF, iC, iC2);
        }

        public static f b(int i14, Map map) {
            Map map2;
            Map map3;
            Map map4;
            Map map5;
            b bVarA;
            Map map6;
            b bVarA2;
            Map map7;
            map.getClass();
            e.f73749b.getClass();
            dw2.b.f61449a.getClass();
            Map mapA = dw2.b.a(i14, map);
            b bVarA3 = null;
            if (mapA != null) {
                Object obj = mapA.get(i.DOUBLE_LABEL_SETTINGS.f79975a);
                try {
                    if (!y0.h(obj)) {
                        obj = null;
                    }
                    map2 = (Map) obj;
                } catch (ClassCastException unused) {
                    map2 = null;
                }
                Object obj2 = map2 != null ? map2.get(i.DATE_PICKER_SETTINGS.f79975a) : null;
                try {
                    if (!y0.h(obj2)) {
                        obj2 = null;
                    }
                    map3 = (Map) obj2;
                } catch (ClassCastException unused2) {
                    map3 = null;
                }
                if (map3 != null) {
                    Object obj3 = map3.get(i.FORMATTED_VALUE.f79975a);
                    try {
                        if (!(obj3 instanceof Map)) {
                            obj3 = null;
                        }
                        map4 = (Map) obj3;
                    } catch (ClassCastException unused3) {
                        map4 = null;
                    }
                    tv2.c cVarB = cx2.g.b(map4);
                    Object obj4 = map3.get(i.SELECTED_DATE.f79975a);
                    try {
                        if (!(obj4 instanceof Map)) {
                            obj4 = null;
                        }
                        map5 = (Map) obj4;
                    } catch (ClassCastException unused4) {
                        map5 = null;
                    }
                    if (map5 != null) {
                        e.f73748a.getClass();
                        bVarA = a(map5);
                    } else {
                        bVarA = null;
                    }
                    Object obj5 = map3.get(i.MINIMUM_DATE.f79975a);
                    try {
                        if (!(obj5 instanceof Map)) {
                            obj5 = null;
                        }
                        map6 = (Map) obj5;
                    } catch (ClassCastException unused5) {
                        map6 = null;
                    }
                    if (map6 != null) {
                        e.f73748a.getClass();
                        bVarA2 = a(map6);
                    } else {
                        bVarA2 = null;
                    }
                    Object obj6 = map3.get(i.MAXIMUM_DATE.f79975a);
                    try {
                        if (!(obj6 instanceof Map)) {
                            obj6 = null;
                        }
                        map7 = (Map) obj6;
                    } catch (ClassCastException unused6) {
                        map7 = null;
                    }
                    if (map7 != null) {
                        e.f73748a.getClass();
                        bVarA3 = a(map7);
                    }
                    return new f(cVarB, bVarA, bVarA2, bVarA3);
                }
            }
            e.f73749b.getClass();
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object c(Context context, int i14, int i15, b bVar, v13.c cVar) {
            d dVar;
            String str;
            if (cVar instanceof d) {
                dVar = (d) cVar;
                int i16 = dVar.f73747d;
                if ((i16 & Integer.MIN_VALUE) != 0) {
                    dVar.f73747d = i16 - Integer.MIN_VALUE;
                } else {
                    dVar = new d(this, cVar);
                }
            } else {
                dVar = new d(this, cVar);
            }
            Object objP = dVar.f73745b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i17 = dVar.f73747d;
            if (i17 == 0) {
                r.b(objP);
                cx2.h hVar = e.f73749b;
                hVar.getClass();
                str = null;
                if (bVar == null) {
                    hVar.d(null, "updateDatePickerValue: Unable to update date picker when date is null");
                    return new jw2.a(false, false, null, null, 15, null);
                }
                i1 i1VarD = com.garmin.realtimesettings.app.initialization.b.d(com.garmin.realtimesettings.app.initialization.b.f52589a);
                if (i1VarD != null) {
                    dVar.f73744a = context;
                    dVar.f73747d = 1;
                    objP = i1VarD.p(i14, i15, bVar, dVar);
                    if (objP == aVar) {
                        return aVar;
                    }
                }
                jw2.d.f101374a.getClass();
                return jw2.d.a.a(context, str);
            }
            if (i17 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            context = dVar.f73744a;
            r.b(objP);
            str = (String) objP;
            jw2.d.f101374a.getClass();
            return jw2.d.a.a(context, str);
        }

        private a() {
        }
    }
}
