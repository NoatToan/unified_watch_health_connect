package androidx.media3.extractor.mkv;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.C;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DataReader;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.LongArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.AvcConfig;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.DolbyVisionConfig;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.HevcConfig;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.TrueHdSampleRechunker;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.SubtitleTranscodingExtractorOutput;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
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
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes4.dex */
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
    public static final int FLAG_EMIT_RAW_SUBTITLE_DATA = 2;
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
    private static final int ID_COLOUR_BITS_PER_CHANNEL = 21938;
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
    private static final int ID_DISCARD_PADDING = 30114;
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
    private int blockAdditionalId;
    private long blockDurationUs;
    private int blockFlags;
    private long blockGroupDiscardPaddingNs;
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
    private final boolean parseSubtitlesDuringExtraction;
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
    private final SubtitleParser.Factory subtitleParserFactory;
    private final ParsableByteArray subtitleSample;
    private final ParsableByteArray supplementalData;
    private long timecodeScale;
    private final SparseArray<Track> tracks;
    private final VarintReader varintReader;
    private final ParsableByteArray vorbisNumPageSamples;

    @Deprecated
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: androidx.media3.extractor.mkv.MatroskaExtractor$$ExternalSyntheticLambda1
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return MatroskaExtractor.lambda$static$1();
        }
    };
    private static final byte[] SUBRIP_PREFIX = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] SSA_DIALOGUE_FORMAT = Util.getUtf8Bytes("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] SSA_PREFIX = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final byte[] VTT_PREFIX = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    private static final UUID WAVE_SUBFORMAT_PCM = new UUID(72057594037932032L, -9223371306706625679L);

    /* JADX INFO: loaded from: classes3.dex */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    protected int getElementType(int i) {
        switch (i) {
            case ID_TRACK_TYPE /* 131 */:
            case 136:
            case ID_BLOCK_DURATION /* 155 */:
            case ID_CHANNELS /* 159 */:
            case ID_PIXEL_WIDTH /* 176 */:
            case ID_CUE_TIME /* 179 */:
            case ID_PIXEL_HEIGHT /* 186 */:
            case 215:
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
            case ID_COLOUR_BITS_PER_CHANNEL /* 21938 */:
            case ID_COLOUR_RANGE /* 21945 */:
            case ID_COLOUR_TRANSFER /* 21946 */:
            case ID_COLOUR_PRIMARIES /* 21947 */:
            case ID_MAX_CLL /* 21948 */:
            case ID_MAX_FALL /* 21949 */:
            case ID_MAX_BLOCK_ADDITION_ID /* 21998 */:
            case ID_CODEC_DELAY /* 22186 */:
            case ID_SEEK_PRE_ROLL /* 22203 */:
            case ID_AUDIO_BIT_DEPTH /* 25188 */:
            case ID_DISCARD_PADDING /* 30114 */:
            case ID_PROJECTION_TYPE /* 30321 */:
            case ID_DEFAULT_DURATION /* 2352003 */:
            case ID_TIMECODE_SCALE /* 2807729 */:
                return 2;
            case 134:
            case ID_DOC_TYPE /* 17026 */:
            case ID_NAME /* 21358 */:
            case ID_LANGUAGE /* 2274716 */:
                return 3;
            case 160:
            case 166:
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
            case 161:
            case 163:
            case 165:
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

    protected boolean isLevel1Element(int i) {
        return i == 357149030 || i == ID_CLUSTER || i == ID_CUES || i == ID_TRACKS;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }

    static /* synthetic */ Extractor[] lambda$newFactory$0(SubtitleParser.Factory factory) {
        return new Extractor[]{new MatroskaExtractor(factory)};
    }

    public static ExtractorsFactory newFactory(final SubtitleParser.Factory factory) {
        return new ExtractorsFactory() { // from class: androidx.media3.extractor.mkv.MatroskaExtractor$$ExternalSyntheticLambda0
            @Override // androidx.media3.extractor.ExtractorsFactory
            public final Extractor[] createExtractors() {
                return MatroskaExtractor.lambda$newFactory$0(factory);
            }
        };
    }

    static {
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        TRACK_NAME_TO_ROTATION_DEGREES = Collections.unmodifiableMap(map);
    }

    static /* synthetic */ Extractor[] lambda$static$1() {
        return new Extractor[]{new MatroskaExtractor(SubtitleParser.Factory.UNSUPPORTED, 2)};
    }

    @Deprecated
    public MatroskaExtractor() {
        this(new DefaultEbmlReader(), 2, SubtitleParser.Factory.UNSUPPORTED);
    }

    @Deprecated
    public MatroskaExtractor(int i) {
        this(new DefaultEbmlReader(), i | 2, SubtitleParser.Factory.UNSUPPORTED);
    }

    public MatroskaExtractor(SubtitleParser.Factory factory) {
        this(new DefaultEbmlReader(), 0, factory);
    }

    public MatroskaExtractor(SubtitleParser.Factory factory, int i) {
        this(new DefaultEbmlReader(), i, factory);
    }

    MatroskaExtractor(EbmlReader ebmlReader, int i, SubtitleParser.Factory factory) {
        this.segmentContentPosition = -1L;
        this.timecodeScale = C.TIME_UNSET;
        this.durationTimecode = C.TIME_UNSET;
        this.durationUs = C.TIME_UNSET;
        this.cuesContentPosition = -1L;
        this.seekPositionAfterBuildingCues = -1L;
        this.clusterTimecodeUs = C.TIME_UNSET;
        this.reader = ebmlReader;
        ebmlReader.init(new InnerEbmlProcessor());
        this.subtitleParserFactory = factory;
        this.seekForCuesEnabled = (i & 1) == 0;
        this.parseSubtitlesDuringExtraction = (i & 2) == 0;
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
        this.supplementalData = new ParsableByteArray();
        this.blockSampleSizes = new int[1];
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean sniff(ExtractorInput extractorInput) throws IOException {
        return new Sniffer().sniff(extractorInput);
    }

    @Override // androidx.media3.extractor.Extractor
    public final void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        if (this.parseSubtitlesDuringExtraction) {
            extractorOutput = new SubtitleTranscodingExtractorOutput(extractorOutput, this.subtitleParserFactory);
        }
        this.extractorOutput = extractorOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        this.clusterTimecodeUs = C.TIME_UNSET;
        this.blockState = 0;
        this.reader.reset();
        this.varintReader.reset();
        resetWriteSampleData();
        for (int i = 0; i < this.tracks.size(); i++) {
            this.tracks.valueAt(i).reset();
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        this.haveOutputSample = false;
        boolean z = true;
        while (z && !this.haveOutputSample) {
            z = this.reader.read(extractorInput);
            if (z && maybeSeekForCues(positionHolder, extractorInput.getPosition())) {
                return 1;
            }
        }
        if (z) {
            return 0;
        }
        for (int i = 0; i < this.tracks.size(); i++) {
            Track trackValueAt = this.tracks.valueAt(i);
            trackValueAt.assertOutputInitialized();
            trackValueAt.outputPendingSampleMetadata();
        }
        return -1;
    }

    protected void startMasterElement(int i, long j, long j2) throws ParserException {
        assertInitialized();
        if (i == 160) {
            this.blockHasReferenceBlock = false;
            this.blockGroupDiscardPaddingNs = 0L;
            return;
        }
        if (i == ID_TRACK_ENTRY) {
            this.currentTrack = new Track();
            return;
        }
        if (i == ID_CUE_POINT) {
            this.seenClusterPositionForCurrentCuePoint = false;
            return;
        }
        if (i == ID_SEEK) {
            this.seekEntryId = -1;
            this.seekEntryPosition = -1L;
            return;
        }
        if (i == ID_CONTENT_ENCRYPTION) {
            getCurrentTrack(i).hasContentEncryption = true;
            return;
        }
        if (i == ID_MASTERING_METADATA) {
            getCurrentTrack(i).hasColorInfo = true;
            return;
        }
        if (i == ID_SEGMENT) {
            long j3 = this.segmentContentPosition;
            if (j3 != -1 && j3 != j) {
                throw ParserException.createForMalformedContainer("Multiple Segment elements not supported", null);
            }
            this.segmentContentPosition = j;
            this.segmentContentSize = j2;
            return;
        }
        if (i == ID_CUES) {
            this.cueTimesUs = new LongArray();
            this.cueClusterPositions = new LongArray();
        } else if (i == ID_CLUSTER && !this.sentSeekMap) {
            if (this.seekForCuesEnabled && this.cuesContentPosition != -1) {
                this.seekForCues = true;
            } else {
                this.extractorOutput.seekMap(new SeekMap.Unseekable(this.durationUs));
                this.sentSeekMap = true;
            }
        }
    }

    protected void endMasterElement(int i) throws ParserException {
        assertInitialized();
        if (i == 160) {
            if (this.blockState != 2) {
                return;
            }
            Track track = this.tracks.get(this.blockTrackNumber);
            track.assertOutputInitialized();
            if (this.blockGroupDiscardPaddingNs > 0 && CODEC_ID_OPUS.equals(track.codecId)) {
                this.supplementalData.reset(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.blockGroupDiscardPaddingNs).array());
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.blockSampleCount; i3++) {
                i2 += this.blockSampleSizes[i3];
            }
            int i4 = 0;
            while (i4 < this.blockSampleCount) {
                long j = this.blockTimeUs;
                long j2 = (track.defaultSampleDurationNs * i4) / 1000;
                int i5 = this.blockFlags;
                if (i4 == 0 && !this.blockHasReferenceBlock) {
                    i5 |= 1;
                }
                int i6 = this.blockSampleSizes[i4];
                int i7 = i2 - i6;
                commitSampleToOutput(track, j + j2, i5, i6, i7);
                i4++;
                i2 = i7;
            }
            this.blockState = 0;
            return;
        }
        if (i == ID_TRACK_ENTRY) {
            Track track2 = (Track) Assertions.checkStateNotNull(this.currentTrack);
            if (track2.codecId == null) {
                throw ParserException.createForMalformedContainer("CodecId is missing in TrackEntry element", null);
            }
            if (isCodecSupported(track2.codecId)) {
                track2.initializeOutput(this.extractorOutput, track2.number);
                this.tracks.put(track2.number, track2);
            }
            this.currentTrack = null;
            return;
        }
        if (i == ID_SEEK) {
            int i8 = this.seekEntryId;
            if (i8 != -1) {
                long j3 = this.seekEntryPosition;
                if (j3 != -1) {
                    if (i8 == ID_CUES) {
                        this.cuesContentPosition = j3;
                        return;
                    }
                    return;
                }
            }
            throw ParserException.createForMalformedContainer("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i == ID_CONTENT_ENCODING) {
            assertInTrackEntry(i);
            if (this.currentTrack.hasContentEncryption) {
                if (this.currentTrack.cryptoData == null) {
                    throw ParserException.createForMalformedContainer("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                this.currentTrack.drmInitData = new DrmInitData(new DrmInitData.SchemeData(C.UUID_NIL, MimeTypes.VIDEO_WEBM, this.currentTrack.cryptoData.encryptionKey));
                return;
            }
            return;
        }
        if (i == ID_CONTENT_ENCODINGS) {
            assertInTrackEntry(i);
            if (this.currentTrack.hasContentEncryption && this.currentTrack.sampleStrippedBytes != null) {
                throw ParserException.createForMalformedContainer("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i == 357149030) {
            if (this.timecodeScale == C.TIME_UNSET) {
                this.timecodeScale = 1000000L;
            }
            long j4 = this.durationTimecode;
            if (j4 != C.TIME_UNSET) {
                this.durationUs = scaleTimecodeToUs(j4);
                return;
            }
            return;
        }
        if (i != ID_TRACKS) {
            if (i != ID_CUES) {
                return;
            }
            if (!this.sentSeekMap) {
                this.extractorOutput.seekMap(buildSeekMap(this.cueTimesUs, this.cueClusterPositions));
                this.sentSeekMap = true;
            }
            this.cueTimesUs = null;
            this.cueClusterPositions = null;
        } else {
            if (this.tracks.size() == 0) {
                throw ParserException.createForMalformedContainer("No valid tracks were found", null);
            }
            this.extractorOutput.endTracks();
        }
    }

    protected void integerElement(int i, long j) throws ParserException {
        if (i == ID_CONTENT_ENCODING_ORDER) {
            if (j == 0) {
                return;
            }
            throw ParserException.createForMalformedContainer("ContentEncodingOrder " + j + " not supported", null);
        }
        if (i == ID_CONTENT_ENCODING_SCOPE) {
            if (j == 1) {
                return;
            }
            throw ParserException.createForMalformedContainer("ContentEncodingScope " + j + " not supported", null);
        }
        switch (i) {
            case ID_TRACK_TYPE /* 131 */:
                getCurrentTrack(i).type = (int) j;
                return;
            case 136:
                getCurrentTrack(i).flagDefault = j == 1;
                return;
            case ID_BLOCK_DURATION /* 155 */:
                this.blockDurationUs = scaleTimecodeToUs(j);
                return;
            case ID_CHANNELS /* 159 */:
                getCurrentTrack(i).channelCount = (int) j;
                return;
            case ID_PIXEL_WIDTH /* 176 */:
                getCurrentTrack(i).width = (int) j;
                return;
            case ID_CUE_TIME /* 179 */:
                assertInCues(i);
                this.cueTimesUs.add(scaleTimecodeToUs(j));
                return;
            case ID_PIXEL_HEIGHT /* 186 */:
                getCurrentTrack(i).height = (int) j;
                return;
            case 215:
                getCurrentTrack(i).number = (int) j;
                return;
            case ID_TIME_CODE /* 231 */:
                this.clusterTimecodeUs = scaleTimecodeToUs(j);
                return;
            case ID_BLOCK_ADD_ID /* 238 */:
                this.blockAdditionalId = (int) j;
                return;
            case ID_CUE_CLUSTER_POSITION /* 241 */:
                if (this.seenClusterPositionForCurrentCuePoint) {
                    return;
                }
                assertInCues(i);
                this.cueClusterPositions.add(j);
                this.seenClusterPositionForCurrentCuePoint = true;
                return;
            case ID_REFERENCE_BLOCK /* 251 */:
                this.blockHasReferenceBlock = true;
                return;
            case ID_BLOCK_ADD_ID_TYPE /* 16871 */:
                getCurrentTrack(i).blockAddIdType = (int) j;
                return;
            case ID_CONTENT_COMPRESSION_ALGORITHM /* 16980 */:
                if (j == 3) {
                    return;
                }
                throw ParserException.createForMalformedContainer("ContentCompAlgo " + j + " not supported", null);
            case ID_DOC_TYPE_READ_VERSION /* 17029 */:
                if (j < 1 || j > 2) {
                    throw ParserException.createForMalformedContainer("DocTypeReadVersion " + j + " not supported", null);
                }
                return;
            case ID_EBML_READ_VERSION /* 17143 */:
                if (j == 1) {
                    return;
                }
                throw ParserException.createForMalformedContainer("EBMLReadVersion " + j + " not supported", null);
            case ID_CONTENT_ENCRYPTION_ALGORITHM /* 18401 */:
                if (j == 5) {
                    return;
                }
                throw ParserException.createForMalformedContainer("ContentEncAlgo " + j + " not supported", null);
            case ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE /* 18408 */:
                if (j == 1) {
                    return;
                }
                throw ParserException.createForMalformedContainer("AESSettingsCipherMode " + j + " not supported", null);
            case ID_SEEK_POSITION /* 21420 */:
                this.seekEntryPosition = j + this.segmentContentPosition;
                return;
            case ID_STEREO_MODE /* 21432 */:
                int i2 = (int) j;
                assertInTrackEntry(i);
                if (i2 == 0) {
                    this.currentTrack.stereoMode = 0;
                    return;
                }
                if (i2 == 1) {
                    this.currentTrack.stereoMode = 2;
                    return;
                } else if (i2 == 3) {
                    this.currentTrack.stereoMode = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    this.currentTrack.stereoMode = 3;
                    return;
                }
            case ID_DISPLAY_WIDTH /* 21680 */:
                getCurrentTrack(i).displayWidth = (int) j;
                return;
            case ID_DISPLAY_UNIT /* 21682 */:
                getCurrentTrack(i).displayUnit = (int) j;
                return;
            case ID_DISPLAY_HEIGHT /* 21690 */:
                getCurrentTrack(i).displayHeight = (int) j;
                return;
            case ID_FLAG_FORCED /* 21930 */:
                getCurrentTrack(i).flagForced = j == 1;
                return;
            case ID_COLOUR_BITS_PER_CHANNEL /* 21938 */:
                assertInTrackEntry(i);
                this.currentTrack.hasColorInfo = true;
                this.currentTrack.bitsPerChannel = (int) j;
                return;
            case ID_MAX_BLOCK_ADDITION_ID /* 21998 */:
                getCurrentTrack(i).maxBlockAdditionId = (int) j;
                return;
            case ID_CODEC_DELAY /* 22186 */:
                getCurrentTrack(i).codecDelayNs = j;
                return;
            case ID_SEEK_PRE_ROLL /* 22203 */:
                getCurrentTrack(i).seekPreRollNs = j;
                return;
            case ID_AUDIO_BIT_DEPTH /* 25188 */:
                getCurrentTrack(i).audioBitDepth = (int) j;
                return;
            case ID_DISCARD_PADDING /* 30114 */:
                this.blockGroupDiscardPaddingNs = j;
                return;
            case ID_PROJECTION_TYPE /* 30321 */:
                assertInTrackEntry(i);
                int i3 = (int) j;
                if (i3 == 0) {
                    this.currentTrack.projectionType = 0;
                    return;
                }
                if (i3 == 1) {
                    this.currentTrack.projectionType = 1;
                    return;
                } else if (i3 == 2) {
                    this.currentTrack.projectionType = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.currentTrack.projectionType = 3;
                    return;
                }
            case ID_DEFAULT_DURATION /* 2352003 */:
                getCurrentTrack(i).defaultSampleDurationNs = (int) j;
                return;
            case ID_TIMECODE_SCALE /* 2807729 */:
                this.timecodeScale = j;
                return;
            default:
                switch (i) {
                    case ID_COLOUR_RANGE /* 21945 */:
                        assertInTrackEntry(i);
                        int i4 = (int) j;
                        if (i4 == 1) {
                            this.currentTrack.colorRange = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            this.currentTrack.colorRange = 1;
                            return;
                        }
                    case ID_COLOUR_TRANSFER /* 21946 */:
                        assertInTrackEntry(i);
                        int iIsoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer((int) j);
                        if (iIsoTransferCharacteristicsToColorTransfer != -1) {
                            this.currentTrack.colorTransfer = iIsoTransferCharacteristicsToColorTransfer;
                            return;
                        }
                        return;
                    case ID_COLOUR_PRIMARIES /* 21947 */:
                        assertInTrackEntry(i);
                        this.currentTrack.hasColorInfo = true;
                        int iIsoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace((int) j);
                        if (iIsoColorPrimariesToColorSpace != -1) {
                            this.currentTrack.colorSpace = iIsoColorPrimariesToColorSpace;
                            return;
                        }
                        return;
                    case ID_MAX_CLL /* 21948 */:
                        getCurrentTrack(i).maxContentLuminance = (int) j;
                        return;
                    case ID_MAX_FALL /* 21949 */:
                        getCurrentTrack(i).maxFrameAverageLuminance = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    protected void floatElement(int i, double d) throws ParserException {
        if (i == ID_SAMPLING_FREQUENCY) {
            getCurrentTrack(i).sampleRate = (int) d;
            return;
        }
        if (i == ID_DURATION) {
            this.durationTimecode = (long) d;
            return;
        }
        switch (i) {
            case ID_PRIMARY_R_CHROMATICITY_X /* 21969 */:
                getCurrentTrack(i).primaryRChromaticityX = (float) d;
                break;
            case ID_PRIMARY_R_CHROMATICITY_Y /* 21970 */:
                getCurrentTrack(i).primaryRChromaticityY = (float) d;
                break;
            case ID_PRIMARY_G_CHROMATICITY_X /* 21971 */:
                getCurrentTrack(i).primaryGChromaticityX = (float) d;
                break;
            case ID_PRIMARY_G_CHROMATICITY_Y /* 21972 */:
                getCurrentTrack(i).primaryGChromaticityY = (float) d;
                break;
            case ID_PRIMARY_B_CHROMATICITY_X /* 21973 */:
                getCurrentTrack(i).primaryBChromaticityX = (float) d;
                break;
            case ID_PRIMARY_B_CHROMATICITY_Y /* 21974 */:
                getCurrentTrack(i).primaryBChromaticityY = (float) d;
                break;
            case ID_WHITE_POINT_CHROMATICITY_X /* 21975 */:
                getCurrentTrack(i).whitePointChromaticityX = (float) d;
                break;
            case ID_WHITE_POINT_CHROMATICITY_Y /* 21976 */:
                getCurrentTrack(i).whitePointChromaticityY = (float) d;
                break;
            case ID_LUMNINANCE_MAX /* 21977 */:
                getCurrentTrack(i).maxMasteringLuminance = (float) d;
                break;
            case ID_LUMNINANCE_MIN /* 21978 */:
                getCurrentTrack(i).minMasteringLuminance = (float) d;
                break;
            default:
                switch (i) {
                    case ID_PROJECTION_POSE_YAW /* 30323 */:
                        getCurrentTrack(i).projectionPoseYaw = (float) d;
                        break;
                    case ID_PROJECTION_POSE_PITCH /* 30324 */:
                        getCurrentTrack(i).projectionPosePitch = (float) d;
                        break;
                    case ID_PROJECTION_POSE_ROLL /* 30325 */:
                        getCurrentTrack(i).projectionPoseRoll = (float) d;
                        break;
                }
                break;
        }
    }

    protected void stringElement(int i, String str) throws ParserException {
        if (i == 134) {
            getCurrentTrack(i).codecId = str;
            return;
        }
        if (i != ID_DOC_TYPE) {
            if (i == ID_NAME) {
                getCurrentTrack(i).name = str;
                return;
            } else {
                if (i != ID_LANGUAGE) {
                    return;
                }
                getCurrentTrack(i).language = str;
                return;
            }
        }
        if (DOC_TYPE_WEBM.equals(str) || DOC_TYPE_MATROSKA.equals(str)) {
            return;
        }
        throw ParserException.createForMalformedContainer("DocType " + str + " not supported", null);
    }

    protected void binaryElement(int i, int i2, ExtractorInput extractorInput) throws IOException {
        int i3;
        long j;
        int i4;
        int i5;
        int i6;
        Throwable th = null;
        int i7 = 0;
        int i8 = 1;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (this.blockState != 2) {
                    return;
                }
                handleBlockAdditionalData(this.tracks.get(this.blockTrackNumber), this.blockAdditionalId, extractorInput, i2);
                return;
            }
            if (i == ID_BLOCK_ADD_ID_EXTRA_DATA) {
                handleBlockAddIDExtraData(getCurrentTrack(i), extractorInput, i2);
                return;
            }
            if (i == ID_CONTENT_COMPRESSION_SETTINGS) {
                assertInTrackEntry(i);
                this.currentTrack.sampleStrippedBytes = new byte[i2];
                extractorInput.readFully(this.currentTrack.sampleStrippedBytes, 0, i2);
                return;
            }
            if (i == ID_CONTENT_ENCRYPTION_KEY_ID) {
                byte[] bArr = new byte[i2];
                extractorInput.readFully(bArr, 0, i2);
                getCurrentTrack(i).cryptoData = new TrackOutput.CryptoData(1, bArr, 0, 0);
                return;
            }
            if (i == ID_SEEK_ID) {
                Arrays.fill(this.seekEntryIdBytes.getData(), (byte) 0);
                extractorInput.readFully(this.seekEntryIdBytes.getData(), 4 - i2, i2);
                this.seekEntryIdBytes.setPosition(0);
                this.seekEntryId = (int) this.seekEntryIdBytes.readUnsignedInt();
                return;
            }
            if (i == ID_CODEC_PRIVATE) {
                assertInTrackEntry(i);
                this.currentTrack.codecPrivate = new byte[i2];
                extractorInput.readFully(this.currentTrack.codecPrivate, 0, i2);
                return;
            } else if (i == ID_PROJECTION_PRIVATE) {
                assertInTrackEntry(i);
                this.currentTrack.projectionData = new byte[i2];
                extractorInput.readFully(this.currentTrack.projectionData, 0, i2);
                return;
            } else {
                throw ParserException.createForMalformedContainer("Unexpected id: " + i, null);
            }
        }
        if (this.blockState == 0) {
            this.blockTrackNumber = (int) this.varintReader.readUnsignedVarint(extractorInput, false, true, 8);
            this.blockTrackNumberLength = this.varintReader.getLastLength();
            this.blockDurationUs = C.TIME_UNSET;
            this.blockState = 1;
            this.scratch.reset(0);
        }
        Track track = this.tracks.get(this.blockTrackNumber);
        if (track == null) {
            extractorInput.skipFully(i2 - this.blockTrackNumberLength);
            this.blockState = 0;
            return;
        }
        track.assertOutputInitialized();
        if (this.blockState == 1) {
            readScratch(extractorInput, 3);
            int i9 = (this.scratch.getData()[2] & 6) >> 1;
            if (i9 == 0) {
                this.blockSampleCount = 1;
                int[] iArrEnsureArrayCapacity = ensureArrayCapacity(this.blockSampleSizes, 1);
                this.blockSampleSizes = iArrEnsureArrayCapacity;
                iArrEnsureArrayCapacity[0] = (i2 - this.blockTrackNumberLength) - 3;
            } else {
                int i10 = 4;
                readScratch(extractorInput, 4);
                int i11 = (this.scratch.getData()[3] & 255) + 1;
                this.blockSampleCount = i11;
                int[] iArrEnsureArrayCapacity2 = ensureArrayCapacity(this.blockSampleSizes, i11);
                this.blockSampleSizes = iArrEnsureArrayCapacity2;
                if (i9 == 2) {
                    int i12 = this.blockTrackNumberLength;
                    int i13 = this.blockSampleCount;
                    Arrays.fill(iArrEnsureArrayCapacity2, 0, i13, ((i2 - i12) - 4) / i13);
                } else if (i9 == 1) {
                    int i14 = 0;
                    int i15 = 0;
                    while (true) {
                        i4 = this.blockSampleCount - 1;
                        if (i14 >= i4) {
                            break;
                        }
                        this.blockSampleSizes[i14] = 0;
                        while (true) {
                            i5 = i10 + 1;
                            readScratch(extractorInput, i5);
                            int i16 = this.scratch.getData()[i10] & 255;
                            int[] iArr = this.blockSampleSizes;
                            i6 = iArr[i14] + i16;
                            iArr[i14] = i6;
                            if (i16 != 255) {
                                break;
                            } else {
                                i10 = i5;
                            }
                        }
                        i15 += i6;
                        i14++;
                        i10 = i5;
                    }
                    this.blockSampleSizes[i4] = ((i2 - this.blockTrackNumberLength) - i10) - i15;
                } else {
                    if (i9 != 3) {
                        throw ParserException.createForMalformedContainer("Unexpected lacing value: " + i9, null);
                    }
                    int i17 = 0;
                    int i18 = 0;
                    while (true) {
                        int i19 = this.blockSampleCount - i8;
                        if (i17 < i19) {
                            this.blockSampleSizes[i17] = i7;
                            int i20 = i10 + 1;
                            readScratch(extractorInput, i20);
                            if (this.scratch.getData()[i10] == 0) {
                                throw ParserException.createForMalformedContainer("No valid varint length mask found", th);
                            }
                            int i21 = i7;
                            while (true) {
                                if (i21 >= 8) {
                                    j = 0;
                                    i10 = i20;
                                    break;
                                }
                                int i22 = i8 << (7 - i21);
                                if ((this.scratch.getData()[i10] & i22) != 0) {
                                    int i23 = i20 + i21;
                                    readScratch(extractorInput, i23);
                                    j = (~i22) & this.scratch.getData()[i10] & 255;
                                    while (i20 < i23) {
                                        j = (j << 8) | ((long) (this.scratch.getData()[i20] & 255));
                                        i20++;
                                        i23 = i23;
                                    }
                                    int i24 = i23;
                                    if (i17 > 0) {
                                        j -= (1 << ((i21 * 7) + 6)) - 1;
                                    }
                                    i10 = i24;
                                    break;
                                }
                                i21++;
                                i8 = 1;
                            }
                            if (j < -2147483648L || j > 2147483647L) {
                                throw ParserException.createForMalformedContainer("EBML lacing sample size out of range.", null);
                            }
                            int i25 = (int) j;
                            int[] iArr2 = this.blockSampleSizes;
                            if (i17 != 0) {
                                i25 += iArr2[i17 - 1];
                            }
                            iArr2[i17] = i25;
                            i18 += i25;
                            i17++;
                            th = null;
                            i7 = 0;
                            i8 = 1;
                        } else {
                            this.blockSampleSizes[i19] = ((i2 - this.blockTrackNumberLength) - i10) - i18;
                            break;
                        }
                    }
                }
            }
            this.blockTimeUs = this.clusterTimecodeUs + scaleTimecodeToUs((this.scratch.getData()[0] << 8) | (this.scratch.getData()[1] & 255));
            this.blockFlags = (track.type == 2 || (i == 163 && (this.scratch.getData()[2] & 128) == 128)) ? 1 : 0;
            this.blockState = 2;
            this.blockSampleIndex = 0;
            i3 = 163;
        } else {
            i3 = 163;
        }
        if (i == i3) {
            while (true) {
                int i26 = this.blockSampleIndex;
                if (i26 < this.blockSampleCount) {
                    commitSampleToOutput(track, ((long) ((this.blockSampleIndex * track.defaultSampleDurationNs) / 1000)) + this.blockTimeUs, this.blockFlags, writeSampleData(extractorInput, track, this.blockSampleSizes[i26], false), 0);
                    this.blockSampleIndex++;
                } else {
                    this.blockState = 0;
                    return;
                }
            }
        } else {
            while (true) {
                int i27 = this.blockSampleIndex;
                if (i27 >= this.blockSampleCount) {
                    return;
                }
                int[] iArr3 = this.blockSampleSizes;
                iArr3[i27] = writeSampleData(extractorInput, track, iArr3[i27], true);
                this.blockSampleIndex++;
            }
        }
    }

    protected void handleBlockAddIDExtraData(Track track, ExtractorInput extractorInput, int i) throws IOException {
        if (track.blockAddIdType == 1685485123 || track.blockAddIdType == 1685480259) {
            track.dolbyVisionConfigBytes = new byte[i];
            extractorInput.readFully(track.dolbyVisionConfigBytes, 0, i);
        } else {
            extractorInput.skipFully(i);
        }
    }

    protected void handleBlockAdditionalData(Track track, int i, ExtractorInput extractorInput, int i2) throws IOException {
        if (i == 4 && CODEC_ID_VP9.equals(track.codecId)) {
            this.supplementalData.reset(i2);
            extractorInput.readFully(this.supplementalData.getData(), 0, i2);
        } else {
            extractorInput.skipFully(i2);
        }
    }

    @EnsuresNonNull({"currentTrack"})
    private void assertInTrackEntry(int i) throws ParserException {
        if (this.currentTrack != null) {
            return;
        }
        throw ParserException.createForMalformedContainer("Element " + i + " must be in a TrackEntry", null);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    private void assertInCues(int i) throws ParserException {
        if (this.cueTimesUs == null || this.cueClusterPositions == null) {
            throw ParserException.createForMalformedContainer("Element " + i + " must be in a Cues", null);
        }
    }

    protected Track getCurrentTrack(int i) throws ParserException {
        assertInTrackEntry(i);
        return this.currentTrack;
    }

    @RequiresNonNull({"#1.output"})
    private void commitSampleToOutput(Track track, long j, int i, int i2, int i3) {
        int iLimit;
        if (track.trueHdSampleRechunker != null) {
            track.trueHdSampleRechunker.sampleMetadata(track.output, j, i, i2, i3, track.cryptoData);
        } else {
            if (CODEC_ID_SUBRIP.equals(track.codecId) || CODEC_ID_ASS.equals(track.codecId) || CODEC_ID_VTT.equals(track.codecId)) {
                if (this.blockSampleCount > 1) {
                    Log.w(TAG, "Skipping subtitle sample in laced block.");
                } else if (this.blockDurationUs == C.TIME_UNSET) {
                    Log.w(TAG, "Skipping subtitle sample with no duration.");
                } else {
                    setSubtitleEndTime(track.codecId, this.blockDurationUs, this.subtitleSample.getData());
                    for (int position = this.subtitleSample.getPosition(); position < this.subtitleSample.limit(); position++) {
                        if (this.subtitleSample.getData()[position] == 0) {
                            this.subtitleSample.setLimit(position);
                            break;
                        }
                    }
                    TrackOutput trackOutput = track.output;
                    ParsableByteArray parsableByteArray = this.subtitleSample;
                    trackOutput.sampleData(parsableByteArray, parsableByteArray.limit());
                    iLimit = i2 + this.subtitleSample.limit();
                }
                iLimit = i2;
            } else {
                iLimit = i2;
            }
            if ((i & 268435456) != 0) {
                if (this.blockSampleCount > 1) {
                    this.supplementalData.reset(0);
                } else {
                    int iLimit2 = this.supplementalData.limit();
                    track.output.sampleData(this.supplementalData, iLimit2, 2);
                    iLimit += iLimit2;
                }
            }
            track.output.sampleMetadata(j, i, iLimit, i3, track.cryptoData);
        }
        this.haveOutputSample = true;
    }

    private void readScratch(ExtractorInput extractorInput, int i) throws IOException {
        if (this.scratch.limit() >= i) {
            return;
        }
        if (this.scratch.capacity() < i) {
            ParsableByteArray parsableByteArray = this.scratch;
            parsableByteArray.ensureCapacity(Math.max(parsableByteArray.capacity() * 2, i));
        }
        extractorInput.readFully(this.scratch.getData(), this.scratch.limit(), i - this.scratch.limit());
        this.scratch.setLimit(i);
    }

    @RequiresNonNull({"#2.output"})
    private int writeSampleData(ExtractorInput extractorInput, Track track, int i, boolean z) throws IOException {
        int i2;
        if (CODEC_ID_SUBRIP.equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, SUBRIP_PREFIX, i);
            return finishWriteSampleData();
        }
        if (CODEC_ID_ASS.equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, SSA_PREFIX, i);
            return finishWriteSampleData();
        }
        if (CODEC_ID_VTT.equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, VTT_PREFIX, i);
            return finishWriteSampleData();
        }
        TrackOutput trackOutput = track.output;
        if (!this.sampleEncodingHandled) {
            if (track.hasContentEncryption) {
                this.blockFlags &= -1073741825;
                if (!this.sampleSignalByteRead) {
                    extractorInput.readFully(this.scratch.getData(), 0, 1);
                    this.sampleBytesRead++;
                    if ((this.scratch.getData()[0] & 128) == 128) {
                        throw ParserException.createForMalformedContainer("Extension bit is set in signal byte", null);
                    }
                    this.sampleSignalByte = this.scratch.getData()[0];
                    this.sampleSignalByteRead = true;
                }
                byte b2 = this.sampleSignalByte;
                if ((b2 & 1) == 1) {
                    boolean z2 = (b2 & 2) == 2;
                    this.blockFlags |= 1073741824;
                    if (!this.sampleInitializationVectorRead) {
                        extractorInput.readFully(this.encryptionInitializationVector.getData(), 0, 8);
                        this.sampleBytesRead += 8;
                        this.sampleInitializationVectorRead = true;
                        this.scratch.getData()[0] = (byte) ((z2 ? 128 : 0) | 8);
                        this.scratch.setPosition(0);
                        trackOutput.sampleData(this.scratch, 1, 1);
                        this.sampleBytesWritten++;
                        this.encryptionInitializationVector.setPosition(0);
                        trackOutput.sampleData(this.encryptionInitializationVector, 8, 1);
                        this.sampleBytesWritten += 8;
                    }
                    if (z2) {
                        if (!this.samplePartitionCountRead) {
                            extractorInput.readFully(this.scratch.getData(), 0, 1);
                            this.sampleBytesRead++;
                            this.scratch.setPosition(0);
                            this.samplePartitionCount = this.scratch.readUnsignedByte();
                            this.samplePartitionCountRead = true;
                        }
                        int i3 = this.samplePartitionCount * 4;
                        this.scratch.reset(i3);
                        extractorInput.readFully(this.scratch.getData(), 0, i3);
                        this.sampleBytesRead += i3;
                        short s = (short) ((this.samplePartitionCount / 2) + 1);
                        int i4 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.encryptionSubsampleDataBuffer;
                        if (byteBuffer == null || byteBuffer.capacity() < i4) {
                            this.encryptionSubsampleDataBuffer = ByteBuffer.allocate(i4);
                        }
                        this.encryptionSubsampleDataBuffer.position(0);
                        this.encryptionSubsampleDataBuffer.putShort(s);
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            i2 = this.samplePartitionCount;
                            if (i5 >= i2) {
                                break;
                            }
                            int unsignedIntToInt = this.scratch.readUnsignedIntToInt();
                            if (i5 % 2 == 0) {
                                this.encryptionSubsampleDataBuffer.putShort((short) (unsignedIntToInt - i6));
                            } else {
                                this.encryptionSubsampleDataBuffer.putInt(unsignedIntToInt - i6);
                            }
                            i5++;
                            i6 = unsignedIntToInt;
                        }
                        int i7 = (i - this.sampleBytesRead) - i6;
                        if (i2 % 2 == 1) {
                            this.encryptionSubsampleDataBuffer.putInt(i7);
                        } else {
                            this.encryptionSubsampleDataBuffer.putShort((short) i7);
                            this.encryptionSubsampleDataBuffer.putInt(0);
                        }
                        this.encryptionSubsampleData.reset(this.encryptionSubsampleDataBuffer.array(), i4);
                        trackOutput.sampleData(this.encryptionSubsampleData, i4, 1);
                        this.sampleBytesWritten += i4;
                    }
                }
            } else if (track.sampleStrippedBytes != null) {
                this.sampleStrippedBytes.reset(track.sampleStrippedBytes, track.sampleStrippedBytes.length);
            }
            if (track.samplesHaveSupplementalData(z)) {
                this.blockFlags |= 268435456;
                this.supplementalData.reset(0);
                int iLimit = (this.sampleStrippedBytes.limit() + i) - this.sampleBytesRead;
                this.scratch.reset(4);
                this.scratch.getData()[0] = (byte) ((iLimit >> 24) & 255);
                this.scratch.getData()[1] = (byte) ((iLimit >> 16) & 255);
                this.scratch.getData()[2] = (byte) ((iLimit >> 8) & 255);
                this.scratch.getData()[3] = (byte) (iLimit & 255);
                trackOutput.sampleData(this.scratch, 4, 2);
                this.sampleBytesWritten += 4;
            }
            this.sampleEncodingHandled = true;
        }
        int iLimit2 = i + this.sampleStrippedBytes.limit();
        if (CODEC_ID_H264.equals(track.codecId) || CODEC_ID_H265.equals(track.codecId)) {
            byte[] data = this.nalLength.getData();
            data[0] = 0;
            data[1] = 0;
            data[2] = 0;
            int i8 = track.nalUnitLengthFieldLength;
            int i9 = track.nalUnitLengthFieldLength;
            while (this.sampleBytesRead < iLimit2) {
                int i10 = this.sampleCurrentNalBytesRemaining;
                if (i10 == 0) {
                    writeToTarget(extractorInput, data, 4 - i9, i8);
                    this.sampleBytesRead += i8;
                    this.nalLength.setPosition(0);
                    this.sampleCurrentNalBytesRemaining = this.nalLength.readUnsignedIntToInt();
                    this.nalStartCode.setPosition(0);
                    trackOutput.sampleData(this.nalStartCode, 4);
                    this.sampleBytesWritten += 4;
                } else {
                    int iWriteToOutput = writeToOutput(extractorInput, trackOutput, i10);
                    this.sampleBytesRead += iWriteToOutput;
                    this.sampleBytesWritten += iWriteToOutput;
                    this.sampleCurrentNalBytesRemaining -= iWriteToOutput;
                }
            }
        } else {
            if (track.trueHdSampleRechunker != null) {
                Assertions.checkState(this.sampleStrippedBytes.limit() == 0);
                track.trueHdSampleRechunker.startSample(extractorInput);
            }
            while (true) {
                int i11 = this.sampleBytesRead;
                if (i11 >= iLimit2) {
                    break;
                }
                int iWriteToOutput2 = writeToOutput(extractorInput, trackOutput, iLimit2 - i11);
                this.sampleBytesRead += iWriteToOutput2;
                this.sampleBytesWritten += iWriteToOutput2;
            }
        }
        if (CODEC_ID_VORBIS.equals(track.codecId)) {
            this.vorbisNumPageSamples.setPosition(0);
            trackOutput.sampleData(this.vorbisNumPageSamples, 4);
            this.sampleBytesWritten += 4;
        }
        return finishWriteSampleData();
    }

    private int finishWriteSampleData() {
        int i = this.sampleBytesWritten;
        resetWriteSampleData();
        return i;
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

    private void writeSubtitleSampleData(ExtractorInput extractorInput, byte[] bArr, int i) throws IOException {
        int length = bArr.length + i;
        if (this.subtitleSample.capacity() < length) {
            this.subtitleSample.reset(Arrays.copyOf(bArr, length + i));
        } else {
            System.arraycopy(bArr, 0, this.subtitleSample.getData(), 0, bArr.length);
        }
        extractorInput.readFully(this.subtitleSample.getData(), bArr.length, i);
        this.subtitleSample.setPosition(0);
        this.subtitleSample.setLimit(length);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    private static void setSubtitleEndTime(String str, long j, byte[] bArr) {
        byte b2;
        byte[] subtitleTimecode;
        int i;
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != 738597099) {
            if (iHashCode != 1045209816) {
                if (iHashCode == 1422270023 && str.equals(CODEC_ID_SUBRIP)) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals(CODEC_ID_VTT)) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals(CODEC_ID_ASS)) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            subtitleTimecode = formatSubtitleTimecode(j, SSA_TIMECODE_FORMAT, 10000L);
            i = 21;
        } else if (b2 == 1) {
            subtitleTimecode = formatSubtitleTimecode(j, VTT_TIMECODE_FORMAT, 1000L);
            i = 25;
        } else if (b2 == 2) {
            subtitleTimecode = formatSubtitleTimecode(j, SUBRIP_TIMECODE_FORMAT, 1000L);
            i = 19;
        } else {
            throw new IllegalArgumentException();
        }
        System.arraycopy(subtitleTimecode, 0, bArr, i, subtitleTimecode.length);
    }

    private static byte[] formatSubtitleTimecode(long j, String str, long j2) {
        Assertions.checkArgument(j != C.TIME_UNSET);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) i) * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) i2) * 60000000);
        int i3 = (int) (j4 / 1000000);
        return Util.getUtf8Bytes(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2))));
    }

    private void writeToTarget(ExtractorInput extractorInput, byte[] bArr, int i, int i2) throws IOException {
        int iMin = Math.min(i2, this.sampleStrippedBytes.bytesLeft());
        extractorInput.readFully(bArr, i + iMin, i2 - iMin);
        if (iMin > 0) {
            this.sampleStrippedBytes.readBytes(bArr, i, iMin);
        }
    }

    private int writeToOutput(ExtractorInput extractorInput, TrackOutput trackOutput, int i) throws IOException {
        int iBytesLeft = this.sampleStrippedBytes.bytesLeft();
        if (iBytesLeft > 0) {
            int iMin = Math.min(i, iBytesLeft);
            trackOutput.sampleData(this.sampleStrippedBytes, iMin);
            return iMin;
        }
        return trackOutput.sampleData((DataReader) extractorInput, i, false);
    }

    private SeekMap buildSeekMap(LongArray longArray, LongArray longArray2) {
        int i;
        if (this.segmentContentPosition == -1 || this.durationUs == C.TIME_UNSET || longArray == null || longArray.size() == 0 || longArray2 == null || longArray2.size() != longArray.size()) {
            return new SeekMap.Unseekable(this.durationUs);
        }
        int size = longArray.size();
        int[] iArrCopyOf = new int[size];
        long[] jArrCopyOf = new long[size];
        long[] jArrCopyOf2 = new long[size];
        long[] jArrCopyOf3 = new long[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            jArrCopyOf3[i3] = longArray.get(i3);
            jArrCopyOf[i3] = this.segmentContentPosition + longArray2.get(i3);
        }
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            int i4 = i2 + 1;
            iArrCopyOf[i2] = (int) (jArrCopyOf[i4] - jArrCopyOf[i2]);
            jArrCopyOf2[i2] = jArrCopyOf3[i4] - jArrCopyOf3[i2];
            i2 = i4;
        }
        iArrCopyOf[i] = (int) ((this.segmentContentPosition + this.segmentContentSize) - jArrCopyOf[i]);
        long j = this.durationUs - jArrCopyOf3[i];
        jArrCopyOf2[i] = j;
        if (j <= 0) {
            Log.w(TAG, "Discarding last cue point with unexpected duration: " + j);
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i);
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i);
            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i);
            jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i);
        }
        return new ChunkIndex(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
    }

    private boolean maybeSeekForCues(PositionHolder positionHolder, long j) {
        if (this.seekForCues) {
            this.seekPositionAfterBuildingCues = j;
            positionHolder.position = this.cuesContentPosition;
            this.seekForCues = false;
            return true;
        }
        if (this.sentSeekMap) {
            long j2 = this.seekPositionAfterBuildingCues;
            if (j2 != -1) {
                positionHolder.position = j2;
                this.seekPositionAfterBuildingCues = -1L;
                return true;
            }
        }
        return false;
    }

    private long scaleTimecodeToUs(long j) throws ParserException {
        long j2 = this.timecodeScale;
        if (j2 == C.TIME_UNSET) {
            throw ParserException.createForMalformedContainer("Can't scale timecode prior to timecodeScale being set.", null);
        }
        return Util.scaleLargeTimestamp(j, j2, 1000L);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:137:0x01c4  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static boolean isCodecSupported(String str) {
        byte b2;
        str.hashCode();
        switch (str.hashCode()) {
            case -2095576542:
                if (!str.equals(CODEC_ID_MPEG4_AP)) {
                    b2 = -1;
                } else {
                    b2 = 0;
                }
                break;
            case -2095575984:
                if (!str.equals(CODEC_ID_MPEG4_SP)) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
                break;
            case -1985379776:
                if (!str.equals(CODEC_ID_ACM)) {
                    b2 = -1;
                } else {
                    b2 = 2;
                }
                break;
            case -1784763192:
                if (!str.equals(CODEC_ID_TRUEHD)) {
                    b2 = -1;
                } else {
                    b2 = 3;
                }
                break;
            case -1730367663:
                if (!str.equals(CODEC_ID_VORBIS)) {
                    b2 = -1;
                } else {
                    b2 = 4;
                }
                break;
            case -1482641358:
                if (!str.equals(CODEC_ID_MP2)) {
                    b2 = -1;
                } else {
                    b2 = 5;
                }
                break;
            case -1482641357:
                if (!str.equals(CODEC_ID_MP3)) {
                    b2 = -1;
                } else {
                    b2 = 6;
                }
                break;
            case -1373388978:
                if (!str.equals(CODEC_ID_FOURCC)) {
                    b2 = -1;
                } else {
                    b2 = 7;
                }
                break;
            case -933872740:
                if (!str.equals(CODEC_ID_DVBSUB)) {
                    b2 = -1;
                } else {
                    b2 = 8;
                }
                break;
            case -538363189:
                if (!str.equals(CODEC_ID_MPEG4_ASP)) {
                    b2 = -1;
                } else {
                    b2 = 9;
                }
                break;
            case -538363109:
                if (!str.equals(CODEC_ID_H264)) {
                    b2 = -1;
                } else {
                    b2 = 10;
                }
                break;
            case -425012669:
                if (!str.equals(CODEC_ID_VOBSUB)) {
                    b2 = -1;
                } else {
                    b2 = 11;
                }
                break;
            case -356037306:
                if (!str.equals(CODEC_ID_DTS_LOSSLESS)) {
                    b2 = -1;
                } else {
                    b2 = 12;
                }
                break;
            case 62923557:
                if (!str.equals(CODEC_ID_AAC)) {
                    b2 = -1;
                } else {
                    b2 = 13;
                }
                break;
            case 62923603:
                if (!str.equals(CODEC_ID_AC3)) {
                    b2 = -1;
                } else {
                    b2 = 14;
                }
                break;
            case 62927045:
                if (!str.equals(CODEC_ID_DTS)) {
                    b2 = -1;
                } else {
                    b2 = 15;
                }
                break;
            case 82318131:
                if (!str.equals(CODEC_ID_AV1)) {
                    b2 = -1;
                } else {
                    b2 = 16;
                }
                break;
            case 82338133:
                if (!str.equals(CODEC_ID_VP8)) {
                    b2 = -1;
                } else {
                    b2 = 17;
                }
                break;
            case 82338134:
                if (!str.equals(CODEC_ID_VP9)) {
                    b2 = -1;
                } else {
                    b2 = 18;
                }
                break;
            case 99146302:
                if (!str.equals(CODEC_ID_PGS)) {
                    b2 = -1;
                } else {
                    b2 = 19;
                }
                break;
            case 444813526:
                if (!str.equals(CODEC_ID_THEORA)) {
                    b2 = -1;
                } else {
                    b2 = Ascii.DC4;
                }
                break;
            case 542569478:
                if (!str.equals(CODEC_ID_DTS_EXPRESS)) {
                    b2 = -1;
                } else {
                    b2 = Ascii.NAK;
                }
                break;
            case 635596514:
                if (!str.equals(CODEC_ID_PCM_FLOAT)) {
                    b2 = -1;
                } else {
                    b2 = Ascii.SYN;
                }
                break;
            case 725948237:
                if (!str.equals(CODEC_ID_PCM_INT_BIG)) {
                    b2 = -1;
                } else {
                    b2 = Ascii.ETB;
                }
                break;
            case 725957860:
                if (!str.equals(CODEC_ID_PCM_INT_LIT)) {
                    b2 = -1;
                } else {
                    b2 = Ascii.CAN;
                }
                break;
            case 738597099:
                if (!str.equals(CODEC_ID_ASS)) {
                    b2 = -1;
                } else {
                    b2 = Ascii.EM;
                }
                break;
            case 855502857:
                if (!str.equals(CODEC_ID_H265)) {
                    b2 = -1;
                } else {
                    b2 = Ascii.SUB;
                }
                break;
            case 1045209816:
                if (!str.equals(CODEC_ID_VTT)) {
                    b2 = -1;
                } else {
                    b2 = Ascii.ESC;
                }
                break;
            case 1422270023:
                if (!str.equals(CODEC_ID_SUBRIP)) {
                    b2 = -1;
                } else {
                    b2 = Ascii.FS;
                }
                break;
            case 1809237540:
                if (!str.equals(CODEC_ID_MPEG2)) {
                    b2 = -1;
                } else {
                    b2 = Ascii.GS;
                }
                break;
            case 1950749482:
                if (!str.equals(CODEC_ID_E_AC3)) {
                    b2 = -1;
                } else {
                    b2 = Ascii.RS;
                }
                break;
            case 1950789798:
                if (!str.equals(CODEC_ID_FLAC)) {
                    b2 = -1;
                } else {
                    b2 = Ascii.US;
                }
                break;
            case 1951062397:
                if (!str.equals(CODEC_ID_OPUS)) {
                    b2 = -1;
                } else {
                    b2 = 32;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
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

    private static int[] ensureArrayCapacity(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        return iArr.length >= i ? iArr : new int[Math.max(iArr.length * 2, i)];
    }

    @EnsuresNonNull({"extractorOutput"})
    private void assertInitialized() {
        Assertions.checkStateNotNull(this.extractorOutput);
    }

    final class InnerEbmlProcessor implements EbmlProcessor {
        private InnerEbmlProcessor() {
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public int getElementType(int i) {
            return MatroskaExtractor.this.getElementType(i);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public boolean isLevel1Element(int i) {
            return MatroskaExtractor.this.isLevel1Element(i);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void startMasterElement(int i, long j, long j2) throws ParserException {
            MatroskaExtractor.this.startMasterElement(i, j, j2);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void endMasterElement(int i) throws ParserException {
            MatroskaExtractor.this.endMasterElement(i);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void integerElement(int i, long j) throws ParserException {
            MatroskaExtractor.this.integerElement(i, j);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void floatElement(int i, double d) throws ParserException {
            MatroskaExtractor.this.floatElement(i, d);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void stringElement(int i, String str) throws ParserException {
            MatroskaExtractor.this.stringElement(i, str);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void binaryElement(int i, int i2, ExtractorInput extractorInput) throws IOException {
            MatroskaExtractor.this.binaryElement(i, i2, extractorInput);
        }
    }

    protected static final class Track {
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
        public int bitsPerChannel = -1;
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

        protected Track() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:137:0x01ca  */
        /* JADX WARN: Code duplicated, block: B:213:0x041a  */
        /* JADX WARN: Code duplicated, block: B:218:0x0432  */
        /* JADX WARN: Code duplicated, block: B:219:0x0434  */
        /* JADX WARN: Code duplicated, block: B:222:0x0440  */
        /* JADX WARN: Code duplicated, block: B:223:0x0452  */
        /* JADX WARN: Code duplicated, block: B:225:0x0458  */
        /* JADX WARN: Code duplicated, block: B:227:0x045c  */
        /* JADX WARN: Code duplicated, block: B:229:0x0461  */
        /* JADX WARN: Code duplicated, block: B:232:0x0469  */
        /* JADX WARN: Code duplicated, block: B:234:0x046e  */
        /* JADX WARN: Code duplicated, block: B:237:0x0473  */
        /* JADX WARN: Code duplicated, block: B:240:0x0481  */
        /* JADX WARN: Code duplicated, block: B:243:0x0487  */
        /* JADX WARN: Code duplicated, block: B:246:0x04ba  */
        /* JADX WARN: Code duplicated, block: B:249:0x04d7  */
        /* JADX WARN: Code duplicated, block: B:252:0x04dc  */
        /* JADX WARN: Code duplicated, block: B:271:0x0529  */
        /* JADX WARN: Code duplicated, block: B:273:0x054f  */
        /* JADX WARN: Code duplicated, block: B:275:0x0555  */
        /* JADX WARN: Code duplicated, block: B:291:0x0580  */
        @EnsuresNonNull({"this.output"})
        @RequiresNonNull({"codecId"})
        public void initializeOutput(ExtractorOutput extractorOutput, int i) throws ParserException {
            byte b2;
            List<byte[]> listSingletonList;
            String str;
            int i2;
            String str2;
            String str3;
            String str4;
            int i3;
            String str5;
            int i4;
            List<byte[]> list;
            String str6;
            String str7;
            String str8;
            String str9;
            List<byte[]> list2;
            String str10;
            int i5;
            Format.Builder builder;
            int i6;
            int i7;
            int i8;
            float f;
            int iIntValue;
            int i9;
            int i10;
            int i11;
            int i12;
            DolbyVisionConfig dolbyVisionConfig;
            String str11 = this.codecId;
            str11.hashCode();
            switch (str11) {
                case "V_MPEG4/ISO/AP":
                    b2 = 0;
                    break;
                case "V_MPEG4/ISO/SP":
                    b2 = 1;
                    break;
                case "A_MS/ACM":
                    b2 = 2;
                    break;
                case "A_TRUEHD":
                    b2 = 3;
                    break;
                case "A_VORBIS":
                    b2 = 4;
                    break;
                case "A_MPEG/L2":
                    b2 = 5;
                    break;
                case "A_MPEG/L3":
                    b2 = 6;
                    break;
                case "V_MS/VFW/FOURCC":
                    b2 = 7;
                    break;
                case "S_DVBSUB":
                    b2 = 8;
                    break;
                case "V_MPEG4/ISO/ASP":
                    b2 = 9;
                    break;
                case "V_MPEG4/ISO/AVC":
                    b2 = 10;
                    break;
                case "S_VOBSUB":
                    b2 = 11;
                    break;
                case "A_DTS/LOSSLESS":
                    b2 = 12;
                    break;
                case "A_AAC":
                    b2 = 13;
                    break;
                case "A_AC3":
                    b2 = 14;
                    break;
                case "A_DTS":
                    b2 = 15;
                    break;
                case "V_AV1":
                    b2 = 16;
                    break;
                case "V_VP8":
                    b2 = 17;
                    break;
                case "V_VP9":
                    b2 = 18;
                    break;
                case "S_HDMV/PGS":
                    b2 = 19;
                    break;
                case "V_THEORA":
                    b2 = Ascii.DC4;
                    break;
                case "A_DTS/EXPRESS":
                    b2 = Ascii.NAK;
                    break;
                case "A_PCM/FLOAT/IEEE":
                    b2 = Ascii.SYN;
                    break;
                case "A_PCM/INT/BIG":
                    b2 = Ascii.ETB;
                    break;
                case "A_PCM/INT/LIT":
                    b2 = 24;
                    break;
                case "S_TEXT/ASS":
                    b2 = Ascii.EM;
                    break;
                case "V_MPEGH/ISO/HEVC":
                    b2 = Ascii.SUB;
                    break;
                case "S_TEXT/WEBVTT":
                    b2 = Ascii.ESC;
                    break;
                case "S_TEXT/UTF8":
                    b2 = Ascii.FS;
                    break;
                case "V_MPEG2":
                    b2 = Ascii.GS;
                    break;
                case "A_EAC3":
                    b2 = Ascii.RS;
                    break;
                case "A_FLAC":
                    b2 = Ascii.US;
                    break;
                case "A_OPUS":
                    b2 = 32;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            String str12 = MimeTypes.AUDIO_UNKNOWN;
            switch (b2) {
                case 0:
                case 1:
                case 9:
                    byte[] bArr = this.codecPrivate;
                    listSingletonList = bArr == null ? null : Collections.singletonList(bArr);
                    str = MimeTypes.VIDEO_MP4V;
                    str2 = str;
                    str3 = null;
                    i4 = -1;
                    i2 = -1;
                    String str13 = str3;
                    list2 = listSingletonList;
                    str9 = str2;
                    str10 = str13;
                    if (this.dolbyVisionConfigBytes != null && (dolbyVisionConfig = DolbyVisionConfig.parse(new ParsableByteArray(this.dolbyVisionConfigBytes))) != null) {
                        str10 = dolbyVisionConfig.codecs;
                        str9 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z = this.flagDefault;
                    if (this.flagForced) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str9)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i2);
                        i6 = 1;
                    } else if (MimeTypes.isVideo(str9)) {
                        if (this.displayUnit == 0) {
                            i11 = this.displayWidth;
                            i7 = -1;
                            if (i11 == -1) {
                                i11 = this.width;
                            }
                            this.displayWidth = i11;
                            i12 = this.displayHeight;
                            if (i12 == -1) {
                                i12 = this.height;
                            }
                            this.displayHeight = i12;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.displayWidth;
                        if (i8 != i7 || (i10 = this.displayHeight) == i7) {
                            f = -1.0f;
                        } else {
                            f = (this.height * i8) / (this.width * i10);
                        }
                        ColorInfo colorInfoBuild = this.hasColorInfo ? new ColorInfo.Builder().setColorSpace(this.colorSpace).setColorRange(this.colorRange).setColorTransfer(this.colorTransfer).setHdrStaticInfo(getHdrStaticInfo()).setLumaBitdepth(this.bitsPerChannel).setChromaBitdepth(this.bitsPerChannel).build() : null;
                        if (this.name == null && MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.containsKey(this.name)) {
                            iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                        } else {
                            iIntValue = i7;
                        }
                        if (this.projectionType == 0 || Float.compare(this.projectionPoseYaw, 0.0f) != 0 || Float.compare(this.projectionPosePitch, 0.0f) != 0) {
                            i9 = iIntValue;
                        } else if (Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                            i9 = 0;
                        } else if (Float.compare(this.projectionPoseRoll, 90.0f) == 0) {
                            i9 = 90;
                        } else if (Float.compare(this.projectionPoseRoll, -180.0f) == 0 || Float.compare(this.projectionPoseRoll, 180.0f) == 0) {
                            i9 = 180;
                        } else if (Float.compare(this.projectionPoseRoll, -90.0f) == 0) {
                            i9 = 270;
                        } else {
                            i9 = iIntValue;
                        }
                        builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                        i6 = 2;
                    } else {
                        if (MimeTypes.APPLICATION_SUBRIP.equals(str9) && !MimeTypes.TEXT_SSA.equals(str9) && !MimeTypes.TEXT_VTT.equals(str9) && !MimeTypes.APPLICATION_VOBSUB.equals(str9) && !MimeTypes.APPLICATION_PGS.equals(str9) && !MimeTypes.APPLICATION_DVBSUBS.equals(str9)) {
                            throw ParserException.createForMalformedContainer("Unexpected MIME type.", null);
                        }
                        i6 = 3;
                    }
                    if (this.name != null && !MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.containsKey(this.name)) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild = builder.setId(i).setSampleMimeType(str9).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags((z ? 1 : 0) | i5).setInitializationData(list2).setCodecs(str10).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack = extractorOutput.track(this.number, i6);
                    this.output = trackOutputTrack;
                    trackOutputTrack.format(formatBuild);
                    return;
                case 2:
                    if (parseMsAcmCodecPrivate(new ParsableByteArray(getCodecPrivate(this.codecId)))) {
                        int pcmEncoding = Util.getPcmEncoding(this.audioBitDepth);
                        if (pcmEncoding != 0) {
                            i2 = pcmEncoding;
                            str9 = MimeTypes.AUDIO_RAW;
                            list2 = null;
                            str10 = null;
                            i4 = -1;
                            if (this.dolbyVisionConfigBytes != null) {
                                str10 = dolbyVisionConfig.codecs;
                                str9 = MimeTypes.VIDEO_DOLBY_VISION;
                            }
                            boolean z2 = this.flagDefault;
                            if (this.flagForced) {
                                i5 = 2;
                            } else {
                                i5 = 0;
                            }
                            builder = new Format.Builder();
                            if (MimeTypes.isAudio(str9)) {
                                builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i2);
                                i6 = 1;
                            } else {
                                if (MimeTypes.isVideo(str9)) {
                                    if (this.displayUnit == 0) {
                                        i11 = this.displayWidth;
                                        i7 = -1;
                                        if (i11 == -1) {
                                            i11 = this.width;
                                        }
                                        this.displayWidth = i11;
                                        i12 = this.displayHeight;
                                        if (i12 == -1) {
                                            i12 = this.height;
                                        }
                                        this.displayHeight = i12;
                                    } else {
                                        i7 = -1;
                                    }
                                    i8 = this.displayWidth;
                                    if (i8 != i7) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (this.hasColorInfo) {
                                    }
                                    if (this.name == null) {
                                        iIntValue = i7;
                                    } else {
                                        iIntValue = i7;
                                    }
                                    if (this.projectionType == 0) {
                                        i9 = iIntValue;
                                    } else {
                                        i9 = iIntValue;
                                    }
                                    builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                                    i6 = 2;
                                } else {
                                    if (MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                                    }
                                    i6 = 3;
                                }
                                break;
                            }
                            if (this.name != null) {
                                builder.setLabel(this.name);
                            }
                            Format formatBuild2 = builder.setId(i).setSampleMimeType(str9).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags((z2 ? 1 : 0) | i5).setInitializationData(list2).setCodecs(str10).setDrmInitData(this.drmInitData).build();
                            TrackOutput trackOutputTrack2 = extractorOutput.track(this.number, i6);
                            this.output = trackOutputTrack2;
                            trackOutputTrack2.format(formatBuild2);
                            return;
                        }
                        Log.w(MatroskaExtractor.TAG, "Unsupported PCM bit depth: " + this.audioBitDepth + ". Setting mimeType to audio/x-unknown");
                    } else {
                        Log.w(MatroskaExtractor.TAG, "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                    }
                    str2 = str12;
                    listSingletonList = null;
                    str3 = null;
                    i4 = -1;
                    i2 = -1;
                    String str14 = str3;
                    list2 = listSingletonList;
                    str9 = str2;
                    str10 = str14;
                    if (this.dolbyVisionConfigBytes != null) {
                        str10 = dolbyVisionConfig.codecs;
                        str9 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z3 = this.flagDefault;
                    if (this.flagForced) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str9)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i2);
                        i6 = 1;
                    } else {
                        if (MimeTypes.isVideo(str9)) {
                            if (this.displayUnit == 0) {
                                i11 = this.displayWidth;
                                i7 = -1;
                                if (i11 == -1) {
                                    i11 = this.width;
                                }
                                this.displayWidth = i11;
                                i12 = this.displayHeight;
                                if (i12 == -1) {
                                    i12 = this.height;
                                }
                                this.displayHeight = i12;
                            } else {
                                i7 = -1;
                            }
                            i8 = this.displayWidth;
                            if (i8 != i7) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name == null) {
                                iIntValue = i7;
                            } else {
                                iIntValue = i7;
                            }
                            if (this.projectionType == 0) {
                                i9 = iIntValue;
                            } else {
                                i9 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i6 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                            }
                            i6 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild3 = builder.setId(i).setSampleMimeType(str9).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags((z3 ? 1 : 0) | i5).setInitializationData(list2).setCodecs(str10).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack3 = extractorOutput.track(this.number, i6);
                    this.output = trackOutputTrack3;
                    trackOutputTrack3.format(formatBuild3);
                    return;
                case 3:
                    this.trueHdSampleRechunker = new TrueHdSampleRechunker();
                    str12 = MimeTypes.AUDIO_TRUEHD;
                    str2 = str12;
                    listSingletonList = null;
                    str3 = null;
                    i4 = -1;
                    i2 = -1;
                    String str15 = str3;
                    list2 = listSingletonList;
                    str9 = str2;
                    str10 = str15;
                    if (this.dolbyVisionConfigBytes != null) {
                        str10 = dolbyVisionConfig.codecs;
                        str9 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z4 = this.flagDefault;
                    if (this.flagForced) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str9)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i2);
                        i6 = 1;
                    } else {
                        if (MimeTypes.isVideo(str9)) {
                            if (this.displayUnit == 0) {
                                i11 = this.displayWidth;
                                i7 = -1;
                                if (i11 == -1) {
                                    i11 = this.width;
                                }
                                this.displayWidth = i11;
                                i12 = this.displayHeight;
                                if (i12 == -1) {
                                    i12 = this.height;
                                }
                                this.displayHeight = i12;
                            } else {
                                i7 = -1;
                            }
                            i8 = this.displayWidth;
                            if (i8 != i7) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name == null) {
                                iIntValue = i7;
                            } else {
                                iIntValue = i7;
                            }
                            if (this.projectionType == 0) {
                                i9 = iIntValue;
                            } else {
                                i9 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i6 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                            }
                            i6 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild4 = builder.setId(i).setSampleMimeType(str9).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags((z4 ? 1 : 0) | i5).setInitializationData(list2).setCodecs(str10).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack4 = extractorOutput.track(this.number, i6);
                    this.output = trackOutputTrack4;
                    trackOutputTrack4.format(formatBuild4);
                    return;
                case 4:
                    listSingletonList = parseVorbisCodecPrivate(getCodecPrivate(this.codecId));
                    str4 = MimeTypes.AUDIO_VORBIS;
                    i3 = 8192;
                    i4 = i3;
                    str2 = str4;
                    str3 = null;
                    i2 = -1;
                    String str16 = str3;
                    list2 = listSingletonList;
                    str9 = str2;
                    str10 = str16;
                    if (this.dolbyVisionConfigBytes != null) {
                        str10 = dolbyVisionConfig.codecs;
                        str9 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z5 = this.flagDefault;
                    if (this.flagForced) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str9)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i2);
                        i6 = 1;
                    } else {
                        if (MimeTypes.isVideo(str9)) {
                            if (this.displayUnit == 0) {
                                i11 = this.displayWidth;
                                i7 = -1;
                                if (i11 == -1) {
                                    i11 = this.width;
                                }
                                this.displayWidth = i11;
                                i12 = this.displayHeight;
                                if (i12 == -1) {
                                    i12 = this.height;
                                }
                                this.displayHeight = i12;
                            } else {
                                i7 = -1;
                            }
                            i8 = this.displayWidth;
                            if (i8 != i7) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name == null) {
                                iIntValue = i7;
                            } else {
                                iIntValue = i7;
                            }
                            if (this.projectionType == 0) {
                                i9 = iIntValue;
                            } else {
                                i9 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i6 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                            }
                            i6 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild5 = builder.setId(i).setSampleMimeType(str9).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags((z5 ? 1 : 0) | i5).setInitializationData(list2).setCodecs(str10).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack5 = extractorOutput.track(this.number, i6);
                    this.output = trackOutputTrack5;
                    trackOutputTrack5.format(formatBuild5);
                    return;
                case 5:
                    str5 = MimeTypes.AUDIO_MPEG_L2;
                    i3 = 4096;
                    str4 = str5;
                    listSingletonList = null;
                    i4 = i3;
                    str2 = str4;
                    str3 = null;
                    i2 = -1;
                    String str17 = str3;
                    list2 = listSingletonList;
                    str9 = str2;
                    str10 = str17;
                    if (this.dolbyVisionConfigBytes != null) {
                        str10 = dolbyVisionConfig.codecs;
                        str9 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z6 = this.flagDefault;
                    if (this.flagForced) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str9)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i2);
                        i6 = 1;
                    } else {
                        if (MimeTypes.isVideo(str9)) {
                            if (this.displayUnit == 0) {
                                i11 = this.displayWidth;
                                i7 = -1;
                                if (i11 == -1) {
                                    i11 = this.width;
                                }
                                this.displayWidth = i11;
                                i12 = this.displayHeight;
                                if (i12 == -1) {
                                    i12 = this.height;
                                }
                                this.displayHeight = i12;
                            } else {
                                i7 = -1;
                            }
                            i8 = this.displayWidth;
                            if (i8 != i7) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name == null) {
                                iIntValue = i7;
                            } else {
                                iIntValue = i7;
                            }
                            if (this.projectionType == 0) {
                                i9 = iIntValue;
                            } else {
                                i9 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i6 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                            }
                            i6 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild6 = builder.setId(i).setSampleMimeType(str9).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags((z6 ? 1 : 0) | i5).setInitializationData(list2).setCodecs(str10).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack6 = extractorOutput.track(this.number, i6);
                    this.output = trackOutputTrack6;
                    trackOutputTrack6.format(formatBuild6);
                    return;
                case 6:
                    str5 = MimeTypes.AUDIO_MPEG;
                    i3 = 4096;
                    str4 = str5;
                    listSingletonList = null;
                    i4 = i3;
                    str2 = str4;
                    str3 = null;
                    i2 = -1;
                    String str18 = str3;
                    list2 = listSingletonList;
                    str9 = str2;
                    str10 = str18;
                    if (this.dolbyVisionConfigBytes != null) {
                        str10 = dolbyVisionConfig.codecs;
                        str9 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z7 = this.flagDefault;
                    if (this.flagForced) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str9)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i2);
                        i6 = 1;
                    } else {
                        if (MimeTypes.isVideo(str9)) {
                            if (this.displayUnit == 0) {
                                i11 = this.displayWidth;
                                i7 = -1;
                                if (i11 == -1) {
                                    i11 = this.width;
                                }
                                this.displayWidth = i11;
                                i12 = this.displayHeight;
                                if (i12 == -1) {
                                    i12 = this.height;
                                }
                                this.displayHeight = i12;
                            } else {
                                i7 = -1;
                            }
                            i8 = this.displayWidth;
                            if (i8 != i7) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name == null) {
                                iIntValue = i7;
                            } else {
                                iIntValue = i7;
                            }
                            if (this.projectionType == 0) {
                                i9 = iIntValue;
                            } else {
                                i9 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i6 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                            }
                            i6 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild7 = builder.setId(i).setSampleMimeType(str9).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags((z7 ? 1 : 0) | i5).setInitializationData(list2).setCodecs(str10).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack7 = extractorOutput.track(this.number, i6);
                    this.output = trackOutputTrack7;
                    trackOutputTrack7.format(formatBuild7);
                    return;
                case 7:
                    Pair<String, List<byte[]>> fourCcPrivate = parseFourCcPrivate(new ParsableByteArray(getCodecPrivate(this.codecId)));
                    str = (String) fourCcPrivate.first;
                    listSingletonList = (List) fourCcPrivate.second;
                    str2 = str;
                    str3 = null;
                    i4 = -1;
                    i2 = -1;
                    String str19 = str3;
                    list2 = listSingletonList;
                    str9 = str2;
                    str10 = str19;
                    if (this.dolbyVisionConfigBytes != null) {
                        str10 = dolbyVisionConfig.codecs;
                        str9 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z8 = this.flagDefault;
                    if (this.flagForced) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str9)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i2);
                        i6 = 1;
                    } else {
                        if (MimeTypes.isVideo(str9)) {
                            if (this.displayUnit == 0) {
                                i11 = this.displayWidth;
                                i7 = -1;
                                if (i11 == -1) {
                                    i11 = this.width;
                                }
                                this.displayWidth = i11;
                                i12 = this.displayHeight;
                                if (i12 == -1) {
                                    i12 = this.height;
                                }
                                this.displayHeight = i12;
                            } else {
                                i7 = -1;
                            }
                            i8 = this.displayWidth;
                            if (i8 != i7) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name == null) {
                                iIntValue = i7;
                            } else {
                                iIntValue = i7;
                            }
                            if (this.projectionType == 0) {
                                i9 = iIntValue;
                            } else {
                                i9 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i6 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                            }
                            i6 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild8 = builder.setId(i).setSampleMimeType(str9).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags((z8 ? 1 : 0) | i5).setInitializationData(list2).setCodecs(str10).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack8 = extractorOutput.track(this.number, i6);
                    this.output = trackOutputTrack8;
                    trackOutputTrack8.format(formatBuild8);
                    return;
                case 8:
                    byte[] bArr2 = new byte[4];
                    System.arraycopy(getCodecPrivate(this.codecId), 0, bArr2, 0, 4);
                    listSingletonList = ImmutableList.of(bArr2);
                    str = MimeTypes.APPLICATION_DVBSUBS;
                    str2 = str;
                    str3 = null;
                    i4 = -1;
                    i2 = -1;
                    String str110 = str3;
                    list2 = listSingletonList;
                    str9 = str2;
                    str10 = str110;
                    if (this.dolbyVisionConfigBytes != null) {
                        str10 = dolbyVisionConfig.codecs;
                        str9 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z9 = this.flagDefault;
                    if (this.flagForced) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str9)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i2);
                        i6 = 1;
                    } else {
                        if (MimeTypes.isVideo(str9)) {
                            if (this.displayUnit == 0) {
                                i11 = this.displayWidth;
                                i7 = -1;
                                if (i11 == -1) {
                                    i11 = this.width;
                                }
                                this.displayWidth = i11;
                                i12 = this.displayHeight;
                                if (i12 == -1) {
                                    i12 = this.height;
                                }
                                this.displayHeight = i12;
                            } else {
                                i7 = -1;
                            }
                            i8 = this.displayWidth;
                            if (i8 != i7) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name == null) {
                                iIntValue = i7;
                            } else {
                                iIntValue = i7;
                            }
                            if (this.projectionType == 0) {
                                i9 = iIntValue;
                            } else {
                                i9 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i6 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                            }
                            i6 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild9 = builder.setId(i).setSampleMimeType(str9).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags((z9 ? 1 : 0) | i5).setInitializationData(list2).setCodecs(str10).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack9 = extractorOutput.track(this.number, i6);
                    this.output = trackOutputTrack9;
                    trackOutputTrack9.format(formatBuild9);
                    return;
                case 10:
                    AvcConfig avcConfig = AvcConfig.parse(new ParsableByteArray(getCodecPrivate(this.codecId)));
                    list = avcConfig.initializationData;
                    this.nalUnitLengthFieldLength = avcConfig.nalUnitLengthFieldLength;
                    str6 = avcConfig.codecs;
                    str7 = MimeTypes.VIDEO_H264;
                    String str20 = str7;
                    List<byte[]> list3 = list;
                    str3 = str6;
                    listSingletonList = list3;
                    str2 = str20;
                    i4 = -1;
                    i2 = -1;
                    String str111 = str3;
                    list2 = listSingletonList;
                    str9 = str2;
                    str10 = str111;
                    if (this.dolbyVisionConfigBytes != null) {
                        str10 = dolbyVisionConfig.codecs;
                        str9 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z10 = this.flagDefault;
                    if (this.flagForced) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str9)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i2);
                        i6 = 1;
                    } else {
                        if (MimeTypes.isVideo(str9)) {
                            if (this.displayUnit == 0) {
                                i11 = this.displayWidth;
                                i7 = -1;
                                if (i11 == -1) {
                                    i11 = this.width;
                                }
                                this.displayWidth = i11;
                                i12 = this.displayHeight;
                                if (i12 == -1) {
                                    i12 = this.height;
                                }
                                this.displayHeight = i12;
                            } else {
                                i7 = -1;
                            }
                            i8 = this.displayWidth;
                            if (i8 != i7) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name == null) {
                                iIntValue = i7;
                            } else {
                                iIntValue = i7;
                            }
                            if (this.projectionType == 0) {
                                i9 = iIntValue;
                            } else {
                                i9 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i6 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                            }
                            i6 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild10 = builder.setId(i).setSampleMimeType(str9).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags((z10 ? 1 : 0) | i5).setInitializationData(list2).setCodecs(str10).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack10 = extractorOutput.track(this.number, i6);
                    this.output = trackOutputTrack10;
                    trackOutputTrack10.format(formatBuild10);
                    return;
                case 11:
                    listSingletonList = ImmutableList.of(getCodecPrivate(this.codecId));
                    str3 = null;
                    str2 = MimeTypes.APPLICATION_VOBSUB;
                    i4 = -1;
                    i2 = -1;
                    String str112 = str3;
                    list2 = listSingletonList;
                    str9 = str2;
                    str10 = str112;
                    if (this.dolbyVisionConfigBytes != null) {
                        str10 = dolbyVisionConfig.codecs;
                        str9 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z11 = this.flagDefault;
                    if (this.flagForced) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str9)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i2);
                        i6 = 1;
                    } else {
                        if (MimeTypes.isVideo(str9)) {
                            if (this.displayUnit == 0) {
                                i11 = this.displayWidth;
                                i7 = -1;
                                if (i11 == -1) {
                                    i11 = this.width;
                                }
                                this.displayWidth = i11;
                                i12 = this.displayHeight;
                                if (i12 == -1) {
                                    i12 = this.height;
                                }
                                this.displayHeight = i12;
                            } else {
                                i7 = -1;
                            }
                            i8 = this.displayWidth;
                            if (i8 != i7) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name == null) {
                                iIntValue = i7;
                            } else {
                                iIntValue = i7;
                            }
                            if (this.projectionType == 0) {
                                i9 = iIntValue;
                            } else {
                                i9 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i6 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                            }
                            i6 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild11 = builder.setId(i).setSampleMimeType(str9).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags((z11 ? 1 : 0) | i5).setInitializationData(list2).setCodecs(str10).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack11 = extractorOutput.track(this.number, i6);
                    this.output = trackOutputTrack11;
                    trackOutputTrack11.format(formatBuild11);
                    return;
                case 12:
                    str8 = MimeTypes.AUDIO_DTS_HD;
                    str12 = str8;
                    str2 = str12;
                    listSingletonList = null;
                    str3 = null;
                    i4 = -1;
                    i2 = -1;
                    String str113 = str3;
                    list2 = listSingletonList;
                    str9 = str2;
                    str10 = str113;
                    if (this.dolbyVisionConfigBytes != null) {
                        str10 = dolbyVisionConfig.codecs;
                        str9 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z12 = this.flagDefault;
                    if (this.flagForced) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str9)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i2);
                        i6 = 1;
                    } else {
                        if (MimeTypes.isVideo(str9)) {
                            if (this.displayUnit == 0) {
                                i11 = this.displayWidth;
                                i7 = -1;
                                if (i11 == -1) {
                                    i11 = this.width;
                                }
                                this.displayWidth = i11;
                                i12 = this.displayHeight;
                                if (i12 == -1) {
                                    i12 = this.height;
                                }
                                this.displayHeight = i12;
                            } else {
                                i7 = -1;
                            }
                            i8 = this.displayWidth;
                            if (i8 != i7) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name == null) {
                                iIntValue = i7;
                            } else {
                                iIntValue = i7;
                            }
                            if (this.projectionType == 0) {
                                i9 = iIntValue;
                            } else {
                                i9 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i6 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                            }
                            i6 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild12 = builder.setId(i).setSampleMimeType(str9).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags((z12 ? 1 : 0) | i5).setInitializationData(list2).setCodecs(str10).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack12 = extractorOutput.track(this.number, i6);
                    this.output = trackOutputTrack12;
                    trackOutputTrack12.format(formatBuild12);
                    return;
                case 13:
                    listSingletonList = Collections.singletonList(getCodecPrivate(this.codecId));
                    AacUtil.Config audioSpecificConfig = AacUtil.parseAudioSpecificConfig(this.codecPrivate);
                    this.sampleRate = audioSpecificConfig.sampleRateHz;
                    this.channelCount = audioSpecificConfig.channelCount;
                    str3 = audioSpecificConfig.codecs;
                    str2 = MimeTypes.AUDIO_AAC;
                    i4 = -1;
                    i2 = -1;
                    String str114 = str3;
                    list2 = listSingletonList;
                    str9 = str2;
                    str10 = str114;
                    if (this.dolbyVisionConfigBytes != null) {
                        str10 = dolbyVisionConfig.codecs;
                        str9 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z13 = this.flagDefault;
                    if (this.flagForced) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str9)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i2);
                        i6 = 1;
                    } else {
                        if (MimeTypes.isVideo(str9)) {
                            if (this.displayUnit == 0) {
                                i11 = this.displayWidth;
                                i7 = -1;
                                if (i11 == -1) {
                                    i11 = this.width;
                                }
                                this.displayWidth = i11;
                                i12 = this.displayHeight;
                                if (i12 == -1) {
                                    i12 = this.height;
                                }
                                this.displayHeight = i12;
                            } else {
                                i7 = -1;
                            }
                            i8 = this.displayWidth;
                            if (i8 != i7) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name == null) {
                                iIntValue = i7;
                            } else {
                                iIntValue = i7;
                            }
                            if (this.projectionType == 0) {
                                i9 = iIntValue;
                            } else {
                                i9 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i6 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                            }
                            i6 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild13 = builder.setId(i).setSampleMimeType(str9).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags((z13 ? 1 : 0) | i5).setInitializationData(list2).setCodecs(str10).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack13 = extractorOutput.track(this.number, i6);
                    this.output = trackOutputTrack13;
                    trackOutputTrack13.format(formatBuild13);
                    return;
                case 14:
                    str8 = MimeTypes.AUDIO_AC3;
                    str12 = str8;
                    str2 = str12;
                    listSingletonList = null;
                    str3 = null;
                    i4 = -1;
                    i2 = -1;
                    String str115 = str3;
                    list2 = listSingletonList;
                    str9 = str2;
                    str10 = str115;
                    if (this.dolbyVisionConfigBytes != null) {
                        str10 = dolbyVisionConfig.codecs;
                        str9 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z14 = this.flagDefault;
                    if (this.flagForced) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str9)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i2);
                        i6 = 1;
                    } else {
                        if (MimeTypes.isVideo(str9)) {
                            if (this.displayUnit == 0) {
                                i11 = this.displayWidth;
                                i7 = -1;
                                if (i11 == -1) {
                                    i11 = this.width;
                                }
                                this.displayWidth = i11;
                                i12 = this.displayHeight;
                                if (i12 == -1) {
                                    i12 = this.height;
                                }
                                this.displayHeight = i12;
                            } else {
                                i7 = -1;
                            }
                            i8 = this.displayWidth;
                            if (i8 != i7) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name == null) {
                                iIntValue = i7;
                            } else {
                                iIntValue = i7;
                            }
                            if (this.projectionType == 0) {
                                i9 = iIntValue;
                            } else {
                                i9 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i6 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                            }
                            i6 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild14 = builder.setId(i).setSampleMimeType(str9).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags((z14 ? 1 : 0) | i5).setInitializationData(list2).setCodecs(str10).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack14 = extractorOutput.track(this.number, i6);
                    this.output = trackOutputTrack14;
                    trackOutputTrack14.format(formatBuild14);
                    return;
                case 15:
                case 21:
                    str8 = MimeTypes.AUDIO_DTS;
                    str12 = str8;
                    str2 = str12;
                    listSingletonList = null;
                    str3 = null;
                    i4 = -1;
                    i2 = -1;
                    String str116 = str3;
                    list2 = listSingletonList;
                    str9 = str2;
                    str10 = str116;
                    if (this.dolbyVisionConfigBytes != null) {
                        str10 = dolbyVisionConfig.codecs;
                        str9 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z15 = this.flagDefault;
                    if (this.flagForced) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str9)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i2);
                        i6 = 1;
                    } else {
                        if (MimeTypes.isVideo(str9)) {
                            if (this.displayUnit == 0) {
                                i11 = this.displayWidth;
                                i7 = -1;
                                if (i11 == -1) {
                                    i11 = this.width;
                                }
                                this.displayWidth = i11;
                                i12 = this.displayHeight;
                                if (i12 == -1) {
                                    i12 = this.height;
                                }
                                this.displayHeight = i12;
                            } else {
                                i7 = -1;
                            }
                            i8 = this.displayWidth;
                            if (i8 != i7) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name == null) {
                                iIntValue = i7;
                            } else {
                                iIntValue = i7;
                            }
                            if (this.projectionType == 0) {
                                i9 = iIntValue;
                            } else {
                                i9 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i6 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                            }
                            i6 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild15 = builder.setId(i).setSampleMimeType(str9).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags((z15 ? 1 : 0) | i5).setInitializationData(list2).setCodecs(str10).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack15 = extractorOutput.track(this.number, i6);
                    this.output = trackOutputTrack15;
                    trackOutputTrack15.format(formatBuild15);
                    return;
                case 16:
                    str8 = MimeTypes.VIDEO_AV1;
                    str12 = str8;
                    str2 = str12;
                    listSingletonList = null;
                    str3 = null;
                    i4 = -1;
                    i2 = -1;
                    String str117 = str3;
                    list2 = listSingletonList;
                    str9 = str2;
                    str10 = str117;
                    if (this.dolbyVisionConfigBytes != null) {
                        str10 = dolbyVisionConfig.codecs;
                        str9 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z16 = this.flagDefault;
                    if (this.flagForced) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str9)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i2);
                        i6 = 1;
                    } else {
                        if (MimeTypes.isVideo(str9)) {
                            if (this.displayUnit == 0) {
                                i11 = this.displayWidth;
                                i7 = -1;
                                if (i11 == -1) {
                                    i11 = this.width;
                                }
                                this.displayWidth = i11;
                                i12 = this.displayHeight;
                                if (i12 == -1) {
                                    i12 = this.height;
                                }
                                this.displayHeight = i12;
                            } else {
                                i7 = -1;
                            }
                            i8 = this.displayWidth;
                            if (i8 != i7) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name == null) {
                                iIntValue = i7;
                            } else {
                                iIntValue = i7;
                            }
                            if (this.projectionType == 0) {
                                i9 = iIntValue;
                            } else {
                                i9 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i6 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                            }
                            i6 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild16 = builder.setId(i).setSampleMimeType(str9).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags((z16 ? 1 : 0) | i5).setInitializationData(list2).setCodecs(str10).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack16 = extractorOutput.track(this.number, i6);
                    this.output = trackOutputTrack16;
                    trackOutputTrack16.format(formatBuild16);
                    return;
                case 17:
                    str8 = MimeTypes.VIDEO_VP8;
                    str12 = str8;
                    str2 = str12;
                    listSingletonList = null;
                    str3 = null;
                    i4 = -1;
                    i2 = -1;
                    String str118 = str3;
                    list2 = listSingletonList;
                    str9 = str2;
                    str10 = str118;
                    if (this.dolbyVisionConfigBytes != null) {
                        str10 = dolbyVisionConfig.codecs;
                        str9 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z17 = this.flagDefault;
                    if (this.flagForced) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str9)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i2);
                        i6 = 1;
                    } else {
                        if (MimeTypes.isVideo(str9)) {
                            if (this.displayUnit == 0) {
                                i11 = this.displayWidth;
                                i7 = -1;
                                if (i11 == -1) {
                                    i11 = this.width;
                                }
                                this.displayWidth = i11;
                                i12 = this.displayHeight;
                                if (i12 == -1) {
                                    i12 = this.height;
                                }
                                this.displayHeight = i12;
                            } else {
                                i7 = -1;
                            }
                            i8 = this.displayWidth;
                            if (i8 != i7) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name == null) {
                                iIntValue = i7;
                            } else {
                                iIntValue = i7;
                            }
                            if (this.projectionType == 0) {
                                i9 = iIntValue;
                            } else {
                                i9 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i6 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                            }
                            i6 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild17 = builder.setId(i).setSampleMimeType(str9).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags((z17 ? 1 : 0) | i5).setInitializationData(list2).setCodecs(str10).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack17 = extractorOutput.track(this.number, i6);
                    this.output = trackOutputTrack17;
                    trackOutputTrack17.format(formatBuild17);
                    return;
                case 18:
                    str8 = MimeTypes.VIDEO_VP9;
                    str12 = str8;
                    str2 = str12;
                    listSingletonList = null;
                    str3 = null;
                    i4 = -1;
                    i2 = -1;
                    String str119 = str3;
                    list2 = listSingletonList;
                    str9 = str2;
                    str10 = str119;
                    if (this.dolbyVisionConfigBytes != null) {
                        str10 = dolbyVisionConfig.codecs;
                        str9 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z18 = this.flagDefault;
                    if (this.flagForced) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str9)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i2);
                        i6 = 1;
                    } else {
                        if (MimeTypes.isVideo(str9)) {
                            if (this.displayUnit == 0) {
                                i11 = this.displayWidth;
                                i7 = -1;
                                if (i11 == -1) {
                                    i11 = this.width;
                                }
                                this.displayWidth = i11;
                                i12 = this.displayHeight;
                                if (i12 == -1) {
                                    i12 = this.height;
                                }
                                this.displayHeight = i12;
                            } else {
                                i7 = -1;
                            }
                            i8 = this.displayWidth;
                            if (i8 != i7) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name == null) {
                                iIntValue = i7;
                            } else {
                                iIntValue = i7;
                            }
                            if (this.projectionType == 0) {
                                i9 = iIntValue;
                            } else {
                                i9 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i6 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                            }
                            i6 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild18 = builder.setId(i).setSampleMimeType(str9).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags((z18 ? 1 : 0) | i5).setInitializationData(list2).setCodecs(str10).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack18 = extractorOutput.track(this.number, i6);
                    this.output = trackOutputTrack18;
                    trackOutputTrack18.format(formatBuild18);
                    return;
                case 19:
                    str12 = MimeTypes.APPLICATION_PGS;
                    str2 = str12;
                    listSingletonList = null;
                    str3 = null;
                    i4 = -1;
                    i2 = -1;
                    String str1110 = str3;
                    list2 = listSingletonList;
                    str9 = str2;
                    str10 = str1110;
                    if (this.dolbyVisionConfigBytes != null) {
                        str10 = dolbyVisionConfig.codecs;
                        str9 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z19 = this.flagDefault;
                    if (this.flagForced) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str9)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i2);
                        i6 = 1;
                    } else {
                        if (MimeTypes.isVideo(str9)) {
                            if (this.displayUnit == 0) {
                                i11 = this.displayWidth;
                                i7 = -1;
                                if (i11 == -1) {
                                    i11 = this.width;
                                }
                                this.displayWidth = i11;
                                i12 = this.displayHeight;
                                if (i12 == -1) {
                                    i12 = this.height;
                                }
                                this.displayHeight = i12;
                            } else {
                                i7 = -1;
                            }
                            i8 = this.displayWidth;
                            if (i8 != i7) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name == null) {
                                iIntValue = i7;
                            } else {
                                iIntValue = i7;
                            }
                            if (this.projectionType == 0) {
                                i9 = iIntValue;
                            } else {
                                i9 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i6 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                            }
                            i6 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild19 = builder.setId(i).setSampleMimeType(str9).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags((z19 ? 1 : 0) | i5).setInitializationData(list2).setCodecs(str10).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack19 = extractorOutput.track(this.number, i6);
                    this.output = trackOutputTrack19;
                    trackOutputTrack19.format(formatBuild19);
                    return;
                case 20:
                    str8 = MimeTypes.VIDEO_UNKNOWN;
                    str12 = str8;
                    str2 = str12;
                    listSingletonList = null;
                    str3 = null;
                    i4 = -1;
                    i2 = -1;
                    String str1111 = str3;
                    list2 = listSingletonList;
                    str9 = str2;
                    str10 = str1111;
                    if (this.dolbyVisionConfigBytes != null) {
                        str10 = dolbyVisionConfig.codecs;
                        str9 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z110 = this.flagDefault;
                    if (this.flagForced) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str9)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i2);
                        i6 = 1;
                    } else {
                        if (MimeTypes.isVideo(str9)) {
                            if (this.displayUnit == 0) {
                                i11 = this.displayWidth;
                                i7 = -1;
                                if (i11 == -1) {
                                    i11 = this.width;
                                }
                                this.displayWidth = i11;
                                i12 = this.displayHeight;
                                if (i12 == -1) {
                                    i12 = this.height;
                                }
                                this.displayHeight = i12;
                            } else {
                                i7 = -1;
                            }
                            i8 = this.displayWidth;
                            if (i8 != i7) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name == null) {
                                iIntValue = i7;
                            } else {
                                iIntValue = i7;
                            }
                            if (this.projectionType == 0) {
                                i9 = iIntValue;
                            } else {
                                i9 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i6 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                            }
                            i6 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild110 = builder.setId(i).setSampleMimeType(str9).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags((z110 ? 1 : 0) | i5).setInitializationData(list2).setCodecs(str10).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack110 = extractorOutput.track(this.number, i6);
                    this.output = trackOutputTrack110;
                    trackOutputTrack110.format(formatBuild110);
                    return;
                case 22:
                    if (this.audioBitDepth == 32) {
                        i2 = 4;
                        str9 = MimeTypes.AUDIO_RAW;
                        list2 = null;
                        str10 = null;
                        i4 = -1;
                        if (this.dolbyVisionConfigBytes != null) {
                            str10 = dolbyVisionConfig.codecs;
                            str9 = MimeTypes.VIDEO_DOLBY_VISION;
                        }
                        boolean z111 = this.flagDefault;
                        if (this.flagForced) {
                            i5 = 2;
                        } else {
                            i5 = 0;
                        }
                        builder = new Format.Builder();
                        if (MimeTypes.isAudio(str9)) {
                            builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i2);
                            i6 = 1;
                        } else {
                            if (MimeTypes.isVideo(str9)) {
                                if (this.displayUnit == 0) {
                                    i11 = this.displayWidth;
                                    i7 = -1;
                                    if (i11 == -1) {
                                        i11 = this.width;
                                    }
                                    this.displayWidth = i11;
                                    i12 = this.displayHeight;
                                    if (i12 == -1) {
                                        i12 = this.height;
                                    }
                                    this.displayHeight = i12;
                                } else {
                                    i7 = -1;
                                }
                                i8 = this.displayWidth;
                                if (i8 != i7) {
                                    f = -1.0f;
                                } else {
                                    f = -1.0f;
                                }
                                if (this.hasColorInfo) {
                                }
                                if (this.name == null) {
                                    iIntValue = i7;
                                } else {
                                    iIntValue = i7;
                                }
                                if (this.projectionType == 0) {
                                    i9 = iIntValue;
                                } else {
                                    i9 = iIntValue;
                                }
                                builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                                i6 = 2;
                            } else {
                                if (MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                                }
                                i6 = 3;
                            }
                            break;
                        }
                        if (this.name != null) {
                            builder.setLabel(this.name);
                        }
                        Format formatBuild111 = builder.setId(i).setSampleMimeType(str9).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags((z111 ? 1 : 0) | i5).setInitializationData(list2).setCodecs(str10).setDrmInitData(this.drmInitData).build();
                        TrackOutput trackOutputTrack111 = extractorOutput.track(this.number, i6);
                        this.output = trackOutputTrack111;
                        trackOutputTrack111.format(formatBuild111);
                        return;
                    }
                    Log.w(MatroskaExtractor.TAG, "Unsupported floating point PCM bit depth: " + this.audioBitDepth + ". Setting mimeType to audio/x-unknown");
                    str2 = str12;
                    listSingletonList = null;
                    str3 = null;
                    i4 = -1;
                    i2 = -1;
                    String str1112 = str3;
                    list2 = listSingletonList;
                    str9 = str2;
                    str10 = str1112;
                    if (this.dolbyVisionConfigBytes != null) {
                        str10 = dolbyVisionConfig.codecs;
                        str9 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z112 = this.flagDefault;
                    if (this.flagForced) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str9)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i2);
                        i6 = 1;
                    } else {
                        if (MimeTypes.isVideo(str9)) {
                            if (this.displayUnit == 0) {
                                i11 = this.displayWidth;
                                i7 = -1;
                                if (i11 == -1) {
                                    i11 = this.width;
                                }
                                this.displayWidth = i11;
                                i12 = this.displayHeight;
                                if (i12 == -1) {
                                    i12 = this.height;
                                }
                                this.displayHeight = i12;
                            } else {
                                i7 = -1;
                            }
                            i8 = this.displayWidth;
                            if (i8 != i7) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name == null) {
                                iIntValue = i7;
                            } else {
                                iIntValue = i7;
                            }
                            if (this.projectionType == 0) {
                                i9 = iIntValue;
                            } else {
                                i9 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i6 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                            }
                            i6 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild112 = builder.setId(i).setSampleMimeType(str9).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags((z112 ? 1 : 0) | i5).setInitializationData(list2).setCodecs(str10).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack112 = extractorOutput.track(this.number, i6);
                    this.output = trackOutputTrack112;
                    trackOutputTrack112.format(formatBuild112);
                    return;
                case 23:
                    int i13 = this.audioBitDepth;
                    if (i13 == 8) {
                        i2 = 3;
                    } else if (i13 == 16) {
                        i2 = 268435456;
                    } else if (i13 == 24) {
                        i2 = C.ENCODING_PCM_24BIT_BIG_ENDIAN;
                    } else {
                        if (i13 != 32) {
                            Log.w(MatroskaExtractor.TAG, "Unsupported big endian PCM bit depth: " + this.audioBitDepth + ". Setting mimeType to audio/x-unknown");
                            str2 = str12;
                            listSingletonList = null;
                            str3 = null;
                            i4 = -1;
                            i2 = -1;
                            String str1113 = str3;
                            list2 = listSingletonList;
                            str9 = str2;
                            str10 = str1113;
                            if (this.dolbyVisionConfigBytes != null) {
                                str10 = dolbyVisionConfig.codecs;
                                str9 = MimeTypes.VIDEO_DOLBY_VISION;
                            }
                            boolean z113 = this.flagDefault;
                            if (this.flagForced) {
                                i5 = 2;
                            } else {
                                i5 = 0;
                            }
                            builder = new Format.Builder();
                            if (MimeTypes.isAudio(str9)) {
                                builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i2);
                                i6 = 1;
                            } else {
                                if (MimeTypes.isVideo(str9)) {
                                    if (this.displayUnit == 0) {
                                        i11 = this.displayWidth;
                                        i7 = -1;
                                        if (i11 == -1) {
                                            i11 = this.width;
                                        }
                                        this.displayWidth = i11;
                                        i12 = this.displayHeight;
                                        if (i12 == -1) {
                                            i12 = this.height;
                                        }
                                        this.displayHeight = i12;
                                    } else {
                                        i7 = -1;
                                    }
                                    i8 = this.displayWidth;
                                    if (i8 != i7) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (this.hasColorInfo) {
                                    }
                                    if (this.name == null) {
                                        iIntValue = i7;
                                    } else {
                                        iIntValue = i7;
                                    }
                                    if (this.projectionType == 0) {
                                        i9 = iIntValue;
                                    } else {
                                        i9 = iIntValue;
                                    }
                                    builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                                    i6 = 2;
                                } else {
                                    if (MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                                    }
                                    i6 = 3;
                                }
                                break;
                            }
                            if (this.name != null) {
                                builder.setLabel(this.name);
                            }
                            Format formatBuild113 = builder.setId(i).setSampleMimeType(str9).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags((z113 ? 1 : 0) | i5).setInitializationData(list2).setCodecs(str10).setDrmInitData(this.drmInitData).build();
                            TrackOutput trackOutputTrack113 = extractorOutput.track(this.number, i6);
                            this.output = trackOutputTrack113;
                            trackOutputTrack113.format(formatBuild113);
                            return;
                        }
                        i2 = C.ENCODING_PCM_32BIT_BIG_ENDIAN;
                    }
                    str9 = MimeTypes.AUDIO_RAW;
                    list2 = null;
                    str10 = null;
                    i4 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str10 = dolbyVisionConfig.codecs;
                        str9 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z114 = this.flagDefault;
                    if (this.flagForced) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str9)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i2);
                        i6 = 1;
                    } else {
                        if (MimeTypes.isVideo(str9)) {
                            if (this.displayUnit == 0) {
                                i11 = this.displayWidth;
                                i7 = -1;
                                if (i11 == -1) {
                                    i11 = this.width;
                                }
                                this.displayWidth = i11;
                                i12 = this.displayHeight;
                                if (i12 == -1) {
                                    i12 = this.height;
                                }
                                this.displayHeight = i12;
                            } else {
                                i7 = -1;
                            }
                            i8 = this.displayWidth;
                            if (i8 != i7) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name == null) {
                                iIntValue = i7;
                            } else {
                                iIntValue = i7;
                            }
                            if (this.projectionType == 0) {
                                i9 = iIntValue;
                            } else {
                                i9 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i6 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                            }
                            i6 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild114 = builder.setId(i).setSampleMimeType(str9).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags((z114 ? 1 : 0) | i5).setInitializationData(list2).setCodecs(str10).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack114 = extractorOutput.track(this.number, i6);
                    this.output = trackOutputTrack114;
                    trackOutputTrack114.format(formatBuild114);
                    return;
                case 24:
                    int pcmEncoding2 = Util.getPcmEncoding(this.audioBitDepth);
                    if (pcmEncoding2 == 0) {
                        Log.w(MatroskaExtractor.TAG, "Unsupported little endian PCM bit depth: " + this.audioBitDepth + ". Setting mimeType to audio/x-unknown");
                        str2 = str12;
                        listSingletonList = null;
                        str3 = null;
                        i4 = -1;
                        i2 = -1;
                        String str1114 = str3;
                        list2 = listSingletonList;
                        str9 = str2;
                        str10 = str1114;
                        if (this.dolbyVisionConfigBytes != null) {
                            str10 = dolbyVisionConfig.codecs;
                            str9 = MimeTypes.VIDEO_DOLBY_VISION;
                        }
                        boolean z115 = this.flagDefault;
                        if (this.flagForced) {
                            i5 = 2;
                        } else {
                            i5 = 0;
                        }
                        builder = new Format.Builder();
                        if (MimeTypes.isAudio(str9)) {
                            builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i2);
                            i6 = 1;
                        } else {
                            if (MimeTypes.isVideo(str9)) {
                                if (this.displayUnit == 0) {
                                    i11 = this.displayWidth;
                                    i7 = -1;
                                    if (i11 == -1) {
                                        i11 = this.width;
                                    }
                                    this.displayWidth = i11;
                                    i12 = this.displayHeight;
                                    if (i12 == -1) {
                                        i12 = this.height;
                                    }
                                    this.displayHeight = i12;
                                } else {
                                    i7 = -1;
                                }
                                i8 = this.displayWidth;
                                if (i8 != i7) {
                                    f = -1.0f;
                                } else {
                                    f = -1.0f;
                                }
                                if (this.hasColorInfo) {
                                }
                                if (this.name == null) {
                                    iIntValue = i7;
                                } else {
                                    iIntValue = i7;
                                }
                                if (this.projectionType == 0) {
                                    i9 = iIntValue;
                                } else {
                                    i9 = iIntValue;
                                }
                                builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                                i6 = 2;
                            } else {
                                if (MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                                }
                                i6 = 3;
                            }
                            break;
                        }
                        if (this.name != null) {
                            builder.setLabel(this.name);
                        }
                        Format formatBuild115 = builder.setId(i).setSampleMimeType(str9).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags((z115 ? 1 : 0) | i5).setInitializationData(list2).setCodecs(str10).setDrmInitData(this.drmInitData).build();
                        TrackOutput trackOutputTrack115 = extractorOutput.track(this.number, i6);
                        this.output = trackOutputTrack115;
                        trackOutputTrack115.format(formatBuild115);
                        return;
                    }
                    i2 = pcmEncoding2;
                    str9 = MimeTypes.AUDIO_RAW;
                    list2 = null;
                    str10 = null;
                    i4 = -1;
                    if (this.dolbyVisionConfigBytes != null) {
                        str10 = dolbyVisionConfig.codecs;
                        str9 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z116 = this.flagDefault;
                    if (this.flagForced) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str9)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i2);
                        i6 = 1;
                    } else {
                        if (MimeTypes.isVideo(str9)) {
                            if (this.displayUnit == 0) {
                                i11 = this.displayWidth;
                                i7 = -1;
                                if (i11 == -1) {
                                    i11 = this.width;
                                }
                                this.displayWidth = i11;
                                i12 = this.displayHeight;
                                if (i12 == -1) {
                                    i12 = this.height;
                                }
                                this.displayHeight = i12;
                            } else {
                                i7 = -1;
                            }
                            i8 = this.displayWidth;
                            if (i8 != i7) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name == null) {
                                iIntValue = i7;
                            } else {
                                iIntValue = i7;
                            }
                            if (this.projectionType == 0) {
                                i9 = iIntValue;
                            } else {
                                i9 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i6 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                            }
                            i6 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild116 = builder.setId(i).setSampleMimeType(str9).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags((z116 ? 1 : 0) | i5).setInitializationData(list2).setCodecs(str10).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack116 = extractorOutput.track(this.number, i6);
                    this.output = trackOutputTrack116;
                    trackOutputTrack116.format(formatBuild116);
                    return;
                case 25:
                    listSingletonList = ImmutableList.of(MatroskaExtractor.SSA_DIALOGUE_FORMAT, getCodecPrivate(this.codecId));
                    str3 = null;
                    str2 = MimeTypes.TEXT_SSA;
                    i4 = -1;
                    i2 = -1;
                    String str1115 = str3;
                    list2 = listSingletonList;
                    str9 = str2;
                    str10 = str1115;
                    if (this.dolbyVisionConfigBytes != null) {
                        str10 = dolbyVisionConfig.codecs;
                        str9 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z117 = this.flagDefault;
                    if (this.flagForced) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str9)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i2);
                        i6 = 1;
                    } else {
                        if (MimeTypes.isVideo(str9)) {
                            if (this.displayUnit == 0) {
                                i11 = this.displayWidth;
                                i7 = -1;
                                if (i11 == -1) {
                                    i11 = this.width;
                                }
                                this.displayWidth = i11;
                                i12 = this.displayHeight;
                                if (i12 == -1) {
                                    i12 = this.height;
                                }
                                this.displayHeight = i12;
                            } else {
                                i7 = -1;
                            }
                            i8 = this.displayWidth;
                            if (i8 != i7) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name == null) {
                                iIntValue = i7;
                            } else {
                                iIntValue = i7;
                            }
                            if (this.projectionType == 0) {
                                i9 = iIntValue;
                            } else {
                                i9 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i6 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                            }
                            i6 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild117 = builder.setId(i).setSampleMimeType(str9).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags((z117 ? 1 : 0) | i5).setInitializationData(list2).setCodecs(str10).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack117 = extractorOutput.track(this.number, i6);
                    this.output = trackOutputTrack117;
                    trackOutputTrack117.format(formatBuild117);
                    return;
                case 26:
                    HevcConfig hevcConfig = HevcConfig.parse(new ParsableByteArray(getCodecPrivate(this.codecId)));
                    list = hevcConfig.initializationData;
                    this.nalUnitLengthFieldLength = hevcConfig.nalUnitLengthFieldLength;
                    str6 = hevcConfig.codecs;
                    str7 = MimeTypes.VIDEO_H265;
                    String str21 = str7;
                    List<byte[]> list4 = list;
                    str3 = str6;
                    listSingletonList = list4;
                    str2 = str21;
                    i4 = -1;
                    i2 = -1;
                    String str1116 = str3;
                    list2 = listSingletonList;
                    str9 = str2;
                    str10 = str1116;
                    if (this.dolbyVisionConfigBytes != null) {
                        str10 = dolbyVisionConfig.codecs;
                        str9 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z118 = this.flagDefault;
                    if (this.flagForced) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str9)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i2);
                        i6 = 1;
                    } else {
                        if (MimeTypes.isVideo(str9)) {
                            if (this.displayUnit == 0) {
                                i11 = this.displayWidth;
                                i7 = -1;
                                if (i11 == -1) {
                                    i11 = this.width;
                                }
                                this.displayWidth = i11;
                                i12 = this.displayHeight;
                                if (i12 == -1) {
                                    i12 = this.height;
                                }
                                this.displayHeight = i12;
                            } else {
                                i7 = -1;
                            }
                            i8 = this.displayWidth;
                            if (i8 != i7) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name == null) {
                                iIntValue = i7;
                            } else {
                                iIntValue = i7;
                            }
                            if (this.projectionType == 0) {
                                i9 = iIntValue;
                            } else {
                                i9 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i6 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                            }
                            i6 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild118 = builder.setId(i).setSampleMimeType(str9).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags((z118 ? 1 : 0) | i5).setInitializationData(list2).setCodecs(str10).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack118 = extractorOutput.track(this.number, i6);
                    this.output = trackOutputTrack118;
                    trackOutputTrack118.format(formatBuild118);
                    return;
                case 27:
                    listSingletonList = null;
                    str3 = null;
                    str2 = MimeTypes.TEXT_VTT;
                    i4 = -1;
                    i2 = -1;
                    String str1117 = str3;
                    list2 = listSingletonList;
                    str9 = str2;
                    str10 = str1117;
                    if (this.dolbyVisionConfigBytes != null) {
                        str10 = dolbyVisionConfig.codecs;
                        str9 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z119 = this.flagDefault;
                    if (this.flagForced) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str9)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i2);
                        i6 = 1;
                    } else {
                        if (MimeTypes.isVideo(str9)) {
                            if (this.displayUnit == 0) {
                                i11 = this.displayWidth;
                                i7 = -1;
                                if (i11 == -1) {
                                    i11 = this.width;
                                }
                                this.displayWidth = i11;
                                i12 = this.displayHeight;
                                if (i12 == -1) {
                                    i12 = this.height;
                                }
                                this.displayHeight = i12;
                            } else {
                                i7 = -1;
                            }
                            i8 = this.displayWidth;
                            if (i8 != i7) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name == null) {
                                iIntValue = i7;
                            } else {
                                iIntValue = i7;
                            }
                            if (this.projectionType == 0) {
                                i9 = iIntValue;
                            } else {
                                i9 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i6 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                            }
                            i6 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild119 = builder.setId(i).setSampleMimeType(str9).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags((z119 ? 1 : 0) | i5).setInitializationData(list2).setCodecs(str10).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack119 = extractorOutput.track(this.number, i6);
                    this.output = trackOutputTrack119;
                    trackOutputTrack119.format(formatBuild119);
                    return;
                case 28:
                    str12 = MimeTypes.APPLICATION_SUBRIP;
                    str2 = str12;
                    listSingletonList = null;
                    str3 = null;
                    i4 = -1;
                    i2 = -1;
                    String str1118 = str3;
                    list2 = listSingletonList;
                    str9 = str2;
                    str10 = str1118;
                    if (this.dolbyVisionConfigBytes != null) {
                        str10 = dolbyVisionConfig.codecs;
                        str9 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z1110 = this.flagDefault;
                    if (this.flagForced) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str9)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i2);
                        i6 = 1;
                    } else {
                        if (MimeTypes.isVideo(str9)) {
                            if (this.displayUnit == 0) {
                                i11 = this.displayWidth;
                                i7 = -1;
                                if (i11 == -1) {
                                    i11 = this.width;
                                }
                                this.displayWidth = i11;
                                i12 = this.displayHeight;
                                if (i12 == -1) {
                                    i12 = this.height;
                                }
                                this.displayHeight = i12;
                            } else {
                                i7 = -1;
                            }
                            i8 = this.displayWidth;
                            if (i8 != i7) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name == null) {
                                iIntValue = i7;
                            } else {
                                iIntValue = i7;
                            }
                            if (this.projectionType == 0) {
                                i9 = iIntValue;
                            } else {
                                i9 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i6 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                            }
                            i6 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild1110 = builder.setId(i).setSampleMimeType(str9).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags((z1110 ? 1 : 0) | i5).setInitializationData(list2).setCodecs(str10).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack1110 = extractorOutput.track(this.number, i6);
                    this.output = trackOutputTrack1110;
                    trackOutputTrack1110.format(formatBuild1110);
                    return;
                case 29:
                    str8 = MimeTypes.VIDEO_MPEG2;
                    str12 = str8;
                    str2 = str12;
                    listSingletonList = null;
                    str3 = null;
                    i4 = -1;
                    i2 = -1;
                    String str1119 = str3;
                    list2 = listSingletonList;
                    str9 = str2;
                    str10 = str1119;
                    if (this.dolbyVisionConfigBytes != null) {
                        str10 = dolbyVisionConfig.codecs;
                        str9 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z1111 = this.flagDefault;
                    if (this.flagForced) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str9)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i2);
                        i6 = 1;
                    } else {
                        if (MimeTypes.isVideo(str9)) {
                            if (this.displayUnit == 0) {
                                i11 = this.displayWidth;
                                i7 = -1;
                                if (i11 == -1) {
                                    i11 = this.width;
                                }
                                this.displayWidth = i11;
                                i12 = this.displayHeight;
                                if (i12 == -1) {
                                    i12 = this.height;
                                }
                                this.displayHeight = i12;
                            } else {
                                i7 = -1;
                            }
                            i8 = this.displayWidth;
                            if (i8 != i7) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name == null) {
                                iIntValue = i7;
                            } else {
                                iIntValue = i7;
                            }
                            if (this.projectionType == 0) {
                                i9 = iIntValue;
                            } else {
                                i9 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i6 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                            }
                            i6 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild1111 = builder.setId(i).setSampleMimeType(str9).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags((z1111 ? 1 : 0) | i5).setInitializationData(list2).setCodecs(str10).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack1111 = extractorOutput.track(this.number, i6);
                    this.output = trackOutputTrack1111;
                    trackOutputTrack1111.format(formatBuild1111);
                    return;
                case 30:
                    str8 = MimeTypes.AUDIO_E_AC3;
                    str12 = str8;
                    str2 = str12;
                    listSingletonList = null;
                    str3 = null;
                    i4 = -1;
                    i2 = -1;
                    String str11110 = str3;
                    list2 = listSingletonList;
                    str9 = str2;
                    str10 = str11110;
                    if (this.dolbyVisionConfigBytes != null) {
                        str10 = dolbyVisionConfig.codecs;
                        str9 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z1112 = this.flagDefault;
                    if (this.flagForced) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str9)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i2);
                        i6 = 1;
                    } else {
                        if (MimeTypes.isVideo(str9)) {
                            if (this.displayUnit == 0) {
                                i11 = this.displayWidth;
                                i7 = -1;
                                if (i11 == -1) {
                                    i11 = this.width;
                                }
                                this.displayWidth = i11;
                                i12 = this.displayHeight;
                                if (i12 == -1) {
                                    i12 = this.height;
                                }
                                this.displayHeight = i12;
                            } else {
                                i7 = -1;
                            }
                            i8 = this.displayWidth;
                            if (i8 != i7) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name == null) {
                                iIntValue = i7;
                            } else {
                                iIntValue = i7;
                            }
                            if (this.projectionType == 0) {
                                i9 = iIntValue;
                            } else {
                                i9 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i6 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                            }
                            i6 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild1112 = builder.setId(i).setSampleMimeType(str9).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags((z1112 ? 1 : 0) | i5).setInitializationData(list2).setCodecs(str10).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack1112 = extractorOutput.track(this.number, i6);
                    this.output = trackOutputTrack1112;
                    trackOutputTrack1112.format(formatBuild1112);
                    return;
                case 31:
                    listSingletonList = Collections.singletonList(getCodecPrivate(this.codecId));
                    str2 = MimeTypes.AUDIO_FLAC;
                    str3 = null;
                    i4 = -1;
                    i2 = -1;
                    String str11111 = str3;
                    list2 = listSingletonList;
                    str9 = str2;
                    str10 = str11111;
                    if (this.dolbyVisionConfigBytes != null) {
                        str10 = dolbyVisionConfig.codecs;
                        str9 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z1113 = this.flagDefault;
                    if (this.flagForced) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str9)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i2);
                        i6 = 1;
                    } else {
                        if (MimeTypes.isVideo(str9)) {
                            if (this.displayUnit == 0) {
                                i11 = this.displayWidth;
                                i7 = -1;
                                if (i11 == -1) {
                                    i11 = this.width;
                                }
                                this.displayWidth = i11;
                                i12 = this.displayHeight;
                                if (i12 == -1) {
                                    i12 = this.height;
                                }
                                this.displayHeight = i12;
                            } else {
                                i7 = -1;
                            }
                            i8 = this.displayWidth;
                            if (i8 != i7) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name == null) {
                                iIntValue = i7;
                            } else {
                                iIntValue = i7;
                            }
                            if (this.projectionType == 0) {
                                i9 = iIntValue;
                            } else {
                                i9 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i6 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                            }
                            i6 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild1113 = builder.setId(i).setSampleMimeType(str9).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags((z1113 ? 1 : 0) | i5).setInitializationData(list2).setCodecs(str10).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack1113 = extractorOutput.track(this.number, i6);
                    this.output = trackOutputTrack1113;
                    trackOutputTrack1113.format(formatBuild1113);
                    return;
                case 32:
                    listSingletonList = new ArrayList<>(3);
                    listSingletonList.add(getCodecPrivate(this.codecId));
                    listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.codecDelayNs).array());
                    listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.seekPreRollNs).array());
                    str4 = MimeTypes.AUDIO_OPUS;
                    i4 = MatroskaExtractor.OPUS_MAX_INPUT_SIZE;
                    str2 = str4;
                    str3 = null;
                    i2 = -1;
                    String str11112 = str3;
                    list2 = listSingletonList;
                    str9 = str2;
                    str10 = str11112;
                    if (this.dolbyVisionConfigBytes != null) {
                        str10 = dolbyVisionConfig.codecs;
                        str9 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z1114 = this.flagDefault;
                    if (this.flagForced) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str9)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i2);
                        i6 = 1;
                    } else {
                        if (MimeTypes.isVideo(str9)) {
                            if (this.displayUnit == 0) {
                                i11 = this.displayWidth;
                                i7 = -1;
                                if (i11 == -1) {
                                    i11 = this.width;
                                }
                                this.displayWidth = i11;
                                i12 = this.displayHeight;
                                if (i12 == -1) {
                                    i12 = this.height;
                                }
                                this.displayHeight = i12;
                            } else {
                                i7 = -1;
                            }
                            i8 = this.displayWidth;
                            if (i8 != i7) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                            }
                            if (this.name == null) {
                                iIntValue = i7;
                            } else {
                                iIntValue = i7;
                            }
                            if (this.projectionType == 0) {
                                i9 = iIntValue;
                            } else {
                                i9 = iIntValue;
                            }
                            builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(i9).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfoBuild);
                            i6 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                            }
                            i6 = 3;
                        }
                        break;
                    }
                    if (this.name != null) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild1114 = builder.setId(i).setSampleMimeType(str9).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags((z1114 ? 1 : 0) | i5).setInitializationData(list2).setCodecs(str10).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack1114 = extractorOutput.track(this.number, i6);
                    this.output = trackOutputTrack1114;
                    trackOutputTrack1114.format(formatBuild1114);
                    return;
                default:
                    throw ParserException.createForMalformedContainer("Unrecognized codec identifier.", null);
            }
        }

        @RequiresNonNull({"output"})
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

        /* JADX INFO: Access modifiers changed from: private */
        public boolean samplesHaveSupplementalData(boolean z) {
            if (MatroskaExtractor.CODEC_ID_OPUS.equals(this.codecId)) {
                return z;
            }
            return this.maxBlockAdditionId > 0;
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
                if (littleEndianUnsignedInt == 826496599) {
                    byte[] data = parsableByteArray.getData();
                    for (int position = parsableByteArray.getPosition() + 20; position < data.length - 4; position++) {
                        if (data[position] == 0 && data[position + 1] == 0 && data[position + 2] == 1 && data[position + 3] == 15) {
                            return new Pair<>(MimeTypes.VIDEO_VC1, Collections.singletonList(Arrays.copyOfRange(data, position, data.length)));
                        }
                    }
                    throw ParserException.createForMalformedContainer("Failed to find FourCC VC1 initialization data", null);
                }
                Log.w(MatroskaExtractor.TAG, "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair<>(MimeTypes.VIDEO_UNKNOWN, null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing FourCC private data", null);
            }
        }

        private static List<byte[]> parseVorbisCodecPrivate(byte[] bArr) throws ParserException {
            int i;
            int i2;
            try {
                if (bArr[0] != 2) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                int i3 = 0;
                int i4 = 1;
                while (true) {
                    i = bArr[i4] & 255;
                    if (i != 255) {
                        break;
                    }
                    i3 += 255;
                    i4++;
                }
                int i5 = i4 + 1;
                int i6 = i3 + i;
                int i7 = 0;
                while (true) {
                    i2 = bArr[i5] & 255;
                    if (i2 != 255) {
                        break;
                    }
                    i7 += 255;
                    i5++;
                }
                int i8 = i5 + 1;
                if (bArr[i8] != 1) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i6];
                System.arraycopy(bArr, i8, bArr2, 0, i6);
                int i9 = i8 + i6;
                if (bArr[i9] != 3) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                int i10 = i9 + i7 + i2;
                if (bArr[i10] != 5) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i10];
                System.arraycopy(bArr, i10, bArr3, 0, bArr.length - i10);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
            }
        }

        private static boolean parseMsAcmCodecPrivate(ParsableByteArray parsableByteArray) throws ParserException {
            try {
                int littleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
                if (littleEndianUnsignedShort == 1) {
                    return true;
                }
                if (littleEndianUnsignedShort != 65534) {
                    return false;
                }
                parsableByteArray.setPosition(24);
                return parsableByteArray.readLong() == MatroskaExtractor.WAVE_SUBFORMAT_PCM.getMostSignificantBits() && parsableByteArray.readLong() == MatroskaExtractor.WAVE_SUBFORMAT_PCM.getLeastSignificantBits();
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing MS/ACM codec private", null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @EnsuresNonNull({"output"})
        public void assertOutputInitialized() {
            Assertions.checkNotNull(this.output);
        }

        @EnsuresNonNull({"codecPrivate"})
        private byte[] getCodecPrivate(String str) throws ParserException {
            byte[] bArr = this.codecPrivate;
            if (bArr != null) {
                return bArr;
            }
            throw ParserException.createForMalformedContainer("Missing CodecPrivate for codec " + str, null);
        }
    }
}
