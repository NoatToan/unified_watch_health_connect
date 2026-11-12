package com.google.android.exoplayer2.text.cea;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleInputBuffer;
import com.google.android.exoplayer2.text.SubtitleOutputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Ascii;
import com.google.mlkit.common.MlKitException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class Cea608Decoder extends CeaDecoder {
    private static final int CC_FIELD_FLAG = 1;
    private static final byte CC_IMPLICIT_DATA_HEADER = -4;
    private static final int CC_MODE_PAINT_ON = 3;
    private static final int CC_MODE_POP_ON = 2;
    private static final int CC_MODE_ROLL_UP = 1;
    private static final int CC_MODE_UNKNOWN = 0;
    private static final int CC_TYPE_FLAG = 2;
    private static final int CC_VALID_FLAG = 4;
    private static final byte CTRL_BACKSPACE = 33;
    private static final byte CTRL_CARRIAGE_RETURN = 45;
    private static final byte CTRL_DELETE_TO_END_OF_ROW = 36;
    private static final byte CTRL_END_OF_CAPTION = 47;
    private static final byte CTRL_ERASE_DISPLAYED_MEMORY = 44;
    private static final byte CTRL_ERASE_NON_DISPLAYED_MEMORY = 46;
    private static final byte CTRL_RESUME_CAPTION_LOADING = 32;
    private static final byte CTRL_RESUME_DIRECT_CAPTIONING = 41;
    private static final byte CTRL_RESUME_TEXT_DISPLAY = 43;
    private static final byte CTRL_ROLL_UP_CAPTIONS_2_ROWS = 37;
    private static final byte CTRL_ROLL_UP_CAPTIONS_3_ROWS = 38;
    private static final byte CTRL_ROLL_UP_CAPTIONS_4_ROWS = 39;
    private static final byte CTRL_TEXT_RESTART = 42;
    private static final int DEFAULT_CAPTIONS_ROW_COUNT = 4;
    public static final long MIN_DATA_CHANNEL_TIMEOUT_MS = 16000;
    private static final int NTSC_CC_CHANNEL_1 = 0;
    private static final int NTSC_CC_CHANNEL_2 = 1;
    private static final int NTSC_CC_FIELD_1 = 0;
    private static final int NTSC_CC_FIELD_2 = 1;
    private static final int STYLE_ITALICS = 7;
    private static final int STYLE_UNCHANGED = 8;
    private static final String TAG = "Cea608Decoder";
    private int captionMode;
    private int captionRowCount;
    private List<Cue> cues;
    private boolean isCaptionValid;
    private boolean isInCaptionService;
    private long lastCueUpdateUs;
    private List<Cue> lastCues;
    private final int packetLength;
    private byte repeatableControlCc1;
    private byte repeatableControlCc2;
    private boolean repeatableControlSet;
    private final int selectedChannel;
    private final int selectedField;
    private final long validDataChannelTimeoutUs;
    private static final int[] ROW_INDICES = {11, 1, 3, 12, 14, 5, 7, 9};
    private static final int[] COLUMN_INDICES = {0, 4, 8, 12, 16, 20, 24, 28};
    private static final int[] STYLE_COLORS = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] BASIC_CHARACTER_SET = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    private static final int[] SPECIAL_CHARACTER_SET = {174, SyslogConstants.LOG_LOCAL6, PsExtractor.PRIVATE_STREAM_1, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    private static final int[] SPECIAL_ES_FR_CHARACTER_SET = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE, 235, MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR, MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD, 239, 212, 217, 249, 219, 171, 187};
    private static final int[] SPECIAL_PT_DE_CHARACTER_SET = {195, 227, MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    private static final boolean[] ODD_PARITY_BYTE_TABLE = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    private final ParsableByteArray ccData = new ParsableByteArray();
    private final ArrayList<CueBuilder> cueBuilders = new ArrayList<>();
    private CueBuilder currentCueBuilder = new CueBuilder(0, 4);
    private int currentChannel = 0;

    public static final class CueBuilder {
        private static final int BASE_ROW = 15;
        private static final int SCREEN_CHARWIDTH = 32;
        private int captionMode;
        private int captionRowCount;
        private int indent;
        private int row;
        private int tabOffset;
        private final List<CueStyle> cueStyles = new ArrayList();
        private final List<SpannableString> rolledUpCaptions = new ArrayList();
        private final StringBuilder captionStringBuilder = new StringBuilder();

        public static class CueStyle {
            public int start;
            public final int style;
            public final boolean underline;

            public CueStyle(int i14, boolean z14, int i15) {
                this.style = i14;
                this.underline = z14;
                this.start = i15;
            }
        }

        public CueBuilder(int i14, int i15) {
            reset(i14);
            this.captionRowCount = i15;
        }

        private SpannableString buildCurrentLine() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.captionStringBuilder);
            int length = spannableStringBuilder.length();
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = 0;
            int i19 = 0;
            boolean z14 = false;
            while (i18 < this.cueStyles.size()) {
                CueStyle cueStyle = this.cueStyles.get(i18);
                boolean z15 = cueStyle.underline;
                int i24 = cueStyle.style;
                if (i24 != 8) {
                    boolean z16 = i24 == 7;
                    if (i24 != 7) {
                        i17 = Cea608Decoder.STYLE_COLORS[i24];
                    }
                    z14 = z16;
                }
                int i25 = cueStyle.start;
                i18++;
                if (i25 != (i18 < this.cueStyles.size() ? this.cueStyles.get(i18).start : length)) {
                    if (i14 != -1 && !z15) {
                        setUnderlineSpan(spannableStringBuilder, i14, i25);
                        i14 = -1;
                    } else if (i14 == -1 && z15) {
                        i14 = i25;
                    }
                    if (i15 != -1 && !z14) {
                        setItalicSpan(spannableStringBuilder, i15, i25);
                        i15 = -1;
                    } else if (i15 == -1 && z14) {
                        i15 = i25;
                    }
                    if (i17 != i16) {
                        setColorSpan(spannableStringBuilder, i19, i25, i16);
                        i16 = i17;
                        i19 = i25;
                    }
                }
            }
            if (i14 != -1 && i14 != length) {
                setUnderlineSpan(spannableStringBuilder, i14, length);
            }
            if (i15 != -1 && i15 != length) {
                setItalicSpan(spannableStringBuilder, i15, length);
            }
            if (i19 != length) {
                setColorSpan(spannableStringBuilder, i19, length, i16);
            }
            return new SpannableString(spannableStringBuilder);
        }

        private static void setColorSpan(SpannableStringBuilder spannableStringBuilder, int i14, int i15, int i16) {
            if (i16 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i16), i14, i15, 33);
        }

        private static void setItalicSpan(SpannableStringBuilder spannableStringBuilder, int i14, int i15) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i14, i15, 33);
        }

        private static void setUnderlineSpan(SpannableStringBuilder spannableStringBuilder, int i14, int i15) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i14, i15, 33);
        }

        public void append(char c14) {
            if (this.captionStringBuilder.length() < 32) {
                this.captionStringBuilder.append(c14);
            }
        }

        public void backspace() {
            int length = this.captionStringBuilder.length();
            if (length > 0) {
                this.captionStringBuilder.delete(length - 1, length);
                for (int size = this.cueStyles.size() - 1; size >= 0; size--) {
                    CueStyle cueStyle = this.cueStyles.get(size);
                    int i14 = cueStyle.start;
                    if (i14 != length) {
                        return;
                    }
                    cueStyle.start = i14 - 1;
                }
            }
        }

        public Cue build(int i14) {
            float f14;
            int i15 = this.indent + this.tabOffset;
            int i16 = 32 - i15;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i17 = 0; i17 < this.rolledUpCaptions.size(); i17++) {
                spannableStringBuilder.append(Util.truncateAscii(this.rolledUpCaptions.get(i17), i16));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(Util.truncateAscii(buildCurrentLine(), i16));
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length = i16 - spannableStringBuilder.length();
            int i18 = i15 - length;
            if (i14 == Integer.MIN_VALUE) {
                i14 = (this.captionMode != 2 || (Math.abs(i18) >= 3 && length >= 0)) ? (this.captionMode != 2 || i18 <= 0) ? 0 : 2 : 1;
            }
            if (i14 != 1) {
                if (i14 == 2) {
                    i15 = 32 - length;
                }
                f14 = ((i15 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f14 = 0.5f;
            }
            int i19 = this.row;
            if (i19 > 7) {
                i19 -= 17;
            } else if (this.captionMode == 1) {
                i19 -= this.captionRowCount - 1;
            }
            return new Cue.Builder().setText(spannableStringBuilder).setTextAlignment(Layout.Alignment.ALIGN_NORMAL).setLine(i19, 1).setPosition(f14).setPositionAnchor(i14).build();
        }

        public boolean isEmpty() {
            return this.cueStyles.isEmpty() && this.rolledUpCaptions.isEmpty() && this.captionStringBuilder.length() == 0;
        }

        public void reset(int i14) {
            this.captionMode = i14;
            this.cueStyles.clear();
            this.rolledUpCaptions.clear();
            this.captionStringBuilder.setLength(0);
            this.row = 15;
            this.indent = 0;
            this.tabOffset = 0;
        }

        public void rollUp() {
            this.rolledUpCaptions.add(buildCurrentLine());
            this.captionStringBuilder.setLength(0);
            this.cueStyles.clear();
            int iMin = Math.min(this.captionRowCount, this.row);
            while (this.rolledUpCaptions.size() >= iMin) {
                this.rolledUpCaptions.remove(0);
            }
        }

        public void setCaptionMode(int i14) {
            this.captionMode = i14;
        }

        public void setCaptionRowCount(int i14) {
            this.captionRowCount = i14;
        }

        public void setStyle(int i14, boolean z14) {
            this.cueStyles.add(new CueStyle(i14, z14, this.captionStringBuilder.length()));
        }
    }

    public Cea608Decoder(String str, int i14, long j8) {
        this.validDataChannelTimeoutUs = j8 > 0 ? j8 * 1000 : -9223372036854775807L;
        this.packetLength = MimeTypes.APPLICATION_MP4CEA608.equals(str) ? 2 : 3;
        if (i14 == 1) {
            this.selectedChannel = 0;
            this.selectedField = 0;
        } else if (i14 == 2) {
            this.selectedChannel = 1;
            this.selectedField = 0;
        } else if (i14 == 3) {
            this.selectedChannel = 0;
            this.selectedField = 1;
        } else if (i14 != 4) {
            Log.w(TAG, "Invalid channel. Defaulting to CC1.");
            this.selectedChannel = 0;
            this.selectedField = 0;
        } else {
            this.selectedChannel = 1;
            this.selectedField = 1;
        }
        setCaptionMode(0);
        resetCueBuilders();
        this.isInCaptionService = true;
        this.lastCueUpdateUs = C.TIME_UNSET;
    }

    private static char getBasicChar(byte b14) {
        return (char) BASIC_CHARACTER_SET[(b14 & Ascii.DEL) - 32];
    }

    private static int getChannel(byte b14) {
        return (b14 >> 3) & 1;
    }

    private List<Cue> getDisplayCues() {
        int size = this.cueBuilders.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i14 = 0; i14 < size; i14++) {
            Cue cueBuild = this.cueBuilders.get(i14).build(Integer.MIN_VALUE);
            arrayList.add(cueBuild);
            if (cueBuild != null) {
                iMin = Math.min(iMin, cueBuild.positionAnchor);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i15 = 0; i15 < size; i15++) {
            Cue cue = (Cue) arrayList.get(i15);
            if (cue != null) {
                if (cue.positionAnchor != iMin) {
                    cue = (Cue) Assertions.checkNotNull(this.cueBuilders.get(i15).build(iMin));
                }
                arrayList2.add(cue);
            }
        }
        return arrayList2;
    }

    private static char getExtendedEsFrChar(byte b14) {
        return (char) SPECIAL_ES_FR_CHARACTER_SET[b14 & Ascii.US];
    }

    private static char getExtendedPtDeChar(byte b14) {
        return (char) SPECIAL_PT_DE_CHARACTER_SET[b14 & Ascii.US];
    }

    private static char getExtendedWestEuropeanChar(byte b14, byte b15) {
        return (b14 & 1) == 0 ? getExtendedEsFrChar(b15) : getExtendedPtDeChar(b15);
    }

    private static char getSpecialNorthAmericanChar(byte b14) {
        return (char) SPECIAL_CHARACTER_SET[b14 & Ascii.SI];
    }

    private void handleMidrowCtrl(byte b14) {
        this.currentCueBuilder.append(' ');
        this.currentCueBuilder.setStyle((b14 >> 1) & 7, (b14 & 1) == 1);
    }

    private void handleMiscCode(byte b14) {
        if (b14 == 32) {
            setCaptionMode(2);
            return;
        }
        if (b14 == 41) {
            setCaptionMode(3);
            return;
        }
        switch (b14) {
            case 37:
                setCaptionMode(1);
                setCaptionRowCount(2);
                break;
            case 38:
                setCaptionMode(1);
                setCaptionRowCount(3);
                break;
            case 39:
                setCaptionMode(1);
                setCaptionRowCount(4);
                break;
            default:
                int i14 = this.captionMode;
                if (i14 != 0) {
                    if (b14 != 33) {
                        switch (b14) {
                            case 44:
                                this.cues = Collections.EMPTY_LIST;
                                if (i14 == 1 || i14 == 3) {
                                    resetCueBuilders();
                                }
                                break;
                            case 45:
                                if (i14 == 1 && !this.currentCueBuilder.isEmpty()) {
                                    this.currentCueBuilder.rollUp();
                                    break;
                                }
                                break;
                            case 46:
                                resetCueBuilders();
                                break;
                            case 47:
                                this.cues = getDisplayCues();
                                resetCueBuilders();
                                break;
                        }
                    } else {
                        this.currentCueBuilder.backspace();
                        break;
                    }
                }
                break;
        }
    }

    private void handlePreambleAddressCode(byte b14, byte b15) {
        int i14 = ROW_INDICES[b14 & 7];
        if ((b15 & 32) != 0) {
            i14++;
        }
        if (i14 != this.currentCueBuilder.row) {
            if (this.captionMode != 1 && !this.currentCueBuilder.isEmpty()) {
                CueBuilder cueBuilder = new CueBuilder(this.captionMode, this.captionRowCount);
                this.currentCueBuilder = cueBuilder;
                this.cueBuilders.add(cueBuilder);
            }
            this.currentCueBuilder.row = i14;
        }
        boolean z14 = (b15 & Ascii.DLE) == 16;
        boolean z15 = (b15 & 1) == 1;
        int i15 = (b15 >> 1) & 7;
        this.currentCueBuilder.setStyle(z14 ? 8 : i15, z15);
        if (z14) {
            this.currentCueBuilder.indent = COLUMN_INDICES[i15];
        }
    }

    private static boolean isCtrlCode(byte b14) {
        return (b14 & 224) == 0;
    }

    private static boolean isExtendedWestEuropeanChar(byte b14, byte b15) {
        return (b14 & 246) == 18 && (b15 & 224) == 32;
    }

    private static boolean isMidrowCtrlCode(byte b14, byte b15) {
        return (b14 & 247) == 17 && (b15 & 240) == 32;
    }

    private static boolean isMiscCode(byte b14, byte b15) {
        return (b14 & 246) == 20 && (b15 & 240) == 32;
    }

    private static boolean isPreambleAddressCode(byte b14, byte b15) {
        return (b14 & 240) == 16 && (b15 & 192) == 64;
    }

    private static boolean isRepeatable(byte b14) {
        return (b14 & 240) == 16;
    }

    private boolean isRepeatedCommand(boolean z14, byte b14, byte b15) {
        if (!z14 || !isRepeatable(b14)) {
            this.repeatableControlSet = false;
        } else {
            if (this.repeatableControlSet && this.repeatableControlCc1 == b14 && this.repeatableControlCc2 == b15) {
                this.repeatableControlSet = false;
                return true;
            }
            this.repeatableControlSet = true;
            this.repeatableControlCc1 = b14;
            this.repeatableControlCc2 = b15;
        }
        return false;
    }

    private static boolean isServiceSwitchCommand(byte b14) {
        return (b14 & 247) == 20;
    }

    private static boolean isSpecialNorthAmericanChar(byte b14, byte b15) {
        return (b14 & 247) == 17 && (b15 & 240) == 48;
    }

    private static boolean isTabCtrlCode(byte b14, byte b15) {
        return (b14 & 247) == 23 && b15 >= 33 && b15 <= 35;
    }

    private static boolean isXdsControlCode(byte b14) {
        return 1 <= b14 && b14 <= 15;
    }

    private void maybeUpdateIsInCaptionService(byte b14, byte b15) {
        if (isXdsControlCode(b14)) {
            this.isInCaptionService = false;
            return;
        }
        if (isServiceSwitchCommand(b14)) {
            if (b15 != 32 && b15 != 47) {
                switch (b15) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b15) {
                            case 42:
                            case 43:
                                this.isInCaptionService = false;
                                break;
                        }
                        return;
                }
            }
            this.isInCaptionService = true;
        }
    }

    private void resetCueBuilders() {
        this.currentCueBuilder.reset(this.captionMode);
        this.cueBuilders.clear();
        this.cueBuilders.add(this.currentCueBuilder);
    }

    private void setCaptionMode(int i14) {
        int i15 = this.captionMode;
        if (i15 == i14) {
            return;
        }
        this.captionMode = i14;
        if (i14 == 3) {
            for (int i16 = 0; i16 < this.cueBuilders.size(); i16++) {
                this.cueBuilders.get(i16).setCaptionMode(i14);
            }
            return;
        }
        resetCueBuilders();
        if (i15 == 3 || i14 == 1 || i14 == 0) {
            this.cues = Collections.EMPTY_LIST;
        }
    }

    private void setCaptionRowCount(int i14) {
        this.captionRowCount = i14;
        this.currentCueBuilder.setCaptionRowCount(i14);
    }

    private boolean shouldClearStuckCaptions() {
        return (this.validDataChannelTimeoutUs == C.TIME_UNSET || this.lastCueUpdateUs == C.TIME_UNSET || getPositionUs() - this.lastCueUpdateUs < this.validDataChannelTimeoutUs) ? false : true;
    }

    private boolean updateAndVerifyCurrentChannel(byte b14) {
        if (isCtrlCode(b14)) {
            this.currentChannel = getChannel(b14);
        }
        return this.currentChannel == this.selectedChannel;
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder
    public Subtitle createSubtitle() {
        List<Cue> list = this.cues;
        this.lastCues = list;
        return new CeaSubtitle((List) Assertions.checkNotNull(list));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder
    public void decode(SubtitleInputBuffer subtitleInputBuffer) {
        boolean z14;
        ByteBuffer byteBuffer = (ByteBuffer) Assertions.checkNotNull(subtitleInputBuffer.data);
        this.ccData.reset(byteBuffer.array(), byteBuffer.limit());
        boolean z15 = false;
        while (true) {
            int iBytesLeft = this.ccData.bytesLeft();
            int i14 = this.packetLength;
            if (iBytesLeft < i14) {
                break;
            }
            byte unsignedByte = i14 == 2 ? CC_IMPLICIT_DATA_HEADER : (byte) this.ccData.readUnsignedByte();
            int unsignedByte2 = this.ccData.readUnsignedByte();
            int unsignedByte3 = this.ccData.readUnsignedByte();
            if ((unsignedByte & 2) == 0 && (unsignedByte & 1) == this.selectedField) {
                byte b14 = (byte) (unsignedByte2 & 127);
                byte b15 = (byte) (unsignedByte3 & 127);
                if (b14 != 0 || b15 != 0) {
                    boolean z16 = this.isCaptionValid;
                    if ((unsignedByte & 4) == 4) {
                        boolean[] zArr = ODD_PARITY_BYTE_TABLE;
                        if (zArr[unsignedByte2] && zArr[unsignedByte3]) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    } else {
                        z14 = false;
                    }
                    this.isCaptionValid = z14;
                    if (!isRepeatedCommand(z14, b14, b15)) {
                        if (this.isCaptionValid) {
                            maybeUpdateIsInCaptionService(b14, b15);
                            if (this.isInCaptionService && updateAndVerifyCurrentChannel(b14)) {
                                if (!isCtrlCode(b14)) {
                                    this.currentCueBuilder.append(getBasicChar(b14));
                                    if ((b15 & 224) != 0) {
                                        this.currentCueBuilder.append(getBasicChar(b15));
                                    }
                                } else if (isSpecialNorthAmericanChar(b14, b15)) {
                                    this.currentCueBuilder.append(getSpecialNorthAmericanChar(b15));
                                } else if (isExtendedWestEuropeanChar(b14, b15)) {
                                    this.currentCueBuilder.backspace();
                                    this.currentCueBuilder.append(getExtendedWestEuropeanChar(b14, b15));
                                } else if (isMidrowCtrlCode(b14, b15)) {
                                    handleMidrowCtrl(b15);
                                } else if (isPreambleAddressCode(b14, b15)) {
                                    handlePreambleAddressCode(b14, b15);
                                } else if (isTabCtrlCode(b14, b15)) {
                                    this.currentCueBuilder.tabOffset = b15 - 32;
                                } else if (isMiscCode(b14, b15)) {
                                    handleMiscCode(b15);
                                }
                                z15 = true;
                            }
                        } else if (z16) {
                            resetCueBuilders();
                            z15 = true;
                        }
                    }
                }
            }
        }
        if (z15) {
            int i15 = this.captionMode;
            if (i15 == 1 || i15 == 3) {
                this.cues = getDisplayCues();
                this.lastCueUpdateUs = getPositionUs();
            }
        }
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    public /* bridge */ /* synthetic */ SubtitleInputBuffer dequeueInputBuffer() {
        return super.dequeueInputBuffer();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    public SubtitleOutputBuffer dequeueOutputBuffer() {
        SubtitleOutputBuffer availableOutputBuffer;
        SubtitleOutputBuffer subtitleOutputBufferDequeueOutputBuffer = super.dequeueOutputBuffer();
        if (subtitleOutputBufferDequeueOutputBuffer != null) {
            return subtitleOutputBufferDequeueOutputBuffer;
        }
        if (!shouldClearStuckCaptions() || (availableOutputBuffer = getAvailableOutputBuffer()) == null) {
            return null;
        }
        this.cues = Collections.EMPTY_LIST;
        this.lastCueUpdateUs = C.TIME_UNSET;
        availableOutputBuffer.setContent(getPositionUs(), createSubtitle(), Long.MAX_VALUE);
        return availableOutputBuffer;
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    public void flush() {
        super.flush();
        this.cues = null;
        this.lastCues = null;
        setCaptionMode(0);
        setCaptionRowCount(4);
        resetCueBuilders();
        this.isCaptionValid = false;
        this.repeatableControlSet = false;
        this.repeatableControlCc1 = (byte) 0;
        this.repeatableControlCc2 = (byte) 0;
        this.currentChannel = 0;
        this.isInCaptionService = true;
        this.lastCueUpdateUs = C.TIME_UNSET;
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    public String getName() {
        return TAG;
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder
    public boolean isNewSubtitleDataAvailable() {
        return this.cues != this.lastCues;
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder
    public /* bridge */ /* synthetic */ void queueInputBuffer(SubtitleInputBuffer subtitleInputBuffer) {
        super.queueInputBuffer(subtitleInputBuffer);
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    public void release() {
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.text.SubtitleDecoder
    public /* bridge */ /* synthetic */ void setPositionUs(long j8) {
        super.setPositionUs(j8);
    }
}
