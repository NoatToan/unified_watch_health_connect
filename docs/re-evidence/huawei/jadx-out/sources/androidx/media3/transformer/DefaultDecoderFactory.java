package androidx.media3.transformer;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Build;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.MediaFormatUtil;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.mediacodec.MediaCodecInfo;
import androidx.media3.exoplayer.mediacodec.MediaCodecSelector;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class DefaultDecoderFactory implements Codec.DecoderFactory {
    private static final String TAG = "DefaultDecoderFactory";
    private final int codecPriority;
    private final Context context;
    private final boolean enableDecoderFallback;
    private final Listener listener;
    private final MediaCodecSelector mediaCodecSelector;

    public interface Listener {
        void onCodecInitialized(String str, List<ExportException> list);
    }

    public static final class Builder {
        private final Context context;
        private boolean enableDecoderFallback;
        private Listener listener = new Listener() { // from class: androidx.media3.transformer.DefaultDecoderFactory$Builder$$ExternalSyntheticLambda0
            @Override // androidx.media3.transformer.DefaultDecoderFactory.Listener
            public final void onCodecInitialized(String str, List list) {
                DefaultDecoderFactory.Builder.lambda$new$0(str, list);
            }
        };
        private int codecPriority = -2000;
        private MediaCodecSelector mediaCodecSelector = MediaCodecSelector.DEFAULT;

        static /* synthetic */ void lambda$new$0(String str, List list) {
        }

        public Builder(Context context) {
            this.context = context.getApplicationContext();
        }

        public Builder setListener(Listener listener) {
            this.listener = listener;
            return this;
        }

        public Builder setEnableDecoderFallback(boolean z) {
            this.enableDecoderFallback = z;
            return this;
        }

        public Builder setCodecPriority(int i) {
            this.codecPriority = i;
            return this;
        }

        public Builder setMediaCodecSelector(MediaCodecSelector mediaCodecSelector) {
            this.mediaCodecSelector = mediaCodecSelector;
            return this;
        }

        public DefaultDecoderFactory build() {
            return new DefaultDecoderFactory(this);
        }
    }

    @Deprecated
    public DefaultDecoderFactory(Context context) {
        this(new Builder(context));
    }

    @Deprecated
    public DefaultDecoderFactory(Context context, boolean z, Listener listener) {
        this(new Builder(context).setEnableDecoderFallback(z).setListener(listener));
    }

    private DefaultDecoderFactory(Builder builder) {
        this.context = builder.context;
        this.enableDecoderFallback = builder.enableDecoderFallback;
        this.listener = builder.listener;
        this.codecPriority = builder.codecPriority;
        this.mediaCodecSelector = builder.mediaCodecSelector;
    }

    @Override // androidx.media3.transformer.Codec.DecoderFactory
    public DefaultCodec createForAudioDecoding(Format format) throws ExportException {
        return createCodecForMediaFormat(MediaFormatUtil.createMediaFormatFromFormat(format), format, null, false);
    }

    @Override // androidx.media3.transformer.Codec.DecoderFactory
    public DefaultCodec createForVideoDecoding(Format format, Surface surface, boolean z) throws ExportException {
        if (ColorInfo.isTransferHdr(format.colorInfo)) {
            if (z && (Util.SDK_INT < 31 || deviceNeedsDisableToneMappingWorkaround(((ColorInfo) Assertions.checkNotNull(format.colorInfo)).colorTransfer))) {
                throw createExportException(format, "Tone-mapping HDR is not supported on this device.");
            }
            if (Util.SDK_INT < 29) {
                throw createExportException(format, "Decoding HDR is not supported on this device.");
            }
        }
        if (deviceNeedsDisable8kWorkaround(format)) {
            throw createExportException(format, "Decoding 8k is not supported on this device.");
        }
        if (deviceNeedsNoFrameRateWorkaround()) {
            format = format.buildUpon().setFrameRate(-1.0f).build();
        }
        MediaFormat mediaFormatCreateMediaFormatFromFormat = MediaFormatUtil.createMediaFormatFromFormat(format);
        if (decoderSupportsKeyAllowFrameDrop(this.context)) {
            mediaFormatCreateMediaFormatFromFormat.setInteger("allow-frame-drop", 0);
        }
        if (Util.SDK_INT >= 31 && z) {
            mediaFormatCreateMediaFormatFromFormat.setInteger("color-transfer-request", 3);
        }
        Pair<Integer, Integer> codecProfileAndLevel = MediaCodecUtil.getCodecProfileAndLevel(format);
        if (codecProfileAndLevel != null) {
            MediaFormatUtil.maybeSetInteger(mediaFormatCreateMediaFormatFromFormat, "profile", ((Integer) codecProfileAndLevel.first).intValue());
            MediaFormatUtil.maybeSetInteger(mediaFormatCreateMediaFormatFromFormat, "level", ((Integer) codecProfileAndLevel.second).intValue());
        }
        if (Util.SDK_INT >= 35) {
            mediaFormatCreateMediaFormatFromFormat.setInteger("importance", Math.max(0, -this.codecPriority));
        }
        return createCodecForMediaFormat(mediaFormatCreateMediaFormatFromFormat, format, surface, devicePrefersSoftwareDecoder(format));
    }

    private DefaultCodec createCodecForMediaFormat(MediaFormat mediaFormat, Format format, Surface surface, boolean z) throws ExportException {
        ImmutableList.of();
        Assertions.checkNotNull(format.sampleMimeType);
        try {
            List<MediaCodecInfo> decoderInfosSortedByFormatSupport = MediaCodecUtil.getDecoderInfosSortedByFormatSupport(MediaCodecUtil.getDecoderInfosSoftMatch(this.mediaCodecSelector, format, false, false), format);
            if (decoderInfosSortedByFormatSupport.isEmpty()) {
                throw createExportException(format, "No decoders for format");
            }
            if (z) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < decoderInfosSortedByFormatSupport.size(); i++) {
                    MediaCodecInfo mediaCodecInfo = decoderInfosSortedByFormatSupport.get(i);
                    if (!mediaCodecInfo.hardwareAccelerated) {
                        arrayList.add(mediaCodecInfo);
                    }
                }
                if (!arrayList.isEmpty()) {
                    decoderInfosSortedByFormatSupport = arrayList;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Context context = this.context;
            if (!this.enableDecoderFallback) {
                decoderInfosSortedByFormatSupport = decoderInfosSortedByFormatSupport.subList(0, 1);
            }
            DefaultCodec defaultCodecCreateCodecFromDecoderInfos = createCodecFromDecoderInfos(context, decoderInfosSortedByFormatSupport, format, mediaFormat, surface, arrayList2);
            this.listener.onCodecInitialized(defaultCodecCreateCodecFromDecoderInfos.getName(), arrayList2);
            return defaultCodecCreateCodecFromDecoderInfos;
        } catch (MediaCodecUtil.DecoderQueryException e) {
            Log.e(TAG, "Error querying decoders", e);
            throw createExportException(format, "Querying codecs failed");
        }
    }

    private static DefaultCodec createCodecFromDecoderInfos(Context context, List<MediaCodecInfo> list, Format format, MediaFormat mediaFormat, Surface surface, List<ExportException> list2) throws ExportException {
        for (MediaCodecInfo mediaCodecInfo : list) {
            mediaFormat.setString("mime", mediaCodecInfo.codecMimeType);
            try {
                return new DefaultCodec(context, format, mediaFormat, mediaCodecInfo.name, true, surface);
            } catch (ExportException e) {
                list2.add(e);
            }
        }
        throw list2.get(0);
    }

    private static boolean deviceNeedsDisable8kWorkaround(Format format) {
        if (Util.SDK_INT >= 31 || format.width < 7680 || format.height < 4320 || format.sampleMimeType == null || !format.sampleMimeType.equals(MimeTypes.VIDEO_H265)) {
            return false;
        }
        return Util.MODEL.equals("SM-F711U1") || Util.MODEL.equals("SM-F926U1");
    }

    private static boolean deviceNeedsDisableToneMappingWorkaround(int i) {
        if (Util.MANUFACTURER.equals("Google") && Build.ID.startsWith("TP1A")) {
            return true;
        }
        if (i == 7 && (Util.MODEL.startsWith("SM-F936") || Util.MODEL.startsWith("SM-F916") || Util.MODEL.startsWith("SM-F721") || Util.MODEL.equals("SM-X900"))) {
            return true;
        }
        return Util.SDK_INT < 34 && i == 6 && Util.MODEL.startsWith("SM-F936");
    }

    private static boolean deviceNeedsNoFrameRateWorkaround() {
        return Util.SDK_INT < 30 && Util.DEVICE.equals("joyeuse");
    }

    private static boolean decoderSupportsKeyAllowFrameDrop(Context context) {
        return Util.SDK_INT >= 29 && context.getApplicationInfo().targetSdkVersion >= 29;
    }

    private static boolean devicePrefersSoftwareDecoder(Format format) {
        if (format.width * format.height >= 2073600) {
            return Ascii.equalsIgnoreCase(Util.MODEL, "vivo 1906") || Ascii.equalsIgnoreCase(Util.MODEL, "redmi 8");
        }
        return false;
    }

    private static ExportException createExportException(Format format, String str) {
        return ExportException.createForCodec(new IllegalArgumentException(str), 3003, new ExportException.CodecInfo(format.toString(), MimeTypes.isVideo((String) Assertions.checkNotNull(format.sampleMimeType)), true, null));
    }
}
