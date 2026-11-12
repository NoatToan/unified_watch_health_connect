package com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.unitedevicemanger.handshake;

import com.huawei.unitedevice.entity.UniteDevice;
import defpackage.cmg;

/* JADX INFO: loaded from: classes10.dex */
public abstract class VariableHandshakeGeneralCommandBase {
    protected String mCurrentCommandTag;
    protected VariableHandshakeGeneralCommandBase mNextVariableHandshakeCommand;

    public abstract int constructCommandMessage(cmg cmgVar);

    public abstract String getCurrentCommandTag();

    public abstract int processReceivedData(UniteDevice uniteDevice, String str);

    public VariableHandshakeGeneralCommandBase getNextCommand() {
        return this.mNextVariableHandshakeCommand;
    }
}
