package com.airoha.android.lib.transport.PacketParser;

/* JADX INFO: loaded from: classes2.dex */
public interface OnRaceMmiPacketListener {
    void OnAncGetStatusResp(byte b);

    void OnAncReadParamFromNvKeyInd(byte[] bArr);

    void OnAncReadParamFromNvKeyResp(byte b);

    void OnAncSetGainResp(byte b);

    void OnAncSetOffResp(byte b);

    void OnAncSetOnResp(byte b);

    void OnAncWriteGainToNvKeyResp(byte b);
}
