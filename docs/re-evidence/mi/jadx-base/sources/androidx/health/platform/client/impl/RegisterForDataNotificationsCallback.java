package androidx.health.platform.client.impl;

import androidx.health.platform.client.error.ErrorStatus;
import androidx.health.platform.client.impl.error.ErrorStatusConverterKt;
import defpackage.l0m;
import defpackage.vwc;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Landroidx/health/platform/client/impl/RegisterForDataNotificationsCallback;", "Lvwc$a;", "", "onSuccess", "()V", "Landroidx/health/platform/client/error/ErrorStatus;", "status", "onError", "(Landroidx/health/platform/client/error/ErrorStatus;)V", "Ll0m;", "Ljava/lang/Void;", "resultFuture", "Ll0m;", "<init>", "(Ll0m;)V", "connect-client_release"}, k = 1, mv = {1, 8, 0})
public final class RegisterForDataNotificationsCallback extends vwc.a {

    @NotNull
    private final l0m<Void> resultFuture;

    public RegisterForDataNotificationsCallback(@NotNull l0m<Void> resultFuture) {
        Intrinsics.checkNotNullParameter(resultFuture, "resultFuture");
        this.resultFuture = resultFuture;
    }

    @Override // defpackage.vwc
    public void onError(@NotNull ErrorStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.resultFuture.C(ErrorStatusConverterKt.toException(status));
    }

    @Override // defpackage.vwc
    public void onSuccess() {
        this.resultFuture.B(null);
    }
}
