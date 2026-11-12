package u13;

import e23.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.y0;
import v13.g;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lu13/b;", "Lv13/g;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f167824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f167825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f167826c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(t13.d dVar, p pVar, Object obj) {
        super(dVar);
        this.f167825b = pVar;
        this.f167826c = obj;
        dVar.getClass();
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        int i14 = this.f167824a;
        if (i14 != 0) {
            if (i14 != 1) {
                h.z("This coroutine had already completed");
                return null;
            }
            this.f167824a = 2;
            r.b(obj);
            return obj;
        }
        this.f167824a = 1;
        r.b(obj);
        p pVar = this.f167825b;
        pVar.getClass();
        y0.e(2, pVar);
        return pVar.invoke(this.f167826c, this);
    }
}
