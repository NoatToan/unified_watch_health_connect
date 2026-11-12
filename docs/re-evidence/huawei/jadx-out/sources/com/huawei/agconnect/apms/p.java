package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import com.squareup.okhttp.Dns;
import com.squareup.okhttp.OkHttpClient;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class p implements Dns {
    public static final AgentLog cde = AgentLogManager.getAgentLog();
    public Dns abc;
    public b bcd;

    public p(Dns dns, b bVar) {
        this.abc = dns;
        this.bcd = bVar;
    }

    public static void abc(OkHttpClient okHttpClient, b bVar) {
        if (okHttpClient == null) {
            return;
        }
        try {
            if (okHttpClient.getDns() == null) {
                okHttpClient.setDns(Dns.SYSTEM);
            }
            if (okHttpClient.getDns() != null) {
                if (okHttpClient.getDns() instanceof p) {
                    ((p) okHttpClient.getDns()).bcd = bVar;
                } else {
                    cde.debug("set custom dns success.");
                    okHttpClient.setDns(new p(okHttpClient.getDns(), bVar));
                }
            }
        } catch (Throwable th) {
            bcd.abc(th, abc.abc("set custom dns class failed: "), cde);
        }
    }

    public final List<InetAddress> lookup(String str) throws UnknownHostException {
        b bVar = this.bcd;
        jih jihVar = new jih(str, 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            List<InetAddress> listLookup = this.abc.lookup(str);
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() - jCurrentTimeMillis);
            if (bVar.nml() != null && bVar.nml().contains(str) && c.abc(iCurrentTimeMillis)) {
                jihVar.abc(iCurrentTimeMillis);
                jihVar.abc(true);
                if (listLookup != null) {
                    jihVar.abc(listLookup.toString());
                }
                bVar.abc(jihVar);
                bVar.cba();
            }
            return listLookup;
        } catch (UnknownHostException e) {
            bVar.dcb();
            jihVar.abc(false);
            throw e;
        }
    }
}
