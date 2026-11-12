package com.google.android.exoplayer2.extractor.mp4;

import android.util.Pair;
import androidx.media3.common.p;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.Ac4Util;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.GaplessInfoHolder;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.TrueHdSampleRechunker;
import com.google.android.exoplayer2.extractor.a;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import j20.x;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class Mp4Extractor implements Extractor, SeekMap {
    public static final ExtractorsFactory FACTORY = new a(7);
    private static final int FILE_TYPE_HEIC = 2;
    private static final int FILE_TYPE_MP4 = 0;
    private static final int FILE_TYPE_QUICKTIME = 1;
    public static final int FLAG_READ_MOTION_PHOTO_METADATA = 2;
    public static final int FLAG_READ_SEF_DATA = 4;
    public static final int FLAG_WORKAROUND_IGNORE_EDIT_LISTS = 1;
    private static final long MAXIMUM_READ_AHEAD_BYTES_STREAM = 10485760;
    private static final long RELOAD_MINIMUM_SEEK_DISTANCE = 262144;
    private static final int STATE_READING_ATOM_HEADER = 0;
    private static final int STATE_READING_ATOM_PAYLOAD = 1;
    private static final int STATE_READING_SAMPLE = 2;
    private static final int STATE_READING_SEF = 3;
    private long[][] accumulatedSampleSizes;
    private ParsableByteArray atomData;
    private final ParsableByteArray atomHeader;
    private int atomHeaderBytesRead;
    private long atomSize;
    private int atomType;
    private final ArrayDeque<Atom.ContainerAtom> containerAtoms;
    private long durationUs;
    private ExtractorOutput extractorOutput;
    private int fileType;
    private int firstVideoTrackIndex;
    private final int flags;
    private MotionPhotoMetadata motionPhotoMetadata;
    private final ParsableByteArray nalLength;
    private final ParsableByteArray nalStartCode;
    private int parserState;
    private int sampleBytesRead;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private int sampleTrackIndex;
    private final ParsableByteArray scratch;
    private final SefReader sefReader;
    private final List<Metadata.Entry> slowMotionMetadataEntries;
    private Mp4Track[] tracks;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public static final class Mp4Track {
        public int sampleIndex;
        public final TrackSampleTable sampleTable;
        public final Track track;
        public final TrackOutput trackOutput;
        public final TrueHdSampleRechunker trueHdSampleRechunker;

        public Mp4Track(Track track, TrackSampleTable trackSampleTable, TrackOutput trackOutput) {
            this.track = track;
            this.sampleTable = trackSampleTable;
            this.trackOutput = trackOutput;
            this.trueHdSampleRechunker = MimeTypes.AUDIO_TRUEHD.equals(track.format.sampleMimeType) ? new TrueHdSampleRechunker() : null;
        }
    }

    public Mp4Extractor(int i14) {
        this.flags = i14;
        this.parserState = (i14 & 4) != 0 ? 3 : 0;
        this.sefReader = new SefReader();
        this.slowMotionMetadataEntries = new ArrayList();
        this.atomHeader = new ParsableByteArray(16);
        this.containerAtoms = new ArrayDeque<>();
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalLength = new ParsableByteArray(4);
        this.scratch = new ParsableByteArray();
        this.sampleTrackIndex = -1;
    }

    private static int brandToFileType(int i14) {
        if (i14 != 1751476579) {
            return i14 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static long[][] calculateAccumulatedSampleSizes(Mp4Track[] mp4TrackArr) {
        long[][] jArr = new long[mp4TrackArr.length][];
        int[] iArr = new int[mp4TrackArr.length];
        long[] jArr2 = new long[mp4TrackArr.length];
        boolean[] zArr = new boolean[mp4TrackArr.length];
        for (int i14 = 0; i14 < mp4TrackArr.length; i14++) {
            jArr[i14] = new long[mp4TrackArr[i14].sampleTable.sampleCount];
            jArr2[i14] = mp4TrackArr[i14].sampleTable.timestampsUs[0];
        }
        long j8 = 0;
        int i15 = 0;
        while (i15 < mp4TrackArr.length) {
            long j14 = Long.MAX_VALUE;
            int i16 = -1;
            for (int i17 = 0; i17 < mp4TrackArr.length; i17++) {
                if (!zArr[i17]) {
                    long j15 = jArr2[i17];
                    if (j15 <= j14) {
                        i16 = i17;
                        j14 = j15;
                    }
                }
            }
            int i18 = iArr[i16];
            long[] jArr3 = jArr[i16];
            jArr3[i18] = j8;
            TrackSampleTable trackSampleTable = mp4TrackArr[i16].sampleTable;
            j8 += (long) trackSampleTable.sizes[i18];
            int i19 = i18 + 1;
            iArr[i16] = i19;
            if (i19 < jArr3.length) {
                jArr2[i16] = trackSampleTable.timestampsUs[i19];
            } else {
                zArr[i16] = true;
                i15++;
            }
        }
        return jArr;
    }

    private void enterReadingAtomHeaderState() {
        this.parserState = 0;
        this.atomHeaderBytesRead = 0;
    }

    private static int getSynchronizationSampleIndex(TrackSampleTable trackSampleTable, long j8) {
        int indexOfEarlierOrEqualSynchronizationSample = trackSampleTable.getIndexOfEarlierOrEqualSynchronizationSample(j8);
        return indexOfEarlierOrEqualSynchronizationSample == -1 ? trackSampleTable.getIndexOfLaterOrEqualSynchronizationSample(j8) : indexOfEarlierOrEqualSynchronizationSample;
    }

    private int getTrackIndexOfNextReadSample(long j8) {
        int i14 = -1;
        int i15 = -1;
        long j14 = Long.MAX_VALUE;
        boolean z14 = true;
        long j15 = Long.MAX_VALUE;
        boolean z15 = true;
        long j16 = Long.MAX_VALUE;
        for (int i16 = 0; i16 < ((Mp4Track[]) Util.castNonNull(this.tracks)).length; i16++) {
            Mp4Track mp4Track = this.tracks[i16];
            int i17 = mp4Track.sampleIndex;
            TrackSampleTable trackSampleTable = mp4Track.sampleTable;
            if (i17 != trackSampleTable.sampleCount) {
                long j17 = trackSampleTable.offsets[i17];
                long j18 = ((long[][]) Util.castNonNull(this.accumulatedSampleSizes))[i16][i17];
                long j19 = j17 - j8;
                boolean z16 = j19 < 0 || j19 >= 262144;
                if ((!z16 && z15) || (z16 == z15 && j19 < j16)) {
                    j15 = j18;
                    z15 = z16;
                    i15 = i16;
                    j16 = j19;
                }
                if (j18 < j14) {
                    j14 = j18;
                    z14 = z16;
                    i14 = i16;
                }
            }
        }
        return (j14 == Long.MAX_VALUE || !z14 || j15 < j14 + 10485760) ? i15 : i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Track lambda$processMoovAtom$1(Track track) {
        return track;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[]{new Mp4Extractor()};
    }

    private static long maybeAdjustSeekOffset(TrackSampleTable trackSampleTable, long j8, long j14) {
        int synchronizationSampleIndex = getSynchronizationSampleIndex(trackSampleTable, j8);
        return synchronizationSampleIndex == -1 ? j14 : Math.min(trackSampleTable.offsets[synchronizationSampleIndex], j14);
    }

    private void maybeSkipRemainingMetaAtomHeaderBytes(ExtractorInput extractorInput) {
        this.scratch.reset(8);
        extractorInput.peekFully(this.scratch.getData(), 0, 8);
        AtomParsers.maybeSkipRemainingMetaAtomHeaderBytes(this.scratch);
        extractorInput.skipFully(this.scratch.getPosition());
        extractorInput.resetPeekPosition();
    }

    private void processAtomEnded(long j8) {
        while (!this.containerAtoms.isEmpty() && this.containerAtoms.peek().endPosition == j8) {
            Atom.ContainerAtom containerAtomPop = this.containerAtoms.pop();
            if (containerAtomPop.type == 1836019574) {
                processMoovAtom(containerAtomPop);
                this.containerAtoms.clear();
                this.parserState = 2;
            } else if (!this.containerAtoms.isEmpty()) {
                this.containerAtoms.peek().add(containerAtomPop);
            }
        }
        if (this.parserState != 2) {
            enterReadingAtomHeaderState();
        }
    }

    private void processEndOfStreamReadingAtomHeader() {
        if (this.fileType != 2 || (this.flags & 2) == 0) {
            return;
        }
        ExtractorOutput extractorOutput = (ExtractorOutput) Assertions.checkNotNull(this.extractorOutput);
        extractorOutput.track(0, 4).format(new Format.Builder().setMetadata(this.motionPhotoMetadata == null ? null : new Metadata(this.motionPhotoMetadata)).build());
        extractorOutput.endTracks();
        extractorOutput.seekMap(new SeekMap.Unseekable(C.TIME_UNSET));
    }

    private static int processFtypAtom(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        int iBrandToFileType = brandToFileType(parsableByteArray.readInt());
        if (iBrandToFileType != 0) {
            return iBrandToFileType;
        }
        parsableByteArray.skipBytes(4);
        while (parsableByteArray.bytesLeft() > 0) {
            int iBrandToFileType2 = brandToFileType(parsableByteArray.readInt());
            if (iBrandToFileType2 != 0) {
                return iBrandToFileType2;
            }
        }
        return 0;
    }

    private void processMoovAtom(Atom.ContainerAtom containerAtom) {
        Metadata metadata;
        Metadata metadata2;
        TrackSampleTable trackSampleTable;
        long j8;
        int i14;
        int size;
        int i15;
        ArrayList arrayList = new ArrayList();
        boolean z14 = this.fileType == 1;
        GaplessInfoHolder gaplessInfoHolder = new GaplessInfoHolder();
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(Atom.TYPE_udta);
        if (leafAtomOfType != null) {
            Pair<Metadata, Metadata> udta = AtomParsers.parseUdta(leafAtomOfType);
            Metadata metadata3 = (Metadata) udta.first;
            Metadata metadata4 = (Metadata) udta.second;
            if (metadata3 != null) {
                gaplessInfoHolder.setFromMetadata(metadata3);
            }
            metadata = metadata4;
            metadata2 = metadata3;
        } else {
            metadata = null;
            metadata2 = null;
        }
        Atom.ContainerAtom containerAtomOfType = containerAtom.getContainerAtomOfType(Atom.TYPE_meta);
        Metadata mdtaFromMeta = containerAtomOfType != null ? AtomParsers.parseMdtaFromMeta(containerAtomOfType) : null;
        List<TrackSampleTable> traks = AtomParsers.parseTraks(containerAtom, gaplessInfoHolder, C.TIME_UNSET, null, (this.flags & 1) != 0, z14, new p(2));
        ExtractorOutput extractorOutput = (ExtractorOutput) Assertions.checkNotNull(this.extractorOutput);
        long j14 = C.TIME_UNSET;
        int i16 = -1;
        int i17 = 0;
        for (int size2 = traks.size(); i17 < size2; size2 = size2) {
            TrackSampleTable trackSampleTable2 = traks.get(i17);
            if (trackSampleTable2.sampleCount == 0) {
                i15 = i16;
                metadata2 = metadata2;
            } else {
                Track track = trackSampleTable2.track;
                long j15 = track.durationUs;
                if (j15 != C.TIME_UNSET) {
                    trackSampleTable = trackSampleTable2;
                    j8 = j15;
                } else {
                    trackSampleTable = trackSampleTable2;
                    j8 = trackSampleTable.durationUs;
                }
                long jMax = Math.max(j14, j8);
                Mp4Track mp4Track = new Mp4Track(track, trackSampleTable, extractorOutput.track(i17, track.type));
                boolean zEquals = MimeTypes.AUDIO_TRUEHD.equals(track.format.sampleMimeType);
                int i18 = trackSampleTable.maximumSize;
                int i19 = zEquals ? i18 * 16 : i18 + 30;
                Format.Builder builderBuildUpon = track.format.buildUpon();
                builderBuildUpon.setMaxInputSize(i19);
                if (track.type == 2 && j8 > 0) {
                    int i24 = trackSampleTable.sampleCount;
                    if (i24 > 1) {
                        builderBuildUpon.setFrameRate(i24 / (j8 / 1000000.0f));
                    }
                }
                MetadataUtil.setFormatGaplessInfo(track.type, gaplessInfoHolder, builderBuildUpon);
                mdtaFromMeta = mdtaFromMeta;
                MetadataUtil.setFormatMetadata(track.type, metadata2, mdtaFromMeta, builderBuildUpon, metadata, this.slowMotionMetadataEntries.isEmpty() ? null : new Metadata(this.slowMotionMetadataEntries));
                mp4Track.trackOutput.format(builderBuildUpon.build());
                if (track.type == 2) {
                    i14 = i16;
                    if (i14 == -1) {
                        size = arrayList.size();
                    }
                    arrayList.add(mp4Track);
                    i15 = size;
                    j14 = jMax;
                } else {
                    i14 = i16;
                }
                size = i14;
                arrayList.add(mp4Track);
                i15 = size;
                j14 = jMax;
            }
            i17++;
            i16 = i15;
            metadata2 = metadata2;
            traks = traks;
        }
        this.firstVideoTrackIndex = i16;
        this.durationUs = j14;
        Mp4Track[] mp4TrackArr = (Mp4Track[]) arrayList.toArray(new Mp4Track[0]);
        this.tracks = mp4TrackArr;
        this.accumulatedSampleSizes = calculateAccumulatedSampleSizes(mp4TrackArr);
        extractorOutput.endTracks();
        extractorOutput.seekMap(this);
    }

    private void processUnparsedAtom(long j8) {
        if (this.atomType == 1836086884) {
            int i14 = this.atomHeaderBytesRead;
            this.motionPhotoMetadata = new MotionPhotoMetadata(0L, j8, C.TIME_UNSET, j8 + ((long) i14), this.atomSize - ((long) i14));
        }
    }

    private boolean readAtomHeader(ExtractorInput extractorInput) throws ParserException {
        Atom.ContainerAtom containerAtomPeek;
        if (this.atomHeaderBytesRead == 0) {
            if (!extractorInput.readFully(this.atomHeader.getData(), 0, 8, true)) {
                processEndOfStreamReadingAtomHeader();
                return false;
            }
            this.atomHeaderBytesRead = 8;
            this.atomHeader.setPosition(0);
            this.atomSize = this.atomHeader.readUnsignedInt();
            this.atomType = this.atomHeader.readInt();
        }
        long j8 = this.atomSize;
        if (j8 == 1) {
            extractorInput.readFully(this.atomHeader.getData(), 8, 8);
            this.atomHeaderBytesRead += 8;
            this.atomSize = this.atomHeader.readUnsignedLongToLong();
        } else if (j8 == 0) {
            long length = extractorInput.getLength();
            if (length == -1 && (containerAtomPeek = this.containerAtoms.peek()) != null) {
                length = containerAtomPeek.endPosition;
            }
            if (length != -1) {
                this.atomSize = (length - extractorInput.getPosition()) + ((long) this.atomHeaderBytesRead);
            }
        }
        if (this.atomSize < this.atomHeaderBytesRead) {
            throw ParserException.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
        }
        if (shouldParseContainerAtom(this.atomType)) {
            long position = extractorInput.getPosition();
            long j14 = this.atomSize;
            int i14 = this.atomHeaderBytesRead;
            long j15 = (position + j14) - ((long) i14);
            if (j14 != i14 && this.atomType == 1835365473) {
                maybeSkipRemainingMetaAtomHeaderBytes(extractorInput);
            }
            this.containerAtoms.push(new Atom.ContainerAtom(this.atomType, j15));
            if (this.atomSize == this.atomHeaderBytesRead) {
                processAtomEnded(j15);
            } else {
                enterReadingAtomHeaderState();
            }
        } else if (shouldParseLeafAtom(this.atomType)) {
            Assertions.checkState(this.atomHeaderBytesRead == 8);
            Assertions.checkState(this.atomSize <= 2147483647L);
            ParsableByteArray parsableByteArray = new ParsableByteArray((int) this.atomSize);
            System.arraycopy(this.atomHeader.getData(), 0, parsableByteArray.getData(), 0, 8);
            this.atomData = parsableByteArray;
            this.parserState = 1;
        } else {
            processUnparsedAtom(extractorInput.getPosition() - ((long) this.atomHeaderBytesRead));
            this.atomData = null;
            this.parserState = 1;
        }
        return true;
    }

    private boolean readAtomPayload(ExtractorInput extractorInput, PositionHolder positionHolder) {
        boolean z14;
        long j8 = this.atomSize - ((long) this.atomHeaderBytesRead);
        long position = extractorInput.getPosition() + j8;
        ParsableByteArray parsableByteArray = this.atomData;
        if (parsableByteArray == null) {
            if (j8 < 262144) {
                extractorInput.skipFully((int) j8);
            } else {
                positionHolder.position = extractorInput.getPosition() + j8;
                z14 = true;
            }
            processAtomEnded(position);
            return (z14 || this.parserState == 2) ? false : true;
        }
        extractorInput.readFully(parsableByteArray.getData(), this.atomHeaderBytesRead, (int) j8);
        if (this.atomType == 1718909296) {
            this.fileType = processFtypAtom(parsableByteArray);
        } else if (!this.containerAtoms.isEmpty()) {
            this.containerAtoms.peek().add(new Atom.LeafAtom(this.atomType, parsableByteArray));
        }
        z14 = false;
        processAtomEnded(position);
        if (z14) {
        }
    }

    private int readSample(ExtractorInput extractorInput, PositionHolder positionHolder) throws ParserException {
        int i14;
        long position = extractorInput.getPosition();
        if (this.sampleTrackIndex == -1) {
            int trackIndexOfNextReadSample = getTrackIndexOfNextReadSample(position);
            this.sampleTrackIndex = trackIndexOfNextReadSample;
            if (trackIndexOfNextReadSample == -1) {
                return -1;
            }
        }
        Mp4Track mp4Track = ((Mp4Track[]) Util.castNonNull(this.tracks))[this.sampleTrackIndex];
        TrackOutput trackOutput = mp4Track.trackOutput;
        int i15 = mp4Track.sampleIndex;
        TrackSampleTable trackSampleTable = mp4Track.sampleTable;
        long j8 = trackSampleTable.offsets[i15];
        int i16 = trackSampleTable.sizes[i15];
        TrueHdSampleRechunker trueHdSampleRechunker = mp4Track.trueHdSampleRechunker;
        long j14 = (j8 - position) + ((long) this.sampleBytesRead);
        if (j14 < 0 || j14 >= 262144) {
            positionHolder.position = j8;
            return 1;
        }
        if (mp4Track.track.sampleTransformation == 1) {
            j14 += 8;
            i16 -= 8;
        }
        extractorInput.skipFully((int) j14);
        Track track = mp4Track.track;
        if (track.nalUnitLengthFieldLength == 0) {
            if (MimeTypes.AUDIO_AC4.equals(track.format.sampleMimeType)) {
                if (this.sampleBytesWritten == 0) {
                    Ac4Util.getAc4SampleHeader(i16, this.scratch);
                    trackOutput.sampleData(this.scratch, 7);
                    this.sampleBytesWritten += 7;
                }
                i16 += 7;
            } else if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.startSample(extractorInput);
            }
            while (true) {
                int i17 = this.sampleBytesWritten;
                if (i17 >= i16) {
                    break;
                }
                int iSampleData = trackOutput.sampleData((DataReader) extractorInput, i16 - i17, false);
                this.sampleBytesRead += iSampleData;
                this.sampleBytesWritten += iSampleData;
                this.sampleCurrentNalBytesRemaining -= iSampleData;
            }
        } else {
            byte[] data = this.nalLength.getData();
            data[0] = 0;
            data[1] = 0;
            data[2] = 0;
            int i18 = mp4Track.track.nalUnitLengthFieldLength;
            int i19 = 4 - i18;
            while (this.sampleBytesWritten < i16) {
                int i24 = this.sampleCurrentNalBytesRemaining;
                if (i24 == 0) {
                    extractorInput.readFully(data, i19, i18);
                    this.sampleBytesRead += i18;
                    this.nalLength.setPosition(0);
                    int i25 = this.nalLength.readInt();
                    if (i25 < 0) {
                        throw ParserException.createForMalformedContainer("Invalid NAL length", null);
                    }
                    this.sampleCurrentNalBytesRemaining = i25;
                    this.nalStartCode.setPosition(0);
                    trackOutput.sampleData(this.nalStartCode, 4);
                    this.sampleBytesWritten += 4;
                    i16 += i19;
                } else {
                    int iSampleData2 = trackOutput.sampleData((DataReader) extractorInput, i24, false);
                    this.sampleBytesRead += iSampleData2;
                    this.sampleBytesWritten += iSampleData2;
                    this.sampleCurrentNalBytesRemaining -= iSampleData2;
                }
            }
        }
        int i26 = i16;
        TrackSampleTable trackSampleTable2 = mp4Track.sampleTable;
        long j15 = trackSampleTable2.timestampsUs[i15];
        int i27 = trackSampleTable2.flags[i15];
        if (trueHdSampleRechunker != null) {
            i14 = 0;
            trueHdSampleRechunker.sampleMetadata(trackOutput, j15, i27, i26, 0, null);
            if (i15 + 1 == mp4Track.sampleTable.sampleCount) {
                trueHdSampleRechunker.outputPendingSampleMetadata(trackOutput, null);
            }
        } else {
            i14 = 0;
            trackOutput.sampleMetadata(j15, i27, i26, 0, null);
        }
        mp4Track.sampleIndex++;
        this.sampleTrackIndex = -1;
        this.sampleBytesRead = i14;
        this.sampleBytesWritten = i14;
        this.sampleCurrentNalBytesRemaining = i14;
        return i14;
    }

    private int readSefData(ExtractorInput extractorInput, PositionHolder positionHolder) {
        int i14 = this.sefReader.read(extractorInput, positionHolder, this.slowMotionMetadataEntries);
        if (i14 == 1 && positionHolder.position == 0) {
            enterReadingAtomHeaderState();
        }
        return i14;
    }

    private static boolean shouldParseContainerAtom(int i14) {
        return i14 == 1836019574 || i14 == 1953653099 || i14 == 1835297121 || i14 == 1835626086 || i14 == 1937007212 || i14 == 1701082227 || i14 == 1835365473;
    }

    private static boolean shouldParseLeafAtom(int i14) {
        return i14 == 1835296868 || i14 == 1836476516 || i14 == 1751411826 || i14 == 1937011556 || i14 == 1937011827 || i14 == 1937011571 || i14 == 1668576371 || i14 == 1701606260 || i14 == 1937011555 || i14 == 1937011578 || i14 == 1937013298 || i14 == 1937007471 || i14 == 1668232756 || i14 == 1953196132 || i14 == 1718909296 || i14 == 1969517665 || i14 == 1801812339 || i14 == 1768715124;
    }

    private void updateSampleIndex(Mp4Track mp4Track, long j8) {
        TrackSampleTable trackSampleTable = mp4Track.sampleTable;
        int indexOfEarlierOrEqualSynchronizationSample = trackSampleTable.getIndexOfEarlierOrEqualSynchronizationSample(j8);
        if (indexOfEarlierOrEqualSynchronizationSample == -1) {
            indexOfEarlierOrEqualSynchronizationSample = trackSampleTable.getIndexOfLaterOrEqualSynchronizationSample(j8);
        }
        mp4Track.sampleIndex = indexOfEarlierOrEqualSynchronizationSample;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j8) {
        long j14;
        long jMaybeAdjustSeekOffset;
        long j15;
        long j16;
        int indexOfLaterOrEqualSynchronizationSample;
        if (((Mp4Track[]) Assertions.checkNotNull(this.tracks)).length == 0) {
            return new SeekMap.SeekPoints(SeekPoint.START);
        }
        int i14 = this.firstVideoTrackIndex;
        if (i14 != -1) {
            TrackSampleTable trackSampleTable = this.tracks[i14].sampleTable;
            int synchronizationSampleIndex = getSynchronizationSampleIndex(trackSampleTable, j8);
            if (synchronizationSampleIndex == -1) {
                return new SeekMap.SeekPoints(SeekPoint.START);
            }
            long j17 = trackSampleTable.timestampsUs[synchronizationSampleIndex];
            j14 = trackSampleTable.offsets[synchronizationSampleIndex];
            if (j17 >= j8 || synchronizationSampleIndex >= trackSampleTable.sampleCount - 1 || (indexOfLaterOrEqualSynchronizationSample = trackSampleTable.getIndexOfLaterOrEqualSynchronizationSample(j8)) == -1 || indexOfLaterOrEqualSynchronizationSample == synchronizationSampleIndex) {
                j16 = -1;
                j15 = -9223372036854775807L;
            } else {
                j15 = trackSampleTable.timestampsUs[indexOfLaterOrEqualSynchronizationSample];
                j16 = trackSampleTable.offsets[indexOfLaterOrEqualSynchronizationSample];
            }
            jMaybeAdjustSeekOffset = j16;
            j8 = j17;
        } else {
            j14 = Long.MAX_VALUE;
            jMaybeAdjustSeekOffset = -1;
            j15 = -9223372036854775807L;
        }
        int i15 = 0;
        while (true) {
            Mp4Track[] mp4TrackArr = this.tracks;
            if (i15 >= mp4TrackArr.length) {
                break;
            }
            if (i15 != this.firstVideoTrackIndex) {
                TrackSampleTable trackSampleTable2 = mp4TrackArr[i15].sampleTable;
                long jMaybeAdjustSeekOffset2 = maybeAdjustSeekOffset(trackSampleTable2, j8, j14);
                if (j15 != C.TIME_UNSET) {
                    jMaybeAdjustSeekOffset = maybeAdjustSeekOffset(trackSampleTable2, j15, jMaybeAdjustSeekOffset);
                }
                j14 = jMaybeAdjustSeekOffset2;
            }
            i15++;
        }
        SeekPoint seekPoint = new SeekPoint(j8, j14);
        return j15 == C.TIME_UNSET ? new SeekMap.SeekPoints(seekPoint) : new SeekMap.SeekPoints(seekPoint, new SeekPoint(j15, jMaybeAdjustSeekOffset));
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) {
        while (true) {
            int i14 = this.parserState;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 == 2) {
                        return readSample(extractorInput, positionHolder);
                    }
                    if (i14 == 3) {
                        return readSefData(extractorInput, positionHolder);
                    }
                    x.h();
                    return 0;
                }
                if (readAtomPayload(extractorInput, positionHolder)) {
                    return 1;
                }
            } else if (!readAtomHeader(extractorInput)) {
                return -1;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long j8, long j14) {
        this.containerAtoms.clear();
        this.atomHeaderBytesRead = 0;
        this.sampleTrackIndex = -1;
        this.sampleBytesRead = 0;
        this.sampleBytesWritten = 0;
        this.sampleCurrentNalBytesRemaining = 0;
        if (j8 == 0) {
            if (this.parserState != 3) {
                enterReadingAtomHeaderState();
                return;
            } else {
                this.sefReader.reset();
                this.slowMotionMetadataEntries.clear();
                return;
            }
        }
        Mp4Track[] mp4TrackArr = this.tracks;
        if (mp4TrackArr != null) {
            for (Mp4Track mp4Track : mp4TrackArr) {
                updateSampleIndex(mp4Track, j14);
                TrueHdSampleRechunker trueHdSampleRechunker = mp4Track.trueHdSampleRechunker;
                if (trueHdSampleRechunker != null) {
                    trueHdSampleRechunker.reset();
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) {
        return Sniffer.sniffUnfragmented(extractorInput, (this.flags & 2) != 0);
    }

    public Mp4Extractor() {
        this(0);
    }
}
