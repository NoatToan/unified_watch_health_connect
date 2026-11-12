package defpackage;

import com.xiaomi.aicr.vision.VisionAttribute;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zx5 implements asr {
    public static final Map<String, zx5> c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41768b;

    static {
        HashMap map = new HashMap();
        map.put(a(PluginPackageConstant.RN_BUNDLE_HASH_ALGORITHM, 32, 16, 67, 20, 2), new zx5(VisionAttribute.VISION_TYPE_TEXT_LINE, "XMSSMT_SHA2-256_W16_H20_D2"));
        map.put(a(PluginPackageConstant.RN_BUNDLE_HASH_ALGORITHM, 32, 16, 67, 20, 4), new zx5(VisionAttribute.VISION_TYPE_TEXT_LINE, "XMSSMT_SHA2-256_W16_H20_D4"));
        map.put(a(PluginPackageConstant.RN_BUNDLE_HASH_ALGORITHM, 32, 16, 67, 40, 2), new zx5(VisionAttribute.VISION_TYPE_TEXT_LINE, "XMSSMT_SHA2-256_W16_H40_D2"));
        map.put(a(PluginPackageConstant.RN_BUNDLE_HASH_ALGORITHM, 32, 16, 67, 40, 2), new zx5(VisionAttribute.VISION_TYPE_TEXT_LINE, "XMSSMT_SHA2-256_W16_H40_D4"));
        map.put(a(PluginPackageConstant.RN_BUNDLE_HASH_ALGORITHM, 32, 16, 67, 40, 4), new zx5(VisionAttribute.VISION_TYPE_TEXT_LINE, "XMSSMT_SHA2-256_W16_H40_D8"));
        map.put(a(PluginPackageConstant.RN_BUNDLE_HASH_ALGORITHM, 32, 16, 67, 60, 8), new zx5(VisionAttribute.VISION_TYPE_TEXT_LINE, "XMSSMT_SHA2-256_W16_H60_D3"));
        map.put(a(PluginPackageConstant.RN_BUNDLE_HASH_ALGORITHM, 32, 16, 67, 60, 6), new zx5(VisionAttribute.VISION_TYPE_TEXT_LINE, "XMSSMT_SHA2-256_W16_H60_D6"));
        map.put(a(PluginPackageConstant.RN_BUNDLE_HASH_ALGORITHM, 32, 16, 67, 60, 12), new zx5(VisionAttribute.VISION_TYPE_TEXT_LINE, "XMSSMT_SHA2-256_W16_H60_D12"));
        map.put(a("SHA2-512", 64, 16, 131, 20, 2), new zx5(VisionAttribute.VISION_TYPE_TEXT_LINE, "XMSSMT_SHA2-512_W16_H20_D2"));
        map.put(a("SHA2-512", 64, 16, 131, 20, 4), new zx5(VisionAttribute.VISION_TYPE_TEXT_LINE, "XMSSMT_SHA2-512_W16_H20_D4"));
        map.put(a("SHA2-512", 64, 16, 131, 40, 2), new zx5(VisionAttribute.VISION_TYPE_TEXT_LINE, "XMSSMT_SHA2-512_W16_H40_D2"));
        map.put(a("SHA2-512", 64, 16, 131, 40, 4), new zx5(VisionAttribute.VISION_TYPE_TEXT_LINE, "XMSSMT_SHA2-512_W16_H40_D4"));
        map.put(a("SHA2-512", 64, 16, 131, 40, 8), new zx5(VisionAttribute.VISION_TYPE_TEXT_LINE, "XMSSMT_SHA2-512_W16_H40_D8"));
        map.put(a("SHA2-512", 64, 16, 131, 60, 3), new zx5(VisionAttribute.VISION_TYPE_TEXT_LINE, "XMSSMT_SHA2-512_W16_H60_D3"));
        map.put(a("SHA2-512", 64, 16, 131, 60, 6), new zx5(VisionAttribute.VISION_TYPE_TEXT_LINE, "XMSSMT_SHA2-512_W16_H60_D6"));
        map.put(a("SHA2-512", 64, 16, 131, 60, 12), new zx5(VisionAttribute.VISION_TYPE_TEXT_LINE, "XMSSMT_SHA2-512_W16_H60_D12"));
        map.put(a("SHAKE128", 32, 16, 67, 20, 2), new zx5(VisionAttribute.VISION_TYPE_TEXT_LINE, "XMSSMT_SHAKE128_W16_H20_D2"));
        map.put(a("SHAKE128", 32, 16, 67, 20, 4), new zx5(VisionAttribute.VISION_TYPE_TEXT_LINE, "XMSSMT_SHAKE128_W16_H20_D4"));
        map.put(a("SHAKE128", 32, 16, 67, 40, 2), new zx5(VisionAttribute.VISION_TYPE_TEXT_LINE, "XMSSMT_SHAKE128_W16_H40_D2"));
        map.put(a("SHAKE128", 32, 16, 67, 40, 4), new zx5(VisionAttribute.VISION_TYPE_TEXT_LINE, "XMSSMT_SHAKE128_W16_H40_D4"));
        map.put(a("SHAKE128", 32, 16, 67, 40, 8), new zx5(VisionAttribute.VISION_TYPE_TEXT_LINE, "XMSSMT_SHAKE128_W16_H40_D8"));
        map.put(a("SHAKE128", 32, 16, 67, 60, 3), new zx5(VisionAttribute.VISION_TYPE_TEXT_LINE, "XMSSMT_SHAKE128_W16_H60_D3"));
        map.put(a("SHAKE128", 32, 16, 67, 60, 6), new zx5(VisionAttribute.VISION_TYPE_TEXT_LINE, "XMSSMT_SHAKE128_W16_H60_D6"));
        map.put(a("SHAKE128", 32, 16, 67, 60, 12), new zx5(VisionAttribute.VISION_TYPE_TEXT_LINE, "XMSSMT_SHAKE128_W16_H60_D12"));
        map.put(a("SHAKE256", 64, 16, 131, 20, 2), new zx5(VisionAttribute.VISION_TYPE_TEXT_LINE, "XMSSMT_SHAKE256_W16_H20_D2"));
        map.put(a("SHAKE256", 64, 16, 131, 20, 4), new zx5(VisionAttribute.VISION_TYPE_TEXT_LINE, "XMSSMT_SHAKE256_W16_H20_D4"));
        map.put(a("SHAKE256", 64, 16, 131, 40, 2), new zx5(VisionAttribute.VISION_TYPE_TEXT_LINE, "XMSSMT_SHAKE256_W16_H40_D2"));
        map.put(a("SHAKE256", 64, 16, 131, 40, 4), new zx5(VisionAttribute.VISION_TYPE_TEXT_LINE, "XMSSMT_SHAKE256_W16_H40_D4"));
        map.put(a("SHAKE256", 64, 16, 131, 40, 8), new zx5(VisionAttribute.VISION_TYPE_TEXT_LINE, "XMSSMT_SHAKE256_W16_H40_D8"));
        map.put(a("SHAKE256", 64, 16, 131, 60, 3), new zx5(VisionAttribute.VISION_TYPE_TEXT_LINE, "XMSSMT_SHAKE256_W16_H60_D3"));
        map.put(a("SHAKE256", 64, 16, 131, 60, 6), new zx5(VisionAttribute.VISION_TYPE_TEXT_LINE, "XMSSMT_SHAKE256_W16_H60_D6"));
        map.put(a("SHAKE256", 64, 16, 131, 60, 12), new zx5(VisionAttribute.VISION_TYPE_TEXT_LINE, "XMSSMT_SHAKE256_W16_H60_D12"));
        c = Collections.unmodifiableMap(map);
    }

    public zx5(int i, String str) {
        this.f41767a = i;
        this.f41768b = str;
    }

    public static String a(String str, int i, int i2, int i3, int i4, int i5) {
        if (str == null) {
            throw new NullPointerException("algorithmName == null");
        }
        return str + "-" + i + "-" + i2 + "-" + i3 + "-" + i4 + "-" + i5;
    }

    public static zx5 b(String str, int i, int i2, int i3, int i4, int i5) {
        if (str != null) {
            return c.get(a(str, i, i2, i3, i4, i5));
        }
        throw new NullPointerException("algorithmName == null");
    }

    public String toString() {
        return this.f41768b;
    }
}
