package defpackage;

import com.huawei.health.servicesui.R;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes8.dex */
public class gzw {
    public static int e() {
        if (UnitUtil.f()) {
            return R.string.sug_pace_mile;
        }
        return R.string.sug_event_time_formart;
    }

    public static int a() {
        if (UnitUtil.f()) {
            return R.plurals.sug_mile;
        }
        return R.plurals.sug_km;
    }
}
