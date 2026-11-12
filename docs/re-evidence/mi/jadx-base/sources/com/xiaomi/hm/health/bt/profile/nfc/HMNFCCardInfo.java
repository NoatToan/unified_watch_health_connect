package com.xiaomi.hm.health.bt.profile.nfc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class HMNFCCardInfo implements Serializable {
    public static final int RESULT_ENCRYPT_CARD = 9;
    public static final int RESULT_FAILED = 3;
    public static final int RESULT_NOT_M1 = 8;
    public static final int RESULT_OK = 0;
    private static final long serialVersionUID = 1;
    private int version = -1;
    private int header = 141;
    private int result = 0;
    private String atqa = "";
    private String sak = "";
    private int uidLen = 0;
    private String uid = "";
    private int blockNum = 0;
    private ArrayList<HMNFCBlockInfo> blockInfos = new ArrayList<>();
    private String blockData = "";
    private boolean isEncrypt = false;

    private String toBlockData(ArrayList<HMNFCBlockInfo> arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<HMNFCBlockInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            byte[] data = it.next().getData();
            if (data != null && data.length > 0) {
                for (byte b2 : data) {
                    sb.append(String.format("%02x", Byte.valueOf(b2)));
                }
            }
        }
        return sb.toString();
    }

    public String getAtqa() {
        return this.atqa;
    }

    public String getBlockData() {
        return this.blockData;
    }

    public ArrayList<HMNFCBlockInfo> getBlockInfos() {
        return this.blockInfos;
    }

    public int getBlockNum() {
        return this.blockNum;
    }

    public int getHeader() {
        return this.header;
    }

    public int getResult() {
        return this.result;
    }

    public String getSak() {
        return this.sak;
    }

    public String getUid() {
        return this.uid;
    }

    public int getUidLen() {
        return this.uidLen;
    }

    public int getVersion() {
        return this.version;
    }

    public boolean isEncrypt() {
        return this.isEncrypt;
    }

    public void setAtqa(String str) {
        this.atqa = str;
    }

    public void setBlockInfos(ArrayList<HMNFCBlockInfo> arrayList) {
        this.blockInfos.clear();
        this.blockInfos.addAll(arrayList);
        this.blockData = toBlockData(arrayList);
    }

    public void setBlockNum(int i) {
        this.blockNum = i;
    }

    public void setEncrypt(boolean z) {
        this.isEncrypt = z;
    }

    public void setHeader(int i) {
        this.header = i;
    }

    public void setResult(int i) {
        this.result = i;
    }

    public void setSak(String str) {
        this.sak = str;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public void setUidLen(int i) {
        this.uidLen = i;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    public String toString() {
        return "{version=" + this.version + ", header=" + this.header + ", result=" + this.result + ", atqa='" + this.atqa + "', sak='" + this.sak + "', uidLen=" + this.uidLen + ", uid='" + this.uid + "', blockNum=" + this.blockNum + ", blockInfos=" + this.blockInfos + ", blockData=" + this.blockData + ", isEncrypt=" + this.isEncrypt + AbstractJsonLexerKt.END_OBJ;
    }
}
