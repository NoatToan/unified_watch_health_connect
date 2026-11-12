package jx0;

import androidx.lifecycle.u1;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import o53.b0;
import o53.e2;
import o53.s0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljx0/k;", "Landroidx/lifecycle/u1;", "Lo53/b0;", "Lyw0/a;", "repository", "<init>", "(Lyw0/a;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends u1 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yw0.a f101493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f101494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f101495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f101496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e2 f101497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f101498f;

    public k(yw0.a aVar) {
        aVar.getClass();
        this.f101493a = aVar;
        this.f101494b = new ReentrantLock();
        this.f101495c = new LinkedHashMap();
        this.f101496d = new LinkedHashMap();
        this.f101497e = ge1.b.h();
        this.f101498f = new LinkedHashMap();
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final t13.g getF195311f() {
        return s0.f129406a.plus(this.f101497e);
    }

    @Override // androidx.lifecycle.u1
    public final void onCleared() {
        this.f101497e.c(null);
        super.onCleared();
    }
}
