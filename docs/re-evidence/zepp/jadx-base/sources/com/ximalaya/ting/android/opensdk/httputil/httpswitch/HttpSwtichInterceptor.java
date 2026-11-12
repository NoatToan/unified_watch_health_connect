package com.ximalaya.ting.android.opensdk.httputil.httpswitch;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes22.dex */
public class HttpSwtichInterceptor implements Interceptor {
    @Nullable
    private static DomainInfo createDomainInfo(String str, String str2, String str3) {
        if (str == null || str2 == null || str3 == null) {
            return null;
        }
        return new DomainInfo(str.replaceFirst(str2, str3), str2, str3);
    }

    private void processResponse(String str, Response response) {
        if (response == null || response.headers() == null) {
            return;
        }
        GatewaySwitchManager.parseIDCSwitch(str, response.headers());
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        DomainInfo domainInfoCreateDomainInfo;
        Request request = chain.request();
        String strHost = request.url().host();
        String string = request.url().toString();
        DomainDetail domainDetail = DNSCache.getInstance().getDomainDetail(strHost);
        if (domainDetail != null && domainDetail.IDC_GROUP.size() != 0) {
            Iterator<IdcGroup> it2 = DNSCache.getInstance().processIdc(strHost, new ArrayList<>(domainDetail.IDC_GROUP)).iterator();
            while (it2.hasNext()) {
                String str = it2.next().domain;
                if (!TextUtils.isEmpty(str) && (domainInfoCreateDomainInfo = createDomainInfo(string, strHost, str)) != null) {
                    Request.Builder builderNewBuilder = request.newBuilder();
                    builderNewBuilder.url(domainInfoCreateDomainInfo.url);
                    builderNewBuilder.header("Host", domainInfoCreateDomainInfo.newHost);
                    request = builderNewBuilder.build();
                    Log.i("SwtichInterceptor", "domainInfo=" + domainInfoCreateDomainInfo);
                    break;
                }
            }
        }
        Response responseProceed = chain.proceed(request);
        processResponse(strHost, responseProceed);
        return responseProceed;
    }
}
