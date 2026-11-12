package p007l6;

import g6.f;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p6.d;
import p6.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ll6/u;", "", "Lg6/f;", "value", "", "symbol", "debugName", "<init>", "(Lg6/f;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/j;)V", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f110505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110506b;

    private u(f fVar, String str, String str2) {
        this.f110505a = fVar;
        this.f110506b = str;
    }

    public final d a() {
        f fVar = this.f110505a;
        if (fVar != null) {
            return new p6.f(fVar.f75997a);
        }
        String str = this.f110506b;
        return str != null ? h.g(str) : h.g("wrap");
    }

    public /* synthetic */ u(f fVar, String str, String str2, j jVar) {
        this(fVar, str, str2);
    }
}
