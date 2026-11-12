package com.huawei.health.device.kit.wsp.task;

import defpackage.dro;

/* JADX INFO: loaded from: classes7.dex */
public interface ITaskService {
    void disable(dro droVar, IAsynBleTaskCallback iAsynBleTaskCallback);

    void enable(dro droVar, IAsynBleTaskCallback iAsynBleTaskCallback);

    void write(dro droVar, IAsynBleTaskCallback iAsynBleTaskCallback);
}
