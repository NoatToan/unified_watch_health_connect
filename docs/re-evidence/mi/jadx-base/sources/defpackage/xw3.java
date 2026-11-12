package defpackage;

import com.miui.circulate.api.bean.CirculateParam;
import com.miui.circulate.api.exception.CirculateException;
import com.miui.circulate.api.service.CirculateDeviceInfo;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface xw3 {
    void a(List<CirculateDeviceInfo> list, List<CirculateDeviceInfo> list2, CirculateParam circulateParam) throws CirculateException;

    void b(dy6 dy6Var) throws CirculateException;

    void c(dy6 dy6Var, Executor executor) throws CirculateException;

    default CirculateDeviceInfo d() {
        return null;
    }

    default hyc e(int i) throws CirculateException {
        return null;
    }

    void f(List<Integer> list);

    void g(List<Integer> list) throws CirculateException;

    default void h(dy6 dy6Var) throws CirculateException {
        c(dy6Var, null);
    }

    void release();

    default void stopDiscovery() throws CirculateException {
        b(null);
    }
}
