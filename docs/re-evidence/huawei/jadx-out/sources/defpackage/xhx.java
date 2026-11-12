package defpackage;

import android.os.RemoteException;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.huawei.unitedevice.callback.ITransferFileCallback;
import com.huawei.unitedevice.hwcommonfilemgr.entity.CommonFileInfoParcel;
import com.huawei.unitedevice.hwwifip2ptransfermgr.HwWifiP2pTransferManager;
import com.huawei.unitedevice.hwwifip2ptransfermgr.WifiP2pTransferListener;
import health.compact.a.LogUtil;
import java.util.HashMap;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes20.dex */
public class xhx {
    public static boolean a(xhr xhrVar, WifiP2pTransferListener wifiP2pTransferListener, HashMap<Integer, LinkedList<xhr>> map, int i) {
        if (xhrVar == null || wifiP2pTransferListener == null || map == null) {
            LogUtil.e("HwCommonFileWifiAdapter", "wifi queue param is null, please check.");
            return false;
        }
        int iY = xhrVar.y();
        LogUtil.b("HwCommonFileWifiAdapter", "wifiP2pTransferByQueue fileInfo is: ", Integer.valueOf(iY), "file name :", xhrVar.n());
        if (!HwWifiP2pTransferManager.a().c(xhrVar.y(), xhrVar.h())) {
            return false;
        }
        b(xhrVar);
        if (d(xhrVar, wifiP2pTransferListener, map)) {
            return true;
        }
        Boolean boolE = e(xhrVar, wifiP2pTransferListener, i);
        if (boolE != null) {
            return boolE.booleanValue();
        }
        long jU = xhrVar.u();
        LogUtil.b("HwCommonFileWifiAdapter", "totalSize:", Long.valueOf(jU));
        if (jU > PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE && b(xhrVar, wifiP2pTransferListener)) {
            LogUtil.b("HwCommonFileWifiAdapter", "wifiP2pTransferByQueue start p2p transfer");
            e();
            lng.k();
            return true;
        }
        lng.c();
        return false;
    }

    private static boolean d(xhr xhrVar, WifiP2pTransferListener wifiP2pTransferListener, HashMap<Integer, LinkedList<xhr>> map) {
        xia xiaVarI = HwWifiP2pTransferManager.a().i();
        if (xiaVarI == null || d(xiaVarI, xhrVar)) {
            return false;
        }
        LogUtil.b("HwCommonFileWifiAdapter", "wifi send file, wait queue.");
        HwWifiP2pTransferManager.a().c(xhrVar, wifiP2pTransferListener, 1);
        return true;
    }

    private static Boolean e(xhr xhrVar, WifiP2pTransferListener wifiP2pTransferListener, int i) {
        if (!d(xhrVar, wifiP2pTransferListener)) {
            return null;
        }
        e();
        xia xiaVarI = HwWifiP2pTransferManager.a().i();
        LogUtil.b("HwCommonFileWifiAdapter", "wifi is ok. send 5.54.5 or 5.54.9");
        if (xiaVarI != null) {
            if (d(i, xiaVarI)) {
                return false;
            }
        } else {
            LogUtil.e("HwCommonFileWifiAdapter", "fileInfo is null. please check.");
        }
        lng.k();
        return true;
    }

    private static boolean d(int i, xia xiaVar) {
        if (i == xiaVar.l() || xiaVar.l() == 2 || !HwWifiP2pTransferManager.a().e(xiaVar)) {
            LogUtil.b("HwCommonFileWifiAdapter", "wifi is ok. send 5.54.5 : ", Integer.valueOf(xiaVar.l()));
            xie.b(xiaVar);
            return false;
        }
        LogUtil.b("HwCommonFileWifiAdapter", "no search, send 5.54.9 : ", Integer.valueOf(xiaVar.l()));
        if (xie.a(xiaVar, 9) == 1) {
            if (xiaVar.u() == 1) {
                xie.b(xiaVar);
                return false;
            }
            if (xiaVar.u() != 2) {
                return false;
            }
            xie.a(xiaVar);
            return false;
        }
        HwWifiP2pTransferManager.a().b(xiaVar.l());
        HwWifiP2pTransferManager.a().c();
        return true;
    }

    private static void b(xhr xhrVar) {
        if (HwWifiP2pTransferManager.a().c(xhrVar.y())) {
            try {
                LogUtil.b("HwCommonFileWifiAdapter", "isHasFileInfoWithFileType is true");
                Thread.sleep(500L);
            } catch (InterruptedException e) {
                LogUtil.d("HwCommonFileWifiAdapter", "InterruptedException is ", e.getMessage());
            }
        }
    }

    private static boolean d(xia xiaVar, xhr xhrVar) {
        return xiaVar.l() == xhrVar.y() && xiaVar.j().equals(xhrVar.n()) && xhrVar.u() == xiaVar.g();
    }

