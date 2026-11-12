package com.android.internal.telephony;

import android.os.IInterface;

/* JADX INFO: loaded from: classes7.dex */
public interface ITelephony extends IInterface {
    void answerRingingCall();

    boolean endCall();

    void silenceRinger();
}
