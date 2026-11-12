package com.airoha.android.lib.fota.stage.for153xMCE;

/* JADX INFO: loaded from: classes2.dex */
public class Dst {
    public byte Id;
    public byte Type;

    public byte[] toRaw() {
        return new byte[]{this.Type, this.Id};
    }
}
