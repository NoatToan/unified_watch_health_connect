package com.huawei.watchface.manager;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.openalliance.ad.db.bean.ContentResource;
import com.huawei.secure.android.common.util.SafeString;
import com.huawei.watchface.api.HwWatchFaceBtManager;
import com.huawei.watchface.flavor.FlavorConfig;
import com.huawei.watchface.i5;
import com.huawei.watchface.mvp.model.crypt.PversionSdUtils;
import com.huawei.watchface.mvp.model.datatype.TransferFileReqType;
import com.huawei.watchface.mvp.model.datatype.WatchFaceWearInfo;
import com.huawei.watchface.mvp.model.datatype.WearStruct;
import com.huawei.watchface.mvp.model.helper.GsonHelper;
import com.huawei.watchface.mvp.model.latona.BackgroundOptionalConfig;
import com.huawei.watchface.mvp.model.latona.LatonaWatchFaceProvider;
import com.huawei.watchface.mvp.model.latona.LatonaWatchFaceThemeAlbumInfo;
import com.huawei.watchface.mvp.model.latona.provider.ElementsProvider;
import com.huawei.watchface.mvp.model.latona.provider.WatchFaceProvider;
import com.huawei.watchface.r2;
import com.huawei.watchface.utils.ArrayUtils;
import com.huawei.watchface.utils.FileHelper;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.WatchFaceBitmapUtil;
import com.huawei.watchface.utils.analytice.data.AnalyticsGeneralEvent;
import com.huawei.watchface.utils.analytice.data.BaseEvent;
import com.huawei.watchface.utils.callback.IBaseResponseCallback;
import com.huawei.watchface.utils.callback.OperateWatchFaceCallback;
import com.huawei.watchface.videoedit.utils.Utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class WatchFaceWearManager extends BaseWatchFaceManager {
    public static String A = null;
    public static Uri B = null;
    public static final String x = "WatchFaceWearManager";
    public static volatile WatchFaceWearManager y;
    public static final String[] z = {"res", "hwt", "parsing", "resources"};
    public OnWearSdkEvent p;
    public final Map q;
    public List r;
    public ArrayList s;
    public ArrayList t;
    public ArrayList u;
    public ArrayList v;
    public final String w;

    public interface OnWearSdkEvent {
        void setSupportedClocks(ArrayList<Integer> arrayList);
    }

    public class a extends HashMap {
        private static final long serialVersionUID = 4970895796906924736L;

        public a() {
            put(0, 1);
            put(1, 2);
            put(2, 3);
            put(3, 4);
            put(4, 7);
            put(5, 8);
            put(6, 9);
            put(7, 10);
            put(8, 11);
        }
    }

    public class b implements IBaseResponseCallback {
        public b() {
        }

        @Override // com.huawei.watchface.utils.callback.IBaseResponseCallback
        public void onResponse(int i, Object obj) {
            WatchFaceWearManager.this.s.clear();
            String str = WatchFaceWearManager.x;
            HwLog.i(str, "getDeviceInfoByBt(): errorCode:" + i);
            if (i == 101) {
                if (obj instanceof WatchFaceWearInfo) {
                    WatchFaceWearManager.this.a((WatchFaceWearInfo) obj);
                    return;
                }
                HwLog.w(str, "getDeviceInfoByBt() objectData is null");
                WatchFaceWearManager.this.t.clear();
                WatchFaceWearManager.this.r();
                ArrayList<BackgroundOptionalConfig> arrayList = new ArrayList<>(32);
                WatchFaceWearManager.this.mWatchFaceProvider.setBackgroundOptionalConfigList(arrayList);
                WatchFaceWearManager.this.mWatchFaceProvider.setDefaultBackgroundOptionalConfigList(arrayList);
                WatchFaceWearManager.this.notifyWatchFaceReady(false);
                return;
            }
            HwLog.w(str, "getDeviceInfoByBt() failed :" + i);
            WatchFaceWearManager.this.a(20002, "Error code: " + i);
            ArrayList<BackgroundOptionalConfig> arrayList2 = new ArrayList<>(32);
            WatchFaceWearManager.this.mWatchFaceProvider.setBackgroundOptionalConfigList(arrayList2);
            WatchFaceWearManager.this.mWatchFaceProvider.setDefaultBackgroundOptionalConfigList(arrayList2);
            WatchFaceWearManager.this.notifyWatchFaceReady(false);
        }
    }

    public class c implements Comparator {
        public c(WatchFaceWearManager watchFaceWearManager) {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(BackgroundOptionalConfig backgroundOptionalConfig, BackgroundOptionalConfig backgroundOptionalConfig2) {
            if (backgroundOptionalConfig == null || backgroundOptionalConfig2 == null) {
                return 0;
            }
            return backgroundOptionalConfig.getSortTag() - backgroundOptionalConfig2.getSortTag();
        }
    }

    public WatchFaceWearManager(Context context) {
        super(context, WatchFaceConstant.WEAR_PREVIEW_ROOT_PATH, true);
        this.q = new a();
        this.r = new ArrayList(32);
        this.s = new ArrayList(32);
        this.t = new ArrayList(32);
        this.u = new ArrayList(20);
        this.v = new ArrayList(32);
        this.w = this.f30306c + "resources/";
    }

    private void A() {
        String str = x;
        HwLog.w(str, "setDefaultBackgroundOptionalConfig() enter");
        StringBuilder sb = new StringBuilder();
        sb.append(this.mHwtOperateDir);
        sb.append(this.mWatchFaceName);
        String str2 = File.separator;
        sb.append(str2);
        sb.append(this.mPackageName);
        sb.append(str2);
        sb.append("res");
        sb.append(str2);
        String string = sb.toString();
        File file = PversionSdUtils.getFile(string);
        if (file == null || !file.exists()) {
            HwLog.i(str, "createWearWatchFace() -- resourceFile does not exist.");
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            HwLog.w(str, "setDefaultBackgroundOptionalConfig() resourceFiles is null.");
            return;
        }
        List<BackgroundOptionalConfig> defaultBackgroundOptionalConfigList = this.mWatchFaceProvider.getDefaultBackgroundOptionalConfigList();
        if (defaultBackgroundOptionalConfigList == null) {
            HwLog.w(str, "setDefaultBackgroundOptionalConfig() defaultBackgroundOptionalConfigs is null.");
            return;
        }
        for (BackgroundOptionalConfig backgroundOptionalConfig : defaultBackgroundOptionalConfigList) {
            String resPreview = backgroundOptionalConfig.getResPreview();
            String str3 = string + resPreview;
            for (File file2 : fileArrListFiles) {
                if (file2.isFile() && file2.getName().equals(resPreview)) {
                    backgroundOptionalConfig.setResPreview(str3);
                    break;
                }
            }
        }
    }

    private void B() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.mHwtOperateDir);
        sb.append(this.mWatchFaceName);
        String str = File.separator;
        sb.append(str);
        sb.append(this.mPackageName);
        sb.append(str);
        sb.append("res");
        this.mWatchFaceProvider.combineStyleResourcePath(sb.toString());
    }

    private void b(ArrayList arrayList) {
        int iT = t();
        HwLog.i(x, "createBinBackground enter: ");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.contains(WatchFaceConstant.PREVIEW_RES) && str.endsWith(".png")) {
                String strReplace = SafeString.replace(str, ".png", WatchFaceConstant.BIN_SUFFIX);
                String str2 = this.mBackgroundDir + str;
                String str3 = this.mBackgroundDir + strReplace;
                String strReplace2 = SafeString.replace(str2, WatchFaceConstant.PREVIEW_RES, WatchFaceConstant.WALLPAPER_RES);
                String strReplace3 = SafeString.replace(str3, WatchFaceConstant.PREVIEW_RES, WatchFaceConstant.WALLPAPER_RES);
                WatchFaceBitmapUtil.getInstance().a(str2, str3, iT);
                WatchFaceBitmapUtil.getInstance().a(strReplace2, strReplace3, iT);
            }
        }
    }

    public static WatchFaceWearManager getInstance(Context context) {
        if (y == null) {
            synchronized (WatchFaceWearManager.class) {
                if (y == null) {
                    y = new WatchFaceWearManager(context.getApplicationContext());
                }
            }
        }
        return y;
    }

    private static void s() {
        synchronized (WatchFaceWearManager.class) {
            if (y != null) {
                HwLog.i(x, "destroyInstance() enter.");
                y = null;
            }
        }
    }

    private int v() {
        int iIsSupportPositionOption = LatonaWatchFaceProvider.getInstance(this.mContext).isSupportPositionOption() | (LatonaWatchFaceProvider.getInstance(this.mContext).isSupportStyleOption() << 1) | (LatonaWatchFaceProvider.getInstance(this.mContext).isSupportDataOption() << 2);
        HwLog.i(x, "getRequestType() requestType: " + iIsSupportPositionOption);
        return iIsSupportPositionOption;
    }

    private void x() {
        String str = x;
        HwLog.w(str, "setBackgroundOptionalConfig() -- enter");
        this.t.clear();
        File file = PversionSdUtils.getFile(this.mBackgroundDir);
        if (file == null || !file.exists()) {
            HwLog.i(str, "createWearWatchFace() -- file does not exist.");
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            HwLog.w(str, "setBackgroundOptionalConfig childFileNames is null or empty");
            this.mWatchFaceProvider.setBackgroundOptionalConfigList(null);
            return;
        }
        ArrayList<BackgroundOptionalConfig> arrayList = new ArrayList<>();
        for (File file2 : fileArrListFiles) {
            String name = file2.getName();
            if (file2.isFile() && name.endsWith(".png") && name.contains(WatchFaceConstant.PREVIEW_RES)) {
                try {
                    String strSubstring = SafeString.substring(name, 0, name.lastIndexOf("_"));
                    this.t.add(new WearStruct(r2.a(strSubstring, 0L), name));
                    BackgroundOptionalConfig backgroundOptionalConfig = new BackgroundOptionalConfig();
                    backgroundOptionalConfig.setResPreview(this.mBackgroundDir + name);
                    backgroundOptionalConfig.setIndex(strSubstring);
                    arrayList.add(backgroundOptionalConfig);
                } catch (Exception e) {
                    HwLog.e(x, "setBackgroundOptionalConfig() -- exception msg = " + HwLog.printException(e));
                    a(20007, HwLog.printException(e));
                }
            }
        }
        this.mWatchFaceProvider.setBackgroundOptionalConfigList(arrayList);
    }

    private void y() {
        A();
        x();
    }

    private void z() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.mHwtOperateDir);
        sb.append(this.mWatchFaceName);
        String str = File.separator;
        sb.append(str);
        sb.append(this.mPackageName);
        sb.append(str);
        sb.append("res");
        this.mWatchFaceProvider.combineDataResourcePath(sb.toString());
    }

    public final ArrayList a(ArrayList arrayList, String str, String str2) {
        if (arrayList == null || arrayList.size() == 0) {
            HwLog.i(x, "transformWearList() -- struct list is null or empty.");
            return arrayList;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            WearStruct wearStruct = (WearStruct) it.next();
            if (wearStruct.getWearPreviewName() != null) {
                wearStruct.setWearPreviewName(SafeString.replace(wearStruct.getWearPreviewName(), str, str2));
            }
        }
        return arrayList;
    }

    public final void c(ArrayList arrayList) {
        int watchFaceWidth = LatonaWatchFaceProvider.getInstance(this.mContext).getWatchFaceWidth();
        int watchFaceHeight = LatonaWatchFaceProvider.getInstance(this.mContext).getWatchFaceHeight();
        int iU = getInstance(this.mContext).u();
        HwLog.d(x, "createRoundRectPngRes r:" + iU);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.contains(WatchFaceConstant.PREVIEW_RES) && str.endsWith(".png")) {
                String str2 = this.mBackgroundDir + str;
                String strReplace = SafeString.replace(str2, WatchFaceConstant.PREVIEW_RES, WatchFaceConstant.WALLPAPER_RES);
                try {
                    WatchFaceBitmapUtil.getInstance().a(str2, watchFaceWidth, watchFaceHeight, iU);
                    WatchFaceBitmapUtil.getInstance().a(strReplace, watchFaceWidth, watchFaceHeight, iU);
                } catch (IOException e) {
                    HwLog.e(x, "createRoundRectPngRes() -- exception msg = " + HwLog.printException((Exception) e));
                    a(20008, HwLog.printException((Exception) e));
                } catch (Exception e2) {
                    HwLog.e(x, "createRoundRectPngRes() -- exception msg = " + HwLog.printException(e2));
                    a(20008, HwLog.printException(e2));
                } catch (OutOfMemoryError e3) {
                    HwLog.e(x, "createRoundRectPngRes:OutOfMemoryError:" + HwLog.printException((Error) e3));
                }
            }
        }
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public void clearInvalidData() {
        this.mWatchFaceProvider.setLatonaBackgroundPathList(null);
        this.mWatchFaceProvider.setLatonaBackgroundNameList(null);
        this.mWatchFaceProvider.setDefaultVideoStructs(null);
        this.mWatchFaceProvider.setVideoStructs(null);
    }

    public final ArrayList d(ArrayList arrayList) {
        if (ArrayUtils.isEmpty(arrayList)) {
            HwLog.w(x, "getUnDefaultWearStructs() wearStructs is null or empty.");
            return arrayList;
        }
        List<BackgroundOptionalConfig> defaultBackgroundOptionalConfigList = this.mWatchFaceProvider.getDefaultBackgroundOptionalConfigList();
        if (defaultBackgroundOptionalConfigList == null) {
            HwLog.w(x, "getUnDefaultWearStructs() defaultBackgrounds is null.");
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(32);
        arrayList2.addAll(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            WearStruct wearStruct = (WearStruct) it.next();
            for (BackgroundOptionalConfig backgroundOptionalConfig : defaultBackgroundOptionalConfigList) {
                if (SafeString.substring(backgroundOptionalConfig.getResPreview(), backgroundOptionalConfig.getResPreview().lastIndexOf("/") + 1).contains(wearStruct.getWearPreviewName())) {
                    arrayList2.remove(wearStruct);
                }
            }
        }
        return arrayList2;
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public boolean devicesCallbackFileInfoCheckFail(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString(ContentResource.FILE_NAME);
            int iOptInt = jSONObject.optInt("fileType");
            if (TextUtils.isEmpty(strOptString)) {
                HwLog.i(x, "devicesCallbackVideoInfoCheck -- fileName is empty");
                return true;
            }
            if (iOptInt == 16 || iOptInt == 17) {
                if (ArrayUtils.isEmpty(this.u)) {
                    HwLog.e(x, "devicesCallbackVideoInfoCheck -- mWearList is empty");
                    return true;
                }
                return !this.u.contains(SafeString.replace(strOptString, WatchFaceConstant.WALLPAPER_RES, WatchFaceConstant.PREVIEW_RES));
            }
            HwLog.e(x, "devicesCallbackVideoInfoCheck -- fileType: " + iOptInt);
            return true;
        } catch (JSONException e) {
            HwLog.e(x, "devicesCallbackVideoInfoCheck -- JSONException" + HwLog.printException((Exception) e));
            a(20001, HwLog.printException((Exception) e));
            return true;
        }
    }

    public final ArrayList e(ArrayList arrayList) {
        String canonicalPath;
        String str = x;
        HwLog.i(str, "updateWearStructListByXmlRes() -- enter.");
        ArrayList arrayList2 = new ArrayList();
        File file = PversionSdUtils.getFile(this.mBackgroundDir);
        if (file == null || !file.exists()) {
            HwLog.i(str, "updateWearStructListByXmlRes() -- file does not exist.");
            return arrayList2;
        }
        try {
            canonicalPath = file.getCanonicalPath();
        } catch (IOException e) {
            HwLog.e(x, "updateWearStructListByXmlRes() -- exception msg = " + HwLog.printException((Exception) e));
            a(20006, HwLog.printException((Exception) e));
            canonicalPath = "";
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            WearStruct wearStruct = (WearStruct) it.next();
            String wearPreviewName = wearStruct.getWearPreviewName();
            if (TextUtils.isEmpty(wearPreviewName)) {
                HwLog.i(x, "updateWearStructListByXmlRes() -- wearResName is empty");
            } else if (wearPreviewName.contains(WatchFaceConstant.PRESET_RES)) {
                HwLog.i(x, "updateWearStructListByXmlRes() -- filter out preset resource.");
                arrayList2.add(wearStruct);
            } else {
                String str2 = x;
                HwLog.i(str2, "updateWearStructListByXmlRes wearResName =" + wearPreviewName);
                File file2 = PversionSdUtils.getFile(SafeString.replace(canonicalPath + "/" + SafeString.replace(wearPreviewName, ".png", WatchFaceConstant.XML_SUFFIX), WatchFaceConstant.PREVIEW_RES, WatchFaceConstant.WALLPAPER_RES));
                if (file2 == null || !file2.exists()) {
                    HwLog.w(str2, "createWearWatchFace() -- resource file does not exist.");
                    String wearPreviewName2 = wearStruct.getWearPreviewName();
                    if (!TextUtils.isEmpty(wearPreviewName2)) {
                        wearStruct.setClockResource(SafeString.replace(SafeString.replace(wearPreviewName2, "preview.png", "wallpaper.bin"), "preview.bin", "wallpaper.bin"));
                        wearStruct.setWearPreviewName(SafeString.replace(wearPreviewName2, ".png", WatchFaceConstant.BIN_SUFFIX));
                    }
                    arrayList2.add(wearStruct);
                } else {
                    a(a(file2), arrayList2, wearStruct, wearPreviewName);
                }
            }
        }
        return arrayList2;
    }

    public String getCustomResourcePath() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.mHwtOperateDir);
        sb.append(this.mWatchFaceName);
        String str = File.separator;
        sb.append(str);
        sb.append(FlavorConfig.SERVICE_WATCH_FACE);
        sb.append(str);
        sb.append("resources");
        sb.append(str);
        return sb.toString();
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public void getDeviceInfoByBt() {
        HwLog.i(x, "getDeviceInfoByBt() enter.");
        this.mHwWatchFaceBtManager.getWatchFaceWearInfo(v(), new b());
    }

    public String getFilePathFromPicker() {
        return A;
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public List getFileType() {
        if (!Utils.isEmpty(this.r)) {
            return this.r;
        }
        this.r.add(16);
        this.r.add(17);
        return this.r;
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public void getNextFileByBt(int i) {
        getFileByBt(i, this.v.size(), 25, ((WearStruct) this.v.get(i)).getWearPreviewName());
    }

    public Uri getOriginalUriFromPicker() {
        return B;
    }

    public String getWatchFaceResourcePath() {
        return this.w;
    }

    public String getWatchFaceRootDir() {
        return this.f30306c;
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public void notifyWatchFaceReady(boolean z2) {
        HwLog.i(x, "notifyWatchFaceReady() -- enter.");
        this.mIsSyncWatchFace = false;
        String strB = b(false);
        if (z2) {
            notifyH5Ready(strB);
        } else {
            this.mOperateWatchFaceCallback.transmitWatchFaceThemeWearInfo(strB);
        }
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public void onDestroy() {
        HwLog.i(x, "onDestroy() enter.");
        super.onDestroy();
        s();
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public void parseCustomWatchFaceConfig(ElementsProvider elementsProvider) {
        B();
        z();
        y();
    }

    public void q() {
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateWatchFaceCallback;
        if (operateWatchFaceCallback == null) {
            HwLog.w(x, "chooseWearPicToClip() failed mOperateWatchFaceCallback is null");
        } else {
            operateWatchFaceCallback.chooseToClip(3, false);
        }
    }

    public final void r() {
        File[] fileArrListFiles;
        File file = PversionSdUtils.getFile(this.mBackgroundDir);
        if (file == null || !file.exists()) {
            HwLog.w(x, "createWearWatchFace() -- file does not exist.");
            return;
        }
        if (!file.isDirectory() || (fileArrListFiles = file.listFiles()) == null || fileArrListFiles.length <= 0) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            HwLog.d(x, "DeleteImageFile :" + file2.delete());
        }
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public void saveFileFromDevice(String str, int i) throws Throwable {
        int iIndexOf;
        String str2 = x;
        HwLog.i(str2, "saveFileFromDevice() -- enter.");
        if (TextUtils.isEmpty(str)) {
            HwLog.w(str2, "saveFileFromDevice() sourcePath is empty.");
            return;
        }
        FlavorConfig.safeHwLog(str2, "saveFileFromDevice sourcePath =" + str);
        WatchFaceWearInfo watchFaceWearInfo = this.mHwWatchFaceBtManager.getWatchFaceWearInfo();
        File file = PversionSdUtils.getFile(str);
        if (file == null || !file.exists()) {
            HwLog.i(str2, "saveFileFromDevice() -- file does not exist.");
            return;
        }
        String name = file.getName();
        HwLog.d(str2, "saveFileFromDevice() name :" + name + ",length:" + file.length());
        if (name.contains(".")) {
            name = SafeString.substring(name, 0, name.lastIndexOf("."));
        }
        String str3 = this.mBackgroundDir + name + ".png";
        if (watchFaceWearInfo.getWearStyleType() == 2) {
            WatchFaceBitmapUtil.getInstance().a(str, str3);
            HwLog.d(str2, "saveFileFromDevice() ConvertBinToPng :" + name + ".png");
        } else {
            HwLog.i(str2, "saveFileFromDevice() BackgroundTypeIsPng, copyToBackgroundDir");
            FileHelper.copyFileToParsingDir(str, str3);
        }
        List<BackgroundOptionalConfig> backgroundOptionalConfigList = this.mWatchFaceProvider.getBackgroundOptionalConfigList();
        if (backgroundOptionalConfigList == null) {
            HwLog.i(str2, "saveFileFromDevice() curBackgroundOptionalConfigList is null");
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
        BackgroundOptionalConfig backgroundOptionalConfig = new BackgroundOptionalConfig();
        backgroundOptionalConfig.setIndex(((WearStruct) this.v.get(i)).getCurStyleIndex() + "");
        backgroundOptionalConfig.setResPreview(str3);
        backgroundOptionalConfigList.add(backgroundOptionalConfig);
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public void sendWatchFaceInfoToDevice(LatonaWatchFaceThemeAlbumInfo latonaWatchFaceThemeAlbumInfo) {
        WatchFaceWearInfo watchFaceWearInfo = new WatchFaceWearInfo();
        ArrayList arrayList = new ArrayList(32);
        ArrayList arrayList2 = new ArrayList(32);
        for (BackgroundOptionalConfig backgroundOptionalConfig : latonaWatchFaceThemeAlbumInfo.getDefaultBackgroundOptionalConfigList()) {
            long jA = r2.a(backgroundOptionalConfig.getIndex(), -1L);
            if (jA != -1) {
                WearStruct wearStruct = new WearStruct();
                wearStruct.setWearStyleId(jA);
                wearStruct.setWearPreviewName(SafeString.substring(backgroundOptionalConfig.getResPreview(), backgroundOptionalConfig.getResPreview().lastIndexOf("/") + 1));
                wearStruct.setCurStyleIndex(jA);
                arrayList.add(wearStruct);
            } else {
                HwLog.w(x, "sendWatchFaceInfoToDevice() -- index cannot be string " + backgroundOptionalConfig.getIndex());
            }
        }
        List<BackgroundOptionalConfig> backgroundOptionalConfigList = latonaWatchFaceThemeAlbumInfo.getBackgroundOptionalConfigList();
        if (!ArrayUtils.isEmpty(backgroundOptionalConfigList)) {
            for (BackgroundOptionalConfig backgroundOptionalConfig2 : backgroundOptionalConfigList) {
                String strSubstring = SafeString.substring(backgroundOptionalConfig2.getResPreview(), backgroundOptionalConfig2.getResPreview().lastIndexOf("/") + 1);
                if (strSubstring.contains(".png") || strSubstring.contains(WatchFaceConstant.PREVIEW_RES)) {
                    if (HwWatchFaceBtManager.getInstance(this.mContext).getWatchFaceWearInfo().getWearStyleType() == 2) {
                        arrayList2.add(SafeString.replace(strSubstring, ".png", WatchFaceConstant.BIN_SUFFIX));
                    }
                    arrayList2.add(strSubstring);
                    arrayList.add(new WearStruct(r2.a(backgroundOptionalConfig2.getIndex(), -1L), strSubstring));
                } else {
                    HwLog.i(x, "sendWatchFaceInfoToDevice() -- filter out xml resource.");
                }
            }
        }
        ArrayList<WearStruct> arrayListE = e(arrayList);
        this.u.clear();
        this.u.addAll(arrayList2);
        watchFaceWearInfo.setWearList(arrayListE);
        watchFaceWearInfo.setWearStyleType(latonaWatchFaceThemeAlbumInfo.getWearStyleType());
        watchFaceWearInfo.setCurStyleIndex(latonaWatchFaceThemeAlbumInfo.getCurStyleIndex());
        watchFaceWearInfo.setStyleCount(latonaWatchFaceThemeAlbumInfo.getStyleCount());
        watchFaceWearInfo.setWearTypeCapability(latonaWatchFaceThemeAlbumInfo.getWearTypeCapability());
        watchFaceWearInfo.setClockTypeCapability(latonaWatchFaceThemeAlbumInfo.getClockTypeCapability());
        watchFaceWearInfo.setMaxStyleNum(latonaWatchFaceThemeAlbumInfo.getMaxStyleNum());
        c(this.u);
        b(this.u);
        this.mTransferTotalCount = 0;
        this.mTransferCompleteCount = 0;
        this.mCurrentTransferPercent = 0;
        HwDeviceConfigManager.getInstance(this.mContext).registerPhotoAndVideoCallback(this.mIAppTransferFileResultAIDLCallback, getFileType(), TransferFileReqType.DEVICE_REGISTRATION);
        this.mHwWatchFaceBtManager.saveWearInfoToDevice(watchFaceWearInfo, new IBaseResponseCallback() { // from class: com.huawei.watchface.manager.WatchFaceWearManager$$ExternalSyntheticLambda0
            @Override // com.huawei.watchface.utils.callback.IBaseResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f$0.b(i, obj);
            }
        });
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public void setTransferTotalCount(LatonaWatchFaceThemeAlbumInfo latonaWatchFaceThemeAlbumInfo) {
        this.mTransferTotalCount = 0;
        this.mTransferCompleteCount = 0;
        for (BackgroundOptionalConfig backgroundOptionalConfig : latonaWatchFaceThemeAlbumInfo.getBackgroundOptionalConfigList()) {
            Iterator it = this.s.iterator();
            do {
                if (!it.hasNext()) {
                    HwLog.d(x, "setTransferTotalCount() noContain: " + backgroundOptionalConfig.getResPreview());
                    this.mTransferTotalCount = this.mTransferTotalCount + 1;
                    break;
                }
            } while (!backgroundOptionalConfig.getResPreview().contains(((WearStruct) it.next()).getWearPreviewName()));
        }
        HwLog.i(x, "mTransferTotalCount " + this.mTransferTotalCount);
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public void setWatchFaceCallback(OperateWatchFaceCallback operateWatchFaceCallback) {
        this.mOperateWatchFaceCallback = operateWatchFaceCallback;
    }

    public void setWearSdkCallback(OnWearSdkEvent onWearSdkEvent) {
        this.p = onWearSdkEvent;
    }

    public int t() {
        WatchFaceWearInfo watchFaceWearInfo;
        HwWatchFaceBtManager hwWatchFaceBtManager = this.mHwWatchFaceBtManager;
        if (hwWatchFaceBtManager == null || (watchFaceWearInfo = hwWatchFaceBtManager.getWatchFaceWearInfo()) == null) {
            return 0;
        }
        return watchFaceWearInfo.getWearImageOption();
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public void transmitWatchFaceInfo(String str) {
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateWatchFaceCallback;
        if (operateWatchFaceCallback == null) {
            HwLog.i(x, "transmitWatchFaceInfo() mOperateWatchFaceCallback is null.");
        } else {
            operateWatchFaceCallback.transmitWatchFaceThemeWearInfo(str);
        }
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public void transmitWatchFaceInstallResult(int i) {
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateWatchFaceCallback;
        if (operateWatchFaceCallback == null) {
            HwLog.e(x, "transmitWatchFaceInstallResult() mOperateWatchFaceCallback is null.");
        } else {
            operateWatchFaceCallback.transmitWatchFaceWearInstallResult(i);
        }
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public void transmitWatchFaceLoadingProgress(String str) {
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateWatchFaceCallback;
        if (operateWatchFaceCallback == null) {
            HwLog.w(x, "notifyWatchFaceLoadingProgress() mOperateWatchFaceCallback is null.");
        } else {
            operateWatchFaceCallback.transmitWatchFaceThemeWearLoadingProgress(str);
        }
    }

    public int u() {
        WatchFaceWearInfo watchFaceWearInfo;
        HwWatchFaceBtManager hwWatchFaceBtManager = this.mHwWatchFaceBtManager;
        if (hwWatchFaceBtManager == null || (watchFaceWearInfo = hwWatchFaceBtManager.getWatchFaceWearInfo()) == null) {
            return 0;
        }
        return watchFaceWearInfo.getRectRadius();
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public void updateNativeFiles(LatonaWatchFaceThemeAlbumInfo latonaWatchFaceThemeAlbumInfo) {
        String str = x;
        HwLog.i(str, "updateNativeFiles() enter");
        File file = PversionSdUtils.getFile(this.mBackgroundDir);
        if (file == null || !file.exists()) {
            HwLog.i(str, "updateNativeFiles() -- file does not exist.");
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (ArrayUtils.isEmpty(fileArrListFiles)) {
            HwLog.w(str, "updateNativeFiles() native dir has no imageFiles.");
            return;
        }
        HwLog.i(str, "updateNativeFiles() CheckingBackgroundFiles");
        List<BackgroundOptionalConfig> backgroundOptionalConfigList = latonaWatchFaceThemeAlbumInfo.getBackgroundOptionalConfigList();
        if (ArrayUtils.isEmpty(backgroundOptionalConfigList)) {
            HwLog.i(str, "updateNativeFiles() -- backgroundOptionalConfigs is empty");
            backgroundOptionalConfigList = new ArrayList<>(32);
        }
        for (File file2 : fileArrListFiles) {
            if (ArrayUtils.a(z, file2.getName())) {
                HwLog.w(x, "updateNativeFiles() -- DEFAULT_WEAR_DIR");
            } else if (file2.getName().contains("_")) {
                Iterator<BackgroundOptionalConfig> it = backgroundOptionalConfigList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        HwLog.d(x, "updateNativeFiles() isDelete: " + FileHelper.a(file2));
                        break;
                    }
                    BackgroundOptionalConfig next = it.next();
                    int iLastIndexOf = next.getResPreview().lastIndexOf("_");
                    int iLastIndexOf2 = file2.getName().lastIndexOf("_");
                    if (iLastIndexOf != -1) {
                        if (SafeString.substring(next.getResPreview(), 0, iLastIndexOf).contains(SafeString.substring(file2.getName(), 0, iLastIndexOf2)) && !file2.getName().contains(WatchFaceConstant.BIN_SUFFIX)) {
                            break;
                        }
                    } else {
                        HwLog.w(x, "updateNativeFiles() -- backgroundResIndex = -1");
                    }
                }
            } else {
                HwLog.d(x, "updateNativeFiles() isDelete: " + FileHelper.a(file2));
            }
        }
        latonaWatchFaceThemeAlbumInfo.setBackgroundOptionalConfigList(backgroundOptionalConfigList);
    }

    public void w() {
        String str = x;
        HwLog.i(str, "reselectionWearTransmit() -- enter.");
        if (this.mOperateWatchFaceCallback == null) {
            HwLog.w(str, "reselectionWearTransmit() mOperateWatchFaceCallback is null");
        } else {
            HwLog.i(str, "reselectionWearTransmit() -- executing adapter.");
            this.mOperateWatchFaceCallback.reselectionWearTransmit();
        }
    }

    public final void a(WatchFaceWearInfo watchFaceWearInfo) {
        int styleCount = watchFaceWearInfo.getStyleCount();
        int maxStyleNum = watchFaceWearInfo.getMaxStyleNum();
        int wearStyleType = watchFaceWearInfo.getWearStyleType();
        long wearTypeCapability = watchFaceWearInfo.getWearTypeCapability();
        long curStyleIndex = watchFaceWearInfo.getCurStyleIndex();
        long clockTypeCapability = watchFaceWearInfo.getClockTypeCapability();
        if (clockTypeCapability >= 0) {
            if (this.p != null) {
                HwLog.i(x, "didGetDeviceInfoFromBt() -- mOnWearSdkEvent is not null");
                this.p.setSupportedClocks(d(Long.toBinaryString(clockTypeCapability)));
            }
            HwLog.i(x, "didGetDeviceInfoFromBt() -- support clock type.");
        } else {
            HwLog.w(x, "didGetDeviceInfoFromBt() -- clockTypeCapability is not supported.");
        }
        ArrayList<WearStruct> arrayListD = d(a(watchFaceWearInfo.getWearList(), WatchFaceConstant.BIN_SUFFIX, ".png"));
        this.mWatchFaceProvider.setWearInfo(styleCount, maxStyleNum, wearStyleType, wearTypeCapability, curStyleIndex, clockTypeCapability);
        this.s.addAll(arrayListD);
        String str = x;
        HwLog.i(str, "didGetDeviceInfoFromBt =" + GsonHelper.toJson(this.s));
        a(this.s);
        this.mTransferTotalCount = this.s.size();
        if (this.v.size() > 0) {
            HwLog.i(str, "didGetDeviceInfoFromBt() LocalImagesNotFound");
            getFileByBt(0, this.v.size(), 25, ((WearStruct) this.v.get(0)).getWearPreviewName());
            return;
        }
        HwLog.i(str, "didGetDeviceInfoFromBt() LocalExistsAllBackgroundImages");
        this.t.clear();
        for (WearStruct wearStruct : arrayListD) {
            this.t.add(new WearStruct(wearStruct.getCurStyleIndex(), wearStruct.getWearPreviewName()));
        }
        notifyWatchFaceReady(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(int i, Object obj) {
        if (i == 101) {
            onSaveSuccess(obj);
        } else if (i == 114) {
            onSaveToTransferBackgrounds(obj, 2);
        } else {
            onSaveFailed();
        }
    }

    private String b(boolean z2) {
        if (z2) {
            return WatchFaceProvider.getInstance(this.mContext).transmitWatchFaceInfo();
        }
        return this.mWatchFaceProvider.transmitLatonaWatchFaceInfo();
    }

    public final ArrayList d(String str) {
        Integer num;
        String str2 = x;
        HwLog.i(str2, "getSupportedClockCapability() -- enter.");
        ArrayList arrayList = new ArrayList();
        if (str.length() == 0) {
            HwLog.i(str2, "getSupportedClockCapability() -- supportCapability is empty.");
            return arrayList;
        }
        try {
            String string = new StringBuilder(str).reverse().toString();
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == '1' && (num = (Integer) this.q.get(Integer.valueOf(i))) != null) {
                    arrayList.add(num);
                }
            }
        } catch (Exception e) {
            HwLog.e(x, "getSupportedClockCapability() -- exception msg = " + HwLog.printException(e));
            a(20004, HwLog.printException(e));
        }
        return arrayList;
    }

    public final void a(ArrayList arrayList) {
        String str = x;
        HwLog.w(str, "checkLocalNotFoundBackground() enter");
        this.v.clear();
        List<BackgroundOptionalConfig> backgroundOptionalConfigList = this.mWatchFaceProvider.getBackgroundOptionalConfigList();
        if (backgroundOptionalConfigList == null) {
            HwLog.w(str, "checkLocalNotFoundWear() backgroundOptionalConfigList is null");
            return;
        }
        if (ArrayUtils.isEmpty(arrayList)) {
            HwLog.w(str, "checkLocalNotFoundBackground() wearStructs is empty");
            a(arrayList, backgroundOptionalConfigList);
            return;
        }
        HwLog.i(str, "checkLocalNotFoundWear =" + GsonHelper.toJson(this.t));
        if (ArrayUtils.isEmpty(this.t)) {
            HwLog.w(str, "checkLocalNotFoundBackground() backgroundPhotos is null or empty");
            this.v.addAll(a(arrayList, ".png", WatchFaceConstant.BIN_SUFFIX));
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            WearStruct wearStruct = (WearStruct) it.next();
            Iterator<BackgroundOptionalConfig> it2 = backgroundOptionalConfigList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    BackgroundOptionalConfig next = it2.next();
                    String resPreview = next.getResPreview();
                    if (SafeString.substring(resPreview, resPreview.lastIndexOf("/") + 1).contains(wearStruct.getWearPreviewName())) {
                        next.setIndex(wearStruct.getCurStyleIndex() + "");
                        break;
                    }
                } else {
                    HwLog.d(x, "checkLocalNotFoundBackground() has not: " + wearStruct.getWearPreviewName());
                    if (wearStruct.getWearPreviewName() != null) {
                        wearStruct.setWearPreviewName(SafeString.replace(wearStruct.getWearPreviewName(), ".png", WatchFaceConstant.BIN_SUFFIX));
                    }
                    this.v.add(wearStruct);
                    break;
                }
            }
        }
        a(arrayList, backgroundOptionalConfigList);
    }

    public final void a(ArrayList arrayList, List list) {
        String str = x;
        HwLog.w(str, "deleteRedundantWearData() enter");
        if (ArrayUtils.isEmpty(list)) {
            HwLog.w(str, "deleteRedundantWearData() backgroundOptionalConfigList is empty.");
            return;
        }
        if (ArrayUtils.isEmpty(arrayList)) {
            HwLog.w(str, "deleteRedundantWearData() wearStructs is empty.");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                FileHelper.b(((BackgroundOptionalConfig) it.next()).getResPreview());
            }
            this.mWatchFaceProvider.setBackgroundOptionalConfigList(null);
            return;
        }
        ArrayList<BackgroundOptionalConfig> arrayList2 = new ArrayList<>();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            BackgroundOptionalConfig backgroundOptionalConfig = (BackgroundOptionalConfig) it2.next();
            boolean z2 = false;
            String str2 = "";
            int i = 0;
            while (i < arrayList.size()) {
                WearStruct wearStruct = (WearStruct) arrayList.get(i);
                String resPreview = backgroundOptionalConfig.getResPreview();
                if (SafeString.substring(resPreview, resPreview.lastIndexOf("/") + 1).contains(wearStruct.getWearPreviewName())) {
                    backgroundOptionalConfig.setResPreview(this.mBackgroundDir + wearStruct.getWearPreviewName());
                    backgroundOptionalConfig.setIndex(wearStruct.getCurStyleIndex() + "");
                    backgroundOptionalConfig.setSortTag(i);
                    arrayList2.add(backgroundOptionalConfig);
                    str2 = resPreview;
                    z2 = true;
                    break;
                }
                i++;
                str2 = resPreview;
            }
            String str3 = x;
            HwLog.i(str3, "deleteRedundantWearData() isWatchHasFile: " + z2);
            if (!z2) {
                HwLog.d(str3, "deleteRedundantWearData() delete resPreview: " + str2 + ", isBgDeleted: " + FileHelper.b(str2));
            }
        }
        Collections.sort(arrayList2, new c(this));
        HwLog.w(x, "deleteRedundantWearData() backgroundOptionalConfigListTemp:" + GsonHelper.toJson(arrayList2));
        this.mWatchFaceProvider.setBackgroundOptionalConfigList(arrayList2);
    }

    public final void a(Properties properties, ArrayList arrayList, WearStruct wearStruct, String str) {
        String str2 = x;
        HwLog.i(str2, "getResourceInfoModel() -- enter.");
        if (properties != null && !properties.isEmpty()) {
            WearStruct wearStruct2 = new WearStruct();
            wearStruct2.setWearPreviewName(SafeString.replace(wearStruct.getWearPreviewName(), ".png", WatchFaceConstant.BIN_SUFFIX));
            wearStruct2.setWearStyleId(wearStruct.getCurStyleIndex());
            wearStruct2.setCurStyleIndex(wearStruct.getCurStyleIndex());
            Object obj = properties.get("clock_type");
            if (obj instanceof String) {
                wearStruct2.setClockType(Integer.parseInt((String) obj));
            } else {
                wearStruct2.setClockType(1);
            }
            wearStruct2.setClockResource(SafeString.replace(SafeString.replace(str, "preview.png", "wallpaper.bin"), "preview.bin", "wallpaper.bin"));
            Object obj2 = properties.get("clock_color_list");
            if (obj2 instanceof String) {
                wearStruct2.setClockColor((String) obj2);
            } else {
                wearStruct2.setClockColor("");
            }
            arrayList.add(wearStruct2);
            return;
        }
        HwLog.w(str2, "setResourceInfoModel() -- property is null or empty.");
    }

    public final Properties a(File file) {
        String str = x;
        HwLog.w(str, "loadProperties() -- enter.");
        Properties properties = new Properties();
        if (!file.exists()) {
            HwLog.w(str, "loadProperties() -- not found wallpaper resource");
            return null;
        }
        if (!file.getName().contains(WatchFaceConstant.XML_SUFFIX)) {
            HwLog.i(str, "loadProperties() -- fileName is not match with resource.");
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                properties.loadFromXML(fileInputStream);
                fileInputStream.close();
                return properties;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            HwLog.e(x, "loadProperties() -- exception msg = " + HwLog.printException((Exception) e));
            a(20005, HwLog.printException((Exception) e));
            return null;
        }
    }

    public final void a(int i, String str) {
        AnalyticsGeneralEvent analyticsGeneralEvent = new AnalyticsGeneralEvent();
        HashMap<String, String> map = new HashMap<>();
        map.put("errorCode", String.valueOf(i));
        map.put(BaseEvent.KEY_DESCINFO, i5.a(i));
        map.put(BaseEvent.KEY_CONTENTINFO, str);
        analyticsGeneralEvent.sendEvent("WATCHFACE_WEAR", map);
    }

    public void a(String str, Uri uri) {
        HwLog.i(x, "setSelectedResourcesFromPicker() -- enter");
        A = str;
        B = uri;
    }
}
