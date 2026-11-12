package com.huawei.featureuserprofile.healthrecord.js;

import android.content.Intent;
import android.text.TextUtils;
import com.huawei.featureuserprofile.healthrecord.HealthRecordAlarmReceiver;
import com.huawei.featureuserprofile.healthrecord.hicloud.HiCloudCbk;
import com.huawei.featureuserprofile.healthrecord.js.HealthRecordsJsApi;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.service.anotation.H5ProMethod;
import com.huawei.health.h5pro.service.anotation.H5ProService;
import com.huawei.health.userprofilemgr.model.HealthRecordCbk;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcloudmodel.healthdatacloud.model.AddHealthDataReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.BindDeviceReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.DeleteHealthDataReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetHealthDataByReversedOrderReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetHealthDataByReversedOrderRsp;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcloudmodel.model.samplepoint.SamplePoint;
import com.huawei.hwcloudmodel.model.unite.DataDeleteCondition;
import com.huawei.hwcloudmodel.model.unite.HealthDetail;
import com.huawei.hwcloudmodel.model.userprofile.BindDeviceRsp;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.HealthAccessTokenUtil;
import com.huawei.openalliance.ad.constant.ParamConstants;
import defpackage.btx;
import defpackage.cvn;
import defpackage.cvp;
import defpackage.cvq;
import defpackage.cvu;
import defpackage.ioe;
import defpackage.lif;
import defpackage.lih;
import defpackage.lon;
import defpackage.lqo;
import health.compact.a.KeyValDbManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@H5ProService(name = HealthRecordsJsApi.TAG, users = {"9ea3f06fe2dea3e2c7c21ea1ba1e07c370a786c68417a4a96cb986576883e10f"})
public class HealthRecordsJsApi {
    private static final String KEY_DEVICE_CODE = "key_device_code";
    private static final String QUERY_TIME = "query_time";
    private static final int QUERY_TIME_DEFAULT = 10;
    private static final String RELEASE_TAG = "R_HealthRecordsJsApi";
    private static final String TAG = "HealthRecordsJsApi";
    private static final int TYPE_ID = 800001;
    private static cvu hiCloudUtil = cvu.b(BaseApplication.b());

    @H5ProMethod(name = "setReminder")
    public static void setReminder(cvp cvpVar, HealthRecordCbk<String> healthRecordCbk) {
        if (cvpVar == null || cvpVar.b() == 0) {
            healthRecordCbk.onFailure(-1, "healthReport is null");
            ReleaseLogUtil.e(RELEASE_TAG, "setHealthRecordRemind recordContent is null, return");
            return;
        }
        Intent intent = new Intent(btx.c(), (Class<?>) HealthRecordAlarmReceiver.class);
        if (cvpVar.f() != 0) {
            cvn.e(intent, cvpVar, healthRecordCbk);
        } else {
            cvn.b(cvpVar.b(), intent, healthRecordCbk);
        }
    }

