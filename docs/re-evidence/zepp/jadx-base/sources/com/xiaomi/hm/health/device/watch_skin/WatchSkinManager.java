package com.xiaomi.hm.health.device.watch_skin;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Xml;
import androidx.appcompat.app.AppCompatActivity;
import com.google.gson.Gson;
import com.huami.devicex.R;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.log.HMLog;
import com.huami.web.service.WebItem;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.device.watch_skin.WatchSkinManager;
import com.xiaomi.hm.health.device.watchskinstore.WatchSkinHelper;
import com.xiaomi.hm.health.discovery.WebHelper;
import com.xiaomi.hm.health.imageload.HMImageLoader;
import com.xiaomi.hm.health.imageload.HMLoadTarget;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Objects;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.xml.parsers.DocumentBuilderFactory;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;
import org.w3c.dom.Element;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes19.dex */
public class WatchSkinManager {
    public static final String WATCH_SKIN_DIAL_BIN_NAME = "ret.bin";
    public static final String WATCH_SKIN_DIAL_NAME = "dial_bg.png";
    public static final String WATCH_SKIN_DIAL_PARENT_FILE_NAME = "custom_dial";
    public static final String WATCH_SKIN_TEMP_DIAL_NAME = "dial_bg_temp.png";
    public static final String WATCH_SKIN_TRANS_NAME = "trans_bg.png";
    private static final String a = "WatchSkinManager";
    private static final int b = 1024;
    private static final String c = "watch_skin_local";
    private static final String d = "watch_skin_diy";
    private static final String e = ".dial";
    private static final String f = "infos.xml";
    private static final Lazy<DeviceManagerApi> g = KoinJavaComponent.inject(DeviceManagerApi.class);
    private static final Lazy<DeviceXNavigator> h = KoinJavaComponent.inject(DeviceXNavigator.class);
    private static final int i = 16;
    private static final int j = 17;
    private static final byte k = 15;
    private static final byte l = 0;
    private static final byte m = 16;
    private static final byte n = 0;
    private static final byte o = 36;
    private static final byte p = 0;
    private static final String q = ".bin";
    private static final String r = ".BIN";
    private static final String s = ".png";
    private static final String t = ".PNG";
    private static final String u = ".jpg";
    private static final String v = ".JPG";
    private static final String w = ".gif";
    private static final String x = ".GIF";
    private static final int y = -1;
    private static final String z = "info";

