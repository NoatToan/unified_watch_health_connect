package com.google.android.exoplayer2.source.rtsp;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.Iterables;
import com.google.common.collect.Multimap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class RtspHeaders {
    public static final String A = "Supported";
    public static final String B = "Timestamp";
    public static final String C = "Transport";
    public static final String D = "User-Agent";
    public static final String E = "Via";
    public static final String F = "WWW-Authenticate";
    public static final RtspHeaders G = new Builder().build();
    public static final String b = "Accept";
    public static final String c = "Allow";
    public static final String d = "Authorization";
    public static final String e = "Bandwidth";
    public static final String f = "Blocksize";
    public static final String g = "Cache-Control";
    public static final String h = "Connection";
    public static final String i = "Content-Base";
    public static final String j = "Content-Encoding";
    public static final String k = "Content-Language";
    public static final String l = "Content-Length";
    public static final String m = "Content-Location";
    public static final String n = "Content-Type";
    public static final String o = "CSeq";
    public static final String p = "Date";
    public static final String q = "Expires";
    public static final String r = "Proxy-Authenticate";
    public static final String s = "Proxy-Require";
    public static final String t = "Public";
    public static final String u = "Range";
    public static final String v = "RTP-Info";
    public static final String w = "RTCP-Interval";
    public static final String x = "Scale";
    public static final String y = "Session";
    public static final String z = "Speed";
    private final ImmutableListMultimap<String, String> a;

    public static final class Builder {
        private final ImmutableListMultimap.Builder<String, String> a;

        public Builder add(String headerName, String headerValue) {
            this.a.put(RtspHeaders.d(headerName.trim()), headerValue.trim());
            return this;
        }

        public Builder addAll(List<String> headers) {
            for (int i = 0; i < headers.size(); i++) {
                String[] strArrSplitAtFirst = Util.splitAtFirst(headers.get(i), ":\\s?");
                if (strArrSplitAtFirst.length == 2) {
                    add(strArrSplitAtFirst[0], strArrSplitAtFirst[1]);
                }
            }
            return this;
        }

        public RtspHeaders build() {
            return new RtspHeaders(this);
        }

        public Builder() {
            this.a = new ImmutableListMultimap.Builder<>();
        }

        private Builder(ImmutableListMultimap.Builder<String, String> namesAndValuesBuilder) {
            this.a = namesAndValuesBuilder;
        }

        public Builder addAll(Map<String, String> headers) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                add(entry.getKey(), entry.getValue());
            }
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(String messageHeaderName) {
        if (Ascii.equalsIgnoreCase(messageHeaderName, "Accept")) {
            return "Accept";
        }
        if (Ascii.equalsIgnoreCase(messageHeaderName, "Allow")) {
            return "Allow";
        }
        if (Ascii.equalsIgnoreCase(messageHeaderName, "Authorization")) {
            return "Authorization";
        }
        if (Ascii.equalsIgnoreCase(messageHeaderName, e)) {
            return e;
        }
        if (Ascii.equalsIgnoreCase(messageHeaderName, f)) {
            return f;
        }
        if (Ascii.equalsIgnoreCase(messageHeaderName, "Cache-Control")) {
            return "Cache-Control";
        }
        if (Ascii.equalsIgnoreCase(messageHeaderName, "Connection")) {
            return "Connection";
        }
        if (Ascii.equalsIgnoreCase(messageHeaderName, i)) {
            return i;
        }
        if (Ascii.equalsIgnoreCase(messageHeaderName, "Content-Encoding")) {
            return "Content-Encoding";
        }
        if (Ascii.equalsIgnoreCase(messageHeaderName, "Content-Language")) {
            return "Content-Language";
        }
        if (Ascii.equalsIgnoreCase(messageHeaderName, "Content-Length")) {
            return "Content-Length";
        }
        if (Ascii.equalsIgnoreCase(messageHeaderName, "Content-Location")) {
            return "Content-Location";
        }
        if (Ascii.equalsIgnoreCase(messageHeaderName, "Content-Type")) {
            return "Content-Type";
        }
        if (Ascii.equalsIgnoreCase(messageHeaderName, o)) {
            return o;
        }
        if (Ascii.equalsIgnoreCase(messageHeaderName, "Date")) {
            return "Date";
        }
        if (Ascii.equalsIgnoreCase(messageHeaderName, "Expires")) {
            return "Expires";
        }
        if (Ascii.equalsIgnoreCase(messageHeaderName, "Proxy-Authenticate")) {
            return "Proxy-Authenticate";
        }
        if (Ascii.equalsIgnoreCase(messageHeaderName, s)) {
            return s;
        }
        if (Ascii.equalsIgnoreCase(messageHeaderName, t)) {
            return t;
        }
        if (Ascii.equalsIgnoreCase(messageHeaderName, "Range")) {
            return "Range";
        }
        if (Ascii.equalsIgnoreCase(messageHeaderName, v)) {
            return v;
        }
        if (Ascii.equalsIgnoreCase(messageHeaderName, w)) {
            return w;
        }
        if (Ascii.equalsIgnoreCase(messageHeaderName, "Scale")) {
            return "Scale";
        }
        if (Ascii.equalsIgnoreCase(messageHeaderName, y)) {
            return y;
        }
        if (Ascii.equalsIgnoreCase(messageHeaderName, "Speed")) {
            return "Speed";
        }
        if (Ascii.equalsIgnoreCase(messageHeaderName, A)) {
            return A;
        }
        if (Ascii.equalsIgnoreCase(messageHeaderName, B)) {
            return B;
        }
        if (Ascii.equalsIgnoreCase(messageHeaderName, C)) {
            return C;
        }
        if (Ascii.equalsIgnoreCase(messageHeaderName, "User-Agent")) {
            return "User-Agent";
        }
        if (Ascii.equalsIgnoreCase(messageHeaderName, "Via")) {
            return "Via";
        }
        return Ascii.equalsIgnoreCase(messageHeaderName, "WWW-Authenticate") ? "WWW-Authenticate" : messageHeaderName;
    }

    public ImmutableListMultimap<String, String> b() {
        return this.a;
    }

    public Builder c() {
        ImmutableListMultimap.Builder builder = new ImmutableListMultimap.Builder();
        builder.putAll((Multimap) this.a);
        return new Builder(builder);
    }

    @Nullable
    public String e(String headerName) {
        ImmutableList<String> immutableListF = f(headerName);
        if (immutableListF.isEmpty()) {
            return null;
        }
        return (String) Iterables.getLast(immutableListF);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RtspHeaders) {
            return this.a.equals(((RtspHeaders) obj).a);
        }
        return false;
    }

    public ImmutableList<String> f(String headerName) {
        return this.a.get(d(headerName));
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    private RtspHeaders(Builder builder) {
        this.a = builder.a.build();
    }
}
