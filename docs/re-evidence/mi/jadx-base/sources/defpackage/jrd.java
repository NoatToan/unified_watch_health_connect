package defpackage;

import android.os.Handler;
import com.xiaomi.fitness.common.handler.IJobHandler;
import com.xiaomi.fitness.common.handler.JobHandlerProvider;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public interface jrd {
    static IJobHandler a(Object obj, Handler.Callback... callbackArr) {
        Objects.requireNonNull(obj);
        synchronized (obj) {
            try {
                Map<Object, IJobHandler> map = vdb.f36769a;
                IJobHandler iJobHandler = map.get(obj);
                if (iJobHandler != null) {
                    return iJobHandler;
                }
                IJobHandler iJobHandlerNewJobHandler = JobHandlerProvider.INSTANCE.newJobHandler(new o6r(ArrayUtils.INSTANCE.isEmpty(callbackArr) ? null : callbackArr[0]));
                map.put(obj, iJobHandlerNewJobHandler);
                return iJobHandlerNewJobHandler;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    default IJobHandler getJobHandler(Handler.Callback... callbackArr) {
        return a(this, callbackArr);
    }
}
