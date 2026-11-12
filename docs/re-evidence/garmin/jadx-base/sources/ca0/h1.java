package ca0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h1 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1 f26244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f26245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o0 f26246d;

    public /* synthetic */ h1(s1 s1Var, lc.m0 m0Var, o0 o0Var, int i14) {
        this.f26243a = i14;
        this.f26244b = s1Var;
        this.f26245c = m0Var;
        this.f26246d = o0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f26243a) {
            case 0:
                m1.b(this.f26244b, this.f26245c, this.f26246d);
                break;
            default:
                m1.b(this.f26244b, this.f26245c, this.f26246d);
                break;
        }
        return Unit.INSTANCE;
    }
}
