package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.callback.FitnessCloudCallBack;
import com.huawei.datatype.DataDeviceInfo;
import com.huawei.datatype.DataDeviceIntelligentInfo;
import com.huawei.haf.common.utils.ScreenUtil;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.manager.powerkit.PowerKitManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.healthdatacloud.model.BindDeviceReq;
import com.huawei.hwcloudmodel.model.intelligent.DevInfo;
import com.huawei.hwcloudmodel.model.intelligent.DeviceServiceInfo;
import com.huawei.hwcloudmodel.model.intelligent.ReleaseDeviceLinkageRequest;
import com.huawei.hwcloudmodel.model.intelligent.ReleaseDeviceLinkageResponse;
import com.huawei.hwcloudmodel.model.intelligent.StartDeviceLinkageRequest;
import com.huawei.hwcloudmodel.model.intelligent.StartDeviceLinkageResponse;
import com.huawei.hwcloudmodel.model.intelligent.StopDeviceLinkageRequest;
import com.huawei.hwcloudmodel.model.intelligent.StopDeviceLinkageResponse;
import com.huawei.hwcloudmodel.model.intelligent.TransferDeviceDataRequest;
import com.huawei.hwcloudmodel.model.intelligent.TransferDeviceDataResponse;
import com.huawei.hwcloudmodel.model.userprofile.BindDeviceRsp;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import health.compact.a.CommonUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes10.dex */
public class lxe {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static lxe f41011b;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ExecutorService f41012a = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final lqo f41013c;
    private mhs e;

    private lxe(Context context) {
        LogUtil.a("UIDV_FitnessCloud", "RecommendCloud");
        lvb.e();
        this.f41013c = lqo.b(context);
        this.e = mhs.a();
    }

    public static lxe a(Context context) {
        lxe lxeVar;
        LogUtil.a("UIDV_FitnessCloud", "getInstance");
        synchronized (d) {
            if (f41011b == null) {
                f41011b = new lxe(context);
            }
            lxeVar = f41011b;
        }
        return lxeVar;
    }

