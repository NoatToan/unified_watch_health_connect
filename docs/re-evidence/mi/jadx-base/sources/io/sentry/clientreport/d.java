package io.sentry.clientreport;

import io.sentry.util.p;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f21695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f21696b;

    public d(@NotNull String str, @NotNull String str2) {
        this.f21695a = str;
        this.f21696b = str2;
    }

    @NotNull
    public String a() {
        return this.f21696b;
    }

    @NotNull
    public String b() {
        return this.f21695a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return p.a(b(), dVar.b()) && p.a(a(), dVar.a());
    }

    public int hashCode() {
        return p.b(b(), a());
    }
}
