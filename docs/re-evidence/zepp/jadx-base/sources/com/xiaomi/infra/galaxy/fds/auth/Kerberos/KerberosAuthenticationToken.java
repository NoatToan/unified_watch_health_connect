package com.xiaomi.infra.galaxy.fds.auth.Kerberos;

import com.xiaomi.infra.galaxy.fds.exception.AuthenticationFailedException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes22.dex */
public class KerberosAuthenticationToken {
    private static final String e = "&";
    private static final String f = "u";
    private static final String g = "p";
    private static final String h = "e";
    private static final Set<String> i = new HashSet(Arrays.asList("u", "p", h));
    private String a;
    private String b;
    private long c = -1;
    private String d;

    public KerberosAuthenticationToken(String str, String str2) {
        this.a = str;
        this.b = str2;
        a();
    }

    private void a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("u");
        stringBuffer.append(SearchCriteria.EQ);
        stringBuffer.append(getProxyUser());
        stringBuffer.append("&");
        stringBuffer.append("p");
        stringBuffer.append(SearchCriteria.EQ);
        stringBuffer.append(getPrincipal());
        stringBuffer.append("&");
        stringBuffer.append(h);
        stringBuffer.append(SearchCriteria.EQ);
        stringBuffer.append(getExpires());
        this.d = stringBuffer.toString();
    }

    private static Map<String, String> b(String str) throws AuthenticationFailedException {
        HashMap map = new HashMap();
        StringTokenizer stringTokenizer = new StringTokenizer(str, "&");
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            int iIndexOf = strNextToken.indexOf(61);
            if (iIndexOf == -1) {
                throw new AuthenticationFailedException("Invalid authentication token", null);
            }
            map.put(strNextToken.substring(0, iIndexOf), strNextToken.substring(iIndexOf + 1));
        }
        return map;
    }

    public static KerberosAuthenticationToken parse(String str) throws AuthenticationFailedException {
        Map<String, String> mapB = b(str);
        if (!mapB.keySet().equals(i)) {
            throw new AuthenticationFailedException("Invalid token string, missing attributes", null);
        }
        long j = Long.parseLong(mapB.get(h));
        KerberosAuthenticationToken kerberosAuthenticationToken = new KerberosAuthenticationToken(mapB.get("u"), mapB.get("p"));
        kerberosAuthenticationToken.setExpires(j);
        return kerberosAuthenticationToken;
    }

    public long getExpires() {
        return this.c;
    }

    public String getPrincipal() {
        return this.b;
    }

    public String getProxyUser() {
        return this.a;
    }

    public boolean isExpired() {
        return getExpires() != -1 && System.currentTimeMillis() > getExpires();
    }

    public void setExpires(long j) {
        this.c = j;
        a();
    }

    public String toString() {
        return this.d;
    }
}
