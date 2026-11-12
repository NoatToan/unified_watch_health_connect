package nh;

import ch.qos.logback.classic.spi.CallerData;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes7.dex */
public class m {
    public static String a(String str, String str2) {
        try {
            Matcher matcher = Pattern.compile("(^|;)" + str2 + "=\\{([^}]*?)\\}").matcher(str);
            return matcher.find() ? matcher.group(2) : CallerData.NA;
        } catch (Throwable th3) {
            d.a(th3);
            return CallerData.NA;
        }
    }

    public static HashMap b(String str) {
        String[] strArrSplit = str.split(";");
        HashMap map = new HashMap();
        for (String str2 : strArrSplit) {
            String strSubstring = str2.substring(0, str2.indexOf("={"));
            String strConcat = strSubstring.concat("={");
            map.put(strSubstring, str2.substring(strConcat.length() + str2.indexOf(strConcat), str2.lastIndexOf(StringSubstitutor.DEFAULT_VAR_END)));
        }
        return map;
    }

    public static HashMap c(String str, lh.a aVar) {
        ug.c cVarA = ug.c.a(ug.c.CANCELED.f170562a);
        HashMap map = new HashMap();
        map.put("resultStatus", Integer.toString(cVarA.f170562a));
        map.put("memo", cVarA.f170563b);
        map.put("result", "");
        try {
            return b(str);
        } catch (Throwable th3) {
            wg.a.d(aVar, "biz", "FormatResultEx", th3);
            return map;
        }
    }
}
