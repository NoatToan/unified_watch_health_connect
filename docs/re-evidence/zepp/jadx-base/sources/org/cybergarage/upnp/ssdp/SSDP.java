package org.cybergarage.upnp.ssdp;

import org.cybergarage.http.HTTP;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.cybergarage.util.Debug;

/* JADX INFO: loaded from: classes23.dex */
public class SSDP {
    public static final String ADDRESS = "239.255.255.250";
    public static final int DEFAULT_MSEARCH_MX = 3;
    private static String IPV6_ADDRESS = null;
    public static final String IPV6_ADMINISTRATIVE_ADDRESS = "FF04::C";
    public static final String IPV6_GLOBAL_ADDRESS = "FF0E::C";
    public static final String IPV6_LINK_LOCAL_ADDRESS = "FF02::C";
    public static final String IPV6_SITE_LOCAL_ADDRESS = "FF05::C";
    public static final String IPV6_SUBNET_ADDRESS = "FF03::C";
    public static final int PORT = 1900;
    public static final int RECV_MESSAGE_BUFSIZE = 1024;

    static {
        setIPv6Address(IPV6_LINK_LOCAL_ADDRESS);
    }

    public static final String getIPv6Address() {
        return IPV6_ADDRESS;
    }

    public static final int getLeaseTime(String str) {
        int iIndexOf = str.indexOf(HTTP.MAX_AGE);
        if (iIndexOf >= 0) {
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            if (iIndexOf2 < 0) {
                iIndexOf2 = str.length();
            }
            try {
                return Integer.parseInt(str.substring(str.indexOf(SearchCriteria.EQ, iIndexOf) + 1, iIndexOf2).trim());
            } catch (Exception e) {
                Debug.warning(e);
            }
        }
        return 0;
    }

    public static final void setIPv6Address(String str) {
        IPV6_ADDRESS = str;
    }
}
