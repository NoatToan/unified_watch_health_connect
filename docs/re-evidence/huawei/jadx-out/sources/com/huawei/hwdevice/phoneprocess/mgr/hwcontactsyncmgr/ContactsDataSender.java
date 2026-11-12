package com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr;

import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.business.constant.TransferFileReqType;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback;
import defpackage.eeq;
import defpackage.mhp;
import defpackage.mkf;
import defpackage.mro;

/* JADX INFO: loaded from: classes11.dex */
public class ContactsDataSender {
    private static final ContactsDataSender d = new ContactsDataSender();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SendFileCallback f17474a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SendFileCallback f17476c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IAppTransferFileResultAIDLCallback f17475b = new IAppTransferFileResultAIDLCallback.Stub() { // from class: com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.ContactsDataSender.4
        @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
        public void onFileTransferState(int i, String str) throws RemoteException {
            LogUtil.a("ContactsDataSender", "sync update zip file: ", "transferring ... ", Integer.valueOf(i), "%");
            if (ContactsDataSender.this.f17476c != null) {
                ContactsDataSender.this.f17476c.onTransferring(i);
            } else {
                LogUtil.j("ContactsDataSender", "sync update zip file: ", "onFileTransferState: callback is null.");
            }
        }

        @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
        public void onUpgradeFailed(int i, String str) throws RemoteException {
            LogUtil.a("ContactsDataSender", "sync update zip file: ", "transfer error.");
            if (ContactsDataSender.this.f17476c != null) {
                ContactsDataSender.this.f17476c.onTransferredFailed(i, str);
            } else {
                LogUtil.j("ContactsDataSender", "sync update zip file: ", "onUpgradeFailed: callback is null.");
            }
        }

        @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
        public void onFileRespond(int i, String str) throws RemoteException {
            LogUtil.a("ContactsDataSender", "sync update zip file: ", "transferred. checkResult: ", Integer.valueOf(i));
            if (ContactsDataSender.this.f17476c == null) {
                LogUtil.j("ContactsDataSender", "sync update zip file: ", "onFileRespond: callback is null.");
                return;
            }
            if (i == 1) {
                ContactsDataSender.this.f17476c.onTransferredSucceed();
                return;
            }
            if (i == 141000) {
                ContactsDataSender.this.f17476c.onTransferredFailed(i, "Time out");
                return;
            }
            if (i == 140001) {
                ContactsDataSender.this.f17474a.onTransferredFailed(i, "distributed sync contacts");
                return;
            }
            ContactsDataSender.this.f17476c.onTransferredFailed(-1, "invalid checkResult on 'onFileRespond' method : " + i);
        }
    };
    private IAppTransferFileResultAIDLCallback e = new IAppTransferFileResultAIDLCallback.Stub() { // from class: com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.ContactsDataSender.3
        @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
        public void onFileTransferState(int i, String str) throws RemoteException {
            LogUtil.a("ContactsDataSender", "sync delete csv file: ", "transferring ... ", Integer.valueOf(i), "%");
            if (ContactsDataSender.this.f17474a != null) {
                ContactsDataSender.this.f17474a.onTransferring(i);
            } else {
                LogUtil.j("ContactsDataSender", "sync delete csv file: ", "onFileTransferState: callback is null.");
            }
        }

        @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
        public void onUpgradeFailed(int i, String str) throws RemoteException {
            LogUtil.a("ContactsDataSender", "sync delete csv file: ", "transfer error: ", str);
            if (ContactsDataSender.this.f17474a != null) {
                ContactsDataSender.this.f17474a.onTransferredFailed(i, str);
            } else {
                LogUtil.j("ContactsDataSender", "sync delete csv file: ", "onUpgradeFailed: callback is null.");
            }
        }

        @Override // com.huawei.hwservicesmgr.IAppTransferFileResultAIDLCallback
        public void onFileRespond(int i, String str) throws RemoteException {
            LogUtil.a("ContactsDataSender", "sync delete csv file: ", "transferred. checkResult: ", Integer.valueOf(i));
            if (ContactsDataSender.this.f17474a == null) {
                LogUtil.j("ContactsDataSender", "sync delete csv file: ", "onFileRespond: callback is null.");
                return;
            }
            if (i == 1) {
                ContactsDataSender.this.f17474a.onTransferredSucceed();
                return;
            }
            if (i == 141000) {
                ContactsDataSender.this.f17474a.onTransferredFailed(i, "Time out");
                return;
            }
            if (i == 140001) {
                ContactsDataSender.this.f17474a.onTransferredFailed(i, "distributed sync contacts");
                return;
            }
            ContactsDataSender.this.f17474a.onTransferredFailed(-1, "invalid checkResult on 'onFileRespond' method : " + i);
        }
    };

    public interface SendFileCallback {
        void onTransferredFailed(int i, String str);

        void onTransferredSucceed();

        void onTransferring(int i);
    }

    private ContactsDataSender() {
    }

    public static ContactsDataSender d() {
        return d;
    }

    public void b(String str, String str2, SendFileCallback sendFileCallback) {
        LogUtil.a("ContactsDataSender", "syncContactZipFile:");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || sendFileCallback == null) {
            LogUtil.j("ContactsDataSender", "syncContactZipFile: failure, parameter is null or empty.");
        } else {
            this.f17476c = sendFileCallback;
            c(str, str2, 8, this.f17475b);
        }
    }

    public void a(String str, String str2, SendFileCallback sendFileCallback) {
        LogUtil.a("ContactsDataSender", "syncContactCsvFile:");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || sendFileCallback == null) {
            LogUtil.j("ContactsDataSender", "syncContactCsvFile: failure, parameter is null or empty.");
        } else {
            this.f17474a = sendFileCallback;
            c(str, str2, 9, this.e);
        }
    }

    public void d(String str, String str2, String str3, DeviceInfo deviceInfo) {
        c(3, eeq.c(b(str, 1) + b(str2, 2) + b(str3, 3)), deviceInfo);
    }

    private String b(String str, int i) {
        String strD = eeq.d(i);
        String strA = eeq.a(str);
        return strD + eeq.b(strA.length() / 2) + strA;
    }

    private void c(String str, String str2, int i, IAppTransferFileResultAIDLCallback iAppTransferFileResultAIDLCallback) {
        mhp mhpVar = new mhp();
        mhpVar.a(str2);
        mhpVar.h(str);
        mhpVar.c(i);
        mhpVar.e(TransferFileReqType.APP_DELIVERY);
        mhpVar.d(null);
        mro.e().e(mhpVar, iAppTransferFileResultAIDLCallback);
    }

    public void c(int i, byte[] bArr, DeviceInfo deviceInfo) {
        if (bArr == null || bArr.length == 0) {
            LogUtil.j("ContactsDataSender", "sendDataToDevice: ");
            return;
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(3);
        deviceCommand.setCommandID(i);
        deviceCommand.setDataContent(bArr);
        deviceCommand.setDataLen(bArr.length);
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        LogUtil.a("ContactsDataSender", "sendDataToDevice: ", deviceCommand.toString());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }
}
