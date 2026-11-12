package com.huawei.hms.network.embedded;

import android.net.ConnectivityManager;
import android.net.Network;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.network.httpclient.okhttp.OkHttpClientGlobal;
import com.huawei.hms.network.inner.api.PolicyNetworkService;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public class k3 implements d1.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f14995b = "OkRequestTaskFactory";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q7 f14996a;

    public static class a implements f7 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public o2 f14997b;

        @Override // com.huawei.hms.network.embedded.f7
        public List<InetAddress> lookup(String str) throws UnknownHostException {
            return this.f14997b.lookup(str);
        }

        public int hashCode() {
            return this.f14997b.hashCode();
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && this.f14997b.equals(((a) obj).f14997b);
        }

        public a(o2 o2Var) {
            this.f14997b = o2Var;
        }
    }

    @Override // com.huawei.hms.network.embedded.d1.a
    public d1 newTask() {
        return new j3(this.f14996a);
    }

    @Override // com.huawei.hms.network.embedded.d1.a
    public boolean isAvailable() {
        return this.f14996a != null;
    }

    @Override // com.huawei.hms.network.embedded.d1.a
    public String getChannel() {
        return "type_okhttp";
    }

    public k3(a1 a1Var) {
        int iStringToInteger;
        q7.c cVarA = OkHttpClientGlobal.getInstance().getClient().u().a(a1Var.getHostnameVerifier()).a(new a(a1Var.getDns())).a(a1Var.getProxy());
        String ni = a1Var.getNi();
        if (!TextUtils.isEmpty(ni)) {
            ConnectivityManager connectivityManager = (ConnectivityManager) ContextHolder.getAppContext().getSystemService("connectivity");
            try {
                for (Network network : connectivityManager.getAllNetworks()) {
                    if (connectivityManager.getLinkProperties(network).getInterfaceName().equals(ni)) {
                        cVarA.a(OkHttpClientGlobal.getInstance().newConnectionPool()).a(network.getSocketFactory());
                        Logger.i(f14995b, "bind network client = " + network + " " + ni);
                        break;
                    }
                }
            } catch (Exception unused) {
                Logger.w(f14995b, "must add ACCESS_NETWORK_STATE permission");
            }
        }
        if (a1Var.getSslSocketFactory() != null && a1Var.getTrustManager() != null) {
            cVarA.a(a1Var.getSslSocketFactory(), a1Var.getTrustManager());
        }
        if (a1Var.getProxySelector() != null) {
            cVarA.a(a1Var.getProxySelector());
        }
        String value = a1Var.getPolicyExecutor().getValue("", PolicyNetworkService.ClientConstants.SUPPORT_PROTOCOLS);
        if (value != null && value.length() > 0) {
            String[] strArrSplit = value.replace("[", "").replace("]", "").split(",");
            if (strArrSplit.length == 1 && r7.HTTP_1_1.toString().equalsIgnoreCase(strArrSplit[0].trim())) {
                cVarA.b(f8.a(r7.HTTP_1_1));
            }
        }
        String value2 = a1Var.getPolicyExecutor().getValue("", PolicyNetworkService.ClientConstants.FOLLOW_REDIRECTS);
        if (value2 != null && value2.length() > 0) {
            cVarA.a(StringUtils.stringToBoolean(value2, true));
        }
        String value3 = a1Var.getPolicyExecutor().getValue("", PolicyNetworkService.ClientConstants.FOLLOW_SSL_REDIRECTS);
        if (value3 != null && value3.length() > 0) {
            cVarA.b(StringUtils.stringToBoolean(value3, true));
        }
        String value4 = a1Var.getPolicyExecutor().getValue("", PolicyNetworkService.ClientConstants.TRAFFIC_CLASS);
        if (!TextUtils.isEmpty(value4) && (iStringToInteger = StringUtils.stringToInteger(value4, -1)) >= 0 && iStringToInteger <= 255) {
            cVarA.a(iStringToInteger);
        }
        this.f14996a = cVarA.a();
    }
}
