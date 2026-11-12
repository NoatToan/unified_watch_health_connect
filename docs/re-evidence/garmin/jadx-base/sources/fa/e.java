package fa;

import android.graphics.Color;
import android.text.TextUtils;
import com.google.common.base.Ascii;
import ds.e0;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f70008a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f70009b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f70010c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f70011d;

    static {
        HashMap map = new HashMap();
        f70011d = map;
        q6.f.r(-984833, map, "aliceblue", -332841, "antiquewhite");
        e0.n(-8388652, -16711681, "aqua", "aquamarine", map);
        q6.f.r(-983041, map, "azure", -657956, "beige");
        q6.f.r(-6972, map, "bisque", -16777216, "black");
        q6.f.r(-5171, map, "blanchedalmond", -16776961, "blue");
        q6.f.r(-7722014, map, "blueviolet", -5952982, "brown");
        q6.f.r(-2180985, map, "burlywood", -10510688, "cadetblue");
        q6.f.r(-8388864, map, "chartreuse", -2987746, "chocolate");
        q6.f.r(-32944, map, "coral", -10185235, "cornflowerblue");
        q6.f.r(-1828, map, "cornsilk", -2354116, "crimson");
        e0.n(-16777077, -16711681, "cyan", "darkblue", map);
        q6.f.r(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        e0.n(-16751616, -5658199, "darkgray", "darkgreen", map);
        e0.n(-4343957, -5658199, "darkgrey", "darkkhaki", map);
        q6.f.r(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        q6.f.r(-29696, map, "darkorange", -6737204, "darkorchid");
        q6.f.r(-7667712, map, "darkred", -1468806, "darksalmon");
        q6.f.r(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        e0.n(-7077677, -16724271, "darkturquoise", "darkviolet", map);
        q6.f.r(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        e0.n(-5103070, -14774017, "dodgerblue", "firebrick", map);
        q6.f.r(-1296, map, "floralwhite", -14513374, "forestgreen");
        e0.n(-2302756, -65281, "fuchsia", "gainsboro", map);
        q6.f.r(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        q6.f.r(-16744448, map, "green", -5374161, "greenyellow");
        e0.n(-983056, -8355712, "grey", "honeydew", map);
        q6.f.r(-38476, map, "hotpink", -3318692, "indianred");
        q6.f.r(-11861886, map, "indigo", -16, "ivory");
        q6.f.r(-989556, map, "khaki", -1644806, "lavender");
        q6.f.r(-3851, map, "lavenderblush", -8586240, "lawngreen");
        q6.f.r(-1331, map, "lemonchiffon", -5383962, "lightblue");
        q6.f.r(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        q6.f.r(-18751, map, "lightpink", -24454, "lightsalmon");
        q6.f.r(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        e0.n(-32, -5192482, "lightsteelblue", "lightyellow", map);
        q6.f.r(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        q6.f.r(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        q6.f.r(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        q6.f.r(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        q6.f.r(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        q6.f.r(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        q6.f.r(-15132304, map, "midnightblue", -655366, "mintcream");
        q6.f.r(-6943, map, "mistyrose", -6987, "moccasin");
        q6.f.r(-8531, map, "navajowhite", -16777088, "navy");
        q6.f.r(-133658, map, "oldlace", -8355840, "olive");
        q6.f.r(-9728477, map, "olivedrab", -23296, "orange");
        q6.f.r(-47872, map, "orangered", -2461482, "orchid");
        q6.f.r(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        q6.f.r(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        q6.f.r(-4139, map, "papayawhip", -9543, "peachpuff");
        q6.f.r(-3308225, map, "peru", -16181, "pink");
        q6.f.r(-2252579, map, "plum", -5185306, "powderblue");
        q6.f.r(-8388480, map, "purple", -10079335, "rebeccapurple");
        q6.f.r(-65536, map, "red", -4419697, "rosybrown");
        q6.f.r(-12490271, map, "royalblue", -7650029, "saddlebrown");
        q6.f.r(-360334, map, "salmon", -744352, "sandybrown");
        q6.f.r(-13726889, map, "seagreen", -2578, "seashell");
        q6.f.r(-6270419, map, "sienna", -4144960, "silver");
        q6.f.r(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        e0.n(-16711809, -1286, "snow", "springgreen", map);
        q6.f.r(-12156236, map, "steelblue", -2968436, "tan");
        q6.f.r(-16744320, map, "teal", -2572328, "thistle");
        q6.f.r(-40121, map, "tomato", 0, "transparent");
        q6.f.r(-12525360, map, "turquoise", -1146130, "violet");
        q6.f.r(-663885, map, "wheat", -1, "white");
        q6.f.r(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }

    private e() {
    }

    public static int a(String str, boolean z14) {
        int i14;
        a.a(!TextUtils.isEmpty(str));
        String strReplace = str.replace(StringUtils.SPACE, "");
        if (strReplace.charAt(0) == '#') {
            int i15 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i15;
            }
            if (strReplace.length() == 9) {
                return ((i15 & 255) << 24) | (i15 >>> 8);
            }
            vb.h.w();
            return 0;
        }
        if (strReplace.startsWith("rgba")) {
            Matcher matcher = (z14 ? f70010c : f70009b).matcher(strReplace);
            if (matcher.matches()) {
                if (z14) {
                    String strGroup = matcher.group(4);
                    strGroup.getClass();
                    i14 = (int) (Float.parseFloat(strGroup) * 255.0f);
                } else {
                    String strGroup2 = matcher.group(4);
                    strGroup2.getClass();
                    i14 = Integer.parseInt(strGroup2, 10);
                }
                String strGroup3 = matcher.group(1);
                strGroup3.getClass();
                int i16 = Integer.parseInt(strGroup3, 10);
                String strGroup4 = matcher.group(2);
                strGroup4.getClass();
                int i17 = Integer.parseInt(strGroup4, 10);
                String strGroup5 = matcher.group(3);
                strGroup5.getClass();
                return Color.argb(i14, i16, i17, Integer.parseInt(strGroup5, 10));
            }
        } else if (strReplace.startsWith("rgb")) {
            Matcher matcher2 = f70008a.matcher(strReplace);
            if (matcher2.matches()) {
                String strGroup6 = matcher2.group(1);
                strGroup6.getClass();
                int i18 = Integer.parseInt(strGroup6, 10);
                String strGroup7 = matcher2.group(2);
                strGroup7.getClass();
                int i19 = Integer.parseInt(strGroup7, 10);
                String strGroup8 = matcher2.group(3);
                strGroup8.getClass();
                return Color.rgb(i18, i19, Integer.parseInt(strGroup8, 10));
            }
        } else {
            Integer num = (Integer) f70011d.get(Ascii.toLowerCase(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        vb.h.w();
        return 0;
    }
}
