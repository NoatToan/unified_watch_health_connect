package com.huawei.watchface;

import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.mvp.model.datatype.ConsentRecord;
import com.huawei.watchface.mvp.model.helper.GsonHelper;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes45.dex */
public abstract class i4 {

    public class a extends TypeToken<List<ConsentRecord>> {
    }

    public static void a(String str) {
        List arrayList;
        synchronized (i4.class) {
            try {
                arrayList = (List) GsonHelper.fromJsonToArray(e4.d("key_consent_record", ""), new a().getType());
            } catch (JsonSyntaxException e) {
                HwLog.e("TMSConsentManager", "saveConsentsToSpUtils JsonSyntaxException: " + HwLog.printException((Exception) e));
                arrayList = null;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            ConsentRecord consentRecord = new ConsentRecord();
            consentRecord.setConsentType("1000");
            consentRecord.setRecordTime(String.valueOf(System.currentTimeMillis()));
            consentRecord.setPersonalSwitch(str);
            HwWatchFaceApi hwWatchFaceApi = HwWatchFaceApi.getInstance(Environment.getApplicationContext());
            if (hwWatchFaceApi != null) {
                consentRecord.setCountryCode(hwWatchFaceApi.getCommonCountryCode());
                consentRecord.setUserId(hwWatchFaceApi.getUserId());
            }
            consentRecord.setAppVersion(String.valueOf(CommonUtils.getVersionCode()));
            arrayList.add(consentRecord);
            e4.f("key_consent_record", GsonHelper.toJson(arrayList));
        }
    }
}
