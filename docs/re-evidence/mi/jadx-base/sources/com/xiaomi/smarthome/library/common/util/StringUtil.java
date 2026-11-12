package com.xiaomi.smarthome.library.common.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.xiaomi.smarthome.library.common.network.HanziToPinyin;
import com.xiaomi.smarthome.library.common.network.HanziToPinyinICS;
import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import defpackage.gv5;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class StringUtil {
    public static final int CHAR_ASCII_END1 = 126;
    public static final int CHAR_ASCII_START1 = 32;
    public static final String CHAR_CHINESE = "[一-龥]";
    public static final int CHAR_CHINESE_END = 40879;
    public static final int CHAR_CHINESE_START = 19968;
    public static final String CHAR_ENGLISH = "[a-zA-Z]";
    public static final int CHAR_ENGLISH_END1 = 90;
    public static final int CHAR_ENGLISH_END2 = 122;
    public static final int CHAR_ENGLISH_START1 = 65;
    public static final int CHAR_ENGLISH_START2 = 97;
    public static final String CHAR_NUMBER = "[0-9]";
    public static final int CHAR_NUMBER_END = 57;
    public static final int CHAR_NUMBER_START = 48;
    private static WeakReference<TextView> mTvRef = new WeakReference<>(null);
    public static final String NEW_REG_EX = "[\"!$^*{}<>?|\\[\\]=\\\\]|--";
    public static final Pattern p = Pattern.compile(NEW_REG_EX);

    public static String byte2hex(byte[] bArr) {
        String str = "";
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            str = hexString.length() == 1 ? str + "0" + hexString : str + hexString;
        }
        return str.toUpperCase();
    }

    public static String bytes2String(byte[] bArr) {
        return bArr == null ? "" : new String(bArr);
    }

    public static boolean containsEmoji(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (isEmojiCharacterV2(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static String createUUID() {
        return UUID.randomUUID().toString();
    }

    public static String decode(String str) {
        String str2 = new String();
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return str2;
        }
    }

    public static String encode(String str) {
        if (isEmpty(str)) {
            return "";
        }
        String str2 = new String();
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return str2;
        }
    }

    public static String formatDay(String str) {
        if (isVoid(str) || str.length() != 8) {
            return str;
        }
        return str.substring(0, 4) + "-" + str.substring(4, 6) + "-" + str.substring(6, 8);
    }

    public static String formatPercent(long j, long j2) {
        if (j2 == 0) {
            return null;
        }
        return String.format("%.2f%%", Double.valueOf((j * 100) / j2));
    }

    public static String formatSize(long j) {
        double d = j / 1024.0d;
        if (d == 0.0d) {
            return String.format("%d B", Long.valueOf(j));
        }
        double d2 = d / 1024.0d;
        if (d2 < 1.0d) {
            return String.format("%.2f K", Double.valueOf(d));
        }
        double d3 = d2 / 1024.0d;
        return d3 < 1.0d ? String.format("%.2f M", Double.valueOf(d2)) : String.format("%.2f G", Double.valueOf(d3));
    }

    public static String formatSizeFromKB(long j) {
        double d = j / 1024;
        if (d < 1.0d) {
            return String.format("%d K", Long.valueOf(j));
        }
        double d2 = d / 1024.0d;
        return d2 < 1.0d ? String.format("%.2f M", Double.valueOf(d)) : String.format("%.2f G", Double.valueOf(d2));
    }

    public static String formatSpeed(int i) {
        return formatSize(i) + "/s";
    }

    public static String formatSpeedFromKb(int i) {
        return formatSizeFromKB(i) + "/s";
    }

    public static String formatTime(int i) {
        if (i < 0) {
            i = 0;
        }
        int i2 = i / 3600;
        int i3 = (i % 3600) / 60;
        int i4 = i % 60;
        return i2 != 0 ? String.format("%02d:%02d:%02d", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format("%02d:%02d", Integer.valueOf(i3), Integer.valueOf(i4));
    }

    public static byte[] getBytes(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes();
        }
    }

    public static String getDomain(String str) {
        int iLastIndexOf;
        String host = getHost(str);
        int iLastIndexOf2 = host.lastIndexOf(46);
        if (iLastIndexOf2 == -1 || (iLastIndexOf = host.substring(0, iLastIndexOf2).lastIndexOf(46)) == -1) {
            return "";
        }
        String strSubstring = host.substring(iLastIndexOf + 1);
        return strSubstring.endsWith("/") ? strSubstring.substring(0, strSubstring.length() - 1) : strSubstring;
    }

    public static String getHost(String str) {
        try {
            return new URL(str).getHost();
        } catch (MalformedURLException unused) {
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getLimitString(String str, int i, String str2) {
        int length = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            int iCodePointAt = Character.codePointAt(str, i3);
            i2 = (iCodePointAt < 19968 || iCodePointAt > 40879) ? i2 + 1 : i2 + 2;
            if (i < i2) {
                return str.substring(0, Math.max(0, i3)) + str2;
            }
        }
        return str;
    }

    public static String getMd5Digest(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(Coder.KEY_MD5);
            messageDigest.update(getBytes(str));
            return String.format("%1$032X", new BigInteger(1, messageDigest.digest()));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getNonNullString(String str) {
        return str != null ? str : "";
    }

    public static String getQuantityString(Context context, int i, int i2, Object obj) {
        return context.getResources().getQuantityString(i, i2, obj);
    }

    public static Map<String, String> getQuery(String str) {
        String query;
        try {
            query = new URL(str).getQuery();
        } catch (MalformedURLException unused) {
            query = "";
        }
        HashMap map = new HashMap();
        if (query == null) {
            return map;
        }
        for (String str2 : query.split(gv5.CONNECT_STR)) {
            String[] strArrSplit = str2.split("=");
            if (strArrSplit.length == 2) {
                map.put(strArrSplit[0], strArrSplit[1]);
            }
        }
        return map;
    }

    public static Resources getResources(Activity activity, Locale locale) {
        Configuration configuration = new Configuration(activity.getApplicationContext().getResources().getConfiguration());
        configuration.setLocale(locale);
        return activity.getApplicationContext().createConfigurationContext(configuration).getResources();
    }

    public static String getSHA1Digest(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            messageDigest.update(getBytes(str));
            return String.format("%1$040X", new BigInteger(1, messageDigest.digest()));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static SpannableStringBuilder getSpannable(Context context, int i, int i2, ClickableSpan clickableSpan) {
        String string = context.getString(i);
        String string2 = context.getString(i2, string);
        int iIndexOf = string2.indexOf(string);
        if (iIndexOf < 0) {
            iIndexOf = 0;
        }
        int length = string.length() + iIndexOf;
        if (length > string2.length()) {
            length = string2.length() - 1;
        }
        if (iIndexOf > length) {
            length = iIndexOf;
        }
        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(string2);
        spannableStringBuilderValueOf.setSpan(clickableSpan, iIndexOf, length, 33);
        return spannableStringBuilderValueOf;
    }

    public static String getString(Context context, int i) {
        return context.getString(i);
    }

    public static String[] getStringArray(Context context, int i) {
        return context.getResources().getStringArray(i);
    }

    public static String getStringCNEq2Other(CharSequence charSequence, int i) {
        if (TextUtils.isEmpty(charSequence)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        for (int i3 = 0; i3 < charSequence.length(); i3++) {
            String strValueOf = String.valueOf(charSequence.charAt(i3));
            i2 = strValueOf.matches(CHAR_CHINESE) ? i2 + 2 : i2 + 1;
            if (i2 <= i) {
                sb.append(strValueOf);
            }
            if (i2 >= i) {
                break;
            }
        }
        return sb.toString();
    }

    public static int getStringCharLen1(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            int iCodePointAt = Character.codePointAt(charSequence, i4);
            if (iCodePointAt >= 19968 && iCodePointAt <= 40879) {
                i++;
            } else if (iCodePointAt < 32 || iCodePointAt > 126) {
                i3++;
            } else {
                i2++;
            }
        }
        return (i * 2) + i2 + i3;
    }

    public static int getStringLengthCNEq2Other(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < charSequence.length(); i3++) {
            if (String.valueOf(charSequence.charAt(i3)).matches(CHAR_CHINESE)) {
                i++;
            } else {
                i2++;
            }
        }
        return (i * 2) + i2;
    }

    public static String getStringSpecifyLocale(Activity activity, Locale locale, int i) {
        try {
            return getResources(activity, locale).getString(i);
        } catch (Exception unused) {
            return activity.getApplicationContext().getString(i);
        }
    }

    public static int getSuitableIndex(CharSequence charSequence, int i) {
        if (TextUtils.isEmpty(charSequence) || i <= 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 1; i3 <= charSequence.length() && getStringCharLen1(charSequence.subSequence(0, i3)) <= i; i3++) {
            i2 = i3;
        }
        return i2;
    }

    public static String getUrl(String str, String str2) {
        try {
            URL url = new URL(str);
            return new URL(url.getProtocol(), url.getHost(), str2).toString();
        } catch (MalformedURLException unused) {
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String hanziToPinyin(String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        ArrayList<HanziToPinyin.Token> arrayList = HanziToPinyinICS.getInstance().get(str);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<HanziToPinyin.Token> it = arrayList.iterator();
            while (it.hasNext()) {
                sb.append(it.next().target);
                if (z) {
                    sb.append(" ");
                }
            }
        }
        return TextUtils.isEmpty(sb) ? str.toLowerCase(Locale.ENGLISH) : sb.toString().toLowerCase(Locale.ENGLISH);
    }

    public static byte[] hexStringToByteArray(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    public static boolean isContentLengthValid(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        int stringCharLen1 = getStringCharLen1(str);
        return stringCharLen1 >= 0 && stringCharLen1 <= i;
    }

    public static boolean isEmojiCharacter(char c) {
        return (c == 0 || c == '\t' || c == '\n' || c == '\r' || (c >= ' ' && c <= 55295) || ((c >= 57344 && c <= 65533) || (c >= 0 && c <= 65535))) ? false : true;
    }

    public static boolean isEmojiCharacterV2(char c) {
        return !(c == 0 || c == '\t' || c == '\n' || c == '\r' || ((c >= ' ' && c <= 55295) || ((c >= 57344 && c <= 65533) || c >= 0))) || c == 169 || c == 174 || c == 8482 || c == 12336 || (c >= 9654 && c <= 10175) || c == 9000 || ((c >= 9193 && c <= 9210) || ((c >= 61440 && c <= 65535) || ((c >= 9986 && c <= 10160) || (c >= 62977 && c <= 63055))));
    }

    public static boolean isEmpty(String str) {
        return str == null || "".equals(str) || "NULL".equals(str);
    }

    public static boolean isEmptyArray(Object[] objArr) {
        return isEmptyArray(objArr, 1);
    }

    public static boolean isEnglishOrNum(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }

    public static boolean isNumeric(String str) {
        for (int i = 0; i < str.length(); i++) {
            if ("0123456789".indexOf(str.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOnlyContainAlphabetAndNumber(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (!isEnglishOrNum(c)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSpecialCharInName(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        String strTrim = str.trim();
        return TextUtils.isEmpty(strTrim) || !TextUtils.equals(p.matcher(strTrim).replaceAll("").trim(), strTrim);
    }

    public static boolean isUrl(String str) {
        return !isEmpty(str) && str.matches("(((http|ftp|https|file)://)?([\\w\\-]+\\.)+[\\w\\-]+(/[\\w\\u4e00-\\u9fa5\\-\\./?\\@\\%\\!\\&=\\+\\~\\:\\#\\;\\,]*)?)");
    }

    public static boolean isVoid(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static String join(Object[] objArr) {
        return join(objArr, (String) null);
    }

    public static String map2String(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(entry.getValue());
            sb.append(",");
        }
        return sb.toString();
    }

    public static int measureStringWidth(Context context, String str, float f, int i) {
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(i, f);
        textView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        return textView.getMeasuredWidth();
    }

    public static String parseBDHDFid(String str) {
        try {
            if (isEmpty(str)) {
                return "";
            }
            String strSubstring = str.substring(str.indexOf(124) + 1);
            return strSubstring.substring(0, strSubstring.indexOf(124));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String parseBDHDName(String str) {
        try {
            if (isEmpty(str)) {
                return "";
            }
            for (int i = 0; i < 2; i++) {
                str = str.substring(str.indexOf(124) + 1);
            }
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String parseED2KName(String str) {
        try {
            if (isEmpty(str)) {
                return "";
            }
            String strDecode = decode(str);
            for (int i = 0; i < 2; i++) {
                strDecode = strDecode.substring(strDecode.indexOf(124) + 1);
            }
            int iIndexOf = strDecode.indexOf(124);
            return iIndexOf >= 0 ? strDecode.substring(0, iIndexOf) : strDecode.substring(0);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        for (int length = str.length() - 1; length >= 0; length--) {
            sb.append(str.charAt(length));
        }
        return sb.toString();
    }

    public static boolean setTextSpecifyLocale(Activity activity, Locale locale, int i, TextView textView) {
        try {
            textView.setText(getResources(activity, locale).getString(i));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String splitJoint(String str, String str2) {
        try {
            if (str2.equals("")) {
                return str;
            }
            String str3 = "," + str + ",";
            boolean z = true;
            String str4 = "";
            for (String str5 : str2.split(",")) {
                if (!str5.equals("")) {
                    if (!str3.contains("," + str5 + ",")) {
                        if (!z) {
                            str4 = str4 + ",";
                        }
                        str4 = str4 + str5;
                        z = false;
                    }
                }
            }
            if (str.equals("")) {
                return str4;
            }
            if (str4.equals("")) {
                return str;
            }
            return str + "," + str4;
        } catch (Exception unused) {
            return str;
        }
    }

    public static float string2Float(String str) {
        try {
            if (isEmpty(str)) {
                return 0.0f;
            }
            return Float.valueOf(str).floatValue();
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0f;
        }
    }

    public static int string2Int(String str) {
        try {
            if (isEmpty(str)) {
                return 0;
            }
            return Integer.valueOf(str).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static void string2Map(String str, Map<String, String> map) {
        if (str == null || map == null) {
            return;
        }
        String[] strArrSplit = str.split(",");
        if (strArrSplit.length > 0) {
            for (String str2 : strArrSplit) {
                String[] strArrSplit2 = str2.split("=");
                if (strArrSplit2 != null && strArrSplit2.length == 2) {
                    map.put(strArrSplit2[0], strArrSplit2[1]);
                }
            }
        }
    }

    public static String toGbk(String str) {
        try {
            return URLEncoder.encode(str, "GBK");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static final long toLong(String str) {
        try {
            return Long.parseLong(str);
        } catch (Exception e) {
            e.printStackTrace();
            return 0L;
        }
    }

    public static Uri toUri(String str) {
        if (str == null) {
            return null;
        }
        return (str.startsWith("http") || str.startsWith("res")) ? Uri.parse(str) : Uri.fromFile(new File(str));
    }

    public static String trimQuotes(String str) {
        return (!isVoid(str) && str.startsWith("\"") && str.endsWith("\"")) ? str.substring(1, str.length() - 1) : str;
    }

    public static String truncateUserNameString(Context context, String str, float f, TextView textView, int i) {
        if (TextUtils.isEmpty(str) || str.length() < 4) {
            return str;
        }
        TextView textView2 = mTvRef.get();
        if (textView2 == null) {
            textView2 = new TextView(context);
            textView2.setSingleLine();
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            mTvRef = new WeakReference<>(textView2);
        }
        float f2 = context.getResources().getDisplayMetrics().density;
        textView2.setText(str);
        textView2.setTextSize(0, f);
        textView.getTextScaleX();
        textView2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * i), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        try {
            int lineStart = textView2.getLayout().getLineStart(0);
            int ellipsisStart = textView2.getLayout().getEllipsisStart(0);
            if (ellipsisStart > 0) {
                return textView2.getText().toString().substring(lineStart, ellipsisStart) + "... ";
            }
        } catch (Exception unused) {
        }
        return str;
    }

    public static String utf8Togb2312(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '%') {
                try {
                    sb.append((char) Integer.parseInt(str.substring(i + 1, i + 3), 16));
                    i += 2;
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException();
                }
            } else if (cCharAt != '+') {
                sb.append(cCharAt);
            } else {
                sb.append(' ');
            }
            i++;
        }
        try {
            return new String(sb.toString().getBytes("8859_1"), "UTF-8");
        } catch (Exception unused2) {
            return null;
        }
    }

    public static boolean isEmptyArray(Object[] objArr, int i) {
        return objArr == null || objArr.length < i;
    }

    public static String join(Object[] objArr, char c) {
        if (objArr == null) {
            return null;
        }
        return join(objArr, c, 0, objArr.length);
    }

    public static String join(Object[] objArr, char c, int i, int i2) {
        if (objArr == null) {
            return null;
        }
        int i3 = i2 - i;
        if (i3 <= 0) {
            return "";
        }
        Object obj = objArr[i];
        StringBuilder sb = new StringBuilder(i3 * ((obj == null ? 16 : obj.toString().length()) + 1));
        for (int i4 = i; i4 < i2; i4++) {
            if (i4 > i) {
                sb.append(c);
            }
            Object obj2 = objArr[i4];
            if (obj2 != null) {
                sb.append(obj2);
            }
        }
        return sb.toString();
    }

    public static boolean isSpecialCharInName(CharSequence charSequence, String str) {
        if (TextUtils.isEmpty(charSequence)) {
            return true;
        }
        String strTrim = ((String) charSequence).trim();
        return TextUtils.isEmpty(strTrim) || !TextUtils.equals(Pattern.compile(str).matcher(strTrim).replaceAll("").trim(), strTrim);
    }

    public static String join(Object[] objArr, String str) {
        if (objArr == null) {
            return null;
        }
        return join(objArr, str, 0, objArr.length);
    }

    public static String join(Object[] objArr, String str, int i, int i2) {
        if (objArr == null) {
            return null;
        }
        if (str == null) {
            str = "";
        }
        int i3 = i2 - i;
        if (i3 <= 0) {
            return "";
        }
        Object obj = objArr[i];
        StringBuilder sb = new StringBuilder(i3 * ((obj == null ? 16 : obj.toString().length()) + str.length()));
        for (int i4 = i; i4 < i2; i4++) {
            if (i4 > i) {
                sb.append(str);
            }
            Object obj2 = objArr[i4];
            if (obj2 != null) {
                sb.append(obj2);
            }
        }
        return sb.toString();
    }

    public static String join(Iterator<?> it, char c) {
        if (it == null) {
            return null;
        }
        if (!it.hasNext()) {
            return "";
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return next.toString();
        }
        StringBuilder sb = new StringBuilder(256);
        if (next != null) {
            sb.append(next);
        }
        while (it.hasNext()) {
            sb.append(c);
            Object next2 = it.next();
            if (next2 != null) {
                sb.append(next2);
            }
        }
        return sb.toString();
    }

    public static String join(Iterator<?> it, String str) {
        if (it == null) {
            return null;
        }
        if (!it.hasNext()) {
            return "";
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return next.toString();
        }
        StringBuilder sb = new StringBuilder(256);
        if (next != null) {
            sb.append(next);
        }
        while (it.hasNext()) {
            if (str != null) {
                sb.append(str);
            }
            Object next2 = it.next();
            if (next2 != null) {
                sb.append(next2);
            }
        }
        return sb.toString();
    }

    public static String join(Collection<?> collection, char c) {
        if (collection == null) {
            return null;
        }
        return join(collection.iterator(), c);
    }

    public static String join(Collection<?> collection, String str) {
        if (collection == null) {
            return null;
        }
        return join(collection.iterator(), str);
    }
}
