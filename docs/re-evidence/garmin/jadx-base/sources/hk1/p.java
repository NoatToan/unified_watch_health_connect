package hk1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\t¨\u0006\n"}, d2 = {"Lhk1/p;", "Lhk1/j;", "", "applicationName", "Lhk1/a0;", "thirdPartyApp", "<init>", "(Ljava/lang/String;Lhk1/a0;)V", "thirdPartyAppDetails", "(Lhk1/a0;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f84182b;

    static {
        a0.Companion bVar = a0.INSTANCE;
    }

    public p(String str, a0 a0Var) {
        str.getClass();
        this.f84181a = str;
        this.f84182b = a0Var;
    }

    public /* synthetic */ p(String str, a0 a0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? null : a0Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(a0 a0Var) {
        this(a0Var.o(), a0Var);
        a0Var.getClass();
    }
}
