package defpackage;

import io.sentry.protocol.p;
import io.sentry.v;
import io.sentry.w;
import io.sentry.y;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class idi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public p f21027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public w f21028b;

    @Nullable
    public w c;

    @Nullable
    public Boolean d;

    @Nullable
    public ox1 e;

    public idi() {
        this(new p(), new w(), null, null, null);
    }

    @Nullable
    public static ox1 a(@Nullable ox1 ox1Var) {
        if (ox1Var != null) {
            return new ox1(ox1Var);
        }
        return null;
    }

    @Nullable
    public ox1 b() {
        return this.e;
    }

    @Nullable
    public w c() {
        return this.c;
    }

    @NotNull
    public w d() {
        return this.f21028b;
    }

    @NotNull
    public p e() {
        return this.f21027a;
    }

    @Nullable
    public Boolean f() {
        return this.d;
    }

    public void g(@Nullable ox1 ox1Var) {
        this.e = ox1Var;
    }

    @NotNull
    public v h() {
        v vVar = new v(this.f21027a, this.f21028b, "default", null, null);
        vVar.m("auto");
        return vVar;
    }

    @Nullable
    public y i() {
        ox1 ox1Var = this.e;
        if (ox1Var != null) {
            return ox1Var.H();
        }
        return null;
    }

    public idi(@NotNull idi idiVar) {
        this(idiVar.e(), idiVar.d(), idiVar.c(), a(idiVar.b()), idiVar.f());
    }

    public idi(@NotNull p pVar, @NotNull w wVar, @Nullable w wVar2, @Nullable ox1 ox1Var, @Nullable Boolean bool) {
        this.f21027a = pVar;
        this.f21028b = wVar;
        this.c = wVar2;
        this.e = ox1Var;
        this.d = bool;
    }
}
