package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new Parcelable.Creator<SpliceScheduleCommand>() { // from class: com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SpliceScheduleCommand createFromParcel(Parcel parcel) {
            return new SpliceScheduleCommand(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SpliceScheduleCommand[] newArray(int i14) {
            return new SpliceScheduleCommand[i14];
        }
    };
    public final List<Event> events;

    public static final class ComponentSplice {
        public final int componentTag;
        public final long utcSpliceTime;

        private ComponentSplice(int i14, long j8) {
            this.componentTag = i14;
            this.utcSpliceTime = j8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ComponentSplice createFromParcel(Parcel parcel) {
            return new ComponentSplice(parcel.readInt(), parcel.readLong());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void writeToParcel(Parcel parcel) {
            parcel.writeInt(this.componentTag);
            parcel.writeLong(this.utcSpliceTime);
        }
    }

    private SpliceScheduleCommand(Parcel parcel) {
        int i14 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i14);
        for (int i15 = 0; i15 < i14; i15++) {
            arrayList.add(Event.createFromParcel(parcel));
        }
        this.events = Collections.unmodifiableList(arrayList);
    }

    public static SpliceScheduleCommand parseFromSection(ParsableByteArray parsableByteArray) {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        ArrayList arrayList = new ArrayList(unsignedByte);
        for (int i14 = 0; i14 < unsignedByte; i14++) {
            arrayList.add(Event.parseFromSection(parsableByteArray));
        }
        return new SpliceScheduleCommand(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        int size = this.events.size();
        parcel.writeInt(size);
        for (int i15 = 0; i15 < size; i15++) {
            this.events.get(i15).writeToParcel(parcel);
        }
    }

    private SpliceScheduleCommand(List<Event> list) {
        this.events = Collections.unmodifiableList(list);
    }

    public static final class Event {
        public final boolean autoReturn;
        public final int availNum;
        public final int availsExpected;
        public final long breakDurationUs;
        public final List<ComponentSplice> componentSpliceList;
        public final boolean outOfNetworkIndicator;
        public final boolean programSpliceFlag;
        public final boolean spliceEventCancelIndicator;
        public final long spliceEventId;
        public final int uniqueProgramId;
        public final long utcSpliceTime;

        private Event(Parcel parcel) {
            this.spliceEventId = parcel.readLong();
            this.spliceEventCancelIndicator = parcel.readByte() == 1;
            this.outOfNetworkIndicator = parcel.readByte() == 1;
            this.programSpliceFlag = parcel.readByte() == 1;
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            for (int i15 = 0; i15 < i14; i15++) {
                arrayList.add(ComponentSplice.createFromParcel(parcel));
            }
            this.componentSpliceList = Collections.unmodifiableList(arrayList);
            this.utcSpliceTime = parcel.readLong();
            this.autoReturn = parcel.readByte() == 1;
            this.breakDurationUs = parcel.readLong();
            this.uniqueProgramId = parcel.readInt();
            this.availNum = parcel.readInt();
            this.availsExpected = parcel.readInt();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Event createFromParcel(Parcel parcel) {
            return new Event(parcel);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Event parseFromSection(ParsableByteArray parsableByteArray) {
            ArrayList arrayList;
            boolean z14;
            boolean z15;
            long j8;
            boolean z16;
            long j14;
            int i14;
            int i15;
            int unsignedByte;
            boolean z17;
            long unsignedInt;
            long unsignedInt2 = parsableByteArray.readUnsignedInt();
            boolean z18 = true;
            if ((parsableByteArray.readUnsignedByte() & 128) == 0) {
                z18 = false;
            }
            ArrayList arrayList2 = new ArrayList();
            if (z18) {
                arrayList = arrayList2;
                z14 = false;
                z15 = false;
                j8 = C.TIME_UNSET;
                z16 = false;
                j14 = C.TIME_UNSET;
                i14 = 0;
                i15 = 0;
                unsignedByte = 0;
            } else {
                int unsignedByte2 = parsableByteArray.readUnsignedByte();
                boolean z19 = (unsignedByte2 & 128) != 0;
                boolean z24 = (unsignedByte2 & 64) != 0 ? z18 : false;
                boolean z25 = (unsignedByte2 & 32) != 0 ? z18 : false;
                long unsignedInt3 = z24 ? parsableByteArray.readUnsignedInt() : C.TIME_UNSET;
                if (!z24) {
                    int unsignedByte3 = parsableByteArray.readUnsignedByte();
                    ArrayList arrayList3 = new ArrayList(unsignedByte3);
                    int i16 = 0;
                    while (i16 < unsignedByte3) {
                        arrayList3.add(new ComponentSplice(parsableByteArray.readUnsignedByte(), parsableByteArray.readUnsignedInt()));
                        i16++;
                        unsignedByte3 = unsignedByte3;
                    }
                    arrayList2 = arrayList3;
                }
                if (z25) {
                    long unsignedByte4 = parsableByteArray.readUnsignedByte();
                    boolean z26 = (128 & unsignedByte4) != 0;
                    unsignedInt = ((((unsignedByte4 & 1) << 32) | parsableByteArray.readUnsignedInt()) * 1000) / 90;
                    z17 = z26;
                } else {
                    z17 = false;
                    unsignedInt = C.TIME_UNSET;
                }
                int unsignedShort = parsableByteArray.readUnsignedShort();
                int unsignedByte5 = parsableByteArray.readUnsignedByte();
                boolean z27 = z19;
                z16 = z17;
                z14 = z27;
                unsignedByte = parsableByteArray.readUnsignedByte();
                long j15 = unsignedInt3;
                i14 = unsignedShort;
                i15 = unsignedByte5;
                long j16 = unsignedInt;
                arrayList = arrayList2;
                z15 = z24;
                j8 = j15;
                j14 = j16;
            }
            return new Event(unsignedInt2, z18, z14, z15, arrayList, j8, z16, j14, i14, i15, unsignedByte);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void writeToParcel(Parcel parcel) {
            parcel.writeLong(this.spliceEventId);
            parcel.writeByte(this.spliceEventCancelIndicator ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.outOfNetworkIndicator ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.programSpliceFlag ? (byte) 1 : (byte) 0);
            int size = this.componentSpliceList.size();
            parcel.writeInt(size);
            for (int i14 = 0; i14 < size; i14++) {
                this.componentSpliceList.get(i14).writeToParcel(parcel);
            }
            parcel.writeLong(this.utcSpliceTime);
            parcel.writeByte(this.autoReturn ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.breakDurationUs);
            parcel.writeInt(this.uniqueProgramId);
            parcel.writeInt(this.availNum);
            parcel.writeInt(this.availsExpected);
        }

        private Event(long j8, boolean z14, boolean z15, boolean z16, List<ComponentSplice> list, long j14, boolean z17, long j15, int i14, int i15, int i16) {
            this.spliceEventId = j8;
            this.spliceEventCancelIndicator = z14;
            this.outOfNetworkIndicator = z15;
            this.programSpliceFlag = z16;
            this.componentSpliceList = Collections.unmodifiableList(list);
            this.utcSpliceTime = j14;
            this.autoReturn = z17;
            this.breakDurationUs = j15;
            this.uniqueProgramId = i14;
            this.availNum = i15;
            this.availsExpected = i16;
        }
    }
}
