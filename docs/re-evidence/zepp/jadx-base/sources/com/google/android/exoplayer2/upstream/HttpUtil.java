package com.google.android.exoplayer2.upstream;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.xmlywind.sdk.common.Constants;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class HttpUtil {
    private static final String a = "HttpUtil";
    private static final Pattern b = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    private static final Pattern c = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    private HttpUtil() {
    }

    @Nullable
    public static String buildRangeRequestHeader(long position, long length) {
        if (position == 0 && length == -1) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Constants.RANGE_PARAMS);
        sb.append(position);
        sb.append(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        if (length != -1) {
            sb.append((position + length) - 1);
        }
        return sb.toString();
    }

    public static long getContentLength(@Nullable String contentLengthHeader, @Nullable String contentRangeHeader) {
        long j;
        if (TextUtils.isEmpty(contentLengthHeader)) {
            j = -1;
        } else {
            try {
                j = Long.parseLong(contentLengthHeader);
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(contentLengthHeader).length() + 28);
                sb.append("Unexpected Content-Length [");
                sb.append(contentLengthHeader);
                sb.append("]");
                Log.e(a, sb.toString());
                j = -1;
            }
        }
        if (TextUtils.isEmpty(contentRangeHeader)) {
            return j;
        }
        Matcher matcher = b.matcher(contentRangeHeader);
        if (!matcher.matches()) {
            return j;
        }
        try {
            long j2 = (Long.parseLong((String) Assertions.checkNotNull(matcher.group(2))) - Long.parseLong((String) Assertions.checkNotNull(matcher.group(1)))) + 1;
            if (j < 0) {
                return j2;
            }
            if (j == j2) {
                return j;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(contentLengthHeader).length() + 26 + String.valueOf(contentRangeHeader).length());
            sb2.append("Inconsistent headers [");
            sb2.append(contentLengthHeader);
            sb2.append("] [");
            sb2.append(contentRangeHeader);
            sb2.append("]");
            Log.w(a, sb2.toString());
            return Math.max(j, j2);
        } catch (NumberFormatException unused2) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(contentRangeHeader).length() + 27);
            sb3.append("Unexpected Content-Range [");
            sb3.append(contentRangeHeader);
            sb3.append("]");
            Log.e(a, sb3.toString());
            return j;
        }
    }

    public static long getDocumentSize(@Nullable String contentRangeHeader) {
        if (TextUtils.isEmpty(contentRangeHeader)) {
            return -1L;
        }
        Matcher matcher = c.matcher(contentRangeHeader);
        if (matcher.matches()) {
            return Long.parseLong((String) Assertions.checkNotNull(matcher.group(1)));
        }
        return -1L;
    }
}
