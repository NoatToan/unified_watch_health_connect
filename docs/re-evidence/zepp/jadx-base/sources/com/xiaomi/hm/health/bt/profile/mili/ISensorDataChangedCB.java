package com.xiaomi.hm.health.bt.profile.mili;

/* JADX INFO: loaded from: classes18.dex */
public interface ISensorDataChangedCB {
    void onStatusChanged(int status);

    void process(short x, short y, short z);
}
