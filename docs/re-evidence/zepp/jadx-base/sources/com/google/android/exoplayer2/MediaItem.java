package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaItem implements Bundleable {
    public static final String DEFAULT_MEDIA_ID = "";
    private static final int a = 0;
    private static final int b = 1;
    private static final int c = 2;
    private static final int d = 3;
    public final ClippingProperties clippingProperties;
    public final LiveConfiguration liveConfiguration;
    public final String mediaId;
    public final MediaMetadata mediaMetadata;

    @Nullable
    public final PlaybackProperties playbackProperties;
    public static final MediaItem EMPTY = new Builder().build();
    public static final Bundleable.Creator<MediaItem> CREATOR = new Bundleable.Creator() { // from class: vw4
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return MediaItem.b(bundle);
        }
    };

    public static final class AdsConfiguration {
        public final Uri adTagUri;

        @Nullable
        public final Object adsId;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdsConfiguration)) {
                return false;
            }
            AdsConfiguration adsConfiguration = (AdsConfiguration) obj;
            return this.adTagUri.equals(adsConfiguration.adTagUri) && Util.areEqual(this.adsId, adsConfiguration.adsId);
        }

        public int hashCode() {
            int iHashCode = this.adTagUri.hashCode() * 31;
            Object obj = this.adsId;
            return iHashCode + (obj != null ? obj.hashCode() : 0);
        }

        private AdsConfiguration(Uri adTagUri, @Nullable Object adsId) {
            this.adTagUri = adTagUri;
            this.adsId = adsId;
        }
    }

    public static final class Builder {
        private float A;
        private float B;

        @Nullable
        private String a;

        @Nullable
        private Uri b;

        @Nullable
        private String c;
        private long d;
        private long e;
        private boolean f;
        private boolean g;
        private boolean h;

        @Nullable
        private Uri i;
        private Map<String, String> j;

        @Nullable
        private UUID k;
        private boolean l;
        private boolean m;
        private boolean n;
        private List<Integer> o;

        @Nullable
        private byte[] p;
        private List<StreamKey> q;

        @Nullable
        private String r;
        private List<Subtitle> s;

        @Nullable
        private Uri t;

        @Nullable
        private Object u;

        @Nullable
        private Object v;

        @Nullable
        private MediaMetadata w;
        private long x;
        private long y;
        private long z;

        public MediaItem build() {
            PlaybackProperties playbackProperties;
            Assertions.checkState(this.i == null || this.k != null);
            Uri uri = this.b;
            if (uri != null) {
                String str = this.c;
                UUID uuid = this.k;
                DrmConfiguration drmConfiguration = uuid != null ? new DrmConfiguration(uuid, this.i, this.j, this.l, this.n, this.m, this.o, this.p) : null;
                Uri uri2 = this.t;
                playbackProperties = new PlaybackProperties(uri, str, drmConfiguration, uri2 != null ? new AdsConfiguration(uri2, this.u) : null, this.q, this.r, this.s, this.v);
            } else {
                playbackProperties = null;
            }
            String str2 = this.a;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            ClippingProperties clippingProperties = new ClippingProperties(this.d, this.e, this.f, this.g, this.h);
            LiveConfiguration liveConfiguration = new LiveConfiguration(this.x, this.y, this.z, this.A, this.B);
            MediaMetadata mediaMetadata = this.w;
            if (mediaMetadata == null) {
                mediaMetadata = MediaMetadata.EMPTY;
            }
            return new MediaItem(str3, clippingProperties, playbackProperties, liveConfiguration, mediaMetadata);
        }

        public Builder setAdTagUri(@Nullable String adTagUri) {
            return setAdTagUri(adTagUri != null ? Uri.parse(adTagUri) : null);
        }

        public Builder setClipEndPositionMs(long endPositionMs) {
            Assertions.checkArgument(endPositionMs == Long.MIN_VALUE || endPositionMs >= 0);
            this.e = endPositionMs;
            return this;
        }

        public Builder setClipRelativeToDefaultPosition(boolean relativeToDefaultPosition) {
            this.g = relativeToDefaultPosition;
            return this;
        }

        public Builder setClipRelativeToLiveWindow(boolean relativeToLiveWindow) {
            this.f = relativeToLiveWindow;
            return this;
        }

        public Builder setClipStartPositionMs(long startPositionMs) {
            Assertions.checkArgument(startPositionMs >= 0);
            this.d = startPositionMs;
            return this;
        }

        public Builder setClipStartsAtKeyFrame(boolean startsAtKeyFrame) {
            this.h = startsAtKeyFrame;
            return this;
        }

        public Builder setCustomCacheKey(@Nullable String customCacheKey) {
            this.r = customCacheKey;
            return this;
        }

        public Builder setDrmForceDefaultLicenseUri(boolean forceDefaultLicenseUri) {
            this.n = forceDefaultLicenseUri;
            return this;
        }

        public Builder setDrmKeySetId(@Nullable byte[] keySetId) {
            this.p = keySetId != null ? Arrays.copyOf(keySetId, keySetId.length) : null;
            return this;
        }

        public Builder setDrmLicenseRequestHeaders(@Nullable Map<String, String> licenseRequestHeaders) {
            this.j = (licenseRequestHeaders == null || licenseRequestHeaders.isEmpty()) ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(licenseRequestHeaders));
            return this;
        }

        public Builder setDrmLicenseUri(@Nullable Uri licenseUri) {
            this.i = licenseUri;
            return this;
        }

        public Builder setDrmMultiSession(boolean multiSession) {
            this.l = multiSession;
            return this;
        }

        public Builder setDrmPlayClearContentWithoutKey(boolean playClearContentWithoutKey) {
            this.m = playClearContentWithoutKey;
            return this;
        }

        public Builder setDrmSessionForClearPeriods(boolean sessionForClearPeriods) {
            setDrmSessionForClearTypes(sessionForClearPeriods ? Arrays.asList(2, 1) : Collections.emptyList());
            return this;
        }

        public Builder setDrmSessionForClearTypes(@Nullable List<Integer> sessionForClearTypes) {
            this.o = (sessionForClearTypes == null || sessionForClearTypes.isEmpty()) ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(sessionForClearTypes));
            return this;
        }

        public Builder setDrmUuid(@Nullable UUID uuid) {
            this.k = uuid;
            return this;
        }

        public Builder setLiveMaxOffsetMs(long liveMaxOffsetMs) {
            this.z = liveMaxOffsetMs;
            return this;
        }

        public Builder setLiveMaxPlaybackSpeed(float maxPlaybackSpeed) {
            this.B = maxPlaybackSpeed;
            return this;
        }

        public Builder setLiveMinOffsetMs(long liveMinOffsetMs) {
            this.y = liveMinOffsetMs;
            return this;
        }

        public Builder setLiveMinPlaybackSpeed(float minPlaybackSpeed) {
            this.A = minPlaybackSpeed;
            return this;
        }

        public Builder setLiveTargetOffsetMs(long liveTargetOffsetMs) {
            this.x = liveTargetOffsetMs;
            return this;
        }

        public Builder setMediaId(String mediaId) {
            this.a = (String) Assertions.checkNotNull(mediaId);
            return this;
        }

        public Builder setMediaMetadata(MediaMetadata mediaMetadata) {
            this.w = mediaMetadata;
            return this;
        }

        public Builder setMimeType(@Nullable String mimeType) {
            this.c = mimeType;
            return this;
        }

        public Builder setStreamKeys(@Nullable List<StreamKey> streamKeys) {
            this.q = (streamKeys == null || streamKeys.isEmpty()) ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(streamKeys));
            return this;
        }

        public Builder setSubtitles(@Nullable List<Subtitle> subtitles) {
            this.s = (subtitles == null || subtitles.isEmpty()) ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(subtitles));
            return this;
        }

        public Builder setTag(@Nullable Object tag) {
            this.v = tag;
            return this;
        }

        public Builder setUri(@Nullable String uri) {
            return setUri(uri == null ? null : Uri.parse(uri));
        }

        public Builder() {
            this.e = Long.MIN_VALUE;
            this.o = Collections.emptyList();
            this.j = Collections.emptyMap();
            this.q = Collections.emptyList();
            this.s = Collections.emptyList();
            this.x = C.TIME_UNSET;
            this.y = C.TIME_UNSET;
            this.z = C.TIME_UNSET;
            this.A = -3.4028235E38f;
            this.B = -3.4028235E38f;
        }

        public Builder setAdTagUri(@Nullable Uri adTagUri) {
            return setAdTagUri(adTagUri, null);
        }

        public Builder setDrmLicenseUri(@Nullable String licenseUri) {
            this.i = licenseUri == null ? null : Uri.parse(licenseUri);
            return this;
        }

        public Builder setUri(@Nullable Uri uri) {
            this.b = uri;
            return this;
        }

        public Builder setAdTagUri(@Nullable Uri adTagUri, @Nullable Object adsId) {
            this.t = adTagUri;
            this.u = adsId;
            return this;
        }

        private Builder(MediaItem mediaItem) {
            this();
            ClippingProperties clippingProperties = mediaItem.clippingProperties;
            this.e = clippingProperties.endPositionMs;
            this.f = clippingProperties.relativeToLiveWindow;
            this.g = clippingProperties.relativeToDefaultPosition;
            this.d = clippingProperties.startPositionMs;
            this.h = clippingProperties.startsAtKeyFrame;
            this.a = mediaItem.mediaId;
            this.w = mediaItem.mediaMetadata;
            LiveConfiguration liveConfiguration = mediaItem.liveConfiguration;
            this.x = liveConfiguration.targetOffsetMs;
            this.y = liveConfiguration.minOffsetMs;
            this.z = liveConfiguration.maxOffsetMs;
            this.A = liveConfiguration.minPlaybackSpeed;
            this.B = liveConfiguration.maxPlaybackSpeed;
            PlaybackProperties playbackProperties = mediaItem.playbackProperties;
            if (playbackProperties != null) {
                this.r = playbackProperties.customCacheKey;
                this.c = playbackProperties.mimeType;
                this.b = playbackProperties.uri;
                this.q = playbackProperties.streamKeys;
                this.s = playbackProperties.subtitles;
                this.v = playbackProperties.tag;
                DrmConfiguration drmConfiguration = playbackProperties.drmConfiguration;
                if (drmConfiguration != null) {
                    this.i = drmConfiguration.licenseUri;
                    this.j = drmConfiguration.requestHeaders;
                    this.l = drmConfiguration.multiSession;
                    this.n = drmConfiguration.forceDefaultLicenseUri;
                    this.m = drmConfiguration.playClearContentWithoutKey;
                    this.o = drmConfiguration.sessionForClearTypes;
                    this.k = drmConfiguration.uuid;
                    this.p = drmConfiguration.getKeySetId();
                }
                AdsConfiguration adsConfiguration = playbackProperties.adsConfiguration;
                if (adsConfiguration != null) {
                    this.t = adsConfiguration.adTagUri;
                    this.u = adsConfiguration.adsId;
                }
            }
        }
    }

    public static final class ClippingProperties implements Bundleable {
        public static final Bundleable.Creator<ClippingProperties> CREATOR = new Bundleable.Creator() { // from class: ww4
            @Override // com.google.android.exoplayer2.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                return MediaItem.ClippingProperties.c(bundle);
            }
        };
        private static final int a = 0;
        private static final int b = 1;
        private static final int c = 2;
        private static final int d = 3;
        private static final int e = 4;
        public final long endPositionMs;
        public final boolean relativeToDefaultPosition;
        public final boolean relativeToLiveWindow;
        public final long startPositionMs;
        public final boolean startsAtKeyFrame;

        private static String b(int field) {
            return Integer.toString(field, 36);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ ClippingProperties c(Bundle bundle) {
            return new ClippingProperties(bundle.getLong(b(0), 0L), bundle.getLong(b(1), Long.MIN_VALUE), bundle.getBoolean(b(2), false), bundle.getBoolean(b(3), false), bundle.getBoolean(b(4), false));
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClippingProperties)) {
                return false;
            }
            ClippingProperties clippingProperties = (ClippingProperties) obj;
            return this.startPositionMs == clippingProperties.startPositionMs && this.endPositionMs == clippingProperties.endPositionMs && this.relativeToLiveWindow == clippingProperties.relativeToLiveWindow && this.relativeToDefaultPosition == clippingProperties.relativeToDefaultPosition && this.startsAtKeyFrame == clippingProperties.startsAtKeyFrame;
        }

        public int hashCode() {
            long j = this.startPositionMs;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            long j2 = this.endPositionMs;
            return ((((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.relativeToLiveWindow ? 1 : 0)) * 31) + (this.relativeToDefaultPosition ? 1 : 0)) * 31) + (this.startsAtKeyFrame ? 1 : 0);
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putLong(b(0), this.startPositionMs);
            bundle.putLong(b(1), this.endPositionMs);
            bundle.putBoolean(b(2), this.relativeToLiveWindow);
            bundle.putBoolean(b(3), this.relativeToDefaultPosition);
            bundle.putBoolean(b(4), this.startsAtKeyFrame);
            return bundle;
        }

        private ClippingProperties(long startPositionMs, long endPositionMs, boolean relativeToLiveWindow, boolean relativeToDefaultPosition, boolean startsAtKeyFrame) {
            this.startPositionMs = startPositionMs;
            this.endPositionMs = endPositionMs;
            this.relativeToLiveWindow = relativeToLiveWindow;
            this.relativeToDefaultPosition = relativeToDefaultPosition;
            this.startsAtKeyFrame = startsAtKeyFrame;
        }
    }

    public static final class DrmConfiguration {

        @Nullable
        private final byte[] a;
        public final boolean forceDefaultLicenseUri;

        @Nullable
        public final Uri licenseUri;
        public final boolean multiSession;
        public final boolean playClearContentWithoutKey;
        public final Map<String, String> requestHeaders;
        public final List<Integer> sessionForClearTypes;
        public final UUID uuid;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DrmConfiguration)) {
                return false;
            }
            DrmConfiguration drmConfiguration = (DrmConfiguration) obj;
            return this.uuid.equals(drmConfiguration.uuid) && Util.areEqual(this.licenseUri, drmConfiguration.licenseUri) && Util.areEqual(this.requestHeaders, drmConfiguration.requestHeaders) && this.multiSession == drmConfiguration.multiSession && this.forceDefaultLicenseUri == drmConfiguration.forceDefaultLicenseUri && this.playClearContentWithoutKey == drmConfiguration.playClearContentWithoutKey && this.sessionForClearTypes.equals(drmConfiguration.sessionForClearTypes) && Arrays.equals(this.a, drmConfiguration.a);
        }

        @Nullable
        public byte[] getKeySetId() {
            byte[] bArr = this.a;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public int hashCode() {
            int iHashCode = this.uuid.hashCode() * 31;
            Uri uri = this.licenseUri;
            return ((((((((((((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.requestHeaders.hashCode()) * 31) + (this.multiSession ? 1 : 0)) * 31) + (this.forceDefaultLicenseUri ? 1 : 0)) * 31) + (this.playClearContentWithoutKey ? 1 : 0)) * 31) + this.sessionForClearTypes.hashCode()) * 31) + Arrays.hashCode(this.a);
        }

        private DrmConfiguration(UUID uuid, @Nullable Uri licenseUri, Map<String, String> requestHeaders, boolean multiSession, boolean forceDefaultLicenseUri, boolean playClearContentWithoutKey, List<Integer> drmSessionForClearTypes, @Nullable byte[] keySetId) {
            Assertions.checkArgument((forceDefaultLicenseUri && licenseUri == null) ? false : true);
            this.uuid = uuid;
            this.licenseUri = licenseUri;
            this.requestHeaders = requestHeaders;
            this.multiSession = multiSession;
            this.forceDefaultLicenseUri = forceDefaultLicenseUri;
            this.playClearContentWithoutKey = playClearContentWithoutKey;
            this.sessionForClearTypes = drmSessionForClearTypes;
            this.a = keySetId != null ? Arrays.copyOf(keySetId, keySetId.length) : null;
        }
    }

    public static final class LiveConfiguration implements Bundleable {
        private static final int a = 0;
        private static final int b = 1;
        private static final int c = 2;
        private static final int d = 3;
        private static final int e = 4;
        public final long maxOffsetMs;
        public final float maxPlaybackSpeed;
        public final long minOffsetMs;
        public final float minPlaybackSpeed;
        public final long targetOffsetMs;
        public static final LiveConfiguration UNSET = new LiveConfiguration(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, -3.4028235E38f, -3.4028235E38f);
        public static final Bundleable.Creator<LiveConfiguration> CREATOR = new Bundleable.Creator() { // from class: xw4
            @Override // com.google.android.exoplayer2.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                return MediaItem.LiveConfiguration.c(bundle);
            }
        };

        public LiveConfiguration(long targetOffsetMs, long minOffsetMs, long maxOffsetMs, float minPlaybackSpeed, float maxPlaybackSpeed) {
            this.targetOffsetMs = targetOffsetMs;
            this.minOffsetMs = minOffsetMs;
            this.maxOffsetMs = maxOffsetMs;
            this.minPlaybackSpeed = minPlaybackSpeed;
            this.maxPlaybackSpeed = maxPlaybackSpeed;
        }

        private static String b(int field) {
            return Integer.toString(field, 36);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ LiveConfiguration c(Bundle bundle) {
            return new LiveConfiguration(bundle.getLong(b(0), C.TIME_UNSET), bundle.getLong(b(1), C.TIME_UNSET), bundle.getLong(b(2), C.TIME_UNSET), bundle.getFloat(b(3), -3.4028235E38f), bundle.getFloat(b(4), -3.4028235E38f));
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LiveConfiguration)) {
                return false;
            }
            LiveConfiguration liveConfiguration = (LiveConfiguration) obj;
            return this.targetOffsetMs == liveConfiguration.targetOffsetMs && this.minOffsetMs == liveConfiguration.minOffsetMs && this.maxOffsetMs == liveConfiguration.maxOffsetMs && this.minPlaybackSpeed == liveConfiguration.minPlaybackSpeed && this.maxPlaybackSpeed == liveConfiguration.maxPlaybackSpeed;
        }

        public int hashCode() {
            long j = this.targetOffsetMs;
            long j2 = this.minOffsetMs;
            int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.maxOffsetMs;
            int i2 = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            float f = this.minPlaybackSpeed;
            int iFloatToIntBits = (i2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
            float f2 = this.maxPlaybackSpeed;
            return iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putLong(b(0), this.targetOffsetMs);
            bundle.putLong(b(1), this.minOffsetMs);
            bundle.putLong(b(2), this.maxOffsetMs);
            bundle.putFloat(b(3), this.minPlaybackSpeed);
            bundle.putFloat(b(4), this.maxPlaybackSpeed);
            return bundle;
        }
    }

    public static final class PlaybackProperties {

        @Nullable
        public final AdsConfiguration adsConfiguration;

        @Nullable
        public final String customCacheKey;

        @Nullable
        public final DrmConfiguration drmConfiguration;

        @Nullable
        public final String mimeType;
        public final List<StreamKey> streamKeys;
        public final List<Subtitle> subtitles;

        @Nullable
        public final Object tag;
        public final Uri uri;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlaybackProperties)) {
                return false;
            }
            PlaybackProperties playbackProperties = (PlaybackProperties) obj;
            return this.uri.equals(playbackProperties.uri) && Util.areEqual(this.mimeType, playbackProperties.mimeType) && Util.areEqual(this.drmConfiguration, playbackProperties.drmConfiguration) && Util.areEqual(this.adsConfiguration, playbackProperties.adsConfiguration) && this.streamKeys.equals(playbackProperties.streamKeys) && Util.areEqual(this.customCacheKey, playbackProperties.customCacheKey) && this.subtitles.equals(playbackProperties.subtitles) && Util.areEqual(this.tag, playbackProperties.tag);
        }

        public int hashCode() {
            int iHashCode = this.uri.hashCode() * 31;
            String str = this.mimeType;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            DrmConfiguration drmConfiguration = this.drmConfiguration;
            int iHashCode3 = (iHashCode2 + (drmConfiguration == null ? 0 : drmConfiguration.hashCode())) * 31;
            AdsConfiguration adsConfiguration = this.adsConfiguration;
            int iHashCode4 = (((iHashCode3 + (adsConfiguration == null ? 0 : adsConfiguration.hashCode())) * 31) + this.streamKeys.hashCode()) * 31;
            String str2 = this.customCacheKey;
            int iHashCode5 = (((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.subtitles.hashCode()) * 31;
            Object obj = this.tag;
            return iHashCode5 + (obj != null ? obj.hashCode() : 0);
        }

        private PlaybackProperties(Uri uri, @Nullable String mimeType, @Nullable DrmConfiguration drmConfiguration, @Nullable AdsConfiguration adsConfiguration, List<StreamKey> streamKeys, @Nullable String customCacheKey, List<Subtitle> subtitles, @Nullable Object tag) {
            this.uri = uri;
            this.mimeType = mimeType;
            this.drmConfiguration = drmConfiguration;
            this.adsConfiguration = adsConfiguration;
            this.streamKeys = streamKeys;
            this.customCacheKey = customCacheKey;
            this.subtitles = subtitles;
            this.tag = tag;
        }
    }

    public static final class Subtitle {

        @Nullable
        public final String label;

        @Nullable
        public final String language;
        public final String mimeType;
        public final int roleFlags;
        public final int selectionFlags;
        public final Uri uri;

        public Subtitle(Uri uri, String mimeType, @Nullable String language) {
            this(uri, mimeType, language, 0);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Subtitle)) {
                return false;
            }
            Subtitle subtitle = (Subtitle) obj;
            return this.uri.equals(subtitle.uri) && this.mimeType.equals(subtitle.mimeType) && Util.areEqual(this.language, subtitle.language) && this.selectionFlags == subtitle.selectionFlags && this.roleFlags == subtitle.roleFlags && Util.areEqual(this.label, subtitle.label);
        }

        public int hashCode() {
            int iHashCode = ((this.uri.hashCode() * 31) + this.mimeType.hashCode()) * 31;
            String str = this.language;
            int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.selectionFlags) * 31) + this.roleFlags) * 31;
            String str2 = this.label;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public Subtitle(Uri uri, String mimeType, @Nullable String language, int selectionFlags) {
            this(uri, mimeType, language, selectionFlags, 0, null);
        }

        public Subtitle(Uri uri, String mimeType, @Nullable String language, int selectionFlags, int roleFlags, @Nullable String label) {
            this.uri = uri;
            this.mimeType = mimeType;
            this.language = language;
            this.selectionFlags = selectionFlags;
            this.roleFlags = roleFlags;
            this.label = label;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MediaItem b(Bundle bundle) {
        String str = (String) Assertions.checkNotNull(bundle.getString(c(0), ""));
        Bundle bundle2 = bundle.getBundle(c(1));
        LiveConfiguration liveConfiguration = bundle2 == null ? LiveConfiguration.UNSET : (LiveConfiguration) LiveConfiguration.CREATOR.fromBundle(bundle2);
        Bundle bundle3 = bundle.getBundle(c(2));
        MediaMetadata mediaMetadata = bundle3 == null ? MediaMetadata.EMPTY : (MediaMetadata) MediaMetadata.CREATOR.fromBundle(bundle3);
        Bundle bundle4 = bundle.getBundle(c(3));
        return new MediaItem(str, bundle4 == null ? new ClippingProperties(0L, Long.MIN_VALUE, false, false, false) : (ClippingProperties) ClippingProperties.CREATOR.fromBundle(bundle4), null, liveConfiguration, mediaMetadata);
    }

    private static String c(int field) {
        return Integer.toString(field, 36);
    }

    public static MediaItem fromUri(String uri) {
        return new Builder().setUri(uri).build();
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaItem)) {
            return false;
        }
        MediaItem mediaItem = (MediaItem) obj;
        return Util.areEqual(this.mediaId, mediaItem.mediaId) && this.clippingProperties.equals(mediaItem.clippingProperties) && Util.areEqual(this.playbackProperties, mediaItem.playbackProperties) && Util.areEqual(this.liveConfiguration, mediaItem.liveConfiguration) && Util.areEqual(this.mediaMetadata, mediaItem.mediaMetadata);
    }

    public int hashCode() {
        int iHashCode = this.mediaId.hashCode() * 31;
        PlaybackProperties playbackProperties = this.playbackProperties;
        return ((((((iHashCode + (playbackProperties != null ? playbackProperties.hashCode() : 0)) * 31) + this.liveConfiguration.hashCode()) * 31) + this.clippingProperties.hashCode()) * 31) + this.mediaMetadata.hashCode();
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(c(0), this.mediaId);
        bundle.putBundle(c(1), this.liveConfiguration.toBundle());
        bundle.putBundle(c(2), this.mediaMetadata.toBundle());
        bundle.putBundle(c(3), this.clippingProperties.toBundle());
        return bundle;
    }

    private MediaItem(String mediaId, ClippingProperties clippingProperties, @Nullable PlaybackProperties playbackProperties, LiveConfiguration liveConfiguration, MediaMetadata mediaMetadata) {
        this.mediaId = mediaId;
        this.playbackProperties = playbackProperties;
        this.liveConfiguration = liveConfiguration;
        this.mediaMetadata = mediaMetadata;
        this.clippingProperties = clippingProperties;
    }

    public static MediaItem fromUri(Uri uri) {
        return new Builder().setUri(uri).build();
    }
}
