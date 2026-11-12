package gh2;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import ch.qos.logback.core.joran.action.Action;
import java.util.HashMap;
import java.util.Objects;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import v.e0;
import yc.l2;

/* JADX INFO: loaded from: classes11.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f77475a = a("RemoteConfigUtil");

    public static Logger a(String str) {
        return LoggerFactory.getLogger("RC#".concat(str));
    }

    public static TreeMap b(int i14, Context context) {
        HashMap map = new HashMap();
        XmlResourceParser xml = context.getResources().getXml(i14);
        String strNextText = null;
        String strNextText2 = null;
        while (xml.getEventType() != 1) {
            try {
                if (xml.getEventType() == 2) {
                    String name = xml.getName();
                    if (name.equals(Action.KEY_ATTRIBUTE)) {
                        strNextText = xml.nextText();
                    } else if (name.equals("value")) {
                        strNextText2 = xml.nextText();
                    }
                }
                if (strNextText != null && strNextText2 != null) {
                    map.put(strNextText, strNextText2);
                    strNextText = null;
                    strNextText2 = null;
                }
                xml.next();
            } catch (Exception e4) {
                f77475a.error("parseDefaultConfigAsMap", (Throwable) e4);
                l2.p(e4);
                return null;
            }
        }
        return new TreeMap(map);
    }

    public static long c(String str, String str2) {
        try {
            Objects.requireNonNull(str2);
            return Long.parseLong(str2);
        } catch (Exception unused) {
            f77475a.warn(e0.g("failed to parse [", str, ": ", str2, "] as long"));
            return 0L;
        }
    }

    public static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            Object objNextValue = new JSONTokener(str).nextValue();
            if (objNextValue instanceof JSONObject) {
                return ((JSONObject) objNextValue).toString(3);
            }
            return objNextValue instanceof JSONArray ? ((JSONArray) objNextValue).toString(3) : str;
        } catch (JSONException unused) {
            return fb1.c.n("!!! BAD JSON STRING !!!\n\n", str);
        }
    }
}
