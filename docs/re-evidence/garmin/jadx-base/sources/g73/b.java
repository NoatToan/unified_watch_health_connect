package g73;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f76213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f76214b;

    static {
        HashMap map = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(b.class.getResourceAsStream("/org/commonmark/internal/util/entities.properties"), Charset.forName("UTF-8")));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        map.put("NewLine", "\n");
                        f76213a = map;
                        f76214b = Pattern.compile("^&#[Xx]?");
                        return;
                    }
                    if (line.length() != 0) {
                        int iIndexOf = line.indexOf("=");
                        map.put(line.substring(0, iIndexOf), line.substring(iIndexOf + 1));
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th5) {
                            th3.addSuppressed(th5);
                        }
                        throw th4;
                    }
                }
                com.airbnb.lottie.animation.keyframe.a.x("Failed reading data for HTML named character references", e);
            }
        } catch (IOException e4) {
            com.airbnb.lottie.animation.keyframe.a.x("Failed reading data for HTML named character references", e4);
        }
    }

    public static String a(String str) {
        Matcher matcher = f76214b.matcher(str);
        if (!matcher.find()) {
            String str2 = (String) f76213a.get(fb1.c.m(1, 1, str));
            return str2 != null ? str2 : str;
        }
        try {
            int i14 = Integer.parseInt(str.substring(matcher.end(), str.length() - 1), matcher.end() == 2 ? 10 : 16);
            return i14 == 0 ? "�" : new String(Character.toChars(i14));
        } catch (IllegalArgumentException unused) {
            return "�";
        }
    }
}
