package androidx.media3.extractor.mp4;

import android.util.Pair;
import androidx.media3.common.C;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4LocationData;
import androidx.media3.container.Mp4TimestampData;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.Ac3Util;
import androidx.media3.extractor.Ac4Util;
import androidx.media3.extractor.AvcConfig;
import androidx.media3.extractor.DolbyVisionConfig;
import androidx.media3.extractor.ExtractorUtil;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.HevcConfig;
import androidx.media3.extractor.OpusUtil;
import androidx.media3.extractor.VorbisUtil;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class AtomParsers {
    private static final int MAX_GAPLESS_TRIM_SIZE_SAMPLES = 4;
    private static final String TAG = "AtomParsers";
    private static final int TYPE_clcp = 1668047728;
    private static final int TYPE_mdta = 1835299937;
    private static final int TYPE_meta = 1835365473;
    private static final int TYPE_nclc = 1852009571;
    private static final int TYPE_nclx = 1852009592;
    private static final int TYPE_sbtl = 1935832172;
    private static final int TYPE_soun = 1936684398;
    private static final int TYPE_subt = 1937072756;
    private static final int TYPE_text = 1952807028;
    private static final int TYPE_vide = 1986618469;
    private static final byte[] opusMagic = Util.getUtf8Bytes("OpusHead");

    interface SampleSizeBox {
        int getFixedSampleSize();

        int getSampleCount();

        int readNextSampleSize();
    }

    private static boolean canTrimSamplesWithTimestampChange(int i) {
        return i != 1;
    }

    private static int getTrackTypeForHdlr(int i) {
        if (i == TYPE_soun) {
            return 1;
        }
        if (i == TYPE_vide) {
            return 2;
        }
        if (i == TYPE_text || i == TYPE_sbtl || i == TYPE_subt || i == TYPE_clcp) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    public static List<TrackSampleTable> parseTraks(Atom.ContainerAtom containerAtom, GaplessInfoHolder gaplessInfoHolder, long j, DrmInitData drmInitData, boolean z, boolean z2, Function<Track, Track> function) throws ParserException {
        Track trackApply;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < containerAtom.containerChildren.size(); i++) {
            Atom.ContainerAtom containerAtom2 = containerAtom.containerChildren.get(i);
            if (containerAtom2.type == 1953653099 && (trackApply = function.apply(parseTrak(containerAtom2, (Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(Atom.TYPE_mvhd)), j, drmInitData, z, z2))) != null) {
                arrayList.add(parseStbl(trackApply, (Atom.ContainerAtom) Assertions.checkNotNull(((Atom.ContainerAtom) Assertions.checkNotNull(((Atom.ContainerAtom) Assertions.checkNotNull(containerAtom2.getContainerAtomOfType(Atom.TYPE_mdia))).getContainerAtomOfType(Atom.TYPE_minf))).getContainerAtomOfType(Atom.TYPE_stbl)), gaplessInfoHolder));
            }
        }
        return arrayList;
    }

    public static Metadata parseUdta(Atom.LeafAtom leafAtom) {
        ParsableByteArray parsableByteArray = leafAtom.data;
        parsableByteArray.setPosition(8);
        Metadata metadata = new Metadata(new Metadata.Entry[0]);
        while (parsableByteArray.bytesLeft() >= 8) {
            int position = parsableByteArray.getPosition();
            int i = parsableByteArray.readInt();
            int i2 = parsableByteArray.readInt();
            if (i2 == 1835365473) {
                parsableByteArray.setPosition(position);
                metadata = metadata.copyWithAppendedEntriesFrom(parseUdtaMeta(parsableByteArray, position + i));
            } else if (i2 == 1936553057) {
                parsableByteArray.setPosition(position);
                metadata = metadata.copyWithAppendedEntriesFrom(SmtaAtomUtil.parseSmta(parsableByteArray, position + i));
            } else if (i2 == -1451722374) {
                metadata = metadata.copyWithAppendedEntriesFrom(parseXyz(parsableByteArray));
            }
            parsableByteArray.setPosition(position + i);
        }
        return metadata;
    }

    public static Mp4TimestampData parseMvhd(ParsableByteArray parsableByteArray) {
        long unsignedInt;
        long unsignedInt2;
        parsableByteArray.setPosition(8);
        if (Atom.parseFullAtomVersion(parsableByteArray.readInt()) == 0) {
            unsignedInt = parsableByteArray.readUnsignedInt();
            unsignedInt2 = parsableByteArray.readUnsignedInt();
        } else {
            unsignedInt = parsableByteArray.readLong();
            unsignedInt2 = parsableByteArray.readLong();
        }
        return new Mp4TimestampData(unsignedInt, unsignedInt2, parsableByteArray.readUnsignedInt());
    }

    public static Metadata parseMdtaFromMeta(Atom.ContainerAtom containerAtom) {
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(Atom.TYPE_hdlr);
        Atom.LeafAtom leafAtomOfType2 = containerAtom.getLeafAtomOfType(Atom.TYPE_keys);
        Atom.LeafAtom leafAtomOfType3 = containerAtom.getLeafAtomOfType(Atom.TYPE_ilst);
        if (leafAtomOfType == null || leafAtomOfType2 == null || leafAtomOfType3 == null || parseHdlr(leafAtomOfType.data) != TYPE_mdta) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafAtomOfType2.data;
        parsableByteArray.setPosition(12);
        int i = parsableByteArray.readInt();
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = parsableByteArray.readInt();
            parsableByteArray.skipBytes(4);
            strArr[i2] = parsableByteArray.readString(i3 - 8);
        }
        ParsableByteArray parsableByteArray2 = leafAtomOfType3.data;
        parsableByteArray2.setPosition(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray2.bytesLeft() > 8) {
            int position = parsableByteArray2.getPosition();
            int i4 = parsableByteArray2.readInt();
            int i5 = parsableByteArray2.readInt() - 1;
            if (i5 >= 0 && i5 < i) {
                MdtaMetadataEntry mdtaMetadataEntryFromIlst = MetadataUtil.parseMdtaMetadataEntryFromIlst(parsableByteArray2, position + i4, strArr[i5]);
                if (mdtaMetadataEntryFromIlst != null) {
                    arrayList.add(mdtaMetadataEntryFromIlst);
                }
            } else {
                Log.w(TAG, "Skipped metadata with unknown key index: " + i5);
            }
            parsableByteArray2.setPosition(position + i4);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static void maybeSkipRemainingMetaAtomHeaderBytes(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(4);
        if (parsableByteArray.readInt() != 1751411826) {
            position += 4;
        }
        parsableByteArray.setPosition(position);
    }

    private static Track parseTrak(Atom.ContainerAtom containerAtom, Atom.LeafAtom leafAtom, long j, DrmInitData drmInitData, boolean z, boolean z2) throws ParserException {
        long[] jArr;
        long[] jArr2;
        Atom.ContainerAtom containerAtomOfType;
        Pair<long[], long[]> edts;
        Atom.ContainerAtom containerAtom2 = (Atom.ContainerAtom) Assertions.checkNotNull(containerAtom.getContainerAtomOfType(Atom.TYPE_mdia));
        int trackTypeForHdlr = getTrackTypeForHdlr(parseHdlr(((Atom.LeafAtom) Assertions.checkNotNull(containerAtom2.getLeafAtomOfType(Atom.TYPE_hdlr))).data));
        if (trackTypeForHdlr == -1) {
            return null;
        }
        TkhdData tkhd = parseTkhd(((Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(Atom.TYPE_tkhd))).data);
        long jScaleLargeTimestamp = C.TIME_UNSET;
        long j2 = j == C.TIME_UNSET ? tkhd.duration : j;
        long j3 = parseMvhd(leafAtom.data).timescale;
        if (j2 != C.TIME_UNSET) {
            jScaleLargeTimestamp = Util.scaleLargeTimestamp(j2, 1000000L, j3);
        }
        long j4 = jScaleLargeTimestamp;
        Atom.ContainerAtom containerAtom3 = (Atom.ContainerAtom) Assertions.checkNotNull(((Atom.ContainerAtom) Assertions.checkNotNull(containerAtom2.getContainerAtomOfType(Atom.TYPE_minf))).getContainerAtomOfType(Atom.TYPE_stbl));
        Pair<Long, String> mdhd = parseMdhd(((Atom.LeafAtom) Assertions.checkNotNull(containerAtom2.getLeafAtomOfType(Atom.TYPE_mdhd))).data);
        Atom.LeafAtom leafAtomOfType = containerAtom3.getLeafAtomOfType(Atom.TYPE_stsd);
        if (leafAtomOfType == null) {
            throw ParserException.createForMalformedContainer("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        StsdData stsd = parseStsd(leafAtomOfType.data, tkhd.id, tkhd.rotationDegrees, (String) mdhd.second, drmInitData, z2);
        if (z || (containerAtomOfType = containerAtom.getContainerAtomOfType(Atom.TYPE_edts)) == null || (edts = parseEdts(containerAtomOfType)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) edts.first;
            jArr2 = (long[]) edts.second;
            jArr = jArr3;
        }
        if (stsd.format == null) {
            return null;
        }
        return new Track(tkhd.id, trackTypeForHdlr, ((Long) mdhd.first).longValue(), j3, j4, stsd.format, stsd.requiredSampleTransformation, stsd.trackEncryptionBoxes, stsd.nalUnitLengthFieldLength, jArr, jArr2);
    }

    private static TrackSampleTable parseStbl(Track track, Atom.ContainerAtom containerAtom, GaplessInfoHolder gaplessInfoHolder) throws ParserException {
        SampleSizeBox stz2SampleSizeBox;
        boolean z;
        int unsignedIntToInt;
        int unsignedIntToInt2;
        int unsignedIntToInt3;
        boolean z2;
        int i;
        Track track2;
        int i2;
        int[] iArr;
        int[] iArr2;
        int i3;
        long[] jArr;
        long j;
        long[] jArr2;
        int i4;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        boolean z3;
        int i5;
        int i6;
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(Atom.TYPE_stsz);
        if (leafAtomOfType != null) {
            stz2SampleSizeBox = new StszSampleSizeBox(leafAtomOfType, track.format);
        } else {
            Atom.LeafAtom leafAtomOfType2 = containerAtom.getLeafAtomOfType(Atom.TYPE_stz2);
            if (leafAtomOfType2 == null) {
                throw ParserException.createForMalformedContainer("Track has no sample table size information", null);
            }
            stz2SampleSizeBox = new Stz2SampleSizeBox(leafAtomOfType2);
        }
        int sampleCount = stz2SampleSizeBox.getSampleCount();
        if (sampleCount == 0) {
            return new TrackSampleTable(track, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        Atom.LeafAtom leafAtomOfType3 = containerAtom.getLeafAtomOfType(Atom.TYPE_stco);
        if (leafAtomOfType3 == null) {
            leafAtomOfType3 = (Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(Atom.TYPE_co64));
            z = true;
        } else {
            z = false;
        }
        ParsableByteArray parsableByteArray = leafAtomOfType3.data;
        ParsableByteArray parsableByteArray2 = ((Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(Atom.TYPE_stsc))).data;
        ParsableByteArray parsableByteArray3 = ((Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(Atom.TYPE_stts))).data;
        Atom.LeafAtom leafAtomOfType4 = containerAtom.getLeafAtomOfType(Atom.TYPE_stss);
        ParsableByteArray parsableByteArray4 = leafAtomOfType4 != null ? leafAtomOfType4.data : null;
        Atom.LeafAtom leafAtomOfType5 = containerAtom.getLeafAtomOfType(Atom.TYPE_ctts);
        ParsableByteArray parsableByteArray5 = leafAtomOfType5 != null ? leafAtomOfType5.data : null;
        ChunkIterator chunkIterator = new ChunkIterator(parsableByteArray2, parsableByteArray, z);
        parsableByteArray3.setPosition(12);
        int unsignedIntToInt4 = parsableByteArray3.readUnsignedIntToInt() - 1;
        int unsignedIntToInt5 = parsableByteArray3.readUnsignedIntToInt();
        int unsignedIntToInt6 = parsableByteArray3.readUnsignedIntToInt();
        if (parsableByteArray5 != null) {
            parsableByteArray5.setPosition(12);
            unsignedIntToInt = parsableByteArray5.readUnsignedIntToInt();
        } else {
            unsignedIntToInt = 0;
        }
        if (parsableByteArray4 != null) {
            parsableByteArray4.setPosition(12);
            unsignedIntToInt3 = parsableByteArray4.readUnsignedIntToInt();
            if (unsignedIntToInt3 > 0) {
                unsignedIntToInt2 = parsableByteArray4.readUnsignedIntToInt() - 1;
            } else {
                unsignedIntToInt2 = -1;
                parsableByteArray4 = null;
            }
        } else {
            unsignedIntToInt2 = -1;
            unsignedIntToInt3 = 0;
        }
        int fixedSampleSize = stz2SampleSizeBox.getFixedSampleSize();
        String str = track.format.sampleMimeType;
        if (fixedSampleSize != -1 && ((MimeTypes.AUDIO_RAW.equals(str) || MimeTypes.AUDIO_MLAW.equals(str) || MimeTypes.AUDIO_ALAW.equals(str)) && unsignedIntToInt4 == 0 && unsignedIntToInt == 0 && unsignedIntToInt3 == 0)) {
            long[] jArr3 = new long[chunkIterator.length];
            int[] iArr6 = new int[chunkIterator.length];
            while (chunkIterator.moveNext()) {
                jArr3[chunkIterator.index] = chunkIterator.offset;
                iArr6[chunkIterator.index] = chunkIterator.numSamples;
            }
            FixedSampleSizeRechunker.Results resultsRechunk = FixedSampleSizeRechunker.rechunk(fixedSampleSize, jArr3, iArr6, unsignedIntToInt6);
            long[] jArr4 = resultsRechunk.offsets;
            iArr2 = resultsRechunk.sizes;
            int i7 = resultsRechunk.maximumSize;
            long[] jArr5 = resultsRechunk.timestamps;
            int[] iArr7 = resultsRechunk.flags;
            long j2 = resultsRechunk.duration;
            i2 = sampleCount;
            jArr = jArr4;
            i3 = i7;
            jArr2 = jArr5;
            iArr = iArr7;
            j = j2;
            track2 = track;
        } else {
            long[] jArrCopyOf = new long[sampleCount];
            int[] iArrCopyOf = new int[sampleCount];
            long[] jArrCopyOf2 = new long[sampleCount];
            int[] iArrCopyOf2 = new int[sampleCount];
            int i8 = unsignedIntToInt4;
            int i9 = unsignedIntToInt;
            int i10 = unsignedIntToInt2;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int unsignedIntToInt7 = 0;
            long j3 = 0;
            long j4 = 0;
            while (i12 < sampleCount) {
                long j5 = j4;
                boolean zMoveNext = true;
                while (i13 == 0) {
                    zMoveNext = chunkIterator.moveNext();
                    if (!zMoveNext) {
                        break;
                    }
                    j5 = chunkIterator.offset;
                    i13 = chunkIterator.numSamples;
                    sampleCount = sampleCount;
                    i10 = i10;
                }
                int i15 = i10;
                int i16 = sampleCount;
                if (!zMoveNext) {
                    Log.w(TAG, "Unexpected end of chunk data");
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i12);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i12);
                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i12);
                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i12);
                    sampleCount = i12;
                    break;
                }
                int i17 = i9;
                if (parsableByteArray5 != null) {
                    while (unsignedIntToInt7 == 0 && i17 > 0) {
                        unsignedIntToInt7 = parsableByteArray5.readUnsignedIntToInt();
                        i14 = parsableByteArray5.readInt();
                        i17--;
                    }
                    unsignedIntToInt7--;
                }
                int i18 = i14;
                jArrCopyOf[i12] = j5;
                int nextSampleSize = stz2SampleSizeBox.readNextSampleSize();
                iArrCopyOf[i12] = nextSampleSize;
                long[] jArr6 = jArrCopyOf;
                SampleSizeBox sampleSizeBox = stz2SampleSizeBox;
                if (nextSampleSize > i11) {
                    i11 = nextSampleSize;
                }
                jArrCopyOf2[i12] = j3 + ((long) i18);
                iArrCopyOf2[i12] = parsableByteArray4 == null ? 1 : 0;
                int unsignedIntToInt8 = i15;
                if (i12 == unsignedIntToInt8) {
                    iArrCopyOf2[i12] = 1;
                    unsignedIntToInt3--;
                    if (unsignedIntToInt3 > 0) {
                        unsignedIntToInt8 = ((ParsableByteArray) Assertions.checkNotNull(parsableByteArray4)).readUnsignedIntToInt() - 1;
                    }
                }
                int[] iArr8 = iArrCopyOf2;
                i9 = i17;
                j3 += (long) unsignedIntToInt6;
                unsignedIntToInt5--;
                if (unsignedIntToInt5 == 0 && i8 > 0) {
                    i8--;
                    unsignedIntToInt5 = parsableByteArray3.readUnsignedIntToInt();
                    unsignedIntToInt6 = parsableByteArray3.readInt();
                }
                long j6 = iArrCopyOf[i12];
                i13--;
                i12++;
                long j7 = j5 + j6;
                i14 = i18;
                sampleCount = i16;
                i10 = unsignedIntToInt8;
                iArrCopyOf2 = iArr8;
                stz2SampleSizeBox = sampleSizeBox;
                jArrCopyOf = jArr6;
                j4 = j7;
            }
            int i19 = i13;
            long j8 = j3 + ((long) i14);
            if (parsableByteArray5 == null) {
                z2 = true;
                break;
            }
            int i20 = i9;
            while (true) {
                if (i20 <= 0) {
                    z2 = true;
                    break;
                }
                if (parsableByteArray5.readUnsignedIntToInt() != 0) {
                    z2 = false;
                    break;
                }
                parsableByteArray5.readInt();
                i20--;
            }
            if (unsignedIntToInt3 == 0 && unsignedIntToInt5 == 0 && i19 == 0 && i8 == 0) {
                i = unsignedIntToInt7;
                if (i == 0 && z2) {
                    track2 = track;
                }
                i2 = sampleCount;
                iArr = iArrCopyOf2;
                iArr2 = iArrCopyOf;
                i3 = i11;
                jArr = jArrCopyOf;
                j = j8;
                jArr2 = jArrCopyOf2;
            } else {
                i = unsignedIntToInt7;
            }
            StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
            track2 = track;
            sb.append(track2.id);
            sb.append(": remainingSynchronizationSamples ");
            sb.append(unsignedIntToInt3);
            sb.append(", remainingSamplesAtTimestampDelta ");
            sb.append(unsignedIntToInt5);
            sb.append(", remainingSamplesInChunk ");
            sb.append(i19);
            sb.append(", remainingTimestampDeltaChanges ");
            sb.append(i8);
            sb.append(", remainingSamplesAtTimestampOffset ");
            sb.append(i);
            sb.append(!z2 ? ", ctts invalid" : "");
            Log.w(TAG, sb.toString());
            i2 = sampleCount;
            iArr = iArrCopyOf2;
            iArr2 = iArrCopyOf;
            i3 = i11;
            jArr = jArrCopyOf;
            j = j8;
            jArr2 = jArrCopyOf2;
        }
        long jScaleLargeTimestamp = Util.scaleLargeTimestamp(j, 1000000L, track2.timescale);
        if (track2.editListDurations == null) {
            Util.scaleLargeTimestampsInPlace(jArr2, 1000000L, track2.timescale);
            return new TrackSampleTable(track, jArr, iArr2, i3, jArr2, iArr, jScaleLargeTimestamp);
        }
        if (track2.editListDurations.length == 1 && track2.type == 1 && jArr2.length >= 2) {
            long j9 = ((long[]) Assertions.checkNotNull(track2.editListMediaTimes))[0];
            long jScaleLargeTimestamp2 = j9 + Util.scaleLargeTimestamp(track2.editListDurations[0], track2.timescale, track2.movieTimescale);
            i4 = i2;
            if (canApplyEditWithGaplessInfo(jArr2, j, j9, jScaleLargeTimestamp2)) {
                long jScaleLargeTimestamp3 = Util.scaleLargeTimestamp(j9 - jArr2[0], track2.format.sampleRate, track2.timescale);
                long jScaleLargeTimestamp4 = Util.scaleLargeTimestamp(j - jScaleLargeTimestamp2, track2.format.sampleRate, track2.timescale);
                if ((jScaleLargeTimestamp3 != 0 || jScaleLargeTimestamp4 != 0) && jScaleLargeTimestamp3 <= 2147483647L && jScaleLargeTimestamp4 <= 2147483647L) {
                    gaplessInfoHolder.encoderDelay = (int) jScaleLargeTimestamp3;
                    gaplessInfoHolder.encoderPadding = (int) jScaleLargeTimestamp4;
                    Util.scaleLargeTimestampsInPlace(jArr2, 1000000L, track2.timescale);
                    return new TrackSampleTable(track, jArr, iArr2, i3, jArr2, iArr, Util.scaleLargeTimestamp(track2.editListDurations[0], 1000000L, track2.movieTimescale));
                }
            }
        } else {
            i4 = i2;
        }
        if (track2.editListDurations.length == 1 && track2.editListDurations[0] == 0) {
            long j10 = ((long[]) Assertions.checkNotNull(track2.editListMediaTimes))[0];
            for (int i21 = 0; i21 < jArr2.length; i21++) {
                jArr2[i21] = Util.scaleLargeTimestamp(jArr2[i21] - j10, 1000000L, track2.timescale);
            }
            return new TrackSampleTable(track, jArr, iArr2, i3, jArr2, iArr, Util.scaleLargeTimestamp(j - j10, 1000000L, track2.timescale));
        }
        boolean z4 = track2.type == 1;
        int[] iArr9 = new int[track2.editListDurations.length];
        int[] iArr10 = new int[track2.editListDurations.length];
        long[] jArr7 = (long[]) Assertions.checkNotNull(track2.editListMediaTimes);
        int i22 = 0;
        int i23 = 0;
        boolean z5 = false;
        int i24 = 0;
        while (i22 < track2.editListDurations.length) {
            int i25 = i3;
            int[] iArr11 = iArr2;
            long j11 = jArr7[i22];
            if (j11 != -1) {
                boolean z6 = z5;
                int i26 = i24;
                iArr5 = iArr;
                long jScaleLargeTimestamp5 = Util.scaleLargeTimestamp(track2.editListDurations[i22], track2.timescale, track2.movieTimescale);
                iArr9[i22] = Util.binarySearchFloor(jArr2, j11, true, true);
                iArr10[i22] = Util.binarySearchCeil(jArr2, j11 + jScaleLargeTimestamp5, z4, false);
                while (true) {
                    i5 = iArr9[i22];
                    i6 = iArr10[i22];
                    if (i5 >= i6 || (iArr5[i5] & 1) != 0) {
                        break;
                    }
                    iArr9[i22] = i5 + 1;
                }
                i23 += i6 - i5;
                z3 = z6 | (i26 != i5);
                i24 = i6;
            } else {
                iArr5 = iArr;
                z3 = z5;
            }
            i22++;
            iArr2 = iArr11;
            z5 = z3;
            i3 = i25;
            iArr = iArr5;
        }
        int i27 = i3;
        int[] iArr12 = iArr2;
        int[] iArr13 = iArr;
        boolean z7 = z5 | (i23 != i4);
        long[] jArr8 = z7 ? new long[i23] : jArr;
        int[] iArr14 = z7 ? new int[i23] : iArr12;
        if (z7) {
            i27 = 0;
        }
        int[] iArr15 = z7 ? new int[i23] : iArr13;
        long[] jArr9 = new long[i23];
        int i28 = 0;
        int i29 = 0;
        long j12 = 0;
        while (i28 < track2.editListDurations.length) {
            long j13 = track2.editListMediaTimes[i28];
            int i30 = iArr9[i28];
            int[] iArr16 = iArr9;
            int i31 = iArr10[i28];
            if (z7) {
                int i32 = i31 - i30;
                System.arraycopy(jArr, i30, jArr8, i29, i32);
                iArr3 = iArr12;
                System.arraycopy(iArr3, i30, iArr14, i29, i32);
                iArr4 = iArr13;
                System.arraycopy(iArr4, i30, iArr15, i29, i32);
            } else {
                iArr3 = iArr12;
                iArr4 = iArr13;
            }
            int i33 = i27;
            while (i30 < i31) {
                int i34 = i28;
                int[] iArr17 = iArr4;
                long jScaleLargeTimestamp6 = Util.scaleLargeTimestamp(j12, 1000000L, track2.movieTimescale);
                long j14 = j12;
                long jScaleLargeTimestamp7 = Util.scaleLargeTimestamp(jArr2[i30] - j13, 1000000L, track2.timescale);
                int i35 = i31;
                long[] jArr10 = jArr8;
                if (canTrimSamplesWithTimestampChange(track2.type)) {
                    jScaleLargeTimestamp7 = Math.max(0L, jScaleLargeTimestamp7);
                }
                jArr9[i29] = jScaleLargeTimestamp6 + jScaleLargeTimestamp7;
                if (z7 && iArr14[i29] > i33) {
                    i33 = iArr3[i30];
                }
                i29++;
                i30++;
                track2 = track;
                i31 = i35;
                i28 = i34;
                j12 = j14;
                iArr4 = iArr17;
                jArr8 = jArr10;
            }
            Track track3 = track2;
            int i36 = i28;
            int[] iArr18 = iArr4;
            j12 += track3.editListDurations[i36];
            i28 = i36 + 1;
            track2 = track3;
            iArr12 = iArr3;
            i27 = i33;
            iArr9 = iArr16;
            iArr10 = iArr10;
            jArr = jArr;
            iArr13 = iArr18;
            jArr8 = jArr8;
        }
        return new TrackSampleTable(track, jArr8, iArr14, i27, jArr9, iArr15, Util.scaleLargeTimestamp(j12, 1000000L, track2.movieTimescale));
    }

    private static Metadata parseUdtaMeta(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(8);
        maybeSkipRemainingMetaAtomHeaderBytes(parsableByteArray);
        while (parsableByteArray.getPosition() < i) {
            int position = parsableByteArray.getPosition();
            int i2 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1768715124) {
                parsableByteArray.setPosition(position);
                return parseIlst(parsableByteArray, position + i2);
            }
            parsableByteArray.setPosition(position + i2);
        }
        return null;
    }

    private static Metadata parseIlst(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray.getPosition() < i) {
            Metadata.Entry ilstElement = MetadataUtil.parseIlstElement(parsableByteArray);
            if (ilstElement != null) {
                arrayList.add(ilstElement);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static Metadata parseXyz(ParsableByteArray parsableByteArray) {
        short s = parsableByteArray.readShort();
        parsableByteArray.skipBytes(2);
        String string = parsableByteArray.readString(s);
        int iMax = Math.max(string.lastIndexOf(43), string.lastIndexOf(45));
        try {
            return new Metadata(new Mp4LocationData(Float.parseFloat(string.substring(0, iMax)), Float.parseFloat(string.substring(iMax, string.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static TkhdData parseTkhd(ParsableByteArray parsableByteArray) {
        long unsignedInt;
        parsableByteArray.setPosition(8);
        int fullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(fullAtomVersion == 0 ? 8 : 16);
        int i = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int position = parsableByteArray.getPosition();
        int i2 = fullAtomVersion == 0 ? 4 : 8;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 < i2) {
                if (parsableByteArray.getData()[position + i4] != -1) {
                    unsignedInt = fullAtomVersion == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
                    if (unsignedInt != 0) {
                        break;
                    }
                    break;
                }
                i4++;
            } else {
                parsableByteArray.skipBytes(i2);
            }
            unsignedInt = C.TIME_UNSET;
            break;
        }
        parsableByteArray.skipBytes(16);
        int i5 = parsableByteArray.readInt();
        int i6 = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int i7 = parsableByteArray.readInt();
        int i8 = parsableByteArray.readInt();
        if (i5 == 0 && i6 == 65536 && i7 == -65536 && i8 == 0) {
            i3 = 90;
        } else if (i5 == 0 && i6 == -65536 && i7 == 65536 && i8 == 0) {
            i3 = 270;
        } else if (i5 == -65536 && i6 == 0 && i7 == 0 && i8 == -65536) {
            i3 = 180;
        }
        return new TkhdData(i, unsignedInt, i3);
    }

    private static int parseHdlr(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(16);
        return parsableByteArray.readInt();
    }

    private static Pair<Long, String> parseMdhd(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        int fullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(fullAtomVersion == 0 ? 8 : 16);
        long unsignedInt = parsableByteArray.readUnsignedInt();
        parsableByteArray.skipBytes(fullAtomVersion == 0 ? 4 : 8);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        return Pair.create(Long.valueOf(unsignedInt), "" + ((char) (((unsignedShort >> 10) & 31) + 96)) + ((char) (((unsignedShort >> 5) & 31) + 96)) + ((char) ((unsignedShort & 31) + 96)));
    }

    private static StsdData parseStsd(ParsableByteArray parsableByteArray, int i, int i2, String str, DrmInitData drmInitData, boolean z) throws ParserException {
        int i3;
        parsableByteArray.setPosition(12);
        int i4 = parsableByteArray.readInt();
        StsdData stsdData = new StsdData(i4);
        for (int i5 = 0; i5 < i4; i5++) {
            int position = parsableByteArray.getPosition();
            int i6 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i6 > 0, "childAtomSize must be positive");
            int i7 = parsableByteArray.readInt();
            if (i7 == 1635148593 || i7 == 1635148595 || i7 == 1701733238 || i7 == 1831958048 || i7 == 1836070006 || i7 == 1752589105 || i7 == 1751479857 || i7 == 1932670515 || i7 == 1211250227 || i7 == 1987063864 || i7 == 1987063865 || i7 == 1635135537 || i7 == 1685479798 || i7 == 1685479729 || i7 == 1685481573 || i7 == 1685481521) {
                i3 = position;
                parseVideoSampleEntry(parsableByteArray, i7, i3, i6, i, i2, drmInitData, stsdData, i5);
            } else if (i7 == 1836069985 || i7 == 1701733217 || i7 == 1633889587 || i7 == 1700998451 || i7 == 1633889588 || i7 == 1835823201 || i7 == 1685353315 || i7 == 1685353317 || i7 == 1685353320 || i7 == 1685353324 || i7 == 1685353336 || i7 == 1935764850 || i7 == 1935767394 || i7 == 1819304813 || i7 == 1936684916 || i7 == 1953984371 || i7 == 778924082 || i7 == 778924083 || i7 == 1835557169 || i7 == 1835560241 || i7 == 1634492771 || i7 == 1634492791 || i7 == 1970037111 || i7 == 1332770163 || i7 == 1716281667) {
                i3 = position;
                parseAudioSampleEntry(parsableByteArray, i7, position, i6, i, str, z, drmInitData, stsdData, i5);
            } else {
                if (i7 == 1414810956 || i7 == 1954034535 || i7 == 2004251764 || i7 == 1937010800 || i7 == 1664495672) {
                    parseTextSampleEntry(parsableByteArray, i7, position, i6, i, str, stsdData);
                } else if (i7 == 1835365492) {
                    parseMetaDataSampleEntry(parsableByteArray, i7, position, i, stsdData);
                } else if (i7 == 1667329389) {
                    stsdData.format = new Format.Builder().setId(i).setSampleMimeType(MimeTypes.APPLICATION_CAMERA_MOTION).build();
                }
                i3 = position;
            }
            parsableByteArray.setPosition(i3 + i6);
        }
        return stsdData;
    }

    private static void parseTextSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, String str, StsdData stsdData) {
        parsableByteArray.setPosition(i2 + 16);
        String str2 = MimeTypes.APPLICATION_TTML;
        ImmutableList immutableListOf = null;
        long j = Long.MAX_VALUE;
        if (i != 1414810956) {
            if (i == 1954034535) {
                int i5 = i3 - 16;
                byte[] bArr = new byte[i5];
                parsableByteArray.readBytes(bArr, 0, i5);
                immutableListOf = ImmutableList.of(bArr);
                str2 = MimeTypes.APPLICATION_TX3G;
            } else if (i == 2004251764) {
                str2 = MimeTypes.APPLICATION_MP4VTT;
            } else if (i == 1937010800) {
                j = 0;
            } else if (i == 1664495672) {
                stsdData.requiredSampleTransformation = 1;
                str2 = MimeTypes.APPLICATION_MP4CEA608;
            } else {
                throw new IllegalStateException();
            }
        }
        stsdData.format = new Format.Builder().setId(i4).setSampleMimeType(str2).setLanguage(str).setSubsampleOffsetUs(j).setInitializationData(immutableListOf).build();
    }

    private static void parseVideoSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, int i5, DrmInitData drmInitData, StsdData stsdData, int i6) throws ParserException {
        String str;
        int i7;
        int i8;
        int i9;
        int i10;
        String str2;
        String str3;
        int i11 = i2;
        int i12 = i3;
        DrmInitData drmInitDataCopyWithSchemeType = drmInitData;
        StsdData stsdData2 = stsdData;
        parsableByteArray.setPosition(i11 + 16);
        parsableByteArray.skipBytes(16);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int unsignedShort2 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(50);
        int position = parsableByteArray.getPosition();
        int iIntValue = i;
        if (iIntValue == 1701733238) {
            Pair<Integer, TrackEncryptionBox> sampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i11, i12);
            if (sampleEntryEncryptionData != null) {
                iIntValue = ((Integer) sampleEntryEncryptionData.first).intValue();
                drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType == null ? null : drmInitDataCopyWithSchemeType.copyWithSchemeType(((TrackEncryptionBox) sampleEntryEncryptionData.second).schemeType);
                stsdData2.trackEncryptionBoxes[i6] = (TrackEncryptionBox) sampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        String str4 = MimeTypes.VIDEO_H263;
        if (iIntValue != 1831958048) {
            str = iIntValue == 1211250227 ? MimeTypes.VIDEO_H263 : null;
        } else {
            str = MimeTypes.VIDEO_MPEG;
        }
        int i13 = 8;
        float paspFromParent = 1.0f;
        List<byte[]> listOf = null;
        ByteBuffer byteBufferAllocateHdrStaticInfo = null;
        String str5 = null;
        int i14 = -1;
        byte[] projFromParent = null;
        int iIsoTransferCharacteristicsToColorTransfer = -1;
        int iIsoColorPrimariesToColorSpace = -1;
        int i15 = -1;
        int i16 = -1;
        EsdsData esdsFromParent = null;
        boolean z = false;
        int i17 = 8;
        while (position - i11 < i12) {
            parsableByteArray.setPosition(position);
            int position2 = parsableByteArray.getPosition();
            int i18 = parsableByteArray.readInt();
            if (i18 == 0 && parsableByteArray.getPosition() - i11 == i12) {
                break;
            }
            ExtractorUtil.checkContainerInput(i18 > 0, "childAtomSize must be positive");
            int i19 = parsableByteArray.readInt();
            if (i19 == 1635148611) {
                ExtractorUtil.checkContainerInput(str == null, null);
                parsableByteArray.setPosition(position2 + 8);
                AvcConfig avcConfig = AvcConfig.parse(parsableByteArray);
                List<byte[]> list = avcConfig.initializationData;
                stsdData2.nalUnitLengthFieldLength = avcConfig.nalUnitLengthFieldLength;
                if (!z) {
                    paspFromParent = avcConfig.pixelWidthHeightRatio;
                }
                str2 = avcConfig.codecs;
                int i20 = avcConfig.maxNumReorderFrames;
                int i21 = avcConfig.colorSpace;
                int i22 = avcConfig.colorRange;
                int i23 = avcConfig.colorTransfer;
                int i24 = avcConfig.bitdepthLuma;
                drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType;
                iIntValue = iIntValue;
                str4 = str4;
                i16 = i20;
                iIsoColorPrimariesToColorSpace = i21;
                i14 = i22;
                iIsoTransferCharacteristicsToColorTransfer = i23;
                i17 = avcConfig.bitdepthChroma;
                i13 = i24;
                listOf = list;
                str = MimeTypes.VIDEO_H264;
            } else {
                if (i19 == 1752589123) {
                    ExtractorUtil.checkContainerInput(str == null, null);
                    parsableByteArray.setPosition(position2 + 8);
                    HevcConfig hevcConfig = HevcConfig.parse(parsableByteArray);
                    List<byte[]> list2 = hevcConfig.initializationData;
                    stsdData2.nalUnitLengthFieldLength = hevcConfig.nalUnitLengthFieldLength;
                    if (!z) {
                        paspFromParent = hevcConfig.pixelWidthHeightRatio;
                    }
                    int i25 = hevcConfig.maxNumReorderPics;
                    str2 = hevcConfig.codecs;
                    int i26 = hevcConfig.colorSpace;
                    int i27 = hevcConfig.colorRange;
                    int i28 = hevcConfig.colorTransfer;
                    listOf = list2;
                    int i29 = hevcConfig.bitdepthLuma;
                    int i30 = hevcConfig.bitdepthChroma;
                    str3 = MimeTypes.VIDEO_H265;
                    drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType;
                    i16 = i25;
                    iIntValue = iIntValue;
                    str4 = str4;
                    iIsoColorPrimariesToColorSpace = i26;
                    i14 = i27;
                    iIsoTransferCharacteristicsToColorTransfer = i28;
                    i17 = i30;
                    i13 = i29;
                } else {
                    if (i19 == 1685480259 || i19 == 1685485123) {
                        drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType;
                        iIntValue = iIntValue;
                        str4 = str4;
                        i7 = i13;
                        i8 = i17;
                        i9 = iIsoTransferCharacteristicsToColorTransfer;
                        i10 = iIsoColorPrimariesToColorSpace;
                        DolbyVisionConfig dolbyVisionConfig = DolbyVisionConfig.parse(parsableByteArray);
                        if (dolbyVisionConfig != null) {
                            String str6 = dolbyVisionConfig.codecs;
                            str = MimeTypes.VIDEO_DOLBY_VISION;
                            str5 = str6;
                        }
                    } else if (i19 == 1987076931) {
                        ExtractorUtil.checkContainerInput(str == null, null);
                        String str7 = iIntValue == 1987063864 ? MimeTypes.VIDEO_VP8 : MimeTypes.VIDEO_VP9;
                        parsableByteArray.setPosition(position2 + 12);
                        parsableByteArray.skipBytes(2);
                        int unsignedByte = parsableByteArray.readUnsignedByte();
                        boolean z2 = (unsignedByte & 1) != 0;
                        int unsignedByte2 = parsableByteArray.readUnsignedByte();
                        int unsignedByte3 = parsableByteArray.readUnsignedByte();
                        iIsoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace(unsignedByte2);
                        i14 = z2 ? 1 : 2;
                        iIsoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer(unsignedByte3);
                        i13 = unsignedByte >> 4;
                        drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType;
                        iIntValue = iIntValue;
                        str4 = str4;
                        i17 = i13;
                        str2 = str5;
                        str3 = str7;
                    } else {
                        if (i19 == 1635135811) {
                            int i31 = i18 - 8;
                            byte[] bArr = new byte[i31];
                            parsableByteArray.readBytes(bArr, 0, i31);
                            listOf = ImmutableList.of(bArr);
                            parsableByteArray.setPosition(position2 + 8);
                            ColorInfo av1c = parseAv1c(parsableByteArray);
                            i13 = av1c.lumaBitdepth;
                            i17 = av1c.chromaBitdepth;
                            int i32 = av1c.colorSpace;
                            int i33 = av1c.colorRange;
                            iIsoTransferCharacteristicsToColorTransfer = av1c.colorTransfer;
                            iIsoColorPrimariesToColorSpace = i32;
                            drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType;
                            i14 = i33;
                            iIntValue = iIntValue;
                            str4 = str4;
                            str = MimeTypes.VIDEO_AV1;
                        } else {
                            if (i19 == 1668050025) {
                                if (byteBufferAllocateHdrStaticInfo == null) {
                                    byteBufferAllocateHdrStaticInfo = allocateHdrStaticInfo();
                                }
                                ByteBuffer byteBuffer = byteBufferAllocateHdrStaticInfo;
                                byteBuffer.position(21);
                                byteBuffer.putShort(parsableByteArray.readShort());
                                byteBuffer.putShort(parsableByteArray.readShort());
                                byteBufferAllocateHdrStaticInfo = byteBuffer;
                            } else {
                                if (i19 == 1835295606) {
                                    if (byteBufferAllocateHdrStaticInfo == null) {
                                        byteBufferAllocateHdrStaticInfo = allocateHdrStaticInfo();
                                    }
                                    ByteBuffer byteBuffer2 = byteBufferAllocateHdrStaticInfo;
                                    short s = parsableByteArray.readShort();
                                    short s2 = parsableByteArray.readShort();
                                    short s3 = parsableByteArray.readShort();
                                    short s4 = parsableByteArray.readShort();
                                    short s5 = parsableByteArray.readShort();
                                    short s6 = parsableByteArray.readShort();
                                    short s7 = parsableByteArray.readShort();
                                    short s8 = parsableByteArray.readShort();
                                    long unsignedInt = parsableByteArray.readUnsignedInt();
                                    long unsignedInt2 = parsableByteArray.readUnsignedInt();
                                    byteBuffer2.position(1);
                                    byteBuffer2.putShort(s5);
                                    byteBuffer2.putShort(s6);
                                    byteBuffer2.putShort(s);
                                    byteBuffer2.putShort(s2);
                                    byteBuffer2.putShort(s3);
                                    byteBuffer2.putShort(s4);
                                    byteBuffer2.putShort(s7);
                                    byteBuffer2.putShort(s8);
                                    byteBuffer2.putShort((short) (unsignedInt / 10000));
                                    byteBuffer2.putShort((short) (unsignedInt2 / 10000));
                                    byteBufferAllocateHdrStaticInfo = byteBuffer2;
                                } else {
                                    drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType;
                                    iIntValue = iIntValue;
                                    str4 = str4;
                                    i7 = i13;
                                    i8 = i17;
                                    if (i19 == 1681012275) {
                                        ExtractorUtil.checkContainerInput(str == null, null);
                                        str = str4;
                                    } else if (i19 == 1702061171) {
                                        ExtractorUtil.checkContainerInput(str == null, null);
                                        esdsFromParent = parseEsdsFromParent(parsableByteArray, position2);
                                        str = esdsFromParent.mimeType;
                                        byte[] bArr2 = esdsFromParent.initializationData;
                                        if (bArr2 != null) {
                                            listOf = ImmutableList.of(bArr2);
                                        }
                                    } else if (i19 == 1885434736) {
                                        paspFromParent = parsePaspFromParent(parsableByteArray, position2);
                                        i17 = i8;
                                        i13 = i7;
                                        z = true;
                                    } else if (i19 == 1937126244) {
                                        projFromParent = parseProjFromParent(parsableByteArray, position2, i18);
                                    } else if (i19 == 1936995172) {
                                        int unsignedByte4 = parsableByteArray.readUnsignedByte();
                                        parsableByteArray.skipBytes(3);
                                        if (unsignedByte4 == 0) {
                                            int unsignedByte5 = parsableByteArray.readUnsignedByte();
                                            if (unsignedByte5 == 0) {
                                                i15 = 0;
                                            } else if (unsignedByte5 == 1) {
                                                i15 = 1;
                                            } else if (unsignedByte5 == 2) {
                                                i15 = 2;
                                            } else if (unsignedByte5 == 3) {
                                                i15 = 3;
                                            }
                                        }
                                    } else if (i19 == 1668246642) {
                                        i10 = iIsoColorPrimariesToColorSpace;
                                        i9 = iIsoTransferCharacteristicsToColorTransfer;
                                        if (i10 == -1 && i9 == -1) {
                                            int i34 = parsableByteArray.readInt();
                                            if (i34 == TYPE_nclx || i34 == TYPE_nclc) {
                                                int unsignedShort3 = parsableByteArray.readUnsignedShort();
                                                int unsignedShort4 = parsableByteArray.readUnsignedShort();
                                                parsableByteArray.skipBytes(2);
                                                boolean z3 = i18 == 19 && (parsableByteArray.readUnsignedByte() & 128) != 0;
                                                iIsoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace(unsignedShort3);
                                                i14 = z3 ? 1 : 2;
                                                iIsoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer(unsignedShort4);
                                            } else {
                                                Log.w(TAG, "Unsupported color type: " + Atom.getAtomTypeString(i34));
                                            }
                                        }
                                        i17 = i8;
                                        i13 = i7;
                                    } else {
                                        i9 = iIsoTransferCharacteristicsToColorTransfer;
                                        i10 = iIsoColorPrimariesToColorSpace;
                                    }
                                    str2 = str5;
                                    i17 = i8;
                                    i13 = i7;
                                    str3 = str;
                                }
                                position += i18;
                                i11 = i2;
                                i12 = i3;
                                stsdData2 = stsdData;
                                iIntValue = iIntValue;
                                str4 = str4;
                                drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType;
                            }
                            i17 = i17;
                            i13 = i13;
                        }
                        position += i18;
                        i11 = i2;
                        i12 = i3;
                        stsdData2 = stsdData;
                        iIntValue = iIntValue;
                        str4 = str4;
                        drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType;
                    }
                    iIsoTransferCharacteristicsToColorTransfer = i9;
                    iIsoColorPrimariesToColorSpace = i10;
                    i17 = i8;
                    i13 = i7;
                    position += i18;
                    i11 = i2;
                    i12 = i3;
                    stsdData2 = stsdData;
                    iIntValue = iIntValue;
                    str4 = str4;
                    drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType;
                }
                str = str3;
            }
            str5 = str2;
            position += i18;
            i11 = i2;
            i12 = i3;
            stsdData2 = stsdData;
            iIntValue = iIntValue;
            str4 = str4;
            drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType;
        }
        DrmInitData drmInitData2 = drmInitDataCopyWithSchemeType;
        int i35 = i13;
        int i36 = i17;
        int i37 = iIsoTransferCharacteristicsToColorTransfer;
        int i38 = iIsoColorPrimariesToColorSpace;
        if (str == null) {
            return;
        }
        Format.Builder colorInfo = new Format.Builder().setId(i4).setSampleMimeType(str).setCodecs(str5).setWidth(unsignedShort).setHeight(unsignedShort2).setPixelWidthHeightRatio(paspFromParent).setRotationDegrees(i5).setProjectionData(projFromParent).setStereoMode(i15).setInitializationData(listOf).setMaxNumReorderSamples(i16).setDrmInitData(drmInitData2).setColorInfo(new ColorInfo.Builder().setColorSpace(i38).setColorRange(i14).setColorTransfer(i37).setHdrStaticInfo(byteBufferAllocateHdrStaticInfo != null ? byteBufferAllocateHdrStaticInfo.array() : null).setLumaBitdepth(i35).setChromaBitdepth(i36).build());
        if (esdsFromParent != null) {
            colorInfo.setAverageBitrate(Ints.a(esdsFromParent.bitrate)).setPeakBitrate(Ints.a(esdsFromParent.peakBitrate));
        }
        stsdData.format = colorInfo.build();
    }

    private static ColorInfo parseAv1c(ParsableByteArray parsableByteArray) {
        ColorInfo.Builder builder = new ColorInfo.Builder();
        ParsableBitArray parsableBitArray = new ParsableBitArray(parsableByteArray.getData());
        parsableBitArray.setPosition(parsableByteArray.getPosition() * 8);
        parsableBitArray.skipBytes(1);
        int bits = parsableBitArray.readBits(3);
        parsableBitArray.skipBits(6);
        boolean bit = parsableBitArray.readBit();
        boolean bit2 = parsableBitArray.readBit();
        if (bits == 2 && bit) {
            builder.setLumaBitdepth(bit2 ? 12 : 10);
            builder.setChromaBitdepth(bit2 ? 12 : 10);
        } else if (bits <= 2) {
            builder.setLumaBitdepth(bit ? 10 : 8);
            builder.setChromaBitdepth(bit ? 10 : 8);
        }
        parsableBitArray.skipBits(13);
        parsableBitArray.skipBit();
        int bits2 = parsableBitArray.readBits(4);
        if (bits2 != 1) {
            Log.i(TAG, "Unsupported obu_type: " + bits2);
            return builder.build();
        }
        if (parsableBitArray.readBit()) {
            Log.i(TAG, "Unsupported obu_extension_flag");
            return builder.build();
        }
        boolean bit3 = parsableBitArray.readBit();
        parsableBitArray.skipBit();
        if (bit3 && parsableBitArray.readBits(8) > 127) {
            Log.i(TAG, "Excessive obu_size");
            return builder.build();
        }
        int bits3 = parsableBitArray.readBits(3);
        parsableBitArray.skipBit();
        if (parsableBitArray.readBit()) {
            Log.i(TAG, "Unsupported reduced_still_picture_header");
            return builder.build();
        }
        if (parsableBitArray.readBit()) {
            Log.i(TAG, "Unsupported timing_info_present_flag");
            return builder.build();
        }
        if (parsableBitArray.readBit()) {
            Log.i(TAG, "Unsupported initial_display_delay_present_flag");
            return builder.build();
        }
        int bits4 = parsableBitArray.readBits(5);
        boolean z = false;
        for (int i = 0; i <= bits4; i++) {
            parsableBitArray.skipBits(12);
            if (parsableBitArray.readBits(5) > 7) {
                parsableBitArray.skipBit();
            }
        }
        int bits5 = parsableBitArray.readBits(4);
        int bits6 = parsableBitArray.readBits(4);
        parsableBitArray.skipBits(bits5 + 1);
        parsableBitArray.skipBits(bits6 + 1);
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(7);
        }
        parsableBitArray.skipBits(7);
        boolean bit4 = parsableBitArray.readBit();
        if (bit4) {
            parsableBitArray.skipBits(2);
        }
        if ((parsableBitArray.readBit() || parsableBitArray.readBits(1) > 0) && !parsableBitArray.readBit()) {
            parsableBitArray.skipBits(1);
        }
        if (bit4) {
            parsableBitArray.skipBits(3);
        }
        parsableBitArray.skipBits(3);
        boolean bit5 = parsableBitArray.readBit();
        if (bits3 == 2 && bit5) {
            parsableBitArray.skipBit();
        }
        if (bits3 != 1 && parsableBitArray.readBit()) {
            z = true;
        }
        if (parsableBitArray.readBit()) {
            int bits7 = parsableBitArray.readBits(8);
            int bits8 = parsableBitArray.readBits(8);
            builder.setColorSpace(ColorInfo.isoColorPrimariesToColorSpace(bits7)).setColorRange(((z || bits7 != 1 || bits8 != 13 || parsableBitArray.readBits(8) != 0) ? parsableBitArray.readBits(1) : 1) != 1 ? 2 : 1).setColorTransfer(ColorInfo.isoTransferCharacteristicsToColorTransfer(bits8));
        }
        return builder.build();
    }

    private static ByteBuffer allocateHdrStaticInfo() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static void parseMetaDataSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, StsdData stsdData) {
        parsableByteArray.setPosition(i2 + 16);
        if (i == 1835365492) {
            parsableByteArray.readNullTerminatedString();
            String nullTerminatedString = parsableByteArray.readNullTerminatedString();
            if (nullTerminatedString != null) {
                stsdData.format = new Format.Builder().setId(i3).setSampleMimeType(nullTerminatedString).build();
            }
        }
    }

    private static Pair<long[], long[]> parseEdts(Atom.ContainerAtom containerAtom) {
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(Atom.TYPE_elst);
        if (leafAtomOfType == null) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafAtomOfType.data;
        parsableByteArray.setPosition(8);
        int fullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        long[] jArr = new long[unsignedIntToInt];
        long[] jArr2 = new long[unsignedIntToInt];
        for (int i = 0; i < unsignedIntToInt; i++) {
            jArr[i] = fullAtomVersion == 1 ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
            jArr2[i] = fullAtomVersion == 1 ? parsableByteArray.readLong() : parsableByteArray.readInt();
            if (parsableByteArray.readShort() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            parsableByteArray.skipBytes(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static float parsePaspFromParent(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 8);
        return parsableByteArray.readUnsignedIntToInt() / parsableByteArray.readUnsignedIntToInt();
    }

    /* JADX WARN: Code duplicated, block: B:133:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:135:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:136:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:139:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:142:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:145:0x021a  */
    /* JADX WARN: Code duplicated, block: B:146:0x021f  */
    /* JADX WARN: Code duplicated, block: B:148:0x022c  */
    /* JADX WARN: Code duplicated, block: B:150:0x0233  */
    /* JADX WARN: Code duplicated, block: B:152:0x023e  */
    /* JADX WARN: Code duplicated, block: B:154:0x0246  */
    /* JADX WARN: Code duplicated, block: B:155:0x024c  */
    /* JADX WARN: Code duplicated, block: B:156:0x0258  */
    /* JADX WARN: Code duplicated, block: B:196:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:198:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:199:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:202:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:204:0x03da  */
    /* JADX WARN: Code duplicated, block: B:206:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:207:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:209:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:228:0x0400 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:95:0x0155  */
    private static void parseAudioSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, String str, boolean z, DrmInitData drmInitData, StsdData stsdData, int i5) throws ParserException {
        int unsignedShort;
        int unsignedFixedPoint1616;
        int i6;
        int iIntValue;
        int i7;
        DrmInitData drmInitDataCopyWithSchemeType;
        String str2;
        String str3;
        String str4;
        List<byte[]> listOf;
        String str5;
        EsdsData esdsFromParent;
        int i8;
        boolean z2;
        int i9;
        String str6;
        int iFindBoxPosition;
        String str7;
        byte[] bArr;
        char c2;
        int unsignedByte;
        byte[] bArr2;
        int unsignedByte2;
        String str8;
        byte[] bArr3;
        ImmutableList immutableListOf;
        int i10 = i2;
        int i11 = i3;
        parsableByteArray.setPosition(i10 + 16);
        if (z) {
            unsignedShort = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
        } else {
            parsableByteArray.skipBytes(8);
            unsignedShort = 0;
        }
        if (unsignedShort == 0 || unsignedShort == 1) {
            int unsignedShort2 = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
            unsignedFixedPoint1616 = parsableByteArray.readUnsignedFixedPoint1616();
            parsableByteArray.setPosition(parsableByteArray.getPosition() - 4);
            i6 = parsableByteArray.readInt();
            if (unsignedShort == 1) {
                parsableByteArray.skipBytes(16);
            }
            iIntValue = unsignedShort2;
            i7 = -1;
        } else {
            if (unsignedShort != 2) {
                return;
            }
            parsableByteArray.skipBytes(16);
            unsignedFixedPoint1616 = (int) Math.round(parsableByteArray.readDouble());
            iIntValue = parsableByteArray.readUnsignedIntToInt();
            parsableByteArray.skipBytes(4);
            int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            int unsignedIntToInt2 = parsableByteArray.readUnsignedIntToInt();
            boolean z3 = (unsignedIntToInt2 & 1) != 0;
            boolean z4 = (unsignedIntToInt2 & 2) != 0;
            if (z3) {
                if (unsignedIntToInt == 32) {
                    i7 = 4;
                } else {
                    i7 = -1;
                }
            } else if (unsignedIntToInt == 8) {
                i7 = 3;
            } else if (unsignedIntToInt == 16) {
                i7 = z4 ? 268435456 : 2;
            } else if (unsignedIntToInt == 24) {
                i7 = z4 ? C.ENCODING_PCM_24BIT_BIG_ENDIAN : 21;
            } else if (unsignedIntToInt == 32) {
                i7 = z4 ? C.ENCODING_PCM_32BIT_BIG_ENDIAN : 22;
            } else {
                i7 = -1;
            }
            parsableByteArray.skipBytes(8);
            i6 = 0;
        }
        int position = parsableByteArray.getPosition();
        int iIntValue2 = i;
        if (iIntValue2 == 1701733217) {
            Pair<Integer, TrackEncryptionBox> sampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i10, i11);
            if (sampleEntryEncryptionData != null) {
                iIntValue2 = ((Integer) sampleEntryEncryptionData.first).intValue();
                drmInitDataCopyWithSchemeType = drmInitData == null ? null : drmInitData.copyWithSchemeType(((TrackEncryptionBox) sampleEntryEncryptionData.second).schemeType);
                stsdData.trackEncryptionBoxes[i5] = (TrackEncryptionBox) sampleEntryEncryptionData.second;
            } else {
                drmInitDataCopyWithSchemeType = drmInitData;
            }
            parsableByteArray.setPosition(position);
        } else {
            drmInitDataCopyWithSchemeType = drmInitData;
        }
        String str9 = MimeTypes.AUDIO_MPEGH_MHM1;
        if (iIntValue2 == 1633889587) {
            str2 = MimeTypes.AUDIO_AC3;
        } else if (iIntValue2 == 1700998451) {
            str2 = MimeTypes.AUDIO_E_AC3;
        } else if (iIntValue2 == 1633889588) {
            str2 = MimeTypes.AUDIO_AC4;
        } else if (iIntValue2 == 1685353315) {
            str2 = MimeTypes.AUDIO_DTS;
        } else if (iIntValue2 == 1685353320 || iIntValue2 == 1685353324) {
            str2 = MimeTypes.AUDIO_DTS_HD;
        } else if (iIntValue2 == 1685353317) {
            str2 = MimeTypes.AUDIO_DTS_EXPRESS;
        } else if (iIntValue2 == 1685353336) {
            str2 = MimeTypes.AUDIO_DTS_X;
        } else if (iIntValue2 == 1935764850) {
            str2 = MimeTypes.AUDIO_AMR_NB;
        } else if (iIntValue2 == 1935767394) {
            str2 = MimeTypes.AUDIO_AMR_WB;
        } else {
            str3 = MimeTypes.AUDIO_RAW;
            if (iIntValue2 == 1936684916) {
                i7 = 2;
            } else if (iIntValue2 == 1953984371) {
                i7 = 268435456;
            } else if (iIntValue2 == 1819304813) {
                if (i7 == -1) {
                    i7 = 2;
                } else {
                    str2 = MimeTypes.AUDIO_RAW;
                }
            } else if (iIntValue2 == 778924082 || iIntValue2 == 778924083) {
                str2 = MimeTypes.AUDIO_MPEG;
            } else if (iIntValue2 == 1835557169) {
                str2 = MimeTypes.AUDIO_MPEGH_MHA1;
            } else if (iIntValue2 == 1835560241) {
                str3 = MimeTypes.AUDIO_MPEGH_MHM1;
            } else if (iIntValue2 == 1634492771) {
                str2 = MimeTypes.AUDIO_ALAC;
            } else if (iIntValue2 == 1634492791) {
                str2 = MimeTypes.AUDIO_ALAW;
            } else if (iIntValue2 == 1970037111) {
                str2 = MimeTypes.AUDIO_MLAW;
            } else if (iIntValue2 == 1332770163) {
                str2 = MimeTypes.AUDIO_OPUS;
            } else if (iIntValue2 == 1716281667) {
                str2 = MimeTypes.AUDIO_FLAC;
            } else if (iIntValue2 == 1835823201) {
                str2 = MimeTypes.AUDIO_TRUEHD;
            } else {
                str3 = null;
            }
            int i12 = i7;
            str4 = str3;
            listOf = null;
            str5 = null;
            esdsFromParent = null;
            while (position - i10 < i11) {
                parsableByteArray.setPosition(position);
                i8 = parsableByteArray.readInt();
                if (i8 > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ExtractorUtil.checkContainerInput(z2, "childAtomSize must be positive");
                i9 = parsableByteArray.readInt();
                if (i9 == 1835557187) {
                    parsableByteArray.setPosition(position + 8);
                    parsableByteArray.skipBytes(1);
                    unsignedByte2 = parsableByteArray.readUnsignedByte();
                    parsableByteArray.skipBytes(1);
                    if (Objects.equals(str4, str9)) {
                        str8 = String.format("mhm1.%02X", Integer.valueOf(unsignedByte2));
                    } else {
                        str8 = String.format("mha1.%02X", Integer.valueOf(unsignedByte2));
                    }
                    str5 = str8;
                    int unsignedShort3 = parsableByteArray.readUnsignedShort();
                    bArr3 = new byte[unsignedShort3];
                    str6 = str9;
                    parsableByteArray.readBytes(bArr3, 0, unsignedShort3);
                    if (listOf == null) {
                        immutableListOf = ImmutableList.of(bArr3);
                    } else {
                        immutableListOf = ImmutableList.of(bArr3, listOf.get(0));
                    }
                    listOf = immutableListOf;
                } else {
                    str6 = str9;
                    if (i9 == 1835557200) {
                        parsableByteArray.setPosition(position + 8);
                        unsignedByte = parsableByteArray.readUnsignedByte();
                        if (unsignedByte > 0) {
                            bArr2 = new byte[unsignedByte];
                            parsableByteArray.readBytes(bArr2, 0, unsignedByte);
                            if (listOf == null) {
                                listOf = ImmutableList.of(bArr2);
                            } else {
                                listOf = ImmutableList.of(listOf.get(0), bArr2);
                            }
                        }
                    } else {
                        if (i9 != 1702061171 || (z && i9 == 2002876005)) {
                            if (i9 == 1702061171) {
                                iFindBoxPosition = position;
                            } else {
                                iFindBoxPosition = findBoxPosition(parsableByteArray, Atom.TYPE_esds, position, i8);
                            }
                            if (iFindBoxPosition != -1) {
                                esdsFromParent = parseEsdsFromParent(parsableByteArray, iFindBoxPosition);
                                str7 = esdsFromParent.mimeType;
                                bArr = esdsFromParent.initializationData;
                                if (bArr != null) {
                                    if (MimeTypes.AUDIO_VORBIS.equals(str7)) {
                                        listOf = VorbisUtil.parseVorbisCsdFromEsdsInitializationData(bArr);
                                    } else {
                                        if (MimeTypes.AUDIO_AAC.equals(str7)) {
                                            AacUtil.Config audioSpecificConfig = AacUtil.parseAudioSpecificConfig(bArr);
                                            int i13 = audioSpecificConfig.sampleRateHz;
                                            int i14 = audioSpecificConfig.channelCount;
                                            str5 = audioSpecificConfig.codecs;
                                            unsignedFixedPoint1616 = i13;
                                            iIntValue = i14;
                                        }
                                        listOf = ImmutableList.of(bArr);
                                    }
                                }
                                str4 = str7;
                            }
                        } else {
                            if (i9 == 1684103987) {
                                parsableByteArray.setPosition(position + 8);
                                stsdData.format = Ac3Util.parseAc3AnnexFFormat(parsableByteArray, Integer.toString(i4), str, drmInitDataCopyWithSchemeType);
                            } else if (i9 == 1684366131) {
                                parsableByteArray.setPosition(position + 8);
                                stsdData.format = Ac3Util.parseEAc3AnnexFFormat(parsableByteArray, Integer.toString(i4), str, drmInitDataCopyWithSchemeType);
                            } else if (i9 == 1684103988) {
                                parsableByteArray.setPosition(position + 8);
                                stsdData.format = Ac4Util.parseAc4AnnexEFormat(parsableByteArray, Integer.toString(i4), str, drmInitDataCopyWithSchemeType);
                            } else if (i9 == 1684892784) {
                                if (i6 <= 0) {
                                    throw ParserException.createForMalformedContainer("Invalid sample rate for Dolby TrueHD MLP stream: " + i6, null);
                                }
                                unsignedFixedPoint1616 = i6;
                                iIntValue = 2;
                            } else if (i9 == 1684305011 || i9 == 1969517683) {
                                c2 = 24931;
                                stsdData.format = new Format.Builder().setId(i4).setSampleMimeType(str4).setChannelCount(iIntValue).setSampleRate(unsignedFixedPoint1616).setDrmInitData(drmInitDataCopyWithSchemeType).setLanguage(str).build();
                            } else if (i9 == 1682927731) {
                                int i15 = i8 - 8;
                                byte[] bArr4 = opusMagic;
                                byte[] bArrCopyOf = Arrays.copyOf(bArr4, bArr4.length + i15);
                                parsableByteArray.setPosition(position + 8);
                                parsableByteArray.readBytes(bArrCopyOf, bArr4.length, i15);
                                listOf = OpusUtil.buildInitializationData(bArrCopyOf);
                            } else if (i9 == 1684425825) {
                                byte[] bArr5 = new byte[i8 - 8];
                                bArr5[0] = 102;
                                bArr5[1] = 76;
                                bArr5[2] = 97;
                                bArr5[3] = 67;
                                parsableByteArray.setPosition(position + 12);
                                parsableByteArray.readBytes(bArr5, 4, i8 - 12);
                                listOf = ImmutableList.of(bArr5);
                            } else {
                                c2 = 24931;
                                if (i9 == 1634492771) {
                                    int i16 = i8 - 12;
                                    byte[] bArr6 = new byte[i16];
                                    parsableByteArray.setPosition(position + 12);
                                    parsableByteArray.readBytes(bArr6, 0, i16);
                                    Pair<Integer, Integer> alacAudioSpecificConfig = CodecSpecificDataUtil.parseAlacAudioSpecificConfig(bArr6);
                                    int iIntValue3 = ((Integer) alacAudioSpecificConfig.first).intValue();
                                    iIntValue = ((Integer) alacAudioSpecificConfig.second).intValue();
                                    listOf = ImmutableList.of(bArr6);
                                    unsignedFixedPoint1616 = iIntValue3;
                                }
                            }
                            c2 = 24931;
                        }
                        position += i8;
                        i10 = i2;
                        i11 = i3;
                        str9 = str6;
                    }
                }
                position += i8;
                i10 = i2;
                i11 = i3;
                str9 = str6;
            }
            if (stsdData.format == null || str4 == null) {
            }
            Format.Builder language = new Format.Builder().setId(i4).setSampleMimeType(str4).setCodecs(str5).setChannelCount(iIntValue).setSampleRate(unsignedFixedPoint1616).setPcmEncoding(i12).setInitializationData(listOf).setDrmInitData(drmInitDataCopyWithSchemeType).setLanguage(str);
            if (esdsFromParent != null) {
                language.setAverageBitrate(Ints.a(esdsFromParent.bitrate)).setPeakBitrate(Ints.a(esdsFromParent.peakBitrate));
            }
            stsdData.format = language.build();
            return;
        }
        str3 = str2;
        int i17 = i7;
        str4 = str3;
        listOf = null;
        str5 = null;
        esdsFromParent = null;
        while (position - i10 < i11) {
            parsableByteArray.setPosition(position);
            i8 = parsableByteArray.readInt();
            if (i8 > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            ExtractorUtil.checkContainerInput(z2, "childAtomSize must be positive");
            i9 = parsableByteArray.readInt();
            if (i9 == 1835557187) {
                parsableByteArray.setPosition(position + 8);
                parsableByteArray.skipBytes(1);
                unsignedByte2 = parsableByteArray.readUnsignedByte();
                parsableByteArray.skipBytes(1);
                if (Objects.equals(str4, str9)) {
                    str8 = String.format("mhm1.%02X", Integer.valueOf(unsignedByte2));
                } else {
                    str8 = String.format("mha1.%02X", Integer.valueOf(unsignedByte2));
                }
                str5 = str8;
                int unsignedShort4 = parsableByteArray.readUnsignedShort();
                bArr3 = new byte[unsignedShort4];
                str6 = str9;
                parsableByteArray.readBytes(bArr3, 0, unsignedShort4);
                if (listOf == null) {
                    immutableListOf = ImmutableList.of(bArr3);
                } else {
                    immutableListOf = ImmutableList.of(bArr3, listOf.get(0));
                }
                listOf = immutableListOf;
            } else {
                str6 = str9;
                if (i9 == 1835557200) {
                    parsableByteArray.setPosition(position + 8);
                    unsignedByte = parsableByteArray.readUnsignedByte();
                    if (unsignedByte > 0) {
                        bArr2 = new byte[unsignedByte];
                        parsableByteArray.readBytes(bArr2, 0, unsignedByte);
                        if (listOf == null) {
                            listOf = ImmutableList.of(bArr2);
                        } else {
                            listOf = ImmutableList.of(listOf.get(0), bArr2);
                        }
                    }
                } else {
                    if (i9 != 1702061171) {
                        if (i9 == 1702061171) {
                            iFindBoxPosition = position;
                        } else {
                            iFindBoxPosition = findBoxPosition(parsableByteArray, Atom.TYPE_esds, position, i8);
                        }
                        if (iFindBoxPosition != -1) {
                            esdsFromParent = parseEsdsFromParent(parsableByteArray, iFindBoxPosition);
                            str7 = esdsFromParent.mimeType;
                            bArr = esdsFromParent.initializationData;
                            if (bArr != null) {
                                if (MimeTypes.AUDIO_VORBIS.equals(str7)) {
                                    listOf = VorbisUtil.parseVorbisCsdFromEsdsInitializationData(bArr);
                                } else {
                                    if (MimeTypes.AUDIO_AAC.equals(str7)) {
                                        AacUtil.Config audioSpecificConfig2 = AacUtil.parseAudioSpecificConfig(bArr);
                                        int i18 = audioSpecificConfig2.sampleRateHz;
                                        int i19 = audioSpecificConfig2.channelCount;
                                        str5 = audioSpecificConfig2.codecs;
                                        unsignedFixedPoint1616 = i18;
                                        iIntValue = i19;
                                    }
                                    listOf = ImmutableList.of(bArr);
                                }
                            }
                            str4 = str7;
                        }
                    } else {
                        if (i9 == 1702061171) {
                            iFindBoxPosition = position;
                        } else {
                            iFindBoxPosition = findBoxPosition(parsableByteArray, Atom.TYPE_esds, position, i8);
                        }
                        if (iFindBoxPosition != -1) {
                            esdsFromParent = parseEsdsFromParent(parsableByteArray, iFindBoxPosition);
                            str7 = esdsFromParent.mimeType;
                            bArr = esdsFromParent.initializationData;
                            if (bArr != null) {
                                if (MimeTypes.AUDIO_VORBIS.equals(str7)) {
                                    listOf = VorbisUtil.parseVorbisCsdFromEsdsInitializationData(bArr);
                                } else {
                                    if (MimeTypes.AUDIO_AAC.equals(str7)) {
                                        AacUtil.Config audioSpecificConfig3 = AacUtil.parseAudioSpecificConfig(bArr);
                                        int i110 = audioSpecificConfig3.sampleRateHz;
                                        int i111 = audioSpecificConfig3.channelCount;
                                        str5 = audioSpecificConfig3.codecs;
                                        unsignedFixedPoint1616 = i110;
                                        iIntValue = i111;
                                    }
                                    listOf = ImmutableList.of(bArr);
                                }
                            }
                            str4 = str7;
                        }
                    }
                    position += i8;
                    i10 = i2;
                    i11 = i3;
                    str9 = str6;
                }
            }
            position += i8;
            i10 = i2;
            i11 = i3;
            str9 = str6;
        }
        if (stsdData.format == null) {
        }
    }

    private static int findBoxPosition(ParsableByteArray parsableByteArray, int i, int i2, int i3) throws ParserException {
        int position = parsableByteArray.getPosition();
        ExtractorUtil.checkContainerInput(position >= i2, null);
        while (position - i2 < i3) {
            parsableByteArray.setPosition(position);
            int i4 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i4 > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == i) {
                return position;
            }
            position += i4;
        }
        return -1;
    }

    private static EsdsData parseEsdsFromParent(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 12);
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        parsableByteArray.skipBytes(2);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        if ((unsignedByte & 128) != 0) {
            parsableByteArray.skipBytes(2);
        }
        if ((unsignedByte & 64) != 0) {
            parsableByteArray.skipBytes(parsableByteArray.readUnsignedByte());
        }
        if ((unsignedByte & 32) != 0) {
            parsableByteArray.skipBytes(2);
        }
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        String mimeTypeFromMp4ObjectType = MimeTypes.getMimeTypeFromMp4ObjectType(parsableByteArray.readUnsignedByte());
        if (MimeTypes.AUDIO_MPEG.equals(mimeTypeFromMp4ObjectType) || MimeTypes.AUDIO_DTS.equals(mimeTypeFromMp4ObjectType) || MimeTypes.AUDIO_DTS_HD.equals(mimeTypeFromMp4ObjectType)) {
            return new EsdsData(mimeTypeFromMp4ObjectType, null, -1L, -1L);
        }
        parsableByteArray.skipBytes(4);
        long unsignedInt = parsableByteArray.readUnsignedInt();
        long unsignedInt2 = parsableByteArray.readUnsignedInt();
        parsableByteArray.skipBytes(1);
        int expandableClassSize = parseExpandableClassSize(parsableByteArray);
        byte[] bArr = new byte[expandableClassSize];
        parsableByteArray.readBytes(bArr, 0, expandableClassSize);
        return new EsdsData(mimeTypeFromMp4ObjectType, bArr, unsignedInt2 > 0 ? unsignedInt2 : -1L, unsignedInt > 0 ? unsignedInt : -1L);
    }

    private static Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData(ParsableByteArray parsableByteArray, int i, int i2) throws ParserException {
        Pair<Integer, TrackEncryptionBox> commonEncryptionSinfFromParent;
        int position = parsableByteArray.getPosition();
        while (position - i < i2) {
            parsableByteArray.setPosition(position);
            int i3 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i3 > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1936289382 && (commonEncryptionSinfFromParent = parseCommonEncryptionSinfFromParent(parsableByteArray, position, i3)) != null) {
                return commonEncryptionSinfFromParent;
            }
            position += i3;
        }
        return null;
    }

    static Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent(ParsableByteArray parsableByteArray, int i, int i2) throws ParserException {
        int i3 = i + 8;
        int i4 = 0;
        int i5 = -1;
        String string = null;
        Integer numValueOf = null;
        while (i3 - i < i2) {
            parsableByteArray.setPosition(i3);
            int i6 = parsableByteArray.readInt();
            int i7 = parsableByteArray.readInt();
            if (i7 == 1718775137) {
                numValueOf = Integer.valueOf(parsableByteArray.readInt());
            } else if (i7 == 1935894637) {
                parsableByteArray.skipBytes(4);
                string = parsableByteArray.readString(4);
            } else if (i7 == 1935894633) {
                i5 = i3;
                i4 = i6;
            }
            i3 += i6;
        }
        if (!C.CENC_TYPE_cenc.equals(string) && !C.CENC_TYPE_cbc1.equals(string) && !C.CENC_TYPE_cens.equals(string) && !C.CENC_TYPE_cbcs.equals(string)) {
            return null;
        }
        ExtractorUtil.checkContainerInput(numValueOf != null, "frma atom is mandatory");
        ExtractorUtil.checkContainerInput(i5 != -1, "schi atom is mandatory");
        TrackEncryptionBox schiFromParent = parseSchiFromParent(parsableByteArray, i5, i4, string);
        ExtractorUtil.checkContainerInput(schiFromParent != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (TrackEncryptionBox) Util.castNonNull(schiFromParent));
    }

    private static TrackEncryptionBox parseSchiFromParent(ParsableByteArray parsableByteArray, int i, int i2, String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            parsableByteArray.setPosition(i5);
            int i6 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1952804451) {
                int fullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
                parsableByteArray.skipBytes(1);
                if (fullAtomVersion == 0) {
                    parsableByteArray.skipBytes(1);
                    i3 = 0;
                    i4 = 0;
                } else {
                    int unsignedByte = parsableByteArray.readUnsignedByte();
                    i3 = (unsignedByte & 240) >> 4;
                    i4 = unsignedByte & 15;
                }
                boolean z = parsableByteArray.readUnsignedByte() == 1;
                int unsignedByte2 = parsableByteArray.readUnsignedByte();
                byte[] bArr2 = new byte[16];
                parsableByteArray.readBytes(bArr2, 0, 16);
                if (z && unsignedByte2 == 0) {
                    int unsignedByte3 = parsableByteArray.readUnsignedByte();
                    bArr = new byte[unsignedByte3];
                    parsableByteArray.readBytes(bArr, 0, unsignedByte3);
                }
                return new TrackEncryptionBox(z, str, unsignedByte2, bArr2, i3, i4, bArr);
            }
            i5 += i6;
        }
    }

    private static byte[] parseProjFromParent(ParsableByteArray parsableByteArray, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            parsableByteArray.setPosition(i3);
            int i4 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1886547818) {
                return Arrays.copyOfRange(parsableByteArray.getData(), i3, i4 + i3);
            }
            i3 += i4;
        }
        return null;
    }

    private static int parseExpandableClassSize(ParsableByteArray parsableByteArray) {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i = unsignedByte & 127;
        while ((unsignedByte & 128) == 128) {
            unsignedByte = parsableByteArray.readUnsignedByte();
            i = (i << 7) | (unsignedByte & 127);
        }
        return i;
    }

    private static boolean canApplyEditWithGaplessInfo(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        return jArr[0] <= j2 && j2 < jArr[Util.constrainValue(4, 0, length)] && jArr[Util.constrainValue(jArr.length - 4, 0, length)] < j3 && j3 <= j;
    }

    private AtomParsers() {
    }

    static final class ChunkIterator {
        private final ParsableByteArray chunkOffsets;
        private final boolean chunkOffsetsAreLongs;
        public int index;
        public final int length;
        private int nextSamplesPerChunkChangeIndex;
        public int numSamples;
        public long offset;
        private int remainingSamplesPerChunkChanges;
        private final ParsableByteArray stsc;

        public ChunkIterator(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, boolean z) throws ParserException {
            this.stsc = parsableByteArray;
            this.chunkOffsets = parsableByteArray2;
            this.chunkOffsetsAreLongs = z;
            parsableByteArray2.setPosition(12);
            this.length = parsableByteArray2.readUnsignedIntToInt();
            parsableByteArray.setPosition(12);
            this.remainingSamplesPerChunkChanges = parsableByteArray.readUnsignedIntToInt();
            ExtractorUtil.checkContainerInput(parsableByteArray.readInt() == 1, "first_chunk must be 1");
            this.index = -1;
        }

        public boolean moveNext() {
            long unsignedInt;
            int i = this.index + 1;
            this.index = i;
            if (i == this.length) {
                return false;
            }
            if (this.chunkOffsetsAreLongs) {
                unsignedInt = this.chunkOffsets.readUnsignedLongToLong();
            } else {
                unsignedInt = this.chunkOffsets.readUnsignedInt();
            }
            this.offset = unsignedInt;
            if (this.index == this.nextSamplesPerChunkChangeIndex) {
                this.numSamples = this.stsc.readUnsignedIntToInt();
                this.stsc.skipBytes(4);
                int i2 = this.remainingSamplesPerChunkChanges - 1;
                this.remainingSamplesPerChunkChanges = i2;
                this.nextSamplesPerChunkChangeIndex = i2 > 0 ? this.stsc.readUnsignedIntToInt() - 1 : -1;
            }
            return true;
        }
    }

    static final class TkhdData {
        private final long duration;
        private final int id;
        private final int rotationDegrees;

        public TkhdData(int i, long j, int i2) {
            this.id = i;
            this.duration = j;
            this.rotationDegrees = i2;
        }
    }

    static final class StsdData {
        public static final int STSD_HEADER_SIZE = 8;
        public Format format;
        public int nalUnitLengthFieldLength;
        public int requiredSampleTransformation = 0;
        public final TrackEncryptionBox[] trackEncryptionBoxes;

        public StsdData(int i) {
            this.trackEncryptionBoxes = new TrackEncryptionBox[i];
        }
    }

    static final class EsdsData {
        private final long bitrate;
        private final byte[] initializationData;
        private final String mimeType;
        private final long peakBitrate;

        public EsdsData(String str, byte[] bArr, long j, long j2) {
            this.mimeType = str;
            this.initializationData = bArr;
            this.bitrate = j;
            this.peakBitrate = j2;
        }
    }

    static final class StszSampleSizeBox implements SampleSizeBox {
        private final ParsableByteArray data;
        private final int fixedSampleSize;
        private final int sampleCount;

        public StszSampleSizeBox(Atom.LeafAtom leafAtom, Format format) {
            ParsableByteArray parsableByteArray = leafAtom.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            if (MimeTypes.AUDIO_RAW.equals(format.sampleMimeType)) {
                int pcmFrameSize = Util.getPcmFrameSize(format.pcmEncoding, format.channelCount);
                if (unsignedIntToInt == 0 || unsignedIntToInt % pcmFrameSize != 0) {
                    Log.w(AtomParsers.TAG, "Audio sample size mismatch. stsd sample size: " + pcmFrameSize + ", stsz sample size: " + unsignedIntToInt);
                    unsignedIntToInt = pcmFrameSize;
                }
            }
            this.fixedSampleSize = unsignedIntToInt == 0 ? -1 : unsignedIntToInt;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // androidx.media3.extractor.mp4.AtomParsers.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // androidx.media3.extractor.mp4.AtomParsers.SampleSizeBox
        public int getFixedSampleSize() {
            return this.fixedSampleSize;
        }

        @Override // androidx.media3.extractor.mp4.AtomParsers.SampleSizeBox
        public int readNextSampleSize() {
            int i = this.fixedSampleSize;
            return i == -1 ? this.data.readUnsignedIntToInt() : i;
        }
    }

    static final class Stz2SampleSizeBox implements SampleSizeBox {
        private int currentByte;
        private final ParsableByteArray data;
        private final int fieldSize;
        private final int sampleCount;
        private int sampleIndex;

        @Override // androidx.media3.extractor.mp4.AtomParsers.SampleSizeBox
        public int getFixedSampleSize() {
            return -1;
        }

        public Stz2SampleSizeBox(Atom.LeafAtom leafAtom) {
            ParsableByteArray parsableByteArray = leafAtom.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            this.fieldSize = parsableByteArray.readUnsignedIntToInt() & 255;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // androidx.media3.extractor.mp4.AtomParsers.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // androidx.media3.extractor.mp4.AtomParsers.SampleSizeBox
        public int readNextSampleSize() {
            int i = this.fieldSize;
            if (i == 8) {
                return this.data.readUnsignedByte();
            }
            if (i == 16) {
                return this.data.readUnsignedShort();
            }
            int i2 = this.sampleIndex;
            this.sampleIndex = i2 + 1;
            if (i2 % 2 == 0) {
                int unsignedByte = this.data.readUnsignedByte();
                this.currentByte = unsignedByte;
                return (unsignedByte & 240) >> 4;
            }
            return this.currentByte & 15;
        }
    }
}
