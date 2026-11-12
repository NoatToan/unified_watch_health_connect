package com.huawei.health.algorithm.api;

import android.content.Context;
import com.huawei.health.algorithm.callback.IBaseResponseCallback;
import com.huawei.health.algorithm.callback.IConnectCallback;
import com.huawei.health.algorithm.callback.ISleepMonitorCallback;
import com.huawei.health.algorithm.callback.IStateCallback;
import defpackage.dcz;
import defpackage.dda;
import defpackage.ddc;
import defpackage.dde;
import defpackage.ddj;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public interface SleepMonitorAlgorithmApi {
    public static final int STATE_FINISHED = 6;
    public static final int STATE_INTERRUPT = 5;
    public static final int STATE_NONE = 0;
    public static final int STATE_PREPARE = 1;
    public static final int STATE_RUNNING = 3;

    void connect(Context context, String str, IConnectCallback iConnectCallback, IStateCallback iStateCallback);

    void createReport(dcz dczVar, ISleepMonitorCallback iSleepMonitorCallback);

    void disconnect();

    boolean forceDeleteAudioFile(String str);

    dcz getMonitorInfo();

    int getRegularScore(dda ddaVar);

    dde getSleepState();

    boolean isRecording();

    void pauseRecord(IBaseResponseCallback iBaseResponseCallback);

    Set<ddj> querySleepVoiceInfo(long j, long j2);

    void restoreRecord(IBaseResponseCallback iBaseResponseCallback);

    void restoreSleep(IBaseResponseCallback iBaseResponseCallback);

    void setAudioMaximumThreshold(int i);

    boolean setMonitorInfo(Set<ddj> set);

    void startSleepMonitor(ddc ddcVar, IBaseResponseCallback iBaseResponseCallback);

    void stopSleepMonitor(ISleepMonitorCallback iSleepMonitorCallback);
}
