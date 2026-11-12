package defpackage;

import com.facebook.common.internal.ImmutableMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class fmf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<String, String> f17931a = ImmutableMap.of("mkv", "video/x-matroska", "glb", "model/gltf-binary");

    public static String a(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf < 0 || iLastIndexOf == str.length() - 1) {
            return null;
        }
        return str.substring(iLastIndexOf + 1);
    }

    public static String b(String str) {
        String strA = a(str);
        if (strA == null) {
            return null;
        }
        String lowerCase = strA.toLowerCase(Locale.US);
        String strA2 = zxf.a(lowerCase);
        return strA2 == null ? f17931a.get(lowerCase) : strA2;
    }

    public static boolean c(String str) {
        return str != null && str.startsWith("video/");
    }
}
