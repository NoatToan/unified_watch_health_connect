package com.huawei.wisesecurity.kfs.ha;

import android.content.Context;
import com.huawei.wisesecurity.kfs.ha.message.ReportMsgBuilder;

/* JADX INFO: loaded from: classes46.dex */
public interface IKfsHA {
    void onEvent(Context context, ReportMsgBuilder reportMsgBuilder);
}
