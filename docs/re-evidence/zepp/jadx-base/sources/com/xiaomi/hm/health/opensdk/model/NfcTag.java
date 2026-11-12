package com.xiaomi.hm.health.opensdk.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes21.dex */
public class NfcTag implements Parcelable {
    public static final Parcelable.Creator<NfcTag> CREATOR = new a();
    public String atqa;
    public String blockData;
    public ArrayList<NfcBlock> blockInfos;
    public int blockNum;
    public int header;
    public int result;
    public String sak;
    public String uid;
    public int uidLen;

    public class a implements Parcelable.Creator<NfcTag> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NfcTag createFromParcel(Parcel source) {
            return new NfcTag(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public NfcTag[] newArray(int size) {
            return new NfcTag[size];
        }
    }

    public NfcTag() {
        this.header = 141;
        this.result = 0;
        this.atqa = "";
        this.sak = "";
        this.uidLen = 0;
        this.uid = "";
        this.blockNum = 0;
        this.blockData = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "{header=" + this.header + ", result=" + this.result + ", atqa='" + this.atqa + "', sak='" + this.sak + "', uidLen=" + this.uidLen + ", uid='" + this.uid + "', blockNum=" + this.blockNum + ", blockInfos=" + this.blockInfos + ", blockData=" + this.blockData + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.header);
        dest.writeInt(this.result);
        dest.writeString(this.atqa);
        dest.writeString(this.sak);
        dest.writeInt(this.uidLen);
        dest.writeString(this.uid);
        dest.writeInt(this.blockNum);
        dest.writeTypedList(this.blockInfos);
        dest.writeString(this.blockData);
    }

    public NfcTag(int header, int result, String atqa, String sak, int uidLen, String uid, int blockNum, ArrayList<NfcBlock> blockInfos, String blockData) {
        this.header = 141;
        this.result = 0;
        this.atqa = "";
        this.sak = "";
        this.uidLen = 0;
        this.uid = "";
        this.blockNum = 0;
        this.blockData = "";
        this.header = header;
        this.result = result;
        this.atqa = atqa;
        this.sak = sak;
        this.uidLen = uidLen;
        this.uid = uid;
        this.blockNum = blockNum;
        this.blockInfos = blockInfos;
        this.blockData = blockData;
    }

    public NfcTag(Parcel in) {
        this.header = 141;
        this.result = 0;
        this.atqa = "";
        this.sak = "";
        this.uidLen = 0;
        this.uid = "";
        this.blockNum = 0;
        this.blockData = "";
        this.header = in.readInt();
        this.result = in.readInt();
        this.atqa = in.readString();
        this.sak = in.readString();
        this.uidLen = in.readInt();
        this.uid = in.readString();
        this.blockNum = in.readInt();
        this.blockInfos = in.createTypedArrayList(NfcBlock.CREATOR);
        this.blockData = in.readString();
    }
}
