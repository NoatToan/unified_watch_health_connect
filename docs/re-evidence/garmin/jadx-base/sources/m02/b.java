package m02;

import e23.l;
import e23.p;
import java.util.List;
import o13.q;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import v13.c;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003BÓ\u0001\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012.\u0010\r\u001a*\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f0\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t\u0012(\u0010\u000e\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t\u0012$\u0010\u0010\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t\u0012.\u0010\u0012\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lm02/b;", "Key", "Item", "", "initialKey", "Lkotlin/Function1;", "", "", "onLoadUpdated", "Lkotlin/Function2;", "Lt13/d;", "Lo13/q;", "", "onRequest", "getNextKey", "", "onError", "Lkotlin/Function3;", "onSuccess", "<init>", "(Ljava/lang/Object;Le23/l;Le23/p;Le23/p;Le23/p;Le23/q;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b<Key, Item> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Key f115746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<Boolean, Unit> f115747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p<Key, d<? super q<? extends List<? extends Item>>>, Object> f115748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p<List<? extends Item>, d<? super Key>, Object> f115749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p<Throwable, d<? super Unit>, Object> f115750e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e23.q<List<? extends Item>, Key, d<? super Unit>, Object> f115751f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Key f115752g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f115753h;

    /* JADX WARN: Multi-variable type inference failed */
    public b(Key key, l<? super Boolean, Unit> lVar, p<? super Key, ? super d<? super q<? extends List<? extends Item>>>, ? extends Object> pVar, p<? super List<? extends Item>, ? super d<? super Key>, ? extends Object> pVar2, p<? super Throwable, ? super d<? super Unit>, ? extends Object> pVar3, e23.q<? super List<? extends Item>, ? super Key, ? super d<? super Unit>, ? extends Object> qVar) {
        lVar.getClass();
        pVar.getClass();
        pVar2.getClass();
        pVar3.getClass();
        qVar.getClass();
        this.f115746a = key;
        this.f115747b = lVar;
        this.f115748c = pVar;
        this.f115749d = pVar2;
        this.f115750e = pVar3;
        this.f115751f = qVar;
        this.f115752g = key;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
    
        if (r9.f115751f.invoke(r4, r10, r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
    
        if (r9.f115750e.invoke(r2, r0) == r1) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(c cVar) {
        a aVar;
        List<? extends Item> list;
        b<Key, Item> bVar;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i14 = aVar.f115745e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f115745e = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object obj = (Key) aVar.f115743c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f115745e;
        l<Boolean, Unit> lVar = this.f115747b;
        if (i15 == 0) {
            r.b(obj);
            if (this.f115753h) {
                return Unit.INSTANCE;
            }
            this.f115753h = true;
            lVar.invoke(Boolean.TRUE);
            Key key = this.f115752g;
            aVar.f115745e = 1;
            obj = (Key) this.f115748c.invoke(key, aVar);
            if (obj != aVar2) {
            }
            return aVar2;
        }
        if (i15 != 1) {
            if (i15 == 2) {
                r.b(obj);
                lVar.invoke(Boolean.FALSE);
                return Unit.INSTANCE;
            }
            if (i15 == 3) {
                bVar = aVar.f115742b;
                list = aVar.f115741a;
                r.b(obj);
                bVar.f115752g = (Key) obj;
                Key key2 = this.f115752g;
                aVar.f115741a = null;
                aVar.f115742b = null;
                aVar.f115745e = 4;
            } else {
                if (i15 != 4) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            lVar.invoke(Boolean.FALSE);
            return Unit.INSTANCE;
        }
        r.b(obj);
        Object obj2 = ((q) obj).f128597a;
        this.f115753h = false;
        Throwable thB = q.b(obj2);
        if (thB == null) {
            List<? extends Item> list2 = (List) obj2;
            aVar.f115741a = list2;
            aVar.f115742b = this;
            aVar.f115745e = 3;
            Object objInvoke = this.f115749d.invoke(list2, aVar);
            if (objInvoke != aVar2) {
                list = list2;
                obj = (Key) objInvoke;
                bVar = this;
                bVar.f115752g = (Key) obj;
                Key key3 = this.f115752g;
                aVar.f115741a = null;
                aVar.f115742b = null;
                aVar.f115745e = 4;
            }
        } else {
            aVar.f115741a = null;
            aVar.f115745e = 2;
        }
        return aVar2;
    }
}
