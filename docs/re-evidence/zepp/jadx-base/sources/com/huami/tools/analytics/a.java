package com.huami.tools.analytics;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.huami.tools.analytics.internal.function.BooleanSupplier;
import com.huami.tools.analytics.internal.function.Consumer;
import com.huami.tools.analytics.internal.helper.EmptyActivityLifecycleCallbacks;
import com.huami.tools.analytics.internal.utils.DefaultClock;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
class a extends EmptyActivityLifecycleCallbacks {
    private static final String d = "HmStat-ActivityRecorder";
    private Map<String, Long> a = new HashMap();
    private Consumer<Event> b;
    private BooleanSupplier c;

    public a(@NonNull Consumer<Event> consumer, @NonNull BooleanSupplier booleanSupplier) {
        this.b = consumer;
        this.c = booleanSupplier;
    }

    private String a(Activity activity) {
        return activity.getClass().getName() + activity.hashCode();
    }

    private void b(Activity activity) {
        String strA = a(activity);
        Long l = this.a.get(strA);
        if (l != null) {
            this.a.remove(strA);
            long jCurrentTimeMillis = DefaultClock.get().currentTimeMillis();
            long jLongValue = jCurrentTimeMillis - l.longValue();
            String name = activity.getClass().getName();
            if (d(name, l, jCurrentTimeMillis)) {
                this.b.accept((Event) EventBuilders.b().b(jLongValue).c(name).build());
            }
        }
    }

    private void c(Activity activity) {
        this.a.put(a(activity), Long.valueOf(DefaultClock.get().currentTimeMillis()));
    }

    public static boolean d(String str, Long l, long j) {
        if (String.valueOf(l).length() != 13) {
            p.b().w(d, String.format(Locale.CHINA, "页面访问开始时间戳异常, pageName: %s, pageStartTime: %s", str, l));
            return false;
        }
        if (String.valueOf(j).length() != 13) {
            p.b().w(d, String.format(Locale.CHINA, "页面访问结束时间戳异常, pageName: %s, pageEndTime: %s", str, Long.valueOf(j)));
            return false;
        }
        if (j - l.longValue() > 0) {
            return true;
        }
        p.b().w(d, String.format(Locale.CHINA, "页面访问时长计算结果居然为负数, pageName: %s, pageStartTime: %s, pageEndTime: %s", str, l, Long.valueOf(j)));
        return false;
    }

    @Override // com.huami.tools.analytics.internal.helper.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (this.c.getAsBoolean()) {
            b(activity);
        }
    }

    @Override // com.huami.tools.analytics.internal.helper.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (this.c.getAsBoolean()) {
            c(activity);
        }
    }
}
