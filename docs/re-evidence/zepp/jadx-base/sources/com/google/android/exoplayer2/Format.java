package com.google.android.exoplayer2;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import com.google.android.exoplayer2.drm.UnsupportedMediaCrypto;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.common.base.Joiner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public final class Format implements Parcelable {
    public static final Parcelable.Creator<Format> CREATOR = new a();
    public static final int NO_VALUE = -1;
    public static final long OFFSET_SAMPLE_RELATIVE = Long.MAX_VALUE;
    private int a;
    public final int accessibilityChannel;
    public final int averageBitrate;
    public final int bitrate;
    public final int channelCount;

    @Nullable
    public final String codecs;

    @Nullable
    public final ColorInfo colorInfo;

    @Nullable
    public final String containerMimeType;

    @Nullable
    public final DrmInitData drmInitData;
    public final int encoderDelay;
    public final int encoderPadding;

    @Nullable
    public final Class<? extends ExoMediaCrypto> exoMediaCryptoType;
    public final float frameRate;
    public final int height;

    @Nullable
    public final String id;
    public final List<byte[]> initializationData;

    @Nullable
    public final String label;

    @Nullable
    public final String language;
    public final int maxInputSize;

    @Nullable
    public final Metadata metadata;
    public final int pcmEncoding;
    public final int peakBitrate;
    public final float pixelWidthHeightRatio;

    @Nullable
    public final byte[] projectionData;
    public final int roleFlags;
    public final int rotationDegrees;

    @Nullable
    public final String sampleMimeType;
    public final int sampleRate;
    public final int selectionFlags;
    public final int stereoMode;
    public final long subsampleOffsetUs;
    public final int width;

    public static final class Builder {
        private int A;
        private int B;
        private int C;

        @Nullable
        private Class<? extends ExoMediaCrypto> D;

        @Nullable
        private String a;

        @Nullable
        private String b;

        @Nullable
        private String c;
        private int d;
        private int e;
        private int f;
        private int g;

        @Nullable
        private String h;

        @Nullable
        private Metadata i;

        @Nullable
        private String j;

        @Nullable
        private String k;
        private int l;

        @Nullable
        private List<byte[]> m;

        @Nullable
        private DrmInitData n;
        private long o;
        private int p;
        private int q;
        private float r;
        private int s;
        private float t;

        @Nullable
        private byte[] u;
        private int v;

        @Nullable
        private ColorInfo w;
        private int x;
        private int y;
        private int z;

        public /* synthetic */ Builder(Format format, a aVar) {
            this(format);
        }

        public Format build() {
            return new Format(this, null);
        }

        public Builder setAccessibilityChannel(int accessibilityChannel) {
            this.C = accessibilityChannel;
            return this;
        }

        public Builder setAverageBitrate(int averageBitrate) {
            this.f = averageBitrate;
            return this;
        }

        public Builder setChannelCount(int channelCount) {
            this.x = channelCount;
            return this;
        }

        public Builder setCodecs(@Nullable String codecs) {
            this.h = codecs;
            return this;
        }

        public Builder setColorInfo(@Nullable ColorInfo colorInfo) {
            this.w = colorInfo;
            return this;
        }

        public Builder setContainerMimeType(@Nullable String containerMimeType) {
            this.j = containerMimeType;
            return this;
        }

        public Builder setDrmInitData(@Nullable DrmInitData drmInitData) {
            this.n = drmInitData;
            return this;
        }

        public Builder setEncoderDelay(int encoderDelay) {
            this.A = encoderDelay;
            return this;
        }

        public Builder setEncoderPadding(int encoderPadding) {
            this.B = encoderPadding;
            return this;
        }

        public Builder setExoMediaCryptoType(@Nullable Class<? extends ExoMediaCrypto> exoMediaCryptoType) {
            this.D = exoMediaCryptoType;
            return this;
        }

        public Builder setFrameRate(float frameRate) {
            this.r = frameRate;
            return this;
        }

        public Builder setHeight(int height) {
            this.q = height;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.a = id;
            return this;
        }

        public Builder setInitializationData(@Nullable List<byte[]> initializationData) {
            this.m = initializationData;
            return this;
        }

        public Builder setLabel(@Nullable String label) {
            this.b = label;
            return this;
        }

        public Builder setLanguage(@Nullable String language) {
            this.c = language;
            return this;
        }

        public Builder setMaxInputSize(int maxInputSize) {
            this.l = maxInputSize;
            return this;
        }

        public Builder setMetadata(@Nullable Metadata metadata) {
            this.i = metadata;
            return this;
        }

        public Builder setPcmEncoding(int pcmEncoding) {
            this.z = pcmEncoding;
            return this;
        }

        public Builder setPeakBitrate(int peakBitrate) {
            this.g = peakBitrate;
            return this;
        }

        public Builder setPixelWidthHeightRatio(float pixelWidthHeightRatio) {
            this.t = pixelWidthHeightRatio;
            return this;
        }

        public Builder setProjectionData(@Nullable byte[] projectionData) {
            this.u = projectionData;
            return this;
        }

        public Builder setRoleFlags(int roleFlags) {
            this.e = roleFlags;
            return this;
        }

        public Builder setRotationDegrees(int rotationDegrees) {
            this.s = rotationDegrees;
            return this;
        }

        public Builder setSampleMimeType(@Nullable String sampleMimeType) {
            this.k = sampleMimeType;
            return this;
        }

        public Builder setSampleRate(int sampleRate) {
            this.y = sampleRate;
            return this;
        }

        public Builder setSelectionFlags(int selectionFlags) {
            this.d = selectionFlags;
            return this;
        }

        public Builder setStereoMode(int stereoMode) {
            this.v = stereoMode;
            return this;
        }

        public Builder setSubsampleOffsetUs(long subsampleOffsetUs) {
            this.o = subsampleOffsetUs;
            return this;
        }

        public Builder setWidth(int width) {
            this.p = width;
            return this;
        }

        public Builder() {
            this.f = -1;
            this.g = -1;
            this.l = -1;
            this.o = Long.MAX_VALUE;
            this.p = -1;
            this.q = -1;
            this.r = -1.0f;
            this.t = 1.0f;
            this.v = -1;
            this.x = -1;
            this.y = -1;
            this.z = -1;
            this.C = -1;
        }

        public Builder setId(int id) {
            this.a = Integer.toString(id);
            return this;
        }

        private Builder(Format format) {
            this.a = format.id;
            this.b = format.label;
            this.c = format.language;
            this.d = format.selectionFlags;
            this.e = format.roleFlags;
            this.f = format.averageBitrate;
            this.g = format.peakBitrate;
            this.h = format.codecs;
            this.i = format.metadata;
            this.j = format.containerMimeType;
            this.k = format.sampleMimeType;
            this.l = format.maxInputSize;
            this.m = format.initializationData;
            this.n = format.drmInitData;
            this.o = format.subsampleOffsetUs;
            this.p = format.width;
            this.q = format.height;
            this.r = format.frameRate;
            this.s = format.rotationDegrees;
            this.t = format.pixelWidthHeightRatio;
            this.u = format.projectionData;
            this.v = format.stereoMode;
            this.w = format.colorInfo;
            this.x = format.channelCount;
            this.y = format.sampleRate;
            this.z = format.pcmEncoding;
            this.A = format.encoderDelay;
            this.B = format.encoderPadding;
            this.C = format.accessibilityChannel;
            this.D = format.exoMediaCryptoType;
        }
    }

    public class a implements Parcelable.Creator<Format> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Format createFromParcel(Parcel in) {
            return new Format(in);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Format[] newArray(int size) {
            return new Format[size];
        }
    }

    public /* synthetic */ Format(Builder builder, a aVar) {
        this(builder);
    }

    @Deprecated
    public static Format createAudioSampleFormat(@Nullable String id, @Nullable String sampleMimeType, @Nullable String codecs, int bitrate, int maxInputSize, int channelCount, int sampleRate, @Nullable List<byte[]> initializationData, @Nullable DrmInitData drmInitData, int selectionFlags, @Nullable String language) {
        return new Builder().setId(id).setLanguage(language).setSelectionFlags(selectionFlags).setAverageBitrate(bitrate).setPeakBitrate(bitrate).setCodecs(codecs).setSampleMimeType(sampleMimeType).setMaxInputSize(maxInputSize).setInitializationData(initializationData).setDrmInitData(drmInitData).setChannelCount(channelCount).setSampleRate(sampleRate).build();
    }

    @Deprecated
    public static Format createContainerFormat(@Nullable String id, @Nullable String label, @Nullable String containerMimeType, @Nullable String sampleMimeType, @Nullable String codecs, int bitrate, int selectionFlags, int roleFlags, @Nullable String language) {
        return new Builder().setId(id).setLabel(label).setLanguage(language).setSelectionFlags(selectionFlags).setRoleFlags(roleFlags).setAverageBitrate(bitrate).setPeakBitrate(bitrate).setCodecs(codecs).setContainerMimeType(containerMimeType).setSampleMimeType(sampleMimeType).build();
    }

    @Deprecated
    public static Format createSampleFormat(@Nullable String id, @Nullable String sampleMimeType) {
        return new Builder().setId(id).setSampleMimeType(sampleMimeType).build();
    }

    @Deprecated
    public static Format createVideoSampleFormat(@Nullable String id, @Nullable String sampleMimeType, @Nullable String codecs, int bitrate, int maxInputSize, int width, int height, float frameRate, @Nullable List<byte[]> initializationData, @Nullable DrmInitData drmInitData) {
        return new Builder().setId(id).setAverageBitrate(bitrate).setPeakBitrate(bitrate).setCodecs(codecs).setSampleMimeType(sampleMimeType).setMaxInputSize(maxInputSize).setInitializationData(initializationData).setDrmInitData(drmInitData).setWidth(width).setHeight(height).setFrameRate(frameRate).build();
    }

    public static String toLogString(@Nullable Format format) {
        if (format == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append(format.id);
        sb.append(", mimeType=");
        sb.append(format.sampleMimeType);
        if (format.bitrate != -1) {
            sb.append(", bitrate=");
            sb.append(format.bitrate);
        }
        if (format.codecs != null) {
            sb.append(", codecs=");
            sb.append(format.codecs);
        }
        if (format.drmInitData != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (true) {
                DrmInitData drmInitData = format.drmInitData;
                if (i >= drmInitData.schemeDataCount) {
                    break;
                }
                UUID uuid = drmInitData.get(i).uuid;
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
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 10);
                    sb2.append("unknown (");
                    sb2.append(strValueOf);
                    sb2.append(")");
                    linkedHashSet.add(sb2.toString());
                }
                i++;
            }
            sb.append(", drm=[");
            sb.append(Joiner.on(',').join(linkedHashSet));
            sb.append(JsonLexerKt.END_LIST);
        }
        if (format.width != -1 && format.height != -1) {
            sb.append(", res=");
            sb.append(format.width);
            sb.append("x");
            sb.append(format.height);
        }
        if (format.frameRate != -1.0f) {
            sb.append(", fps=");
            sb.append(format.frameRate);
        }
        if (format.channelCount != -1) {
            sb.append(", channels=");
            sb.append(format.channelCount);
        }
        if (format.sampleRate != -1) {
            sb.append(", sample_rate=");
            sb.append(format.sampleRate);
        }
        if (format.language != null) {
            sb.append(", language=");
            sb.append(format.language);
        }
        if (format.label != null) {
            sb.append(", label=");
            sb.append(format.label);
        }
        if ((format.roleFlags & 16384) != 0) {
            sb.append(", trick-play-track");
        }
        return sb.toString();
    }

    public Builder buildUpon() {
        return new Builder(this, null);
    }

    @Deprecated
    public Format copyWithBitrate(int bitrate) {
        return buildUpon().setAverageBitrate(bitrate).setPeakBitrate(bitrate).build();
    }

    @Deprecated
    public Format copyWithDrmInitData(@Nullable DrmInitData drmInitData) {
        return buildUpon().setDrmInitData(drmInitData).build();
    }

    public Format copyWithExoMediaCryptoType(@Nullable Class<? extends ExoMediaCrypto> exoMediaCryptoType) {
        return buildUpon().setExoMediaCryptoType(exoMediaCryptoType).build();
    }

    @Deprecated
    public Format copyWithFrameRate(float frameRate) {
        return buildUpon().setFrameRate(frameRate).build();
    }

    @Deprecated
    public Format copyWithGaplessInfo(int encoderDelay, int encoderPadding) {
        return buildUpon().setEncoderDelay(encoderDelay).setEncoderPadding(encoderPadding).build();
    }

    @Deprecated
    public Format copyWithLabel(@Nullable String label) {
        return buildUpon().setLabel(label).build();
    }

    @Deprecated
    public Format copyWithManifestFormatInfo(Format manifestFormat) {
        return withManifestFormatInfo(manifestFormat);
    }

    @Deprecated
    public Format copyWithMaxInputSize(int maxInputSize) {
        return buildUpon().setMaxInputSize(maxInputSize).build();
    }

    @Deprecated
    public Format copyWithMetadata(@Nullable Metadata metadata) {
        return buildUpon().setMetadata(metadata).build();
    }

    @Deprecated
    public Format copyWithSubsampleOffsetUs(long subsampleOffsetUs) {
        return buildUpon().setSubsampleOffsetUs(subsampleOffsetUs).build();
    }

    @Deprecated
    public Format copyWithVideoSize(int width, int height) {
        return buildUpon().setWidth(width).setHeight(height).build();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || Format.class != obj.getClass()) {
            return false;
        }
        Format format = (Format) obj;
        int i2 = this.a;
        return (i2 == 0 || (i = format.a) == 0 || i2 == i) && this.selectionFlags == format.selectionFlags && this.roleFlags == format.roleFlags && this.averageBitrate == format.averageBitrate && this.peakBitrate == format.peakBitrate && this.maxInputSize == format.maxInputSize && this.subsampleOffsetUs == format.subsampleOffsetUs && this.width == format.width && this.height == format.height && this.rotationDegrees == format.rotationDegrees && this.stereoMode == format.stereoMode && this.channelCount == format.channelCount && this.sampleRate == format.sampleRate && this.pcmEncoding == format.pcmEncoding && this.encoderDelay == format.encoderDelay && this.encoderPadding == format.encoderPadding && this.accessibilityChannel == format.accessibilityChannel && Float.compare(this.frameRate, format.frameRate) == 0 && Float.compare(this.pixelWidthHeightRatio, format.pixelWidthHeightRatio) == 0 && Util.areEqual(this.exoMediaCryptoType, format.exoMediaCryptoType) && Util.areEqual(this.id, format.id) && Util.areEqual(this.label, format.label) && Util.areEqual(this.codecs, format.codecs) && Util.areEqual(this.containerMimeType, format.containerMimeType) && Util.areEqual(this.sampleMimeType, format.sampleMimeType) && Util.areEqual(this.language, format.language) && Arrays.equals(this.projectionData, format.projectionData) && Util.areEqual(this.metadata, format.metadata) && Util.areEqual(this.colorInfo, format.colorInfo) && Util.areEqual(this.drmInitData, format.drmInitData) && initializationDataEquals(format);
    }

    public int getPixelCount() {
        int i;
        int i2 = this.width;
        if (i2 == -1 || (i = this.height) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public int hashCode() {
        if (this.a == 0) {
            String str = this.id;
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
            int iHashCode7 = (((((((((((((((((((((((((((((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.maxInputSize) * 31) + ((int) this.subsampleOffsetUs)) * 31) + this.width) * 31) + this.height) * 31) + Float.floatToIntBits(this.frameRate)) * 31) + this.rotationDegrees) * 31) + Float.floatToIntBits(this.pixelWidthHeightRatio)) * 31) + this.stereoMode) * 31) + this.channelCount) * 31) + this.sampleRate) * 31) + this.pcmEncoding) * 31) + this.encoderDelay) * 31) + this.encoderPadding) * 31) + this.accessibilityChannel) * 31;
            Class<? extends ExoMediaCrypto> cls = this.exoMediaCryptoType;
            this.a = iHashCode7 + (cls != null ? cls.hashCode() : 0);
        }
        return this.a;
    }

    public boolean initializationDataEquals(Format other) {
        if (this.initializationData.size() != other.initializationData.size()) {
            return false;
        }
        for (int i = 0; i < this.initializationData.size(); i++) {
            if (!Arrays.equals(this.initializationData.get(i), other.initializationData.get(i))) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.label;
        String str3 = this.containerMimeType;
        String str4 = this.sampleMimeType;
        String str5 = this.codecs;
        int i = this.bitrate;
        String str6 = this.language;
        int i2 = this.width;
        int i3 = this.height;
        float f = this.frameRate;
        int i4 = this.channelCount;
        int i5 = this.sampleRate;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 104 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str6).length());
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str4);
        sb.append(", ");
        sb.append(str5);
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(str6);
        sb.append(", [");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(f);
        sb.append("], [");
        sb.append(i4);
        sb.append(", ");
        sb.append(i5);
        sb.append("])");
        return sb.toString();
    }

    public Format withManifestFormatInfo(Format manifestFormat) {
        String str;
        if (this == manifestFormat) {
            return this;
        }
        int trackType = MimeTypes.getTrackType(this.sampleMimeType);
        String str2 = manifestFormat.id;
        String str3 = manifestFormat.label;
        if (str3 == null) {
            str3 = this.label;
        }
        String str4 = this.language;
        if ((trackType == 3 || trackType == 1) && (str = manifestFormat.language) != null) {
            str4 = str;
        }
        int i = this.averageBitrate;
        if (i == -1) {
            i = manifestFormat.averageBitrate;
        }
        int i2 = this.peakBitrate;
        if (i2 == -1) {
            i2 = manifestFormat.peakBitrate;
        }
        String str5 = this.codecs;
        if (str5 == null) {
            String codecsOfType = Util.getCodecsOfType(manifestFormat.codecs, trackType);
            if (Util.splitCodecs(codecsOfType).length == 1) {
                str5 = codecsOfType;
            }
        }
        Metadata metadata = this.metadata;
        Metadata metadataCopyWithAppendedEntriesFrom = metadata == null ? manifestFormat.metadata : metadata.copyWithAppendedEntriesFrom(manifestFormat.metadata);
        float f = this.frameRate;
        if (f == -1.0f && trackType == 2) {
            f = manifestFormat.frameRate;
        }
        return buildUpon().setId(str2).setLabel(str3).setLanguage(str4).setSelectionFlags(this.selectionFlags | manifestFormat.selectionFlags).setRoleFlags(this.roleFlags | manifestFormat.roleFlags).setAverageBitrate(i).setPeakBitrate(i2).setCodecs(str5).setMetadata(metadataCopyWithAppendedEntriesFrom).setDrmInitData(DrmInitData.createSessionCreationData(manifestFormat.drmInitData, this.drmInitData)).setFrameRate(f).build();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.label);
        dest.writeString(this.language);
        dest.writeInt(this.selectionFlags);
        dest.writeInt(this.roleFlags);
        dest.writeInt(this.averageBitrate);
        dest.writeInt(this.peakBitrate);
        dest.writeString(this.codecs);
        dest.writeParcelable(this.metadata, 0);
        dest.writeString(this.containerMimeType);
        dest.writeString(this.sampleMimeType);
        dest.writeInt(this.maxInputSize);
        int size = this.initializationData.size();
        dest.writeInt(size);
        for (int i = 0; i < size; i++) {
            dest.writeByteArray(this.initializationData.get(i));
        }
        dest.writeParcelable(this.drmInitData, 0);
        dest.writeLong(this.subsampleOffsetUs);
        dest.writeInt(this.width);
        dest.writeInt(this.height);
        dest.writeFloat(this.frameRate);
        dest.writeInt(this.rotationDegrees);
        dest.writeFloat(this.pixelWidthHeightRatio);
        Util.writeBoolean(dest, this.projectionData != null);
        byte[] bArr = this.projectionData;
        if (bArr != null) {
            dest.writeByteArray(bArr);
        }
        dest.writeInt(this.stereoMode);
        dest.writeParcelable(this.colorInfo, flags);
        dest.writeInt(this.channelCount);
        dest.writeInt(this.sampleRate);
        dest.writeInt(this.pcmEncoding);
        dest.writeInt(this.encoderDelay);
        dest.writeInt(this.encoderPadding);
        dest.writeInt(this.accessibilityChannel);
    }

    private Format(Builder builder) {
        this.id = builder.a;
        this.label = builder.b;
        this.language = Util.normalizeLanguageCode(builder.c);
        this.selectionFlags = builder.d;
        this.roleFlags = builder.e;
        int i = builder.f;
        this.averageBitrate = i;
        int i2 = builder.g;
        this.peakBitrate = i2;
        this.bitrate = i2 != -1 ? i2 : i;
        this.codecs = builder.h;
        this.metadata = builder.i;
        this.containerMimeType = builder.j;
        this.sampleMimeType = builder.k;
        this.maxInputSize = builder.l;
        this.initializationData = builder.m == null ? Collections.emptyList() : builder.m;
        DrmInitData drmInitData = builder.n;
        this.drmInitData = drmInitData;
        this.subsampleOffsetUs = builder.o;
        this.width = builder.p;
        this.height = builder.q;
        this.frameRate = builder.r;
        this.rotationDegrees = builder.s == -1 ? 0 : builder.s;
        this.pixelWidthHeightRatio = builder.t == -1.0f ? 1.0f : builder.t;
        this.projectionData = builder.u;
        this.stereoMode = builder.v;
        this.colorInfo = builder.w;
        this.channelCount = builder.x;
        this.sampleRate = builder.y;
        this.pcmEncoding = builder.z;
        this.encoderDelay = builder.A == -1 ? 0 : builder.A;
        this.encoderPadding = builder.B != -1 ? builder.B : 0;
        this.accessibilityChannel = builder.C;
        if (builder.D != null || drmInitData == null) {
            this.exoMediaCryptoType = builder.D;
        } else {
            this.exoMediaCryptoType = UnsupportedMediaCrypto.class;
        }
    }

    @Deprecated
    public static Format createVideoSampleFormat(@Nullable String id, @Nullable String sampleMimeType, @Nullable String codecs, int bitrate, int maxInputSize, int width, int height, float frameRate, @Nullable List<byte[]> initializationData, int rotationDegrees, float pixelWidthHeightRatio, @Nullable DrmInitData drmInitData) {
        return new Builder().setId(id).setAverageBitrate(bitrate).setPeakBitrate(bitrate).setCodecs(codecs).setSampleMimeType(sampleMimeType).setMaxInputSize(maxInputSize).setInitializationData(initializationData).setDrmInitData(drmInitData).setWidth(width).setHeight(height).setFrameRate(frameRate).setRotationDegrees(rotationDegrees).setPixelWidthHeightRatio(pixelWidthHeightRatio).build();
    }

    @Deprecated
    public static Format createAudioSampleFormat(@Nullable String id, @Nullable String sampleMimeType, @Nullable String codecs, int bitrate, int maxInputSize, int channelCount, int sampleRate, int pcmEncoding, @Nullable List<byte[]> initializationData, @Nullable DrmInitData drmInitData, int selectionFlags, @Nullable String language) {
        return new Builder().setId(id).setLanguage(language).setSelectionFlags(selectionFlags).setAverageBitrate(bitrate).setPeakBitrate(bitrate).setCodecs(codecs).setSampleMimeType(sampleMimeType).setMaxInputSize(maxInputSize).setInitializationData(initializationData).setDrmInitData(drmInitData).setChannelCount(channelCount).setSampleRate(sampleRate).setPcmEncoding(pcmEncoding).build();
    }

    public Format(Parcel in) {
        this.id = in.readString();
        this.label = in.readString();
        this.language = in.readString();
        this.selectionFlags = in.readInt();
        this.roleFlags = in.readInt();
        int i = in.readInt();
        this.averageBitrate = i;
        int i2 = in.readInt();
        this.peakBitrate = i2;
        this.bitrate = i2 != -1 ? i2 : i;
        this.codecs = in.readString();
        this.metadata = (Metadata) in.readParcelable(Metadata.class.getClassLoader());
        this.containerMimeType = in.readString();
        this.sampleMimeType = in.readString();
        this.maxInputSize = in.readInt();
        int i3 = in.readInt();
        this.initializationData = new ArrayList(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            this.initializationData.add((byte[]) Assertions.checkNotNull(in.createByteArray()));
        }
        DrmInitData drmInitData = (DrmInitData) in.readParcelable(DrmInitData.class.getClassLoader());
        this.drmInitData = drmInitData;
        this.subsampleOffsetUs = in.readLong();
        this.width = in.readInt();
        this.height = in.readInt();
        this.frameRate = in.readFloat();
        this.rotationDegrees = in.readInt();
        this.pixelWidthHeightRatio = in.readFloat();
        this.projectionData = Util.readBoolean(in) ? in.createByteArray() : null;
        this.stereoMode = in.readInt();
        this.colorInfo = (ColorInfo) in.readParcelable(ColorInfo.class.getClassLoader());
        this.channelCount = in.readInt();
        this.sampleRate = in.readInt();
        this.pcmEncoding = in.readInt();
        this.encoderDelay = in.readInt();
        this.encoderPadding = in.readInt();
        this.accessibilityChannel = in.readInt();
        this.exoMediaCryptoType = drmInitData != null ? UnsupportedMediaCrypto.class : null;
    }
}
