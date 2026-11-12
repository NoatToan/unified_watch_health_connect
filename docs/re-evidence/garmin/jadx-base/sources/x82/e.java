package x82;

import com.google.firebase.remoteconfig.RemoteConfigComponent;
import e23.l;
import java.util.concurrent.CancellationException;
import o13.q;
import o13.r;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lx82/e;", "PageDataType", "Lx82/f;", "Lkotlin/Function1;", "Lt13/d;", "", RemoteConfigComponent.FETCH_FILE_NAME, "<init>", "(Le23/l;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e<PageDataType> implements f<PageDataType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l<t13.d<? super PageDataType>, Object> f189574a;

    /* JADX WARN: Multi-variable type inference failed */
    public e(l<? super t13.d<? super PageDataType>, ? extends Object> lVar) {
        lVar.getClass();
        this.f189574a = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // x82.f
    public final Object a(v13.c cVar) {
        d dVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f189573c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f189573c = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object bVar = dVar.f189571a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f189573c;
        try {
            if (i15 == 0) {
                r.b(bVar);
                int i16 = q.f128596b;
                l<t13.d<? super PageDataType>, Object> lVar = this.f189574a;
                dVar.f189573c = 1;
                bVar = lVar.invoke(dVar);
                if (bVar == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(bVar);
            }
            int i17 = q.f128596b;
        } catch (Throwable th3) {
            int i18 = q.f128596b;
            bVar = new q.b(th3);
        }
        Throwable thB = q.b(bVar);
        if (thB == null || !(thB instanceof CancellationException)) {
            return bVar;
        }
        throw thB;
    }
}
