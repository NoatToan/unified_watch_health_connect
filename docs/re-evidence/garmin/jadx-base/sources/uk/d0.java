package uk;

import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 1, 16})
@v13.e(c = "com.dsi.vivoki.antble.gfdi.VivokiMessageWriter$enqueue$2", f = "VivokiMessageWriter.kt", l = {99}, m = "invokeSuspend")
public final class d0 extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f171645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f171646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f171647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f171648d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    @v13.e(c = "com.dsi.vivoki.antble.gfdi.VivokiMessageWriter$enqueue$2$1", f = "VivokiMessageWriter.kt", l = {}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o53.b0 f171649a;

        public a(t13.d dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            dVar.getClass();
            a aVar = d0.this.new a(dVar);
            aVar.f171649a = (o53.b0) obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            d0 d0Var = d0.this;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            try {
                d0Var.f171646b.f171634a.debug(d0Var.f171647c);
                it2.e eVar = d0Var.f171646b.f171635b;
                byte[] bArr = d0Var.f171648d;
                eVar.a(bArr.length, bArr);
                return Unit.INSTANCE;
            } catch (Exception e4) {
                d0Var.f171646b.f171634a.error("Sending message failed", (Throwable) e4);
                throw e4;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(c0 c0Var, String str, byte[] bArr, t13.d dVar) {
        super(1, dVar);
        this.f171646b = c0Var;
        this.f171647c = str;
        this.f171648d = bArr;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        dVar.getClass();
        return new d0(this.f171646b, this.f171647c, this.f171648d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super Unit> dVar) {
        return ((d0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f171645a;
        if (i14 == 0) {
            o13.r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(null);
            this.f171645a = 1;
            if (ge1.b.e0(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
