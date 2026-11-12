package io.sentry.clientreport;

import defpackage.fvl;
import defpackage.jul;
import io.sentry.DataCategory;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public interface g {
    void a(@NotNull DiscardReason discardReason, @NotNull DataCategory dataCategory);

    void b(@NotNull DiscardReason discardReason, @NotNull DataCategory dataCategory, long j);

    void c(@NotNull DiscardReason discardReason, @Nullable jul julVar);

    @NotNull
    jul d(@NotNull jul julVar);

    void e(@NotNull DiscardReason discardReason, @Nullable fvl fvlVar);
}
