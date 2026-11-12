package zc;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.s;
import v13.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$1$1", f = "LazyPagingItems.kt", l = {210, 212}, m = "invokeSuspend")
public final class e extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f203910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t13.g f203911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d<Object> f203912c;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
    @v13.e(c = "androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$1$1$1", f = "LazyPagingItems.kt", l = {213}, m = "invokeSuspend")
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f203913a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d<Object> f203914b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d<Object> dVar, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f203914b = dVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f203914b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f203913a;
            if (i14 == 0) {
                r.b(obj);
                this.f203913a = 1;
                d<Object> dVar = this.f203914b;
                Object objK = s.k(dVar.f203904a, new c(dVar, null), this);
                if (objK != obj2) {
                    objK = Unit.INSTANCE;
                }
                if (objK == obj2) {
                    return obj2;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(t13.g gVar, d<Object> dVar, t13.d<? super e> dVar2) {
        super(2, dVar2);
        this.f203911b = gVar;
        this.f203912c = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f203911b, this.f203912c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r7 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (ge1.b.e0(r1, r7, r6) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        return r0;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f203910a;
        if (i14 == 0) {
            r.b(obj);
            t13.h hVar = t13.h.f161748a;
            t13.g gVar = this.f203911b;
            boolean zG = p005kotlin.jvm.internal.s.g(gVar, hVar);
            d<Object> dVar = this.f203912c;
            if (zG) {
                this.f203910a = 1;
                Object objK = s.k(dVar.f203904a, new c(dVar, null), this);
                if (objK != obj2) {
                    objK = Unit.INSTANCE;
                }
            } else {
                a aVar = new a(dVar, null);
                this.f203910a = 2;
            }
        } else {
            if (i14 != 1 && i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
