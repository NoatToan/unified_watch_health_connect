package z10;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.consent.ConsentDelegate", f = "ConsentDelegate.kt", l = {35}, m = "hasChildExistingContacts", v = 2)
public final class o0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f201184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f201185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f201186c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(p0 p0Var, t13.d<? super o0> dVar) {
        super(dVar);
        this.f201185b = p0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f201184a = obj;
        this.f201186c |= Integer.MIN_VALUE;
        return this.f201185b.d(0L, this);
    }
}
