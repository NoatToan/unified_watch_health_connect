package com.huawei.watchface.manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.openalliance.ad.db.bean.ContentResource;
import com.huawei.secure.android.common.util.SafeString;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.api.HwWatchFaceBtManager;
import com.huawei.watchface.e4;
import com.huawei.watchface.f5;
import com.huawei.watchface.h1;
import com.huawei.watchface.l2;
import com.huawei.watchface.m0;
import com.huawei.watchface.mvp.model.crypt.PversionSdUtils;
import com.huawei.watchface.mvp.model.datatype.SmartPickBean;
import com.huawei.watchface.mvp.model.datatype.TransferFileReqType;
import com.huawei.watchface.mvp.model.datatype.WatchFaceColorFilterBean;
import com.huawei.watchface.mvp.model.datatype.WatchFacePhotoInfo;
import com.huawei.watchface.mvp.model.datatype.WatchFacePhotoNewInfo;
import com.huawei.watchface.mvp.model.datatype.WatchFaceSupportInfo;
import com.huawei.watchface.mvp.model.helper.GsonHelper;
import com.huawei.watchface.mvp.model.latona.LatonaWatchFaceProvider;
import com.huawei.watchface.mvp.model.latona.LatonaWatchFaceThemeAlbumInfo;
import com.huawei.watchface.mvp.model.latona.provider.ElementsProvider;
import com.huawei.watchface.mvp.model.latona.provider.WatchFaceProvider;
import com.huawei.watchface.q0;
import com.huawei.watchface.r2;
import com.huawei.watchface.utils.ArrayUtils;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.FileHelper;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.HwSfpPolicyManagerHelper;
import com.huawei.watchface.utils.WatchFaceBitmapUtil;
import com.huawei.watchface.utils.callback.IBaseResponseCallback;
import com.huawei.watchface.utils.callback.OperateWatchFaceCallback;
import com.huawei.watchface.videoedit.utils.Utils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class WatchFacePhotoAlbumManager extends BaseWatchFaceManager {
    public static final String y = "WatchFacePhotoAlbumManager";
    public static WatchFacePhotoAlbumManager z;
    public String p;
    public String q;
    public WatchFacePhotoNewInfo r;
    public ArrayList s;
    public ArrayList t;
    public ArrayList u;
    public ArrayList v;
    public List w;
    public final ArrayList x;

    public class a extends TypeToken<List<SmartPickBean>> {
        public a(WatchFacePhotoAlbumManager watchFacePhotoAlbumManager) {
        }
    }

    public class b implements IBaseResponseCallback {
        public b() {
        }

        @Override // com.huawei.watchface.utils.callback.IBaseResponseCallback
        public void onResponse(int i, Object obj) {
            WatchFacePhotoAlbumManager.this.u.clear();
            String str = WatchFacePhotoAlbumManager.y;
            HwLog.i(str, "getDeviceInfoByBt(): errorCode:" + i);
            if (i != 101) {
                HwLog.w(str, "getDeviceInfoByBt() failed :" + i);
                ArrayList<String> arrayList = new ArrayList<>(32);
                WatchFacePhotoAlbumManager.this.mWatchFaceProvider.setLatonaBackgroundNameList(arrayList);
                WatchFacePhotoAlbumManager.this.mWatchFaceProvider.setLatonaBackgroundPathList(arrayList);
                WatchFacePhotoAlbumManager.this.notifyWatchFaceReady(false);
                return;
            }
            if (obj instanceof WatchFacePhotoInfo) {
                WatchFacePhotoAlbumManager.this.a((WatchFacePhotoInfo) obj);
                return;
            }
            HwLog.w(str, "getDeviceInfoByBt() objectData is null");
            WatchFacePhotoAlbumManager.this.s.clear();
            WatchFacePhotoAlbumManager.this.r();
            WatchFacePhotoAlbumManager watchFacePhotoAlbumManager = WatchFacePhotoAlbumManager.this;
            watchFacePhotoAlbumManager.mWatchFaceProvider.setLatonaBackgroundNameList(watchFacePhotoAlbumManager.s);
            WatchFacePhotoAlbumManager.this.mWatchFaceProvider.setLatonaBackgroundPathList(new ArrayList(32));
            WatchFacePhotoAlbumManager.this.notifyWatchFaceReady(false);
        }
    }

    public WatchFacePhotoAlbumManager(Context context) {
        super(context, "/watchfacePhoto/", false);
        this.s = new ArrayList(32);
        this.t = new ArrayList(32);
        this.u = new ArrayList(32);
        this.v = new ArrayList(32);
        this.w = new ArrayList(32);
        this.x = new ArrayList(20);
        this.p = this.f30306c + "watchFaceImgCache/";
        this.q = this.f30306c + "watchFaceBackgroundCache/";
    }

    private String b(boolean z2) {
        return z2 ? WatchFaceProvider.getInstance(this.mContext).transmitWatchFaceInfo() : this.mWatchFaceProvider.transmitLatonaWatchFaceInfo();
    }

    public static WatchFacePhotoAlbumManager getInstance(Context context) {
        if (z == null) {
            synchronized (WatchFacePhotoAlbumManager.class) {
                if (z == null) {
                    z = new WatchFacePhotoAlbumManager(context.getApplicationContext());
                }
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        File[] fileArrListFiles;
        File file = new File(this.mBackgroundDir);
        if (!file.isDirectory() || (fileArrListFiles = file.listFiles()) == null || fileArrListFiles.length <= 0) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            HwLog.d(y, "DeleteImageFile :" + file2.delete());
        }
    }

    private static void s() {
        synchronized (WatchFacePhotoAlbumManager.class) {
            if (z != null) {
                HwLog.i(y, "destroyInstance() enter.");
                z = null;
            }
        }
    }

    private int w() {
        return LatonaWatchFaceProvider.getInstance(this.mContext).isSupportPositionOption() | (LatonaWatchFaceProvider.getInstance(this.mContext).isSupportStyleOption() << 1) | (LatonaWatchFaceProvider.getInstance(this.mContext).isSupportDataOption() << 2);
    }

    public void A() {
        String str = y;
        HwLog.i(str, "setBackgroundPath enter");
        D();
        this.s.clear();
        File file = new File(this.mBackgroundDir);
        if (!file.exists()) {
            HwLog.w(str, "setWatchFaceSvgPath failed, watchFaceSvgPath don't exist");
            return;
        }
        String[] list = file.list();
        if (list == null || list.length == 0) {
            HwLog.w(str, "watchFaceSvgPath childFileNames is null or not enough length");
            return;
        }
        ArrayList arrayList = new ArrayList(10);
        ArrayList<String> arrayList2 = new ArrayList<>(10);
        for (String str2 : list) {
            if (!this.mIsSyncWatchFace || !str2.endsWith(WatchFaceConstant.BIN_SUFFIX)) {
                this.s.add(str2);
                arrayList2.add(str2);
                arrayList.add(this.mBackgroundDir + str2);
            }
        }
        this.mWatchFaceProvider.setLatonaBackgroundPathList(arrayList);
        this.mWatchFaceProvider.setLatonaBackgroundNameList(arrayList2);
    }

    public void B() {
        this.s.clear();
        File file = new File(this.mBackgroundDir);
        if (!file.exists()) {
            HwLog.w(y, "setWatchFaceSvgPath failed, watchFaceSvgPath don't exist");
            return;
        }
        String[] list = file.list();
        if (list == null || list.length == 0) {
            HwLog.w(y, "watchFaceSvgPath childFileNames is null or not enough length");
            return;
        }
        for (String str : list) {
            if (!this.mIsSyncWatchFace || !str.endsWith(WatchFaceConstant.BIN_SUFFIX)) {
                if (new File(this.mBackgroundDir + File.separator + str).isDirectory()) {
                    HwLog.e(y, "setBackgroundPathNew tmp is directory:" + str);
                } else {
                    this.s.add(str);
                }
            }
        }
        if (this.r.getBackgroundList() == null) {
            HwLog.d(y, "watchFacePhotoNewInfo backgroundList is null");
            return;
        }
        for (WatchFacePhotoNewInfo.BackgroundBean backgroundBean : this.r.getBackgroundList()) {
            if (TextUtils.isEmpty(backgroundBean.getBackgroundName())) {
                return;
            }
            backgroundBean.setBackgroundPath(this.mBackgroundDir + backgroundBean.getBackgroundName());
        }
    }

    public final void C() {
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

    public final void D() {
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
            HwLog.w(y, "setDefaultBackground resourceFiles is null");
            return;
        }
        for (String str2 : this.mWatchFaceProvider.getBackgroundResourceActive()) {
            for (File file : fileArrListFiles) {
                if (file.getName().equals(str2)) {
                    this.mWatchFaceProvider.setDefaultBackground(str2, string + str2);
                }
            }
        }
    }

    public final void E() {
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

    public void F() {
        if (this.mOperateWatchFaceCallback == null) {
            HwLog.w(y, "transmitWatchFaceGoBack, mOperateWatchFaceCallback is null");
        } else {
            HwLog.i(y, "enter transmitWatchFaceGoBack");
            this.mOperateWatchFaceCallback.transmitWatchFaceGoBack();
        }
    }

    public final void G() {
        String str = y;
        HwLog.i(str, "updateBackgrounds");
        this.s.clear();
        File file = new File(this.mBackgroundDir);
        if (!file.exists()) {
            HwLog.w(str, "setWatchFaceSvgPath failed, watchFaceSvgPath don't exist");
            return;
        }
        String[] list = file.list();
        if (list == null || list.length == 0) {
            HwLog.w(str, "watchFaceSvgPath childFileNames is null or not enough length");
            return;
        }
        for (String str2 : list) {
            if (!this.mIsSyncWatchFace || !str2.endsWith(WatchFaceConstant.BIN_SUFFIX)) {
                if (new File(this.mBackgroundDir + File.separator + str2).isDirectory()) {
                    HwLog.e(y, "setBackgroundPathNew tmp is directory:" + str2);
                } else {
                    this.s.add(str2);
                }
            }
        }
    }

    public final void a(WatchFacePhotoInfo watchFacePhotoInfo) {
        int maxBackgroundImages = watchFacePhotoInfo.getMaxBackgroundImages();
        int positionIndex = watchFacePhotoInfo.getPositionIndex();
        int styleIndex = watchFacePhotoInfo.getStyleIndex();
        int dataIndex = watchFacePhotoInfo.getDataIndex();
        int backgroundType = watchFacePhotoInfo.getBackgroundType();
        boolean zIsSupportIntellectColor = watchFacePhotoInfo.isSupportIntellectColor();
        int portraitMode = watchFacePhotoInfo.getPortraitMode();
        int portPositionIndex = watchFacePhotoInfo.getPortPositionIndex();
        ArrayList<String> backgroundList = watchFacePhotoInfo.getBackgroundList();
        A();
        String str = y;
        HwLog.i(str, "didGetDeviceInfoFromBt() WatchFacePhotoInfo: " + GsonHelper.toJson(watchFacePhotoInfo));
        this.mWatchFaceProvider.setLatonaThemeAlbumInfo(String.valueOf(positionIndex), String.valueOf(styleIndex), String.valueOf(dataIndex), backgroundType, String.valueOf(maxBackgroundImages), zIsSupportIntellectColor, String.valueOf(portraitMode), String.valueOf(portPositionIndex));
        this.u.addAll(backgroundList);
        a(this.u);
        this.mTransferTotalCount = this.v.size();
        this.mWatchFaceProvider.setPortModeList(a((List) watchFacePhotoInfo.getPortraitModeList()));
        this.mWatchFaceProvider.setPortPositionIndeList(a((List) watchFacePhotoInfo.getPortPositionIndexList()));
        if (this.v.size() > 0) {
            HwLog.i(str, "didGetDeviceInfoFromBt() LocalImagesNotFound");
            getFileByBt(0, this.v.size(), 1, (String) this.v.get(0));
            return;
        }
        HwLog.i(str, "didGetDeviceInfoFromBt() LocalExistsAllBackgroundImages");
        this.s.clear();
        this.s.addAll(watchFacePhotoInfo.getBackgroundList());
        ArrayList arrayList = new ArrayList(32);
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            arrayList.add(this.mBackgroundDir + ((String) it.next()));
        }
        this.mWatchFaceProvider.setLatonaBackgroundNameList(this.s);
        this.mWatchFaceProvider.setLatonaBackgroundPathList(arrayList);
        notifyWatchFaceReady(false);
    }

    public final /* synthetic */ void c(int i, Object obj) {
        HwLog.i(y, "sendWatchFaceInfoToDeviceV2() resultCode: " + i);
        if (i == 101) {
            onSaveSuccess(obj);
            b(this.x);
        } else if (i == 111) {
            onSaveToTransferBackgrounds(obj, 1);
        } else {
            onSaveFailed();
        }
    }

    public void choosePicToClip() {
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateWatchFaceCallback;
        if (operateWatchFaceCallback == null) {
            HwLog.w(y, "choosePicToClip() failed mOperateWatchFaceCallback is null");
        } else {
            operateWatchFaceCallback.chooseToClip(0, false);
        }
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public void clearInvalidData() {
        this.mWatchFaceProvider.setVideoStructs(null);
        this.mWatchFaceProvider.setDefaultVideoStructs(null);
        this.mWatchFaceProvider.setDefaultBackgroundOptionalConfigList(null);
        this.mWatchFaceProvider.setBackgroundOptionalConfigList(null);
    }

    public void d(String str) {
        File[] fileArrListFiles;
        File file = new File(this.q);
        if (!file.isDirectory() || (fileArrListFiles = file.listFiles()) == null || fileArrListFiles.length == 0) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (!TextUtils.equals(file2.getName(), str)) {
                HwLog.d(y, "DeleteWatchFaceImgCacheFile :" + file2.getName() + ",delete:" + file2.delete());
            }
        }
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public boolean devicesCallbackFileInfoCheckFail(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString(ContentResource.FILE_NAME);
            int iOptInt = jSONObject.optInt("fileType");
            if (TextUtils.isEmpty(strOptString)) {
                HwLog.i(y, "devicesCallbackFileInfoCheckFail -- fileName is empty");
                return true;
            }
            if (iOptInt == 3) {
                if (!ArrayUtils.isEmpty(this.x)) {
                    return !this.x.contains(strOptString);
                }
                HwLog.i(y, "devicesCallbackFileInfoCheckFail -- mBackgroundList is empty");
                return true;
            }
            HwLog.i(y, "devicesCallbackFileInfoCheckFail -- fileType: " + iOptInt);
            return true;
        } catch (JSONException e) {
            HwLog.e(y, "devicesCallbackFileInfoCheckFail -- JSONException" + HwLog.printException((Exception) e));
            return true;
        }
    }

    public String e(String str) throws Throwable {
        String str2 = y;
        HwLog.d(str2, "getColorPictures enter");
        try {
            WatchFaceColorFilterBean watchFaceColorFilterBean = (WatchFaceColorFilterBean) GsonHelper.fromJson(str, WatchFaceColorFilterBean.class);
            if (watchFaceColorFilterBean == null) {
                HwLog.d(str2, "colorFilterBean is null");
                return str;
            }
            int type = watchFaceColorFilterBean.getType();
            HwLog.d(str2, "colorFilterBean type:" + type);
            List<WatchFaceColorFilterBean.WatchFaceBackgroundBean> watchFaceBgArr = watchFaceColorFilterBean.getWatchFaceBgArr();
            if (watchFaceBgArr == null) {
                HwLog.d(str2, "watchFaceBgArr is null");
                return str;
            }
            for (int i = 0; i < watchFaceBgArr.size(); i++) {
                WatchFaceColorFilterBean.WatchFaceBackgroundBean watchFaceBackgroundBean = watchFaceBgArr.get(i);
                String strA = "";
                if (type == 2) {
                    String strA2 = !TextUtils.isEmpty(watchFaceBackgroundBean.getSourceUrl()) ? a(watchFaceBackgroundBean.getSourceUrl(), watchFaceBackgroundBean.getFileName(), this.p, true) : FileHelper.a(watchFaceBackgroundBean.getBase64(), watchFaceBackgroundBean.getFileName(), this.p, true);
                    if (!TextUtils.isEmpty(strA2)) {
                        String strA3 = a(strA2, watchFaceBackgroundBean.getColorStr(), watchFaceBackgroundBean.getFileName(), type);
                        watchFaceBackgroundBean.setBase64("");
                        strA = strA3;
                    }
                } else if (type == 1) {
                    strA = a(watchFaceBackgroundBean.getFilePath(), watchFaceBackgroundBean.getColorStr(), watchFaceBackgroundBean.getFileName(), type);
                }
                watchFaceBackgroundBean.setResultPath(strA);
            }
            HwLog.d(y, "getColorPictures return");
            return GsonHelper.toJson(watchFaceColorFilterBean);
        } catch (Exception e) {
            HwLog.d(y, "getColorPictures Exception:" + HwLog.printException(e));
            return str;
        }
    }

    public String getBgPath() {
        return this.mBackgroundDir;
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public void getDeviceInfoByBt() {
        HwLog.i(y, "getDeviceInfoByBt() enter.");
        this.mHwWatchFaceBtManager.getWatchFacePhotoInfo(w(), new b());
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public List getFileType() {
        if (!Utils.isEmpty(this.w)) {
            return this.w;
        }
        this.w.add(3);
        return this.w;
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public void getNextFileByBt(int i) {
        getFileByBt(i, this.v.size(), 1, (String) this.v.get(i));
    }

    public final Rect i(String str) {
        Rect rect = new Rect();
        if (TextUtils.isEmpty(str)) {
            HwLog.w(y, "getRect -- positionRect is empty");
            return rect;
        }
        if (!str.contains(",")) {
            HwLog.w(y, "getRect -- positionRect not contains ,");
            return rect;
        }
        String[] strArrSplit = str.split(",");
        if (ArrayUtils.isEmpty(strArrSplit) || strArrSplit.length != 4) {
            HwLog.w(y, "getRect -- positionRectArray length not 4");
            return rect;
        }
        rect.left = r2.a(strArrSplit[0], 0);
        rect.top = r2.a(strArrSplit[1], 0);
        rect.right = r2.a(strArrSplit[2], 0);
        rect.bottom = r2.a(strArrSplit[3], 0);
        return rect;
    }

    public String j(String str) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            HwLog.w(y, "getSmartPictureList -- resJsonStr is empty");
            return "";
        }
        List<SmartPickBean> list = (List) GsonHelper.fromJsonToArray(str, new a(this).getType());
        if (ArrayUtils.isEmpty(list)) {
            HwLog.w(y, "getSmartPictureList -- smartPickBeanList is empty");
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (SmartPickBean smartPickBean : list) {
            SmartPickBean smartPickBean2 = new SmartPickBean();
            smartPickBean2.setWatchFaceBgPath(smartPickBean.getWatchFaceBgPath());
            smartPickBean2.setPositionRect(smartPickBean.getPositionRect());
            String[] strArrA = a(smartPickBean.getWatchFaceBgPath(), smartPickBean.getPositionRect(), smartPickBean.getResPreviewPath(), smartPickBean.getSourceUrl(), -1);
            smartPickBean2.setResPreviewPath(strArrA[0]);
            smartPickBean2.setColorString(strArrA[1]);
            if (!TextUtils.isEmpty(smartPickBean.getResFeaturePath())) {
                smartPickBean2.setResFeaturePath(a(smartPickBean.getWatchFaceBgPath(), smartPickBean.getPositionRect(), smartPickBean.getResFeaturePath(), smartPickBean.getSourceUrl(), TextUtils.isEmpty(strArrA[1]) ? -1 : Color.parseColor(strArrA[1]))[0]);
            }
            arrayList.add(smartPickBean2);
        }
        HwLog.i(y, "getSmartPictureList -- data deal success");
        return GsonHelper.toJson(arrayList);
    }

    public void k(String str) throws Throwable {
        if (Math.abs(System.currentTimeMillis() - this.l) < 1000) {
            HwLog.i(y, "saveWatchFaceInfoV2 disabled Click");
            return;
        }
        this.l = System.currentTimeMillis();
        try {
            f5.c(String.valueOf(System.currentTimeMillis()));
            LatonaWatchFaceThemeAlbumInfo latonaWatchFaceThemeAlbumInfo = (LatonaWatchFaceThemeAlbumInfo) GsonHelper.fromJson(str, LatonaWatchFaceThemeAlbumInfo.class);
            ArrayList<String> backgroundList = latonaWatchFaceThemeAlbumInfo.getBackgroundList();
            ArrayList<String> arrayList = latonaWatchFaceThemeAlbumInfo.getmPortraitModeList();
            if (backgroundList == null) {
                HwLog.w(y, "saveWatchFaceInfoV2() watchFaceInfo is null.");
                return;
            }
            HwLog.i(y, "saveWatchFaceInfoV2() isClickSaveButton.");
            o();
            d(backgroundList);
            c(backgroundList);
            b(backgroundList, arrayList);
        } catch (Exception e) {
            HwLog.e(y, "saveWatchFaceInfoV2() exception occured :" + HwLog.printException(e));
            d();
        }
    }

    public void l(String str) {
        String str2 = y;
        HwLog.d(str2, "syncDeviceInfoByBt");
        try {
            WatchFacePhotoNewInfo watchFacePhotoNewInfo = (WatchFacePhotoNewInfo) GsonHelper.fromJson(str, WatchFacePhotoNewInfo.class);
            this.r = watchFacePhotoNewInfo;
            if (watchFacePhotoNewInfo == null) {
                HwLog.d(str2, "watchFacePhotoNewInfo is null");
                return;
            }
            HwWatchFaceBtManager hwWatchFaceBtManager = this.mHwWatchFaceBtManager;
            if (hwWatchFaceBtManager != null && hwWatchFaceBtManager.getWatchFacePhotoInfo() != null) {
                this.mHwWatchFaceBtManager.getWatchFacePhotoInfo().setBackgroundType(this.r.getBackgroundImageType());
                this.mHwWatchFaceBtManager.getWatchFacePhotoInfo().setBgImageOption(this.r.getBackgroundImageOption());
            }
            B();
            if (this.mIsSyncWatchFace) {
                return;
            }
            this.mTransferCompleteCount = 0;
            this.mCurrentTransferPercent = 0;
            a(this.r);
        } catch (Exception e) {
            HwLog.d(y, "syncDeviceInfoByBt Exception" + HwLog.printException(e));
        }
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public void notifyWatchFaceReady(boolean z2) {
        OperateWatchFaceCallback operateWatchFaceCallback;
        this.mIsSyncWatchFace = false;
        G();
        if (this.f30305b && this.mOperateWatchFaceCallback != null) {
            HwLog.i(y, "transmitWatchFaceThemeAlbumInfo watchFacePhotoNewInfo");
            this.mOperateWatchFaceCallback.transmitWatchFaceThemeAlbumInfo(new Gson().toJson(this.r));
            return;
        }
        String strB = b(false);
        if (z2 || (operateWatchFaceCallback = this.mOperateWatchFaceCallback) == null) {
            notifyH5Ready(strB);
        } else {
            operateWatchFaceCallback.transmitWatchFaceThemeAlbumInfo(strB);
        }
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public void onDestroy() {
        HwLog.i(y, "onDestroy() enter.");
        super.onDestroy();
        s();
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public void parseCustomWatchFaceConfig(ElementsProvider elementsProvider) {
        E();
        C();
        A();
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public void preTransferFinish() {
        this.mWatchFaceProvider.setLatonaBackgroundNameList(this.u);
    }

    public void q() {
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateWatchFaceCallback;
        if (operateWatchFaceCallback == null) {
            HwLog.w(y, "choosePicToH5Clip() failed mOperateWatchFaceCallback is null");
        } else {
            operateWatchFaceCallback.chooseToClip(0, true);
        }
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public void saveFileFromDevice(String str, int i) throws Throwable {
        if (str == null) {
            HwLog.w(y, "saveFileFromDevice() Source Path is null");
            return;
        }
        WatchFacePhotoInfo watchFacePhotoInfo = this.mHwWatchFaceBtManager.getWatchFacePhotoInfo();
        String str2 = y;
        HwLog.i(str2, "saveFileFromDevice() WatchFacePhotoInfo: " + GsonHelper.toJson(watchFacePhotoInfo));
        File file = new File(str);
        String name = file.getName();
        HwLog.d(str2, "saveFileFromDevice() name :" + name + ",length:" + file.length());
        boolean z2 = false;
        if (name.contains(".")) {
            name = SafeString.substring(name, 0, name.lastIndexOf("."));
        }
        String str3 = this.mBackgroundDir + name + ".png";
        int iIndexOf = watchFacePhotoInfo.getBackgroundList().indexOf(name + ".png");
        if (iIndexOf != -1 && watchFacePhotoInfo.getPortraitModeList().size() > 0) {
            try {
                if (watchFacePhotoInfo.getPortraitModeList().get(iIndexOf).intValue() != 0) {
                    z2 = true;
                }
            } catch (Exception e) {
                HwLog.i(y, "getBackgroundList() portraitMode error: " + HwLog.printException(e));
            }
        }
        String str4 = y;
        HwLog.i(str4, "getBackgroundList() portraitMode isPortrait: " + z2);
        if (watchFacePhotoInfo.getBackgroundType() == 2) {
            WatchFaceBitmapUtil.getInstance().a(str, str3);
        } else {
            HwLog.i(str4, "Background Type Is Png, copyToBackgroundDir");
            FileHelper.copyFileToParsingDir(str, str3);
        }
        List<String> latonaBackgroundPathList = this.mWatchFaceProvider.getLatonaBackgroundPathList();
        ArrayList arrayList = new ArrayList(32);
        if (!ArrayUtils.isEmpty(latonaBackgroundPathList)) {
            arrayList.addAll(latonaBackgroundPathList);
        }
        if (ArrayUtils.isEmpty(latonaBackgroundPathList) || !latonaBackgroundPathList.contains(str3)) {
            arrayList.add(str3);
            this.mWatchFaceProvider.setLatonaBackgroundPathList(arrayList);
        }
        WatchFacePhotoNewInfo watchFacePhotoNewInfo = this.r;
        if (watchFacePhotoNewInfo == null || watchFacePhotoNewInfo.getBackgroundList() == null || this.r.getBackgroundList().isEmpty()) {
            return;
        }
        for (WatchFacePhotoNewInfo.BackgroundBean backgroundBean : this.r.getBackgroundList()) {
            if (TextUtils.isEmpty(backgroundBean.getBackgroundName())) {
                return;
            }
            if (backgroundBean.getBackgroundName().contains(name)) {
                backgroundBean.setBackgroundPath(str3);
            }
        }
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public void sendWatchFaceInfoToDevice(LatonaWatchFaceThemeAlbumInfo latonaWatchFaceThemeAlbumInfo) throws Throwable {
        HwLog.i(y, "sendWatchFaceInfoToDevice() enter.");
        WatchFacePhotoInfo watchFacePhotoInfo = new WatchFacePhotoInfo();
        ArrayList<String> arrayList = new ArrayList<>(32);
        ArrayList<String> backgroundList = latonaWatchFaceThemeAlbumInfo.getBackgroundList();
        ArrayList<String> arrayList2 = latonaWatchFaceThemeAlbumInfo.getmPortraitModeList();
        if (backgroundList.size() > 0) {
            arrayList.addAll(backgroundList);
        }
        this.x.clear();
        this.x.addAll(arrayList);
        watchFacePhotoInfo.setBackgroundList(arrayList);
        watchFacePhotoInfo.setStyleIndex(Integer.parseInt(latonaWatchFaceThemeAlbumInfo.getStyleIndex()));
        watchFacePhotoInfo.setDataIndex(Integer.parseInt(latonaWatchFaceThemeAlbumInfo.getDataIndex()));
        if (latonaWatchFaceThemeAlbumInfo.getPositionIndex() != null) {
            watchFacePhotoInfo.setPositionIndex(Integer.parseInt(latonaWatchFaceThemeAlbumInfo.getPositionIndex()));
        } else {
            watchFacePhotoInfo.setPositionIndex(1);
        }
        a(backgroundList, arrayList2);
        this.mTransferTotalCount = 0;
        this.mTransferCompleteCount = 0;
        this.mCurrentTransferPercent = 0;
        HwDeviceConfigManager.getInstance(this.mContext).registerPhotoAndVideoCallback(this.mIAppTransferFileResultAIDLCallback, getFileType(), TransferFileReqType.DEVICE_REGISTRATION);
        this.mHwWatchFaceBtManager.savePhotoInfoToDevice(watchFacePhotoInfo, latonaWatchFaceThemeAlbumInfo, new IBaseResponseCallback() { // from class: com.huawei.watchface.manager.WatchFacePhotoAlbumManager$$ExternalSyntheticLambda0
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
        Iterator<String> it = latonaWatchFaceThemeAlbumInfo.getBackgroundList().iterator();
        while (it.hasNext()) {
            if (!this.u.contains(it.next())) {
                this.mTransferTotalCount++;
            }
        }
        HwLog.i(y, "setTransferTotalCount() BeforeSave, willTransfer TotalBgCount =" + this.mTransferTotalCount);
    }

    public String t() {
        HwWatchFaceBtManager hwWatchFaceBtManager = this.mHwWatchFaceBtManager;
        if (hwWatchFaceBtManager == null) {
            HwLog.w(y, "mHwWatchBtFaceManager is null");
            return "";
        }
        String photoPackageName = hwWatchFaceBtManager.getPhotoPackageName();
        HwLog.i(y, "getAlbumPackageName:" + photoPackageName);
        return photoPackageName;
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public void transmitWatchFaceInfo(String str) {
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateWatchFaceCallback;
        if (operateWatchFaceCallback == null) {
            HwLog.i(y, "transmitWatchFaceInfo() mOperateWatchFaceCallback is null.");
        } else {
            operateWatchFaceCallback.transmitWatchFaceThemeAlbumInfo(str);
        }
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public void transmitWatchFaceInstallResult(int i) {
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateWatchFaceCallback;
        if (operateWatchFaceCallback == null) {
            HwLog.e(y, "transmitWatchFaceInstallResult() mOperateWatchFaceCallback is null.");
        } else {
            operateWatchFaceCallback.transmitWatchFaceAlbumInstallResult(i);
        }
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public void transmitWatchFaceLoadingProgress(String str) {
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateWatchFaceCallback;
        if (operateWatchFaceCallback == null) {
            HwLog.w(y, "notifyWatchFaceLoadingProgress() mOperateWatchFaceCallback is null.");
        } else {
            operateWatchFaceCallback.transmitWatchFaceThemeAlbumLoadingProgress(str);
        }
    }

    @Override // com.huawei.watchface.manager.BaseWatchFaceManager
    public void updateNativeFiles(LatonaWatchFaceThemeAlbumInfo latonaWatchFaceThemeAlbumInfo) {
        String str = y;
        HwLog.i(str, "updateNativeFiles() enter");
        File[] fileArrListFiles = new File(this.mBackgroundDir).listFiles();
        if (fileArrListFiles == null) {
            HwLog.w(str, "updateNativeFiles() BackgroundsDirContainsNoFile");
            return;
        }
        HwLog.i(str, "updateNativeFiles() CheckingBackgroundFiles");
        ArrayList<String> backgroundList = latonaWatchFaceThemeAlbumInfo.getBackgroundList();
        if (backgroundList == null) {
            backgroundList = new ArrayList<>(32);
        }
        for (File file : fileArrListFiles) {
            String name = file.getName();
            boolean zContains = backgroundList.contains(name);
            boolean zContains2 = backgroundList.contains(SafeString.replace(SafeString.replace(SafeString.replace(SafeString.replace(name, BaseWatchFaceManager.ORIGINBG_SUFFIX, ""), BaseWatchFaceManager.ORIGINFG_SUFFIX, ""), BaseWatchFaceManager.FG_SUFFIX, ""), BaseWatchFaceManager.BG_SUFFIX, ""));
            if (!zContains && !zContains2) {
                HwLog.d(y, "updateNativeFiles() DeleteBackgroundFile :" + name + ",delete :" + file.delete());
            }
        }
        latonaWatchFaceThemeAlbumInfo.setBackgroundList(backgroundList);
        HwLog.i(y, "updateNativeFiles() CheckBackgroundFilesFinish");
    }

    public int v() {
        HwWatchFaceBtManager hwWatchFaceBtManager = this.mHwWatchFaceBtManager;
        if (hwWatchFaceBtManager != null) {
            return hwWatchFaceBtManager.getWatchFacePhotoInfo().getBgImageOption();
        }
        return 0;
    }

    public String x() {
        return this.q;
    }

    public String y() {
        return this.p;
    }

    public boolean z() {
        return this.f30305b;
    }

    public final String f(String str) {
        String str2;
        if (!str.contains("/")) {
            return "";
        }
        String[] strArrSplit = str.split("/");
        if (ArrayUtils.isEmpty(strArrSplit) || (str2 = strArrSplit[strArrSplit.length - 1]) == null || !str2.contains(".")) {
            return "";
        }
        String[] strArrSplit2 = str2.split("[.]");
        return !ArrayUtils.isEmpty(strArrSplit2) ? strArrSplit2[0] : "";
    }

    public final String g(String str) {
        if (!str.contains(",")) {
            return "";
        }
        String[] strArrSplit = str.split(",");
        if (ArrayUtils.isEmpty(strArrSplit)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrSplit) {
            sb.append(str2);
        }
        return sb.toString();
    }

    public final String h(String str) {
        if (!str.contains("/")) {
            return "";
        }
        String[] strArrSplit = str.split("/");
        return !ArrayUtils.isEmpty(strArrSplit) ? strArrSplit[strArrSplit.length - 1] : "";
    }

    public String u() {
        File file = new File(this.q);
        if (!file.exists()) {
            HwLog.w(y, "getAlbumPreviewPath failed, mBackgroundDir don't exist");
            return "";
        }
        String strA = e4.a(q0.g(), "album_background", (String) null);
        if (strA != null) {
            String[] list = file.list();
            if (list == null || list.length == 0) {
                HwLog.w(y, "getAlbumPreviewPath childFileNames is null or not enough length");
                return "";
            }
            Arrays.sort(list);
            for (int length = list.length - 1; length >= 0; length--) {
                if (strA.contains(list[length])) {
                    HwLog.d(y, "getAlbumPreviewPath file name:" + list[length]);
                    return this.q + list[length];
                }
            }
        }
        return "";
    }

    public final /* synthetic */ void b(int i, Object obj) {
        HwLog.i(y, "sendWatchFaceInfoToDevice() resultCode: " + i);
        if (i == 101) {
            onSaveSuccess(obj);
            G();
        } else if (i == 111) {
            onSaveToTransferBackgrounds(obj, 1);
        } else {
            onSaveFailed();
        }
    }

    public final void c(ArrayList arrayList) {
        if (ArrayUtils.isEmpty(arrayList)) {
            return;
        }
        this.mTransferTotalCount = 0;
        this.mTransferCompleteCount = 0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!this.u.contains((String) it.next())) {
                this.mTransferTotalCount++;
            }
        }
        HwLog.i(y, "setTransferTotalCountV2() BeforeSave, willTransfer TotalBgCount =" + this.mTransferTotalCount);
    }

    public final void b(ArrayList arrayList, ArrayList arrayList2) throws Throwable {
        HwLog.i(y, "sendWatchFaceInfoToDeviceV2() enter.");
        new WatchFacePhotoInfo();
        ArrayList arrayList3 = new ArrayList(32);
        if (arrayList.size() > 0) {
            arrayList3.addAll(arrayList);
        }
        this.x.clear();
        this.x.addAll(arrayList3);
        a(arrayList, arrayList2);
        this.mTransferTotalCount = 0;
        this.mTransferCompleteCount = 0;
        this.mCurrentTransferPercent = 0;
        HwDeviceConfigManager.getInstance(this.mContext).registerPhotoAndVideoCallback(this.mIAppTransferFileResultAIDLCallback, getFileType(), TransferFileReqType.DEVICE_REGISTRATION);
        this.mHwWatchFaceBtManager.setPhotoInfoToDeviceCallback(new IBaseResponseCallback() { // from class: com.huawei.watchface.manager.WatchFacePhotoAlbumManager$$ExternalSyntheticLambda2
            @Override // com.huawei.watchface.utils.callback.IBaseResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f$0.c(i, obj);
            }
        });
        this.mOperateWatchFaceCallback.transmitWatchFaceAlbumApplyResult(1);
    }

    public final void d(ArrayList arrayList) {
        File[] fileArrListFiles = new File(this.mBackgroundDir).listFiles();
        if (fileArrListFiles == null) {
            HwLog.w(y, "updateNativeFiles() BackgroundsDirContainsNoFile");
            return;
        }
        HwLog.i(y, "updateNativeFiles() CheckingBackgroundFiles");
        if (arrayList == null) {
            arrayList = new ArrayList(32);
        }
        for (File file : fileArrListFiles) {
            String name = file.getName();
            boolean zContains = arrayList.contains(name);
            boolean zContains2 = arrayList.contains(SafeString.replace(SafeString.replace(SafeString.replace(SafeString.replace(name, BaseWatchFaceManager.ORIGINBG_SUFFIX, ""), BaseWatchFaceManager.ORIGINFG_SUFFIX, ""), BaseWatchFaceManager.FG_SUFFIX, ""), BaseWatchFaceManager.BG_SUFFIX, ""));
            if (!zContains && !zContains2) {
                HwLog.d(y, "updateNativeFiles() DeleteBackgroundFile :" + name + "delete :" + file.delete());
            }
        }
    }

    public void c(int i, int i2) {
        HwLog.i(y, "sendWatchFaceInfoToDevice() resultCode: " + i);
        if (i == 101) {
            onSaveSuccess(Integer.valueOf(i2));
            b(this.x);
            this.mHwWatchFaceBtManager.removePhotoCallback();
        } else if (i == 111) {
            onSaveToTransferBackgrounds(Integer.valueOf(i2), 1);
        } else {
            onSaveFailed();
            this.mHwWatchFaceBtManager.removePhotoCallback();
        }
    }

    public final void a(WatchFacePhotoNewInfo watchFacePhotoNewInfo) {
        this.u.clear();
        ArrayList<WatchFacePhotoNewInfo.BackgroundBean> backgroundList = watchFacePhotoNewInfo.getBackgroundList();
        if (backgroundList != null && !backgroundList.isEmpty()) {
            for (WatchFacePhotoNewInfo.BackgroundBean backgroundBean : backgroundList) {
                if (!TextUtils.isEmpty(backgroundBean.getBackgroundName())) {
                    this.u.add(backgroundBean.getBackgroundName());
                }
            }
            a(this.u);
            this.mTransferTotalCount = this.v.size();
            String str = y;
            HwLog.i(str, "syncDeviceInfoFromBt() mNoContainsPhotos: " + GsonHelper.toJson(this.v));
            if (this.v.size() > 0) {
                HwLog.i(str, "syncDeviceInfoFromBt() LocalImagesNotFound");
                getFileByBt(0, this.v.size(), 1, (String) this.v.get(0));
                return;
            }
            HwLog.i(str, "syncDeviceInfoFromBt() LocalExistsAllBackgroundImages");
            this.t.clear();
            this.t.addAll(backgroundList);
            for (WatchFacePhotoNewInfo.BackgroundBean backgroundBean2 : this.t) {
                backgroundBean2.setBackgroundPath(this.mBackgroundDir + backgroundBean2.getBackgroundName());
            }
            this.r.setBackgroundList(this.t);
            notifyWatchFaceReady(false);
            return;
        }
        HwLog.d(y, "backgrounds is null or empty");
    }

    public final void e(ArrayList arrayList) {
        String str = y;
        HwLog.d(str, "updatePhotoOrgCache");
        if (arrayList == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMapE = l2.e();
        if (concurrentHashMapE == null) {
            HwLog.d(str, "orgMap is null");
            return;
        }
        Iterator it = concurrentHashMapE.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!arrayList.contains(entry.getKey())) {
                it.remove();
                HwLog.d(y, "remove cache:" + ((String) entry.getKey()));
            }
        }
        e4.b("watchfacePhotoOrgKey", new Gson().toJson(concurrentHashMapE), "album_background");
    }

    public final void b(ArrayList arrayList) {
        G();
        e(arrayList);
    }

    public final ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        if (list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf((Integer) it.next()));
            }
        }
        return arrayList;
    }

    private void a(ArrayList arrayList) {
        this.v.clear();
        HwSfpPolicyManagerHelper.setFilePathLabel(this.mBackgroundDir);
        if (arrayList == null) {
            HwLog.w(y, "checkLocalNotFoundBackground() backgrounds is null");
            return;
        }
        ArrayList arrayList2 = this.s;
        if (arrayList2 != null && arrayList2.size() != 0) {
            HwLog.i(y, "checkLocalNotFoundBackground backgrounds=" + GsonHelper.toJson(arrayList));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                String strReplace = SafeString.replace(str, ".png", "_fg.png");
                if (!this.s.contains(str) && !this.s.contains(strReplace)) {
                    this.v.add(str);
                }
            }
            ArrayList arrayList3 = new ArrayList(32);
            for (String str2 : this.s) {
                File file = new File(this.mBackgroundDir + str2);
                if (file.exists()) {
                    boolean isTaskExecuting = HwWatchFaceApi.getInstance(this.mContext).getIsTaskExecuting();
                    if (!arrayList.contains(SafeString.replace(SafeString.replace(SafeString.replace(SafeString.replace(str2, BaseWatchFaceManager.ORIGINFG_SUFFIX, ""), BaseWatchFaceManager.ORIGINBG_SUFFIX, ""), BaseWatchFaceManager.FG_SUFFIX, ""), BaseWatchFaceManager.BG_SUFFIX, "")) && !isTaskExecuting) {
                        HwLog.i(y, "checkLocalNotFoundBackground() file delete: " + str2);
                        CommonUtils.a(file);
                    } else if (str2.endsWith(".png") && !str2.contains(BaseWatchFaceManager.FG_SUFFIX) && !str2.contains(BaseWatchFaceManager.BG_SUFFIX) && !str2.contains(BaseWatchFaceManager.ORIGINBG_SUFFIX) && !str2.contains(BaseWatchFaceManager.ORIGINFG_SUFFIX)) {
                        HwLog.i(y, "checkLocalNotFoundBackground() " + str2);
                        arrayList3.add(this.mBackgroundDir + str2);
                    } else {
                        HwLog.i(y, "checkLocalNotFoundBackground() not added: " + str2);
                    }
                }
            }
            this.mWatchFaceProvider.setLatonaBackgroundPathList(arrayList3);
            return;
        }
        HwLog.w(y, "checkLocalNotFoundBackground() backgroundPhotos is null or empty");
        this.v.addAll(arrayList);
    }

    public final void a(ArrayList arrayList, ArrayList arrayList2) throws Throwable {
        String str;
        int i;
        int watchFaceHeight;
        int iV = v();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            String str2 = (String) arrayList.get(i2);
            HwLog.i(y, "createBinBackground :name= " + str2);
            if (str2.endsWith(".png")) {
                try {
                    str = (String) arrayList2.get(i2);
                } catch (Exception e) {
                    HwLog.e(y, "createBinBackground Exception:" + HwLog.printException(e));
                    str = "0";
                }
                HwLog.i(y, "createBinBackground mode = " + str);
                WatchFaceSupportInfo watchFaceSupportInfo = this.mHwWatchFaceBtManager.getWatchFaceSupportInfo();
                if (watchFaceSupportInfo != null) {
                    int watchFaceWidth = watchFaceSupportInfo.getWatchFaceWidth();
                    watchFaceHeight = watchFaceSupportInfo.getWatchFaceHeight();
                    i = watchFaceWidth;
                } else {
                    i = 0;
                    watchFaceHeight = 0;
                }
                if (str.equalsIgnoreCase("0")) {
                    String str3 = this.mBackgroundDir + str2;
                    WatchFaceSupportInfo watchFaceSupportInfo2 = HwWatchFaceBtManager.getInstance(this.mContext).getWatchFaceSupportInfo();
                    if (watchFaceSupportInfo2 != null && watchFaceSupportInfo2.isPortraitModeSupported()) {
                        WatchFaceBitmapUtil.getInstance().cropPngToRound(str3);
                    }
                    WatchFaceBitmapUtil.getInstance().a(str3, this.mBackgroundDir + SafeString.replace(str2, ".png", WatchFaceConstant.BIN_SUFFIX), iV, i, watchFaceHeight);
                } else if (str.equalsIgnoreCase("1") || str.equalsIgnoreCase("2")) {
                    WatchFaceBitmapUtil.getInstance().a(this.mBackgroundDir + SafeString.replace(str2, ".png", "") + "_fg.png", this.mBackgroundDir + SafeString.replace(str2, ".png", "") + "_bg.png", this.mBackgroundDir + SafeString.replace(str2, ".png", WatchFaceConstant.BIN_SUFFIX), iV, i, watchFaceHeight);
                }
            }
        }
    }

    public void a(String str, String str2, String str3, String str4, String str5) {
        if (this.mOperateWatchFaceCallback == null) {
            HwLog.w(y, "obtainWidgetColor failed mOperateWatchFaceCallback is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            HwLog.w(y, "obtainWidgetColor failed watchFacePath is null");
            return;
        }
        try {
            int i = Integer.parseInt(str2);
            int i2 = Integer.parseInt(str3);
            int i3 = Integer.parseInt(str4);
            int i4 = Integer.parseInt(str5);
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(CommonUtils.filterFilePath(str));
            if (bitmapDecodeFile == null) {
                HwLog.w(y, "obtainWidgetColor failed bitmap is null");
            } else {
                this.mOperateWatchFaceCallback.transmitWatchFaceTimeWidgetColor(m0.a(bitmapDecodeFile, new Rect(i, i2, i3, i4)));
            }
        } catch (NumberFormatException unused) {
            HwLog.e(y, "obtainWidgetColor NumberFormatException");
        } catch (Exception unused2) {
            HwLog.e(y, "obtainWidgetColor exception");
        } catch (OutOfMemoryError e) {
            HwLog.e(y, "obtainWidgetColor OutOfMemoryError " + HwLog.printException((Error) e));
        }
    }

    public String a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            String strF = f(str);
            String strG = g(str2);
            String strH = h(str3);
            if (TextUtils.isEmpty(strF) || TextUtils.isEmpty(strG) || TextUtils.isEmpty(strH)) {
                return "";
            }
            return strF + "_" + strG + "_" + strH;
        }
        HwLog.w(y, "getColorPickPicName -- the params is empty");
        return "";
    }

    public String a(String str, int i, String str2, int i2) {
        if (TextUtils.isEmpty(str)) {
            HwLog.w(y, "getColorPickPicName -- the params is empty");
            return "";
        }
        if (i2 == 2) {
            if (!TextUtils.isEmpty(str2)) {
                String[] strArrSplit = str2.split("[.]");
                if (!ArrayUtils.isEmpty(strArrSplit)) {
                    return strArrSplit[0] + "_" + Math.abs(i) + ".png";
                }
            }
        } else {
            String strF = f(str);
            if (!TextUtils.isEmpty(strF)) {
                return strF + "_" + Math.abs(i) + ".png";
            }
        }
        return "";
    }

    public String[] a(String str, String str2, String str3, String str4, int i) throws Throwable {
        String[] strArr = {"", ""};
        if (!TextUtils.isEmpty(str4)) {
            String[] strArrSplit = str4.split("/");
            if (strArrSplit != null && strArrSplit.length >= 1) {
                str3 = a(str4, strArrSplit[strArrSplit.length - 1], this.p, true);
            } else {
                HwLog.d(y, "getSmartPicture is not right");
                return strArr;
            }
        } else if (!TextUtils.isEmpty(str3) && str3.contains("||")) {
            String[] strArrSplit2 = str3.split("\\|\\|");
            if (strArrSplit2 != null && strArrSplit2.length >= 2) {
                str3 = FileHelper.a(strArrSplit2[1], strArrSplit2[0], this.p, true);
            } else {
                HwLog.d(y, "needSetColorPicPath is not right");
                return strArr;
            }
        }
        String strA = a(str, str2, str3);
        if (TextUtils.isEmpty(strA)) {
            HwLog.w(y, "getSmartPicture -- newResPreviewPicName is empty");
            return strArr;
        }
        String str5 = this.p + strA;
        File file = PversionSdUtils.getFile(str5);
        if (file != null && file.exists()) {
            HwLog.i(y, "getSmartPicture -- Existed image.Back to H5");
            strArr[0] = str5;
            return strArr;
        }
        if (i == -1) {
            Bitmap safeDecodeFile = WatchFaceBitmapUtil.getSafeDecodeFile(str);
            if (safeDecodeFile == null) {
                HwLog.w(y, "getSmartPicture -- watchFaceBgBitmap is null");
                return strArr;
            }
            i = m0.a(safeDecodeFile, i(str2));
        }
        strArr[1] = "#" + Integer.toHexString(i);
        Bitmap safeDecodeFile2 = WatchFaceBitmapUtil.getSafeDecodeFile(str3);
        if (safeDecodeFile2 == null) {
            HwLog.w(y, "getSmartPicture -- resPreviewBitmap is null");
            return strArr;
        }
        Bitmap bitmapA = WatchFaceBitmapUtil.a(safeDecodeFile2, i);
        if (bitmapA == null) {
            HwLog.w(y, "getSmartPicture -- newResPreviewBitmap is null");
            return strArr;
        }
        WatchFaceBitmapUtil.saveBitmapToFile(bitmapA, Bitmap.CompressFormat.PNG, this.p, strA);
        safeDecodeFile2.recycle();
        bitmapA.recycle();
        File file2 = PversionSdUtils.getFile(str5);
        if (file2 != null && file2.exists()) {
            HwLog.i(y, "getSmartPicture -- New pic save success.Back to H5");
            strArr[0] = str5;
            return strArr;
        }
        HwLog.w(y, "getSmartPicture -- new pic save failed");
        return strArr;
    }

    public final String a(String str, final String str2, final String str3, boolean z2) {
        String str4 = y;
        HwLog.d(str4, "getImagePathFromUrl fileName:" + str2);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final String[] strArr = new String[1];
        if (new File(str3 + str2).exists() && z2) {
            HwLog.d(str4, "getTimePath Exists.");
            return str3 + str2;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            h1.a(this.mContext, str, new h1.b() { // from class: com.huawei.watchface.manager.WatchFacePhotoAlbumManager$$ExternalSyntheticLambda1
                @Override // com.huawei.watchface.h1.b
                public final void a(Bitmap bitmap) throws Throwable {
                    WatchFacePhotoAlbumManager.a(str3, str2, strArr, countDownLatch, jCurrentTimeMillis, bitmap);
                }
            });
            if (!countDownLatch.await(5000L, TimeUnit.MILLISECONDS)) {
                HwLog.w(str4, "getImagePathFromUrl time out!");
                strArr[0] = "";
            }
        } catch (InterruptedException e) {
            HwLog.e(y, "getImagePathFromUrl InterruptedException:" + HwLog.printException((Exception) e));
        } catch (Exception e2) {
            HwLog.e(y, "getImagePathFromUrl Exception:" + HwLog.printException(e2));
        }
        return strArr[0];
    }

    public static /* synthetic */ void a(String str, String str2, String[] strArr, CountDownLatch countDownLatch, long j, Bitmap bitmap) throws Throwable {
        WatchFaceBitmapUtil.saveBitmapToFile(bitmap, Bitmap.CompressFormat.PNG, str, str2);
        strArr[0] = str + str2;
        countDownLatch.countDown();
        HwLog.d(y, "get url time:" + (System.currentTimeMillis() - j));
    }

    public String a(String str, String str2, String str3, int i) throws Throwable {
        Bitmap safeDecodeFile;
        Bitmap bitmapA;
        String str4 = y;
        HwLog.d(str4, "getColorPicture enter ,colorStr:" + str2);
        try {
            int color = Color.parseColor(str2);
            String strA = a(str, color, str3, i);
            if (TextUtils.isEmpty(strA)) {
                HwLog.w(str4, "getColorPicture -- newColorPreviewPicName is empty");
                return str;
            }
            String str5 = this.p + strA;
            HwLog.d(str4, "newColorPreviewPicName:" + strA);
            File file = PversionSdUtils.getFile(str5);
            if (file != null && file.exists()) {
                HwLog.i(str4, "getColorPicture -- Existed image.Back to H5");
                return str5;
            }
            if (i == 1) {
                safeDecodeFile = WatchFaceBitmapUtil.getSafeDecodeFile(str);
                bitmapA = WatchFaceBitmapUtil.b(safeDecodeFile, color);
            } else if (i == 2) {
                safeDecodeFile = WatchFaceBitmapUtil.getSafeDecodeFile(str);
                bitmapA = WatchFaceBitmapUtil.a(safeDecodeFile, color);
            } else {
                safeDecodeFile = null;
                bitmapA = null;
            }
            if (bitmapA == null) {
                HwLog.w(str4, "getColorPicture -- newColorPreviewBitmap is null");
                return str;
            }
            WatchFaceBitmapUtil.saveBitmapToFile(bitmapA, Bitmap.CompressFormat.PNG, this.p, strA);
            if (safeDecodeFile != null) {
                safeDecodeFile.recycle();
            }
            bitmapA.recycle();
            File file2 = PversionSdUtils.getFile(str5);
            if (file2 != null && file2.exists()) {
                HwLog.i(str4, "getColorPicture -- New pic save success.Back to H5");
                return str5;
            }
            HwLog.w(str4, "getColorPicture -- new pic save failed");
            return str;
        } catch (Exception e) {
            HwLog.d(y, "color str is error:" + HwLog.printException(e));
            return str;
        }
    }
}
