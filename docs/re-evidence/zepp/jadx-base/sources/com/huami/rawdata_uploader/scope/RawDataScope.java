package com.huami.rawdata_uploader.scope;

import com.huami.tools.analytics.DbUtils;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001d\u0010\u000b\u001a\u00020\u00078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0004\u0010\nR\u0016\u0010\r\u001a\u00020\u00078V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/huami/rawdata_uploader/scope/RawDataScope;", "Lkotlinx/coroutines/CoroutineScope;", "", "kotlin.jvm.PlatformType", "a", "Ljava/lang/String;", "TAG", "Lkotlin/coroutines/CoroutineContext;", "b", "Lkotlin/Lazy;", "()Lkotlin/coroutines/CoroutineContext;", DbUtils.Const.Table.CONTEXT, "getCoroutineContext", "coroutineContext", "<init>", "()V", "rawdata-uploader_release"}, k = 1, mv = {1, 5, 1})
public final class RawDataScope implements CoroutineScope {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String TAG = RawDataScope.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy context = LazyKt__LazyJVMKt.lazy(new Function0<CoroutineContext>() { // from class: com.huami.rawdata_uploader.scope.RawDataScope$context$2

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Throwable a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Throwable th) {
                super(0);
                this.a = th;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "error in RawDataScope " + this.a.getMessage();
            }
        }

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final CoroutineContext invoke() {
            return SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()).plus(new RawDataScope$context$2$invoke$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.INSTANCE, this.a));
        }
    });

    private final CoroutineContext a() {
        return (CoroutineContext) this.context.getValue();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return a();
    }
}
