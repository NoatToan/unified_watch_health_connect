package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Joiner;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.UnmodifiableIterator;
import com.google.firebase.perf.FirebasePerformance;
import com.xiaomi.hm.health.device.event.StatEvent;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
final class RtspMessageUtil {
    public static final long a = 60000;
    private static final String h = "RTSP/1.0";
    private static final Pattern b = Pattern.compile("([A-Z_]+) (.*) RTSP/1\\.0");
    private static final Pattern c = Pattern.compile("RTSP/1\\.0 (\\d+) (.+)");
    private static final Pattern d = Pattern.compile("Content-Length:\\s?(\\d+)", 2);
    private static final Pattern e = Pattern.compile("([\\w$-_.+]+)(?:;\\s?timeout=(\\d+))?");
    private static final Pattern f = Pattern.compile("Digest realm=\"([\\w\\s@.]+)\",\\s?(?:domain=\"(.+)\",\\s?)?nonce=\"(\\w+)\"(?:,\\s?opaque=\"(\\w+)\")?");
    private static final Pattern g = Pattern.compile("Basic realm=\"([\\w\\s@.]+)\"");
    private static final String i = new String(new byte[]{10});
    private static final String j = new String(new byte[]{13, 10});

    public static final class RtspAuthUserInfo {
        public final String password;
        public final String username;

        public RtspAuthUserInfo(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }

    public static final class RtspSessionHeader {
        public final String sessionId;
        public final long timeoutMs;

        public RtspSessionHeader(String sessionId, long timeoutMs) {
            this.sessionId = sessionId;
            this.timeoutMs = timeoutMs;
        }
    }

    private RtspMessageUtil() {
    }

    public static byte[] a(List<String> message) {
        return Joiner.on(j).join(message).getBytes(RtspMessageChannel.g);
    }

    private static String b(int statusCode) {
        if (statusCode == 200) {
            return "OK";
        }
        if (statusCode == 461) {
            return "Unsupported Transport";
        }
        if (statusCode == 500) {
            return "Internal Server Error";
        }
        if (statusCode == 505) {
            return "RTSP Version Not Supported";
        }
        if (statusCode == 400) {
            return "Bad Request";
        }
        if (statusCode == 401) {
            return StatEvent.EVENT_WEIBO_VIEW_NUM_UNAUTHORIZED;
        }
        if (statusCode == 404) {
            return "Not Found";
        }
        if (statusCode == 405) {
            return "Method Not Allowed";
        }
        switch (statusCode) {
            case 454:
                return "Session Not Found";
            case 455:
                return "Method Not Valid In This State";
            case 456:
                return "Header Field Not Valid";
            case 457:
                return "Invalid Range";
            default:
                throw new IllegalArgumentException();
        }
    }

    public static byte[] c(String s) {
        return s.getBytes(RtspMessageChannel.g);
    }

    public static boolean d(String line) {
        return b.matcher(line).matches() || c.matcher(line).matches();
    }

    public static long e(String line) throws ParserException {
        try {
            Matcher matcher = d.matcher(line);
            if (matcher.find()) {
                return Long.parseLong((String) Assertions.checkNotNull(matcher.group(1)));
            }
            return -1L;
        } catch (NumberFormatException e2) {
            throw ParserException.createForMalformedManifest(line, e2);
        }
    }

    public static int f(String intString) throws ParserException {
        try {
            return Integer.parseInt(intString);
        } catch (NumberFormatException e2) {
            throw ParserException.createForMalformedManifest(intString, e2);
        }
    }

    private static int g(String method) {
        method.hashCode();
        switch (method) {
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

    public static ImmutableList<Integer> h(@Nullable String publicHeader) {
        if (publicHeader == null) {
            return ImmutableList.of();
        }
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (String str : Util.split(publicHeader, ",\\s?")) {
            builder.add(Integer.valueOf(g(str)));
        }
        return builder.build();
    }

    public static RtspRequest i(List<String> lines) {
        Matcher matcher = b.matcher(lines.get(0));
        Assertions.checkArgument(matcher.matches());
        int iG = g((String) Assertions.checkNotNull(matcher.group(1)));
        Uri uri = Uri.parse((String) Assertions.checkNotNull(matcher.group(2)));
        int iIndexOf = lines.indexOf("");
        Assertions.checkArgument(iIndexOf > 0);
        return new RtspRequest(uri, iG, new RtspHeaders.Builder().addAll(lines.subList(1, iIndexOf)).build(), Joiner.on(j).join(lines.subList(iIndexOf + 1, lines.size())));
    }

    public static s j(List<String> lines) {
        Matcher matcher = c.matcher(lines.get(0));
        Assertions.checkArgument(matcher.matches());
        int i2 = Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1)));
        int iIndexOf = lines.indexOf("");
        Assertions.checkArgument(iIndexOf > 0);
        return new s(i2, new RtspHeaders.Builder().addAll(lines.subList(1, iIndexOf)).build(), Joiner.on(j).join(lines.subList(iIndexOf + 1, lines.size())));
    }

