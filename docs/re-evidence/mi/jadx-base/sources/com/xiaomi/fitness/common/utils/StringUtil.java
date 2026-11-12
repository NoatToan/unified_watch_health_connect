package com.xiaomi.fitness.common.utils;

import android.text.TextUtils;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.onetrack.b.e;
import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010(\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0010\n\u0002\u0010\r\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ3\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0002\u0010\u000eJ)\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\u000fJ5\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0002\u0010\u0010J\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\tJ \u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00122\b\u0010\b\u001a\u0004\u0018\u00010\u0005J\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00142\u0006\u0010\b\u001a\u00020\tJ \u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00142\b\u0010\b\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\fJ\u000e\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0005J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005J\u000e\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0005J\u0016\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\fJ\u000e\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0005J\u000e\u0010'\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0005J\u0014\u0010(\u001a\u00020)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+J\u0014\u0010-\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\f0+J\u000e\u00100\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0005J\u000e\u00101\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0005J\u000e\u00102\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0005J\u0016\u00103\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u00104\u001a\u00020\fJ\u0018\u00105\u001a\u00020\u001a2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00052\u0006\u00106\u001a\u00020\fJ\u000e\u00105\u001a\u00020\u001a2\u0006\u00107\u001a\u00020\fJ\u0010\u00108\u001a\u00020\u00052\b\u00109\u001a\u0004\u0018\u00010\u0005J\u0010\u0010:\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005J\u0010\u0010;\u001a\u00020\u001a2\b\u0010<\u001a\u0004\u0018\u00010\u0005J\u0012\u0010=\u001a\u00020\u001a2\b\u0010>\u001a\u0004\u0018\u00010?H\u0007J\u0012\u0010@\u001a\u00020\u001a2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u0007¨\u0006A"}, d2 = {"Lcom/xiaomi/fitness/common/utils/StringUtil;", "", "<init>", "()V", "join", "", "array", "", "separator", "", "([Ljava/lang/Object;C)Ljava/lang/String;", "startIndex", "", "endIndex", "([Ljava/lang/Object;CII)Ljava/lang/String;", "([Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", "([Ljava/lang/Object;Ljava/lang/String;II)Ljava/lang/String;", "iterator", "", "collection", "", "generateRandomString", "len", "getStringUTF8Length", "str", "contains", "", "searchableString", "restriction", "getHexString", PluginDeviceInfo.FDESC, "", "hexStringToByteArray", "s", "stringToInt", "src", "defaultValue", "getMd5Digest", "pInput", "getBytes", "toLongArray", "", "arrList", "", "", "toIntArray", "", e.f13808a, "getSHA1Digest", "getSHA1DigestInLowerCase", "getWordCount", "getSubWord", "length", "isAscii", "index", "code", "getNonNullString", "text", "getNumFromString", "isUrlEffective", "url", "isBlank", Language.CS, "", "isNotBlank", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStringUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringUtil.kt\ncom/xiaomi/fitness/common/utils/StringUtil\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,650:1\n108#2:651\n80#2,22:652\n1#3:674\n*S KotlinDebug\n*F\n+ 1 StringUtil.kt\ncom/xiaomi/fitness/common/utils/StringUtil\n*L\n592#1:651\n592#1:652,22\n*E\n"})
public final class StringUtil {

    @NotNull
    public static final StringUtil INSTANCE = new StringUtil();

    private StringUtil() {
    }

