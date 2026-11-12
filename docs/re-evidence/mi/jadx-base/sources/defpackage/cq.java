package defpackage;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcq;", "", "Lycs;", "getRealtimeStep", "()Lycs;", "Lrft;", "callback", "", "registerRealtimeStepCallback", "(Lrft;)Z", "", "unregisterRealtimeStepCallback", "(Lrft;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public interface cq {
    @Nullable
    ycs getRealtimeStep();

    boolean registerRealtimeStepCallback(@NotNull rft callback);

    void unregisterRealtimeStepCallback(@NotNull rft callback);
}
