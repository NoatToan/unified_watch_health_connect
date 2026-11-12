package i3;

import java.util.Locale;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Li3/a0;", "", "", "initialDisplayedMonthMillis", "Lj23/l;", "yearRange", "Li3/bc;", "selectableDates", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "<init>", "(Ljava/lang/Long;Lj23/l;Li3/bc;Ljava/util/Locale;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j23.l f87404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Locale f87405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l3.f0 f87406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p3.c2 f87407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p3.c2 f87408e;

    public a0(Long l14, j23.l lVar, bc bcVar, Locale locale) {
        l3.h0 h0VarG;
        this.f87404a = lVar;
        this.f87405b = locale;
        l3.f0 f0Var = new l3.f0(locale);
        this.f87406c = f0Var;
        this.f87407d = p3.p0.n(bcVar);
        if (l14 != null) {
            h0VarG = f0Var.f(l14.longValue());
            if (!lVar.d(h0VarG.f109260a)) {
                h0VarG = f0Var.g(f0Var.h());
            }
        } else {
            h0VarG = f0Var.g(f0Var.h());
        }
        this.f87408e = p3.p0.n(h0VarG);
    }

    public final void a(long j8) {
        l3.h0 h0VarF = this.f87406c.f(j8);
        if (this.f87404a.d(h0VarF.f109260a)) {
            this.f87408e.setValue(h0VarF);
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final j23.l getF87404a() {
        return this.f87404a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long d() {
        return ((l3.h0) this.f87408e.getF182175a()).f109264e;
    }

    public final bc e() {
        return (bc) this.f87407d.getF182175a();
    }

    /* JADX INFO: renamed from: getLocale, reason: from getter */
    public final Locale getF87405b() {
        return this.f87405b;
    }
}
