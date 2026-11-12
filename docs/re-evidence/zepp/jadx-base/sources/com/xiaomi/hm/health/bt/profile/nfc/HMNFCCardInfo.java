package com.xiaomi.hm.health.bt.profile.nfc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes18.dex */
public class HMNFCCardInfo implements Serializable {
    public static final int RESULT_ENCRYPT_CARD = 9;
    public static final int RESULT_FAILED = 3;
    public static final int RESULT_NOT_M1 = 8;
    public static final int RESULT_OK = 0;
    private static final long serialVersionUID = 1;
    private int a = -1;
    private int b = 141;
    private int c = 0;
    private String d = "";
    private String e = "";
    private int f = 0;
    private String g = "";
    private int h = 0;
    private ArrayList<HMNFCBlockInfo> i = new ArrayList<>();
    private String j = "";
    private boolean k = false;

    private String a(ArrayList<HMNFCBlockInfo> blockInfos) {
        if (blockInfos == null || blockInfos.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<HMNFCBlockInfo> it2 = blockInfos.iterator();
        while (it2.hasNext()) {
            byte[] data = it2.next().getData();
            if (data != null && data.length > 0) {
                for (byte b : data) {
                    sb.append(String.format("%02x", Byte.valueOf(b)));
                }
            }
        }
        return sb.toString();
    }

    public String getAtqa() {
        return this.d;
    }

    public String getBlockData() {
        return this.j;
    }

    public ArrayList<HMNFCBlockInfo> getBlockInfos() {
        return this.i;
    }

    public int getBlockNum() {
        return this.h;
    }

    public int getHeader() {
        return this.b;
    }

    public int getResult() {
        return this.c;
    }

    public String getSak() {
        return this.e;
    }

    public String getUid() {
        return this.g;
    }

    public int getUidLen() {
        return this.f;
    }

    public int getVersion() {
        return this.a;
    }

    public boolean isEncrypt() {
        return this.k;
    }

    public void setAtqa(String atqa) {
        this.d = atqa;
    }

    public void setBlockInfos(ArrayList<HMNFCBlockInfo> blockInfos) {
        this.i.clear();
        this.i.addAll(blockInfos);
        this.j = a(blockInfos);
    }

    public void setBlockNum(int blockNum) {
        this.h = blockNum;
    }

    public void setEncrypt(boolean encrypt) {
        this.k = encrypt;
    }

    public void setHeader(int header) {
        this.b = header;
    }

    public void setResult(int result) {
        this.c = result;
    }

    public void setSak(String sak) {
        this.e = sak;
    }

    public void setUid(String uid) {
        this.g = uid;
    }

    public void setUidLen(int uidLen) {
        this.f = uidLen;
    }

    public void setVersion(int version) {
        this.a = version;
    }

    public String toString() {
        return "{version=" + this.a + ", header=" + this.b + ", result=" + this.c + ", atqa='" + this.d + "', sak='" + this.e + "', uidLen=" + this.f + ", uid='" + this.g + "', blockNum=" + this.h + ", blockInfos=" + this.i + ", blockData=" + this.j + ", isEncrypt=" + this.k + '}';
    }
}
