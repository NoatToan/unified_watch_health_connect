package zw2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import cx2.j;
import gw2.i;
import java.util.ArrayList;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzw2/f;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f207282a;

    /* JADX WARN: Multi-variable type inference failed */
    public f(Context context) {
        context.getClass();
        this.f207282a = context;
        new cx2.h("Transform", null, 2, 0 == true ? 1 : 0);
    }

    public static g.c d(dx2.c cVar, Map map) {
        String str;
        String str2;
        Long l14;
        cVar.getClass();
        Object obj = map.get(i.ICON_SET.f79975a);
        Long l15 = null;
        try {
            if (!(obj instanceof String)) {
                obj = null;
            }
            str = (String) obj;
        } catch (ClassCastException unused) {
            str = null;
        }
        if (str == null) {
            str = "BASE";
        }
        Object obj2 = map.get(i.LEFT_DRAWABLE.f79975a);
        try {
            if (!(obj2 instanceof String)) {
                obj2 = null;
            }
            str2 = (String) obj2;
        } catch (ClassCastException unused2) {
            str2 = null;
        }
        Object obj3 = map.get(i.LIGHT_COLOR.f79975a);
        try {
            if (!(obj3 instanceof Long)) {
                obj3 = null;
            }
            l14 = (Long) obj3;
        } catch (ClassCastException unused3) {
            l14 = null;
        }
        Object obj4 = map.get(i.DARK_COLOR.f79975a);
        try {
            if (!(obj4 instanceof Long)) {
                obj4 = null;
            }
            l15 = (Long) obj4;
        } catch (ClassCastException unused4) {
        }
        return new g.c(str, str2, l14, l15);
    }

    public final String b(tv2.c cVar) {
        j.a aVar = j.f56682a;
        String str = cVar != null ? cVar.f166662a : null;
        String str2 = cVar != null ? cVar.f166663b : null;
        ArrayList<String> arrayList = cVar != null ? cVar.f166664c : null;
        ArrayList<String> arrayList2 = cVar != null ? cVar.f166665d : null;
        aVar.getClass();
        String strA = j.a.a(this.f207282a, str, str2, arrayList, arrayList2);
        if (strA != null) {
            return strA;
        }
        String str3 = cVar != null ? cVar.f166666e : null;
        return str3 == null ? "" : str3;
    }

    public final String e(dx2.c cVar, Map<String, ? extends Object> map) {
        Object obj = map.get(i.SUBTEXT.f79975a);
        Map map2 = null;
        try {
            if (!(obj instanceof Map)) {
                obj = null;
            }
            map2 = (Map) obj;
        } catch (ClassCastException unused) {
        }
        return b(cx2.g.b(map2));
    }

    public final String f(dx2.c cVar, Map<String, ? extends Object> map) {
        cVar.getClass();
        map.getClass();
        return b(dx2.c.M4(map));
    }

    public Integer g(Map<String, ? extends Object> map) {
        map.getClass();
        return null;
    }

    public void h(dx2.c cVar, Map map, Object obj) {
        cVar.getClass();
        map.getClass();
    }

    public void i(vw2.b bVar) {
    }

    public void j() {
    }
}
