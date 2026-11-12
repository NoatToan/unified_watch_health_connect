package c53;

import org.koin.core.parameter.ParametersHolderKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24573b;

    public /* synthetic */ p(Object obj, int i14) {
        this.f24572a = i14;
        this.f24573b = obj;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f24572a;
        Object obj = this.f24573b;
        switch (i14) {
            case 0:
                return obj;
            case 1:
                return ParametersHolderKt.parametersOf(obj);
            case 2:
                r70.a.C2840a c2840a = r70.a.C2840a.f151036a;
                return ParametersHolderKt.parametersOf(obj);
            default:
                return obj;
        }
    }
}
