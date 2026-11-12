package androidx.media3.muxer;

import android.media.MediaCodec;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import defpackage.aml;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes21.dex */
class Mp4MoovStructure {
    private final int lastFrameDurationBehavior;
    private final MetadataCollector metadataCollector;

    public interface TrackMetadataProvider {
        Format format();

        int videoUnitTimebase();

        ImmutableList<Long> writtenChunkOffsets();

        ImmutableList<Integer> writtenChunkSampleCounts();

        ImmutableList<MediaCodec.BufferInfo> writtenSamples();
    }

    public Mp4MoovStructure(MetadataCollector metadataCollector, int i) {
        this.metadataCollector = metadataCollector;
        this.lastFrameDurationBehavior = i;
    }

    public ByteBuffer moovMetadataHeader(List<? extends TrackMetadataProvider> list, long j, boolean z) {
        ByteBuffer byteBufferMeta;
        ByteBuffer byteBufferAllocate;
        ByteBuffer byteBufferCo64;
        ByteBuffer byteBufferNmhd;
        ByteBuffer byteBufferStbl;
        String str;
        String str2;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i = (int) this.metadataCollector.timestampData.creationTimestampSeconds;
        int i2 = (int) this.metadataCollector.timestampData.modificationTimestampSeconds;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        long jMax = 0;
        int i3 = 1;
        int i4 = 0;
        while (i4 < list.size()) {
            TrackMetadataProvider trackMetadataProvider = list.get(i4);
            if (z || !trackMetadataProvider.writtenSamples().isEmpty()) {
                Format format = trackMetadataProvider.format();
                String strBcp47LanguageTagToIso3 = bcp47LanguageTagToIso3(format.language);
                ArrayList arrayList5 = arrayList3;
                ArrayList arrayList6 = arrayList4;
                List<Long> listConvertPresentationTimestampsToDurationsVu = Boxes.convertPresentationTimestampsToDurationsVu(trackMetadataProvider.writtenSamples(), j, trackMetadataProvider.videoUnitTimebase(), this.lastFrameDurationBehavior);
                long jLongValue = 0;
                for (int i5 = 0; i5 < listConvertPresentationTimestampsToDurationsVu.size(); i5++) {
                    jLongValue += listConvertPresentationTimestampsToDurationsVu.get(i5).longValue();
                }
                long j2 = jMax;
                long jUsFromVu = usFromVu(jLongValue, trackMetadataProvider.videoUnitTimebase());
                int trackType = MimeTypes.getTrackType(format.sampleMimeType);
                ByteBuffer byteBufferStts = Boxes.stts(listConvertPresentationTimestampsToDurationsVu);
                if (MimeTypes.isVideo(format.sampleMimeType)) {
                    byteBufferAllocate = Boxes.ctts(trackMetadataProvider.writtenSamples(), listConvertPresentationTimestampsToDurationsVu, trackMetadataProvider.videoUnitTimebase());
                } else {
                    byteBufferAllocate = ByteBuffer.allocate(0);
                }
                ByteBuffer byteBufferStsz = Boxes.stsz(trackMetadataProvider.writtenSamples());
                ByteBuffer byteBufferStsc = Boxes.stsc(trackMetadataProvider.writtenChunkSampleCounts());
                if (z) {
                    byteBufferCo64 = Boxes.stco(trackMetadataProvider.writtenChunkOffsets());
                } else {
                    byteBufferCo64 = Boxes.co64(trackMetadataProvider.writtenChunkOffsets());
                }
                if (trackType == -1 || trackType == 5) {
                    byteBufferNmhd = Boxes.nmhd();
                    byteBufferStbl = Boxes.stbl(Boxes.stsd(Boxes.textMetaDataSampleEntry(format)), byteBufferStts, byteBufferStsz, byteBufferStsc, byteBufferCo64);
                    str = "meta";
                    str2 = "MetaHandle";
                } else if (trackType == 1) {
                    byteBufferNmhd = Boxes.smhd();
                    byteBufferStbl = Boxes.stbl(Boxes.stsd(Boxes.audioSampleEntry(format)), byteBufferStts, byteBufferStsz, byteBufferStsc, byteBufferCo64);
                    str = "soun";
                    str2 = "SoundHandle";
                } else if (trackType == 2) {
                    byteBufferNmhd = Boxes.vmhd();
                    byteBufferStbl = Boxes.stbl(Boxes.stsd(Boxes.videoSampleEntry(format)), byteBufferStts, byteBufferAllocate, byteBufferStsz, byteBufferStsc, byteBufferCo64, Boxes.stss(trackMetadataProvider.writtenSamples()));
                    str = "vide";
                    str2 = "VideoHandle";
                } else {
                    throw new IllegalArgumentException("Unsupported track type");
                }
                int i6 = i3;
                ByteBuffer byteBufferTrak = Boxes.trak(Boxes.tkhd(i3, jUsFromVu, i, i2, this.metadataCollector.orientationData.orientation, format), Boxes.mdia(Boxes.mdhd(jLongValue, trackMetadataProvider.videoUnitTimebase(), i, i2, strBcp47LanguageTagToIso3), Boxes.hdlr(str, str2), Boxes.minf(byteBufferNmhd, Boxes.dinf(Boxes.dref(Boxes.localUrl())), byteBufferStbl)));
                arrayList = arrayList5;
                arrayList.add(byteBufferTrak);
                jMax = Math.max(j2, jUsFromVu);
                arrayList2 = arrayList6;
                arrayList2.add(Boxes.trex(i6));
                i3 = i6 + 1;
            } else {
                arrayList = arrayList3;
                arrayList2 = arrayList4;
            }
            i4++;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
        }
        ArrayList arrayList7 = arrayList3;
        ArrayList arrayList8 = arrayList4;
        ByteBuffer byteBufferMvhd = Boxes.mvhd(i3, i, i2, jMax);
        ByteBuffer byteBufferUdta = Boxes.udta(this.metadataCollector.locationData);
        if (this.metadataCollector.metadataEntries.isEmpty()) {
            byteBufferMeta = ByteBuffer.allocate(0);
        } else {
            byteBufferMeta = Boxes.meta(Boxes.hdlr("mdta", ""), Boxes.keys(aml.a(this.metadataCollector.metadataEntries)), Boxes.ilst(aml.a(this.metadataCollector.metadataEntries)));
        }
        ByteBuffer byteBufferMoov = Boxes.moov(byteBufferMvhd, byteBufferUdta, byteBufferMeta, arrayList7, z ? Boxes.mvex(arrayList8) : ByteBuffer.allocate(0));
        return this.metadataCollector.xmpData != null ? BoxUtils.concatenateBuffers(byteBufferMoov, Boxes.uuid(Boxes.XMP_UUID, ByteBuffer.wrap(this.metadataCollector.xmpData.data))) : byteBufferMoov;
    }

    private static String bcp47LanguageTagToIso3(String str) {
        if (str == null) {
            return null;
        }
        Locale localeForLanguageTag = Util.SDK_INT >= 21 ? Locale.forLanguageTag(str) : new Locale(str);
        return localeForLanguageTag.getISO3Language().isEmpty() ? str : localeForLanguageTag.getISO3Language();
    }

    private static long usFromVu(long j, long j2) {
        return (j * 1000000) / j2;
    }
}
