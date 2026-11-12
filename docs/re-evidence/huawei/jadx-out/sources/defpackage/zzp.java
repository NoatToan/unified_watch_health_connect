package defpackage;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.util.regex.Pattern;
import org.eclipse.californium.elements.util.StandardCharsets;

/* JADX INFO: loaded from: classes20.dex */
public class zzp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f54829a;
    public static final boolean d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f54831c = Pattern.compile("^(([a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9\\-]*[a-zA-Z0-9])\\.)*([A-Za-z0-9]|[A-Za-z0-9][A-Za-z0-9\\-]*[A-Za-z0-9])$");
    private static final Pattern j = Pattern.compile("^(\\[[0-9a-fA-F:]+(%\\w+)?\\]|[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3})$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f54830b = System.getProperty("line.separator");
    private static final char[] e = "0123456789ABCDEF".toCharArray();
    private static final String[] i = new String[10];

    /* JADX WARN: Code duplicated, block: B:13:0x0069  */
    static {
        String implementationVersion;
        String str = "";
        boolean z = false;
        int i2 = 0;
        while (true) {
            String[] strArr = i;
            if (i2 < strArr.length) {
                strArr[i2] = str;
                str = str + "\t";
                i2++;
            } else {
                try {
                    break;
                } catch (NoSuchMethodException unused) {
                }
            }
        }
        if (InetSocketAddress.class.getMethod("getHostString", new Class[0]) != null) {
            z = true;
        }
        d = z;
        Package r0 = zzp.class.getPackage();
        if (r0 != null) {
            implementationVersion = r0.getImplementationVersion();
            if ("0.0".equals(implementationVersion)) {
                implementationVersion = null;
            }
        } else {
            implementationVersion = null;
        }
        f54829a = implementationVersion;
    }

    public static String a(InetSocketAddress inetSocketAddress) {
        if (d) {
            return inetSocketAddress.getHostString();
        }
        InetAddress address = inetSocketAddress.getAddress();
        if (address != null) {
            String string = address.toString();
            if (string.startsWith("/")) {
                return string.substring(1);
            }
            return address.getHostName();
        }
        return inetSocketAddress.getHostName();
    }

    public static String d(int i2) {
        if (i2 < 0) {
            return "";
        }
        String[] strArr = i;
        if (i2 >= strArr.length) {
            return strArr[strArr.length - 1];
        }
        return strArr[i2];
    }

    public static String c() {
        return f54830b;
    }

    public static byte[] d(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if ((length & 1) != 0) {
            throw new IllegalArgumentException("'" + str + "' has odd length!");
        }
        int i2 = length / 2;
        byte[] bArr = new byte[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int iDigit = Character.digit(str.charAt(i3), 16);
            if (iDigit < 0) {
                throw new IllegalArgumentException("'" + str + "' digit " + i3 + " is not hexadecimal!");
            }
            bArr[i4] = (byte) (iDigit << 4);
            int i5 = i3 + 1;
            int iDigit2 = Character.digit(str.charAt(i5), 16);
            if (iDigit2 < 0) {
                throw new IllegalArgumentException("'" + str + "' digit " + i5 + " is not hexadecimal!");
            }
            bArr[i4] = (byte) (bArr[i4] | ((byte) iDigit2));
            i3 += 2;
        }
        return bArr;
    }

    public static String b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return "";
        }
        return a(bArr, (char) 0, 0);
    }

    public static String e(byte[] bArr) {
        return a(bArr, (char) 0, 0);
    }

    public static String a(byte[] bArr, char c2, int i2) {
        if (bArr != null && bArr.length != 0) {
            if (i2 == 0 || i2 > bArr.length) {
                i2 = bArr.length;
            }
            StringBuilder sb = new StringBuilder((c2 == 0 ? 2 : 3) * i2);
            for (int i3 = 0; i3 < i2; i3++) {
                byte b2 = bArr[i3];
                char[] cArr = e;
                sb.append(cArr[(b2 & 255) >>> 4]);
                sb.append(cArr[b2 & 15]);
                if (c2 != 0 && i3 < i2 - 1) {
                    sb.append(c2);
                }
            }
            return sb.toString();
        }
        return "--";
    }

    public static String d(String str, int i2) {
        return (str == null || i2 <= 0 || i2 >= str.length()) ? str : str.substring(0, i2);
    }

    public static String d(byte[] bArr, int i2) {
        if (bArr == null) {
            return "<no data>";
        }
        if (bArr.length == 0) {
            return "<empty data>";
        }
        if (bArr.length < i2) {
            i2 = bArr.length;
        }
        int length = bArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                CharsetDecoder charsetDecoderNewDecoder = StandardCharsets.UTF_8.newDecoder();
                charsetDecoderNewDecoder.onMalformedInput(CodingErrorAction.REPORT);
                charsetDecoderNewDecoder.onUnmappableCharacter(CodingErrorAction.REPORT);
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                CharBuffer charBufferAllocate = CharBuffer.allocate(i2);
                CoderResult coderResultDecode = charsetDecoderNewDecoder.decode(byteBufferWrap, charBufferAllocate, true);
                charsetDecoderNewDecoder.flush(charBufferAllocate);
                charBufferAllocate.flip();
                if (CoderResult.OVERFLOW == coderResultDecode) {
                    return "\"" + ((Object) charBufferAllocate) + "\".. " + bArr.length + " bytes";
                }
                if (coderResultDecode.isError()) {
                    break;
                }
                return "\"" + ((Object) charBufferAllocate) + "\"";
            }
            byte b2 = bArr[i3];
            if (32 > b2 && b2 != 9 && b2 != 10 && b2 != 13) {
                break;
            }
            i3++;
        }
        String strA = a(bArr, ' ', i2);
        if (bArr.length <= i2) {
            return strA;
        }
        return strA + ".." + bArr.length + " bytes";
    }

    public static String d(InetAddress inetAddress) {
        if (inetAddress == null) {
            return null;
        }
        return inetAddress.getHostAddress();
    }

    public static String c(InetSocketAddress inetSocketAddress) {
        String strD;
        if (inetSocketAddress == null) {
            return null;
        }
        if (d) {
            strD = a(inetSocketAddress);
        } else {
            InetAddress address = inetSocketAddress.getAddress();
            if (address != null) {
                strD = d(address);
            } else {
                strD = "<unresolved>";
            }
        }
        if (inetSocketAddress.getAddress() instanceof Inet6Address) {
            return "[" + strD + "]:" + inetSocketAddress.getPort();
        }
        return strD + ":" + inetSocketAddress.getPort();
    }

    public static String b(SocketAddress socketAddress) {
        if (socketAddress == null) {
            return null;
        }
        if (socketAddress instanceof InetSocketAddress) {
            return c((InetSocketAddress) socketAddress);
        }
        return socketAddress.toString();
    }

    public static String b(InetSocketAddress inetSocketAddress) {
        if (inetSocketAddress == null) {
            return null;
        }
        InetAddress address = inetSocketAddress.getAddress();
        if (address != null && address.isAnyLocalAddress()) {
            return "port " + inetSocketAddress.getPort();
        }
        String str = "";
        String strA = d ? a(inetSocketAddress) : "";
        String strD = address != null ? d(address) : "<unresolved>";
        if (!strA.equals(strD)) {
            str = strA + "/";
        }
        if (inetSocketAddress.getAddress() instanceof Inet6Address) {
            return str + "[" + strD + "]:" + inetSocketAddress.getPort();
        }
        return str + strD + ":" + inetSocketAddress.getPort();
    }

    public static Object e(final SocketAddress socketAddress) {
        if (socketAddress == null) {
            return null;
        }
        return new Object() { // from class: zzp.4
            public String toString() {
                SocketAddress socketAddress2 = socketAddress;
                if (socketAddress2 instanceof InetSocketAddress) {
                    return zzp.b((InetSocketAddress) socketAddress2);
                }
                return socketAddress2.toString();
            }
        };
    }

    public static boolean a(String str) {
        if (str == null) {
            return false;
        }
        return f54831c.matcher(str).matches();
    }

    public static boolean c(String str) {
        if (str == null) {
            return false;
        }
        return j.matcher(str).matches();
    }

    public static String e(InetAddress inetAddress) throws URISyntaxException {
        int iIndexOf;
        int i2;
        if (inetAddress == null) {
            throw new NullPointerException("address must not be null!");
        }
        String hostAddress = inetAddress.getHostAddress();
        if (inetAddress instanceof Inet6Address) {
            Inet6Address inet6Address = (Inet6Address) inetAddress;
            if ((inet6Address.getScopedInterface() != null || inet6Address.getScopeId() > 0) && (iIndexOf = hostAddress.indexOf(37)) > 0 && (i2 = iIndexOf + 1) < hostAddress.length()) {
                String strSubstring = hostAddress.substring(i2);
                String strSubstring2 = hostAddress.substring(0, iIndexOf);
                String str = strSubstring2 + "%25" + strSubstring;
                try {
                    new URI(null, null, str, -1, null, null, null);
                    return str;
                } catch (URISyntaxException e2) {
                    String strReplaceAll = strSubstring.replaceAll("[-._~]", "");
                    if (!strReplaceAll.isEmpty()) {
                        strSubstring2 = strSubstring2 + "%25" + strReplaceAll;
                        try {
                            new URI(null, null, strSubstring2, -1, null, null, null);
                        } catch (URISyntaxException unused) {
                            throw e2;
                        }
                    }
                    return strSubstring2;
                }
            }
        }
        return hostAddress;
    }

    public static String j(String str) {
        if (str == null) {
            return "";
        }
        if (str.isEmpty() || str.endsWith(" ")) {
            return str;
        }
        return str + " ";
    }

    public static String e(Certificate certificate) {
        String[] strArrSplit = certificate.toString().split("\n");
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        for (String str : strArrSplit) {
            String strTrim = str.trim();
            if (!strTrim.isEmpty()) {
                int iG = g(strTrim);
                if (iG < 0 && strTrim.length() == 1) {
                    i2 += iG;
                    iG = 0;
                }
                sb.append(d(i2));
                sb.append(strTrim);
                sb.append("\n");
                i2 += iG;
            } else {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    private static int g(String str) {
        int length = str.length();
        int i2 = 0;
        while (length > 0) {
            length--;
            char cCharAt = str.charAt(length);
            if (cCharAt == '[') {
                i2++;
            } else if (cCharAt == ']') {
                i2--;
            }
        }
        if (i2 == 0 || !str.matches("\\d+:\\s+.*")) {
            return i2;
        }
        return 0;
    }

    public static String b(PublicKey publicKey) {
        return publicKey.toString().replaceAll("\n\\s+", "\n");
    }

    public static boolean a(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public static String b(String str) {
        String property;
        String str2 = System.getenv(str);
        return ((str2 == null || str2.isEmpty()) && (property = System.getProperty(str)) != null) ? property : str2;
    }

    public static Boolean e(String str) {
        String strB = b(str);
        if (strB == null || strB.isEmpty()) {
            return null;
        }
        return Boolean.valueOf(strB);
    }
}
