package com.huawei.health.marketing.views;

import com.huawei.health.marketing.datatype.ResourceBriefInfo;

/* JADX INFO: loaded from: classes7.dex */
public interface ResourceBriefInfoOwnable {
    int getResourceBriefPriority();

    int getResourcePositionId();

    boolean isOwnedByBriefInfo(ResourceBriefInfo resourceBriefInfo);
}
