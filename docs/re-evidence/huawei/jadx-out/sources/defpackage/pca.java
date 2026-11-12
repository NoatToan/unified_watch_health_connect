package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;
import com.huawei.aifitness.bodyrebuild.bean.MeasureBean;
import com.huawei.aifitness.bodyrebuild.bean.PreTreatBean;
import com.huawei.aifitness.bodyrebuild.listener.OnCodeListener;
import com.huawei.aifitness.bodyrebuild.listener.OnSensorListener;
import com.huawei.aifitness.bodyrebuild.listener.OnViewTransformListener;
import com.huawei.haf.bundle.AppBundlePluginProxy;
import com.huawei.health.h5pro.jsbridge.base.JsModuleBase;
import com.huawei.pluginbodyrebuild.BodyShapeAnalysisAlgorithmApi;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes41.dex */
public class pca extends AppBundlePluginProxy<BodyShapeAnalysisAlgorithmApi> implements BodyShapeAnalysisAlgorithmApi {
    private static volatile pca d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BodyShapeAnalysisAlgorithmApi f45135c;

    private pca() {
        super("BodyShapeAnalysisAlgorithmProxy", "PluginBodyRebuild", "com.huawei.health.pluginbodyrebuild.impl.BodyShapeAnalysisAlgorithmIml");
        LogUtil.a("BodyShapeAnalysisAlgorithmProxy", "createPluginApi");
        this.f45135c = createPluginApi();
    }

    public static pca d() {
        pca pcaVar;
        if (d == null) {
            synchronized (pca.class) {
                if (d == null) {
                    d = new pca();
                }
                pcaVar = d;
            }
            return pcaVar;
        }
        return d;
    }

    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    public boolean isPluginAvaiable() {
        return this.f45135c != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void initialize(BodyShapeAnalysisAlgorithmApi bodyShapeAnalysisAlgorithmApi) {
        this.f45135c = bodyShapeAnalysisAlgorithmApi;
    }

    @Override // com.huawei.pluginbodyrebuild.BodyShapeAnalysisAlgorithmApi
    public void setCodeListener(OnCodeListener onCodeListener) {
        if (isPluginAvaiable()) {
            this.f45135c.setCodeListener(onCodeListener);
        } else {
            loadPlugin();
        }
    }

    @Override // com.huawei.pluginbodyrebuild.BodyShapeAnalysisAlgorithmApi
    public void setCurStep(int i) {
        if (isPluginAvaiable()) {
            this.f45135c.setCurStep(i);
        } else {
            loadPlugin();
        }
    }

    @Override // com.huawei.pluginbodyrebuild.BodyShapeAnalysisAlgorithmApi
    public MeasureBean getMeasureByWeight(MeasureBean measureBean, float f, float f2, int i, float f3) {
        if (isPluginAvaiable()) {
            return this.f45135c.getMeasureByWeight(measureBean, f, f2, i, f3);
        }
        loadPlugin();
        return null;
    }

    @Override // com.huawei.pluginbodyrebuild.BodyShapeAnalysisAlgorithmApi
    public void registerSensor(Context context, OnSensorListener onSensorListener) {
        if (isPluginAvaiable()) {
            this.f45135c.registerSensor(context, onSensorListener);
        } else {
            loadPlugin();
        }
    }

    @Override // com.huawei.pluginbodyrebuild.BodyShapeAnalysisAlgorithmApi
    public void unregisterSensor(Context context) {
        if (isPluginAvaiable()) {
            this.f45135c.unregisterSensor(context);
        } else {
            loadPlugin();
        }
    }

    @Override // com.huawei.pluginbodyrebuild.BodyShapeAnalysisAlgorithmApi
    public PreTreatBean preTreatImg(Bitmap bitmap, float[] fArr, int i, int i2) {
        if (isPluginAvaiable()) {
            return this.f45135c.preTreatImg(bitmap, fArr, i, i2);
        }
        loadPlugin();
        return null;
    }

    @Override // com.huawei.pluginbodyrebuild.BodyShapeAnalysisAlgorithmApi
    public int initModel(Context context, int i, int i2) {
        if (isPluginAvaiable()) {
            return this.f45135c.initModel(context, i, i2);
        }
        LogUtil.a("BodyShapeAnalysisAlgorithmProxy", "initModel pluginApi not available");
        loadPlugin();
        return -10;
    }

    @Override // com.huawei.pluginbodyrebuild.BodyShapeAnalysisAlgorithmApi
    public void setImage(Image image) {
        if (isPluginAvaiable()) {
            this.f45135c.setImage(image);
        } else {
            loadPlugin();
        }
    }

    @Override // com.huawei.pluginbodyrebuild.BodyShapeAnalysisAlgorithmApi
    public void unloadModel() {
        if (isPluginAvaiable()) {
            this.f45135c.unloadModel();
        } else {
            loadPlugin();
        }
    }

    @Override // com.huawei.pluginbodyrebuild.BodyShapeAnalysisAlgorithmApi
    public void setModelInfo(int i, int i2, int i3) {
        if (isPluginAvaiable()) {
            this.f45135c.setModelInfo(i, i2, i3);
        } else {
            loadPlugin();
        }
    }

    @Override // com.huawei.pluginbodyrebuild.BodyShapeAnalysisAlgorithmApi
    public Class<? extends JsModuleBase> getBodyShapeAnalysisJsApi(String str) {
        if (isPluginAvaiable()) {
            return this.f45135c.getBodyShapeAnalysisJsApi(str);
        }
        LogUtil.a("BodyShapeAnalysisAlgorithmProxy", "getCommonJsModule loadPlugin");
        loadPlugin();
        return JsModuleBase.class;
    }

    @Override // com.huawei.pluginbodyrebuild.BodyShapeAnalysisAlgorithmApi
    public void setViewTransformListener(OnViewTransformListener onViewTransformListener) {
        if (isPluginAvaiable()) {
            this.f45135c.setViewTransformListener(onViewTransformListener);
        } else {
            loadPlugin();
        }
    }

    @Override // com.huawei.pluginbodyrebuild.BodyShapeAnalysisAlgorithmApi
    public void setTransformView(Bitmap bitmap) {
        if (isPluginAvaiable()) {
            this.f45135c.setTransformView(bitmap);
        } else {
            loadPlugin();
        }
    }
}