    public class a extends HMLoadTarget<File> {
        public final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFailed(Exception exc) {
            super.onLoadFailed(exc);
            HMLog.i(WatchSkinManager.a, " saveThumbnail:onLoadFailed: " + exc.getMessage(), new Object[0]);
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFinish(File file) throws Throwable {
            HMLog.i(WatchSkinManager.a, "copy thumbnail: " + WatchSkinManager.c(file, new File(this.a)), new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:47:0x0099 A[Catch: Exception -> 0x0095, TRY_LEAVE, TryCatch #6 {Exception -> 0x0095, blocks: (B:43:0x0091, B:47:0x0099), top: B:67:0x0091 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac A[Catch: Exception -> 0x00a8, TRY_LEAVE, TryCatch #3 {Exception -> 0x00a8, blocks: (B:53:0x00a4, B:57:0x00ac), top: B:63:0x00a4 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static boolean c(File file, File file2) throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream = null;
        try {
            if (!file2.exists()) {
                File parentFile = file2.getParentFile();
                Objects.requireNonNull(parentFile);
                if (!parentFile.exists() && !file2.getParentFile().mkdir()) {
                    HMLog.i(a, "makeDir fail.", new Object[0]);
                    return false;
                }
                if (!file2.createNewFile()) {
                    HMLog.i(a, "createNewFile fail.", new Object[0]);
                    return false;
                }
            }
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i2 = fileInputStream2.read(bArr);
                        if (i2 <= 0) {
                            try {
                                fileInputStream2.close();
                                fileOutputStream2.close();
                                return true;
                            } catch (Exception e2) {
                                e2.printStackTrace();
                                return true;
                            }
                        }
                        fileOutputStream2.write(bArr, 0, i2);
                    }
                } catch (Exception e3) {
                    fileInputStream = fileInputStream2;
                    fileOutputStream = fileOutputStream2;
                    e = e3;
                    try {
                        HMLog.i(a, "exception: " + e.getMessage(), new Object[0]);
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                            } catch (Exception e4) {
                                e4.printStackTrace();
                                return false;
                            }
                        } else if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                            } catch (Exception e5) {
                                e5.printStackTrace();
                                throw th;
                            }
                        } else if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    fileInputStream = fileInputStream2;
                    fileOutputStream = fileOutputStream2;
                    th = th2;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                    } else if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    throw th;
                }
            } catch (Exception e6) {
                e = e6;
                fileOutputStream = null;
                fileInputStream = fileInputStream2;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
                fileInputStream = fileInputStream2;
            }
        } catch (Exception e7) {
            e = e7;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    private static void d(File file) {
        try {
            if (file.isFile()) {
                file.delete();
                return;
            }
            if (file.isDirectory()) {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                    for (File file2 : fileArrListFiles) {
                        d(file2);
                    }
                    file.delete();
                    return;
                }
                file.delete();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void delete(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            d(file);
        }
    }

    private static HMDeviceSource e(File file) throws Throwable {
        HMDeviceSource hMDeviceSource;
        HMDeviceSource hMDeviceSource2 = HMDeviceSource.VDEVICE;
        FileInputStream fileInputStream = null;
        try {
            try {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        byte[] bArr = new byte[18];
                        if (fileInputStream2.read(bArr, 0, 18) != -1) {
                            HMLog.d(a, "bytes: " + GattUtils.bytesToHexString(bArr), new Object[0]);
                        }
                        if (bArr[16] == 15 && bArr[17] == 0) {
                            hMDeviceSource = HMDeviceSource.MILI_PEYTO;
                        } else {
                            if (bArr[16] != 16 || bArr[17] != 0) {
                                if (bArr[16] == 36 && bArr[17] == 0) {
                                    hMDeviceSource = HMDeviceSource.MILI_CINCO;
                                }
                                fileInputStream2.close();
                                fileInputStream2.close();
                                HMLog.i(a, "getBinFileType:" + hMDeviceSource2, new Object[0]);
                                return hMDeviceSource2;
                            }
                            hMDeviceSource = HMDeviceSource.MILI_TEMPO;
                        }
                        hMDeviceSource2 = hMDeviceSource;
                        fileInputStream2.close();
                        fileInputStream2.close();
                    } catch (Exception e2) {
                        e = e2;
                        fileInputStream = fileInputStream2;
                        e.printStackTrace();
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        HMLog.i(a, "getBinFileType:" + hMDeviceSource2, new Object[0]);
                        return hMDeviceSource2;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception e3) {
                                e3.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (Exception e4) {
                    e = e4;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        HMLog.i(a, "getBinFileType:" + hMDeviceSource2, new Object[0]);
        return hMDeviceSource2;
    }

    public static HMDeviceSource f() {
        HMDeviceSource boundDeviceSource = g.getValue().getBoundDeviceSource(HMDeviceType.MILI);
        if (boundDeviceSource == HMDeviceSource.MILI_PEYTO) {
            return boundDeviceSource;
        }
        HMDeviceSource hMDeviceSource = HMDeviceSource.MILI_TEMPO;
        return (boundDeviceSource == hMDeviceSource || boundDeviceSource == HMDeviceSource.MILI_BEATS || boundDeviceSource == HMDeviceSource.MILI_BEATS_P || boundDeviceSource == (hMDeviceSource = HMDeviceSource.MILI_CINCO) || boundDeviceSource == HMDeviceSource.MILI_CINCO_L) ? hMDeviceSource : HMDeviceSource.VDEVICE;
    }

    private static String g(File file) {
        if (file.exists() && file.isFile()) {
            byte[] bArr = new byte[1024];
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                FileInputStream fileInputStream = new FileInputStream(file);
                while (true) {
                    int i2 = fileInputStream.read(bArr, 0, 1024);
                    if (i2 == -1) {
                        fileInputStream.close();
                        return new BigInteger(1, messageDigest.digest()).toString(16);
                    }
                    messageDigest.update(bArr, 0, i2);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public static String getDialBinPath(Context context) {
        String path = FileUtils.getAppFileDir(context).getPath();
        StringBuilder sb = new StringBuilder();
        sb.append(path);
        String str = File.separator;
        sb.append(str);
        sb.append(WATCH_SKIN_DIAL_PARENT_FILE_NAME);
        sb.append(str);
        sb.append(WATCH_SKIN_DIAL_BIN_NAME);
        return sb.toString();
    }

    public static String getDownloadPath(Context context, String str, boolean z2) {
        String strValueOf;
        String string = FileUtils.getAppFileDir(context, z2 ? d : c).toString();
        try {
            String[] strArrSplit = str.split(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
            strValueOf = strArrSplit[strArrSplit.length - 1].split("\\.")[0];
        } catch (Exception unused) {
            strValueOf = String.valueOf(System.currentTimeMillis());
        }
        HMLog.d(a, "binName: " + strValueOf, new Object[0]);
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        String str2 = File.separator;
        sb.append(str2);
        sb.append(strValueOf);
        sb.append(str2);
        sb.append(strValueOf);
        sb.append(q);
        return sb.toString();
    }

    public static String getWatchSkinPath(Intent intent) {
        Uri data;
        if (intent == null || (data = intent.getData()) == null) {
            return null;
        }
        String path = data.getPath();
        if (!TextUtils.isEmpty(path) && new File(path).exists()) {
            return path;
        }
        return null;
    }

    private static String[] h(String str) {
        String[] strArr = new String[2];
        try {
            File file = new File(str + File.separator + f);
            if (!file.exists()) {
                return null;
            }
            Element documentElement = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new FileInputStream(file)).getDocumentElement();
            strArr[0] = ((Element) documentElement.getElementsByTagName("name").item(0)).getFirstChild().getNodeValue();
            strArr[1] = ((Element) documentElement.getElementsByTagName("time_stamp").item(0)).getFirstChild().getNodeValue();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return strArr;
    }

    public static LocalWatchSkinEntity handleWatchSkinFile(AppCompatActivity appCompatActivity, String str) throws Throwable {
        LocalWatchSkinEntity localWatchSkinEntityContains;
        try {
            HMLog.i(a, "watch skin file path: " + str, new Object[0]);
            File file = new File(str);
            if (!file.exists()) {
                HMLog.i(a, "file don't exist.", new Object[0]);
                return null;
            }
            if (!file.getPath().endsWith(e)) {
                HMLog.i(a, "suffix mismatch.", new Object[0]);
                return null;
            }
            String str2 = file.getName().split("\\.")[0];
            if (TextUtils.isEmpty(str2)) {
                str2 = "default";
            }
            List<LocalWatchSkinEntity> listTraverseAllWatchSkin = traverseAllWatchSkin(appCompatActivity, false);
            StringBuilder sb = new StringBuilder();
            sb.append(FileUtils.getAppFileDir(appCompatActivity, c).toString());
            String str3 = File.separator;
            sb.append(str3);
            sb.append(System.currentTimeMillis());
            sb.append(str3);
            String string = sb.toString();
            boolean zP = p(file, string);
            HMLog.i(a, "unZipResult: " + zP, new Object[0]);
            if (!zP) {
                HMLog.i(a, "unZip error.", new Object[0]);
                delete(string);
                return null;
            }
            File file2 = new File(string);
            if (!file2.exists()) {
                HMLog.i(a, "folder not exist.", new Object[0]);
                return null;
            }
            File[] fileArrListFiles = file2.listFiles();
            Objects.requireNonNull(fileArrListFiles);
            File file3 = null;
            File file4 = null;
            for (File file5 : fileArrListFiles) {
                if (k(file5.getPath())) {
                    file3 = file5;
                }
                if (l(file5.getPath())) {
                    file4 = file5;
                }
            }
            if (file3 == null) {
                HMLog.i(a, "binFile not exist.", new Object[0]);
                return null;
            }
            HMDeviceSource hMDeviceSourceE = e(file3);
            HMLog.i(a, "file deviceSource: " + hMDeviceSourceE, new Object[0]);
            HMDeviceSource hMDeviceSourceF = f();
            HMLog.i(a, "currDeviceSource: " + hMDeviceSourceF, new Object[0]);
            String strG = g(file3);
            if (listTraverseAllWatchSkin == null || (localWatchSkinEntityContains = LocalWatchSkinEntity.contains(listTraverseAllWatchSkin, strG)) == null) {
                saveInfo2Xml(string, str2);
                if (hMDeviceSourceF == hMDeviceSourceE) {
                    return new LocalWatchSkinEntity(str2, file3.toString(), file4 == null ? null : file4.toString());
                }
                return null;
            }
            HMLog.i(a, "file exist, delete.", new Object[0]);
            delete(string);
            if (hMDeviceSourceF == hMDeviceSourceE) {
                return localWatchSkinEntityContains;
            }
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            HMLog.i(a, "move file exception: " + e2.getMessage(), new Object[0]);
        }
    }

    private static LocalWatchSkinEntity i(String str) {
        LocalWatchSkinEntity localWatchSkinEntity = null;
        try {
            File file = new File(str + File.separator + f);
            if (!file.exists()) {
                HMLog.i(a, "getLocalInfoFromXml file is Not Exists!!!", new Object[0]);
                return null;
            }
            Element documentElement = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new FileInputStream(file)).getDocumentElement();
            Element element = (Element) documentElement.getElementsByTagName("info").item(0);
            if (element != null) {
                String nodeValue = element.getFirstChild().getNodeValue();
                if (!TextUtils.isEmpty(nodeValue)) {
                    return (LocalWatchSkinEntity) new Gson().fromJson(nodeValue, LocalWatchSkinEntity.class);
                }
            }
            LocalWatchSkinEntity localWatchSkinEntity2 = new LocalWatchSkinEntity();
            try {
                localWatchSkinEntity2.name = ((Element) documentElement.getElementsByTagName("name").item(0)).getFirstChild().getNodeValue();
                try {
                    localWatchSkinEntity2.createTime = Long.parseLong(((Element) documentElement.getElementsByTagName("time_stamp").item(0)).getFirstChild().getNodeValue());
                } catch (Exception unused) {
                    localWatchSkinEntity2.createTime = 0L;
                }
                return localWatchSkinEntity2;
            } catch (Exception e2) {
                e = e2;
                localWatchSkinEntity = localWatchSkinEntity2;
                e.printStackTrace();
                HMLog.i(a, "getLocalInfoFromXml file Exception!!!", new Object[0]);
                return localWatchSkinEntity;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public static void j(AppCompatActivity appCompatActivity, String str) throws Throwable {
        LocalWatchSkinEntity localWatchSkinEntityHandleWatchSkinFile = handleWatchSkinFile(appCompatActivity, str);
        if (localWatchSkinEntityHandleWatchSkinFile == null) {
            HMLog.i(a, "handleOpenWatchSkinFile file is empty!!!", new Object[0]);
        }
        n(appCompatActivity, localWatchSkinEntityHandleWatchSkinFile);
    }

    public static void jumpToWatchSkinPage(Context context, HMDeviceSource hMDeviceSource) {
        if (ConfigHelperKt.hasFeature(Feature.CINCO_SERIES_S, hMDeviceSource)) {
            if (hMDeviceSource != HMDeviceSource.MILI_CINCO && hMDeviceSource != HMDeviceSource.MILI_CINCO_L) {
                h.getValue().startHMDialListActivity(context);
                return;
            } else {
                h.getValue().startWatchSkinStoreActivity(context, 0);
                WatchSkinHelper.analyticCount("WF_Manage_ClickNum", hMDeviceSource.getValue());
                return;
            }
        }
        if (HMDeviceConfig.isSupportNewWatchStore()) {
            WatchSkinHelper.analyticCount("WF_Store_ClickNum", hMDeviceSource.getValue());
            h.getValue().startWatchFacesStoreActivity(context);
            return;
        }
        if (ConfigHelperKt.hasFeature(Feature.SUPPORT_NATIVE_DIAL, hMDeviceSource)) {
            h.getValue().startHMDialListActivity(context);
            return;
        }
        if (hMDeviceSource == HMDeviceSource.MILI_PEYTO) {
            h.getValue().startWatchSkinListActivity(context);
            return;
        }
        WebItem webItem = new WebItem();
        String watchfaceUrl = WatchSkinUtils.getWatchfaceUrl(hMDeviceSource);
        webItem.url = watchfaceUrl;
        if (TextUtils.isEmpty(watchfaceUrl)) {
            return;
        }
        webItem.isShowMore = false;
        webItem.isUseCache = false;
        webItem.isRefresh = true;
        WebHelper.launch(webItem);
    }

    private static boolean k(String str) {
        return str.endsWith(q) || str.endsWith(r);
    }

    private static boolean l(String str) {
        return str.endsWith(u) || str.endsWith(v) || str.endsWith(s) || str.endsWith(t) || str.endsWith(w) || str.endsWith(x);
    }

    public static LocalWatchSkinEntity loadWatchSkinFile(Context context, String str, boolean z2) {
        if (context != null && !TextUtils.isEmpty(str)) {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null && parentFile.exists() && file.exists()) {
                HMLog.i(a, "watchSkin path:" + str, new Object[0]);
                return o(parentFile, f(), z2);
            }
            HMLog.i(a, "loadWatchSkinFile file not exist.", new Object[0]);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m(WatchSkinInfo watchSkinInfo, LocalWatchSkinEntity localWatchSkinEntity, AppCompatActivity appCompatActivity, File file) {
        if (WatchSkinDetailDialog.SHOWING) {
            HMLog.i(a, "dialog showing.", new Object[0]);
            return;
        }
        WatchSkinDetailDialog.SHOWING = true;
        watchSkinInfo.name = localWatchSkinEntity.name;
        watchSkinInfo.skinSize = appCompatActivity.getResources().getString(R.string.local_watch_size, Integer.valueOf((int) (file.length() / 1000.0f)));
        watchSkinInfo.thumbnails = new String[]{localWatchSkinEntity.thumbnailPath};
        watchSkinInfo.skinBin = localWatchSkinEntity.binPath;
        Bundle bundle = new Bundle();
        bundle.putParcelable(WatchSkinConstant.ARGS_SKIN_INFO, watchSkinInfo);
        bundle.putBoolean("from_local", true);
        WatchSkinDetailDialog watchSkinDetailDialog = new WatchSkinDetailDialog();
        watchSkinDetailDialog.setArguments(bundle);
        watchSkinDetailDialog.show(appCompatActivity.getSupportFragmentManager(), WatchSkinConstant.SKIN_FOLDER);
    }

    public static void n(final AppCompatActivity appCompatActivity, final LocalWatchSkinEntity localWatchSkinEntity) {
        final WatchSkinInfo watchSkinInfo = new WatchSkinInfo();
        final File file = new File(localWatchSkinEntity.binPath);
        if (file.exists()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: rk8
                @Override // java.lang.Runnable
                public final void run() {
                    WatchSkinManager.m(watchSkinInfo, localWatchSkinEntity, appCompatActivity, file);
                }
            });
        }
    }

    private static LocalWatchSkinEntity o(File file, HMDeviceSource hMDeviceSource, boolean z2) {
        boolean z3;
        LocalWatchSkinEntity localWatchSkinEntityI;
        if (file == null || !file.exists()) {
            return null;
        }
        File[] fileArrListFiles = file.listFiles();
        Objects.requireNonNull(fileArrListFiles);
        File[] fileArr = fileArrListFiles;
        int length = fileArr.length;
        int i2 = 0;
        boolean z4 = false;
        boolean z5 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        File file2 = null;
        while (true) {
            z3 = true;
            if (i2 >= length) {
                break;
            }
            File file3 = fileArr[i2];
            if (!file3.isDirectory()) {
                String path = file3.getPath();
                if (k(path)) {
                    z5 = hMDeviceSource == e(file3);
                    if (!z5) {
                        break;
                    }
                    file2 = file3;
                    str = path;
                    z4 = true;
                }
                if (l(path)) {
                    String[] strArrSplit = path.split(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
                    String str4 = strArrSplit[strArrSplit.length - 1];
                    if (WATCH_SKIN_TRANS_NAME.equals(str4)) {
                        str3 = path;
                    } else if (!WATCH_SKIN_DIAL_NAME.equals(str4)) {
                        str2 = path;
                    }
                }
            }
            i2++;
        }
        if (!z5 && z2) {
            z3 = false;
        }
        HMLog.i(a, "hasBin:" + z4 + ":match:" + z2 + "deviceSource:" + hMDeviceSource, new Object[0]);
        if (z4 && z3) {
            localWatchSkinEntityI = i(file.getPath());
            if (localWatchSkinEntityI != null) {
                localWatchSkinEntityI.md5 = g(file2);
            }
        } else {
            localWatchSkinEntityI = null;
        }
        if (localWatchSkinEntityI == null) {
            return localWatchSkinEntityI;
        }
        localWatchSkinEntityI.folderPath = file.getPath();
        localWatchSkinEntityI.binPath = str;
        localWatchSkinEntityI.thumbnailPath = str2;
        localWatchSkinEntityI.transBgPath = str3;
        HMLog.i(a, "transformLocalEntity:" + localWatchSkinEntityI, new Object[0]);
        return localWatchSkinEntityI;
    }

    private static boolean p(File file, String str) throws Throwable {
        ZipFile zipFile;
        FileOutputStream fileOutputStream;
        if (file != null) {
            InputStream inputStream = null;
            try {
                if (file.exists() && !TextUtils.isEmpty(str)) {
                    File file2 = new File(str);
                    if (!file2.exists() && !file2.mkdirs()) {
                        return false;
                    }
                    zipFile = new ZipFile(file);
                    try {
                        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                        fileOutputStream = null;
                        while (enumerationEntries.hasMoreElements()) {
                            try {
                                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                                String name = zipEntryNextElement.getName();
                                inputStream = zipFile.getInputStream(zipEntryNextElement);
                                String strReplaceAll = (str + name).replaceAll("\\*", FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
                                File file3 = new File(strReplaceAll.substring(0, strReplaceAll.lastIndexOf(47)));
                                if (file3.exists() || file3.mkdirs()) {
                                    if (!new File(strReplaceAll).isDirectory()) {
                                        FileOutputStream fileOutputStream2 = new FileOutputStream(strReplaceAll);
                                        try {
                                            byte[] bArr = new byte[1024];
                                            while (true) {
                                                int i2 = inputStream.read(bArr);
                                                if (i2 <= 0) {
                                                    break;
                                                }
                                                fileOutputStream2.write(bArr, 0, i2);
                                            }
                                            inputStream.close();
                                            fileOutputStream2.close();
                                            fileOutputStream = fileOutputStream2;
                                        } catch (Exception unused) {
                                            fileOutputStream = fileOutputStream2;
                                        } catch (Throwable th) {
                                            th = th;
                                            fileOutputStream = fileOutputStream2;
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (Exception e2) {
                                                    e2.printStackTrace();
                                                }
                                            }
                                            if (fileOutputStream != null) {
                                                try {
                                                    fileOutputStream.close();
                                                } catch (Exception e3) {
                                                    e3.printStackTrace();
                                                }
                                            }
                                            if (zipFile == null) {
                                                throw th;
                                            }
                                            try {
                                                zipFile.close();
                                                throw th;
                                            } catch (Exception e4) {
                                                e4.printStackTrace();
                                                throw th;
                                            }
                                        }
                                    }
                                }
                            } catch (Exception unused2) {
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        zipFile.close();
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Exception e5) {
                                e5.printStackTrace();
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Exception e6) {
                                e6.printStackTrace();
                            }
                        }
                        try {
                            zipFile.close();
                        } catch (Exception e7) {
                            e7.printStackTrace();
                        }
                        return true;
                    } catch (Exception unused3) {
                        fileOutputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream = null;
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception e8) {
                            e8.printStackTrace();
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception e9) {
                            e9.printStackTrace();
                        }
                    }
                    if (zipFile != null) {
                        try {
                            zipFile.close();
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                }
            } catch (Exception unused4) {
                zipFile = null;
                fileOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                zipFile = null;
                fileOutputStream = null;
            }
        }
        return false;
    }

    public static boolean saveInfo2Xml(String str, String str2) {
        return saveInfo2Xml(str, str2, -1);
    }

    public static void saveLocalThumbnail(String str, String str2, String str3) throws Throwable {
        String str4;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (TextUtils.isEmpty(str3)) {
            str4 = WATCH_SKIN_DIAL_NAME;
        } else {
            String[] strArrSplit = str3.split(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
            str4 = strArrSplit[strArrSplit.length - 1];
        }
        boolean zC = c(new File(str2), new File(str + File.separator + str4));
        StringBuilder sb = new StringBuilder();
        sb.append("copy saveLocalThumbnail: ");
        sb.append(zC);
        HMLog.i(a, sb.toString(), new Object[0]);
    }

    public static void saveThumbnail(Context context, String str, String str2) {
        saveThumbnail(context, str, str2, null);
    }

    public static List<LocalWatchSkinEntity> traverseAllWatchSkin(Context context, boolean z2) {
        LocalWatchSkinEntity localWatchSkinEntityO;
        HMDeviceSource hMDeviceSourceF = f();
        File file = new File(FileUtils.getAppFileDir(context, c).toString());
        if (!file.exists()) {
            HMLog.i(a, "watchSkin file not exist.", new Object[0]);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = file.listFiles();
        Objects.requireNonNull(fileArrListFiles);
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory() && (localWatchSkinEntityO = o(file2, hMDeviceSourceF, z2)) != null) {
                arrayList.add(localWatchSkinEntityO);
            }
        }
        Collections.sort(arrayList);
        HMLog.i(a, "All local WatchSkin:" + arrayList, new Object[0]);
        return arrayList;
    }

    public static boolean saveInfo2Xml(String str, String str2, int i2) {
        return saveInfo2Xml(str, str2, i2, 0, false);
    }

    public static final void saveThumbnail(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (TextUtils.isEmpty(str3)) {
            String[] strArrSplit = str2.split(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
            str3 = strArrSplit[strArrSplit.length - 1];
        }
        HMImageLoader.with(context).load(str2).asFile().into(new a(str + File.separator + str3));
    }

    public static boolean saveInfo2Xml(String str, String str2, int i2, boolean z2) {
        return saveInfo2Xml(str, str2, i2, 0, z2);
    }

    public static boolean saveInfo2Xml(String str, String str2, int i2, int i3, boolean z2) {
        return saveInfo2Xml(str, new LocalWatchSkinEntity(i2, str2, i3, z2));
    }

    public static boolean saveInfo2Xml(String str, LocalWatchSkinEntity localWatchSkinEntity) {
        if (localWatchSkinEntity == null) {
            return false;
        }
        try {
            File file = new File(str + File.separator + f);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
            xmlSerializerNewSerializer.setOutput(fileOutputStream, "utf-8");
            xmlSerializerNewSerializer.startDocument("utf-8", Boolean.TRUE);
            xmlSerializerNewSerializer.startTag(null, WatchSkinConstant.ARGS_SKIN_INFO);
            String json = new Gson().toJson(localWatchSkinEntity);
            xmlSerializerNewSerializer.startTag(null, "info");
            xmlSerializerNewSerializer.text(json);
            xmlSerializerNewSerializer.endTag(null, "info");
            xmlSerializerNewSerializer.endTag(null, WatchSkinConstant.ARGS_SKIN_INFO);
            xmlSerializerNewSerializer.endDocument();
            fileOutputStream.close();
            return true;
        } catch (Exception e2) {
            HMLog.i(a, "save2Xml exception: " + e2.getMessage(), new Object[0]);
            return false;
        }
    }
}
