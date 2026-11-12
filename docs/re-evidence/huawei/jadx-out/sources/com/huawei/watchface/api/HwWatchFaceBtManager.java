package com.huawei.watchface.api;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatDelegate;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.hihealth.listener.ResultCallback;
import com.huawei.openalliance.ad.constant.CreativeType;
import com.huawei.secure.android.common.util.SafeString;
import com.huawei.secure.android.common.util.SafeStringBuilder;
import com.huawei.up.model.UserInfomation;
import com.huawei.watchface.a3;
import com.huawei.watchface.b2;
import com.huawei.watchface.e4;
import com.huawei.watchface.e5;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.f4;
import com.huawei.watchface.f5;
import com.huawei.watchface.flavor.FlavorConfig;
import com.huawei.watchface.i1;
import com.huawei.watchface.j2;
import com.huawei.watchface.k2;
import com.huawei.watchface.l1;
import com.huawei.watchface.m;
import com.huawei.watchface.manager.BaseWatchFaceManager;
import com.huawei.watchface.manager.WatchFaceKaleidoscopeManager;
import com.huawei.watchface.manager.WatchFacePhotoAlbumManager;
import com.huawei.watchface.manager.WatchFaceWearManager;
import com.huawei.watchface.mvp.model.datatype.CommandJsonInfo;
import com.huawei.watchface.mvp.model.datatype.DeviceCapability;
import com.huawei.watchface.mvp.model.datatype.DeviceInfo;
import com.huawei.watchface.mvp.model.datatype.KaleidoscopeStruct;
import com.huawei.watchface.mvp.model.datatype.RegisterInfo;
import com.huawei.watchface.mvp.model.datatype.ScreenInfo;
import com.huawei.watchface.mvp.model.datatype.Tlv;
import com.huawei.watchface.mvp.model.datatype.TlvException;
import com.huawei.watchface.mvp.model.datatype.TlvFather;
import com.huawei.watchface.mvp.model.datatype.TlvUtils;
import com.huawei.watchface.mvp.model.datatype.VideoStruct;
import com.huawei.watchface.mvp.model.datatype.WatchDeviceInfo;
import com.huawei.watchface.mvp.model.datatype.WatchFaceKaleidoscopeInfo;
import com.huawei.watchface.mvp.model.datatype.WatchFacePhotoInfo;
import com.huawei.watchface.mvp.model.datatype.WatchFaceSupportInfo;
import com.huawei.watchface.mvp.model.datatype.WatchFaceVideoInfo;
import com.huawei.watchface.mvp.model.datatype.WatchFaceWearInfo;
import com.huawei.watchface.mvp.model.datatype.WatchInfoForH5;
import com.huawei.watchface.mvp.model.datatype.WatchResourcesInfo;
import com.huawei.watchface.mvp.model.datatype.WearStruct;
import com.huawei.watchface.mvp.model.datatype.querysubinfodetail.QuerySubInfoDetailResp;
import com.huawei.watchface.mvp.model.filedownload.FilePuller;
import com.huawei.watchface.mvp.model.helper.GsonHelper;
import com.huawei.watchface.mvp.model.helper.systemparam.NewSystemParamManager;
import com.huawei.watchface.mvp.model.helper.systemparam.SystemParamNames;
import com.huawei.watchface.mvp.model.latona.LatonaWatchFaceThemeAlbumInfo;
import com.huawei.watchface.n;
import com.huawei.watchface.p3;
import com.huawei.watchface.q1;
import com.huawei.watchface.q2;
import com.huawei.watchface.utils.ArrayUtils;
import com.huawei.watchface.utils.BackgroundTaskUtils;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.IntegerUtils;
import com.huawei.watchface.utils.callback.IAuthDenyCallback;
import com.huawei.watchface.utils.callback.IBaseResponseCallback;
import com.huawei.watchface.utils.callback.OperateWatchFaceCallback;
import com.huawei.watchface.utils.callback.WatchFaceHealthResponseListener;
import com.huawei.watchface.x1;
import com.huawei.watchface.y1;
import defpackage.ohc;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class HwWatchFaceBtManager {
    private static final int BACKGROUND_IMAGE_INDEX = 4;
    private static final int BACKGROUND_IMAGE_LIST = 2;
    private static final int BACKGROUND_IMAGE_NAME = 5;
    private static final int BACKGROUND_IMAGE_NUM = 1;
    private static final int BACKGROUND_IMAGE_STRUCT = 3;
    private static final int CAN_INTELLECT_COLOR_VALUE = 1;
    private static final String CLASS_NAME_OF_HANDOFF_SDK = "ohc";
    public static final int DEFAULT_STORAGE_SPACE_AND_FULL = -1;
    private static final int DEFAULT_TAG_LENGTH = 1;
    private static final int DEFAULT_TAG_LENGTH_64 = 8;
    private static final int DEVICE_CONNECT_STATUS_RESPONSE = 2;
    private static final int GET_CLOCK_TYPE_CAPABILITY = 5;
    private static final int GET_CUR_STYLE_INDEX = 10;
    private static final int GET_KALEIDOSCOPE_CURRENT_MATERIAL_IMAGE_INDEX = 7;
    private static final int GET_KALEIDOSCOPE_HANDS_STYLE_INDEX = 8;
    private static final int GET_KALEIDOSCOPE_MATERIAL_IMAGE_INDEX = 5;
    private static final int GET_KALEIDOSCOPE_MATERIAL_IMAGE_LIST = 3;
    private static final int GET_KALEIDOSCOPE_MATERIAL_IMAGE_NAME = 6;
    private static final int GET_KALEIDOSCOPE_MATERIAL_IMAGE_STRUCT = 4;
    private static final int GET_KALEIDOSCOPE_MATERIAL_IMAGE_TYPE = 2;
    private static final int GET_KALEIDOSCOPE_MAX_MATERIAL_IMAGES = 1;
    private static final int GET_KALEIDOSCOPE_TYPE = 9;
    private static final int GET_MAX_STYLE_NUM = 1;
    private static final int GET_PREVIEW_NAME = 9;
    private static final int GET_TINK_CLOCK_OPTION = 12;
    private static final int GET_WEAR_IMAGE_OPTION = 11;
    private static final int GET_WEAR_IMAGE_RADIUS = 13;
    private static final int GET_WEAR_STYLE_ID = 8;
    private static final int GET_WEAR_STYLE_LIST = 6;
    private static final int GET_WEAR_STYLE_NUM = 2;
    private static final int GET_WEAR_STYLE_STRUCT = 7;
    private static final int GET_WEAR_STYLE_TYPE = 3;
    private static final int GET_WEAR_TYPE_CAPABILITY = 4;
    private static final int MAX_VIDEO_NUM = 1;
    private static final int MEGABYTES_CONVERT = 1048576;
    private static final int NEED_TRANSFER_NUM = 8;
    public static final int NOT_SUPPORT_DIAL_UNITE = 0;
    private static final int PORTRAIT_MODE = 13;
    private static final int PORTRAIT_MODE_VALUE = 11;
    private static final int PORT_POSITION_INDEX = 12;
    private static final int PORT_POSITION_INDEX_VALUE = 10;
    private static final int POSITION_INDEX_VALUE = 6;
    private static final int SET_BG_IMAGE_NAME = 7;
    private static final int SET_CLOCK_STYLE_COLOR = 9;
    private static final int SET_CLOCK_STYLE_INDEX = 8;
    private static final int SET_CUR_WEAR_IMAGE_INDEX = 10;
    private static final int SET_KALEIDOSCOPE_CURRENT_MATERIAL_IMAGE_INDEX = 6;
    private static final int SET_KALEIDOSCOPE_HANDS_STYLE_INDEX = 7;
    private static final int SET_KALEIDOSCOPE_MATERIAL_IMAGE_INDEX = 4;
    private static final int SET_KALEIDOSCOPE_MATERIAL_IMAGE_LIST = 2;
    private static final int SET_KALEIDOSCOPE_MATERIAL_IMAGE_NAME = 5;
    private static final int SET_KALEIDOSCOPE_MATERIAL_IMAGE_NUM = 1;
    private static final int SET_KALEIDOSCOPE_MATERIAL_IMAGE_STRUCT = 3;
    private static final int SET_KALEIDOSCOPE_TRANSFER_NUM = 9;
    private static final int SET_KALEIDOSCOPE_TYPE = 8;
    private static final int SET_PREVIEW_NAME_VALUE = 5;
    private static final int SET_WEAR_STYLE_ID_VALUE = 4;
    private static final int SET_WEAR_STYLE_LIST_VALUE = 2;
    private static final int SET_WEAR_STYLE_NUM_VALUE = 1;
    private static final int SET_WEAR_STYLE_STRUCT_VALUE = 3;
    private static final int SET_WEAR_TRANSFER_NUM = 11;
    private static final int SET_WEAR_TYPE_VALUE = 6;
    private static final int STYLE_INDEX_VALUE = 7;
    public static final int SUPPORT_DIAL_UNITE = 5;
    private static final String TAG = "HwWatchFaceBtManager";
    private static final int TRANSFER_PREVIEW_NUM = 13;
    private static final int TRANSFER_VIDEO_NUM = 14;
    private static final int VALUE_TYPE_INDEX_VALUE = 9;
    private static final int VIDEO_ATTRIBUTE = 7;
    private static final int VIDEO_INDEX = 5;
    private static final int VIDEO_LIST = 3;
    private static final int VIDEO_NAME = 6;
    private static final int VIDEO_NUM = 1;
    private static final int VIDEO_POSITION_INDEX = 10;
    private static final int VIDEO_PREVIEW_NAME = 8;
    private static final int VIDEO_STATUS = 9;
    private static final int VIDEO_STRUCT = 4;
    private static final int VIDEO_STYLE_INDEX = 11;
    private static final int VIDEO_TYPE = 2;
    private static final int VIDEO_VALUE_TYPE_INDEX = 12;
    private static final int WATCH_FACE_AP_MODEL = 1;
    private static final int WATCH_FACE_GT_MODEL = 0;
    private static final int WATCH_FACE_WEAR = 4;
    private static final int WATCH_FACE_WEAR_TYPE = 1;
    private static volatile HwWatchFaceBtManager sInstance;
    List<BaseWatchFaceManager> destroyListeners;
    private boolean isGetAlbumPackageName;
    private boolean isGetKaleidoscopePackageName;
    private boolean isGetVideoAlbumPackageName;
    private boolean isGetWatchfaceLocal;
    private boolean isGetWearAlbumPackageName;
    private IAuthDenyCallback mAuthDenyCallback;
    private Context mContext;
    private Map<String, String> mDefaultWatchInfo;
    private boolean mIsJudgeSecondAuth;
    private boolean mIsSupportWatchFaceAppId;
    private int mKaleidoscopeOptionType;
    private int mPhotoOptionType;
    private int mVideoOptionType;
    private WatchFaceSupportInfo mVirtualWatchFaceSupportInfo;
    private List<WatchDeviceInfo> mWatchDeviceInfoList;
    private WatchFaceSupportInfo mWatchFaceSupportInfo;
    private int mWearOptionType;
    private OperateWatchFaceCallback registerH5Callback;
    private static Map<Integer, List<IBaseResponseCallback>> sCommandCallbacks = new HashMap(20);
    private static IBaseResponseCallback sCallBackForH5 = null;
    private static WatchResourcesInfo mDeviceCurrentWatchFace = null;
    private ConcurrentHashMap<String, RegisterInfo.RegisterBean> registerH5 = new ConcurrentHashMap<>();
    private CopyOnWriteArrayList<String> mSupportMemberSignatureHiTopIdList = new CopyOnWriteArrayList<>();
    private TlvUtils mTlvUtils = new TlvUtils();
    private WatchFacePhotoInfo mWatchFacePhotoInfo = new WatchFacePhotoInfo();
    private WatchFaceVideoInfo mWatchFaceVideoInfo = new WatchFaceVideoInfo();
    private WatchFaceKaleidoscopeInfo mWatchFaceKaleidoscopeInfo = new WatchFaceKaleidoscopeInfo();
    private WatchFaceWearInfo mWatchFaceWearInfo = new WatchFaceWearInfo();
    private CopyOnWriteArrayList<WatchResourcesInfo> mWatchFaces = new CopyOnWriteArrayList<>();
    private ArrayList<WatchResourcesInfo> mTempWatchFaces = new ArrayList<>(20);
    private HashMap<String, WatchResourcesInfo> mHashWatchFaces = new HashMap<>(20);
    private int mIsWatchfaceFull = -1;
    private int mLeftSpace = -1;
    private boolean isTaskExecuting = false;
    private LinkedHashMap<String, IBaseResponseCallback> mOperateCallbacks = new LinkedHashMap<>();
    private WatchFaceHealthResponseListener mHealthResponseListener = new WatchFaceHealthResponseListener() { // from class: com.huawei.watchface.api.HwWatchFaceBtManager$$ExternalSyntheticLambda5
        @Override // com.huawei.watchface.utils.callback.WatchFaceHealthResponseListener
        public final void onResponse(int i, int i2, Object obj) {
            this.f$0.lambda$new$0(i, i2, obj);
        }
    };
    private ResultCallback mResultCallback = new ResultCallback() { // from class: com.huawei.watchface.api.HwWatchFaceBtManager$$ExternalSyntheticLambda6
        @Override // com.huawei.hihealth.listener.ResultCallback
        public final void onResult(int i, Object obj) {
            this.f$0.lambda$new$1(i, obj);
        }
    };

    private HwWatchFaceBtManager(Context context) {
        HwLog.i(TAG, "HwWatchFaceBtManager() enter.");
        this.mContext = context;
        registerHealthResponseListener();
        x1.a(this.mContext).a(this.mResultCallback);
        y1.a(this.mContext).a(this.mResultCallback);
    }

    private void assemblingBtConnectInfo(int i) {
        HwLog.i(TAG, "assemblingBtConnectInfo() statusCode: " + i);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mDeviceConnectState", i);
            jSONObject.put("mDeviceName", HwWatchFaceApi.getInstance(this.mContext).getDeviceName());
            notifyBtConnectStatus(jSONObject.toString());
        } catch (JSONException unused) {
            HwLog.e(TAG, "assemblingBtConnectInfo()() JSONException occured.");
        }
    }

    private boolean checkIsSync(WatchResourcesInfo watchResourcesInfo) {
        boolean zIsSupportSync = isSupportSync();
        String str = TAG;
        HwLog.i(str, " checkIsSync() isSupportSync:" + zIsSupportSync);
        if (!zIsSupportSync) {
            return false;
        }
        String watchInfoId = watchResourcesInfo.getWatchInfoId();
        String watchInfoVersion = watchResourcesInfo.getWatchInfoVersion();
        boolean zA = b2.a().a(watchResourcesInfo.isVipFreeWatchFace() ? FilePuller.getInstance(this.mContext).buildTaskId(WatchResourcesInfo.markUpHiTopId(watchInfoId), watchInfoVersion) : FilePuller.getInstance(this.mContext).buildTaskId(watchInfoId, watchInfoVersion));
        HwLog.i(str, "checkIsSync() checkRst: " + zA);
        return zA;
    }

    private void dealModeChange() {
        boolean zA = e4.a("mode_change_not_refresh", false);
        String str = TAG;
        HwLog.i(str, "dealModeChange() not_refresh = " + zA);
        if (zA) {
            e4.b("mode_change_not_refresh", false);
            boolean zA2 = e4.a("mode_change", false);
            HwLog.i(str, "dealModeChange() modeChange = " + zA2);
            if (zA2) {
                Context context = this.mContext;
                if (context == null) {
                    HwLog.i(str, "dealModeChange() mContext == null");
                } else {
                    HwWatchFaceManager.getInstance(context).toNotifyWatchfaceModeChange();
                    HwLog.i(str, "dealModeChange() modeChange  toNotifyWatchfaceModeChange");
                }
            }
        }
    }

    private void dealReport(boolean z, int i, final String str) {
        if (TextUtils.isEmpty(str) && i != 0) {
            Iterator<Map.Entry<String, IBaseResponseCallback>> it = this.mOperateCallbacks.entrySet().iterator();
            while (it.hasNext()) {
                IBaseResponseCallback value = it.next().getValue();
                if (value != null) {
                    value.onResponse(104, str);
                }
            }
            this.mOperateCallbacks.clear();
            return;
        }
        IBaseResponseCallback iBaseResponseCallback = this.mOperateCallbacks.get(str);
        if (iBaseResponseCallback == null) {
            HwLog.e(TAG, "dealReport() callback is null, hiTopVersion: " + str);
            return;
        }
        if (i != 0) {
            if (i == 100014 || i == 100007 || i == 100015) {
                iBaseResponseCallback.onResponse(i, str);
            } else {
                iBaseResponseCallback.onResponse(104, str);
            }
        } else if (z) {
            iBaseResponseCallback.onResponse(105, str);
        } else {
            iBaseResponseCallback.onResponse(103, str);
            getWatchInfoForUi(new IBaseResponseCallback() { // from class: com.huawei.watchface.api.HwWatchFaceBtManager$$ExternalSyntheticLambda2
                @Override // com.huawei.watchface.utils.callback.IBaseResponseCallback
                public final void onResponse(int i2, Object obj) {
                    HwWatchFaceBtManager.transmitLocalWatchInfoChange(str, i2);
                }
            });
        }
        this.mOperateCallbacks.remove(str);
    }

    private static void destroyInstance() {
        synchronized (HwWatchFaceBtManager.class) {
            HwLog.i(TAG, "destroyInstance() enter.");
            sInstance.unRegisterHealthResponseListener();
            sInstance = null;
            mDeviceCurrentWatchFace = null;
        }
    }

    private static IBaseResponseCallback getCallBackForH5() {
        return sCallBackForH5;
    }

    private static Object getCommandCallbackCallbackList() {
        Map<Integer, List<IBaseResponseCallback>> map;
        synchronized (HwWatchFaceBtManager.class) {
            map = sCommandCallbacks;
        }
        return map;
    }

    private String getCommandHexString(WatchResourcesInfo watchResourcesInfo, int i) {
        String str;
        String str2;
        String strC = i1.c(watchResourcesInfo.markUpVipFreeWatchFace(watchResourcesInfo.getWatchInfoId()));
        String str3 = i1.b(1) + i1.b(strC.length() / 2) + strC;
        String strC2 = i1.c(watchResourcesInfo.getWatchInfoVersion());
        String str4 = i1.b(2) + i1.b(strC2.length() / 2) + strC2;
        String str5 = i1.b(3) + i1.b(1) + i1.b(i);
        String watchScreen = watchResourcesInfo.getWatchScreen();
        if (TextUtils.isEmpty(watchScreen)) {
            str = "";
            str2 = "";
        } else {
            HwLog.i(TAG, "sendOperateType() watchScreen: " + watchScreen);
            int i2 = Integer.parseInt(SafeString.substring(watchScreen, 0, watchScreen.lastIndexOf("*")));
            int i3 = Integer.parseInt(SafeString.substring(watchScreen, watchScreen.lastIndexOf("*") + 1));
            str = i1.b(5) + i1.b(i1.b(i2).length() / 2) + i1.b(i2);
            str2 = i1.b(6) + i1.b(i1.b(i3).length() / 2) + i1.b(i3);
        }
        return CommonUtils.d() + str3 + str4 + str5 + str + str2;
    }

    private WatchFaceSupportInfo getConnectWatchfaceSupportInfo() {
        if (HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceConnectState() == 1) {
            return getWatchFaceSupportInfo();
        }
        return null;
    }

    private void getDeviceInfo() {
        String str = CommonUtils.d() + (i1.b(1) + i1.b(0)) + (i1.b(2) + i1.b(0)) + (i1.b(3) + i1.b(0)) + (i1.b(4) + i1.b(0)) + (i1.b(5) + i1.b(0)) + (i1.b(20) + i1.b(0)) + (i1.b(21) + i1.b(0));
        CommandJsonInfo commandJsonInfo = new CommandJsonInfo();
        commandJsonInfo.setServiceId(39);
        commandJsonInfo.setCommandId(1);
        commandJsonInfo.setCommandType(800);
        commandJsonInfo.setDeviceCommand(str);
        HwLog.i(TAG, "5.39.1 getDeviceInfo() commandJsonInfo: " + commandJsonInfo.toString());
        m.a("5.39.1", commandJsonInfo.toString(), 1);
        q1.a(this.mContext, commandJsonInfo, this.mResultCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getDeviceWatchInfo() {
        String str = i1.b(1) + i1.b(0);
        int serverMode = HwWatchFaceApi.getInstance(this.mContext).getServerMode();
        String str2 = TAG;
        HwLog.i(str2, "getDeviceWatchInfo() serverMode: " + serverMode);
        String str3 = CommonUtils.d() + str + (i1.b(6) + i1.b(1) + i1.b(serverMode));
        CommandJsonInfo commandJsonInfo = new CommandJsonInfo();
        commandJsonInfo.setServiceId(39);
        commandJsonInfo.setCommandId(2);
        commandJsonInfo.setCommandType(800);
        commandJsonInfo.setDeviceCommand(str3);
        HwLog.i(str2, "5.39.2 getDeviceWatchInfo() commandJsonInfo: " + commandJsonInfo.toString());
        m.a("5.39.2", commandJsonInfo.toString(), 1);
        q1.a(this.mContext, commandJsonInfo, this.mResultCallback);
    }

    public static HwWatchFaceBtManager getInstance(Context context) {
        if (sInstance == null) {
            synchronized (HwWatchFaceBtManager.class) {
                if (sInstance == null) {
                    Environment.setApplication((Application) context.getApplicationContext());
                    sInstance = new HwWatchFaceBtManager(Environment.getApplicationContext());
                }
            }
        }
        return sInstance;
    }

    private ArrayList<Integer> getList(TreeMap<Integer, Integer> treeMap) {
        Iterator<Integer> it = treeMap.keySet().iterator();
        ArrayList<Integer> arrayList = new ArrayList<>(20);
        while (it.hasNext()) {
            arrayList.add(treeMap.get(it.next()));
        }
        return arrayList;
    }

    private void getPhotoWatchInfo(int i) {
        String str = i1.b(1) + i1.b(0);
        String str2 = i1.b(2) + i1.b(0);
        String str3 = i1.b(3) + i1.b(0);
        String str4 = i1.b(4) + i1.b(0);
        String str5 = i1.b(13) + i1.b(0);
        String str6 = i1.b(12) + i1.b(0);
        StringBuilder sb = new StringBuilder(20);
        if ((i & 1) == 1) {
            sb.append(i1.b(8) + i1.b(0));
        }
        if ((i & 2) == 2) {
            sb.append(i1.b(9) + i1.b(0));
        }
        if ((i & 4) == 4) {
            sb.append(i1.b(10) + i1.b(0));
        }
        String str7 = CommonUtils.d() + str + str2 + str3 + str4 + str6 + str5 + sb.toString();
        CommandJsonInfo commandJsonInfo = new CommandJsonInfo();
        commandJsonInfo.setServiceId(39);
        commandJsonInfo.setCommandId(8);
        commandJsonInfo.setCommandType(800);
        commandJsonInfo.setDeviceCommand(str7);
        HwLog.i(TAG, "5.39.8 getPhotoWatchInfo() commandJsonInfo: " + commandJsonInfo.toString());
        m.a("5.39.8", commandJsonInfo.toString(), 1);
        q1.a(this.mContext, commandJsonInfo, this.mResultCallback);
    }

    private void getWatchFaceVideoInfoCommand(int i) {
        String str = i1.b(1) + i1.b(0);
        String str2 = i1.b(2) + i1.b(0);
        String str3 = i1.b(3) + i1.b(0);
        StringBuilder sb = new StringBuilder(20);
        if ((i & 1) == 1) {
            sb.append(i1.b(10));
            sb.append(i1.b(0));
        }
        if ((i & 2) == 2) {
            sb.append(i1.b(11));
            sb.append(i1.b(0));
        }
        if ((i & 4) == 4) {
            sb.append(i1.b(12));
            sb.append(i1.b(0));
        }
        String str4 = CommonUtils.e() + str + str2 + str3 + sb.toString();
        CommandJsonInfo commandJsonInfo = new CommandJsonInfo();
        commandJsonInfo.setServiceId(39);
        commandJsonInfo.setCommandId(15);
        commandJsonInfo.setCommandType(800);
        commandJsonInfo.setDeviceCommand(str4);
        HwLog.i(TAG, "5.39.15 getWatchFaceVideoInfoCommand() commandJsonInfo: " + commandJsonInfo.toString());
        m.a("5.39.15", commandJsonInfo.toString(), 1);
        q1.a(this.mContext, commandJsonInfo, this.mResultCallback);
    }

    private CopyOnWriteArrayList<WatchResourcesInfo> getWatchFaces() {
        CopyOnWriteArrayList<WatchResourcesInfo> copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = this.mWatchFaces;
        }
        return copyOnWriteArrayList;
    }

    private void handleApply(byte[] bArr) {
        boolean z;
        int iB;
        String strA = i1.a(bArr);
        String str = TAG;
        HwLog.i(str, "5.39.3 handleApply() info: " + strA);
        WatchResourcesInfo watchResourcesInfo = new WatchResourcesInfo();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        boolean z2 = false;
        try {
            List<Tlv> tlvList = this.mTlvUtils.builderTlvList(SafeString.substring(strA, CommonUtils.l())).getTlvList();
            if (tlvList == null || tlvList.isEmpty()) {
                HwLog.w(str, "handleApply() tlv error");
                iB = 0;
            } else {
                iB = 0;
                z = false;
                for (Tlv tlv : tlvList) {
                    try {
                        int iB2 = IntegerUtils.b(tlv.getTag(), 16);
                        String value = tlv.getValue();
                        if (iB2 == 1) {
                            watchResourcesInfo.setWatchInfoId(watchResourcesInfo.markDownVipFreeWatchFace(i1.b(value)));
                            HwLog.i(TAG, "handleApply() setWatchInfo_Id:" + watchResourcesInfo.getWatchInfoId());
                            linkedHashMap.put("watchfaceId", watchResourcesInfo.getWatchInfoId());
                        } else if (iB2 == 2) {
                            watchResourcesInfo.setWatchInfoVersion(i1.b(value));
                            HwLog.i(TAG, "handleApply() setWatchInfo_Version:" + watchResourcesInfo.getWatchInfoVersion());
                            linkedHashMap.put("watchfaceVersion", watchResourcesInfo.getWatchInfoVersion());
                        } else if (iB2 == 4) {
                            z = IntegerUtils.b(value, 16) == 1;
                            HwLog.i(TAG, "handleApply() isNeedTransfer:" + z);
                            linkedHashMap.put("isNeedTransfer", String.valueOf(z));
                        } else if (iB2 != 127) {
                            HwLog.w(TAG, "handleApply(), nothing to do");
                        } else {
                            iB = IntegerUtils.b(value, 16);
                            HwLog.i(TAG, "handleApply() errorCode:" + iB);
                            linkedHashMap.put("errorCode", String.valueOf(iB));
                        }
                    } catch (TlvException unused) {
                        i = iB;
                        HwLog.e(TAG, "handleApply() TlvException");
                        iB = i;
                    }
                }
                z2 = z;
            }
        } catch (TlvException unused2) {
            z = false;
        }
        linkedHashMap.put("commandOrg", strA);
        m.a("5.39.3", GsonHelper.toJson(linkedHashMap), 2);
        String str2 = watchResourcesInfo.getWatchInfoId() + "_" + watchResourcesInfo.getWatchInfoVersion();
        if (z2 && watchResourcesInfo.isVipFreeWatchFace()) {
            HwWatchFaceManager.getInstance(this.mContext).addVipFreeWatchFace(watchResourcesInfo.getWatchInfoId(), watchResourcesInfo);
        }
        reportForUi(z2, iB, str2);
    }

    private void handleBackground(TlvFather tlvFather) {
        HwLog.i(TAG, "handleBackground() in.");
        TreeMap treeMap = new TreeMap();
        TreeMap<Integer, Integer> treeMap2 = new TreeMap<>();
        TreeMap<Integer, Integer> treeMap3 = new TreeMap<>();
        Iterator<TlvFather> it = tlvFather.getTlvFatherList().iterator();
        String strB = "";
        int iC = -1;
        int iC2 = -1;
        int iC3 = -1;
        while (it.hasNext()) {
            for (Tlv tlv : it.next().getTlvList()) {
                int iC4 = IntegerUtils.c(tlv.getTag());
                if (iC4 == 6) {
                    iC3 = IntegerUtils.c(tlv.getValue());
                } else if (iC4 == 7) {
                    strB = i1.b(tlv.getValue());
                } else if (iC4 == 12) {
                    iC = IntegerUtils.c(tlv.getValue());
                } else if (iC4 != 13) {
                    HwLog.w(TAG, "handleBackground() error");
                } else {
                    iC2 = IntegerUtils.c(tlv.getValue());
                    if (iC2 == 1) {
                        if (!new File(WatchFacePhotoAlbumManager.getInstance(this.mContext).getBgPath() + strB).exists() && !TextUtils.isEmpty(strB)) {
                            iC2 = 3;
                        }
                    }
                }
            }
            if (iC3 != -1 && !TextUtils.isEmpty(strB)) {
                treeMap.put(Integer.valueOf(iC3), strB);
            }
            if (iC3 != -1 && iC2 != -1) {
                treeMap2.put(Integer.valueOf(iC3), Integer.valueOf(iC2));
            }
            if (iC3 != -1 && iC != -1) {
                treeMap3.put(Integer.valueOf(iC3), Integer.valueOf(iC));
            }
        }
        HwLog.i(TAG, "handleBackground() map.size" + treeMap.size());
        Iterator it2 = treeMap.keySet().iterator();
        ArrayList<String> arrayList = new ArrayList<>(20);
        while (it2.hasNext()) {
            arrayList.add((String) treeMap.get(it2.next()));
        }
        HwLog.i(TAG, "handleBackground() backgroundList.size: " + arrayList.size());
        this.mWatchFacePhotoInfo.setBackgroundList(arrayList);
        this.mWatchFacePhotoInfo.setPortraitModeList(getList(treeMap2));
        this.mWatchFacePhotoInfo.setPortPositionIndexList(getList(treeMap3));
    }

    private void handleCallbackResult(byte[] bArr) {
        if (bArr == null || bArr.length <= 1) {
            HwLog.w(TAG, "handleCallbackResult() data illegal");
            return;
        }
        if (Environment.sIsAarInTheme && !isCommandForThemeWatch(bArr)) {
            HwLog.w(TAG, "handleCallbackResult() command not for theme watch.");
            return;
        }
        int iA = i1.a(bArr[0]);
        String str = TAG;
        HwLog.i(str, "handleCallbackResult() serviceId: " + iA);
        if (iA == 39) {
            if (needLocalSendBluetooth(iA, bArr)) {
                handleWatchFaceCallbackResult(bArr);
            }
        } else if (iA == 40) {
            if (needLocalSendBluetooth(iA, bArr)) {
                x1.a(this.mContext).h(bArr);
            }
        } else if (iA != 44) {
            HwLog.w(str, "handleCallbackResult() ServiceId illegal");
        } else if (needLocalSendBluetooth(iA, bArr)) {
            y1.a(this.mContext).d(bArr);
        }
    }

    private void handleCompatibleTlvInfo(TlvFather tlvFather) {
        if (tlvFather == null) {
            HwLog.e(TAG, "handleCompatibleTlvInfo() compatibleTlvFather is empty.");
            return;
        }
        List<TlvFather> tlvFatherList = tlvFather.getTlvFatherList();
        ArrayList arrayList = new ArrayList(20);
        if (ArrayUtils.isEmpty(tlvFatherList)) {
            HwLog.e(TAG, "handleCompatibleTlvInfo() compatibleTlvList is empty.");
            this.mWatchFaceSupportInfo.setCompatibleList(arrayList);
            return;
        }
        for (TlvFather tlvFather2 : tlvFatherList) {
            ScreenInfo screenInfo = new ScreenInfo();
            for (Tlv tlv : tlvFather2.getTlvList()) {
                switch (IntegerUtils.b(tlv.getTag(), 16)) {
                    case 9:
                        screenInfo.setWidth(IntegerUtils.b(tlv.getValue(), 16));
                        HwLog.i(TAG, "handleCompatibleTlvInfo() setWidth:" + screenInfo.getWidth());
                        break;
                    case 10:
                        screenInfo.setHeight(IntegerUtils.b(tlv.getValue(), 16));
                        HwLog.i(TAG, "handleCompatibleTlvInfo() setHeight:" + screenInfo.getHeight());
                        break;
                    case 11:
                        screenInfo.setSupportVersion(CommonUtils.l(i1.b(tlv.getValue())));
                        HwLog.i(TAG, "handleCompatibleTlvInfo() getSupportVersion:" + screenInfo.getSupportVersion());
                        break;
                    default:
                        HwLog.w(TAG, "handleCompatibleTlvInfo() invalid type.");
                        break;
                }
            }
            arrayList.add(screenInfo);
        }
        this.mWatchFaceSupportInfo.setCompatibleList(arrayList);
    }

    private void handleDeviceInfo(byte[] bArr) {
        synchronized (this) {
            resetWatchFaceSupportInfo();
            if (this.mWatchFaceSupportInfo == null) {
                this.mWatchFaceSupportInfo = new WatchFaceSupportInfo();
            }
            String strA = i1.a(bArr);
            String str = TAG;
            HwLog.i(str, "5.39.1 handleDeviceInfo() info: " + strA);
            m.a("5.39.1", strA, 2);
            try {
                TlvFather tlvFatherBuilderTlvList = this.mTlvUtils.builderTlvList(SafeString.substring(strA, CommonUtils.l()));
                List<Tlv> tlvList = tlvFatherBuilderTlvList.getTlvList();
                if (tlvList == null || tlvList.isEmpty()) {
                    HwLog.w(str, "handleDeviceInfo() tlv error");
                } else {
                    for (Tlv tlv : tlvList) {
                        handleDeviceInfoTlv(IntegerUtils.b(tlv.getTag(), 16), tlv.getValue());
                    }
                }
                handleDeviceScreenInfoTlv(tlvFatherBuilderTlvList.getTlvFatherList());
                e4.f("cache_device_id", l1.a(HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceIdentify()));
                reportDeviceInfoStatus();
            } catch (TlvException unused) {
                HwLog.e(TAG, "handleDeviceInfo() TlvException occured.");
            }
        }
    }

    private void handleDeviceInfoTlv(int i, String str) {
        if (i == 17) {
            this.mWatchFaceSupportInfo.setSupportCapability(IntegerUtils.b(str, 16));
            HwLog.i(TAG, "handleDeviceInfoTlv() setSupportCapability:" + this.mWatchFaceSupportInfo.getSupportCapability());
            return;
        }
        if (i == 18) {
            this.mWatchFaceSupportInfo.setPowerLevel(IntegerUtils.b(str, 16));
            HwLog.i(TAG, "handleDeviceInfoTlv() setPowerLevel:" + this.mWatchFaceSupportInfo.getPowerLevel());
            return;
        }
        if (i == 127) {
            this.mWatchFaceSupportInfo.setCommonErrorCode(IntegerUtils.b(str, 16));
            HwLog.i(TAG, "handleDeviceInfoTlv() setCommonErrorCode:" + this.mWatchFaceSupportInfo.getCommonErrorCode());
            return;
        }
        switch (i) {
            case 1:
                this.mWatchFaceSupportInfo.setWatchFaceMaxVersion(CommonUtils.l(i1.b(str)));
                HwLog.i(TAG, "handleDeviceInfoTlv() WatchFace_MaxVersion:" + this.mWatchFaceSupportInfo.getWatchFaceMaxVersion());
                break;
            case 2:
                this.mWatchFaceSupportInfo.setWatchFaceWidth(IntegerUtils.b(str, 16));
                HwLog.i(TAG, "handleDeviceInfoTlv() WatchFace_Width:" + this.mWatchFaceSupportInfo.getWatchFaceWidth());
                break;
            case 3:
                this.mWatchFaceSupportInfo.setWatchFaceHeight(IntegerUtils.b(str, 16));
                HwLog.i(TAG, "handleDeviceInfoTlv() setWatchFace_Height:" + this.mWatchFaceSupportInfo.getWatchFaceHeight());
                break;
            case 4:
                int iB = IntegerUtils.b(str, 16);
                ArrayList arrayList = new ArrayList(20);
                if ((iB & 1) == 1) {
                    arrayList.add(1);
                }
                this.mWatchFaceSupportInfo.setWatchFaceSupportFileType(arrayList);
                HwLog.i(TAG, "handleDeviceInfoTlv() setWatchFace_SupportFileType:" + this.mWatchFaceSupportInfo.getWatchFaceSupportFileType());
                break;
            case 5:
                this.mWatchFaceSupportInfo.setWatchFaceSort(IntegerUtils.b(str, 16) == 1);
                HwLog.i(TAG, "handleDeviceInfoTlv() setWatchFace_Sort:" + this.mWatchFaceSupportInfo.isWatchFaceSort());
                break;
            case 6:
                this.mWatchFaceSupportInfo.setOtherWatchFaceVersion(CommonUtils.l(i1.b(str)));
                HwLog.i(TAG, "handleDeviceInfoTlv() OtherThemeVersion:" + this.mWatchFaceSupportInfo.getOtherWatchFaceVersion());
                break;
            default:
                switch (i) {
                    case 20:
                        this.mWatchFaceSupportInfo.setPortraitFieldMode(IntegerUtils.b(str, 16));
                        HwLog.i(TAG, "handleDeviceInfoTlv() setPortraitFieldMode:" + this.mWatchFaceSupportInfo.getPortraitFieldMode());
                        break;
                    case 21:
                        this.mWatchFaceSupportInfo.setSetTimeIndividually(IntegerUtils.b(str, 16));
                        HwLog.i(TAG, "handleDeviceInfoTlv() setSetTimeIndividually:" + this.mWatchFaceSupportInfo.getSetTimeIndividually());
                        break;
                    case 22:
                        this.mWatchFaceSupportInfo.setIsWearSupport(IntegerUtils.b(str, 16));
                        HwLog.i(TAG, "handleDeviceInfoTlv() setIsWearSupport:" + this.mWatchFaceSupportInfo.getIsWearSupport());
                        break;
                    case 23:
                        this.mWatchFaceSupportInfo.setIsSupportSync(IntegerUtils.b(str, 16) == 1);
                        HwLog.i(TAG, "handleDeviceInfoTlv() setIsSupportSync:" + this.mWatchFaceSupportInfo.isIsSupportSync());
                        break;
                    case 24:
                        this.mWatchFaceSupportInfo.setWatchfaceMode(IntegerUtils.b(str, 16));
                        HwLog.i(TAG, "handleDeviceInfoTlv() setCurrentModel:" + this.mWatchFaceSupportInfo.getWatchfaceMode());
                        break;
                    case 25:
                        this.mWatchFaceSupportInfo.setSupportOneTouchAbility(IntegerUtils.b(str, 16) == 1);
                        this.mWatchFaceSupportInfo.setSupportNewAlbum(true);
                        HwLog.i(TAG, "handleDeviceInfoTlv() setSupportOneTouchAbility:" + this.mWatchFaceSupportInfo.isSupportOneTouchAbility());
                        break;
                    default:
                        HwLog.w(TAG, "handleDeviceInfoTlv() default type:" + i);
                        break;
                }
                break;
        }
    }

    private void handleDeviceScreenInfoTlv(List<TlvFather> list) {
        if (ArrayUtils.isEmpty(list)) {
            HwLog.e(TAG, "handleDeviceScreenInfoTlv() tlvFatherList is empty.");
            return;
        }
        HwLog.i(TAG, "handleDeviceScreenInfoTlv() tlvFatherList size: " + list.size());
        TlvFather tlvFather = null;
        TlvFather tlvFather2 = null;
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                tlvFather = list.get(i);
            } else if (i == 1) {
                tlvFather2 = list.get(i);
            }
        }
        handleCompatibleTlvInfo(tlvFather);
        handlePurchasedTlvInfo(tlvFather2);
    }

    private void handleErrorCode(byte[] bArr, int i) {
        String strA = i1.a(bArr);
        HwLog.i(TAG, "5.39.4 handleErrorCode(), info:" + strA);
        int iB = 0;
        try {
            iB = IntegerUtils.b(this.mTlvUtils.builderTlvList(SafeString.substring(strA, CommonUtils.l())).getTlvList().get(0).getValue(), 16);
        } catch (TlvException unused) {
            HwLog.e(TAG, "handleErrorCode() TlvException");
        }
        String str = TAG;
        HwLog.i(str, "handleErrorCode(): " + iB);
        synchronized (getCommandCallbackCallbackList()) {
            List<IBaseResponseCallback> list = sCommandCallbacks.get(Integer.valueOf(i));
            if (list == null || list.isEmpty()) {
                HwLog.w(str, "handleErrorCode() callback error");
            } else {
                if (iB == 100000) {
                    list.get(list.size() - 1).onResponse(101, null);
                    if (getCallBackForH5() != null) {
                        getCallBackForH5().onResponse(106, null);
                    }
                } else {
                    list.get(list.size() - 1).onResponse(102, null);
                }
                sCommandCallbacks.remove(Integer.valueOf(i));
            }
        }
    }

    private void handleFaceInfo(byte[] bArr) {
        String strA = i1.a(bArr);
        String str = TAG;
        HwLog.i(str, "5.39.2 handleFaceInfo() info: " + strA);
        LinkedList linkedList = new LinkedList();
        this.mTempWatchFaces.clear();
        this.mHashWatchFaces.clear();
        this.mSupportMemberSignatureHiTopIdList.clear();
        try {
            TlvFather tlvFatherBuilderTlvList = this.mTlvUtils.builderTlvList(SafeString.substring(strA, CommonUtils.l()));
            handleWatchfaceInfoEx(tlvFatherBuilderTlvList);
            TlvFather tlvFather = tlvFatherBuilderTlvList.getTlvFatherList().get(0);
            HwLog.i(str, "handleFaceInfo() size:" + tlvFather.getTlvFatherList().size());
            for (TlvFather tlvFather2 : tlvFather.getTlvFatherList()) {
                WatchResourcesInfo watchResourcesInfo = new WatchResourcesInfo();
                LinkedList linkedList2 = new LinkedList();
                for (Tlv tlv : tlvFather2.getTlvList()) {
                    int iB = IntegerUtils.b(tlv.getTag(), 16);
                    if (iB == 3) {
                        String strMarkDownVipFreeWatchFace = watchResourcesInfo.markDownVipFreeWatchFace(CommonUtils.l(i1.b(tlv.getValue())));
                        watchResourcesInfo.setWatchInfoId(strMarkDownVipFreeWatchFace);
                        HwLog.i(TAG, "handleFaceInfo() setWatchInfo_Id:" + watchResourcesInfo.getWatchInfoId());
                        if (watchResourcesInfo.isVipFreeWatchFace() && getInstance(Environment.getApplicationContext()).isSupportMemberSignature()) {
                            this.mSupportMemberSignatureHiTopIdList.add(watchResourcesInfo.getWatchInfoId());
                        }
                        linkedList2.add(strMarkDownVipFreeWatchFace);
                    } else if (iB == 4) {
                        watchResourcesInfo.setWatchInfoVersion(CommonUtils.l(i1.b(tlv.getValue())));
                        HwLog.i(TAG, "handleFaceInfo() setWatchInfo_Version:" + watchResourcesInfo.getWatchInfoVersion());
                    } else if (iB == 5) {
                        watchResourcesInfo.setWatchInfoType(IntegerUtils.b(tlv.getValue(), 16));
                        HwLog.i(TAG, "handleFaceInfo() setWatchInfo_Type:" + watchResourcesInfo.getWatchInfoType());
                        linkedList2.add(Integer.valueOf(watchResourcesInfo.getWatchInfoType()));
                    } else if (iB == 7) {
                        watchResourcesInfo.setWatchExpandType(IntegerUtils.b(tlv.getValue(), 16));
                        HwLog.i(TAG, "handleFaceInfo() setWatchExpandType:" + watchResourcesInfo.getWatchExpandType());
                    } else if (iB != 10) {
                        HwLog.w(TAG, "handleFaceInfo(), nothing to do");
                    } else {
                        watchResourcesInfo.setWatchfaceTag(IntegerUtils.b(tlv.getValue(), 16));
                        HwLog.i(TAG, "handleFaceInfo() setWatchfaceTag:" + watchResourcesInfo.getWatchfaceTag());
                        linkedList2.add(Integer.valueOf(watchResourcesInfo.getWatchfaceTag()));
                    }
                }
                n.e().b(watchResourcesInfo);
                HwLog.i(TAG, "handleFaceInfo() setChangeHopidList_Id:" + watchResourcesInfo.getWatchInfoId());
                this.mTempWatchFaces.add(watchResourcesInfo);
                linkedList.add(linkedList2);
                if (watchResourcesInfo.getWatchInfoId() != null) {
                    this.mHashWatchFaces.put(watchResourcesInfo.getWatchInfoId(), watchResourcesInfo);
                }
            }
            n.e().a(this.mHashWatchFaces, this.mTempWatchFaces);
            resetWatchInfoList();
            if (mDeviceCurrentWatchFace != null) {
                HwLog.i(TAG, "handleFaceInfo() mDeviceCurrentWatchFace:" + mDeviceCurrentWatchFace.getWatchInfoId());
            }
            BatchReportRepository.update(this.mContext, mDeviceCurrentWatchFace, new BatchReportRepository.BatchReportUpdateListener() { // from class: com.huawei.watchface.api.HwWatchFaceBtManager$$ExternalSyntheticLambda3
                @Override // com.huawei.watchface.api.BatchReportRepository.BatchReportUpdateListener
                public final void onWatchFaceInfoUpdated(WatchResourcesInfo watchResourcesInfo2) {
                    HwWatchFaceBtManager.mDeviceCurrentWatchFace = watchResourcesInfo2;
                }
            });
            reportSuccessFaceInfo();
            m.a("5.39.2", GsonHelper.toJson(linkedList), 2);
        } catch (TlvException unused) {
            HwLog.e(TAG, "handleFaceInfo() TlvException");
        } catch (IndexOutOfBoundsException unused2) {
            HwLog.e(TAG, "handleFaceInfo() IndexOutOfBoundsException");
        }
    }

    private void handleKaleidoscopeInfo(byte[] bArr) {
        String strA = i1.a(bArr);
        String str = TAG;
        HwLog.i(str, "5.39.17 handleKaleidoscopeInfo() info: " + strA);
        m.a("5.39.17", strA, 2);
        try {
            TlvFather tlvFatherBuilderTlvList = this.mTlvUtils.builderTlvList(SafeString.substring(strA, CommonUtils.b(17)));
            List<Tlv> tlvList = tlvFatherBuilderTlvList.getTlvList();
            if (tlvList == null || tlvList.isEmpty()) {
                HwLog.w(str, "handleKaleidoscopeInfo() tlvList error");
            } else {
                for (Tlv tlv : tlvList) {
                    handleKaleidoscopeInfoTlv(IntegerUtils.b(tlv.getTag(), 16), tlv.getValue());
                }
            }
            HwLog.i(TAG, "handleKaleidoscopeInfo() struct size:" + tlvFatherBuilderTlvList.getTlvFatherList().size());
            if (tlvFatherBuilderTlvList.getTlvFatherList().isEmpty()) {
                this.mWatchFaceKaleidoscopeInfo.setMaterialImageList(new ArrayList<>(20));
            } else {
                handleKaleidoscopeStruct(tlvFatherBuilderTlvList.getTlvFatherList().get(0));
            }
        } catch (TlvException unused) {
            HwLog.e(TAG, "handleKaleidoscopeInfo() TlvException");
        }
        synchronized (getCommandCallbackCallbackList()) {
            List<IBaseResponseCallback> list = sCommandCallbacks.get(17);
            if (list == null || list.isEmpty()) {
                HwLog.w(TAG, "handleKaleidoscopeInfo() callback error");
            } else {
                list.get(list.size() - 1).onResponse(101, this.mWatchFaceKaleidoscopeInfo);
                sCommandCallbacks.remove(17);
            }
        }
    }

    private void handleKaleidoscopeInfoTlv(int i, String str) {
        if (i == 1) {
            this.mWatchFaceKaleidoscopeInfo.setMaxMaterialImages(IntegerUtils.b(str, 16));
            HwLog.i(TAG, "handleKaleidoscopeInfoTlv() setMaxMaterialImages:" + this.mWatchFaceKaleidoscopeInfo.getMaxMaterialImages());
            return;
        }
        if (i == 2) {
            this.mWatchFaceKaleidoscopeInfo.setMaterialImageType(IntegerUtils.b(str, 16));
            HwLog.i(TAG, "handleKaleidoscopeInfoTlv() setMaterialImageType:" + this.mWatchFaceKaleidoscopeInfo.getMaterialImageType());
            return;
        }
        if (i == 7) {
            this.mWatchFaceKaleidoscopeInfo.setCurrentMaterialImageIndex(IntegerUtils.b(str, 16));
            HwLog.i(TAG, "handleKaleidoscopeInfoTlv() setCurrentMaterialImageIndex:" + this.mWatchFaceKaleidoscopeInfo.getCurrentMaterialImageIndex());
            return;
        }
        if (i == 8) {
            this.mWatchFaceKaleidoscopeInfo.setHandsStyleIndex(IntegerUtils.b(str, 16));
            HwLog.i(TAG, "handleKaleidoscopeInfoTlv() setHandsStyleIndex:" + this.mWatchFaceKaleidoscopeInfo.getHandsStyleIndex());
            return;
        }
        if (i != 9) {
            HwLog.w(TAG, "handleKaleidoscopeInfoTlv() default type:" + i);
            return;
        }
        this.mWatchFaceKaleidoscopeInfo.setKaleidoscopeType(IntegerUtils.b(str, 16));
        HwLog.i(TAG, "handleKaleidoscopeInfoTlv() setKaleidoscopeType:" + this.mWatchFaceKaleidoscopeInfo.getKaleidoscopeType());
    }

    private void handleKaleidoscopeStatus(byte[] bArr) {
        int i;
        String strA = i1.a(bArr);
        String str = TAG;
        HwLog.i(str, "5.39.18 handleKaleidoscopeStatus() info: " + strA);
        m.a("5.39.18", strA, 2);
        int iB = 0;
        try {
            List<Tlv> tlvList = this.mTlvUtils.builderTlvList(SafeString.substring(strA, CommonUtils.b(18))).getTlvList();
            if (tlvList == null || tlvList.isEmpty()) {
                HwLog.w(str, "handleKaleidoscopeStatus() tlv error.");
                i = 0;
            } else {
                int iB2 = 0;
                for (Tlv tlv : tlvList) {
                    try {
                        int iB3 = IntegerUtils.b(tlv.getTag(), 16);
                        String value = tlv.getValue();
                        if (iB3 == 9) {
                            iB = IntegerUtils.b(value, 16);
                            HwLog.i(TAG, "handleKaleidoscopeStatus() transferNum:" + iB);
                        } else if (iB3 != 127) {
                            HwLog.w(TAG, "handleKaleidoscopeStatus() nothing to do.");
                        } else {
                            iB2 = IntegerUtils.b(value, 16);
                            HwLog.i(TAG, "handleKaleidoscopeStatus() HwWatchFaceBtConstant.ERROR_CODE:" + iB2);
                        }
                    } catch (TlvException unused) {
                        i = iB;
                        iB = iB2;
                        HwLog.e(TAG, "handleKaleidoscopeStatus() error.");
                    }
                }
                i = iB;
                iB = iB2;
            }
        } catch (TlvException unused2) {
            i = iB;
        }
        reportKaleidoscopeStatus(iB, i);
    }

    private void handleKaleidoscopeStruct(TlvFather tlvFather) {
        HwLog.i(TAG, "handleKaleidoscopeStruct() enter.");
        ArrayList<KaleidoscopeStruct> arrayList = new ArrayList<>();
        Iterator<TlvFather> it = tlvFather.getTlvFatherList().iterator();
        int iC = -1;
        String strB = "";
        while (it.hasNext()) {
            for (Tlv tlv : it.next().getTlvList()) {
                int iC2 = IntegerUtils.c(tlv.getTag());
                if (iC2 == 5) {
                    iC = IntegerUtils.c(tlv.getValue());
                    HwLog.i(TAG, "handleKaleidoscopeStruct() materialImageIndex: " + iC);
                } else if (iC2 != 6) {
                    HwLog.w(TAG, "handleKaleidoscopeStruct() error");
                } else {
                    strB = i1.b(tlv.getValue());
                    HwLog.i(TAG, "handleKaleidoscopeStruct() materialImageName: " + strB);
                }
            }
            arrayList.add(new KaleidoscopeStruct(iC, strB));
        }
        HwLog.i(TAG, "handleKaleidoscopeStruct() kaleidoscopeStructs.size: " + arrayList.size());
        this.mWatchFaceKaleidoscopeInfo.setMaterialImageList(arrayList);
    }

    private void handleNameInfo(byte[] bArr) {
        String strA = i1.a(bArr);
        String str = TAG;
        HwLog.i(str, "5.39.6 handleNameInfo() info: " + strA);
        m.a("5.39.6", strA, 2);
        if (TextUtils.isEmpty(strA) || strA.length() < CommonUtils.l()) {
            HwLog.w(str, "handleNameInfo() data is error");
            return;
        }
        try {
            TlvFather tlvFather = this.mTlvUtils.builderTlvList(SafeString.substring(strA, CommonUtils.l())).getTlvFatherList().get(0);
            HwLog.i(str, "handleNameInfo() size:" + tlvFather.getTlvFatherList().size());
            HashMap<String, WatchResourcesInfo> map = new HashMap<>(20);
            Iterator<TlvFather> it = tlvFather.getTlvFatherList().iterator();
            while (it.hasNext()) {
                handleOneTlv(map, it.next());
            }
            HwLog.i(TAG, "handleNameInfo() End, nameMap size:" + map.size());
            reportWatchFaceNameInfo(map);
        } catch (TlvException unused) {
            HwLog.e(TAG, "handleNameInfo() TlvException");
        } catch (IndexOutOfBoundsException unused2) {
            HwLog.e(TAG, "handleNameInfo() IndexOutOfBoundsException");
        } catch (NumberFormatException unused3) {
            HwLog.e(TAG, "handleNameInfo() NumberFormatException");
        }
    }

    private void handleOneTlv(HashMap<String, WatchResourcesInfo> map, TlvFather tlvFather) {
        WatchResourcesInfo watchResourcesInfo = new WatchResourcesInfo();
        String strMarkDownVipFreeWatchFace = "";
        for (Tlv tlv : tlvFather.getTlvList()) {
            int iB = IntegerUtils.b(tlv.getTag(), 16);
            if (iB == 4) {
                strMarkDownVipFreeWatchFace = watchResourcesInfo.markDownVipFreeWatchFace(i1.b(tlv.getValue()));
                HwLog.i(TAG, "handleOneTlv() watchFaceId:" + strMarkDownVipFreeWatchFace);
            } else if (iB == 5) {
                watchResourcesInfo.setWatchInfoName(i1.b(tlv.getValue()));
                HwLog.i(TAG, "handleOneTlv() watchFaceName:" + watchResourcesInfo.getWatchInfoName());
            } else if (iB == 6) {
                watchResourcesInfo.setWatchInfoBrief(i1.b(tlv.getValue()));
                HwLog.i(TAG, "handleOneTlv() watchFaceBrief:" + watchResourcesInfo.getWatchInfoBrief());
            } else if (iB != 7) {
                HwLog.w(TAG, "handleOneTlv() default:" + IntegerUtils.b(tlv.getTag(), 16));
            } else {
                watchResourcesInfo.setWatchInfoSize(IntegerUtils.b(tlv.getValue(), 16));
                HwLog.i(TAG, "handleOneTlv() watchFaceSize:" + watchResourcesInfo.getWatchInfoSize());
            }
        }
        HwLog.i(TAG, "handleOneTlv() watchFaceId:" + strMarkDownVipFreeWatchFace + ", watchFaceInfo:" + watchResourcesInfo.toString());
        map.put(strMarkDownVipFreeWatchFace, watchResourcesInfo);
    }

    private void handlePhotoInfo(byte[] bArr) {
        String strA = i1.a(bArr);
        String str = TAG;
        HwLog.i(str, "5.39.8 handlePhotoInfo() info:" + strA);
        m.a("5.39.8", strA, 2);
        try {
            TlvFather tlvFatherBuilderTlvList = this.mTlvUtils.builderTlvList(SafeString.substring(strA, CommonUtils.l()));
            List<Tlv> tlvList = tlvFatherBuilderTlvList.getTlvList();
            if (tlvList == null || tlvList.isEmpty()) {
                HwLog.w(str, "handlePhotoInfo() tlvList error");
            } else {
                for (Tlv tlv : tlvList) {
                    handlePhotoInfoTlv(IntegerUtils.b(tlv.getTag(), 16), tlv.getValue());
                }
            }
            HwLog.i(TAG, "handlePhotoInfo() struct size:" + tlvFatherBuilderTlvList.getTlvFatherList().size());
            if (tlvFatherBuilderTlvList.getTlvFatherList().isEmpty()) {
                this.mWatchFacePhotoInfo.setBackgroundList(new ArrayList<>(20));
            } else {
                handleBackground(tlvFatherBuilderTlvList.getTlvFatherList().get(0));
            }
        } catch (TlvException unused) {
            HwLog.e(TAG, "handlePhotoInfo() TlvException");
        }
        synchronized (getCommandCallbackCallbackList()) {
            List<IBaseResponseCallback> list = sCommandCallbacks.get(8);
            if (list == null || list.isEmpty()) {
                HwLog.w(TAG, "handlePhotoInfo() callback error");
            } else {
                list.get(list.size() - 1).onResponse(101, this.mWatchFacePhotoInfo);
                sCommandCallbacks.remove(8);
            }
        }
    }

    private void handlePhotoInfoTlv(int i, String str) {
        if (i == 1) {
            this.mWatchFacePhotoInfo.setMaxBackgroundImages(IntegerUtils.b(str, 16));
            HwLog.i(TAG, "handlePhotoInfoTlv() setMaxBackgroundImages:" + this.mWatchFacePhotoInfo.getMaxBackgroundImages());
            return;
        }
        if (i == 2) {
            if (IntegerUtils.b(str, 16) == 1) {
                this.mWatchFacePhotoInfo.setSupportIntellectColor(true);
            } else {
                this.mWatchFacePhotoInfo.setSupportIntellectColor(false);
            }
            HwLog.i(TAG, "handlePhotoInfoTlv() setSupportIntellectColor:" + this.mWatchFacePhotoInfo.isSupportIntellectColor());
            return;
        }
        if (i == 3) {
            this.mWatchFacePhotoInfo.setBackgroundType(IntegerUtils.b(str, 16));
            HwLog.i(TAG, "handlePhotoInfoTlv() setBackgroundType:" + this.mWatchFacePhotoInfo.getBackgroundType());
            return;
        }
        switch (i) {
            case 8:
                this.mWatchFacePhotoInfo.setPositionIndex(IntegerUtils.b(str, 16));
                HwLog.i(TAG, "handlePhotoInfoTlv() setPositionIndex:" + this.mWatchFacePhotoInfo.getPositionIndex());
                break;
            case 9:
                this.mWatchFacePhotoInfo.setStyleIndex(IntegerUtils.b(str, 16));
                HwLog.i(TAG, "handlePhotoInfoTlv() setStyleIndex:" + this.mWatchFacePhotoInfo.getStyleIndex());
                break;
            case 10:
                this.mWatchFacePhotoInfo.setDataIndex(IntegerUtils.b(str, 16));
                HwLog.i(TAG, "handlePhotoInfoTlv() setDataIndex:" + this.mWatchFacePhotoInfo.getDataIndex());
                break;
            case 11:
                this.mWatchFacePhotoInfo.setBgImageOption(IntegerUtils.b(str, 16));
                HwLog.i(TAG, "handlePhotoInfoTlv() setBgImageOption:" + this.mWatchFacePhotoInfo.getBgImageOption());
                break;
            case 12:
                this.mWatchFacePhotoInfo.setPositionIndex(IntegerUtils.b(str, 16));
                HwLog.i(TAG, "handlePhotoInfoTlv() setPortPositionIndex:" + this.mWatchFacePhotoInfo.getPortPositionIndex());
                break;
            case 13:
                this.mWatchFacePhotoInfo.setPortraitMode(IntegerUtils.b(str, 16));
                HwLog.i(TAG, "handleDeviceInfoTlv() setPortraitMode:" + this.mWatchFacePhotoInfo.getPortraitMode());
                break;
            default:
                HwLog.w(TAG, "handlePhotoInfoTlv() default type:" + i);
                break;
        }
    }

    private void handlePhotoStatus(byte[] bArr) {
        int i;
        String strA = i1.a(bArr);
        String str = TAG;
        HwLog.i(str, "5.39.9 handlePhotoStatus() info: " + strA);
        m.a("5.39.9", strA, 2);
        int iB = 0;
        try {
            List<Tlv> tlvList = this.mTlvUtils.builderTlvList(SafeString.substring(strA, CommonUtils.l())).getTlvList();
            if (tlvList == null || tlvList.isEmpty()) {
                HwLog.w(str, "handlePhotoStatus() tlv error");
                i = 0;
            } else {
                int iB2 = 0;
                for (Tlv tlv : tlvList) {
                    try {
                        int iB3 = IntegerUtils.b(tlv.getTag(), 16);
                        String value = tlv.getValue();
                        if (iB3 == 8) {
                            iB = IntegerUtils.b(value, 16);
                            HwLog.i(TAG, "handlePhotoStatus() transferNum:" + iB);
                        } else if (iB3 != 127) {
                            HwLog.w(TAG, "handlePhotoStatus(), nothing to do");
                        } else {
                            iB2 = IntegerUtils.b(value, 16);
                            HwLog.i(TAG, "handlePhotoStatus() HwWatchFaceBtConstant.ERROR_CODE:" + iB2);
                        }
                    } catch (TlvException unused) {
                        i = iB;
                        iB = iB2;
                        HwLog.e(TAG, "handlePhotoStatus() error");
                    }
                }
                i = iB;
                iB = iB2;
            }
        } catch (TlvException unused2) {
            i = iB;
        }
        reportPhotoStatus(iB, i);
    }

    private void handlePurchasedTlvInfo(TlvFather tlvFather) {
        if (tlvFather == null) {
            HwLog.e(TAG, "handlePurchasedTlvInfo() purchasedTlvFather is empty.");
            return;
        }
        List<TlvFather> tlvFatherList = tlvFather.getTlvFatherList();
        ArrayList arrayList = new ArrayList(20);
        if (ArrayUtils.isEmpty(tlvFatherList)) {
            HwLog.e(TAG, "handlePurchasedTlvInfo() purchasedTlvList is empty.");
            this.mWatchFaceSupportInfo.setPurchasedList(arrayList);
            return;
        }
        for (TlvFather tlvFather2 : tlvFatherList) {
            ScreenInfo screenInfo = new ScreenInfo();
            for (Tlv tlv : tlvFather2.getTlvList()) {
                switch (IntegerUtils.b(tlv.getTag(), 16)) {
                    case 14:
                        screenInfo.setWidth(IntegerUtils.b(tlv.getValue(), 16));
                        HwLog.i(TAG, "handlePurchasedTlvInfo() setWidth:" + screenInfo.getWidth());
                        break;
                    case 15:
                        screenInfo.setHeight(IntegerUtils.b(tlv.getValue(), 16));
                        HwLog.i(TAG, "handlePurchasedTlvInfo() setHeight:" + screenInfo.getHeight());
                        break;
                    case 16:
                        screenInfo.setSupportVersion(i1.b(tlv.getValue()));
                        HwLog.i(TAG, "handlePurchasedTlvInfo() getSupportVersion:" + screenInfo.getSupportVersion());
                        break;
                    default:
                        HwLog.w(TAG, "handlePurchasedTlvInfo() invalid type.");
                        break;
                }
            }
            arrayList.add(screenInfo);
        }
        this.mWatchFaceSupportInfo.setPurchasedList(arrayList);
    }

    private void handleReportStatus(byte[] bArr) {
        String strA = i1.a(bArr);
        String str = TAG;
        HwLog.i(str, "5.39.5 handleReportStatus() info:" + strA);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        WatchResourcesInfo watchResourcesInfo = new WatchResourcesInfo();
        int i = 0;
        int iB = 100000;
        try {
            List<Tlv> tlvList = this.mTlvUtils.builderTlvList(SafeString.substring(strA, CommonUtils.l())).getTlvList();
            if (tlvList == null || tlvList.isEmpty()) {
                HwLog.w(str, "handleReportStatus() tlvList error");
            } else {
                for (Tlv tlv : tlvList) {
                    int iB2 = IntegerUtils.b(tlv.getTag(), 16);
                    String value = tlv.getValue();
                    if (iB2 == 127) {
                        iB = IntegerUtils.b(value, 16);
                        HwLog.i(TAG, "handleReportStatus() errorCode:" + iB);
                        linkedHashMap.put("errorCode", String.valueOf(iB));
                    } else if (iB2 == 1) {
                        watchResourcesInfo.setWatchInfoId(watchResourcesInfo.markDownVipFreeWatchFace(i1.b(value)));
                        HwLog.i(TAG, "handleReportStatus() setWatchInfo_Id:" + watchResourcesInfo.getWatchInfoId());
                        linkedHashMap.put("watchfaceId", watchResourcesInfo.getWatchInfoId());
                    } else if (iB2 == 2) {
                        watchResourcesInfo.setWatchInfoVersion(i1.b(value));
                        HwLog.i(TAG, "handleReportStatus() setWatchInfo_Version:" + watchResourcesInfo.getWatchInfoVersion());
                        linkedHashMap.put("watchfaceVersion", watchResourcesInfo.getWatchInfoVersion());
                    } else if (iB2 == 3) {
                        int iB3 = IntegerUtils.b(value, 16);
                        try {
                            HwLog.i(TAG, "handleReportStatus() reportType:" + iB3);
                            linkedHashMap.put("reportType", String.valueOf(iB3));
                            i = iB3;
                        } catch (TlvException unused) {
                            i = iB3;
                            HwLog.e(TAG, "handleReportStatus() TlvException");
                            linkedHashMap.put("commandOrg", strA);
                            m.a("5.39.5", GsonHelper.toJson(linkedHashMap), 2);
                            reportAck(watchResourcesInfo, iB);
                            reportStatusForUi(i, watchResourcesInfo);
                        }
                    } else if (iB2 != 4) {
                        HwLog.w(TAG, "handleReportStatus(), nothing to do:" + iB2);
                    } else {
                        watchResourcesInfo.setFailedNum(IntegerUtils.b(value, 16));
                        HwLog.i(TAG, "handleReportStatus() failed num:" + watchResourcesInfo.getFailedNum());
                        linkedHashMap.put("failedNum", String.valueOf(watchResourcesInfo.getFailedNum()));
                    }
                    if (watchResourcesInfo.isVipFreeWatchFace() && i == 3) {
                        HwLog.w(TAG, "handleReportStatus(), isVipFreeWatchFace");
                        HwWatchFaceManager.getInstance(this.mContext).removeVipFreeWatchFace(watchResourcesInfo.getWatchInfoId());
                    }
                }
            }
        } catch (TlvException unused2) {
        }
        linkedHashMap.put("commandOrg", strA);
        m.a("5.39.5", GsonHelper.toJson(linkedHashMap), 2);
        reportAck(watchResourcesInfo, iB);
        reportStatusForUi(i, watchResourcesInfo);
    }

    private void handleVideoInfo(byte[] bArr) {
        String strA = i1.a(bArr);
        String str = TAG;
        HwLog.i(str, "5.39.15 handleVideoInfo() info:" + strA);
        m.a("5.39.15", strA, 2);
        try {
            TlvFather tlvFatherBuilderTlvList = this.mTlvUtils.builderTlvList(SafeString.substring(strA, CommonUtils.b(15)));
            List<Tlv> tlvList = tlvFatherBuilderTlvList.getTlvList();
            if (tlvList == null || tlvList.isEmpty()) {
                HwLog.w(str, "handleVideoInfo() tlvList error");
            } else {
                for (Tlv tlv : tlvList) {
                    handleVideoInfoTlv(IntegerUtils.b(tlv.getTag(), 16), tlv.getValue());
                }
            }
            HwLog.i(TAG, "handleVideoInfo() struct size:" + tlvFatherBuilderTlvList.getTlvFatherList().size());
            if (tlvFatherBuilderTlvList.getTlvFatherList().isEmpty()) {
                this.mWatchFaceVideoInfo.setVideoList(new ArrayList<>(20));
            } else {
                handleVideoStruct(tlvFatherBuilderTlvList.getTlvFatherList().get(0));
            }
        } catch (TlvException unused) {
            HwLog.e(TAG, "handleVideoInfo() TlvException");
        }
        synchronized (getCommandCallbackCallbackList()) {
            List<IBaseResponseCallback> list = sCommandCallbacks.get(15);
            if (list == null || list.isEmpty()) {
                HwLog.w(TAG, "handleVideoInfo() callback error");
            } else {
                list.get(list.size() - 1).onResponse(101, this.mWatchFaceVideoInfo);
                sCommandCallbacks.remove(15);
            }
        }
    }

    private void handleVideoInfoTlv(int i, String str) {
        if (i == 1) {
            this.mWatchFaceVideoInfo.setMaxVideoNum(IntegerUtils.b(str, 16));
            HwLog.i(TAG, "handleVideoInfoTlv() setMaxVideoNum:" + this.mWatchFaceVideoInfo.getMaxVideoNum());
            return;
        }
        if (i == 2) {
            this.mWatchFaceVideoInfo.setVideoType(IntegerUtils.b(str, 16));
            HwLog.i(TAG, "handleVideoInfoTlv() setVideoType:" + this.mWatchFaceVideoInfo.getVideoType());
            return;
        }
        switch (i) {
            case 10:
                this.mWatchFaceVideoInfo.setPositionIndex(IntegerUtils.b(str, 16));
                HwLog.i(TAG, "handleVideoInfoTlv() setPositionIndex:" + this.mWatchFaceVideoInfo.getPositionIndex());
                break;
            case 11:
                this.mWatchFaceVideoInfo.setStyleIndex(IntegerUtils.b(str, 16));
                HwLog.i(TAG, "handleVideoInfoTlv() setStyleIndex:" + this.mWatchFaceVideoInfo.getStyleIndex());
                break;
            case 12:
                this.mWatchFaceVideoInfo.setDataIndex(IntegerUtils.b(str, 16));
                HwLog.i(TAG, "handleVideoInfoTlv() setDataIndex:" + this.mWatchFaceVideoInfo.getDataIndex());
                break;
            default:
                HwLog.w(TAG, "handleVideoInfoTlv() default type:" + i);
                break;
        }
    }

    private void handleVideoStatus(byte[] bArr) {
        int i;
        int iB;
        int iB2;
        String strA = i1.a(bArr);
        String str = TAG;
        HwLog.i(str, "5.39.16 handleVideoStatus() info: " + strA);
        m.a("5.39.16", strA, 2);
        int iB3 = 0;
        try {
            List<Tlv> tlvList = this.mTlvUtils.builderTlvList(SafeString.substring(strA, CommonUtils.b(16))).getTlvList();
            if (tlvList == null || tlvList.isEmpty()) {
                HwLog.w(str, "handleVideoStatus() tlv error.");
                i = 0;
                iB2 = 0;
            } else {
                iB = 0;
                iB2 = 0;
                for (Tlv tlv : tlvList) {
                    try {
                        int iB4 = IntegerUtils.b(tlv.getTag(), 16);
                        String value = tlv.getValue();
                        if (iB4 == 13) {
                            iB3 = IntegerUtils.b(value, 16);
                            HwLog.i(TAG, "handleVideoStatus() transferPreviewNum:" + iB3);
                        } else if (iB4 == 14) {
                            iB2 = IntegerUtils.b(value, 16);
                            HwLog.i(TAG, "handleVideoStatus() transferVideoNum:" + iB2);
                        } else if (iB4 != 127) {
                            HwLog.w(TAG, "handleVideoStatus() nothing to do.");
                        } else {
                            iB = IntegerUtils.b(value, 16);
                            HwLog.i(TAG, "handleVideoStatus() HwWatchFaceBtConstant.ERROR_CODE:" + iB);
                        }
                    } catch (TlvException unused) {
                        i = iB3;
                        iB3 = iB2;
                        HwLog.e(TAG, "handleVideoStatus() error.");
                        iB2 = iB3;
                    }
                }
                i = iB3;
                iB3 = iB;
            }
        } catch (TlvException unused2) {
            i = 0;
            iB = 0;
        }
        reportVideoStatus(iB3, i, iB2);
    }

    private void handleVideoStruct(TlvFather tlvFather) {
        HwLog.i(TAG, "handleVideoStruct() enter.");
        TreeMap treeMap = new TreeMap();
        Iterator<TlvFather> it = tlvFather.getTlvFatherList().iterator();
        int iC = -1;
        int iC2 = -1;
        int iC3 = -1;
        String strB = "";
        while (it.hasNext()) {
            for (Tlv tlv : it.next().getTlvList()) {
                switch (IntegerUtils.c(tlv.getTag())) {
                    case 5:
                        iC3 = IntegerUtils.c(tlv.getValue());
                        HwLog.i(TAG, "handleVideoStruct() videoIndex: " + iC3);
                        break;
                    case 6:
                        strB = i1.b(tlv.getValue());
                        HwLog.i(TAG, "handleVideoStruct() videoName: " + strB);
                        break;
                    case 7:
                        iC2 = IntegerUtils.c(tlv.getValue());
                        HwLog.i(TAG, "handleVideoStruct() videoAttribute: " + iC2);
                        break;
                    case 8:
                        String strB2 = i1.b(tlv.getValue());
                        HwLog.i(TAG, "handleVideoStruct() videoPreViewName: " + strB2);
                        break;
                    case 9:
                        iC = IntegerUtils.c(tlv.getValue());
                        HwLog.i(TAG, "handleVideoStruct() videoStatus: " + iC);
                        break;
                    default:
                        HwLog.w(TAG, "handleVideoStruct() error");
                        break;
                }
            }
            if (iC3 != -1 && !TextUtils.isEmpty(strB) && iC2 != -1) {
                treeMap.put(Integer.valueOf(iC3), new VideoStruct(strB, "", iC2, iC));
            }
        }
        HwLog.i(TAG, "handleVideoStruct() map.size: " + treeMap.size());
        Iterator it2 = treeMap.keySet().iterator();
        ArrayList<VideoStruct> arrayList = new ArrayList<>(20);
        while (it2.hasNext()) {
            arrayList.add((VideoStruct) treeMap.get(it2.next()));
        }
        HwLog.i(TAG, "handleVideoStruct() videoStructs.size: " + arrayList.size());
        this.mWatchFaceVideoInfo.setVideoList(arrayList);
    }

    private void handleWatchFaceCallbackResult(byte[] bArr) {
        byte b2 = bArr[1];
        String str = TAG;
        HwLog.w(str, "handleCallbackResult() commandId: " + ((int) b2));
        switch (b2) {
            case 1:
                HwWatchFaceManager.getInstance(this.mContext).setIsBtConnect(true);
                handleDeviceInfo(bArr);
                writeWatchFaceSupportInfo2Sp();
                reportSuccess();
                break;
            case 2:
                handleFaceInfo(bArr);
                break;
            case 3:
                handleApply(bArr);
                break;
            case 4:
                handleErrorCode(bArr, 4);
                break;
            case 5:
                handleReportStatus(bArr);
                break;
            case 6:
                handleNameInfo(bArr);
                break;
            case 7:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            default:
                HwLog.w(str, "handleCallbackResult() illegal CommandId");
                break;
            case 8:
                handlePhotoInfo(bArr);
                break;
            case 9:
                handlePhotoStatus(bArr);
                break;
            case 15:
                handleVideoInfo(bArr);
                break;
            case 16:
                handleVideoStatus(bArr);
                break;
            case 17:
                handleKaleidoscopeInfo(bArr);
                break;
            case 18:
                handleKaleidoscopeStatus(bArr);
                break;
            case 19:
                handleWearInfo(bArr);
                break;
            case 20:
                handleWearStatus(bArr);
                break;
        }
    }

    private void handleWatchfaceInfoEx(TlvFather tlvFather) {
        List<Tlv> tlvList = tlvFather.getTlvList();
        if (ArrayUtils.isEmpty(tlvList)) {
            HwLog.i(TAG, "handleWatchfaceInfoEx tlvList is empty");
            return;
        }
        for (Tlv tlv : tlvList) {
            int iB = IntegerUtils.b(tlv.getTag(), 16);
            if (iB == 8) {
                this.mIsWatchfaceFull = IntegerUtils.b(tlv.getValue(), 16);
                HwLog.i(TAG, "handleWatchfaceInfoEx mIsWatchfaceFull:" + this.mIsWatchfaceFull);
            } else if (iB != 9) {
                HwLog.w(TAG, "handleWatchfaceInfoEx(), nothing to do");
            } else {
                this.mLeftSpace = IntegerUtils.b(tlv.getValue(), 16);
                HwLog.i(TAG, "handleWatchfaceInfoEx mLeftSpace:" + this.mLeftSpace);
            }
        }
    }

    private void handleWearInfo(byte[] bArr) {
        String strA = i1.a(bArr);
        this.mWatchFaceWearInfo = null;
        this.mWatchFaceWearInfo = new WatchFaceWearInfo();
        String str = TAG;
        HwLog.i(str, "5.39.19 handleWearInfo() info: " + strA);
        m.a("5.39.19", strA, 2);
        try {
            TlvFather tlvFatherBuilderTlvList = this.mTlvUtils.builderTlvList(SafeString.substring(strA, CommonUtils.b(19)));
            List<Tlv> tlvList = tlvFatherBuilderTlvList.getTlvList();
            if (tlvList == null || tlvList.isEmpty()) {
                HwLog.w(str, "handleWearInfo() tlvList error");
            } else {
                for (Tlv tlv : tlvList) {
                    handleWearInfoTlv(IntegerUtils.b(tlv.getTag(), 16), tlv.getValue());
                }
            }
            if (tlvFatherBuilderTlvList.getTlvFatherList().isEmpty()) {
                this.mWatchFaceWearInfo.setWearList(new ArrayList<>(20));
            } else {
                handleWearInfoTlv(tlvFatherBuilderTlvList.getTlvFatherList().get(0));
            }
        } catch (TlvException e) {
            HwLog.e(TAG, "handleWearInfo() TlvException" + HwLog.printException((Exception) e));
        }
        synchronized (getCommandCallbackCallbackList()) {
            List<IBaseResponseCallback> list = sCommandCallbacks.get(19);
            if (list == null || list.isEmpty()) {
                HwLog.w(TAG, "handleWearInfo() callback error");
            } else {
                list.get(list.size() - 1).onResponse(101, this.mWatchFaceWearInfo);
                sCommandCallbacks.remove(19);
            }
        }
    }

    private void handleWearInfoTlv(int i, String str) {
        if (i == 1) {
            this.mWatchFaceWearInfo.setMaxStyleNum(IntegerUtils.b(str, 16));
            HwLog.d(TAG, "handleWearInfoTlv() setMaxStyleNum: " + this.mWatchFaceWearInfo.getMaxStyleNum());
            return;
        }
        if (i == 2) {
            this.mWatchFaceWearInfo.setStyleCount(IntegerUtils.b(str, 16));
            HwLog.d(TAG, "handleWearInfoTlv() setStyleCount: " + this.mWatchFaceWearInfo.getStyleCount());
            return;
        }
        if (i == 3) {
            this.mWatchFaceWearInfo.setWearStyleType(IntegerUtils.b(str, 16));
            HwLog.d(TAG, "handleWearInfoTlv() setWearStyleType: " + this.mWatchFaceWearInfo.getWearStyleType());
            return;
        }
        if (i == 4) {
            this.mWatchFaceWearInfo.setWearTypeCapability(IntegerUtils.a(str, 16));
            HwLog.d(TAG, "handleWearInfoTlv() setWearTypeCapability: " + this.mWatchFaceWearInfo.getWearTypeCapability());
            return;
        }
        if (i == 5) {
            this.mWatchFaceWearInfo.setClockTypeCapability(IntegerUtils.a(str, 16));
            HwLog.d(TAG, "handleWearInfoTlv() setClockTypeCapability: " + this.mWatchFaceWearInfo.getClockTypeCapability());
            return;
        }
        switch (i) {
            case 10:
                this.mWatchFaceWearInfo.setCurStyleIndex(IntegerUtils.a(str, 16));
                HwLog.d(TAG, "handleWearInfoTlv() setCurStyleIndex: " + this.mWatchFaceWearInfo.getCurStyleIndex());
                break;
            case 11:
                this.mWatchFaceWearInfo.setWearImageOption(IntegerUtils.b(str, 16));
                HwLog.d(TAG, "handleWearInfoTlv() setWearImageOption: " + this.mWatchFaceWearInfo.getWearImageOption());
                break;
            case 12:
                this.mWatchFaceWearInfo.setTintClockOption(IntegerUtils.b(str, 16));
                HwLog.d(TAG, "handleWearInfoTlv() setTintClockOption: " + this.mWatchFaceWearInfo.getTintClockOption());
                break;
            case 13:
                this.mWatchFaceWearInfo.setRectRadius(IntegerUtils.b(str, 16));
                HwLog.d(TAG, "handleWearInfoTlv() setRectRadius: " + this.mWatchFaceWearInfo.getRectRadius());
                break;
            default:
                HwLog.w(TAG, "handleWearInfoTlv() default type:" + i);
                break;
        }
    }

    private void handleWearStatus(byte[] bArr) {
        int i;
        String strA = i1.a(bArr);
        String str = TAG;
        HwLog.i(str, "5.39.20 handleWearStatus() info: " + strA);
        m.a("5.39.20", strA, 2);
        int iB = 0;
        try {
            List<Tlv> tlvList = this.mTlvUtils.builderTlvList(SafeString.substring(strA, CommonUtils.b(20))).getTlvList();
            if (tlvList == null || tlvList.isEmpty()) {
                HwLog.e(str, "handleWearStatus() tlv error.");
                i = 0;
            } else {
                int iB2 = 0;
                for (Tlv tlv : tlvList) {
                    try {
                        int iB3 = IntegerUtils.b(tlv.getTag(), 16);
                        String value = tlv.getValue();
                        if (iB3 == 11) {
                            iB = IntegerUtils.b(value, 16);
                            HwLog.i(TAG, "handleWearStatus() transferNum:" + iB);
                        } else if (iB3 != 127) {
                            HwLog.w(TAG, "handleWearStatus() nothing to do.");
                        } else {
                            iB2 = IntegerUtils.b(value, 16);
                            HwLog.i(TAG, "handleWearStatus() errorCode:" + iB2);
                        }
                    } catch (TlvException e) {
                        e = e;
                        int i2 = iB;
                        iB = iB2;
                        i = i2;
                        HwLog.e(TAG, "handleWearStatus() error." + HwLog.printException((Exception) e));
                    }
                }
                int i3 = iB;
                iB = iB2;
                i = i3;
            }
        } catch (TlvException e2) {
            e = e2;
            i = iB;
        }
        reportWearStatus(iB, i);
    }

    private boolean isCommandForThemeWatch(byte[] bArr) {
        String strSubstring = SafeString.substring(i1.a(bArr), 4, CommonUtils.l());
        HwLog.i(TAG, "isCommandForThemeWatch() appId: " + strSubstring);
        return strSubstring.equalsIgnoreCase(CommonUtils.b());
    }

    public static boolean isHandoffServiceSupported() {
        boolean z = false;
        try {
            Class.forName(CLASS_NAME_OF_HANDOFF_SDK);
            String strA = ohc.d().a();
            String str = TAG;
            HwLog.i(str, "HwOneHopSdk versionCodeString :" + strA);
            if (TextUtils.isEmpty(strA)) {
                return false;
            }
            String[] strArrSplit = strA.split("\\.");
            if (strArrSplit.length > 3) {
                z = (CommonUtils.a(strArrSplit[1], 0) != 2 || CommonUtils.a(strArrSplit[2], 0) < 1) ? CommonUtils.a(strArrSplit[1], 0) > 2 : true;
            }
            HwLog.i(str, "isHandoffServiceSupported:" + z);
            return z;
        } catch (ClassNotFoundException unused) {
            HwLog.e(TAG, "isHandoffServiceSupported can not find HwHandoffSdk");
            return false;
        }
    }

    private boolean isPhoneSupport() {
        PackageManager packageManager = Environment.getApplicationContext().getPackageManager();
        if (packageManager == null) {
            return false;
        }
        boolean zHasSystemFeature = packageManager.hasSystemFeature("android.hardware.nfc");
        HwLog.i(TAG, "PackageManager isSupportNfc:" + zHasSystemFeature);
        return zHasSystemFeature && isHandoffServiceSupported();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$judgeDataShareAuth$5(IBaseResponseCallback iBaseResponseCallback, int i, Object obj) {
        HwLog.i(TAG, "judgeDataShareAuth() getDeviceList onResult i: " + i);
        if (i == 0) {
            this.mIsJudgeSecondAuth = true;
            getDeviceInfoForUi(iBaseResponseCallback);
        } else if (2 == i) {
            iBaseResponseCallback.onResponse(2, "");
        } else {
            iBaseResponseCallback.onResponse(1, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(int i, int i2, Object obj) {
        if (obj == null) {
            HwLog.e(TAG, "mHealthResponseListener() objData is null.");
            return;
        }
        HwLog.i(TAG, "mHealthResponseListener() responseType: " + i + ", statusCode: " + i2);
        if (obj instanceof byte[]) {
            handleCallbackResult((byte[]) obj);
        }
        if (i == 2) {
            assemblingBtConnectInfo(i2);
            WatchFacePhotoAlbumManager.getInstance(this.mContext).a(false, false);
            WatchFaceWearManager.getInstance(this.mContext).a(false, false);
            WatchFaceKaleidoscopeManager.getInstance(this.mContext).a(false, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(int i, Object obj) {
        String str = TAG;
        HwLog.i(str, "ResultCallback() errorCode: " + i);
        if (1001 == i || 1002 == i) {
            if (this.mAuthDenyCallback == null) {
                HwLog.e(str, "ResultCallback() mAuthDenyCallback is null.");
                return;
            }
            Map<Integer, List<IBaseResponseCallback>> map = sCommandCallbacks;
            if (map == null || map.size() <= 0) {
                return;
            }
            if (!this.mIsJudgeSecondAuth) {
                this.mAuthDenyCallback.onRequestAuthDeny(false);
                return;
            } else {
                this.mAuthDenyCallback.onRequestAuthDeny(true);
                this.mIsJudgeSecondAuth = false;
                return;
            }
        }
        if (!(obj instanceof String)) {
            HwLog.e(str, "ResultCallback() invalid object.");
            return;
        }
        String str2 = (String) obj;
        if (TextUtils.isEmpty(str2)) {
            HwLog.w(str, "ResultCallback() object is empty.");
            return;
        }
        if (i != 800) {
            if (i != 801) {
                HwLog.e(str, "ResultCallback() invalid errorCode.");
                return;
            } else {
                notifyBtConnectStatus(str2);
                return;
            }
        }
        if (str2.length() < CommonUtils.l()) {
            HwLog.i(str, "ResultCallback() data is error.");
        } else {
            HwLog.i(str, "ResultCallback() COMMAND_TYPE_WATCH_FACE.");
            handleCallbackResult(i1.a(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reportDeviceInfoStatus$2() {
        if (!getInstance(Environment.getApplicationContext()).isSupportMemberSignature()) {
            HwLog.i(TAG, "reportDeviceInfoStatus -- isSupportMemberSignature false");
            return;
        }
        final e5 e5VarC = e5.c();
        if (e5VarC == null) {
            HwLog.i(TAG, "reportDeviceInfoStatus -- watchFaceMembershipManager is null");
        } else if (e5VarC.f() != null) {
            k2.a().a(e5VarC.g(), (IBaseResponseCallback) null);
        } else {
            e5VarC.b(new e5.c(this) { // from class: com.huawei.watchface.api.HwWatchFaceBtManager.1
                @Override // com.huawei.watchface.e5.c
                public void onMembershipInfoUpdated(QuerySubInfoDetailResp querySubInfoDetailResp) {
                    k2.a().a(e5VarC.g(), (IBaseResponseCallback) null);
                }
            });
        }
    }

    private void makeKaleidoscopeInfoCommand(WatchFaceKaleidoscopeInfo watchFaceKaleidoscopeInfo) {
        StringBuilder sb = new StringBuilder(20);
        for (KaleidoscopeStruct kaleidoscopeStruct : watchFaceKaleidoscopeInfo.getMaterialImageList()) {
            String str = (i1.b(4) + i1.b(1) + i1.b(kaleidoscopeStruct.getMaterialImageIndex())) + (i1.b(5) + i1.b(i1.c(kaleidoscopeStruct.getMaterialImageName()).length() / 2) + i1.c(kaleidoscopeStruct.getMaterialImageName()));
            sb.append(i1.b(131) + i1.b(str.length() / 2) + str);
        }
        StringBuilder sb2 = new StringBuilder(20);
        String str2 = TAG;
        HwLog.i(str2, "makeKaleidoscopeInfoCommand() mKaleidoscopeOptionType: " + this.mKaleidoscopeOptionType);
        if ((this.mKaleidoscopeOptionType & 1) == 1) {
            sb2.append(i1.b(6) + i1.b(1) + i1.b(watchFaceKaleidoscopeInfo.getCurrentMaterialImageIndex()));
        }
        if ((this.mKaleidoscopeOptionType & 2) == 2) {
            sb2.append(i1.b(7) + i1.b(1) + i1.b(watchFaceKaleidoscopeInfo.getHandsStyleIndex()));
        }
        if ((this.mKaleidoscopeOptionType & 4) == 4) {
            sb2.append(i1.b(8) + i1.b(1) + i1.b(watchFaceKaleidoscopeInfo.getKaleidoscopeType()));
        }
        int size = watchFaceKaleidoscopeInfo.getMaterialImageList().size();
        String str3 = i1.b(1) + i1.b(1) + i1.b(size);
        String str4 = CommonUtils.e() + (size == 0 ? str3 + ((Object) sb2) : str3 + (i1.b(130) + i1.a(sb.length() / 2) + ((Object) sb)) + ((Object) sb2));
        CommandJsonInfo commandJsonInfo = new CommandJsonInfo();
        commandJsonInfo.setServiceId(39);
        commandJsonInfo.setCommandId(18);
        commandJsonInfo.setCommandType(800);
        commandJsonInfo.setDeviceCommand(str4);
        HwLog.i(str2, "5.39.18 makeKaleidoscopeInfoCommand() commandJsonInfo: " + commandJsonInfo.toString());
        m.a("5.39.18", commandJsonInfo.toString(), 1);
        q1.a(this.mContext, commandJsonInfo, this.mResultCallback);
    }

    private void makePhotoInfoCommand(WatchFacePhotoInfo watchFacePhotoInfo, LatonaWatchFaceThemeAlbumInfo latonaWatchFaceThemeAlbumInfo) {
        if (getInstance(this.mContext).getWatchFaceSupportInfo() == null) {
            return;
        }
        StringBuilder sb = new StringBuilder(20);
        int i = 1;
        for (String str : watchFacePhotoInfo.getBackgroundList()) {
            String str2 = (i1.b(4) + i1.b(1) + i1.b(i)) + (i1.b(5) + i1.b(i1.c(str).length() / 2) + i1.c(str));
            sb.append(i1.b(131) + i1.b(str2.length() / 2) + str2);
            i++;
        }
        StringBuilder sb2 = new StringBuilder(20);
        String str3 = TAG;
        HwLog.i(str3, "makePhotoInfoCommand() type: " + this.mPhotoOptionType);
        if ((this.mPhotoOptionType & 1) == 1) {
            sb2.append(i1.b(6) + i1.b(1) + i1.b(watchFacePhotoInfo.getPositionIndex()));
        }
        if ((this.mPhotoOptionType & 2) == 2) {
            sb2.append(i1.b(7) + i1.b(1) + i1.b(watchFacePhotoInfo.getStyleIndex()));
        }
        if ((this.mPhotoOptionType & 4) == 4) {
            sb2.append(i1.b(9) + i1.b(1) + i1.b(watchFacePhotoInfo.getDataIndex()));
        }
        int size = watchFacePhotoInfo.getBackgroundList().size();
        String str4 = i1.b(1) + i1.b(1) + i1.b(size);
        String str5 = CommonUtils.d() + (size == 0 ? str4 + ((Object) sb2) : str4 + (i1.b(130) + i1.a(sb.length() / 2) + ((Object) sb)) + ((Object) sb2));
        CommandJsonInfo commandJsonInfo = new CommandJsonInfo();
        commandJsonInfo.setServiceId(39);
        commandJsonInfo.setCommandId(9);
        commandJsonInfo.setCommandType(800);
        commandJsonInfo.setDeviceCommand(str5);
        HwLog.i(str3, "5.39.9 makePhotoInfoCommand() commandJsonInfo: " + commandJsonInfo.toString());
        m.a("5.39.9", commandJsonInfo.toString(), 1);
        q1.a(this.mContext, commandJsonInfo, this.mResultCallback);
    }

    private void makeVideoInfoCommand(WatchFaceVideoInfo watchFaceVideoInfo) {
        StringBuilder sb = new StringBuilder(20);
        int i = 1;
        for (VideoStruct videoStruct : watchFaceVideoInfo.getVideoList()) {
            String str = (i1.b(5) + i1.b(1) + i1.b(i)) + (i1.b(6) + i1.b(i1.c(videoStruct.getVideoName()).length() / 2) + i1.c(videoStruct.getVideoName())) + (i1.b(7) + i1.b(1) + i1.b(videoStruct.getVideoAttribute())) + (i1.b(8) + i1.b(i1.c(videoStruct.getVideoPreviewName()).length() / 2) + i1.c(videoStruct.getVideoPreviewName())) + (i1.b(9) + i1.b(1) + i1.b(videoStruct.getVideoStatus()));
            sb.append(i1.b(UserInfomation.WEIGHT_DEFAULT_ENGLISH) + i1.b(str.length() / 2) + str);
            i++;
        }
        StringBuilder sb2 = new StringBuilder(20);
        String str2 = TAG;
        HwLog.i(str2, "makeVideoInfoCommand() mVideoOptionType: " + this.mVideoOptionType);
        if ((this.mVideoOptionType & 1) == 1) {
            sb2.append(i1.b(10) + i1.b(1) + i1.b(watchFaceVideoInfo.getPositionIndex()));
        }
        if ((this.mVideoOptionType & 2) == 2) {
            sb2.append(i1.b(11) + i1.b(1) + i1.b(watchFaceVideoInfo.getStyleIndex()));
        }
        if ((this.mVideoOptionType & 4) == 4) {
            sb2.append(i1.b(12) + i1.b(1) + i1.b(watchFaceVideoInfo.getDataIndex()));
        }
        int size = watchFaceVideoInfo.getVideoList().size();
        String str3 = i1.b(1) + i1.b(1) + i1.b(size);
        String str4 = i1.b(2) + i1.b(1) + i1.b(watchFaceVideoInfo.getVideoType());
        String str5 = CommonUtils.e() + (size == 0 ? str3 + str4 + ((Object) sb2) : str3 + str4 + (i1.b(131) + i1.a(sb.length() / 2) + ((Object) sb)) + ((Object) sb2));
        CommandJsonInfo commandJsonInfo = new CommandJsonInfo();
        commandJsonInfo.setServiceId(39);
        commandJsonInfo.setCommandId(16);
        commandJsonInfo.setCommandType(800);
        commandJsonInfo.setDeviceCommand(str5);
        HwLog.i(str2, "5.39.16 makeVideoInfoCommand() commandJsonInfo: " + commandJsonInfo.toString());
        m.a("5.39.16", commandJsonInfo.toString(), 1);
        q1.a(this.mContext, commandJsonInfo, this.mResultCallback);
    }

    private void makeWearInfoCommand(WatchFaceWearInfo watchFaceWearInfo) {
        StringBuilder sb = new StringBuilder(20);
        for (WearStruct wearStruct : watchFaceWearInfo.getWearList()) {
            String str = (i1.b(4) + i1.b(8) + i1.b(wearStruct.getCurStyleIndex())) + (i1.b(5) + i1.b(i1.c(wearStruct.getWearPreviewName()).length() / 2) + i1.c(wearStruct.getWearPreviewName())) + (i1.b(6) + i1.b(1) + i1.b(1)) + (i1.b(7) + i1.b(i1.c(wearStruct.getClockResource()).length() / 2) + i1.c(wearStruct.getClockResource())) + (i1.b(8) + i1.b(1) + i1.b(wearStruct.getClockType())) + (i1.b(9) + i1.b(i1.c(wearStruct.getClockColor()).length() / 2) + i1.c(wearStruct.getClockColor()));
            sb.append(i1.b(131) + i1.b(str.length() / 2) + str);
        }
        int length = sb.length();
        sb.append(i1.b(10) + i1.b(8) + i1.b(watchFaceWearInfo.getCurStyleIndex()));
        int size = watchFaceWearInfo.getWearList().size();
        String str2 = i1.b(1) + i1.b(1) + i1.b(size);
        if (size != 0) {
            str2 = str2 + (i1.b(130) + i1.a(length / 2) + ((Object) sb));
        }
        String str3 = CommonUtils.e() + str2;
        CommandJsonInfo commandJsonInfo = new CommandJsonInfo();
        commandJsonInfo.setServiceId(39);
        commandJsonInfo.setCommandId(20);
        commandJsonInfo.setCommandType(800);
        commandJsonInfo.setDeviceCommand(str3);
        HwLog.i(TAG, "5.39.20 makeWearInfoCommand() commandJsonInfo: " + commandJsonInfo.toString());
        m.a("5.39.20", commandJsonInfo.toString(), 1);
        q1.a(this.mContext, commandJsonInfo, this.mResultCallback);
    }

    private boolean needLocalSendBluetooth(int i, byte[] bArr) {
        try {
            byte b2 = bArr[1];
            String str = i + "_" + ((int) b2);
            if (!q2.a((Map) this.registerH5, (Object) str) || this.registerH5Callback == null) {
                return true;
            }
            RegisterInfo.RegisterBean registerBean = this.registerH5.get(str);
            String strA = i1.a(bArr);
            String str2 = TAG;
            HwLog.w(str2, "handleCallbackResult() registerH5 : " + registerBean.getBluetoothTlvName() + ":::" + i + "_" + ((int) b2) + ":::resultInfo::" + strA);
            this.registerH5Callback.handleCallbackResult(strA, b2);
            if (registerBean.getType() != 1) {
                return false;
            }
            HwLog.w(str2, "handleCallbackResult() registerH5 and aar :" + registerBean.getBluetoothTlvName());
            return true;
        } catch (Exception e) {
            HwLog.e(TAG, "needLocalSendBluetooth() error :" + HwLog.printException(e));
            return true;
        }
    }

    private void notifyBtConnectStatus(String str) {
        HwLog.i(TAG, "notifyBtConnectStatus() btMsg: " + str);
        try {
            Application applicationContext = Environment.getApplicationContext();
            if (applicationContext != null) {
                HwWatchFaceApi.getInstance(applicationContext).setConnectStatus(null);
                HwWatchFaceApi.getInstance(applicationContext).setDeviceInfo(null);
                HwWatchFaceManager.getInstance(applicationContext).setLastPercentage(-1);
            }
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("mDeviceConnectState");
            String strOptString = jSONObject.optString("mDeviceName");
            if (2 == iOptInt || 3 == iOptInt) {
                DeviceInfo deviceInfo = new DeviceInfo();
                deviceInfo.setDeviceConnectState(iOptInt);
                deviceInfo.setDeviceName(strOptString);
                Intent intent = new Intent("com.huawei.watchface.action.CONNECTION_STATE_CHANGED");
                intent.putExtra("deviceinfo", deviceInfo);
                CommonUtils.a(intent);
            }
        } catch (JSONException unused) {
            HwLog.i(TAG, "notifyBtConnectStatus() JSONException occured.");
        } catch (Exception unused2) {
            HwLog.i(TAG, "notifyBtConnectStatus() Exception occured.");
        }
    }

    private void notifyH5DiyPackageName() {
        if (this.isGetAlbumPackageName) {
            HwWatchFaceManager.getInstance(this.mContext).notifyPhotoPackageName(getPhotoPackageName());
        }
        if (this.isGetKaleidoscopePackageName) {
            HwWatchFaceManager.getInstance(this.mContext).notifyKaleidoscopePackageName(getKaleidoscopePackageName());
        }
        if (this.isGetWearAlbumPackageName) {
            HwWatchFaceManager.getInstance(this.mContext).notifyWearAlbumPackageName(getWearPackageName());
        }
        if (this.isGetVideoAlbumPackageName) {
            HwWatchFaceManager.getInstance(this.mContext).notifyVideoAlbumPackageName(getVideoPackageName());
        }
        if (this.isGetWatchfaceLocal) {
            HwWatchFaceManager.getInstance(this.mContext).notifyGetWatchfaceStore();
        }
    }

    private void reportAck(WatchResourcesInfo watchResourcesInfo, int i) {
        if (100000 != i) {
            HwLog.e(TAG, "reportAck() errorCode: " + i);
            return;
        }
        String strC = i1.c(watchResourcesInfo.markUpVipFreeWatchFace(watchResourcesInfo.getWatchInfoId()));
        String str = i1.b(1) + i1.b(strC.length() / 2) + strC;
        String strC2 = i1.c(watchResourcesInfo.getWatchInfoVersion());
        String str2 = CommonUtils.d() + str + (i1.b(2) + i1.b(strC2.length() / 2) + strC2) + (i1.b(127) + i1.b(4) + i1.a(i));
        CommandJsonInfo commandJsonInfo = new CommandJsonInfo();
        commandJsonInfo.setServiceId(39);
        commandJsonInfo.setCommandId(5);
        commandJsonInfo.setCommandType(800);
        commandJsonInfo.setDeviceCommand(str2);
        HwLog.i(TAG, "5.39.5 reportAck() commandJsonInfo: " + commandJsonInfo.toString());
        q1.a(this.mContext, commandJsonInfo, this.mResultCallback);
    }

    private void reportDeviceInfoStatus() {
        BackgroundTaskUtils.submit(new Runnable() { // from class: com.huawei.watchface.api.HwWatchFaceBtManager$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$reportDeviceInfoStatus$2();
            }
        });
    }

    private void reportForUi(boolean z, int i, String str) {
        synchronized (getCommandCallbackCallbackList()) {
            dealReport(z, i, str);
        }
    }

    private void reportKaleidoscopeStatus(int i, int i2) {
        String str = TAG;
        HwLog.i(str, "reportKaleidoscopeStatus() transferNum: " + i2);
        synchronized (getCommandCallbackCallbackList()) {
            List<IBaseResponseCallback> list = sCommandCallbacks.get(18);
            if (list == null || list.isEmpty()) {
                HwLog.w(str, "reportKaleidoscopeStatus() callback error.");
            } else if (i == 100000 && i2 == 0) {
                list.get(list.size() - 1).onResponse(101, 0);
                list.remove(list.size() - 1);
            } else if (i != 100000 || i2 <= 0) {
                HwLog.i(str, "reportKaleidoscopeStatus() errorCode is failed.");
                list.get(list.size() - 1).onResponse(102, null);
                list.remove(list.size() - 1);
            } else {
                HwLog.i(str, "reportKaleidoscopeStatus() need transfer.");
                list.get(list.size() - 1).onResponse(CreativeType.WINDOW_IMAGE_WITH_DOWNLOAD_BUTTON, Integer.valueOf(i2));
            }
        }
    }

    private void reportPhotoReceivedStatus(int i, WatchResourcesInfo watchResourcesInfo) {
        int i2;
        if (i != 4 && i != 7 && i != 8 && i != 9) {
            HwLog.w(TAG, "reportPhotoReceivedStatus() reportType not HwWatchFaceBtConstant.STATUS_PHOTO_RECEIVE");
            return;
        }
        if (i == 4) {
            i2 = AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY;
        } else if (i == 7) {
            i2 = 16;
        } else if (i == 8) {
            i2 = 18;
        } else if (i != 9) {
            HwLog.w(TAG, "reportPhotoReceivedStatus() invalid reportType.");
            i2 = -1;
        } else {
            i2 = 20;
        }
        String str = TAG;
        HwLog.w(str, "reportPhotoReceivedStatus() reportType: " + i + ", key: " + i2);
        synchronized (getCommandCallbackCallbackList()) {
            List<IBaseResponseCallback> list = sCommandCallbacks.get(Integer.valueOf(i2));
            if (list == null || list.isEmpty()) {
                HwLog.w(str, "reportPhotoReceivedStatus() send file callback error");
            } else {
                Iterator<IBaseResponseCallback> it = list.iterator();
                while (it.hasNext()) {
                    it.next().onResponse(101, Integer.valueOf(watchResourcesInfo.getFailedNum()));
                    HwLog.i(TAG, "reportPhotoReceivedStatus() send File callback success, filed number:" + watchResourcesInfo.getFailedNum());
                }
                sCommandCallbacks.remove(Integer.valueOf(i2));
            }
            if (i == 4 && sCallBackForH5 != null && (HwWatchFaceApi.getInstance(this.mContext).getIsTaskExecuting() || this.isTaskExecuting)) {
                sCallBackForH5.onResponse(115, null);
                this.isTaskExecuting = false;
            }
        }
    }

    private void reportPhotoStatus(int i, int i2) {
        synchronized (getCommandCallbackCallbackList()) {
            List<IBaseResponseCallback> list = sCommandCallbacks.get(Integer.valueOf(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY));
            if (list == null || list.isEmpty()) {
                HwLog.w(TAG, "reportPhotoStatus() callback error");
            } else if (i == 100000 && i2 == 0) {
                list.get(list.size() - 1).onResponse(101, 0);
                list.remove(list.size() - 1);
            } else if (i != 100000 || i2 <= 0) {
                HwLog.i(TAG, "reportPhotoStatus() errorCode is failed");
                list.get(list.size() - 1).onResponse(102, null);
                list.remove(list.size() - 1);
            } else {
                HwLog.i(TAG, "reportPhotoStatus() need transfer num:" + i2);
                list.get(list.size() + (-1)).onResponse(111, Integer.valueOf(i2));
            }
        }
    }

    private void reportStatusForUi(int i, WatchResourcesInfo watchResourcesInfo) {
        if (getCallBackForH5() == null) {
            reportPhotoReceivedStatus(i, watchResourcesInfo);
            return;
        }
        switch (i) {
            case 1:
                getCallBackForH5().onResponse(106, watchResourcesInfo);
                break;
            case 2:
                getCallBackForH5().onResponse(107, watchResourcesInfo);
                break;
            case 3:
                getCallBackForH5().onResponse(108, watchResourcesInfo);
                break;
            case 4:
            case 7:
            case 8:
            case 9:
                reportPhotoReceivedStatus(i, watchResourcesInfo);
                break;
            case 5:
                getCallBackForH5().onResponse(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, watchResourcesInfo);
                break;
            case 6:
                getCallBackForH5().onResponse(110, watchResourcesInfo);
                break;
            default:
                HwLog.w(TAG, "reportStatusForUi() error");
                break;
        }
    }

    private void reportSuccess() {
        synchronized (getCommandCallbackCallbackList()) {
            List<IBaseResponseCallback> list = sCommandCallbacks.get(1);
            if (list == null || list.isEmpty()) {
                HwLog.w(TAG, "reportSuccess() callback error");
            } else {
                Iterator<IBaseResponseCallback> it = list.iterator();
                while (it.hasNext()) {
                    it.next().onResponse(101, null);
                }
                sCommandCallbacks.remove(1);
            }
        }
    }

    private void reportSuccessFaceInfo() {
        synchronized (getCommandCallbackCallbackList()) {
            List<IBaseResponseCallback> list = sCommandCallbacks.get(2);
            if (list == null || list.isEmpty()) {
                HwLog.w(TAG, "reportSuccessFaceInfo() callback error");
            } else {
                Iterator<IBaseResponseCallback> it = list.iterator();
                while (it.hasNext()) {
                    it.next().onResponse(101, null);
                }
                sCommandCallbacks.remove(2);
            }
        }
    }

    private void reportVideoStatus(int i, int i2, int i3) {
        String str = TAG;
        HwLog.i(str, "reportVideoStatus() transferPreviewNum: " + i2 + ", transferVideoNum: " + i3);
        synchronized (getCommandCallbackCallbackList()) {
            List<IBaseResponseCallback> list = sCommandCallbacks.get(16);
            if (list == null || list.isEmpty()) {
                HwLog.w(str, "reportVideoStatus() callback error.");
            } else if (i == 100000 && i2 == 0 && i3 == 0) {
                list.get(list.size() - 1).onResponse(101, 0);
                list.remove(list.size() - 1);
            } else if (i != 100000 || (i2 <= 0 && i3 <= 0)) {
                HwLog.i(str, "reportVideoStatus() errorCode is failed.");
                list.get(list.size() - 1).onResponse(102, null);
                list.remove(list.size() - 1);
            } else {
                HwLog.i(str, "reportVideoStatus() need transfer.");
                list.get(list.size() - 1).onResponse(112, Integer.valueOf(i3));
            }
        }
    }

    private void reportWatchFaceNameInfo(HashMap<String, WatchResourcesInfo> map) {
        synchronized (getCommandCallbackCallbackList()) {
            List<IBaseResponseCallback> list = sCommandCallbacks.get(6);
            if (list == null || list.isEmpty()) {
                HwLog.w(TAG, "reportWatchFaceNameInfo() callback error");
            } else {
                list.get(list.size() - 1).onResponse(101, map);
                sCommandCallbacks.remove(6);
            }
        }
    }

    private void reportWearStatus(int i, int i2) {
        synchronized (getCommandCallbackCallbackList()) {
            List<IBaseResponseCallback> list = sCommandCallbacks.get(20);
            if (list == null || list.isEmpty()) {
                HwLog.w(TAG, "reportWearStatus() callback error.");
            } else if (i == 100000 && i2 == 0) {
                list.get(list.size() - 1).onResponse(101, 0);
                list.remove(list.size() - 1);
            } else if (i != 100000 || i2 <= 0) {
                HwLog.i(TAG, "reportWearStatus() errorCode is failed.");
                list.get(list.size() - 1).onResponse(102, null);
                list.remove(list.size() - 1);
            } else {
                HwLog.i(TAG, "reportWearStatus() need transfer.");
                list.get(list.size() - 1).onResponse(114, Integer.valueOf(i2));
            }
        }
    }

    private void resetWatchFaceSupportInfo() {
        HwLog.i(TAG, "resetWatchFaceSupportInfo() enter.");
        if (this.mWatchFaceSupportInfo == null) {
            return;
        }
        this.mWatchFaceSupportInfo = null;
        this.mVirtualWatchFaceSupportInfo = null;
    }

    private void resetWatchFaces() {
        synchronized (this) {
            this.mWatchFaces.clear();
            this.mWatchFaces.addAll(this.mTempWatchFaces);
            HwLog.i(TAG, "resetWatchInfoList() watchFace size:" + this.mWatchFaces.size());
        }
    }

    private void resetWatchInfoList() {
        resetWatchFaces();
        notifyH5DiyPackageName();
        j2.g().d();
        if (getInstance(Environment.getApplicationContext()).isSupportSync()) {
            dealModeChange();
        }
    }

    private void sendGetNameCommand(ArrayList<String> arrayList, int i) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        String str = i1.b(1) + i1.b(1) + i1.b(i);
        StringBuilder sb = new StringBuilder(20);
        for (String strMarkUpHiTopId : arrayList) {
            if (this.mHashWatchFaces.containsKey(strMarkUpHiTopId) && this.mHashWatchFaces.get(strMarkUpHiTopId).isVipFreeWatchFace()) {
                strMarkUpHiTopId = WatchResourcesInfo.markUpHiTopId(strMarkUpHiTopId);
            }
            String str2 = i1.b(4) + i1.b(i1.c(strMarkUpHiTopId).length() / 2) + i1.c(strMarkUpHiTopId);
            sb.append(i1.b(131) + i1.b(str2.length() / 2) + str2);
        }
        String str3 = CommonUtils.d() + str + (i1.b(130) + i1.a(sb.length() / 2) + ((Object) sb));
        CommandJsonInfo commandJsonInfo = new CommandJsonInfo();
        commandJsonInfo.setServiceId(39);
        commandJsonInfo.setCommandId(6);
        commandJsonInfo.setCommandType(800);
        commandJsonInfo.setDeviceCommand(str3);
        HwLog.i(TAG, "5.39.6 sendGetNameCommand() commandJsonInfo: " + commandJsonInfo.toString());
        m.a("5.39.6", commandJsonInfo.toString(), 1);
        q1.a(this.mContext, commandJsonInfo, this.mResultCallback);
    }

    private void sendInfoList(ArrayList<WatchResourcesInfo> arrayList) {
        StringBuilder sb = new StringBuilder(20);
        for (WatchResourcesInfo watchResourcesInfo : arrayList) {
            sb.append(watchResourcesInfo.markUpVipFreeWatchFace(watchResourcesInfo.getWatchInfoId()));
            sb.append(";");
        }
        String strC = i1.c(SafeStringBuilder.substring(sb, 0, sb.length() - 1));
        String str = CommonUtils.d() + i1.b(1) + i1.a(strC.length() / 2) + strC;
        CommandJsonInfo commandJsonInfo = new CommandJsonInfo();
        commandJsonInfo.setServiceId(39);
        commandJsonInfo.setCommandId(4);
        commandJsonInfo.setCommandType(800);
        commandJsonInfo.setDeviceCommand(str);
        HwLog.i(TAG, "5.39.4 sendInfoList() commandJsonInfo: " + commandJsonInfo.toString());
        q1.a(this.mContext, commandJsonInfo, this.mResultCallback);
    }

    private void sendKaleidoscopeWatchFaceCommand(int i) {
        String str = i1.b(1) + i1.b(0);
        String str2 = i1.b(2) + i1.b(0);
        String str3 = i1.b(3) + i1.b(0);
        StringBuilder sb = new StringBuilder(20);
        if ((i & 1) == 1) {
            sb.append(i1.b(7));
            sb.append(i1.b(0));
        }
        if ((i & 2) == 2) {
            sb.append(i1.b(8));
            sb.append(i1.b(0));
        }
        if ((i & 4) == 4) {
            sb.append(i1.b(9));
            sb.append(i1.b(0));
        }
        String str4 = CommonUtils.e() + str + str2 + str3 + sb.toString();
        CommandJsonInfo commandJsonInfo = new CommandJsonInfo();
        commandJsonInfo.setServiceId(39);
        commandJsonInfo.setCommandId(17);
        commandJsonInfo.setCommandType(800);
        commandJsonInfo.setDeviceCommand(str4);
        HwLog.i(TAG, "5.39.17 sendKaleidoscopeWatchFaceCommand() commandJsonInfo: " + commandJsonInfo.toString());
        m.a("5.39.17", commandJsonInfo.toString(), 1);
        q1.a(this.mContext, commandJsonInfo, this.mResultCallback);
    }

    private void sendOperateType(WatchResourcesInfo watchResourcesInfo, int i, boolean z) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("operateType", String.valueOf(i));
        String commandHexString = getCommandHexString(watchResourcesInfo, i);
        linkedHashMap.put("watchfaceId", watchResourcesInfo.markUpVipFreeWatchFace(watchResourcesInfo.getWatchInfoId()));
        linkedHashMap.put("watchfaceVersion", watchResourcesInfo.getWatchInfoVersion());
        if (z && checkIsSync(watchResourcesInfo)) {
            commandHexString = commandHexString + (i1.b(7) + i1.b(1) + i1.b(1));
            linkedHashMap.put("syncType", String.valueOf(1));
        }
        if (!TextUtils.isEmpty(watchResourcesInfo.getWatchfaceSignature())) {
            String strC = i1.c(watchResourcesInfo.getWatchfaceSignature());
            commandHexString = commandHexString + (i1.b(8) + i1.a(strC.length() / 2) + strC);
            linkedHashMap.put("watchSign", p3.a(watchResourcesInfo.getWatchfaceSignature(), a3.f30054a));
        }
        if (!TextUtils.isEmpty(watchResourcesInfo.getMemberSignature())) {
            String strC2 = i1.c(watchResourcesInfo.getMemberSignature());
            commandHexString = commandHexString + (i1.b(9) + i1.a(strC2.length() / 2) + strC2);
            linkedHashMap.put("watchMemberSign", p3.a(watchResourcesInfo.getMemberSignature(), a3.f30055b));
        }
        setCommandJsonInfo(commandHexString, linkedHashMap);
    }

    private void sendWearWatchFaceCommand() {
        String str = CommonUtils.d() + (i1.b(1) + i1.b(0)) + (i1.b(2) + i1.b(0)) + (i1.b(3) + i1.b(0)) + (i1.b(4) + i1.b(0)) + (i1.b(5) + i1.b(0)) + (i1.b(6) + i1.b(0)) + (i1.b(8) + i1.b(0)) + (i1.b(9) + i1.b(0)) + (i1.b(10) + i1.b(0));
        CommandJsonInfo commandJsonInfo = new CommandJsonInfo();
        commandJsonInfo.setServiceId(39);
        commandJsonInfo.setCommandId(19);
        commandJsonInfo.setCommandType(800);
        commandJsonInfo.setDeviceCommand(str);
        HwLog.i(TAG, "5.39.19 sendWearWatchFaceCommand() commandJsonInfo: " + commandJsonInfo.toString());
        m.a("5.39.19", commandJsonInfo.toString(), 1);
        q1.a(this.mContext, commandJsonInfo, this.mResultCallback);
    }

    public static void setCallBackForH5(IBaseResponseCallback iBaseResponseCallback) {
        sCallBackForH5 = iBaseResponseCallback;
    }

    private void setCommandJsonInfo(String str, LinkedHashMap<String, String> linkedHashMap) {
        CommandJsonInfo commandJsonInfo = new CommandJsonInfo();
        commandJsonInfo.setServiceId(39);
        commandJsonInfo.setCommandId(3);
        commandJsonInfo.setCommandType(800);
        commandJsonInfo.setDeviceCommand(str);
        HwLog.i(TAG, "5.39.3 sendOperateType() commandJsonInfo: " + commandJsonInfo.toString());
        m.a("5.39.3", GsonHelper.toJson(linkedHashMap), 1);
        q1.a(this.mContext, commandJsonInfo, this.mResultCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentDeviceName(WatchDeviceInfo watchDeviceInfo) {
        if (watchDeviceInfo == null) {
            HwLog.i(TAG, "setCurrentDeviceName() watchDeviceInfo is null.");
            return;
        }
        HwLog.i(TAG, "setCurrentDeviceName() currentDeviceName: " + watchDeviceInfo.getDeviceName());
        HwWatchFaceManager.getInstance(this.mContext).setCurrentDeviceName(watchDeviceInfo.getDeviceName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceCapability(WatchDeviceInfo watchDeviceInfo) {
        if (watchDeviceInfo == null) {
            HwLog.w(TAG, "setDeviceCapability() watchDeviceInfo is null.");
            return;
        }
        DeviceCapability deviceCapability = (DeviceCapability) new Gson().fromJson(watchDeviceInfo.getDeviceCapability(), DeviceCapability.class);
        if (deviceCapability == null) {
            HwLog.w(TAG, "setDeviceCapability() capability is null.");
        } else {
            this.mIsSupportWatchFaceAppId = deviceCapability.isSupportWatchFaceAppId();
        }
    }

    private void setWatchfaceSignature(WatchResourcesInfo watchResourcesInfo, int i) {
        String strA = (i == 1 || i == 5 || i == 7) ? k2.a().a(watchResourcesInfo.getWatchInfoId(), watchResourcesInfo.getWatchInfoVersion()) : null;
        String str = TAG;
        HwLog.i(str, "operateDevice() watchfaceSignature is empty:" + TextUtils.isEmpty(strA));
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        watchResourcesInfo.setWatchfaceSignature(strA);
        FlavorConfig.safeHwLog(str, "operateDevice() watchfaceSignature is:" + strA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void transmitLocalWatchInfoChange(String str, int i) {
        if (i != 101) {
            HwLog.w(TAG, "getWatchInfoForUi() not CALLBACK_TYPE_SUCCESS");
        } else if (TextUtils.equals(str, "00_00")) {
            HwLog.i(TAG, "getWatchInfoForUi() OPERATE_MEMBER_SIGNATURE_TYPE is true");
            HwWatchFaceManager.getInstance(Environment.getApplicationContext()).transmitLocalWatchInfoChange(1);
        } else {
            HwLog.i(TAG, "getWatchInfoForUi() OPERATE_MEMBER_SIGNATURE_TYPE is false");
            HwWatchFaceManager.getInstance(Environment.getApplicationContext()).transmitLocalWatchInfoChange(2);
        }
    }

    private void unRegisterHealthResponseListener() {
        HwWatchFaceApi.getInstance(this.mContext).unRegisterHealthResponseListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void writeDeviceInfo2Sp(WatchDeviceInfo watchDeviceInfo) {
        if (watchDeviceInfo == null) {
            HwLog.i(TAG, "writeDeviceInfo2Sp() watchDeviceInfo is null.");
        } else {
            f5.a("buildNumber", watchDeviceInfo.getSoftVersion());
            f5.a("phoneType", watchDeviceInfo.getDeviceModel());
        }
    }

    private void writeWatchFaceSupportInfo2Sp() {
        WatchFaceSupportInfo watchFaceSupportInfo = getWatchFaceSupportInfo();
        if (watchFaceSupportInfo == null) {
            return;
        }
        f5.a("watch_max_version", watchFaceSupportInfo.getWatchFaceMaxVersion());
        f5.a("watch_other_version", watchFaceSupportInfo.getOtherWatchFaceVersion());
        f5.a("watch_version", watchFaceSupportInfo.getOtherWatchFaceVersion() + "," + watchFaceSupportInfo.getWatchFaceMaxVersion());
        f5.a("watch_screen", watchFaceSupportInfo.getWatchFaceScreen());
        f5.b("supportCapability", watchFaceSupportInfo.getSupportCapability());
    }

    public void addDestroyListener(BaseWatchFaceManager baseWatchFaceManager) {
        HwLog.i(TAG, "addDestroyListener() enter.");
        if (this.destroyListeners == null) {
            this.destroyListeners = new ArrayList();
        }
        this.destroyListeners.add(baseWatchFaceManager);
    }

    public void clearRegisterH5() {
        q2.a(this.registerH5);
    }

    public void destroy() {
        HwLog.i(TAG, "destroy() enter.");
        destroyInstance();
        x1.a(Environment.getApplicationContext()).b();
        y1.a(Environment.getApplicationContext()).a();
        WatchFacePhotoAlbumManager.getInstance(Environment.getApplicationContext()).onDestroy();
        WatchFaceKaleidoscopeManager.getInstance(Environment.getApplicationContext()).onDestroy();
        WatchFaceWearManager.getInstance(Environment.getApplicationContext()).onDestroy();
        Iterator<BaseWatchFaceManager> it = this.destroyListeners.iterator();
        while (it.hasNext()) {
            it.next().onDestroy();
        }
    }

    public ArrayList<WatchResourcesInfo> getAllWatchInfo() {
        ArrayList<WatchResourcesInfo> arrayList = new ArrayList<>(20);
        arrayList.addAll(getWatchFaces());
        return arrayList;
    }

    public HashMap<String, WatchResourcesInfo> getAllWatchInfoHash() {
        HashMap<String, WatchResourcesInfo> map = new HashMap<>(20);
        map.putAll(this.mHashWatchFaces);
        return map;
    }

    public WatchDeviceInfo getConnectWatchDeviceInfo() {
        if (!Environment.sIsAarInTheme) {
            if (ArrayUtils.a(HwWatchFaceApi.getInstance(this.mContext).getDeviceInfo())) {
                HwLog.e(TAG, "getConnectWatchDeviceInfo() mapInfo is null.");
                return null;
            }
            WatchDeviceInfo watchDeviceInfo = new WatchDeviceInfo();
            watchDeviceInfo.setDeviceModel(HwWatchFaceApi.getInstance(this.mContext).getDeviceModel());
            watchDeviceInfo.setDeviceName(HwWatchFaceApi.getInstance(this.mContext).getDeviceName());
            watchDeviceInfo.setSoftVersion(HwWatchFaceApi.getInstance(this.mContext).getSoftVersion());
            return watchDeviceInfo;
        }
        if (ArrayUtils.isEmpty(this.mWatchDeviceInfoList)) {
            HwLog.e(TAG, "getConnectWatchDeviceInfo() mWatchDeviceInfoList is null.");
            return null;
        }
        for (WatchDeviceInfo watchDeviceInfo2 : this.mWatchDeviceInfoList) {
            if (watchDeviceInfo2.getDeviceConnectState() == 2) {
                return watchDeviceInfo2;
            }
        }
        return null;
    }

    public WatchResourcesInfo getCurrentWatchFace() {
        WatchResourcesInfo watchResourcesInfo = new WatchResourcesInfo();
        for (WatchResourcesInfo watchResourcesInfo2 : getWatchFaces()) {
            if ((watchResourcesInfo2.getWatchInfoType() & 1) == 1) {
                HwLog.i(TAG, "getCurrentWatchFace() watchResourcesInfo: " + watchResourcesInfo2.getWatchInfoId());
                return watchResourcesInfo2;
            }
        }
        return watchResourcesInfo;
    }

    public int getDefaultSupportDialUnite() {
        try {
            String deviceName = HwWatchFaceApi.getInstance(this.mContext).getDeviceName();
            String deviceModel = HwWatchFaceApi.getInstance(this.mContext).getDeviceModel();
            HwLog.d(TAG, "getDefaultSupportDialUnite deviceName:" + deviceName + ",deviceModel:" + deviceModel);
            JSONObject jSONObject = new JSONObject(NewSystemParamManager.getSystemParam(SystemParamNames.CLIENT_SUPPORT_DIAL_UNITE, "{\"supportDeviceName\":[\"HUAWEI WATCH FIT\"],\"supportDeviceModel\":[\"Molly\"],\"upDeviceName\":[\"HUAWEI Band_8\",\"HUAWEI WATCH GT_3\"]}"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("supportDeviceName");
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("supportDeviceModel");
            JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("upDeviceName");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i);
                    HwLog.d(TAG, "tempName:" + strOptString);
                    if (deviceName != null && deviceName.contains(strOptString)) {
                        return 5;
                    }
                }
            }
            if (jSONArrayOptJSONArray2 != null) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                    String strOptString2 = jSONArrayOptJSONArray2.optString(i2);
                    HwLog.d(TAG, "tempModel:" + strOptString2);
                    if (deviceModel != null && deviceModel.contains(strOptString2)) {
                        return 5;
                    }
                }
            }
            if (jSONArrayOptJSONArray3 != null) {
                for (int i3 = 0; i3 < jSONArrayOptJSONArray3.length(); i3++) {
                    String strOptString3 = jSONArrayOptJSONArray3.optString(i3);
                    HwLog.d(TAG, "tempUpDeviceName:" + strOptString3);
                    String[] strArrSplit = strOptString3.split("_");
                    if (strArrSplit.length >= 2) {
                        String str = strArrSplit[0];
                        String str2 = strArrSplit[1];
                        String strA = f4.a(deviceName, str + " (\\d+)", 1);
                        if (!TextUtils.isEmpty(strA) && !TextUtils.isEmpty(str2) && IntegerUtils.getInteger(strA, -1) >= IntegerUtils.getInteger(str2, 0)) {
                            return 5;
                        }
                    }
                }
            }
        } catch (JSONException e) {
            HwLog.i(TAG, "json parse error : " + HwLog.printException((Exception) e));
        } catch (Exception e2) {
            HwLog.i(TAG, "json parse Exception : " + HwLog.printException(e2));
        }
        return 0;
    }

    public void getDeviceInfoForUi(IBaseResponseCallback iBaseResponseCallback) {
        String str = TAG;
        HwLog.i(str, "getDeviceInfoForUi() enter.");
        synchronized (getCommandCallbackCallbackList()) {
            if (iBaseResponseCallback != null) {
                List<IBaseResponseCallback> list = sCommandCallbacks.get(1);
                if (list == null) {
                    HwLog.i(str, "getDeviceInfoForUi() have no callback.");
                    ArrayList arrayList = new ArrayList(20);
                    arrayList.add(iBaseResponseCallback);
                    sCommandCallbacks.put(1, arrayList);
                } else {
                    HwLog.i(str, "getDeviceInfoForUi() have callback, add.");
                    list.add(iBaseResponseCallback);
                }
            }
        }
        getDeviceInfo();
    }

    public void getDeviceList(final ResultCallback resultCallback) {
        HwLog.i(TAG, "getDeviceList() enter.");
        q1.a(this.mContext, new ResultCallback() { // from class: com.huawei.watchface.api.HwWatchFaceBtManager.2
            @Override // com.huawei.hihealth.listener.ResultCallback
            public void onResult(int i, Object obj) {
                String str = HwWatchFaceBtManager.TAG;
                HwLog.i(str, "getDeviceList() onResult resultCode: " + i);
                if (i != 0) {
                    HwLog.i(str, "getDeviceList() device connect failed.");
                    resultCallback.onResult(1, "");
                    return;
                }
                if (obj == null) {
                    HwLog.e(str, "getDeviceList() onResult detailInfo is null.");
                    return;
                }
                HwWatchFaceBtManager.this.mWatchDeviceInfoList = (List) new Gson().fromJson(obj.toString(), new TypeToken<List<WatchDeviceInfo>>(this) { // from class: com.huawei.watchface.api.HwWatchFaceBtManager.2.1
                }.getType());
                WatchDeviceInfo connectWatchDeviceInfo = HwWatchFaceBtManager.this.getConnectWatchDeviceInfo();
                if (connectWatchDeviceInfo == null) {
                    HwLog.i(str, "getDeviceList() deviceInfo is null.");
                    resultCallback.onResult(2, "");
                } else {
                    HwWatchFaceBtManager.this.setDeviceCapability(connectWatchDeviceInfo);
                    HwWatchFaceBtManager.this.setCurrentDeviceName(connectWatchDeviceInfo);
                    resultCallback.onResult(0, "");
                    HwWatchFaceBtManager.this.writeDeviceInfo2Sp(connectWatchDeviceInfo);
                }
            }
        });
    }

    public String getDeviceModel() {
        WatchDeviceInfo connectWatchDeviceInfo = getConnectWatchDeviceInfo();
        if (connectWatchDeviceInfo != null) {
            return connectWatchDeviceInfo.getDeviceModel();
        }
        HwLog.e(TAG, "getDeviceModel() watchDeviceInfo is null.");
        return f5.a("phoneType");
    }

    public String getDeviceName() {
        WatchDeviceInfo connectWatchDeviceInfo = getConnectWatchDeviceInfo();
        if (connectWatchDeviceInfo != null) {
            return connectWatchDeviceInfo.getDeviceName();
        }
        HwLog.e(TAG, "getDeviceModel() watchDeviceInfo is null.");
        return "";
    }

    public ArrayList<WatchResourcesInfo> getEditWatchInfo() {
        ArrayList<WatchResourcesInfo> arrayList = new ArrayList<>(20);
        for (WatchResourcesInfo watchResourcesInfo : getWatchFaces()) {
            if ((watchResourcesInfo.getWatchInfoType() & 8) == 8) {
                arrayList.add(watchResourcesInfo);
            }
        }
        return arrayList;
    }

    public void getKaleidoscopeWatchFaceInfo(int i, IBaseResponseCallback iBaseResponseCallback) {
        String str = TAG;
        HwLog.i(str, "getKaleidoscopeWatchFaceInfo() requestType: " + i);
        synchronized (getCommandCallbackCallbackList()) {
            if (iBaseResponseCallback != null) {
                List<IBaseResponseCallback> list = sCommandCallbacks.get(17);
                if (list == null) {
                    HwLog.i(str, "getKaleidoscopeWatchFaceInfo() have no callback.");
                    ArrayList arrayList = new ArrayList(20);
                    arrayList.add(iBaseResponseCallback);
                    sCommandCallbacks.put(17, arrayList);
                } else {
                    HwLog.i(str, "getKaleidoscopeWatchFaceInfo() have callback, add.");
                    list.add(iBaseResponseCallback);
                }
            }
        }
        this.mKaleidoscopeOptionType = i;
        sendKaleidoscopeWatchFaceCommand(i);
    }

    public ArrayList<WatchResourcesInfo> getMemberExpirationWatchFaces() {
        HwLog.i(TAG, "getMemberExpirationWatchFaces() enter: ");
        ArrayList<WatchResourcesInfo> arrayList = new ArrayList<>(20);
        if (!this.mWatchFaces.isEmpty()) {
            for (WatchResourcesInfo watchResourcesInfo : getWatchFaces()) {
                if ((watchResourcesInfo.getWatchInfoType() & 64) != 64 && watchResourcesInfo.getWatchfaceTag() == 2) {
                    arrayList.add(watchResourcesInfo);
                }
            }
        }
        return arrayList;
    }

    public ArrayList<WatchResourcesInfo> getNoPresetWatchInfo() {
        ArrayList<WatchResourcesInfo> arrayList = new ArrayList<>(20);
        if (this.mWatchFaces.isEmpty()) {
            this.isGetWatchfaceLocal = true;
            return arrayList;
        }
        for (WatchResourcesInfo watchResourcesInfo : getWatchFaces()) {
            if ((watchResourcesInfo.getWatchInfoType() & 2) == 0) {
                arrayList.add(watchResourcesInfo);
            }
        }
        this.isGetWatchfaceLocal = false;
        return arrayList;
    }

    public ArrayList<WatchResourcesInfo> getPresetWatchInfo() {
        ArrayList<WatchResourcesInfo> arrayList = new ArrayList<>(20);
        for (WatchResourcesInfo watchResourcesInfo : getWatchFaces()) {
            if ((watchResourcesInfo.getWatchInfoType() & 2) == 2) {
                arrayList.add(watchResourcesInfo);
            }
        }
        return arrayList;
    }

    public String getSoftVersion() {
        WatchDeviceInfo connectWatchDeviceInfo = getConnectWatchDeviceInfo();
        if (connectWatchDeviceInfo != null) {
            return connectWatchDeviceInfo.getSoftVersion();
        }
        HwLog.e(TAG, "getSoftVersion() watchDeviceInfo is null.");
        return f5.a("buildNumber");
    }

    public WatchResourcesInfo getTryOutWatchFaceInfo() {
        synchronized (HwWatchFaceBtManager.class) {
            for (WatchResourcesInfo watchResourcesInfo : getWatchFaces()) {
                if ((watchResourcesInfo.getWatchInfoType() & 64) == 64) {
                    return watchResourcesInfo;
                }
            }
            return null;
        }
    }

    public boolean getVipFreeFromCache(String str) {
        WatchResourcesInfo watchResourcesInfo = this.mHashWatchFaces.get(str);
        if (watchResourcesInfo != null) {
            return watchResourcesInfo.isVipFreeWatchFace();
        }
        WatchResourcesInfo vipFreeWatchFace = HwWatchFaceManager.getInstance(this.mContext).getVipFreeWatchFace(str);
        return vipFreeWatchFace != null && vipFreeWatchFace.isVipFreeWatchFace();
    }

    public String getVirtualWatchInfo(String str) {
        HwLog.i(TAG, "getDefaultWatchInfo() enter key ==" + str);
        if (this.mDefaultWatchInfo == null) {
            this.mDefaultWatchInfo = WatchInfoForH5.createGalileoMap();
        }
        return this.mDefaultWatchInfo.get(str) == null ? "" : this.mDefaultWatchInfo.get(str);
    }

    public WatchFaceKaleidoscopeInfo getWatchFaceKaleidoscopeInfo() {
        return this.mWatchFaceKaleidoscopeInfo;
    }

    public String getWatchFaceMaxVersion(boolean z, boolean z2) {
        if (z2) {
            HwLog.i(TAG, "getWatchFaceScreen() isVirtual");
            return getInstance(Environment.getApplicationContext()).getVirtualWatchInfo("watch_max_version");
        }
        WatchFaceSupportInfo connectWatchfaceSupportInfo = getConnectWatchfaceSupportInfo();
        if (connectWatchfaceSupportInfo == null) {
            HwLog.i(TAG, "getWatchFaceMaxVersion() mWatchFaceSupportInfo is null.");
            return z ? f5.a("watch_max_version") : "";
        }
        String watchFaceMaxVersion = connectWatchfaceSupportInfo.getWatchFaceMaxVersion();
        if (TextUtils.isEmpty(watchFaceMaxVersion)) {
            return z ? f5.a("watch_max_version") : "";
        }
        return watchFaceMaxVersion;
    }

    public String getWatchFaceMaxVersonBySurport() {
        WatchFaceSupportInfo watchFaceSupportInfo = getWatchFaceSupportInfo();
        if (watchFaceSupportInfo == null) {
            return "";
        }
        String watchFaceMaxVersion = watchFaceSupportInfo.getWatchFaceMaxVersion();
        List<ScreenInfo> compatibleList = watchFaceSupportInfo.getCompatibleList();
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(watchFaceMaxVersion)) {
            arrayList.add(watchFaceMaxVersion);
        }
        Iterator<ScreenInfo> it = compatibleList.iterator();
        while (it.hasNext()) {
            for (String str : it.next().getSupportVersion().split(",")) {
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(str);
                }
            }
        }
        String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        if (ArrayUtils.isEmpty(strArr)) {
            HwLog.i(TAG, "getWatchFaceMaxVersonBySurport()  versionStrings is null ");
            return "";
        }
        Arrays.sort(strArr);
        return (String) ArrayUtils.a(strArr, strArr.length - 1);
    }

    public void getWatchFaceName(ArrayList<String> arrayList, int i, IBaseResponseCallback iBaseResponseCallback) {
        String str = TAG;
        HwLog.i(str, "getWatchFaceName() enter.");
        synchronized (getCommandCallbackCallbackList()) {
            if (iBaseResponseCallback != null) {
                List<IBaseResponseCallback> list = sCommandCallbacks.get(6);
                if (list == null) {
                    HwLog.i(str, "getWatchFaceName() have no callback");
                    ArrayList arrayList2 = new ArrayList(20);
                    arrayList2.add(iBaseResponseCallback);
                    sCommandCallbacks.put(6, arrayList2);
                } else {
                    HwLog.i(str, "getWatchFaceName() have callback, add");
                    list.add(iBaseResponseCallback);
                }
            }
        }
        sendGetNameCommand(arrayList, i);
    }

    public String getWatchFaceOtherVersion() {
        WatchFaceSupportInfo connectWatchfaceSupportInfo = getConnectWatchfaceSupportInfo();
        if (connectWatchfaceSupportInfo == null) {
            HwLog.i(TAG, "getWatchFaceOtherVersion() mWatchFaceSupportInfo is null.");
            return f5.a("watch_other_version");
        }
        String otherWatchFaceVersion = connectWatchfaceSupportInfo.getOtherWatchFaceVersion();
        return TextUtils.isEmpty(otherWatchFaceVersion) ? f5.a("watch_other_version") : otherWatchFaceVersion;
    }

    public void getWatchFacePhotoInfo(int i, IBaseResponseCallback iBaseResponseCallback) {
        synchronized (getCommandCallbackCallbackList()) {
            if (iBaseResponseCallback != null) {
                List<IBaseResponseCallback> list = sCommandCallbacks.get(8);
                if (list == null) {
                    HwLog.i(TAG, "getWatchFacePhotoInfo() have no callback");
                    ArrayList arrayList = new ArrayList(20);
                    arrayList.add(iBaseResponseCallback);
                    sCommandCallbacks.put(8, arrayList);
                } else {
                    HwLog.i(TAG, "getWatchFacePhotoInfo() have callback, add");
                    list.add(iBaseResponseCallback);
                }
            }
        }
        HwLog.i(TAG, "getWatchFacePhotoInfo() requestType:" + i);
        this.mPhotoOptionType = i;
        getPhotoWatchInfo(i);
    }

    public String getWatchFaceScreen(boolean z, boolean z2) {
        if (z2) {
            HwLog.i(TAG, "getWatchFaceScreen() isVirtual");
            return getInstance(Environment.getApplicationContext()).getVirtualWatchInfo("watch_screen");
        }
        WatchFaceSupportInfo connectWatchfaceSupportInfo = getConnectWatchfaceSupportInfo();
        String strA = "";
        if (connectWatchfaceSupportInfo == null) {
            HwLog.i(TAG, "getWatchFaceScreen() mWatchFaceSupportInfo is null.");
            return z ? f5.a("watch_screen") : "";
        }
        String watchFaceScreen = connectWatchfaceSupportInfo.getWatchFaceScreen();
        if (!TextUtils.equals("0*0", watchFaceScreen)) {
            strA = watchFaceScreen;
        } else if (z) {
            strA = f5.a("watch_screen");
        }
        HwLog.i(TAG, "getWatchFaceScreen() screen: " + strA);
        return strA;
    }

    public WatchFaceSupportInfo getWatchFaceSupportInfo() {
        synchronized (this) {
            if (HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceConnectState() == 1) {
                return this.mWatchFaceSupportInfo;
            }
            WatchFaceSupportInfo watchFaceSupportInfo = this.mWatchFaceSupportInfo;
            if (watchFaceSupportInfo != null) {
                return watchFaceSupportInfo;
            }
            if (this.mVirtualWatchFaceSupportInfo == null) {
                this.mVirtualWatchFaceSupportInfo = WatchFaceSupportInfo.createInstance();
            }
            return this.mVirtualWatchFaceSupportInfo;
        }
    }

    public void getWatchFaceVideoInfo(int i, IBaseResponseCallback iBaseResponseCallback) {
        String str = TAG;
        HwLog.i(str, "getWatchFaceVideoInfo() requestType: " + i);
        synchronized (getCommandCallbackCallbackList()) {
            if (iBaseResponseCallback != null) {
                List<IBaseResponseCallback> list = sCommandCallbacks.get(15);
                if (list == null) {
                    HwLog.i(str, "getWatchFaceVideoInfo() have no callback.");
                    ArrayList arrayList = new ArrayList(20);
                    arrayList.add(iBaseResponseCallback);
                    sCommandCallbacks.put(15, arrayList);
                } else {
                    HwLog.i(str, "getWatchFaceVideoInfo() have callback, add.");
                    list.add(iBaseResponseCallback);
                }
            }
        }
        this.mVideoOptionType = i;
        getWatchFaceVideoInfoCommand(i);
    }

    public WatchFaceWearInfo getWatchFaceWearInfo() {
        return this.mWatchFaceWearInfo;
    }

    public void getWatchInfoForUi(IBaseResponseCallback iBaseResponseCallback) {
        String str = TAG;
        HwLog.i(str, "getWatchInfoForUi() enter.");
        synchronized (getCommandCallbackCallbackList()) {
            if (iBaseResponseCallback != null) {
                List<IBaseResponseCallback> list = sCommandCallbacks.get(2);
                if (list == null) {
                    HwLog.i(str, "getWatchInfoForUi() have no callback");
                    ArrayList arrayList = new ArrayList(20);
                    arrayList.add(iBaseResponseCallback);
                    sCommandCallbacks.put(2, arrayList);
                } else {
                    HwLog.i(str, "getWatchInfoForUi() have callback, add");
                    list.add(iBaseResponseCallback);
                }
            }
        }
        BackgroundTaskUtils.submit(new Runnable() { // from class: com.huawei.watchface.api.HwWatchFaceBtManager$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.getDeviceWatchInfo();
            }
        });
    }

    public WatchResourcesInfo getWatchResourcesInfo(String str) {
        return this.mHashWatchFaces.get(str);
    }

    public String getWatchVersion() {
        String watchFaceMaxVersion;
        WatchFaceSupportInfo connectWatchfaceSupportInfo = getConnectWatchfaceSupportInfo();
        if (connectWatchfaceSupportInfo == null) {
            HwLog.i(TAG, "getWatchVersion() mWatchFaceSupportInfo is null.");
            return f5.a("watch_version");
        }
        String otherWatchFaceVersion = connectWatchfaceSupportInfo.getOtherWatchFaceVersion();
        if (TextUtils.isEmpty(otherWatchFaceVersion)) {
            watchFaceMaxVersion = connectWatchfaceSupportInfo.getWatchFaceMaxVersion();
        } else {
            watchFaceMaxVersion = otherWatchFaceVersion + "," + connectWatchfaceSupportInfo.getWatchFaceMaxVersion();
        }
        return TextUtils.equals("null,null", watchFaceMaxVersion) ? f5.a("watch_version") : watchFaceMaxVersion;
    }

    public int getWatchfaceMode() {
        WatchFaceSupportInfo watchFaceSupportInfo;
        if (isCloudOpenSync() && (watchFaceSupportInfo = getWatchFaceSupportInfo()) != null) {
            return watchFaceSupportInfo.getWatchfaceMode();
        }
        return -1;
    }

    public String getWatchfaceModel() {
        WatchFaceSupportInfo watchFaceSupportInfo = getWatchFaceSupportInfo();
        return watchFaceSupportInfo == null ? String.valueOf(-1) : String.valueOf(watchFaceSupportInfo.getWatchfaceMode());
    }

    public String getWearPackageName() {
        HwLog.i(TAG, "getWearPackageName() enter: ");
        synchronized (HwWatchFaceBtManager.class) {
            if (this.mWatchFaces.isEmpty()) {
                this.isGetWearAlbumPackageName = true;
                return "";
            }
            for (WatchResourcesInfo watchResourcesInfo : getWatchFaces()) {
                if (watchResourcesInfo.getWatchExpandType() == 4) {
                    String watchInfoId = watchResourcesInfo.getWatchInfoId();
                    HwLog.i(TAG, "getWearPackageName() wearPackageName: " + watchInfoId);
                    this.isGetWearAlbumPackageName = false;
                    return watchInfoId;
                }
            }
            return "";
        }
    }

    public void h5ToSendDeviceCommand(String str, int i, int i2, int i3, String str2) {
        CommandJsonInfo commandJsonInfo = new CommandJsonInfo();
        commandJsonInfo.setServiceId(i);
        commandJsonInfo.setCommandId(i2);
        commandJsonInfo.setCommandType(i3);
        commandJsonInfo.setDeviceCommand(str2);
        HwLog.i(TAG, "H5toSendDeviceCommand info: tlvName :" + str + ",commandJsonInfo:" + commandJsonInfo.toString());
        q1.a(this.mContext, commandJsonInfo, this.mResultCallback);
    }

    public boolean isCloudOpenSync() {
        String strA = NewSystemParamManager.a(SystemParamNames.SYSTEM_WATCHFACE_MODEL_SYNC, "", true);
        HwLog.i(TAG, "client_watchface_model_sync :" + strA);
        return "1".equalsIgnoreCase(strA);
    }

    public boolean isLeftSpaceAllow(long j) {
        HwLog.i(TAG, "isLeftSpaceAllow fileSize:" + j + ",mLeftSpace:" + this.mLeftSpace);
        int i = this.mLeftSpace;
        return i == -1 || ((float) i) >= (((float) j) * 1.0f) / 1048576.0f;
    }

    public boolean isSportAPModel() {
        WatchFaceSupportInfo watchFaceSupportInfo = getWatchFaceSupportInfo();
        if (watchFaceSupportInfo != null) {
            return watchFaceSupportInfo.getWatchfaceMode() == 1;
        }
        HwLog.i(TAG, "isSportAPModel watchFaceSupportInfo is null");
        return false;
    }

    public boolean isSportGTModel() {
        WatchFaceSupportInfo watchFaceSupportInfo = getWatchFaceSupportInfo();
        return watchFaceSupportInfo != null && watchFaceSupportInfo.getWatchfaceMode() == 0;
    }

    public boolean isSupportDialUnite() {
        WatchFaceSupportInfo connectWatchfaceSupportInfo = getConnectWatchfaceSupportInfo();
        if (connectWatchfaceSupportInfo != null) {
            return (connectWatchfaceSupportInfo.getSupportCapability() & 4) == 4;
        }
        HwLog.d(TAG, "getWatchFaceSupportInfo is null");
        return (f5.a("supportCapability", getDefaultSupportDialUnite()) & 4) == 4;
    }

    public boolean isSupportMemberSignature() {
        WatchFaceSupportInfo watchFaceSupportInfo = getWatchFaceSupportInfo();
        if (watchFaceSupportInfo == null) {
            HwLog.d(TAG, "isSupportMemberSignature watchFaceSupportInfo is null");
            return false;
        }
        if ((watchFaceSupportInfo.getSupportCapability() & 16) == 16) {
            if (TextUtils.equals(HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getCommonCountryCode(), "CN")) {
                return true;
            }
            if ((watchFaceSupportInfo.getSupportCapability() & 32) == 32 && TextUtils.equals("1", NewSystemParamManager.getSystemParam(SystemParamNames.SYSTEM_PARAM_SUPPORT_MEMBER_SIGNATURE, "1"))) {
                HwLog.i(TAG, "oversea is config support memberSignature");
                return true;
            }
        }
        return false;
    }

    public boolean isSupportNewAlbum() {
        synchronized (this) {
            WatchFaceSupportInfo watchFaceSupportInfo = getWatchFaceSupportInfo();
            if (watchFaceSupportInfo == null) {
                return false;
            }
            return watchFaceSupportInfo.isSupportNewAlbum();
        }
    }

    public boolean isSupportOneTouchAbility() {
        synchronized (this) {
            WatchFaceSupportInfo watchFaceSupportInfo = getWatchFaceSupportInfo();
            boolean z = false;
            if (watchFaceSupportInfo == null) {
                return false;
            }
            if (watchFaceSupportInfo.isSupportOneTouchAbility() && isPhoneSupport()) {
                z = true;
            }
            return z;
        }
    }

    public boolean isSupportSync() {
        WatchFaceSupportInfo watchFaceSupportInfo;
        if (isCloudOpenSync() && (watchFaceSupportInfo = getWatchFaceSupportInfo()) != null) {
            return watchFaceSupportInfo.isIsSupportSync();
        }
        return false;
    }

    public boolean isSupportTryOut() {
        WatchFaceSupportInfo watchFaceSupportInfo = getWatchFaceSupportInfo();
        if (watchFaceSupportInfo == null) {
            return false;
        }
        return ((watchFaceSupportInfo.getSupportCapability() & 1) == 1) && j2.g().m();
    }

    public boolean isSupportWatchFaceAppId() {
        return this.mIsSupportWatchFaceAppId;
    }

    public boolean isSupportWatchfaceSignature() {
        WatchFaceSupportInfo watchFaceSupportInfo = getWatchFaceSupportInfo();
        if (watchFaceSupportInfo == null) {
            HwLog.d(TAG, "isSupportWatchfaceSignature watchFaceSupportInfo is null");
            return false;
        }
        if ((watchFaceSupportInfo.getSupportCapability() & 8) == 8) {
            if (TextUtils.equals(HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getCommonCountryCode(), "CN")) {
                return true;
            }
            if (TextUtils.equals("1", NewSystemParamManager.getSystemParam(SystemParamNames.SYSTEM_PARAM_SUPPORT_WATCH_FACE_SIGNATURE, "1"))) {
                HwLog.i(TAG, "oversea is config support watch signature");
                return true;
            }
        }
        return false;
    }

    public boolean isSupportedHumanPortrait() {
        synchronized (this) {
            WatchFaceSupportInfo watchFaceSupportInfo = getWatchFaceSupportInfo();
            if (watchFaceSupportInfo != null) {
                return watchFaceSupportInfo.isPortraitModeSupported();
            }
            HwLog.i(TAG, "isSupportedHumanPortrait() watchFaceSupportInfo is null");
            return false;
        }
    }

    public boolean isTaskExecuting() {
        return this.isTaskExecuting;
    }

    public boolean ismIsWatchfaceFull() {
        int i = this.mIsWatchfaceFull;
        return i != -1 && i == 1;
    }

    public void judgeDataShareAuth(final IBaseResponseCallback iBaseResponseCallback) {
        HwLog.i(TAG, "judgeDataShareAuth() enter.");
        getDeviceList(new ResultCallback() { // from class: com.huawei.watchface.api.HwWatchFaceBtManager$$ExternalSyntheticLambda0
            @Override // com.huawei.hihealth.listener.ResultCallback
            public final void onResult(int i, Object obj) {
                this.f$0.lambda$judgeDataShareAuth$5(iBaseResponseCallback, i, obj);
            }
        });
    }

    public boolean memberSignatureIsNeedMarkUp(String str) {
        if (!isSupportMemberSignature()) {
            return true;
        }
        if (!this.mSupportMemberSignatureHiTopIdList.contains(str)) {
            return false;
        }
        HwLog.i(TAG, "memberSignatureIsNeedMarkUp mSupportMemberSignatureHiTopIdList contains hiTopId:" + str);
        return true;
    }

    public void operateDevice(WatchResourcesInfo watchResourcesInfo, int i, IBaseResponseCallback iBaseResponseCallback, boolean z, boolean z2) {
        String str = TAG;
        HwLog.i(str, "operateDevice() enter." + i);
        synchronized (getCommandCallbackCallbackList()) {
            if (i == 1) {
                try {
                    f5.c(String.valueOf(System.currentTimeMillis()));
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (2 == i) {
                n.e().a(watchResourcesInfo);
            } else {
                watchResourcesInfo.setWatchInfoId(n.e().k(watchResourcesInfo.getWatchInfoId()));
            }
            if (iBaseResponseCallback != null) {
                String str2 = watchResourcesInfo.getWatchInfoId() + "_" + watchResourcesInfo.getWatchInfoVersion();
                HwLog.i(str, "operateDevice() hiTopVersion: " + str2);
                if (2 != i || !this.mOperateCallbacks.containsKey(str2)) {
                    this.mOperateCallbacks.put(str2, iBaseResponseCallback);
                    HwLog.i(str, "operateDevice() put callbacks");
                }
            }
            if (z2) {
                setWatchfaceSignature(watchResourcesInfo, i);
            }
        }
        sendOperateType(watchResourcesInfo, i, z);
    }

    public void refreshUi(Context context) {
        String str = TAG;
        HwLog.i(str, "refreshUi enter");
        if (this.mWatchFaceSupportInfo == null) {
            HwLog.d(str, "mWatchFaceSupportInfo is null");
            HwWatchFaceManager.getInstance(context).getDeviceInfoByBt(false);
        }
        if (this.mWatchFaces.isEmpty()) {
            HwLog.d(str, "mWatchFaces is empty");
            HwWatchFaceManager.getInstance(context).doRefreshUi();
        }
    }

    public void registerHealthResponseListener() {
        if (Environment.sIsAarInTheme) {
            HwLog.i(TAG, "registerHealthResponseListener() sIsAarInTheme.");
        } else {
            HwWatchFaceApi.getInstance(this.mContext).registerHealthResponseListener(this.mHealthResponseListener);
        }
    }

    public void removePhotoCallback() {
        HwLog.d(TAG, "removePhotoCallback enter");
        List<IBaseResponseCallback> list = sCommandCallbacks.get(Integer.valueOf(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY));
        if (list == null || list.isEmpty()) {
            return;
        }
        list.remove(list.size() - 1);
    }

    public void resetWatchFaceSupportInfoAndWatchFaces() {
        HwLog.i(TAG, "resetWatchFaceSupportInfoAndWatchFaces() enter.");
        CopyOnWriteArrayList<WatchResourcesInfo> copyOnWriteArrayList = this.mWatchFaces;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
        }
        resetWatchFaceSupportInfo();
    }

    public void saveKaleidoscopeInfoToDevice(WatchFaceKaleidoscopeInfo watchFaceKaleidoscopeInfo, IBaseResponseCallback iBaseResponseCallback) {
        String str = TAG;
        HwLog.i(str, "saveKaleidoscopeInfoToDevice() enter.");
        if (watchFaceKaleidoscopeInfo == null) {
            iBaseResponseCallback.onResponse(102, "");
            HwLog.w(str, "saveKaleidoscopeInfoToDevice() error");
            return;
        }
        synchronized (getCommandCallbackCallbackList()) {
            if (iBaseResponseCallback != null) {
                List<IBaseResponseCallback> list = sCommandCallbacks.get(18);
                if (list == null) {
                    HwLog.i(str, "saveKaleidoscopeInfoToDevice() have no callback");
                    ArrayList arrayList = new ArrayList(20);
                    arrayList.add(iBaseResponseCallback);
                    sCommandCallbacks.put(18, arrayList);
                } else {
                    HwLog.i(str, "saveKaleidoscopeInfoToDevice() have callback, add");
                    list.add(iBaseResponseCallback);
                }
            }
        }
        makeKaleidoscopeInfoCommand(watchFaceKaleidoscopeInfo);
    }

    public void savePhotoInfoToDevice(WatchFacePhotoInfo watchFacePhotoInfo, LatonaWatchFaceThemeAlbumInfo latonaWatchFaceThemeAlbumInfo, IBaseResponseCallback iBaseResponseCallback) {
        String str = TAG;
        HwLog.i(str, "savePhotoInfoToDevice() enter.");
        if (watchFacePhotoInfo == null) {
            iBaseResponseCallback.onResponse(102, "");
            HwLog.w(str, "savePhotoInfoToDevice() error");
            return;
        }
        synchronized (getCommandCallbackCallbackList()) {
            if (iBaseResponseCallback != null) {
                List<IBaseResponseCallback> list = sCommandCallbacks.get(Integer.valueOf(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY));
                if (list == null) {
                    HwLog.i(str, "savePhotoInfoToDevice() have no callback");
                    ArrayList arrayList = new ArrayList(20);
                    arrayList.add(iBaseResponseCallback);
                    sCommandCallbacks.put(Integer.valueOf(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY), arrayList);
                } else {
                    HwLog.i(str, "savePhotoInfoToDevice() have callback, add");
                    list.add(iBaseResponseCallback);
                }
            }
        }
        makePhotoInfoCommand(watchFacePhotoInfo, latonaWatchFaceThemeAlbumInfo);
    }

    public void saveWatchFaceVideoInfo(WatchFaceVideoInfo watchFaceVideoInfo, IBaseResponseCallback iBaseResponseCallback) {
        String str = TAG;
        HwLog.i(str, "saveWatchFaceVideoInfo() enter.");
        if (watchFaceVideoInfo == null) {
            iBaseResponseCallback.onResponse(102, "");
            HwLog.w(str, "saveWatchFaceVideoInfo() error.");
            return;
        }
        synchronized (getCommandCallbackCallbackList()) {
            if (iBaseResponseCallback != null) {
                List<IBaseResponseCallback> list = sCommandCallbacks.get(16);
                if (list == null) {
                    HwLog.i(str, "saveWatchFaceVideoInfo() have no callback.");
                    ArrayList arrayList = new ArrayList(20);
                    arrayList.add(iBaseResponseCallback);
                    sCommandCallbacks.put(16, arrayList);
                } else {
                    HwLog.i(str, "saveWatchFaceVideoInfo() have callback, add.");
                    list.add(iBaseResponseCallback);
                }
            }
        }
        makeVideoInfoCommand(watchFaceVideoInfo);
    }

    public void saveWearInfoToDevice(WatchFaceWearInfo watchFaceWearInfo, IBaseResponseCallback iBaseResponseCallback) {
        String str = TAG;
        HwLog.i(str, "saveWearInfoToDevice() enter." + GsonHelper.toJson(watchFaceWearInfo));
        if (watchFaceWearInfo == null) {
            iBaseResponseCallback.onResponse(102, "");
            HwLog.w(str, "saveWearInfoToDevice() error");
            return;
        }
        synchronized (getCommandCallbackCallbackList()) {
            if (iBaseResponseCallback != null) {
                List<IBaseResponseCallback> list = sCommandCallbacks.get(20);
                if (list == null) {
                    ArrayList arrayList = new ArrayList(20);
                    arrayList.add(iBaseResponseCallback);
                    sCommandCallbacks.put(20, arrayList);
                } else {
                    list.add(iBaseResponseCallback);
                }
            }
        }
        makeWearInfoCommand(watchFaceWearInfo);
    }

    public void setIsWatchfaceFull(int i) {
        this.mIsWatchfaceFull = i;
    }

    public void setLeftSpace(int i) {
        this.mLeftSpace = i;
    }

    public void setOnAuthDenyCallback(IAuthDenyCallback iAuthDenyCallback) {
        this.mAuthDenyCallback = iAuthDenyCallback;
    }

    public void setPhotoInfoToDeviceCallback(IBaseResponseCallback iBaseResponseCallback) {
        synchronized (getCommandCallbackCallbackList()) {
            if (iBaseResponseCallback != null) {
                List<IBaseResponseCallback> list = sCommandCallbacks.get(Integer.valueOf(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY));
                if (list == null) {
                    HwLog.i(TAG, "savePhotoInfoToDevice() have no callback");
                    ArrayList arrayList = new ArrayList(20);
                    arrayList.add(iBaseResponseCallback);
                    sCommandCallbacks.put(Integer.valueOf(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY), arrayList);
                } else {
                    HwLog.i(TAG, "savePhotoInfoToDevice() have callback, add");
                    list.add(iBaseResponseCallback);
                }
            }
        }
    }

    public void setRegisterH5(String str) {
        String str2 = TAG;
        HwLog.i(str2, "setregisterH5() entry json :" + str);
        if (TextUtils.isEmpty(str)) {
            HwLog.i(str2, "setregisterH5() json is null");
            return;
        }
        q2.a(this.registerH5);
        RegisterInfo registerInfo = (RegisterInfo) GsonHelper.fromJson(str, RegisterInfo.class);
        if (registerInfo == null) {
            HwLog.i(str2, "setregisterH5() registerInfo is null");
            return;
        }
        if (ArrayUtils.isEmpty(registerInfo.getList())) {
            HwLog.i(str2, "setregisterH5() registerInfo.getList() is null");
            return;
        }
        List<RegisterInfo.RegisterBean> list = registerInfo.getList();
        for (int i = 0; i < list.size(); i++) {
            RegisterInfo.RegisterBean registerBean = list.get(i);
            if (registerBean != null) {
                q2.a(this.registerH5, registerBean.getServiceId() + "_" + registerBean.getCommandId(), registerBean);
            }
        }
    }

    public void setRegisterH5Callback(OperateWatchFaceCallback operateWatchFaceCallback) {
        this.registerH5Callback = operateWatchFaceCallback;
    }

    public void setTaskExecuting(boolean z) {
        this.isTaskExecuting = z;
    }

    public void sortWatchList(ArrayList<WatchResourcesInfo> arrayList, IBaseResponseCallback iBaseResponseCallback) {
        String str = TAG;
        HwLog.i(str, "sortWatchList() enter.");
        synchronized (getCommandCallbackCallbackList()) {
            if (iBaseResponseCallback != null) {
                List<IBaseResponseCallback> list = sCommandCallbacks.get(4);
                if (list == null) {
                    HwLog.i(str, "sortWatchList() have no callback");
                    ArrayList arrayList2 = new ArrayList(20);
                    arrayList2.add(iBaseResponseCallback);
                    sCommandCallbacks.put(4, arrayList2);
                } else {
                    HwLog.i(str, "sortWatchList() have callback,add");
                    list.add(iBaseResponseCallback);
                }
            }
        }
        sendInfoList(arrayList);
    }

    public String getKaleidoscopePackageName() {
        synchronized (HwWatchFaceBtManager.class) {
            if (this.mWatchFaces.isEmpty()) {
                this.isGetKaleidoscopePackageName = true;
                return "";
            }
            for (WatchResourcesInfo watchResourcesInfo : getWatchFaces()) {
                if ((watchResourcesInfo.getWatchInfoType() & 128) == 128) {
                    String watchInfoId = watchResourcesInfo.getWatchInfoId();
                    HwLog.i(TAG, "getKaleidoscopePackageName() KaleidoscopePackageName: " + watchInfoId);
                    this.isGetKaleidoscopePackageName = false;
                    return watchInfoId;
                }
            }
            return "";
        }
    }

    public String getPhotoPackageName() {
        synchronized (HwWatchFaceBtManager.class) {
            if (this.mWatchFaces.isEmpty()) {
                this.isGetAlbumPackageName = true;
                return "";
            }
            for (WatchResourcesInfo watchResourcesInfo : getWatchFaces()) {
                if ((watchResourcesInfo.getWatchInfoType() & 32) == 32) {
                    String watchInfoId = watchResourcesInfo.getWatchInfoId();
                    HwLog.i(TAG, "getPhotoPackageName() photoPackageName: " + watchInfoId);
                    this.isGetAlbumPackageName = false;
                    return watchInfoId;
                }
            }
            return "";
        }
    }

    public String getTryOutWatchFacePackageName() {
        synchronized (HwWatchFaceBtManager.class) {
            for (WatchResourcesInfo watchResourcesInfo : getWatchFaces()) {
                if ((watchResourcesInfo.getWatchInfoType() & 64) == 64) {
                    String watchInfoId = watchResourcesInfo.getWatchInfoId();
                    HwLog.i(TAG, "getTryOutWatchFacePackageName() tryOutPackageName: " + watchInfoId);
                    return watchInfoId;
                }
            }
            return "";
        }
    }

    public String getTryOutWatchFacePackageNameAndVersion() {
        synchronized (HwWatchFaceBtManager.class) {
            for (WatchResourcesInfo watchResourcesInfo : getWatchFaces()) {
                if ((watchResourcesInfo.getWatchInfoType() & 64) == 64) {
                    String str = watchResourcesInfo.getWatchInfoId() + "_" + watchResourcesInfo.getWatchInfoVersion();
                    HwLog.i(TAG, "getTryOutWatchFacePackageNameAndVersion() tryOutPackageNameAndVersion: " + str);
                    return str;
                }
            }
            return "";
        }
    }

    public String getVideoPackageName() {
        synchronized (HwWatchFaceBtManager.class) {
            if (this.mWatchFaces.isEmpty()) {
                this.isGetVideoAlbumPackageName = true;
                return "";
            }
            for (WatchResourcesInfo watchResourcesInfo : getWatchFaces()) {
                if ((watchResourcesInfo.getWatchInfoType() & 16) == 16) {
                    String watchInfoId = watchResourcesInfo.getWatchInfoId();
                    HwLog.i(TAG, "getVideoPackageName() videoPackageName: " + watchInfoId);
                    this.isGetVideoAlbumPackageName = false;
                    return watchInfoId;
                }
            }
            return "";
        }
    }

    public void getWatchFaceWearInfo(int i, IBaseResponseCallback iBaseResponseCallback) {
        HwLog.i(TAG, "getWatchFaceWearInfo() enter");
        synchronized (getCommandCallbackCallbackList()) {
            if (iBaseResponseCallback != null) {
                List<IBaseResponseCallback> list = sCommandCallbacks.get(19);
                if (list == null) {
                    ArrayList arrayList = new ArrayList(20);
                    arrayList.add(iBaseResponseCallback);
                    sCommandCallbacks.put(19, arrayList);
                } else {
                    list.add(iBaseResponseCallback);
                }
            }
        }
        this.mWearOptionType = i;
        sendWearWatchFaceCommand();
    }

    public String getWatchFaceMaxVersion() {
        WatchFaceSupportInfo connectWatchfaceSupportInfo = getConnectWatchfaceSupportInfo();
        String watchFaceMaxVersion = connectWatchfaceSupportInfo != null ? connectWatchfaceSupportInfo.getWatchFaceMaxVersion() : null;
        if (!TextUtils.isEmpty(watchFaceMaxVersion)) {
            HwLog.i(TAG, "getWatchFaceMaxVersion() from mWatchFaceSupportInfo.");
            return watchFaceMaxVersion;
        }
        String strA = f5.a("watch_max_version");
        if (!TextUtils.isEmpty(strA)) {
            HwLog.i(TAG, "getWatchFaceMaxVersion() from sp.");
            return strA;
        }
        HwLog.i(TAG, "getWatchFaceMaxVersion() from virtual.");
        return getInstance(Environment.getApplicationContext()).getVirtualWatchInfo("watch_max_version");
    }

    public String getWatchFaceScreen() {
        WatchFaceSupportInfo connectWatchfaceSupportInfo = getConnectWatchfaceSupportInfo();
        if (connectWatchfaceSupportInfo != null && !TextUtils.isEmpty(connectWatchfaceSupportInfo.getWatchFaceScreen())) {
            HwLog.i(TAG, "getWatchFaceScreen() mWatchFaceSupportInfo is not null.");
            return connectWatchfaceSupportInfo.getWatchFaceScreen();
        }
        String strA = f5.a("watch_screen");
        if (!TextUtils.isEmpty(strA)) {
            HwLog.i(TAG, "getWatchFaceScreen() from sp.");
            return strA;
        }
        HwLog.i(TAG, "getWatchFaceScreen() from VirtualWatchInfo.");
        return getInstance(Environment.getApplicationContext()).getVirtualWatchInfo("watch_screen");
    }

    public WatchFacePhotoInfo getWatchFacePhotoInfo() {
        return this.mWatchFacePhotoInfo;
    }

    private void handleWearInfoTlv(TlvFather tlvFather) {
        HwLog.i(TAG, "handleWearInfoTlv() enter.");
        ArrayList<WearStruct> arrayList = new ArrayList<>();
        Iterator<TlvFather> it = tlvFather.getTlvFatherList().iterator();
        long jB = -1;
        String strB = "";
        while (it.hasNext()) {
            for (Tlv tlv : it.next().getTlvList()) {
                int iC = IntegerUtils.c(tlv.getTag());
                if (iC == 8) {
                    jB = IntegerUtils.b(tlv.getValue());
                    HwLog.i(TAG, "handleWearInfoTlv styleId=" + jB);
                } else if (iC != 9) {
                    HwLog.w(TAG, "handleWearInfoTlv() error");
                } else {
                    strB = i1.b(tlv.getValue());
                    HwLog.i(TAG, "handleWearInfoTlv previewName=" + strB);
                }
            }
            arrayList.add(new WearStruct(jB, strB));
        }
        this.mWatchFaceWearInfo.setWearList(arrayList);
    }

    public WatchFaceVideoInfo getWatchFaceVideoInfo() {
        return this.mWatchFaceVideoInfo;
    }

    public void operateDevice(WatchResourcesInfo watchResourcesInfo, int i, IBaseResponseCallback iBaseResponseCallback) {
        operateDevice(watchResourcesInfo, i, iBaseResponseCallback, false, false);
    }
}
