package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.health.sport.utils.FitnessDataQueryDefine;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiTimeInterval;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiMultiDataClientListener;
import com.huawei.hihealth.data.model.HiStressMetaData;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import health.compact.a.HiDateUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class uim {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f50167a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static uim f50168c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private nkb f50169b;

    private uim() {
        this.f50169b = null;
        this.f50169b = nkb.d();
    }

    public static uim c() {
        uim uimVar;
        synchronized (uim.class) {
            if (f50168c == null) {
                f50168c = new uim();
            }
            uimVar = f50168c;
        }
        return uimVar;
    }

    public void a(final CommonUiBaseResponse commonUiBaseResponse) {
        synchronized (f50167a) {
            nkb nkbVar = this.f50169b;
            if (nkbVar != null) {
                nkbVar.d(new IBaseResponseCallback() { // from class: uim.1
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i, Object obj) {
                        if (commonUiBaseResponse != null) {
                            LogUtil.a("SCUI_FitnessMgrInteractors", "requsetGetGoogleFitnessDataPonitDetailByDataType");
                            commonUiBaseResponse.onResponse(i, obj);
                        }
                    }
                });
            }
        }
    }

    public void c(final CommonUiBaseResponse commonUiBaseResponse) {
        synchronized (f50167a) {
            nkb nkbVar = this.f50169b;
            if (nkbVar != null) {
                nkbVar.b(new IBaseResponseCallback() { // from class: uim.5
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i, Object obj) {
                        if (commonUiBaseResponse != null) {
                            LogUtil.a("SCUI_FitnessMgrInteractors", "requsetGetGoogleFitnessDataPonitSegentByDataType");
                            commonUiBaseResponse.onResponse(i, obj);
                        }
                    }
                });
            }
        }
    }

    public void c(long j, final CommonUiBaseResponse commonUiBaseResponse) {
        synchronized (f50167a) {
            this.f50169b.d(new IBaseResponseCallback() { // from class: uim.10
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList();
                    if (list != null) {
                        uim.this.c((List<HiHealthClient>) list, (ArrayList<uif>) arrayList);
                    }
                    if (arrayList.size() == 1) {
                        arrayList.clear();
                        LogUtil.a("SCUI_FitnessMgrInteractors", "Step data origin is only phone.");
                    }
                    commonUiBaseResponse.onResponse(i, arrayList);
                }
            }, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<HiHealthClient> list, ArrayList<uif> arrayList) {
        for (HiHealthClient hiHealthClient : list) {
            if (hiHealthClient.getHiDeviceInfo() != null) {
                ReleaseLogUtil.d("SCUI_FitnessMgrInteractors", "handleRequestResult deviceName: ", LogAnonymous.c(hiHealthClient.getHiDeviceInfo().getDeviceName()), ", model: ", hiHealthClient.getHiDeviceInfo().getModel(), ", deviceType ", Integer.valueOf(hiHealthClient.getHiDeviceInfo().getDeviceType()));
                LogUtil.d("SCUI_FitnessMgrInteractors", "handleRequestResult deviceUniqueCode:", hiHealthClient.getHiDeviceInfo().getDeviceUniqueCode());
            }
            uif uifVar = new uif();
            if (hiHealthClient.getHiDeviceInfo() != null) {
                int deviceType = hiHealthClient.getHiDeviceInfo().getDeviceType();
                String deviceName = hiHealthClient.getHiDeviceInfo().getDeviceName();
                String prodId = hiHealthClient.getHiDeviceInfo().getProdId();
                String model = hiHealthClient.getHiDeviceInfo().getModel();
                String deviceUniqueCode = hiHealthClient.getHiDeviceInfo().getDeviceUniqueCode();
                if (deviceType == 30) {
                    deviceType = 32;
                }
                if (deviceType != 32 || (model != null && !"".equals(model))) {
                    if (deviceType == 51) {
                        deviceType = 23;
                    }
                    Iterator<uif> it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            uif next = it.next();
                            if (next.a() == deviceType && d(next.b(), deviceUniqueCode)) {
                                break;
                            }
                        } else {
                            if (uifVar.a() >= 10000) {
                                break;
                            }
                            uifVar.b(deviceType);
                            uifVar.c(prodId);
                            uifVar.b(deviceName);
                            uifVar.a(model);
                            uifVar.e(deviceUniqueCode);
                            arrayList.add(uifVar);
                            break;
                        }
                    }
                }
            }
        }
    }

    private boolean d(String str, String str2) {
        if (str.length() >= str2.length()) {
            return str.contains(str2);
        }
        return str2.contains(str);
    }

    /* JADX INFO: renamed from: uim$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f50173b;

        static {
            int[] iArr = new int[FitnessDataQueryDefine.FitnessQueryId.values().length];
            f50173b = iArr;
            try {
                iArr[FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_DAY_HISTOGRAM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50173b[FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_WEEK_HISTOGRAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50173b[FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_MONTH_HISTOGRAM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50173b[FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_YEAR_HISTOGRAM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static long b(long j, FitnessDataQueryDefine.FitnessQueryId fitnessQueryId) {
        Date date = new Date(j * 1000);
        int i = AnonymousClass2.f50173b[fitnessQueryId.ordinal()];
        if (i == 1) {
            return ltb.o(date);
        }
        if (i == 2) {
            return ltb.l(ltb.u(date));
        }
        if (i == 3) {
            return ltb.l(ltb.n(date));
        }
        if (i != 4) {
            return 1L;
        }
        return ltb.l(ltb.w(date));
    }

    public void c(long j, final FitnessDataQueryDefine.FitnessQueryId fitnessQueryId, final CommonUiBaseResponse commonUiBaseResponse) {
        LogUtil.a("SCUI_FitnessMgrInteractors", "Enter getStressDatasForDiagram!");
        synchronized (f50167a) {
            long jB = b(j, fitnessQueryId);
            LogUtil.a("SCUI_FitnessMgrInteractors", "getStressDatasForDiagram 0000 startTime = " + j + "   endTime = " + jB);
            LogUtil.a("SCUI_FitnessMgrInteractors", "getStressDatasForDiagram startTime = " + new Date(j * 1000) + "   endTime = " + new Date(1000 * jB));
            this.f50169b.b(j, jB, new IBaseResponseCallback() { // from class: uim.9
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    int i2 = -1;
                    Object obj2 = -1;
                    if (i == 0) {
                        int i3 = AnonymousClass2.f50173b[fitnessQueryId.ordinal()];
                        if (i3 == 1 || i3 == 2 || i3 == 3 || i3 == 4) {
                            LogUtil.a("SCUI_FitnessMgrInteractors", "getStressDatasForDiagram errorCode 0");
                            if (obj != null) {
                                obj2 = (List) obj;
                            }
                        } else {
                            obj2 = 1;
                        }
                        i2 = 0;
                    }
                    if (commonUiBaseResponse != null) {
                        LogUtil.a("SCUI_FitnessMgrInteractors", "getStressDatasForDiagram callbackResponse.onResponse sucess resultCode = " + i2 + " resultData = " + obj2);
                        commonUiBaseResponse.onResponse(i2, obj2);
                    }
                }
            });
        }
        LogUtil.a("SCUI_FitnessMgrInteractors", "Leave getStressDatasForDiagram!");
    }

    public void b(long j, long j2, final FitnessDataQueryDefine.FitnessQueryId fitnessQueryId, final CommonUiBaseResponse commonUiBaseResponse) {
        LogUtil.a("SCUI_FitnessMgrInteractors", "Enter requestPressureMeasureStatistic!");
        synchronized (f50167a) {
            this.f50169b.c(j, j2 - 1000, new IBaseResponseCallback() { // from class: uim.7
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    int i2 = -1;
                    Object obj2 = -1;
                    if (i == 0) {
                        int i3 = AnonymousClass2.f50173b[fitnessQueryId.ordinal()];
                        if (i3 == 1 || i3 == 2 || i3 == 3 || i3 == 4) {
                            LogUtil.a("SCUI_FitnessMgrInteractors", "requestPressureMeasureDetail errorCode 1");
                            if (obj != null) {
                                obj2 = (List) obj;
                            }
                        } else {
                            obj2 = 1;
                        }
                        i2 = 0;
                    }
                    if (commonUiBaseResponse != null) {
                        LogUtil.a("SCUI_FitnessMgrInteractors", "requestPressureMeasureStatistic callbackResponse.onResponse sucess resultCode1 = " + i2 + " resultData1 = " + obj2);
                        commonUiBaseResponse.onResponse(i2, obj2);
                    }
                }
            });
        }
    }

    public void c(String str, HiStressMetaData hiStressMetaData, final CommonUiBaseResponse commonUiBaseResponse) {
        LogUtil.a("SCUI_FitnessMgrInteractors", "Enter setStressData!");
        synchronized (f50167a) {
            this.f50169b.c(str, hiStressMetaData, new IBaseResponseCallback() { // from class: uim.8
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    CommonUiBaseResponse commonUiBaseResponse2 = commonUiBaseResponse;
                    if (commonUiBaseResponse2 != null) {
                        commonUiBaseResponse2.onResponse(i, obj);
                    }
                }
            });
        }
        LogUtil.a("SCUI_FitnessMgrInteractors", "Leave setStressData!");
    }

    public void e(long j, final CommonUiBaseResponse commonUiBaseResponse) {
        this.f50169b.d(new IBaseResponseCallback() { // from class: uim.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (!(obj instanceof List)) {
                    LogUtil.j("SCUI_FitnessMgrInteractors", "getFitnessStepDataOrigin objData is not instanceof List");
                    commonUiBaseResponse.onResponse(i, null);
                } else {
                    ArrayList arrayList = new ArrayList(10);
                    uim.this.c((List<HiHealthClient>) obj, (ArrayList<uif>) arrayList);
                    commonUiBaseResponse.onResponse(i, arrayList);
                }
            }
        }, j);
    }

    public void a(List<Integer> list, long j, final BaseResponseCallback<List<uif>> baseResponseCallback) {
        if (baseResponseCallback == null) {
            LogUtil.j("SCUI_FitnessMgrInteractors", "getDataOriginByTypes: callback is null");
            return;
        }
        if (njy.e(list)) {
            LogUtil.j("SCUI_FitnessMgrInteractors", "getDataOriginByTypes: query types is empty");
            baseResponseCallback.onResponse(-1, null);
            return;
        }
        LogUtil.a("SCUI_FitnessMgrInteractors", "getDataOriginByTypesMergeResult: request types ", list);
        HiTimeInterval hiTimeInterval = new HiTimeInterval();
        hiTimeInterval.setStartTime(HiDateUtil.p(j));
        hiTimeInterval.setEndTime(HiDateUtil.g(j));
        synchronized (f50167a) {
            HiHealthManager.d(BaseApplication.b()).fetchDataSourceByTypes(list, hiTimeInterval, true, new HiMultiDataClientListener() { // from class: uim.3
                @Override // com.huawei.hihealth.data.listener.HiMultiDataClientListener
                public void onMultiTypeResult(Map<Integer, List<HiHealthClient>> map) {
                }

                @Override // com.huawei.hihealth.data.listener.HiMultiDataClientListener
                public void onMergeTypeResult(List<HiHealthClient> list2) {
                    if (njy.e(list2)) {
                        LogUtil.j("SCUI_FitnessMgrInteractors", "onMergeTypeResult: response result list is empty");
                        baseResponseCallback.onResponse(-1, null);
                        return;
                    }
                    ArrayList arrayList = new ArrayList(10);
                    uim.this.c(list2, (ArrayList<uif>) arrayList);
                    uim.this.d(arrayList);
                    if (arrayList.size() == 1) {
                        arrayList.clear();
                        LogUtil.a("SCUI_FitnessMgrInteractors", "onMergeTypeResult Step data origin is only phone.");
                    }
                    LogUtil.a("SCUI_FitnessMgrInteractors", "onMergeTypeResult: ", Integer.valueOf(arrayList.size()));
                    baseResponseCallback.onResponse(0, arrayList);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(ArrayList<uif> arrayList) {
        Iterator<uif> it = arrayList.iterator();
        while (it.hasNext()) {
            if ("-1".equals(it.next().b())) {
                LogUtil.a("SCUI_FitnessMgrInteractors", "filterInputDataType: DeviceUniqueCode is -1");
                it.remove();
            }
        }
    }
}
