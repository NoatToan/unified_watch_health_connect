package com.xiaomi.infra.galaxy.fds.auth.signature;

import com.google.common.collect.LinkedListMultimap;
import com.twitter.sdk.android.core.internal.network.UrlUtils;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URI;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes22.dex */
public class Utils {
    private static final ThreadLocal<SimpleDateFormat> a = new a();
    private static final ThreadLocal<SimpleDateFormat> b = new b();
    private static final ThreadLocal<SimpleDateFormat> c = new c();

    public static class a extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat;
        }
    }

    public static class b extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE, dd-MMM-yy HH:mm:ss z", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat;
        }
    }

    public static class c extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE MMM d HH:mm:ss yyyy", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat;
        }
    }

    private static Date a(String str, SimpleDateFormat simpleDateFormat) {
        try {
            return simpleDateFormat.parse(str);
        } catch (ParseException unused) {
            return null;
        }
    }

    public static String calcMD5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(str.getBytes(UrlUtils.UTF8));
        return new BigInteger(1, messageDigest.digest()).toString(16);
    }

    public static String getGMTDatetime(Date date) {
        return a.get().format(date);
    }

    public static Date parseDateTimeFromString(String str) {
        Date dateA = a(str, a.get());
        if (dateA == null) {
            dateA = a(str, b.get());
        }
        return dateA == null ? a(str, c.get()) : dateA;
    }

    public static long parseDateTimeToMilliseconds(String str) {
        Date dateTimeFromString = parseDateTimeFromString(str);
        if (dateTimeFromString != null) {
            return dateTimeFromString.getTime();
        }
        return 0L;
    }

    public static LinkedListMultimap<String, String> parseUriParameters(URI uri) {
        LinkedListMultimap<String, String> linkedListMultimapCreate = LinkedListMultimap.create();
        String query = uri.getQuery();
        if (query != null) {
            for (String str : query.split(com.alipay.sdk.m.s.a.l)) {
                String[] strArrSplit = str.split(SearchCriteria.EQ);
                if (strArrSplit.length >= 2) {
                    linkedListMultimapCreate.put(strArrSplit[0], str.substring(strArrSplit[0].length() + 1));
                } else {
                    linkedListMultimapCreate.put(strArrSplit[0], "");
                }
            }
        }
        return linkedListMultimapCreate;
    }
}
