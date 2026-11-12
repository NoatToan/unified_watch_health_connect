package com.huami.passport.api;

import android.content.Context;
import com.huami.passport.api.BaseUserService;
import com.huami.passport.data.cache.HttpDnsCache;
import com.huami.tools.log.HMLog;
import java.net.URLEncoder;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class BaseUserService {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$buildUrlByParams$0(String str) {
        return "buildUrlByParams " + str;
    }

    public String buildUrlByParams(String str, Context context, String... strArr) {
        for (int i = 0; i < strArr.length; i++) {
            try {
                strArr[i] = URLEncoder.encode(strArr[i], "UTF-8");
            } catch (Exception unused) {
            }
        }
        final String str2 = String.format(HttpDnsCache.getIdUrl(context) + str, strArr);
        HMLog.debug(new Function0() { // from class: ur
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseUserService.lambda$buildUrlByParams$0(str2);
            }
        });
        return str2;
    }
}
