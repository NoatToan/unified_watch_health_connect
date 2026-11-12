package androidx.health.platform.client.impl;

import androidx.health.platform.client.changes.ChangesEvent;
import androidx.health.platform.client.proto.g;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import defpackage.fvc;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Landroidx/health/platform/client/impl/OnChangesListenerProxy;", "Lfvc$a;", "Landroidx/health/platform/client/changes/ChangesEvent;", "changesEvent", "", "onChanges", "(Landroidx/health/platform/client/changes/ChangesEvent;)V", "Lkotlin/Function1;", "Landroidx/health/platform/client/proto/g;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/jvm/functions/Function1;", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "connect-client_release"}, k = 1, mv = {1, 8, 0})
public final class OnChangesListenerProxy extends fvc.a {

    @NotNull
    private final Function1<g, Unit> listener;

    /* JADX WARN: Multi-variable type inference failed */
    public OnChangesListenerProxy(@NotNull Function1<? super g, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
    }

    @Override // defpackage.fvc
    public void onChanges(@NotNull ChangesEvent changesEvent) {
        Intrinsics.checkNotNullParameter(changesEvent, "changesEvent");
        this.listener.invoke(changesEvent.getProto());
    }
}
