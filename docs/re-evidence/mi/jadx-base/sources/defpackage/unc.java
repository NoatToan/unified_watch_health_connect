package defpackage;

import io.sentry.SentryOptions;
import io.sentry.SentryReplayEvent;
import io.sentry.a;
import io.sentry.j;
import io.sentry.protocol.p;
import io.sentry.protocol.w;
import io.sentry.s;
import io.sentry.transport.z;
import io.sentry.y;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class unc implements ftc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final unc f35949a = new unc();

    public static unc a() {
        return f35949a;
    }

    @Override // defpackage.ftc
    public boolean e() {
        return cul.u();
    }

    @Override // defpackage.ftc
    public void f(boolean z) {
        cul.j();
    }

    @Override // defpackage.ftc
    @ApiStatus.Internal
    @Nullable
    public z g() {
        return cul.o().g();
    }

    @Override // defpackage.ftc
    public void h(long j) {
        cul.n(j);
    }

    @Override // defpackage.ftc
    @NotNull
    public SentryOptions i() {
        return cul.o().i();
    }

    @Override // defpackage.ftc
    public boolean isEnabled() {
        return cul.t();
    }

    @Override // defpackage.ftc
    @ApiStatus.Internal
    @Nullable
    public wzc j() {
        return cul.o().j();
    }

    @Override // defpackage.ftc
    public void k() {
        cul.B();
    }

    @Override // defpackage.ftc
    public void m(@NotNull a aVar) {
        o(aVar, new c8c());
    }

    @Override // defpackage.ftc
    public void n() {
        cul.l();
    }

    @Override // defpackage.ftc
    public void o(@NotNull a aVar, @Nullable c8c c8cVar) {
        cul.f(aVar, c8cVar);
    }

    @Override // defpackage.ftc
    @ApiStatus.Internal
    @NotNull
    public p p(@NotNull jul julVar, @Nullable c8c c8cVar) {
        return cul.o().p(julVar, c8cVar);
    }

    @Override // defpackage.ftc
    @NotNull
    public wzc q(@NotNull owp owpVar, @NotNull rwp rwpVar) {
        return cul.C(owpVar, rwpVar);
    }

    @Override // defpackage.ftc
    @NotNull
    public p s(@NotNull SentryReplayEvent sentryReplayEvent, @Nullable c8c c8cVar) {
        return cul.o().s(sentryReplayEvent, c8cVar);
    }

    @Override // defpackage.ftc
    @NotNull
    public p t(@NotNull s sVar, @Nullable c8c c8cVar) {
        return cul.i(sVar, c8cVar);
    }

    @Override // defpackage.ftc
    public void u(@NotNull Throwable th, @NotNull qyc qycVar, @NotNull String str) {
        cul.o().u(th, qycVar, str);
    }

    @Override // defpackage.ftc
    public void v(@NotNull hgl hglVar) {
        cul.k(hglVar);
    }

    @Override // defpackage.ftc
    @NotNull
    public p x(@NotNull w wVar, @Nullable y yVar, @Nullable c8c c8cVar, @Nullable j jVar) {
        return cul.o().x(wVar, yVar, c8cVar, jVar);
    }

    @Override // defpackage.ftc
    @NotNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public ftc m2678clone() {
        return cul.o().m2679clone();
    }
}
