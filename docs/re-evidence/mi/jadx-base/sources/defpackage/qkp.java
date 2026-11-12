package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class qkp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Boolean f31610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Double f31611b;

    @NotNull
    public final Boolean c;

    @Nullable
    public final Double d;

    public qkp(@NotNull Boolean bool) {
        this(bool, null);
    }

    @Nullable
    public Double a() {
        return this.d;
    }

    @NotNull
    public Boolean b() {
        return this.c;
    }

    @Nullable
    public Double c() {
        return this.f31611b;
    }

    @NotNull
    public Boolean d() {
        return this.f31610a;
    }

    public qkp(@NotNull Boolean bool, @Nullable Double d) {
        this(bool, d, Boolean.FALSE, null);
    }

    public qkp(@NotNull Boolean bool, @Nullable Double d, @NotNull Boolean bool2, @Nullable Double d2) {
        this.f31610a = bool;
        this.f31611b = d;
        this.c = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
        this.d = d2;
    }
}
