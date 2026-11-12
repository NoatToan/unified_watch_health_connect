package kotlin;

import b4.d;
import b4.f;
import c4.a;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li5/q2;", "Lb4/f;", "Lb4/d;", "delegate", "<init>", "(Lb4/d;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q2 implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f91399a;

    public q2(d dVar) {
        this.f91399a = dVar;
        if (dVar.f15692b) {
            return;
        }
        if (dVar.f15693c) {
            a.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
        }
        dVar.a();
        dVar.f15693c = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q2() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ q2(d dVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? new d() : dVar);
    }
}
