package com.huawei.openalliance.ad.utils;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.network.restclient.dnkeeper.DNKeeperManager;
import com.huawei.hms.framework.network.restclient.dnkeeper.RequestHost;
import com.huawei.hms.framework.network.restclient.hwhttp.dns.DnsResult;
import com.huawei.openalliance.ad.hw;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class z {
    public static boolean a() {
        try {
            Class.forName("com.huawei.hms.framework.network.restclient.dnkeeper.DNKeeperManager");
            return true;
        } catch (Throwable unused) {
            hw.d("DNSUtil", "check DNKeeperManager available error");
            return false;
        }
    }

    public static void a(String str) {
        if (a()) {
            DNKeeperManager.getInstance().removeCache(str);
        }
    }

    public static void a(Context context) {
        if (a()) {
            hw.b("DNSUtil", "init dnkeeper");
            DNKeeperManager.getInstance().init(context.getApplicationContext());
        }
    }

    public static List<InetAddress> a(Context context, String str) {
        List<DnsResult.Address> addressList;
        hw.b("DNSUtil", "lookup:" + ds.a(str));
        ArrayList arrayList = new ArrayList();
        DnsResult dnsResultQueryIpsSync = DNKeeperManager.getInstance().queryIpsSync(new RequestHost(str));
        if (dnsResultQueryIpsSync != null && (addressList = dnsResultQueryIpsSync.getAddressList()) != null && !addressList.isEmpty()) {
            Iterator<DnsResult.Address> it = addressList.iterator();
            while (it.hasNext()) {
                String value = it.next().getValue();
                if (!TextUtils.isEmpty(value)) {
                    if (hw.a()) {
                        hw.a("DNSUtil", "ip:%s", value);
                    }
                    arrayList.add(InetAddress.getByName(value));
                }
            }
        }
        return arrayList;
    }
}
