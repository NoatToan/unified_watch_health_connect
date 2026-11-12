package com.huami.ad;

/* JADX INFO: loaded from: classes4.dex */
public interface ITimeListener {
    void onAdShowTimeout();

    void onRequestTimeout(boolean z);

    void onTotallyTimeout();
}
