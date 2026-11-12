package com.google.common.net;

import am.j;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.CharMatcher;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.hash.Hashing;
import com.google.common.io.ByteStreams;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedBytes;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.nimbusds.jose.shaded.gson.internal.a;
import fb1.c;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@J2ktIncompatible
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public final class InetAddresses {
    private static final char IPV4_DELIMITER = '.';
    private static final int IPV4_PART_COUNT = 4;
    private static final char IPV6_DELIMITER = ':';
    private static final int IPV6_PART_COUNT = 8;
    private static final CharMatcher IPV4_DELIMITER_MATCHER = CharMatcher.is('.');
    private static final CharMatcher IPV6_DELIMITER_MATCHER = CharMatcher.is(':');
    private static final Inet4Address LOOPBACK4 = (Inet4Address) forString("127.0.0.1");
    private static final Inet4Address ANY4 = (Inet4Address) forString("0.0.0.0");

    public static final class Scope {
        private String scope;

        private Scope() {
        }
    }

    public static final class TeredoInfo {
        private final Inet4Address client;
        private final int flags;
        private final int port;
        private final Inet4Address server;

        public TeredoInfo(Inet4Address inet4Address, Inet4Address inet4Address2, int i14, int i15) {
            boolean z14 = false;
            Preconditions.checkArgument(i14 >= 0 && i14 <= 65535, "port '%s' is out of range (0 <= port <= 0xffff)", i14);
            if (i15 >= 0 && i15 <= 65535) {
                z14 = true;
            }
            Preconditions.checkArgument(z14, "flags '%s' is out of range (0 <= flags <= 0xffff)", i15);
            this.server = (Inet4Address) MoreObjects.firstNonNull(inet4Address, InetAddresses.ANY4);
            this.client = (Inet4Address) MoreObjects.firstNonNull(inet4Address2, InetAddresses.ANY4);
            this.port = i14;
            this.flags = i15;
        }

        public Inet4Address getClient() {
            return this.client;
        }

        public int getFlags() {
            return this.flags;
        }

        public int getPort() {
            return this.port;
        }

        public Inet4Address getServer() {
            return this.server;
        }
    }

    private InetAddresses() {
    }

    private static InetAddress bytesToInetAddress(byte[] bArr, String str) {
        try {
            InetAddress byAddress = InetAddress.getByAddress(bArr);
            if (str == null) {
                return byAddress;
            }
            Preconditions.checkArgument(byAddress instanceof Inet6Address, "Unexpected state, scope should only appear for ipv6");
            Inet6Address inet6Address = (Inet6Address) byAddress;
            int iTryParseDecimal = tryParseDecimal(str, 0, str.length());
            if (iTryParseDecimal != -1) {
                return Inet6Address.getByAddress(inet6Address.getHostAddress(), inet6Address.getAddress(), iTryParseDecimal);
            }
            try {
                NetworkInterface byName = NetworkInterface.getByName(str);
                if (byName != null) {
                    return Inet6Address.getByAddress(inet6Address.getHostAddress(), inet6Address.getAddress(), byName);
                }
                throw formatIllegalArgumentException("No such interface: '%s'", str);
            } catch (SocketException e4) {
                e = e4;
                throw new IllegalArgumentException("No such interface: ".concat(str), e);
            } catch (UnknownHostException e14) {
                e = e14;
                throw new IllegalArgumentException("No such interface: ".concat(str), e);
            }
        } catch (UnknownHostException e15) {
            h.q(e15);
            return null;
        }
    }

    public static int coerceToInteger(InetAddress inetAddress) {
        return ByteStreams.newDataInput(getCoercedIPv4Address(inetAddress).getAddress()).readInt();
    }

    private static void compressLongestRunOfZeroes(int[] iArr) {
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        for (int i17 = 0; i17 < iArr.length + 1; i17++) {
            if (i17 >= iArr.length || iArr[i17] != 0) {
                if (i16 >= 0) {
                    int i18 = i17 - i16;
                    if (i18 > i14) {
                        i15 = i16;
                        i14 = i18;
                    }
                    i16 = -1;
                }
            } else if (i16 < 0) {
                i16 = i17;
            }
        }
        if (i14 >= 2) {
            Arrays.fill(iArr, i15, i14 + i15, -1);
        }
    }

    private static String convertDottedQuadToHex(String str) {
        int iLastIndexOf = str.lastIndexOf(58) + 1;
        String strSubstring = str.substring(0, iLastIndexOf);
        byte[] bArrTextToNumericFormatV4 = textToNumericFormatV4(str.substring(iLastIndexOf));
        if (bArrTextToNumericFormatV4 == null) {
            return null;
        }
        return a.h(strSubstring, Integer.toHexString(((bArrTextToNumericFormatV4[0] & UnsignedBytes.MAX_VALUE) << 8) | (bArrTextToNumericFormatV4[1] & UnsignedBytes.MAX_VALUE)), ":", Integer.toHexString((bArrTextToNumericFormatV4[3] & UnsignedBytes.MAX_VALUE) | ((bArrTextToNumericFormatV4[2] & UnsignedBytes.MAX_VALUE) << 8)));
    }

    public static InetAddress decrement(InetAddress inetAddress) {
        byte[] address = inetAddress.getAddress();
        int length = address.length - 1;
        while (length >= 0 && address[length] == 0) {
            address[length] = -1;
            length--;
        }
        Preconditions.checkArgument(length >= 0, "Decrementing %s would wrap.", inetAddress);
        address[length] = (byte) (address[length] - 1);
        return bytesToInetAddress(address, null);
    }

    @CanIgnoreReturnValue
    public static InetAddress forString(String str) {
        Scope scope = new Scope();
        byte[] bArrIpStringToBytes = ipStringToBytes(str, scope);
        if (bArrIpStringToBytes != null) {
            return bytesToInetAddress(bArrIpStringToBytes, scope.scope);
        }
        throw formatIllegalArgumentException("'%s' is not an IP string literal.", str);
    }

    public static InetAddress forUriString(String str) {
        InetAddress inetAddressForUriStringOrNull = forUriStringOrNull(str, true);
        if (inetAddressForUriStringOrNull != null) {
            return inetAddressForUriStringOrNull;
        }
        throw formatIllegalArgumentException("Not a valid URI IP literal: '%s'", str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static InetAddress forUriStringOrNull(String str, boolean z14) {
        int i14;
        Preconditions.checkNotNull(str);
        if (str.startsWith("[") && str.endsWith("]")) {
            str = c.m(1, 1, str);
            i14 = 16;
        } else {
            i14 = 4;
        }
        Scope scope = z14 ? new Scope() : null;
        byte[] bArrIpStringToBytes = ipStringToBytes(str, scope);
        if (bArrIpStringToBytes == null || bArrIpStringToBytes.length != i14) {
            return null;
        }
        return bytesToInetAddress(bArrIpStringToBytes, scope != null ? scope.scope : null);
    }

    private static IllegalArgumentException formatIllegalArgumentException(String str, Object... objArr) {
        return new IllegalArgumentException(String.format(Locale.ROOT, str, objArr));
    }

    private static InetAddress fromBigInteger(BigInteger bigInteger, boolean z14) {
        Preconditions.checkArgument(bigInteger.signum() >= 0, "BigInteger must be greater than or equal to 0");
        int i14 = z14 ? 16 : 4;
        byte[] byteArray = bigInteger.toByteArray();
        byte[] bArr = new byte[i14];
        int iMax = Math.max(0, byteArray.length - i14);
        int length = byteArray.length - iMax;
        int i15 = i14 - length;
        for (int i16 = 0; i16 < iMax; i16++) {
            if (byteArray[i16] != 0) {
                throw formatIllegalArgumentException("BigInteger cannot be converted to InetAddress because it has more than %d bytes: %s", Integer.valueOf(i14), bigInteger);
            }
        }
        System.arraycopy(byteArray, iMax, bArr, i15, length);
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException e4) {
            h.q(e4);
            return null;
        }
    }

    public static Inet4Address fromIPv4BigInteger(BigInteger bigInteger) {
        return (Inet4Address) fromBigInteger(bigInteger, false);
    }

    public static Inet6Address fromIPv6BigInteger(BigInteger bigInteger) {
        return (Inet6Address) fromBigInteger(bigInteger, true);
    }

    public static Inet4Address fromInteger(int i14) {
        return getInet4Address(Ints.toByteArray(i14));
    }

    public static InetAddress fromLittleEndianByteArray(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i14 = 0; i14 < bArr.length; i14++) {
            bArr2[i14] = bArr[(bArr.length - i14) - 1];
        }
        return InetAddress.getByAddress(bArr2);
    }

    public static Inet4Address get6to4IPv4Address(Inet6Address inet6Address) {
        Preconditions.checkArgument(is6to4Address(inet6Address), "Address '%s' is not a 6to4 address.", toAddrString(inet6Address));
        return getInet4Address(Arrays.copyOfRange(inet6Address.getAddress(), 2, 6));
    }

    public static Inet4Address getCoercedIPv4Address(InetAddress inetAddress) {
        boolean z14;
        if (inetAddress instanceof Inet4Address) {
            return (Inet4Address) inetAddress;
        }
        byte[] address = inetAddress.getAddress();
        int i14 = 0;
        while (true) {
            if (i14 >= 15) {
                z14 = true;
                break;
            }
            if (address[i14] != 0) {
                z14 = false;
                break;
            }
            i14++;
        }
        if (z14 && address[15] == 1) {
            return LOOPBACK4;
        }
        if (z14 && address[15] == 0) {
            return ANY4;
        }
        Inet6Address inet6Address = (Inet6Address) inetAddress;
        int iAsInt = Hashing.murmur3_32_fixed().hashLong(hasEmbeddedIPv4ClientAddress(inet6Address) ? getEmbeddedIPv4ClientAddress(inet6Address).hashCode() : ByteBuffer.wrap(inet6Address.getAddress(), 0, 8).getLong()).asInt() | (-536870912);
        if (iAsInt == -1) {
            iAsInt = -2;
        }
        return getInet4Address(Ints.toByteArray(iAsInt));
    }

    public static Inet4Address getCompatIPv4Address(Inet6Address inet6Address) {
        Preconditions.checkArgument(isCompatIPv4Address(inet6Address), "Address '%s' is not IPv4-compatible.", toAddrString(inet6Address));
        return getInet4Address(Arrays.copyOfRange(inet6Address.getAddress(), 12, 16));
    }

    public static Inet4Address getEmbeddedIPv4ClientAddress(Inet6Address inet6Address) {
        if (isCompatIPv4Address(inet6Address)) {
            return getCompatIPv4Address(inet6Address);
        }
        if (is6to4Address(inet6Address)) {
            return get6to4IPv4Address(inet6Address);
        }
        if (isTeredoAddress(inet6Address)) {
            return getTeredoInfo(inet6Address).getClient();
        }
        throw formatIllegalArgumentException("'%s' has no embedded IPv4 address.", toAddrString(inet6Address));
    }

    private static Inet4Address getInet4Address(byte[] bArr) {
        Preconditions.checkArgument(bArr.length == 4, "Byte array has invalid length for an IPv4 address: %s != 4.", bArr.length);
        return (Inet4Address) bytesToInetAddress(bArr, null);
    }

    public static Inet4Address getIsatapIPv4Address(Inet6Address inet6Address) {
        Preconditions.checkArgument(isIsatapAddress(inet6Address), "Address '%s' is not an ISATAP address.", toAddrString(inet6Address));
        return getInet4Address(Arrays.copyOfRange(inet6Address.getAddress(), 12, 16));
    }

    public static TeredoInfo getTeredoInfo(Inet6Address inet6Address) {
        Preconditions.checkArgument(isTeredoAddress(inet6Address), "Address '%s' is not a Teredo address.", toAddrString(inet6Address));
        byte[] address = inet6Address.getAddress();
        Inet4Address inet4Address = getInet4Address(Arrays.copyOfRange(address, 4, 8));
        int i14 = ByteStreams.newDataInput(address, 8).readShort() & 65535;
        int i15 = 65535 & (~ByteStreams.newDataInput(address, 10).readShort());
        byte[] bArrCopyOfRange = Arrays.copyOfRange(address, 12, 16);
        for (int i16 = 0; i16 < bArrCopyOfRange.length; i16++) {
            bArrCopyOfRange[i16] = (byte) (~bArrCopyOfRange[i16]);
        }
        return new TeredoInfo(inet4Address, getInet4Address(bArrCopyOfRange), i15, i14);
    }

    public static boolean hasEmbeddedIPv4ClientAddress(Inet6Address inet6Address) {
        return isCompatIPv4Address(inet6Address) || is6to4Address(inet6Address) || isTeredoAddress(inet6Address);
    }

    private static String hextetsToIPv6String(int[] iArr) {
        StringBuilder sb3 = new StringBuilder(39);
        int i14 = 0;
        boolean z14 = false;
        while (i14 < iArr.length) {
            boolean z15 = iArr[i14] >= 0;
            if (z15) {
                if (z14) {
                    sb3.append(':');
                }
                sb3.append(Integer.toHexString(iArr[i14]));
            } else if (i14 == 0 || z14) {
                sb3.append("::");
            }
            i14++;
            z14 = z15;
        }
        return sb3.toString();
    }

    public static InetAddress increment(InetAddress inetAddress) {
        byte[] address = inetAddress.getAddress();
        int length = address.length - 1;
        while (true) {
            if (length < 0 || address[length] != -1) {
                break;
            }
            address[length] = 0;
            length--;
        }
        Preconditions.checkArgument(length >= 0, "Incrementing %s would wrap.", inetAddress);
        address[length] = (byte) (address[length] + 1);
        return bytesToInetAddress(address, null);
    }

    private static byte[] ipStringToBytes(String str, Scope scope) {
        int i14 = 0;
        boolean z14 = false;
        boolean z15 = false;
        while (true) {
            if (i14 >= str.length()) {
                i14 = -1;
                break;
            }
            char cCharAt = str.charAt(i14);
            if (cCharAt == '.') {
                z14 = true;
            } else if (cCharAt == ':') {
                if (z14) {
                    return null;
                }
                z15 = true;
            } else {
                if (cCharAt == '%') {
                    break;
                }
                if (Character.digit(cCharAt, 16) == -1) {
                    return null;
                }
            }
            i14++;
        }
        if (!z15) {
            if (z14 && i14 == -1) {
                return textToNumericFormatV4(str);
            }
            return null;
        }
        if (z14 && (str = convertDottedQuadToHex(str)) == null) {
            return null;
        }
        if (i14 != -1) {
            if (scope != null) {
                scope.scope = str.substring(i14 + 1);
            }
            str = str.substring(0, i14);
        }
        return textToNumericFormatV6(str);
    }

    public static boolean is6to4Address(Inet6Address inet6Address) {
        byte[] address = inet6Address.getAddress();
        return address[0] == 32 && address[1] == 2;
    }

    public static boolean isCompatIPv4Address(Inet6Address inet6Address) {
        byte b14;
        if (!inet6Address.isIPv4CompatibleAddress()) {
            return false;
        }
        byte[] address = inet6Address.getAddress();
        return (address[12] == 0 && address[13] == 0 && address[14] == 0 && ((b14 = address[15]) == 0 || b14 == 1)) ? false : true;
    }

    public static boolean isInetAddress(String str) {
        return ipStringToBytes(str, null) != null;
    }

    public static boolean isIsatapAddress(Inet6Address inet6Address) {
        if (isTeredoAddress(inet6Address)) {
            return false;
        }
        byte[] address = inet6Address.getAddress();
        return (address[8] | 3) == 3 && address[9] == 0 && address[10] == 94 && address[11] == -2;
    }

    public static boolean isMappedIPv4Address(String str) {
        byte[] bArrIpStringToBytes = ipStringToBytes(str, null);
        if (bArrIpStringToBytes == null || bArrIpStringToBytes.length != 16) {
            return false;
        }
        int i14 = 0;
        while (true) {
            if (i14 >= 10) {
                for (int i15 = 10; i15 < 12; i15++) {
                    if (bArrIpStringToBytes[i15] != -1) {
                        return false;
                    }
                }
                return true;
            }
            if (bArrIpStringToBytes[i14] != 0) {
                return false;
            }
            i14++;
        }
    }

    public static boolean isMaximum(InetAddress inetAddress) {
        for (byte b14 : inetAddress.getAddress()) {
            if (b14 != -1) {
                return false;
            }
        }
        return true;
    }

    public static boolean isTeredoAddress(Inet6Address inet6Address) {
        byte[] address = inet6Address.getAddress();
        return address[0] == 32 && address[1] == 1 && address[2] == 0 && address[3] == 0;
    }

    public static boolean isUriInetAddress(String str) {
        return forUriStringOrNull(str, false) != null;
    }

    private static short parseHextet(String str, int i14, int i15) {
        int i16 = i15 - i14;
        if (i16 <= 0 || i16 > 4) {
            throw new NumberFormatException();
        }
        int iDigit = 0;
        while (i14 < i15) {
            iDigit = (iDigit << 4) | Character.digit(str.charAt(i14), 16);
            i14++;
        }
        return (short) iDigit;
    }

    private static byte parseOctet(String str, int i14, int i15) {
        int i16 = i15 - i14;
        if (i16 <= 0 || i16 > 3) {
            throw new NumberFormatException();
        }
        if (i16 > 1 && str.charAt(i14) == '0') {
            throw new NumberFormatException();
        }
        int i17 = 0;
        while (i14 < i15) {
            int i18 = i17 * 10;
            int iDigit = Character.digit(str.charAt(i14), 10);
            if (iDigit < 0) {
                throw new NumberFormatException();
            }
            i17 = i18 + iDigit;
            i14++;
        }
        if (i17 <= 255) {
            return (byte) i17;
        }
        throw new NumberFormatException();
    }

    private static String scopeWithDelimiter(Inet6Address inet6Address) {
        NetworkInterface scopedInterface = inet6Address.getScopedInterface();
        if (scopedInterface == null) {
            int scopeId = inet6Address.getScopeId();
            return scopeId != 0 ? j.h(scopeId, "%") : "";
        }
        return "%" + scopedInterface.getName();
    }

    private static byte[] textToNumericFormatV4(String str) {
        if (IPV4_DELIMITER_MATCHER.countIn(str) + 1 != 4) {
            return null;
        }
        byte[] bArr = new byte[4];
        int i14 = 0;
        for (int i15 = 0; i15 < 4; i15++) {
            int iIndexOf = str.indexOf(46, i14);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            try {
                bArr[i15] = parseOctet(str, i14, iIndexOf);
                i14 = iIndexOf + 1;
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return bArr;
    }

    private static byte[] textToNumericFormatV6(String str) {
        int iCountIn = IPV6_DELIMITER_MATCHER.countIn(str);
        if (iCountIn >= 2 && iCountIn <= 8) {
            int i14 = 1;
            int i15 = iCountIn + 1;
            int i16 = 8 - i15;
            boolean z14 = false;
            for (int i17 = 0; i17 < str.length() - 1; i17++) {
                if (str.charAt(i17) == ':' && str.charAt(i17 + 1) == ':') {
                    if (z14) {
                        return null;
                    }
                    int i18 = i16 + 1;
                    if (i17 == 0) {
                        i18 = i16 + 2;
                    }
                    if (i17 == str.length() - 2) {
                        i18++;
                    }
                    i16 = i18;
                    z14 = true;
                }
            }
            if (str.charAt(0) == ':' && str.charAt(1) != ':') {
                return null;
            }
            if (str.charAt(str.length() - 1) == ':' && str.charAt(str.length() - 2) != ':') {
                return null;
            }
            if (z14 && i16 <= 0) {
                return null;
            }
            if (!z14 && i15 != 8) {
                return null;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            try {
                if (str.charAt(0) != ':') {
                    i14 = 0;
                }
                while (i14 < str.length()) {
                    int iIndexOf = str.indexOf(58, i14);
                    if (iIndexOf == -1) {
                        iIndexOf = str.length();
                    }
                    if (str.charAt(i14) == ':') {
                        for (int i19 = 0; i19 < i16; i19++) {
                            byteBufferAllocate.putShort((short) 0);
                        }
                    } else {
                        byteBufferAllocate.putShort(parseHextet(str, i14, iIndexOf));
                    }
                    i14 = iIndexOf + 1;
                }
                return byteBufferAllocate.array();
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public static String toAddrString(InetAddress inetAddress) {
        Preconditions.checkNotNull(inetAddress);
        if (inetAddress instanceof Inet4Address) {
            String hostAddress = inetAddress.getHostAddress();
            Objects.requireNonNull(hostAddress);
            return hostAddress;
        }
        byte[] address = inetAddress.getAddress();
        int[] iArr = new int[8];
        for (int i14 = 0; i14 < 8; i14++) {
            int i15 = i14 * 2;
            iArr[i14] = Ints.fromBytes((byte) 0, (byte) 0, address[i15], address[i15 + 1]);
        }
        compressLongestRunOfZeroes(iArr);
        return hextetsToIPv6String(iArr) + scopeWithDelimiter((Inet6Address) inetAddress);
    }

    public static BigInteger toBigInteger(InetAddress inetAddress) {
        return new BigInteger(1, inetAddress.getAddress());
    }

    public static String toUriString(InetAddress inetAddress) {
        if (!(inetAddress instanceof Inet6Address)) {
            return toAddrString(inetAddress);
        }
        return "[" + toAddrString(inetAddress) + "]";
    }

    private static int tryParseDecimal(String str, int i14, int i15) {
        int i16 = 0;
        while (i14 < i15) {
            if (i16 > 214748364) {
                return -1;
            }
            int i17 = i16 * 10;
            int iDigit = Character.digit(str.charAt(i14), 10);
            if (iDigit < 0) {
                return -1;
            }
            i16 = i17 + iDigit;
            i14++;
        }
        return i16;
    }
}
