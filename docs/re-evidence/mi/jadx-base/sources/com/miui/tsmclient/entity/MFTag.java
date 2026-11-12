package com.miui.tsmclient.entity;

import com.google.gson.annotations.SerializedName;
import com.tsmclient.smartcard.Coder;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class MFTag {
    private static final byte[] DEFAULT_KEY = {-1, -1, -1, -1, -1, -1};
    private static final int SECTOR_COUNT = 16;

    @SerializedName("eSector")
    private int mExploitSector = -1;

    @SerializedName("sectors")
    private ProbeSector[] mSectors;

    @SerializedName("uid")
    private int mUid;

    public MFTag(MifareTag mifareTag) {
        this.mUid = Coder.hexStringToInt(mifareTag.getUid());
        List<Integer> unknownKeyAEncryptedSectorsId = mifareTag.getUnknownKeyAEncryptedSectorsId();
        List<Integer> keyBSectorsId = mifareTag.getKeyBSectorsId();
        this.mSectors = new ProbeSector[16];
        for (int i = 0; i < 16; i++) {
            if (!unknownKeyAEncryptedSectorsId.contains(Integer.valueOf(i))) {
                initProbeSector(i, true);
            } else if (keyBSectorsId.contains(Integer.valueOf(i))) {
                initProbeSector(i, false);
            } else {
                this.mSectors[i] = new ProbeSector(i);
            }
        }
    }

    private void initProbeSector(int i, boolean z) {
        byte[] bArr;
        if (this.mExploitSector < 1) {
            this.mExploitSector = i;
            bArr = DEFAULT_KEY;
        } else {
            bArr = null;
        }
        this.mSectors[i] = new ProbeSector(i, bArr, z);
    }

    public int getExploitSector() {
        return this.mExploitSector;
    }

    public ProbeSector[] getSectors() {
        return this.mSectors;
    }

    public int getUid() {
        return this.mUid;
    }

    public static class ProbeSector {

        @SerializedName("foundKeyA")
        private boolean mFoundKeyA;

        @SerializedName("foundKeyB")
        private boolean mFoundKeyB;

        @SerializedName("index")
        private int mIndex;

        @SerializedName("keyA")
        private byte[] mKeyA;

        @SerializedName("keyB")
        private byte[] mKeyB;

        public ProbeSector(int i) {
            this.mIndex = i;
        }

        public int getIndex() {
            return this.mIndex;
        }

        public byte[] getKeyA() {
            return this.mKeyA;
        }

        public byte[] getKeyB() {
            return this.mKeyB;
        }

        public byte getTrailer() {
            return (byte) (((this.mIndex + 1) * 4) - 1);
        }

        public boolean isFoundKeyA() {
            return this.mFoundKeyA;
        }

        public boolean isFoundKeyB() {
            return this.mFoundKeyB;
        }

        public ProbeSector(int i, byte[] bArr, boolean z) {
            this(i);
            if (z) {
                this.mKeyA = bArr;
                this.mFoundKeyA = true;
            } else {
                this.mKeyB = bArr;
                this.mFoundKeyB = true;
            }
        }
    }
}
