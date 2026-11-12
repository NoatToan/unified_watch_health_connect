package io.sentry.clientreport;

import defpackage.fvl;
import defpackage.jul;
import io.sentry.DataCategory;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class i implements g {
    @Override // io.sentry.clientreport.g
    public void a(@NotNull DiscardReason discardReason, @NotNull DataCategory dataCategory) {
    }

    @Override // io.sentry.clientreport.g
    public void b(@NotNull DiscardReason discardReason, @NotNull DataCategory dataCategory, long j) {
    }

    @Override // io.sentry.clientreport.g
    public void c(@NotNull DiscardReason discardReason, @Nullable jul julVar) {
    }

    @Override // io.sentry.clientreport.g
    @NotNull
    public jul d(@NotNull jul julVar) {
        return julVar;
    }

    @Override // io.sentry.clientreport.g
    public void e(@NotNull DiscardReason discardReason, @Nullable fvl fvlVar) {
    }
}
