package com.huawei.health.sportservice.inter;

import defpackage.nua;

/* JADX INFO: loaded from: classes31.dex */
public interface SkipDataCallback {
    void onBreakTimesChanges(int i);

    void onContinuousJumpTimesChanges(int i);

    void onFootPointChanges(nua nuaVar);

    void onSkipNumberChanges(int i);

    void onSkipSpeedChanges(float f);

    void onStatusChanges(int i);
}
