package androidx.media3.transformer;

import android.media.MediaCodecInfo;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import defpackage.amn;

/* JADX INFO: loaded from: classes21.dex */
public interface EncoderSelector {
    public static final EncoderSelector DEFAULT = new EncoderSelector() { // from class: androidx.media3.transformer.EncoderSelector$$ExternalSyntheticLambda1
        @Override // androidx.media3.transformer.EncoderSelector
        public final ImmutableList selectEncoderInfos(String str) {
            return EncoderSelector.lambda$static$1(str);
        }
    };

    ImmutableList<MediaCodecInfo> selectEncoderInfos(String str);

    static /* synthetic */ ImmutableList lambda$static$1(final String str) {
        ImmutableList<MediaCodecInfo> supportedEncoders = EncoderUtil.getSupportedEncoders(str);
        ImmutableList immutableListCopyOf = ImmutableList.copyOf(amn.d(supportedEncoders, new Predicate() { // from class: androidx.media3.transformer.EncoderSelector$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Predicate
            public final boolean apply(Object obj) {
                return EncoderUtil.isHardwareAccelerated((MediaCodecInfo) obj, str);
            }
        }));
        return immutableListCopyOf.isEmpty() ? supportedEncoders : immutableListCopyOf;
    }
}
