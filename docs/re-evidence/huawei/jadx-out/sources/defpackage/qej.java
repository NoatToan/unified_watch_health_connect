package defpackage;

import com.huawei.health.devicemgr.api.phoneprocess.SampleSequenceAfterProcess;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.operation.ble.BleConstants;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public class qej implements SampleSequenceAfterProcess {
    private int e(int i) {
        if (i != 1) {
            if (i == 3) {
                return 259;
            }
            if (i == 5) {
                return 264;
            }
            if (i != 7) {
                return (i == 28 || i != 41) ? 258 : 227;
            }
            return OldToNewMotionPath.SPORT_TYPE_INDOOR_BIKE;
        }
        return 258;
    }

    @Override // com.huawei.health.devicemgr.api.phoneprocess.SampleSequenceAfterProcess
    public HiHealthData onSampleSequenceAfterProcess(HiDataInsertOption hiDataInsertOption, HiHealthData hiHealthData, String str) {
        String metaData = hiHealthData.getMetaData();
        String sequenceData = hiHealthData.getSequenceData();
        if (metaData == null) {
            ReleaseLogUtil.d("OneSecondSportDataSequenceAfterProcess", "OneSecondSportDataSequenceAfterProcess() skipped by empty metadata");
            return hiHealthData;
        }
        if (sequenceData == null) {
            ReleaseLogUtil.d("OneSecondSportDataSequenceAfterProcess", "OneSecondSportDataSequenceAfterProcess() skipped by empty detailData");
            return hiHealthData;
        }
        try {
            JSONObject jSONObject = new JSONObject(metaData.trim());
            int iE = e(CommonUtil.c(jSONObject, BleConstants.SPORT_TYPE));
            jSONObject.put(BleConstants.SPORT_TYPE, iE);
            String strB = qqt.b(jSONObject);
            hiHealthData.setSubType(iE);
            hiHealthData.setType(DicDataTypeUtil.DataType.ONE_SECOND_SPORT_DATA_TYPE.value() + iE);
            hiHealthData.setMetaData(strB);
            hiHealthData.setSequenceData(eeq.d(sequenceData));
            return hiHealthData;
        } catch (JSONException unused) {
            ReleaseLogUtil.a("OneSecondSportDataSequenceAfterProcess", "onSamplSequenceAfterProcess() failed by JSONException");
            return hiHealthData;
        }
    }
}
