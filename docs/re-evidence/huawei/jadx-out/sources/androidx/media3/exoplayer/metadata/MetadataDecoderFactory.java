package androidx.media3.exoplayer.metadata;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.extractor.metadata.MetadataDecoder;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import androidx.media3.extractor.metadata.emsg.EventMessageDecoder;
import androidx.media3.extractor.metadata.icy.IcyDecoder;
import androidx.media3.extractor.metadata.id3.Id3Decoder;
import androidx.media3.extractor.metadata.scte35.SpliceInfoDecoder;

/* JADX INFO: loaded from: classes4.dex */
public interface MetadataDecoderFactory {
    public static final MetadataDecoderFactory DEFAULT = new MetadataDecoderFactory() { // from class: androidx.media3.exoplayer.metadata.MetadataDecoderFactory.1
        @Override // androidx.media3.exoplayer.metadata.MetadataDecoderFactory
        public boolean supportsFormat(Format format) {
            String str = format.sampleMimeType;
            return MimeTypes.APPLICATION_ID3.equals(str) || MimeTypes.APPLICATION_EMSG.equals(str) || MimeTypes.APPLICATION_SCTE35.equals(str) || MimeTypes.APPLICATION_ICY.equals(str) || MimeTypes.APPLICATION_AIT.equals(str);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:27:0x004a  */
        @Override // androidx.media3.exoplayer.metadata.MetadataDecoderFactory
        public MetadataDecoder createDecoder(Format format) {
            byte b2;
            String str = format.sampleMimeType;
            if (str != null) {
                str.hashCode();
                switch (str) {
                    case "application/vnd.dvb.ait":
                        b2 = 0;
                        break;
                    case "application/x-icy":
                        b2 = 1;
                        break;
                    case "application/id3":
                        b2 = 2;
                        break;
                    case "application/x-emsg":
                        b2 = 3;
                        break;
                    case "application/x-scte35":
                        b2 = 4;
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                if (b2 == 0) {
                    return new AppInfoTableDecoder();
                }
                if (b2 == 1) {
                    return new IcyDecoder();
                }
                if (b2 == 2) {
                    return new Id3Decoder();
                }
                if (b2 == 3) {
                    return new EventMessageDecoder();
                }
                if (b2 == 4) {
                    return new SpliceInfoDecoder();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    };

    MetadataDecoder createDecoder(Format format);

    boolean supportsFormat(Format format);
}
