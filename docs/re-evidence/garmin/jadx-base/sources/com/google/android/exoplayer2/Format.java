package com.google.android.exoplayer2;

import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.util.BundleableUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.common.base.Joiner;
import com.google.maps.android.BuildConfig;
import i3.e5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes13.dex */
public final class Format implements Bundleable {
    private static final int FIELD_ACCESSIBILITY_CHANNEL = 28;
    private static final int FIELD_AVERAGE_BITRATE = 5;
    private static final int FIELD_CHANNEL_COUNT = 23;
    private static final int FIELD_CODECS = 7;
    private static final int FIELD_COLOR_INFO = 22;
    private static final int FIELD_CONTAINER_MIME_TYPE = 9;
    private static final int FIELD_CRYPTO_TYPE = 29;
    private static final int FIELD_DRM_INIT_DATA = 13;
    private static final int FIELD_ENCODER_DELAY = 26;
    private static final int FIELD_ENCODER_PADDING = 27;
    private static final int FIELD_FRAME_RATE = 17;
    private static final int FIELD_HEIGHT = 16;
    private static final int FIELD_ID = 0;
    private static final int FIELD_INITIALIZATION_DATA = 12;
    private static final int FIELD_LABEL = 1;
    private static final int FIELD_LANGUAGE = 2;
    private static final int FIELD_MAX_INPUT_SIZE = 11;
    private static final int FIELD_METADATA = 8;
    private static final int FIELD_PCM_ENCODING = 25;
    private static final int FIELD_PEAK_BITRATE = 6;
    private static final int FIELD_PIXEL_WIDTH_HEIGHT_RATIO = 19;
    private static final int FIELD_PROJECTION_DATA = 20;
    private static final int FIELD_ROLE_FLAGS = 4;
    private static final int FIELD_ROTATION_DEGREES = 18;
    private static final int FIELD_SAMPLE_MIME_TYPE = 10;
    private static final int FIELD_SAMPLE_RATE = 24;
    private static final int FIELD_SELECTION_FLAGS = 3;
    private static final int FIELD_STEREO_MODE = 21;
    private static final int FIELD_SUBSAMPLE_OFFSET_US = 14;
    private static final int FIELD_WIDTH = 15;
    public static final int NO_VALUE = -1;
    public static final long OFFSET_SAMPLE_RELATIVE = Long.MAX_VALUE;
    public final int accessibilityChannel;
    public final int averageBitrate;
    public final int bitrate;
    public final int channelCount;
    public final String codecs;
    public final ColorInfo colorInfo;
    public final String containerMimeType;
    public final int cryptoType;
    public final DrmInitData drmInitData;
    public final int encoderDelay;
    public final int encoderPadding;
    public final float frameRate;
    private int hashCode;
    public final int height;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public final String f52873id;
    public final List<byte[]> initializationData;
    public final String label;
    public final String language;
    public final int maxInputSize;
    public final Metadata metadata;
    public final int pcmEncoding;
    public final int peakBitrate;
    public final float pixelWidthHeightRatio;
    public final byte[] projectionData;
    public final int roleFlags;
    public final int rotationDegrees;
    public final String sampleMimeType;
    public final int sampleRate;
    public final int selectionFlags;
    public final int stereoMode;
    public final long subsampleOffsetUs;
    public final int width;
    private static final Format DEFAULT = new Builder().build();
    public static final Bundleable.Creator<Format> CREATOR = new v(9);

