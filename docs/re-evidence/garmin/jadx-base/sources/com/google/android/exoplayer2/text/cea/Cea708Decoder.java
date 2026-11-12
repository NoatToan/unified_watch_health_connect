package com.google.android.exoplayer2.text.cea;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleInputBuffer;
import com.google.android.exoplayer2.text.SubtitleOutputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.CodecSpecificDataUtil;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.v;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public final class Cea708Decoder extends CeaDecoder {
    private static final int CC_VALID_FLAG = 4;
    private static final int CHARACTER_BIG_CARONS = 42;
    private static final int CHARACTER_BIG_OE = 44;
    private static final int CHARACTER_BOLD_BULLET = 53;
    private static final int CHARACTER_CLOSE_DOUBLE_QUOTE = 52;
    private static final int CHARACTER_CLOSE_SINGLE_QUOTE = 50;
    private static final int CHARACTER_DIAERESIS_Y = 63;
    private static final int CHARACTER_ELLIPSIS = 37;
    private static final int CHARACTER_FIVE_EIGHTHS = 120;
    private static final int CHARACTER_HORIZONTAL_BORDER = 125;
    private static final int CHARACTER_LOWER_LEFT_BORDER = 124;
    private static final int CHARACTER_LOWER_RIGHT_BORDER = 126;
    private static final int CHARACTER_MN = 127;
    private static final int CHARACTER_NBTSP = 33;
    private static final int CHARACTER_ONE_EIGHTH = 118;
    private static final int CHARACTER_OPEN_DOUBLE_QUOTE = 51;
    private static final int CHARACTER_OPEN_SINGLE_QUOTE = 49;
    private static final int CHARACTER_SEVEN_EIGHTHS = 121;
    private static final int CHARACTER_SM = 61;
    private static final int CHARACTER_SMALL_CARONS = 58;
    private static final int CHARACTER_SMALL_OE = 60;
    private static final int CHARACTER_SOLID_BLOCK = 48;
    private static final int CHARACTER_THREE_EIGHTHS = 119;
    private static final int CHARACTER_TM = 57;
    private static final int CHARACTER_TSP = 32;
    private static final int CHARACTER_UPPER_LEFT_BORDER = 127;
    private static final int CHARACTER_UPPER_RIGHT_BORDER = 123;
    private static final int CHARACTER_VERTICAL_BORDER = 122;
    private static final int COMMAND_BS = 8;
    private static final int COMMAND_CLW = 136;
    private static final int COMMAND_CR = 13;
    private static final int COMMAND_CW0 = 128;
    private static final int COMMAND_CW1 = 129;
    private static final int COMMAND_CW2 = 130;
    private static final int COMMAND_CW3 = 131;
    private static final int COMMAND_CW4 = 132;
    private static final int COMMAND_CW5 = 133;
    private static final int COMMAND_CW6 = 134;
    private static final int COMMAND_CW7 = 135;
    private static final int COMMAND_DF0 = 152;
    private static final int COMMAND_DF1 = 153;
    private static final int COMMAND_DF2 = 154;
    private static final int COMMAND_DF3 = 155;
    private static final int COMMAND_DF4 = 156;
    private static final int COMMAND_DF5 = 157;
    private static final int COMMAND_DF6 = 158;
    private static final int COMMAND_DF7 = 159;
    private static final int COMMAND_DLC = 142;
    private static final int COMMAND_DLW = 140;
    private static final int COMMAND_DLY = 141;
    private static final int COMMAND_DSW = 137;
    private static final int COMMAND_ETX = 3;
    private static final int COMMAND_EXT1 = 16;
    private static final int COMMAND_EXT1_END = 23;
    private static final int COMMAND_EXT1_START = 17;
    private static final int COMMAND_FF = 12;
    private static final int COMMAND_HCR = 14;
    private static final int COMMAND_HDW = 138;
    private static final int COMMAND_NUL = 0;
    private static final int COMMAND_P16_END = 31;
    private static final int COMMAND_P16_START = 24;
    private static final int COMMAND_RST = 143;
    private static final int COMMAND_SPA = 144;
    private static final int COMMAND_SPC = 145;
    private static final int COMMAND_SPL = 146;
    private static final int COMMAND_SWA = 151;
    private static final int COMMAND_TGW = 139;
    private static final int DTVCC_PACKET_DATA = 2;
    private static final int DTVCC_PACKET_START = 3;
    private static final int GROUP_C0_END = 31;
    private static final int GROUP_C1_END = 159;
    private static final int GROUP_C2_END = 31;
    private static final int GROUP_C3_END = 159;
    private static final int GROUP_G0_END = 127;
    private static final int GROUP_G1_END = 255;
    private static final int GROUP_G2_END = 127;
    private static final int GROUP_G3_END = 255;
    private static final int NUM_WINDOWS = 8;
    private static final String TAG = "Cea708Decoder";
    private final CueInfoBuilder[] cueInfoBuilders;
    private List<Cue> cues;
    private CueInfoBuilder currentCueInfoBuilder;
    private DtvCcPacket currentDtvCcPacket;
    private int currentWindow;
    private final boolean isWideAspectRatio;
    private List<Cue> lastCues;
    private final int selectedServiceNumber;
    private final ParsableByteArray ccData = new ParsableByteArray();
    private final ParsableBitArray serviceBlockPacket = new ParsableBitArray();
    private int previousSequenceNumber = -1;

    public static final class Cea708CueInfo {
        private static final Comparator<Cea708CueInfo> LEAST_IMPORTANT_FIRST = new a();
        public final Cue cue;
        public final int priority;

        public Cea708CueInfo(CharSequence charSequence, Layout.Alignment alignment, float f14, int i14, int i15, float f15, int i16, float f16, boolean z14, int i17, int i18) {
            Cue.Builder size = new Cue.Builder().setText(charSequence).setTextAlignment(alignment).setLine(f14, i14).setLineAnchor(i15).setPosition(f15).setPositionAnchor(i16).setSize(f16);
            if (z14) {
                size.setWindowColor(i17);
            }
            this.cue = size.build();
            this.priority = i18;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int lambda$static$0(Cea708CueInfo cea708CueInfo, Cea708CueInfo cea708CueInfo2) {
            return Integer.compare(cea708CueInfo2.priority, cea708CueInfo.priority);
        }
    }

    public static final class DtvCcPacket {
        int currentIndex = 0;
        public final byte[] packetData;
        public final int packetSize;
        public final int sequenceNumber;

        public DtvCcPacket(int i14, int i15) {
            this.sequenceNumber = i14;
            this.packetSize = i15;
            this.packetData = new byte[(i15 * 2) - 1];
        }
    }

    public Cea708Decoder(int i14, List<byte[]> list) {
        this.selectedServiceNumber = i14 == -1 ? 1 : i14;
        this.isWideAspectRatio = list != null && CodecSpecificDataUtil.parseCea708InitializationData(list);
        this.cueInfoBuilders = new CueInfoBuilder[8];
        int i15 = 0;
        while (true) {
            CueInfoBuilder[] cueInfoBuilderArr = this.cueInfoBuilders;
            if (i15 >= 8) {
                this.currentCueInfoBuilder = cueInfoBuilderArr[0];
                return;
            } else {
                cueInfoBuilderArr[i15] = new CueInfoBuilder();
                i15++;
            }
        }
    }

    private void finalizeCurrentPacket() {
        if (this.currentDtvCcPacket == null) {
            return;
        }
        processCurrentPacket();
        this.currentDtvCcPacket = null;
    }

    private List<Cue> getDisplayCues() {
        Cea708CueInfo cea708CueInfoBuild;
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < 8; i14++) {
            if (!this.cueInfoBuilders[i14].isEmpty() && this.cueInfoBuilders[i14].isVisible() && (cea708CueInfoBuild = this.cueInfoBuilders[i14].build()) != null) {
                arrayList.add(cea708CueInfoBuild);
            }
        }
        Collections.sort(arrayList, Cea708CueInfo.LEAST_IMPORTANT_FIRST);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            arrayList2.add(((Cea708CueInfo) arrayList.get(i15)).cue);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    private void handleC0Command(int i14) {
        if (i14 != 0) {
            if (i14 == 3) {
                this.cues = getDisplayCues();
                return;
            }
            if (i14 == 8) {
                this.currentCueInfoBuilder.backspace();
                return;
            }
            switch (i14) {
                case 12:
                    resetCueBuilders();
                    break;
                case 13:
                    this.currentCueInfoBuilder.append('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i14 >= 17 && i14 <= 23) {
                        v.e(55, i14, "Currently unsupported COMMAND_EXT1 Command: ", TAG);
                        this.serviceBlockPacket.skipBits(8);
                    } else if (i14 >= 24 && i14 <= 31) {
                        v.e(54, i14, "Currently unsupported COMMAND_P16 Command: ", TAG);
                        this.serviceBlockPacket.skipBits(16);
                    } else {
                        v.e(31, i14, "Invalid C0 command: ", TAG);
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void handleC1Command(int i14) {
        int i15 = 1;
        switch (i14) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i16 = i14 - 128;
                if (this.currentWindow != i16) {
                    this.currentWindow = i16;
                    this.currentCueInfoBuilder = this.cueInfoBuilders[i16];
                }
                break;
            case 136:
                while (i15 <= 8) {
                    if (this.serviceBlockPacket.readBit()) {
                        this.cueInfoBuilders[8 - i15].clear();
                    }
                    i15++;
                }
                break;
            case COMMAND_DSW /* 137 */:
                for (int i17 = 1; i17 <= 8; i17++) {
                    if (this.serviceBlockPacket.readBit()) {
                        this.cueInfoBuilders[8 - i17].setVisibility(true);
                    }
                }
                break;
            case 138:
                while (i15 <= 8) {
                    if (this.serviceBlockPacket.readBit()) {
                        this.cueInfoBuilders[8 - i15].setVisibility(false);
                    }
                    i15++;
                }
                break;
            case COMMAND_TGW /* 139 */:
                for (int i18 = 1; i18 <= 8; i18++) {
                    if (this.serviceBlockPacket.readBit()) {
                        CueInfoBuilder cueInfoBuilder = this.cueInfoBuilders[8 - i18];
                        cueInfoBuilder.setVisibility(!cueInfoBuilder.isVisible());
                    }
                }
                break;
            case COMMAND_DLW /* 140 */:
                while (i15 <= 8) {
                    if (this.serviceBlockPacket.readBit()) {
                        this.cueInfoBuilders[8 - i15].reset();
                    }
                    i15++;
                }
                break;
            case COMMAND_DLY /* 141 */:
                this.serviceBlockPacket.skipBits(8);
                break;
            case COMMAND_DLC /* 142 */:
                break;
            case COMMAND_RST /* 143 */:
                resetCueBuilders();
                break;
            case 144:
                if (this.currentCueInfoBuilder.isDefined()) {
                    handleSetPenAttributes();
                } else {
                    this.serviceBlockPacket.skipBits(16);
                }
                break;
            case COMMAND_SPC /* 145 */:
                if (this.currentCueInfoBuilder.isDefined()) {
                    handleSetPenColor();
                } else {
                    this.serviceBlockPacket.skipBits(24);
                }
                break;
            case COMMAND_SPL /* 146 */:
                if (this.currentCueInfoBuilder.isDefined()) {
                    handleSetPenLocation();
                } else {
                    this.serviceBlockPacket.skipBits(16);
                }
                break;
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                v.e(31, i14, "Invalid C1 command: ", TAG);
                break;
            case COMMAND_SWA /* 151 */:
                if (this.currentCueInfoBuilder.isDefined()) {
                    handleSetWindowAttributes();
                } else {
                    this.serviceBlockPacket.skipBits(32);
                }
                break;
            case 152:
            case COMMAND_DF1 /* 153 */:
            case COMMAND_DF2 /* 154 */:
            case 155:
            case COMMAND_DF4 /* 156 */:
            case COMMAND_DF5 /* 157 */:
            case COMMAND_DF6 /* 158 */:
            case 159:
                int i19 = i14 - 152;
                handleDefineWindow(i19);
                if (this.currentWindow != i19) {
                    this.currentWindow = i19;
                    this.currentCueInfoBuilder = this.cueInfoBuilders[i19];
                }
                break;
        }
    }

    private void handleC2Command(int i14) {
        if (i14 <= 7) {
            return;
        }
        if (i14 <= 15) {
            this.serviceBlockPacket.skipBits(8);
        } else if (i14 <= 23) {
            this.serviceBlockPacket.skipBits(16);
        } else if (i14 <= 31) {
            this.serviceBlockPacket.skipBits(24);
        }
    }

    private void handleC3Command(int i14) {
        if (i14 <= 135) {
            this.serviceBlockPacket.skipBits(32);
            return;
        }
        if (i14 <= COMMAND_RST) {
            this.serviceBlockPacket.skipBits(40);
        } else if (i14 <= 159) {
            this.serviceBlockPacket.skipBits(2);
            this.serviceBlockPacket.skipBits(this.serviceBlockPacket.readBits(6) * 8);
        }
    }

    private void handleDefineWindow(int i14) {
        CueInfoBuilder cueInfoBuilder = this.cueInfoBuilders[i14];
        this.serviceBlockPacket.skipBits(2);
        boolean bit = this.serviceBlockPacket.readBit();
        boolean bit2 = this.serviceBlockPacket.readBit();
        boolean bit3 = this.serviceBlockPacket.readBit();
        int bits = this.serviceBlockPacket.readBits(3);
        boolean bit4 = this.serviceBlockPacket.readBit();
        int bits2 = this.serviceBlockPacket.readBits(7);
        int bits3 = this.serviceBlockPacket.readBits(8);
        int bits4 = this.serviceBlockPacket.readBits(4);
        int bits5 = this.serviceBlockPacket.readBits(4);
        this.serviceBlockPacket.skipBits(2);
        int bits6 = this.serviceBlockPacket.readBits(6);
        this.serviceBlockPacket.skipBits(2);
        cueInfoBuilder.defineWindow(bit, bit2, bit3, bits, bit4, bits2, bits3, bits5, bits6, bits4, this.serviceBlockPacket.readBits(3), this.serviceBlockPacket.readBits(3));
    }

    private void handleG0Character(int i14) {
        CueInfoBuilder cueInfoBuilder = this.currentCueInfoBuilder;
        if (i14 == 127) {
            cueInfoBuilder.append((char) 9835);
        } else {
            cueInfoBuilder.append((char) (i14 & 255));
        }
    }

    private void handleG1Character(int i14) {
        this.currentCueInfoBuilder.append((char) (i14 & 255));
    }

    private void handleG2Character(int i14) {
        if (i14 == 32) {
            this.currentCueInfoBuilder.append(' ');
            return;
        }
        if (i14 == 33) {
            this.currentCueInfoBuilder.append((char) 160);
            return;
        }
        if (i14 == 37) {
            this.currentCueInfoBuilder.append((char) 8230);
            return;
        }
        if (i14 == 42) {
            this.currentCueInfoBuilder.append((char) 352);
            return;
        }
        if (i14 == 44) {
            this.currentCueInfoBuilder.append((char) 338);
            return;
        }
        if (i14 == 63) {
            this.currentCueInfoBuilder.append((char) 376);
            return;
        }
        if (i14 == 57) {
            this.currentCueInfoBuilder.append((char) 8482);
            return;
        }
        if (i14 == 58) {
            this.currentCueInfoBuilder.append((char) 353);
            return;
        }
        if (i14 == 60) {
            this.currentCueInfoBuilder.append((char) 339);
            return;
        }
        if (i14 == 61) {
            this.currentCueInfoBuilder.append((char) 8480);
            return;
        }
        switch (i14) {
            case 48:
                this.currentCueInfoBuilder.append((char) 9608);
                break;
            case 49:
                this.currentCueInfoBuilder.append((char) 8216);
                break;
            case 50:
                this.currentCueInfoBuilder.append((char) 8217);
                break;
            case 51:
                this.currentCueInfoBuilder.append((char) 8220);
                break;
            case 52:
                this.currentCueInfoBuilder.append((char) 8221);
                break;
            case 53:
                this.currentCueInfoBuilder.append((char) 8226);
                break;
            default:
                switch (i14) {
                    case 118:
                        this.currentCueInfoBuilder.append((char) 8539);
                        break;
                    case 119:
                        this.currentCueInfoBuilder.append((char) 8540);
                        break;
                    case 120:
                        this.currentCueInfoBuilder.append((char) 8541);
                        break;
                    case 121:
                        this.currentCueInfoBuilder.append((char) 8542);
                        break;
                    case 122:
                        this.currentCueInfoBuilder.append((char) 9474);
                        break;
                    case 123:
                        this.currentCueInfoBuilder.append((char) 9488);
                        break;
                    case 124:
                        this.currentCueInfoBuilder.append((char) 9492);
                        break;
                    case 125:
                        this.currentCueInfoBuilder.append((char) 9472);
                        break;
                    case 126:
                        this.currentCueInfoBuilder.append((char) 9496);
                        break;
                    case 127:
                        this.currentCueInfoBuilder.append((char) 9484);
                        break;
                    default:
                        v.e(33, i14, "Invalid G2 character: ", TAG);
                        break;
                }
                break;
        }
    }

    private void handleG3Character(int i14) {
        if (i14 == 160) {
            this.currentCueInfoBuilder.append((char) 13252);
        } else {
            v.e(33, i14, "Invalid G3 character: ", TAG);
            this.currentCueInfoBuilder.append('_');
        }
    }

    private void handleSetPenAttributes() {
        this.currentCueInfoBuilder.setPenAttributes(this.serviceBlockPacket.readBits(4), this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBit(), this.serviceBlockPacket.readBit(), this.serviceBlockPacket.readBits(3), this.serviceBlockPacket.readBits(3));
    }

    private void handleSetPenColor() {
        int argbColorFromCeaColor = CueInfoBuilder.getArgbColorFromCeaColor(this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBits(2));
        int argbColorFromCeaColor2 = CueInfoBuilder.getArgbColorFromCeaColor(this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBits(2));
        this.serviceBlockPacket.skipBits(2);
        this.currentCueInfoBuilder.setPenColor(argbColorFromCeaColor, argbColorFromCeaColor2, CueInfoBuilder.getArgbColorFromCeaColor(this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBits(2)));
    }

    private void handleSetPenLocation() {
        this.serviceBlockPacket.skipBits(4);
        int bits = this.serviceBlockPacket.readBits(4);
        this.serviceBlockPacket.skipBits(2);
        this.currentCueInfoBuilder.setPenLocation(bits, this.serviceBlockPacket.readBits(6));
    }

    private void handleSetWindowAttributes() {
        int argbColorFromCeaColor = CueInfoBuilder.getArgbColorFromCeaColor(this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBits(2));
        int bits = this.serviceBlockPacket.readBits(2);
        int argbColorFromCeaColor2 = CueInfoBuilder.getArgbColorFromCeaColor(this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBits(2));
        if (this.serviceBlockPacket.readBit()) {
            bits |= 4;
        }
        boolean bit = this.serviceBlockPacket.readBit();
        int bits2 = this.serviceBlockPacket.readBits(2);
        int bits3 = this.serviceBlockPacket.readBits(2);
        int bits4 = this.serviceBlockPacket.readBits(2);
        this.serviceBlockPacket.skipBits(8);
        this.currentCueInfoBuilder.setWindowAttributes(argbColorFromCeaColor, argbColorFromCeaColor2, bit, bits, bits2, bits3, bits4);
    }

    private void processCurrentPacket() {
        DtvCcPacket dtvCcPacket = this.currentDtvCcPacket;
        int i14 = dtvCcPacket.currentIndex;
        int i15 = dtvCcPacket.packetSize;
        if (i14 != (i15 * 2) - 1) {
            int i16 = dtvCcPacket.sequenceNumber;
            StringBuilder sb3 = new StringBuilder(115);
            sb3.append("DtvCcPacket ended prematurely; size is ");
            sb3.append((i15 * 2) - 1);
            sb3.append(", but current index is ");
            sb3.append(i14);
            sb3.append(" (sequence number ");
            sb3.append(i16);
            sb3.append(");");
            Log.d(TAG, sb3.toString());
        }
        ParsableBitArray parsableBitArray = this.serviceBlockPacket;
        DtvCcPacket dtvCcPacket2 = this.currentDtvCcPacket;
        parsableBitArray.reset(dtvCcPacket2.packetData, dtvCcPacket2.currentIndex);
        int bits = this.serviceBlockPacket.readBits(3);
        int bits2 = this.serviceBlockPacket.readBits(5);
        if (bits == 7) {
            this.serviceBlockPacket.skipBits(2);
            bits = this.serviceBlockPacket.readBits(6);
            if (bits < 7) {
                v.e(44, bits, "Invalid extended service number: ", TAG);
            }
        }
        if (bits2 == 0) {
            if (bits != 0) {
                StringBuilder sb4 = new StringBuilder(59);
                sb4.append("serviceNumber is non-zero (");
                sb4.append(bits);
                sb4.append(") when blockSize is 0");
                Log.w(TAG, sb4.toString());
                return;
            }
            return;
        }
        if (bits != this.selectedServiceNumber) {
            return;
        }
        int position = (bits2 * 8) + this.serviceBlockPacket.getPosition();
        boolean z14 = false;
        while (this.serviceBlockPacket.bitsLeft() > 0 && this.serviceBlockPacket.getPosition() < position) {
            int bits3 = this.serviceBlockPacket.readBits(8);
            if (bits3 == 16) {
                int bits4 = this.serviceBlockPacket.readBits(8);
                if (bits4 <= 31) {
                    handleC2Command(bits4);
                } else {
                    if (bits4 <= 127) {
                        handleG2Character(bits4);
                    } else if (bits4 <= 159) {
                        handleC3Command(bits4);
                    } else if (bits4 <= 255) {
                        handleG3Character(bits4);
                    } else {
                        v.e(37, bits4, "Invalid extended command: ", TAG);
                    }
                    z14 = true;
                }
            } else if (bits3 <= 31) {
                handleC0Command(bits3);
            } else {
                if (bits3 <= 127) {
                    handleG0Character(bits3);
                } else if (bits3 <= 159) {
                    handleC1Command(bits3);
                } else if (bits3 <= 255) {
                    handleG1Character(bits3);
                } else {
                    v.e(33, bits3, "Invalid base command: ", TAG);
                }
                z14 = true;
            }
        }
        if (z14) {
            this.cues = getDisplayCues();
        }
    }

    private void resetCueBuilders() {
        for (int i14 = 0; i14 < 8; i14++) {
            this.cueInfoBuilders[i14].reset();
        }
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder
    public Subtitle createSubtitle() {
        List<Cue> list = this.cues;
        this.lastCues = list;
        return new CeaSubtitle((List) Assertions.checkNotNull(list));
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder
    public void decode(SubtitleInputBuffer subtitleInputBuffer) {
        ByteBuffer byteBuffer = (ByteBuffer) Assertions.checkNotNull(subtitleInputBuffer.data);
        this.ccData.reset(byteBuffer.array(), byteBuffer.limit());
        while (this.ccData.bytesLeft() >= 3) {
            int unsignedByte = this.ccData.readUnsignedByte();
            int i14 = unsignedByte & 3;
            boolean z14 = (unsignedByte & 4) == 4;
            byte unsignedByte2 = (byte) this.ccData.readUnsignedByte();
            byte unsignedByte3 = (byte) this.ccData.readUnsignedByte();
            if (i14 == 2 || i14 == 3) {
                if (z14) {
                    if (i14 == 3) {
                        finalizeCurrentPacket();
                        int i15 = (unsignedByte2 & 192) >> 6;
                        int i16 = this.previousSequenceNumber;
                        if (i16 != -1 && i15 != (i16 + 1) % 4) {
                            resetCueBuilders();
                            int i17 = this.previousSequenceNumber;
                            StringBuilder sb3 = new StringBuilder(71);
                            sb3.append("Sequence number discontinuity. previous=");
                            sb3.append(i17);
                            sb3.append(" current=");
                            sb3.append(i15);
                            Log.w(TAG, sb3.toString());
                        }
                        this.previousSequenceNumber = i15;
                        int i18 = unsignedByte2 & 63;
                        if (i18 == 0) {
                            i18 = 64;
                        }
                        DtvCcPacket dtvCcPacket = new DtvCcPacket(i15, i18);
                        this.currentDtvCcPacket = dtvCcPacket;
                        byte[] bArr = dtvCcPacket.packetData;
                        int i19 = dtvCcPacket.currentIndex;
                        dtvCcPacket.currentIndex = i19 + 1;
                        bArr[i19] = unsignedByte3;
                    } else {
                        Assertions.checkArgument(i14 == 2);
                        DtvCcPacket dtvCcPacket2 = this.currentDtvCcPacket;
                        if (dtvCcPacket2 == null) {
                            Log.e(TAG, "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = dtvCcPacket2.packetData;
                            int i24 = dtvCcPacket2.currentIndex;
                            int i25 = i24 + 1;
                            dtvCcPacket2.currentIndex = i25;
                            bArr2[i24] = unsignedByte2;
                            dtvCcPacket2.currentIndex = i24 + 2;
                            bArr2[i25] = unsignedByte3;
                        }
                    }
                    DtvCcPacket dtvCcPacket3 = this.currentDtvCcPacket;
                    if (dtvCcPacket3.currentIndex == (dtvCcPacket3.packetSize * 2) - 1) {
                        finalizeCurrentPacket();
                    }
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    public /* bridge */ /* synthetic */ SubtitleInputBuffer dequeueInputBuffer() {
        return super.dequeueInputBuffer();
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    public /* bridge */ /* synthetic */ SubtitleOutputBuffer dequeueOutputBuffer() {
        return super.dequeueOutputBuffer();
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    public void flush() {
        super.flush();
        this.cues = null;
        this.lastCues = null;
        this.currentWindow = 0;
        this.currentCueInfoBuilder = this.cueInfoBuilders[0];
        resetCueBuilders();
        this.currentDtvCcPacket = null;
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
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.text.SubtitleDecoder
    public /* bridge */ /* synthetic */ void setPositionUs(long j8) {
        super.setPositionUs(j8);
    }

    public static final class CueInfoBuilder {
        private static final int BORDER_AND_EDGE_TYPE_NONE = 0;
        private static final int BORDER_AND_EDGE_TYPE_UNIFORM = 3;
        public static final int COLOR_SOLID_BLACK;
        public static final int COLOR_SOLID_WHITE = getArgbColorFromCeaColor(2, 2, 2, 0);
        public static final int COLOR_TRANSPARENT;
        private static final int DEFAULT_PRIORITY = 4;
        private static final int DIRECTION_BOTTOM_TO_TOP = 3;
        private static final int DIRECTION_LEFT_TO_RIGHT = 0;
        private static final int DIRECTION_RIGHT_TO_LEFT = 1;
        private static final int DIRECTION_TOP_TO_BOTTOM = 2;
        private static final int HORIZONTAL_SIZE = 209;
        private static final int JUSTIFICATION_CENTER = 2;
        private static final int JUSTIFICATION_FULL = 3;
        private static final int JUSTIFICATION_LEFT = 0;
        private static final int JUSTIFICATION_RIGHT = 1;
        private static final int MAXIMUM_ROW_COUNT = 15;
        private static final int PEN_FONT_STYLE_DEFAULT = 0;
        private static final int PEN_FONT_STYLE_MONOSPACED_WITHOUT_SERIFS = 3;
        private static final int PEN_FONT_STYLE_MONOSPACED_WITH_SERIFS = 1;
        private static final int PEN_FONT_STYLE_PROPORTIONALLY_SPACED_WITHOUT_SERIFS = 4;
        private static final int PEN_FONT_STYLE_PROPORTIONALLY_SPACED_WITH_SERIFS = 2;
        private static final int PEN_OFFSET_NORMAL = 1;
        private static final int PEN_SIZE_STANDARD = 1;
        private static final int[] PEN_STYLE_BACKGROUND;
        private static final int[] PEN_STYLE_EDGE_TYPE;
        private static final int[] PEN_STYLE_FONT_STYLE;
        private static final int RELATIVE_CUE_SIZE = 99;
        private static final int VERTICAL_SIZE = 74;
        private static final int[] WINDOW_STYLE_FILL;
        private static final int[] WINDOW_STYLE_JUSTIFICATION;
        private static final int[] WINDOW_STYLE_PRINT_DIRECTION;
        private static final int[] WINDOW_STYLE_SCROLL_DIRECTION;
        private static final boolean[] WINDOW_STYLE_WORD_WRAP;
        private int anchorId;
        private int backgroundColor;
        private int backgroundColorStartPosition;
        private boolean defined;
        private int foregroundColor;
        private int foregroundColorStartPosition;
        private int horizontalAnchor;
        private int italicsStartPosition;
        private int justification;
        private int penStyleId;
        private int priority;
        private boolean relativePositioning;
        private int row;
        private int rowCount;
        private boolean rowLock;
        private int underlineStartPosition;
        private int verticalAnchor;
        private boolean visible;
        private int windowFillColor;
        private int windowStyleId;
        private final List<SpannableString> rolledUpCaptions = new ArrayList();
        private final SpannableStringBuilder captionStringBuilder = new SpannableStringBuilder();

        static {
            int argbColorFromCeaColor = getArgbColorFromCeaColor(0, 0, 0, 0);
            COLOR_SOLID_BLACK = argbColorFromCeaColor;
            int argbColorFromCeaColor2 = getArgbColorFromCeaColor(0, 0, 0, 3);
            COLOR_TRANSPARENT = argbColorFromCeaColor2;
            WINDOW_STYLE_JUSTIFICATION = new int[]{0, 0, 0, 0, 0, 2, 0};
            WINDOW_STYLE_PRINT_DIRECTION = new int[]{0, 0, 0, 0, 0, 0, 2};
            WINDOW_STYLE_SCROLL_DIRECTION = new int[]{3, 3, 3, 3, 3, 3, 1};
            WINDOW_STYLE_WORD_WRAP = new boolean[]{false, false, false, true, true, true, false};
            WINDOW_STYLE_FILL = new int[]{argbColorFromCeaColor, argbColorFromCeaColor2, argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor2, argbColorFromCeaColor, argbColorFromCeaColor};
            PEN_STYLE_FONT_STYLE = new int[]{0, 1, 2, 3, 4, 3, 4};
            PEN_STYLE_EDGE_TYPE = new int[]{0, 0, 0, 0, 0, 3, 3};
            PEN_STYLE_BACKGROUND = new int[]{argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor2, argbColorFromCeaColor2};
        }

        public CueInfoBuilder() {
            reset();
        }

        /* JADX WARN: Code duplicated, block: B:9:0x001b  */
        public static int getArgbColorFromCeaColor(int i14, int i15, int i16, int i17) {
            int i18;
            Assertions.checkIndex(i14, 0, 4);
            Assertions.checkIndex(i15, 0, 4);
            Assertions.checkIndex(i16, 0, 4);
            Assertions.checkIndex(i17, 0, 4);
            if (i17 == 0 || i17 == 1) {
                i18 = 255;
            } else if (i17 == 2) {
                i18 = 127;
            } else if (i17 != 3) {
                i18 = 255;
            } else {
                i18 = 0;
            }
            return Color.argb(i18, i14 > 1 ? 255 : 0, i15 > 1 ? 255 : 0, i16 > 1 ? 255 : 0);
        }

        public void append(char c14) {
            if (c14 != '\n') {
                this.captionStringBuilder.append(c14);
                return;
            }
            this.rolledUpCaptions.add(buildSpannableString());
            this.captionStringBuilder.clear();
            if (this.italicsStartPosition != -1) {
                this.italicsStartPosition = 0;
            }
            if (this.underlineStartPosition != -1) {
                this.underlineStartPosition = 0;
            }
            if (this.foregroundColorStartPosition != -1) {
                this.foregroundColorStartPosition = 0;
            }
            if (this.backgroundColorStartPosition != -1) {
                this.backgroundColorStartPosition = 0;
            }
            while (true) {
                if ((!this.rowLock || this.rolledUpCaptions.size() < this.rowCount) && this.rolledUpCaptions.size() < 15) {
                    return;
                } else {
                    this.rolledUpCaptions.remove(0);
                }
            }
        }

        public void backspace() {
            int length = this.captionStringBuilder.length();
            if (length > 0) {
                this.captionStringBuilder.delete(length - 1, length);
            }
        }

        public Cea708CueInfo build() {
            Layout.Alignment alignment;
            float f14;
            float f15;
            if (isEmpty()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i14 = 0; i14 < this.rolledUpCaptions.size(); i14++) {
                spannableStringBuilder.append((CharSequence) this.rolledUpCaptions.get(i14));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) buildSpannableString());
            int i15 = this.justification;
            int i16 = 2;
            if (i15 == 0) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i15 == 1) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i15 != 2) {
                if (i15 != 3) {
                    h.s(v.b(43, i15, "Unexpected justification value: "));
                    return null;
                }
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            boolean z14 = this.relativePositioning;
            int i17 = this.horizontalAnchor;
            if (z14) {
                f14 = i17 / 99.0f;
                f15 = this.verticalAnchor / 99.0f;
            } else {
                f14 = i17 / 209.0f;
                f15 = this.verticalAnchor / 74.0f;
            }
            float f16 = (f14 * 0.9f) + 0.05f;
            float f17 = (f15 * 0.9f) + 0.05f;
            int i18 = this.anchorId;
            int i19 = i18 / 3 == 0 ? 0 : i18 / 3 == 1 ? 1 : 2;
            if (i18 % 3 == 0) {
                i16 = 0;
            } else if (i18 % 3 == 1) {
                i16 = 1;
            }
            int i24 = this.windowFillColor;
            return new Cea708CueInfo(spannableStringBuilder, alignment, f17, 0, i19, f16, i16, -3.4028235E38f, i24 != COLOR_SOLID_BLACK, i24, this.priority);
        }

        public SpannableString buildSpannableString() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.captionStringBuilder);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.italicsStartPosition != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.italicsStartPosition, length, 33);
                }
                if (this.underlineStartPosition != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.underlineStartPosition, length, 33);
                }
                if (this.foregroundColorStartPosition != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.foregroundColor), this.foregroundColorStartPosition, length, 33);
                }
                if (this.backgroundColorStartPosition != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.backgroundColor), this.backgroundColorStartPosition, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void clear() {
            this.rolledUpCaptions.clear();
            this.captionStringBuilder.clear();
            this.italicsStartPosition = -1;
            this.underlineStartPosition = -1;
            this.foregroundColorStartPosition = -1;
            this.backgroundColorStartPosition = -1;
            this.row = 0;
        }

        public void defineWindow(boolean z14, boolean z15, boolean z16, int i14, boolean z17, int i15, int i16, int i17, int i18, int i19, int i24, int i25) {
            this.defined = true;
            this.visible = z14;
            this.rowLock = z15;
            this.priority = i14;
            this.relativePositioning = z17;
            this.verticalAnchor = i15;
            this.horizontalAnchor = i16;
            this.anchorId = i19;
            int i26 = i17 + 1;
            if (this.rowCount != i26) {
                this.rowCount = i26;
                while (true) {
                    if ((!z15 || this.rolledUpCaptions.size() < this.rowCount) && this.rolledUpCaptions.size() < 15) {
                        break;
                    } else {
                        this.rolledUpCaptions.remove(0);
                    }
                }
            }
            if (i24 != 0 && this.windowStyleId != i24) {
                this.windowStyleId = i24;
                int i27 = i24 - 1;
                setWindowAttributes(WINDOW_STYLE_FILL[i27], COLOR_TRANSPARENT, WINDOW_STYLE_WORD_WRAP[i27], 0, WINDOW_STYLE_PRINT_DIRECTION[i27], WINDOW_STYLE_SCROLL_DIRECTION[i27], WINDOW_STYLE_JUSTIFICATION[i27]);
            }
            if (i25 == 0 || this.penStyleId == i25) {
                return;
            }
            this.penStyleId = i25;
            int i28 = i25 - 1;
            setPenAttributes(0, 1, 1, false, false, PEN_STYLE_EDGE_TYPE[i28], PEN_STYLE_FONT_STYLE[i28]);
            setPenColor(COLOR_SOLID_WHITE, PEN_STYLE_BACKGROUND[i28], COLOR_SOLID_BLACK);
        }

        public boolean isDefined() {
            return this.defined;
        }

        public boolean isEmpty() {
            if (isDefined()) {
                return this.rolledUpCaptions.isEmpty() && this.captionStringBuilder.length() == 0;
            }
            return true;
        }

        public boolean isVisible() {
            return this.visible;
        }

        public void reset() {
            clear();
            this.defined = false;
            this.visible = false;
            this.priority = 4;
            this.relativePositioning = false;
            this.verticalAnchor = 0;
            this.horizontalAnchor = 0;
            this.anchorId = 0;
            this.rowCount = 15;
            this.rowLock = true;
            this.justification = 0;
            this.windowStyleId = 0;
            this.penStyleId = 0;
            int i14 = COLOR_SOLID_BLACK;
            this.windowFillColor = i14;
            this.foregroundColor = COLOR_SOLID_WHITE;
            this.backgroundColor = i14;
        }

        public void setPenAttributes(int i14, int i15, int i16, boolean z14, boolean z15, int i17, int i18) {
            if (this.italicsStartPosition != -1) {
                if (!z14) {
                    this.captionStringBuilder.setSpan(new StyleSpan(2), this.italicsStartPosition, this.captionStringBuilder.length(), 33);
                    this.italicsStartPosition = -1;
                }
            } else if (z14) {
                this.italicsStartPosition = this.captionStringBuilder.length();
            }
            if (this.underlineStartPosition == -1) {
                if (z15) {
                    this.underlineStartPosition = this.captionStringBuilder.length();
                }
            } else {
                if (z15) {
                    return;
                }
                this.captionStringBuilder.setSpan(new UnderlineSpan(), this.underlineStartPosition, this.captionStringBuilder.length(), 33);
                this.underlineStartPosition = -1;
            }
        }

        public void setPenColor(int i14, int i15, int i16) {
            if (this.foregroundColorStartPosition != -1 && this.foregroundColor != i14) {
                this.captionStringBuilder.setSpan(new ForegroundColorSpan(this.foregroundColor), this.foregroundColorStartPosition, this.captionStringBuilder.length(), 33);
            }
            if (i14 != COLOR_SOLID_WHITE) {
                this.foregroundColorStartPosition = this.captionStringBuilder.length();
                this.foregroundColor = i14;
            }
            if (this.backgroundColorStartPosition != -1 && this.backgroundColor != i15) {
                this.captionStringBuilder.setSpan(new BackgroundColorSpan(this.backgroundColor), this.backgroundColorStartPosition, this.captionStringBuilder.length(), 33);
            }
            if (i15 != COLOR_SOLID_BLACK) {
                this.backgroundColorStartPosition = this.captionStringBuilder.length();
                this.backgroundColor = i15;
            }
        }

        public void setPenLocation(int i14, int i15) {
            if (this.row != i14) {
                append('\n');
            }
            this.row = i14;
        }

        public void setVisibility(boolean z14) {
            this.visible = z14;
        }

        public void setWindowAttributes(int i14, int i15, boolean z14, int i16, int i17, int i18, int i19) {
            this.windowFillColor = i14;
            this.justification = i19;
        }

        public static int getArgbColorFromCeaColor(int i14, int i15, int i16) {
            return getArgbColorFromCeaColor(i14, i15, i16, 0);
        }
    }
}