    private static boolean d(xhr xhrVar, WifiP2pTransferListener wifiP2pTransferListener) {
        HwWifiP2pTransferManager hwWifiP2pTransferManagerA = HwWifiP2pTransferManager.a();
        if (!hwWifiP2pTransferManagerA.l() || !hwWifiP2pTransferManagerA.g()) {
            return false;
        }
        LogUtil.b("HwCommonFileWifiAdapter", "wifiP2pTransferChannelAvailable");
        hwWifiP2pTransferManagerA.c(xhrVar, wifiP2pTransferListener, 1);
        return true;
    }

    public static void e() {
        HwWifiP2pTransferManager.a().r();
    }

    private static boolean b(xhr xhrVar, WifiP2pTransferListener wifiP2pTransferListener) {
        int iD;
        if (xhrVar == null) {
            return false;
        }
        LogUtil.b("HwCommonFileWifiAdapter", "startP2p fileInfo id is: ", Integer.valueOf(xhrVar.y()), "file name : ", xhrVar.n());
        HwWifiP2pTransferManager hwWifiP2pTransferManagerA = HwWifiP2pTransferManager.a();
        if (!hwWifiP2pTransferManagerA.o()) {
            iD = hwWifiP2pTransferManagerA.d(xhrVar);
            if (iD >= 4) {
            }
            return false;
        }
        iD = 0;
        xhrVar.i(iD);
        hwWifiP2pTransferManagerA.c(xhrVar, wifiP2pTransferListener, 1);
        LogUtil.b("HwCommonFileWifiAdapter", "startP2p WifiP2P transfer");
        if (hwWifiP2pTransferManagerA.d(xhrVar.h() != null ? xhrVar.h().getIdentify() : null, (HwWifiP2pTransferManager.TransferBleToWifiCallback) null)) {
            LogUtil.b("HwCommonFileWifiAdapter", "startP2p WifiP2P transfer getWifiP2pEnable");
            return true;
        }
        hwWifiP2pTransferManagerA.b(xhrVar.y());
        return false;
    }

    public static boolean d(CommonFileInfoParcel commonFileInfoParcel, ITransferFileCallback iTransferFileCallback) {
        if (iTransferFileCallback == null) {
            LogUtil.e("HwCommonFileWifiAdapter", "wifi stop file callback is null.");
            return false;
        }
        xia xiaVarI = HwWifiP2pTransferManager.a().i();
        if (xiaVarI == null || commonFileInfoParcel == null) {
            LogUtil.e("HwCommonFileWifiAdapter", "wifiP2pStopTransferFileByQueue file info is null.");
            try {
                iTransferFileCallback.onResponse(20003, "");
            } catch (RemoteException unused) {
                LogUtil.d("HwCommonFileWifiAdapter", "stopTransferByQueue RemoteException");
            }
            HwWifiP2pTransferManager.a().c();
            return true;
        }
        String fileName = commonFileInfoParcel.getFileName();
        int fileType = commonFileInfoParcel.getFileType();
        String strJ = xiaVarI.j();
        LogUtil.b("HwCommonFileWifiAdapter", "file name : ", fileName, " fileType : ", Integer.valueOf(fileType), "nowName : ", strJ, "nowType : ", Integer.valueOf(xiaVarI.l()));
        if (b(fileType, xiaVarI.l(), fileName, strJ)) {
            LogUtil.b("HwCommonFileWifiAdapter", "remove file is using wifi, stop this.");
            c(xiaVarI);
            HwWifiP2pTransferManager.a().y();
            return false;
        }
        LogUtil.e("HwCommonFileWifiAdapter", "file now equal, please check.");
        HwWifiP2pTransferManager.a().b(fileType);
        try {
            iTransferFileCallback.onResponse(20003, "");
            return true;
        } catch (RemoteException unused2) {
            LogUtil.d("HwCommonFileWifiAdapter", "stopTransferByQueue RemoteException");
            return true;
        }
    }

    private static void c(xia xiaVar) {
        int iAa = xiaVar.aa();
        if (iAa == 2 || iAa == 4) {
            LogUtil.b("HwCommonFileWifiAdapter", "linking wifi p2p, stop task.");
            int iL = xiaVar.l();
            HwWifiP2pTransferManager.a().q();
            xiaVar.n().onFail(20003, "link wifi user stop task", iL);
            return;
        }
        if (iAa == 5) {
            xiaVar.n().onFail(1014, "use stop wifi", xiaVar.l());
        } else if (iAa == 1) {
            LogUtil.b("HwCommonFileWifiAdapter", "linking wifi p2p, stop task.");
            int iL2 = xiaVar.l();
            HwWifiP2pTransferManager.a().q();
            xiaVar.n().onFail(20008, "link wifi user stop task", iL2);
        }
    }

    private static boolean b(int i, int i2, String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            return str.equals(str2) && i == i2;
        }
        LogUtil.e("HwCommonFileWifiAdapter", "file name is empty, please check.");
        return false;
    }
}
