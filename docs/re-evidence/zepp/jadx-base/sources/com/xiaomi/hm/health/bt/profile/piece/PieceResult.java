package com.xiaomi.hm.health.bt.profile.piece;

/* JADX INFO: loaded from: classes18.dex */
public class PieceResult {
    private int a;
    private int b;
    private int c;

    public PieceResult(int pieceState, int profileState, int timeout) {
        this.a = 1;
        this.b = 1;
        this.c = 0;
        this.a = pieceState;
        this.b = profileState;
        this.c = timeout;
    }

    public static PieceResult parse(byte[] resData, int appId, int cmd) {
        if (resData == null || resData.length < 4) {
            return null;
        }
        if (resData[1] == appId && (resData[2] & 255) == cmd) {
            return new PieceResult(resData[3] & 255, resData.length >= 5 ? resData[4] & 255 : 1, resData.length >= 7 ? ((resData[6] & 255) << 8) | (resData[5] & 255) : 0);
        }
        return null;
    }

    public int getPieceState() {
        return this.a;
    }

    public int getProfileState() {
        return this.b;
    }

    public int getTimeout() {
        return this.c;
    }

    public boolean isPieceSuccess() {
        return this.a == 1;
    }

    public boolean isProfileSuccess() {
        return this.b == 1;
    }

    public void setPieceState(int pieceState) {
        this.a = pieceState;
    }

    public void setProfileState(int profileState) {
        this.b = profileState;
    }

    public void setTimeout(int timeout) {
        this.c = timeout;
    }

    public String toString() {
        return "PieceResult{pieceState=" + this.a + ", profileState=" + this.b + ", timeout=" + this.c + '}';
    }
}
