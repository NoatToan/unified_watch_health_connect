package defpackage;

import android.content.ContentUris;
import android.net.Uri;
import android.os.Build;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import androidx.media3.muxer.Mp4Utils;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.devicesdk.entity.SendMode;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.db.bean.ContentResource;
import com.huawei.unitedevice.callback.IResultAIDLCallback;
import com.huawei.unitedevice.entity.UniteDevice;
import com.huawei.unitedevice.hwcommonfilemgr.TransferFileQueueManager;
import com.huawei.unitedevice.hwcommonfilemgr.entity.CommonFileInfoParcel;
import com.huawei.unitedevice.hwcommonfilemgr.entity.FileInfo;
import com.huawei.unitedevice.hwwifip2ptransfermgr.HwWifiP2pTransferManager;
import health.compact.a.LogUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class xhn {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f52996b = new Object();
    private static volatile xhn d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ReentrantLock f52998c = new ReentrantLock();
    private Timer e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CountDownLatch f52997a = null;

    private xhn() {
    }

    public xhr b(CommonFileInfoParcel commonFileInfoParcel) {
        xhr xhrVar = new xhr();
        if (commonFileInfoParcel == null) {
            return xhrVar;
        }
        xhrVar.c(commonFileInfoParcel.getFileName());
        xhrVar.g(commonFileInfoParcel.getFileType());
        xhrVar.g(commonFileInfoParcel.getSourcePackageName());
        xhrVar.a(commonFileInfoParcel.getDestinationPackageName());
        return xhrVar;
    }

    public JSONObject c(FileInfo fileInfo) {
        JSONObject jSONObject = new JSONObject();
        if (fileInfo == null) {
            LogUtil.e("unite_HwCommonFileMgrProcess", "fileInfo is null");
            return jSONObject;
        }
        try {
            jSONObject.put(ContentResource.FILE_NAME, fileInfo.getFileName());
            jSONObject.put("fileType", fileInfo.getFileType());
            return jSONObject;
        } catch (JSONException unused) {
            LogUtil.b("unite_HwCommonFileMgrProcess", "transfer to JSONObject error");
            return jSONObject;
        }
    }

    public static xhn e() {
        xhn xhnVar;
        synchronized (f52996b) {
            if (d == null) {
                d = new xhn();
            }
            xhnVar = d;
        }
        return xhnVar;
    }

    static cmg a(xhq xhqVar, byte[] bArr) {
        byte[] bArrF = cph.f(xhqVar.c());
        byte[] bArrF2 = cph.f(xhqVar.a());
        byte[] bArrE = cph.e(xhqVar.b());
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrF.length + 2 + bArrF2.length + bArrE.length + bArr.length);
        byteBufferAllocate.put((byte) 40);
        byteBufferAllocate.put((byte) 6);
        byteBufferAllocate.put(bArrF);
        byteBufferAllocate.put(bArrF2);
        byteBufferAllocate.put(bArrE);
        byteBufferAllocate.put(bArr);
        cmg cmgVar = new cmg();
        cmgVar.d(SendMode.PROTOCOL_TYPE_5A);
        cmgVar.a(byteBufferAllocate.array());
        return cmgVar;
    }

    public static UniteDevice a(DeviceInfo deviceInfo) {
        UniteDevice uniteDevice = new UniteDevice();
        if (deviceInfo != null) {
            uniteDevice.setDeviceInfo(deviceInfo);
            uniteDevice.setIdentify(deviceInfo.getDeviceMac());
        }
        return uniteDevice;
    }

    public static boolean e(xht xhtVar, byte[] bArr) throws cpy {
        if (xhtVar == null) {
            return false;
        }
        cql.c cVarA = new cql().a(bArr, 2);
        xhtVar.c(cVarA.e((byte) 2, ""));
        xhtVar.e(cVarA.d((byte) 3, 30));
        xhtVar.d(cVarA.d((byte) 4, 0) == 1);
        int iD = cVarA.d((byte) 5, 0);
        if (iD == 0) {
            return false;
        }
        xhtVar.g(iD);
        xhtVar.c(cVarA.d((byte) 6, 0));
        xhtVar.d(cVarA.d((byte) 7, 0));
        xhtVar.h(cVarA.d((byte) 8, 0));
        xhtVar.b(cVarA.d((byte) 1, 0));
        xhtVar.c(cVarA.d((byte) 9, 0) == 1);
        xhtVar.a(cVarA.d((byte) 10, 0) == 1);
        return true;
    }

    public static FileInputStream a(xhr xhrVar, long j) {
        if (xhrVar == null) {
            return null;
        }
        LogUtil.b("unite_HwCommonFileMgrProcess", "fileInfo.getFilePath() :", xhrVar.t(), "uriId :", Long.valueOf(j), "getFileInputStream, fileInfo.getParcelFileDescriptor() isNull :", Boolean.valueOf(xhrVar.z() == null));
        if (xhrVar.z() != null) {
            LogUtil.b("unite_HwCommonFileMgrProcess", "FileDescriptor is :", xhrVar.z().getFileDescriptor());
            return new FileInputStream(xhrVar.z().getFileDescriptor());
        }
        return d(xhrVar.t(), j);
    }

    public static String d(xhr xhrVar, ParcelFileDescriptor parcelFileDescriptor) {
        if (xhrVar == null) {
            LogUtil.e("unite_HwCommonFileMgrProcess", "CommonFileInfo is null.");
            return null;
        }
        FileInputStream fileInputStreamA = a(xhrVar, xhrVar.aq());
        if (fileInputStreamA == null) {
            LogUtil.e("unite_HwCommonFileMgrProcess", "sha256File error.");
            cpm.d(parcelFileDescriptor);
            return null;
        }
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                byte[] bArr = new byte[1024];
                int i = fileInputStreamA.read(bArr);
                if (i != -1) {
                    messageDigest.update(bArr, 0, i);
                    while (true) {
                        int i2 = fileInputStreamA.read(bArr);
                        if (i2 == -1) {
                            break;
                        }
                        messageDigest.update(bArr, 0, i2);
                    }
                } else {
                    messageDigest.update(bArr, 0, 0);
                }
                String strD = cph.d(messageDigest.digest());
                try {
                    fileInputStreamA.close();
                } catch (IOException unused) {
                    LogUtil.d("unite_HwCommonFileMgrProcess", "close stream IoException");
                }
                cpm.d(parcelFileDescriptor);
                return strD;
            } catch (Throwable th) {
                try {
                    fileInputStreamA.close();
                } catch (IOException unused2) {
                    LogUtil.d("unite_HwCommonFileMgrProcess", "close stream IoException");
                }
                cpm.d(parcelFileDescriptor);
                throw th;
            }
        } catch (IOException unused3) {
            LogUtil.d("unite_HwCommonFileMgrProcess", "sha256File IOException");
            try {
                fileInputStreamA.close();
            } catch (IOException unused4) {
                LogUtil.d("unite_HwCommonFileMgrProcess", "close stream IoException");
            }
            cpm.d(parcelFileDescriptor);
            return "";
        } catch (NoSuchAlgorithmException unused5) {
            LogUtil.d("unite_HwCommonFileMgrProcess", "MessageDigest not support");
            try {
                fileInputStreamA.close();
            } catch (IOException unused6) {
                LogUtil.d("unite_HwCommonFileMgrProcess", "close stream IoException");
            }
            cpm.d(parcelFileDescriptor);
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    public static long b(File file, long j, ParcelFileDescriptor parcelFileDescriptor) {
        long size;
        long jAvailable = 0;
        if (file == null) {
            LogUtil.e("unite_HwCommonFileMgrProcess", "getFileSizeByFilePath file is null");
            return 0L;
        }
        if (!file.exists()) {
            return 0L;
        }
        Object[] objArrD = d(file.getPath(), j);
        if (objArrD == 0) {
            LogUtil.e("unite_HwCommonFileMgrProcess", "getFileSizeByFilePath, getFileSize error.");
            cpm.d(parcelFileDescriptor);
            return 0L;
        }
        try {
            try {
                jAvailable = objArrD.available();
                size = objArrD.getChannel().size();
                LogUtil.b("unite_HwCommonFileMgrProcess", "fileInputStream getChannel( size is: ", Long.valueOf(size));
                if (size > Mp4Utils.UNSIGNED_INT_MAX_VALUE) {
                    size = -1;
                }
                try {
                    objArrD.close();
                    objArrD = objArrD;
                } catch (IOException unused) {
                    Object[] objArr = {"closeQuietly occurIOException."};
                    LogUtil.d("unite_HwCommonFileMgrProcess", objArr);
                    objArrD = objArr;
                }
                if (parcelFileDescriptor != null) {
                    try {
                        parcelFileDescriptor.close();
                    } catch (IOException unused2) {
                        objArrD = new Object[]{"closeQuietly occurIOException."};
                        LogUtil.d("unite_HwCommonFileMgrProcess", objArrD);
                    }
                }
            } catch (IOException unused3) {
                LogUtil.d("unite_HwCommonFileMgrProcess", "getFileSizeByFilePath, IOException");
                try {
                    objArrD.close();
                    objArrD = objArrD;
                } catch (IOException unused4) {
                    Object[] objArr2 = {"closeQuietly occurIOException."};
                    LogUtil.d("unite_HwCommonFileMgrProcess", objArr2);
                    objArrD = objArr2;
                }
                if (parcelFileDescriptor != null) {
                    try {
                        parcelFileDescriptor.close();
                    } catch (IOException unused5) {
                        objArrD = new Object[]{"closeQuietly occurIOException."};
                        LogUtil.d("unite_HwCommonFileMgrProcess", objArrD);
                    }
                }
                size = jAvailable;
            }
            return size;
        } catch (Throwable th) {
            try {
                objArrD.close();
            } catch (IOException unused6) {
                LogUtil.d("unite_HwCommonFileMgrProcess", "closeQuietly occurIOException.");
            }
            if (parcelFileDescriptor != null) {
                try {
                    parcelFileDescriptor.close();
                    throw th;
                } catch (IOException unused7) {
                    LogUtil.d("unite_HwCommonFileMgrProcess", "closeQuietly occurIOException.");
                    throw th;
                }
            }
            throw th;
        }
    }

    private static FileInputStream d(String str, long j) {
        if (!xhv.d(str)) {
            LogUtil.e("unite_HwCommonFileMgrProcess", "getFileInputStreamByUriId checkFilepath error");
            return null;
        }
        try {
            if (j == -1) {
                String strE = cpb.e(str);
                if (strE != null) {
                    return new FileInputStream(strE);
                }
            } else {
                Uri uriWithAppendedId = ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, j);
                InputStream inputStreamOpenInputStream = BaseApplication.b().getContentResolver().openInputStream(uriWithAppendedId);
                if (inputStreamOpenInputStream instanceof FileInputStream) {
                    LogUtil.d("unite_HwCommonFileMgrProcess", "transform type success ");
                    return (FileInputStream) inputStreamOpenInputStream;
                }
                LogUtil.d("unite_HwCommonFileMgrProcess", "transform type fail ");
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = BaseApplication.b().getContentResolver().openFileDescriptor(uriWithAppendedId, "r");
                xhj.c().a(parcelFileDescriptorOpenFileDescriptor);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    return new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                }
            }
        } catch (FileNotFoundException e) {
            LogUtil.d("unite_HwCommonFileMgrProcess", "getFileInputStreamByUriId FileNotFoundException", cpc.c(e));
        }
        return null;
    }

    public static long c(ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2) {
        long jAvailable = 0;
        if (parcelFileDescriptor == null) {
            return 0L;
        }
        FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptor.getFileDescriptor());
        try {
            jAvailable = fileInputStream.available();
            long size = fileInputStream.getChannel().size();
            LogUtil.b("unite_HwCommonFileMgrProcess", "fileInputStream getChannel( size is: ", Long.valueOf(size));
            if (size > Mp4Utils.UNSIGNED_INT_MAX_VALUE) {
                size = -1;
            }
            if (parcelFileDescriptor2 == null) {
                return size;
            }
            try {
                return size;
            } catch (IOException unused) {
                return size;
            }
        } catch (IOException unused2) {
            LogUtil.d("unite_HwCommonFileMgrProcess", "getFileSizeByFileDescriptor, IOException");
            return jAvailable;
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException unused3) {
                LogUtil.d("unite_HwCommonFileMgrProcess", "closeQuietly occurIOException.");
            }
            if (parcelFileDescriptor2 != null) {
                try {
                    parcelFileDescriptor2.close();
                } catch (IOException unused4) {
                    LogUtil.d("unite_HwCommonFileMgrProcess", "closeQuietly occurIOException.");
                }
            }
        }
    }

    public static String d(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, str2);
            return jSONObject.toString();
        } catch (JSONException unused) {
            LogUtil.d("unite_HwCommonFileMgrProcess", "getJsonString. please check.");
            return null;
        }
    }

    public void c(xhr xhrVar, xhj xhjVar, long j) {
        if (xhrVar == null || xhjVar == null) {
            LogUtil.b("unite_HwCommonFileMgrProcess", "param is null.");
            return;
        }
        if (xhrVar.e() == 0) {
            LogUtil.b("unite_HwCommonFileMgrProcess", "left file is too small, no change to wifi.");
            return;
        }
        if (xhrVar.af() == 1) {
            LogUtil.b("unite_HwCommonFileMgrProcess", "this task wait sport watch ota, alwasy send file by bt.");
            return;
        }
        if (xhrVar.y() == -1) {
            LogUtil.b("unite_HwCommonFileMgrProcess", "normal watch no change wifi.");
            return;
        }
        if (!HwWifiP2pTransferManager.a().o()) {
            LogUtil.b("unite_HwCommonFileMgrProcess", "wifi is not open, please check!");
            return;
        }
        try {
            try {
                this.f52998c.tryLock(1L, TimeUnit.SECONDS);
                if (this.e != null) {
                    LogUtil.b("unite_HwCommonFileMgrProcess", "wifi already count time, no switch this time. wait time switch wifi");
                    this.f52998c.unlock();
                    return;
                }
            } catch (InterruptedException e) {
                LogUtil.d("unite_HwCommonFileMgrProcess", "trySwitchBtToWifi ", e.getMessage());
            }
            this.f52998c.unlock();
            int i = 3;
            if (xhrVar.y() == 7) {
                long jU = xhrVar.u() / Constants.WEB_VIEW_CACHE_TOTAL_MAX_SIZE;
                LogUtil.b("unite_HwCommonFileMgrProcess", "fileSize / MIN_FILE_SIZE_FOR_TIMERS ", Long.valueOf(jU));
                if (1 <= jU) {
                    i = (int) (((long) 3) + jU);
                }
            }
            this.e = new Timer("switchBtToWifi");
            long j2 = j == 1 ? -1L : 0L;
            if (j > 1) {
                j2 = j / 2;
            }
            d(j2, i, xhjVar);
        } catch (Throwable th) {
            this.f52998c.unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final long j, final int i, final xhj xhjVar) {
        LogUtil.b("unite_HwCommonFileMgrProcess", "TrySwitchWifiTask time : ", Long.valueOf(j), " maxTime : ", Integer.valueOf(i));
        try {
            try {
                this.f52998c.tryLock(1L, TimeUnit.SECONDS);
                Timer timer = this.e;
                if (timer == null) {
                    LogUtil.e("unite_HwCommonFileMgrProcess", "delayTask timer is null. please check.");
                } else {
                    long j2 = ((2 * j) + 1) * 60000;
                    timer.schedule(new TimerTask() { // from class: xhn.4
                        @Override // java.util.TimerTask, java.lang.Runnable
                        public void run() {
                            if (j < i) {
                                if (HwWifiP2pTransferManager.a().m() != 1) {
                                    xhjVar.e();
                                }
                                xhn.this.d(j + 1, i, xhjVar);
                                return;
                            }
                            xhn.this.b();
                        }
                    }, j2 > 0 ? j2 : 0L);
                }
            } catch (InterruptedException e) {
                LogUtil.d("unite_HwCommonFileMgrProcess", "delayTask ", e.getMessage());
            }
        } finally {
            this.f52998c.unlock();
        }
    }

    public boolean b() {
        boolean z = true;
        try {
            try {
                boolean zTryLock = this.f52998c.tryLock(1L, TimeUnit.SECONDS);
                Timer timer = this.e;
                if (timer != null) {
                    LogUtil.b("unite_HwCommonFileMgrProcess", "closeTrySwitchWifiTask : ", Boolean.valueOf(zTryLock));
                    timer.cancel();
                    this.e = null;
                } else {
                    z = false;
                }
                return z;
            } catch (InterruptedException e) {
                LogUtil.d("unite_HwCommonFileMgrProcess", "closeTrySwitchWifiTask exception : ", e.getMessage());
                return false;
            }
        } finally {
            this.f52998c.unlock();
        }
    }

    public boolean e(xhr xhrVar) {
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        if (xhrVar == null) {
            LogUtil.e("unite_HwCommonFileMgrProcess", "mCommonWifiFileInfo is null");
            return false;
        }
        long jU = xhrVar.u();
        long jS = jU - xhrVar.s();
        LogUtil.b("unite_HwCommonFileMgrProcess", "totalSize:", Long.valueOf(jU), "translate file remainingSize:", Long.valueOf(jS));
        if (jU > PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE && jS >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) {
            boolean zC = HwWifiP2pTransferManager.a().c(xhrVar.y(), xhrVar.h());
            LogUtil.b("unite_HwCommonFileMgrProcess", "no support wifi, do not switch to wifi. : ", Boolean.valueOf(zC));
            if (HwWifiP2pTransferManager.a().o() && !HwWifiP2pTransferManager.a().k() && zC) {
                return true;
            }
        }
        return false;
    }

    public void c(int i, int i2, long j, int i3) {
        if (cop.h()) {
            return;
        }
        StringBuilder sb = new StringBuilder(16);
        sb.append("transferData psnID ");
        sb.append(i);
        sb.append("length = ");
        sb.append(i2);
        sb.append("ota_offset = ");
        sb.append(j);
        sb.append("sended_length = ");
        sb.append(i3);
        LogUtil.b("unite_HwCommonFileMgrProcess", sb.toString());
    }

    public boolean a(IResultAIDLCallback iResultAIDLCallback, FileInfo fileInfo) {
        String canonicalPath;
        if (iResultAIDLCallback == null) {
            LogUtil.e("unite_HwCommonFileMgrProcess", "start To Device TransFile callback is null");
            return false;
        }
        try {
            if (fileInfo == null) {
                LogUtil.e("unite_HwCommonFileMgrProcess", "start To Device TransFile fileInfo is null");
                iResultAIDLCallback.onTransferFailed(20000, "");
                return false;
            }
            if (TextUtils.isEmpty(fileInfo.getFilePath()) && fileInfo.getFileDescriptor() == null) {
                LogUtil.e("unite_HwCommonFileMgrProcess", "start to Device Transfile filePath is null");
                iResultAIDLCallback.onTransferFailed(20006, "");
                return false;
            }
            if (!TextUtils.isEmpty(fileInfo.getFilePath())) {
                try {
                    canonicalPath = new File(fileInfo.getFilePath()).getCanonicalPath();
                } catch (IOException unused) {
                    LogUtil.d("unite_HwCommonFileMgrProcess", "startTransfer IOException");
                    canonicalPath = null;
                }
                if (TextUtils.isEmpty(canonicalPath)) {
                    LogUtil.e("unite_HwCommonFileMgrProcess", "safePath is not exist");
                    iResultAIDLCallback.onTransferFailed(20007, "");
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            LogUtil.d("unite_HwCommonFileMgrProcess", "checkAvailability Exception", cpc.c(e));
            return false;
        }
    }

    public static void c(UniteDevice uniteDevice) {
        LogUtil.b("unite_HwCommonFileMgrProcess", "tryCloseWifi");
        if (uniteDevice == null) {
            return;
        }
        xia xiaVarI = HwWifiP2pTransferManager.a().i();
        String identify = uniteDevice.getIdentify();
        if (TextUtils.isEmpty(identify)) {
            return;
        }
        if (xiaVarI != null) {
            UniteDevice uniteDeviceA = xiaVarI.a();
            if (uniteDeviceA == null || identify.equalsIgnoreCase(uniteDeviceA.getIdentify())) {
                LogUtil.b("unite_HwCommonFileMgrProcess", "disconnect target device, close wifi.");
                xii.d().a();
                return;
            }
            return;
        }
        LogUtil.b("unite_HwCommonFileMgrProcess", "no wifi task, do nothing.");
    }

    public static void d(xhr xhrVar, ConcurrentHashMap<String, xhr> concurrentHashMap) {
        if (xhrVar == null || concurrentHashMap == null) {
            LogUtil.b("unite_HwCommonFileMgrProcess", "adapterFileId param is wrong.");
            return;
        }
        String strN = xhrVar.n();
        int iY = xhrVar.y();
        for (Map.Entry<String, xhr> entry : concurrentHashMap.entrySet()) {
            if (TextUtils.equals(entry.getValue().n(), strN) && entry.getValue().y() == iY) {
                int iM = entry.getValue().m();
                LogUtil.b("unite_HwCommonFileMgrProcess", "stopTransferFile fileName :", entry.getValue().n(), "fileId : ", Integer.valueOf(iM));
                xhrVar.a(iM);
                return;
            }
        }
    }

    public xhs c(int i, long j, int i2, List<Integer> list, DeviceInfo deviceInfo) {
        xhs xhsVar = new xhs();
        xhsVar.a(i);
        xhsVar.a(j);
        xhsVar.c(i2);
        xhsVar.b(list);
        xhsVar.b(deviceInfo);
        return xhsVar;
    }

    public void d(xhr xhrVar, xhr xhrVar2) {
        if (xhrVar == null || xhrVar2 == null) {
            LogUtil.e("unite_HwCommonFileMgrProcess", "5.40.2 param is null.");
            return;
        }
        xhrVar.e(xhrVar2.z());
        xhrVar.i(xhrVar2.ah());
        xhrVar.d(xhrVar2.t());
        xhrVar.a(xhrVar2.u());
        xhrVar.e(xhrVar2.l());
        xhrVar.g(xhrVar2.aq());
        xhrVar.b(xhrVar2.j());
        xhrVar.j(xhrVar2.ai());
        xhrVar.e(xhrVar2.g());
        xhrVar.h(xhrVar2.ab());
        LogUtil.b("unite_HwCommonFileMgrProcess", "commonFileInfo.name: ", xhrVar.n());
    }

    public boolean b(xhr xhrVar, int i) {
        if (i != 1021) {
            return false;
        }
        LogUtil.b("unite_HwCommonFileMgrProcess", "wifiSendBtClosed : ", Integer.valueOf(i));
        if (xhrVar == null) {
            return true;
        }
        lng.c("WifiP2PTransfer", "Close bluetooth during wifip2p file transfer.");
        a(xhrVar.l(), 141001, "");
        return true;
    }

    public void a(IResultAIDLCallback iResultAIDLCallback, int i, String str) {
        LogUtil.b("unite_HwCommonFileMgrProcess", "reportUiFail code : ", Integer.valueOf(i), " errorMessage : ", str);
        if (iResultAIDLCallback != null) {
            try {
                iResultAIDLCallback.onTransferFailed(i, "");
                return;
            } catch (Exception e) {
                LogUtil.d("unite_HwCommonFileMgrProcess", "reportUiFail Exception", cpc.c(e));
                return;
            }
        }
        LogUtil.b("unite_HwCommonFileMgrProcess", "no callback");
    }

    public boolean c(boolean z, xhr xhrVar, xhj xhjVar) {
        if (z) {
            return true;
        }
        xhr xhrVarB = TransferFileQueueManager.b().b("wifi_change_bt");
        if (xhrVarB == null || xhrVarB.am() == 1) {
            a(xhrVarB);
            TransferFileQueueManager.b().e("wifi_change_bt");
            return false;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f52997a = countDownLatch;
        try {
            a();
            if (countDownLatch.await(7L, TimeUnit.SECONDS) && xhrVar != null && xhjVar != null) {
                this.f52997a = null;
                if (xhrVar.h() == null || xhrVar.h().getDeviceInfo() == null) {
                    LogUtil.b("unite_HwCommonFileMgrProcess", "param has null, please check.");
                } else {
                    LogUtil.b("unite_HwCommonFileMgrProcess", "wifi change bt, but user stop transfer.");
                    TransferFileQueueManager.b().i("isWaitWatchSuccess");
                    xhjVar.c(100000, xhrVar.h().getDeviceInfo(), xhrVar);
                }
                return false;
            }
            countDownLatch.countDown();
            this.f52997a = null;
            return true;
        } catch (InterruptedException unused) {
            LogUtil.d("unite_HwCommonFileMgrProcess", "setCancelDownloadFlagDelay InterruptedException");
        }
    }

    private void a() {
        ThreadPoolManager threadPoolManagerD = ThreadPoolManager.d(1, 1);
        threadPoolManagerD.execute(new Runnable() { // from class: xhm
            @Override // java.lang.Runnable
            public final void run() {
                this.f52995a.d();
            }
        });
        threadPoolManagerD.shutdown();
    }

    /* synthetic */ void d() {
        while (this.f52997a != null) {
            xhj.c().e("bluetooth");
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException unused) {
                LogUtil.d("unite_HwCommonFileMgrProcess", "post wait task exception.");
            }
        }
        LogUtil.b("unite_HwCommonFileMgrProcess", "report wifi change bt 0 process finish.");
    }

    private void a(xhr xhrVar) {
        if (xhrVar == null || xhrVar.b() == null) {
            return;
        }
        try {
            if (xhrVar.y() == 1) {
                xhrVar.b().onResponse(20003, String.valueOf(xhrVar.n()));
                LogUtil.b("unite_HwCommonFileMgrProcess", "entry  watchType callback , fileName: ", xhrVar.n());
            } else {
                xhrVar.b().onResponse(20003, "");
            }
        } catch (Exception e) {
            LogUtil.d("unite_HwCommonFileMgrProcess", "reportCancel Exception", cpc.c(e));
        }
    }

    public void c() {
        CountDownLatch countDownLatch = this.f52997a;
        if (countDownLatch != null) {
            LogUtil.b("unite_HwCommonFileMgrProcess", "wifi change to bt, stop change.");
            countDownLatch.countDown();
        } else {
            LogUtil.b("unite_HwCommonFileMgrProcess", "normal stop.");
        }
    }

    protected boolean d(xhr xhrVar) {
        Collection<UniteDevice> collectionValues = cju.d().getDeviceList().values();
        if (collectionValues.isEmpty()) {
            LogUtil.b("unite_HwCommonFileMgrProcess", "isTargetDeviceConnected try get device wrong, please check.");
            return false;
        }
        UniteDevice uniteDeviceH = xhrVar.h();
        if (uniteDeviceH == null) {
            LogUtil.b("unite_HwCommonFileMgrProcess", "isTargetDeviceConnected target device is wrong.");
            return false;
        }
        String identify = uniteDeviceH.getIdentify();
        if (TextUtils.isEmpty(identify)) {
            LogUtil.b("unite_HwCommonFileMgrProcess", "isTargetDeviceConnected target device identify is wrong.");
            return false;
        }
        LogUtil.b("unite_HwCommonFileMgrProcess", "isTargetDeviceConnected values size : ", Integer.valueOf(collectionValues.size()));
        for (UniteDevice uniteDevice : collectionValues) {
            if (identify.equalsIgnoreCase(uniteDevice.getIdentify())) {
                if (uniteDevice.getDeviceInfo().getDeviceConnectState() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public void e(Message message, ConcurrentHashMap<String, xhr> concurrentHashMap) {
        if (message == null || concurrentHashMap == null) {
            return;
        }
        LogUtil.b("unite_HwCommonFileMgrProcess", "5.54.7 timeout, close wifi.");
        lng.c("WifiP2PTransfer", "Device replies 5.54.7 reach timeout");
        int i = message.arg1;
        xhr xhrVar = concurrentHashMap.get(String.valueOf(i));
        if (xhrVar != null) {
            LogUtil.b("unite_HwCommonFileMgrProcess", "7 timeout, switch bt, send file.");
            xhj.c().e(1030, "7 timeout", xhrVar, i);
        } else {
            xhj.c().e(0, i);
            HwWifiP2pTransferManager.a().c();
            xie.b(1);
        }
    }

    public void c(DeviceInfo deviceInfo, byte[] bArr) {
        if (deviceInfo == null) {
            LogUtil.e("unite_HwCommonFileMgrProcess", "dealHash device is null.");
            return;
        }
        if (bArr == null || bArr.length < 2) {
            return;
        }
        cpl.d("unite_HwCommonFileMgrProcess", bArr, "5.40.3 handleRequestHash :");
        try {
            cql.c cVarA = new cql().a(bArr, 2);
            xhj.c().c(cVarA.d((byte) 1, 0), cVarA.d((byte) 2, 0), deviceInfo, cVarA.d((byte) 4, 0L));
        } catch (cpy unused) {
            LogUtil.d("unite_HwCommonFileMgrProcess", "handleRequestHash TlvException");
        }
    }
}