    public void b(final FitnessCloudCallBack fitnessCloudCallBack) {
        if (fitnessCloudCallBack == null) {
            return;
        }
        final DeviceInfo deviceInfoC = mgg.c("UIDV_FitnessCloud");
        if (deviceInfoC == null) {
            fitnessCloudCallBack.onResponce(null);
        } else {
            this.f41012a.execute(new Runnable() { // from class: lxe.4
                @Override // java.lang.Runnable
                public void run() {
                    int iK = lvi.a(deviceInfoC.getProductType()).k();
                    if (!TextUtils.isEmpty(deviceInfoC.getDeviceModel()) && deviceInfoC.getDeviceModel().toUpperCase(Locale.ENGLISH).contains("HECTOR")) {
                        iK = 112;
                    }
                    int iC = mga.c(deviceInfoC.getHiLinkDeviceId());
                    if (iC != -1) {
                        LogUtil.a("UIDV_FitnessCloud", "startDeviceLinkage getDeviceProductIdByHiLinId is ", Integer.valueOf(iC));
                        iK = iC;
                    }
                    BindDeviceReq bindDeviceReq = new BindDeviceReq();
                    bindDeviceReq.setProductId(Integer.valueOf(iK));
                    bindDeviceReq.setUniqueId(lxe.this.a(deviceInfoC));
                    bindDeviceReq.setName(deviceInfoC.getDeviceName());
                    bindDeviceReq.setMac(deviceInfoC.getDeviceIdentify());
                    bindDeviceReq.setSubProdId(deviceInfoC.getDeviceSubModelId());
                    ReleaseLogUtil.d("R_UIDV_FitnessCloud", "startDeviceLinkage BindDeviceReq name is:", bindDeviceReq.getName(), "productId is:", bindDeviceReq.getProductId(), "mac is:", CommonUtil.n(bindDeviceReq.getMac()));
                    BindDeviceRsp bindDeviceRspB = lxe.this.f41013c.b(bindDeviceReq);
                    if (bindDeviceRspB != null) {
                        lxe lxeVar = lxe.this;
                        lxeVar.e(bindDeviceRspB, lxeVar.a(deviceInfoC), fitnessCloudCallBack);
                    } else {
                        fitnessCloudCallBack.onResponce(null);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(DeviceInfo deviceInfo) {
        if (deviceInfo.getProductType() >= 34 && !Utils.o()) {
            return deviceInfo.getSecurityUuid() + "#ANDROID21";
        }
        return deviceInfo.getUuid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final BindDeviceRsp bindDeviceRsp, final String str, final FitnessCloudCallBack fitnessCloudCallBack) {
        mfe.d().a(new IBaseResponseCallback() { // from class: lxe.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i == 0) {
                    DataDeviceInfo dataDeviceInfo = obj instanceof DataDeviceInfo ? (DataDeviceInfo) obj : null;
                    if (dataDeviceInfo == null) {
                        LogUtil.j("UIDV_FitnessCloud", "dataInfo is null");
                        return;
                    }
                    final StartDeviceLinkageRequest startDeviceLinkageRequest = new StartDeviceLinkageRequest();
                    startDeviceLinkageRequest.setDeviceCode(String.valueOf(bindDeviceRsp.getDeviceCode()));
                    final DevInfo devInfo = new DevInfo();
                    devInfo.setSn(str);
                    if (lvi.f(dataDeviceInfo.getDeviceType())) {
                        devInfo.setDevType("06E");
                    } else {
                        devInfo.setDevType("06D");
                    }
                    devInfo.setModel(dataDeviceInfo.getDeviceModel());
                    mev.d().d(new IBaseResponseCallback() { // from class: lxe.1.3
                        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                        /* JADX INFO: renamed from: onResponse */
                        public void a(int i2, Object obj2) {
                            if (i2 == 0 && obj2 != null) {
                                lxe.this.c(obj2, startDeviceLinkageRequest, devInfo, fitnessCloudCallBack);
                            } else {
                                fitnessCloudCallBack.onResponce(null);
                            }
                        }
                    });
                    return;
                }
                fitnessCloudCallBack.onResponce(null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Object obj, StartDeviceLinkageRequest startDeviceLinkageRequest, DevInfo devInfo, final FitnessCloudCallBack fitnessCloudCallBack) {
        if (obj instanceof DataDeviceIntelligentInfo) {
            final DataDeviceIntelligentInfo dataDeviceIntelligentInfo = (DataDeviceIntelligentInfo) obj;
            devInfo.setManu(String.valueOf(dataDeviceIntelligentInfo.getDeviceManu()));
            devInfo.setProdId(String.valueOf(dataDeviceIntelligentInfo.getDeviceProductId()));
            devInfo.setHiv(String.valueOf(dataDeviceIntelligentInfo.getDeviceHiv()));
            startDeviceLinkageRequest.setDevInfo(devInfo);
            LogUtil.a("UIDV_FitnessCloud", "startDeviceLinkage StartDeviceLinkageRequest is:", startDeviceLinkageRequest);
            this.f41013c.e(startDeviceLinkageRequest, new ICloudOperationResult<StartDeviceLinkageResponse>() { // from class: lxe.2
                @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void operationResult(StartDeviceLinkageResponse startDeviceLinkageResponse, String str, boolean z) {
                    if (startDeviceLinkageResponse != null) {
                        startDeviceLinkageResponse.setDevice_prodId(dataDeviceIntelligentInfo.getDeviceProductId());
                        fitnessCloudCallBack.onResponce(startDeviceLinkageResponse);
                    } else {
                        fitnessCloudCallBack.onResponce(null);
                    }
                }
            });
        }
    }

    public void d(String str, String str2, String str3, final FitnessCloudCallBack fitnessCloudCallBack) {
        ReleaseLogUtil.d("R_UIDV_FitnessCloud", "transDeviceData enter.");
        if (fitnessCloudCallBack == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        if (!ScreenUtil.d()) {
            PowerKitManager.a().b("UIDV_FitnessCloud", 512, "user-transSleepData");
        }
        DeviceServiceInfo deviceServiceInfo = new DeviceServiceInfo();
        deviceServiceInfo.setSid(str);
        HashMap map = new HashMap(16);
        map.put("state", str2);
        deviceServiceInfo.setData(map);
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(deviceServiceInfo);
        TransferDeviceDataRequest transferDeviceDataRequest = new TransferDeviceDataRequest();
        transferDeviceDataRequest.setDevId(str3);
        transferDeviceDataRequest.setServices(arrayList);
        this.f41013c.b(transferDeviceDataRequest, new ICloudOperationResult<TransferDeviceDataResponse>() { // from class: lxe.5
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void operationResult(TransferDeviceDataResponse transferDeviceDataResponse, String str4, boolean z) {
                if (transferDeviceDataResponse != null) {
                    fitnessCloudCallBack.onResponce(transferDeviceDataResponse);
                    PowerKitManager.a().a("UIDV_FitnessCloud", 512, "user-transSleepData");
                }
            }
        });
    }

    public void d(final String str, final FitnessCloudCallBack fitnessCloudCallBack) {
        ReleaseLogUtil.d("R_UIDV_FitnessCloud", "releaseDeviceLinkage enter.");
        if (fitnessCloudCallBack == null) {
            return;
        }
        this.f41012a.execute(new Runnable() { // from class: lxe.3
            @Override // java.lang.Runnable
            public void run() {
                ReleaseDeviceLinkageRequest releaseDeviceLinkageRequest = new ReleaseDeviceLinkageRequest();
                releaseDeviceLinkageRequest.setDevId(str);
                lxe.this.f41013c.b(releaseDeviceLinkageRequest, new ICloudOperationResult<ReleaseDeviceLinkageResponse>() { // from class: lxe.3.3
                    @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public void operationResult(ReleaseDeviceLinkageResponse releaseDeviceLinkageResponse, String str2, boolean z) {
                        fitnessCloudCallBack.onResponce(releaseDeviceLinkageResponse);
                    }
                });
            }
        });
    }

    public void c(final FitnessCloudCallBack fitnessCloudCallBack) {
        ReleaseLogUtil.d("R_UIDV_FitnessCloud", "stopDeviceLinkage enter.");
        if (fitnessCloudCallBack == null) {
            return;
        }
        DeviceInfo deviceInfoC = mgg.c("UIDV_FitnessCloud");
        if (deviceInfoC == null) {
            fitnessCloudCallBack.onResponce(null);
        } else {
            this.e.getSwitchSetting("intelligent_home_linkage", deviceInfoC.getDeviceIdentify(), new IBaseResponseCallback() { // from class: lxe.7
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    String str;
                    if (i == 0) {
                        if (!(obj instanceof String)) {
                            str = "";
                        } else {
                            str = (String) obj;
                        }
                        if (str.contains(Constants.PARAM_SERVER_SPLIT)) {
                            String[] strArrSplit = str.split(Constants.PARAM_SERVER_SPLIT);
                            LogUtil.a("UIDV_FitnessCloud", "INTELLIGENT_HOME_LINKAGE split is:", Integer.valueOf(strArrSplit.length));
                            if (strArrSplit.length == 5) {
                                lxe.this.a(strArrSplit[0], fitnessCloudCallBack);
                                return;
                            } else {
                                fitnessCloudCallBack.onResponce(null);
                                return;
                            }
                        }
                        fitnessCloudCallBack.onResponce(null);
                        return;
                    }
                    fitnessCloudCallBack.onResponce(null);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, final FitnessCloudCallBack fitnessCloudCallBack) {
        if (fitnessCloudCallBack == null) {
            return;
        }
        StopDeviceLinkageRequest stopDeviceLinkageRequest = new StopDeviceLinkageRequest();
        stopDeviceLinkageRequest.setDevId(str);
        this.f41013c.a(stopDeviceLinkageRequest, new ICloudOperationResult<StopDeviceLinkageResponse>() { // from class: lxe.9
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void operationResult(StopDeviceLinkageResponse stopDeviceLinkageResponse, String str2, boolean z) {
                fitnessCloudCallBack.onResponce(stopDeviceLinkageResponse);
            }
        });
    }
}
