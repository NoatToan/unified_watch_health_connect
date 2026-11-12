package androidx.health.platform.client.impl;

import androidx.health.platform.client.error.ErrorStatus;
import androidx.health.platform.client.impl.error.ErrorStatusConverterKt;
import defpackage.eqc;
import defpackage.l0m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/health/platform/client/impl/ClearOnChangesListenerCallback;", "Leqc$a;", "", "onSuccess", "()V", "Landroidx/health/platform/client/error/ErrorStatus;", "error", "onError", "(Landroidx/health/platform/client/error/ErrorStatus;)V", "Ll0m;", "resultFuture", "Ll0m;", "<init>", "(Ll0m;)V", "connect-client_release"}, k = 1, mv = {1, 8, 0})
public final class ClearOnChangesListenerCallback extends eqc.a {

    @NotNull
    private final l0m<Unit> resultFuture;

    public ClearOnChangesListenerCallback(@NotNull l0m<Unit> resultFuture) {
        Intrinsics.checkNotNullParameter(resultFuture, "resultFuture");
        this.resultFuture = resultFuture;
    }

    @Override // defpackage.eqc
    public void onError(@NotNull ErrorStatus error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.resultFuture.C(ErrorStatusConverterKt.toException(error));
    }

    @Override // defpackage.eqc
    public void onSuccess() {
        this.resultFuture.B(Unit.INSTANCE);
    }
}
