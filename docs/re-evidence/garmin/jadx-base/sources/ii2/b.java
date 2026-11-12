package ii2;

import android.content.Context;
import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import com.google.maps.android.BuildConfig;
import d53.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mh2.i;
import mh2.m;
import nh2.d;
import org.apache.commons.lang3.BooleanUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lii2/b;", "Landroidx/lifecycle/u1;", "Lnh2/d;", "settingsDataModel", "<init>", "(Lnh2/d;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f93791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hi2.d f93792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0<Map<String, Object>> f93793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f93794d;

    public b(d dVar) {
        dVar.getClass();
        this.f93791a = dVar;
        this.f93792b = new hi2.d("SettingsViewModel", null, 2, null);
        this.f93793c = new y0<>();
    }

    public static List G4(Map map) {
        map.getClass();
        Object obj = map.get(i.TRANSFORM.f118617a);
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map2 = (Map) obj;
        if (map2 == null) {
            return null;
        }
        Object obj2 = map2.get(i.DEPENDENCIES.f118617a);
        return (List) (obj2 instanceof List ? obj2 : null);
    }

    public static String I4(Map map) {
        map.getClass();
        hi2.a.C1658a c1658a = hi2.a.f83879a;
        Object obj = map.get(i.VALUE.f118617a);
        String string = obj != null ? obj.toString() : null;
        c1658a.getClass();
        return hi2.a.C1658a.i(string);
    }

    public static ArrayList y4(Map map) {
        Object obj = map.get(i.DISPLAY_ARGS.f118617a);
        if (!(obj instanceof ArrayList)) {
            obj = null;
        }
        ArrayList arrayList = (ArrayList) obj;
        if (arrayList != null) {
            return arrayList;
        }
        Object obj2 = map.get(i.TEXT_ARGS.f118617a);
        return (ArrayList) (obj2 instanceof ArrayList ? obj2 : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final rh2.b A4(Map<String, ? extends Object> map) {
        String str;
        String str2;
        String str3;
        String str4;
        Object obj = map.get(i.NAVIGATION.f118617a);
        Object obj2 = null;
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map2 = (Map) obj;
        Object obj3 = map2 != null ? map2.get(i.DATA.f118617a) : null;
        if (!(obj3 instanceof Map)) {
            obj3 = null;
        }
        Map map3 = (Map) obj3;
        if (map3 != null) {
            map3.toString();
            this.f93792b.getClass();
        } else {
            map3 = null;
        }
        if (map3 == null) {
            return null;
        }
        Object obj4 = map3.get(i.TYPE.f118617a);
        if (obj4 != null) {
            if (!(obj4 instanceof String)) {
                obj4 = null;
            }
            str = (String) obj4;
        } else {
            str = null;
        }
        Object obj5 = map3.get(i.WATCH_FACE.f118617a);
        if (obj5 != null) {
            if (!(obj5 instanceof String)) {
                obj5 = null;
            }
            str2 = (String) obj5;
        } else {
            str2 = null;
        }
        Object obj6 = map3.get(i.WATCH_FACE_OVERFLOW.f118617a);
        if (obj6 != null) {
            if (!(obj6 instanceof String)) {
                obj6 = null;
            }
            str3 = (String) obj6;
        } else {
            str3 = null;
        }
        Object obj7 = map3.get(i.WATCH_FACE_FALLBACK.f118617a);
        if (obj7 != null) {
            if (!(obj7 instanceof String)) {
                obj7 = null;
            }
            str4 = (String) obj7;
        } else {
            str4 = null;
        }
        Object obj8 = map3.get(i.WATCH_FACE_OVERFLOW_FALLBACK.f118617a);
        if (obj8 != null) {
            obj2 = (String) (obj8 instanceof String ? obj8 : null);
        }
        return new rh2.b(str2, str3, str4, obj2, str);
    }

    public final String B4(String str) {
        Object objD = this.f93791a.d(str);
        String string = objD != null ? objD.toString() : null;
        this.f93792b.getClass();
        return string;
    }

    public final List<Map<String, Object>> C4(Map<String, ? extends Object> map) {
        map.getClass();
        this.f93792b.getClass();
        Object obj = map.get(i.TRANSFORM.f118617a);
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map2 = (Map) obj;
        if (map2 == null) {
            return null;
        }
        Object obj2 = map2.get(i.DEPENDENCIES.f118617a);
        return (List) (obj2 instanceof List ? obj2 : null);
    }

    public final String D4(Map<String, ? extends Object> map) {
        Object obj = map.get(i.NAVIGATION.f118617a);
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map2 = (Map) obj;
        Object obj2 = map2 != null ? map2.get(i.EXTERNAL.f118617a) : null;
        String string = obj2 != null ? obj2.toString() : null;
        this.f93792b.getClass();
        return string;
    }

    public final LinkedHashMap E4(Map map) {
        map.getClass();
        this.f93792b.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj = map.get(i.TRANSFORM.f118617a);
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map2 = (Map) obj;
        Object obj2 = map2 != null ? map2.get(i.COMPONENTS.f118617a) : null;
        if (!(obj2 instanceof List)) {
            obj2 = null;
        }
        List<Map> list = (List) obj2;
        if (list != null) {
            for (Map map3 : list) {
                Object obj3 = map3.get(i.TYPE.f118617a);
                m mVar = m.RANGE;
                if (s.g(obj3, mVar.f118678a)) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    String str = i.START.f118617a;
                    hi2.a.C1658a c1658a = hi2.a.f83879a;
                    String strValueOf = String.valueOf(map3.get(str));
                    c1658a.getClass();
                    linkedHashMap2.put(str, Integer.valueOf(hi2.a.C1658a.h(strValueOf)));
                    String str2 = i.END.f118617a;
                    linkedHashMap2.put(str2, Integer.valueOf(hi2.a.C1658a.h(String.valueOf(map3.get(str2)))));
                    String str3 = i.STEP.f118617a;
                    linkedHashMap2.put(str3, Integer.valueOf(hi2.a.C1658a.h(String.valueOf(map3.get(str3)))));
                    String str4 = i.VALUES_BEFORE.f118617a;
                    Object obj4 = map3.get(str4);
                    if (!(obj4 instanceof List)) {
                        obj4 = null;
                    }
                    linkedHashMap2.put(str4, (List) obj4);
                    String str5 = i.VALUES_AFTER.f118617a;
                    Object obj5 = map3.get(str5);
                    if (!(obj5 instanceof List)) {
                        obj5 = null;
                    }
                    linkedHashMap2.put(str5, (List) obj5);
                    linkedHashMap.put(mVar.f118678a, linkedHashMap2);
                } else {
                    m mVar2 = m.LABEL;
                    if (s.g(obj3, mVar2.f118678a)) {
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        String str6 = i.DISPLAY.f118617a;
                        linkedHashMap3.put(str6, String.valueOf(map3.get(str6)));
                        linkedHashMap.put(mVar2.f118678a, linkedHashMap3);
                    } else {
                        m mVar3 = m.LIST;
                        if (s.g(obj3, mVar3.f118678a)) {
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                            String str7 = i.VALUES.f118617a;
                            Object obj6 = map3.get(str7);
                            if (!(obj6 instanceof List)) {
                                obj6 = null;
                            }
                            linkedHashMap4.put(str7, (List) obj6);
                            linkedHashMap.put(mVar3.f118678a, linkedHashMap4);
                        }
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public final String F4(Map<String, ? extends Object> map) {
        Object obj = map.get(i.NAVIGATION.f118617a);
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map2 = (Map) obj;
        Object obj2 = map2 != null ? map2.get(i.SECTION.f118617a) : null;
        String string = obj2 != null ? obj2.toString() : null;
        this.f93792b.getClass();
        return string;
    }

    public final String H4(Map<String, ? extends Object> map) {
        Object obj = map.get(i.TRANSFORM.f118617a);
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map2 = (Map) obj;
        Object obj2 = map2 != null ? map2.get(i.TYPE.f118617a) : null;
        String string = obj2 != null ? obj2.toString() : null;
        this.f93792b.getClass();
        return string;
    }

    public final Boolean J4(Map<String, ? extends Object> map) {
        Object obj = map.get(i.VALUE_ID.f118617a);
        Object objD = this.f93791a.d(obj != null ? obj.toString() : null);
        i iVar = i.ON_VALUE;
        Boolean boolValueOf = Boolean.valueOf(String.valueOf(objD).equals(map.containsKey(iVar.f118617a) ? String.valueOf(map.get(iVar.f118617a)) : BooleanUtils.TRUE));
        this.f93792b.getClass();
        return boolValueOf;
    }

    public final boolean K4(Map<String, ? extends Object> map) {
        map.getClass();
        this.f93792b.getClass();
        Object obj = map.get(i.ENABLED.f118617a);
        if (!(obj instanceof Map)) {
            obj = null;
        }
        return x4((Map) obj);
    }

    public final void L4(Object obj, String str) {
        str.getClass();
        this.f93792b.a("updateAndNotifyObservers: key=" + str + ", value=" + obj);
        d dVar = this.f93791a;
        hi2.d dVar2 = dVar.f126161a;
        dVar2.getClass();
        if (dVar.f126168h.isEmpty()) {
            dVar2.b("Data Value is empty");
        } else {
            Map<String, Object> map = dVar.f126168h;
            Iterator it = w.W(str, new String[]{"."}).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (it.hasNext()) {
                    Object obj2 = null;
                    Object obj3 = map != null ? map.get(str2) : null;
                    if (obj3 != null) {
                        if (p005kotlin.jvm.internal.y0.h(obj3)) {
                            obj2 = (Map) (p005kotlin.jvm.internal.y0.h(obj3) ? obj3 : null);
                        } else {
                            boolean z14 = obj3 instanceof ArrayList;
                            if (!z14) {
                                dVar2.b("Unable to update data value for " + str + " to " + obj);
                            } else if (it.hasNext()) {
                                if (!z14) {
                                    obj3 = null;
                                }
                                ArrayList arrayList = (ArrayList) obj3;
                                if (arrayList != null) {
                                    obj2 = (Map) arrayList.get(Integer.parseInt((String) it.next()));
                                }
                            } else {
                                dVar2.b("Something is wrong with the array in JSON");
                            }
                        }
                        map = obj2;
                    }
                } else {
                    dVar2.a("Updated data value for " + str + " to " + obj);
                    if (map != null) {
                        map.put(str2, obj);
                    }
                }
            }
            if (Unit.INSTANCE == null) {
                dVar2.b("Json key must not be null");
            }
        }
        this.f93793c.m(dVar.f126168h);
    }

    public final boolean x4(Map<String, ? extends Object> map) {
        String string;
        String string2;
        String string3;
        String string4;
        boolean z14 = true;
        if (map != null) {
            Object obj = map.get(i.TYPE.f118617a);
            String string5 = obj != null ? obj.toString() : null;
            Object obj2 = map.get(i.DEPENDENCIES.f118617a);
            if (!(obj2 instanceof List)) {
                obj2 = null;
            }
            List<Map> list = (List) obj2;
            if (string5 != null) {
                if (string5.equals(m.ALL.f118678a)) {
                    if (list != null) {
                        for (Map map2 : list) {
                            String strB4 = B4(String.valueOf(map2.get(i.VALUE_ID.f118617a)));
                            String strI = strB4 != null ? hb.a.i(strB4) : null;
                            Object obj3 = map2.get(i.VALUE.f118617a);
                            String strI2 = (obj3 == null || (string4 = obj3.toString()) == null) ? null : hb.a.i(string4);
                            i iVar = i.NOT_VALUE;
                            boolean zContainsKey = map2.containsKey(iVar.f118617a);
                            Object obj4 = map2.get(iVar.f118617a);
                            String strI3 = (obj4 == null || (string3 = obj4.toString()) == null) ? null : hb.a.i(string3);
                            if ((strI2 != null && !s.g(strI, strI2)) || (zContainsKey && s.g(strI, strI3))) {
                                z14 = false;
                                break;
                            }
                        }
                    }
                } else if (string5.equals(m.ANY.f118678a) && list != null) {
                    for (Map map3 : list) {
                        String strB5 = B4(String.valueOf(map3.get(i.VALUE_ID.f118617a)));
                        String strI4 = strB5 != null ? hb.a.i(strB5) : null;
                        Object obj5 = map3.get(i.VALUE.f118617a);
                        String strI5 = (obj5 == null || (string2 = obj5.toString()) == null) ? null : hb.a.i(string2);
                        i iVar2 = i.NOT_VALUE;
                        boolean zContainsKey2 = map3.containsKey(iVar2.f118617a);
                        Object obj6 = map3.get(iVar2.f118617a);
                        String strI6 = (obj6 == null || (string = obj6.toString()) == null) ? null : hb.a.i(string);
                        if ((strI5 == null || !s.g(strI4, strI5)) && (!zContainsKey2 || s.g(strI4, strI6))) {
                        }
                    }
                    z14 = false;
                    break;
                }
                this.f93792b.getClass();
            }
        }
        return z14;
    }

    public final Map<String, Object> z4(Map<String, ? extends Object> map) {
        map.getClass();
        Object obj = map.get(i.CHILD.f118617a);
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map<String, Object> map2 = (Map) obj;
        (map2 != null ? Integer.valueOf(map2.size()) : BuildConfig.TRAVIS).toString();
        this.f93792b.getClass();
        return map2;
    }
}
