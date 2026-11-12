package defpackage;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.electronic.scale.export.sp.ElectronicScalePreference;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes8.dex */
public class t48 {
    public static t48 c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f34293a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, Long> f34294b = new HashMap();

    public static t48 c() {
        if (c == null) {
            synchronized (t48.class) {
                try {
                    if (c == null) {
                        c = new t48();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public final Long a() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(new Random().nextInt(10));
        }
        return Long.valueOf(Long.parseLong(sb.toString()));
    }

    public Long b(String str) {
        Long l = this.f34294b.get(str);
        if (l != null) {
            return l;
        }
        Long lA = a();
        this.f34294b.put(str, lA);
        return lA;
    }

    public void d(String str) {
        this.f34293a = str;
    }

    public void e(Long l, int i) {
        String str = ElectronicScalePreference.SCALE_VIRTUAL_USER_WEIGHT_KEY + l;
        Logger.i("ElectronicScaleHelper", "save :" + str + "," + i);
        ElectronicScalePreference.putInt(str, i);
    }
}
