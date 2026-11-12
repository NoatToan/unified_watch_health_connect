package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.alipay.sdk.m.s.e;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.arkuix.IntentParams;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.ui.main.stories.health.activity.healthdata.KnitPressureActivity;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes19.dex */
public class uye {
    public static void a(final Context context, final Bundle bundle) {
        boolean z;
        String string;
        if (!HandlerExecutor.d()) {
            HandlerExecutor.b(new Runnable() { // from class: uyd
                @Override // java.lang.Runnable
                public final void run() {
                    uye.a(context, bundle);
                }
            });
            return;
        }
        Context contextB = BaseApplication.b();
        if (fua.d()) {
            Intent intent = new Intent();
            intent.setClassName(context.getPackageName(), ArkUIXConstants.ENTRY_ABILITY_ACTIVITY);
            if (bundle != null && bundle.containsKey("tab")) {
                string = bundle.getString("tab");
            } else {
                string = "stress";
            }
            String string2 = IntentParams.builder().addPageId(ArkUIXConstants.KNIT_EMOTION).addPageType("8").addRecord("{'tab':'" + string + "'}").build().toString();
            intent.putExtra(e.n, string2);
            intent.putExtra(ArkUIXConstants.ARKUIX_MODULE_TYPE_KEY, 1);
            LogUtil.b("EmotionStressUtil", "gotoEmotionStress params ", string2);
            iov.c(context, intent);
            return;
        }
        Intent intent2 = new Intent(contextB, (Class<?>) KnitPressureActivity.class);
        if (bundle != null) {
            if (bundle.containsKey("type")) {
                intent2.putExtra("type", bundle.getInt("type"));
            }
            if (bundle.containsKey("pressure_is_have_datas")) {
                z = bundle.getBoolean("pressure_is_have_datas");
                intent2.putExtra("pressure_is_have_datas", z);
            } else {
                z = false;
            }
            if (bundle.containsKey("lastDataTime") && z) {
                KnitPressureActivity.a(context, bundle.getLong("lastDataTime"));
                return;
            }
        }
        iov.d(context, intent2);
    }
}
