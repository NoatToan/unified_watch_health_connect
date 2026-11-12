package io.sentry;

import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import java.io.IOException;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements cud {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w f21919b = new w(new UUID(0, 0));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f21920a;

    public static final class a implements fsd<w> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public w a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            return new w(f4hVar.nextString());
        }
    }

    public w(@NotNull String str) {
        this.f21920a = (String) io.sentry.util.p.c(str, "value is required");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        return this.f21920a.equals(((w) obj).f21920a);
    }

    public int hashCode() {
        return this.f21920a.hashCode();
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.c(this.f21920a);
    }

    public String toString() {
        return this.f21920a;
    }

    public w() {
        this(UUID.randomUUID());
    }

    public w(@NotNull UUID uuid) {
        this(io.sentry.util.u.e(uuid.toString()).replace("-", "").substring(0, 16));
    }
}
