package h2;

import ch.qos.logback.core.joran.action.Action;
import g2.p1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B?\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lh2/w;", "Lg2/u;", "Lh2/p;", "Lkotlin/Function2;", "Lh2/c0;", "", "", "pageContent", "Lkotlin/Function1;", "", Action.KEY_ATTRIBUTE, "pageCount", "<init>", "(Le23/r;Le23/l;I)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class w extends g2.u<p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.r<c0, Integer, p3.m, Integer, Unit> f81018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<Integer, Object> f81019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p1 f81020c;

    /* JADX WARN: Multi-variable type inference failed */
    public w(e23.r<? super c0, ? super Integer, ? super p3.m, ? super Integer, Unit> rVar, e23.l<? super Integer, ? extends Object> lVar, int i14) {
        this.f81018a = rVar;
        this.f81019b = lVar;
        p1 p1Var = new p1();
        p1Var.a(i14, new p(lVar, rVar));
        this.f81020c = p1Var;
    }

    @Override // g2.u
    /* JADX INFO: renamed from: m, reason: from getter */
    public final p1 getF81020c() {
        return this.f81020c;
    }
}
