package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Li7;", "Lybt;", "taskExecutor", "<init>", "(Lybt;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class i7 implements ybt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ybt f20845a;

    public i7(@NotNull ybt taskExecutor) {
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        this.f20845a = taskExecutor;
    }
}
