package defpackage;

import com.huawei.devicesdk.entity.ConnectMode;
import com.huawei.devicesdk.entity.ScanMode;
import com.huawei.devicesdk.entity.SendMode;
import health.compact.a.LogUtil;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class cof<T, U> {
    public U d(T t) {
        if (t == null) {
            return null;
        }
        try {
            Map<T, String> mapB = b(t);
            if (mapB == null) {
                return null;
            }
            return (U) Class.forName(mapB.get(t)).newInstance();
        } catch (ClassNotFoundException unused) {
            LogUtil.d("StrategyFactory", "StrategyFactory ClassNotFoundException");
            return null;
        } catch (IllegalAccessException unused2) {
            LogUtil.d("StrategyFactory", "StrategyFactory IllegalAccessException");
            return null;
        } catch (InstantiationException unused3) {
            LogUtil.d("StrategyFactory", "StrategyFactory InstantiationException");
            return null;
        }
    }

    private Map<T, String> b(T t) {
        if (t instanceof ScanMode) {
            return (Map<T, String>) cjx.b();
        }
        if (t instanceof ConnectMode) {
            return (Map<T, String>) cjx.d();
        }
        if (t instanceof SendMode) {
            return (Map<T, String>) cjx.c();
        }
        LogUtil.d("StrategyFactory", "StrategyFactory getStrategyConfigMap null");
        return null;
    }
}
