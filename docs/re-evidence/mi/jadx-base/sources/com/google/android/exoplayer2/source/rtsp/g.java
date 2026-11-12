package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.android.exoplayer2.ParserException;
import com.google.common.collect.ImmutableList;
import defpackage.bu3;
import defpackage.gv5;
import defpackage.n0l;
import defpackage.o0l;
import defpackage.prd;
import defpackage.rk1;
import defpackage.uaq;
import defpackage.wlq;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f8245a = Pattern.compile("([A-Z_]+) (.*) RTSP/1\\.0");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f8246b = Pattern.compile("RTSP/1\\.0 (\\d+) (.+)");
    public static final Pattern c = Pattern.compile("Content-Length:\\s?(\\d+)", 2);
    public static final Pattern d = Pattern.compile("(\\w+)(?:;\\s?timeout=(\\d+))?");

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f8248b;

        public a(String str, long j) {
            this.f8247a = str;
            this.f8248b = j;
        }
    }

    public static byte[] a(List<String> list) {
        return prd.g("\r\n").c(list).getBytes(bu3.c);
    }

    public static boolean b(String str) {
        return f8245a.matcher(str).matches() || f8246b.matcher(str).matches();
    }

    public static long c(String str) throws ParserException {
        try {
            Matcher matcher = c.matcher(str);
            if (matcher.find()) {
                return Long.parseLong((String) rk1.e(matcher.group(1)));
            }
            return -1L;
        } catch (NumberFormatException e) {
            throw new ParserException(e);
        }
    }

    public static int d(String str) throws ParserException {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new ParserException(e);
        }
    }

    public static int e(String str) {
        str.hashCode();
        switch (str) {
            case "RECORD":
                return 8;
            case "TEARDOWN":
                return 12;
            case "GET_PARAMETER":
                return 3;
            case "OPTIONS":
                return 4;
            case "PLAY_NOTIFY":
                return 7;
            case "PLAY":
                return 6;
            case "REDIRECT":
                return 9;
            case "SET_PARAMETER":
                return 11;
            case "PAUSE":
                return 5;
            case "SETUP":
                return 10;
            case "ANNOUNCE":
                return 1;
            case "DESCRIBE":
                return 2;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static ImmutableList<Integer> f(String str) {
        if (str == null) {
            return ImmutableList.of();
        }
        ImmutableList.a aVar = new ImmutableList.a();
        for (String str2 : wlq.M0(str, ",\\s?")) {
            aVar.a(Integer.valueOf(e(str2)));
        }
        return aVar.k();
    }

    public static o0l g(List<String> list) {
        Matcher matcher = f8246b.matcher(list.get(0));
        rk1.a(matcher.matches());
        int i = Integer.parseInt((String) rk1.e(matcher.group(1)));
        int iIndexOf = list.indexOf("");
        rk1.a(iIndexOf > 0);
        return new o0l(i, new d.b().c(list.subList(1, iIndexOf)).e(), prd.g("\r\n").c(list.subList(iIndexOf + 1, list.size())));
    }

    public static a h(String str) throws ParserException {
        long j;
        Matcher matcher = d.matcher(str);
        if (!matcher.matches()) {
            throw new ParserException(str);
        }
        String str2 = (String) rk1.e(matcher.group(1));
        String strGroup = matcher.group(2);
        if (strGroup != null) {
            try {
                j = ((long) Integer.parseInt(strGroup)) * 1000;
            } catch (NumberFormatException e) {
                throw new ParserException(e);
            }
        } else {
            j = 60000;
        }
        return new a(str2, j);
    }

    public static Uri i(Uri uri) {
        if (uri.getUserInfo() == null) {
            return uri;
        }
        String str = (String) rk1.e(uri.getAuthority());
        rk1.a(str.contains(gv5.CONNECT_VALUE_STR));
        return uri.buildUpon().encodedAuthority(wlq.M0(str, gv5.CONNECT_VALUE_STR)[1]).build();
    }

    public static ImmutableList<String> j(n0l n0lVar) {
        ImmutableList.a aVar = new ImmutableList.a();
        aVar.a(wlq.D("%s %s %s", k(n0lVar.f27411b), n0lVar.f27410a, "RTSP/1.0"));
        uaq<String> it = n0lVar.c.a().keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            aVar.a(wlq.D("%s: %s", next, rk1.e(n0lVar.c.b(next))));
        }
        aVar.a("");
        aVar.a(n0lVar.d);
        return aVar.k();
    }

    public static String k(int i) {
        switch (i) {
            case 1:
                return "ANNOUNCE";
            case 2:
                return "DESCRIBE";
            case 3:
                return "GET_PARAMETER";
            case 4:
                return "OPTIONS";
            case 5:
                return "PAUSE";
            case 6:
                return "PLAY";
            case 7:
                return "PLAY_NOTIFY";
            case 8:
                return "RECORD";
            case 9:
                return "REDIRECT";
            case 10:
                return "SETUP";
            case 11:
                return "SET_PARAMETER";
            case 12:
                return "TEARDOWN";
            default:
                throw new IllegalStateException();
        }
    }
}
