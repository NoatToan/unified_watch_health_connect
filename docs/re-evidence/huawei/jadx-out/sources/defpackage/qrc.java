package defpackage;

import android.text.TextUtils;
import com.braintreepayments.api.PayPalCheckoutRequest;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.ReflectionUtils;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes43.dex */
public class qrc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class<?> f46692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class<?> f46693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Method f46694c;
    private static final Method d;
    private static final Class<?> e;
    private static final Method f;
    private static final Method i;

    static {
        Class<?> clsB = ReflectionUtils.b("android.util.IMonitor");
        e = clsB;
        Class<?> clsB2 = ReflectionUtils.b("android.util.IMonitorEventStreamImpl");
        f46693b = clsB2;
        f46692a = ReflectionUtils.b("android.util.IMonitorKeys");
        i = clsB != null ? ReflectionUtils.b(clsB, "openEventStream", (Class<?>[]) new Class[]{Integer.TYPE}) : null;
        d = clsB2 != null ? ReflectionUtils.b(clsB2, "close", (Class<?>[]) new Class[0]) : null;
        f46694c = clsB2 != null ? ReflectionUtils.b(clsB2, PayPalCheckoutRequest.USER_ACTION_COMMIT, (Class<?>[]) new Class[0]) : null;
        f = clsB2 != null ? ReflectionUtils.b(clsB2, "setParam", (Class<?>[]) new Class[]{Short.TYPE, Integer.TYPE}) : null;
    }

    public static Object a(int i2) {
        Method method = i;
        if (method == null) {
            LogUtil.e("ReflectionIMonitor", "openEventStream failed, cause METHOD_OPEN_EVENT_STREAM is null!");
            return null;
        }
        try {
            return ReflectionUtils.e(method, (Object) null, Integer.valueOf(i2));
        } catch (UnsupportedOperationException e2) {
            LogUtil.e("ReflectionIMonitor", "openEventStream get exception:", e2.getMessage());
            return null;
        }
    }

    public static void b(Object obj) {
        if (obj == null) {
            LogUtil.e("ReflectionIMonitor", "closeEventStream failed, cause stream is null!");
            return;
        }
        Method method = d;
        if (method == null) {
            LogUtil.e("ReflectionIMonitor", "closeEventStream failed, cause METHOD_CLOSE is null!");
            return;
        }
        try {
            ReflectionUtils.e(method, obj, new Object[0]);
        } catch (UnsupportedOperationException e2) {
            LogUtil.e("ReflectionIMonitor", "closeEventStream get exception: ", e2.getMessage());
        }
    }

    public static boolean a(Object obj) {
        if (obj == null) {
            LogUtil.e("ReflectionIMonitor", "sendEvent failed, cause stream is null!");
            return false;
        }
        Method method = f46694c;
        if (method == null) {
            LogUtil.e("ReflectionIMonitor", "closeEventStream failed, cause METHOD_COMMIT is null!");
            return false;
        }
        try {
            return ((Boolean) ReflectionUtils.e(method, obj, new Object[0])).booleanValue();
        } catch (UnsupportedOperationException e2) {
            LogUtil.e("ReflectionIMonitor", "sendEvent get exception:", e2.getMessage());
            return false;
        }
    }

    public static void c(Object obj, short s, int i2) {
        if (obj == null) {
            LogUtil.e("ReflectionIMonitor", "setParam failed, cause stream is null!");
            return;
        }
        Method method = f;
        if (method == null) {
            LogUtil.e("ReflectionIMonitor", "closeEventStream failed, cause METHOD_SET_PARAM_INT is null!");
            return;
        }
        try {
            ReflectionUtils.e(method, obj, Short.valueOf(s), Integer.valueOf(i2));
        } catch (UnsupportedOperationException e2) {
            LogUtil.e("ReflectionIMonitor", "setParam get exception:", e2.getMessage());
        }
    }

    public static short e(String str) {
        Class<?> cls;
        if (TextUtils.isEmpty(str) || (cls = f46692a) == null) {
            return (short) -1;
        }
        Object objB = ReflectionUtils.b(cls, str);
        if (objB instanceof Number) {
            return ((Short) objB).shortValue();
        }
        LogUtil.e("ReflectionIMonitor", "getIMonitorKey failed, cause filedValue is not instance of Number!");
        return (short) -1;
    }
}
