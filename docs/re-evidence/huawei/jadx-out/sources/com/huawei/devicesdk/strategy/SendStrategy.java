package com.huawei.devicesdk.strategy;

import com.huawei.devicesdk.callback.MessageReceiveCallback;
import com.huawei.devicesdk.entity.DeviceInfo;
import defpackage.cmd;
import defpackage.cmg;
import defpackage.cmm;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SendStrategy {
    public abstract void destroy(String str);

    public abstract ArrayList<cmd> getSendFrames(cmg cmgVar, DeviceInfo deviceInfo);

    public abstract void parseReceiveFrames(DeviceInfo deviceInfo, cmm cmmVar, MessageReceiveCallback messageReceiveCallback);
}
