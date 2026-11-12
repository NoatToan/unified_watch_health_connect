package com.huawei.hianalytics.kit;

import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hianalytics.c2;
import com.huawei.hianalytics.core.common.AesGcmKsWrapper;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.framework.data.IAesKeyGetter;
import com.huawei.hianalytics.framework.data.WorkKeyHandler;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class AesKeyGetterImpl implements IAesKeyGetter {
    private static final String TAG = "AesKeyGetterImpl";

    private void refreshWorkKeyToSP(String str, String str2, String str3, long j, long j2, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ha_aes_key_encrypted", str);
            jSONObject.put("ha_aes_key_encrypted_version", str2);
            jSONObject.put("ha_aes_key", AesGcmKsWrapper.encrypt("HiAnalytics_Ha_Aes_Sp_Key", str3));
            jSONObject.put("ha_aes_key_timestamp", j);
            jSONObject.put("ha_aes_key_ttl_timestamp", j2);
            jSONObject.put("ha_aes_key_source", i);
            c2.a("Privacy_MY", "ha_aes_key_json", jSONObject.toString());
        } catch (JSONException unused) {
            HiLog.e(TAG, "put report aes key sp");
        }
    }

    @Override // com.huawei.hianalytics.framework.data.IAesKeyGetter
    public WorkKeyHandler.WorkKeyBean getWorkKeyBeanFromDisk() {
        int i;
        String str;
        String str2;
        String strA = c2.a("Privacy_MY", "ha_aes_key_json");
        if (TextUtils.isEmpty(strA)) {
            return new WorkKeyHandler.WorkKeyBean();
        }
        try {
            JSONObject jSONObject = new JSONObject(strA);
            long jOptLong = jSONObject.optLong("ha_aes_key_timestamp");
            long jOptLong2 = jSONObject.optLong("ha_aes_key_ttl_timestamp");
            String strOptString = jSONObject.optString("ha_aes_key_encrypted");
            String strOptString2 = jSONObject.optString("ha_aes_key_encrypted_version");
            String strDecrypt = AesGcmKsWrapper.decrypt("HiAnalytics_Ha_Aes_Sp_Key", jSONObject.optString("ha_aes_key"));
            int iOptInt = jSONObject.optInt("ha_aes_key_source", 0);
            if (jOptLong == 0) {
                long jOptLong3 = jSONObject.optLong("ha_aes_key_time");
                long jOptLong4 = jSONObject.optLong("ha_aes_key_ttl_time");
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (jOptLong3 >= jElapsedRealtime || jElapsedRealtime >= jOptLong4) {
                    i = iOptInt;
                    str = strOptString2;
                    str2 = strDecrypt;
                    c2.a("Privacy_MY", "ha_aes_key_json", "");
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    jOptLong = jCurrentTimeMillis - (jElapsedRealtime - jOptLong3);
                    jOptLong2 = jCurrentTimeMillis - (jElapsedRealtime - jOptLong4);
                    i = iOptInt;
                    refreshWorkKeyToSP(strOptString, strOptString2, strDecrypt, jOptLong, jOptLong2, i);
                    str = strOptString2;
                    str2 = strDecrypt;
                }
            } else {
                i = iOptInt;
                str = strOptString2;
                str2 = strDecrypt;
            }
            WorkKeyHandler.WorkKeyBean workKeyBean = new WorkKeyHandler.WorkKeyBean();
            workKeyBean.setEncrypted(strOptString);
            workKeyBean.setWorkKey(str2);
            workKeyBean.setUploadTime(jOptLong);
            workKeyBean.setKeyTtlTime(jOptLong2);
            workKeyBean.setPubKeyVer(str);
            workKeyBean.setSource(i);
            return workKeyBean;
        } catch (JSONException unused) {
            HiLog.e(TAG, "obtain report aes key");
            return new WorkKeyHandler.WorkKeyBean();
        }
    }

    @Override // com.huawei.hianalytics.framework.data.IAesKeyGetter
    public void saveWorkKeyBeanToDisk(WorkKeyHandler.WorkKeyBean workKeyBean) {
        if (workKeyBean == null) {
            return;
        }
        refreshWorkKeyToSP(workKeyBean.getEncrypted(), workKeyBean.getPubKeyVer(), workKeyBean.getWorkKey(), workKeyBean.getUploadTime(), workKeyBean.getKeyTtlTime(), workKeyBean.getSource());
    }
}
