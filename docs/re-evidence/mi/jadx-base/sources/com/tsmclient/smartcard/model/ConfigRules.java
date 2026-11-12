package com.tsmclient.smartcard.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.tsmclient.smartcard.Coder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class ConfigRules implements Parcelable {
    public static final Parcelable.Creator<ConfigRules> CREATOR = new Parcelable.Creator<ConfigRules>() { // from class: com.tsmclient.smartcard.model.ConfigRules.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConfigRules createFromParcel(Parcel parcel) {
            ConfigRules configRules = new ConfigRules();
            configRules.readFromParcel(parcel);
            return configRules;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConfigRules[] newArray(int i) {
            return new ConfigRules[i];
        }
    };
    public static final int EXCEPTION_CARD_STATUS = 1;
    public static final int EXCEPTION_UNPROCESSABLE = 0;
    public static final int FOR_EXTERNAL = 2;
    public static final int FOR_INTERNAL = 1;
    public static final int INVALID_OFFSET = -1;
    public static final int INVALID_VERSION = -1;

    @SerializedName("cardNumValidDateCommands")
    public List<ParseDataCommand> mCardNumValidDateCommandList;

    @SerializedName("cardType")
    public String mCardType;

    @SerializedName("otherVerifyCommands")
    public List<Command> mOtherVerifyCommandList;

    @SerializedName("readBalanceCommands")
    public List<ParseDataCommand> mReadBalanceCommandList;

    @SerializedName("readCardStatusCommands")
    public List<ParseDataCommand> mReadCardStatusCommandList;

    @SerializedName("readRecordCommand")
    private ReadRecordCommand mReadRecordCommand;

    @SerializedName("readRecordCommands")
    private List<ReadRecordCommand> mReadRecordCommandList;

    @SerializedName("selectVerifyCommands")
    public List<Command> mSelectVerifyCommandList;

    @SerializedName("version")
    public String mVersion;

    public static class Command implements Parcelable {
        public static final Parcelable.Creator<Command> CREATOR = new Parcelable.Creator<Command>() { // from class: com.tsmclient.smartcard.model.ConfigRules.Command.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Command createFromParcel(Parcel parcel) {
                Command command = new Command();
                command.readFromParcel(parcel);
                return command;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Command[] newArray(int i) {
                return new Command[i];
            }
        };

        @SerializedName("apdu")
        public String mApdu;

        @SerializedName("expectData")
        public String mExpectData;

        @SerializedName("expectStatus")
        public String mExpectStatus;

        @SerializedName("preConditionExpectData")
        public String mPreConditionExpectData;

        @SerializedName("preConditionExpectStatus")
        public String mPreConditionExpectStatus;

        @SerializedName("preConditionKey")
        public String mPreConditionKey;

        @SerializedName("maxVersion")
        public int mMaxVersion = -1;

        @SerializedName("minVersion")
        public int mMinVersion = -1;

        @SerializedName("flag")
        private int mFlag = 1;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean isExecute(boolean z) {
            int i = z ? 1 : 2;
            return (this.mFlag & i) == i;
        }

        public void readFromParcel(Parcel parcel) {
            this.mApdu = parcel.readString();
            this.mExpectStatus = parcel.readString();
            this.mExpectData = parcel.readString();
            this.mPreConditionKey = parcel.readString();
            this.mPreConditionExpectStatus = parcel.readString();
            this.mPreConditionExpectData = parcel.readString();
            this.mMaxVersion = parcel.readInt();
            this.mMinVersion = parcel.readInt();
            this.mFlag = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mApdu);
            parcel.writeString(this.mExpectStatus);
            parcel.writeString(this.mExpectData);
            parcel.writeString(this.mPreConditionKey);
            parcel.writeString(this.mPreConditionExpectStatus);
            parcel.writeString(this.mPreConditionExpectData);
            parcel.writeInt(this.mMaxVersion);
            parcel.writeInt(this.mMinVersion);
            parcel.writeInt(this.mFlag);
        }
    }

    public static class Element implements Parcelable {
        public static final Parcelable.Creator<Element> CREATOR = new Parcelable.Creator<Element>() { // from class: com.tsmclient.smartcard.model.ConfigRules.Element.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Element createFromParcel(Parcel parcel) {
                Element element = new Element();
                element.readFromParcel(parcel);
                return element;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Element[] newArray(int i) {
                return new Element[i];
            }
        };

        @SerializedName("expectValue")
        public String mExpectValue;

        @SerializedName("hexLength")
        public int mHexLength;

        @SerializedName("hexOffset")
        public int mHexOffset = -1;

        @SerializedName("key")
        public String mKey;

        @SerializedName("length")
        public int mLength;

        @SerializedName("offset")
        public int mOffset;

        @SerializedName("prefixHex")
        public String mPrefixHex;

        @SerializedName("suffixHex")
        public String mSuffixHex;

        @SerializedName("valueExceptionType")
        public int mValueExceptionType;

        @SerializedName("valueMap")
        public Map<String, String> mValueMap;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public void readFromParcel(Parcel parcel) {
            this.mKey = parcel.readString();
            this.mOffset = parcel.readInt();
            this.mLength = parcel.readInt();
            this.mHexOffset = parcel.readInt();
            this.mHexLength = parcel.readInt();
            this.mPrefixHex = parcel.readString();
            this.mSuffixHex = parcel.readString();
            HashMap map = new HashMap();
            this.mValueMap = map;
            parcel.readMap(map, getClass().getClassLoader());
            this.mExpectValue = parcel.readString();
            this.mValueExceptionType = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mKey);
            parcel.writeInt(this.mOffset);
            parcel.writeInt(this.mLength);
            parcel.writeInt(this.mHexOffset);
            parcel.writeInt(this.mHexLength);
            parcel.writeString(this.mPrefixHex);
            parcel.writeString(this.mSuffixHex);
            parcel.writeMap(this.mValueMap);
            parcel.writeString(this.mExpectValue);
            parcel.writeInt(this.mValueExceptionType);
        }
    }

    public static class ParseDataCommand extends Command {
        public static final Parcelable.Creator<ParseDataCommand> CREATOR = new Parcelable.Creator<ParseDataCommand>() { // from class: com.tsmclient.smartcard.model.ConfigRules.ParseDataCommand.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ParseDataCommand createFromParcel(Parcel parcel) {
                ParseDataCommand parseDataCommand = new ParseDataCommand();
                parseDataCommand.readFromParcel(parcel);
                return parseDataCommand;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ParseDataCommand[] newArray(int i) {
                return new ParseDataCommand[i];
            }
        };

        @SerializedName("elements")
        public List<Element> mElementList;

        @SerializedName("expectResponse")
        public String mExpectResponse;

        @SerializedName("responseExceptionType")
        public int mResponseExceptionType;

        @SerializedName("responseKey")
        public String mResponseKey;

        @SerializedName("responseMap")
        public Map<String, String> mResponseMap;

        @Override // com.tsmclient.smartcard.model.ConfigRules.Command
        public void readFromParcel(Parcel parcel) {
            super.readFromParcel(parcel);
            ArrayList arrayList = new ArrayList();
            this.mElementList = arrayList;
            parcel.readTypedList(arrayList, Element.CREATOR);
            this.mResponseKey = parcel.readString();
            HashMap map = new HashMap();
            this.mResponseMap = map;
            parcel.readMap(map, getClass().getClassLoader());
            this.mExpectResponse = parcel.readString();
            this.mResponseExceptionType = parcel.readInt();
        }

        @Override // com.tsmclient.smartcard.model.ConfigRules.Command, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeTypedList(this.mElementList);
            parcel.writeString(this.mResponseKey);
            parcel.writeMap(this.mResponseMap);
            parcel.writeString(this.mExpectResponse);
            parcel.writeInt(this.mResponseExceptionType);
        }
    }

    public static class ReadRecordCommand implements Parcelable {
        public static final Parcelable.Creator<ReadRecordCommand> CREATOR = new Parcelable.Creator<ReadRecordCommand>() { // from class: com.tsmclient.smartcard.model.ConfigRules.ReadRecordCommand.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ReadRecordCommand createFromParcel(Parcel parcel) {
                ReadRecordCommand readRecordCommand = new ReadRecordCommand();
                readRecordCommand.readFromParcel(parcel);
                return readRecordCommand;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ReadRecordCommand[] newArray(int i) {
                return new ReadRecordCommand[i];
            }
        };

        @SerializedName("flag")
        private int mFlag = 3;

        @SerializedName("preReadCommands")
        public List<Command> mPreReadCommandList;

        @SerializedName("instructions")
        private List<ReadRecordInstruction> mReadRecordInstructionList;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public List<ReadRecordInstruction> getReadRecordInstructionList() {
            return this.mReadRecordInstructionList;
        }

        public boolean isExecute(boolean z) {
            int i = z ? 1 : 2;
            return (this.mFlag & i) == i;
        }

        public boolean isReadRecordInstructionListEmpty() {
            List<ReadRecordInstruction> list = this.mReadRecordInstructionList;
            return list == null || list.isEmpty();
        }

        public void readFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            this.mPreReadCommandList = arrayList;
            parcel.readTypedList(arrayList, Command.CREATOR);
            ArrayList arrayList2 = new ArrayList();
            this.mReadRecordInstructionList = arrayList2;
            parcel.readTypedList(arrayList2, ReadRecordInstruction.CREATOR);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeTypedList(this.mPreReadCommandList);
            parcel.writeTypedList(this.mReadRecordInstructionList);
        }
    }

    public static class ReadRecordInstruction implements Parcelable {
        public static final Parcelable.Creator<ReadRecordInstruction> CREATOR = new Parcelable.Creator<ReadRecordInstruction>() { // from class: com.tsmclient.smartcard.model.ConfigRules.ReadRecordInstruction.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ReadRecordInstruction createFromParcel(Parcel parcel) {
                ReadRecordInstruction readRecordInstruction = new ReadRecordInstruction();
                readRecordInstruction.readFromParcel(parcel);
                return readRecordInstruction;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ReadRecordInstruction[] newArray(int i) {
                return new ReadRecordInstruction[i];
            }
        };

        @SerializedName("p2")
        public String mP2;

        @SerializedName("sfi")
        public String mSfi;

        @SerializedName("skipOnceRead")
        public boolean mSkipOnceRead;

        @SerializedName("skipParsingYear")
        private boolean mSkipParsingYear;

        private byte get(byte b2, String str) {
            byte[] bArrHexStringToBytes;
            return (TextUtils.isEmpty(str) || (bArrHexStringToBytes = Coder.hexStringToBytes(str)) == null || bArrHexStringToBytes.length <= 0) ? b2 : bArrHexStringToBytes[0];
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public byte getP2() {
            return get((byte) -60, this.mP2);
        }

        public byte getSfi() {
            return get((byte) 0, this.mSfi);
        }

        public boolean isSkipParsingYear() {
            return this.mSkipParsingYear;
        }

        public void readFromParcel(Parcel parcel) {
            this.mP2 = parcel.readString();
            this.mSfi = parcel.readString();
            this.mSkipOnceRead = parcel.readByte() == 1;
            this.mSkipParsingYear = parcel.readByte() == 1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mP2);
            parcel.writeString(this.mSfi);
            parcel.writeByte(this.mSkipOnceRead ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.mSkipParsingYear ? (byte) 1 : (byte) 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void readFromParcel(Parcel parcel) {
        this.mCardType = parcel.readString();
        this.mVersion = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.mSelectVerifyCommandList = arrayList;
        Parcelable.Creator<Command> creator = Command.CREATOR;
        parcel.readTypedList(arrayList, creator);
        ArrayList arrayList2 = new ArrayList();
        this.mOtherVerifyCommandList = arrayList2;
        parcel.readTypedList(arrayList2, creator);
        ArrayList arrayList3 = new ArrayList();
        this.mCardNumValidDateCommandList = arrayList3;
        Parcelable.Creator<ParseDataCommand> creator2 = ParseDataCommand.CREATOR;
        parcel.readTypedList(arrayList3, creator2);
        ArrayList arrayList4 = new ArrayList();
        this.mReadBalanceCommandList = arrayList4;
        parcel.readTypedList(arrayList4, creator2);
        this.mReadRecordCommand = (ReadRecordCommand) parcel.readParcelable(ReadRecordCommand.class.getClassLoader());
        ArrayList arrayList5 = new ArrayList();
        this.mReadRecordCommandList = arrayList5;
        parcel.readTypedList(arrayList5, ReadRecordCommand.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<ReadRecordCommand> getReadRecordCommandList() {
        ArrayList arrayList = new ArrayList();
        ReadRecordCommand readRecordCommand = this.mReadRecordCommand;
        if (readRecordCommand != null) {
            arrayList.add(readRecordCommand);
        }
        List<ReadRecordCommand> list = this.mReadRecordCommandList;
        if (list != null && !list.isEmpty()) {
            arrayList.addAll(this.mReadRecordCommandList);
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mCardType);
        parcel.writeString(this.mVersion);
        parcel.writeTypedList(this.mSelectVerifyCommandList);
        parcel.writeTypedList(this.mOtherVerifyCommandList);
        parcel.writeTypedList(this.mCardNumValidDateCommandList);
        parcel.writeTypedList(this.mReadBalanceCommandList);
        parcel.writeParcelable(this.mReadRecordCommand, i);
        parcel.writeTypedList(this.mReadRecordCommandList);
    }
}
