package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class SessionDescription {
    public static final String m = "0";
    public static final String n = "control";
    public static final String o = "fmtp";
    public static final String p = "length";
    public static final String q = "range";
    public static final String r = "rtpmap";
    public static final String s = "tool";
    public static final String t = "type";
    public final ImmutableMap<String, String> a;
    public final ImmutableList<MediaDescription> b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;

    @Nullable
    public final Uri g;

    @Nullable
    public final String h;

    @Nullable
    public final String i;

    @Nullable
    public final String j;

    @Nullable
    public final String k;

    @Nullable
    public final String l;

    public static final class Builder {
        private final HashMap<String, String> a = new HashMap<>();
        private final ImmutableList.Builder<MediaDescription> b = new ImmutableList.Builder<>();
        private int c = -1;

        @Nullable
        private String d;

        @Nullable
        private String e;

        @Nullable
        private String f;

        @Nullable
        private Uri g;

        @Nullable
        private String h;

        @Nullable
        private String i;

        @Nullable
        private String j;

        @Nullable
        private String k;

        @Nullable
        private String l;

        public Builder addAttribute(String attributeName, String attributeValue) {
            this.a.put(attributeName, attributeValue);
            return this;
        }

        public Builder addMediaDescription(MediaDescription mediaDescription) {
            this.b.add(mediaDescription);
            return this;
        }

        public SessionDescription build() {
            if (this.d == null || this.e == null || this.f == null) {
                throw new IllegalStateException("One of more mandatory SDP fields are not set.");
            }
            return new SessionDescription(this);
        }

        public Builder setBitrate(int bitrate) {
            this.c = bitrate;
            return this;
        }

        public Builder setConnection(String connection) {
            this.h = connection;
            return this;
        }

        public Builder setEmailAddress(String emailAddress) {
            this.k = emailAddress;
            return this;
        }

        public Builder setKey(String key) {
            this.i = key;
            return this;
        }

        public Builder setOrigin(String origin) {
            this.e = origin;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.l = phoneNumber;
            return this;
        }

        public Builder setSessionInfo(String sessionInfo) {
            this.j = sessionInfo;
            return this;
        }

        public Builder setSessionName(String sessionName) {
            this.d = sessionName;
            return this;
        }

        public Builder setTiming(String timing) {
            this.f = timing;
            return this;
        }

        public Builder setUri(Uri uri) {
            this.g = uri;
            return this;
        }
    }

    public boolean equals(@Nullable Object o2) {
        if (this == o2) {
            return true;
        }
        if (o2 == null || SessionDescription.class != o2.getClass()) {
            return false;
        }
        SessionDescription sessionDescription = (SessionDescription) o2;
        return this.f == sessionDescription.f && this.a.equals(sessionDescription.a) && this.b.equals(sessionDescription.b) && this.d.equals(sessionDescription.d) && this.c.equals(sessionDescription.c) && this.e.equals(sessionDescription.e) && Util.areEqual(this.l, sessionDescription.l) && Util.areEqual(this.g, sessionDescription.g) && Util.areEqual(this.j, sessionDescription.j) && Util.areEqual(this.k, sessionDescription.k) && Util.areEqual(this.h, sessionDescription.h) && Util.areEqual(this.i, sessionDescription.i);
    }

    public int hashCode() {
        int iHashCode = (((((((((((217 + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.d.hashCode()) * 31) + this.c.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f) * 31;
        String str = this.l;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Uri uri = this.g;
        int iHashCode3 = (iHashCode2 + (uri == null ? 0 : uri.hashCode())) * 31;
        String str2 = this.j;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.k;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    private SessionDescription(Builder builder) {
        this.a = ImmutableMap.copyOf((Map) builder.a);
        this.b = builder.b.build();
        this.c = (String) Util.castNonNull(builder.d);
        this.d = (String) Util.castNonNull(builder.e);
        this.e = (String) Util.castNonNull(builder.f);
        this.g = builder.g;
        this.h = builder.h;
        this.f = builder.c;
        this.i = builder.i;
        this.j = builder.k;
        this.k = builder.l;
        this.l = builder.j;
    }
}
