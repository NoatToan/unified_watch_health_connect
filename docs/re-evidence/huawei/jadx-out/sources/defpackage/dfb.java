package defpackage;

import android.content.Context;
import com.huawei.health.basesport.wearengine.SportBaseEngineManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.maps.offlinedata.health.p2p.OfflineMapWearEngineManager;
import com.huawei.unitedevice.constant.WearEngineModule;

/* JADX INFO: loaded from: classes7.dex */
public class dfb extends SportBaseEngineManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f31728b = new Object();
    private static volatile dfb e;

    private dfb(Context context) {
        super(context);
    }

    @Override // com.huawei.health.basesport.wearengine.SportBaseEngineManager
    public String getTag() {
        return "Suggestion_HiWearEngineFitnessManager";
    }

    public static dfb a() {
        dfb dfbVar;
        synchronized (f31728b) {
            LogUtil.a("Suggestion_HiWearEngineFitnessManager", "getInstance()");
            if (e == null) {
                e = new dfb(BaseApplication.getContext());
            }
            dfbVar = e;
        }
        return dfbVar;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public WearEngineModule getManagerModule() {
        return WearEngineModule.FITNESS_MODULE;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearPkgName() {
        return "in.huawei.fitness";
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearFingerprint() {
        return OfflineMapWearEngineManager.WEAR_FINGERPRINT;
    }
}
