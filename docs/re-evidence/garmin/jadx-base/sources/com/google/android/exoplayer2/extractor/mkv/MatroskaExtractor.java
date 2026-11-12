package com.google.android.exoplayer2.extractor.mkv;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.TrueHdSampleRechunker;
import com.google.android.exoplayer2.extractor.a;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.LongArray;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.v;
import com.google.android.exoplayer2.video.AvcConfig;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.android.exoplayer2.video.DolbyVisionConfig;
import com.google.android.exoplayer2.video.HevcConfig;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.UnsignedBytes;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.joda.time.DateTimeConstants;
import q6.f;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
public class MatroskaExtractor implements Extractor {
    private static final int BLOCK_ADDITIONAL_ID_VP9_ITU_T_35 = 4;
    private static final int BLOCK_ADD_ID_TYPE_DVCC = 1685480259;
    private static final int BLOCK_ADD_ID_TYPE_DVVC = 1685485123;
    private static final int BLOCK_STATE_DATA = 2;
    private static final int BLOCK_STATE_HEADER = 1;
    private static final int BLOCK_STATE_START = 0;
    private static final String CODEC_ID_AAC = "A_AAC";
    private static final String CODEC_ID_AC3 = "A_AC3";
    private static final String CODEC_ID_ACM = "A_MS/ACM";
    private static final String CODEC_ID_ASS = "S_TEXT/ASS";
    private static final String CODEC_ID_AV1 = "V_AV1";
    private static final String CODEC_ID_DTS = "A_DTS";
    private static final String CODEC_ID_DTS_EXPRESS = "A_DTS/EXPRESS";
    private static final String CODEC_ID_DTS_LOSSLESS = "A_DTS/LOSSLESS";
    private static final String CODEC_ID_DVBSUB = "S_DVBSUB";
    private static final String CODEC_ID_E_AC3 = "A_EAC3";
    private static final String CODEC_ID_FLAC = "A_FLAC";
    private static final String CODEC_ID_FOURCC = "V_MS/VFW/FOURCC";
    private static final String CODEC_ID_H264 = "V_MPEG4/ISO/AVC";
    private static final String CODEC_ID_H265 = "V_MPEGH/ISO/HEVC";
    private static final String CODEC_ID_MP2 = "A_MPEG/L2";
    private static final String CODEC_ID_MP3 = "A_MPEG/L3";
    private static final String CODEC_ID_MPEG2 = "V_MPEG2";
    private static final String CODEC_ID_MPEG4_AP = "V_MPEG4/ISO/AP";
    private static final String CODEC_ID_MPEG4_ASP = "V_MPEG4/ISO/ASP";
    private static final String CODEC_ID_MPEG4_SP = "V_MPEG4/ISO/SP";
    private static final String CODEC_ID_OPUS = "A_OPUS";
    private static final String CODEC_ID_PCM_FLOAT = "A_PCM/FLOAT/IEEE";
    private static final String CODEC_ID_PCM_INT_BIG = "A_PCM/INT/BIG";
    private static final String CODEC_ID_PCM_INT_LIT = "A_PCM/INT/LIT";
    private static final String CODEC_ID_PGS = "S_HDMV/PGS";
    private static final String CODEC_ID_SUBRIP = "S_TEXT/UTF8";
    private static final String CODEC_ID_THEORA = "V_THEORA";
    private static final String CODEC_ID_TRUEHD = "A_TRUEHD";
    private static final String CODEC_ID_VOBSUB = "S_VOBSUB";
    private static final String CODEC_ID_VORBIS = "A_VORBIS";
    private static final String CODEC_ID_VP8 = "V_VP8";
    private static final String CODEC_ID_VP9 = "V_VP9";
    private static final String CODEC_ID_VTT = "S_TEXT/WEBVTT";
    private static final String DOC_TYPE_MATROSKA = "matroska";
    private static final String DOC_TYPE_WEBM = "webm";
    private static final int ENCRYPTION_IV_SIZE = 8;
    public static final int FLAG_DISABLE_SEEK_FOR_CUES = 1;
    private static final int FOURCC_COMPRESSION_DIVX = 1482049860;
    private static final int FOURCC_COMPRESSION_H263 = 859189832;
    private static final int FOURCC_COMPRESSION_VC1 = 826496599;
    private static final int ID_AUDIO = 225;
    private static final int ID_AUDIO_BIT_DEPTH = 25188;
    private static final int ID_BLOCK = 161;
    private static final int ID_BLOCK_ADDITIONAL = 165;
    private static final int ID_BLOCK_ADDITIONS = 30113;
    private static final int ID_BLOCK_ADDITION_MAPPING = 16868;
    private static final int ID_BLOCK_ADD_ID = 238;
    private static final int ID_BLOCK_ADD_ID_EXTRA_DATA = 16877;
    private static final int ID_BLOCK_ADD_ID_TYPE = 16871;
    private static final int ID_BLOCK_DURATION = 155;
    private static final int ID_BLOCK_GROUP = 160;
    private static final int ID_BLOCK_MORE = 166;
    private static final int ID_CHANNELS = 159;
    private static final int ID_CLUSTER = 524531317;
    private static final int ID_CODEC_DELAY = 22186;
    private static final int ID_CODEC_ID = 134;
    private static final int ID_CODEC_PRIVATE = 25506;
    private static final int ID_COLOUR = 21936;
    private static final int ID_COLOUR_PRIMARIES = 21947;
    private static final int ID_COLOUR_RANGE = 21945;
    private static final int ID_COLOUR_TRANSFER = 21946;
    private static final int ID_CONTENT_COMPRESSION = 20532;
    private static final int ID_CONTENT_COMPRESSION_ALGORITHM = 16980;
    private static final int ID_CONTENT_COMPRESSION_SETTINGS = 16981;
    private static final int ID_CONTENT_ENCODING = 25152;
    private static final int ID_CONTENT_ENCODINGS = 28032;
    private static final int ID_CONTENT_ENCODING_ORDER = 20529;
    private static final int ID_CONTENT_ENCODING_SCOPE = 20530;
    private static final int ID_CONTENT_ENCRYPTION = 20533;
    private static final int ID_CONTENT_ENCRYPTION_AES_SETTINGS = 18407;
    private static final int ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE = 18408;
    private static final int ID_CONTENT_ENCRYPTION_ALGORITHM = 18401;
    private static final int ID_CONTENT_ENCRYPTION_KEY_ID = 18402;
    private static final int ID_CUES = 475249515;
    private static final int ID_CUE_CLUSTER_POSITION = 241;
    private static final int ID_CUE_POINT = 187;
    private static final int ID_CUE_TIME = 179;
    private static final int ID_CUE_TRACK_POSITIONS = 183;
    private static final int ID_DEFAULT_DURATION = 2352003;
    private static final int ID_DISPLAY_HEIGHT = 21690;
    private static final int ID_DISPLAY_UNIT = 21682;
    private static final int ID_DISPLAY_WIDTH = 21680;
    private static final int ID_DOC_TYPE = 17026;
    private static final int ID_DOC_TYPE_READ_VERSION = 17029;
    private static final int ID_DURATION = 17545;
    private static final int ID_EBML = 440786851;
    private static final int ID_EBML_READ_VERSION = 17143;
    private static final int ID_FLAG_DEFAULT = 136;
    private static final int ID_FLAG_FORCED = 21930;
    private static final int ID_INFO = 357149030;
    private static final int ID_LANGUAGE = 2274716;
    private static final int ID_LUMNINANCE_MAX = 21977;
    private static final int ID_LUMNINANCE_MIN = 21978;
    private static final int ID_MASTERING_METADATA = 21968;
    private static final int ID_MAX_BLOCK_ADDITION_ID = 21998;
    private static final int ID_MAX_CLL = 21948;
    private static final int ID_MAX_FALL = 21949;
    private static final int ID_NAME = 21358;
    private static final int ID_PIXEL_HEIGHT = 186;
    private static final int ID_PIXEL_WIDTH = 176;
    private static final int ID_PRIMARY_B_CHROMATICITY_X = 21973;
    private static final int ID_PRIMARY_B_CHROMATICITY_Y = 21974;
    private static final int ID_PRIMARY_G_CHROMATICITY_X = 21971;
    private static final int ID_PRIMARY_G_CHROMATICITY_Y = 21972;
    private static final int ID_PRIMARY_R_CHROMATICITY_X = 21969;
    private static final int ID_PRIMARY_R_CHROMATICITY_Y = 21970;
    private static final int ID_PROJECTION = 30320;
    private static final int ID_PROJECTION_POSE_PITCH = 30324;
    private static final int ID_PROJECTION_POSE_ROLL = 30325;
    private static final int ID_PROJECTION_POSE_YAW = 30323;
    private static final int ID_PROJECTION_PRIVATE = 30322;
    private static final int ID_PROJECTION_TYPE = 30321;
    private static final int ID_REFERENCE_BLOCK = 251;
    private static final int ID_SAMPLING_FREQUENCY = 181;
    private static final int ID_SEEK = 19899;
    private static final int ID_SEEK_HEAD = 290298740;
    private static final int ID_SEEK_ID = 21419;
    private static final int ID_SEEK_POSITION = 21420;
    private static final int ID_SEEK_PRE_ROLL = 22203;
    private static final int ID_SEGMENT = 408125543;
    private static final int ID_SEGMENT_INFO = 357149030;
    private static final int ID_SIMPLE_BLOCK = 163;
    private static final int ID_STEREO_MODE = 21432;
    private static final int ID_TIMECODE_SCALE = 2807729;
    private static final int ID_TIME_CODE = 231;
    private static final int ID_TRACKS = 374648427;
    private static final int ID_TRACK_ENTRY = 174;
    private static final int ID_TRACK_NUMBER = 215;
    private static final int ID_TRACK_TYPE = 131;
    private static final int ID_VIDEO = 224;
    private static final int ID_WHITE_POINT_CHROMATICITY_X = 21975;
    private static final int ID_WHITE_POINT_CHROMATICITY_Y = 21976;
    private static final int LACING_EBML = 3;
    private static final int LACING_FIXED_SIZE = 2;
    private static final int LACING_NONE = 0;
    private static final int LACING_XIPH = 1;
    private static final int OPUS_MAX_INPUT_SIZE = 5760;
    private static final int SSA_PREFIX_END_TIMECODE_OFFSET = 21;
    private static final String SSA_TIMECODE_FORMAT = "%01d:%02d:%02d:%02d";
    private static final long SSA_TIMECODE_LAST_VALUE_SCALING_FACTOR = 10000;
    private static final int SUBRIP_PREFIX_END_TIMECODE_OFFSET = 19;
    private static final String SUBRIP_TIMECODE_FORMAT = "%02d:%02d:%02d,%03d";
    private static final long SUBRIP_TIMECODE_LAST_VALUE_SCALING_FACTOR = 1000;
    private static final String TAG = "MatroskaExtractor";
    private static final Map<String, Integer> TRACK_NAME_TO_ROTATION_DEGREES;
    private static final int TRACK_TYPE_AUDIO = 2;
    private static final int UNSET_ENTRY_ID = -1;
    private static final int VORBIS_MAX_INPUT_SIZE = 8192;
    private static final int VTT_PREFIX_END_TIMECODE_OFFSET = 25;
    private static final String VTT_TIMECODE_FORMAT = "%02d:%02d:%02d.%03d";
    private static final long VTT_TIMECODE_LAST_VALUE_SCALING_FACTOR = 1000;
    private static final int WAVE_FORMAT_EXTENSIBLE = 65534;
    private static final int WAVE_FORMAT_PCM = 1;
    private static final int WAVE_FORMAT_SIZE = 18;
    private final ParsableByteArray blockAdditionalData;
    private int blockAdditionalId;
    private long blockDurationUs;
    private int blockFlags;
    private boolean blockHasReferenceBlock;
    private int blockSampleCount;
    private int blockSampleIndex;
    private int[] blockSampleSizes;
    private int blockState;
    private long blockTimeUs;
    private int blockTrackNumber;
    private int blockTrackNumberLength;
    private long clusterTimecodeUs;
    private LongArray cueClusterPositions;
    private LongArray cueTimesUs;
    private long cuesContentPosition;
    private Track currentTrack;
    private long durationTimecode;
    private long durationUs;
    private final ParsableByteArray encryptionInitializationVector;
    private final ParsableByteArray encryptionSubsampleData;
    private ByteBuffer encryptionSubsampleDataBuffer;
    private ExtractorOutput extractorOutput;
    private boolean haveOutputSample;
    private final ParsableByteArray nalLength;
    private final ParsableByteArray nalStartCode;
    private final EbmlReader reader;
    private int sampleBytesRead;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private boolean sampleEncodingHandled;
    private boolean sampleInitializationVectorRead;
    private int samplePartitionCount;
    private boolean samplePartitionCountRead;
    private byte sampleSignalByte;
    private boolean sampleSignalByteRead;
    private final ParsableByteArray sampleStrippedBytes;
    private final ParsableByteArray scratch;
    private int seekEntryId;
    private final ParsableByteArray seekEntryIdBytes;
    private long seekEntryPosition;
    private boolean seekForCues;
    private final boolean seekForCuesEnabled;
    private long seekPositionAfterBuildingCues;
    private boolean seenClusterPositionForCurrentCuePoint;
    private long segmentContentPosition;
    private long segmentContentSize;
    private boolean sentSeekMap;
    private final ParsableByteArray subtitleSample;
    private long timecodeScale;
    private final SparseArray<Track> tracks;
    private final VarintReader varintReader;
    private final ParsableByteArray vorbisNumPageSamples;
    public static final ExtractorsFactory FACTORY = new a(4);
    private static final byte[] SUBRIP_PREFIX = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] SSA_DIALOGUE_FORMAT = Util.getUtf8Bytes("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] SSA_PREFIX = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final byte[] VTT_PREFIX = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    private static final UUID WAVE_SUBFORMAT_PCM = new UUID(72057594037932032L, -9223371306706625679L);

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public final class InnerEbmlProcessor implements EbmlProcessor {
        private InnerEbmlProcessor() {
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public void binaryElement(int i14, int i15, ExtractorInput extractorInput) throws ParserException {
            MatroskaExtractor.this.binaryElement(i14, i15, extractorInput);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public void endMasterElement(int i14) throws ParserException {
            MatroskaExtractor.this.endMasterElement(i14);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public void floatElement(int i14, double d14) {
            MatroskaExtractor.this.floatElement(i14, d14);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public int getElementType(int i14) {
            return MatroskaExtractor.this.getElementType(i14);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public void integerElement(int i14, long j8) throws ParserException {
            MatroskaExtractor.this.integerElement(i14, j8);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public boolean isLevel1Element(int i14) {
            return MatroskaExtractor.this.isLevel1Element(i14);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public void startMasterElement(int i14, long j8, long j14) throws ParserException {
            MatroskaExtractor.this.startMasterElement(i14, j8, j14);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public void stringElement(int i14, String str) throws ParserException {
            MatroskaExtractor.this.stringElement(i14, str);
        }
    }

    public static final class Track {
        private static final int DEFAULT_MAX_CLL = 1000;
        private static final int DEFAULT_MAX_FALL = 200;
        private static final int DISPLAY_UNIT_PIXELS = 0;
        private static final int MAX_CHROMATICITY = 50000;
        private int blockAddIdType;
        public String codecId;
        public byte[] codecPrivate;
        public TrackOutput.CryptoData cryptoData;
        public int defaultSampleDurationNs;
        public byte[] dolbyVisionConfigBytes;
        public DrmInitData drmInitData;
        public boolean flagForced;
        public boolean hasContentEncryption;
        public int maxBlockAdditionId;
        public int nalUnitLengthFieldLength;
        public String name;
        public int number;
        public TrackOutput output;
        public byte[] sampleStrippedBytes;
        public TrueHdSampleRechunker trueHdSampleRechunker;
        public int type;
        public int width = -1;
        public int height = -1;
        public int displayWidth = -1;
        public int displayHeight = -1;
        public int displayUnit = 0;
        public int projectionType = -1;
        public float projectionPoseYaw = 0.0f;
        public float projectionPosePitch = 0.0f;
        public float projectionPoseRoll = 0.0f;
        public byte[] projectionData = null;
        public int stereoMode = -1;
        public boolean hasColorInfo = false;
        public int colorSpace = -1;
        public int colorTransfer = -1;
        public int colorRange = -1;
        public int maxContentLuminance = 1000;
        public int maxFrameAverageLuminance = 200;
        public float primaryRChromaticityX = -1.0f;
        public float primaryRChromaticityY = -1.0f;
        public float primaryGChromaticityX = -1.0f;
        public float primaryGChromaticityY = -1.0f;
        public float primaryBChromaticityX = -1.0f;
        public float primaryBChromaticityY = -1.0f;
        public float whitePointChromaticityX = -1.0f;
        public float whitePointChromaticityY = -1.0f;
        public float maxMasteringLuminance = -1.0f;
        public float minMasteringLuminance = -1.0f;
        public int channelCount = 1;
        public int audioBitDepth = -1;
        public int sampleRate = 8000;
        public long codecDelayNs = 0;
        public long seekPreRollNs = 0;
        public boolean flagDefault = true;
        private String language = "eng";

        /* JADX INFO: Access modifiers changed from: private */
        public void assertOutputInitialized() {
            Assertions.checkNotNull(this.output);
        }

        private byte[] getCodecPrivate(String str) throws ParserException {
            byte[] bArr = this.codecPrivate;
            if (bArr != null) {
                return bArr;
            }
            String strValueOf = String.valueOf(str);
            throw ParserException.createForMalformedContainer(strValueOf.length() != 0 ? "Missing CodecPrivate for codec ".concat(strValueOf) : new String("Missing CodecPrivate for codec "), null);
        }

        private byte[] getHdrStaticInfo() {
            if (this.primaryRChromaticityX == -1.0f || this.primaryRChromaticityY == -1.0f || this.primaryGChromaticityX == -1.0f || this.primaryGChromaticityY == -1.0f || this.primaryBChromaticityX == -1.0f || this.primaryBChromaticityY == -1.0f || this.whitePointChromaticityX == -1.0f || this.whitePointChromaticityY == -1.0f || this.maxMasteringLuminance == -1.0f || this.minMasteringLuminance == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.putShort((short) ((this.primaryRChromaticityX * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryRChromaticityY * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryGChromaticityX * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryGChromaticityY * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryBChromaticityX * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryBChromaticityY * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.whitePointChromaticityX * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.whitePointChromaticityY * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) (this.maxMasteringLuminance + 0.5f));
            byteBufferOrder.putShort((short) (this.minMasteringLuminance + 0.5f));
            byteBufferOrder.putShort((short) this.maxContentLuminance);
            byteBufferOrder.putShort((short) this.maxFrameAverageLuminance);
            return bArr;
        }

        private static Pair<String, List<byte[]>> parseFourCcPrivate(ParsableByteArray parsableByteArray) throws ParserException {
            try {
                parsableByteArray.skipBytes(16);
                long littleEndianUnsignedInt = parsableByteArray.readLittleEndianUnsignedInt();
                if (littleEndianUnsignedInt == 1482049860) {
                    return new Pair<>(MimeTypes.VIDEO_DIVX, null);
                }
                if (littleEndianUnsignedInt == 859189832) {
                    return new Pair<>(MimeTypes.VIDEO_H263, null);
                }
                if (littleEndianUnsignedInt != 826496599) {
                    Log.w(MatroskaExtractor.TAG, "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair<>(MimeTypes.VIDEO_UNKNOWN, null);
                }
                byte[] data = parsableByteArray.getData();
                for (int position = parsableByteArray.getPosition() + 20; position < data.length - 4; position++) {
                    if (data[position] == 0 && data[position + 1] == 0 && data[position + 2] == 1 && data[position + 3] == 15) {
                        return new Pair<>(MimeTypes.VIDEO_VC1, Collections.singletonList(Arrays.copyOfRange(data, position, data.length)));
                    }
                }
                throw ParserException.createForMalformedContainer("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing FourCC private data", null);
            }
        }

        private static boolean parseMsAcmCodecPrivate(ParsableByteArray parsableByteArray) throws ParserException {
            try {
                int littleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
                if (littleEndianUnsignedShort == 1) {
                    return true;
                }
                if (littleEndianUnsignedShort == 65534) {
                    parsableByteArray.setPosition(24);
                    if (parsableByteArray.readLong() == MatroskaExtractor.WAVE_SUBFORMAT_PCM.getMostSignificantBits() && parsableByteArray.readLong() == MatroskaExtractor.WAVE_SUBFORMAT_PCM.getLeastSignificantBits()) {
                        return true;
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing MS/ACM codec private", null);
            }
        }

        private static List<byte[]> parseVorbisCodecPrivate(byte[] bArr) throws ParserException {
            int i14;
            int i15;
            try {
                if (bArr[0] != 2) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                int i16 = 0;
                int i17 = 1;
                while (true) {
                    i14 = bArr[i17];
                    if ((i14 & 255) != 255) {
                        break;
                    }
                    i16 += 255;
                    i17++;
                }
                int i18 = i17 + 1;
                int i19 = i16 + (i14 & 255);
                int i24 = 0;
                while (true) {
                    i15 = bArr[i18];
                    if ((i15 & 255) != 255) {
                        break;
                    }
                    i24 += 255;
                    i18++;
                }
                int i25 = i18 + 1;
                int i26 = i24 + (i15 & 255);
                if (bArr[i25] != 1) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i19];
                System.arraycopy(bArr, i25, bArr2, 0, i19);
                int i27 = i25 + i19;
                if (bArr[i27] != 3) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                int i28 = i27 + i26;
                if (bArr[i28] != 5) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i28];
                System.arraycopy(bArr, i28, bArr3, 0, bArr.length - i28);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:210:0x0431  */
        /* JADX WARN: Code duplicated, block: B:215:0x0448  */
        /* JADX WARN: Code duplicated, block: B:216:0x044a  */
        /* JADX WARN: Code duplicated, block: B:219:0x0457  */
        /* JADX WARN: Code duplicated, block: B:220:0x0469  */
        /* JADX WARN: Code duplicated, block: B:222:0x046f  */
        /* JADX WARN: Code duplicated, block: B:224:0x0473  */
        /* JADX WARN: Code duplicated, block: B:226:0x0478  */
        /* JADX WARN: Code duplicated, block: B:229:0x0480  */
        /* JADX WARN: Code duplicated, block: B:231:0x0485  */
        /* JADX WARN: Code duplicated, block: B:234:0x048a  */
        /* JADX WARN: Code duplicated, block: B:237:0x0498  */
        /* JADX WARN: Code duplicated, block: B:240:0x049e  */
        /* JADX WARN: Code duplicated, block: B:243:0x04b1  */
        /* JADX WARN: Code duplicated, block: B:248:0x04d1  */
        /* JADX WARN: Code duplicated, block: B:254:0x04ea  */
        /* JADX WARN: Code duplicated, block: B:255:0x04ec  */
        /* JADX WARN: Code duplicated, block: B:257:0x04f6  */
        /* JADX WARN: Code duplicated, block: B:258:0x04f9  */
        /* JADX WARN: Code duplicated, block: B:260:0x0503  */
        /* JADX WARN: Code duplicated, block: B:266:0x051b  */
        /* JADX WARN: Code duplicated, block: B:268:0x0542  */
        /* JADX WARN: Code duplicated, block: B:270:0x0548  */
        /* JADX WARN: Code duplicated, block: B:286:0x0573  */
        /* JADX WARN: Code duplicated, block: B:4:0x0015  */
        public void initializeOutput(ExtractorOutput extractorOutput, int i14) throws ParserException {
            byte b14;
            List<byte[]> list;
            String str;
            int i15;
            List<byte[]> list2;
            int i16;
            List<byte[]> list3;
            List<byte[]> list4;
            List<byte[]> list5;
            String str2;
            List<byte[]> list6;
            List<byte[]> list7;
            int pcmEncoding;
            List<byte[]> list8;
            byte[] bArr;
            String str3;
            int i17;
            Format.Builder builder;
            int i18;
            int iIntValue;
            int i19;
            float f14;
            int i24;
            int i25;
            int i26;
            DolbyVisionConfig dolbyVisionConfig;
            List<byte[]> list9;
            String str4 = this.codecId;
            str4.getClass();
            switch (str4) {
                case "V_MPEG4/ISO/AP":
                    b14 = 0;
                    break;
                case "V_MPEG4/ISO/SP":
                    b14 = 1;
                    break;
                case "A_MS/ACM":
                    b14 = 2;
                    break;
                case "A_TRUEHD":
                    b14 = 3;
                    break;
                case "A_VORBIS":
                    b14 = 4;
                    break;
                case "A_MPEG/L2":
                    b14 = 5;
                    break;
                case "A_MPEG/L3":
                    b14 = 6;
                    break;
                case "V_MS/VFW/FOURCC":
                    b14 = 7;
                    break;
                case "S_DVBSUB":
                    b14 = 8;
                    break;
                case "V_MPEG4/ISO/ASP":
                    b14 = 9;
                    break;
                case "V_MPEG4/ISO/AVC":
                    b14 = 10;
                    break;
                case "S_VOBSUB":
                    b14 = Ascii.VT;
                    break;
                case "A_DTS/LOSSLESS":
                    b14 = Ascii.FF;
                    break;
                case "A_AAC":
                    b14 = Ascii.CR;
                    break;
                case "A_AC3":
                    b14 = Ascii.SO;
                    break;
                case "A_DTS":
                    b14 = Ascii.SI;
                    break;
                case "V_AV1":
                    b14 = 16;
                    break;
                case "V_VP8":
                    b14 = 17;
                    break;
                case "V_VP9":
                    b14 = Ascii.DC2;
                    break;
                case "S_HDMV/PGS":
                    b14 = 19;
                    break;
                case "V_THEORA":
                    b14 = Ascii.DC4;
                    break;
                case "A_DTS/EXPRESS":
                    b14 = Ascii.NAK;
                    break;
                case "A_PCM/FLOAT/IEEE":
                    b14 = Ascii.SYN;
                    break;
                case "A_PCM/INT/BIG":
                    b14 = Ascii.ETB;
                    break;
                case "A_PCM/INT/LIT":
                    b14 = Ascii.CAN;
                    break;
                case "S_TEXT/ASS":
                    b14 = Ascii.EM;
                    break;
                case "V_MPEGH/ISO/HEVC":
                    b14 = Ascii.SUB;
                    break;
                case "S_TEXT/WEBVTT":
                    b14 = Ascii.ESC;
                    break;
                case "S_TEXT/UTF8":
                    b14 = Ascii.FS;
                    break;
                case "V_MPEG2":
                    b14 = Ascii.GS;
                    break;
                case "A_EAC3":
                    b14 = Ascii.RS;
                    break;
                case "A_FLAC":
                    b14 = Ascii.US;
                    break;
                case "A_OPUS":
                    b14 = 32;
                    break;
                default:
                    b14 = -1;
                    break;
            }
            String str5 = MimeTypes.AUDIO_RAW;
            switch (b14) {
                case 0:
                case 1:
                case 9:
                    byte[] bArr2 = this.codecPrivate;
                    List<byte[]> listSingletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                    str5 = MimeTypes.VIDEO_MP4V;
                    list4 = listSingletonList;
                    str = null;
                    list = list4;
                    i16 = -1;
                    list3 = list;
                    i15 = -1;
                    list2 = list3;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null && (dolbyVisionConfig = DolbyVisionConfig.parse(new ParsableByteArray(bArr))) != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    boolean z14 = this.flagDefault;
                    if (this.flagForced) {
                        i17 = 2;
                    } else {
                        i17 = 0;
                    }
                    int i27 = i17 | (z14 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i15);
                        i18 = 1;
                    } else if (MimeTypes.isVideo(str3)) {
                        if (this.displayUnit == 0) {
                            i25 = this.displayWidth;
                            iIntValue = -1;
                            if (i25 == -1) {
                                i25 = this.width;
                            }
                            this.displayWidth = i25;
                            i26 = this.displayHeight;
                            if (i26 == -1) {
                                i26 = this.height;
                            }
                            this.displayHeight = i26;
                        } else {
                            iIntValue = -1;
                        }
                        i19 = this.displayWidth;
                        if (i19 != iIntValue || (i24 = this.displayHeight) == iIntValue) {
                            f14 = -1.0f;
                        } else {
                            f14 = (this.height * i19) / (this.width * i24);
                        }
                        ColorInfo colorInfo = this.hasColorInfo ? new ColorInfo(this.colorSpace, this.colorRange, this.colorTransfer, getHdrStaticInfo()) : null;
                        if (this.name != null && MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.containsKey(this.name)) {
                            iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                        }
                        if (this.projectionType == 0 && Float.compare(this.projectionPoseYaw, 0.0f) == 0 && Float.compare(this.projectionPosePitch, 0.0f) == 0) {
                            if (Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.projectionPosePitch, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.projectionPosePitch, -180.0f) != 0 || Float.compare(this.projectionPosePitch, 180.0f) == 0) {
                                iIntValue = 180;
                            } else if (Float.compare(this.projectionPosePitch, -90.0f) == 0) {
                                iIntValue = 270;
                            }
                        }
                        builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f14).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfo);
                        i18 = 2;
                    } else {
                        if (MimeTypes.APPLICATION_SUBRIP.equals(str3) && !MimeTypes.TEXT_SSA.equals(str3) && !MimeTypes.TEXT_VTT.equals(str3) && !MimeTypes.APPLICATION_VOBSUB.equals(str3) && !MimeTypes.APPLICATION_PGS.equals(str3) && !MimeTypes.APPLICATION_DVBSUBS.equals(str3)) {
                            throw ParserException.createForMalformedContainer("Unexpected MIME type.", null);
                        }
                        i18 = 3;
                    }
                    if (this.name != null && !MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.containsKey(this.name)) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild = builder.setId(i14).setSampleMimeType(str3).setMaxInputSize(i16).setLanguage(this.language).setSelectionFlags(i27).setInitializationData(list2).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack = extractorOutput.track(this.number, i18);
                    this.output = trackOutputTrack;
                    trackOutputTrack.format(formatBuild);
                    return;
                case 2:
                    if (parseMsAcmCodecPrivate(new ParsableByteArray(getCodecPrivate(this.codecId)))) {
                        int pcmEncoding2 = Util.getPcmEncoding(this.audioBitDepth);
                        if (pcmEncoding2 == 0) {
                            int i28 = this.audioBitDepth;
                            StringBuilder sb3 = new StringBuilder(MimeTypes.AUDIO_UNKNOWN.length() + 60);
                            sb3.append("Unsupported PCM bit depth: ");
                            sb3.append(i28);
                            sb3.append(". Setting mimeType to audio/x-unknown");
                            Log.w(MatroskaExtractor.TAG, sb3.toString());
                        } else {
                            i15 = pcmEncoding2;
                            list2 = null;
                            str = null;
                            i16 = -1;
                        }
                        bArr = this.dolbyVisionConfigBytes;
                        if (bArr != null) {
                            str = dolbyVisionConfig.codecs;
                            str5 = MimeTypes.VIDEO_DOLBY_VISION;
                        }
                        str3 = str5;
                        boolean z15 = this.flagDefault;
                        if (this.flagForced) {
                            i17 = 2;
                        } else {
                            i17 = 0;
                        }
                        int i29 = i17 | (z15 ? 1 : 0);
                        builder = new Format.Builder();
                        if (MimeTypes.isAudio(str3)) {
                            if (MimeTypes.isVideo(str3)) {
                                if (this.displayUnit == 0) {
                                    i25 = this.displayWidth;
                                    iIntValue = -1;
                                    if (i25 == -1) {
                                        i25 = this.width;
                                    }
                                    this.displayWidth = i25;
                                    i26 = this.displayHeight;
                                    if (i26 == -1) {
                                        i26 = this.height;
                                    }
                                    this.displayHeight = i26;
                                } else {
                                    iIntValue = -1;
                                }
                                i19 = this.displayWidth;
                                if (i19 != iIntValue) {
                                    f14 = -1.0f;
                                } else {
                                    f14 = -1.0f;
                                }
                                if (this.hasColorInfo) {
                                }
                                if (this.name != null) {
                                    iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                                }
                                if (this.projectionType == 0) {
                                    if (Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(this.projectionPosePitch, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(this.projectionPosePitch, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f14).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfo);
                                i18 = 2;
                            } else {
                                if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                                }
                                i18 = 3;
                            }
                            break;
                        } else {
                            builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i15);
                            i18 = 1;
                        }
                        if (this.name != null) {
                            builder.setLabel(this.name);
                        }
                        Format formatBuild2 = builder.setId(i14).setSampleMimeType(str3).setMaxInputSize(i16).setLanguage(this.language).setSelectionFlags(i29).setInitializationData(list2).setCodecs(str).setDrmInitData(this.drmInitData).build();
                        TrackOutput trackOutputTrack2 = extractorOutput.track(this.number, i18);
                        this.output = trackOutputTrack2;
                        trackOutputTrack2.format(formatBuild2);
                        return;
                    }
                    Log.w(MatroskaExtractor.TAG, MimeTypes.AUDIO_UNKNOWN.length() != 0 ? "Non-PCM MS/ACM is unsupported. Setting mimeType to ".concat(MimeTypes.AUDIO_UNKNOWN) : new String("Non-PCM MS/ACM is unsupported. Setting mimeType to "));
                    list = null;
                    str = null;
                    str5 = MimeTypes.AUDIO_UNKNOWN;
                    i16 = -1;
                    list3 = list;
                    i15 = -1;
                    list2 = list3;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    boolean z16 = this.flagDefault;
                    if (this.flagForced) {
                        i17 = 2;
                    } else {
                        i17 = 0;
                    }
                    int i210 = i17 | (z16 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i25 = this.displayWidth;
                                iIntValue = -1;
                                if (i25 == -1) {
                                    i25 = this.width;
                                }
                                this.displayWidth = i25;
                                i26 = this.displayHeight;
                                if (i26 == -1) {
                                    i26 = this.height;
                                }
                                this.displayHeight = i26;
                            } else {
                                iIntValue = -1;
                            }
                            i19 = this.displayWidth;
                            if (i19 != iIntValue) {
                                f14 = -1.0f;
                            } else {
                                f14 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.projectionPosePitch, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.projectionPosePitch, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f14).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfo);
                            i18 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i18 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i15);
                        i18 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild3 = builder.setId(i14).setSampleMimeType(str3).setMaxInputSize(i16).setLanguage(this.language).setSelectionFlags(i210).setInitializationData(list2).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack3 = extractorOutput.track(this.number, i18);
                    this.output = trackOutputTrack3;
                    trackOutputTrack3.format(formatBuild3);
                    return;
                case 3:
                    this.trueHdSampleRechunker = new TrueHdSampleRechunker();
                    str5 = MimeTypes.AUDIO_TRUEHD;
                    list = null;
                    str = null;
                    i16 = -1;
                    list3 = list;
                    i15 = -1;
                    list2 = list3;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    boolean z17 = this.flagDefault;
                    if (this.flagForced) {
                        i17 = 2;
                    } else {
                        i17 = 0;
                    }
                    int i211 = i17 | (z17 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i25 = this.displayWidth;
                                iIntValue = -1;
                                if (i25 == -1) {
                                    i25 = this.width;
                                }
                                this.displayWidth = i25;
                                i26 = this.displayHeight;
                                if (i26 == -1) {
                                    i26 = this.height;
                                }
                                this.displayHeight = i26;
                            } else {
                                iIntValue = -1;
                            }
                            i19 = this.displayWidth;
                            if (i19 != iIntValue) {
                                f14 = -1.0f;
                            } else {
                                f14 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.projectionPosePitch, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.projectionPosePitch, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f14).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfo);
                            i18 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i18 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i15);
                        i18 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild4 = builder.setId(i14).setSampleMimeType(str3).setMaxInputSize(i16).setLanguage(this.language).setSelectionFlags(i211).setInitializationData(list2).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack4 = extractorOutput.track(this.number, i18);
                    this.output = trackOutputTrack4;
                    trackOutputTrack4.format(formatBuild4);
                    return;
                case 4:
                    List<byte[]> vorbisCodecPrivate = parseVorbisCodecPrivate(getCodecPrivate(this.codecId));
                    str5 = MimeTypes.AUDIO_VORBIS;
                    i16 = 8192;
                    str = null;
                    list3 = vorbisCodecPrivate;
                    i15 = -1;
                    list2 = list3;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    boolean z18 = this.flagDefault;
                    if (this.flagForced) {
                        i17 = 2;
                    } else {
                        i17 = 0;
                    }
                    int i212 = i17 | (z18 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i25 = this.displayWidth;
                                iIntValue = -1;
                                if (i25 == -1) {
                                    i25 = this.width;
                                }
                                this.displayWidth = i25;
                                i26 = this.displayHeight;
                                if (i26 == -1) {
                                    i26 = this.height;
                                }
                                this.displayHeight = i26;
                            } else {
                                iIntValue = -1;
                            }
                            i19 = this.displayWidth;
                            if (i19 != iIntValue) {
                                f14 = -1.0f;
                            } else {
                                f14 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.projectionPosePitch, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.projectionPosePitch, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f14).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfo);
                            i18 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i18 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i15);
                        i18 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild5 = builder.setId(i14).setSampleMimeType(str3).setMaxInputSize(i16).setLanguage(this.language).setSelectionFlags(i212).setInitializationData(list2).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack5 = extractorOutput.track(this.number, i18);
                    this.output = trackOutputTrack5;
                    trackOutputTrack5.format(formatBuild5);
                    return;
                case 5:
                    str5 = MimeTypes.AUDIO_MPEG_L2;
                    list3 = null;
                    str = null;
                    i16 = 4096;
                    i15 = -1;
                    list2 = list3;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    boolean z19 = this.flagDefault;
                    if (this.flagForced) {
                        i17 = 2;
                    } else {
                        i17 = 0;
                    }
                    int i213 = i17 | (z19 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i25 = this.displayWidth;
                                iIntValue = -1;
                                if (i25 == -1) {
                                    i25 = this.width;
                                }
                                this.displayWidth = i25;
                                i26 = this.displayHeight;
                                if (i26 == -1) {
                                    i26 = this.height;
                                }
                                this.displayHeight = i26;
                            } else {
                                iIntValue = -1;
                            }
                            i19 = this.displayWidth;
                            if (i19 != iIntValue) {
                                f14 = -1.0f;
                            } else {
                                f14 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.projectionPosePitch, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.projectionPosePitch, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f14).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfo);
                            i18 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i18 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i15);
                        i18 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild6 = builder.setId(i14).setSampleMimeType(str3).setMaxInputSize(i16).setLanguage(this.language).setSelectionFlags(i213).setInitializationData(list2).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack6 = extractorOutput.track(this.number, i18);
                    this.output = trackOutputTrack6;
                    trackOutputTrack6.format(formatBuild6);
                    return;
                case 6:
                    str5 = MimeTypes.AUDIO_MPEG;
                    list3 = null;
                    str = null;
                    i16 = 4096;
                    i15 = -1;
                    list2 = list3;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    boolean z110 = this.flagDefault;
                    if (this.flagForced) {
                        i17 = 2;
                    } else {
                        i17 = 0;
                    }
                    int i214 = i17 | (z110 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i25 = this.displayWidth;
                                iIntValue = -1;
                                if (i25 == -1) {
                                    i25 = this.width;
                                }
                                this.displayWidth = i25;
                                i26 = this.displayHeight;
                                if (i26 == -1) {
                                    i26 = this.height;
                                }
                                this.displayHeight = i26;
                            } else {
                                iIntValue = -1;
                            }
                            i19 = this.displayWidth;
                            if (i19 != iIntValue) {
                                f14 = -1.0f;
                            } else {
                                f14 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.projectionPosePitch, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.projectionPosePitch, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f14).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfo);
                            i18 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i18 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i15);
                        i18 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild7 = builder.setId(i14).setSampleMimeType(str3).setMaxInputSize(i16).setLanguage(this.language).setSelectionFlags(i214).setInitializationData(list2).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack7 = extractorOutput.track(this.number, i18);
                    this.output = trackOutputTrack7;
                    trackOutputTrack7.format(formatBuild7);
                    return;
                case 7:
                    Pair<String, List<byte[]>> fourCcPrivate = parseFourCcPrivate(new ParsableByteArray(getCodecPrivate(this.codecId)));
                    str5 = (String) fourCcPrivate.first;
                    list4 = (List) fourCcPrivate.second;
                    str = null;
                    list = list4;
                    i16 = -1;
                    list3 = list;
                    i15 = -1;
                    list2 = list3;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    boolean z111 = this.flagDefault;
                    if (this.flagForced) {
                        i17 = 2;
                    } else {
                        i17 = 0;
                    }
                    int i215 = i17 | (z111 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i25 = this.displayWidth;
                                iIntValue = -1;
                                if (i25 == -1) {
                                    i25 = this.width;
                                }
                                this.displayWidth = i25;
                                i26 = this.displayHeight;
                                if (i26 == -1) {
                                    i26 = this.height;
                                }
                                this.displayHeight = i26;
                            } else {
                                iIntValue = -1;
                            }
                            i19 = this.displayWidth;
                            if (i19 != iIntValue) {
                                f14 = -1.0f;
                            } else {
                                f14 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.projectionPosePitch, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.projectionPosePitch, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f14).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfo);
                            i18 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i18 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i15);
                        i18 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild8 = builder.setId(i14).setSampleMimeType(str3).setMaxInputSize(i16).setLanguage(this.language).setSelectionFlags(i215).setInitializationData(list2).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack8 = extractorOutput.track(this.number, i18);
                    this.output = trackOutputTrack8;
                    trackOutputTrack8.format(formatBuild8);
                    return;
                case 8:
                    byte[] bArr3 = new byte[4];
                    System.arraycopy(getCodecPrivate(this.codecId), 0, bArr3, 0, 4);
                    ImmutableList immutableListOf = ImmutableList.of(bArr3);
                    str = null;
                    str5 = MimeTypes.APPLICATION_DVBSUBS;
                    list = immutableListOf;
                    i16 = -1;
                    list3 = list;
                    i15 = -1;
                    list2 = list3;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    boolean z112 = this.flagDefault;
                    if (this.flagForced) {
                        i17 = 2;
                    } else {
                        i17 = 0;
                    }
                    int i216 = i17 | (z112 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i25 = this.displayWidth;
                                iIntValue = -1;
                                if (i25 == -1) {
                                    i25 = this.width;
                                }
                                this.displayWidth = i25;
                                i26 = this.displayHeight;
                                if (i26 == -1) {
                                    i26 = this.height;
                                }
                                this.displayHeight = i26;
                            } else {
                                iIntValue = -1;
                            }
                            i19 = this.displayWidth;
                            if (i19 != iIntValue) {
                                f14 = -1.0f;
                            } else {
                                f14 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.projectionPosePitch, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.projectionPosePitch, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f14).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfo);
                            i18 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i18 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i15);
                        i18 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild9 = builder.setId(i14).setSampleMimeType(str3).setMaxInputSize(i16).setLanguage(this.language).setSelectionFlags(i216).setInitializationData(list2).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack9 = extractorOutput.track(this.number, i18);
                    this.output = trackOutputTrack9;
                    trackOutputTrack9.format(formatBuild9);
                    return;
                case 10:
                    AvcConfig avcConfig = AvcConfig.parse(new ParsableByteArray(getCodecPrivate(this.codecId)));
                    list5 = avcConfig.initializationData;
                    this.nalUnitLengthFieldLength = avcConfig.nalUnitLengthFieldLength;
                    str2 = avcConfig.codecs;
                    str5 = MimeTypes.VIDEO_H264;
                    List<byte[]> list10 = list5;
                    str = str2;
                    list6 = list10;
                    i16 = -1;
                    list9 = list6;
                    i15 = -1;
                    list7 = list9;
                    list2 = list7;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    boolean z113 = this.flagDefault;
                    if (this.flagForced) {
                        i17 = 2;
                    } else {
                        i17 = 0;
                    }
                    int i217 = i17 | (z113 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i25 = this.displayWidth;
                                iIntValue = -1;
                                if (i25 == -1) {
                                    i25 = this.width;
                                }
                                this.displayWidth = i25;
                                i26 = this.displayHeight;
                                if (i26 == -1) {
                                    i26 = this.height;
                                }
                                this.displayHeight = i26;
                            } else {
                                iIntValue = -1;
                            }
                            i19 = this.displayWidth;
                            if (i19 != iIntValue) {
                                f14 = -1.0f;
                            } else {
                                f14 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.projectionPosePitch, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.projectionPosePitch, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f14).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfo);
                            i18 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i18 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i15);
                        i18 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild10 = builder.setId(i14).setSampleMimeType(str3).setMaxInputSize(i16).setLanguage(this.language).setSelectionFlags(i217).setInitializationData(list2).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack10 = extractorOutput.track(this.number, i18);
                    this.output = trackOutputTrack10;
                    trackOutputTrack10.format(formatBuild10);
                    return;
                case 11:
                    ImmutableList immutableListOf2 = ImmutableList.of(getCodecPrivate(this.codecId));
                    str = null;
                    str5 = MimeTypes.APPLICATION_VOBSUB;
                    list6 = immutableListOf2;
                    i16 = -1;
                    list9 = list6;
                    i15 = -1;
                    list7 = list9;
                    list2 = list7;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    boolean z114 = this.flagDefault;
                    if (this.flagForced) {
                        i17 = 2;
                    } else {
                        i17 = 0;
                    }
                    int i218 = i17 | (z114 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i25 = this.displayWidth;
                                iIntValue = -1;
                                if (i25 == -1) {
                                    i25 = this.width;
                                }
                                this.displayWidth = i25;
                                i26 = this.displayHeight;
                                if (i26 == -1) {
                                    i26 = this.height;
                                }
                                this.displayHeight = i26;
                            } else {
                                iIntValue = -1;
                            }
                            i19 = this.displayWidth;
                            if (i19 != iIntValue) {
                                f14 = -1.0f;
                            } else {
                                f14 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.projectionPosePitch, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.projectionPosePitch, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f14).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfo);
                            i18 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i18 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i15);
                        i18 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild11 = builder.setId(i14).setSampleMimeType(str3).setMaxInputSize(i16).setLanguage(this.language).setSelectionFlags(i218).setInitializationData(list2).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack11 = extractorOutput.track(this.number, i18);
                    this.output = trackOutputTrack11;
                    trackOutputTrack11.format(formatBuild11);
                    return;
                case 12:
                    str5 = MimeTypes.AUDIO_DTS_HD;
                    list6 = null;
                    str = null;
                    i16 = -1;
                    list9 = list6;
                    i15 = -1;
                    list7 = list9;
                    list2 = list7;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    boolean z115 = this.flagDefault;
                    if (this.flagForced) {
                        i17 = 2;
                    } else {
                        i17 = 0;
                    }
                    int i219 = i17 | (z115 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i25 = this.displayWidth;
                                iIntValue = -1;
                                if (i25 == -1) {
                                    i25 = this.width;
                                }
                                this.displayWidth = i25;
                                i26 = this.displayHeight;
                                if (i26 == -1) {
                                    i26 = this.height;
                                }
                                this.displayHeight = i26;
                            } else {
                                iIntValue = -1;
                            }
                            i19 = this.displayWidth;
                            if (i19 != iIntValue) {
                                f14 = -1.0f;
                            } else {
                                f14 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.projectionPosePitch, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.projectionPosePitch, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f14).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfo);
                            i18 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i18 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i15);
                        i18 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild12 = builder.setId(i14).setSampleMimeType(str3).setMaxInputSize(i16).setLanguage(this.language).setSelectionFlags(i219).setInitializationData(list2).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack12 = extractorOutput.track(this.number, i18);
                    this.output = trackOutputTrack12;
                    trackOutputTrack12.format(formatBuild12);
                    return;
                case 13:
                    List<byte[]> listSingletonList2 = Collections.singletonList(getCodecPrivate(this.codecId));
                    AacUtil.Config audioSpecificConfig = AacUtil.parseAudioSpecificConfig(this.codecPrivate);
                    this.sampleRate = audioSpecificConfig.sampleRateHz;
                    this.channelCount = audioSpecificConfig.channelCount;
                    str = audioSpecificConfig.codecs;
                    str5 = MimeTypes.AUDIO_AAC;
                    list6 = listSingletonList2;
                    i16 = -1;
                    list9 = list6;
                    i15 = -1;
                    list7 = list9;
                    list2 = list7;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    boolean z116 = this.flagDefault;
                    if (this.flagForced) {
                        i17 = 2;
                    } else {
                        i17 = 0;
                    }
                    int i2110 = i17 | (z116 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i25 = this.displayWidth;
                                iIntValue = -1;
                                if (i25 == -1) {
                                    i25 = this.width;
                                }
                                this.displayWidth = i25;
                                i26 = this.displayHeight;
                                if (i26 == -1) {
                                    i26 = this.height;
                                }
                                this.displayHeight = i26;
                            } else {
                                iIntValue = -1;
                            }
                            i19 = this.displayWidth;
                            if (i19 != iIntValue) {
                                f14 = -1.0f;
                            } else {
                                f14 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.projectionPosePitch, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.projectionPosePitch, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f14).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfo);
                            i18 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i18 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i15);
                        i18 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild13 = builder.setId(i14).setSampleMimeType(str3).setMaxInputSize(i16).setLanguage(this.language).setSelectionFlags(i2110).setInitializationData(list2).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack13 = extractorOutput.track(this.number, i18);
                    this.output = trackOutputTrack13;
                    trackOutputTrack13.format(formatBuild13);
                    return;
                case 14:
                    str5 = MimeTypes.AUDIO_AC3;
                    list6 = null;
                    str = null;
                    i16 = -1;
                    list9 = list6;
                    i15 = -1;
                    list7 = list9;
                    list2 = list7;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    boolean z117 = this.flagDefault;
                    if (this.flagForced) {
                        i17 = 2;
                    } else {
                        i17 = 0;
                    }
                    int i2111 = i17 | (z117 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i25 = this.displayWidth;
                                iIntValue = -1;
                                if (i25 == -1) {
                                    i25 = this.width;
                                }
                                this.displayWidth = i25;
                                i26 = this.displayHeight;
                                if (i26 == -1) {
                                    i26 = this.height;
                                }
                                this.displayHeight = i26;
                            } else {
                                iIntValue = -1;
                            }
                            i19 = this.displayWidth;
                            if (i19 != iIntValue) {
                                f14 = -1.0f;
                            } else {
                                f14 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.projectionPosePitch, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.projectionPosePitch, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f14).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfo);
                            i18 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i18 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i15);
                        i18 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild14 = builder.setId(i14).setSampleMimeType(str3).setMaxInputSize(i16).setLanguage(this.language).setSelectionFlags(i2111).setInitializationData(list2).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack14 = extractorOutput.track(this.number, i18);
                    this.output = trackOutputTrack14;
                    trackOutputTrack14.format(formatBuild14);
                    return;
                case 15:
                case 21:
                    str5 = MimeTypes.AUDIO_DTS;
                    list6 = null;
                    str = null;
                    i16 = -1;
                    list9 = list6;
                    i15 = -1;
                    list7 = list9;
                    list2 = list7;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    boolean z118 = this.flagDefault;
                    if (this.flagForced) {
                        i17 = 2;
                    } else {
                        i17 = 0;
                    }
                    int i2112 = i17 | (z118 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i25 = this.displayWidth;
                                iIntValue = -1;
                                if (i25 == -1) {
                                    i25 = this.width;
                                }
                                this.displayWidth = i25;
                                i26 = this.displayHeight;
                                if (i26 == -1) {
                                    i26 = this.height;
                                }
                                this.displayHeight = i26;
                            } else {
                                iIntValue = -1;
                            }
                            i19 = this.displayWidth;
                            if (i19 != iIntValue) {
                                f14 = -1.0f;
                            } else {
                                f14 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.projectionPosePitch, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.projectionPosePitch, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f14).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfo);
                            i18 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i18 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i15);
                        i18 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild15 = builder.setId(i14).setSampleMimeType(str3).setMaxInputSize(i16).setLanguage(this.language).setSelectionFlags(i2112).setInitializationData(list2).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack15 = extractorOutput.track(this.number, i18);
                    this.output = trackOutputTrack15;
                    trackOutputTrack15.format(formatBuild15);
                    return;
                case 16:
                    str5 = MimeTypes.VIDEO_AV1;
                    list6 = null;
                    str = null;
                    i16 = -1;
                    list9 = list6;
                    i15 = -1;
                    list7 = list9;
                    list2 = list7;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    boolean z119 = this.flagDefault;
                    if (this.flagForced) {
                        i17 = 2;
                    } else {
                        i17 = 0;
                    }
                    int i2113 = i17 | (z119 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i25 = this.displayWidth;
                                iIntValue = -1;
                                if (i25 == -1) {
                                    i25 = this.width;
                                }
                                this.displayWidth = i25;
                                i26 = this.displayHeight;
                                if (i26 == -1) {
                                    i26 = this.height;
                                }
                                this.displayHeight = i26;
                            } else {
                                iIntValue = -1;
                            }
                            i19 = this.displayWidth;
                            if (i19 != iIntValue) {
                                f14 = -1.0f;
                            } else {
                                f14 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.projectionPosePitch, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.projectionPosePitch, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f14).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfo);
                            i18 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i18 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i15);
                        i18 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild16 = builder.setId(i14).setSampleMimeType(str3).setMaxInputSize(i16).setLanguage(this.language).setSelectionFlags(i2113).setInitializationData(list2).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack16 = extractorOutput.track(this.number, i18);
                    this.output = trackOutputTrack16;
                    trackOutputTrack16.format(formatBuild16);
                    return;
                case 17:
                    str5 = MimeTypes.VIDEO_VP8;
                    list6 = null;
                    str = null;
                    i16 = -1;
                    list9 = list6;
                    i15 = -1;
                    list7 = list9;
                    list2 = list7;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    boolean z1110 = this.flagDefault;
                    if (this.flagForced) {
                        i17 = 2;
                    } else {
                        i17 = 0;
                    }
                    int i2114 = i17 | (z1110 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i25 = this.displayWidth;
                                iIntValue = -1;
                                if (i25 == -1) {
                                    i25 = this.width;
                                }
                                this.displayWidth = i25;
                                i26 = this.displayHeight;
                                if (i26 == -1) {
                                    i26 = this.height;
                                }
                                this.displayHeight = i26;
                            } else {
                                iIntValue = -1;
                            }
                            i19 = this.displayWidth;
                            if (i19 != iIntValue) {
                                f14 = -1.0f;
                            } else {
                                f14 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.projectionPosePitch, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.projectionPosePitch, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f14).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfo);
                            i18 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i18 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i15);
                        i18 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild17 = builder.setId(i14).setSampleMimeType(str3).setMaxInputSize(i16).setLanguage(this.language).setSelectionFlags(i2114).setInitializationData(list2).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack17 = extractorOutput.track(this.number, i18);
                    this.output = trackOutputTrack17;
                    trackOutputTrack17.format(formatBuild17);
                    return;
                case 18:
                    str5 = MimeTypes.VIDEO_VP9;
                    list6 = null;
                    str = null;
                    i16 = -1;
                    list9 = list6;
                    i15 = -1;
                    list7 = list9;
                    list2 = list7;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    boolean z1111 = this.flagDefault;
                    if (this.flagForced) {
                        i17 = 2;
                    } else {
                        i17 = 0;
                    }
                    int i2115 = i17 | (z1111 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i25 = this.displayWidth;
                                iIntValue = -1;
                                if (i25 == -1) {
                                    i25 = this.width;
                                }
                                this.displayWidth = i25;
                                i26 = this.displayHeight;
                                if (i26 == -1) {
                                    i26 = this.height;
                                }
                                this.displayHeight = i26;
                            } else {
                                iIntValue = -1;
                            }
                            i19 = this.displayWidth;
                            if (i19 != iIntValue) {
                                f14 = -1.0f;
                            } else {
                                f14 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.projectionPosePitch, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.projectionPosePitch, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f14).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfo);
                            i18 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i18 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i15);
                        i18 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild18 = builder.setId(i14).setSampleMimeType(str3).setMaxInputSize(i16).setLanguage(this.language).setSelectionFlags(i2115).setInitializationData(list2).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack18 = extractorOutput.track(this.number, i18);
                    this.output = trackOutputTrack18;
                    trackOutputTrack18.format(formatBuild18);
                    return;
                case 19:
                    list6 = null;
                    str = null;
                    str5 = MimeTypes.APPLICATION_PGS;
                    i16 = -1;
                    list9 = list6;
                    i15 = -1;
                    list7 = list9;
                    list2 = list7;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    boolean z1112 = this.flagDefault;
                    if (this.flagForced) {
                        i17 = 2;
                    } else {
                        i17 = 0;
                    }
                    int i2116 = i17 | (z1112 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i25 = this.displayWidth;
                                iIntValue = -1;
                                if (i25 == -1) {
                                    i25 = this.width;
                                }
                                this.displayWidth = i25;
                                i26 = this.displayHeight;
                                if (i26 == -1) {
                                    i26 = this.height;
                                }
                                this.displayHeight = i26;
                            } else {
                                iIntValue = -1;
                            }
                            i19 = this.displayWidth;
                            if (i19 != iIntValue) {
                                f14 = -1.0f;
                            } else {
                                f14 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.projectionPosePitch, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.projectionPosePitch, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f14).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfo);
                            i18 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i18 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i15);
                        i18 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild19 = builder.setId(i14).setSampleMimeType(str3).setMaxInputSize(i16).setLanguage(this.language).setSelectionFlags(i2116).setInitializationData(list2).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack19 = extractorOutput.track(this.number, i18);
                    this.output = trackOutputTrack19;
                    trackOutputTrack19.format(formatBuild19);
                    return;
                case 20:
                    str5 = MimeTypes.VIDEO_UNKNOWN;
                    list6 = null;
                    str = null;
                    i16 = -1;
                    list9 = list6;
                    i15 = -1;
                    list7 = list9;
                    list2 = list7;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    boolean z1113 = this.flagDefault;
                    if (this.flagForced) {
                        i17 = 2;
                    } else {
                        i17 = 0;
                    }
                    int i2117 = i17 | (z1113 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i25 = this.displayWidth;
                                iIntValue = -1;
                                if (i25 == -1) {
                                    i25 = this.width;
                                }
                                this.displayWidth = i25;
                                i26 = this.displayHeight;
                                if (i26 == -1) {
                                    i26 = this.height;
                                }
                                this.displayHeight = i26;
                            } else {
                                iIntValue = -1;
                            }
                            i19 = this.displayWidth;
                            if (i19 != iIntValue) {
                                f14 = -1.0f;
                            } else {
                                f14 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.projectionPosePitch, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.projectionPosePitch, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f14).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfo);
                            i18 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i18 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i15);
                        i18 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild110 = builder.setId(i14).setSampleMimeType(str3).setMaxInputSize(i16).setLanguage(this.language).setSelectionFlags(i2117).setInitializationData(list2).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack110 = extractorOutput.track(this.number, i18);
                    this.output = trackOutputTrack110;
                    trackOutputTrack110.format(formatBuild110);
                    return;
                case 22:
                    int i30 = this.audioBitDepth;
                    if (i30 == 32) {
                        list7 = null;
                        str = null;
                        i16 = -1;
                        i15 = 4;
                    } else {
                        StringBuilder sb4 = new StringBuilder(MimeTypes.AUDIO_UNKNOWN.length() + 75);
                        sb4.append("Unsupported floating point PCM bit depth: ");
                        sb4.append(i30);
                        sb4.append(". Setting mimeType to audio/x-unknown");
                        Log.w(MatroskaExtractor.TAG, sb4.toString());
                        list6 = null;
                        str = null;
                        str5 = MimeTypes.AUDIO_UNKNOWN;
                        i16 = -1;
                        list9 = list6;
                        i15 = -1;
                        list7 = list9;
                    }
                    list2 = list7;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    boolean z1114 = this.flagDefault;
                    if (this.flagForced) {
                        i17 = 2;
                    } else {
                        i17 = 0;
                    }
                    int i2118 = i17 | (z1114 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i25 = this.displayWidth;
                                iIntValue = -1;
                                if (i25 == -1) {
                                    i25 = this.width;
                                }
                                this.displayWidth = i25;
                                i26 = this.displayHeight;
                                if (i26 == -1) {
                                    i26 = this.height;
                                }
                                this.displayHeight = i26;
                            } else {
                                iIntValue = -1;
                            }
                            i19 = this.displayWidth;
                            if (i19 != iIntValue) {
                                f14 = -1.0f;
                            } else {
                                f14 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.projectionPosePitch, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.projectionPosePitch, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f14).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfo);
                            i18 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i18 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i15);
                        i18 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild111 = builder.setId(i14).setSampleMimeType(str3).setMaxInputSize(i16).setLanguage(this.language).setSelectionFlags(i2118).setInitializationData(list2).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack111 = extractorOutput.track(this.number, i18);
                    this.output = trackOutputTrack111;
                    trackOutputTrack111.format(formatBuild111);
                    return;
                case 23:
                    int i34 = this.audioBitDepth;
                    if (i34 == 8) {
                        list8 = null;
                        str = null;
                        i15 = 3;
                    } else {
                        if (i34 != 16) {
                            StringBuilder sb5 = new StringBuilder(MimeTypes.AUDIO_UNKNOWN.length() + 71);
                            sb5.append("Unsupported big endian PCM bit depth: ");
                            sb5.append(i34);
                            sb5.append(". Setting mimeType to audio/x-unknown");
                            Log.w(MatroskaExtractor.TAG, sb5.toString());
                            list6 = null;
                            str = null;
                            str5 = MimeTypes.AUDIO_UNKNOWN;
                            i16 = -1;
                            list9 = list6;
                            i15 = -1;
                            list7 = list9;
                            list2 = list7;
                            bArr = this.dolbyVisionConfigBytes;
                            if (bArr != null) {
                                str = dolbyVisionConfig.codecs;
                                str5 = MimeTypes.VIDEO_DOLBY_VISION;
                            }
                            str3 = str5;
                            boolean z1115 = this.flagDefault;
                            if (this.flagForced) {
                                i17 = 2;
                            } else {
                                i17 = 0;
                            }
                            int i2119 = i17 | (z1115 ? 1 : 0);
                            builder = new Format.Builder();
                            if (MimeTypes.isAudio(str3)) {
                                if (MimeTypes.isVideo(str3)) {
                                    if (this.displayUnit == 0) {
                                        i25 = this.displayWidth;
                                        iIntValue = -1;
                                        if (i25 == -1) {
                                            i25 = this.width;
                                        }
                                        this.displayWidth = i25;
                                        i26 = this.displayHeight;
                                        if (i26 == -1) {
                                            i26 = this.height;
                                        }
                                        this.displayHeight = i26;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    i19 = this.displayWidth;
                                    if (i19 != iIntValue) {
                                        f14 = -1.0f;
                                    } else {
                                        f14 = -1.0f;
                                    }
                                    if (this.hasColorInfo) {
                                    }
                                    if (this.name != null) {
                                        iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                                    }
                                    if (this.projectionType == 0) {
                                        if (Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                            iIntValue = 0;
                                        } else if (Float.compare(this.projectionPosePitch, 90.0f) == 0) {
                                            iIntValue = 90;
                                        } else if (Float.compare(this.projectionPosePitch, -180.0f) != 0) {
                                            iIntValue = 180;
                                        } else {
                                            iIntValue = 180;
                                        }
                                    }
                                    builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f14).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfo);
                                    i18 = 2;
                                } else {
                                    if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                                    }
                                    i18 = 3;
                                }
                                break;
                            } else {
                                builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i15);
                                i18 = 1;
                            }
                            if (this.name != null) {
                                builder.setLabel(this.name);
                            }
                            Format formatBuild112 = builder.setId(i14).setSampleMimeType(str3).setMaxInputSize(i16).setLanguage(this.language).setSelectionFlags(i2119).setInitializationData(list2).setCodecs(str).setDrmInitData(this.drmInitData).build();
                            TrackOutput trackOutputTrack112 = extractorOutput.track(this.number, i18);
                            this.output = trackOutputTrack112;
                            trackOutputTrack112.format(formatBuild112);
                            return;
                        }
                        pcmEncoding = 268435456;
                        i15 = pcmEncoding;
                        list8 = null;
                        str = null;
                    }
                    i16 = -1;
                    list7 = list8;
                    list2 = list7;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    boolean z1116 = this.flagDefault;
                    if (this.flagForced) {
                        i17 = 2;
                    } else {
                        i17 = 0;
                    }
                    int i21110 = i17 | (z1116 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i25 = this.displayWidth;
                                iIntValue = -1;
                                if (i25 == -1) {
                                    i25 = this.width;
                                }
                                this.displayWidth = i25;
                                i26 = this.displayHeight;
                                if (i26 == -1) {
                                    i26 = this.height;
                                }
                                this.displayHeight = i26;
                            } else {
                                iIntValue = -1;
                            }
                            i19 = this.displayWidth;
                            if (i19 != iIntValue) {
                                f14 = -1.0f;
                            } else {
                                f14 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.projectionPosePitch, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.projectionPosePitch, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f14).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfo);
                            i18 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i18 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i15);
                        i18 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild113 = builder.setId(i14).setSampleMimeType(str3).setMaxInputSize(i16).setLanguage(this.language).setSelectionFlags(i21110).setInitializationData(list2).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack113 = extractorOutput.track(this.number, i18);
                    this.output = trackOutputTrack113;
                    trackOutputTrack113.format(formatBuild113);
                    return;
                case 24:
                    pcmEncoding = Util.getPcmEncoding(this.audioBitDepth);
                    if (pcmEncoding == 0) {
                        int i35 = this.audioBitDepth;
                        StringBuilder sb6 = new StringBuilder(MimeTypes.AUDIO_UNKNOWN.length() + 74);
                        sb6.append("Unsupported little endian PCM bit depth: ");
                        sb6.append(i35);
                        sb6.append(". Setting mimeType to audio/x-unknown");
                        Log.w(MatroskaExtractor.TAG, sb6.toString());
                        list6 = null;
                        str = null;
                        str5 = MimeTypes.AUDIO_UNKNOWN;
                        i16 = -1;
                        list9 = list6;
                        i15 = -1;
                        list7 = list9;
                        list2 = list7;
                        bArr = this.dolbyVisionConfigBytes;
                        if (bArr != null) {
                            str = dolbyVisionConfig.codecs;
                            str5 = MimeTypes.VIDEO_DOLBY_VISION;
                        }
                        str3 = str5;
                        boolean z1117 = this.flagDefault;
                        if (this.flagForced) {
                            i17 = 2;
                        } else {
                            i17 = 0;
                        }
                        int i21111 = i17 | (z1117 ? 1 : 0);
                        builder = new Format.Builder();
                        if (MimeTypes.isAudio(str3)) {
                            if (MimeTypes.isVideo(str3)) {
                                if (this.displayUnit == 0) {
                                    i25 = this.displayWidth;
                                    iIntValue = -1;
                                    if (i25 == -1) {
                                        i25 = this.width;
                                    }
                                    this.displayWidth = i25;
                                    i26 = this.displayHeight;
                                    if (i26 == -1) {
                                        i26 = this.height;
                                    }
                                    this.displayHeight = i26;
                                } else {
                                    iIntValue = -1;
                                }
                                i19 = this.displayWidth;
                                if (i19 != iIntValue) {
                                    f14 = -1.0f;
                                } else {
                                    f14 = -1.0f;
                                }
                                if (this.hasColorInfo) {
                                }
                                if (this.name != null) {
                                    iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                                }
                                if (this.projectionType == 0) {
                                    if (Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(this.projectionPosePitch, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(this.projectionPosePitch, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f14).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfo);
                                i18 = 2;
                            } else {
                                if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                                }
                                i18 = 3;
                            }
                            break;
                        } else {
                            builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i15);
                            i18 = 1;
                        }
                        if (this.name != null) {
                            builder.setLabel(this.name);
                        }
                        Format formatBuild114 = builder.setId(i14).setSampleMimeType(str3).setMaxInputSize(i16).setLanguage(this.language).setSelectionFlags(i21111).setInitializationData(list2).setCodecs(str).setDrmInitData(this.drmInitData).build();
                        TrackOutput trackOutputTrack114 = extractorOutput.track(this.number, i18);
                        this.output = trackOutputTrack114;
                        trackOutputTrack114.format(formatBuild114);
                        return;
                    }
                    i15 = pcmEncoding;
                    list8 = null;
                    str = null;
                    i16 = -1;
                    list7 = list8;
                    list2 = list7;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    boolean z1118 = this.flagDefault;
                    if (this.flagForced) {
                        i17 = 2;
                    } else {
                        i17 = 0;
                    }
                    int i21112 = i17 | (z1118 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i25 = this.displayWidth;
                                iIntValue = -1;
                                if (i25 == -1) {
                                    i25 = this.width;
                                }
                                this.displayWidth = i25;
                                i26 = this.displayHeight;
                                if (i26 == -1) {
                                    i26 = this.height;
                                }
                                this.displayHeight = i26;
                            } else {
                                iIntValue = -1;
                            }
                            i19 = this.displayWidth;
                            if (i19 != iIntValue) {
                                f14 = -1.0f;
                            } else {
                                f14 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.projectionPosePitch, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.projectionPosePitch, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f14).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfo);
                            i18 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i18 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i15);
                        i18 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild115 = builder.setId(i14).setSampleMimeType(str3).setMaxInputSize(i16).setLanguage(this.language).setSelectionFlags(i21112).setInitializationData(list2).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack115 = extractorOutput.track(this.number, i18);
                    this.output = trackOutputTrack115;
                    trackOutputTrack115.format(formatBuild115);
                    return;
                case 25:
                    ImmutableList immutableListOf3 = ImmutableList.of(MatroskaExtractor.SSA_DIALOGUE_FORMAT, getCodecPrivate(this.codecId));
                    str = null;
                    str5 = MimeTypes.TEXT_SSA;
                    list6 = immutableListOf3;
                    i16 = -1;
                    list9 = list6;
                    i15 = -1;
                    list7 = list9;
                    list2 = list7;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    boolean z1119 = this.flagDefault;
                    if (this.flagForced) {
                        i17 = 2;
                    } else {
                        i17 = 0;
                    }
                    int i21113 = i17 | (z1119 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i25 = this.displayWidth;
                                iIntValue = -1;
                                if (i25 == -1) {
                                    i25 = this.width;
                                }
                                this.displayWidth = i25;
                                i26 = this.displayHeight;
                                if (i26 == -1) {
                                    i26 = this.height;
                                }
                                this.displayHeight = i26;
                            } else {
                                iIntValue = -1;
                            }
                            i19 = this.displayWidth;
                            if (i19 != iIntValue) {
                                f14 = -1.0f;
                            } else {
                                f14 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.projectionPosePitch, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.projectionPosePitch, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f14).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfo);
                            i18 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i18 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i15);
                        i18 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild116 = builder.setId(i14).setSampleMimeType(str3).setMaxInputSize(i16).setLanguage(this.language).setSelectionFlags(i21113).setInitializationData(list2).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack116 = extractorOutput.track(this.number, i18);
                    this.output = trackOutputTrack116;
                    trackOutputTrack116.format(formatBuild116);
                    return;
                case 26:
                    HevcConfig hevcConfig = HevcConfig.parse(new ParsableByteArray(getCodecPrivate(this.codecId)));
                    list5 = hevcConfig.initializationData;
                    this.nalUnitLengthFieldLength = hevcConfig.nalUnitLengthFieldLength;
                    str2 = hevcConfig.codecs;
                    str5 = MimeTypes.VIDEO_H265;
                    List<byte[]> list11 = list5;
                    str = str2;
                    list6 = list11;
                    i16 = -1;
                    list9 = list6;
                    i15 = -1;
                    list7 = list9;
                    list2 = list7;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    boolean z11110 = this.flagDefault;
                    if (this.flagForced) {
                        i17 = 2;
                    } else {
                        i17 = 0;
                    }
                    int i21114 = i17 | (z11110 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i25 = this.displayWidth;
                                iIntValue = -1;
                                if (i25 == -1) {
                                    i25 = this.width;
                                }
                                this.displayWidth = i25;
                                i26 = this.displayHeight;
                                if (i26 == -1) {
                                    i26 = this.height;
                                }
                                this.displayHeight = i26;
                            } else {
                                iIntValue = -1;
                            }
                            i19 = this.displayWidth;
                            if (i19 != iIntValue) {
                                f14 = -1.0f;
                            } else {
                                f14 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.projectionPosePitch, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.projectionPosePitch, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f14).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfo);
                            i18 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i18 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i15);
                        i18 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild117 = builder.setId(i14).setSampleMimeType(str3).setMaxInputSize(i16).setLanguage(this.language).setSelectionFlags(i21114).setInitializationData(list2).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack117 = extractorOutput.track(this.number, i18);
                    this.output = trackOutputTrack117;
                    trackOutputTrack117.format(formatBuild117);
                    return;
                case 27:
                    str5 = MimeTypes.TEXT_VTT;
                    list6 = null;
                    str = null;
                    i16 = -1;
                    list9 = list6;
                    i15 = -1;
                    list7 = list9;
                    list2 = list7;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    boolean z11111 = this.flagDefault;
                    if (this.flagForced) {
                        i17 = 2;
                    } else {
                        i17 = 0;
                    }
                    int i21115 = i17 | (z11111 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i25 = this.displayWidth;
                                iIntValue = -1;
                                if (i25 == -1) {
                                    i25 = this.width;
                                }
                                this.displayWidth = i25;
                                i26 = this.displayHeight;
                                if (i26 == -1) {
                                    i26 = this.height;
                                }
                                this.displayHeight = i26;
                            } else {
                                iIntValue = -1;
                            }
                            i19 = this.displayWidth;
                            if (i19 != iIntValue) {
                                f14 = -1.0f;
                            } else {
                                f14 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.projectionPosePitch, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.projectionPosePitch, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f14).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfo);
                            i18 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i18 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i15);
                        i18 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild118 = builder.setId(i14).setSampleMimeType(str3).setMaxInputSize(i16).setLanguage(this.language).setSelectionFlags(i21115).setInitializationData(list2).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack118 = extractorOutput.track(this.number, i18);
                    this.output = trackOutputTrack118;
                    trackOutputTrack118.format(formatBuild118);
                    return;
                case 28:
                    str5 = MimeTypes.APPLICATION_SUBRIP;
                    list6 = null;
                    str = null;
                    i16 = -1;
                    list9 = list6;
                    i15 = -1;
                    list7 = list9;
                    list2 = list7;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    boolean z11112 = this.flagDefault;
                    if (this.flagForced) {
                        i17 = 2;
                    } else {
                        i17 = 0;
                    }
                    int i21116 = i17 | (z11112 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i25 = this.displayWidth;
                                iIntValue = -1;
                                if (i25 == -1) {
                                    i25 = this.width;
                                }
                                this.displayWidth = i25;
                                i26 = this.displayHeight;
                                if (i26 == -1) {
                                    i26 = this.height;
                                }
                                this.displayHeight = i26;
                            } else {
                                iIntValue = -1;
                            }
                            i19 = this.displayWidth;
                            if (i19 != iIntValue) {
                                f14 = -1.0f;
                            } else {
                                f14 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.projectionPosePitch, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.projectionPosePitch, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f14).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfo);
                            i18 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i18 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i15);
                        i18 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild119 = builder.setId(i14).setSampleMimeType(str3).setMaxInputSize(i16).setLanguage(this.language).setSelectionFlags(i21116).setInitializationData(list2).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack119 = extractorOutput.track(this.number, i18);
                    this.output = trackOutputTrack119;
                    trackOutputTrack119.format(formatBuild119);
                    return;
                case 29:
                    str5 = MimeTypes.VIDEO_MPEG2;
                    list6 = null;
                    str = null;
                    i16 = -1;
                    list9 = list6;
                    i15 = -1;
                    list7 = list9;
                    list2 = list7;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    boolean z11113 = this.flagDefault;
                    if (this.flagForced) {
                        i17 = 2;
                    } else {
                        i17 = 0;
                    }
                    int i21117 = i17 | (z11113 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i25 = this.displayWidth;
                                iIntValue = -1;
                                if (i25 == -1) {
                                    i25 = this.width;
                                }
                                this.displayWidth = i25;
                                i26 = this.displayHeight;
                                if (i26 == -1) {
                                    i26 = this.height;
                                }
                                this.displayHeight = i26;
                            } else {
                                iIntValue = -1;
                            }
                            i19 = this.displayWidth;
                            if (i19 != iIntValue) {
                                f14 = -1.0f;
                            } else {
                                f14 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.projectionPosePitch, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.projectionPosePitch, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f14).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfo);
                            i18 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i18 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i15);
                        i18 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild1110 = builder.setId(i14).setSampleMimeType(str3).setMaxInputSize(i16).setLanguage(this.language).setSelectionFlags(i21117).setInitializationData(list2).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack1110 = extractorOutput.track(this.number, i18);
                    this.output = trackOutputTrack1110;
                    trackOutputTrack1110.format(formatBuild1110);
                    return;
                case 30:
                    str5 = MimeTypes.AUDIO_E_AC3;
                    list6 = null;
                    str = null;
                    i16 = -1;
                    list9 = list6;
                    i15 = -1;
                    list7 = list9;
                    list2 = list7;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    boolean z11114 = this.flagDefault;
                    if (this.flagForced) {
                        i17 = 2;
                    } else {
                        i17 = 0;
                    }
                    int i21118 = i17 | (z11114 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i25 = this.displayWidth;
                                iIntValue = -1;
                                if (i25 == -1) {
                                    i25 = this.width;
                                }
                                this.displayWidth = i25;
                                i26 = this.displayHeight;
                                if (i26 == -1) {
                                    i26 = this.height;
                                }
                                this.displayHeight = i26;
                            } else {
                                iIntValue = -1;
                            }
                            i19 = this.displayWidth;
                            if (i19 != iIntValue) {
                                f14 = -1.0f;
                            } else {
                                f14 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.projectionPosePitch, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.projectionPosePitch, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f14).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfo);
                            i18 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i18 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i15);
                        i18 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild1111 = builder.setId(i14).setSampleMimeType(str3).setMaxInputSize(i16).setLanguage(this.language).setSelectionFlags(i21118).setInitializationData(list2).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack1111 = extractorOutput.track(this.number, i18);
                    this.output = trackOutputTrack1111;
                    trackOutputTrack1111.format(formatBuild1111);
                    return;
                case 31:
                    List<byte[]> listSingletonList3 = Collections.singletonList(getCodecPrivate(this.codecId));
                    str5 = MimeTypes.AUDIO_FLAC;
                    str = null;
                    list6 = listSingletonList3;
                    i16 = -1;
                    list9 = list6;
                    i15 = -1;
                    list7 = list9;
                    list2 = list7;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    boolean z11115 = this.flagDefault;
                    if (this.flagForced) {
                        i17 = 2;
                    } else {
                        i17 = 0;
                    }
                    int i21119 = i17 | (z11115 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i25 = this.displayWidth;
                                iIntValue = -1;
                                if (i25 == -1) {
                                    i25 = this.width;
                                }
                                this.displayWidth = i25;
                                i26 = this.displayHeight;
                                if (i26 == -1) {
                                    i26 = this.height;
                                }
                                this.displayHeight = i26;
                            } else {
                                iIntValue = -1;
                            }
                            i19 = this.displayWidth;
                            if (i19 != iIntValue) {
                                f14 = -1.0f;
                            } else {
                                f14 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.projectionPosePitch, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.projectionPosePitch, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f14).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfo);
                            i18 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i18 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i15);
                        i18 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild1112 = builder.setId(i14).setSampleMimeType(str3).setMaxInputSize(i16).setLanguage(this.language).setSelectionFlags(i21119).setInitializationData(list2).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack1112 = extractorOutput.track(this.number, i18);
                    this.output = trackOutputTrack1112;
                    trackOutputTrack1112.format(formatBuild1112);
                    return;
                case 32:
                    ArrayList arrayList = new ArrayList(3);
                    arrayList.add(getCodecPrivate(this.codecId));
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    arrayList.add(byteBufferAllocate.order(byteOrder).putLong(this.codecDelayNs).array());
                    arrayList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.seekPreRollNs).array());
                    str5 = MimeTypes.AUDIO_OPUS;
                    i16 = MatroskaExtractor.OPUS_MAX_INPUT_SIZE;
                    str = null;
                    list9 = arrayList;
                    i15 = -1;
                    list7 = list9;
                    list2 = list7;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    str3 = str5;
                    boolean z11116 = this.flagDefault;
                    if (this.flagForced) {
                        i17 = 2;
                    } else {
                        i17 = 0;
                    }
                    int i211110 = i17 | (z11116 ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        if (MimeTypes.isVideo(str3)) {
                            if (this.displayUnit == 0) {
                                i25 = this.displayWidth;
                                iIntValue = -1;
                                if (i25 == -1) {
                                    i25 = this.width;
                                }
                                this.displayWidth = i25;
                                i26 = this.displayHeight;
                                if (i26 == -1) {
                                    i26 = this.height;
                                }
                                this.displayHeight = i26;
                            } else {
                                iIntValue = -1;
                            }
                            i19 = this.displayWidth;
                            if (i19 != iIntValue) {
                                f14 = -1.0f;
                            } else {
                                f14 = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name != null) {
                                iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                            }
                            if (this.projectionType == 0) {
                                if (Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.projectionPosePitch, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.projectionPosePitch, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f14).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfo);
                            i18 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i18 = 3;
                        }
                        break;
                    } else {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i15);
                        i18 = 1;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild1113 = builder.setId(i14).setSampleMimeType(str3).setMaxInputSize(i16).setLanguage(this.language).setSelectionFlags(i211110).setInitializationData(list2).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack1113 = extractorOutput.track(this.number, i18);
                    this.output = trackOutputTrack1113;
                    trackOutputTrack1113.format(formatBuild1113);
                    return;
                default:
                    throw ParserException.createForMalformedContainer("Unrecognized codec identifier.", null);
            }
        }

        public void outputPendingSampleMetadata() {
            TrueHdSampleRechunker trueHdSampleRechunker = this.trueHdSampleRechunker;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.outputPendingSampleMetadata(this.output, this.cryptoData);
            }
        }

        public void reset() {
            TrueHdSampleRechunker trueHdSampleRechunker = this.trueHdSampleRechunker;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.reset();
            }
        }
    }

    static {
        HashMap map = new HashMap();
        f.r(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        f.r(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        TRACK_NAME_TO_ROTATION_DEGREES = Collections.unmodifiableMap(map);
    }

    public MatroskaExtractor(EbmlReader ebmlReader, int i14) {
        this.segmentContentPosition = -1L;
        this.timecodeScale = C.TIME_UNSET;
        this.durationTimecode = C.TIME_UNSET;
        this.durationUs = C.TIME_UNSET;
        this.cuesContentPosition = -1L;
        this.seekPositionAfterBuildingCues = -1L;
        this.clusterTimecodeUs = C.TIME_UNSET;
        this.reader = ebmlReader;
        ebmlReader.init(new InnerEbmlProcessor());
        this.seekForCuesEnabled = (i14 & 1) == 0;
        this.varintReader = new VarintReader();
        this.tracks = new SparseArray<>();
        this.scratch = new ParsableByteArray(4);
        this.vorbisNumPageSamples = new ParsableByteArray(ByteBuffer.allocate(4).putInt(-1).array());
        this.seekEntryIdBytes = new ParsableByteArray(4);
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalLength = new ParsableByteArray(4);
        this.sampleStrippedBytes = new ParsableByteArray();
        this.subtitleSample = new ParsableByteArray();
        this.encryptionInitializationVector = new ParsableByteArray(8);
        this.encryptionSubsampleData = new ParsableByteArray();
        this.blockAdditionalData = new ParsableByteArray();
        this.blockSampleSizes = new int[1];
    }

    private void assertInCues(int i14) throws ParserException {
        if (this.cueTimesUs == null || this.cueClusterPositions == null) {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("Element ");
            sb3.append(i14);
            sb3.append(" must be in a Cues");
            throw ParserException.createForMalformedContainer(sb3.toString(), null);
        }
    }

    private void assertInTrackEntry(int i14) throws ParserException {
        if (this.currentTrack != null) {
            return;
        }
        StringBuilder sb3 = new StringBuilder(43);
        sb3.append("Element ");
        sb3.append(i14);
        sb3.append(" must be in a TrackEntry");
        throw ParserException.createForMalformedContainer(sb3.toString(), null);
    }

    private void assertInitialized() {
        Assertions.checkStateNotNull(this.extractorOutput);
    }

    private SeekMap buildSeekMap(LongArray longArray, LongArray longArray2) {
        int i14;
        if (this.segmentContentPosition == -1 || this.durationUs == C.TIME_UNSET || longArray == null || longArray.size() == 0 || longArray2 == null || longArray2.size() != longArray.size()) {
            return new SeekMap.Unseekable(this.durationUs);
        }
        int size = longArray.size();
        int[] iArrCopyOf = new int[size];
        long[] jArrCopyOf = new long[size];
        long[] jArrCopyOf2 = new long[size];
        long[] jArrCopyOf3 = new long[size];
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            jArrCopyOf3[i16] = longArray.get(i16);
            jArrCopyOf[i16] = longArray2.get(i16) + this.segmentContentPosition;
        }
        while (true) {
            i14 = size - 1;
            if (i15 >= i14) {
                break;
            }
            int i17 = i15 + 1;
            iArrCopyOf[i15] = (int) (jArrCopyOf[i17] - jArrCopyOf[i15]);
            jArrCopyOf2[i15] = jArrCopyOf3[i17] - jArrCopyOf3[i15];
            i15 = i17;
        }
        iArrCopyOf[i14] = (int) ((this.segmentContentPosition + this.segmentContentSize) - jArrCopyOf[i14]);
        long j8 = this.durationUs - jArrCopyOf3[i14];
        jArrCopyOf2[i14] = j8;
        if (j8 <= 0) {
            StringBuilder sb3 = new StringBuilder(72);
            sb3.append("Discarding last cue point with unexpected duration: ");
            sb3.append(j8);
            Log.w(TAG, sb3.toString());
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i14);
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i14);
            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i14);
            jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i14);
        }
        return new ChunkIndex(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
    }

    private void commitSampleToOutput(Track track, long j8, int i14, int i15, int i16) {
        int iLimit;
        int i17;
        int i18;
        TrueHdSampleRechunker trueHdSampleRechunker = track.trueHdSampleRechunker;
        if (trueHdSampleRechunker != null) {
            trueHdSampleRechunker.sampleMetadata(track.output, j8, i14, i15, i16, track.cryptoData);
        } else {
            if (CODEC_ID_SUBRIP.equals(track.codecId) || CODEC_ID_ASS.equals(track.codecId) || CODEC_ID_VTT.equals(track.codecId)) {
                if (this.blockSampleCount > 1) {
                    Log.w(TAG, "Skipping subtitle sample in laced block.");
                } else {
                    long j14 = this.blockDurationUs;
                    if (j14 == C.TIME_UNSET) {
                        Log.w(TAG, "Skipping subtitle sample with no duration.");
                    } else {
                        setSubtitleEndTime(track.codecId, j14, this.subtitleSample.getData());
                        for (int position = this.subtitleSample.getPosition(); position < this.subtitleSample.limit(); position++) {
                            if (this.subtitleSample.getData()[position] == 0) {
                                this.subtitleSample.setLimit(position);
                                break;
                            }
                        }
                        TrackOutput trackOutput = track.output;
                        ParsableByteArray parsableByteArray = this.subtitleSample;
                        trackOutput.sampleData(parsableByteArray, parsableByteArray.limit());
                        iLimit = this.subtitleSample.limit() + i15;
                    }
                }
                iLimit = i15;
            } else {
                iLimit = i15;
            }
            if ((i14 & 268435456) == 0) {
                i17 = i14;
                i18 = iLimit;
            } else if (this.blockSampleCount > 1) {
                i18 = iLimit;
                i17 = i14 & (-268435457);
            } else {
                int iLimit2 = this.blockAdditionalData.limit();
                track.output.sampleData(this.blockAdditionalData, iLimit2, 2);
                iLimit += iLimit2;
                i17 = i14;
                i18 = iLimit;
            }
            track.output.sampleMetadata(j8, i17, i18, i16, track.cryptoData);
        }
        this.haveOutputSample = true;
    }

    private static int[] ensureArrayCapacity(int[] iArr, int i14) {
        if (iArr == null) {
            return new int[i14];
        }
        return iArr.length >= i14 ? iArr : new int[Math.max(iArr.length * 2, i14)];
    }

    private int finishWriteSampleData() {
        int i14 = this.sampleBytesWritten;
        resetWriteSampleData();
        return i14;
    }

    private static byte[] formatSubtitleTimecode(long j8, String str, long j14) {
        Assertions.checkArgument(j8 != C.TIME_UNSET);
        int i14 = (int) (j8 / 3600000000L);
        long j15 = j8 - (((long) (i14 * DateTimeConstants.SECONDS_PER_HOUR)) * 1000000);
        int i15 = (int) (j15 / 60000000);
        long j16 = j15 - (((long) (i15 * 60)) * 1000000);
        int i16 = (int) (j16 / 1000000);
        return Util.getUtf8Bytes(String.format(Locale.US, str, Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf((int) ((j16 - (((long) i16) * 1000000)) / j14))));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static boolean isCodecSupported(String str) {
        str.getClass();
        byte b14 = -1;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals(CODEC_ID_MPEG4_AP)) {
                    b14 = 0;
                }
                break;
            case -2095575984:
                if (str.equals(CODEC_ID_MPEG4_SP)) {
                    b14 = 1;
                }
                break;
            case -1985379776:
                if (str.equals(CODEC_ID_ACM)) {
                    b14 = 2;
                }
                break;
            case -1784763192:
                if (str.equals(CODEC_ID_TRUEHD)) {
                    b14 = 3;
                }
                break;
            case -1730367663:
                if (str.equals(CODEC_ID_VORBIS)) {
                    b14 = 4;
                }
                break;
            case -1482641358:
                if (str.equals(CODEC_ID_MP2)) {
                    b14 = 5;
                }
                break;
            case -1482641357:
                if (str.equals(CODEC_ID_MP3)) {
                    b14 = 6;
                }
                break;
            case -1373388978:
                if (str.equals(CODEC_ID_FOURCC)) {
                    b14 = 7;
                }
                break;
            case -933872740:
                if (str.equals(CODEC_ID_DVBSUB)) {
                    b14 = 8;
                }
                break;
            case -538363189:
                if (str.equals(CODEC_ID_MPEG4_ASP)) {
                    b14 = 9;
                }
                break;
            case -538363109:
                if (str.equals(CODEC_ID_H264)) {
                    b14 = 10;
                }
                break;
            case -425012669:
                if (str.equals(CODEC_ID_VOBSUB)) {
                    b14 = Ascii.VT;
                }
                break;
            case -356037306:
                if (str.equals(CODEC_ID_DTS_LOSSLESS)) {
                    b14 = Ascii.FF;
                }
                break;
            case 62923557:
                if (str.equals(CODEC_ID_AAC)) {
                    b14 = Ascii.CR;
                }
                break;
            case 62923603:
                if (str.equals(CODEC_ID_AC3)) {
                    b14 = Ascii.SO;
                }
                break;
            case 62927045:
                if (str.equals(CODEC_ID_DTS)) {
                    b14 = Ascii.SI;
                }
                break;
            case 82318131:
                if (str.equals(CODEC_ID_AV1)) {
                    b14 = Ascii.DLE;
                }
                break;
            case 82338133:
                if (str.equals(CODEC_ID_VP8)) {
                    b14 = 17;
                }
                break;
            case 82338134:
                if (str.equals(CODEC_ID_VP9)) {
                    b14 = Ascii.DC2;
                }
                break;
            case 99146302:
                if (str.equals(CODEC_ID_PGS)) {
                    b14 = 19;
                }
                break;
            case 444813526:
                if (str.equals(CODEC_ID_THEORA)) {
                    b14 = Ascii.DC4;
                }
                break;
            case 542569478:
                if (str.equals(CODEC_ID_DTS_EXPRESS)) {
                    b14 = Ascii.NAK;
                }
                break;
            case 635596514:
                if (str.equals(CODEC_ID_PCM_FLOAT)) {
                    b14 = Ascii.SYN;
                }
                break;
            case 725948237:
                if (str.equals(CODEC_ID_PCM_INT_BIG)) {
                    b14 = Ascii.ETB;
                }
                break;
            case 725957860:
                if (str.equals(CODEC_ID_PCM_INT_LIT)) {
                    b14 = Ascii.CAN;
                }
                break;
            case 738597099:
                if (str.equals(CODEC_ID_ASS)) {
                    b14 = Ascii.EM;
                }
                break;
            case 855502857:
                if (str.equals(CODEC_ID_H265)) {
                    b14 = Ascii.SUB;
                }
                break;
            case 1045209816:
                if (str.equals(CODEC_ID_VTT)) {
                    b14 = Ascii.ESC;
                }
                break;
            case 1422270023:
                if (str.equals(CODEC_ID_SUBRIP)) {
                    b14 = Ascii.FS;
                }
                break;
            case 1809237540:
                if (str.equals(CODEC_ID_MPEG2)) {
                    b14 = Ascii.GS;
                }
                break;
            case 1950749482:
                if (str.equals(CODEC_ID_E_AC3)) {
                    b14 = Ascii.RS;
                }
                break;
            case 1950789798:
                if (str.equals(CODEC_ID_FLAC)) {
                    b14 = Ascii.US;
                }
                break;
            case 1951062397:
                if (str.equals(CODEC_ID_OPUS)) {
                    b14 = 32;
                }
                break;
        }
        switch (b14) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[]{new MatroskaExtractor()};
    }

    private boolean maybeSeekForCues(PositionHolder positionHolder, long j8) {
        if (this.seekForCues) {
            this.seekPositionAfterBuildingCues = j8;
            positionHolder.position = this.cuesContentPosition;
            this.seekForCues = false;
            return true;
        }
        if (this.sentSeekMap) {
            long j14 = this.seekPositionAfterBuildingCues;
            if (j14 != -1) {
                positionHolder.position = j14;
                this.seekPositionAfterBuildingCues = -1L;
                return true;
            }
        }
        return false;
    }

    private void readScratch(ExtractorInput extractorInput, int i14) {
        if (this.scratch.limit() >= i14) {
            return;
        }
        if (this.scratch.capacity() < i14) {
            ParsableByteArray parsableByteArray = this.scratch;
            parsableByteArray.ensureCapacity(Math.max(parsableByteArray.capacity() * 2, i14));
        }
        extractorInput.readFully(this.scratch.getData(), this.scratch.limit(), i14 - this.scratch.limit());
        this.scratch.setLimit(i14);
    }

    private void resetWriteSampleData() {
        this.sampleBytesRead = 0;
        this.sampleBytesWritten = 0;
        this.sampleCurrentNalBytesRemaining = 0;
        this.sampleEncodingHandled = false;
        this.sampleSignalByteRead = false;
        this.samplePartitionCountRead = false;
        this.samplePartitionCount = 0;
        this.sampleSignalByte = (byte) 0;
        this.sampleInitializationVectorRead = false;
        this.sampleStrippedBytes.reset(0);
    }

    private long scaleTimecodeToUs(long j8) throws ParserException {
        long j14 = this.timecodeScale;
        if (j14 != C.TIME_UNSET) {
            return Util.scaleLargeTimestamp(j8, j14, 1000L);
        }
        throw ParserException.createForMalformedContainer("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private static void setSubtitleEndTime(String str, long j8, byte[] bArr) {
        byte[] subtitleTimecode;
        int i14;
        str.getClass();
        switch (str) {
            case "S_TEXT/ASS":
                subtitleTimecode = formatSubtitleTimecode(j8, SSA_TIMECODE_FORMAT, 10000L);
                i14 = 21;
                break;
            case "S_TEXT/WEBVTT":
                subtitleTimecode = formatSubtitleTimecode(j8, VTT_TIMECODE_FORMAT, 1000L);
                i14 = 25;
                break;
            case "S_TEXT/UTF8":
                subtitleTimecode = formatSubtitleTimecode(j8, SUBRIP_TIMECODE_FORMAT, 1000L);
                i14 = 19;
                break;
            default:
                h.w();
                return;
        }
        System.arraycopy(subtitleTimecode, 0, bArr, i14, subtitleTimecode.length);
    }

    private int writeSampleData(ExtractorInput extractorInput, Track track, int i14) throws ParserException {
        int i15;
        if (CODEC_ID_SUBRIP.equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, SUBRIP_PREFIX, i14);
            return finishWriteSampleData();
        }
        if (CODEC_ID_ASS.equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, SSA_PREFIX, i14);
            return finishWriteSampleData();
        }
        if (CODEC_ID_VTT.equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, VTT_PREFIX, i14);
            return finishWriteSampleData();
        }
        TrackOutput trackOutput = track.output;
        if (!this.sampleEncodingHandled) {
            if (track.hasContentEncryption) {
                this.blockFlags &= -1073741825;
                if (!this.sampleSignalByteRead) {
                    extractorInput.readFully(this.scratch.getData(), 0, 1);
                    this.sampleBytesRead++;
                    if ((this.scratch.getData()[0] & UnsignedBytes.MAX_POWER_OF_TWO) == 128) {
                        throw ParserException.createForMalformedContainer("Extension bit is set in signal byte", null);
                    }
                    this.sampleSignalByte = this.scratch.getData()[0];
                    this.sampleSignalByteRead = true;
                }
                byte b14 = this.sampleSignalByte;
                if ((b14 & 1) == 1) {
                    boolean z14 = (b14 & 2) == 2;
                    this.blockFlags |= 1073741824;
                    if (!this.sampleInitializationVectorRead) {
                        extractorInput.readFully(this.encryptionInitializationVector.getData(), 0, 8);
                        this.sampleBytesRead += 8;
                        this.sampleInitializationVectorRead = true;
                        this.scratch.getData()[0] = (byte) ((z14 ? 128 : 0) | 8);
                        this.scratch.setPosition(0);
                        trackOutput.sampleData(this.scratch, 1, 1);
                        this.sampleBytesWritten++;
                        this.encryptionInitializationVector.setPosition(0);
                        trackOutput.sampleData(this.encryptionInitializationVector, 8, 1);
                        this.sampleBytesWritten += 8;
                    }
                    if (z14) {
                        if (!this.samplePartitionCountRead) {
                            extractorInput.readFully(this.scratch.getData(), 0, 1);
                            this.sampleBytesRead++;
                            this.scratch.setPosition(0);
                            this.samplePartitionCount = this.scratch.readUnsignedByte();
                            this.samplePartitionCountRead = true;
                        }
                        int i16 = this.samplePartitionCount * 4;
                        this.scratch.reset(i16);
                        extractorInput.readFully(this.scratch.getData(), 0, i16);
                        this.sampleBytesRead += i16;
                        short s8 = (short) ((this.samplePartitionCount / 2) + 1);
                        int i17 = (s8 * 6) + 2;
                        ByteBuffer byteBuffer = this.encryptionSubsampleDataBuffer;
                        if (byteBuffer == null || byteBuffer.capacity() < i17) {
                            this.encryptionSubsampleDataBuffer = ByteBuffer.allocate(i17);
                        }
                        this.encryptionSubsampleDataBuffer.position(0);
                        this.encryptionSubsampleDataBuffer.putShort(s8);
                        int i18 = 0;
                        int i19 = 0;
                        while (true) {
                            i15 = this.samplePartitionCount;
                            if (i18 >= i15) {
                                break;
                            }
                            int unsignedIntToInt = this.scratch.readUnsignedIntToInt();
                            int i24 = i18 % 2;
                            ByteBuffer byteBuffer2 = this.encryptionSubsampleDataBuffer;
                            if (i24 == 0) {
                                byteBuffer2.putShort((short) (unsignedIntToInt - i19));
                            } else {
                                byteBuffer2.putInt(unsignedIntToInt - i19);
                            }
                            i18++;
                            i19 = unsignedIntToInt;
                        }
                        int i25 = (i14 - this.sampleBytesRead) - i19;
                        int i26 = i15 % 2;
                        ByteBuffer byteBuffer3 = this.encryptionSubsampleDataBuffer;
                        if (i26 == 1) {
                            byteBuffer3.putInt(i25);
                        } else {
                            byteBuffer3.putShort((short) i25);
                            this.encryptionSubsampleDataBuffer.putInt(0);
                        }
                        this.encryptionSubsampleData.reset(this.encryptionSubsampleDataBuffer.array(), i17);
                        trackOutput.sampleData(this.encryptionSubsampleData, i17, 1);
                        this.sampleBytesWritten += i17;
                    }
                }
            } else {
                byte[] bArr = track.sampleStrippedBytes;
                if (bArr != null) {
                    this.sampleStrippedBytes.reset(bArr, bArr.length);
                }
            }
            if (track.maxBlockAdditionId > 0) {
                this.blockFlags |= 268435456;
                this.blockAdditionalData.reset(0);
                this.scratch.reset(4);
                this.scratch.getData()[0] = (byte) ((i14 >> 24) & 255);
                this.scratch.getData()[1] = (byte) ((i14 >> 16) & 255);
                this.scratch.getData()[2] = (byte) ((i14 >> 8) & 255);
                this.scratch.getData()[3] = (byte) (i14 & 255);
                trackOutput.sampleData(this.scratch, 4, 2);
                this.sampleBytesWritten += 4;
            }
            this.sampleEncodingHandled = true;
        }
        int iLimit = this.sampleStrippedBytes.limit() + i14;
        if (!CODEC_ID_H264.equals(track.codecId) && !CODEC_ID_H265.equals(track.codecId)) {
            if (track.trueHdSampleRechunker != null) {
                Assertions.checkState(this.sampleStrippedBytes.limit() == 0);
                track.trueHdSampleRechunker.startSample(extractorInput);
            }
            while (true) {
                int i27 = this.sampleBytesRead;
                if (i27 >= iLimit) {
                    break;
                }
                int iWriteToOutput = writeToOutput(extractorInput, trackOutput, iLimit - i27);
                this.sampleBytesRead += iWriteToOutput;
                this.sampleBytesWritten += iWriteToOutput;
            }
        } else {
            byte[] data = this.nalLength.getData();
            data[0] = 0;
            data[1] = 0;
            data[2] = 0;
            int i28 = track.nalUnitLengthFieldLength;
            int i29 = 4 - i28;
            while (this.sampleBytesRead < iLimit) {
                int i30 = this.sampleCurrentNalBytesRemaining;
                if (i30 == 0) {
                    writeToTarget(extractorInput, data, i29, i28);
                    this.sampleBytesRead += i28;
                    this.nalLength.setPosition(0);
                    this.sampleCurrentNalBytesRemaining = this.nalLength.readUnsignedIntToInt();
                    this.nalStartCode.setPosition(0);
                    trackOutput.sampleData(this.nalStartCode, 4);
                    this.sampleBytesWritten += 4;
                } else {
                    int iWriteToOutput2 = writeToOutput(extractorInput, trackOutput, i30);
                    this.sampleBytesRead += iWriteToOutput2;
                    this.sampleBytesWritten += iWriteToOutput2;
                    this.sampleCurrentNalBytesRemaining -= iWriteToOutput2;
                }
            }
        }
        if (CODEC_ID_VORBIS.equals(track.codecId)) {
            this.vorbisNumPageSamples.setPosition(0);
            trackOutput.sampleData(this.vorbisNumPageSamples, 4);
            this.sampleBytesWritten += 4;
        }
        return finishWriteSampleData();
    }

    private void writeSubtitleSampleData(ExtractorInput extractorInput, byte[] bArr, int i14) {
        int length = bArr.length + i14;
        int iCapacity = this.subtitleSample.capacity();
        ParsableByteArray parsableByteArray = this.subtitleSample;
        if (iCapacity < length) {
            parsableByteArray.reset(Arrays.copyOf(bArr, length + i14));
        } else {
            System.arraycopy(bArr, 0, parsableByteArray.getData(), 0, bArr.length);
        }
        extractorInput.readFully(this.subtitleSample.getData(), bArr.length, i14);
        this.subtitleSample.setPosition(0);
        this.subtitleSample.setLimit(length);
    }

    private int writeToOutput(ExtractorInput extractorInput, TrackOutput trackOutput, int i14) {
        int iBytesLeft = this.sampleStrippedBytes.bytesLeft();
        if (iBytesLeft <= 0) {
            return trackOutput.sampleData((DataReader) extractorInput, i14, false);
        }
        int iMin = Math.min(i14, iBytesLeft);
        trackOutput.sampleData(this.sampleStrippedBytes, iMin);
        return iMin;
    }

    private void writeToTarget(ExtractorInput extractorInput, byte[] bArr, int i14, int i15) {
        int iMin = Math.min(i15, this.sampleStrippedBytes.bytesLeft());
        extractorInput.readFully(bArr, i14 + iMin, i15 - iMin);
        if (iMin > 0) {
            this.sampleStrippedBytes.readBytes(bArr, i14, iMin);
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0291  */
    public void binaryElement(int i14, int i15, ExtractorInput extractorInput) throws ParserException {
        int i16;
        int i17;
        int i18;
        long j8;
        int i19;
        int[] iArr;
        int i24;
        int i25;
        int i26;
        ExtractorInput extractorInput2 = extractorInput;
        int i27 = 0;
        int i28 = 1;
        if (i14 != ID_BLOCK && i14 != ID_SIMPLE_BLOCK) {
            if (i14 == ID_BLOCK_ADDITIONAL) {
                if (this.blockState != 2) {
                    return;
                }
                handleBlockAdditionalData(this.tracks.get(this.blockTrackNumber), this.blockAdditionalId, extractorInput2, i15);
                return;
            }
            if (i14 == ID_BLOCK_ADD_ID_EXTRA_DATA) {
                handleBlockAddIDExtraData(getCurrentTrack(i14), extractorInput2, i15);
                return;
            }
            if (i14 == ID_CONTENT_COMPRESSION_SETTINGS) {
                assertInTrackEntry(i14);
                byte[] bArr = new byte[i15];
                this.currentTrack.sampleStrippedBytes = bArr;
                extractorInput2.readFully(bArr, 0, i15);
                return;
            }
            if (i14 == ID_CONTENT_ENCRYPTION_KEY_ID) {
                byte[] bArr2 = new byte[i15];
                extractorInput2.readFully(bArr2, 0, i15);
                getCurrentTrack(i14).cryptoData = new TrackOutput.CryptoData(1, bArr2, 0, 0);
                return;
            }
            if (i14 == ID_SEEK_ID) {
                Arrays.fill(this.seekEntryIdBytes.getData(), (byte) 0);
                extractorInput2.readFully(this.seekEntryIdBytes.getData(), 4 - i15, i15);
                this.seekEntryIdBytes.setPosition(0);
                this.seekEntryId = (int) this.seekEntryIdBytes.readUnsignedInt();
                return;
            }
            if (i14 == ID_CODEC_PRIVATE) {
                assertInTrackEntry(i14);
                byte[] bArr3 = new byte[i15];
                this.currentTrack.codecPrivate = bArr3;
                extractorInput2.readFully(bArr3, 0, i15);
                return;
            }
            if (i14 != ID_PROJECTION_PRIVATE) {
                StringBuilder sb3 = new StringBuilder(26);
                sb3.append("Unexpected id: ");
                sb3.append(i14);
                throw ParserException.createForMalformedContainer(sb3.toString(), null);
            }
            assertInTrackEntry(i14);
            byte[] bArr4 = new byte[i15];
            this.currentTrack.projectionData = bArr4;
            extractorInput2.readFully(bArr4, 0, i15);
            return;
        }
        int i29 = 8;
        if (this.blockState == 0) {
            this.blockTrackNumber = (int) this.varintReader.readUnsignedVarint(extractorInput2, false, true, 8);
            this.blockTrackNumberLength = this.varintReader.getLastLength();
            this.blockDurationUs = C.TIME_UNSET;
            this.blockState = 1;
            this.scratch.reset(0);
        }
        Track track = this.tracks.get(this.blockTrackNumber);
        if (track == null) {
            extractorInput2.skipFully(i15 - this.blockTrackNumberLength);
            this.blockState = 0;
            return;
        }
        track.assertOutputInitialized();
        if (this.blockState == 1) {
            readScratch(extractorInput2, 3);
            int i30 = (this.scratch.getData()[2] & 6) >> 1;
            if (i30 == 0) {
                this.blockSampleCount = 1;
                int[] iArrEnsureArrayCapacity = ensureArrayCapacity(this.blockSampleSizes, 1);
                this.blockSampleSizes = iArrEnsureArrayCapacity;
                iArrEnsureArrayCapacity[0] = (i15 - this.blockTrackNumberLength) - 3;
            } else {
                readScratch(extractorInput2, 4);
                int i34 = (this.scratch.getData()[3] & UnsignedBytes.MAX_VALUE) + 1;
                this.blockSampleCount = i34;
                int[] iArrEnsureArrayCapacity2 = ensureArrayCapacity(this.blockSampleSizes, i34);
                this.blockSampleSizes = iArrEnsureArrayCapacity2;
                if (i30 == 2) {
                    int i35 = (i15 - this.blockTrackNumberLength) - 4;
                    int i36 = this.blockSampleCount;
                    Arrays.fill(iArrEnsureArrayCapacity2, 0, i36, i35 / i36);
                } else if (i30 == 1) {
                    int i37 = 0;
                    int i38 = 0;
                    int i39 = 4;
                    while (true) {
                        i19 = this.blockSampleCount;
                        int i44 = i19 - 1;
                        i17 = i28;
                        iArr = this.blockSampleSizes;
                        if (i37 >= i44) {
                            break;
                        }
                        iArr[i37] = 0;
                        while (true) {
                            i24 = i39 + 1;
                            readScratch(extractorInput2, i24);
                            int i45 = this.scratch.getData()[i39] & UnsignedBytes.MAX_VALUE;
                            int[] iArr2 = this.blockSampleSizes;
                            i25 = iArr2[i37] + i45;
                            iArr2[i37] = i25;
                            if (i45 != 255) {
                                break;
                            } else {
                                i39 = i24;
                            }
                        }
                        i38 += i25;
                        i37++;
                        i39 = i24;
                        i28 = i17;
                    }
                    iArr[i19 - 1] = ((i15 - this.blockTrackNumberLength) - i39) - i38;
                } else {
                    i17 = 1;
                    if (i30 != 3) {
                        StringBuilder sb4 = new StringBuilder(36);
                        sb4.append("Unexpected lacing value: ");
                        sb4.append(i30);
                        throw ParserException.createForMalformedContainer(sb4.toString(), null);
                    }
                    int i46 = 0;
                    int i47 = 0;
                    int i48 = 4;
                    while (true) {
                        int i49 = this.blockSampleCount;
                        int i54 = i49 - 1;
                        i27 = i27;
                        int[] iArr3 = this.blockSampleSizes;
                        if (i46 >= i54) {
                            iArr3[i49 - 1] = ((i15 - this.blockTrackNumberLength) - i48) - i47;
                            break;
                        }
                        iArr3[i46] = i27;
                        int i55 = i48 + 1;
                        readScratch(extractorInput2, i55);
                        if (this.scratch.getData()[i48] == 0) {
                            throw ParserException.createForMalformedContainer("No valid varint length mask found", null);
                        }
                        int i56 = i27;
                        while (true) {
                            if (i56 >= i29) {
                                i18 = i29;
                                j8 = 0;
                                break;
                            }
                            int i57 = 1 << (7 - i56);
                            i18 = i29;
                            if ((this.scratch.getData()[i48] & i57) != 0) {
                                i55 += i56;
                                readScratch(extractorInput2, i55);
                                int i58 = i48 + 1;
                                j8 = this.scratch.getData()[i48] & UnsignedBytes.MAX_VALUE & (~i57);
                                for (int i59 = i58; i59 < i55; i59++) {
                                    j8 = (j8 << i18) | ((long) (this.scratch.getData()[i59] & UnsignedBytes.MAX_VALUE));
                                }
                                if (i46 <= 0) {
                                    break;
                                }
                                j8 -= (1 << ((i56 * 7) + 6)) - 1;
                                break;
                            }
                            i56++;
                            extractorInput2 = extractorInput;
                            i29 = i18;
                        }
                        if (j8 < -2147483648L || j8 > 2147483647L) {
                            throw ParserException.createForMalformedContainer("EBML lacing sample size out of range.", null);
                        }
                        int i64 = (int) j8;
                        int[] iArr4 = this.blockSampleSizes;
                        if (i46 != 0) {
                            i64 += iArr4[i46 - 1];
                        }
                        iArr4[i46] = i64;
                        i47 += i64;
                        i46++;
                        extractorInput2 = extractorInput;
                        i48 = i55;
                        i27 = i27;
                        i29 = i18;
                    }
                }
                this.blockTimeUs = this.clusterTimecodeUs + scaleTimecodeToUs((this.scratch.getData()[i27] << 8) | (this.scratch.getData()[i17] & UnsignedBytes.MAX_VALUE));
                if (track.type != 2 || (i14 == ID_SIMPLE_BLOCK && (this.scratch.getData()[2] & UnsignedBytes.MAX_POWER_OF_TWO) == 128)) {
                    i26 = i17;
                } else {
                    i26 = i27;
                }
                this.blockFlags = i26;
                this.blockState = 2;
                this.blockSampleIndex = i27;
                i16 = ID_SIMPLE_BLOCK;
            }
            i17 = 1;
            this.blockTimeUs = this.clusterTimecodeUs + scaleTimecodeToUs((this.scratch.getData()[i27] << 8) | (this.scratch.getData()[i17] & UnsignedBytes.MAX_VALUE));
            if (track.type != 2) {
                i26 = i17;
            } else {
                i26 = i17;
            }
            this.blockFlags = i26;
            this.blockState = 2;
            this.blockSampleIndex = i27;
            i16 = ID_SIMPLE_BLOCK;
        } else {
            i16 = ID_SIMPLE_BLOCK;
        }
        if (i14 == i16) {
            while (true) {
                int i65 = this.blockSampleIndex;
                if (i65 >= this.blockSampleCount) {
                    this.blockState = 0;
                    return;
                }
                int iWriteSampleData = writeSampleData(extractorInput, track, this.blockSampleSizes[i65]);
                Track track2 = track;
                commitSampleToOutput(track2, this.blockTimeUs + ((long) ((this.blockSampleIndex * track.defaultSampleDurationNs) / 1000)), this.blockFlags, iWriteSampleData, 0);
                this.blockSampleIndex++;
                track = track2;
            }
        } else {
            while (true) {
                int i66 = this.blockSampleIndex;
                if (i66 >= this.blockSampleCount) {
                    return;
                }
                int[] iArr5 = this.blockSampleSizes;
                iArr5[i66] = writeSampleData(extractorInput, track, iArr5[i66]);
                this.blockSampleIndex++;
            }
        }
    }

    public void endMasterElement(int i14) throws ParserException {
        assertInitialized();
        if (i14 == 160) {
            if (this.blockState != 2) {
                return;
            }
            int i15 = 0;
            for (int i16 = 0; i16 < this.blockSampleCount; i16++) {
                i15 += this.blockSampleSizes[i16];
            }
            Track track = this.tracks.get(this.blockTrackNumber);
            track.assertOutputInitialized();
            int i17 = 0;
            while (i17 < this.blockSampleCount) {
                long j8 = this.blockTimeUs + ((long) ((track.defaultSampleDurationNs * i17) / 1000));
                int i18 = this.blockFlags;
                if (i17 == 0 && !this.blockHasReferenceBlock) {
                    i18 |= 1;
                }
                int i19 = this.blockSampleSizes[i17];
                int i24 = i15 - i19;
                commitSampleToOutput(track, j8, i18, i19, i24);
                i17++;
                i15 = i24;
            }
            this.blockState = 0;
            return;
        }
        if (i14 == ID_TRACK_ENTRY) {
            Track track2 = (Track) Assertions.checkStateNotNull(this.currentTrack);
            String str = track2.codecId;
            if (str == null) {
                throw ParserException.createForMalformedContainer("CodecId is missing in TrackEntry element", null);
            }
            if (isCodecSupported(str)) {
                track2.initializeOutput(this.extractorOutput, track2.number);
                this.tracks.put(track2.number, track2);
            }
            this.currentTrack = null;
            return;
        }
        if (i14 == ID_SEEK) {
            int i25 = this.seekEntryId;
            if (i25 != -1) {
                long j14 = this.seekEntryPosition;
                if (j14 != -1) {
                    if (i25 == ID_CUES) {
                        this.cuesContentPosition = j14;
                        return;
                    }
                    return;
                }
            }
            throw ParserException.createForMalformedContainer("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i14 == ID_CONTENT_ENCODING) {
            assertInTrackEntry(i14);
            Track track3 = this.currentTrack;
            if (track3.hasContentEncryption) {
                if (track3.cryptoData == null) {
                    throw ParserException.createForMalformedContainer("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                track3.drmInitData = new DrmInitData(new DrmInitData.SchemeData(C.UUID_NIL, MimeTypes.VIDEO_WEBM, this.currentTrack.cryptoData.encryptionKey));
                return;
            }
            return;
        }
        if (i14 == ID_CONTENT_ENCODINGS) {
            assertInTrackEntry(i14);
            Track track4 = this.currentTrack;
            if (track4.hasContentEncryption && track4.sampleStrippedBytes != null) {
                throw ParserException.createForMalformedContainer("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i14 == 357149030) {
            if (this.timecodeScale == C.TIME_UNSET) {
                this.timecodeScale = 1000000L;
            }
            long j15 = this.durationTimecode;
            if (j15 != C.TIME_UNSET) {
                this.durationUs = scaleTimecodeToUs(j15);
                return;
            }
            return;
        }
        if (i14 == ID_TRACKS) {
            if (this.tracks.size() == 0) {
                throw ParserException.createForMalformedContainer("No valid tracks were found", null);
            }
            this.extractorOutput.endTracks();
        } else {
            if (i14 != ID_CUES) {
                return;
            }
            if (!this.sentSeekMap) {
                this.extractorOutput.seekMap(buildSeekMap(this.cueTimesUs, this.cueClusterPositions));
                this.sentSeekMap = true;
            }
            this.cueTimesUs = null;
            this.cueClusterPositions = null;
        }
    }

    public void floatElement(int i14, double d14) {
        if (i14 == ID_SAMPLING_FREQUENCY) {
            getCurrentTrack(i14).sampleRate = (int) d14;
            return;
        }
        if (i14 == ID_DURATION) {
            this.durationTimecode = (long) d14;
            return;
        }
        switch (i14) {
            case ID_PRIMARY_R_CHROMATICITY_X /* 21969 */:
                getCurrentTrack(i14).primaryRChromaticityX = (float) d14;
                break;
            case ID_PRIMARY_R_CHROMATICITY_Y /* 21970 */:
                getCurrentTrack(i14).primaryRChromaticityY = (float) d14;
                break;
            case ID_PRIMARY_G_CHROMATICITY_X /* 21971 */:
                getCurrentTrack(i14).primaryGChromaticityX = (float) d14;
                break;
            case ID_PRIMARY_G_CHROMATICITY_Y /* 21972 */:
                getCurrentTrack(i14).primaryGChromaticityY = (float) d14;
                break;
            case ID_PRIMARY_B_CHROMATICITY_X /* 21973 */:
                getCurrentTrack(i14).primaryBChromaticityX = (float) d14;
                break;
            case ID_PRIMARY_B_CHROMATICITY_Y /* 21974 */:
                getCurrentTrack(i14).primaryBChromaticityY = (float) d14;
                break;
            case ID_WHITE_POINT_CHROMATICITY_X /* 21975 */:
                getCurrentTrack(i14).whitePointChromaticityX = (float) d14;
                break;
            case ID_WHITE_POINT_CHROMATICITY_Y /* 21976 */:
                getCurrentTrack(i14).whitePointChromaticityY = (float) d14;
                break;
            case ID_LUMNINANCE_MAX /* 21977 */:
                getCurrentTrack(i14).maxMasteringLuminance = (float) d14;
                break;
            case ID_LUMNINANCE_MIN /* 21978 */:
                getCurrentTrack(i14).minMasteringLuminance = (float) d14;
                break;
            default:
                switch (i14) {
                    case ID_PROJECTION_POSE_YAW /* 30323 */:
                        getCurrentTrack(i14).projectionPoseYaw = (float) d14;
                        break;
                    case ID_PROJECTION_POSE_PITCH /* 30324 */:
                        getCurrentTrack(i14).projectionPosePitch = (float) d14;
                        break;
                    case ID_PROJECTION_POSE_ROLL /* 30325 */:
                        getCurrentTrack(i14).projectionPoseRoll = (float) d14;
                        break;
                }
                break;
        }
    }

    public Track getCurrentTrack(int i14) throws ParserException {
        assertInTrackEntry(i14);
        return this.currentTrack;
    }

    public int getElementType(int i14) {
        switch (i14) {
            case 131:
            case 136:
            case 155:
            case ID_CHANNELS /* 159 */:
            case 176:
            case ID_CUE_TIME /* 179 */:
            case ID_PIXEL_HEIGHT /* 186 */:
            case ID_TRACK_NUMBER /* 215 */:
            case ID_TIME_CODE /* 231 */:
            case ID_BLOCK_ADD_ID /* 238 */:
            case ID_CUE_CLUSTER_POSITION /* 241 */:
            case ID_REFERENCE_BLOCK /* 251 */:
            case ID_BLOCK_ADD_ID_TYPE /* 16871 */:
            case ID_CONTENT_COMPRESSION_ALGORITHM /* 16980 */:
            case ID_DOC_TYPE_READ_VERSION /* 17029 */:
            case ID_EBML_READ_VERSION /* 17143 */:
            case ID_CONTENT_ENCRYPTION_ALGORITHM /* 18401 */:
            case ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE /* 18408 */:
            case ID_CONTENT_ENCODING_ORDER /* 20529 */:
            case ID_CONTENT_ENCODING_SCOPE /* 20530 */:
            case ID_SEEK_POSITION /* 21420 */:
            case ID_STEREO_MODE /* 21432 */:
            case ID_DISPLAY_WIDTH /* 21680 */:
            case ID_DISPLAY_UNIT /* 21682 */:
            case ID_DISPLAY_HEIGHT /* 21690 */:
            case ID_FLAG_FORCED /* 21930 */:
            case ID_COLOUR_RANGE /* 21945 */:
            case ID_COLOUR_TRANSFER /* 21946 */:
            case ID_COLOUR_PRIMARIES /* 21947 */:
            case ID_MAX_CLL /* 21948 */:
            case ID_MAX_FALL /* 21949 */:
            case ID_MAX_BLOCK_ADDITION_ID /* 21998 */:
            case ID_CODEC_DELAY /* 22186 */:
            case ID_SEEK_PRE_ROLL /* 22203 */:
            case ID_AUDIO_BIT_DEPTH /* 25188 */:
            case ID_PROJECTION_TYPE /* 30321 */:
            case ID_DEFAULT_DURATION /* 2352003 */:
            case ID_TIMECODE_SCALE /* 2807729 */:
                return 2;
            case 134:
            case 17026:
            case ID_NAME /* 21358 */:
            case ID_LANGUAGE /* 2274716 */:
                return 3;
            case 160:
            case ID_BLOCK_MORE /* 166 */:
            case ID_TRACK_ENTRY /* 174 */:
            case ID_CUE_TRACK_POSITIONS /* 183 */:
            case ID_CUE_POINT /* 187 */:
            case 224:
            case ID_AUDIO /* 225 */:
            case ID_BLOCK_ADDITION_MAPPING /* 16868 */:
            case ID_CONTENT_ENCRYPTION_AES_SETTINGS /* 18407 */:
            case ID_SEEK /* 19899 */:
            case ID_CONTENT_COMPRESSION /* 20532 */:
            case ID_CONTENT_ENCRYPTION /* 20533 */:
            case ID_COLOUR /* 21936 */:
            case ID_MASTERING_METADATA /* 21968 */:
            case ID_CONTENT_ENCODING /* 25152 */:
            case ID_CONTENT_ENCODINGS /* 28032 */:
            case ID_BLOCK_ADDITIONS /* 30113 */:
            case ID_PROJECTION /* 30320 */:
            case ID_SEEK_HEAD /* 290298740 */:
            case 357149030:
            case ID_TRACKS /* 374648427 */:
            case ID_SEGMENT /* 408125543 */:
            case ID_EBML /* 440786851 */:
            case ID_CUES /* 475249515 */:
            case ID_CLUSTER /* 524531317 */:
                return 1;
            case ID_BLOCK /* 161 */:
            case ID_SIMPLE_BLOCK /* 163 */:
            case ID_BLOCK_ADDITIONAL /* 165 */:
            case ID_BLOCK_ADD_ID_EXTRA_DATA /* 16877 */:
            case ID_CONTENT_COMPRESSION_SETTINGS /* 16981 */:
            case ID_CONTENT_ENCRYPTION_KEY_ID /* 18402 */:
            case ID_SEEK_ID /* 21419 */:
            case ID_CODEC_PRIVATE /* 25506 */:
            case ID_PROJECTION_PRIVATE /* 30322 */:
                return 4;
            case ID_SAMPLING_FREQUENCY /* 181 */:
            case ID_DURATION /* 17545 */:
            case ID_PRIMARY_R_CHROMATICITY_X /* 21969 */:
            case ID_PRIMARY_R_CHROMATICITY_Y /* 21970 */:
            case ID_PRIMARY_G_CHROMATICITY_X /* 21971 */:
            case ID_PRIMARY_G_CHROMATICITY_Y /* 21972 */:
            case ID_PRIMARY_B_CHROMATICITY_X /* 21973 */:
            case ID_PRIMARY_B_CHROMATICITY_Y /* 21974 */:
            case ID_WHITE_POINT_CHROMATICITY_X /* 21975 */:
            case ID_WHITE_POINT_CHROMATICITY_Y /* 21976 */:
            case ID_LUMNINANCE_MAX /* 21977 */:
            case ID_LUMNINANCE_MIN /* 21978 */:
            case ID_PROJECTION_POSE_YAW /* 30323 */:
            case ID_PROJECTION_POSE_PITCH /* 30324 */:
            case ID_PROJECTION_POSE_ROLL /* 30325 */:
                return 5;
            default:
                return 0;
        }
    }

    public void handleBlockAddIDExtraData(Track track, ExtractorInput extractorInput, int i14) {
        if (track.blockAddIdType != 1685485123 && track.blockAddIdType != 1685480259) {
            extractorInput.skipFully(i14);
            return;
        }
        byte[] bArr = new byte[i14];
        track.dolbyVisionConfigBytes = bArr;
        extractorInput.readFully(bArr, 0, i14);
    }

    public void handleBlockAdditionalData(Track track, int i14, ExtractorInput extractorInput, int i15) {
        if (i14 != 4 || !CODEC_ID_VP9.equals(track.codecId)) {
            extractorInput.skipFully(i15);
        } else {
            this.blockAdditionalData.reset(i15);
            extractorInput.readFully(this.blockAdditionalData.getData(), 0, i15);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
    }

    public void integerElement(int i14, long j8) throws ParserException {
        if (i14 == ID_CONTENT_ENCODING_ORDER) {
            if (j8 == 0) {
                return;
            }
            StringBuilder sb3 = new StringBuilder(55);
            sb3.append("ContentEncodingOrder ");
            sb3.append(j8);
            sb3.append(" not supported");
            throw ParserException.createForMalformedContainer(sb3.toString(), null);
        }
        if (i14 == ID_CONTENT_ENCODING_SCOPE) {
            if (j8 == 1) {
                return;
            }
            StringBuilder sb4 = new StringBuilder(55);
            sb4.append("ContentEncodingScope ");
            sb4.append(j8);
            sb4.append(" not supported");
            throw ParserException.createForMalformedContainer(sb4.toString(), null);
        }
        switch (i14) {
            case 131:
                getCurrentTrack(i14).type = (int) j8;
                return;
            case 136:
                getCurrentTrack(i14).flagDefault = j8 == 1;
                return;
            case 155:
                this.blockDurationUs = scaleTimecodeToUs(j8);
                return;
            case ID_CHANNELS /* 159 */:
                getCurrentTrack(i14).channelCount = (int) j8;
                return;
            case 176:
                getCurrentTrack(i14).width = (int) j8;
                return;
            case ID_CUE_TIME /* 179 */:
                assertInCues(i14);
                this.cueTimesUs.add(scaleTimecodeToUs(j8));
                return;
            case ID_PIXEL_HEIGHT /* 186 */:
                getCurrentTrack(i14).height = (int) j8;
                return;
            case ID_TRACK_NUMBER /* 215 */:
                getCurrentTrack(i14).number = (int) j8;
                return;
            case ID_TIME_CODE /* 231 */:
                this.clusterTimecodeUs = scaleTimecodeToUs(j8);
                return;
            case ID_BLOCK_ADD_ID /* 238 */:
                this.blockAdditionalId = (int) j8;
                return;
            case ID_CUE_CLUSTER_POSITION /* 241 */:
                if (this.seenClusterPositionForCurrentCuePoint) {
                    return;
                }
                assertInCues(i14);
                this.cueClusterPositions.add(j8);
                this.seenClusterPositionForCurrentCuePoint = true;
                return;
            case ID_REFERENCE_BLOCK /* 251 */:
                this.blockHasReferenceBlock = true;
                return;
            case ID_BLOCK_ADD_ID_TYPE /* 16871 */:
                getCurrentTrack(i14).blockAddIdType = (int) j8;
                return;
            case ID_CONTENT_COMPRESSION_ALGORITHM /* 16980 */:
                if (j8 == 3) {
                    return;
                }
                StringBuilder sb5 = new StringBuilder(50);
                sb5.append("ContentCompAlgo ");
                sb5.append(j8);
                sb5.append(" not supported");
                throw ParserException.createForMalformedContainer(sb5.toString(), null);
            case ID_DOC_TYPE_READ_VERSION /* 17029 */:
                if (j8 < 1 || j8 > 2) {
                    StringBuilder sb6 = new StringBuilder(53);
                    sb6.append("DocTypeReadVersion ");
                    sb6.append(j8);
                    sb6.append(" not supported");
                    throw ParserException.createForMalformedContainer(sb6.toString(), null);
                }
                return;
            case ID_EBML_READ_VERSION /* 17143 */:
                if (j8 == 1) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(50);
                sb7.append("EBMLReadVersion ");
                sb7.append(j8);
                sb7.append(" not supported");
                throw ParserException.createForMalformedContainer(sb7.toString(), null);
            case ID_CONTENT_ENCRYPTION_ALGORITHM /* 18401 */:
                if (j8 == 5) {
                    return;
                }
                StringBuilder sb8 = new StringBuilder(49);
                sb8.append("ContentEncAlgo ");
                sb8.append(j8);
                sb8.append(" not supported");
                throw ParserException.createForMalformedContainer(sb8.toString(), null);
            case ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE /* 18408 */:
                if (j8 == 1) {
                    return;
                }
                StringBuilder sb9 = new StringBuilder(56);
                sb9.append("AESSettingsCipherMode ");
                sb9.append(j8);
                sb9.append(" not supported");
                throw ParserException.createForMalformedContainer(sb9.toString(), null);
            case ID_SEEK_POSITION /* 21420 */:
                this.seekEntryPosition = j8 + this.segmentContentPosition;
                return;
            case ID_STEREO_MODE /* 21432 */:
                int i15 = (int) j8;
                assertInTrackEntry(i14);
                if (i15 == 0) {
                    this.currentTrack.stereoMode = 0;
                    return;
                }
                if (i15 == 1) {
                    this.currentTrack.stereoMode = 2;
                    return;
                } else if (i15 == 3) {
                    this.currentTrack.stereoMode = 1;
                    return;
                } else {
                    if (i15 != 15) {
                        return;
                    }
                    this.currentTrack.stereoMode = 3;
                    return;
                }
            case ID_DISPLAY_WIDTH /* 21680 */:
                getCurrentTrack(i14).displayWidth = (int) j8;
                return;
            case ID_DISPLAY_UNIT /* 21682 */:
                getCurrentTrack(i14).displayUnit = (int) j8;
                return;
            case ID_DISPLAY_HEIGHT /* 21690 */:
                getCurrentTrack(i14).displayHeight = (int) j8;
                return;
            case ID_FLAG_FORCED /* 21930 */:
                getCurrentTrack(i14).flagForced = j8 == 1;
                return;
            case ID_MAX_BLOCK_ADDITION_ID /* 21998 */:
                getCurrentTrack(i14).maxBlockAdditionId = (int) j8;
                return;
            case ID_CODEC_DELAY /* 22186 */:
                getCurrentTrack(i14).codecDelayNs = j8;
                return;
            case ID_SEEK_PRE_ROLL /* 22203 */:
                getCurrentTrack(i14).seekPreRollNs = j8;
                return;
            case ID_AUDIO_BIT_DEPTH /* 25188 */:
                getCurrentTrack(i14).audioBitDepth = (int) j8;
                return;
            case ID_PROJECTION_TYPE /* 30321 */:
                assertInTrackEntry(i14);
                int i16 = (int) j8;
                if (i16 == 0) {
                    this.currentTrack.projectionType = 0;
                    return;
                }
                if (i16 == 1) {
                    this.currentTrack.projectionType = 1;
                    return;
                } else if (i16 == 2) {
                    this.currentTrack.projectionType = 2;
                    return;
                } else {
                    if (i16 != 3) {
                        return;
                    }
                    this.currentTrack.projectionType = 3;
                    return;
                }
            case ID_DEFAULT_DURATION /* 2352003 */:
                getCurrentTrack(i14).defaultSampleDurationNs = (int) j8;
                return;
            case ID_TIMECODE_SCALE /* 2807729 */:
                this.timecodeScale = j8;
                return;
            default:
                switch (i14) {
                    case ID_COLOUR_RANGE /* 21945 */:
                        assertInTrackEntry(i14);
                        int i17 = (int) j8;
                        if (i17 == 1) {
                            this.currentTrack.colorRange = 2;
                            return;
                        } else {
                            if (i17 != 2) {
                                return;
                            }
                            this.currentTrack.colorRange = 1;
                            return;
                        }
                    case ID_COLOUR_TRANSFER /* 21946 */:
                        assertInTrackEntry(i14);
                        int iIsoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer((int) j8);
                        if (iIsoTransferCharacteristicsToColorTransfer != -1) {
                            this.currentTrack.colorTransfer = iIsoTransferCharacteristicsToColorTransfer;
                            return;
                        }
                        return;
                    case ID_COLOUR_PRIMARIES /* 21947 */:
                        assertInTrackEntry(i14);
                        this.currentTrack.hasColorInfo = true;
                        int iIsoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace((int) j8);
                        if (iIsoColorPrimariesToColorSpace != -1) {
                            this.currentTrack.colorSpace = iIsoColorPrimariesToColorSpace;
                            return;
                        }
                        return;
                    case ID_MAX_CLL /* 21948 */:
                        getCurrentTrack(i14).maxContentLuminance = (int) j8;
                        return;
                    case ID_MAX_FALL /* 21949 */:
                        getCurrentTrack(i14).maxFrameAverageLuminance = (int) j8;
                        return;
                    default:
                        return;
                }
        }
    }

    public boolean isLevel1Element(int i14) {
        return i14 == 357149030 || i14 == ID_CLUSTER || i14 == ID_CUES || i14 == ID_TRACKS;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int read(ExtractorInput extractorInput, PositionHolder positionHolder) {
        this.haveOutputSample = false;
        boolean z14 = true;
        while (z14 && !this.haveOutputSample) {
            z14 = this.reader.read(extractorInput);
            if (z14 && maybeSeekForCues(positionHolder, extractorInput.getPosition())) {
                return 1;
            }
        }
        if (z14) {
            return 0;
        }
        for (int i14 = 0; i14 < this.tracks.size(); i14++) {
            Track trackValueAt = this.tracks.valueAt(i14);
            trackValueAt.assertOutputInitialized();
            trackValueAt.outputPendingSampleMetadata();
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long j8, long j14) {
        this.clusterTimecodeUs = C.TIME_UNSET;
        this.blockState = 0;
        this.reader.reset();
        this.varintReader.reset();
        resetWriteSampleData();
        for (int i14 = 0; i14 < this.tracks.size(); i14++) {
            this.tracks.valueAt(i14).reset();
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean sniff(ExtractorInput extractorInput) {
        return new Sniffer().sniff(extractorInput);
    }

    public void startMasterElement(int i14, long j8, long j14) throws ParserException {
        assertInitialized();
        if (i14 == 160) {
            this.blockHasReferenceBlock = false;
            return;
        }
        if (i14 == ID_TRACK_ENTRY) {
            this.currentTrack = new Track();
            return;
        }
        if (i14 == ID_CUE_POINT) {
            this.seenClusterPositionForCurrentCuePoint = false;
            return;
        }
        if (i14 == ID_SEEK) {
            this.seekEntryId = -1;
            this.seekEntryPosition = -1L;
            return;
        }
        if (i14 == ID_CONTENT_ENCRYPTION) {
            getCurrentTrack(i14).hasContentEncryption = true;
            return;
        }
        if (i14 == ID_MASTERING_METADATA) {
            getCurrentTrack(i14).hasColorInfo = true;
            return;
        }
        if (i14 == ID_SEGMENT) {
            long j15 = this.segmentContentPosition;
            if (j15 != -1 && j15 != j8) {
                throw ParserException.createForMalformedContainer("Multiple Segment elements not supported", null);
            }
            this.segmentContentPosition = j8;
            this.segmentContentSize = j14;
            return;
        }
        if (i14 == ID_CUES) {
            this.cueTimesUs = new LongArray();
            this.cueClusterPositions = new LongArray();
        } else if (i14 == ID_CLUSTER && !this.sentSeekMap) {
            if (this.seekForCuesEnabled && this.cuesContentPosition != -1) {
                this.seekForCues = true;
            } else {
                this.extractorOutput.seekMap(new SeekMap.Unseekable(this.durationUs));
                this.sentSeekMap = true;
            }
        }
    }

    public void stringElement(int i14, String str) throws ParserException {
        if (i14 == 134) {
            getCurrentTrack(i14).codecId = str;
            return;
        }
        if (i14 != 17026) {
            if (i14 == ID_NAME) {
                getCurrentTrack(i14).name = str;
                return;
            } else {
                if (i14 != ID_LANGUAGE) {
                    return;
                }
                getCurrentTrack(i14).language = str;
                return;
            }
        }
        if (DOC_TYPE_WEBM.equals(str) || DOC_TYPE_MATROSKA.equals(str)) {
            return;
        }
        StringBuilder sb3 = new StringBuilder(v.a(22, str));
        sb3.append("DocType ");
        sb3.append(str);
        sb3.append(" not supported");
        throw ParserException.createForMalformedContainer(sb3.toString(), null);
    }

    public MatroskaExtractor(int i14) {
        this(new DefaultEbmlReader(), i14);
    }

    public MatroskaExtractor() {
        this(0);
    }
}