    private Format(Builder builder) {
        this.f52873id = builder.f52874id;
        this.label = builder.label;
        this.language = Util.normalizeLanguageCode(builder.language);
        this.selectionFlags = builder.selectionFlags;
        this.roleFlags = builder.roleFlags;
        int i14 = builder.averageBitrate;
        this.averageBitrate = i14;
        int i15 = builder.peakBitrate;
        this.peakBitrate = i15;
        this.bitrate = i15 != -1 ? i15 : i14;
        this.codecs = builder.codecs;
        this.metadata = builder.metadata;
        this.containerMimeType = builder.containerMimeType;
        this.sampleMimeType = builder.sampleMimeType;
        this.maxInputSize = builder.maxInputSize;
        this.initializationData = builder.initializationData == null ? Collections.EMPTY_LIST : builder.initializationData;
        DrmInitData drmInitData = builder.drmInitData;
        this.drmInitData = drmInitData;
        this.subsampleOffsetUs = builder.subsampleOffsetUs;
        this.width = builder.width;
        this.height = builder.height;
        this.frameRate = builder.frameRate;
        this.rotationDegrees = builder.rotationDegrees == -1 ? 0 : builder.rotationDegrees;
        this.pixelWidthHeightRatio = builder.pixelWidthHeightRatio == -1.0f ? 1.0f : builder.pixelWidthHeightRatio;
        this.projectionData = builder.projectionData;
        this.stereoMode = builder.stereoMode;
        this.colorInfo = builder.colorInfo;
        this.channelCount = builder.channelCount;
        this.sampleRate = builder.sampleRate;
        this.pcmEncoding = builder.pcmEncoding;
        this.encoderDelay = builder.encoderDelay == -1 ? 0 : builder.encoderDelay;
        this.encoderPadding = builder.encoderPadding != -1 ? builder.encoderPadding : 0;
        this.accessibilityChannel = builder.accessibilityChannel;
        if (builder.cryptoType != 0 || drmInitData == null) {
            this.cryptoType = builder.cryptoType;
        } else {
            this.cryptoType = 1;
        }
    }

    @Deprecated
    public static Format createAudioSampleFormat(String str, String str2, String str3, int i14, int i15, int i16, int i17, int i18, List<byte[]> list, DrmInitData drmInitData, int i19, String str4) {
        return new Builder().setId(str).setLanguage(str4).setSelectionFlags(i19).setAverageBitrate(i14).setPeakBitrate(i14).setCodecs(str3).setSampleMimeType(str2).setMaxInputSize(i15).setInitializationData(list).setDrmInitData(drmInitData).setChannelCount(i16).setSampleRate(i17).setPcmEncoding(i18).build();
    }

    @Deprecated
    public static Format createContainerFormat(String str, String str2, String str3, String str4, String str5, int i14, int i15, int i16, String str6) {
        return new Builder().setId(str).setLabel(str2).setLanguage(str6).setSelectionFlags(i15).setRoleFlags(i16).setAverageBitrate(i14).setPeakBitrate(i14).setCodecs(str5).setContainerMimeType(str3).setSampleMimeType(str4).build();
    }

    @Deprecated
    public static Format createSampleFormat(String str, String str2) {
        return new Builder().setId(str).setSampleMimeType(str2).build();
    }

    @Deprecated
    public static Format createVideoSampleFormat(String str, String str2, String str3, int i14, int i15, int i16, int i17, float f14, List<byte[]> list, int i18, float f15, DrmInitData drmInitData) {
        return new Builder().setId(str).setAverageBitrate(i14).setPeakBitrate(i14).setCodecs(str3).setSampleMimeType(str2).setMaxInputSize(i15).setInitializationData(list).setDrmInitData(drmInitData).setWidth(i16).setHeight(i17).setFrameRate(f14).setRotationDegrees(i18).setPixelWidthHeightRatio(f15).build();
    }

