package com.huawei.hms.utils;

import com.huawei.hms.common.HmsCheckedState;
import com.huawei.hms.support.log.HMSLog;

/* JADX INFO: loaded from: classes2.dex */
public class AgHmsUpdateState {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f16876c = new Object();
    private static volatile AgHmsUpdateState d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HmsCheckedState f16877a = HmsCheckedState.UNCHECKED;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f16878b = 0;

    private AgHmsUpdateState() {
    }

    public static AgHmsUpdateState getInstance() {
        if (d == null) {
            synchronized (f16876c) {
                if (d == null) {
                    d = new AgHmsUpdateState();
                }
            }
        }
        return d;
    }

    public HmsCheckedState getCheckedState() {
        return this.f16877a;
    }

    public int getTargetVersionCode() {
        return this.f16878b;
    }

    public boolean isUpdateHms() {
        return getCheckedState() == HmsCheckedState.NEED_UPDATE && this.f16878b != 0;
    }

    public void resetUpdateState() {
        if (getCheckedState() != HmsCheckedState.NEED_UPDATE) {
            return;
        }
        setCheckedState(HmsCheckedState.NOT_NEED_UPDATE);
        setTargetVersionCode(0);
    }

    public void setCheckedState(HmsCheckedState hmsCheckedState) {
        if (hmsCheckedState == null) {
            HMSLog.e("AgHmsUpdateState", "para invalid: checkedState is null");
        } else {
            this.f16877a = hmsCheckedState;
        }
    }

    public void setTargetVersionCode(int i) {
        this.f16878b = i;
    }
}
