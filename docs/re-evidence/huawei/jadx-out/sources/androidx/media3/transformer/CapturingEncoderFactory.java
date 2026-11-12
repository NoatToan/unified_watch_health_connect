package androidx.media3.transformer;

import androidx.media3.common.Format;

/* JADX INFO: loaded from: classes21.dex */
final class CapturingEncoderFactory implements Codec.EncoderFactory {
    private String audioEncoderName;
    private final Codec.EncoderFactory encoderFactory;
    private String videoEncoderName;

    public CapturingEncoderFactory(Codec.EncoderFactory encoderFactory) {
        this.encoderFactory = encoderFactory;
    }

    @Override // androidx.media3.transformer.Codec.EncoderFactory
    public Codec createForAudioEncoding(Format format) throws ExportException {
        Codec codecCreateForAudioEncoding = this.encoderFactory.createForAudioEncoding(format);
        this.audioEncoderName = codecCreateForAudioEncoding.getName();
        return codecCreateForAudioEncoding;
    }

    @Override // androidx.media3.transformer.Codec.EncoderFactory
    public Codec createForVideoEncoding(Format format) throws ExportException {
        Codec codecCreateForVideoEncoding = this.encoderFactory.createForVideoEncoding(format);
        this.videoEncoderName = codecCreateForVideoEncoding.getName();
        return codecCreateForVideoEncoding;
    }

    @Override // androidx.media3.transformer.Codec.EncoderFactory
    public boolean audioNeedsEncoding() {
        return this.encoderFactory.audioNeedsEncoding();
    }

    @Override // androidx.media3.transformer.Codec.EncoderFactory
    public boolean videoNeedsEncoding() {
        return this.encoderFactory.videoNeedsEncoding();
    }

    public String getAudioEncoderName() {
        return this.audioEncoderName;
    }

    public String getVideoEncoderName() {
        return this.videoEncoderName;
    }
}
