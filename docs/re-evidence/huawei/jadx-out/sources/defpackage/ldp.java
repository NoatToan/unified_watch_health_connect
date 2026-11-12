package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import com.huawei.hihealth.CharacteristicConstant;
import com.huawei.hihealth.DataReportModel;
import com.huawei.hihealth.IRegisterRealTimeCallback;
import com.huawei.hihealthservice.hihealthkit.model.DataObservable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class ldp extends DataObservable<IRegisterRealTimeCallback> {
    private static Map<Integer, String> dataTypeToBundleKey;
    private static Map<String, Long> sTargetCache = new HashMap();

    static {
        HashMap map = new HashMap();
        dataTypeToBundleKey = map;
        map.put(Integer.valueOf(CharacteristicConstant.ReportDataType.DATA_POINT_STEP_SUM.getDataType()), "step");
        dataTypeToBundleKey.put(Integer.valueOf(CharacteristicConstant.ReportDataType.DATA_POINT_CALORIES_SUM.getDataType()), "carior");
        dataTypeToBundleKey.put(Integer.valueOf(CharacteristicConstant.ReportDataType.DATA_POINT_DISTANCE_SUM.getDataType()), "distance");
    }

    @Override // com.huawei.hihealthservice.hihealthkit.model.DataObservable
    public void notifyDataChanged(Object obj) {
        if (obj instanceof Bundle) {
            for (String str : this.mObservers.keySet()) {
                String[] strArrSplit = str.split("#");
                Integer numValueOf = Integer.valueOf(strArrSplit[0]);
                leg.c(new DataReportModel(numValueOf.intValue(), Integer.valueOf(strArrSplit[1]).intValue(), Integer.valueOf(strArrSplit[2]).intValue(), Integer.valueOf(strArrSplit[3]).intValue()), ((Bundle) obj).getInt(dataTypeToBundleKey.get(numValueOf)), (RemoteCallbackList) this.mObservers.get(str));
            }
        }
    }

    public void registerObserver(DataReportModel dataReportModel, IRegisterRealTimeCallback iRegisterRealTimeCallback) {
        super.registerObserver((Parcelable) dataReportModel, iRegisterRealTimeCallback);
        leg.c(dataReportModel, iRegisterRealTimeCallback);
    }

    public void unregisterObserver(DataReportModel dataReportModel, IRegisterRealTimeCallback iRegisterRealTimeCallback) {
        super.unregisterObserver((Parcelable) dataReportModel, iRegisterRealTimeCallback);
        leg.b(dataReportModel, iRegisterRealTimeCallback);
    }
}
