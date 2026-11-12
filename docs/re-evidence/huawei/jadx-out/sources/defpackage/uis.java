package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.sport.utils.FitnessDataQueryDefine;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.HiStressMetaData;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.interactors.stressAdvice.PressureAdeviceRetrunValue;
import com.huawei.ui.main.stories.fitness.interactors.stressAdvice.PressureMeasureAdviceMgr;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class uis {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private uim f50193b = uim.c();
    private String e = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Integer, Integer> f50191a = new HashMap(10);
    private static final Map<Integer, Integer> d = new HashMap(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<Integer, Integer> f50192c = new HashMap(10);

    public static String c(int i) {
        String string;
        LogUtil.a("PressureMeasureDetailInteractor", "getAdviceFromMap = ", Integer.valueOf(i));
        Context context = BaseApplication.getContext();
        if (i >= 1002 && i <= 3002) {
            Map<Integer, Integer> map = f50191a;
            if (map.size() <= 0) {
                wve.d(wve.c("pressure/dayAdvice.properties"), map);
            }
            string = context.getString(map.get(Integer.valueOf(i)).intValue());
        } else if (i >= 4002 && i <= 5108) {
            Map<Integer, Integer> map2 = d;
            if (map2.size() <= 0) {
                wve.d(wve.c("pressure/weekAdvice.properties"), map2);
            }
            string = context.getString(map2.get(Integer.valueOf(i)).intValue());
        } else if (i >= 6002 && i <= 6072) {
            Map<Integer, Integer> map3 = f50192c;
            if (map3.size() <= 0) {
                wve.d(wve.c("pressure/monthAdvice.properties"), map3);
            }
            string = context.getString(map3.get(Integer.valueOf(i)).intValue());
        } else {
            LogUtil.j("PressureMeasureDetailInteractor", "num error = ", Integer.valueOf(i));
            string = "";
        }
        LogUtil.a("PressureMeasureDetailInteractor", "getAdviceFromMap adviceContent = ", string);
        return string;
    }

    public String d() {
        return this.e;
    }

    public void c(Date date, int i, final CommonUiBaseResponse commonUiBaseResponse) {
        if (date == null || commonUiBaseResponse == null) {
            LogUtil.j("PressureMeasureDetailInteractor", "getPressureAdvice parameter error");
        } else {
            this.e = BaseApplication.getContext().getString(R.string.IDS_pressure_advice_4002);
            PressureMeasureAdviceMgr.a(date, i, new CommonUiBaseResponse() { // from class: uiw
                @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
                public final void onResponse(int i2, Object obj) {
                    this.d.b(commonUiBaseResponse, i2, obj);
                }
            });
        }
    }

    /* synthetic */ void b(CommonUiBaseResponse commonUiBaseResponse, int i, Object obj) {
        LogUtil.d("PressureMeasureDetailInteractor", "getPressureAdvice errorCode = ", Integer.valueOf(i));
        if (i == 0 && obj != null) {
            PressureAdeviceRetrunValue pressureAdeviceRetrunValue = (PressureAdeviceRetrunValue) obj;
            if (pressureAdeviceRetrunValue.getError_code() == 0) {
                LogUtil.a("PressureMeasureDetailInteractor", "getPressureAdvice from jni success");
                String strC = c(pressureAdeviceRetrunValue.getAdvice_num_2());
                if (!TextUtils.isEmpty(strC)) {
                    this.e = strC;
                }
            }
        }
        commonUiBaseResponse.onResponse(i, obj);
    }

    public List<wut> b(List<HiHealthData> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            HiHealthData hiHealthData = list.get(i);
            wut wutVar = new wut();
            long startTime = hiHealthData.getStartTime();
            int intValue = hiHealthData.getIntValue();
            if (intValue <= 0 || intValue >= 100) {
                LogUtil.a("PressureMeasureDetailInteractor", "getDayStressData isStressData = false , stressScore = ", Integer.valueOf(intValue));
            } else {
                int iD = wvb.d(intValue);
                wutVar.c(startTime / 1000);
                wutVar.e(iD);
                wutVar.a(intValue);
                arrayList.add(wutVar);
            }
        }
        return arrayList;
    }

    public List<wut> d(Date date, int i, List<HiStressMetaData> list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            long jL = ltb.l(date);
            long jO = ltb.o(date);
            List<HiStressMetaData> listD = d(jL, jO, list);
            int size = listD.size();
            if (listD.size() > 0) {
                int iFetchStressScore = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    iFetchStressScore += listD.get(i3).fetchStressScore();
                }
                int i4 = (int) (iFetchStressScore / size);
                wut wutVar = new wut();
                wutVar.c(jO);
                wutVar.a(i4);
                wutVar.e(wvb.d(i4));
                arrayList.add(wutVar);
            } else {
                wut wutVar2 = new wut();
                wutVar2.a(0);
                wutVar2.e(0);
                wutVar2.c(jO);
                arrayList.add(wutVar2);
            }
            date = ltb.q(date);
        }
        return arrayList;
    }

    public List<wut> a(Date date, List<HiStressMetaData> list) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < 12) {
            Date dateB = ltb.b(date, 1);
            Date dateC = ltb.c(ltb.d(dateB, -1));
            long jL = ltb.l(date);
            long jL2 = ltb.l(dateC);
            List<HiStressMetaData> listD = d(jL, jL2, list);
            int size = listD.size();
            if (listD.size() > 0) {
                int iFetchStressScore = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    iFetchStressScore += listD.get(i2).fetchStressScore();
                }
                int i3 = (int) (iFetchStressScore / size);
                wut wutVar = new wut();
                wutVar.a(i3);
                wutVar.e(wvb.d(i3));
                wutVar.c(jL2);
                arrayList.add(wutVar);
            } else {
                wut wutVar2 = new wut();
                wutVar2.a(0);
                wutVar2.e(0);
                wutVar2.c(jL2);
                arrayList.add(wutVar2);
            }
            i++;
            date = dateB;
        }
        return arrayList;
    }

    private List<HiStressMetaData> d(long j, long j2, List<HiStressMetaData> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            long jFetchStressStartTime = list.get(i).fetchStressStartTime() / 1000;
            if (jFetchStressStartTime >= j && jFetchStressStartTime <= j2) {
                arrayList.add(list.get(i));
            }
        }
        LogUtil.d("PressureMeasureDetailInteractor", "getYearPointList isHave = ", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    public void e(final HiStressMetaData hiStressMetaData, final CommonUiBaseResponse commonUiBaseResponse, final int i) {
        DeviceInfo deviceInfoC;
        boolean zE = myz.e(hiStressMetaData);
        LogUtil.a("PressureMeasureDetailInteractor", "setStressData,isAdjustStressDate = ", Boolean.valueOf(zE));
        if (zE && (deviceInfoC = mgg.c("PressureMeasureDetailInteractor")) != null) {
            LogUtil.a("PressureMeasureDetailInteractor", "currentDeviceInfo ", deviceInfoC.toString());
            mga.h(deviceInfoC);
            this.f50193b.c(mga.e(), hiStressMetaData, new CommonUiBaseResponse() { // from class: uis.2
                @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
                public void onResponse(int i2, Object obj) {
                    CommonUiBaseResponse commonUiBaseResponse2 = commonUiBaseResponse;
                    if (commonUiBaseResponse2 != null) {
                        commonUiBaseResponse2.onResponse(i2, Integer.valueOf(i));
                        if (i2 == 0 && i == 0 && eej.c().isSupportStressAppToDevice()) {
                            mbr.a().d(hiStressMetaData);
                        }
                    }
                }
            });
        }
    }

    public static int c(List<wut> list) {
        Iterator<wut> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().c() > 0) {
                i++;
            }
        }
        Iterator<wut> it2 = list.iterator();
        int iC = 0;
        while (it2.hasNext()) {
            iC += it2.next().c();
        }
        LogUtil.d("PressureMeasureDetailInteractor", "sumPressureVlaue = ", iC + " size = ", Integer.valueOf(i));
        if (i == 0) {
            LogUtil.d("PressureMeasureDetailInteractor", "size is zero");
            return 0;
        }
        int i2 = (int) (iC / i);
        LogUtil.d("PressureMeasureDetailInteractor", "avgValue = ", Integer.valueOf(i2));
        return i2;
    }

    public static String e(List<wut> list) {
        if (list != null && list.size() > 0) {
            int iC = list.get(0).c();
            int iC2 = list.get(0).c();
            for (wut wutVar : list) {
                if (wutVar.c() < iC2) {
                    iC2 = wutVar.c();
                }
            }
            for (wut wutVar2 : list) {
                if (wutVar2.c() > iC) {
                    iC = wutVar2.c();
                }
            }
            LogUtil.d("PressureMeasureDetailInteractor", "minValue = ", Integer.valueOf(iC2), " maxValue = ", Integer.valueOf(iC));
            return UnitUtil.e(iC2, 1, 0) + Constants.LINK + UnitUtil.e(iC, 1, 0);
        }
        return "--";
    }

    public void e(final CommonUiBaseResponse commonUiBaseResponse) {
        ftp.e(new IBaseResponseCallback() { // from class: uja
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                uis.c(commonUiBaseResponse, i, obj);
            }
        });
    }

    static /* synthetic */ void c(CommonUiBaseResponse commonUiBaseResponse, int i, Object obj) {
        LogUtil.a("PressureMeasureDetailInteractor", "isAlreadyDoPressureAdjust errorCode: ", Integer.valueOf(i), "objData: ", obj);
        commonUiBaseResponse.onResponse(i, obj);
    }

    public void d(Date date, int i, final CommonUiBaseResponse commonUiBaseResponse) {
        if (date == null || commonUiBaseResponse == null) {
            LogUtil.j("PressureMeasureDetailInteractor", "requestStressStatisticDatas date or callback is null");
            return;
        }
        LogUtil.a("PressureMeasureDetailInteractor", "requestStressDetailDatas paraUIDataType = ", Integer.valueOf(i));
        this.f50193b.c(ltb.l(date), e(i), new CommonUiBaseResponse() { // from class: uiz
            @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
            public final void onResponse(int i2, Object obj) {
                uis.e(commonUiBaseResponse, i2, obj);
            }
        });
    }

    static /* synthetic */ void e(CommonUiBaseResponse commonUiBaseResponse, int i, Object obj) {
        List arrayList = new ArrayList();
        if (i == 0 && (obj instanceof List)) {
            arrayList = (List) obj;
            LogUtil.a("PressureMeasureDetailInteractor", "sumListData.size() = ", Integer.valueOf(arrayList.size()));
        }
        commonUiBaseResponse.onResponse(i, arrayList);
    }

    public void a(long j, long j2, int i, final CommonUiBaseResponse commonUiBaseResponse) {
        LogUtil.a("PressureMeasureDetailInteractor", "requestStatisticData type = ", Integer.valueOf(i));
        if (commonUiBaseResponse == null) {
            LogUtil.j("PressureMeasureDetailInteractor", "requestStatisticData callback is null");
        } else {
            this.f50193b.b(j, j2, e(i), new CommonUiBaseResponse() { // from class: uiy
                @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
                public final void onResponse(int i2, Object obj) {
                    uis.d(commonUiBaseResponse, i2, obj);
                }
            });
        }
    }

    static /* synthetic */ void d(CommonUiBaseResponse commonUiBaseResponse, int i, Object obj) {
        Object arrayList = new ArrayList();
        if (i == 0 && (obj instanceof List)) {
            arrayList = (List) obj;
        }
        commonUiBaseResponse.onResponse(i, arrayList);
    }

    private FitnessDataQueryDefine.FitnessQueryId e(int i) {
        if (i == 1) {
            return FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_DAY_HISTOGRAM;
        }
        if (i == 2) {
            return FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_WEEK_HISTOGRAM;
        }
        if (i == 3) {
            return FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_MONTH_HISTOGRAM;
        }
        if (i == 4) {
            return FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_YEAR_HISTOGRAM;
        }
        return FitnessDataQueryDefine.FitnessQueryId.FITNESS_TYPE_DEFAULT_HISTOGRAM;
    }
}
