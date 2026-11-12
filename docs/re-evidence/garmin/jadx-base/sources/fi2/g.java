package fi2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lfi2/g;", "Lei2/h;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g extends ei2.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hi2.d f71791c;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        super(context);
        context.getClass();
        this.f71791c = new hi2.d("CriticalSwimSpeedPickerTransform", hi2.e.CSS.f83902a);
    }

    @Override // ei2.h
    public final String f(ii2.b bVar, Map<String, ? extends Object> map) {
        String str;
        Object next;
        this.f71791c.getClass();
        String strE = ei2.h.e(bVar, map);
        hi2.a.f83879a.getClass();
        o13.p pVarD = hi2.a.C1658a.d(hi2.a.C1658a.g(strE));
        List<Map<String, Object>> listC4 = bVar.C4(map);
        if (pVarD == null) {
            str = "--:--";
        } else {
            x0 x0Var = x0.f105818a;
            str = String.format(Locale.getDefault(), "%d:%02d", Arrays.copyOf(new Object[]{pVarD.f128594a, pVarD.f128595b}, 2));
        }
        if (listC4 != null) {
            Iterator<T> it = listC4.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!p005kotlin.jvm.internal.s.g(((Map) next).get(mh2.i.ID.f118617a), mh2.m.METRIC.f118678a));
            Map map2 = (Map) next;
            if (map2 != null) {
                hi2.i.a aVar = hi2.i.f83907a;
                Object obj = map2.get(mh2.i.VALUE.f118617a);
                String str2 = obj instanceof String ? (String) obj : null;
                aVar.getClass();
                String strC = hi2.i.a.c(this.f64388a, str2, null);
                if (strC.length() != 0) {
                    x0 x0Var2 = x0.f105818a;
                    return String.format(Locale.getDefault(), "%s / %s", Arrays.copyOf(new Object[]{str, String.format(Locale.getDefault(), strC, Arrays.copyOf(new Object[]{100}, 1))}, 2));
                }
            }
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ei2.h
    public final HashMap i(ii2.b bVar, Map map, int i14) {
        Object next;
        String strC;
        Object next2;
        this.f71791c.getClass();
        HashMap map2 = new HashMap();
        List<Map<String, Object>> listC4 = bVar.C4(map);
        if (listC4 != null) {
            String strE = ei2.h.e(bVar, map);
            hi2.a.f83879a.getClass();
            o13.p pVarD = hi2.a.C1658a.d(hi2.a.C1658a.g(strE));
            if (i14 == 1) {
                map2.put(mh2.i.DS_SELECTED_VALUE.f118617a, Integer.valueOf(pVarD != null ? ((Number) pVarD.f128594a).intValue() : 0));
                map2.put(mh2.i.DS_MINIMUM_VALUE.f118617a, 0);
                map2.put(mh2.i.DS_MAXIMUM_VALUE.f118617a, 5);
                return map2;
            }
            if (i14 == 2) {
                map2.put(mh2.i.DS_SELECTED_VALUE.f118617a, Integer.valueOf(pVarD != null ? ((Number) pVarD.f128595b).intValue() : 50));
                map2.put(mh2.i.DS_MINIMUM_VALUE.f118617a, 0);
                map2.put(mh2.i.DS_MAXIMUM_VALUE.f118617a, 59);
                return map2;
            }
            if (i14 == 4) {
                Iterator<T> it = listC4.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!p005kotlin.jvm.internal.s.g(((Map) next).get(mh2.i.ID.f118617a), mh2.m.LABEL.f118678a));
                Map map3 = (Map) next;
                Context context = this.f64388a;
                String strC2 = "";
                if (map3 != null) {
                    hi2.i.a aVar = hi2.i.f83907a;
                    Object obj = map3.get(mh2.i.VALUE.f118617a);
                    String str = obj instanceof String ? (String) obj : null;
                    aVar.getClass();
                    strC = hi2.i.a.c(context, str, null);
                } else {
                    strC = "";
                }
                Iterator<T> it3 = listC4.iterator();
                do {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                } while (!p005kotlin.jvm.internal.s.g(((Map) next2).get(mh2.i.ID.f118617a), mh2.m.UNIT.f118678a));
                Map map4 = (Map) next2;
                if (map4 != null) {
                    hi2.i.a aVar2 = hi2.i.f83907a;
                    Object obj2 = map4.get(mh2.i.VALUE.f118617a);
                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                    aVar2.getClass();
                    strC2 = hi2.i.a.c(context, str2, null);
                }
                String str3 = mh2.i.DS_POPUP_TITLE_VALUE.f118617a;
                x0 x0Var = x0.f105818a;
                map2.put(str3, String.format("%s (%s)", Arrays.copyOf(new Object[]{strC, strC2}, 2)));
                return map2;
            }
        }
        return map2;
    }

    @Override // ei2.h
    public final void n(ii2.b bVar, Map<String, ? extends Object> map, Object obj) {
        bVar.getClass();
        map.getClass();
        this.f71791c.getClass();
        if (!(obj instanceof List)) {
            obj = null;
        }
        List list = (List) obj;
        if (list == null || list.isEmpty()) {
            return;
        }
        int iIntValue = ((Number) list.get(0)).intValue();
        int iIntValue2 = ((Number) list.get(1)).intValue();
        hi2.a.f83879a.getClass();
        String strValueOf = String.valueOf(map.get(mh2.i.VALUE_ID.f118617a));
        bVar.L4(Double.valueOf((100.0d / ((double) ((iIntValue * 60) + iIntValue2))) * ((double) 1000)), strValueOf);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"Lfi2/g$a;", "", "<init>", "()V", "", "MAX_MINUTES", "I", "MAX_SECONDS", "MIN_MINUTES", "MIN_PACE", "MIN_SECONDS", "", "MIN_SEC_FORMAT", "Ljava/lang/String;", "NO_PACE_DISPLAY_VALUE", "PACE_FORMAT", "PICKER_TITLE_FORMAT", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