    @JvmStatic
    public static final boolean isBlank(@Nullable CharSequence cs) {
        int length;
        if (cs != null && (length = cs.length()) != 0) {
            for (int i = 0; i < length; i++) {
                if (!Character.isWhitespace(cs.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    @JvmStatic
    public static final boolean isNotBlank(@Nullable String str) {
        return !isBlank(str);
    }

    public static /* synthetic */ String join$default(StringUtil stringUtil, Object[] objArr, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return stringUtil.join(objArr, str);
    }

    public final boolean contains(@NotNull String searchableString, @NotNull String restriction) {
        Intrinsics.checkNotNullParameter(searchableString, "searchableString");
        Intrinsics.checkNotNullParameter(restriction, "restriction");
        int i = 0;
        for (int i2 = 0; i < restriction.length() && i2 < searchableString.length(); i2++) {
            if (restriction.charAt(i) == searchableString.charAt(i2)) {
                i++;
            }
        }
        return i == restriction.length();
    }

    @NotNull
    public final String generateRandomString(int len) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(random.nextInt(62)));
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public final byte[] getBytes(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "s");
        try {
            Charset charsetForName = Charset.forName("UTF-8");
            Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
            byte[] bytes = s.getBytes(charsetForName);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return bytes;
        } catch (UnsupportedEncodingException unused) {
            byte[] bytes2 = s.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
            return bytes2;
        }
    }

    @NotNull
    public final String getHexString(@NotNull byte[] b2) {
        Intrinsics.checkNotNullParameter(b2, "b");
        String str = "";
        for (byte b3 : b2) {
            String string = Integer.toString(b3 + 256, CharsKt__CharJVMKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            String strSubstring = string.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            str = str + strSubstring;
        }
        return str;
    }

    @NotNull
    public final String getMd5Digest(@NotNull String pInput) {
        Intrinsics.checkNotNullParameter(pInput, "pInput");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(Coder.KEY_MD5);
            messageDigest.update(getBytes(pInput));
            BigInteger bigInteger = new BigInteger(1, messageDigest.digest());
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%1$032X", Arrays.copyOf(new Object[]{bigInteger}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @NotNull
    public final String getNonNullString(@Nullable String text) {
        return text == null ? "" : text;
    }

    @NotNull
    public final String getNumFromString(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        String strReplaceAll = Pattern.compile("[^0-9]").matcher(str).replaceAll("");
        Intrinsics.checkNotNullExpressionValue(strReplaceAll, "replaceAll(...)");
        int length = strReplaceAll.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.compare((int) strReplaceAll.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        return strReplaceAll.subSequence(i, length + 1).toString();
    }

    @NotNull
    public final String getSHA1Digest(@NotNull String pInput) {
        Intrinsics.checkNotNullParameter(pInput, "pInput");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            messageDigest.update(getBytes(pInput));
            BigInteger bigInteger = new BigInteger(1, messageDigest.digest());
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%1$040X", Arrays.copyOf(new Object[]{bigInteger}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @NotNull
    public final String getSHA1DigestInLowerCase(@NotNull String pInput) {
        Intrinsics.checkNotNullParameter(pInput, "pInput");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            messageDigest.update(getBytes(pInput));
            BigInteger bigInteger = new BigInteger(1, messageDigest.digest());
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%1$040x", Arrays.copyOf(new Object[]{bigInteger}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public final int getStringUTF8Length(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            Charset charsetForName = Charset.forName("UTF-8");
            Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
            byte[] bytes = str.getBytes(charsetForName);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return bytes.length;
        } catch (UnsupportedEncodingException unused) {
            return 0;
        }
    }

    @NotNull
    public final String getSubWord(@NotNull String str, int length) {
        Intrinsics.checkNotNullParameter(str, "str");
        int length2 = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length2; i2++) {
            i = isAscii(str, i2) ? i + 1 : i + 2;
            if (i == length) {
                String strSubstring = str.substring(0, i2 + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }
            if (i > length) {
                String strSubstring2 = str.substring(0, i2);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                return strSubstring2;
            }
        }
        return str;
    }

    public final int getWordCount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i = isAscii(str, i2) ? i + 1 : i + 2;
        }
        return i;
    }

    @NotNull
    public final byte[] hexStringToByteArray(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "s");
        int length = s.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i + 1), 16));
        }
        return bArr;
    }

    public final boolean isAscii(int code) {
        return code >= 0 && code < 256;
    }

    public final boolean isUrlEffective(@Nullable String url) {
        try {
            URL url2 = new URL(url);
            return new URI(url2.getProtocol(), url2.getHost(), url2.getPath(), url2.getQuery(), null).getScheme() != null;
        } catch (MalformedURLException | URISyntaxException unused) {
        }
    }

    @JvmOverloads
    @Nullable
    public final String join(@Nullable Object[] objArr) {
        return join$default(this, objArr, null, 2, null);
    }

    public final int stringToInt(@NotNull String src, int defaultValue) {
        Intrinsics.checkNotNullParameter(src, "src");
        try {
            return Integer.parseInt(src);
        } catch (NumberFormatException unused) {
            return defaultValue;
        }
    }

    @NotNull
    public final int[] toIntArray(@NotNull List<Integer> l) {
        Intrinsics.checkNotNullParameter(l, "l");
        int[] iArr = new int[l.size()];
        int size = l.size();
        for (int i = 0; i < size; i++) {
            iArr[i] = l.get(i).intValue();
        }
        return iArr;
    }

    @NotNull
    public final long[] toLongArray(@NotNull List<Long> arrList) {
        Intrinsics.checkNotNullParameter(arrList, "arrList");
        long[] jArr = new long[arrList.size()];
        int size = arrList.size();
        for (int i = 0; i < size; i++) {
            jArr[i] = arrList.get(i).longValue();
        }
        return jArr;
    }

    public final boolean isAscii(@Nullable String str, int index) {
        return isAscii(Character.codePointAt(str, index));
    }

    @Nullable
    public final String join(@Nullable Object[] array, char separator) {
        if (array == null) {
            return null;
        }
        return join(array, separator, 0, array.length);
    }

    @Nullable
    public final String join(@Nullable Object[] array, char separator, int startIndex, int endIndex) {
        if (array == null) {
            return null;
        }
        int i = endIndex - startIndex;
        if (i <= 0) {
            return "";
        }
        Object obj = array[startIndex];
        StringBuilder sb = new StringBuilder(i * ((obj == null ? 16 : String.valueOf(obj).length()) + 1));
        for (int i2 = startIndex; i2 < endIndex; i2++) {
            if (i2 > startIndex) {
                sb.append(separator);
            }
            Object obj2 = array[i2];
            if (obj2 != null) {
                sb.append(obj2);
            }
        }
        return sb.toString();
    }

    @JvmOverloads
    @Nullable
    public final String join(@Nullable Object[] array, @Nullable String separator) {
        if (array == null) {
            return null;
        }
        return join(array, separator, 0, array.length);
    }

    @Nullable
    public final String join(@Nullable Object[] array, @Nullable String separator, int startIndex, int endIndex) {
        if (array == null) {
            return null;
        }
        if (separator == null) {
            separator = "";
        }
        int i = endIndex - startIndex;
        if (i <= 0) {
            return "";
        }
        Object obj = array[startIndex];
        StringBuilder sb = new StringBuilder(i * ((obj == null ? 16 : String.valueOf(obj).length()) + separator.length()));
        for (int i2 = startIndex; i2 < endIndex; i2++) {
            if (i2 > startIndex) {
                sb.append(separator);
            }
            Object obj2 = array[i2];
            if (obj2 != null) {
                sb.append(obj2);
            }
        }
        return sb.toString();
    }

    @Nullable
    public final String join(@Nullable Iterator<?> iterator, char separator) {
        if (iterator == null) {
            return null;
        }
        if (!iterator.hasNext()) {
            return "";
        }
        Object next = iterator.next();
        if (!iterator.hasNext()) {
            return String.valueOf(next);
        }
        StringBuilder sb = new StringBuilder(256);
        if (next != null) {
            sb.append(next);
        }
        while (iterator.hasNext()) {
            sb.append(separator);
            Object next2 = iterator.next();
            if (next2 != null) {
                sb.append(next2);
            }
        }
        return sb.toString();
    }

    @Nullable
    public final String join(@Nullable Iterator<?> iterator, @Nullable String separator) {
        if (iterator == null) {
            return null;
        }
        if (!iterator.hasNext()) {
            return "";
        }
        Object next = iterator.next();
        if (!iterator.hasNext()) {
            return String.valueOf(next);
        }
        StringBuilder sb = new StringBuilder(256);
        if (next != null) {
            sb.append(next);
        }
        while (iterator.hasNext()) {
            if (separator != null) {
                sb.append(separator);
            }
            Object next2 = iterator.next();
            if (next2 != null) {
                sb.append(next2);
            }
        }
        return sb.toString();
    }

    @Nullable
    public final String join(@Nullable Collection<?> collection, char separator) {
        if (collection == null) {
            return null;
        }
        return join(collection.iterator(), separator);
    }

    @Nullable
    public final String join(@Nullable Collection<?> collection, @Nullable String separator) {
        if (collection == null) {
            return null;
        }
        return join(collection.iterator(), separator);
    }
}
