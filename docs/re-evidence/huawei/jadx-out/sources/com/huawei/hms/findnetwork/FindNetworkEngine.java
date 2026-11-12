package com.huawei.hms.findnetwork;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hmf.tasks.Tasks;
import com.huawei.hms.api.Api;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TransactionIdCreater;
import com.huawei.hms.findnetwork.bean.BtMeasureResult;
import com.huawei.hms.findnetwork.callback.FindNetworkSoundCallback;
import com.huawei.hms.findnetwork.callback.PairingCallback;
import com.huawei.hms.findnetwork.comm.client.FindClientBuilder;
import com.huawei.hms.findnetwork.comm.client.FindOptions;
import com.huawei.hms.findnetwork.comm.exception.FindNetworkException;
import com.huawei.hms.findnetwork.comm.request.OfflineLocationCipher;
import com.huawei.hms.findnetwork.comm.request.ResultTApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.AccessoryDetectResult;
import com.huawei.hms.findnetwork.comm.request.bean.BaseRequestBean;
import com.huawei.hms.findnetwork.comm.request.bean.DecryptLocationCipherBean;
import com.huawei.hms.findnetwork.comm.request.bean.DeviceDetail;
import com.huawei.hms.findnetwork.comm.request.bean.DeviceIdListBean;
import com.huawei.hms.findnetwork.comm.request.bean.DeviceOtaProgress;
import com.huawei.hms.findnetwork.comm.request.bean.DeviceOtaTargetVersion;
import com.huawei.hms.findnetwork.comm.request.bean.DevicePeriodRequestBean;
import com.huawei.hms.findnetwork.comm.request.bean.DisConnectLocation;
import com.huawei.hms.findnetwork.comm.request.bean.DisconnectNotificationParams;
import com.huawei.hms.findnetwork.comm.request.bean.DisconnectNotifyStatusBean;
import com.huawei.hms.findnetwork.comm.request.bean.FindKeyParam;
import com.huawei.hms.findnetwork.comm.request.bean.FindNetworkRequestBean;
import com.huawei.hms.findnetwork.comm.request.bean.FindParamRequestBean;
import com.huawei.hms.findnetwork.comm.request.bean.GetAntiStalkingRecordRequestBean;
import com.huawei.hms.findnetwork.comm.request.bean.GetFidRequestBean;
import com.huawei.hms.findnetwork.comm.request.bean.LocationRecordBean;
import com.huawei.hms.findnetwork.comm.request.bean.LostFindNotifyBean;
import com.huawei.hms.findnetwork.comm.request.bean.MultiTerminalDeviceInfo;
import com.huawei.hms.findnetwork.comm.request.bean.PairedDeviceInfo;
import com.huawei.hms.findnetwork.comm.request.bean.PairingResultBean;
import com.huawei.hms.findnetwork.comm.request.bean.PassiveLocationRequestBean;
import com.huawei.hms.findnetwork.comm.request.bean.QueryTagDerivedKeyBean;
import com.huawei.hms.findnetwork.comm.request.bean.QueryTagDerivedRequestBean;
import com.huawei.hms.findnetwork.comm.request.bean.RegisterDetailsBean;
import com.huawei.hms.findnetwork.comm.request.bean.RegisterStatusBean;
import com.huawei.hms.findnetwork.comm.request.bean.SendHeartBeatRequestBean;
import com.huawei.hms.findnetwork.comm.request.bean.SetDevicePublicKeysRequestBean;
import com.huawei.hms.findnetwork.comm.request.bean.SetFindeeModeRequestBean;
import com.huawei.hms.findnetwork.comm.request.bean.SetPublicKeysRequestBean;
import com.huawei.hms.findnetwork.comm.request.bean.SetTrustTagRequestBean;
import com.huawei.hms.findnetwork.comm.request.bean.SnRequestBean;
import com.huawei.hms.findnetwork.comm.request.bean.SoundRequestBean;
import com.huawei.hms.findnetwork.comm.request.bean.StartFindConfigRequestBean;
import com.huawei.hms.findnetwork.comm.request.bean.TagDerivedKey;
import com.huawei.hms.findnetwork.comm.request.bean.TagStatus;
import com.huawei.hms.findnetwork.comm.request.bean.UserOperationBean;
import com.huawei.hms.findnetwork.comm.request.bean.wear.BindDeviceRequestBean;
import com.huawei.hms.findnetwork.comm.request.bean.wear.DeviceBindStatusResponse;
import com.huawei.hms.findnetwork.comm.request.bean.wear.EnableFoundRequestBean;
import com.huawei.hms.findnetwork.comm.request.bean.wear.FidBatchRequestBean;
import com.huawei.hms.findnetwork.comm.request.bean.wear.FidRequestBean;
import com.huawei.hms.findnetwork.comm.request.bean.wear.OfflineLocationBean;
import com.huawei.hms.findnetwork.comm.request.bean.wear.PairRequestBean;
import com.huawei.hms.findnetwork.comm.request.bean.wear.PairResponseBean;
import com.huawei.hms.findnetwork.comm.request.bean.wear.PhoneResponseMessage;
import com.huawei.hms.findnetwork.comm.request.bean.wear.ShareDeviceRequestBean;
import com.huawei.hms.findnetwork.comm.request.callback.FindNetworkCallback;
import com.huawei.hms.findnetwork.comm.request.callback.GrabTagLogListener;
import com.huawei.hms.findnetwork.comm.request.callback.NearLinkNavigationCallback;
import com.huawei.hms.findnetwork.comm.request.option.OfflineBroadcastParam;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkConfigResult;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkOfflineLocation;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkResult;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkScanResult;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkStatusResult;
import com.huawei.hms.findnetwork.comm.util.CollectionUtil;
import com.huawei.hms.findnetwork.comm.util.ErrorCode;
import com.huawei.hms.findnetwork.comm.util.JsonUtils;
import com.huawei.hms.findnetwork.comm.util.MaskUtil;
import com.huawei.hms.findnetwork.comm.util.RomUtil;
import com.huawei.hms.findnetwork.comm.util.VerifyUtil;
import com.huawei.hms.findnetwork.exception.FindNetworkUnsupportedException;
import com.huawei.hms.findnetwork.exception.FindNetworkVerifyException;
import com.huawei.hms.findnetwork.request.CheckTagStatusApiCall;
import com.huawei.hms.findnetwork.request.ManualOtaApiCall;
import com.huawei.hms.findnetwork.request.MultiTerminalDeviceInfoApiCall;
import com.huawei.hms.findnetwork.request.QueryDeviceDetailApiCall;
import com.huawei.hms.findnetwork.request.QueryDisconnectLocationApiCall;
import com.huawei.hms.findnetwork.request.QueryLocationRecordApiCall;
import com.huawei.hms.findnetwork.request.QueryPairedDevicesApiCall;
import com.huawei.hms.findnetwork.request.QueryRegisterStatusApiCall;
import com.huawei.hms.findnetwork.request.QueryTagDerivedKeyApiCall;
import com.huawei.hms.findnetwork.request.RegisterDeviceApiCall;
import com.huawei.hms.findnetwork.request.StartFastPairApiCall;
import com.huawei.hms.findnetwork.request.StartFindConfigurationApiCall;
import com.huawei.hms.findnetwork.request.StartOtaCheckApiCall;
import com.huawei.hms.findnetwork.request.SyncTagInfoApiCall;
import com.huawei.hms.findnetwork.request.UnPairApiCall;
import com.huawei.hms.findnetwork.request.wear.CheckDeviceStatusApiCall;
import com.huawei.hms.findnetwork.request.wear.InitPairSessionApiCall;
import com.huawei.hms.findnetwork.request.wear.ProcessPairRequestApiCall;
import com.huawei.hms.findnetwork.request.wear.ProcessPairResponseApiCall;
import com.huawei.hms.findnetwork.request.wear.RequestBindDeviceApiCall;
import com.huawei.hms.findnetwork.request.wear.RequestSharingDeviceApiCall;
import com.huawei.hms.findnetwork.request.wear.RequestSharingPublicKeyApiCall;
import com.huawei.hms.findnetwork.request.wear.WearUnPairApiCall;
import com.huawei.hms.findnetwork.sdk.C;
import com.huawei.hms.findnetwork.sdk.C0424b;
import com.huawei.hms.findnetwork.sdk.C0425c;
import com.huawei.hms.findnetwork.sdk.C0426d;
import com.huawei.hms.findnetwork.sdk.C0427e;
import com.huawei.hms.findnetwork.sdk.C0428f;
import com.huawei.hms.findnetwork.sdk.C0429g;
import com.huawei.hms.findnetwork.sdk.C0430h;
import com.huawei.hms.findnetwork.sdk.C0431i;
import com.huawei.hms.findnetwork.sdk.C0432j;
import com.huawei.hms.findnetwork.sdk.C0433k;
import com.huawei.hms.findnetwork.sdk.C0434l;
import com.huawei.hms.findnetwork.sdk.C0435m;
import com.huawei.hms.findnetwork.sdk.C0436n;
import com.huawei.hms.findnetwork.sdk.C0437o;
import com.huawei.hms.findnetwork.sdk.C0438p;
import com.huawei.hms.findnetwork.sdk.C0439q;
import com.huawei.hms.findnetwork.sdk.C0440s;
import com.huawei.hms.findnetwork.sdk.C0441t;
import com.huawei.hms.findnetwork.sdk.C0443v;
import com.huawei.hms.findnetwork.sdk.C0447x;
import com.huawei.hms.findnetwork.sdk.E;
import com.huawei.hms.findnetwork.sdk.F;
import com.huawei.hms.findnetwork.sdk.G;
import com.huawei.hms.findnetwork.sdk.H;
import com.huawei.hms.findnetwork.sdk.I;
import com.huawei.hms.findnetwork.sdk.J;
import com.huawei.hms.findnetwork.sdk.K;
import com.huawei.hms.findnetwork.sdk.N;
import com.huawei.hms.findnetwork.sdk.O;
import com.huawei.hms.findnetwork.sdk.P;
import com.huawei.hms.findnetwork.sdk.S;
import com.huawei.hms.findnetwork.sdk.W;
import com.huawei.hms.findnetwork.sdk.X;
import com.huawei.hms.findnetwork.sdk.r;
import com.huawei.hms.findnetwork.sdk.y;
import com.huawei.hms.findnetwork.sdk.z;
import com.huawei.hms.findnetwork.ultrasound.FindExactSdkManager;
import com.huawei.hms.findnetwork.util.AgcParseUtil;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class FindNetworkEngine extends HuaweiApi<Api.ApiOptions> {
    private static final String API_NAME = "nearby.findnetwork.API";
    private static final String META_API_LEVEL_KEY = "com.huawei.hms.min_api_level:findnetworksdk:findnetwork";
    private static final String TAG = "FindNetworkEngine";
    private String appId;
    private boolean isEMUI;
    private int mApiLevel;
    private int mUid;
    private String packageName;
    private String region;

    /* JADX INFO: loaded from: classes33.dex */
    public static class OfflineLocationListTypeToken extends TypeToken<List<FindNetworkOfflineLocation>> {
    }

    public FindNetworkEngine(Activity activity) {
        super(activity, (Api<FindOptions>) new Api(API_NAME), new FindOptions(), (AbstractClientBuilder) new FindClientBuilder(), 61600300);
        this.mApiLevel = 1;
        this.region = "";
        this.appId = "";
        this.packageName = "";
        initParam(activity);
    }

    public Task<FindNetworkResult<List<FindNetworkOfflineLocation>>> batchDecryptLocationCipher(List<OfflineLocationCipher> list) throws FindNetworkException {
        HmsFindSDKLog.i(TAG, "batchDecryptLocationCipher");
        checkThirdPartySupport("findnetwork.decrypt_location_batch");
        String strCreateTransactionId = createTransactionId();
        ArrayList arrayList = new ArrayList();
        for (OfflineLocationCipher offlineLocationCipher : list) {
            if (VerifyUtil.verifySn(offlineLocationCipher.getSn()) && !TextUtils.isEmpty(offlineLocationCipher.getPubKeyHash()) && !TextUtils.isEmpty(offlineLocationCipher.getCipherText())) {
                arrayList.add(offlineLocationCipher);
            }
        }
        if (arrayList.isEmpty()) {
            return Tasks.fromException(new FindNetworkVerifyException(ErrorCode.CODE_PARAMETER_INVALID));
        }
        FindNetworkRequestBean findNetworkRequestBean = new FindNetworkRequestBean(arrayList);
        fillRequestBase(findNetworkRequestBean);
        return doWrite(new a("findnetwork.decrypt_location_batch", JsonUtils.object2Json(findNetworkRequestBean), strCreateTransactionId));
    }

    public Task<FindNetworkResult<String>> enableFoundNotification(String str, String str2) {
        return enableFoundNotification(str, str2, true);
    }

    /* JADX INFO: renamed from: lambda$setDisconnectNotification$0$com-huawei-hms-findnetwork-FindNetworkEngine, reason: not valid java name */
    /* synthetic */ void m1342x47be79b2(String str, int i, DisconnectNotificationParams disconnectNotificationParams, FindNetworkCallback findNetworkCallback, Void r5) {
        doDisconnectNotifyModeCall(str, i, disconnectNotificationParams, findNetworkCallback);
    }

    /* JADX INFO: renamed from: lambda$setDisconnectNotification$1$com-huawei-hms-findnetwork-FindNetworkEngine, reason: not valid java name */
    /* synthetic */ void m1343x1360751(String str, int i, DisconnectNotificationParams disconnectNotificationParams, FindNetworkCallback findNetworkCallback, Exception exc) {
        doDisconnectNotifyModeCall(str, i, disconnectNotificationParams, findNetworkCallback);
    }

    public Task<FindNetworkResult<OfflineLocationBean>> queryOfflineLocation(String str) throws FindNetworkException {
        verifyFid(str);
        HmsFindSDKLog.i(TAG, "queryOfflineLocation fid: " + MaskUtil.maskSn(str));
        FidRequestBean fidRequestBean = new FidRequestBean();
        fidRequestBean.setFid(str);
        return doWrite(new y(fidRequestBean));
    }

    public Task<FindNetworkResult> sendHeartBeat(String str, int i, boolean z) throws FindNetworkException {
        verifyFid(str);
        HmsFindSDKLog.i(TAG, "sendHeartBeat fid: " + MaskUtil.maskSn(str) + ", businessId: " + i + ", isStop: " + z);
        checkThirdPartySupport("findnetwork.sendHeartBeat");
        SendHeartBeatRequestBean sendHeartBeatRequestBean = new SendHeartBeatRequestBean();
        sendHeartBeatRequestBean.setConnectTagSn(str);
        sendHeartBeatRequestBean.setBusinessId(i);
        sendHeartBeatRequestBean.setStop(z);
        fillRequestBase(sendHeartBeatRequestBean);
        return doWrite(new C(sendHeartBeatRequestBean));
    }

    public FindNetworkEngine(Context context) {
        super(context, (Api<FindOptions>) new Api(API_NAME), new FindOptions(), new FindClientBuilder(), 61600300);
        this.mApiLevel = 1;
        this.region = "";
        this.appId = "";
        this.packageName = "";
        initParam(context);
    }

    public Task<FindNetworkResult<List<FindNetworkOfflineLocation>>> batchDecryptLocationCipher(OfflineLocationCipher... offlineLocationCipherArr) throws FindNetworkException {
        return batchDecryptLocationCipher(Arrays.asList(offlineLocationCipherArr));
    }

    public Task<FindNetworkResult<String>> enableFoundNotification(String str, String str2, boolean z) {
        HmsFindSDKLog.i(TAG, "enableFoundNotification fid: " + MaskUtil.maskSn(str));
        EnableFoundRequestBean enableFoundRequestBean = new EnableFoundRequestBean();
        enableFoundRequestBean.setFid(str);
        enableFoundRequestBean.setSwitchOn(z);
        enableFoundRequestBean.setAdditional(str2);
        return doWrite(new C0434l(enableFoundRequestBean));
    }

    public void queryOfflineLocation(List<String> list, FindNetworkCallback<List<OfflineLocationBean>> findNetworkCallback) throws FindNetworkException {
        verifyFids(list);
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(MaskUtil.maskSn(it.next()));
        }
        HmsFindSDKLog.i(TAG, "queryOfflineLocation fids: " + JsonUtils.object2Json(arrayList));
        FidBatchRequestBean fidBatchRequestBean = new FidBatchRequestBean();
        fidBatchRequestBean.setFids(list);
        doWrite(new z(fidBatchRequestBean, findNetworkCallback));
    }

    public Task<FindNetworkResult> sendHeartBeat(String str, String str2, int[] iArr, boolean z, String str3) throws FindNetworkException {
        verifyFid(str);
        HmsFindSDKLog.i(TAG, "sendHeartBeat fid: " + MaskUtil.maskSn(str) + ", businessId: " + iArr + ", isStop: " + z);
        checkThirdPartySupport("findnetwork.sendHeartBeat");
        SendHeartBeatRequestBean sendHeartBeatRequestBean = new SendHeartBeatRequestBean();
        sendHeartBeatRequestBean.setConnectTagSn(str);
        sendHeartBeatRequestBean.setBusinessIds(iArr);
        sendHeartBeatRequestBean.setSrcTranId(str2);
        sendHeartBeatRequestBean.setExtData(str3);
        sendHeartBeatRequestBean.setStop(z);
        fillRequestBase(sendHeartBeatRequestBean);
        return doWrite(new C(sendHeartBeatRequestBean));
    }

    public Task<Void> verifyDevicePeriod(String str, String str2, int i, FindNetworkCallback<String> findNetworkCallback) {
        return doWrite(new X(new DevicePeriodRequestBean(str, str2, i), findNetworkCallback));
    }

    public Task<Void> userOperation(int i, String str) throws FindNetworkException {
        HmsFindSDKLog.i(TAG, "userOperation: code = " + i);
        return doWrite(new W(new UserOperationBean(i, str)));
    }

    public Task<Void> updateLongConnectionParams(String str) throws FindNetworkException {
        verifyFid(str);
        HmsFindSDKLog.i(TAG, "updateLongConnectionParams fid: " + MaskUtil.maskSn(str));
        checkThirdPartySupport("findnetwork.tag_updateLongConnectionParams");
        r.a().c(str, 17);
        SnRequestBean snRequestBean = new SnRequestBean();
        fillRequestBase(snRequestBean);
        snRequestBean.setConnectTagSn(str);
        return doWrite(new C0432j(snRequestBean));
    }

    public Task<FindNetworkResult<Void>> unPair(String str, FindNetworkCallback findNetworkCallback) throws FindNetworkException {
        verifyFid(str);
        checkThirdPartySupport("findnetwork.tag_unpair");
        HmsFindSDKLog.i(TAG, "unPair fid: " + MaskUtil.maskSn(str));
        SnRequestBean snRequestBean = new SnRequestBean();
        fillRequestBase(snRequestBean);
        snRequestBean.setConnectTagSn(str);
        return doWrite(new UnPairApiCall(snRequestBean, findNetworkCallback));
    }

    public Task<FindNetworkResult<List<PairedDeviceInfo>>> syncCloudDeviceData(String str) throws FindNetworkException {
        HmsFindSDKLog.i(TAG, "syncCloudDeviceData fid: " + MaskUtil.maskSn(str));
        checkThirdPartySupport("findnetwork.syncTagInfo");
        verifyFid(str);
        SnRequestBean snRequestBean = new SnRequestBean();
        snRequestBean.setConnectTagSn(str);
        fillRequestBase(snRequestBean);
        return doWrite(new SyncTagInfoApiCall(snRequestBean));
    }

    public Task<Void> stopSound(String str, boolean z, FindNetworkSoundCallback findNetworkSoundCallback) throws FindNetworkException {
        verifyFid(str);
        HmsFindSDKLog.i(TAG, "stopSound fid: " + MaskUtil.maskSn(str) + ", isOwner: " + z);
        checkThirdPartySupport("findnetwork.tag_stop_sound");
        SoundRequestBean soundRequestBean = new SoundRequestBean();
        fillRequestBase(soundRequestBean);
        soundRequestBean.setConnectTagSn(str);
        soundRequestBean.setOwner(z);
        return doWrite(new S(soundRequestBean, findNetworkSoundCallback));
    }

    public Task<Void> stopNearLinkNavigation(String str) throws FindNetworkException {
        HmsFindSDKLog.i(TAG, "stopNearLinkNavigation deviceId: " + MaskUtil.maskSn(str));
        checkThirdPartySupport("findnetwork.stopNearLinkNavigation");
        SnRequestBean snRequestBean = new SnRequestBean();
        fillRequestBase(snRequestBean);
        snRequestBean.setConnectTagSn(str);
        return new C0443v(this, snRequestBean, null).f();
    }

    public Task<Void> stopNavigate(String str, FindNetworkCallback findNetworkCallback) throws FindNetworkException {
        verifyFid(str);
        HmsFindSDKLog.i(TAG, "stopNavigate fid: " + MaskUtil.maskSn(str));
        checkThirdPartySupport("findnetwork.stop_navigate");
        FindExactSdkManager.a().b();
        r.a().c(str, 16);
        C0424b.b().f();
        SnRequestBean snRequestBean = new SnRequestBean();
        fillRequestBase(snRequestBean);
        snRequestBean.setConnectTagSn(str);
        return doWrite(new P(snRequestBean, findNetworkCallback));
    }

    public Task<Void> stopBTMeasure(String str, FindNetworkCallback findNetworkCallback) throws FindNetworkException {
        verifyFid(str);
        HmsFindSDKLog.i(TAG, "stopBTMeasure fid: " + MaskUtil.maskSn(str));
        checkThirdPartySupport("findnetwork.stopBTMeasure");
        SnRequestBean snRequestBean = new SnRequestBean();
        snRequestBean.setConnectTagSn(str);
        fillRequestBase(snRequestBean);
        return doWrite(new O(snRequestBean, findNetworkCallback));
    }

    public Task<Void> startSound(String str, boolean z, FindNetworkSoundCallback findNetworkSoundCallback) throws FindNetworkException {
        verifyFid(str);
        HmsFindSDKLog.i(TAG, "startSound fid: " + MaskUtil.maskSn(str) + ", isOwner: " + z);
        checkThirdPartySupport("findnetwork.tag_start_sound");
        SoundRequestBean soundRequestBean = new SoundRequestBean();
        fillRequestBase(soundRequestBean);
        soundRequestBean.setConnectTagSn(str);
        soundRequestBean.setOwner(z);
        return doWrite(new N(soundRequestBean, findNetworkSoundCallback));
    }

    public Task<Void> startOta(String str, FindNetworkCallback<DeviceOtaProgress> findNetworkCallback) throws FindNetworkException {
        verifyFid(str);
        HmsFindSDKLog.i(TAG, "startOta fid: " + MaskUtil.maskSn(str));
        checkThirdPartySupport("findnetwork.manualOta");
        SnRequestBean snRequestBean = new SnRequestBean();
        fillRequestBase(snRequestBean);
        snRequestBean.setConnectTagSn(str);
        return doWrite(new ManualOtaApiCall(snRequestBean, findNetworkCallback));
    }

    public Task<Void> startNearLinkNavigation(Context context, String str, NearLinkNavigationCallback nearLinkNavigationCallback) throws FindNetworkException {
        HmsFindSDKLog.i(TAG, "startNearLinkNavigation deviceId: " + MaskUtil.maskSn(str));
        checkThirdPartySupport("findnetwork.startNearLinkNavigation");
        if (context == null || TextUtils.isEmpty(str) || nearLinkNavigationCallback == null) {
            throw new FindNetworkException("context, callback or deviceId null", ErrorCode.CODE_PARAMETER_INVALID);
        }
        SnRequestBean snRequestBean = new SnRequestBean();
        fillRequestBase(snRequestBean);
        snRequestBean.setConnectTagSn(str);
        new C0443v(this, snRequestBean, nearLinkNavigationCallback).a(context);
        return doWrite(new C0440s());
    }

    public Task<Void> startNavigate(Context context, String str, FindNetworkCallback findNetworkCallback) throws FindNetworkException {
        HmsFindSDKLog.i(TAG, "startNavigate");
        checkThirdPartySupport("findnetwork.start_navigate");
        verifyFid(str);
        FindExactSdkManager.a().a(this, context, str, findNetworkCallback);
        return doWrite(new C0440s());
    }

    public Task<FindNetworkConfigResult<PairingResultBean>> startFindNetworkConfiguration(String str, String str2, int i, String str3, PairingCallback pairingCallback) throws FindNetworkException {
        verifyMac(str);
        HmsFindSDKLog.i(TAG, "startFindNetworkConfiguration mac: " + MaskUtil.maskMac(str) + ", deviceName: " + str2 + ", goodsType: " + i + ", electricity: " + str3);
        checkThirdPartySupport("findnetwork.start_findnetwork_config");
        if (TextUtils.isEmpty(str3)) {
            throw new FindNetworkVerifyException(ErrorCode.CODE_PARAMETER_INVALID);
        }
        StartFindConfigRequestBean startFindConfigRequestBean = new StartFindConfigRequestBean(str);
        fillRequestBase(startFindConfigRequestBean);
        startFindConfigRequestBean.setDeviceName(str2);
        startFindConfigRequestBean.setElectricity(str3);
        startFindConfigRequestBean.setGoodsType(i);
        return doWrite(new StartFindConfigurationApiCall(startFindConfigRequestBean, pairingCallback));
    }

    public Task<Void> startFastScan(FindNetworkCallback<FindNetworkScanResult> findNetworkCallback) throws FindNetworkException {
        HmsFindSDKLog.i(TAG, "startFastScan");
        checkThirdPartySupport("findnetwork.startFastScan");
        BaseRequestBean baseRequestBean = new BaseRequestBean();
        fillRequestBase(baseRequestBean);
        return doWrite(new K(findNetworkCallback, baseRequestBean));
    }

    public Task<FindNetworkResult<Void>> startFastPair() throws FindNetworkException {
        HmsFindSDKLog.i(TAG, "startFastPair");
        checkThirdPartySupport("findnetwork.startFastPair");
        BaseRequestBean baseRequestBean = new BaseRequestBean();
        fillRequestBase(baseRequestBean);
        return doWrite(new StartFastPairApiCall(baseRequestBean));
    }

    public Task<Void> startBTMeasure(String str, FindNetworkCallback<BtMeasureResult> findNetworkCallback) throws FindNetworkException {
        verifyFid(str);
        HmsFindSDKLog.i(TAG, "startBTMeasure fid: " + MaskUtil.maskSn(str));
        checkThirdPartySupport("findnetwork.startBTMeasure");
        SnRequestBean snRequestBean = new SnRequestBean();
        snRequestBean.setConnectTagSn(str);
        fillRequestBase(snRequestBean);
        return doWrite(new J(snRequestBean, findNetworkCallback));
    }

    public Task<Void> startAccessoryDetect(FindNetworkCallback<AccessoryDetectResult> findNetworkCallback) {
        return doWrite(new I(new BaseRequestBean(), findNetworkCallback));
    }

    public Task<FindNetworkResult<String>> silentUnPair(String str) throws FindNetworkException {
        verifyFid(str);
        HmsFindSDKLog.i(TAG, "silentUnPair fid: " + MaskUtil.maskSn(str));
        FidRequestBean fidRequestBean = new FidRequestBean();
        fidRequestBean.setFid(str);
        return doWrite(new WearUnPairApiCall(fidRequestBean));
    }

    public Task<Void> setTrustTag(String str, boolean z) throws FindNetworkException {
        verifyFid(str);
        HmsFindSDKLog.i(TAG, "setTrustTag fid: " + MaskUtil.maskSn(str) + ", isTrust: " + z);
        checkThirdPartySupport("findnetwork.setTrustTag");
        SetTrustTagRequestBean setTrustTagRequestBean = new SetTrustTagRequestBean(str, z);
        fillRequestBase(setTrustTagRequestBean);
        return doWrite(new H(setTrustTagRequestBean));
    }

    public Task<Void> setPublicKeys(List<OfflineBroadcastParam> list, String str) throws FindNetworkException {
        HmsFindSDKLog.i(TAG, "setPublicKeys");
        checkThirdPartySupport("findnetwork.setPublicKeys");
        if (CollectionUtil.isEmpty(list)) {
            HmsFindSDKLog.e(TAG, "publicKeys cannot be empty.");
            return null;
        }
        SetPublicKeysRequestBean setPublicKeysRequestBean = new SetPublicKeysRequestBean(list);
        fillRequestBase(setPublicKeysRequestBean);
        setPublicKeysRequestBean.setCountryCode(str);
        return doWrite(new G(setPublicKeysRequestBean));
    }

    public Task<Void> setFindeeMode(int i) throws FindNetworkException {
        HmsFindSDKLog.i(TAG, "setFindeeMode duration: " + i);
        checkThirdPartySupport("findnetwork.setFindeeMode");
        SetFindeeModeRequestBean setFindeeModeRequestBean = new SetFindeeModeRequestBean();
        fillRequestBase(setFindeeModeRequestBean);
        setFindeeModeRequestBean.setFindeeModeTime(i);
        return doWrite(new F(setFindeeModeRequestBean));
    }

    public Task<Void> setDisconnectNotification(final String str, final int i, final DisconnectNotificationParams disconnectNotificationParams, final FindNetworkCallback<Void> findNetworkCallback) throws FindNetworkException {
        HmsFindSDKLog.i(TAG, "setDisconnectNotification fid: " + MaskUtil.maskSn(str) + ", mode: " + i);
        return enableDisconnectNotification(str, i != 0).addOnSuccessListener(new OnSuccessListener() { // from class: com.huawei.hms.findnetwork.FindNetworkEngine$$ExternalSyntheticLambda0
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.f$0.m1342x47be79b2(str, i, disconnectNotificationParams, findNetworkCallback, (Void) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.huawei.hms.findnetwork.FindNetworkEngine$$ExternalSyntheticLambda1
            @Override // com.huawei.hmf.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                this.f$0.m1343x1360751(str, i, disconnectNotificationParams, findNetworkCallback, exc);
            }
        });
    }

    public Task<Void> setDevicePublicKeys(Map<String, List<OfflineBroadcastParam>> map) throws FindNetworkException {
        HmsFindSDKLog.i(TAG, "setDevicePublicKeys");
        checkThirdPartySupport("findnetwork.setDevicePublicKeys");
        if (CollectionUtil.isEmpty(map)) {
            HmsFindSDKLog.e(TAG, "setDevicePublicKeys: params invalid");
            return null;
        }
        SetDevicePublicKeysRequestBean setDevicePublicKeysRequestBean = new SetDevicePublicKeysRequestBean(map);
        fillRequestBase(setDevicePublicKeysRequestBean);
        return doWrite(new E(setDevicePublicKeysRequestBean));
    }

    public Task<FindNetworkResult<String>> requestSharingPublicKey(String str) throws FindNetworkException {
        verifyFid(str);
        HmsFindSDKLog.i(TAG, "requestSharingPublicKey fid: " + MaskUtil.maskSn(str));
        FidRequestBean fidRequestBean = new FidRequestBean();
        fidRequestBean.setFid(str);
        return doWrite(new RequestSharingPublicKeyApiCall(fidRequestBean));
    }

    public Task<FindNetworkResult<String>> requestSharingDevice(String str, String str2, String str3) throws FindNetworkException {
        verifyFid(str);
        HmsFindSDKLog.i(TAG, "requestSharingDevice fid: " + MaskUtil.maskSn(str));
        ShareDeviceRequestBean shareDeviceRequestBean = new ShareDeviceRequestBean();
        shareDeviceRequestBean.setFid(str);
        shareDeviceRequestBean.setPublicKey(str2);
        shareDeviceRequestBean.setSrcTranId(str3);
        return doWrite(new RequestSharingDeviceApiCall(shareDeviceRequestBean));
    }

    public Task<FindNetworkResult<String>> requestBindDevice(String str, String str2, String str3) throws FindNetworkException {
        verifyFid(str);
        HmsFindSDKLog.i(TAG, "requestBindDevice fid: " + MaskUtil.maskSn(str));
        BindDeviceRequestBean bindDeviceRequestBean = new BindDeviceRequestBean();
        bindDeviceRequestBean.setFid(str);
        bindDeviceRequestBean.setSecondaryPublicKey(str2);
        bindDeviceRequestBean.setSrcTranId(str3);
        return doWrite(new RequestBindDeviceApiCall(bindDeviceRequestBean));
    }

    public Task<FindNetworkResult<RegisterStatusBean>> registerDevice(RegisterDetailsBean registerDetailsBean) throws FindNetworkException {
        HmsFindSDKLog.i(TAG, "registerDevice");
        checkThirdPartySupport("findnetwork.registerDevice");
        return doWrite(new RegisterDeviceApiCall(registerDetailsBean));
    }

    public Task<FindNetworkResult<TagDerivedKey>> queryTagDerivedKey(String str, int i) throws FindNetworkException {
        verifyFid(str);
        HmsFindSDKLog.i(TAG, "queryTagDerivedKey fid: " + MaskUtil.maskSn(str) + ", days: " + i);
        checkThirdPartySupport("findnetwork.query_tag_derived_Key");
        QueryTagDerivedKeyBean queryTagDerivedKeyBean = new QueryTagDerivedKeyBean();
        fillRequestBase(queryTagDerivedKeyBean);
        queryTagDerivedKeyBean.setDays(i);
        queryTagDerivedKeyBean.setConnectTagSn(str);
        return doWrite(new QueryTagDerivedKeyApiCall(queryTagDerivedKeyBean));
    }

    public Task<FindNetworkResult<List<RegisterStatusBean>>> queryRegisterStatus(List<String> list) throws FindNetworkException {
        HmsFindSDKLog.i(TAG, "queryRegisterStatus");
        checkThirdPartySupport("findnetwork.queryRegisterStatus");
        DeviceIdListBean deviceIdListBean = new DeviceIdListBean();
        deviceIdListBean.setDeviceIdList(list);
        return doWrite(new QueryRegisterStatusApiCall(deviceIdListBean));
    }

    public Task<FindNetworkResult<List<PairedDeviceInfo>>> queryPairedDevices() throws FindNetworkException {
        HmsFindSDKLog.i(TAG, "queryPairedDevices");
        checkThirdPartySupport("findnetwork.queryPairedDevices");
        BaseRequestBean baseRequestBean = new BaseRequestBean();
        fillRequestBase(baseRequestBean);
        return doWrite(new QueryPairedDevicesApiCall(baseRequestBean));
    }

    public Task<FindNetworkResult<List<LocationRecordBean>>> queryLocationRecord(long j, long j2, int i) throws FindNetworkException {
        HmsFindSDKLog.i(TAG, "queryLocationRecord startTime: " + j + ", endTime: " + j2 + ", locationSourceType: " + i);
        checkThirdPartySupport("findnetwork.queryLocationRecord");
        PassiveLocationRequestBean passiveLocationRequestBean = new PassiveLocationRequestBean();
        passiveLocationRequestBean.setStartTime(j);
        passiveLocationRequestBean.setEndTime(j2);
        passiveLocationRequestBean.setLocationSourceType(i);
        fillRequestBase(passiveLocationRequestBean);
        return doWrite(new QueryLocationRecordApiCall(passiveLocationRequestBean));
    }

    public Task<FindNetworkStatusResult> queryFindNetworkStatus() throws FindNetworkException {
        HmsFindSDKLog.i(TAG, "queryFindNetworkStatus");
        checkThirdPartySupport("findnetwork.queryFindNetworkStatus");
        BaseRequestBean baseRequestBean = new BaseRequestBean();
        fillRequestBase(baseRequestBean);
        return doWrite(new C0447x(baseRequestBean));
    }

    public Task<FindNetworkResult<DisConnectLocation>> queryDisconnectLocation(String str, FindNetworkCallback<DisConnectLocation> findNetworkCallback) throws FindNetworkException {
        verifyFid(str);
        HmsFindSDKLog.i(TAG, "queryDisconnectLocation fid: " + MaskUtil.maskSn(str));
        checkThirdPartySupport("findnetwork.queryDisconnectLocation");
        SnRequestBean snRequestBean = new SnRequestBean();
        snRequestBean.setConnectTagSn(str);
        fillRequestBase(snRequestBean);
        return doWrite(new QueryDisconnectLocationApiCall(snRequestBean, findNetworkCallback));
    }

    public Task<FindNetworkResult<TagDerivedKey>> queryDevicePublicKey(String str, long j, long j2) throws FindNetworkException {
        verifyFid(str);
        HmsFindSDKLog.i(TAG, "queryDevicePublicKey fid: " + MaskUtil.maskSn(str) + ", beginTime: " + j + ", endTime: " + j2);
        checkThirdPartySupport("findnetwork.queryDevicePublicKey");
        QueryTagDerivedRequestBean queryTagDerivedRequestBean = new QueryTagDerivedRequestBean();
        queryTagDerivedRequestBean.setConnectTagSn(str);
        queryTagDerivedRequestBean.setBeginTime(j);
        queryTagDerivedRequestBean.setEndTime(j2);
        fillRequestBase(queryTagDerivedRequestBean);
        return doWrite(new com.huawei.hms.findnetwork.request.a(queryTagDerivedRequestBean));
    }

    public Task<FindNetworkResult<List<MultiTerminalDeviceInfo>>> queryDeviceListByAccount(String str) throws FindNetworkException {
        HmsFindSDKLog.i(TAG, "queryDeviceListByAccount fid: " + MaskUtil.maskSn(str));
        checkThirdPartySupport("findnetwork.multiTerminalDeviceInfo");
        verifyFid(str);
        SnRequestBean snRequestBean = new SnRequestBean();
        snRequestBean.setConnectTagSn(str);
        fillRequestBase(snRequestBean);
        return doWrite(new MultiTerminalDeviceInfoApiCall(snRequestBean));
    }

    public Task<FindNetworkResult<DeviceDetail>> queryDeviceDetail(String str) throws FindNetworkException {
        verifyFid(str);
        HmsFindSDKLog.i(TAG, "queryDeviceDetail fid: " + MaskUtil.maskSn(str));
        checkThirdPartySupport("findnetwork.queryDeviceDetail");
        SnRequestBean snRequestBean = new SnRequestBean();
        fillRequestBase(snRequestBean);
        snRequestBean.setConnectTagSn(str);
        return doWrite(new QueryDeviceDetailApiCall(snRequestBean));
    }

    public Task<FindNetworkResult<String>> processPairResponseMsg(String str, String str2) {
        HmsFindSDKLog.i(TAG, "processPairResponseMsg");
        PairResponseBean pairResponseBean = new PairResponseBean();
        pairResponseBean.setMsg(str2);
        pairResponseBean.setSrcTranId(str);
        return doWrite(new ProcessPairResponseApiCall(pairResponseBean));
    }

    public Task<FindNetworkResult<PhoneResponseMessage>> processPairRequestMsg(String str, String str2, String str3) {
        HmsFindSDKLog.i(TAG, "processPairRequestMsg");
        PairRequestBean pairRequestBean = new PairRequestBean();
        pairRequestBean.setMsg(str2);
        pairRequestBean.setVersion(str3);
        pairRequestBean.setSrcTranId(str);
        return doWrite(new ProcessPairRequestApiCall(pairRequestBean));
    }

    public Task<FindNetworkResult<String>> initPairSession(String str) {
        HmsFindSDKLog.i(TAG, "initPairSession: " + str);
        return doWrite(new InitPairSessionApiCall(new BaseRequestBean()));
    }

    public Task<FindNetworkResult> grabDeviceLog(String str, GrabTagLogListener grabTagLogListener) throws FindNetworkException {
        verifyFid(str);
        HmsFindSDKLog.i(TAG, "grabDeviceLog fid: " + MaskUtil.maskSn(str));
        checkThirdPartySupport("findnetwork.grab_tag_log");
        SnRequestBean snRequestBean = new SnRequestBean();
        snRequestBean.setConnectTagSn(str);
        fillRequestBase(snRequestBean);
        return doWrite(new C0439q(snRequestBean, grabTagLogListener));
    }

    public Task<FindNetworkResult> getTrustTags() throws FindNetworkException {
        HmsFindSDKLog.i(TAG, "getTrustTags");
        checkThirdPartySupport("findnetwork.getTrustTag");
        BaseRequestBean baseRequestBean = new BaseRequestBean();
        fillRequestBase(baseRequestBean);
        return doWrite(new C0438p(baseRequestBean));
    }

    public Task<FindNetworkResult> getSuspectStalkingTags() throws FindNetworkException {
        HmsFindSDKLog.i(TAG, "getSuspectStalkingTags");
        checkThirdPartySupport("findnetwork.getSuspectStalkingTag");
        BaseRequestBean baseRequestBean = new BaseRequestBean();
        fillRequestBase(baseRequestBean);
        return doWrite(new C0437o(baseRequestBean));
    }

    public Task<Void> getDeviceFid(String str, FindNetworkCallback<AccessoryDetectResult> findNetworkCallback) throws FindNetworkException {
        HmsFindSDKLog.i(TAG, "getDeviceFid macAddress: " + MaskUtil.maskMac(str));
        verifyMac(str);
        return doWrite(new C0436n(new GetFidRequestBean(str), findNetworkCallback));
    }

    @Override // com.huawei.hms.common.HuaweiApi
    public int getApiLevel() {
        return this.mApiLevel;
    }

    public Task<FindNetworkResult> getAntiStalkingRecords(String str) throws FindNetworkException {
        verifyMac(str);
        HmsFindSDKLog.i(TAG, "getAntiStalkingRecords macAddress: " + MaskUtil.maskMac(str));
        checkThirdPartySupport("findnetwork.getAntiStalkingRecord");
        GetAntiStalkingRecordRequestBean getAntiStalkingRecordRequestBean = new GetAntiStalkingRecordRequestBean();
        fillRequestBase(getAntiStalkingRecordRequestBean);
        getAntiStalkingRecordRequestBean.setMacAddress(str);
        return doWrite(new C0435m(getAntiStalkingRecordRequestBean));
    }

    public void fillRequestBase(BaseRequestBean baseRequestBean) {
        baseRequestBean.setUid(this.mUid);
        baseRequestBean.setAppId(this.appId);
        baseRequestBean.setPkgName(this.packageName);
        baseRequestBean.setRegion(this.region);
    }

    public Task<Void> enableReFoundNotification(String str, boolean z) throws FindNetworkException {
        HmsFindSDKLog.i(TAG, "enableReFoundNotification fid: " + MaskUtil.maskSn(str) + ", status: " + z);
        checkThirdPartySupport("findnetwork.wear_enableFoundNotification");
        verifyFid(str);
        LostFindNotifyBean lostFindNotifyBean = new LostFindNotifyBean();
        fillRequestBase(lostFindNotifyBean);
        lostFindNotifyBean.setStatus(z);
        lostFindNotifyBean.setConnectTagSn(str);
        return doWrite(new C0441t(lostFindNotifyBean));
    }

    public Task<FindNetworkResult> enableFindNetwork(boolean z) throws FindNetworkException {
        HmsFindSDKLog.i(TAG, "enableFindNetwork status: " + z);
        checkThirdPartySupport("findnetwork.enable");
        return z ? enable() : disable();
    }

    public Task<Void> enableDisconnectNotification(String str, boolean z) throws FindNetworkException {
        verifyFid(str);
        HmsFindSDKLog.i(TAG, "enableDisconnectNotification fid: " + MaskUtil.maskSn(str) + ", status: " + z);
        checkThirdPartySupport("findnetwork.enableDisconnectNotification");
        DisconnectNotifyStatusBean disconnectNotifyStatusBean = new DisconnectNotifyStatusBean();
        disconnectNotifyStatusBean.setConnectTagSn(str);
        disconnectNotifyStatusBean.setStatus(z);
        fillRequestBase(disconnectNotifyStatusBean);
        return doWrite(new C0431i(disconnectNotifyStatusBean));
    }

    public Task<FindNetworkResult<String>> decryptLocationCipher(String str, String str2, String str3) throws FindNetworkException {
        HmsFindSDKLog.i(TAG, "decryptLocationCipher fid: " + MaskUtil.maskSn(str));
        if (!VerifyUtil.verifySn(str)) {
            return Tasks.fromException(new FindNetworkVerifyException(ErrorCode.CODE_SN_INVALID));
        }
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return Tasks.fromException(new FindNetworkVerifyException(ErrorCode.CODE_PARAMETER_INVALID));
        }
        checkThirdPartySupport("findnetwork.decrypt_location_chiper");
        DecryptLocationCipherBean decryptLocationCipherBean = new DecryptLocationCipherBean();
        fillRequestBase(decryptLocationCipherBean);
        decryptLocationCipherBean.setConnectTagSn(str);
        decryptLocationCipherBean.setPubKeyHash(str2);
        decryptLocationCipherBean.setCipherText(str3);
        return doWrite(new C0428f(decryptLocationCipherBean));
    }

    public String createTransactionId() {
        return TransactionIdCreater.getId(getAppID(), Integer.toString(this.mUid));
    }

    public Task<Void> createLongConnection(String str, FindNetworkCallback findNetworkCallback) throws FindNetworkException {
        verifyFid(str);
        HmsFindSDKLog.i(TAG, "createLongConnection fid: " + MaskUtil.maskSn(str));
        checkThirdPartySupport("findnetwork.tag_createLongConnection");
        r.a().b(str, 17);
        SnRequestBean snRequestBean = new SnRequestBean();
        fillRequestBase(snRequestBean);
        snRequestBean.setConnectTagSn(str);
        return doWrite(new C0427e(snRequestBean, findNetworkCallback));
    }

    public Task<FindNetworkResult> configFindParam(String str, String str2, long j, List<FindKeyParam> list) throws FindNetworkException {
        HmsFindSDKLog.i(TAG, "configFindParam deviceId:" + MaskUtil.maskSn(str));
        verifyFid(str);
        return doWrite(new C0426d(new FindParamRequestBean(str, str2, j, list)));
    }

    public Task<Void> checkTagStatus(String str, FindNetworkCallback<TagStatus> findNetworkCallback) throws FindNetworkException {
        verifyFid(str);
        HmsFindSDKLog.i(TAG, "checkTagStatus fid: " + MaskUtil.maskSn(str));
        checkThirdPartySupport("findnetwork.query_tag_derived_status");
        SnRequestBean snRequestBean = new SnRequestBean();
        snRequestBean.setConnectTagSn(str);
        fillRequestBase(snRequestBean);
        return doWrite(new CheckTagStatusApiCall(snRequestBean, findNetworkCallback));
    }

    public Task<Void> checkOtaVersion(String str, FindNetworkCallback<DeviceOtaTargetVersion> findNetworkCallback) throws FindNetworkException {
        verifyFid(str);
        HmsFindSDKLog.i(TAG, "checkOtaVersion fid: " + MaskUtil.maskSn(str));
        checkThirdPartySupport("findnetwork.startCheckOta");
        SnRequestBean snRequestBean = new SnRequestBean();
        fillRequestBase(snRequestBean);
        snRequestBean.setConnectTagSn(str);
        return doWrite(new StartOtaCheckApiCall(snRequestBean, findNetworkCallback));
    }

    public Task<FindNetworkResult<DeviceBindStatusResponse>> checkDeviceStatus(String str) throws FindNetworkException {
        verifyFid(str);
        HmsFindSDKLog.i(TAG, "checkDeviceStatus fid: " + MaskUtil.maskSn(str));
        FidRequestBean fidRequestBean = new FidRequestBean();
        fidRequestBean.setFid(str);
        return doWrite(new CheckDeviceStatusApiCall(fidRequestBean));
    }

    public Task<Void> calibrateDevicePeriod(String str, String str2, FindNetworkCallback<String> findNetworkCallback) throws FindNetworkException {
        HmsFindSDKLog.i(TAG, "calibrateDevicePeriod fid: " + MaskUtil.maskSn(str));
        verifyFid(str);
        verifyMac(str2);
        return doWrite(new C0425c(new DevicePeriodRequestBean(str, str2), findNetworkCallback));
    }

    private void verifyMac(String str) throws FindNetworkException {
        if (VerifyUtil.verifyMAC(str)) {
            return;
        }
        HmsFindSDKLog.e(TAG, "verifyMac format is error mac: " + MaskUtil.maskMac(str));
        throw new FindNetworkVerifyException(ErrorCode.CODE_MAC_INVALID);
    }

    private void verifyFids(List<String> list) throws FindNetworkException {
        if (CollectionUtil.isEmpty(list)) {
            HmsFindSDKLog.e(TAG, "verifyFids failed: empty fid list.");
            throw new FindNetworkVerifyException(ErrorCode.CODE_SN_INVALID);
        }
        for (String str : list) {
            if (!VerifyUtil.verifySn(str)) {
                HmsFindSDKLog.e(TAG, "verifyFids failed: " + MaskUtil.maskSn(str));
                throw new FindNetworkVerifyException(ErrorCode.CODE_SN_INVALID);
            }
        }
    }

    private void verifyFid(String str) throws FindNetworkException {
        if (VerifyUtil.verifySn(str)) {
            return;
        }
        HmsFindSDKLog.e(TAG, "verifyFid failed: " + MaskUtil.maskSn(str));
        throw new FindNetworkVerifyException(ErrorCode.CODE_SN_INVALID);
    }

    private void initParam(Context context) {
        this.packageName = AgcParseUtil.getPackageName(context);
        this.appId = AgcParseUtil.getAppId(context);
        this.isEMUI = RomUtil.isEMUI();
        try {
            this.mApiLevel = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getInt(META_API_LEVEL_KEY);
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            HmsFindSDKLog.w(TAG, "Not Found apiLevel, use default value.");
        }
        try {
            this.mUid = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).uid;
        } catch (PackageManager.NameNotFoundException | RuntimeException unused2) {
            HmsFindSDKLog.w(TAG, "get uid failed");
        }
    }

    private Task<FindNetworkResult> enable() {
        BaseRequestBean baseRequestBean = new BaseRequestBean();
        fillRequestBase(baseRequestBean);
        return doWrite(new C0433k(baseRequestBean));
    }

    /* JADX INFO: loaded from: classes33.dex */
    public static class a extends ResultTApiCall {
        @Override // com.huawei.hms.findnetwork.comm.request.ResultTApiCall
        public boolean handleBusiness(HmsClient hmsClient, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource taskCompletionSource) {
            taskCompletionSource.setResult(new FindNetworkResult(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason(), (List) JsonUtils.json2Object(str, new OfflineLocationListTypeToken().getType())));
            return true;
        }

        public a(String str, String str2, String str3) {
            super(str, str2, str3);
        }
    }

    private void doDisconnectNotifyModeCall(String str, int i, DisconnectNotificationParams disconnectNotificationParams, FindNetworkCallback<Void> findNetworkCallback) {
        if (disconnectNotificationParams == null) {
            disconnectNotificationParams = new DisconnectNotificationParams();
        }
        disconnectNotificationParams.setConnectTagSn(str);
        disconnectNotificationParams.setMode(i);
        fillRequestBase(disconnectNotificationParams);
        doWrite(new C0430h(disconnectNotificationParams, findNetworkCallback));
    }

    private Task<FindNetworkResult> disable() {
        BaseRequestBean baseRequestBean = new BaseRequestBean();
        fillRequestBase(baseRequestBean);
        return doWrite(new C0429g(baseRequestBean));
    }

    private void checkThirdPartySupport(String str) throws FindNetworkException {
        if (this.isEMUI) {
            return;
        }
        HmsFindSDKLog.e(TAG, "Unsupported function call, func:" + str);
        throw new FindNetworkUnsupportedException(ErrorCode.CODE_FUNCTION_UNSUPPORTED);
    }
}
