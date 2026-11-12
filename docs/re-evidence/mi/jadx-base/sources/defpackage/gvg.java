package defpackage;

import io.sentry.MeasurementUnit;
import io.sentry.SpanStatus;
import io.sentry.protocol.p;
import io.sentry.v;
import io.sentry.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class gvg implements qyc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gvg f19369a = new gvg();

    public static gvg s() {
        return f19369a;
    }

    @Override // defpackage.qyc
    public boolean a() {
        return false;
    }

    @Override // defpackage.qyc
    @NotNull
    public v d() {
        return new v(p.f21803b, w.f21919b, "op", null, null);
    }

    @Override // defpackage.qyc
    public void f(@Nullable SpanStatus spanStatus, @Nullable hul hulVar) {
    }

    @Override // defpackage.qyc
    public void finish() {
    }

    @Override // defpackage.qyc
    public boolean g(@NotNull hul hulVar) {
        return false;
    }

    @Override // defpackage.qyc
    @Nullable
    public String getDescription() {
        return null;
    }

    @Override // defpackage.qyc
    @Nullable
    public SpanStatus getStatus() {
        return null;
    }

    @Override // defpackage.qyc
    public void h(@Nullable String str) {
    }

    @Override // defpackage.qyc
    public void j(@NotNull String str, @NotNull Number number) {
    }

    @Override // defpackage.qyc
    public void m(@NotNull String str, @NotNull Object obj) {
    }

    @Override // defpackage.qyc
    public void n(@Nullable SpanStatus spanStatus) {
    }

    @Override // defpackage.qyc
    public void o(@NotNull String str, @NotNull Number number, @NotNull MeasurementUnit measurementUnit) {
    }

    @Override // defpackage.qyc
    @NotNull
    public hul q() {
        return new mvl();
    }

    @Override // defpackage.qyc
    @NotNull
    public hul r() {
        return new mvl();
    }
}
