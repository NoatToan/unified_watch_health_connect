package defpackage;

import android.os.RemoteException;
import com.google.gson.Gson;
import com.google.json.JsonSanitizer;
import com.huawei.devicesdk.callback.MessageReceiveCallback;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.unitedevice.callback.ITransferFileCallback;
import com.huawei.unitedevice.hwcommonfilemgr.entity.CommonFileInfoParcel;
import com.huawei.unitedevice.hwcommonfilemgr.entity.RequestFileInfo;
import com.huawei.unitedevice.p2p.IdentityInfo;
import com.huawei.unitedevice.p2p.P2pReceiver;
import health.compact.a.LogUtil;
import java.io.File;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes20.dex */
public class xil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f53053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private P2pReceiver f53054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IdentityInfo f53055c;
    private final MessageReceiveCallback d;
    private cqe e;

    public xil(IdentityInfo identityInfo, P2pReceiver p2pReceiver) {
        MessageReceiveCallback messageReceiveCallback = new MessageReceiveCallback() { // from class: xil.4
            @Override // com.huawei.devicesdk.callback.MessageReceiveCallback
            public void onChannelEnable(DeviceInfo deviceInfo, String str, int i) {
            }

            @Override // com.huawei.devicesdk.callback.MessageReceiveCallback
            public void onDataReceived(DeviceInfo deviceInfo, cmm cmmVar, int i) {
                if (cmmVar != null) {
                    byte[] bArrD = cmmVar.d();
                    if (bArrD == null || bArrD.length <= 2) {
                        LogUtil.e("FileBaseManager", "frames is error.");
                        return;
                    }
                    byte b2 = bArrD[0];
                    byte b3 = bArrD[1];
                    LogUtil.c("FileBaseManager", "serviceId: ", Integer.valueOf(b2));
                    if (b2 == 44 && b3 == 7) {
                        String strD = cph.d(bArrD);
                        LogUtil.b("FileBaseManager", "5.44.7 handleDeviceSendNotice: ", strD);
                        if (strD == null) {
                            return;
                        }
                        String strSubstring = strD.substring(4);
                        xhr xhrVar = new xhr();
                        try {
                            xil.this.a(xhrVar, xil.this.e.a(strSubstring).b());
                        } catch (cpy unused) {
                            LogUtil.d("FileBaseManager", "handleDeviceSendNotice error");
                        }
                        LogUtil.b("FileBaseManager", "enter registerReceiver: ", xhrVar.i());
                        if (xil.this.f53055c.equals(new IdentityInfo(xhrVar.i(), xhrVar.g()))) {
                            xil.this.e(xhrVar, deviceInfo);
                        }
                    }
                }
            }
        };
        this.d = messageReceiveCallback;
        this.e = new cqe();
        this.f53054b = p2pReceiver;
        this.f53055c = identityInfo;
        this.f53053a = UUID.randomUUID().toString();
        xgt.b().registerDeviceMessageListener(this.f53053a, messageReceiveCallback);
    }

    public void d() {
        xgt.b().unregisterDeviceMessageListener(this.f53053a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(xhr xhrVar, List<cqa> list) {
        for (cqa cqaVar : list) {
            int iC = cpb.c(cqaVar.b(), 16);
            String strC = cqaVar.c();
            switch (iC) {
                case 1:
                    xhrVar.c(cph.a(strC));
                    break;
                case 2:
                    xhrVar.g(cpb.a(strC));
                    break;
                case 3:
                    xhrVar.a(cpb.a(strC));
                    break;
                case 4:
                    xhrVar.a(cpb.d(strC));
                    break;
                case 5:
                case 6:
                default:
                    LogUtil.c("FileBaseManager", "5.44.7 parseDeviceReportTlv default");
                    break;
                case 7:
                    xhrVar.b(cph.a(strC));
                    break;
                case 8:
                    xhrVar.g(cph.a(strC));
                    break;
                case 9:
                    xhrVar.a(cph.a(strC));
                    break;
                case 10:
                    xhrVar.j(cph.a(strC));
                    break;
                case 11:
                    xhrVar.e(cph.a(strC));
                    break;
                case 12:
                    if (cpb.a(strC) == 1) {
                        xhrVar.c(true);
                    }
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(xhr xhrVar, final DeviceInfo deviceInfo) {
        xgt.b().startReceiveFileFromWear(d(xhrVar, deviceInfo), new ITransferFileCallback.Stub() { // from class: xil.5
            @Override // com.huawei.unitedevice.callback.ITransferFileCallback
            public void onSuccess(int i, String str, String str2) throws RemoteException {
                LogUtil.b("FileBaseManager", "ITransferFileCallback onSuccess");
            }

            @Override // com.huawei.unitedevice.callback.ITransferFileCallback
            public void onFailure(int i, String str) throws RemoteException {
                LogUtil.b("FileBaseManager", "ITransferFileCallback onFailure");
            }

            @Override // com.huawei.unitedevice.callback.ITransferFileCallback
            public void onProgress(int i, String str) throws RemoteException {
                LogUtil.b("FileBaseManager", "ITransferFileCallback onProgress");
            }

            @Override // com.huawei.unitedevice.callback.ITransferFileCallback
            public void onResponse(int i, String str) throws RemoteException {
                if (xil.this.f53054b != null) {
                    CommonFileInfoParcel commonFileInfoParcel = (CommonFileInfoParcel) new Gson().fromJson(JsonSanitizer.sanitize(str), CommonFileInfoParcel.class);
                    if (commonFileInfoParcel == null) {
                        LogUtil.e("FileBaseManager", "onResponse FileInfo is null");
                        return;
                    }
                    xiu.c cVar = new xiu.c();
                    cVar.e(commonFileInfoParcel.getDescription());
                    cVar.a(new File(commonFileInfoParcel.getFilePath()));
                    xil.this.f53054b.onReceiveMessage(deviceInfo, cVar.c());
                }
            }
        });
    }

    private RequestFileInfo d(xhr xhrVar, DeviceInfo deviceInfo) {
        RequestFileInfo requestFileInfo = new RequestFileInfo();
        requestFileInfo.setFileName(xhrVar.n());
        requestFileInfo.setFileType(xhrVar.y());
        requestFileInfo.setFileId(xhrVar.m());
        requestFileInfo.setFileSize(xhrVar.u());
        requestFileInfo.setDescription(xhrVar.j());
        requestFileInfo.setSourcePackageName(xhrVar.ag());
        requestFileInfo.setDestinationPackageName(xhrVar.i());
        requestFileInfo.setSourceCertificate(xhrVar.ai());
        requestFileInfo.setDestinationCertificate(xhrVar.g());
        requestFileInfo.setCancelTransmission(xhrVar.ao());
        requestFileInfo.setNeedVerify(true);
        requestFileInfo.setTimes(new int[]{xhrVar.aj(), xhrVar.k()});
        requestFileInfo.setKit(false);
        requestFileInfo.setDeviceReport(true);
        if (deviceInfo != null) {
            requestFileInfo.setDeviceMac(deviceInfo.getDeviceMac());
        }
        return requestFileInfo;
    }
}
