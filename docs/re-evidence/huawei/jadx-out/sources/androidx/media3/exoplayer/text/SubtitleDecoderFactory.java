package androidx.media3.exoplayer.text;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.extractor.text.DefaultSubtitleParserFactory;
import androidx.media3.extractor.text.SubtitleDecoder;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.cea.Cea608Decoder;
import androidx.media3.extractor.text.cea.Cea708Decoder;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public interface SubtitleDecoderFactory {
    public static final SubtitleDecoderFactory DEFAULT = new SubtitleDecoderFactory() { // from class: androidx.media3.exoplayer.text.SubtitleDecoderFactory.1
        private final DefaultSubtitleParserFactory delegate = new DefaultSubtitleParserFactory();

        @Override // androidx.media3.exoplayer.text.SubtitleDecoderFactory
        public boolean supportsFormat(Format format) {
            String str = format.sampleMimeType;
            return this.delegate.supportsFormat(format) || Objects.equals(str, MimeTypes.APPLICATION_CEA608) || Objects.equals(str, MimeTypes.APPLICATION_MP4CEA608) || Objects.equals(str, MimeTypes.APPLICATION_CEA708);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x003b  */
        @Override // androidx.media3.exoplayer.text.SubtitleDecoderFactory
        public SubtitleDecoder createDecoder(Format format) {
            byte b2;
            String str = format.sampleMimeType;
            if (str != null) {
                str.hashCode();
                int iHashCode = str.hashCode();
                if (iHashCode != 930165504) {
                    if (iHashCode != 1566015601) {
                        if (iHashCode == 1566016562 && str.equals(MimeTypes.APPLICATION_CEA708)) {
                            b2 = 2;
                        } else {
                            b2 = -1;
                        }
                    } else if (str.equals(MimeTypes.APPLICATION_CEA608)) {
                        b2 = 1;
                    } else {
                        b2 = -1;
                    }
                } else if (str.equals(MimeTypes.APPLICATION_MP4CEA608)) {
                    b2 = 0;
                } else {
                    b2 = -1;
                }
                if (b2 == 0 || b2 == 1) {
                    return new Cea608Decoder(str, format.accessibilityChannel, Cea608Decoder.MIN_DATA_CHANNEL_TIMEOUT_MS);
                }
                if (b2 == 2) {
                    return new Cea708Decoder(format.accessibilityChannel, format.initializationData);
                }
            }
            if (this.delegate.supportsFormat(format)) {
                SubtitleParser subtitleParserCreate = this.delegate.create(format);
                return new DelegatingSubtitleDecoder(subtitleParserCreate.getClass().getSimpleName() + "Decoder", subtitleParserCreate);
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    };

    SubtitleDecoder createDecoder(Format format);

    boolean supportsFormat(Format format);
}
