package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.basefitnessadvice.model.FitnessSummaryRecord;
import com.huawei.health.courseplanservice.api.RecordApi;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.manager.MassageGunConfig;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcloudmodel.model.unite.AddEvaluationResultReq;
import com.huawei.hwcloudmodel.model.unite.DelEvaluationResultReq;
import com.huawei.hwcloudmodel.model.unite.GetEvaluationResultReq;
import com.huawei.hwcloudmodel.model.unite.UserEvaluationResult;
import com.huawei.hwcloudmodel.utils.GetEvaluationResultRsp;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.adapter.SportsStatisticsCallback;
import com.huawei.operation.beans.WebViewConfig;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.Utils;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class xjw {
    public static final String e = "PluginOperationAdapterUtil";

    public static void a(long j, ICloudOperationResult<CloudCommonReponse> iCloudOperationResult) {
        lqo.b(BaseApplication.getContext()).e(new DelEvaluationResultReq(j), iCloudOperationResult);
    }

    public static void c(long j, final IBaseResponseCallback iBaseResponseCallback) {
        a(j, new ICloudOperationResult<CloudCommonReponse>() { // from class: xjw.4
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void operationResult(CloudCommonReponse cloudCommonReponse, String str, boolean z) {
                int iIntValue;
                String resultDesc;
                if (z) {
                    iBaseResponseCallback.a(0, str);
                    return;
                }
                if (cloudCommonReponse == null) {
                    iIntValue = Constants.CODE_UNKNOWN_ERROR;
                    resultDesc = "unknown error";
                } else {
                    iIntValue = cloudCommonReponse.getResultCode().intValue();
                    resultDesc = cloudCommonReponse.getResultDesc();
                }
                iBaseResponseCallback.a(iIntValue, resultDesc);
            }
        });
    }

    public static boolean b() {
        String str = e;
        LogUtil.a(str, "isBindDevice");
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, str);
        if (deviceList != null) {
            LogUtil.a(str, "isBindDevice deviceInfoList size ", Integer.valueOf(deviceList.size()));
            if (deviceList.size() > 0) {
                return true;
            }
        }
        return xju.d(HealthDevice.HealthDeviceKind.HDK_UNKNOWN);
    }

    public static String c() {
        dnj currentUser = MultiUsersManager.INSTANCE.getCurrentUser();
        String strI = MultiUsersManager.INSTANCE.getMainUser().i();
        if (!TextUtils.isEmpty(currentUser.i())) {
            return (TextUtils.isEmpty(strI) || strI.equals(currentUser.i())) ? "0" : currentUser.i();
        }
        LogUtil.a(e, "getCurrentUserUuid is null");
        MultiUsersManager.INSTANCE.setCurrentUser(MultiUsersManager.INSTANCE.getMainUser());
        return "0";
    }

    public static void a(long j, long j2, int i, IBaseResponseCallback iBaseResponseCallback) {
        String str = e;
        LogUtil.a(str, "getHealthData mStartTime = ", Long.valueOf(j), " mEndTime = ", Long.valueOf(j2));
        long j3 = j2 - j;
        double d = (j3 * 1.0d) / 8.64E7d;
        LogUtil.d(str, "dayCount = ", Double.valueOf(d));
        if (j3 < 0 || d > 3.0d) {
            iBaseResponseCallback.a(1001, null);
            return;
        }
        int[] iArr = {4, 5, 8};
        if (c(new int[]{7, 10}, i)) {
            c(xju.a(j, j2, i), i, iBaseResponseCallback);
        } else if (c(iArr, i)) {
            xju.c(xju.e(j, j2, i), i, iBaseResponseCallback);
        } else {
            iBaseResponseCallback.a(1001, null);
        }
    }

    public static void c(HiDataReadOption hiDataReadOption, final int i, final IBaseResponseCallback iBaseResponseCallback) {
        HiHealthManager.d(BaseApplication.getContext()).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: xjw.5
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i2, Object obj, int i3, int i4) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i2, int i3) {
                LogUtil.d(xjw.e, "getHealthData data = ", obj);
                if (obj == null) {
                    iBaseResponseCallback.a(0, null);
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray.size() <= 0) {
                    LogUtil.j(xjw.e, "getHealthData The return run data is empty");
                    iBaseResponseCallback.a(0, null);
                } else {
                    xju.d(i, (SparseArray<Object>) sparseArray, iBaseResponseCallback);
                }
            }
        });
    }

    public static boolean c(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static void e(String str, String str2, int i, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a(e, "getHealthStat startDay = ", str, " endDay = ", str2);
        if (!xju.a(str, str2, 10)) {
            iBaseResponseCallback.a(1001, null);
            return;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        try {
            Date date = simpleDateFormat.parse(str);
            Date date2 = simpleDateFormat.parse(str2);
            long jB = xju.b(date);
            long jE = xju.e(date2);
            if (c(new int[]{3, 9}, i)) {
                xju.c(xju.e(jB, jE, i), i, iBaseResponseCallback);
            } else {
                iBaseResponseCallback.a(1001, null);
            }
        } catch (ParseException e2) {
            LogUtil.e(e, e2.getMessage());
            iBaseResponseCallback.a(1001, null);
        }
    }

    public static void e(final String str, String str2, final String str3, final IBaseResponseCallback iBaseResponseCallback) {
        String str4 = e;
        LogUtil.a(str4, "getCourseRecommend");
        if (iBaseResponseCallback == null) {
            LogUtil.j(str4, "getCourseRecommend context or callback is null");
        } else if (ekx.c(str) == null) {
            LogUtil.a(str4, "courseRecommended is null");
            ResourceManager.c().c(new Handler(Looper.getMainLooper()), new MassageGunConfig.MassageGunCallback() { // from class: xjs
                @Override // com.huawei.health.ecologydevice.manager.MassageGunConfig.MassageGunCallback
                public final void onMassageGunCallback(String str5) {
                    xjw.a(iBaseResponseCallback, str, str3, str5);
                }
            });
        } else {
            LogUtil.a(str4, "The course recommendation information already exists");
            e(str, str3, iBaseResponseCallback);
        }
    }

    static /* synthetic */ void a(IBaseResponseCallback iBaseResponseCallback, String str, String str2, String str3) {
        boolean zA = ekx.a(str3);
        LogUtil.a(e, "handMassageGunMap result ", Boolean.valueOf(zA));
        if (!zA) {
            iBaseResponseCallback.a(Constants.CODE_UNKNOWN_ERROR, null);
        } else {
            e(str, str2, iBaseResponseCallback);
        }
    }

    public static void e(String str, String str2, IBaseResponseCallback iBaseResponseCallback) {
        String strC = ekx.c(str2, str);
        if (!TextUtils.isEmpty(strC)) {
            iBaseResponseCallback.a(0, strC);
        } else {
            iBaseResponseCallback.a(Constants.CODE_UNKNOWN_ERROR, null);
        }
    }

    public static void c(final IBaseResponseCallback iBaseResponseCallback) {
        HiHealthManager.d(BaseApplication.getContext()).fetchUserData(new HiCommonListener() { // from class: xjw.3
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                if (obj == null) {
                    iBaseResponseCallback.a(0, null);
                    return;
                }
                List list = (List) obj;
                if (list.size() <= 0) {
                    LogUtil.j(xjw.e, "getUserInfo The return run data is empty");
                    iBaseResponseCallback.a(0, null);
                    return;
                }
                int height = ((HiUserInfo) list.get(0)).getHeight();
                int unitType = ((HiUserInfo) list.get(0)).getUnitType();
                float weight = ((HiUserInfo) list.get(0)).getWeight();
                long createTime = ((HiUserInfo) list.get(0)).getCreateTime();
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("height", height);
                    jSONObject.put("unitType", unitType);
                    jSONObject.put("weight", weight);
                    jSONObject.put(ParsedFieldTag.TASK_MODIFY_TIME, createTime);
                    jSONArray.put(jSONObject);
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("data", jSONArray);
                        iBaseResponseCallback.a(0, jSONObject2);
                    } catch (JSONException e2) {
                        LogUtil.e(xjw.e, "getUserInfo dataObject JSONException! exception = ", e2.getMessage());
                        iBaseResponseCallback.a(Constants.CODE_UNKNOWN_ERROR, null);
                    }
                } catch (JSONException e3) {
                    LogUtil.e(xjw.e, "getUserInfo jsonObject JSONException! exception = ", e3.getMessage());
                    iBaseResponseCallback.a(Constants.CODE_UNKNOWN_ERROR, null);
                }
            }
        });
    }

    public static WebViewConfig d() throws Throwable {
        String str;
        try {
            if (!Utils.o()) {
                str = BaseApplication.getContext().getFilesDir().getCanonicalPath() + File.separator + "lightcloud" + File.separator + "servicefw";
            } else {
                str = BaseApplication.getContext().getFilesDir().getCanonicalPath() + File.separator + "lightcloud" + File.separator + "servicefwo";
            }
        } catch (IOException unused) {
            LogUtil.e(e, "IOException");
            str = "";
        }
        String str2 = e;
        LogUtil.a(str2, "queryWebViewConfig");
        String strQ = CommonUtil.q(str + File.separator + "WebViewConfig.txt");
        if (TextUtils.isEmpty(strQ)) {
            LogUtil.j(str2, "queryWebViewConfig str is null");
            return null;
        }
        try {
            return (WebViewConfig) HiJsonUtil.d(strQ, WebViewConfig.class);
        } catch (JsonSyntaxException e2) {
            LogUtil.e(e, "JsonSyntaxException, exception is ", e2.getMessage());
            return null;
        } catch (Exception unused2) {
            LogUtil.e(e, "queryWebViewConfig error");
            return null;
        }
    }

    public static void d(long j, final IBaseResponseCallback iBaseResponseCallback) {
        c(j, new ICloudOperationResult<GetEvaluationResultRsp>() { // from class: xjw.1
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void operationResult(GetEvaluationResultRsp getEvaluationResultRsp, String str, boolean z) {
                int iIntValue;
                String resultDesc;
                if (z) {
                    String json = new Gson().toJson(getEvaluationResultRsp);
                    try {
                        iBaseResponseCallback.a(0, Base64.encodeToString(json.getBytes("UTF-8"), 0));
                        return;
                    } catch (Exception unused) {
                        LogUtil.a(xjw.e, "Base64.encodeToString error:", json);
                        return;
                    }
                }
                if (getEvaluationResultRsp == null) {
                    iIntValue = Constants.CODE_UNKNOWN_ERROR;
                    resultDesc = "unknown error";
                } else {
                    iIntValue = getEvaluationResultRsp.getResultCode().intValue();
                    resultDesc = getEvaluationResultRsp.getResultDesc();
                }
                iBaseResponseCallback.a(iIntValue, resultDesc);
            }
        });
    }

    public static void c(long j, ICloudOperationResult<GetEvaluationResultRsp> iCloudOperationResult) {
        lqo.b(BaseApplication.getContext()).b(new GetEvaluationResultReq(j), iCloudOperationResult);
    }

    public static void b(long j, long j2, final String str, final SportsStatisticsCallback sportsStatisticsCallback) {
        RecordApi recordApi = (RecordApi) Services.d("CoursePlanService", RecordApi.class);
        if (recordApi == null) {
            LogUtil.j(e, "getFitnessSumData recordApi is null.");
        } else {
            recordApi.acquireSummaryFitnessRecord(j, j2, new IBaseResponseCallback() { // from class: xjw.2
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a(xjw.e, "onResponse errorCode", Integer.valueOf(i));
                    if (obj == null) {
                        LogUtil.j(xjw.e, "get fitness data is null");
                        return;
                    }
                    FitnessSummaryRecord fitnessSummaryRecord = obj instanceof FitnessSummaryRecord ? (FitnessSummaryRecord) obj : null;
                    if (fitnessSummaryRecord != null && fitnessSummaryRecord.acquireRecordsCount() > 0) {
                        LogUtil.a(xjw.e, "record.acquireRecordsCount() :", Long.valueOf(fitnessSummaryRecord.acquireRecordsCount()));
                        sportsStatisticsCallback.callSportSumDataJsFunction(i, fitnessSummaryRecord, str);
                    } else {
                        LogUtil.a(xjw.e, "record is null or count = 0");
                        sportsStatisticsCallback.callSportSumDataJsFunction(i, "", str);
                    }
                }
            });
        }
    }

    public static void b(long j, String str, final IBaseResponseCallback iBaseResponseCallback) {
        b(j, str, new ICloudOperationResult<CloudCommonReponse>() { // from class: xjw.10
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void operationResult(CloudCommonReponse cloudCommonReponse, String str2, boolean z) {
                int iIntValue;
                String resultDesc;
                if (z) {
                    iBaseResponseCallback.a(0, str2);
                    return;
                }
                if (cloudCommonReponse == null) {
                    iIntValue = Constants.CODE_UNKNOWN_ERROR;
                    resultDesc = "unknown error";
                } else {
                    iIntValue = cloudCommonReponse.getResultCode().intValue();
                    resultDesc = cloudCommonReponse.getResultDesc();
                }
                iBaseResponseCallback.a(iIntValue, resultDesc);
            }
        });
    }

    public static void b(long j, String str, ICloudOperationResult<CloudCommonReponse> iCloudOperationResult) {
        UserEvaluationResult userEvaluationResult = new UserEvaluationResult(j, str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(userEvaluationResult);
        lqo.b(BaseApplication.getContext()).b(new AddEvaluationResultReq(arrayList), iCloudOperationResult);
    }

    public static void b(String str, String str2, IBaseResponseCallback iBaseResponseCallback) {
        JSONObject jSONObject = new JSONObject();
        int i = 0;
        try {
            JSONObject jSONObject2 = new JSONObject(str2);
            i = jSONObject2.getInt("type");
            jSONObject = jSONObject2.getJSONObject("value");
        } catch (JSONException e2) {
            LogUtil.e(e, "saveMeasureData fail exception = ", e2.getMessage());
        }
        etn.k(str);
        HealthDevice healthDeviceB = drw.e().b(str);
        if (healthDeviceB != null) {
            enw enwVar = new enw(i);
            enwVar.c(iBaseResponseCallback);
            if (i == 2104) {
                emp empVar = new emp();
                e(jSONObject, empVar);
                enwVar.onDataChanged(healthDeviceB, empVar);
            }
            if (i == 2103) {
                emt emtVar = new emt();
                a(jSONObject, emtVar);
                enwVar.onDataChanged(healthDeviceB, emtVar);
            }
        }
    }

    private static void e(JSONObject jSONObject, emp empVar) {
        double d;
        try {
            d = jSONObject.getDouble(BleConstants.TEMPERATURE);
        } catch (JSONException e2) {
            LogUtil.e(e, "saveBodyTempData fail exception = ", e2.getMessage());
            d = 0.0d;
        }
        empVar.setStartTime(System.currentTimeMillis());
        empVar.setEndTime(System.currentTimeMillis());
        empVar.b((float) d);
    }

    private static void a(JSONObject jSONObject, emt emtVar) {
        double d;
        try {
            d = jSONObject.getDouble(BleConstants.BLOOD_OXYGEN);
        } catch (JSONException e2) {
            LogUtil.e(e, "saveBloodOxygenData fail exception = ", e2.getMessage());
            d = 0.0d;
        }
        emtVar.setStartTime(System.currentTimeMillis());
        emtVar.setEndTime(System.currentTimeMillis());
        emtVar.b((int) d);
    }
}
