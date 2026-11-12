package com.huawei.openalliance.ad.inter.data;

import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public interface IPreCheckInfo {
    String getContentId();

    Map<String, String> getExt();

    int getPreCheckResult();

    String getSlotId();

    boolean isStrategyFiltered();
}
