package fi2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfi2/w;", "Lei2/h;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class w extends ei2.h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Context context) {
        super(context);
        context.getClass();
    }

    @Override // ei2.h
    public final String f(ii2.b bVar, Map<String, ? extends Object> map) {
        boolean zF;
        List<Map<String, Object>> listC4 = bVar.C4(map);
        boolean zF2 = false;
        if (listC4 != null) {
            zF = false;
            for (Map<String, Object> map2 : listC4) {
                mh2.i iVar = mh2.i.ID;
                if (String.valueOf(map2.get(iVar.f118617a)).equals(mh2.m.ACCLIMATION_ENABLED.f118678a)) {
                    hi2.a.C1658a c1658a = hi2.a.f83879a;
                    String strD = d(bVar, String.valueOf(map2.get(mh2.i.VALUE_ID.f118617a)));
                    c1658a.getClass();
                    zF2 = hi2.a.C1658a.f(strD);
                }
                if (String.valueOf(map2.get(iVar.f118617a)).equals(mh2.m.SLEEP_TRACKING_ENABLED.f118678a)) {
                    hi2.a.C1658a c1658a2 = hi2.a.f83879a;
                    String strD2 = d(bVar, String.valueOf(map2.get(mh2.i.VALUE_ID.f118617a)));
                    c1658a2.getClass();
                    zF = hi2.a.C1658a.f(strD2);
                }
            }
        } else {
            zF = false;
        }
        Context context = this.f64388a;
        if (zF2) {
            String string = context.getString(R.string.lbl_on);
            string.getClass();
            return string;
        }
        if (zF) {
            String string2 = context.getString(R.string.user_settings_sleep_section_title);
            string2.getClass();
            return string2;
        }
        String string3 = context.getString(R.string.lbl_off);
        string3.getClass();
        return string3;
    }

    @Override // ei2.h
    public Boolean m(ii2.b bVar, Map<String, ? extends Object> map) {
        String strF;
        bVar.getClass();
        map.getClass();
        Object obj = map.get(mh2.i.TRANSFORM.f118617a);
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map2 = (Map) obj;
        if (map2 == null) {
            return Boolean.FALSE;
        }
        Object obj2 = map2.get(mh2.i.DEPENDENCIES.f118617a);
        if (!(obj2 instanceof List)) {
            obj2 = null;
        }
        List list = (List) obj2;
        if (list != null && !list.isEmpty()) {
            boolean z14 = false;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String strB4 = bVar.B4(String.valueOf(((Map) it.next()).get(mh2.i.VALUE_ID.f118617a)));
                    if (strB4 != null) {
                        Locale locale = Locale.ENGLISH;
                        strF = j20.x.f(locale, strB4, locale);
                    } else {
                        strF = null;
                    }
                    if (strF != null) {
                        z14 = true;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z14);
        }
        return Boolean.FALSE;
    }
}
