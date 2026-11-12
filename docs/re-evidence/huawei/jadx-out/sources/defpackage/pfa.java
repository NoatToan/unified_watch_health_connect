package defpackage;

import com.huawei.haf.bundle.AppBundlePluginProxy;
import com.huawei.pluginhealthalgorithm.EcgFilterAlgorithmApi;

/* JADX INFO: loaded from: classes41.dex */
public class pfa extends AppBundlePluginProxy<EcgFilterAlgorithmApi> implements EcgFilterAlgorithmApi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile pfa f45263b;
    private EcgFilterAlgorithmApi e;

    private pfa() {
        super("EcgFilterAlgorithmProxy", "PluginHealthAlgorithm", "com.huawei.health.pluginhealthalgorithm.ecgfilter.EcgFilterAlgorithmIml");
        this.e = createPluginApi();
    }

    public static pfa b() {
        pfa pfaVar;
        if (f45263b == null) {
            synchronized (pfa.class) {
                if (f45263b == null) {
                    f45263b = new pfa();
                }
                pfaVar = f45263b;
            }
            return pfaVar;
        }
        return f45263b;
    }

    @Override // com.huawei.pluginhealthalgorithm.EcgFilterAlgorithmApi
    public String getVersion() {
        EcgFilterAlgorithmApi ecgFilterAlgorithmApi = this.e;
        if (ecgFilterAlgorithmApi != null) {
            return ecgFilterAlgorithmApi.getVersion();
        }
        loadPlugin();
        return "";
    }

    @Override // com.huawei.pluginhealthalgorithm.EcgFilterAlgorithmApi
    public int ecgFilterInit(int i) {
        EcgFilterAlgorithmApi ecgFilterAlgorithmApi = this.e;
        if (ecgFilterAlgorithmApi != null) {
            return ecgFilterAlgorithmApi.ecgFilterInit(i);
        }
        loadPlugin();
        return 0;
    }

    @Override // com.huawei.pluginhealthalgorithm.EcgFilterAlgorithmApi
    public String getEcgAlgorithmResult(String str, int i) {
        EcgFilterAlgorithmApi ecgFilterAlgorithmApi = this.e;
        if (ecgFilterAlgorithmApi != null) {
            return ecgFilterAlgorithmApi.getEcgAlgorithmResult(str, i);
        }
        loadPlugin();
        return "";
    }

    @Override // com.huawei.pluginhealthalgorithm.EcgFilterAlgorithmApi
    public String getEcgSaveResult() {
        EcgFilterAlgorithmApi ecgFilterAlgorithmApi = this.e;
        if (ecgFilterAlgorithmApi != null) {
            return ecgFilterAlgorithmApi.getEcgSaveResult();
        }
        loadPlugin();
        return "";
    }

    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    public boolean isPluginAvaiable() {
        return this.e != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void initialize(EcgFilterAlgorithmApi ecgFilterAlgorithmApi) {
        this.e = ecgFilterAlgorithmApi;
    }
}
