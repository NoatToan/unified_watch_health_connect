package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.huawei.health.pressure.PressureApi;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes8.dex */
public class gry {
    private static PressureApi a() {
        return (PressureApi) Services.d("Main", PressureApi.class);
    }

    public static void a(Context context, Bundle bundle) {
        PressureApi pressureApiA = a();
        if (pressureApiA == null) {
            ReleaseLogUtil.d("R_EmotionStressUtil", "gotoEmotionStress pressureApi is null");
        } else {
            pressureApiA.gotoPressure(context, bundle);
        }
    }
}
