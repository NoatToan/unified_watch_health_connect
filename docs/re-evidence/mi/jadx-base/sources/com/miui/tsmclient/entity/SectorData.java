package com.miui.tsmclient.entity;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class SectorData {

    @SerializedName("sectorGroupList")
    private List<SectorGroupData> mSectorGroupData;

    @SerializedName("sectorId")
    private int mSectorId;

    public static class SectorGroupData {

        @SerializedName(CardInfo.KEY_CARD_GROUP_ID)
        private int mGroupId;

        @SerializedName("sectorPieceList")
        private List<SectorPieceData> mSectorPieceData;

        public List<SectorPieceData> getSectorPieceData() {
            return this.mSectorPieceData;
        }

        public void setGroupId(int i) {
            this.mGroupId = i;
        }

        public void setSectorPieceData(List<SectorPieceData> list) {
            this.mSectorPieceData = list;
        }
    }

    public static class SectorPieceData {

        @SerializedName("costTime")
        private int mConsumedTime;

        @SerializedName("deviation")
        private int mDeviation;

        @SerializedName("ntE")
        private String mEncryptRandomNum;

        @SerializedName("parity1")
        private String mFirstParity;

        @SerializedName("median")
        private int mMedian;

        @SerializedName("nt")
        private String mRandomNum;

        @SerializedName("parity2")
        private String mSecondParity;

        @SerializedName("sectorId")
        private int mSectorId;

        @SerializedName("parity3")
        private String mThirdParity;

        public static List<SectorPieceData> fromJson(String str) {
            return (List) new Gson().fromJson(str, new TypeToken<List<SectorPieceData>>() { // from class: com.miui.tsmclient.entity.SectorData.SectorPieceData.1
            }.getType());
        }

        public void setConsumedTime(int i) {
            this.mConsumedTime = i;
        }

        public void setDeviation(int i) {
            this.mDeviation = i;
        }

        public void setEncryptRandomNum(String str) {
            this.mEncryptRandomNum = str;
        }

        public void setFirstParity(String str) {
            this.mFirstParity = str;
        }

        public void setMedian(int i) {
            this.mMedian = i;
        }

        public void setRandomNum(String str) {
            this.mRandomNum = str;
        }

        public void setSecondParity(String str) {
            this.mSecondParity = str;
        }

        public void setSectorId(int i) {
            this.mSectorId = i;
        }

        public void setThirdParity(String str) {
            this.mThirdParity = str;
        }
    }

    public void setSectorGroupData(List<SectorGroupData> list) {
        this.mSectorGroupData = list;
    }

    public void setSectorId(int i) {
        this.mSectorId = i;
    }

    public String toString() {
        return new Gson().toJson(this);
    }
}
