package h22;

import android.content.Context;
import android.graphics.Typeface;
import b7.g;
import com.garmin.android.apps.connectmobile.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap<String, Typeface> f81214a = new HashMap<>();

    /* JADX WARN: Code duplicated, block: B:26:0x0070 A[Catch: Exception -> 0x007b, TRY_LEAVE, TryCatch #0 {Exception -> 0x007b, blocks: (B:4:0x000a, B:5:0x000e, B:26:0x0070, B:7:0x0012, B:9:0x001a, B:10:0x0021, B:24:0x0062, B:13:0x002a, B:15:0x0032, B:16:0x003a, B:18:0x0042, B:19:0x004a, B:21:0x0052, B:22:0x005a, B:25:0x006a), top: B:33:0x000a }] */
    public static Typeface a(String str, Context context) {
        Typeface typefaceA;
        HashMap<String, Typeface> map = f81214a;
        Typeface typeface = map.get(str);
        if (typeface != null) {
            return typeface;
        }
        try {
            switch (str.hashCode()) {
                case -618418604:
                    str.equals("font/roboto_light.ttf");
                    typefaceA = g.a(R.font.roboto_light, context);
                    break;
                case 436689796:
                    if (!str.equals("font/roboto_lightitalic.ttf")) {
                        typefaceA = g.a(R.font.roboto_light, context);
                    } else {
                        typefaceA = g.a(R.font.roboto_italic, context);
                    }
                    break;
                case 785995623:
                    if (!str.equals("font/roboto_medium.ttf")) {
                        typefaceA = g.a(R.font.roboto_light, context);
                    } else {
                        typefaceA = g.a(R.font.roboto_medium, context);
                    }
                    break;
                case 1127263322:
                    if (!str.equals("font/roboto_regular.ttf")) {
                        typefaceA = g.a(R.font.roboto_light, context);
                    } else {
                        typefaceA = g.a(R.font.roboto_regular, context);
                    }
                    break;
                case 1453494519:
                    if (!str.equals("font/roboto_bold.ttf")) {
                        typefaceA = g.a(R.font.roboto_light, context);
                    } else {
                        typefaceA = g.a(R.font.roboto_bold, context);
                    }
                    break;
                case 1606298786:
                    if (!str.equals("font/roboto_italic.ttf")) {
                        typefaceA = g.a(R.font.roboto_light, context);
                    } else {
                        typefaceA = g.a(R.font.roboto_italic, context);
                    }
                    break;
                case 2030267088:
                    if (!str.equals("font/caveat_brush_regular.ttf")) {
                        typefaceA = g.a(R.font.roboto_light, context);
                    } else {
                        typefaceA = g.a(R.font.caveat_brush_regular, context);
                    }
                    break;
                default:
                    typefaceA = g.a(R.font.roboto_light, context);
                    break;
            }
            map.put(str, typefaceA);
            return typefaceA;
        } catch (Exception e4) {
            e4.getMessage();
            return null;
        }
    }
}
