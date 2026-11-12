package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.math.BigDecimal;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u001a\u0016\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002\u001a\u001e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¨\u0006\t"}, d2 = {"", "value", "", "scale", PluginDeviceInfo.FMODEL, "unit", "weight", "unitFrom", "unitTo", "bluetooth_release"}, k = 2, mv = {1, 7, 1})
public final class ix {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Map<Integer, Float> f22184a = MapsKt__MapsKt.mapOf(TuplesKt.to(0, Float.valueOf(1.0f)), TuplesKt.to(16, Float.valueOf(2.0f)), TuplesKt.to(1, Float.valueOf(2.20462f)), TuplesKt.to(17, Float.valueOf(0.15747304f)), TuplesKt.to(2, Float.valueOf(1000.0f)), TuplesKt.to(3, Float.valueOf(35.27396f)));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Map<Integer, Integer> f22185b = MapsKt__MapsKt.mapOf(TuplesKt.to(0, 2), TuplesKt.to(16, 2), TuplesKt.to(1, 2), TuplesKt.to(17, 2));

    public static final float a(float f, int i) {
        return new BigDecimal(f).setScale(i, 4).floatValue();
    }

    public static final float a(int i) {
        Float f = f22184a.get(Integer.valueOf(i));
        if (f != null) {
            return f.floatValue();
        }
        return 1.0f;
    }

    public static final float a(float f, int i, int i2) {
        float fA = (f / a(i)) * a(i2);
        Integer num = f22185b.get(Integer.valueOf(i2));
        return a(fA, num != null ? num.intValue() : 2);
    }
}
