package com.xiaomi.hm.health.devicex.proxy.other;

import android.text.TextUtils;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.mifit.analytics.Analytics;
import com.huami.tools.log.HMLog;
import com.loopj.android.http.FileAsyncHttpResponseHandler;
import com.loopj.android.http.SyncHttpClient;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.FwDwonSuccessInfo;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.device.firmware.FwDownloaderApi;
import com.xiaomi.hm.health.device.fw_upgrade.FwDaoManager;
import com.xiaomi.hm.health.device.fw_upgrade.Md5FileUtils;
import com.xiaomi.hm.health.device.fw_upgrade.NetFwUpgradeManager;
import com.xiaomi.hm.health.eventbus.EventFwCheckResult;
import com.xiaomi.hm.health.model.fw_upgrade.ItemFwResponse;
import de.greenrobot.event.EventBus;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import org.apache.http.Header;

/* JADX INFO: loaded from: classes21.dex */
public class FwDownloader extends FileAsyncHttpResponseHandler implements FwDownloaderApi {
    private static final String e = "FwUpgrade-FwDownloader";
    private static final boolean f = true;
    private static final boolean g = false;
    private static final String h = "fileInfo.json";
    private static final String i = "/mili_fw/";
    private static final String j = ".zip";
    private String a;
    private String b;
    private String c;
    private ItemFwResponse d;

    public FwDownloader(final ItemFwResponse item, String downloadTempPath, String downloadSuccessPath) {
        super(new File(downloadTempPath));
        this.a = item.getFile_url();
        this.b = downloadSuccessPath;
        this.c = item.getMd5_content();
        this.d = item;
    }

