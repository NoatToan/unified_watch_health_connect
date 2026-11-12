package defpackage;

import android.content.Context;
import android.media.Image;
import androidx.collection.SimpleArrayMap;
import com.huawei.haf.bundle.AppBundlePluginProxy;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsport.aiforwardflex.AiForwardFlexApi;
import com.huawei.pluginsport.aiforwardflex.OnSportCodeListenerWrapper;
import com.huawei.pluginsport.aiforwardflex.OnSportSkeletonListenerWrapper;

/* JADX INFO: loaded from: classes15.dex */
public class ppq extends AppBundlePluginProxy<AiForwardFlexApi> implements AiForwardFlexApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f45778a = "PluginAiBodyPoseAlgorithm";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f45779c = "com.huawei.health.sport.bodypose.forwardflex.AiForwardFlexImpl";
    private static volatile ppq d;
    private AiForwardFlexApi e;

    private ppq() {
        super("AiForwardFlexProxy", f45778a, f45779c);
        AiForwardFlexApi aiForwardFlexApiCreatePluginApi = createPluginApi();
        this.e = aiForwardFlexApiCreatePluginApi;
        LogUtil.a("AiForwardFlexProxy", "the mAiForwardFlexApi is null :", Boolean.valueOf(aiForwardFlexApiCreatePluginApi == null));
    }

    public static ppq c() {
        ppq ppqVar;
        if (d == null) {
            synchronized (ppq.class) {
                if (d == null) {
                    d = new ppq();
                }
                ppqVar = d;
            }
            return ppqVar;
        }
        return d;
    }

    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    public boolean isPluginAvaiable() {
        return this.e != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void initialize(AiForwardFlexApi aiForwardFlexApi) {
        this.e = aiForwardFlexApi;
    }

    @Override // com.huawei.pluginsport.aiforwardflex.AiForwardFlexApi
    public void setExamType(int i) {
        LogUtil.a("AiForwardFlexProxy", "setExamType:", Integer.valueOf(i));
        AiForwardFlexApi aiForwardFlexApi = this.e;
        if (aiForwardFlexApi != null) {
            aiForwardFlexApi.setExamType(i);
        } else {
            loadPlugin();
        }
    }

    @Override // com.huawei.pluginsport.aiforwardflex.AiForwardFlexApi
    public int initModel(Context context, int i, int i2) {
        int iInitModel;
        AiForwardFlexApi aiForwardFlexApi = this.e;
        if (aiForwardFlexApi != null) {
            iInitModel = aiForwardFlexApi.initModel(context, i, i2);
        } else {
            loadPlugin();
            iInitModel = -1;
        }
        LogUtil.a("AiForwardFlexProxy", "initModel:", Integer.valueOf(iInitModel));
        return iInitModel;
    }

    @Override // com.huawei.pluginsport.aiforwardflex.AiForwardFlexApi
    public int setModelInfo(int i, int i2, int i3) {
        int modelInfo;
        AiForwardFlexApi aiForwardFlexApi = this.e;
        if (aiForwardFlexApi != null) {
            modelInfo = aiForwardFlexApi.setModelInfo(i, i2, i3);
        } else {
            loadPlugin();
            modelInfo = -1;
        }
        LogUtil.a("AiForwardFlexProxy", "setModelInfo:", Integer.valueOf(modelInfo));
        return modelInfo;
    }

    @Override // com.huawei.pluginsport.aiforwardflex.AiForwardFlexApi
    public void setSportCodeListener(OnSportCodeListenerWrapper onSportCodeListenerWrapper) {
        LogUtil.a("AiForwardFlexProxy", "setSportCodeListener");
        AiForwardFlexApi aiForwardFlexApi = this.e;
        if (aiForwardFlexApi != null) {
            aiForwardFlexApi.setSportCodeListener(onSportCodeListenerWrapper);
        } else {
            loadPlugin();
        }
    }

    @Override // com.huawei.pluginsport.aiforwardflex.AiForwardFlexApi
    public void setSkeletonListener(OnSportSkeletonListenerWrapper onSportSkeletonListenerWrapper) {
        LogUtil.a("AiForwardFlexProxy", "setSkeletonListener");
        AiForwardFlexApi aiForwardFlexApi = this.e;
        if (aiForwardFlexApi != null) {
            aiForwardFlexApi.setSkeletonListener(onSportSkeletonListenerWrapper);
        } else {
            loadPlugin();
        }
    }

    @Override // com.huawei.pluginsport.aiforwardflex.AiForwardFlexApi
    public void setImage(Image image) {
        AiForwardFlexApi aiForwardFlexApi = this.e;
        if (aiForwardFlexApi != null) {
            aiForwardFlexApi.setImage(image);
        } else {
            loadPlugin();
        }
    }

    @Override // com.huawei.pluginsport.aiforwardflex.AiForwardFlexApi
    public void setExamStage(int i) {
        AiForwardFlexApi aiForwardFlexApi = this.e;
        if (aiForwardFlexApi != null) {
            aiForwardFlexApi.setExamStage(i);
        } else {
            loadPlugin();
        }
    }

    @Override // com.huawei.pluginsport.aiforwardflex.AiForwardFlexApi
    public boolean unloadModel() {
        boolean zUnloadModel;
        AiForwardFlexApi aiForwardFlexApi = this.e;
        if (aiForwardFlexApi != null) {
            zUnloadModel = aiForwardFlexApi.unloadModel();
        } else {
            loadPlugin();
            zUnloadModel = false;
        }
        LogUtil.a("AiForwardFlexProxy", "unLoadModel:", Boolean.valueOf(zUnloadModel));
        return zUnloadModel;
    }

    @Override // com.huawei.pluginsport.aiforwardflex.AiForwardFlexApi
    public int setSurfaceRotation(int i) {
        int surfaceRotation;
        AiForwardFlexApi aiForwardFlexApi = this.e;
        if (aiForwardFlexApi != null) {
            surfaceRotation = aiForwardFlexApi.setSurfaceRotation(i);
        } else {
            loadPlugin();
            surfaceRotation = 0;
        }
        LogUtil.a("AiForwardFlexProxy", "setSurfaceRotation result:", Integer.valueOf(surfaceRotation));
        return surfaceRotation;
    }

    @Override // com.huawei.pluginsport.aiforwardflex.AiForwardFlexApi
    public void setValue(SimpleArrayMap<String, Object> simpleArrayMap) {
        AiForwardFlexApi aiForwardFlexApi = this.e;
        if (aiForwardFlexApi != null) {
            aiForwardFlexApi.setValue(simpleArrayMap);
        } else {
            loadPlugin();
        }
    }
}
