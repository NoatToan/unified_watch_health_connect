package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsport.helper.AbsAiModelConfigHelper;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class pqg extends AbsAiModelConfigHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile pqg f45827a;
    private static final Set<String> d = new HashSet<String>() { // from class: pqg.2
        {
            add("Xiaomi");
            add("HUAWEI");
            add("HONOR");
            add("Redmi");
        }
    };
    private static final Set<String> e = new HashSet<String>() { // from class: pqg.5
        {
            add("lahaina");
            add("msmnile");
            add("kona");
            add("lito");
        }
    };

    private pqg() {
        super("aiRopeSkippingConfig");
    }

    public static pqg d() {
        if (f45827a == null) {
            synchronized (pqg.class) {
                if (f45827a == null) {
                    f45827a = new pqg();
                }
            }
        }
        return f45827a;
    }

    @Override // com.huawei.pluginsport.helper.AbsAiModelConfigHelper
    public void initDefaultConfig() {
        LogUtil.j("AiRopeSkippingConfigHelper", "use the default configuration.");
        setQuaSupportBrand(d);
        setQuaSupportCpuPlatform(e);
    }

    @Override // com.huawei.pluginsport.helper.AbsAiModelConfigHelper
    public int getModelType() {
        return super.getModelType();
    }
}
