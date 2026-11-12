package com.huami.watch.companion.mediac;

/* JADX INFO: loaded from: classes16.dex */
public class MusicAction {
    public String actionDesc;
    public String playerName;

    public MusicAction(String str) {
        this.actionDesc = str;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.actionDesc);
        return stringBuffer.toString();
    }
}
