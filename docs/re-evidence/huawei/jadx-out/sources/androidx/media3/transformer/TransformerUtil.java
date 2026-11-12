package androidx.media3.transformer;

import android.util.Pair;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Effect;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.effect.GlEffect;
import androidx.media3.effect.ScaleAndRotateTransformation;
import androidx.media3.extractor.metadata.mp4.SlowMotionData;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes21.dex */
public final class TransformerUtil {
    public static int getMediaCodecFlags(int i) {
        int i2 = (i & 1) != 1 ? 0 : 1;
        return (i & 4) == 4 ? i2 | 4 : i2;
    }

    private TransformerUtil() {
    }

    public static int getProcessedTrackType(String str) {
        int trackType = MimeTypes.getTrackType(str);
        if (trackType == 4) {
            return 2;
        }
        return trackType;
    }

    public static boolean shouldTranscodeAudio(Format format, Composition composition, int i, TransformationRequest transformationRequest, Codec.EncoderFactory encoderFactory, MuxerWrapper muxerWrapper) {
        if (composition.sequences.size() > 1 || composition.sequences.get(i).editedMediaItems.size() > 1) {
            return !composition.transmuxAudio;
        }
        if (encoderFactory.audioNeedsEncoding()) {
            return true;
        }
        if (transformationRequest.audioMimeType != null && !transformationRequest.audioMimeType.equals(format.sampleMimeType)) {
            return true;
        }
        if (transformationRequest.audioMimeType == null && !muxerWrapper.supportsSampleMimeType(format.sampleMimeType)) {
            return true;
        }
        EditedMediaItem editedMediaItem = composition.sequences.get(i).editedMediaItems.get(0);
        return ((!editedMediaItem.flattenForSlowMotion || !containsSlowMotionData(format)) && editedMediaItem.effects.audioProcessors.isEmpty() && composition.effects.audioProcessors.isEmpty()) ? false : true;
    }

    private static boolean containsSlowMotionData(Format format) {
        Metadata metadata = format.metadata;
        if (metadata == null) {
            return false;
        }
        for (int i = 0; i < metadata.length(); i++) {
            if (metadata.get(i) instanceof SlowMotionData) {
                return true;
            }
        }
        return false;
    }

    public static boolean shouldTranscodeVideo(Format format, Composition composition, int i, TransformationRequest transformationRequest, Codec.EncoderFactory encoderFactory, MuxerWrapper muxerWrapper) {
        if (composition.sequences.size() > 1 || composition.sequences.get(i).editedMediaItems.size() > 1) {
            return !composition.transmuxVideo;
        }
        EditedMediaItem editedMediaItem = composition.sequences.get(i).editedMediaItems.get(0);
        if (encoderFactory.videoNeedsEncoding() || transformationRequest.hdrMode != 0) {
            return true;
        }
        if (transformationRequest.videoMimeType != null && !transformationRequest.videoMimeType.equals(format.sampleMimeType)) {
            return true;
        }
        if ((transformationRequest.videoMimeType == null && !muxerWrapper.supportsSampleMimeType(format.sampleMimeType)) || format.pixelWidthHeightRatio != 1.0f) {
            return true;
        }
        ImmutableList<Effect> immutableList = editedMediaItem.effects.videoEffects;
        return !immutableList.isEmpty() && maybeCalculateTotalRotationDegreesAppliedInEffects(immutableList, format) == -1.0f;
    }

    private static float maybeCalculateTotalRotationDegreesAppliedInEffects(ImmutableList<Effect> immutableList, Format format) {
        int i = format.rotationDegrees % 180 == 0 ? format.width : format.height;
        int i2 = format.rotationDegrees % 180 == 0 ? format.height : format.width;
        float f = 0.0f;
        for (int i3 = 0; i3 < immutableList.size(); i3++) {
            Effect effect = immutableList.get(i3);
            if (!(effect instanceof GlEffect)) {
                return -1.0f;
            }
            GlEffect glEffect = (GlEffect) effect;
            if (effect instanceof ScaleAndRotateTransformation) {
                ScaleAndRotateTransformation scaleAndRotateTransformation = (ScaleAndRotateTransformation) effect;
                if (scaleAndRotateTransformation.scaleX != 1.0f || scaleAndRotateTransformation.scaleY != 1.0f) {
                    return -1.0f;
                }
                float f2 = scaleAndRotateTransformation.rotationDegrees;
                if (f2 % 90.0f != 0.0f) {
                    return -1.0f;
                }
                f += f2;
                float f3 = f % 180.0f;
                int i4 = f3 == 0.0f ? format.width : format.height;
                i2 = f3 == 0.0f ? format.height : format.width;
                i = i4;
            } else if (!glEffect.isNoOp(i, i2)) {
                return -1.0f;
            }
        }
        float f4 = f % 360.0f;
        if (f4 % 90.0f == 0.0f) {
            return f4;
        }
        return -1.0f;
    }

    public static void maybeSetMuxerWrapperAdditionalRotationDegrees(MuxerWrapper muxerWrapper, ImmutableList<Effect> immutableList, Format format) {
        float fMaybeCalculateTotalRotationDegreesAppliedInEffects = maybeCalculateTotalRotationDegreesAppliedInEffects(immutableList, format);
        if (fMaybeCalculateTotalRotationDegreesAppliedInEffects == 90.0f || fMaybeCalculateTotalRotationDegreesAppliedInEffects == 180.0f || fMaybeCalculateTotalRotationDegreesAppliedInEffects == 270.0f) {
            muxerWrapper.setAdditionalRotationDegrees(360 - Math.round(fMaybeCalculateTotalRotationDegreesAppliedInEffects));
        }
    }

    public static ColorInfo getValidColor(ColorInfo colorInfo) {
        return (colorInfo == null || !colorInfo.isDataSpaceValid()) ? ColorInfo.SDR_BT709_LIMITED : colorInfo;
    }

    public static ColorInfo getDecoderOutputColor(ColorInfo colorInfo, boolean z) {
        return (z && ColorInfo.isTransferHdr(colorInfo)) ? ColorInfo.SDR_BT709_LIMITED : colorInfo;
    }

    public static Pair<String, Integer> getOutputMimeTypeAndHdrModeAfterFallback(int i, String str, ColorInfo colorInfo) {
        if (i == 0 && ColorInfo.isTransferHdr(colorInfo) && EncoderUtil.getSupportedEncodersForHdrEditing(str, colorInfo).isEmpty()) {
            if (EncoderUtil.getSupportedEncodersForHdrEditing(MimeTypes.VIDEO_H265, colorInfo).isEmpty()) {
                i = 2;
            } else {
                str = MimeTypes.VIDEO_H265;
            }
        }
        return Pair.create(str, Integer.valueOf(i));
    }
}
