package ev2;

import androidx.fragment.app.Fragment;
import cx2.h;
import gw2.i;
import gw2.j;
import java.util.Map;
import java.util.Objects;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lev2/a;", "Lew2/d;", "<init>", "()V", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a extends ew2.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f66164c;

    static {
        new C1392a(null);
        f66164c = new h("DoubleLabelClick", null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(Fragment fragment, g gVar, e eVar, dx2.c cVar, Map map) {
        Map map2;
        dx2.c cVar2;
        Map map3;
        cVar.getClass();
        Object obj = map.get(i.LINK_OPTIONS.f79975a);
        try {
            if (!(obj instanceof Map)) {
                obj = null;
            }
            map2 = (Map) obj;
        } catch (ClassCastException unused) {
            map2 = null;
        }
        String strValueOf = String.valueOf(map2 != null ? map2.get(i.LINK_TYPE.f79975a) : null);
        int iHashCode = strValueOf.hashCode();
        h hVar = f66164c;
        switch (iHashCode) {
            case -1703078927:
                cVar2 = cVar;
                map3 = map;
                if (strValueOf.equals("FLOAT_PICKER")) {
                    if (!(eVar instanceof gv2.e)) {
                        hVar.getClass();
                    } else {
                        gv2.a.f79446a.getClass();
                        gv2.a.f79447b.getClass();
                        gVar.setOnClickListener(new ew2.c((com.garmin.realtimesettings.app.presentationlayer.c) fragment, (gv2.e) eVar, cVar2, map3, 5));
                    }
                }
                b(fragment, gVar, cVar2, map3);
                break;
            case -1356905372:
                cVar2 = cVar;
                map3 = map;
                if (strValueOf.equals("TOD_PICKER")) {
                    if (!(eVar instanceof nv2.e)) {
                        hVar.getClass();
                    } else {
                        nv2.a.f127965a.getClass();
                        nv2.a.f127966b.getClass();
                        gVar.setOnClickListener(new ew2.c((com.garmin.realtimesettings.app.presentationlayer.c) fragment, (nv2.e) eVar, cVar2, map3, 16));
                    }
                }
                b(fragment, gVar, cVar2, map3);
                break;
            case -1222931002:
                cVar2 = cVar;
                map3 = map;
                if (strValueOf.equals("MULTI_SELECTION")) {
                    if (!(eVar instanceof kv2.e)) {
                        hVar.getClass();
                    } else {
                        kv2.b.f106812a.getClass();
                        kv2.b.f106813b.getClass();
                        gVar.setOnClickListener(new kv2.a((com.garmin.realtimesettings.app.presentationlayer.c) fragment, cVar2, map3, 0));
                    }
                }
                b(fragment, gVar, cVar2, map3);
                break;
            case -989593271:
                cVar2 = cVar;
                map3 = map;
                if (strValueOf.equals("INTEGER_INPUT")) {
                    if (!(eVar instanceof iv2.e)) {
                        hVar.getClass();
                    } else {
                        iv2.a.f95215a.getClass();
                        iv2.a.f95216b.getClass();
                        gVar.setOnClickListener(new ew2.c((com.garmin.realtimesettings.app.presentationlayer.c) fragment, (iv2.e) eVar, cVar2, map3, 8));
                    }
                }
                b(fragment, gVar, cVar2, map3);
                break;
            case -979005701:
                cVar2 = cVar;
                map3 = map;
                if (strValueOf.equals("SELECTION_WITH_CONFIRMATION")) {
                    lv2.a.C2189a c2189a = lv2.a.f115048a;
                    String strC4 = dx2.c.C4(map3);
                    c2189a.getClass();
                    lv2.a.f115049b.getClass();
                    gVar.setOnClickListener(new ew2.c(fragment, cVar2, map3, (Object) strC4, 13));
                }
                b(fragment, gVar, cVar2, map3);
                break;
            case -417231153:
                cVar2 = cVar;
                map3 = map;
                if (strValueOf.equals("INTEGER_PICKER")) {
                    if (!(eVar instanceof jv2.e)) {
                        hVar.getClass();
                    } else {
                        jv2.a.f101189a.getClass();
                        jv2.a.f101190b.getClass();
                        gVar.setOnClickListener(new ew2.c((com.garmin.realtimesettings.app.presentationlayer.c) fragment, (jv2.e) eVar, cVar2, map3, 9));
                    }
                }
                b(fragment, gVar, cVar2, map3);
                break;
            case 1070629228:
                map3 = map;
                if (!strValueOf.equals("SELECTION")) {
                    cVar2 = cVar;
                    b(fragment, gVar, cVar2, map3);
                } else {
                    lv2.a.f115048a.getClass();
                    lv2.a.f115049b.getClass();
                    gVar.setOnClickListener(new ew2.c(fragment, cVar, map3, (Object) null, 13));
                }
                break;
            case 1247436352:
                cVar2 = cVar;
                map3 = map;
                if (strValueOf.equals("TIME_PICKER")) {
                    if (!(eVar instanceof mv2.f)) {
                        hVar.getClass();
                    } else {
                        mv2.b.f121199a.getClass();
                        mv2.b.f121200b.getClass();
                        gVar.setOnClickListener(new ew2.c((com.garmin.realtimesettings.app.presentationlayer.c) fragment, (mv2.f) eVar, cVar2, map3, 15));
                    }
                }
                b(fragment, gVar, cVar2, map3);
                break;
            case 1418373798:
                cVar2 = cVar;
                map3 = map;
                if (strValueOf.equals("HEIGHT_PICKER")) {
                    if (!(eVar instanceof hv2.e)) {
                        hVar.getClass();
                    } else {
                        hv2.a.f85897a.getClass();
                        hv2.a.f85898b.getClass();
                        gVar.setOnClickListener(new ew2.c((com.garmin.realtimesettings.app.presentationlayer.c) fragment, (hv2.e) eVar, cVar2, map3, 6));
                    }
                }
                b(fragment, gVar, cVar2, map3);
                break;
            case 1738715711:
                if (strValueOf.equals("DATE_PICKER")) {
                    if (!(eVar instanceof fv2.g)) {
                        hVar.getClass();
                    } else {
                        String strA4 = dx2.c.A4(map);
                        String strL4 = dx2.c.L4(map);
                        if (s.g(strA4, j.DOUBLE_LABEL.f80000a) && s.g(strL4, "DATE_PICKER")) {
                            fv2.a.f73737a.getClass();
                            gw2.f fVar = gw2.f.BIRTHDATE_CUSTOMER_SUPPORT;
                            h hVar2 = fv2.a.f73738b;
                            Objects.toString(fVar);
                            hVar2.getClass();
                            gVar.setOnClickListener(new bv2.j(fVar, 5, map, (com.garmin.realtimesettings.app.presentationlayer.c) fragment));
                        } else {
                            fv2.c.f73742a.getClass();
                            fv2.c.f73743b.getClass();
                            gVar.setOnClickListener(new ew2.c((com.garmin.realtimesettings.app.presentationlayer.c) fragment, (fv2.g) eVar, cVar, map, 3));
                        }
                    }
                    break;
                }
            default:
                cVar2 = cVar;
                map3 = map;
                b(fragment, gVar, cVar2, map3);
                break;
        }
    }

    /* JADX INFO: renamed from: ev2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lev2/a$a;", "", "<init>", "()V", "Lcx2/h;", "logger", "Lcx2/h;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1392a {
        public /* synthetic */ C1392a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1392a() {
        }
    }
}
