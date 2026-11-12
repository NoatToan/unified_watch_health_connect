package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes13.dex */
public final class MediaItem implements Bundleable {
    public static final String DEFAULT_MEDIA_ID = "";
    private static final int FIELD_CLIPPING_PROPERTIES = 3;
    private static final int FIELD_LIVE_CONFIGURATION = 1;
    private static final int FIELD_MEDIA_ID = 0;
    private static final int FIELD_MEDIA_METADATA = 2;
    public final ClippingConfiguration clippingConfiguration;

    @Deprecated
    public final ClippingProperties clippingProperties;
    public final LiveConfiguration liveConfiguration;
    public final LocalConfiguration localConfiguration;
    public final String mediaId;
    public final MediaMetadata mediaMetadata;

    @Deprecated
    public final PlaybackProperties playbackProperties;
    public static final MediaItem EMPTY = new Builder().build();
    public static final Bundleable.Creator<MediaItem> CREATOR = new v(11);

    public static final class AdsConfiguration {
        public final Uri adTagUri;
        public final Object adsId;

        public static final class Builder {
            private Uri adTagUri;
            private Object adsId;

            public Builder(Uri uri) {
                this.adTagUri = uri;
            }

            public AdsConfiguration build() {
                return new AdsConfiguration(this);
            }

            public Builder setAdTagUri(Uri uri) {
                this.adTagUri = uri;
                return this;
            }

            public Builder setAdsId(Object obj) {
                this.adsId = obj;
                return this;
            }
        }

        private AdsConfiguration(Builder builder) {
            this.adTagUri = builder.adTagUri;
            this.adsId = builder.adsId;
        }

        public Builder buildUpon() {
            return new Builder(this.adTagUri).setAdsId(this.adsId);
        }

        public boolean equals(Object obj) {
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
    }

    @Deprecated
    public static final class ClippingProperties extends ClippingConfiguration {
        public static final ClippingProperties UNSET = new ClippingConfiguration.Builder().buildClippingProperties();

        private ClippingProperties(ClippingConfiguration.Builder builder) {
            super(builder);
        }
    }

    public static class LocalConfiguration {
        public final AdsConfiguration adsConfiguration;
        public final String customCacheKey;
        public final DrmConfiguration drmConfiguration;
        public final String mimeType;
        public final List<StreamKey> streamKeys;
        public final ImmutableList<SubtitleConfiguration> subtitleConfigurations;

        @Deprecated
        public final List<Subtitle> subtitles;
        public final Object tag;
        public final Uri uri;

        private LocalConfiguration(Uri uri, String str, DrmConfiguration drmConfiguration, AdsConfiguration adsConfiguration, List<StreamKey> list, String str2, ImmutableList<SubtitleConfiguration> immutableList, Object obj) {
            this.uri = uri;
            this.mimeType = str;
            this.drmConfiguration = drmConfiguration;
            this.adsConfiguration = adsConfiguration;
            this.streamKeys = list;
            this.customCacheKey = str2;
            this.subtitleConfigurations = immutableList;
            ImmutableList.Builder builder = ImmutableList.builder();
            for (int i14 = 0; i14 < immutableList.size(); i14++) {
                builder.add(immutableList.get(i14).buildUpon().buildSubtitle());
            }
            this.subtitles = builder.build();
            this.tag = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocalConfiguration)) {
                return false;
            }
            LocalConfiguration localConfiguration = (LocalConfiguration) obj;
            return this.uri.equals(localConfiguration.uri) && Util.areEqual(this.mimeType, localConfiguration.mimeType) && Util.areEqual(this.drmConfiguration, localConfiguration.drmConfiguration) && Util.areEqual(this.adsConfiguration, localConfiguration.adsConfiguration) && this.streamKeys.equals(localConfiguration.streamKeys) && Util.areEqual(this.customCacheKey, localConfiguration.customCacheKey) && this.subtitleConfigurations.equals(localConfiguration.subtitleConfigurations) && Util.areEqual(this.tag, localConfiguration.tag);
        }

