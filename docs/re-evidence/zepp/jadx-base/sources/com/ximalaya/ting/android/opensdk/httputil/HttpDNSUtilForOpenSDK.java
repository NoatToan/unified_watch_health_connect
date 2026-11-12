package com.ximalaya.ting.android.opensdk.httputil;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ximalaya.ting.android.opensdk.player.service.XmPlayerConfig;
import com.ximalaya.ting.android.player.IDomainServerIpCallback;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes22.dex */
public class HttpDNSUtilForOpenSDK {

    public static class DNSHostIP {
        private static List<DNSHostIP> dnsHostIPs;
        private int curUseIndexHost;
        private String[] hosts;

        public static String getCurrReplaceHost(String str) {
            for (DNSHostIP dNSHostIP : getDNSIps()) {
                String[] strArr = dNSHostIP.hosts;
                if (strArr != null && Arrays.binarySearch(strArr, str) >= 0) {
                    return dNSHostIP.hosts[dNSHostIP.curUseIndexHost];
                }
            }
            return null;
        }

        public static List<DNSHostIP> getDNSIps() {
            if (dnsHostIPs == null) {
                dnsHostIPs = new CopyOnWriteArrayList<DNSHostIP>() { // from class: com.ximalaya.ting.android.opensdk.httputil.HttpDNSUtilForOpenSDK.DNSHostIP.1
                    {
                        add(new DNSHostIP(new String[]{"fdfs.xmcdn.com", "adudio1.ws.xmcdn.com"}));
                        add(new DNSHostIP(new String[]{"audio.xmcdn.com", "audio2.xmcdn.com"}));
                        add(new DNSHostIP(new String[]{"download.xmcdn.com", "download2.xmcdn.com"}));
                        add(new DNSHostIP(new String[]{"api.ximalaya.com", "114.80.138.114"}));
                        add(new DNSHostIP(new String[]{"activity.ximalaya.com", "180.153.255.9"}));
                        add(new DNSHostIP(new String[]{"live.xmcdn.com", "112.65.220.26", "112.65.220.28"}));
                    }
                };
            }
            return dnsHostIPs;
        }

        public static String getNextReplaceHost(String str) {
            for (DNSHostIP dNSHostIP : getDNSIps()) {
                String[] strArr = dNSHostIP.hosts;
                if (strArr != null && Arrays.binarySearch(strArr, str) >= 0) {
                    int i = dNSHostIP.curUseIndexHost;
                    String[] strArr2 = dNSHostIP.hosts;
                    int i2 = i == strArr2.length + (-1) ? 0 : i + 1;
                    dNSHostIP.curUseIndexHost = i2;
                    return strArr2[i2];
                }
            }
            return null;
        }

        public static String[] getOtherIpsByHost(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            for (DNSHostIP dNSHostIP : getDNSIps()) {
                String[] strArr = dNSHostIP.hosts;
                if (strArr != null && strArr[0].equals(str)) {
                    String[] strArr2 = dNSHostIP.hosts;
                    return (String[]) Arrays.copyOfRange(strArr2, 1, strArr2.length);
                }
            }
            return null;
        }

        public static boolean haveReplaceHost(String str) {
            Iterator<DNSHostIP> it2 = getDNSIps().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    return false;
                }
                String[] strArr = it2.next().hosts;
                if (strArr != null) {
                    for (String str2 : strArr) {
                        if (str2.equals(str)) {
                            return true;
                        }
                    }
                }
            }
        }

        private DNSHostIP(String[] strArr) {
            this.curUseIndexHost = 0;
            if (strArr == null || strArr.length <= 1) {
                return;
            }
            this.hosts = strArr;
        }
    }

    public static IDomainServerIpCallback getDomainServerIpCallBack(Context context) {
        if (XmPlayerConfig.getInstance(context).isUsePreventHijack()) {
            return new IDomainServerIpCallback() { // from class: com.ximalaya.ting.android.opensdk.httputil.HttpDNSUtilForOpenSDK.1
                @Override // com.ximalaya.ting.android.player.IDomainServerIpCallback
                public String getNewDownloadUrlIfExpire(String str) {
                    return null;
                }

                @Override // com.ximalaya.ting.android.player.IDomainServerIpCallback
                public String[][] getStaticDomainServerIp(String str) {
                    String[][] strArr = null;
                    if (TextUtils.isEmpty(str)) {
                        return null;
                    }
                    String host = Uri.parse(str).getHost();
                    if (DNSHostIP.haveReplaceHost(host)) {
                        String[] otherIpsByHost = DNSHostIP.getOtherIpsByHost(host);
                        if (otherIpsByHost == null) {
                            return null;
                        }
                        strArr = (String[][]) Array.newInstance((Class<?>) String.class, otherIpsByHost.length + 1, 2);
                        strArr[0] = new String[]{str, host};
                        for (int i = 1; i < strArr.length; i++) {
                            int i2 = i - 1;
                            strArr[i] = new String[]{str.replaceFirst(host, otherIpsByHost[i2]), otherIpsByHost[i2]};
                        }
                    }
                    return strArr;
                }

                @Override // com.ximalaya.ting.android.player.IDomainServerIpCallback
                public void setBadIp(String str, String str2, String str3) {
                }
            };
        }
        return null;
    }

    public static Interceptor getHttpDNSInterceptor() {
        return new Interceptor() { // from class: com.ximalaya.ting.android.opensdk.httputil.HttpDNSUtilForOpenSDK.2
            @Override // okhttp3.Interceptor
            public Response intercept(Interceptor.Chain chain) throws IOException {
                Throwable th;
                Response responseProceed;
                Request request = chain.request();
                HttpUrl httpUrlUrl = request.url();
                String string = httpUrlUrl.toString();
                String strHost = httpUrlUrl.host();
                Response response = null;
                try {
                    Request.Builder builderNewBuilder = request.newBuilder();
                    String currReplaceHost = DNSHostIP.getCurrReplaceHost(strHost);
                    if (TextUtils.isEmpty(currReplaceHost)) {
                        builderNewBuilder.url(httpUrlUrl);
                    } else {
                        builderNewBuilder.url(string.replaceFirst(strHost, currReplaceHost));
                    }
                    responseProceed = chain.proceed(builderNewBuilder.build());
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                    responseProceed = null;
                }
                if ((responseProceed == null || (!responseProceed.isSuccessful() && responseProceed.code() != 401)) && DNSHostIP.haveReplaceHost(strHost)) {
                    try {
                        Request.Builder builderNewBuilder2 = request.newBuilder();
                        String nextReplaceHost = DNSHostIP.getNextReplaceHost(strHost);
                        if (TextUtils.isEmpty(nextReplaceHost)) {
                            builderNewBuilder2.url(string);
                        } else {
                            builderNewBuilder2.url(string.replaceFirst(strHost, nextReplaceHost));
                        }
                        Response responseProceed2 = chain.proceed(builderNewBuilder2.header("Host", strHost).build());
                        if (responseProceed2 != null) {
                            return responseProceed2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (responseProceed != null) {
                            responseProceed.close();
                        }
                    }
                }
                response = responseProceed;
                if (response != null) {
                    return response;
                }
                if (th == null) {
                    throw new IOException("application interceptor returned null  URL:" + string);
                }
                throw new IOException(th.toString() + "  URL:" + string);
            }
        };
    }
}
