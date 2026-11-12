package com.huawei.watchface.manager;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.huawei.featureuserprofile.route.navigationparser.NavigationFileParser;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.openalliance.ad.db.bean.ContentResource;
import com.huawei.secure.android.common.util.SafeString;
import com.huawei.watchface.api.HwWatchFaceBtManager;
import com.huawei.watchface.mvp.model.crypt.PversionSdUtils;
import com.huawei.watchface.mvp.model.datatype.KaleidoscopeStruct;
import com.huawei.watchface.mvp.model.datatype.TransferFileReqType;
import com.huawei.watchface.mvp.model.datatype.WatchFaceKaleidoscopeInfo;
import com.huawei.watchface.mvp.model.kaleidoscope.basic.KaleidoscopeDraw;
import com.huawei.watchface.mvp.model.latona.BackgroundOptionalConfig;
import com.huawei.watchface.mvp.model.latona.LatonaWatchFaceProvider;
import com.huawei.watchface.mvp.model.latona.LatonaWatchFaceThemeAlbumInfo;
import com.huawei.watchface.mvp.model.latona.provider.ElementsProvider;
import com.huawei.watchface.mvp.model.latona.provider.WatchFaceProvider;
import com.huawei.watchface.r2;
import com.huawei.watchface.utils.ArrayUtils;
import com.huawei.watchface.utils.FileHelper;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.IntegerUtils;
import com.huawei.watchface.utils.WatchFaceBitmapUtil;
import com.huawei.watchface.utils.callback.IBaseResponseCallback;
import com.huawei.watchface.utils.callback.OperateWatchFaceCallback;
import com.huawei.watchface.videoedit.utils.Utils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class WatchFaceKaleidoscopeManager extends BaseWatchFaceManager {
    public static final String u = "WatchFaceKaleidoscopeManager";
    public static final String[] v = {"res", "hwt", "parsing"};
    public static WatchFaceKaleidoscopeManager w;
    public ArrayList p;
    public ArrayList q;
    public ArrayList r;
    public List s;
    public final ArrayList t;

    public class a implements IBaseResponseCallback {
        public a() {
        }

        @Override // com.huawei.watchface.utils.callback.IBaseResponseCallback
        public void onResponse(int i, Object obj) {
            WatchFaceKaleidoscopeManager.this.q.clear();
            HwLog.i(WatchFaceKaleidoscopeManager.u, "getDeviceInfoByBt(): errorCode:" + i);
            WatchFaceKaleidoscopeManager.this.b(i, obj);
        }
    }

    public WatchFaceKaleidoscopeManager(Context context) {
        super(context, WatchFaceConstant.ROOT_PATH_KALEIDOSCOPE, true);
        this.p = new ArrayList(32);
        this.q = new ArrayList(32);
        this.r = new ArrayList(32);
        this.s = new ArrayList(32);
        this.t = new ArrayList(20);
    }

    public static WatchFaceKaleidoscopeManager getInstance(Context context) {
        if (w == null) {
            synchronized (WatchFaceKaleidoscopeManager.class) {
                if (w == null) {
                    w = new WatchFaceKaleidoscopeManager(context.getApplicationContext());
                }
            }
        }
        return w;
    }

    public static void r() {
        synchronized (WatchFaceKaleidoscopeManager.class) {
            if (w != null) {
                HwLog.i(u, "destroyInstance() enter.");
                w = null;
            }
        }
    }

    public final void A() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.mHwtOperateDir);
        sb.append(this.mWatchFaceName);
        String str = File.separator;
        sb.append(str);
        sb.append(this.mPackageName);
        sb.append(str);
        sb.append("res");
        this.mWatchFaceProvider.combineHandsStyleResourcePath(sb.toString());
    }

    public final void a(String str, BackgroundOptionalConfig backgroundOptionalConfig) {
        if (!this.mIsSyncWatchFace || ArrayUtils.isEmpty(this.q)) {
            HwLog.i(u, "setBackgroundIndex mIsSyncWatchFace is false or mTempKaleidoscopeStructList is empty");
            return;
        }
        for (KaleidoscopeStruct kaleidoscopeStruct : this.q) {
            String strSubstring = SafeString.substring(str, 0, str.lastIndexOf("."));
            if (kaleidoscopeStruct == null || TextUtils.isEmpty(kaleidoscopeStruct.getMaterialImageName())) {
                HwLog.i(u, "kaleidoscopeStruct is null or getMaterialImageName is empty");
            } else if (kaleidoscopeStruct.getMaterialImageName().contains(strSubstring)) {
                backgroundOptionalConfig.setIndex(String.valueOf(kaleidoscopeStruct.getMaterialImageIndex()));
                return;
            }
        }
    }

    public final void b(String str, String str2, String str3, String str4) throws Throwable {
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateWatchFaceCallback;
        if (operateWatchFaceCallback == null) {
            HwLog.e(u, "generateKaleidoscopeBg() mOperateWatchFaceCallback is null.");
            return;
        }
        Context customWebViewContext = operateWatchFaceCallback.getCustomWebViewContext();
        if (customWebViewContext == null) {
            HwLog.e(u, "generateKaleidoscopeBg() context is null.");
            return;
        }
        if (PversionSdUtils.getFile(str3 + str4).exists()) {
            HwLog.i(u, "generateKaleidoscopeBg() desFile exists.");
        } else if (customWebViewContext instanceof Activity) {
            WatchFaceBitmapUtil.saveBitmapToFile(new KaleidoscopeDraw(customWebViewContext, str2, str).b(), Bitmap.CompressFormat.PNG, str3, str4);
        }
    }

    public final ArrayList c(ArrayList arrayList) {
        if (ArrayUtils.isEmpty(arrayList)) {
            HwLog.w(u, "getUnDefaultKaleidoscopeStructs() kaleidoscopeStructs is null or empty.");
            return arrayList;
        }
        List<BackgroundOptionalConfig> defaultBackgroundOptionalConfigList = this.mWatchFaceProvider.getDefaultBackgroundOptionalConfigList();
        if (defaultBackgroundOptionalConfigList == null) {
            HwLog.w(u, "getUnDefaultKaleidoscopeStructs() defaultBackgrounds is null.");
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(32);
        arrayList2.addAll(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            KaleidoscopeStruct kaleidoscopeStruct = (KaleidoscopeStruct) it.next();
            for (BackgroundOptionalConfig backgroundOptionalConfig : defaultBackgroundOptionalConfigList) {
                if (SafeString.substring(backgroundOptionalConfig.getResPreview(), backgroundOptionalConfig.getResPreview().lastIndexOf("/") + 1).contains(kaleidoscopeStruct.getSubMaterialImageName())) {
                    arrayList2.remove(kaleidoscopeStruct);
                }
            }
        }
        return arrayList2;
    }

    public void choosePicToClip() {
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateWatchFaceCallback;
        if (operateWatchFaceCallback == null) {
            HwLog.w(u, "choosePicToClip() mOperateWatchFaceCallback is null");
        } else {
            operateWatchFaceCallback.chooseToClip(2, false);
        }
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public void clearInvalidData() {
        this.mWatchFaceProvider.setLatonaBackgroundPathList(null);
        this.mWatchFaceProvider.setLatonaBackgroundNameList(null);
        this.mWatchFaceProvider.setDefaultVideoStructs(null);
        this.mWatchFaceProvider.setVideoStructs(null);
    }

    public final void d(int i) {
        HwLog.w(u, "getDeviceInfoByBt() failed :" + i);
        ArrayList<BackgroundOptionalConfig> arrayList = new ArrayList<>(32);
        this.mWatchFaceProvider.setBackgroundOptionalConfigList(arrayList);
        this.mWatchFaceProvider.setDefaultBackgroundOptionalConfigList(arrayList);
        notifyWatchFaceReady(false);
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public boolean devicesCallbackFileInfoCheckFail(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString(ContentResource.FILE_NAME);
            int iOptInt = jSONObject.optInt("fileType");
            if (TextUtils.isEmpty(strOptString)) {
                HwLog.i(u, "devicesCallbackPhotoInfoCheck -- fileName is empty");
                return true;
            }
            if (iOptInt == 14) {
                if (!ArrayUtils.isEmpty(this.t)) {
                    return !this.t.contains(strOptString);
                }
                HwLog.i(u, "devicesCallbackPhotoInfoCheck -- mBackgroundList is empty");
                return true;
            }
            HwLog.i(u, "devicesCallbackPhotoInfoCheck -- fileType: " + iOptInt);
            return true;
        } catch (JSONException e) {
            HwLog.e(u, "devicesCallbackPhotoInfoCheck -- JSONException" + HwLog.printException((Exception) e));
            return true;
        }
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public void getDeviceInfoByBt() {
        HwLog.i(u, "getDeviceInfoByBt() enter.");
        this.mHwWatchFaceBtManager.getKaleidoscopeWatchFaceInfo(u(), new a());
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public List getFileType() {
        if (!Utils.isEmpty(this.s)) {
            return this.s;
        }
        this.s.add(14);
        return this.s;
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public void getNextFileByBt(int i) {
        getFileByBt(i, this.r.size(), 23, ((KaleidoscopeStruct) this.r.get(i)).getMaterialImageName());
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public void notifyWatchFaceReady(boolean z) {
        this.mIsSyncWatchFace = false;
        String strB = b(false);
        if (z) {
            notifyH5Ready(strB);
        } else {
            this.mOperateWatchFaceCallback.transmitWatchFaceKaleidoscopeInfo(strB);
        }
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public void onDestroy() {
        HwLog.i(u, "onDestroy() enter.");
        super.onDestroy();
        r();
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public void parseCustomWatchFaceConfig(ElementsProvider elementsProvider) throws Throwable {
        HwLog.i(u, "parseCustomWatchFaceConfig() enter.");
        A();
        y();
    }

    public final void q() {
        File[] fileArrListFiles;
        File file = PversionSdUtils.getFile(this.mBackgroundDir);
        if (!file.isDirectory() || (fileArrListFiles = file.listFiles()) == null || fileArrListFiles.length <= 0) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            HwLog.d(u, "DeleteImageFile :" + file2.delete());
        }
    }

    public int s() {
        LatonaWatchFaceProvider latonaWatchFaceProvider = this.mWatchFaceProvider;
        if (latonaWatchFaceProvider == null) {
            return 0;
        }
        List<BackgroundOptionalConfig> backgroundOptionalConfigList = latonaWatchFaceProvider.getBackgroundOptionalConfigList();
        if (ArrayUtils.isEmpty(backgroundOptionalConfigList)) {
            return ArrayUtils.a(this.mWatchFaceProvider.getDefaultBackgroundOptionalConfigList());
        }
        int iA = 0;
        for (BackgroundOptionalConfig backgroundOptionalConfig : backgroundOptionalConfigList) {
            if (iA < r2.a(backgroundOptionalConfig.getIndex(), 0)) {
                iA = r2.a(backgroundOptionalConfig.getIndex(), 0);
            }
        }
        HwLog.w(u, "getBgMaxIndex() bgMaxIndex: " + iA);
        return iA;
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public void saveFileFromDevice(String str, int i) throws Throwable {
        int iIndexOf;
        if (TextUtils.isEmpty(str)) {
            HwLog.w(u, "saveFileFromDevice() sourcePath is empty.");
            return;
        }
        WatchFaceKaleidoscopeInfo watchFaceKaleidoscopeInfo = this.mHwWatchFaceBtManager.getWatchFaceKaleidoscopeInfo();
        File file = new File(str);
        String name = file.getName();
        String str2 = u;
        HwLog.d(str2, "saveFileFromDevice() name :" + name + ",length:" + file.length());
        if (name.contains(".")) {
            name = SafeString.substring(name, 0, name.lastIndexOf("."));
        }
        String str3 = this.mBackgroundDir + name + ".png";
        if (watchFaceKaleidoscopeInfo.getMaterialImageType() == 2) {
            WatchFaceBitmapUtil.getInstance().a(str, str3);
            HwLog.d(str2, "saveFileFromDevice() ConvertBinToPng :" + name + ".png");
        } else {
            HwLog.i(str2, "saveFileFromDevice() BackgroundTypeIsPng, copyToBackgroundDir");
            FileHelper.copyFileToParsingDir(str, str3);
        }
        List<BackgroundOptionalConfig> backgroundOptionalConfigList = this.mWatchFaceProvider.getBackgroundOptionalConfigList();
        if (backgroundOptionalConfigList == null) {
            HwLog.w(str2, "saveFileFromDevice() curBackgroundOptionalConfigList is null.");
            return;
        }
        Iterator<BackgroundOptionalConfig> it = backgroundOptionalConfigList.iterator();
        while (true) {
            if (!it.hasNext()) {
                iIndexOf = -1;
                break;
            }
            BackgroundOptionalConfig next = it.next();
            if (next.getResPreview().contains(str3)) {
                iIndexOf = backgroundOptionalConfigList.indexOf(next);
                break;
            }
        }
        if (iIndexOf != -1) {
            backgroundOptionalConfigList.remove(iIndexOf);
        }
        HwLog.iBetaLog(u, "saveFileFromDevice() containIndex: " + iIndexOf + ", pngPath: " + str3);
        String str4 = this.mBackgroundDir + name + File.separator;
        b(KaleidoscopeDraw.a.HONEYCOMB.toString(), str3, str4, "honeycomb.png");
        b(KaleidoscopeDraw.a.RADIAL.toString(), str3, str4, "radia.png");
        BackgroundOptionalConfig backgroundOptionalConfig = new BackgroundOptionalConfig();
        backgroundOptionalConfig.setIndex(((KaleidoscopeStruct) this.r.get(i)).getMaterialImageIndex() + "");
        backgroundOptionalConfig.setResPreview(str3);
        backgroundOptionalConfig.setHoneycombBgPath(str4 + "honeycomb.png");
        backgroundOptionalConfig.setRadiationBgPath(str4 + "radia.png");
        backgroundOptionalConfigList.add(backgroundOptionalConfig);
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public void sendWatchFaceInfoToDevice(LatonaWatchFaceThemeAlbumInfo latonaWatchFaceThemeAlbumInfo) {
        HwLog.i(u, "sendKaleidoscopeInfoToDevice() enter.");
        WatchFaceKaleidoscopeInfo watchFaceKaleidoscopeInfo = new WatchFaceKaleidoscopeInfo();
        ArrayList arrayList = new ArrayList(32);
        ArrayList<KaleidoscopeStruct> arrayList2 = new ArrayList<>();
        for (BackgroundOptionalConfig backgroundOptionalConfig : latonaWatchFaceThemeAlbumInfo.getDefaultBackgroundOptionalConfigList()) {
            arrayList2.add(new KaleidoscopeStruct(IntegerUtils.a(backgroundOptionalConfig.getIndex()), SafeString.substring(backgroundOptionalConfig.getResPreview(), backgroundOptionalConfig.getResPreview().lastIndexOf("/") + 1)));
        }
        List<BackgroundOptionalConfig> backgroundOptionalConfigList = latonaWatchFaceThemeAlbumInfo.getBackgroundOptionalConfigList();
        if (!ArrayUtils.isEmpty(backgroundOptionalConfigList)) {
            for (BackgroundOptionalConfig backgroundOptionalConfig2 : backgroundOptionalConfigList) {
                String strSubstring = SafeString.substring(backgroundOptionalConfig2.getResPreview(), backgroundOptionalConfig2.getResPreview().lastIndexOf("/") + 1);
                if (HwWatchFaceBtManager.getInstance(this.mContext).getWatchFaceKaleidoscopeInfo().getMaterialImageType() == 2) {
                    String strReplace = SafeString.replace(strSubstring, "png", NavigationFileParser.BIN);
                    arrayList.add(strReplace);
                    arrayList.add(strSubstring);
                    strSubstring = strReplace;
                } else {
                    arrayList.add(strSubstring);
                }
                arrayList2.add(new KaleidoscopeStruct(IntegerUtils.a(backgroundOptionalConfig2.getIndex()), strSubstring));
            }
        }
        this.t.clear();
        this.t.addAll(arrayList);
        watchFaceKaleidoscopeInfo.setMaterialImageList(arrayList2);
        watchFaceKaleidoscopeInfo.setCurrentMaterialImageIndex(IntegerUtils.a(latonaWatchFaceThemeAlbumInfo.getBackgroundIndex()));
        watchFaceKaleidoscopeInfo.setHandsStyleIndex(IntegerUtils.a(latonaWatchFaceThemeAlbumInfo.getHandStyleIndex()));
        watchFaceKaleidoscopeInfo.setKaleidoscopeType(IntegerUtils.a(latonaWatchFaceThemeAlbumInfo.getStyleIndex()));
        HwLog.i(u, "sendKaleidoscopeInfoToDevice() kaleidoscopeStructs: " + arrayList2.toString() + ", currentMaterialImageIndex: " + watchFaceKaleidoscopeInfo.getCurrentMaterialImageIndex() + ", handsStyleIndex: " + watchFaceKaleidoscopeInfo.getHandsStyleIndex() + ", styleIndex: " + watchFaceKaleidoscopeInfo.getKaleidoscopeType());
        b(this.t);
        this.mTransferTotalCount = 0;
        this.mTransferCompleteCount = 0;
        this.mCurrentTransferPercent = 0;
        HwDeviceConfigManager.getInstance(this.mContext).registerPhotoAndVideoCallback(this.mIAppTransferFileResultAIDLCallback, getFileType(), TransferFileReqType.DEVICE_REGISTRATION);
        this.mHwWatchFaceBtManager.saveKaleidoscopeInfoToDevice(watchFaceKaleidoscopeInfo, new IBaseResponseCallback() { // from class: com.huawei.watchface.manager.WatchFaceKaleidoscopeManager$$ExternalSyntheticLambda0
            @Override // com.huawei.watchface.utils.callback.IBaseResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f$0.c(i, obj);
            }
        });
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public void setTransferTotalCount(LatonaWatchFaceThemeAlbumInfo latonaWatchFaceThemeAlbumInfo) {
        this.mTransferTotalCount = 0;
        this.mTransferCompleteCount = 0;
        for (BackgroundOptionalConfig backgroundOptionalConfig : latonaWatchFaceThemeAlbumInfo.getBackgroundOptionalConfigList()) {
            Iterator it = this.q.iterator();
            do {
                if (!it.hasNext()) {
                    HwLog.iBetaLog(u, "setTransferTotalCount() noContain: " + backgroundOptionalConfig.getResPreview());
                    this.mTransferTotalCount = this.mTransferTotalCount + 1;
                    break;
                }
            } while (!backgroundOptionalConfig.getResPreview().contains(((KaleidoscopeStruct) it.next()).getSubMaterialImageName()));
        }
        HwLog.i(u, "setTransferTotalCount() mTransferTotalCount: " + this.mTransferTotalCount);
    }

    public String t() {
        HwWatchFaceBtManager hwWatchFaceBtManager = this.mHwWatchFaceBtManager;
        if (hwWatchFaceBtManager == null) {
            HwLog.w(u, "getKaleidoscopePackageName() mHwWatchBtFaceManager is null");
            return "";
        }
        String kaleidoscopePackageName = hwWatchFaceBtManager.getKaleidoscopePackageName();
        HwLog.i(u, "getKaleidoscopePackageName() kaleidoscopePackageName:" + kaleidoscopePackageName);
        return kaleidoscopePackageName;
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public void transmitWatchFaceInfo(String str) {
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateWatchFaceCallback;
        if (operateWatchFaceCallback == null) {
            HwLog.i(u, "transmitWatchFaceInfo() mOperateWatchFaceCallback is null.");
        } else {
            operateWatchFaceCallback.transmitWatchFaceKaleidoscopeInfo(str);
        }
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public void transmitWatchFaceInstallResult(int i) {
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateWatchFaceCallback;
        if (operateWatchFaceCallback == null) {
            HwLog.e(u, "transmitWatchFaceInstallResult() mOperateWatchFaceCallback is null.");
        } else {
            operateWatchFaceCallback.transmitWatchFaceKaleidoscopeInstallResult(i);
        }
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public void transmitWatchFaceLoadingProgress(String str) {
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateWatchFaceCallback;
        if (operateWatchFaceCallback == null) {
            HwLog.w(u, "transmitWatchFaceLoadingProgress() mOperateWatchFaceCallback is null.");
        } else {
            operateWatchFaceCallback.transmitWatchFaceKaleidoscopeLoadingProgress(str);
        }
    }

    public final int u() {
        int iIsSupportBackgroundOption = LatonaWatchFaceProvider.getInstance(this.mContext).isSupportBackgroundOption() | (LatonaWatchFaceProvider.getInstance(this.mContext).isSupportHandStyleOption() << 1) | (LatonaWatchFaceProvider.getInstance(this.mContext).isSupportStyleOption() << 2);
        HwLog.i(u, "getRequestType() requestType: " + iIsSupportBackgroundOption);
        return iIsSupportBackgroundOption;
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public void updateNativeFiles(LatonaWatchFaceThemeAlbumInfo latonaWatchFaceThemeAlbumInfo) {
        String str = u;
        HwLog.i(str, "updateNativeFiles() enter");
        File[] fileArrListFiles = new File(this.mBackgroundDir).listFiles();
        if (ArrayUtils.isEmpty(fileArrListFiles)) {
            HwLog.w(str, "updateNativeFiles() native dir has no imageFiles.");
            return;
        }
        HwLog.i(str, "updateNativeFiles() CheckingBackgroundFiles");
        List<BackgroundOptionalConfig> backgroundOptionalConfigList = latonaWatchFaceThemeAlbumInfo.getBackgroundOptionalConfigList();
        if (ArrayUtils.isEmpty(backgroundOptionalConfigList)) {
            backgroundOptionalConfigList = new ArrayList<>(32);
        }
        for (File file : fileArrListFiles) {
            if (!ArrayUtils.a(v, file.getName())) {
                Iterator<BackgroundOptionalConfig> it = backgroundOptionalConfigList.iterator();
                do {
                    if (!it.hasNext()) {
                        HwLog.i(u, "updateNativeFiles() isDelete: " + FileHelper.a(file));
                        break;
                    }
                } while (!it.next().getResPreview().contains(file.getName()));
            }
        }
        latonaWatchFaceThemeAlbumInfo.setBackgroundOptionalConfigList(backgroundOptionalConfigList);
    }

    public final void v() {
        HwLog.w(u, "getDeviceInfoByBt() objectData is null");
        this.p.clear();
        q();
        ArrayList<BackgroundOptionalConfig> arrayList = new ArrayList<>(32);
        this.mWatchFaceProvider.setBackgroundOptionalConfigList(arrayList);
        this.mWatchFaceProvider.setDefaultBackgroundOptionalConfigList(arrayList);
        notifyWatchFaceReady(false);
    }

    public void w() {
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateWatchFaceCallback;
        if (operateWatchFaceCallback == null) {
            HwLog.w(u, "resetKaleidoscopeCurrentMaxIndex() mOperateWatchFaceCallback is null");
        } else {
            operateWatchFaceCallback.resetKaleidoscopeCurrentMaxIndex();
        }
    }

    public final void x() throws Throwable {
        this.p.clear();
        File file = new File(this.mBackgroundDir);
        if (!file.exists()) {
            HwLog.w(u, "setBackgroundOptionalConfig failed, watchFaceSvgPath don't exist");
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            HwLog.w(u, "setBackgroundOptionalConfig childFileNames is null or not enough length");
            this.mWatchFaceProvider.setBackgroundOptionalConfigList(null);
            return;
        }
        ArrayList<BackgroundOptionalConfig> arrayList = new ArrayList<>();
        for (File file2 : fileArrListFiles) {
            String name = file2.getName();
            if (file2.isFile() && name.endsWith(".png")) {
                this.p.add(name);
                String str = this.mBackgroundDir + name;
                String str2 = this.mBackgroundDir + SafeString.substring(name, 0, name.lastIndexOf(".")) + File.separator;
                b(KaleidoscopeDraw.a.HONEYCOMB.toString(), str, str2, "honeycomb.png");
                b(KaleidoscopeDraw.a.RADIAL.toString(), str, str2, "radia.png");
                BackgroundOptionalConfig backgroundOptionalConfig = new BackgroundOptionalConfig();
                backgroundOptionalConfig.setResPreview(this.mBackgroundDir + name);
                backgroundOptionalConfig.setHoneycombBgPath(str2 + "honeycomb.png");
                backgroundOptionalConfig.setRadiationBgPath(str2 + "radia.png");
                a(name, backgroundOptionalConfig);
                arrayList.add(backgroundOptionalConfig);
            }
        }
        this.mWatchFaceProvider.setBackgroundOptionalConfigList(arrayList);
        HwLog.i(u, "setBackgroundOptionalConfig local backgrounds :" + this.p.toString());
    }

    public final void y() throws Throwable {
        z();
        x();
    }

    public final void z() throws Throwable {
        StringBuilder sb = new StringBuilder();
        sb.append(this.mHwtOperateDir);
        sb.append(this.mWatchFaceName);
        String str = File.separator;
        sb.append(str);
        sb.append(this.mPackageName);
        sb.append(str);
        sb.append("res");
        sb.append(str);
        String string = sb.toString();
        File[] fileArrListFiles = new File(string).listFiles();
        if (fileArrListFiles == null) {
            HwLog.w(u, "setDefaultBackgroundOptionalConfig() resourceFiles is null.");
            return;
        }
        List<BackgroundOptionalConfig> defaultBackgroundOptionalConfigList = this.mWatchFaceProvider.getDefaultBackgroundOptionalConfigList();
        if (defaultBackgroundOptionalConfigList == null) {
            HwLog.w(u, "setDefaultBackgroundOptionalConfig() defaultBackgroundOptionalConfigs is null.");
            return;
        }
        for (BackgroundOptionalConfig backgroundOptionalConfig : defaultBackgroundOptionalConfigList) {
            String resPreview = backgroundOptionalConfig.getResPreview();
            String str2 = string + resPreview;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append(SafeString.substring(resPreview, 0, resPreview.lastIndexOf(".")));
            sb2.append(File.separator);
            String string2 = sb2.toString();
            b(KaleidoscopeDraw.a.HONEYCOMB.toString(), str2, string2, "honeycomb.png");
            b(KaleidoscopeDraw.a.RADIAL.toString(), str2, string2, "radia.png");
            for (File file : fileArrListFiles) {
                if (file.isFile() && file.getName().equals(resPreview)) {
                    backgroundOptionalConfig.setResPreview(str2);
                    backgroundOptionalConfig.setHoneycombBgPath(string2 + "honeycomb.png");
                    backgroundOptionalConfig.setRadiationBgPath(string2 + "radia.png");
                    break;
                }
            }
        }
    }

    public final void a(WatchFaceKaleidoscopeInfo watchFaceKaleidoscopeInfo) {
        int maxMaterialImages = watchFaceKaleidoscopeInfo.getMaxMaterialImages();
        int currentMaterialImageIndex = watchFaceKaleidoscopeInfo.getCurrentMaterialImageIndex();
        int handsStyleIndex = watchFaceKaleidoscopeInfo.getHandsStyleIndex();
        int kaleidoscopeType = watchFaceKaleidoscopeInfo.getKaleidoscopeType();
        int materialImageType = watchFaceKaleidoscopeInfo.getMaterialImageType();
        ArrayList arrayListC = c(watchFaceKaleidoscopeInfo.getMaterialImageList());
        String str = u;
        HwLog.i(str, "didGetDeviceInfoFromBt() maxBackgrounds: " + maxMaterialImages + ", backgroundIndex: " + currentMaterialImageIndex + ", handStyleIndex: " + handsStyleIndex + ", styleIndex: " + kaleidoscopeType + ", backgroundType: " + materialImageType + ", kaleidoscopeStructList: " + arrayListC.toString());
        this.mWatchFaceProvider.setKaleidoscopeInfo(String.valueOf(currentMaterialImageIndex), String.valueOf(handsStyleIndex), String.valueOf(kaleidoscopeType), materialImageType, String.valueOf(maxMaterialImages));
        this.q.addAll(arrayListC);
        a(this.q);
        this.mTransferTotalCount = this.q.size();
        if (this.r.size() > 0) {
            HwLog.i(str, "didGetDeviceInfoFromBt() LocalImagesNotFound");
            getFileByBt(0, this.r.size(), 23, ((KaleidoscopeStruct) this.r.get(0)).getMaterialImageName());
            return;
        }
        HwLog.i(str, "didGetDeviceInfoFromBt() LocalExistsAllBackgroundImages");
        this.p.clear();
        Iterator it = arrayListC.iterator();
        while (it.hasNext()) {
            this.p.add(((KaleidoscopeStruct) it.next()).getMaterialImageName());
        }
        notifyWatchFaceReady(false);
    }

    public final /* synthetic */ void c(int i, Object obj) {
        HwLog.i(u, "sendKaleidoscopeInfoToDevice() errorCode: " + i);
        if (i == 101) {
            onSaveSuccess(obj);
        } else if (i == 113) {
            onSaveToTransferBackgrounds(obj, 1);
        } else {
            onSaveFailed();
        }
    }

    public final String b(boolean z) {
        if (z) {
            return WatchFaceProvider.getInstance(this.mContext).transmitWatchFaceInfo();
        }
        return this.mWatchFaceProvider.transmitLatonaWatchFaceInfo();
    }

    public final void b(int i, Object obj) {
        if (i == 101) {
            if (obj instanceof WatchFaceKaleidoscopeInfo) {
                a((WatchFaceKaleidoscopeInfo) obj);
                return;
            } else {
                v();
                return;
            }
        }
        d(i);
    }

    public final void b(ArrayList arrayList) {
        HwWatchFaceBtManager hwWatchFaceBtManager = this.mHwWatchFaceBtManager;
        int bgImageOption = hwWatchFaceBtManager != null ? hwWatchFaceBtManager.getWatchFaceKaleidoscopeInfo().getBgImageOption() : 0;
        HwLog.i(u, "createBinBackground binFileType: " + bgImageOption);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.endsWith(".png")) {
                String str2 = u;
                HwLog.i(str2, "createBinBackground png name :" + str);
                String str3 = this.mBackgroundDir + str;
                String strReplace = SafeString.replace(str, ".png", WatchFaceConstant.BIN_SUFFIX);
                HwLog.i(str2, "createBinBackground bin name :" + strReplace);
                WatchFaceBitmapUtil.getInstance().a(str3, this.mBackgroundDir + strReplace, bgImageOption);
            }
        }
    }

    public final void a(ArrayList arrayList) {
        this.r.clear();
        List<BackgroundOptionalConfig> backgroundOptionalConfigList = this.mWatchFaceProvider.getBackgroundOptionalConfigList();
        if (backgroundOptionalConfigList == null) {
            HwLog.w(u, "checkLocalNotFoundBackground() backgroundOptionalConfigList is null.");
            return;
        }
        if (ArrayUtils.isEmpty(arrayList)) {
            HwLog.w(u, "checkLocalNotFoundBackground() kaleidoscopeStructs is empty");
            a(arrayList, backgroundOptionalConfigList);
            return;
        }
        if (ArrayUtils.isEmpty(this.p)) {
            HwLog.w(u, "checkLocalNotFoundBackground() backgroundPhotos is null or empty");
            this.r.addAll(arrayList);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            KaleidoscopeStruct kaleidoscopeStruct = (KaleidoscopeStruct) it.next();
            Iterator<BackgroundOptionalConfig> it2 = backgroundOptionalConfigList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    BackgroundOptionalConfig next = it2.next();
                    String resPreview = next.getResPreview();
                    if (SafeString.substring(resPreview, resPreview.lastIndexOf("/") + 1).contains(kaleidoscopeStruct.getSubMaterialImageName())) {
                        next.setIndex(kaleidoscopeStruct.getMaterialImageIndex() + "");
                        break;
                    }
                } else {
                    HwLog.i(u, "checkLocalNotFoundBackground() has not: " + kaleidoscopeStruct.getMaterialImageName());
                    this.r.add(kaleidoscopeStruct);
                    break;
                }
            }
        }
        a(arrayList, backgroundOptionalConfigList);
    }

    public final void a(ArrayList arrayList, List list) {
        boolean z;
        if (ArrayUtils.isEmpty(list)) {
            HwLog.w(u, "deleteRedundantKaleidoscopeData() backgroundOptionalConfigList is empty.");
            return;
        }
        if (ArrayUtils.isEmpty(arrayList)) {
            HwLog.w(u, "deleteRedundantKaleidoscopeData() videoStructs is empty.");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String resPreview = ((BackgroundOptionalConfig) it.next()).getResPreview();
                boolean zB = FileHelper.b(resPreview);
                boolean zB2 = FileHelper.b(SafeString.substring(resPreview, 0, resPreview.lastIndexOf(".")) + File.separator);
                HwLog.d(u, "deleteRedundantKaleidoscopeData() delete resPreview: " + resPreview + ", isBgDeleted: " + zB + ", isDirDeleted: " + zB2);
            }
            this.mWatchFaceProvider.setBackgroundOptionalConfigList(null);
            return;
        }
        ArrayList<BackgroundOptionalConfig> arrayList2 = new ArrayList<>();
        arrayList2.addAll(list);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            BackgroundOptionalConfig backgroundOptionalConfig = (BackgroundOptionalConfig) it2.next();
            Iterator it3 = arrayList.iterator();
            String str = "";
            while (true) {
                if (!it3.hasNext()) {
                    z = false;
                    break;
                }
                KaleidoscopeStruct kaleidoscopeStruct = (KaleidoscopeStruct) it3.next();
                String resPreview2 = backgroundOptionalConfig.getResPreview();
                if (SafeString.substring(resPreview2, resPreview2.lastIndexOf("/") + 1).contains(kaleidoscopeStruct.getSubMaterialImageName())) {
                    HwLog.i(u, "deleteRedundantKaleidoscopeData ==" + kaleidoscopeStruct.getSubMaterialImageName());
                    arrayList2.get(list.indexOf(backgroundOptionalConfig)).setIndex(kaleidoscopeStruct.getMaterialImageIndex() + "");
                    str = resPreview2;
                    z = true;
                    break;
                }
                str = resPreview2;
            }
            String str2 = u;
            HwLog.i(str2, "deleteRedundantKaleidoscopeData() isWatchHasFile: " + z);
            if (!z) {
                HwLog.d(str2, "deleteRedundantKaleidoscopeData() delete resPreview: " + str + ", isBgDeleted: " + FileHelper.b(str) + ", isDirDeleted: " + FileHelper.b(SafeString.substring(str, 0, str.lastIndexOf(".")) + File.separator));
                arrayList2.remove(backgroundOptionalConfig);
            }
        }
        this.mWatchFaceProvider.setBackgroundOptionalConfigList(arrayList2);
    }
}