    private static <T> T defaultIfNull(T t7, T t14) {
        return t7 != null ? t7 : t14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Format fromBundle(Bundle bundle) {
        Builder builder = new Builder();
        BundleableUtil.ensureClassLoader(bundle);
        int i14 = 0;
        String string = bundle.getString(keyForField(0));
        Format format = DEFAULT;
        builder.setId((String) defaultIfNull(string, format.f52873id)).setLabel((String) defaultIfNull(bundle.getString(keyForField(1)), format.label)).setLanguage((String) defaultIfNull(bundle.getString(keyForField(2)), format.language)).setSelectionFlags(bundle.getInt(keyForField(3), format.selectionFlags)).setRoleFlags(bundle.getInt(keyForField(4), format.roleFlags)).setAverageBitrate(bundle.getInt(keyForField(5), format.averageBitrate)).setPeakBitrate(bundle.getInt(keyForField(6), format.peakBitrate)).setCodecs((String) defaultIfNull(bundle.getString(keyForField(7)), format.codecs)).setMetadata((Metadata) defaultIfNull((Metadata) bundle.getParcelable(keyForField(8)), format.metadata)).setContainerMimeType((String) defaultIfNull(bundle.getString(keyForField(9)), format.containerMimeType)).setSampleMimeType((String) defaultIfNull(bundle.getString(keyForField(10)), format.sampleMimeType)).setMaxInputSize(bundle.getInt(keyForField(11), format.maxInputSize));
        ArrayList arrayList = new ArrayList();
        while (true) {
            byte[] byteArray = bundle.getByteArray(keyForInitializationData(i14));
            if (byteArray == null) {
                Builder drmInitData = builder.setInitializationData(arrayList).setDrmInitData((DrmInitData) bundle.getParcelable(keyForField(13)));
                String strKeyForField = keyForField(14);
                Format format2 = DEFAULT;
                drmInitData.setSubsampleOffsetUs(bundle.getLong(strKeyForField, format2.subsampleOffsetUs)).setWidth(bundle.getInt(keyForField(15), format2.width)).setHeight(bundle.getInt(keyForField(16), format2.height)).setFrameRate(bundle.getFloat(keyForField(17), format2.frameRate)).setRotationDegrees(bundle.getInt(keyForField(18), format2.rotationDegrees)).setPixelWidthHeightRatio(bundle.getFloat(keyForField(19), format2.pixelWidthHeightRatio)).setProjectionData(bundle.getByteArray(keyForField(20))).setStereoMode(bundle.getInt(keyForField(21), format2.stereoMode)).setColorInfo((ColorInfo) BundleableUtil.fromNullableBundle(ColorInfo.CREATOR, bundle.getBundle(keyForField(22)))).setChannelCount(bundle.getInt(keyForField(23), format2.channelCount)).setSampleRate(bundle.getInt(keyForField(24), format2.sampleRate)).setPcmEncoding(bundle.getInt(keyForField(25), format2.pcmEncoding)).setEncoderDelay(bundle.getInt(keyForField(26), format2.encoderDelay)).setEncoderPadding(bundle.getInt(keyForField(27), format2.encoderPadding)).setAccessibilityChannel(bundle.getInt(keyForField(28), format2.accessibilityChannel)).setCryptoType(bundle.getInt(keyForField(29), format2.cryptoType));
                return builder.build();
            }
            arrayList.add(byteArray);
            i14++;
        }
    }

    private static String keyForField(int i14) {
        return Integer.toString(i14, 36);
    }

    private static String keyForInitializationData(int i14) {
        String strKeyForField = keyForField(12);
        String string = Integer.toString(i14, 36);
        return v.c(v.a(v.a(1, strKeyForField), string), strKeyForField, "_", string);
    }

    public static String toLogString(Format format) {
        if (format == null) {
            return BuildConfig.TRAVIS;
        }
        StringBuilder sbK = e5.k("id=");
        sbK.append(format.f52873id);
        sbK.append(", mimeType=");
        sbK.append(format.sampleMimeType);
        if (format.bitrate != -1) {
            sbK.append(", bitrate=");
            sbK.append(format.bitrate);
        }
        if (format.codecs != null) {
            sbK.append(", codecs=");
            sbK.append(format.codecs);
        }
        if (format.drmInitData != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i14 = 0;
            while (true) {
                DrmInitData drmInitData = format.drmInitData;
                if (i14 >= drmInitData.schemeDataCount) {
                    break;
                }
                UUID uuid = drmInitData.get(i14).uuid;
                if (uuid.equals(C.COMMON_PSSH_UUID)) {
                    linkedHashSet.add(C.CENC_TYPE_cenc);
                } else if (uuid.equals(C.CLEARKEY_UUID)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(C.PLAYREADY_UUID)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(C.WIDEVINE_UUID)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(C.UUID_NIL)) {
                    linkedHashSet.add("universal");
                } else {
                    String strValueOf = String.valueOf(uuid);
                    StringBuilder sb3 = new StringBuilder(strValueOf.length() + 10);
                    sb3.append("unknown (");
                    sb3.append(strValueOf);
                    sb3.append(")");
                    linkedHashSet.add(sb3.toString());
                }
                i14++;
            }
            sbK.append(", drm=[");
            Joiner.on(CoreConstants.COMMA_CHAR).appendTo(sbK, (Iterable<? extends Object>) linkedHashSet);
            sbK.append(']');
        }
        if (format.width != -1 && format.height != -1) {
            sbK.append(", res=");
            sbK.append(format.width);
            sbK.append("x");
            sbK.append(format.height);
        }
        if (format.frameRate != -1.0f) {
            sbK.append(", fps=");
            sbK.append(format.frameRate);
        }
        if (format.channelCount != -1) {
            sbK.append(", channels=");
            sbK.append(format.channelCount);
        }
        if (format.sampleRate != -1) {
            sbK.append(", sample_rate=");
            sbK.append(format.sampleRate);
        }
        if (format.language != null) {
            sbK.append(", language=");
            sbK.append(format.language);
        }
        if (format.label != null) {
            sbK.append(", label=");
            sbK.append(format.label);
        }
        if (format.selectionFlags != 0) {
            ArrayList arrayList = new ArrayList();
            if ((format.selectionFlags & 4) != 0) {
                arrayList.add(TtmlNode.TEXT_EMPHASIS_AUTO);
            }
            if ((format.selectionFlags & 1) != 0) {
                arrayList.add("default");
            }
            if ((format.selectionFlags & 2) != 0) {
                arrayList.add("forced");
            }
            sbK.append(", selectionFlags=[");
            Joiner.on(CoreConstants.COMMA_CHAR).appendTo(sbK, (Iterable<? extends Object>) arrayList);
            sbK.append("]");
        }
        if (format.roleFlags != 0) {
            ArrayList arrayList2 = new ArrayList();
            if ((format.roleFlags & 1) != 0) {
                arrayList2.add("main");
            }
            if ((format.roleFlags & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((format.roleFlags & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((format.roleFlags & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((format.roleFlags & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((format.roleFlags & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((format.roleFlags & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((format.roleFlags & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((format.roleFlags & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((format.roleFlags & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((format.roleFlags & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((format.roleFlags & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((format.roleFlags & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((format.roleFlags & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((format.roleFlags & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            sbK.append(", roleFlags=[");
            Joiner.on(CoreConstants.COMMA_CHAR).appendTo(sbK, (Iterable<? extends Object>) arrayList2);
            sbK.append("]");
        }
        return sbK.toString();
    }

    public Builder buildUpon() {
        return new Builder();
    }

    @Deprecated
    public Format copyWithBitrate(int i14) {
        return buildUpon().setAverageBitrate(i14).setPeakBitrate(i14).build();
    }

    public Format copyWithCryptoType(int i14) {
        return buildUpon().setCryptoType(i14).build();
    }

    @Deprecated
    public Format copyWithDrmInitData(DrmInitData drmInitData) {
        return buildUpon().setDrmInitData(drmInitData).build();
    }

    @Deprecated
    public Format copyWithFrameRate(float f14) {
        return buildUpon().setFrameRate(f14).build();
    }

    @Deprecated
    public Format copyWithGaplessInfo(int i14, int i15) {
        return buildUpon().setEncoderDelay(i14).setEncoderPadding(i15).build();
    }

    @Deprecated
    public Format copyWithLabel(String str) {
        return buildUpon().setLabel(str).build();
    }

    @Deprecated
    public Format copyWithManifestFormatInfo(Format format) {
        return withManifestFormatInfo(format);
    }

    @Deprecated
    public Format copyWithMaxInputSize(int i14) {
        return buildUpon().setMaxInputSize(i14).build();
    }

    @Deprecated
    public Format copyWithMetadata(Metadata metadata) {
        return buildUpon().setMetadata(metadata).build();
    }

    @Deprecated
    public Format copyWithSubsampleOffsetUs(long j8) {
        return buildUpon().setSubsampleOffsetUs(j8).build();
    }

    @Deprecated
    public Format copyWithVideoSize(int i14, int i15) {
        return buildUpon().setWidth(i14).setHeight(i15).build();
    }

    public boolean equals(Object obj) {
        int i14;
        if (this == obj) {
            return true;
        }
        if (obj != null && Format.class == obj.getClass()) {
            Format format = (Format) obj;
            int i15 = this.hashCode;
            if ((i15 == 0 || (i14 = format.hashCode) == 0 || i15 == i14) && this.selectionFlags == format.selectionFlags && this.roleFlags == format.roleFlags && this.averageBitrate == format.averageBitrate && this.peakBitrate == format.peakBitrate && this.maxInputSize == format.maxInputSize && this.subsampleOffsetUs == format.subsampleOffsetUs && this.width == format.width && this.height == format.height && this.rotationDegrees == format.rotationDegrees && this.stereoMode == format.stereoMode && this.channelCount == format.channelCount && this.sampleRate == format.sampleRate && this.pcmEncoding == format.pcmEncoding && this.encoderDelay == format.encoderDelay && this.encoderPadding == format.encoderPadding && this.accessibilityChannel == format.accessibilityChannel && this.cryptoType == format.cryptoType && Float.compare(this.frameRate, format.frameRate) == 0 && Float.compare(this.pixelWidthHeightRatio, format.pixelWidthHeightRatio) == 0 && Util.areEqual(this.f52873id, format.f52873id) && Util.areEqual(this.label, format.label) && Util.areEqual(this.codecs, format.codecs) && Util.areEqual(this.containerMimeType, format.containerMimeType) && Util.areEqual(this.sampleMimeType, format.sampleMimeType) && Util.areEqual(this.language, format.language) && Arrays.equals(this.projectionData, format.projectionData) && Util.areEqual(this.metadata, format.metadata) && Util.areEqual(this.colorInfo, format.colorInfo) && Util.areEqual(this.drmInitData, format.drmInitData) && initializationDataEquals(format)) {
                return true;
            }
        }
        return false;
    }

    public int getPixelCount() {
        int i14;
        int i15 = this.width;
        if (i15 == -1 || (i14 = this.height) == -1) {
            return -1;
        }
        return i15 * i14;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            String str = this.f52873id;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.label;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.language;
            int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.selectionFlags) * 31) + this.roleFlags) * 31) + this.averageBitrate) * 31) + this.peakBitrate) * 31;
            String str4 = this.codecs;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Metadata metadata = this.metadata;
            int iHashCode5 = (iHashCode4 + (metadata == null ? 0 : metadata.hashCode())) * 31;
            String str5 = this.containerMimeType;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.sampleMimeType;
            this.hashCode = ((((((((((((((((Float.floatToIntBits(this.pixelWidthHeightRatio) + ((((Float.floatToIntBits(this.frameRate) + ((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.maxInputSize) * 31) + ((int) this.subsampleOffsetUs)) * 31) + this.width) * 31) + this.height) * 31)) * 31) + this.rotationDegrees) * 31)) * 31) + this.stereoMode) * 31) + this.channelCount) * 31) + this.sampleRate) * 31) + this.pcmEncoding) * 31) + this.encoderDelay) * 31) + this.encoderPadding) * 31) + this.accessibilityChannel) * 31) + this.cryptoType;
        }
        return this.hashCode;
    }

    public boolean initializationDataEquals(Format format) {
        if (this.initializationData.size() != format.initializationData.size()) {
            return false;
        }
        for (int i14 = 0; i14 < this.initializationData.size(); i14++) {
            if (!Arrays.equals(this.initializationData.get(i14), format.initializationData.get(i14))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(keyForField(0), this.f52873id);
        bundle.putString(keyForField(1), this.label);
        bundle.putString(keyForField(2), this.language);
        bundle.putInt(keyForField(3), this.selectionFlags);
        bundle.putInt(keyForField(4), this.roleFlags);
        bundle.putInt(keyForField(5), this.averageBitrate);
        bundle.putInt(keyForField(6), this.peakBitrate);
        bundle.putString(keyForField(7), this.codecs);
        bundle.putParcelable(keyForField(8), this.metadata);
        bundle.putString(keyForField(9), this.containerMimeType);
        bundle.putString(keyForField(10), this.sampleMimeType);
        bundle.putInt(keyForField(11), this.maxInputSize);
        for (int i14 = 0; i14 < this.initializationData.size(); i14++) {
            bundle.putByteArray(keyForInitializationData(i14), this.initializationData.get(i14));
        }
        bundle.putParcelable(keyForField(13), this.drmInitData);
        bundle.putLong(keyForField(14), this.subsampleOffsetUs);
        bundle.putInt(keyForField(15), this.width);
        bundle.putInt(keyForField(16), this.height);
        bundle.putFloat(keyForField(17), this.frameRate);
        bundle.putInt(keyForField(18), this.rotationDegrees);
        bundle.putFloat(keyForField(19), this.pixelWidthHeightRatio);
        bundle.putByteArray(keyForField(20), this.projectionData);
        bundle.putInt(keyForField(21), this.stereoMode);
        bundle.putBundle(keyForField(22), BundleableUtil.toNullableBundle(this.colorInfo));
        bundle.putInt(keyForField(23), this.channelCount);
        bundle.putInt(keyForField(24), this.sampleRate);
        bundle.putInt(keyForField(25), this.pcmEncoding);
        bundle.putInt(keyForField(26), this.encoderDelay);
        bundle.putInt(keyForField(27), this.encoderPadding);
        bundle.putInt(keyForField(28), this.accessibilityChannel);
        bundle.putInt(keyForField(29), this.cryptoType);
        return bundle;
    }

    public String toString() {
        String str = this.f52873id;
        String str2 = this.label;
        String str3 = this.containerMimeType;
        String str4 = this.sampleMimeType;
        String str5 = this.codecs;
        int i14 = this.bitrate;
        String str6 = this.language;
        int i15 = this.width;
        int i16 = this.height;
        float f14 = this.frameRate;
        int i17 = this.channelCount;
        int i18 = this.sampleRate;
        StringBuilder sbD = v.d(v.a(v.a(v.a(v.a(v.a(v.a(104, str), str2), str3), str4), str5), str6), "Format(", str, ", ", str2);
        sn.a.t(sbD, ", ", str3, ", ", str4);
        sbD.append(", ");
        sbD.append(str5);
        sbD.append(", ");
        sbD.append(i14);
        sbD.append(", ");
        sbD.append(str6);
        sbD.append(", [");
        sbD.append(i15);
        sbD.append(", ");
        sbD.append(i16);
        sbD.append(", ");
        sbD.append(f14);
        androidx.core.view.j.m(i17, i18, "], [", ", ", sbD);
        sbD.append("])");
        return sbD.toString();
    }

    public Format withManifestFormatInfo(Format format) {
        String str;
        if (this == format) {
            return this;
        }
        int trackType = MimeTypes.getTrackType(this.sampleMimeType);
        String str2 = format.f52873id;
        String str3 = format.label;
        if (str3 == null) {
            str3 = this.label;
        }
        String str4 = this.language;
        if ((trackType == 3 || trackType == 1) && (str = format.language) != null) {
            str4 = str;
        }
        int i14 = this.averageBitrate;
        if (i14 == -1) {
            i14 = format.averageBitrate;
        }
        int i15 = this.peakBitrate;
        if (i15 == -1) {
            i15 = format.peakBitrate;
        }
        String str5 = this.codecs;
        if (str5 == null) {
            String codecsOfType = Util.getCodecsOfType(format.codecs, trackType);
            if (Util.splitCodecs(codecsOfType).length == 1) {
                str5 = codecsOfType;
            }
        }
        Metadata metadata = this.metadata;
        Metadata metadataCopyWithAppendedEntriesFrom = format.metadata;
        if (metadata != null) {
            metadataCopyWithAppendedEntriesFrom = metadata.copyWithAppendedEntriesFrom(metadataCopyWithAppendedEntriesFrom);
        }
        float f14 = this.frameRate;
        if (f14 == -1.0f && trackType == 2) {
            f14 = format.frameRate;
        }
        int i16 = this.selectionFlags | format.selectionFlags;
        return buildUpon().setId(str2).setLabel(str3).setLanguage(str4).setSelectionFlags(i16).setRoleFlags(this.roleFlags | format.roleFlags).setAverageBitrate(i14).setPeakBitrate(i15).setCodecs(str5).setMetadata(metadataCopyWithAppendedEntriesFrom).setDrmInitData(DrmInitData.createSessionCreationData(format.drmInitData, this.drmInitData)).setFrameRate(f14).build();
    }

    public static final class Builder {
        private int accessibilityChannel;
        private int averageBitrate;
        private int channelCount;
        private String codecs;
        private ColorInfo colorInfo;
        private String containerMimeType;
        private int cryptoType;
        private DrmInitData drmInitData;
        private int encoderDelay;
        private int encoderPadding;
        private float frameRate;
        private int height;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private String f52874id;
        private List<byte[]> initializationData;
        private String label;
        private String language;
        private int maxInputSize;
        private Metadata metadata;
        private int pcmEncoding;
        private int peakBitrate;
        private float pixelWidthHeightRatio;
        private byte[] projectionData;
        private int roleFlags;
        private int rotationDegrees;
        private String sampleMimeType;
        private int sampleRate;
        private int selectionFlags;
        private int stereoMode;
        private long subsampleOffsetUs;
        private int width;

        private Builder(Format format) {
            this.f52874id = format.f52873id;
            this.label = format.label;
            this.language = format.language;
            this.selectionFlags = format.selectionFlags;
            this.roleFlags = format.roleFlags;
            this.averageBitrate = format.averageBitrate;
            this.peakBitrate = format.peakBitrate;
            this.codecs = format.codecs;
            this.metadata = format.metadata;
            this.containerMimeType = format.containerMimeType;
            this.sampleMimeType = format.sampleMimeType;
            this.maxInputSize = format.maxInputSize;
            this.initializationData = format.initializationData;
            this.drmInitData = format.drmInitData;
            this.subsampleOffsetUs = format.subsampleOffsetUs;
            this.width = format.width;
            this.height = format.height;
            this.frameRate = format.frameRate;
            this.rotationDegrees = format.rotationDegrees;
            this.pixelWidthHeightRatio = format.pixelWidthHeightRatio;
            this.projectionData = format.projectionData;
            this.stereoMode = format.stereoMode;
            this.colorInfo = format.colorInfo;
            this.channelCount = format.channelCount;
            this.sampleRate = format.sampleRate;
            this.pcmEncoding = format.pcmEncoding;
            this.encoderDelay = format.encoderDelay;
            this.encoderPadding = format.encoderPadding;
            this.accessibilityChannel = format.accessibilityChannel;
            this.cryptoType = format.cryptoType;
        }

        public Format build() {
            return new Format(this);
        }

        public Builder setAccessibilityChannel(int i14) {
            this.accessibilityChannel = i14;
            return this;
        }

        public Builder setAverageBitrate(int i14) {
            this.averageBitrate = i14;
            return this;
        }

        public Builder setChannelCount(int i14) {
            this.channelCount = i14;
            return this;
        }

        public Builder setCodecs(String str) {
            this.codecs = str;
            return this;
        }

        public Builder setColorInfo(ColorInfo colorInfo) {
            this.colorInfo = colorInfo;
            return this;
        }

        public Builder setContainerMimeType(String str) {
            this.containerMimeType = str;
            return this;
        }

        public Builder setCryptoType(int i14) {
            this.cryptoType = i14;
            return this;
        }

        public Builder setDrmInitData(DrmInitData drmInitData) {
            this.drmInitData = drmInitData;
            return this;
        }

        public Builder setEncoderDelay(int i14) {
            this.encoderDelay = i14;
            return this;
        }

        public Builder setEncoderPadding(int i14) {
            this.encoderPadding = i14;
            return this;
        }

        public Builder setFrameRate(float f14) {
            this.frameRate = f14;
            return this;
        }

        public Builder setHeight(int i14) {
            this.height = i14;
            return this;
        }

        public Builder setId(int i14) {
            this.f52874id = Integer.toString(i14);
            return this;
        }

        public Builder setInitializationData(List<byte[]> list) {
            this.initializationData = list;
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

        public Builder setMaxInputSize(int i14) {
            this.maxInputSize = i14;
            return this;
        }

        public Builder setMetadata(Metadata metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setPcmEncoding(int i14) {
            this.pcmEncoding = i14;
            return this;
        }

        public Builder setPeakBitrate(int i14) {
            this.peakBitrate = i14;
            return this;
        }

        public Builder setPixelWidthHeightRatio(float f14) {
            this.pixelWidthHeightRatio = f14;
            return this;
        }

        public Builder setProjectionData(byte[] bArr) {
            this.projectionData = bArr;
            return this;
        }

        public Builder setRoleFlags(int i14) {
            this.roleFlags = i14;
            return this;
        }

        public Builder setRotationDegrees(int i14) {
            this.rotationDegrees = i14;
            return this;
        }

        public Builder setSampleMimeType(String str) {
            this.sampleMimeType = str;
            return this;
        }

        public Builder setSampleRate(int i14) {
            this.sampleRate = i14;
            return this;
        }

        public Builder setSelectionFlags(int i14) {
            this.selectionFlags = i14;
            return this;
        }

        public Builder setStereoMode(int i14) {
            this.stereoMode = i14;
            return this;
        }

        public Builder setSubsampleOffsetUs(long j8) {
            this.subsampleOffsetUs = j8;
            return this;
        }

        public Builder setWidth(int i14) {
            this.width = i14;
            return this;
        }

        public Builder setId(String str) {
            this.f52874id = str;
            return this;
        }

        public Builder() {
            this.averageBitrate = -1;
            this.peakBitrate = -1;
            this.maxInputSize = -1;
            this.subsampleOffsetUs = Long.MAX_VALUE;
            this.width = -1;
            this.height = -1;
            this.frameRate = -1.0f;
            this.pixelWidthHeightRatio = 1.0f;
            this.stereoMode = -1;
            this.channelCount = -1;
            this.sampleRate = -1;
            this.pcmEncoding = -1;
            this.accessibilityChannel = -1;
            this.cryptoType = 0;
        }
    }

    @Deprecated
    public static Format createAudioSampleFormat(String str, String str2, String str3, int i14, int i15, int i16, int i17, List<byte[]> list, DrmInitData drmInitData, int i18, String str4) {
        return new Builder().setId(str).setLanguage(str4).setSelectionFlags(i18).setAverageBitrate(i14).setPeakBitrate(i14).setCodecs(str3).setSampleMimeType(str2).setMaxInputSize(i15).setInitializationData(list).setDrmInitData(drmInitData).setChannelCount(i16).setSampleRate(i17).build();
    }

    @Deprecated
    public static Format createVideoSampleFormat(String str, String str2, String str3, int i14, int i15, int i16, int i17, float f14, List<byte[]> list, DrmInitData drmInitData) {
        return new Builder().setId(str).setAverageBitrate(i14).setPeakBitrate(i14).setCodecs(str3).setSampleMimeType(str2).setMaxInputSize(i15).setInitializationData(list).setDrmInitData(drmInitData).setWidth(i16).setHeight(i17).setFrameRate(f14).build();
    }
}
