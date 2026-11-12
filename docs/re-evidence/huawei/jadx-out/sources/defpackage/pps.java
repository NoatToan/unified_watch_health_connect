package defpackage;

import android.content.Context;
import android.media.Image;
import com.huawei.haf.bundle.AppBundlePluginProxy;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsport.airopeskipping.AiRopeSkippingApi;
import com.huawei.pluginsport.airopeskipping.OnJumpRopeListenerWrapper;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class pps extends AppBundlePluginProxy<AiRopeSkippingApi> implements AiRopeSkippingApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile pps f45782a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f45783b = "error";
    private static String d = "error";
    private AiRopeSkippingApi e;

    private pps() {
        super("AiRopeSkippingProxy", d, f45783b);
        AiRopeSkippingApi aiRopeSkippingApiCreatePluginApi = createPluginApi();
        this.e = aiRopeSkippingApiCreatePluginApi;
        LogUtil.a("AiRopeSkippingProxy", "the mAiRopeSkippingApi is null :", Boolean.valueOf(aiRopeSkippingApiCreatePluginApi == null));
    }

    public static pps e() {
        pps ppsVar;
        if (f45782a == null) {
            synchronized (pps.class) {
                if (f45782a == null) {
                    a();
                    f45782a = new pps();
                }
                ppsVar = f45782a;
            }
            return ppsVar;
        }
        a();
        return f45782a;
    }

    private static void a() {
        if (pqg.d().getModelType() == 1) {
            f45783b = "com.huawei.sport.airopeskipping4.AiRopeSkippingImpl4";
            d = "AiRopeSkippingMsPlus";
        }
    }

    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    public boolean isPluginAvaiable() {
        return this.e != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void initialize(AiRopeSkippingApi aiRopeSkippingApi) {
        this.e = aiRopeSkippingApi;
    }

    @Override // com.huawei.pluginsport.airopeskipping.AiRopeSkippingApi
    public int initModel(String str, int i, int i2) {
        int iInitModel;
        AiRopeSkippingApi aiRopeSkippingApi = this.e;
        if (aiRopeSkippingApi != null) {
            iInitModel = aiRopeSkippingApi.initModel(str, i, i2);
        } else {
            LogUtil.j("AiRopeSkippingProxy", "the mAiRopeSkippingApi == null, loadPlugin again");
            loadPlugin();
            iInitModel = 0;
        }
        LogUtil.a("AiRopeSkippingProxy", "initModel result: ", Integer.valueOf(iInitModel));
        return iInitModel;
    }

    @Override // com.huawei.pluginsport.airopeskipping.AiRopeSkippingApi
    public int initModel(Context context, int i, int i2) {
        int iInitModel;
        AiRopeSkippingApi aiRopeSkippingApi = this.e;
        if (aiRopeSkippingApi != null) {
            iInitModel = aiRopeSkippingApi.initModel(context, i, i2);
        } else {
            LogUtil.j("AiRopeSkippingProxy", "the mAiRopeSkippingApi == null, loadPlugin again");
            loadPlugin();
            iInitModel = 0;
        }
        LogUtil.a("AiRopeSkippingProxy", "initModel result: ", Integer.valueOf(iInitModel));
        return iInitModel;
    }

    @Override // com.huawei.pluginsport.airopeskipping.AiRopeSkippingApi
    public int setModelInfo(int i, int i2, int i3) {
        int modelInfo;
        AiRopeSkippingApi aiRopeSkippingApi = this.e;
        if (aiRopeSkippingApi != null) {
            modelInfo = aiRopeSkippingApi.setModelInfo(i, i2, i3);
        } else {
            LogUtil.e("AiRopeSkippingProxy", "mAiRopeSkippingApi == null");
            modelInfo = -1;
        }
        LogUtil.a("AiRopeSkippingProxy", "setModelInfo result: ", Integer.valueOf(modelInfo));
        return modelInfo;
    }

    @Override // com.huawei.pluginsport.airopeskipping.AiRopeSkippingApi
    public void setRopeListener(OnJumpRopeListenerWrapper onJumpRopeListenerWrapper) {
        AiRopeSkippingApi aiRopeSkippingApi = this.e;
        if (aiRopeSkippingApi != null) {
            aiRopeSkippingApi.setRopeListener(onJumpRopeListenerWrapper);
        }
    }

    @Override // com.huawei.pluginsport.airopeskipping.AiRopeSkippingApi
    public void setStage(int i) {
        AiRopeSkippingApi aiRopeSkippingApi = this.e;
        if (aiRopeSkippingApi != null) {
            aiRopeSkippingApi.setStage(i);
        }
    }

    @Override // com.huawei.pluginsport.airopeskipping.AiRopeSkippingApi
    public void setImage(Image image) {
        AiRopeSkippingApi aiRopeSkippingApi = this.e;
        if (aiRopeSkippingApi != null) {
            aiRopeSkippingApi.setImage(image);
        }
    }

    @Override // com.huawei.pluginsport.airopeskipping.AiRopeSkippingApi
    public boolean unloadModel() {
        AiRopeSkippingApi aiRopeSkippingApi = this.e;
        if (aiRopeSkippingApi == null) {
            return false;
        }
        boolean zUnloadModel = aiRopeSkippingApi.unloadModel();
        ReleaseLogUtil.d("AiRopeSkippingProxy", "unloadModule result = ", Boolean.valueOf(zUnloadModel));
        return zUnloadModel;
    }

    @Override // com.huawei.pluginsport.airopeskipping.AiRopeSkippingApi
    public boolean reset() {
        AiRopeSkippingApi aiRopeSkippingApi = this.e;
        if (aiRopeSkippingApi == null) {
            return false;
        }
        boolean zReset = aiRopeSkippingApi.reset();
        ReleaseLogUtil.d("AiRopeSkippingProxy", "unloadModule reset = ", Boolean.valueOf(zReset));
        return zReset;
    }

    public List<String> c() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add("AiRopeSkippingMsPlus");
        arrayList.remove(d);
        return arrayList;
    }

    public int d() {
        int modelType = pqg.d().getModelType();
        LogUtil.a("AiRopeSkippingProxy", "the sModelType: ", Integer.valueOf(modelType));
        return modelType;
    }
}
