package com.ximalaya.ting.android.sdkdownloader.exception;

import com.ximalaya.ting.android.opensdk.model.track.Track;

/* JADX INFO: loaded from: classes22.dex */
public class TransferSavePathException extends BaseRuntimeException {
    public static final int CODE_DB_ERROR;
    public static final int CODE_FILE_TRANSFER_ERROR;
    public static final int CODE_SAVE_PATH_NO_SAVE;
    private static int c;
    private int a;
    private Track b;

    static {
        int i = 0 + 1;
        c = i;
        CODE_SAVE_PATH_NO_SAVE = i;
        int i2 = i + 1;
        c = i2;
        CODE_DB_ERROR = i2;
        int i3 = i2 + 1;
        c = i3;
        CODE_FILE_TRANSFER_ERROR = i3;
    }

    public TransferSavePathException(int i, String str) {
        super(str);
        this.a = i;
    }

    public int getCode() {
        return this.a;
    }

    public Track getTrack() {
        return this.b;
    }

    public void setCode(int i) {
        this.a = i;
    }

    public void setTrack(Track track) {
        this.b = track;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "TransferSavePathException{code=" + this.a + ", track=" + this.b + '}';
    }

    public TransferSavePathException(int i, String str, Track track) {
        super(str);
        this.a = i;
        this.b = track;
    }
}
