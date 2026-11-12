package s13;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ls13/a;", "Ljava/lang/Thread;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f155989a;

    public a(e23.a<Unit> aVar) {
        this.f155989a = aVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        this.f155989a.invoke();
    }
}