    @H5ProMethod(name = "uploadFile")
    public static void uploadFile(final String str, String str2, final HealthRecordCbk<String> healthRecordCbk) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: cvx
            @Override // java.lang.Runnable
            public final void run() {
                HealthRecordsJsApi.hiCloudUtil.a(str, new HiCloudCbk<String>() { // from class: com.huawei.featureuserprofile.healthrecord.js.HealthRecordsJsApi.4
                    @Override // com.huawei.featureuserprofile.healthrecord.hicloud.HiCloudCbk
                    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(String str3) {
                        healthRecordCbk.onSuccess(str3);
                    }

                    @Override // com.huawei.featureuserprofile.healthrecord.hicloud.HiCloudCbk
                    public void onFailure(int i, String str3) {
                        ReleaseLogUtil.a(HealthRecordsJsApi.RELEASE_TAG, "uploadFile fail");
                        HealthRecordsJsApi.dealError(i, str3, healthRecordCbk);
                    }
                });
            }
        });
    }

    @H5ProMethod(name = "getFileThumnail")
    public static void getFileThumnail(final String str, final HealthRecordCbk<String> healthRecordCbk) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: cvy
            @Override // java.lang.Runnable
            public final void run() {
                HealthRecordsJsApi.hiCloudUtil.d(str, new HiCloudCbk<String>() { // from class: com.huawei.featureuserprofile.healthrecord.js.HealthRecordsJsApi.5
                    @Override // com.huawei.featureuserprofile.healthrecord.hicloud.HiCloudCbk
                    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(String str2) {
                        healthRecordCbk.onSuccess(str2);
                    }

                    @Override // com.huawei.featureuserprofile.healthrecord.hicloud.HiCloudCbk
                    public void onFailure(int i, String str2) {
                        ReleaseLogUtil.a(HealthRecordsJsApi.RELEASE_TAG, "getFileThumnail fail:", Integer.valueOf(i));
                        HealthRecordsJsApi.dealError(i, str2, healthRecordCbk);
                    }
                });
            }
        });
    }

    @H5ProMethod(name = "getFile")
    public static void getFile(final String str, final HealthRecordCbk<String> healthRecordCbk) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: cwb
            @Override // java.lang.Runnable
            public final void run() {
                HealthRecordsJsApi.hiCloudUtil.b(str, new HiCloudCbk<String>() { // from class: com.huawei.featureuserprofile.healthrecord.js.HealthRecordsJsApi.1
                    @Override // com.huawei.featureuserprofile.healthrecord.hicloud.HiCloudCbk
                    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(String str2) {
                        healthRecordCbk.onSuccess(str2);
                    }

                    @Override // com.huawei.featureuserprofile.healthrecord.hicloud.HiCloudCbk
                    public void onFailure(int i, String str2) {
                        ReleaseLogUtil.a(HealthRecordsJsApi.RELEASE_TAG, "getFile fail:", Integer.valueOf(i));
                        HealthRecordsJsApi.dealError(i, str2, healthRecordCbk);
                    }
                });
            }
        });
    }

    @H5ProMethod(name = "deleteFile")
    public static void deleteFile(final String str, final HealthRecordCbk<Boolean> healthRecordCbk) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: cvt
            @Override // java.lang.Runnable
            public final void run() {
                HealthRecordsJsApi.hiCloudUtil.e(str, new HiCloudCbk<Boolean>() { // from class: com.huawei.featureuserprofile.healthrecord.js.HealthRecordsJsApi.3
                    @Override // com.huawei.featureuserprofile.healthrecord.hicloud.HiCloudCbk
                    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(Boolean bool) {
                        healthRecordCbk.onSuccess(bool);
                    }

                    @Override // com.huawei.featureuserprofile.healthrecord.hicloud.HiCloudCbk
                    public void onFailure(int i, String str2) {
                        ReleaseLogUtil.a(HealthRecordsJsApi.RELEASE_TAG, "deleteFile fail:", Integer.valueOf(i));
                        HealthRecordsJsApi.dealError(i, str2, healthRecordCbk);
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void dealError(int i, String str, HealthRecordCbk healthRecordCbk) {
        if (i == 22044011 || i == 21084036) {
            HealthAccessTokenUtil.getAtInstance().refreshAccessToken();
        }
        healthRecordCbk.onFailure(i, str);
    }

    @H5ProMethod(name = "deleteRecords")
    public static void deleteRecords(final List<String> list, final List<String> list2, final List<String> list3, final HealthRecordCbk<Boolean> healthRecordCbk) {
        if (list.size() != list2.size() || list.size() != list3.size()) {
            healthRecordCbk.onFailure(0, "size is not right");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: cvs
                @Override // java.lang.Runnable
                public final void run() {
                    HealthRecordsJsApi.lambda$deleteRecords$4(list, list2, list3, healthRecordCbk);
                }
            });
        }
    }

    public static /* synthetic */ void lambda$deleteRecords$4(List list, List list2, List list3, HealthRecordCbk healthRecordCbk) {
        LogUtil.a(TAG, "enter deleteRecords");
        ArrayList arrayList = new ArrayList(1);
        for (int i = 0; i < list.size(); i++) {
            try {
                DataDeleteCondition dataDeleteCondition = new DataDeleteCondition();
                dataDeleteCondition.setStartTime(Long.valueOf(Long.parseLong((String) list.get(i))));
                dataDeleteCondition.setEndTime(Long.valueOf(Long.parseLong((String) list2.get(i))));
                dataDeleteCondition.setType(Integer.valueOf(TYPE_ID));
                dataDeleteCondition.setDeviceCode(Long.valueOf(getDeviceCode((String) list3.get(i))));
                arrayList.add(dataDeleteCondition);
            } catch (NumberFormatException unused) {
                healthRecordCbk.onFailure(0, "NumberFormatException fail");
                LogUtil.e(TAG, "deleteRecords number parse error");
                return;
            }
        }
        DeleteHealthDataReq deleteHealthDataReq = new DeleteHealthDataReq();
        deleteHealthDataReq.setDelHealthDataConditons(arrayList);
        if (dealWithRsp(lqo.b(BaseApplication.b()).d(deleteHealthDataReq))) {
            healthRecordCbk.onSuccess(true);
        } else {
            healthRecordCbk.onFailure(0, ParamConstants.CallbackMethod.ON_FAIL);
        }
    }

    @H5ProMethod(name = "queryRecords")
    public static void queryRecords(final int i, final int i2, final HealthRecordCbk<List<ioe>> healthRecordCbk) {
        LogUtil.a(TAG, "enter queryRecords");
        ThreadPoolManager.c().execute(new Runnable() { // from class: cvv
            @Override // java.lang.Runnable
            public final void run() {
                HealthRecordsJsApi.queryRecords(new ArrayList(), i, i2, new HealthRecordCbk<List<ioe>>() { // from class: com.huawei.featureuserprofile.healthrecord.js.HealthRecordsJsApi.2
                    @Override // com.huawei.health.userprofilemgr.model.HealthRecordCbk
                    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(List<ioe> list) {
                        LogUtil.a(HealthRecordsJsApi.TAG, "queryRecords onSuccess");
                        healthRecordCbk.onSuccess(list);
                    }

                    @Override // com.huawei.health.userprofilemgr.model.HealthRecordCbk
                    public void onFailure(int i3, String str) {
                        LogUtil.j(HealthRecordsJsApi.TAG, "queryRecords onFailure");
                        healthRecordCbk.onFailure(i3, str);
                    }
                }, 0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void queryRecords(List<ioe> list, int i, int i2, HealthRecordCbk<List<ioe>> healthRecordCbk, int i3) {
        ReleaseLogUtil.d(RELEASE_TAG, "queryRecords, startTime:", Integer.valueOf(i), "endTime:", Integer.valueOf(i2), "time:", Integer.valueOf(i3));
        GetHealthDataByReversedOrderReq getHealthDataByReversedOrderReq = new GetHealthDataByReversedOrderReq();
        getHealthDataByReversedOrderReq.setRecordDay(i2);
        getHealthDataByReversedOrderReq.setType(TYPE_ID);
        getHealthDataByReversedOrderReq.setDataType(2);
        GetHealthDataByReversedOrderRsp getHealthDataByReversedOrderRspC = lqo.b(BaseApplication.b()).c(getHealthDataByReversedOrderReq);
        if (dealWithRsp(getHealthDataByReversedOrderRspC)) {
            Map<String, List<HealthDetail>> detailInfos = getHealthDataByReversedOrderRspC.getDetailInfos();
            if (detailInfos != null) {
                addRecords(list, detailInfos);
                if (getHealthDataByReversedOrderRspC.getCurrentRecordDay() > i && i3 < getQueryTime()) {
                    queryRecords(list, i, getHealthDataByReversedOrderRspC.getCurrentRecordDay(), healthRecordCbk, i3 + 1);
                    return;
                } else {
                    healthRecordCbk.onSuccess(list);
                    return;
                }
            }
            healthRecordCbk.onSuccess(list);
            return;
        }
        LogUtil.a(TAG, "queryRecords fail");
        healthRecordCbk.onFailure(0, ParamConstants.CallbackMethod.ON_FAIL);
    }

    private static List<ioe> addRecords(List<ioe> list, Map<String, List<HealthDetail>> map) {
        List<HealthDetail> next;
        Iterator<List<HealthDetail>> it = map.values().iterator();
        loop0: while (it.hasNext() && (next = it.next()) != null) {
            for (HealthDetail healthDetail : next) {
                if (healthDetail.getSamplePoints() == null) {
                    break loop0;
                }
                for (SamplePoint samplePoint : healthDetail.getSamplePoints()) {
                    ioe ioeVar = (ioe) HiJsonUtil.d(samplePoint.getValue(), ioe.class);
                    cvq cvqVar = (cvq) HiJsonUtil.d(samplePoint.getFieldsMetadata(), cvq.class);
                    if (cvqVar == null && healthDetail.getMetadata() != null) {
                        cvqVar = (cvq) HiJsonUtil.d(healthDetail.getMetadata(), cvq.class);
                    }
                    if (cvqVar == null || ioeVar == null) {
                        LogUtil.j(TAG, "addRecords metaData == null || value == null");
                    } else {
                        ioe ioeVar2 = new ioe();
                        ioeVar2.d(ioeVar.o());
                        ioeVar2.a(ioeVar.i());
                        ioeVar2.e(ioeVar.g());
                        ioeVar2.b(ioeVar.h());
                        ioeVar2.d(ioeVar.d());
                        ioeVar2.h(cvqVar.j());
                        ioeVar2.d(cvqVar.c());
                        ioeVar2.e(cvqVar.a());
                        ioeVar2.i(cvqVar.b());
                        ioeVar2.c(cvqVar.d());
                        ioeVar2.e(samplePoint.getStartTime().longValue());
                        ioeVar2.b(cvqVar.e());
                        ioeVar2.a(String.valueOf(healthDetail.getDeviceCode()));
                        LogUtil.a(TAG, "addRecords extendData：", cvqVar.e(), " deviceCode: ", healthDetail.getDeviceCode());
                        list.add(ioeVar2);
                    }
                }
            }
        }
        return list;
    }

    @H5ProMethod(name = "uploadRecords")
    public static void uploadRecords(final ioe ioeVar, final HealthRecordCbk<Boolean> healthRecordCbk) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: cvz
            @Override // java.lang.Runnable
            public final void run() {
                HealthRecordsJsApi.lambda$uploadRecords$6(ioeVar, healthRecordCbk);
            }
        });
    }

    public static /* synthetic */ void lambda$uploadRecords$6(ioe ioeVar, HealthRecordCbk healthRecordCbk) {
        long jN;
        LogUtil.a(TAG, "enter uploadRecords");
        if (ioeVar.n() == 0) {
            jN = ioeVar.i() == 0 ? System.currentTimeMillis() : ioeVar.i();
        } else {
            jN = ioeVar.n();
        }
        SamplePoint samplePoint = new SamplePoint();
        samplePoint.setStartTime(Long.valueOf(jN));
        samplePoint.setEndTime(Long.valueOf(jN));
        samplePoint.setKey("HEALTH_EXAMINATION_RECORD");
        ioe ioeVar2 = new ioe();
        ioeVar2.b(ioeVar.h());
        ioeVar2.e(ioeVar.g());
        ioeVar2.d(ioeVar.d());
        ioeVar2.a(ioeVar.i());
        ioeVar2.d(ioeVar.o());
        samplePoint.setValue(HiJsonUtil.e(ioeVar2, ioe.class));
        cvq cvqVar = new cvq();
        cvqVar.b(ioeVar.e());
        cvqVar.a(ioeVar.j());
        cvqVar.d(ioeVar.b());
        cvqVar.c(ioeVar.f());
        cvqVar.f(ioeVar.k());
        cvqVar.e(ioeVar.a());
        LogUtil.a(TAG, "uploadRecords setExtendData：", ioeVar.a());
        samplePoint.setFieldsMetadata(HiJsonUtil.e(cvqVar, cvq.class));
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(samplePoint);
        HealthDetail healthDetail = new HealthDetail();
        healthDetail.setStartTime(Long.valueOf(jN));
        healthDetail.setEndTime(Long.valueOf(jN));
        healthDetail.setType(Integer.valueOf(TYPE_ID));
        healthDetail.setTimeZone(getTimeZone());
        healthDetail.setDeviceCode(Long.valueOf(getDeviceCode(ioeVar.c())));
        healthDetail.setSamplePoints(arrayList);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add(healthDetail);
        AddHealthDataReq addHealthDataReq = new AddHealthDataReq();
        addHealthDataReq.setDetailInfo(arrayList2);
        if (dealWithRsp(lqo.b(BaseApplication.b()).b(addHealthDataReq))) {
            healthRecordCbk.onSuccess(true);
        } else {
            healthRecordCbk.onFailure(0, ParamConstants.CallbackMethod.ON_FAIL);
        }
    }

    private static int getQueryTime() {
        try {
            return Integer.parseInt(lon.c().d(QUERY_TIME));
        } catch (NumberFormatException unused) {
            LogUtil.e(TAG, "getQueryTime NumberFormatException");
            return 10;
        }
    }

    private static long getDeviceCode(String str) {
        if (!TextUtils.isEmpty(str)) {
            LogUtil.a(TAG, "getDeviceCode recordDeviceCode: ", str);
        } else {
            str = KeyValDbManager.d(BaseApplication.b()).c(KEY_DEVICE_CODE);
        }
        if (!TextUtils.isEmpty(str)) {
            return Long.parseLong(str);
        }
        BindDeviceReq bindDeviceReq = new BindDeviceReq();
        bindDeviceReq.setProductId(1);
        bindDeviceReq.setUniqueId("-1");
        bindDeviceReq.setAppName(BaseApplication.d());
        BindDeviceRsp bindDeviceRspB = lqo.b(BaseApplication.b()).b(bindDeviceReq);
        if (!dealWithRsp(bindDeviceRspB)) {
            return 0L;
        }
        KeyValDbManager.d(BaseApplication.b()).b(KEY_DEVICE_CODE, bindDeviceRspB.getDeviceCode().toString());
        return bindDeviceRspB.getDeviceCode().longValue();
    }

    private static String getTimeZone() {
        return new SimpleDateFormat("Z").format(Calendar.getInstance().getTime());
    }

    private static boolean dealWithRsp(CloudCommonReponse cloudCommonReponse) {
        try {
            return lih.e(cloudCommonReponse, false);
        } catch (lif e) {
            LogUtil.e(TAG, " dealWithRsp err:", ExceptionUtils.c(e));
            return false;
        }
    }
}
