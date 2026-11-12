package defpackage;

import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayEvent;
import io.sentry.hints.a;
import io.sentry.hints.e;
import io.sentry.o;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.c;
import io.sentry.protocol.w;
import io.sentry.protocol.y;
import io.sentry.s;
import io.sentry.util.j;
import io.sentry.util.p;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class r1f implements ae8, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SentryOptions f32076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final uvl f32077b;

    @NotNull
    public final gvl c;

    @Nullable
    public volatile abc d = null;

    public r1f(@NotNull SentryOptions sentryOptions) {
        SentryOptions sentryOptions2 = (SentryOptions) p.c(sentryOptions, "The SentryOptions is required.");
        this.f32076a = sentryOptions2;
        tvl tvlVar = new tvl(sentryOptions2);
        this.c = new gvl(tvlVar);
        this.f32077b = new uvl(tvlVar, sentryOptions2);
    }

    private void J(@NotNull o oVar) {
        if (oVar.I() == null) {
            oVar.Y("java");
        }
    }

    private void K(@NotNull o oVar) {
        if (oVar.J() == null) {
            oVar.Z(this.f32076a.getRelease());
        }
    }

    private void M(@NotNull o oVar) {
        if (oVar.L() == null) {
            oVar.b0(this.f32076a.getSdkVersion());
        }
    }

    private void m(@NotNull o oVar) {
        y yVarQ = oVar.Q();
        if (yVarQ == null) {
            yVarQ = new y();
            oVar.f0(yVarQ);
        }
        if (yVarQ.l() == null) {
            yVarQ.o("{{auto}}");
        }
    }

    private void p(@NotNull o oVar) {
        ArrayList arrayList = new ArrayList();
        if (this.f32076a.getProguardUuid() != null) {
            DebugImage debugImage = new DebugImage();
            debugImage.setType(DebugImage.PROGUARD);
            debugImage.setUuid(this.f32076a.getProguardUuid());
            arrayList.add(debugImage);
        }
        for (String str : this.f32076a.getBundleIds()) {
            DebugImage debugImage2 = new DebugImage();
            debugImage2.setType(DebugImage.JVM);
            debugImage2.setDebugId(str);
            arrayList.add(debugImage2);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        c cVarD = oVar.D();
        if (cVarD == null) {
            cVarD = new c();
        }
        if (cVarD.c() == null) {
            cVarD.d(arrayList);
        } else {
            cVarD.c().addAll(arrayList);
        }
        oVar.S(cVarD);
    }

    private void s(@NotNull o oVar) {
        if (oVar.E() == null) {
            oVar.T(this.f32076a.getDist());
        }
    }

    private void y(@NotNull o oVar) {
        if (oVar.F() == null) {
            oVar.U(this.f32076a.getEnvironment());
        }
    }

    public final void D(@NotNull s sVar) {
        Throwable thP = sVar.P();
        if (thP != null) {
            sVar.z0(this.c.c(thP));
        }
    }

    public final void E(@NotNull s sVar) {
        Map<String, String> mapA = this.f32076a.getModulesLoader().a();
        if (mapA == null) {
            return;
        }
        Map<String, String> mapS0 = sVar.s0();
        if (mapS0 == null) {
            sVar.D0(mapA);
        } else {
            mapS0.putAll(mapA);
        }
    }

    public final void N(@NotNull o oVar) {
        if (oVar.M() == null) {
            oVar.c0(this.f32076a.getServerName());
        }
        if (this.f32076a.isAttachServerName() && oVar.M() == null) {
            d();
            if (this.d != null) {
                oVar.c0(this.d.d());
            }
        }
    }

    public final void O(@NotNull o oVar) {
        if (oVar.N() == null) {
            oVar.e0(new HashMap(this.f32076a.getTags()));
            return;
        }
        for (Map.Entry<String, String> entry : this.f32076a.getTags().entrySet()) {
            if (!oVar.N().containsKey(entry.getKey())) {
                oVar.d0(entry.getKey(), entry.getValue());
            }
        }
    }

    public final void P(@NotNull s sVar, @NotNull c8c c8cVar) {
        if (sVar.t0() == null) {
            List<io.sentry.protocol.o> listP0 = sVar.p0();
            ArrayList arrayList = null;
            if (listP0 != null && !listP0.isEmpty()) {
                for (io.sentry.protocol.o oVar : listP0) {
                    if (oVar.g() != null && oVar.j() != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(oVar.j());
                    }
                }
            }
            if (this.f32076a.isAttachThreads() || j.h(c8cVar, a.class)) {
                Object objG = j.g(c8cVar);
                sVar.E0(this.f32077b.b(arrayList, objG instanceof a ? ((a) objG).c() : false));
            } else if (this.f32076a.isAttachStacktrace()) {
                if ((listP0 == null || listP0.isEmpty()) && !l(c8cVar)) {
                    sVar.E0(this.f32077b.a());
                }
            }
        }
    }

    public final boolean Q(@NotNull o oVar, @NotNull c8c c8cVar) {
        if (j.u(c8cVar)) {
            return true;
        }
        this.f32076a.getLogger().c(SentryLevel.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", oVar.G());
        return false;
    }

    @Override // defpackage.ae8
    @NotNull
    public s a(@NotNull s sVar, @NotNull c8c c8cVar) {
        o(sVar);
        D(sVar);
        p(sVar);
        E(sVar);
        if (Q(sVar, c8cVar)) {
            n(sVar);
            P(sVar, c8cVar);
        }
        return sVar;
    }

    @Override // defpackage.ae8
    @NotNull
    public w b(@NotNull w wVar, @NotNull c8c c8cVar) {
        o(wVar);
        p(wVar);
        if (Q(wVar, c8cVar)) {
            n(wVar);
        }
        return wVar;
    }

    @Override // defpackage.ae8
    @NotNull
    public SentryReplayEvent c(@NotNull SentryReplayEvent sentryReplayEvent, @NotNull c8c c8cVar) {
        o(sentryReplayEvent);
        if (Q(sentryReplayEvent, c8cVar)) {
            n(sentryReplayEvent);
        }
        return sentryReplayEvent;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.d != null) {
            this.d.c();
        }
    }

    public final void d() {
        if (this.d == null) {
            synchronized (this) {
                try {
                    if (this.d == null) {
                        this.d = abc.e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final boolean l(@NotNull c8c c8cVar) {
        return j.h(c8cVar, e.class);
    }

    public final void n(@NotNull o oVar) {
        K(oVar);
        y(oVar);
        N(oVar);
        s(oVar);
        M(oVar);
        O(oVar);
        m(oVar);
    }

    public final void o(@NotNull o oVar) {
        J(oVar);
    }
}
