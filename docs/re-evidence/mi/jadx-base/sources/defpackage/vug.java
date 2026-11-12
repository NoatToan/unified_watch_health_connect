package defpackage;

import io.sentry.SentryOptions;
import io.sentry.SentryReplayEvent;
import io.sentry.a;
import io.sentry.j;
import io.sentry.metrics.f;
import io.sentry.metrics.h;
import io.sentry.protocol.p;
import io.sentry.protocol.w;
import io.sentry.s;
import io.sentry.transport.z;
import io.sentry.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class vug implements ftc {
    public static final vug c = new vug();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SentryOptions f37235a = SentryOptions.empty();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final f f37236b = new f(h.a());

    public static vug a() {
        return c;
    }

    @Override // defpackage.ftc
    public boolean e() {
        return true;
    }

    @Override // defpackage.ftc
    public void f(boolean z) {
    }

    @Override // defpackage.ftc
    @Nullable
    public z g() {
        return null;
    }

    @Override // defpackage.ftc
    public void h(long j) {
    }

    @Override // defpackage.ftc
    @NotNull
    public SentryOptions i() {
        return this.f37235a;
    }

    @Override // defpackage.ftc
    public boolean isEnabled() {
        return false;
    }

    @Override // defpackage.ftc
    @Nullable
    public wzc j() {
        return null;
    }

    @Override // defpackage.ftc
    public void k() {
    }

    @Override // defpackage.ftc
    public void m(@NotNull a aVar) {
    }

    @Override // defpackage.ftc
    public void n() {
    }

    @Override // defpackage.ftc
    public void o(@NotNull a aVar, @Nullable c8c c8cVar) {
    }

    @Override // defpackage.ftc
    @NotNull
    public p p(@NotNull jul julVar, @Nullable c8c c8cVar) {
        return p.f21803b;
    }

    @Override // defpackage.ftc
    @NotNull
    public wzc q(@NotNull owp owpVar, @NotNull rwp rwpVar) {
        return hvg.s();
    }

    @Override // defpackage.ftc
    @NotNull
    public p s(@NotNull SentryReplayEvent sentryReplayEvent, @Nullable c8c c8cVar) {
        return p.f21803b;
    }

    @Override // defpackage.ftc
    @NotNull
    public p t(@NotNull s sVar, @Nullable c8c c8cVar) {
        return p.f21803b;
    }

    @Override // defpackage.ftc
    public void u(@NotNull Throwable th, @NotNull qyc qycVar, @NotNull String str) {
    }

    @Override // defpackage.ftc
    public void v(@NotNull hgl hglVar) {
    }

    @Override // defpackage.ftc
    @NotNull
    public p x(@NotNull w wVar, @Nullable y yVar, @Nullable c8c c8cVar, @Nullable j jVar) {
        return p.f21803b;
    }

    @Override // defpackage.ftc
    @NotNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public ftc m2679clone() {
        return c;
    }
}
