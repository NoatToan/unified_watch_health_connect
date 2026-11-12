package com.huami.wallet.ui.entity;

import com.huami.wallet.lib.entity.Order;

/* JADX INFO: loaded from: classes16.dex */
public class FullResultInfo extends ResultInfo {
    public int balance = -1;
    public long expireDate = -1;
    public boolean isRetryToOpenCard = false;
    public Order order;
}
