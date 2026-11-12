package com.huami.wallet.lib.entity;

/* JADX INFO: loaded from: classes13.dex */
public class CheckOrderResult {
    public boolean isNeedRecharge;
    public boolean isPaidButNotHandle;

    public CheckOrderResult(boolean z, boolean z2) {
        this.isNeedRecharge = z;
        this.isPaidButNotHandle = z2;
    }
}
