package io.sentry.protocol;

import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import io.sentry.ILogger;
import java.io.IOException;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements cud {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f21803b = new p(new UUID(0, 0));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final UUID f21804a;

    public static final class a implements fsd<p> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            return new p(f4hVar.nextString());
        }
    }

    public p() {
        this((UUID) null);
    }

    @NotNull
    public final UUID a(@NotNull String str) {
        if (str.length() == 32) {
            str = new StringBuilder(str).insert(8, "-").insert(13, "-").insert(18, "-").insert(23, "-").toString();
        }
        if (str.length() == 36) {
            return UUID.fromString(str);
        }
        throw new IllegalArgumentException("String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: " + str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && p.class == obj.getClass() && this.f21804a.compareTo(((p) obj).f21804a) == 0;
    }

    public int hashCode() {
        return this.f21804a.hashCode();
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.c(toString());
    }

    public String toString() {
        return io.sentry.util.u.e(this.f21804a.toString()).replace("-", "");
    }

    public p(@Nullable UUID uuid) {
        this.f21804a = uuid == null ? UUID.randomUUID() : uuid;
    }

    public p(@NotNull String str) {
        this.f21804a = a(io.sentry.util.u.e(str));
    }
}
