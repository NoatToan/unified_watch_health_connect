package com.huami.userproperty.service.interceptor;

import androidx.core.app.NotificationCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aZ\u0010\t\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"P", "R", "", "Lcom/huami/userproperty/service/interceptor/Interceptor;", "params", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "handler", NotificationCompat.CATEGORY_CALL, "(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "service_release"}, k = 2, mv = {1, 5, 1})
public final class InterceptorKt {
    public static final <P, R> R call(@NotNull List<? extends Interceptor<P, R>> list, final P p, @NotNull final Function1<? super P, ? extends R> function1) {
        return (R) new CallChain(new Interceptor.Chain<P, R>() { // from class: com.huami.userproperty.service.interceptor.InterceptorKt$call$chain$1
            @Override // com.huami.userproperty.service.interceptor.Interceptor.Chain
            public R handle(P params) {
                return function1.invoke(params);
            }

            @Override // com.huami.userproperty.service.interceptor.Interceptor.Chain
            public P params() {
                return p;
            }
        }, p, list, 0).handle(p);
    }
}
