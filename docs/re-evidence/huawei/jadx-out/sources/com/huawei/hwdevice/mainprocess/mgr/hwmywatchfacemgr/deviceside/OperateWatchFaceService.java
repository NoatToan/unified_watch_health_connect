package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.deviceside;

import com.huawei.datatype.DeviceCommand;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.cqj;
import defpackage.lvb;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class OperateWatchFaceService {
    private static final int APPLY_OPERATE_TYPE = 3;
    private static final int APPLY_SYNC_TYPE_0x7 = 7;
    private static final int APPLY_WATCH_FACE_ID = 1;
    private static final int APPLY_WATCH_FACE_VERSION = 2;
    private static final int NEED_RECEIVE = 4;
    private static final String TAG = "OperateWatchFaceService";
    private static final String TAG_RELEASE = "R_OperateWatchFaceService";
    private static final int VALUE_OPERATE_APPLY = 1;
    private static final int VALUE_OPERATE_DELETE = 2;

    public void sendDeleteWatchFaceCommand(String str, String str2) {
        ReleaseLogUtil.d(TAG_RELEASE, "sendDeleteWatchFaceCommand enter");
        sendOperateWatchFaceCommand(buildOperateCommandUtil(str, str2, 2));
    }

    public void sendApplyWatchFaceCommand(String str, String str2) {
        ReleaseLogUtil.d(TAG_RELEASE, "sendApplyWatchFaceCommand enter");
        sendOperateWatchFaceCommand(buildOperateCommandUtil(str, str2, 1));
    }

    public void sendApplySyncWatchFaceCommand(String str, String str2) {
        ReleaseLogUtil.d(TAG_RELEASE, "sendApplySyncWatchFaceCommand enter");
        cqj cqjVarBuildOperateCommandUtil = buildOperateCommandUtil(str, str2, 1);
        cqjVarBuildOperateCommandUtil.g(7, 1);
        sendOperateWatchFaceCommand(cqjVarBuildOperateCommandUtil);
    }

    private cqj buildOperateCommandUtil(String str, String str2, int i) {
        cqj cqjVar = new cqj();
        cqjVar.b(1, str);
        cqjVar.b(2, str2);
        cqjVar.b(3, i);
        return cqjVar;
    }

    private void sendOperateWatchFaceCommand(cqj cqjVar) {
        ReleaseLogUtil.d(TAG_RELEASE, "sendOperateWatchFaceCommand enter");
        byte[] bArrE = cqjVar.e();
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(39);
        deviceCommand.setCommandID(3);
        deviceCommand.setDataContent(bArrE);
        deviceCommand.setDataLen(bArrE.length);
        LogUtil.a(TAG, "sendOperateWatchFaceCommand, deviceCommand:", deviceCommand.toString());
        lvb.e().c(deviceCommand);
    }

    static class SingletonHolder {
        private static final OperateWatchFaceService INSTANCE = new OperateWatchFaceService();

        private SingletonHolder() {
        }
    }

    public static OperateWatchFaceService getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