    public static RtspSessionHeader k(String headerValue) throws ParserException {
        Matcher matcher = e.matcher(headerValue);
        if (!matcher.matches()) {
            throw ParserException.createForMalformedManifest(headerValue, null);
        }
        String str = (String) Assertions.checkNotNull(matcher.group(1));
        long j2 = 60000;
        String strGroup = matcher.group(2);
        if (strGroup != null) {
            try {
                j2 = ((long) Integer.parseInt(strGroup)) * 1000;
            } catch (NumberFormatException e2) {
                throw ParserException.createForMalformedManifest(headerValue, e2);
            }
        }
        return new RtspSessionHeader(str, j2);
    }

    @Nullable
    public static RtspAuthUserInfo l(Uri uri) {
        String userInfo = uri.getUserInfo();
        if (userInfo == null || !userInfo.contains(":")) {
            return null;
        }
        String[] strArrSplitAtFirst = Util.splitAtFirst(userInfo, ":");
        return new RtspAuthUserInfo(strArrSplitAtFirst[0], strArrSplitAtFirst[1]);
    }

    public static e m(String headerValue) throws ParserException {
        Matcher matcher = f.matcher(headerValue);
        if (matcher.find()) {
            return new e(2, (String) Assertions.checkNotNull(matcher.group(1)), (String) Assertions.checkNotNull(matcher.group(3)), Strings.nullToEmpty(matcher.group(4)));
        }
        Matcher matcher2 = g.matcher(headerValue);
        if (matcher2.matches()) {
            return new e(1, (String) Assertions.checkNotNull(matcher2.group(1)), "", "");
        }
        String strValueOf = String.valueOf(headerValue);
        throw ParserException.createForMalformedManifest(strValueOf.length() != 0 ? "Invalid WWW-Authenticate header ".concat(strValueOf) : new String("Invalid WWW-Authenticate header "), null);
    }

    public static Uri n(Uri uri) {
        if (uri.getUserInfo() == null) {
            return uri;
        }
        String str = (String) Assertions.checkNotNull(uri.getAuthority());
        Assertions.checkArgument(str.contains("@"));
        return uri.buildUpon().encodedAuthority(Util.split(str, "@")[1]).build();
    }

    public static ImmutableList<String> o(RtspRequest request) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        builder.add(Util.formatInvariant("%s %s %s", r(request.b), request.a, h));
        ImmutableListMultimap<String, String> immutableListMultimapB = request.c.b();
        UnmodifiableIterator<String> it2 = immutableListMultimapB.keySet().iterator();
        while (it2.hasNext()) {
            String next = it2.next();
            ImmutableList<String> immutableList = immutableListMultimapB.get(next);
            for (int i2 = 0; i2 < immutableList.size(); i2++) {
                builder.add(Util.formatInvariant("%s: %s", next, immutableList.get(i2)));
            }
        }
        builder.add("");
        builder.add(request.d);
        return builder.build();
    }

    public static ImmutableList<String> p(s response) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        builder.add(Util.formatInvariant("%s %s %s", h, Integer.valueOf(response.a), b(response.a)));
        ImmutableListMultimap<String, String> immutableListMultimapB = response.b.b();
        UnmodifiableIterator<String> it2 = immutableListMultimapB.keySet().iterator();
        while (it2.hasNext()) {
            String next = it2.next();
            ImmutableList<String> immutableList = immutableListMultimapB.get(next);
            for (int i2 = 0; i2 < immutableList.size(); i2++) {
                builder.add(Util.formatInvariant("%s: %s", next, immutableList.get(i2)));
            }
        }
        builder.add("");
        builder.add(response.c);
        return builder.build();
    }

    public static String[] q(String body) {
        String str = j;
        if (!body.contains(str)) {
            str = i;
        }
        return Util.split(body, str);
    }

    public static String r(int method) {
        switch (method) {
            case 1:
                return "ANNOUNCE";
            case 2:
                return "DESCRIBE";
            case 3:
                return "GET_PARAMETER";
            case 4:
                return FirebasePerformance.HttpMethod.OPTIONS;
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
