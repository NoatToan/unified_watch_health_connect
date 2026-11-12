package uk;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\b\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086@¢\u0006\u0004\b\b\u0010\t"}, d2 = {"T", "", "priority", "Lkotlin/Function1;", "Lt13/d;", "", "action", "continuation", "queue", "(ILe23/l;Lt13/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 0})
@v13.e(c = "com.dsi.vivoki.antble.gfdi.OperationQueue", f = "OperationQueue.kt", l = {76}, m = "queue")
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f171658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f171659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f171660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f171661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e.b f171662e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, t13.d dVar) {
        super(dVar);
        this.f171660c = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f171658a = obj;
        this.f171659b |= Integer.MIN_VALUE;
        return this.f171660c.a(0, null, this);
    }
}
