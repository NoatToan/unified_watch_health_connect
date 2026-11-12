package com.huami.jac.repo.exception;

import com.huami.tools.log.HMLog;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001d\u0010\n\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u001d\u0010\u000e\u001a\u00020\u000b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0012\u001a\u00020\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\b\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/jac/repo/exception/JacExceptionHandler;", "Lcom/huami/jac/repo/exception/JacExceptionHandlerApi;", "", "e", "", "handle", "Lcom/huami/jac/repo/exception/JacHttpAuthExceptionHandler;", "a", "Lkotlin/Lazy;", "()Lcom/huami/jac/repo/exception/JacHttpAuthExceptionHandler;", "httpAuthExceptionHandler", "Lcom/huami/jac/repo/exception/JacNormalExceptionHandler;", "b", "()Lcom/huami/jac/repo/exception/JacNormalExceptionHandler;", "normalExceptionHandler", "Lcom/huami/jac/repo/exception/UnHandledExceptionHandler;", "c", "()Lcom/huami/jac/repo/exception/UnHandledExceptionHandler;", "unHandledExceptionHandler", "<init>", "()V", "Companion", "jac-repo_release"}, k = 1, mv = {1, 5, 1})
public final class JacExceptionHandler implements JacExceptionHandlerApi {

    @NotNull
    public static final String TAG = "JacExceptionHandler";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy httpAuthExceptionHandler = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy normalExceptionHandler = LazyKt__LazyJVMKt.lazy(b.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy unHandledExceptionHandler = LazyKt__LazyJVMKt.lazy(c.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/jac/repo/exception/JacHttpAuthExceptionHandler;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<JacHttpAuthExceptionHandler> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JacHttpAuthExceptionHandler invoke() {
            return new JacHttpAuthExceptionHandler();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/jac/repo/exception/JacNormalExceptionHandler;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<JacNormalExceptionHandler> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JacNormalExceptionHandler invoke() {
            return new JacNormalExceptionHandler();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/jac/repo/exception/UnHandledExceptionHandler;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<UnHandledExceptionHandler> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UnHandledExceptionHandler invoke() {
            return new UnHandledExceptionHandler();
        }
    }

    private final JacHttpAuthExceptionHandler a() {
        return (JacHttpAuthExceptionHandler) this.httpAuthExceptionHandler.getValue();
    }

    private final JacNormalExceptionHandler b() {
        return (JacNormalExceptionHandler) this.normalExceptionHandler.getValue();
    }

    private final UnHandledExceptionHandler c() {
        return (UnHandledExceptionHandler) this.unHandledExceptionHandler.getValue();
    }

    @Override // com.huami.jac.repo.exception.JacExceptionHandlerApi
    public void handle(@NotNull Throwable e) {
        HMLog.e(TAG, Intrinsics.stringPlus("=========", e), new Object[0]);
        if (e instanceof JacHttpAuthException) {
            a().handle(e);
        } else if (e instanceof JacNormalException) {
            b().handle(e);
        } else {
            c().handle(e);
        }
    }
}
