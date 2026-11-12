package io.sentry.rrweb;

import defpackage.f4h;
import defpackage.h4h;
import io.sentry.ILogger;
import io.sentry.util.p;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public RRWebEventType f21834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f21835b;

    public static final class a {
        public boolean a(@NotNull b bVar, @NotNull String str, @NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            str.hashCode();
            if (str.equals("type")) {
                bVar.f21834a = (RRWebEventType) p.c((RRWebEventType) f4hVar.A(iLogger, new RRWebEventType.a()), "");
                return true;
            }
            if (!str.equals("timestamp")) {
                return false;
            }
            bVar.f21835b = f4hVar.nextLong();
            return true;
        }
    }

    /* JADX INFO: renamed from: io.sentry.rrweb.b$b, reason: collision with other inner class name */
    public static final class C0972b {
        public void a(@NotNull b bVar, @NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
            h4hVar.g("type").j(iLogger, bVar.f21834a);
            h4hVar.g("timestamp").d(bVar.f21835b);
        }
    }

    public b(@NotNull RRWebEventType rRWebEventType) {
        this.f21834a = rRWebEventType;
        this.f21835b = System.currentTimeMillis();
    }

    public long e() {
        return this.f21835b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f21835b == bVar.f21835b && this.f21834a == bVar.f21834a;
    }

    public void f(long j) {
        this.f21835b = j;
    }

    public int hashCode() {
        return p.b(this.f21834a, Long.valueOf(this.f21835b));
    }

    public b() {
        this(RRWebEventType.Custom);
    }
}
