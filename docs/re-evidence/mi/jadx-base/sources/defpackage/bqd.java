package defpackage;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class bqd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f4482a = Pattern.compile("\\b((?:seg-\\d+(?:_\\d+)?|\\d+)\\.js)");

    public static String a(String str, ReadableArray readableArray) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(", stack:\n");
        for (int i = 0; i < readableArray.size(); i++) {
            ReadableMap map = readableArray.getMap(i);
            sb.append(map.getString("methodName"));
            sb.append(gv5.CONNECT_VALUE_STR);
            sb.append(b(map));
            if (map.hasKey("lineNumber") && !map.isNull("lineNumber") && map.getType("lineNumber") == ReadableType.Number) {
                sb.append(map.getInt("lineNumber"));
            } else {
                sb.append(-1);
            }
            if (map.hasKey("column") && !map.isNull("column") && map.getType("column") == ReadableType.Number) {
                sb.append(":");
                sb.append(map.getInt("column"));
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static String b(ReadableMap readableMap) {
        String string;
        if (!readableMap.hasKey("file") || readableMap.isNull("file") || readableMap.getType("file") != ReadableType.String || (string = readableMap.getString("file")) == null) {
            return "";
        }
        Matcher matcher = f4482a.matcher(string);
        if (!matcher.find()) {
            return "";
        }
        return matcher.group(1) + ":";
    }
}
