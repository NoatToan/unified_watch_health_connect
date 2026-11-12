package com.huawei.agconnect.common.api;

import com.huawei.agconnect.common.aaid.AAIDImpl;

/* JADX INFO: loaded from: classes22.dex */
public interface AAID {
    public static final AAID INSTANCE = new AAIDImpl();

    String getId();
}
