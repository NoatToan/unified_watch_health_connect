package com.google.common.net;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@Immutable
@Beta
@GwtCompatible
public final class HostAndPort implements Serializable {
    private static final int d = -1;
    private static final long serialVersionUID = 0;
    private final String a;
    private final int b;
    private final boolean c;

    private HostAndPort(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }

    private static String[] a(String str) {
        Preconditions.checkArgument(str.charAt(0) == '[', "Bracketed host-port string must start with a bracket: %s", str);
        int iIndexOf = str.indexOf(58);
        int iLastIndexOf = str.lastIndexOf(93);
        Preconditions.checkArgument(iIndexOf > -1 && iLastIndexOf > iIndexOf, "Invalid bracketed host/port: %s", str);
        String strSubstring = str.substring(1, iLastIndexOf);
        int i = iLastIndexOf + 1;
        if (i == str.length()) {
            return new String[]{strSubstring, ""};
        }
        Preconditions.checkArgument(str.charAt(i) == ':', "Only a colon may follow a close bracket: %s", str);
        int i2 = iLastIndexOf + 2;
        for (int i3 = i2; i3 < str.length(); i3++) {
            Preconditions.checkArgument(Character.isDigit(str.charAt(i3)), "Port must be numeric: %s", str);
        }
        return new String[]{strSubstring, str.substring(i2)};
    }

    private static boolean b(int i) {
        return i >= 0 && i <= 65535;
    }

    public static HostAndPort fromHost(String str) {
        HostAndPort hostAndPortFromString = fromString(str);
        Preconditions.checkArgument(!hostAndPortFromString.hasPort(), "Host has a port: %s", str);
        return hostAndPortFromString;
    }

    public static HostAndPort fromParts(String str, int i) {
        Preconditions.checkArgument(b(i), "Port out of range: %s", i);
        HostAndPort hostAndPortFromString = fromString(str);
        Preconditions.checkArgument(!hostAndPortFromString.hasPort(), "Host has a port: %s", str);
        return new HostAndPort(hostAndPortFromString.a, i, hostAndPortFromString.c);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0030 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    public static HostAndPort fromString(String str) {
        String strSubstring;
        String strSubstring2;
        Preconditions.checkNotNull(str);
        int i = -1;
        boolean z = false;
        if (str.startsWith("[")) {
            String[] strArrA = a(str);
            strSubstring2 = strArrA[0];
            strSubstring = strArrA[1];
        } else {
            int iIndexOf = str.indexOf(58);
            if (iIndexOf >= 0) {
                int i2 = iIndexOf + 1;
                if (str.indexOf(58, i2) == -1) {
                    strSubstring2 = str.substring(0, iIndexOf);
                    strSubstring = str.substring(i2);
                } else {
                    z = iIndexOf >= 0;
                    strSubstring = null;
                    strSubstring2 = str;
                }
            } else {
                if (iIndexOf >= 0) {
                }
                strSubstring = null;
                strSubstring2 = str;
            }
        }
        if (!Strings.isNullOrEmpty(strSubstring)) {
            Preconditions.checkArgument(!strSubstring.startsWith("+"), "Unparseable port number: %s", str);
            try {
                i = Integer.parseInt(strSubstring);
                Preconditions.checkArgument(b(i), "Port number out of range: %s", str);
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException("Unparseable port number: " + str);
            }
        }
        return new HostAndPort(strSubstring2, i, z);
    }

    public boolean equals(@NullableDecl Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HostAndPort)) {
            return false;
        }
        HostAndPort hostAndPort = (HostAndPort) obj;
        return Objects.equal(this.a, hostAndPort.a) && this.b == hostAndPort.b;
    }

    public String getHost() {
        return this.a;
    }

    public int getPort() {
        Preconditions.checkState(hasPort());
        return this.b;
    }

    public int getPortOrDefault(int i) {
        return hasPort() ? this.b : i;
    }

    public boolean hasPort() {
        return this.b >= 0;
    }

    public int hashCode() {
        return Objects.hashCode(this.a, Integer.valueOf(this.b));
    }

    public HostAndPort requireBracketsForIPv6() {
        Preconditions.checkArgument(!this.c, "Possible bracketless IPv6 literal: %s", this.a);
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.a.length() + 8);
        if (this.a.indexOf(58) >= 0) {
            sb.append(JsonLexerKt.BEGIN_LIST);
            sb.append(this.a);
            sb.append(JsonLexerKt.END_LIST);
        } else {
            sb.append(this.a);
        }
        if (hasPort()) {
            sb.append(JsonLexerKt.COLON);
            sb.append(this.b);
        }
        return sb.toString();
    }

    public HostAndPort withDefaultPort(int i) {
        Preconditions.checkArgument(b(i));
        return hasPort() ? this : new HostAndPort(this.a, i, this.c);
    }
}
