package defpackage;

import com.huawei.unitedevice.config.IwearLinkConfig;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class xgx {
    private static volatile IwearLinkConfig e;

    public static IwearLinkConfig d() {
        IwearLinkConfig iwearLinkConfig = e;
        Objects.nonNull(iwearLinkConfig);
        if (iwearLinkConfig != null) {
            return e;
        }
        return e.d;
    }

    public static void a(IwearLinkConfig iwearLinkConfig) {
        e = iwearLinkConfig;
    }

    /* JADX INFO: loaded from: classes20.dex */
    static class e implements IwearLinkConfig {
        private static IwearLinkConfig d = new e();

        private e() {
        }
    }
}
