package com.huawei.openalliance.ad.inter;

import android.content.Context;
import android.location.Location;
import android.util.Pair;
import com.huawei.openalliance.ad.beans.inner.ApiReqParam;
import com.huawei.openalliance.ad.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.beans.parameter.RequestOptions;
import com.huawei.openalliance.ad.en;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.ot;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bk;
import com.huawei.openalliance.ad.utils.bo;
import com.huawei.openalliance.ad.utils.o;
import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class AdContentRequestFactory {
    public static void prepareRequestParam(final Context context, final RequestOptions requestOptions) {
        try {
            o.f(new Runnable() { // from class: com.huawei.openalliance.ad.inter.AdContentRequestFactory.1
                @Override // java.lang.Runnable
                public void run() {
                    Context context2 = context;
                    RequestOptions requestOptions2 = requestOptions;
                    if (requestOptions2 == null) {
                        requestOptions2 = new RequestOptions();
                    }
                    AdContentRequestFactory.getAdRequestParameters(context2, 4, requestOptions2);
                }
            });
        } catch (Throwable th) {
            hw.c("AdContentRequestFactory", "prepare Param err, %s", th.getClass().getSimpleName());
        }
    }

    public static String getAdRequestParameters(Context context, String[] strArr, int i, int i2, RequestOptions requestOptions, ApiReqParam apiReqParam) {
        return a(context, strArr, i, i2, requestOptions, null, apiReqParam);
    }

    public static String getAdRequestParameters(Context context, String[] strArr, int i, int i2, RequestOptions requestOptions) {
        return a(context, strArr, i, i2, requestOptions, null, null);
    }

    public static String getAdRequestParameters(Context context, String[] strArr, int i, int i2, Location location, RequestOptions requestOptions) {
        com.huawei.hms.ads.jsb.inner.data.a.C0095a c0095a = new com.huawei.hms.ads.jsb.inner.data.a.C0095a();
        c0095a.a(location);
        return a(context, strArr, i, i2, requestOptions, c0095a.a(), null);
    }

    public static String getAdRequestParameters(Context context, int i, RequestOptions requestOptions, ApiReqParam apiReqParam) {
        return a(context, new String[0], -1, i, requestOptions, null, apiReqParam);
    }

    public static String getAdRequestParameters(Context context, int i, RequestOptions requestOptions) {
        return getAdRequestParameters(context, new String[0], -1, i, requestOptions);
    }

    public static String a(Context context, String[] strArr, int i, int i2, RequestOptions requestOptions, com.huawei.hms.ads.jsb.inner.data.a aVar, ApiReqParam apiReqParam) {
        String str;
        hw.b("AdContentRequestFactory", "getAdRequestParameters");
        if (context == null) {
            str = "empty request parameter";
        } else {
            if (as.b(context)) {
                bo.b(context.getApplicationContext(), requestOptions);
                bo.b(context.getApplicationContext());
                en.a(context).e();
                if (strArr == null) {
                    strArr = new String[0];
                }
                AdSlotParam.Builder builder = new AdSlotParam.Builder();
                builder.setAdIds(Arrays.asList(strArr)).setDeviceType(i2).setWidth(com.huawei.openalliance.ad.utils.d.d(context)).setHeight(com.huawei.openalliance.ad.utils.d.e(context)).setRequestOptions(requestOptions);
                if (aVar != null) {
                    if (hw.a()) {
                        hw.a("AdContentRequestFactory", "api req param: %s.", bk.b(aVar));
                    }
                    builder.setDetailedCreativeTypeList(aVar.c());
                    builder.b(aVar.d());
                    builder.setAdWidth(aVar.e());
                    builder.setAdHeight(aVar.f());
                    builder.setLocation(aVar.g());
                    builder.setContentBundle(aVar.h());
                    if (aVar.a()) {
                        builder.a(aVar.a());
                        builder.a(aVar.b());
                        builder.c((Integer) 3);
                    }
                }
                Pair<String, Boolean> pairB = com.huawei.openalliance.ad.utils.d.b(context, true);
                if (pairB != null) {
                    hw.b("AdContentRequestFactory", "use cached oaid " + System.currentTimeMillis());
                    builder.setOaid((String) pairB.first);
                    builder.setTrackLimited((Boolean) pairB.second);
                }
                return new ot(context).a(as.a(), i, builder.build(), apiReqParam);
            }
            str = "api level too low";
        }
        hw.c("AdContentRequestFactory", str);
        return "";
    }

    public static String a(Context context, int i, RequestOptions requestOptions, com.huawei.hms.ads.jsb.inner.data.a aVar) {
        return a(context, new String[0], -1, i, requestOptions, aVar, null);
    }
}
