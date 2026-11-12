package ohos.ace.plugin.clipboard;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes46.dex */
public class PatternDetection {
    public static final int EMAIL_ADDRESS = 4;
    public static final int NUMBER = 2;
    public static final int URL = 1;
    public static final Map<Integer, Pattern> patterns;

    static {
        HashMap map = new HashMap();
        patterns = map;
        map.put(1, Pattern.compile("[a-zA-Z0-9+.-]+://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_]"));
        map.put(2, Pattern.compile("[-+]?[0-9]*\\.?[0-9]+"));
        map.put(4, Pattern.compile("(([a-zA-Z0-9_\\-\\.\\%\\+]+)@(([a-zA-Z0-9\\-]+(?:\\.[a-zA-Z0-9\\-]+)*)|(?:\\[([0-9]{1,3}\\.){3}[0-9]{1,3}\\]))([a-zA-Z]{1,}|[0-9]{1,3}))"));
    }

    public static boolean isMatch(String str, int i) {
        return patterns.get(Integer.valueOf(i)).matcher(str).find();
    }
}
