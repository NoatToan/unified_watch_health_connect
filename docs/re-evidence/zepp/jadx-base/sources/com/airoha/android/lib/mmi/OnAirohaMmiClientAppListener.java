package com.airoha.android.lib.mmi;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface OnAirohaMmiClientAppListener {
    void OnAncTurnOff(byte b);

    void OnAncTurnOn(byte b);

    void OnBattery(byte b, byte b2);

    void OnFindMeState(byte b);

    void OnGameModeStateChanged(boolean z);

    void OnPassThrough(byte b);

    void OnRespSuccess(String str);

    void notifyAgentIsRight(boolean z);

    void notifyAncStatus(byte b, short s);

    void notifyGameModeState(byte b);

    void notifyGetKeyMapNv(byte b, byte[] bArr);

    void notifyGetPassThruGain(short s);

    void notifyGetVaIndex(byte b, byte b2);

    void notifyGetVpIndex(byte b);

    void notifyPartnerIsExisting(boolean z);

    void notifyQueryVpLanguage(List<String> list);

    void notifyReloadNv(byte b, boolean z);

    void notifySetAncPassThruGain(short s);

    void notifySetAudioPath(byte b);

    void notifySetKeyMapNv(byte b, boolean z);

    void notifySetVaIndex(byte b, boolean z);

    void notifySetVpIndex(boolean z);

    void onAudioPathChanged(byte b);
}
