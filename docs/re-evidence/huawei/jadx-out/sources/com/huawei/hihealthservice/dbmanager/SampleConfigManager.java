package com.huawei.hihealthservice.dbmanager;

import android.content.ContentValues;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.HiSampleConfigKey;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.kvg;
import defpackage.kwb;
import defpackage.kwe;
import defpackage.kwt;
import defpackage.ljq;
import health.compact.a.HiCommonUtil;
import health.compact.a.LogAnonymous;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class SampleConfigManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kvg f12361a;

    public enum InsertOrUpdateResult {
        FAILED,
        SUCCESS_NO_CHANGE,
        SUCCESS_UPDATED
    }

    private SampleConfigManager() {
        this.f12361a = kvg.c();
    }

    static class c {
        private static final SampleConfigManager d = new SampleConfigManager();
    }

    public static SampleConfigManager e() {
        return c.d;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    public InsertOrUpdateResult d(int i, HiSampleConfig hiSampleConfig) {
        boolean zB;
        try {
            try {
                zB = !ljq.h(BaseApplication.b(), 0) ? ljq.b(BaseApplication.b(), 0) : false;
                try {
                    InsertOrUpdateResult insertOrUpdateResultA = a(i, hiSampleConfig);
                    if (zB) {
                        ljq.g(BaseApplication.b(), 0);
                    }
                    if (zB) {
                        ljq.c(BaseApplication.b(), 0);
                    }
                    return insertOrUpdateResultA;
                } catch (Exception e) {
                    e = e;
                    ReleaseLogUtil.b("HiH_SampleConfigManager", "insertOrUpdateSampleConfig: ", LogAnonymous.b(e));
                    InsertOrUpdateResult insertOrUpdateResult = InsertOrUpdateResult.FAILED;
                    if (zB) {
                        ljq.c(BaseApplication.b(), 0);
                    }
                    return insertOrUpdateResult;
                }
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    ljq.c(BaseApplication.b(), 0);
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            zB = false;
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
                ljq.c(BaseApplication.b(), 0);
            }
            throw th;
        }
    }

    private InsertOrUpdateResult a(int i, HiSampleConfig hiSampleConfig) {
        LogUtil.a("HiH_SampleConfigManager", "insertOrUpdateSampleConfig sampleConfig is ", hiSampleConfig);
        List<HiSampleConfig> listB = b(kwt.b().f(i), new HiSampleConfigKey.Builder().e(hiSampleConfig.getType()).a(hiSampleConfig.getConfigId()).d(hiSampleConfig.getScopeApp()).c(hiSampleConfig.getScopeDeviceType()).d());
        InsertOrUpdateResult insertOrUpdateResult = InsertOrUpdateResult.SUCCESS_UPDATED;
        if (HiCommonUtil.b(listB)) {
            if (c(hiSampleConfig) <= 0) {
                insertOrUpdateResult = InsertOrUpdateResult.FAILED;
            }
            ReleaseLogUtil.c("HiH_SampleConfigManager", "insSampleConfig: ", hiSampleConfig.getConfigId(), ", r=", insertOrUpdateResult);
            return insertOrUpdateResult;
        }
        boolean z = true;
        for (HiSampleConfig hiSampleConfig2 : listB) {
            if (hiSampleConfig2.getModifiedTime() < System.currentTimeMillis() && hiSampleConfig2.getModifiedTime() >= hiSampleConfig.getModifiedTime()) {
                ReleaseLogUtil.c("HiH_SampleConfigManager", "SampleConfig: ", hiSampleConfig.getConfigId(), " old modifiedTime is bigger");
            } else if (TextUtils.equals(hiSampleConfig2.getConfigData(), hiSampleConfig.getConfigData()) && TextUtils.equals(hiSampleConfig2.getConfigDescription(), hiSampleConfig.getConfigDescription()) && TextUtils.equals(hiSampleConfig2.getMetaData(), hiSampleConfig.getMetaData())) {
                ReleaseLogUtil.c("HiH_SampleConfigManager", "SampleConfig: ", hiSampleConfig.getConfigId(), " is same");
            } else {
                int iB = b(hiSampleConfig2.getClientId(), hiSampleConfig);
                ReleaseLogUtil.c("HiH_SampleConfigManager", "updateSampleConfig: ", hiSampleConfig.getConfigId(), ", r=", Integer.valueOf(iB));
                if (iB <= 0) {
                    insertOrUpdateResult = InsertOrUpdateResult.FAILED;
                }
                z = false;
            }
        }
        return z ? InsertOrUpdateResult.SUCCESS_NO_CHANGE : insertOrUpdateResult;
    }

    public List<HiSampleConfig> b(List<Integer> list, HiSampleConfigKey hiSampleConfigKey) {
        StringBuffer stringBufferB = b(hiSampleConfigKey);
        String[] strArrC = c(hiSampleConfigKey, list.size());
        kwb.e("client_id", list, stringBufferB, strArrC, strArrC.length - list.size());
        return kvg.b(this.f12361a.query(stringBufferB.toString(), strArrC, null, null, null));
    }

    public List<HiSampleConfig> a(List<Integer> list) {
        StringBuffer stringBuffer = new StringBuffer();
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strArr[i] = String.valueOf(list.get(i));
        }
        kwb.e("client_id", list, stringBuffer, strArr, 0);
        LogUtil.d("HiH_SampleConfigManager", "querySampleConfigByUserId selection=" + ((Object) stringBuffer), ", selectionArgs=" + HiJsonUtil.d(strArr));
        return kvg.b(this.f12361a.query(stringBuffer.toString(), strArr, null, null, null));
    }

    public List<HiSampleConfig> e(List<Integer> list, HiSampleConfigKey hiSampleConfigKey, int i, int i2) {
        StringBuffer stringBufferC = c(hiSampleConfigKey);
        String[] strArrC = c(hiSampleConfigKey, list.size(), i);
        kwb.e("client_id", list, stringBufferC, strArrC, strArrC.length - list.size());
        if (i2 > 0) {
            kwe.b(stringBufferC, 0, i2);
        }
        return kvg.b(this.f12361a.query(stringBufferC.toString(), strArrC, null, null, null));
    }

    public boolean c(List<Integer> list, HiSampleConfigKey hiSampleConfigKey, int i) {
        StringBuffer stringBufferC = c(hiSampleConfigKey);
        String[] strArrC = c(hiSampleConfigKey, list.size(), i);
        kwb.e("client_id", list, stringBufferC, strArrC, strArrC.length - list.size());
        return kwb.b(this.f12361a.delete(stringBufferC.toString(), strArrC));
    }

    public boolean c(long j, long j2, int i) {
        return kwb.b(this.f12361a.update(kvg.d(i), "_id =? and modified_time =? ", new String[]{Long.toString(j), Long.toString(j2)}));
    }

    private String[] c(HiSampleConfigKey hiSampleConfigKey, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.toString(2));
        if (hiSampleConfigKey.getType() != null) {
            arrayList.add(hiSampleConfigKey.getType());
        }
        if (hiSampleConfigKey.getConfigId() != null) {
            arrayList.add(hiSampleConfigKey.getConfigId());
        }
        if (hiSampleConfigKey.getScopeApp() != null) {
            arrayList.add(hiSampleConfigKey.getScopeApp());
        }
        if (hiSampleConfigKey.getScopeDeviceType() != null) {
            arrayList.add(hiSampleConfigKey.getScopeDeviceType());
        }
        String[] strArr = new String[arrayList.size() + i];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            strArr[i2] = (String) arrayList.get(i2);
        }
        return strArr;
    }

    private StringBuffer b(HiSampleConfigKey hiSampleConfigKey) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("sync_status");
        if (hiSampleConfigKey.getType() != null) {
            stringBuffer.append(" !=? and type");
        }
        if (hiSampleConfigKey.getConfigId() != null) {
            stringBuffer.append(" =? and config_id");
        }
        if (hiSampleConfigKey.getScopeApp() != null) {
            stringBuffer.append(" =? and scope_app");
        }
        if (hiSampleConfigKey.getScopeDeviceType() != null) {
            stringBuffer.append(" =? and scope_device_type");
        }
        stringBuffer.append(CommonUtil.EQUAL);
        return stringBuffer;
    }

    private String[] c(HiSampleConfigKey hiSampleConfigKey, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.toString(i2));
        if (hiSampleConfigKey != null) {
            if (hiSampleConfigKey.getType() != null) {
                arrayList.add(hiSampleConfigKey.getType());
            }
            if (hiSampleConfigKey.getConfigId() != null) {
                arrayList.add(hiSampleConfigKey.getConfigId());
            }
            if (hiSampleConfigKey.getScopeApp() != null) {
                arrayList.add(hiSampleConfigKey.getScopeApp());
            }
            if (hiSampleConfigKey.getScopeDeviceType() != null) {
                arrayList.add(hiSampleConfigKey.getScopeDeviceType());
            }
        }
        String[] strArr = new String[arrayList.size() + i];
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            strArr[i3] = (String) arrayList.get(i3);
        }
        return strArr;
    }

    private StringBuffer c(HiSampleConfigKey hiSampleConfigKey) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("sync_status");
        if (hiSampleConfigKey != null) {
            if (hiSampleConfigKey.getType() != null) {
                stringBuffer.append(" =? and type");
            }
            if (hiSampleConfigKey.getConfigId() != null) {
                stringBuffer.append(" =? and config_id");
            }
            if (hiSampleConfigKey.getScopeApp() != null) {
                stringBuffer.append(" =? and scope_app");
            }
            if (hiSampleConfigKey.getScopeDeviceType() != null) {
                stringBuffer.append(" =? and scope_device_type");
            }
        }
        stringBuffer.append(CommonUtil.EQUAL);
        return stringBuffer;
    }

    private long c(HiSampleConfig hiSampleConfig) {
        return this.f12361a.insert(kvg.c(hiSampleConfig));
    }

    private int b(int i, HiSampleConfig hiSampleConfig) {
        ContentValues contentValuesA = kvg.a(hiSampleConfig);
        HiSampleConfigKey hiSampleConfigKeyD = new HiSampleConfigKey.Builder().e(hiSampleConfig.getType()).a(hiSampleConfig.getConfigId()).d(hiSampleConfig.getScopeApp()).c(hiSampleConfig.getScopeDeviceType()).d();
        StringBuffer stringBufferB = b(hiSampleConfigKeyD);
        String[] strArrC = c(hiSampleConfigKeyD, 1);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(i));
        kwb.e("client_id", arrayList, stringBufferB, strArrC, strArrC.length - arrayList.size());
        return this.f12361a.update(contentValuesA, stringBufferB.toString(), strArrC);
    }
}