        public int hashCode() {
            int iHashCode = this.uri.hashCode() * 31;
            String str = this.mimeType;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            DrmConfiguration drmConfiguration = this.drmConfiguration;
            int iHashCode3 = (iHashCode2 + (drmConfiguration == null ? 0 : drmConfiguration.hashCode())) * 31;
            AdsConfiguration adsConfiguration = this.adsConfiguration;
            int iHashCode4 = (this.streamKeys.hashCode() + ((iHashCode3 + (adsConfiguration == null ? 0 : adsConfiguration.hashCode())) * 31)) * 31;
            String str2 = this.customCacheKey;
            int iHashCode5 = (this.subtitleConfigurations.hashCode() + ((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            Object obj = this.tag;
            return iHashCode5 + (obj != null ? obj.hashCode() : 0);
        }
    }

    @Deprecated
    public static final class PlaybackProperties extends LocalConfiguration {
        private PlaybackProperties(Uri uri, String str, DrmConfiguration drmConfiguration, AdsConfiguration adsConfiguration, List<StreamKey> list, String str2, ImmutableList<SubtitleConfiguration> immutableList, Object obj) {
            super(uri, str, drmConfiguration, adsConfiguration, list, str2, immutableList, obj);
        }
    }

    private MediaItem(String str, ClippingProperties clippingProperties, PlaybackProperties playbackProperties, LiveConfiguration liveConfiguration, MediaMetadata mediaMetadata) {
        this.mediaId = str;
        this.localConfiguration = playbackProperties;
        this.playbackProperties = playbackProperties;
        this.liveConfiguration = liveConfiguration;
        this.mediaMetadata = mediaMetadata;
        this.clippingConfiguration = clippingProperties;
        this.clippingProperties = clippingProperties;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MediaItem fromBundle(Bundle bundle) {
        String str = (String) Assertions.checkNotNull(bundle.getString(keyForField(0), ""));
        Bundle bundle2 = bundle.getBundle(keyForField(1));
        LiveConfiguration liveConfiguration = bundle2 == null ? LiveConfiguration.UNSET : (LiveConfiguration) LiveConfiguration.CREATOR.fromBundle(bundle2);
        Bundle bundle3 = bundle.getBundle(keyForField(2));
        MediaMetadata mediaMetadata = bundle3 == null ? MediaMetadata.EMPTY : (MediaMetadata) MediaMetadata.CREATOR.fromBundle(bundle3);
        Bundle bundle4 = bundle.getBundle(keyForField(3));
        return new MediaItem(str, bundle4 == null ? ClippingProperties.UNSET : (ClippingProperties) ClippingConfiguration.CREATOR.fromBundle(bundle4), null, liveConfiguration, mediaMetadata);
    }

    public static MediaItem fromUri(String str) {
        return new Builder().setUri(str).build();
    }

    private static String keyForField(int i14) {
        return Integer.toString(i14, 36);
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaItem)) {
            return false;
        }
        MediaItem mediaItem = (MediaItem) obj;
        return Util.areEqual(this.mediaId, mediaItem.mediaId) && this.clippingConfiguration.equals(mediaItem.clippingConfiguration) && Util.areEqual(this.localConfiguration, mediaItem.localConfiguration) && Util.areEqual(this.liveConfiguration, mediaItem.liveConfiguration) && Util.areEqual(this.mediaMetadata, mediaItem.mediaMetadata);
    }

    public int hashCode() {
        int iHashCode = this.mediaId.hashCode() * 31;
        LocalConfiguration localConfiguration = this.localConfiguration;
        return this.mediaMetadata.hashCode() + ((this.clippingConfiguration.hashCode() + ((this.liveConfiguration.hashCode() + ((iHashCode + (localConfiguration != null ? localConfiguration.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(keyForField(0), this.mediaId);
        bundle.putBundle(keyForField(1), this.liveConfiguration.toBundle());
        bundle.putBundle(keyForField(2), this.mediaMetadata.toBundle());
        bundle.putBundle(keyForField(3), this.clippingConfiguration.toBundle());
        return bundle;
    }

    public static final class Builder {
        private AdsConfiguration adsConfiguration;
        private ClippingConfiguration.Builder clippingConfiguration;
        private String customCacheKey;
        private DrmConfiguration.Builder drmConfiguration;
        private LiveConfiguration.Builder liveConfiguration;
        private String mediaId;
        private MediaMetadata mediaMetadata;
        private String mimeType;
        private List<StreamKey> streamKeys;
        private ImmutableList<SubtitleConfiguration> subtitleConfigurations;
        private Object tag;
        private Uri uri;

        private Builder(MediaItem mediaItem) {
            this();
            this.clippingConfiguration = mediaItem.clippingConfiguration.buildUpon();
            this.mediaId = mediaItem.mediaId;
            this.mediaMetadata = mediaItem.mediaMetadata;
            this.liveConfiguration = mediaItem.liveConfiguration.buildUpon();
            LocalConfiguration localConfiguration = mediaItem.localConfiguration;
            if (localConfiguration != null) {
                this.customCacheKey = localConfiguration.customCacheKey;
                this.mimeType = localConfiguration.mimeType;
                this.uri = localConfiguration.uri;
                this.streamKeys = localConfiguration.streamKeys;
                this.subtitleConfigurations = localConfiguration.subtitleConfigurations;
                this.tag = localConfiguration.tag;
                DrmConfiguration drmConfiguration = localConfiguration.drmConfiguration;
                this.drmConfiguration = drmConfiguration != null ? drmConfiguration.buildUpon() : new DrmConfiguration.Builder();
                this.adsConfiguration = localConfiguration.adsConfiguration;
            }
        }

        public MediaItem build() {
            PlaybackProperties playbackProperties;
            Assertions.checkState(this.drmConfiguration.licenseUri == null || this.drmConfiguration.scheme != null);
            Uri uri = this.uri;
            if (uri != null) {
                playbackProperties = new PlaybackProperties(uri, this.mimeType, this.drmConfiguration.scheme != null ? this.drmConfiguration.build() : null, this.adsConfiguration, this.streamKeys, this.customCacheKey, this.subtitleConfigurations, this.tag);
            } else {
                playbackProperties = null;
            }
            String str = this.mediaId;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            ClippingProperties clippingPropertiesBuildClippingProperties = this.clippingConfiguration.buildClippingProperties();
            LiveConfiguration liveConfigurationBuild = this.liveConfiguration.build();
            MediaMetadata mediaMetadata = this.mediaMetadata;
            if (mediaMetadata == null) {
                mediaMetadata = MediaMetadata.EMPTY;
            }
            return new MediaItem(str2, clippingPropertiesBuildClippingProperties, playbackProperties, liveConfigurationBuild, mediaMetadata);
        }

        @Deprecated
        public Builder setAdTagUri(Uri uri, Object obj) {
            this.adsConfiguration = uri != null ? new AdsConfiguration.Builder(uri).setAdsId(obj).build() : null;
            return this;
        }

        public Builder setAdsConfiguration(AdsConfiguration adsConfiguration) {
            this.adsConfiguration = adsConfiguration;
            return this;
        }

        @Deprecated
        public Builder setClipEndPositionMs(long j8) {
            this.clippingConfiguration.setEndPositionMs(j8);
            return this;
        }

        @Deprecated
        public Builder setClipRelativeToDefaultPosition(boolean z14) {
            this.clippingConfiguration.setRelativeToDefaultPosition(z14);
            return this;
        }

        @Deprecated
        public Builder setClipRelativeToLiveWindow(boolean z14) {
            this.clippingConfiguration.setRelativeToLiveWindow(z14);
            return this;
        }

        @Deprecated
        public Builder setClipStartPositionMs(long j8) {
            this.clippingConfiguration.setStartPositionMs(j8);
            return this;
        }

        @Deprecated
        public Builder setClipStartsAtKeyFrame(boolean z14) {
            this.clippingConfiguration.setStartsAtKeyFrame(z14);
            return this;
        }

        public Builder setClippingConfiguration(ClippingConfiguration clippingConfiguration) {
            this.clippingConfiguration = clippingConfiguration.buildUpon();
            return this;
        }

        public Builder setCustomCacheKey(String str) {
            this.customCacheKey = str;
            return this;
        }

        public Builder setDrmConfiguration(DrmConfiguration drmConfiguration) {
            this.drmConfiguration = drmConfiguration != null ? drmConfiguration.buildUpon() : new DrmConfiguration.Builder();
            return this;
        }

        @Deprecated
        public Builder setDrmForceDefaultLicenseUri(boolean z14) {
            this.drmConfiguration.setForceDefaultLicenseUri(z14);
            return this;
        }

        @Deprecated
        public Builder setDrmKeySetId(byte[] bArr) {
            this.drmConfiguration.setKeySetId(bArr);
            return this;
        }

        @Deprecated
        public Builder setDrmLicenseRequestHeaders(Map<String, String> map) {
            DrmConfiguration.Builder builder = this.drmConfiguration;
            if (map == null) {
                map = ImmutableMap.of();
            }
            builder.setLicenseRequestHeaders(map);
            return this;
        }

        @Deprecated
        public Builder setDrmLicenseUri(Uri uri) {
            this.drmConfiguration.setLicenseUri(uri);
            return this;
        }

        @Deprecated
        public Builder setDrmMultiSession(boolean z14) {
            this.drmConfiguration.setMultiSession(z14);
            return this;
        }

        @Deprecated
        public Builder setDrmPlayClearContentWithoutKey(boolean z14) {
            this.drmConfiguration.setPlayClearContentWithoutKey(z14);
            return this;
        }

        @Deprecated
        public Builder setDrmSessionForClearPeriods(boolean z14) {
            this.drmConfiguration.forceSessionsForAudioAndVideoTracks(z14);
            return this;
        }

        @Deprecated
        public Builder setDrmSessionForClearTypes(List<Integer> list) {
            DrmConfiguration.Builder builder = this.drmConfiguration;
            if (list == null) {
                list = ImmutableList.of();
            }
            builder.setForcedSessionTrackTypes(list);
            return this;
        }

        @Deprecated
        public Builder setDrmUuid(UUID uuid) {
            this.drmConfiguration.setNullableScheme(uuid);
            return this;
        }

        public Builder setLiveConfiguration(LiveConfiguration liveConfiguration) {
            this.liveConfiguration = liveConfiguration.buildUpon();
            return this;
        }

        @Deprecated
        public Builder setLiveMaxOffsetMs(long j8) {
            this.liveConfiguration.setMaxOffsetMs(j8);
            return this;
        }

        @Deprecated
        public Builder setLiveMaxPlaybackSpeed(float f14) {
            this.liveConfiguration.setMaxPlaybackSpeed(f14);
            return this;
        }

        @Deprecated
        public Builder setLiveMinOffsetMs(long j8) {
            this.liveConfiguration.setMinOffsetMs(j8);
            return this;
        }

        @Deprecated
        public Builder setLiveMinPlaybackSpeed(float f14) {
            this.liveConfiguration.setMinPlaybackSpeed(f14);
            return this;
        }

        @Deprecated
        public Builder setLiveTargetOffsetMs(long j8) {
            this.liveConfiguration.setTargetOffsetMs(j8);
            return this;
        }

        public Builder setMediaId(String str) {
            this.mediaId = (String) Assertions.checkNotNull(str);
            return this;
        }

        public Builder setMediaMetadata(MediaMetadata mediaMetadata) {
            this.mediaMetadata = mediaMetadata;
            return this;
        }

        public Builder setMimeType(String str) {
            this.mimeType = str;
            return this;
        }

        public Builder setStreamKeys(List<StreamKey> list) {
            this.streamKeys = (list == null || list.isEmpty()) ? Collections.EMPTY_LIST : Collections.unmodifiableList(new ArrayList(list));
            return this;
        }

        public Builder setSubtitleConfigurations(List<SubtitleConfiguration> list) {
            this.subtitleConfigurations = ImmutableList.copyOf((Collection) list);
            return this;
        }

        @Deprecated
        public Builder setSubtitles(List<Subtitle> list) {
            this.subtitleConfigurations = list != null ? ImmutableList.copyOf((Collection) list) : ImmutableList.of();
            return this;
        }

        public Builder setTag(Object obj) {
            this.tag = obj;
            return this;
        }

        public Builder setUri(String str) {
            return setUri(str == null ? null : Uri.parse(str));
        }

        @Deprecated
        public Builder setDrmLicenseUri(String str) {
            this.drmConfiguration.setLicenseUri(str);
            return this;
        }

        public Builder setUri(Uri uri) {
            this.uri = uri;
            return this;
        }

        @Deprecated
        public Builder setAdTagUri(Uri uri) {
            return setAdTagUri(uri, null);
        }

        @Deprecated
        public Builder setAdTagUri(String str) {
            return setAdTagUri(str != null ? Uri.parse(str) : null);
        }

        public Builder() {
            this.clippingConfiguration = new ClippingConfiguration.Builder();
            this.drmConfiguration = new DrmConfiguration.Builder();
            this.streamKeys = Collections.EMPTY_LIST;
            this.subtitleConfigurations = ImmutableList.of();
            this.liveConfiguration = new LiveConfiguration.Builder();
        }
    }

    public static final class DrmConfiguration {
        public final boolean forceDefaultLicenseUri;
        public final ImmutableList<Integer> forcedSessionTrackTypes;
        private final byte[] keySetId;
        public final ImmutableMap<String, String> licenseRequestHeaders;
        public final Uri licenseUri;
        public final boolean multiSession;
        public final boolean playClearContentWithoutKey;

        @Deprecated
        public final ImmutableMap<String, String> requestHeaders;
        public final UUID scheme;

        @Deprecated
        public final ImmutableList<Integer> sessionForClearTypes;

        @Deprecated
        public final UUID uuid;

        private DrmConfiguration(Builder builder) {
            Assertions.checkState((builder.forceDefaultLicenseUri && builder.licenseUri == null) ? false : true);
            UUID uuid = (UUID) Assertions.checkNotNull(builder.scheme);
            this.scheme = uuid;
            this.uuid = uuid;
            this.licenseUri = builder.licenseUri;
            this.requestHeaders = builder.licenseRequestHeaders;
            this.licenseRequestHeaders = builder.licenseRequestHeaders;
            this.multiSession = builder.multiSession;
            this.forceDefaultLicenseUri = builder.forceDefaultLicenseUri;
            this.playClearContentWithoutKey = builder.playClearContentWithoutKey;
            this.sessionForClearTypes = builder.forcedSessionTrackTypes;
            this.forcedSessionTrackTypes = builder.forcedSessionTrackTypes;
            this.keySetId = builder.keySetId != null ? Arrays.copyOf(builder.keySetId, builder.keySetId.length) : null;
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DrmConfiguration)) {
                return false;
            }
            DrmConfiguration drmConfiguration = (DrmConfiguration) obj;
            return this.scheme.equals(drmConfiguration.scheme) && Util.areEqual(this.licenseUri, drmConfiguration.licenseUri) && Util.areEqual(this.licenseRequestHeaders, drmConfiguration.licenseRequestHeaders) && this.multiSession == drmConfiguration.multiSession && this.forceDefaultLicenseUri == drmConfiguration.forceDefaultLicenseUri && this.playClearContentWithoutKey == drmConfiguration.playClearContentWithoutKey && this.forcedSessionTrackTypes.equals(drmConfiguration.forcedSessionTrackTypes) && Arrays.equals(this.keySetId, drmConfiguration.keySetId);
        }

        public byte[] getKeySetId() {
            byte[] bArr = this.keySetId;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public int hashCode() {
            int iHashCode = this.scheme.hashCode() * 31;
            Uri uri = this.licenseUri;
            return Arrays.hashCode(this.keySetId) + ((this.forcedSessionTrackTypes.hashCode() + ((((((((this.licenseRequestHeaders.hashCode() + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.multiSession ? 1 : 0)) * 31) + (this.forceDefaultLicenseUri ? 1 : 0)) * 31) + (this.playClearContentWithoutKey ? 1 : 0)) * 31)) * 31);
        }

        public static final class Builder {
            private boolean forceDefaultLicenseUri;
            private ImmutableList<Integer> forcedSessionTrackTypes;
            private byte[] keySetId;
            private ImmutableMap<String, String> licenseRequestHeaders;
            private Uri licenseUri;
            private boolean multiSession;
            private boolean playClearContentWithoutKey;
            private UUID scheme;

            private Builder(DrmConfiguration drmConfiguration) {
                this.scheme = drmConfiguration.scheme;
                this.licenseUri = drmConfiguration.licenseUri;
                this.licenseRequestHeaders = drmConfiguration.licenseRequestHeaders;
                this.multiSession = drmConfiguration.multiSession;
                this.playClearContentWithoutKey = drmConfiguration.playClearContentWithoutKey;
                this.forceDefaultLicenseUri = drmConfiguration.forceDefaultLicenseUri;
                this.forcedSessionTrackTypes = drmConfiguration.forcedSessionTrackTypes;
                this.keySetId = drmConfiguration.keySetId;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Deprecated
            public Builder setNullableScheme(UUID uuid) {
                this.scheme = uuid;
                return this;
            }

            public DrmConfiguration build() {
                return new DrmConfiguration(this);
            }

            public Builder forceSessionsForAudioAndVideoTracks(boolean z14) {
                setForcedSessionTrackTypes(z14 ? ImmutableList.of(2, 1) : ImmutableList.of());
                return this;
            }

            public Builder setForceDefaultLicenseUri(boolean z14) {
                this.forceDefaultLicenseUri = z14;
                return this;
            }

            public Builder setForcedSessionTrackTypes(List<Integer> list) {
                this.forcedSessionTrackTypes = ImmutableList.copyOf((Collection) list);
                return this;
            }

            public Builder setKeySetId(byte[] bArr) {
                this.keySetId = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
                return this;
            }

            public Builder setLicenseRequestHeaders(Map<String, String> map) {
                this.licenseRequestHeaders = ImmutableMap.copyOf((Map) map);
                return this;
            }

            public Builder setLicenseUri(String str) {
                this.licenseUri = str == null ? null : Uri.parse(str);
                return this;
            }

            public Builder setMultiSession(boolean z14) {
                this.multiSession = z14;
                return this;
            }

            public Builder setPlayClearContentWithoutKey(boolean z14) {
                this.playClearContentWithoutKey = z14;
                return this;
            }

            public Builder setScheme(UUID uuid) {
                this.scheme = uuid;
                return this;
            }

            public Builder setLicenseUri(Uri uri) {
                this.licenseUri = uri;
                return this;
            }

            public Builder(UUID uuid) {
                this.scheme = uuid;
                this.licenseRequestHeaders = ImmutableMap.of();
                this.forcedSessionTrackTypes = ImmutableList.of();
            }

            @Deprecated
            private Builder() {
                this.licenseRequestHeaders = ImmutableMap.of();
                this.forcedSessionTrackTypes = ImmutableList.of();
            }
        }
    }

    @Deprecated
    public static final class Subtitle extends SubtitleConfiguration {
        @Deprecated
        public Subtitle(Uri uri, String str, String str2, int i14, int i15, String str3) {
            super(uri, str, str2, i14, i15, str3, null);
        }

        @Deprecated
        public Subtitle(Uri uri, String str, String str2) {
            this(uri, str, str2, 0);
        }

        @Deprecated
        public Subtitle(Uri uri, String str, String str2, int i14) {
            this(uri, str, str2, i14, 0, null);
        }

        private Subtitle(SubtitleConfiguration.Builder builder) {
            super(builder);
        }
    }

    public static MediaItem fromUri(Uri uri) {
        return new Builder().setUri(uri).build();
    }

    public static class ClippingConfiguration implements Bundleable {
        private static final int FIELD_END_POSITION_MS = 1;
        private static final int FIELD_RELATIVE_TO_DEFAULT_POSITION = 3;
        private static final int FIELD_RELATIVE_TO_LIVE_WINDOW = 2;
        private static final int FIELD_STARTS_AT_KEY_FRAME = 4;
        private static final int FIELD_START_POSITION_MS = 0;
        public final long endPositionMs;
        public final boolean relativeToDefaultPosition;
        public final boolean relativeToLiveWindow;
        public final long startPositionMs;
        public final boolean startsAtKeyFrame;
        public static final ClippingConfiguration UNSET = new Builder().build();
        public static final Bundleable.Creator<ClippingProperties> CREATOR = new v(12);

        private ClippingConfiguration(Builder builder) {
            this.startPositionMs = builder.startPositionMs;
            this.endPositionMs = builder.endPositionMs;
            this.relativeToLiveWindow = builder.relativeToLiveWindow;
            this.relativeToDefaultPosition = builder.relativeToDefaultPosition;
            this.startsAtKeyFrame = builder.startsAtKeyFrame;
        }

        private static String keyForField(int i14) {
            return Integer.toString(i14, 36);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ ClippingProperties lambda$static$0(Bundle bundle) {
            return new Builder().setStartPositionMs(bundle.getLong(keyForField(0), 0L)).setEndPositionMs(bundle.getLong(keyForField(1), Long.MIN_VALUE)).setRelativeToLiveWindow(bundle.getBoolean(keyForField(2), false)).setRelativeToDefaultPosition(bundle.getBoolean(keyForField(3), false)).setStartsAtKeyFrame(bundle.getBoolean(keyForField(4), false)).buildClippingProperties();
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClippingConfiguration)) {
                return false;
            }
            ClippingConfiguration clippingConfiguration = (ClippingConfiguration) obj;
            return this.startPositionMs == clippingConfiguration.startPositionMs && this.endPositionMs == clippingConfiguration.endPositionMs && this.relativeToLiveWindow == clippingConfiguration.relativeToLiveWindow && this.relativeToDefaultPosition == clippingConfiguration.relativeToDefaultPosition && this.startsAtKeyFrame == clippingConfiguration.startsAtKeyFrame;
        }

        public int hashCode() {
            long j8 = this.startPositionMs;
            int i14 = ((int) (j8 ^ (j8 >>> 32))) * 31;
            long j14 = this.endPositionMs;
            return ((((((i14 + ((int) ((j14 >>> 32) ^ j14))) * 31) + (this.relativeToLiveWindow ? 1 : 0)) * 31) + (this.relativeToDefaultPosition ? 1 : 0)) * 31) + (this.startsAtKeyFrame ? 1 : 0);
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putLong(keyForField(0), this.startPositionMs);
            bundle.putLong(keyForField(1), this.endPositionMs);
            bundle.putBoolean(keyForField(2), this.relativeToLiveWindow);
            bundle.putBoolean(keyForField(3), this.relativeToDefaultPosition);
            bundle.putBoolean(keyForField(4), this.startsAtKeyFrame);
            return bundle;
        }

        public static final class Builder {
            private long endPositionMs;
            private boolean relativeToDefaultPosition;
            private boolean relativeToLiveWindow;
            private long startPositionMs;
            private boolean startsAtKeyFrame;

            private Builder(ClippingConfiguration clippingConfiguration) {
                this.startPositionMs = clippingConfiguration.startPositionMs;
                this.endPositionMs = clippingConfiguration.endPositionMs;
                this.relativeToLiveWindow = clippingConfiguration.relativeToLiveWindow;
                this.relativeToDefaultPosition = clippingConfiguration.relativeToDefaultPosition;
                this.startsAtKeyFrame = clippingConfiguration.startsAtKeyFrame;
            }

            public ClippingConfiguration build() {
                return buildClippingProperties();
            }

            @Deprecated
            public ClippingProperties buildClippingProperties() {
                return new ClippingProperties(this);
            }

            public Builder setEndPositionMs(long j8) {
                Assertions.checkArgument(j8 == Long.MIN_VALUE || j8 >= 0);
                this.endPositionMs = j8;
                return this;
            }

            public Builder setRelativeToDefaultPosition(boolean z14) {
                this.relativeToDefaultPosition = z14;
                return this;
            }

            public Builder setRelativeToLiveWindow(boolean z14) {
                this.relativeToLiveWindow = z14;
                return this;
            }

            public Builder setStartPositionMs(long j8) {
                Assertions.checkArgument(j8 >= 0);
                this.startPositionMs = j8;
                return this;
            }

            public Builder setStartsAtKeyFrame(boolean z14) {
                this.startsAtKeyFrame = z14;
                return this;
            }

            public Builder() {
                this.endPositionMs = Long.MIN_VALUE;
            }
        }
    }

    public static final class LiveConfiguration implements Bundleable {
        private static final int FIELD_MAX_OFFSET_MS = 2;
        private static final int FIELD_MAX_PLAYBACK_SPEED = 4;
        private static final int FIELD_MIN_OFFSET_MS = 1;
        private static final int FIELD_MIN_PLAYBACK_SPEED = 3;
        private static final int FIELD_TARGET_OFFSET_MS = 0;
        public final long maxOffsetMs;
        public final float maxPlaybackSpeed;
        public final long minOffsetMs;
        public final float minPlaybackSpeed;
        public final long targetOffsetMs;
        public static final LiveConfiguration UNSET = new Builder().build();
        public static final Bundleable.Creator<LiveConfiguration> CREATOR = new v(13);

        private LiveConfiguration(Builder builder) {
            this(builder.targetOffsetMs, builder.minOffsetMs, builder.maxOffsetMs, builder.minPlaybackSpeed, builder.maxPlaybackSpeed);
        }

        private static String keyForField(int i14) {
            return Integer.toString(i14, 36);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ LiveConfiguration lambda$static$0(Bundle bundle) {
            return new LiveConfiguration(bundle.getLong(keyForField(0), C.TIME_UNSET), bundle.getLong(keyForField(1), C.TIME_UNSET), bundle.getLong(keyForField(2), C.TIME_UNSET), bundle.getFloat(keyForField(3), -3.4028235E38f), bundle.getFloat(keyForField(4), -3.4028235E38f));
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public boolean equals(Object obj) {
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
            long j8 = this.targetOffsetMs;
            long j14 = this.minOffsetMs;
            int i14 = ((((int) (j8 ^ (j8 >>> 32))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31;
            long j15 = this.maxOffsetMs;
            int i15 = (i14 + ((int) ((j15 >>> 32) ^ j15))) * 31;
            float f14 = this.minPlaybackSpeed;
            int iFloatToIntBits = (i15 + (f14 != 0.0f ? Float.floatToIntBits(f14) : 0)) * 31;
            float f15 = this.maxPlaybackSpeed;
            return iFloatToIntBits + (f15 != 0.0f ? Float.floatToIntBits(f15) : 0);
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putLong(keyForField(0), this.targetOffsetMs);
            bundle.putLong(keyForField(1), this.minOffsetMs);
            bundle.putLong(keyForField(2), this.maxOffsetMs);
            bundle.putFloat(keyForField(3), this.minPlaybackSpeed);
            bundle.putFloat(keyForField(4), this.maxPlaybackSpeed);
            return bundle;
        }

        public static final class Builder {
            private long maxOffsetMs;
            private float maxPlaybackSpeed;
            private long minOffsetMs;
            private float minPlaybackSpeed;
            private long targetOffsetMs;

            private Builder(LiveConfiguration liveConfiguration) {
                this.targetOffsetMs = liveConfiguration.targetOffsetMs;
                this.minOffsetMs = liveConfiguration.minOffsetMs;
                this.maxOffsetMs = liveConfiguration.maxOffsetMs;
                this.minPlaybackSpeed = liveConfiguration.minPlaybackSpeed;
                this.maxPlaybackSpeed = liveConfiguration.maxPlaybackSpeed;
            }

            public LiveConfiguration build() {
                return new LiveConfiguration(this);
            }

            public Builder setMaxOffsetMs(long j8) {
                this.maxOffsetMs = j8;
                return this;
            }

            public Builder setMaxPlaybackSpeed(float f14) {
                this.maxPlaybackSpeed = f14;
                return this;
            }

            public Builder setMinOffsetMs(long j8) {
                this.minOffsetMs = j8;
                return this;
            }

            public Builder setMinPlaybackSpeed(float f14) {
                this.minPlaybackSpeed = f14;
                return this;
            }

            public Builder setTargetOffsetMs(long j8) {
                this.targetOffsetMs = j8;
                return this;
            }

            public Builder() {
                this.targetOffsetMs = C.TIME_UNSET;
                this.minOffsetMs = C.TIME_UNSET;
                this.maxOffsetMs = C.TIME_UNSET;
                this.minPlaybackSpeed = -3.4028235E38f;
                this.maxPlaybackSpeed = -3.4028235E38f;
            }
        }

        @Deprecated
        public LiveConfiguration(long j8, long j14, long j15, float f14, float f15) {
            this.targetOffsetMs = j8;
            this.minOffsetMs = j14;
            this.maxOffsetMs = j15;
            this.minPlaybackSpeed = f14;
            this.maxPlaybackSpeed = f15;
        }
    }

    public static class SubtitleConfiguration {

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public final String f52875id;
        public final String label;
        public final String language;
        public final String mimeType;
        public final int roleFlags;
        public final int selectionFlags;
        public final Uri uri;

        private SubtitleConfiguration(Builder builder) {
            this.uri = builder.uri;
            this.mimeType = builder.mimeType;
            this.language = builder.language;
            this.selectionFlags = builder.selectionFlags;
            this.roleFlags = builder.roleFlags;
            this.label = builder.label;
            this.f52875id = builder.f52876id;
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubtitleConfiguration)) {
                return false;
            }
            SubtitleConfiguration subtitleConfiguration = (SubtitleConfiguration) obj;
            return this.uri.equals(subtitleConfiguration.uri) && Util.areEqual(this.mimeType, subtitleConfiguration.mimeType) && Util.areEqual(this.language, subtitleConfiguration.language) && this.selectionFlags == subtitleConfiguration.selectionFlags && this.roleFlags == subtitleConfiguration.roleFlags && Util.areEqual(this.label, subtitleConfiguration.label) && Util.areEqual(this.f52875id, subtitleConfiguration.f52875id);
        }

        public int hashCode() {
            int iHashCode = this.uri.hashCode() * 31;
            String str = this.mimeType;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.language;
            int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.selectionFlags) * 31) + this.roleFlags) * 31;
            String str3 = this.label;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f52875id;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public static final class Builder {

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            private String f52876id;
            private String label;
            private String language;
            private String mimeType;
            private int roleFlags;
            private int selectionFlags;
            private Uri uri;

            private Builder(SubtitleConfiguration subtitleConfiguration) {
                this.uri = subtitleConfiguration.uri;
                this.mimeType = subtitleConfiguration.mimeType;
                this.language = subtitleConfiguration.language;
                this.selectionFlags = subtitleConfiguration.selectionFlags;
                this.roleFlags = subtitleConfiguration.roleFlags;
                this.label = subtitleConfiguration.label;
                this.f52876id = subtitleConfiguration.f52875id;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public Subtitle buildSubtitle() {
                return new Subtitle(this);
            }

            public SubtitleConfiguration build() {
                return new SubtitleConfiguration(this);
            }

            public Builder setId(String str) {
                this.f52876id = str;
                return this;
            }

            public Builder setLabel(String str) {
                this.label = str;
                return this;
            }

            public Builder setLanguage(String str) {
                this.language = str;
                return this;
            }

            public Builder setMimeType(String str) {
                this.mimeType = str;
                return this;
            }

            public Builder setRoleFlags(int i14) {
                this.roleFlags = i14;
                return this;
            }

            public Builder setSelectionFlags(int i14) {
                this.selectionFlags = i14;
                return this;
            }

            public Builder setUri(Uri uri) {
                this.uri = uri;
                return this;
            }

            public Builder(Uri uri) {
                this.uri = uri;
            }
        }

        private SubtitleConfiguration(Uri uri, String str, String str2, int i14, int i15, String str3, String str4) {
            this.uri = uri;
            this.mimeType = str;
            this.language = str2;
            this.selectionFlags = i14;
            this.roleFlags = i15;
            this.label = str3;
            this.f52875id = str4;
        }
    }
}
