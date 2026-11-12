package defpackage;

import io.sentry.Instrumenter;
import io.sentry.protocol.TransactionNameSource;
import io.sentry.util.p;
import io.sentry.v;
import io.sentry.w;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class owp extends v {

    @NotNull
    public static final TransactionNameSource q = TransactionNameSource.CUSTOM;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public String f29774k;

    @NotNull
    public TransactionNameSource l;

    @Nullable
    public qkp m;

    @Nullable
    public ox1 n;

    @NotNull
    public Instrumenter o;
    public boolean p;

    @ApiStatus.Internal
    public owp(@NotNull String str, @NotNull TransactionNameSource transactionNameSource, @NotNull String str2) {
        this(str, transactionNameSource, str2, null);
    }

    @ApiStatus.Internal
    public static owp q(@NotNull idi idiVar) {
        qkp qkpVar;
        Boolean boolF = idiVar.f();
        qkp qkpVar2 = boolF == null ? null : new qkp(boolF);
        ox1 ox1VarB = idiVar.b();
        if (ox1VarB != null) {
            ox1VarB.a();
            Double dI = ox1VarB.i();
            Boolean boolValueOf = Boolean.valueOf(boolF != null ? boolF.booleanValue() : false);
            if (dI != null) {
                qkpVar = new qkp(boolValueOf, dI);
            } else {
                qkpVar2 = new qkp(boolValueOf);
                qkpVar = qkpVar2;
            }
        } else {
            qkpVar = qkpVar2;
        }
        return new owp(idiVar.e(), idiVar.d(), idiVar.c(), qkpVar, ox1VarB);
    }

    @Nullable
    public ox1 r() {
        return this.n;
    }

    @NotNull
    public Instrumenter s() {
        return this.o;
    }

    @NotNull
    public String t() {
        return this.f29774k;
    }

    @Nullable
    public qkp u() {
        return this.m;
    }

    @NotNull
    public TransactionNameSource v() {
        return this.l;
    }

    @ApiStatus.Internal
    public void w(boolean z) {
        this.p = z;
    }

    public owp(@NotNull String str, @NotNull String str2) {
        this(str, str2, (qkp) null);
    }

    public owp(@NotNull String str, @NotNull String str2, @Nullable qkp qkpVar) {
        this(str, TransactionNameSource.CUSTOM, str2, qkpVar);
    }

    @ApiStatus.Internal
    public owp(@NotNull String str, @NotNull TransactionNameSource transactionNameSource, @NotNull String str2, @Nullable qkp qkpVar) {
        super(str2);
        this.o = Instrumenter.SENTRY;
        this.p = false;
        this.f29774k = (String) p.c(str, "name is required");
        this.l = transactionNameSource;
        n(qkpVar);
    }

    @ApiStatus.Internal
    public owp(@NotNull io.sentry.protocol.p pVar, @NotNull w wVar, @Nullable w wVar2, @Nullable qkp qkpVar, @Nullable ox1 ox1Var) {
        super(pVar, wVar, "default", wVar2, null);
        this.o = Instrumenter.SENTRY;
        this.p = false;
        this.f29774k = "<unlabeled transaction>";
        this.m = qkpVar;
        this.l = q;
        this.n = ox1Var;
    }
}
