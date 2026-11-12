package defpackage;

import io.sentry.Instrumenter;
import io.sentry.MeasurementUnit;
import io.sentry.SpanStatus;
import io.sentry.v;
import io.sentry.y;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface qyc {
    boolean a();

    @NotNull
    v d();

    @ApiStatus.Internal
    @NotNull
    qyc e(@NotNull String str, @Nullable String str2, @Nullable hul hulVar, @NotNull Instrumenter instrumenter);

    void f(@Nullable SpanStatus spanStatus, @Nullable hul hulVar);

    void finish();

    @ApiStatus.Internal
    boolean g(@NotNull hul hulVar);

    @Nullable
    String getDescription();

    @Nullable
    SpanStatus getStatus();

    void h(@Nullable String str);

    void j(@NotNull String str, @NotNull Number number);

    @ApiStatus.Experimental
    @Nullable
    y l();

    void m(@NotNull String str, @NotNull Object obj);

    void n(@Nullable SpanStatus spanStatus);

    void o(@NotNull String str, @NotNull Number number, @NotNull MeasurementUnit measurementUnit);

    @ApiStatus.Internal
    @Nullable
    hul q();

    @ApiStatus.Internal
    @NotNull
    hul r();
}