    private void a(boolean result, ItemFwResponse item) {
        if (item == null) {
            return;
        }
        Analytics.event(DeviceXFunctionsKt.getContext(), result ? StatEvent.FW_DOWNLOAD_SUCCESS : StatEvent.FW_DOWNLOAD_FAILED, String.valueOf(item.getSource()));
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:? A[SYNTHETIC] */
    private boolean b(String oldPath, String newPath) throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream = null;
        boolean z = false;
        try {
            try {
                if (new File(oldPath).exists()) {
                    FileInputStream fileInputStream2 = new FileInputStream(oldPath);
                    try {
                        fileOutputStream = new FileOutputStream(newPath);
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int i2 = fileInputStream2.read(bArr);
                                if (i2 == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, i2);
                            }
                            z = true;
                            fileInputStream = fileInputStream2;
                        } catch (Exception e2) {
                            e = e2;
                            fileInputStream = fileInputStream2;
                            try {
                                HMLog.i(e, "复制单个文件操作出错", new Object[0]);
                                e.printStackTrace();
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException e3) {
                                        e3.printStackTrace();
                                    }
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.flush();
                                    fileOutputStream.close();
                                }
                                return z;
                            } catch (Throwable th) {
                                th = th;
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException e4) {
                                        e4.printStackTrace();
                                    }
                                }
                                if (fileOutputStream != null) {
                                    throw th;
                                }
                                try {
                                    fileOutputStream.flush();
                                    fileOutputStream.close();
                                    throw th;
                                } catch (IOException e5) {
                                    e5.printStackTrace();
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            if (fileOutputStream != null) {
                                throw th;
                            }
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            throw th;
                        }
                    } catch (Exception e6) {
                        e = e6;
                        fileOutputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream = null;
                    }
                } else {
                    fileOutputStream = null;
                }
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e7) {
                        e7.printStackTrace();
                    }
                }
                if (fileOutputStream != null) {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                }
            } catch (IOException e8) {
                e8.printStackTrace();
            }
        } catch (Exception e9) {
            e = e9;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
        return z;
    }

    private void c(ItemFwResponse item, File file) {
        try {
            String fileMD5String = Md5FileUtils.getFileMD5String(file);
            HMLog.i(e, "localMd5 : " + fileMD5String + " , serverMd5 = " + this.c, new Object[0]);
            if (!this.c.equalsIgnoreCase(fileMD5String)) {
                HMLog.i(e, "md5 is different , delete !", new Object[0]);
                if (file.exists()) {
                    HMLog.d(e, "isDelete = " + file.delete(), new Object[0]);
                }
                a(false, item);
                return;
            }
            HMLog.i(e, "md5 is same !", new Object[0]);
            String[] strArrSplit = file.getPath().split("\\/");
            String str = strArrSplit[strArrSplit.length - 1];
            if (!b(file.getPath(), this.b)) {
                HMLog.i(e, "save to fw_download_success failure!", new Object[0]);
                return;
            }
            HMLog.i(e, "save fw_download_success success , delete temp_ file = " + file.delete(), new Object[0]);
            HMLog.i(e, "downloadSuccessPath = " + this.b, new Object[0]);
            if (this.b.contains(".zip")) {
                unFwZipFile(item, this.b, NetFwUpgradeManager.getSdcardPathByType(2) + i);
            } else {
                FwDwonSuccessInfo fwDwonSuccessInfo = new FwDwonSuccessInfo();
                fwDwonSuccessInfo.setSource(item.getSource());
                fwDwonSuccessInfo.setServerAppVersion(Integer.valueOf(item.getApp_version()).intValue());
                fwDwonSuccessInfo.setLocalFwVersion(item.getFirmware_version());
                fwDwonSuccessInfo.setLocalFwVersionCode(item.getFirmware_version_code());
                fwDwonSuccessInfo.setLocalFwHrVersion(item.getHr_version());
                fwDwonSuccessInfo.setLocalFwHrVersionCode(item.getHr_version_code());
                fwDwonSuccessInfo.setLocalMd5Content(item.getMd5_content());
                fwDwonSuccessInfo.setFwName(str);
                fwDwonSuccessInfo.setFwPath(this.b);
                if (!TextUtils.isEmpty(item.getProductVersion())) {
                    fwDwonSuccessInfo.setProductVersion(Integer.valueOf(Integer.parseInt(item.getProductVersion())));
                }
                fwDwonSuccessInfo.setForceUpgrade(Boolean.valueOf(item.getSingleFileInfo().upgrade == 2));
                HMLog.i(e, "only one fw result = " + FwDaoManager.getManager().addInfo(fwDwonSuccessInfo), new Object[0]);
                EventBus.getDefault().post(new EventFwCheckResult(true));
            }
            a(true, item);
        } catch (Exception e2) {
            e2.printStackTrace();
            HMLog.i(e, "e" + e2.getMessage(), new Object[0]);
            a(false, item);
        }
    }

    @Override // com.xiaomi.hm.health.device.firmware.FwDownloaderApi
    public void download() {
        HMLog.i(e, "start to downlaod, sdcardUrl = " + this.a, new Object[0]);
        new SyncHttpClient().get(this.a, this);
    }

    @Override // com.loopj.android.http.FileAsyncHttpResponseHandler
    public void onFailure(int statusCode, Header[] headers, Throwable throwable, File file) {
        HMLog.i(e, "---onFailure file = " + file, new Object[0]);
        a(false, this.d);
    }

    @Override // com.loopj.android.http.FileAsyncHttpResponseHandler
    public void onSuccess(int statusCode, Header[] headers, File file) {
        HMLog.i(e, "---onSuccess file = " + file, new Object[0]);
        c(this.d, file);
    }

    public void unFwZipFile(ItemFwResponse item, String file, String decompressDir) throws Exception {
        File file2 = new File(decompressDir);
        if (!file2.exists()) {
            file2.mkdir();
        }
        ZipFile zipFile = new ZipFile(file);
        ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(file)));
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry == null) {
                break;
            }
            if (!nextEntry.isDirectory()) {
                HMLog.d(e, "unzip " + decompressDir + nextEntry.getName(), new Object[0]);
                StringBuilder sb = new StringBuilder();
                sb.append(decompressDir);
                sb.append(nextEntry.getName());
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(sb.toString()));
                BufferedInputStream bufferedInputStream = new BufferedInputStream(zipFile.getInputStream(nextEntry));
                byte[] bArr = new byte[1024];
                for (int i2 = bufferedInputStream.read(bArr); i2 != -1; i2 = bufferedInputStream.read(bArr)) {
                    bufferedOutputStream.write(bArr, 0, i2);
                }
                bufferedOutputStream.close();
            }
        }
        zipInputStream.closeEntry();
        FwDwonSuccessInfo fwDwonSuccessInfo = new FwDwonSuccessInfo();
        fwDwonSuccessInfo.setSource(item.getSource());
        fwDwonSuccessInfo.setServerAppVersion(Integer.valueOf(item.getApp_version()).intValue());
        if (!TextUtils.isEmpty(item.getProductVersion())) {
            fwDwonSuccessInfo.setProductVersion(Integer.valueOf(Integer.parseInt(item.getProductVersion())));
        }
        fwDwonSuccessInfo.setLocalFwVersionCode(item.getFirmware_version_code());
        fwDwonSuccessInfo.setLocalFwVersion(item.getFirmware_version());
        if (item.getFileInfo().additionalInfo == null) {
            HMLog.e(e, "error json return", new Object[0]);
            return;
        }
        if (item.getFileInfo().additionalInfo.firmware != null) {
            fwDwonSuccessInfo.setFwName(item.getFileInfo().additionalInfo.firmware.name);
            fwDwonSuccessInfo.setFwPath(decompressDir + item.getFileInfo().additionalInfo.firmware.name);
            fwDwonSuccessInfo.setLocalMd5Content(item.getFileInfo().additionalInfo.firmware.md5);
            fwDwonSuccessInfo.setForceUpgrade(Boolean.valueOf(item.getFileInfo().additionalInfo.firmware.upgrade == 2));
        }
        if (item.getFileInfo().additionalInfo.resource != null && !TextUtils.isEmpty(item.getFileInfo().additionalInfo.resource.version)) {
            fwDwonSuccessInfo.setResource(item.getFileInfo().additionalInfo.resource.name);
            fwDwonSuccessInfo.setResourceVersionCode(Integer.valueOf(Integer.parseInt(item.getFileInfo().additionalInfo.resource.version)));
            fwDwonSuccessInfo.setResourceName(item.getFileInfo().additionalInfo.resource.name);
            fwDwonSuccessInfo.setResourcePath(decompressDir + item.getFileInfo().additionalInfo.resource.name);
        }
        if (item.getFileInfo().additionalInfo.gps != null && !TextUtils.isEmpty(item.getFileInfo().additionalInfo.gps.version)) {
            fwDwonSuccessInfo.setGps(item.getFileInfo().additionalInfo.gps.name);
            fwDwonSuccessInfo.setGpsVersionCode(item.getFileInfo().additionalInfo.gps.version);
            fwDwonSuccessInfo.setGpsName(item.getFileInfo().additionalInfo.gps.name);
            fwDwonSuccessInfo.setGpsPath(decompressDir + item.getFileInfo().additionalInfo.gps.name);
        }
        if (item.getFileInfo().additionalInfo.font != null && !TextUtils.isEmpty(item.getFileInfo().additionalInfo.font.version)) {
            fwDwonSuccessInfo.setFont(item.getFileInfo().additionalInfo.font.name);
            fwDwonSuccessInfo.setFontVersionCode(Integer.valueOf(Integer.parseInt(item.getFileInfo().additionalInfo.font.version)));
            fwDwonSuccessInfo.setFontName(item.getFileInfo().additionalInfo.font.name);
            fwDwonSuccessInfo.setFontPath(decompressDir + item.getFileInfo().additionalInfo.font.name);
        }
        HMLog.i(e, "insert id = " + HMDaoManager.getInstance().getFwDwonSuccessInfoDao().insertOrReplace(fwDwonSuccessInfo), new Object[0]);
        EventBus.getDefault().post(new EventFwCheckResult(true));
    }
}
