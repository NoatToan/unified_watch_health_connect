package defpackage;

import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: zlg, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"handleUncaughtCoroutineException", "", ParamConstants.Param.CONTEXT, "Lkotlin/coroutines/CoroutineContext;", TrackConstants$Events.EXCEPTION, "", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class handleUncaughtCoroutineException {
    public static final void d(CoroutineContext coroutineContext, Throwable th) {
        Iterator<CoroutineExceptionHandler> it = platformExceptionHandlers.d().iterator();
        while (it.hasNext()) {
            try {
                it.next().handleException(coroutineContext, th);
            } catch (zlk unused) {
                return;
            } catch (Throwable th2) {
                platformExceptionHandlers.d(CoroutineExceptionHandler.c(th, th2));
            }
        }
        try {
            yyl.d(th, new zle(coroutineContext));
        } catch (Throwable unused2) {
        }
        platformExceptionHandlers.d(th);
    }
}
