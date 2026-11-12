package com.huawei.health.routeradapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.alipay.sdk.m.s.e;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.router.facade.service.PretreatmentService;
import com.huawei.health.arkuix.IntentParams;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class ArkUIPretreatmentService implements PretreatmentService {
    @Override // com.huawei.haf.router.facade.template.ServiceProvider
    public void init(Context context) {
    }

    @Override // com.huawei.haf.router.facade.service.PretreatmentService
    public boolean onPretreatment(Context context, Guidepost guidepost) {
        Uri uriO = guidepost.o();
        if (uriO == null) {
            LogUtil.e("EmotionCardPretreatmentService", "uri is null.");
            return false;
        }
        LogUtil.a("EmotionCardPretreatmentService", "uri:", uriO.toString());
        if (!uriO.toString().contains("emotionHealth")) {
            LogUtil.a("EmotionCardPretreatmentService", "uri does not match");
        } else {
            c(context, uriO);
        }
        return false;
    }

    private void c(final Context context, Uri uri) {
        final Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), ArkUIXConstants.ENTRY_ABILITY_ACTIVITY);
        String queryParameter = uri.getQueryParameter("tab");
        String str = "emotion";
        if (!Objects.equals(queryParameter, "emotion")) {
            if (Objects.equals(queryParameter, "stress")) {
                str = "stress";
            } else {
                LogUtil.a("EmotionCardPretreatmentService", "uri params not matched!");
            }
        }
        String string = IntentParams.builder().addPageId(ArkUIXConstants.KNIT_EMOTION).addPageType("8").addTimeStamp("0").addRecord("{'tab':\"" + str + "\"}").build().toString();
        LogUtil.a("EmotionCardPretreatmentService", "params start with: ", string);
        intent.putExtra(e.n, string);
        intent.putExtra(ArkUIXConstants.ARKUIX_MODULE_TYPE_KEY, 1);
        intent.putExtra("DELAY_MILLIS", 100L);
        HandlerExecutor.b(new Runnable() { // from class: guz
            @Override // java.lang.Runnable
            public final void run() {
                iov.c(context, intent);
            }
        });
    }
}
