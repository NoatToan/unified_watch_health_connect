package defpackage;

import android.content.Context;
import com.huawei.health.basesport.wearengine.SportBaseEngineManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.maps.offlinedata.health.p2p.OfflineMapWearEngineManager;
import com.huawei.unitedevice.constant.WearEngineModule;

/* JADX INFO: loaded from: classes10.dex */
public class jyb extends SportBaseEngineManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile jyb f39198c;
    private static final Object d = new Object();

    protected jyb(Context context) {
        super(context);
    }

    public static jyb e() {
        jyb jybVar;
        synchronized (d) {
            LogUtil.a("Track_HiWearEngineTrackManager", "getInstance()");
            if (f39198c == null) {
                f39198c = new jyb(BaseApplication.getContext());
            }
            jybVar = f39198c;
        }
        return jybVar;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public WearEngineModule getManagerModule() {
        return WearEngineModule.MOTION_TRACK_MODULE;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearPkgName() {
        return "in.huawei.fitness";
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearFingerprint() {
        return OfflineMapWearEngineManager.WEAR_FINGERPRINT;
    }

    @Override // com.huawei.health.basesport.wearengine.SportBaseEngineManager
    public String getTag() {
        return "Track_HiWearEngineTrackManager";
    }

    @Override // com.huawei.health.basesport.wearengine.SportBaseEngineManager, com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onDestroy() {
        super.onDestroy();
    }
}
