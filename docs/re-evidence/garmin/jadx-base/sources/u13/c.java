package u13;

import e23.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.y0;
import t13.g;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lu13/c;", "Lv13/c;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f167827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f167828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f167829c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(t13.d dVar, g gVar, p pVar, Object obj) {
        super(dVar, gVar);
        this.f167828b = pVar;
        this.f167829c = obj;
        dVar.getClass();
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        int i14 = this.f167827a;
        if (i14 != 0) {
            if (i14 != 1) {
                h.z("This coroutine had already completed");
                return null;
            }
            this.f167827a = 2;
            r.b(obj);
            return obj;
        }
        this.f167827a = 1;
        r.b(obj);
        p pVar = this.f167828b;
        pVar.getClass();
        y0.e(2, pVar);
        return pVar.invoke(this.f167829c, this);
    }
}
