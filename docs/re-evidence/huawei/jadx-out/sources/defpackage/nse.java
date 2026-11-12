package defpackage;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwonesdk.datastructure.request.DataType;
import com.huawei.hwonesdk.datastructure.request.SubDataType;
import com.huawei.hwonesdk.process.HiHealthProcess;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class nse implements HiHealthProcess {
    @Override // com.huawei.hwonesdk.process.HiHealthProcess
    public String postProcess(Object obj, Object obj2) {
        return null;
    }

    @Override // com.huawei.hwonesdk.process.HiHealthProcess
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public HiDataInsertOption preProcess(String str) {
        HiDataInsertOption hiDataInsertOptionB = b(str);
        if (hiDataInsertOptionB != null) {
            return hiDataInsertOptionB;
        }
        List arrayList = new ArrayList();
        if (a(str)) {
            arrayList = (List) peh.d(str, new TypeToken<List<nrc>>() { // from class: com.huawei.hwonesdk.process.SaveDataProcess$1
            }.getType());
        } else {
            arrayList.add((nrc) peh.b(str, nrc.class));
        }
        LogUtil.a("HiHealthProcess__SaveDataProcess", "SaveDataProcess request: ", arrayList.toString());
        if (CollectionUtils.a(arrayList)) {
            ReleaseLogUtil.a("HiHealthProcess__SaveDataProcess", "preProcess request is empty");
            return null;
        }
        return d(arrayList);
    }

    private static HiDataInsertOption d(List<nrc> list) {
        ArrayList<HiHealthData> arrayList = new ArrayList();
        for (nrc nrcVar : list) {
            DataType dataTypeO = nrcVar.o();
            Iterator<Map.Entry<String, Object>> it = nrcVar.n().entrySet().iterator();
            String strD = "";
            while (it.hasNext()) {
                strD = d(nrcVar, it.next(), dataTypeO, strD, arrayList);
            }
            if (!TextUtils.isEmpty(strD)) {
                for (HiHealthData hiHealthData : arrayList) {
                    if (hiHealthData.getType() == DicDataTypeUtil.DataType.BLOOD_BEFORE_ACTIVITY.value()) {
                        hiHealthData.setMetaData(strD);
                        break;
                    }
                }
            }
        }
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.setDatas(arrayList);
        return hiDataInsertOption;
    }

    private static String d(nrc nrcVar, Map.Entry<String, Object> entry, DataType dataType, String str, List<HiHealthData> list) {
        if (dataType.getmId() == DicDataTypeUtil.DataType.BLOOD_PRESSURE_SET.value() && Objects.equals(entry.getKey(), "customTags")) {
            if (entry.getValue() instanceof String) {
                return (String) entry.getValue();
            }
        } else {
            for (int i : nqj.a().e(dataType.getmId(), entry.getKey())) {
                HiHealthData hiHealthData = new HiHealthData(i);
                hiHealthData.setTimeInterval(nrcVar.c(), nrcVar.e());
                String strL = nrcVar.l();
                if (TextUtils.isEmpty(strL)) {
                    strL = "-1";
                }
                hiHealthData.setDeviceUuid(strL);
                Object value = entry.getValue();
                if (value instanceof String) {
                    hiHealthData.setMetaData((String) value);
                } else if (value instanceof Double) {
                    hiHealthData.setValue(((Double) value).doubleValue());
                } else {
                    LogUtil.c("HiHealthProcess__SaveDataProcess", "Unknown value type: " + value.getClass().getName());
                }
                hiHealthData.setTimeZone(nrcVar.i());
                if (dataType.getmId() == DicDataTypeUtil.DataType.WEIGHT_BODYFAT_BROAD.value() && !TextUtils.isEmpty(nrcVar.j())) {
                    hiHealthData.setMetaData(nrcVar.j());
                }
                list.add(hiHealthData);
            }
        }
        return str;
    }

    private static HiDataInsertOption b(String str) {
        nqz nqzVar = (nqz) peh.b(str, nqz.class);
        if (nqzVar == null || nqzVar.b() == null) {
            return null;
        }
        SubDataType subDataTypeD = nqzVar.d();
        DataType dataTypeA = nqzVar.a();
        long jF = nqzVar.f();
        long jE = nqzVar.e();
        String strI = nqzVar.i();
        long jC = nqzVar.c();
        String strC = peh.c(nqzVar.b());
        if (strC == null) {
            strC = "{}";
        }
        HiHealthData hiHealthData = new HiHealthData();
        hiHealthData.setSubType(subDataTypeD.getmId());
        hiHealthData.setType(dataTypeA.getmId());
        hiHealthData.setDeviceUuid("-1");
        hiHealthData.setStartTime(jF);
        hiHealthData.setEndTime(jE);
        hiHealthData.setTimeZone(strI);
        hiHealthData.setModifiedTime(jC);
        hiHealthData.setMetaData(strC);
        hiHealthData.setSequenceData("{}");
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.addData(hiHealthData);
        return hiDataInsertOption;
    }

    private boolean a(String str) {
        if (str == null || TextUtils.isEmpty(str.trim())) {
            return false;
        }
        String strTrim = str.trim();
        return strTrim.startsWith("[") && strTrim.endsWith("]");
    }

    @Override // com.huawei.hwonesdk.process.HiHealthProcess
    public void doAction(String str, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            ReleaseLogUtil.a("HiHealthProcess__SaveDataProcess", "doAction callback is null");
            return;
        }
        HiDataInsertOption hiDataInsertOptionPreProcess = preProcess(str);
        LogUtil.a("HiHealthProcess__SaveDataProcess", "preProcess insertOption", hiDataInsertOptionPreProcess);
        if (hiDataInsertOptionPreProcess == null) {
            iBaseResponseCallback.a(-1, "");
            ReleaseLogUtil.a("HiHealthProcess__SaveDataProcess", "doAction insertOption is null");
        } else {
            HiHealthManager.d(BaseApplication.b()).insertHiHealthData(hiDataInsertOptionPreProcess, new c(iBaseResponseCallback));
        }
    }

    static class c implements HiDataOperateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final IBaseResponseCallback f43582a;

        c(IBaseResponseCallback iBaseResponseCallback) {
            this.f43582a = iBaseResponseCallback;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
        public void onResult(int i, Object obj) {
            LogUtil.a("HiHealthProcess__SaveDataProcess", "insertHiHealthData ", Integer.valueOf(i));
            IBaseResponseCallback iBaseResponseCallback = this.f43582a;
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(i, obj);
            }
        }
    }
}
