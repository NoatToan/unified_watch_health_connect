package defpackage;

import com.xiaomi.aicr.vision.VisionAttribute;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ay5 implements asr {
    public static final Map<String, ay5> c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3561b;

    static {
        HashMap map = new HashMap();
        map.put(a(PluginPackageConstant.RN_BUNDLE_HASH_ALGORITHM, 32, 16, 67, 10), new ay5(VisionAttribute.VISION_TYPE_TEXT_LINE, "XMSS_SHA2-256_W16_H10"));
        map.put(a(PluginPackageConstant.RN_BUNDLE_HASH_ALGORITHM, 32, 16, 67, 16), new ay5(33554434, "XMSS_SHA2-256_W16_H16"));
        map.put(a(PluginPackageConstant.RN_BUNDLE_HASH_ALGORITHM, 32, 16, 67, 20), new ay5(50331651, "XMSS_SHA2-256_W16_H20"));
        map.put(a("SHA-512", 64, 16, 131, 10), new ay5(67108868, "XMSS_SHA2-512_W16_H10"));
        map.put(a("SHA-512", 64, 16, 131, 16), new ay5(83886085, "XMSS_SHA2-512_W16_H16"));
        map.put(a("SHA-512", 64, 16, 131, 20), new ay5(100663302, "XMSS_SHA2-512_W16_H20"));
        map.put(a("SHAKE128", 32, 16, 67, 10), new ay5(117440519, "XMSS_SHAKE128_W16_H10"));
        map.put(a("SHAKE128", 32, 16, 67, 16), new ay5(134217736, "XMSS_SHAKE128_W16_H16"));
        map.put(a("SHAKE128", 32, 16, 67, 20), new ay5(150994953, "XMSS_SHAKE128_W16_H20"));
        map.put(a("SHAKE256", 64, 16, 131, 10), new ay5(167772170, "XMSS_SHAKE256_W16_H10"));
        map.put(a("SHAKE256", 64, 16, 131, 16), new ay5(184549387, "XMSS_SHAKE256_W16_H16"));
        map.put(a("SHAKE256", 64, 16, 131, 20), new ay5(201326604, "XMSS_SHAKE256_W16_H20"));
        c = Collections.unmodifiableMap(map);
    }

    public ay5(int i, String str) {
        this.f3560a = i;
        this.f3561b = str;
    }

    public static String a(String str, int i, int i2, int i3, int i4) {
        if (str == null) {
            throw new NullPointerException("algorithmName == null");
        }
        return str + "-" + i + "-" + i2 + "-" + i3 + "-" + i4;
    }

    public static ay5 b(String str, int i, int i2, int i3, int i4) {
        if (str != null) {
            return c.get(a(str, i, i2, i3, i4));
        }
        throw new NullPointerException("algorithmName == null");
    }

    public String toString() {
        return this.f3561b;
    }
}
