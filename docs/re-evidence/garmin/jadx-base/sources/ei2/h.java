package ei2;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lei2/h;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f64388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hi2.d f64389b;

    /* JADX WARN: Multi-variable type inference failed */
    public h(Context context) {
        context.getClass();
        this.f64388a = context;
        this.f64389b = new hi2.d("Transform", null, 2, 0 == true ? 1 : 0);
    }

    public static String e(ii2.b bVar, Map map) {
        bVar.getClass();
        map.getClass();
        Object obj = map.get(mh2.i.VALUE_ID.f118617a);
        String string = obj != null ? obj.toString() : null;
        String strB4 = string != null ? bVar.B4(string) : null;
        bVar.f93792b.getClass();
        return strB4 == null ? "" : strB4;
    }

    public static String g(h hVar, int i14) {
        hi2.i.a aVar = hi2.i.f83907a;
        Context context = hVar.f64388a;
        aVar.getClass();
        try {
            String string = context.getString(i14);
            string.getClass();
            return string;
        } catch (Resources.NotFoundException unused) {
            hi2.i.f83908b.getClass();
            return "";
        } catch (ClassCastException unused2) {
            hi2.i.f83908b.getClass();
            String string2 = context.getString(i14);
            string2.getClass();
            return string2;
        } catch (MissingFormatArgumentException unused3) {
            hi2.i.f83908b.getClass();
            String string3 = context.getString(i14);
            string3.getClass();
            return string3;
        }
    }

    public static String h(h hVar, String str) {
        hi2.i.a aVar = hi2.i.f83907a;
        Context context = hVar.f64388a;
        aVar.getClass();
        return hi2.i.a.c(context, str, null);
    }

    public final String d(ii2.b bVar, String str) {
        bVar.getClass();
        String strB4 = bVar.B4(str);
        if (strB4 == null) {
            strB4 = "";
        }
        this.f64389b.getClass();
        return strB4;
    }

    public String f(ii2.b bVar, Map<String, ? extends Object> map) {
        e(bVar, map);
        Object obj = map.get(mh2.i.DISPLAY.f118617a);
        if (!(obj instanceof String)) {
            obj = null;
        }
        bVar.f93792b.getClass();
        ArrayList arrayListY4 = ii2.b.y4(map);
        hi2.i.f83907a.getClass();
        return hi2.i.a.c(this.f64388a, (String) obj, arrayListY4);
    }

    public HashMap i(ii2.b bVar, Map map, int i14) {
        return new HashMap();
    }

    public final String j(ii2.b bVar, Map<String, ? extends Object> map) {
        Object obj = map.get(mh2.i.TEXT.f118617a);
        String string = obj != null ? obj.toString() : null;
        bVar.f93792b.getClass();
        ArrayList arrayListY4 = ii2.b.y4(map);
        hi2.i.f83907a.getClass();
        return hi2.i.a.c(this.f64388a, string, arrayListY4);
    }

    public final String k(ii2.b bVar, Map<String, ? extends Object> map) {
        bVar.getClass();
        map.getClass();
        String strValueOf = String.valueOf(map.get(mh2.i.TITLE.f118617a));
        bVar.f93792b.getClass();
        hi2.i.f83907a.getClass();
        String strC = hi2.i.a.c(this.f64388a, strValueOf, null);
        this.f64389b.getClass();
        return strC;
    }

    public boolean l(ii2.b bVar, Map<String, ? extends Object> map) {
        return false;
    }

    public Boolean m(ii2.b bVar, Map<String, ? extends Object> map) {
        bVar.getClass();
        map.getClass();
        return null;
    }

    public void n(ii2.b bVar, Map<String, ? extends Object> map, Object obj) {
        bVar.getClass();
        map.getClass();
    }

    public void o(zh2.b bVar) {
        int i14 = f.f64386a;
    }

    public void p() {
        int i14 = g.f64387a;
    }

    public void q(View view2, ii2.b bVar, Map<String, ? extends Object> map) {
        view2.getClass();
        bVar.getClass();
    }
}
