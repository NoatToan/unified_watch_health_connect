package io.netty.util;

import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.StringUtil;
import io.netty.util.internal.SystemPropertyUtil;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* JADX INFO: loaded from: classes22.dex */
public final class NetUtil {
    private static final int IPV4_MAX_CHAR_BETWEEN_SEPARATOR = 3;
    private static final boolean IPV4_PREFERRED;
    private static final int IPV4_SEPARATORS = 3;
    private static final boolean IPV6_ADDRESSES_PREFERRED;
    private static final int IPV6_BYTE_COUNT = 16;
    private static final int IPV6_MAX_CHAR_BETWEEN_SEPARATOR = 4;
    private static final int IPV6_MAX_CHAR_COUNT = 39;
    private static final int IPV6_MAX_SEPARATORS = 8;
    private static final int IPV6_MIN_SEPARATORS = 2;
    private static final int IPV6_WORD_COUNT = 8;
    public static final InetAddress LOCALHOST;
    public static final Inet4Address LOCALHOST4;
    public static final Inet6Address LOCALHOST6;
    public static final NetworkInterface LOOPBACK_IF;
    public static final int SOMAXCONN;
    private static final InternalLogger logger;

    static {
        boolean z = SystemPropertyUtil.getBoolean("java.net.preferIPv4Stack", false);
        IPV4_PREFERRED = z;
        boolean z2 = SystemPropertyUtil.getBoolean("java.net.preferIPv6Addresses", false);
        IPV6_ADDRESSES_PREFERRED = z2;
        InternalLogger internalLoggerFactory = InternalLoggerFactory.getInstance((Class<?>) NetUtil.class);
        logger = internalLoggerFactory;
        internalLoggerFactory.debug("-Djava.net.preferIPv4Stack: {}", Boolean.valueOf(z));
        internalLoggerFactory.debug("-Djava.net.preferIPv6Addresses: {}", Boolean.valueOf(z2));
        Inet4Address inet4AddressCreateLocalhost4 = NetUtilInitializations.createLocalhost4();
        LOCALHOST4 = inet4AddressCreateLocalhost4;
        Inet6Address inet6AddressCreateLocalhost6 = NetUtilInitializations.createLocalhost6();
        LOCALHOST6 = inet6AddressCreateLocalhost6;
        NetUtilInitializations.NetworkIfaceAndInetAddress networkIfaceAndInetAddressDetermineLoopback = NetUtilInitializations.determineLoopback(inet4AddressCreateLocalhost4, inet6AddressCreateLocalhost6);
        LOOPBACK_IF = networkIfaceAndInetAddressDetermineLoopback.iface();
        LOCALHOST = networkIfaceAndInetAddressDetermineLoopback.address();
        SOMAXCONN = ((Integer) AccessController.doPrivileged(new PrivilegedAction<Integer>() { // from class: io.netty.util.NetUtil.1
            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Code duplicated, block: B:53:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // java.security.PrivilegedAction
            public Integer run() throws Throwable {
                BufferedReader bufferedReader;
                Exception e;
                Integer numSysctlGetInt;
                int iIntValue = PlatformDependent.isWindows() ? 200 : 128;
                File file = new File("/proc/sys/net/core/somaxconn");
                BufferedReader bufferedReader2 = null;
                try {
                    try {
                        if (file.exists()) {
                            bufferedReader = new BufferedReader(new FileReader(file));
                            try {
                                try {
                                    iIntValue = Integer.parseInt(bufferedReader.readLine());
                                    if (NetUtil.logger.isDebugEnabled()) {
                                        NetUtil.logger.debug("{}: {}", file, Integer.valueOf(iIntValue));
                                    }
                                    bufferedReader2 = bufferedReader;
                                } catch (Exception e2) {
                                    e = e2;
                                    if (NetUtil.logger.isDebugEnabled()) {
                                        NetUtil.logger.debug("Failed to get SOMAXCONN from sysctl and file {}. Default: {}", file, Integer.valueOf(iIntValue), e);
                                    }
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                    }
                                    return Integer.valueOf(iIntValue);
                                }
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader;
                                if (bufferedReader2 != null) {
                                    try {
                                        bufferedReader2.close();
                                    } catch (Exception unused) {
                                    }
                                }
                                throw th;
                            }
                        } else {
                            if (SystemPropertyUtil.getBoolean("io.netty.net.somaxconn.trySysctl", false)) {
                                numSysctlGetInt = NetUtil.sysctlGetInt("kern.ipc.somaxconn");
                                if (numSysctlGetInt == null) {
                                    numSysctlGetInt = NetUtil.sysctlGetInt("kern.ipc.soacceptqueue");
                                    if (numSysctlGetInt != null) {
                                        iIntValue = numSysctlGetInt.intValue();
                                    }
                                } else {
                                    iIntValue = numSysctlGetInt.intValue();
                                }
                            } else {
                                numSysctlGetInt = null;
                            }
                            if (numSysctlGetInt == null) {
                                NetUtil.logger.debug("Failed to get SOMAXCONN from sysctl and file {}. Default: {}", file, Integer.valueOf(iIntValue));
                            }
                        }
                        if (bufferedReader2 != null) {
                            bufferedReader2.close();
                        }
                    } catch (Exception unused2) {
                    }
                } catch (Exception e3) {
                    bufferedReader = null;
                    e = e3;
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedReader2 != null) {
                        bufferedReader2.close();
                    }
                    throw th;
                }
                return Integer.valueOf(iIntValue);
            }
        })).intValue();
    }

    private NetUtil() {
    }

    public static String bytesToIpAddress(byte[] bArr) {
        return bytesToIpAddress(bArr, 0, bArr.length);
    }

    public static byte[] createByteArrayFromIpAddressString(String str) {
        if (isValidIpV4Address(str)) {
            return validIpV4ToBytes(str);
        }
        if (!isValidIpV6Address(str)) {
            return null;
        }
        if (str.charAt(0) == '[') {
            str = str.substring(1, str.length() - 1);
        }
        int iIndexOf = str.indexOf(37);
        if (iIndexOf >= 0) {
            str = str.substring(0, iIndexOf);
        }
        return getIPv6ByName(str, true);
    }

    private static int decimalDigit(String str, int i) {
        return str.charAt(i) - '0';
    }

    public static Inet6Address getByName(CharSequence charSequence) {
        return getByName(charSequence, true);
    }

    public static String getHostname(InetSocketAddress inetSocketAddress) {
        return PlatformDependent.javaVersion() >= 7 ? inetSocketAddress.getHostString() : inetSocketAddress.getHostName();
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0189  */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0199, code lost:
    
        if (r7 <= 2) goto L127;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static byte[] getIPv6ByName(CharSequence charSequence, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        byte[] bArr = new byte[16];
        int length = charSequence.length();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int iDecodeHexNibble = 0;
        boolean z2 = false;
        while (i8 < length) {
            char cCharAt = charSequence.charAt(i8);
            if (cCharAt == '.') {
                i10++;
                int i15 = i8 - i11;
                if (i15 <= 3 && i11 >= 0 && i10 <= 3 && ((i12 <= 0 || i13 + i14 >= 12) && i8 + 1 < length && i13 < 16 && (i10 != 1 || (z && ((i13 == 0 || isValidIPv4Mapped(bArr, i13, i9, i14)) && ((i15 != 3 || (isValidNumericChar(charSequence.charAt(i8 - 1)) && isValidNumericChar(charSequence.charAt(i8 - 2)) && isValidNumericChar(charSequence.charAt(i8 - 3)))) && ((i15 != 2 || (isValidNumericChar(charSequence.charAt(i8 - 1)) && isValidNumericChar(charSequence.charAt(i8 - 2)))) && (i15 != 1 || isValidNumericChar(charSequence.charAt(i8 - 1)))))))))) {
                    int i16 = iDecodeHexNibble << ((3 - i15) << 2);
                    int i17 = ((i16 & 15) * 100) + (((i16 >> 4) & 15) * 10) + ((i16 >> 8) & 15);
                    if (i17 >= 0 && i17 <= 255) {
                        bArr[i13] = (byte) i17;
                        i13++;
                    }
                }
                return null;
            }
            if (cCharAt == ':') {
                i12++;
                int i18 = i8 - i11;
                if (i18 > 4 || i10 > 0 || i12 > 8 || (i7 = i13 + 1) >= 16) {
                    return null;
                }
                int i19 = iDecodeHexNibble << ((4 - i18) << 2);
                if (i14 > 0) {
                    i14 -= 2;
                }
                bArr[i13] = (byte) (((i19 & 15) << 4) | ((i19 >> 4) & 15));
                i13 = i7 + 1;
                bArr[i7] = (byte) ((((i19 >> 8) & 15) << 4) | ((i19 >> 12) & 15));
                int i20 = i8 + 1;
                if (i20 < length && charSequence.charAt(i20) == ':') {
                    int i21 = i20 + 1;
                    if (i9 != 0 || (i21 < length && charSequence.charAt(i21) == ':')) {
                        return null;
                    }
                    i12++;
                    z2 = i12 == 2 && i19 == 0;
                    i14 = (16 - i13) - 2;
                    i9 = i13;
                    i8 = i20;
                }
            } else {
                if (!isValidHexChar(cCharAt) || (i10 > 0 && !isValidNumericChar(cCharAt))) {
                    return null;
                }
                if (i11 < 0) {
                    i11 = i8;
                } else if (i8 - i11 > 4) {
                    return null;
                }
                iDecodeHexNibble += StringUtil.decodeHexNibble(cCharAt) << ((i8 - i11) << 2);
                i6 = 1;
            }
            i8 += i6;
            i6 = 1;
            i11 = -1;
            iDecodeHexNibble = 0;
            i8 += i6;
        }
        boolean z3 = i9 > 0;
        if (i10 > 0) {
            if (i11 > 0) {
                i4 = 3;
                if (i8 - i11 <= 3) {
                }
                return null;
            }
            i4 = 3;
            if (i10 == i4 && i13 < 16) {
                if (i12 == 0) {
                    i14 = 12;
                } else if (i12 >= 2) {
                    if (z3 || i12 != 6) {
                        i5 = 0;
                    } else {
                        i5 = 0;
                        if (charSequence.charAt(0) != ':') {
                            i14 -= 2;
                        }
                    }
                    if (z3 && i12 < 8) {
                        if (charSequence.charAt(i5) == ':') {
                        }
                        i14 -= 2;
                    }
                }
                int i22 = iDecodeHexNibble << ((3 - (i8 - i11)) << 2);
                int i23 = ((i22 & 15) * 100) + (((i22 >> 4) & 15) * 10) + ((i22 >> 8) & 15);
                if (i23 >= 0 && i23 <= 255) {
                    i3 = i13 + 1;
                    bArr[i13] = (byte) i23;
                }
            }
            return null;
        }
        int i24 = length - 1;
        if ((i11 > 0 && i8 - i11 > 4) || i12 < 2 || ((!z3 && (i12 + 1 != 8 || charSequence.charAt(0) == ':' || charSequence.charAt(i24) == ':')) || ((z3 && (i12 > 8 || (i12 == 8 && ((i9 <= 2 && charSequence.charAt(0) != ':') || (i9 >= 14 && charSequence.charAt(i24) != ':'))))) || (i = i13 + 1) >= 16 || ((i11 < 0 && charSequence.charAt(i24 - 1) != ':') || (i9 > 2 && charSequence.charAt(0) == ':'))))) {
            return null;
        }
        if (i11 >= 0) {
            int i25 = i8 - i11;
            i2 = 4;
            if (i25 <= 4) {
                iDecodeHexNibble <<= (4 - i25) << 2;
            }
        } else {
            i2 = 4;
        }
        bArr[i13] = (byte) (((iDecodeHexNibble >> 4) & 15) | ((iDecodeHexNibble & 15) << i2));
        i3 = i + 1;
        bArr[i] = (byte) ((((iDecodeHexNibble >> 8) & 15) << 4) | ((iDecodeHexNibble >> 12) & 15));
        int i26 = i3 + i14;
        if (!z2 && i26 < 16) {
            for (int i27 = 0; i27 < i14; i27++) {
                int i28 = i27 + i9;
                int i29 = i28 + i14;
                if (i29 >= 16) {
                    break;
                }
                bArr[i29] = bArr[i28];
                bArr[i28] = 0;
            }
        } else {
            if (i26 >= 16) {
                i9++;
            }
            while (i3 < 16) {
                int i30 = 15;
                while (i30 >= i9) {
                    bArr[i30] = bArr[i30 - 1];
                    i30--;
                }
                bArr[i30] = 0;
                i9++;
                i3++;
            }
        }
        if (i10 > 0) {
            bArr[11] = -1;
            bArr[10] = -1;
        }
        return bArr;
    }

    private static boolean inRangeEndExclusive(int i, int i2, int i3) {
        return i >= i2 && i < i3;
    }

    public static String intToIpAddress(int i) {
        StringBuilder sb = new StringBuilder(15);
        sb.append((i >> 24) & 255);
        sb.append('.');
        sb.append((i >> 16) & 255);
        sb.append('.');
        sb.append((i >> 8) & 255);
        sb.append('.');
        sb.append(i & 255);
        return sb.toString();
    }

    public static int ipv4AddressToInt(Inet4Address inet4Address) {
        byte[] address = inet4Address.getAddress();
        return (address[3] & 255) | ((address[0] & 255) << 24) | ((address[1] & 255) << 16) | ((address[2] & 255) << 8);
    }

    private static byte ipv4WordToByte(String str, int i, int i2) {
        int iDecimalDigit = decimalDigit(str, i);
        int i3 = i + 1;
        if (i3 == i2) {
            return (byte) iDecimalDigit;
        }
        int iDecimalDigit2 = (iDecimalDigit * 10) + decimalDigit(str, i3);
        int i4 = i3 + 1;
        return i4 == i2 ? (byte) iDecimalDigit2 : (byte) ((iDecimalDigit2 * 10) + decimalDigit(str, i4));
    }

    public static boolean isIpV4StackPreferred() {
        return IPV4_PREFERRED;
    }

    public static boolean isIpV6AddressesPreferred() {
        return IPV6_ADDRESSES_PREFERRED;
    }

    private static boolean isValidHexChar(char c) {
        return (c >= '0' && c <= '9') || (c >= 'A' && c <= 'F') || (c >= 'a' && c <= 'f');
    }

    private static boolean isValidIPv4Mapped(byte[] bArr, int i, int i2, int i3) {
        boolean z = i3 + i2 >= 14;
        return i <= 12 && i >= 2 && (!z || i2 < 12) && isValidIPv4MappedSeparators(bArr[i + (-1)], bArr[i + (-2)], z) && PlatformDependent.isZero(bArr, 0, i + (-3));
    }

    private static boolean isValidIPv4MappedChar(char c) {
        return c == 'f' || c == 'F';
    }

    private static boolean isValidIPv4MappedSeparators(byte b, byte b2, boolean z) {
        return b == b2 && (b == 0 || (!z && b2 == -1));
    }

    public static boolean isValidIpV4Address(CharSequence charSequence) {
        return isValidIpV4Address(charSequence, 0, charSequence.length());
    }

    private static boolean isValidIpV4Address0(CharSequence charSequence, int i, int i2) {
        int iIndexOf;
        int i3;
        int iIndexOf2;
        int i4;
        int iIndexOf3;
        int i5 = i2 - i;
        return i5 <= 15 && i5 >= 7 && (iIndexOf = AsciiString.indexOf(charSequence, '.', i + 1)) > 0 && isValidIpV4Word(charSequence, i, iIndexOf) && (iIndexOf2 = AsciiString.indexOf(charSequence, '.', (i3 = iIndexOf + 2))) > 0 && isValidIpV4Word(charSequence, i3 - 1, iIndexOf2) && (iIndexOf3 = AsciiString.indexOf(charSequence, '.', (i4 = iIndexOf2 + 2))) > 0 && isValidIpV4Word(charSequence, i4 - 1, iIndexOf3) && isValidIpV4Word(charSequence, iIndexOf3 + 1, i2);
    }

    private static boolean isValidIpV4Word(CharSequence charSequence, int i, int i2) {
        char cCharAt;
        char cCharAt2;
        int i3 = i2 - i;
        if (i3 < 1 || i3 > 3 || (cCharAt = charSequence.charAt(i)) < '0') {
            return false;
        }
        if (i3 != 3) {
            if (cCharAt <= '9') {
                return i3 == 1 || isValidNumericChar(charSequence.charAt(i + 1));
            }
            return false;
        }
        char cCharAt3 = charSequence.charAt(i + 1);
        if (cCharAt3 < '0' || (cCharAt2 = charSequence.charAt(i + 2)) < '0') {
            return false;
        }
        if (cCharAt > '1' || cCharAt3 > '9' || cCharAt2 > '9') {
            if (cCharAt != '2' || cCharAt3 > '5') {
                return false;
            }
            if (cCharAt2 > '5' && (cCharAt3 >= '5' || cCharAt2 > '9')) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValidIpV6Address(String str) {
        return isValidIpV6Address((CharSequence) str);
    }

    private static boolean isValidNumericChar(char c) {
        return c >= '0' && c <= '9';
    }

    private static StringBuilder newSocketAddressStringBuilder(String str, String str2, boolean z) {
        int length = str.length();
        if (z) {
            StringBuilder sb = new StringBuilder(length + 1 + str2.length());
            sb.append(str);
            return sb;
        }
        StringBuilder sb2 = new StringBuilder(length + 3 + str2.length());
        if (length > 1 && str.charAt(0) == '[' && str.charAt(length - 1) == ']') {
            sb2.append(str);
            return sb2;
        }
        sb2.append(JsonLexerKt.BEGIN_LIST);
        sb2.append(str);
        sb2.append(JsonLexerKt.END_LIST);
        return sb2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Integer sysctlGetInt(String str) throws IOException {
        Process processStart = new ProcessBuilder("sysctl", str).start();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processStart.getInputStream()));
            try {
                String line = bufferedReader.readLine();
                if (line != null && line.startsWith(str)) {
                    for (int length = line.length() - 1; length > str.length(); length--) {
                        if (!Character.isDigit(line.charAt(length))) {
                            Integer numValueOf = Integer.valueOf(line.substring(length + 1));
                            bufferedReader.close();
                            processStart.destroy();
                            return numValueOf;
                        }
                    }
                }
                bufferedReader.close();
                processStart.destroy();
                return null;
            } catch (Throwable th) {
                bufferedReader.close();
                throw th;
            }
        } catch (Throwable th2) {
            if (processStart != null) {
                processStart.destroy();
            }
            throw th2;
        }
    }

    public static String toAddressString(InetAddress inetAddress) {
        return toAddressString(inetAddress, false);
    }

    public static String toSocketAddressString(InetSocketAddress inetSocketAddress) {
        StringBuilder sbNewSocketAddressStringBuilder;
        String strValueOf = String.valueOf(inetSocketAddress.getPort());
        if (inetSocketAddress.isUnresolved()) {
            String hostname = getHostname(inetSocketAddress);
            sbNewSocketAddressStringBuilder = newSocketAddressStringBuilder(hostname, strValueOf, !isValidIpV6Address(hostname));
        } else {
            InetAddress address = inetSocketAddress.getAddress();
            sbNewSocketAddressStringBuilder = newSocketAddressStringBuilder(toAddressString(address), strValueOf, address instanceof Inet4Address);
        }
        sbNewSocketAddressStringBuilder.append(JsonLexerKt.COLON);
        sbNewSocketAddressStringBuilder.append(strValueOf);
        return sbNewSocketAddressStringBuilder.toString();
    }

    public static byte[] validIpV4ToBytes(String str) {
        int iIndexOf = str.indexOf(46, 1);
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(46, iIndexOf + 2);
        int iIndexOf3 = str.indexOf(46, iIndexOf2 + 2);
        return new byte[]{ipv4WordToByte(str, 0, iIndexOf), ipv4WordToByte(str, i, iIndexOf2), ipv4WordToByte(str, iIndexOf2 + 1, iIndexOf3), ipv4WordToByte(str, iIndexOf3 + 1, str.length())};
    }

    public static String bytesToIpAddress(byte[] bArr, int i, int i2) {
        if (i2 != 4) {
            if (i2 == 16) {
                return toAddressString(bArr, i, false);
            }
            throw new IllegalArgumentException("length: " + i2 + " (expected: 4 or 16)");
        }
        StringBuilder sb = new StringBuilder(15);
        sb.append(bArr[i] & 255);
        sb.append('.');
        sb.append(bArr[i + 1] & 255);
        sb.append('.');
        sb.append(bArr[i + 2] & 255);
        sb.append('.');
        sb.append(bArr[i + 3] & 255);
        return sb.toString();
    }

    public static Inet6Address getByName(CharSequence charSequence, boolean z) {
        byte[] iPv6ByName = getIPv6ByName(charSequence, z);
        if (iPv6ByName == null) {
            return null;
        }
        try {
            return Inet6Address.getByAddress((String) null, iPv6ByName, -1);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean isValidIpV4Address(String str) {
        return isValidIpV4Address(str, 0, str.length());
    }

    public static boolean isValidIpV6Address(CharSequence charSequence) {
        int i;
        int i2;
        int length = charSequence.length();
        int i3 = 2;
        if (length < 2) {
            return false;
        }
        char cCharAt = charSequence.charAt(0);
        if (cCharAt == '[') {
            length--;
            if (charSequence.charAt(length) != ']') {
                return false;
            }
            cCharAt = charSequence.charAt(1);
            i = 1;
        } else {
            i = 0;
        }
        if (cCharAt != ':') {
            i3 = 0;
            i2 = -1;
        } else {
            if (charSequence.charAt(i + 1) != ':') {
                return false;
            }
            int i4 = i;
            i += 2;
            i2 = i4;
        }
        int i5 = 0;
        for (int i6 = i; i6 < length; i6++) {
            char cCharAt2 = charSequence.charAt(i6);
            if (!isValidHexChar(cCharAt2)) {
                if (cCharAt2 == '%') {
                    length = i6;
                    break;
                }
                if (cCharAt2 == '.') {
                    if ((i2 < 0 && i3 != 6) || ((i3 == 7 && i2 >= i) || i3 > 7)) {
                        return false;
                    }
                    int i7 = i6 - i5;
                    int i8 = i7 - 2;
                    if (isValidIPv4MappedChar(charSequence.charAt(i8))) {
                        if (!isValidIPv4MappedChar(charSequence.charAt(i8 - 1)) || !isValidIPv4MappedChar(charSequence.charAt(i8 - 2)) || !isValidIPv4MappedChar(charSequence.charAt(i8 - 3))) {
                            return false;
                        }
                        i8 -= 5;
                    }
                    while (i8 >= i) {
                        char cCharAt3 = charSequence.charAt(i8);
                        if (cCharAt3 != '0' && cCharAt3 != ':') {
                            return false;
                        }
                        i8--;
                    }
                    int iIndexOf = AsciiString.indexOf(charSequence, '%', i7 + 7);
                    if (iIndexOf >= 0) {
                        length = iIndexOf;
                    }
                    return isValidIpV4Address(charSequence, i7, length);
                }
                if (cCharAt2 != ':' || i3 > 7) {
                    return false;
                }
                int i9 = i6 - 1;
                if (charSequence.charAt(i9) != ':') {
                    i5 = 0;
                } else {
                    if (i2 >= 0) {
                        return false;
                    }
                    i2 = i9;
                }
                i3++;
            } else {
                if (i5 >= 4) {
                    return false;
                }
                i5++;
            }
        }
        if (i2 < 0) {
            return i3 == 7 && i5 > 0;
        }
        if (i2 + 2 != length) {
            if (i5 <= 0) {
                return false;
            }
            if (i3 >= 8 && i2 > i) {
                return false;
            }
        }
        return true;
    }

    public static String toAddressString(InetAddress inetAddress, boolean z) {
        if (inetAddress instanceof Inet4Address) {
            return inetAddress.getHostAddress();
        }
        if (inetAddress instanceof Inet6Address) {
            return toAddressString(inetAddress.getAddress(), 0, z);
        }
        throw new IllegalArgumentException("Unhandled type: " + inetAddress);
    }

    private static boolean isValidIpV4Address(CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof String) {
            return isValidIpV4Address((String) charSequence, i, i2);
        }
        if (charSequence instanceof AsciiString) {
            return isValidIpV4Address((AsciiString) charSequence, i, i2);
        }
        return isValidIpV4Address0(charSequence, i, i2);
    }

    private static boolean isValidIpV4Address(String str, int i, int i2) {
        int iIndexOf;
        int i3;
        int iIndexOf2;
        int i4;
        int iIndexOf3;
        int i5 = i2 - i;
        return i5 <= 15 && i5 >= 7 && (iIndexOf = str.indexOf(46, i + 1)) > 0 && isValidIpV4Word(str, i, iIndexOf) && (iIndexOf2 = str.indexOf(46, (i3 = iIndexOf + 2))) > 0 && isValidIpV4Word(str, i3 - 1, iIndexOf2) && (iIndexOf3 = str.indexOf(46, (i4 = iIndexOf2 + 2))) > 0 && isValidIpV4Word(str, i4 - 1, iIndexOf3) && isValidIpV4Word(str, iIndexOf3 + 1, i2);
    }

    private static String toAddressString(byte[] bArr, int i, boolean z) {
        int i2;
        int i3;
        int[] iArr = new int[8];
        int i4 = i + 8;
        while (true) {
            i2 = 1;
            if (i >= i4) {
                break;
            }
            int i5 = i << 1;
            iArr[i] = (bArr[i5 + 1] & 255) | ((bArr[i5] & 255) << 8);
            i++;
        }
        int i6 = -1;
        boolean z2 = false;
        int i7 = 0;
        int i8 = -1;
        int i9 = 0;
        int i10 = -1;
        while (i7 < 8) {
            if (iArr[i7] == 0) {
                if (i8 < 0) {
                    i8 = i7;
                }
            } else if (i8 >= 0) {
                int i11 = i7 - i8;
                if (i11 > i9) {
                    i9 = i11;
                } else {
                    i8 = i10;
                }
                i10 = i8;
                i8 = -1;
            }
            i7++;
        }
        if (i8 < 0 || (i3 = i7 - i8) <= i9) {
            i8 = i10;
        } else {
            i9 = i3;
        }
        if (i9 == 1) {
            i9 = 0;
        } else {
            i6 = i8;
        }
        int i12 = i9 + i6;
        StringBuilder sb = new StringBuilder(39);
        if (i12 < 0) {
            sb.append(Integer.toHexString(iArr[0]));
            while (i2 < 8) {
                sb.append(JsonLexerKt.COLON);
                sb.append(Integer.toHexString(iArr[i2]));
                i2++;
            }
        } else {
            if (inRangeEndExclusive(0, i6, i12)) {
                sb.append("::");
                if (z && i12 == 5 && iArr[5] == 65535) {
                    z2 = true;
                }
            } else {
                sb.append(Integer.toHexString(iArr[0]));
            }
            while (i2 < 8) {
                if (!inRangeEndExclusive(i2, i6, i12)) {
                    if (!inRangeEndExclusive(i2 - 1, i6, i12)) {
                        if (z2 && i2 != 6) {
                            sb.append('.');
                        } else {
                            sb.append(JsonLexerKt.COLON);
                        }
                    }
                    if (z2 && i2 > 5) {
                        sb.append(iArr[i2] >> 8);
                        sb.append('.');
                        sb.append(iArr[i2] & 255);
                    } else {
                        sb.append(Integer.toHexString(iArr[i2]));
                    }
                } else if (!inRangeEndExclusive(i2 - 1, i6, i12)) {
                    sb.append("::");
                }
                i2++;
            }
        }
        return sb.toString();
    }

    public static String toSocketAddressString(String str, int i) {
        String strValueOf = String.valueOf(i);
        StringBuilder sbNewSocketAddressStringBuilder = newSocketAddressStringBuilder(str, strValueOf, !isValidIpV6Address(str));
        sbNewSocketAddressStringBuilder.append(JsonLexerKt.COLON);
        sbNewSocketAddressStringBuilder.append(strValueOf);
        return sbNewSocketAddressStringBuilder.toString();
    }

    private static boolean isValidIpV4Address(AsciiString asciiString, int i, int i2) {
        int iIndexOf;
        int i3;
        int iIndexOf2;
        int i4;
        int iIndexOf3;
        int i5 = i2 - i;
        return i5 <= 15 && i5 >= 7 && (iIndexOf = asciiString.indexOf('.', i + 1)) > 0 && isValidIpV4Word(asciiString, i, iIndexOf) && (iIndexOf2 = asciiString.indexOf('.', (i3 = iIndexOf + 2))) > 0 && isValidIpV4Word(asciiString, i3 - 1, iIndexOf2) && (iIndexOf3 = asciiString.indexOf('.', (i4 = iIndexOf2 + 2))) > 0 && isValidIpV4Word(asciiString, i4 - 1, iIndexOf3) && isValidIpV4Word(asciiString, iIndexOf3 + 1, i2);
    }
}
