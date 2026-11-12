package com.google.android.exoplayer2.source.rtsp;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableMap;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes3.dex */
final class MediaDescription {
    public static final String k = "audio";
    public static final String l = "video";
    public static final String m = "RTP/AVP";
    public final String a;
    public final int b;
    public final String c;
    public final int d;
    public final int e;

    @Nullable
    public final String f;

    @Nullable
    public final String g;

    @Nullable
    public final String h;
    public final ImmutableMap<String, String> i;
    public final RtpMapAttribute j;

    public static final class Builder {
        private final String a;
        private final int b;
        private final String c;
        private final int d;
        private final HashMap<String, String> e = new HashMap<>();
        private int f = -1;

        @Nullable
        private String g;

        @Nullable
        private String h;

        @Nullable
        private String i;

        public Builder(String mediaType, int port, String transportProtocol, int payloadType) {
            this.a = mediaType;
            this.b = port;
            this.c = transportProtocol;
            this.d = payloadType;
        }

        public Builder addAttribute(String attributeName, String attributeValue) {
            this.e.put(attributeName, attributeValue);
            return this;
        }

        public MediaDescription build() {
            try {
                Assertions.checkState(this.e.containsKey(SessionDescription.r));
                return new MediaDescription(this, ImmutableMap.copyOf((Map) this.e), RtpMapAttribute.parse((String) Util.castNonNull(this.e.get(SessionDescription.r))));
            } catch (ParserException e) {
                throw new IllegalStateException(e);
            }
        }

        public Builder setBitrate(int bitrate) {
            this.f = bitrate;
            return this;
        }

        public Builder setConnection(String connection) {
            this.h = connection;
            return this;
        }

        public Builder setKey(String key) {
            this.i = key;
            return this;
        }

        public Builder setMediaTitle(String mediaTitle) {
            this.g = mediaTitle;
            return this;
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface MediaType {
    }

    public static final class RtpMapAttribute {
        public final int clockRate;
        public final int encodingParameters;
        public final String mediaEncoding;
        public final int payloadType;

        private RtpMapAttribute(int payloadType, String mediaEncoding, int clockRate, int encodingParameters) {
            this.payloadType = payloadType;
            this.mediaEncoding = mediaEncoding;
            this.clockRate = clockRate;
            this.encodingParameters = encodingParameters;
        }

        public static RtpMapAttribute parse(String rtpmapString) throws ParserException {
            String[] strArrSplit = Util.split(rtpmapString, " ");
            Assertions.checkArgument(strArrSplit.length == 2);
            int iF = RtspMessageUtil.f(strArrSplit[0]);
            String[] strArrSplit2 = Util.split(strArrSplit[1], FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
            Assertions.checkArgument(strArrSplit2.length >= 2);
            return new RtpMapAttribute(iF, strArrSplit2[0], RtspMessageUtil.f(strArrSplit2[1]), strArrSplit2.length == 3 ? RtspMessageUtil.f(strArrSplit2[2]) : -1);
        }

        public boolean equals(@Nullable Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || RtpMapAttribute.class != o.getClass()) {
                return false;
            }
            RtpMapAttribute rtpMapAttribute = (RtpMapAttribute) o;
            return this.payloadType == rtpMapAttribute.payloadType && this.mediaEncoding.equals(rtpMapAttribute.mediaEncoding) && this.clockRate == rtpMapAttribute.clockRate && this.encodingParameters == rtpMapAttribute.encodingParameters;
        }

        public int hashCode() {
            return ((((((217 + this.payloadType) * 31) + this.mediaEncoding.hashCode()) * 31) + this.clockRate) * 31) + this.encodingParameters;
        }
    }

    public ImmutableMap<String, String> a() {
        String str = this.i.get(SessionDescription.o);
        if (str == null) {
            return ImmutableMap.of();
        }
        String[] strArrSplitAtFirst = Util.splitAtFirst(str, " ");
        Assertions.checkArgument(strArrSplitAtFirst.length == 2, str);
        String[] strArrSplit = strArrSplitAtFirst[1].split(";\\s?", 0);
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        for (String str2 : strArrSplit) {
            String[] strArrSplitAtFirst2 = Util.splitAtFirst(str2, SearchCriteria.EQ);
            builder.put(strArrSplitAtFirst2[0], strArrSplitAtFirst2[1]);
        }
        return builder.build();
    }

    public boolean equals(@Nullable Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || MediaDescription.class != o.getClass()) {
            return false;
        }
        MediaDescription mediaDescription = (MediaDescription) o;
        return this.a.equals(mediaDescription.a) && this.b == mediaDescription.b && this.c.equals(mediaDescription.c) && this.d == mediaDescription.d && this.e == mediaDescription.e && this.i.equals(mediaDescription.i) && this.j.equals(mediaDescription.j) && Util.areEqual(this.f, mediaDescription.f) && Util.areEqual(this.g, mediaDescription.g) && Util.areEqual(this.h, mediaDescription.h);
    }

    public int hashCode() {
        int iHashCode = (((((((((((((217 + this.a.hashCode()) * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d) * 31) + this.e) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31;
        String str = this.f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    private MediaDescription(Builder builder, ImmutableMap<String, String> attributes, RtpMapAttribute rtpMapAttribute) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
        this.f = builder.g;
        this.g = builder.h;
        this.e = builder.f;
        this.h = builder.i;
        this.i = attributes;
        this.j = rtpMapAttribute;
    }
}
