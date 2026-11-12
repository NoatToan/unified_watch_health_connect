package com.huawei.hihealthservice.updatemanager.command;

import android.content.Context;
import android.os.RemoteException;
import com.huawei.hihealth.HiDataUpdateOption;
import com.huawei.hihealth.IDataOperateListener;

/* JADX INFO: loaded from: classes10.dex */
public interface UpdateCommand {
    void execute(HiDataUpdateOption hiDataUpdateOption, IDataOperateListener iDataOperateListener, Context context) throws RemoteException;
}
