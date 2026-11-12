package defpackage;

import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import java.util.Collection;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: zlf, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\u001a\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0000\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, d2 = {"platformExceptionHandlers", "", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "getPlatformExceptionHandlers", "()Ljava/util/Collection;", "ensurePlatformExceptionHandlerLoaded", "", ParamConstants.Param.CALLBACK, "propagateExceptionFinalResort", TrackConstants$Events.EXCEPTION, "", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class platformExceptionHandlers {
    private static final Collection<CoroutineExceptionHandler> d = zdz.c(zdz.a(ServiceLoader.load(CoroutineExceptionHandler.class, CoroutineExceptionHandler.class.getClassLoader()).iterator()));

    public static final Collection<CoroutineExceptionHandler> d() {
        return d;
    }

    public static final void d(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
