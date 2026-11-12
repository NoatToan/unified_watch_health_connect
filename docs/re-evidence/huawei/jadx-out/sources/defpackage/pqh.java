package defpackage;

import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.PhoneInfoUtils;
import com.huawei.pluginsport.helper.AbsAiModelConfigHelper;
import health.compact.a.CommonUtil;
import health.compact.a.HarmonyBuild;
import health.compact.a.ReleaseLogUtil;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes15.dex */
public class pqh extends AbsAiModelConfigHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile pqh f45828a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set<String> f45830c = new HashSet<String>() { // from class: pqh.5
        {
            add("HUAWEI");
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<String> f45829b = new HashSet<String>() { // from class: pqh.1
        {
            add("lahaina");
            add("kona");
            add("taro");
        }
    };
    private static final Set<String> e = new HashSet<String>() { // from class: pqh.4
        {
            add("kirin810");
        }
    };
    private static final Set<String> d = new HashSet<String>() { // from class: pqh.3
        {
            add("OCE-AN10");
            add("NOH-AL00");
            add("NOH-AL10");
            add("NOH-AN00");
            add("NOH-AN01");
            add("NOP-AN00");
            add("TAS-AL00");
            add("TAS-AN00");
            add("LIO-AL00");
            add("LIO-AN00");
            add("LIO-AN00P");
            add("ANA-AL00");
            add("ANA-AN00");
            add("ANA-TN00");
            add("ELS-AN00");
            add("ELS-TN00");
            add("ELS-AN10");
            add("ELS-TN10");
        }
    };

    private pqh() {
        super("aiFitnessSportConfig");
    }

    public static pqh b() {
        if (f45828a == null) {
            synchronized (pqh.class) {
                if (f45828a == null) {
                    f45828a = new pqh();
                }
            }
        }
        return f45828a;
    }

    @Override // com.huawei.pluginsport.helper.AbsAiModelConfigHelper
    public int getQuaModelType() {
        return getAiModel().d() ? -1 : 2;
    }

    @Override // com.huawei.pluginsport.helper.AbsAiModelConfigHelper
    public int getKirModelType(int i) {
        return (getAiModel().d() || c() || i < 300) ? -1 : 3;
    }

    @Override // com.huawei.pluginsport.helper.AbsAiModelConfigHelper
    public void initDefaultConfig() {
        LogUtil.j("AiFitnessSportConfigHelper", "use the default configuration.");
        setQuaSupportBrand(f45830c);
        setQuaSupportCpuPlatform(f45829b);
        setDefaultDeviceModel(d);
    }

    @Override // com.huawei.pluginsport.helper.AbsAiModelConfigHelper
    public int getModelType() {
        if (!a() || qrs.ah(BaseApplication.b())) {
            return -1;
        }
        if (CommonUtil.bu()) {
            String deviceModel = PhoneInfoUtils.getDeviceModel();
            ReleaseLogUtil.c("AiFitnessSportConfigHelper", "currentModel: ", deviceModel);
            if (!getDeviceModel().contains(deviceModel.toUpperCase())) {
                return -1;
            }
            LogUtil.a("AiFitnessSportConfigHelper", "DeviceModel contains ", deviceModel);
            return super.getModelType();
        }
        return super.getModelType();
    }

    private boolean a() {
        if (!HarmonyBuild.e) {
            LogUtil.j("AiFitnessSportConfigHelper", "is not harmonyOS, not support");
            return false;
        }
        String str = HarmonyBuild.f36561a;
        int modelType = super.getModelType();
        LogUtil.a("AiFitnessSportConfigHelper", "harmonyVersion = ", str, ", modelType = ", Integer.valueOf(modelType));
        if (!str.startsWith("2") || modelType != 2) {
            return true;
        }
        LogUtil.j("AiFitnessSportConfigHelper", "is harmonyOS 2 with Qua, not support");
        return false;
    }

    private boolean c() {
        String strF = CommonUtil.f();
        if (TextUtils.isEmpty(strF)) {
            ReleaseLogUtil.d("AiFitnessSportConfigHelper", "cannot get cpuPlatform for kirin");
            return true;
        }
        LogUtil.a("AiFitnessSportConfigHelper", "isInBlockCpuList kirinCpuPlatform ", strF);
        boolean zContains = e.contains(strF);
        ReleaseLogUtil.d("AiFitnessSportConfigHelper", "isInBlockCpuList isNotSupportCpu ", Boolean.valueOf(zContains));
        return zContains;
    }
}
