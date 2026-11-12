package defpackage;

import io.sentry.ILogger;
import io.sentry.vendor.gson.stream.b;
import java.io.IOException;
import java.io.Writer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class ltd implements h4h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final b f25415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ktd f25416b;

    public ltd(@NotNull Writer writer, int i) {
        this.f25415a = new b(writer);
        this.f25416b = new ktd(i);
    }

    @Override // defpackage.h4h
    public h4h h(@Nullable String str) throws IOException {
        this.f25415a.o(str);
        return this;
    }

    @Override // defpackage.h4h
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public ltd b() throws IOException {
        this.f25415a.c();
        return this;
    }

    @Override // defpackage.h4h
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public ltd beginObject() throws IOException {
        this.f25415a.d();
        return this;
    }

    @Override // defpackage.h4h
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public ltd a() throws IOException {
        this.f25415a.m();
        return this;
    }

    @Override // defpackage.h4h
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public ltd endObject() throws IOException {
        this.f25415a.n();
        return this;
    }

    @Override // defpackage.h4h
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public ltd g(@NotNull String str) throws IOException {
        this.f25415a.p(str);
        return this;
    }

    @Override // defpackage.h4h
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public ltd l() throws IOException {
        this.f25415a.y();
        return this;
    }

    public void s(@NotNull String str) {
        this.f25415a.M(str);
    }

    @Override // defpackage.h4h
    public void setLenient(boolean z) {
        this.f25415a.setLenient(z);
    }

    @Override // defpackage.h4h
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public ltd e(double d) throws IOException {
        this.f25415a.O(d);
        return this;
    }

    @Override // defpackage.h4h
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public ltd d(long j) throws IOException {
        this.f25415a.P(j);
        return this;
    }

    @Override // defpackage.h4h
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public ltd j(@NotNull ILogger iLogger, @Nullable Object obj) throws IOException {
        this.f25416b.a(this, iLogger, obj);
        return this;
    }

    @Override // defpackage.h4h
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public ltd k(@Nullable Boolean bool) throws IOException {
        this.f25415a.Q(bool);
        return this;
    }

    @Override // defpackage.h4h
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public ltd i(@Nullable Number number) throws IOException {
        this.f25415a.R(number);
        return this;
    }

    @Override // defpackage.h4h
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public ltd c(@Nullable String str) throws IOException {
        this.f25415a.S(str);
        return this;
    }

    @Override // defpackage.h4h
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public ltd f(boolean z) throws IOException {
        this.f25415a.T(z);
        return this;
    }
}
