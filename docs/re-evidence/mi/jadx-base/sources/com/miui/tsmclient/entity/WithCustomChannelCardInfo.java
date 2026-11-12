package com.miui.tsmclient.entity;

/* JADX INFO: loaded from: classes6.dex */
public class WithCustomChannelCardInfo extends CardInfo {
    public WithCustomChannelCardInfo(boolean z) {
        super("CustomChannelCardInfo");
        if (z) {
            this.mCardDevice += ".customChannel";
        }
    }
}
