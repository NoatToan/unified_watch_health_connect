package defpackage;

import com.facebook.react.bridge.ReadableMap;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.statistics.StatConstants;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public class qwq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f31917a = {8, 4, 5, 1, 3, 0, 2};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f31918b = {8, 7, 6, 4, 5, 1, 3, 0, 2};
    public static final int[] c = {4, 5, 1, 3};
    public static final HashSet<String> d = new HashSet<>(Arrays.asList("alignSelf", "alignItems", "collapsable", "flex", "flexBasis", "flexDirection", "flexGrow", "flexShrink", "flexWrap", "justifyContent", "alignContent", "display", "position", TSMAuthContants.PARAM_KEY_RIGHT, "top", "bottom", "left", StatConstants.PARAM_START, StatConstants.PARAM_END, "width", "height", "minWidth", "maxWidth", "minHeight", "maxHeight", "margin", "marginVertical", "marginHorizontal", "marginLeft", "marginRight", "marginTop", "marginBottom", "marginStart", "marginEnd", "padding", "paddingVertical", "paddingHorizontal", "paddingLeft", "paddingRight", "paddingTop", "paddingBottom", "paddingStart", "paddingEnd"));

    public static boolean a(ReadableMap readableMap, String str) {
        if (d.contains(str)) {
            return true;
        }
        if ("pointerEvents".equals(str)) {
            String string = readableMap.getString(str);
            return "auto".equals(string) || "box-none".equals(string);
        }
        str.hashCode();
        switch (str) {
            case "borderRightColor":
                return !readableMap.isNull("borderRightColor") && readableMap.getInt("borderRightColor") == 0;
            case "borderRightWidth":
                return readableMap.isNull("borderRightWidth") || readableMap.getDouble("borderRightWidth") == 0.0d;
            case "borderTopColor":
                return !readableMap.isNull("borderTopColor") && readableMap.getInt("borderTopColor") == 0;
            case "borderTopWidth":
                return readableMap.isNull("borderTopWidth") || readableMap.getDouble("borderTopWidth") == 0.0d;
            case "borderBottomColor":
                return !readableMap.isNull("borderBottomColor") && readableMap.getInt("borderBottomColor") == 0;
            case "borderBottomWidth":
                return readableMap.isNull("borderBottomWidth") || readableMap.getDouble("borderBottomWidth") == 0.0d;
            case "opacity":
                return readableMap.isNull("opacity") || readableMap.getDouble("opacity") == 1.0d;
            case "borderLeftColor":
                return !readableMap.isNull("borderLeftColor") && readableMap.getInt("borderLeftColor") == 0;
            case "borderLeftWidth":
                return readableMap.isNull("borderLeftWidth") || readableMap.getDouble("borderLeftWidth") == 0.0d;
            case "overflow":
                return readableMap.isNull("overflow") || "visible".equals(readableMap.getString("overflow"));
            case "borderWidth":
                return readableMap.isNull("borderWidth") || readableMap.getDouble("borderWidth") == 0.0d;
            case "borderRadius":
                if (!readableMap.hasKey("backgroundColor") || readableMap.getInt("backgroundColor") == 0) {
                    return !readableMap.hasKey("borderWidth") || readableMap.isNull("borderWidth") || readableMap.getDouble("borderWidth") == 0.0d;
                }
                return false;
            default:
                return false;
        }
    }
}
