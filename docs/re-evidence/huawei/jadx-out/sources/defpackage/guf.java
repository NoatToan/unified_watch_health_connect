package defpackage;

import android.webkit.JavascriptInterface;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSportStatDataAggregateOption;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.operation.utils.Constants;
import health.compact.a.LogUtil;
import health.compact.a.SharedPreferenceManager;
import java.math.BigDecimal;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class guf extends JsBaseModule {
    private double d = 0.0d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f36042c = 0.0d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f36041b = 0.0d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f36040a = {42053, 42054, 42103, 42104, 42153, 42154};
    private String[] e = {"WALK_CALORIES_SUM", "WALK_DURATION_SUM", "RUN_CALORIES_SUM", "RUN_DURATION_SUM", "RIDE_CALORIES_SUM", "RIDE_DURATION_SUM"};

    @JavascriptInterface
    public void getSportsEnergy(final long j) {
        LogUtil.b(this.TAG, "==getSportsEnergy==");
        HiSportStatDataAggregateOption hiSportStatDataAggregateOption = new HiSportStatDataAggregateOption();
        hiSportStatDataAggregateOption.setGroupUnitType(6);
        hiSportStatDataAggregateOption.setReadType(0);
        hiSportStatDataAggregateOption.setConstantsKey(this.e);
        hiSportStatDataAggregateOption.setType(this.f36040a);
        hiSportStatDataAggregateOption.setAggregateType(1);
        hiSportStatDataAggregateOption.setTimeRange(0L, System.currentTimeMillis());
        hiSportStatDataAggregateOption.setCount(1);
        HiHealthManager.d(this.mContext).aggregateSportStatData(hiSportStatDataAggregateOption, new HiAggregateListener() { // from class: guf.3
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i, int i2) {
                if (list != null && list.size() > 0) {
                    HiHealthData hiHealthData = list.get(0);
                    double d = hiHealthData.getDouble("RUN_DURATION_SUM");
                    double d2 = hiHealthData.getDouble("RUN_CALORIES_SUM");
                    if (d != 0.0d && d2 != 0.0d) {
                        guf.this.d = ((d2 / 1000.0d) * 10.0d) / (d / 60000.0d);
                    }
                    double d3 = hiHealthData.getDouble("WALK_DURATION_SUM");
                    double d4 = hiHealthData.getDouble("WALK_CALORIES_SUM");
                    if (d3 != 0.0d && d4 != 0.0d) {
                        guf.this.f36042c = ((d4 / 1000.0d) * 10.0d) / (d3 / 60000.0d);
                    }
                    double d5 = hiHealthData.getDouble("RIDE_DURATION_SUM");
                    double d6 = hiHealthData.getDouble("RIDE_CALORIES_SUM");
                    if (d5 != 0.0d && d6 != 0.0d) {
                        guf.this.f36041b = ((d6 / 1000.0d) * 10.0d) / (d5 / 60000.0d);
                    }
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    guf gufVar = guf.this;
                    jSONObject.put(Constants.RIDE, gufVar.d(gufVar.f36041b));
                    guf gufVar2 = guf.this;
                    jSONObject.put("run", gufVar2.d(gufVar2.d));
                    guf gufVar3 = guf.this;
                    jSONObject.put("walk", gufVar3.d(gufVar3.f36042c));
                } catch (JSONException e) {
                    LogUtil.d(guf.this.TAG, "getSportsEnergy JSONException: ", ExceptionUtils.c(e));
                }
                LogUtil.b(guf.this.TAG, "getSportsEnergy jsonResult:", jSONObject.toString());
                guf.this.onSuccessCallback(j, jSONObject.toString());
            }
        });
    }

    @JavascriptInterface
    public void getImgBase64Encode(long j) {
        String str;
        LogUtil.b(this.TAG, "==getImgBase64Encode==");
        String strC = gup.c(qqf.f(gup.f36056c));
        if (strC == null) {
            LogUtil.d(this.TAG, "getImgBase64Encode encodeStr is null");
            str = "";
        } else {
            LogUtil.b(this.TAG, "getImgBase64Encode success");
            str = "data:image/jpeg;base64," + strC;
        }
        onSuccessCallback(j, str);
    }

    @JavascriptInterface
    public void isTrialUseFinish(long j) {
        LogUtil.b(this.TAG, "==isTrialUseFinish==");
        onSuccessCallback(j, Boolean.valueOf(SharedPreferenceManager.b("nutritionTableOcr", "isTrialUseFinish", false)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double d(double d) {
        return new BigDecimal(d).setScale(2, 4).doubleValue();
    }
}
