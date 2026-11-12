package vn2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\n8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lvn2/l0;", "Lvn2/f1;", "Lpn2/e;", "history", "<init>", "(Lpn2/e;)V", "b", "Lpn2/e;", "A0", "()Lpn2/e;", "Lvn2/g1;", "c", "Lvn2/g1;", "J0", "()Lvn2/g1;", "K0", "(Lvn2/g1;)V", "presenter", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l0 implements f1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f178909d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final pn2.e history;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public g1 presenter;

    public l0(pn2.e eVar) {
        eVar.getClass();
        this.history = eVar;
    }

    @Override // vn2.f1
    /* JADX INFO: renamed from: A0, reason: from getter */
    public pn2.e getHistory() {
        return this.history;
    }

    @Override // vn2.f1
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public g1 b() {
        g1 g1Var = this.presenter;
        if (g1Var != null) {
            return g1Var;
        }
        p005kotlin.jvm.internal.s.m("presenter");
        throw null;
    }

    @Override // vn2.f1, sy2.c
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public void a(g1 g1Var) {
        g1Var.getClass();
        this.presenter = g1Var;
    }
}
