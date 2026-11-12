package com.google.common.net;

import defpackage.c6i;
import defpackage.j4h;
import defpackage.pt3;
import defpackage.qlo;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes5.dex */
public final class HostAndPort implements Serializable {
    private static final int NO_PORT = -1;
    private static final long serialVersionUID = 0;
    private final boolean hasBracketlessColons;
    private final String host;
    private final int port;

    private HostAndPort(String str, int i, boolean z) {
        this.host = str;
        this.port = i;
        this.hasBracketlessColons = z;
    }

    public static HostAndPort fromHost(String str) {
        HostAndPort hostAndPortFromString = fromString(str);
        c6i.j(!hostAndPortFromString.hasPort(), "Host has a port: %s", str);
        return hostAndPortFromString;
    }

    public static HostAndPort fromParts(String str, int i) {
        c6i.f(isValidPort(i), "Port out of range: %s", i);
        HostAndPort hostAndPortFromString = fromString(str);
        c6i.j(!hostAndPortFromString.hasPort(), "Host has a port: %s", str);
        return new HostAndPort(hostAndPortFromString.host, i, hostAndPortFromString.hasBracketlessColons);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    public static HostAndPort fromString(String str) {
        String str2;
        boolean z;
        String strSubstring;
        String strSubstring2;
        c6i.o(str);
        int i = -1;
        if (!str.startsWith("[")) {
            int iIndexOf = str.indexOf(58);
            if (iIndexOf >= 0) {
                int i2 = iIndexOf + 1;
                if (str.indexOf(58, i2) == -1) {
                    strSubstring2 = str.substring(0, iIndexOf);
                    strSubstring = str.substring(i2);
                }
                if (!qlo.b(strSubstring)) {
                    c6i.j(strSubstring.startsWith(Marker.ANY_NON_NULL_MARKER) && pt3.c().h(strSubstring), "Unparseable port number: %s", str);
                    try {
                        i = Integer.parseInt(strSubstring);
                        c6i.j(isValidPort(i), "Port number out of range: %s", str);
                    } catch (NumberFormatException unused) {
                        throw new IllegalArgumentException(str.length() != 0 ? "Unparseable port number: ".concat(str) : new String("Unparseable port number: "));
                    }
                }
                return new HostAndPort(str2, i, z);
            }
            str2 = str;
            z = iIndexOf >= 0;
            strSubstring = null;
            if (!qlo.b(strSubstring)) {
                c6i.j(strSubstring.startsWith(Marker.ANY_NON_NULL_MARKER) && pt3.c().h(strSubstring), "Unparseable port number: %s", str);
                i = Integer.parseInt(strSubstring);
                c6i.j(isValidPort(i), "Port number out of range: %s", str);
            }
            return new HostAndPort(str2, i, z);
        }
        String[] hostAndPortFromBracketedHost = getHostAndPortFromBracketedHost(str);
        strSubstring2 = hostAndPortFromBracketedHost[0];
        strSubstring = hostAndPortFromBracketedHost[1];
        str2 = strSubstring2;
        z = false;
        if (!qlo.b(strSubstring)) {
            c6i.j(strSubstring.startsWith(Marker.ANY_NON_NULL_MARKER) && pt3.c().h(strSubstring), "Unparseable port number: %s", str);
            i = Integer.parseInt(strSubstring);
            c6i.j(isValidPort(i), "Port number out of range: %s", str);
        }
        return new HostAndPort(str2, i, z);
    }

    private static String[] getHostAndPortFromBracketedHost(String str) {
        c6i.j(str.charAt(0) == '[', "Bracketed host-port string must start with a bracket: %s", str);
        int iIndexOf = str.indexOf(58);
        int iLastIndexOf = str.lastIndexOf(93);
        c6i.j(iIndexOf > -1 && iLastIndexOf > iIndexOf, "Invalid bracketed host/port: %s", str);
        String strSubstring = str.substring(1, iLastIndexOf);
        int i = iLastIndexOf + 1;
        if (i == str.length()) {
            return new String[]{strSubstring, ""};
        }
        c6i.j(str.charAt(i) == ':', "Only a colon may follow a close bracket: %s", str);
        int i2 = iLastIndexOf + 2;
        for (int i3 = i2; i3 < str.length(); i3++) {
            c6i.j(Character.isDigit(str.charAt(i3)), "Port must be numeric: %s", str);
        }
        return new String[]{strSubstring, str.substring(i2)};
    }

    private static boolean isValidPort(int i) {
        return i >= 0 && i <= 65535;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HostAndPort)) {
            return false;
        }
        HostAndPort hostAndPort = (HostAndPort) obj;
        return j4h.a(this.host, hostAndPort.host) && this.port == hostAndPort.port;
    }

    public String getHost() {
        return this.host;
    }

    public int getPort() {
        c6i.t(hasPort());
        return this.port;
    }

    public int getPortOrDefault(int i) {
        return hasPort() ? this.port : i;
    }

    public boolean hasPort() {
        return this.port >= 0;
    }

    public int hashCode() {
        return j4h.b(this.host, Integer.valueOf(this.port));
    }

    public HostAndPort requireBracketsForIPv6() {
        c6i.j(!this.hasBracketlessColons, "Possible bracketless IPv6 literal: %s", this.host);
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.host.length() + 8);
        if (this.host.indexOf(58) >= 0) {
            sb.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb.append(this.host);
            sb.append(AbstractJsonLexerKt.END_LIST);
        } else {
            sb.append(this.host);
        }
        if (hasPort()) {
            sb.append(AbstractJsonLexerKt.COLON);
            sb.append(this.port);
        }
        return sb.toString();
    }

    public HostAndPort withDefaultPort(int i) {
        c6i.d(isValidPort(i));
        return hasPort() ? this : new HostAndPort(this.host, i, this.hasBracketlessColons);
    }
}
