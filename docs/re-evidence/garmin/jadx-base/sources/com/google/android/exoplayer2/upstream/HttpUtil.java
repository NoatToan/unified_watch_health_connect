package com.google.android.exoplayer2.upstream;

import android.text.TextUtils;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.v;
import ds.e0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes14.dex */
public final class HttpUtil {
    private static final String TAG = "HttpUtil";
    private static final Pattern CONTENT_RANGE_WITH_START_AND_END = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    private static final Pattern CONTENT_RANGE_WITH_SIZE = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    private HttpUtil() {
    }

    public static String buildRangeRequestHeader(long j8, long j14) {
        if (j8 == 0 && j14 == -1) {
            return null;
        }
        StringBuilder sbK = e0.k(j8, "bytes=", "-");
        if (j14 != -1) {
            sbK.append((j8 + j14) - 1);
        }
        return sbK.toString();
    }

    public static long getContentLength(String str, String str2) {
        long j8;
        if (TextUtils.isEmpty(str)) {
            j8 = -1;
        } else {
            try {
                j8 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                StringBuilder sb3 = new StringBuilder(v.a(28, str));
                sb3.append("Unexpected Content-Length [");
                sb3.append(str);
                sb3.append("]");
                Log.e(TAG, sb3.toString());
                j8 = -1;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j8;
        }
        Matcher matcher = CONTENT_RANGE_WITH_START_AND_END.matcher(str2);
        if (!matcher.matches()) {
            return j8;
        }
        try {
            long j14 = (Long.parseLong((String) Assertions.checkNotNull(matcher.group(2))) - Long.parseLong((String) Assertions.checkNotNull(matcher.group(1)))) + 1;
            if (j8 < 0) {
                return j14;
            }
            if (j8 == j14) {
                return j8;
            }
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(str2).length());
            sb4.append("Inconsistent headers [");
            sb4.append(str);
            sb4.append("] [");
            sb4.append(str2);
            sb4.append("]");
            Log.w(TAG, sb4.toString());
            return Math.max(j8, j14);
        } catch (NumberFormatException unused2) {
            StringBuilder sb5 = new StringBuilder(v.a(27, str2));
            sb5.append("Unexpected Content-Range [");
            sb5.append(str2);
            sb5.append("]");
            Log.e(TAG, sb5.toString());
            return j8;
        }
    }

    public static long getDocumentSize(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = CONTENT_RANGE_WITH_SIZE.matcher(str);
        if (matcher.matches()) {
            return Long.parseLong((String) Assertions.checkNotNull(matcher.group(1)));
        }
        return -1L;
    }
}
