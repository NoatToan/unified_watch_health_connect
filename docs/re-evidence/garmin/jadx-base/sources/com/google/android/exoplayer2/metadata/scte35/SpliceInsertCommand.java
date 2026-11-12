package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new Parcelable.Creator<SpliceInsertCommand>() { // from class: com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SpliceInsertCommand createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SpliceInsertCommand[] newArray(int i14) {
            return new SpliceInsertCommand[i14];
        }
    };
    public final boolean autoReturn;
    public final int availNum;
    public final int availsExpected;
    public final long breakDurationUs;
    public final List<ComponentSplice> componentSpliceList;
    public final boolean outOfNetworkIndicator;
    public final boolean programSpliceFlag;
    public final long programSplicePlaybackPositionUs;
    public final long programSplicePts;
    public final boolean spliceEventCancelIndicator;
    public final long spliceEventId;
    public final boolean spliceImmediateFlag;
    public final int uniqueProgramId;

    public static final class ComponentSplice {
        public final long componentSplicePlaybackPositionUs;
        public final long componentSplicePts;
        public final int componentTag;

        private ComponentSplice(int i14, long j8, long j14) {
            this.componentTag = i14;
            this.componentSplicePts = j8;
            this.componentSplicePlaybackPositionUs = j14;
        }

        public static ComponentSplice createFromParcel(Parcel parcel) {
            return new ComponentSplice(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void writeToParcel(Parcel parcel) {
            parcel.writeInt(this.componentTag);
            parcel.writeLong(this.componentSplicePts);
            parcel.writeLong(this.componentSplicePlaybackPositionUs);
        }
    }

    private SpliceInsertCommand(Parcel parcel) {
        this.spliceEventId = parcel.readLong();
        this.spliceEventCancelIndicator = parcel.readByte() == 1;
        this.outOfNetworkIndicator = parcel.readByte() == 1;
        this.programSpliceFlag = parcel.readByte() == 1;
        this.spliceImmediateFlag = parcel.readByte() == 1;
        this.programSplicePts = parcel.readLong();
        this.programSplicePlaybackPositionUs = parcel.readLong();
        int i14 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i14);
        for (int i15 = 0; i15 < i14; i15++) {
            arrayList.add(ComponentSplice.createFromParcel(parcel));
        }
        this.componentSpliceList = Collections.unmodifiableList(arrayList);
        this.autoReturn = parcel.readByte() == 1;
        this.breakDurationUs = parcel.readLong();
        this.uniqueProgramId = parcel.readInt();
        this.availNum = parcel.readInt();
        this.availsExpected = parcel.readInt();
    }

    public static SpliceInsertCommand parseFromSection(ParsableByteArray parsableByteArray, long j8, TimestampAdjuster timestampAdjuster) {
        List list;
        long j14;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i14;
        int unsignedByte;
        int unsignedByte2;
        boolean z18;
        long unsignedInt = parsableByteArray.readUnsignedInt();
        boolean z19 = (parsableByteArray.readUnsignedByte() & 128) != 0;
        List list2 = Collections.EMPTY_LIST;
        long unsignedInt2 = C.TIME_UNSET;
        if (z19) {
            list = list2;
            j14 = -9223372036854775807L;
            z14 = false;
            z15 = false;
            z16 = false;
            z17 = false;
            i14 = 0;
            unsignedByte = 0;
            unsignedByte2 = 0;
        } else {
            int unsignedByte3 = parsableByteArray.readUnsignedByte();
            boolean z24 = (unsignedByte3 & 128) != 0;
            boolean z25 = (unsignedByte3 & 64) != 0;
            boolean z26 = (unsignedByte3 & 32) != 0;
            boolean z27 = (unsignedByte3 & 16) != 0;
            long spliceTime = (!z25 || z27) ? -9223372036854775807L : TimeSignalCommand.parseSpliceTime(parsableByteArray, j8);
            if (!z25) {
                int unsignedByte4 = parsableByteArray.readUnsignedByte();
                ArrayList arrayList = new ArrayList(unsignedByte4);
                int i15 = 0;
                while (i15 < unsignedByte4) {
                    int unsignedByte5 = parsableByteArray.readUnsignedByte();
                    long spliceTime2 = !z27 ? TimeSignalCommand.parseSpliceTime(parsableByteArray, j8) : -9223372036854775807L;
                    arrayList.add(new ComponentSplice(unsignedByte5, spliceTime2, timestampAdjuster.adjustTsTimestamp(spliceTime2)));
                    i15++;
                    unsignedByte4 = unsignedByte4;
                }
                list2 = arrayList;
            }
            if (z26) {
                long unsignedByte6 = parsableByteArray.readUnsignedByte();
                boolean z28 = (128 & unsignedByte6) != 0;
                unsignedInt2 = ((((unsignedByte6 & 1) << 32) | parsableByteArray.readUnsignedInt()) * 1000) / 90;
                z18 = z28;
            } else {
                z18 = false;
            }
            int unsignedShort = parsableByteArray.readUnsignedShort();
            long j15 = spliceTime;
            j14 = unsignedInt2;
            unsignedInt2 = j15;
            unsignedByte = parsableByteArray.readUnsignedByte();
            unsignedByte2 = parsableByteArray.readUnsignedByte();
            i14 = unsignedShort;
            z17 = z18;
            z14 = z24;
            z15 = z25;
            list = list2;
            z16 = z27;
        }
        return new SpliceInsertCommand(unsignedInt, z19, z14, z15, z16, unsignedInt2, timestampAdjuster.adjustTsTimestamp(unsignedInt2), list, z17, j14, i14, unsignedByte, unsignedByte2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        parcel.writeLong(this.spliceEventId);
        parcel.writeByte(this.spliceEventCancelIndicator ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.outOfNetworkIndicator ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.programSpliceFlag ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.spliceImmediateFlag ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.programSplicePts);
        parcel.writeLong(this.programSplicePlaybackPositionUs);
        int size = this.componentSpliceList.size();
        parcel.writeInt(size);
        for (int i15 = 0; i15 < size; i15++) {
            this.componentSpliceList.get(i15).writeToParcel(parcel);
        }
        parcel.writeByte(this.autoReturn ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.breakDurationUs);
        parcel.writeInt(this.uniqueProgramId);
        parcel.writeInt(this.availNum);
        parcel.writeInt(this.availsExpected);
    }

    private SpliceInsertCommand(long j8, boolean z14, boolean z15, boolean z16, boolean z17, long j14, long j15, List<ComponentSplice> list, boolean z18, long j16, int i14, int i15, int i16) {
        this.spliceEventId = j8;
        this.spliceEventCancelIndicator = z14;
        this.outOfNetworkIndicator = z15;
        this.programSpliceFlag = z16;
        this.spliceImmediateFlag = z17;
        this.programSplicePts = j14;
        this.programSplicePlaybackPositionUs = j15;
        this.componentSpliceList = Collections.unmodifiableList(list);
        this.autoReturn = z18;
        this.breakDurationUs = j16;
        this.uniqueProgramId = i14;
        this.availNum = i15;
        this.availsExpected = i16;
    }
}
