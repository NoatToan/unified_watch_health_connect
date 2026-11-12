package defpackage;

import com.huawei.haf.bundle.AppBundlePluginProxy;
import com.huawei.pluginhealthalgorithm.MenstrualAlgorithmApi;

/* JADX INFO: loaded from: classes14.dex */
public class pez extends AppBundlePluginProxy<MenstrualAlgorithmApi> implements MenstrualAlgorithmApi {
    private static volatile pez e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MenstrualAlgorithmApi f45261b;

    private pez() {
        super("PpgHeartStudyAlgorithmProxy", "PluginHealthAlgorithm", "com.huawei.health.pluginhealthalgorithm.menstrual.MenstrualAlgorithmImpl");
        this.f45261b = createPluginApi();
    }

    public static pez d() {
        pez pezVar;
        if (e == null) {
            synchronized (pez.class) {
                if (e == null) {
                    e = new pez();
                }
                pezVar = e;
            }
            return pezVar;
        }
        return e;
    }

    @Override // com.huawei.pluginhealthalgorithm.MenstrualAlgorithmApi
    public String predict(String str) {
        MenstrualAlgorithmApi menstrualAlgorithmApi = this.f45261b;
        if (menstrualAlgorithmApi != null) {
            return menstrualAlgorithmApi.predict(str);
        }
        loadPlugin();
        return "";
    }

    @Override // com.huawei.pluginhealthalgorithm.MenstrualAlgorithmApi
    public String editPredict(String str) {
        MenstrualAlgorithmApi menstrualAlgorithmApi = this.f45261b;
        if (menstrualAlgorithmApi != null) {
            return menstrualAlgorithmApi.editPredict(str);
        }
        loadPlugin();
        return "";
    }

    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    public boolean isPluginAvaiable() {
        return this.f45261b != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void initialize(MenstrualAlgorithmApi menstrualAlgorithmApi) {
        this.f45261b = menstrualAlgorithmApi;
    }
}
