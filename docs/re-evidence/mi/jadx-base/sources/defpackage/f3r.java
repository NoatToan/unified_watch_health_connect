package defpackage;

import com.xiaomi.aicr.vision.VisionAttribute;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class f3r implements asr {
    public static final Map<String, f3r> c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17373b;

    static {
        HashMap map = new HashMap();
        map.put(a(PluginPackageConstant.RN_BUNDLE_HASH_ALGORITHM, 32, 16, 67), new f3r(VisionAttribute.VISION_TYPE_TEXT_LINE, "WOTSP_SHA2-256_W16"));
        map.put(a("SHA-512", 64, 16, 131), new f3r(33554434, "WOTSP_SHA2-512_W16"));
        map.put(a("SHAKE128", 32, 16, 67), new f3r(50331651, "WOTSP_SHAKE128_W16"));
        map.put(a("SHAKE256", 64, 16, 131), new f3r(67108868, "WOTSP_SHAKE256_W16"));
        c = Collections.unmodifiableMap(map);
    }

    public f3r(int i, String str) {
        this.f17372a = i;
        this.f17373b = str;
    }

    public static String a(String str, int i, int i2, int i3) {
        if (str == null) {
            throw new NullPointerException("algorithmName == null");
        }
        return str + "-" + i + "-" + i2 + "-" + i3;
    }

    public static f3r b(String str, int i, int i2, int i3) {
        if (str != null) {
            return c.get(a(str, i, i2, i3));
        }
        throw new NullPointerException("algorithmName == null");
    }

    public String toString() {
        return this.f17373b;
    }
}
