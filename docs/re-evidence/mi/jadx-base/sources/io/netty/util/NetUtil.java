package io.netty.util;

import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.SocketUtils;
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
import java.net.SocketException;
import java.net.UnknownHostException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
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

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    static {
        Inet4Address inet4Address;
        Inet6Address inet6Address;
        ArrayList<NetworkInterface> arrayList;
        Iterator it;
        InetAddress inetAddressNextElement;
        InetAddress inetAddress;
        InetAddress inetAddress2;
        boolean z = SystemPropertyUtil.getBoolean("java.net.preferIPv4Stack", false);
        IPV4_PREFERRED = z;
        boolean z2 = SystemPropertyUtil.getBoolean("java.net.preferIPv6Addresses", false);
        IPV6_ADDRESSES_PREFERRED = z2;
        InternalLogger internalLoggerFactory = InternalLoggerFactory.getInstance((Class<?>) NetUtil.class);
        logger = internalLoggerFactory;
        internalLoggerFactory.debug("-Djava.net.preferIPv4Stack: {}", Boolean.valueOf(z));
        internalLoggerFactory.debug("-Djava.net.preferIPv6Addresses: {}", Boolean.valueOf(z2));
        byte[] bArr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        NetworkInterface networkInterface = null;
        try {
            inet4Address = (Inet4Address) InetAddress.getByAddress("localhost", new byte[]{127, 0, 0, 1});
        } catch (Exception e) {
            PlatformDependent.throwException(e);
            inet4Address = null;
        }
        LOCALHOST4 = inet4Address;
        try {
            try {
                inet6Address = (Inet6Address) InetAddress.getByAddress("localhost", bArr);
                loop1: while (true) {
                    if (!it.hasNext()) {
                        inetAddressNextElement = null;
                        break;
                    }
                    NetworkInterface networkInterface2 = (NetworkInterface) it.next();
                    Enumeration<InetAddress> enumerationAddressesFromNetworkInterface = SocketUtils.addressesFromNetworkInterface(networkInterface2);
                    while (enumerationAddressesFromNetworkInterface.hasMoreElements()) {
                        inetAddressNextElement = enumerationAddressesFromNetworkInterface.nextElement();
                        if (inetAddressNextElement.isLoopbackAddress()) {
                            networkInterface = networkInterface2;
                            break loop1;
                        }
                    }
                }
            } catch (Exception e2) {
                PlatformDependent.throwException(e2);
                inet6Address = null;
            }
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces != null) {
                while (networkInterfaces.hasMoreElements()) {
                    NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                    if (SocketUtils.addressesFromNetworkInterface(networkInterfaceNextElement).hasMoreElements()) {
                        arrayList.add(networkInterfaceNextElement);
                    }
                }
            }
        } catch (SocketException e3) {
            logger.warn("Failed to retrieve the list of available network interfaces", (Throwable) e3);
        }
        LOCALHOST6 = inet6Address;
        arrayList = new ArrayList();
        it = arrayList.iterator();
        if (networkInterface == null) {
            try {
                for (NetworkInterface networkInterface3 : arrayList) {
                    if (networkInterface3.isLoopback()) {
                        Enumeration<InetAddress> enumerationAddressesFromNetworkInterface2 = SocketUtils.addressesFromNetworkInterface(networkInterface3);
                        if (enumerationAddressesFromNetworkInterface2.hasMoreElements()) {
                            try {
                                inetAddressNextElement = enumerationAddressesFromNetworkInterface2.nextElement();
                                networkInterface = networkInterface3;
                                break;
                            } catch (SocketException e4) {
                                e = e4;
                                networkInterface = networkInterface3;
                                logger.warn("Failed to find the loopback interface", (Throwable) e);
                            }
                        }
                    }
                }
                if (networkInterface == null) {
                    logger.warn("Failed to find the loopback interface");
                }
            } catch (SocketException e5) {
                e = e5;
            }
        }
        if (networkInterface == null) {
            if (inetAddressNextElement == null) {
                try {
                    if (NetworkInterface.getByInetAddress(LOCALHOST6) != null) {
                        logger.debug("Using hard-coded IPv6 localhost address: {}", inet6Address);
                    } else {
                        inetAddress = inetAddressNextElement;
                    }
                    if (inetAddress == null) {
                        inetAddress = inet6Address;
                        logger.debug("Using hard-coded IPv4 localhost address: {}", inet4Address);
                        inetAddress2 = inet4Address;
                    } else {
                        inetAddress = inet6Address;
                        inetAddress2 = inetAddress;
                    }
                } catch (Exception unused) {
                    if (inetAddressNextElement != null) {
                        inetAddress2 = inetAddressNextElement;
                    }
                    LOOPBACK_IF = networkInterface;
                    LOCALHOST = inetAddress2;
                    SOMAXCONN = ((Integer) AccessController.doPrivileged(new PrivilegedAction<Integer>() { // from class: io.netty.util.NetUtil.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        /* JADX WARN: Code duplicated, block: B:47:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
                        @Override // java.security.PrivilegedAction
                        public Integer run() throws Throwable {
                            BufferedReader bufferedReader;
                            Exception e6;
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
                                            } catch (Exception e7) {
                                                e6 = e7;
                                                NetUtil.logger.debug("Failed to get SOMAXCONN from sysctl and file {}. Default: {}", file, Integer.valueOf(iIntValue), e6);
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
                                                } catch (Exception unused2) {
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
                                } catch (Exception unused3) {
                                }
                            } catch (Exception e8) {
                                bufferedReader = null;
                                e6 = e8;
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
                } catch (Throwable th) {
                    if (inetAddressNextElement == null) {
                        logger.debug("Using hard-coded IPv4 localhost address: {}", inet4Address);
                    }
                    throw th;
                }
            }
            LOOPBACK_IF = networkInterface;
            LOCALHOST = inetAddress2;
            SOMAXCONN = ((Integer) AccessController.doPrivileged(new PrivilegedAction<Integer>() { // from class: io.netty.util.NetUtil.1
                /* JADX WARN: Can't rename method to resolve collision */
                /* JADX WARN: Code duplicated, block: B:47:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
                @Override // java.security.PrivilegedAction
                public Integer run() throws Throwable {
                    BufferedReader bufferedReader;
                    Exception e6;
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
                                    } catch (Exception e7) {
                                        e6 = e7;
                                        NetUtil.logger.debug("Failed to get SOMAXCONN from sysctl and file {}. Default: {}", file, Integer.valueOf(iIntValue), e6);
                                        if (bufferedReader != null) {
                                            bufferedReader.close();
                                        }
                                        return Integer.valueOf(iIntValue);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedReader2 = bufferedReader;
                                    if (bufferedReader2 != null) {
                                        try {
                                            bufferedReader2.close();
                                        } catch (Exception unused2) {
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
                        } catch (Exception unused3) {
                        }
                    } catch (Exception e8) {
                        bufferedReader = null;
                        e6 = e8;
                    } catch (Throwable th3) {
                        th = th3;
                        if (bufferedReader2 != null) {
                            bufferedReader2.close();
                        }
                        throw th;
                    }
                    return Integer.valueOf(iIntValue);
                }
            })).intValue();
        }
        logger.debug("Loopback interface: {} ({}, {})", networkInterface.getName(), networkInterface.getDisplayName(), inetAddressNextElement.getHostAddress());
        inetAddress2 = inetAddressNextElement;
        LOOPBACK_IF = networkInterface;
        LOCALHOST = inetAddress2;
        SOMAXCONN = ((Integer) AccessController.doPrivileged(new PrivilegedAction<Integer>() { // from class: io.netty.util.NetUtil.1
            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Code duplicated, block: B:47:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // java.security.PrivilegedAction
            public Integer run() throws Throwable {
                BufferedReader bufferedReader;
                Exception e6;
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
                                } catch (Exception e7) {
                                    e6 = e7;
                                    NetUtil.logger.debug("Failed to get SOMAXCONN from sysctl and file {}. Default: {}", file, Integer.valueOf(iIntValue), e6);
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                    }
                                    return Integer.valueOf(iIntValue);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedReader2 = bufferedReader;
                                if (bufferedReader2 != null) {
                                    try {
                                        bufferedReader2.close();
                                    } catch (Exception unused2) {
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
                    } catch (Exception unused3) {
                    }
                } catch (Exception e8) {
                    bufferedReader = null;
                    e6 = e8;
                } catch (Throwable th3) {
                    th = th3;
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

    /* JADX WARN: Code duplicated, block: B:120:0x018c  */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x019e, code lost:
    
        if (r7 <= 2) goto L129;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static byte[] getIPv6ByName(java.lang.CharSequence r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.util.NetUtil.getIPv6ByName(java.lang.CharSequence, boolean):byte[]");
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

    private static byte ipv4WordToByte(String str, int i, int i2) {
        int iDecimalDigit = decimalDigit(str, i);
        int i3 = i + 1;
        if (i3 == i2) {
            return (byte) iDecimalDigit;
        }
        int iDecimalDigit2 = (iDecimalDigit * 10) + decimalDigit(str, i3);
        int i4 = i + 2;
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
        if (i > 12 || i < 2) {
            return false;
        }
        return (!z || i2 < 12) && isValidIPv4MappedSeparators(bArr[i + (-1)], bArr[i + (-2)], z) && PlatformDependent.isZero(bArr, 0, i + (-3));
    }

    private static boolean isValidIPv4MappedChar(char c) {
        return c == 'f' || c == 'F';
    }

    private static boolean isValidIPv4MappedSeparators(byte b2, byte b3, boolean z) {
        return b2 == b3 && (b2 == 0 || (!z && b3 == -1));
    }

    public static boolean isValidIpV4Address(CharSequence charSequence) {
        return isValidIpV4Address(charSequence, 0, charSequence.length());
    }

    private static boolean isValidIpV4Address0(CharSequence charSequence, int i, int i2) {
        int iIndexOf;
        int iIndexOf2;
        int iIndexOf3;
        int i3 = i2 - i;
        return i3 <= 15 && i3 >= 7 && (iIndexOf = AsciiString.indexOf(charSequence, '.', i + 1)) > 0 && isValidIpV4Word(charSequence, i, iIndexOf) && (iIndexOf2 = AsciiString.indexOf(charSequence, '.', iIndexOf + 2)) > 0 && isValidIpV4Word(charSequence, iIndexOf + 1, iIndexOf2) && (iIndexOf3 = AsciiString.indexOf(charSequence, '.', iIndexOf2 + 2)) > 0 && isValidIpV4Word(charSequence, iIndexOf2 + 1, iIndexOf3) && isValidIpV4Word(charSequence, iIndexOf3 + 1, i2);
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
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb2.append(str);
        sb2.append(AbstractJsonLexerKt.END_LIST);
        return sb2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Integer sysctlGetInt(String str) throws IOException {
        Process processStart = new ProcessBuilder("sysctl", str).start();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processStart.getInputStream()));
            try {
                String line = bufferedReader.readLine();
                if (line.startsWith(str)) {
                    int length = line.length();
                    while (true) {
                        length--;
                        if (length <= str.length()) {
                            break;
                        }
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
        sbNewSocketAddressStringBuilder.append(AbstractJsonLexerKt.COLON);
        sbNewSocketAddressStringBuilder.append(strValueOf);
        return sbNewSocketAddressStringBuilder.toString();
    }

    public static byte[] validIpV4ToBytes(String str) {
        int iIndexOf = str.indexOf(46, 1);
        byte bIpv4WordToByte = ipv4WordToByte(str, 0, iIndexOf);
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(46, iIndexOf + 2);
        byte bIpv4WordToByte2 = ipv4WordToByte(str, i, iIndexOf2);
        int iIndexOf3 = str.indexOf(46, iIndexOf2 + 2);
        return new byte[]{bIpv4WordToByte, bIpv4WordToByte2, ipv4WordToByte(str, iIndexOf2 + 1, iIndexOf3), ipv4WordToByte(str, iIndexOf3 + 1, str.length())};
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
            i2 = -1;
            i3 = 0;
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
                        if (!isValidIPv4MappedChar(charSequence.charAt(i7 - 3)) || !isValidIPv4MappedChar(charSequence.charAt(i7 - 4)) || !isValidIPv4MappedChar(charSequence.charAt(i7 - 5))) {
                            return false;
                        }
                        i8 = i7 - 7;
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
        int iIndexOf2;
        int iIndexOf3;
        int i3 = i2 - i;
        return i3 <= 15 && i3 >= 7 && (iIndexOf = str.indexOf(46, i + 1)) > 0 && isValidIpV4Word(str, i, iIndexOf) && (iIndexOf2 = str.indexOf(46, iIndexOf + 2)) > 0 && isValidIpV4Word(str, iIndexOf + 1, iIndexOf2) && (iIndexOf3 = str.indexOf(46, iIndexOf2 + 2)) > 0 && isValidIpV4Word(str, iIndexOf2 + 1, iIndexOf3) && isValidIpV4Word(str, iIndexOf3 + 1, i2);
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
        int i7 = -1;
        int i8 = -1;
        int i9 = 0;
        int i10 = 0;
        while (i9 < 8) {
            if (iArr[i9] == 0) {
                if (i7 < 0) {
                    i7 = i9;
                }
            } else if (i7 >= 0) {
                int i11 = i9 - i7;
                if (i11 > i10) {
                    i10 = i11;
                } else {
                    i7 = i8;
                }
                i8 = i7;
                i7 = -1;
            }
            i9++;
        }
        if (i7 < 0 || (i3 = i9 - i7) <= i10) {
            i7 = i8;
        } else {
            i10 = i3;
        }
        if (i10 == 1) {
            i10 = 0;
        } else {
            i6 = i7;
        }
        int i12 = i10 + i6;
        StringBuilder sb = new StringBuilder(39);
        if (i12 < 0) {
            sb.append(Integer.toHexString(iArr[0]));
            while (i2 < 8) {
                sb.append(AbstractJsonLexerKt.COLON);
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
                            sb.append(AbstractJsonLexerKt.COLON);
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
        sbNewSocketAddressStringBuilder.append(AbstractJsonLexerKt.COLON);
        sbNewSocketAddressStringBuilder.append(strValueOf);
        return sbNewSocketAddressStringBuilder.toString();
    }

    private static boolean isValidIpV4Address(AsciiString asciiString, int i, int i2) {
        int iIndexOf;
        int iIndexOf2;
        int iIndexOf3;
        int i3 = i2 - i;
        return i3 <= 15 && i3 >= 7 && (iIndexOf = asciiString.indexOf('.', i + 1)) > 0 && isValidIpV4Word(asciiString, i, iIndexOf) && (iIndexOf2 = asciiString.indexOf('.', iIndexOf + 2)) > 0 && isValidIpV4Word(asciiString, iIndexOf + 1, iIndexOf2) && (iIndexOf3 = asciiString.indexOf('.', iIndexOf2 + 2)) > 0 && isValidIpV4Word(asciiString, iIndexOf2 + 1, iIndexOf3) && isValidIpV4Word(asciiString, iIndexOf3 + 1, i2);
    }
}
