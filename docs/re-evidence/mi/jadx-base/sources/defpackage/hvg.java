package defpackage;

import io.sentry.Instrumenter;
import io.sentry.MeasurementUnit;
import io.sentry.SpanStatus;
import io.sentry.protocol.TransactionNameSource;
import io.sentry.protocol.p;
import io.sentry.v;
import io.sentry.w;
import io.sentry.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class hvg implements wzc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hvg f20514a = new hvg();

    public static hvg s() {
        return f20514a;
    }

    @Override // defpackage.qyc
    public boolean a() {
        return true;
    }

    @Override // defpackage.wzc
    public void b(@NotNull SpanStatus spanStatus, boolean z, @Nullable c8c c8cVar) {
    }

    @Override // defpackage.wzc
    public void c() {
    }

    @Override // defpackage.qyc
    @NotNull
    public v d() {
        return new v(p.f21803b, w.f21919b, "op", null, null);
    }

    @Override // defpackage.qyc
    @NotNull
    public qyc e(@NotNull String str, @Nullable String str2, @Nullable hul hulVar, @NotNull Instrumenter instrumenter) {
        return gvg.s();
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

    @Override // defpackage.wzc
    @NotNull
    public String getName() {
        return "";
    }

    @Override // defpackage.qyc
    @Nullable
    public SpanStatus getStatus() {
        return null;
    }

    @Override // defpackage.qyc
    public void h(@Nullable String str) {
    }

    @Override // defpackage.wzc
    @NotNull
    public p i() {
        return p.f21803b;
    }

    @Override // defpackage.qyc
    public void j(@NotNull String str, @NotNull Number number) {
    }

    @Override // defpackage.wzc
    @NotNull
    public TransactionNameSource k() {
        return TransactionNameSource.CUSTOM;
    }

    @Override // defpackage.qyc
    @NotNull
    public y l() {
        return new y(p.f21803b, "");
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

    @Override // defpackage.wzc
    @Nullable
    public a5n p() {
        return null;
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
