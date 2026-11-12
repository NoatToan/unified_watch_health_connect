package defpackage;

import android.content.ContentValues;
import android.util.SparseArray;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwarkuix.oHBrigdePlugin.health.NativeInvokeEmotionBridge;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.hwdictionarymgr.strategy.DictionarySequenceInterface;
import com.huawei.hwdevice.phoneprocess.mgr.hwsynctaskmanager.commonTask.base.TaskInterface;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mzi extends mzp implements TaskInterface {
    private final DictionarySequenceInterface d;

    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwsynctaskmanager.commonTask.base.TaskInterface
    public void handleEvent(DeviceInfo deviceInfo, eee eeeVar) {
    }

    public mzi(String str, String str2) {
        super(str, str2);
        this.d = new mvn();
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwsynctaskmanager.commonTask.base.TaskInterface
    public void handlePoint(DeviceInfo deviceInfo, eea eeaVar) {
        if (eeaVar.c() == 500031) {
            int iB = eeaVar.b();
            for (eeb eebVar : eeaVar.e()) {
                long jE = eebVar.e();
                long jC = eebVar.c();
                if (jE > jC) {
                    LogUtil.e("EmotionTask", "start time > end time " + jE + " " + jC);
                    return;
                }
                d(deviceInfo, jE, jC, iB);
            }
            return;
        }
        LogUtil.e("EmotionTask", "not emotion id " + eeaVar.c());
    }

    private eea a(int i) {
        eea eeaVar = new eea();
        eeaVar.c(500031L);
        eeaVar.setCommandId(4);
        eeaVar.setWearPkgName(this.f42763a);
        eeaVar.setSrcPkgName(this.f42764c);
        eeaVar.b(i);
        eeaVar.a(new ArrayList());
        return eeaVar;
    }

    private void d(final DeviceInfo deviceInfo, final long j, final long j2, final int i) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setSortOrder(0);
        hiDataReadOption.setType(new int[]{NativeInvokeEmotionBridge.EMOTION_TYPE});
        hiDataReadOption.setModifiedStartTime(j);
        hiDataReadOption.setModifiedEndTime(j2);
        hiDataReadOption.setReadType(0);
        LogUtil.a("EmotionTask", "readHiHealthData ", hiDataReadOption);
        HiHealthManager.d(BaseApplication.getContext()).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: mzi.4
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i2, int i3) {
                LogUtil.a("EmotionTask", "onResult errorCode: ", Integer.valueOf(i2));
                if (obj == null) {
                    LogUtil.j("EmotionTask", "object is null");
                } else if (obj instanceof SparseArray) {
                    mzi.this.a((SparseArray) obj, deviceInfo, j, j2, i);
                } else {
                    LogUtil.j("EmotionTask", "sparseArray !instanceof no process");
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i2, Object obj, int i3, int i4) {
                LogUtil.a("EmotionTask", "onResultIntent intentType:", Integer.valueOf(i2), ", object:", obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SparseArray<?> sparseArray, DeviceInfo deviceInfo, long j, long j2, int i) {
        eea eeaVarA = a(i);
        if (sparseArray.size() <= 0) {
            LogUtil.j("EmotionTask", "sparseArray size is zero");
        }
        LogUtil.a("EmotionTask", "query emotion data size: ", Integer.valueOf(sparseArray.size()));
        Object obj = sparseArray.get((int) eeaVarA.c());
        if (!(obj instanceof List)) {
            LogUtil.j("EmotionTask", "dataObject not list");
        } else {
            e(deviceInfo, j, j2, (List) obj, eeaVarA);
        }
    }

    private static void e(DeviceInfo deviceInfo, long j, long j2, List<?> list, eea eeaVar) {
        for (Object obj : list) {
            if (obj instanceof HiHealthData) {
                HiHealthData hiHealthData = (HiHealthData) obj;
                if (hiHealthData.getType() == 500031195) {
                    j = hiHealthData.getStartTime();
                    j2 = hiHealthData.getEndTime();
                    eed eedVarE = e(hiHealthData);
                    if (eedVarE == null) {
                        LogUtil.e("EmotionTask", "get samplePointInfo failed");
                    } else {
                        eeb eebVar = new eeb();
                        eebVar.b().add(eedVarE);
                        eebVar.a(hiHealthData.getModifiedTime());
                        eebVar.c(hiHealthData.getStartTime());
                        eebVar.d(hiHealthData.getEndTime());
                        eeaVar.e().add(eebVar);
                    }
                }
            } else {
                LogUtil.j("EmotionTask", "data not HiHealthData");
            }
        }
        LogUtil.a("EmotionTask", "send point emotion startTime: " + j + " endTime: " + j2);
        edc.e().sendDictionaryPointInfoCommand(deviceInfo, eeaVar, "EmotionTask");
    }

    private static eed e(HiHealthData hiHealthData) {
        eed eedVar = new eed();
        eedVar.e(hiHealthData.getType());
        ContentValues valueHolder = hiHealthData.getValueHolder();
        if (valueHolder == null) {
            LogUtil.e("EmotionTask", "get value is null");
            return null;
        }
        Double asDouble = valueHolder.getAsDouble("point_value");
        if (asDouble == null) {
            LogUtil.e("EmotionTask", "get double value is null");
            return null;
        }
        eedVar.a(cph.g(asDouble.intValue()));
        return eedVar;
    }
}
