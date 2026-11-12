package com.xiaomi.hm.health.speech.handler;

import android.content.Context;
import com.xiaomi.ai.SpeechResult;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes21.dex */
public abstract class BaseDomainHandler {
    private static final AtomicInteger b = new AtomicInteger(0);
    private int a = -1;
    public Context context;
    public int errorType;

    public BaseDomainHandler(Context context) {
        this.context = context;
    }

    public int getErrorType() {
        return this.errorType;
    }

    public int getId() {
        if (this.a == -1) {
            AtomicInteger atomicInteger = b;
            if (atomicInteger.get() == 255) {
                atomicInteger.set(0);
                this.a = 0;
            } else {
                this.a = atomicInteger.getAndIncrement();
            }
        }
        return this.a;
    }

    public abstract void handleDomainEvent();

    public abstract void pushInfoToDevice(HMMiLiProDevice hmMiLiProDevice);

    public abstract void resolveSpeechResult(SpeechResult speechResult);

    public void setErrorType(int errorType) {
        this.errorType = errorType;
    }
}
