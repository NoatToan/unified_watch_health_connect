package com.amazon.alexa.avs;

/* JADX INFO: loaded from: classes2.dex */
public interface AlertEventListener {
    void onAlertDelete(String str, boolean z);

    void onAlertSet(String str, boolean z);

    void onAlertStarted(String str);

    void onAlertStopped(String str);
}
