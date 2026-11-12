package defpackage;

import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.model.HiStressMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class ftp {
    public static void e(final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.e("PressureMeasureUtils", "callback is null in isAlreadyDoPressureAdjust");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: ftn
                @Override // java.lang.Runnable
                public final void run() {
                    ftp.d(iBaseResponseCallback);
                }
            });
        }
    }

    static /* synthetic */ void d(IBaseResponseCallback iBaseResponseCallback) {
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("custom.pressure_adjust_userinfo");
        if (userPreference != null) {
            iBaseResponseCallback.a(0, Boolean.valueOf(d(userPreference.getValue())));
        } else {
            LogUtil.e("PressureMeasureUtils", "hiUserPreferenceBase is null");
            iBaseResponseCallback.a(-1, false);
        }
    }

    private static boolean d(String str) {
        if (!TextUtils.isEmpty(str)) {
            LogUtil.a("PressureMeasureUtils", "isValidAdjustData value :", str);
            HiStressMetaData hiStressMetaDataE = e(str);
            if (hiStressMetaDataE == null) {
                return false;
            }
            int iFetchStressCalibFlag = hiStressMetaDataE.fetchStressCalibFlag();
            int iFetchStressScore = hiStressMetaDataE.fetchStressScore();
            LogUtil.a("PressureMeasureUtils", "calibFlag = ", Integer.valueOf(iFetchStressCalibFlag), "score = ", Integer.valueOf(iFetchStressScore));
            if (iFetchStressCalibFlag == 1 && iFetchStressScore > 0 && iFetchStressScore < 100) {
                return true;
            }
        }
        return false;
    }

    public static HiStressMetaData e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.put("startTime", jSONObject.optLong("startTime", 0L));
            jSONObject.put("endTime", jSONObject.optLong("endTime", 0L));
            return (HiStressMetaData) HiJsonUtil.d(jSONObject.toString(), HiStressMetaData.class);
        } catch (NullPointerException unused) {
            LogUtil.e("PressureMeasureUtils", "adapterJsonAboutTime fromJson nullPointerException.");
            return null;
        } catch (NumberFormatException e) {
            LogUtil.e("PressureMeasureUtils", "adapterJsonAboutTime format exception : ", e.getMessage());
            return null;
        } catch (JSONException unused2) {
            LogUtil.e("PressureMeasureUtils", "adapterJsonAboutTime json exception");
            return null;
        }
    }
}
