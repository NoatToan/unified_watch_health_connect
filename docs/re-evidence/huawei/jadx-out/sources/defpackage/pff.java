package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.health.devicemgr.api.phoneprocess.SampleSequenceAfterProcess;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import health.compact.a.CommonUtil;
import health.compact.a.util.LogUtil;
import java.util.LinkedHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class pff implements SampleSequenceAfterProcess {
    @Override // com.huawei.health.devicemgr.api.phoneprocess.SampleSequenceAfterProcess
    public HiHealthData onSampleSequenceAfterProcess(HiDataInsertOption hiDataInsertOption, HiHealthData hiHealthData, String str) {
        if (hiHealthData == null) {
            LogUtil.d("PpgSampleSequenceAfterProcess", "hiHealthData==null");
            return hiHealthData;
        }
        try {
            if (hiHealthData.getSequenceData() == null) {
                LogUtil.d("PpgSampleSequenceAfterProcess", "no ppgData");
                return hiHealthData;
            }
            String metaData = hiHealthData.getMetaData();
            if (!TextUtils.isEmpty(metaData)) {
                JSONObject jSONObject = new JSONObject(metaData);
                if (!jSONObject.has("firstValley") && jSONObject.has("accStatus")) {
                    pfi pfiVarC = pfi.c();
                    if (pfiVarC.isPluginAvaiable()) {
                        return pfiVarC.getPeriodMeasureResult(hiHealthData);
                    }
                    return c(hiHealthData);
                }
            }
            return hiHealthData;
        } catch (InterruptedException unused) {
            LogUtil.c("PpgSampleSequenceAfterProcess", "interrupted while loadPlugin");
        } catch (JSONException unused2) {
            LogUtil.c("PpgSampleSequenceAfterProcess", "jsonException");
            return hiHealthData;
        } catch (Exception e) {
            String sequenceData = hiHealthData.getSequenceData();
            String metaData2 = hiHealthData.getMetaData();
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(1);
            if (CommonUtil.ap()) {
                linkedHashMap.put("ppgData", sequenceData);
                linkedHashMap.put("metaData", metaData2);
            }
            if (sequenceData != null) {
                linkedHashMap.put("ppgDataSize", String.valueOf(sequenceData.length()));
            }
            linkedHashMap.put(TrackConstants$Events.EXCEPTION, e.getMessage());
            OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_INVALID_PPG_DATA_2129036.value(), linkedHashMap);
        }
    }

    private HiHealthData c(HiHealthData hiHealthData) throws InterruptedException {
        pfi pfiVarC = pfi.c();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        pfiVarC.loadPlugin(new AppBundleLauncher.InstallCallback() { // from class: pff.2
            @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
            public boolean call(Context context, Intent intent) {
                LogUtil.a("PpgSampleSequenceAfterProcess", "loadPlugin call");
                countDownLatch.countDown();
                return false;
            }

            @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
            public void onFailed(Context context, Intent intent) {
                LogUtil.a("PpgSampleSequenceAfterProcess", "loadPlugin failed");
                countDownLatch.countDown();
            }
        });
        if (countDownLatch.await(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, TimeUnit.MILLISECONDS)) {
            return pfiVarC.getPeriodMeasureResult(hiHealthData);
        }
        LogUtil.d("PpgSampleSequenceAfterProcess", "loadPlugin wait timeout");
        return hiHealthData;
    }
}
