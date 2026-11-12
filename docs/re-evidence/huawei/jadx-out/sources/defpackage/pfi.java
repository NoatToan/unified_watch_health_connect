package defpackage;

import android.content.Context;
import android.content.Intent;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.bundle.AppBundlePluginProxy;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.pluginhealthalgorithm.PpgHeartStudyAlgorithmApi;
import health.compact.a.util.LogUtil;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class pfi extends AppBundlePluginProxy<PpgHeartStudyAlgorithmApi> implements PpgHeartStudyAlgorithmApi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile pfi f45274c;
    private PpgHeartStudyAlgorithmApi d;

    private pfi() {
        super("PpgHeartStudyAlgorithmProxy", "PluginHealthAlgorithm", "com.huawei.health.pluginhealthalgorithm.ppgheartstudy.PpgHeartStudyAlgorithmImpl");
        this.d = createPluginApi();
    }

    public static pfi c() {
        pfi pfiVar;
        if (f45274c == null) {
            synchronized (pfi.class) {
                if (f45274c == null) {
                    f45274c = new pfi();
                }
                pfiVar = f45274c;
            }
            return pfiVar;
        }
        return f45274c;
    }

    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    public boolean isPluginAvaiable() {
        return this.d != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void initialize(PpgHeartStudyAlgorithmApi ppgHeartStudyAlgorithmApi) {
        this.d = ppgHeartStudyAlgorithmApi;
    }

    @Override // com.huawei.pluginhealthalgorithm.PpgHeartStudyAlgorithmApi
    public int setProductModelPara(int i, int i2) {
        PpgHeartStudyAlgorithmApi ppgHeartStudyAlgorithmApi = this.d;
        if (ppgHeartStudyAlgorithmApi != null) {
            return ppgHeartStudyAlgorithmApi.setProductModelPara(i, i2);
        }
        loadPlugin();
        return 0;
    }

    @Override // com.huawei.pluginhealthalgorithm.PpgHeartStudyAlgorithmApi
    public int getSqiResult(List<JSONObject> list, int i, int i2) {
        PpgHeartStudyAlgorithmApi ppgHeartStudyAlgorithmApi = this.d;
        if (ppgHeartStudyAlgorithmApi != null) {
            return ppgHeartStudyAlgorithmApi.getSqiResult(list, i, i2);
        }
        loadPlugin();
        return 0;
    }

    @Override // com.huawei.pluginhealthalgorithm.PpgHeartStudyAlgorithmApi
    public JSONObject getDrawData(final List<JSONObject> list, final List<JSONObject> list2, final int i, final int i2) {
        PpgHeartStudyAlgorithmApi ppgHeartStudyAlgorithmApi = this.d;
        if (ppgHeartStudyAlgorithmApi != null) {
            return ppgHeartStudyAlgorithmApi.getDrawData(list, list2, i, i2);
        }
        loadPlugin(new AppBundleLauncher.InstallCallback() { // from class: pfi.3
            @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
            public boolean call(Context context, Intent intent) {
                LogUtil.a("PpgHeartStudyAlgorithmProxy", "load success");
                pfi pfiVar = pfi.this;
                pfiVar.d = (PpgHeartStudyAlgorithmApi) pfiVar.createPluginApi();
                if (pfi.this.d == null) {
                    return false;
                }
                pfi.this.d.getDrawData(list, list2, i, i2);
                return false;
            }
        });
        return new JSONObject();
    }

    @Override // com.huawei.pluginhealthalgorithm.PpgHeartStudyAlgorithmApi
    public void setPpgAccData(String str) {
        PpgHeartStudyAlgorithmApi ppgHeartStudyAlgorithmApi = this.d;
        if (ppgHeartStudyAlgorithmApi != null) {
            ppgHeartStudyAlgorithmApi.setPpgAccData(str);
        } else {
            loadPlugin();
        }
    }

    @Override // com.huawei.pluginhealthalgorithm.PpgHeartStudyAlgorithmApi
    public void startPpgAlgorithm(ResponseCallback responseCallback) {
        PpgHeartStudyAlgorithmApi ppgHeartStudyAlgorithmApi = this.d;
        if (ppgHeartStudyAlgorithmApi != null) {
            ppgHeartStudyAlgorithmApi.startPpgAlgorithm(responseCallback);
        } else {
            loadPlugin();
        }
    }

    @Override // com.huawei.pluginhealthalgorithm.PpgHeartStudyAlgorithmApi
    public void stopPpgAlgorithm() {
        PpgHeartStudyAlgorithmApi ppgHeartStudyAlgorithmApi = this.d;
        if (ppgHeartStudyAlgorithmApi != null) {
            ppgHeartStudyAlgorithmApi.stopPpgAlgorithm();
        } else {
            loadPlugin();
        }
    }

    @Override // com.huawei.pluginhealthalgorithm.PpgHeartStudyAlgorithmApi
    public HiHealthData getPeriodMeasureResult(HiHealthData hiHealthData) {
        PpgHeartStudyAlgorithmApi ppgHeartStudyAlgorithmApi = this.d;
        if (ppgHeartStudyAlgorithmApi != null) {
            ppgHeartStudyAlgorithmApi.getPeriodMeasureResult(hiHealthData);
            return hiHealthData;
        }
        loadPlugin();
        return hiHealthData;
    }
}
