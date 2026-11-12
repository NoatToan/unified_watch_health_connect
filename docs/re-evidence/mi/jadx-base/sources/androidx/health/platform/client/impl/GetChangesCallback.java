package androidx.health.platform.client.impl;

import androidx.health.platform.client.error.ErrorStatus;
import androidx.health.platform.client.impl.error.ErrorStatusConverterKt;
import androidx.health.platform.client.proto.p1;
import androidx.health.platform.client.response.GetChangesResponse;
import com.xiaomi.onetrack.api.b;
import defpackage.l0m;
import defpackage.qsc;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/health/platform/client/impl/GetChangesCallback;", "Lqsc$a;", "Landroidx/health/platform/client/response/GetChangesResponse;", b.I, "", "onSuccess", "(Landroidx/health/platform/client/response/GetChangesResponse;)V", "Landroidx/health/platform/client/error/ErrorStatus;", "error", "onError", "(Landroidx/health/platform/client/error/ErrorStatus;)V", "Ll0m;", "Landroidx/health/platform/client/proto/p1;", "resultFuture", "Ll0m;", "<init>", "(Ll0m;)V", "connect-client_release"}, k = 1, mv = {1, 8, 0})
public final class GetChangesCallback extends qsc.a {

    @NotNull
    private final l0m<p1> resultFuture;

    public GetChangesCallback(@NotNull l0m<p1> resultFuture) {
        Intrinsics.checkNotNullParameter(resultFuture, "resultFuture");
        this.resultFuture = resultFuture;
    }

    @Override // defpackage.qsc
    public void onError(@NotNull ErrorStatus error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.resultFuture.C(ErrorStatusConverterKt.toException(error));
    }

    @Override // defpackage.qsc
    public void onSuccess(@NotNull GetChangesResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.resultFuture.B(response.getProto());
    }
}
