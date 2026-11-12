package ov2;

import android.content.Context;
import cx2.g;
import gw2.i;
import iw2.i1;
import java.util.Map;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.y0;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lov2/c;", "", "<init>", "()V", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f134263a = new a(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lov2/c$a;", "", "<init>", "()V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static d a(Map map, Map map2, int i14) {
            Map map3;
            Map map4;
            Map map5;
            Map map6;
            Map map7;
            Map map8;
            Map map9;
            int iC;
            double d14;
            double dB;
            int iC2;
            map.getClass();
            map2.getClass();
            dw2.b.f61449a.getClass();
            Map mapA = dw2.b.a(i14, map);
            if (mapA != null) {
                Object obj = mapA.get(i.EDIT_TEXT_SETTINGS.f79975a);
                try {
                    if (!y0.h(obj)) {
                        obj = null;
                    }
                    map3 = (Map) obj;
                } catch (ClassCastException unused) {
                    map3 = null;
                }
                if (map3 != null) {
                    Object obj2 = map3.get(i.FORMATTED_VALUE.f79975a);
                    try {
                        if (!(obj2 instanceof Map)) {
                            obj2 = null;
                        }
                        map4 = (Map) obj2;
                    } catch (ClassCastException unused2) {
                        map4 = null;
                    }
                    tv2.c cVarB = g.b(map4);
                    Object obj3 = map3.get(i.EDIT_TEXT_VALUE.f79975a);
                    try {
                        if (!(obj3 instanceof Map)) {
                            obj3 = null;
                        }
                        map5 = (Map) obj3;
                    } catch (ClassCastException unused3) {
                        map5 = null;
                    }
                    tv2.c cVarB2 = g.b(map5);
                    Object obj4 = map2.get(i.EDIT_TEXT_OPTIONS.f79975a);
                    try {
                        if (!(obj4 instanceof Map)) {
                            obj4 = null;
                        }
                        map6 = (Map) obj4;
                    } catch (ClassCastException unused4) {
                        map6 = null;
                    }
                    String strValueOf = String.valueOf(map6 != null ? map6.get(i.KEYBOARD_TYPE.f79975a) : null);
                    Object obj5 = map6 != null ? map6.get(i.EDIT_TEXT_PROPERTIES.f79975a) : null;
                    try {
                        if (!(obj5 instanceof Map)) {
                            obj5 = null;
                        }
                        map7 = (Map) obj5;
                    } catch (ClassCastException unused5) {
                        map7 = null;
                    }
                    Object obj6 = map6 != null ? map6.get(i.EDIT_TEXT_INTEGER_OPTIONS.f79975a) : null;
                    try {
                        if (!(obj6 instanceof Map)) {
                            obj6 = null;
                        }
                        map8 = (Map) obj6;
                    } catch (ClassCastException unused6) {
                        map8 = null;
                    }
                    Object obj7 = map6 != null ? map6.get(i.EDIT_TEXT_DECIMAL_OPTIONS.f79975a) : null;
                    try {
                        if (!(obj7 instanceof Map)) {
                            obj7 = null;
                        }
                        map9 = (Map) obj7;
                    } catch (ClassCastException unused7) {
                        map9 = null;
                    }
                    if (map8 != null) {
                        cx2.b.a aVar = cx2.b.f56665a;
                        String strValueOf2 = String.valueOf(map8.get(i.MINIMUM.f79975a));
                        aVar.getClass();
                        double dB2 = cx2.b.a.b(strValueOf2);
                        iC = -1;
                        iC2 = -1;
                        dB = cx2.b.a.b(String.valueOf(map8.get(i.MAXIMUM.f79975a)));
                        d14 = dB2;
                    } else if (map9 != null) {
                        cx2.b.a aVar2 = cx2.b.f56665a;
                        String strValueOf3 = String.valueOf(map9.get(i.MINIMUM.f79975a));
                        aVar2.getClass();
                        double dB3 = cx2.b.a.b(strValueOf3);
                        double dB4 = cx2.b.a.b(String.valueOf(map9.get(i.MAXIMUM.f79975a)));
                        iC2 = cx2.b.a.c(String.valueOf(map9.get(i.PRECISION.f79975a)));
                        iC = -1;
                        dB = dB4;
                        d14 = dB3;
                    } else {
                        cx2.b.a aVar3 = cx2.b.f56665a;
                        String strValueOf4 = String.valueOf(map7 != null ? map7.get(i.EDIT_TEXT_MAXIMUM_CODE_POINT_LENGTH.f79975a) : null);
                        aVar3.getClass();
                        iC = cx2.b.a.c(strValueOf4);
                        d14 = -1.0d;
                        dB = -1.0d;
                        iC2 = -1;
                    }
                    return new d(cVarB, cVarB2, iC, strValueOf, d14, dB, iC2);
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object b(Context context, int i14, int i15, String str, v13.c cVar) {
            b bVar;
            String str2;
            if (cVar instanceof b) {
                bVar = (b) cVar;
                int i16 = bVar.f134262d;
                if ((i16 & Integer.MIN_VALUE) != 0) {
                    bVar.f134262d = i16 - Integer.MIN_VALUE;
                } else {
                    bVar = new b(this, cVar);
                }
            } else {
                bVar = new b(this, cVar);
            }
            Object objQ = bVar.f134260b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i17 = bVar.f134262d;
            if (i17 == 0) {
                r.b(objQ);
                i1 i1VarD = com.garmin.realtimesettings.app.initialization.b.d(com.garmin.realtimesettings.app.initialization.b.f52589a);
                if (i1VarD != null) {
                    bVar.f134259a = context;
                    bVar.f134262d = 1;
                    objQ = i1VarD.q(i14, i15, str, bVar);
                    if (objQ == aVar) {
                        return aVar;
                    }
                } else {
                    str2 = null;
                }
                jw2.d.f101374a.getClass();
                return jw2.d.a.a(context, str2);
            }
            if (i17 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            context = bVar.f134259a;
            r.b(objQ);
            str2 = (String) objQ;
            jw2.d.f101374a.getClass();
            return jw2.d.a.a(context, str2);
        }

        private a() {
        }
    }
}
